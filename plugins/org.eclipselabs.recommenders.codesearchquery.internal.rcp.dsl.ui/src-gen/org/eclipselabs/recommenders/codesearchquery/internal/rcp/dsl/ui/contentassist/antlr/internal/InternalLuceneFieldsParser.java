package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui.contentassist.antlr.internal; 

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
import org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.services.LuceneFieldsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuceneFieldsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'class'", "';'", "','", "'method'", "'field'", "'trycatch'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalLuceneFieldsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLuceneFieldsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLuceneFieldsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g"; }


     
     	private LuceneFieldsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LuceneFieldsGrammarAccess grammarAccess) {
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:61:1: ( ruleModel EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:62:1: ruleModel EOF
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:76:1: ( rule__Model__Group__0 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:76:2: rule__Model__Group__0
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


    // $ANTLR start "entryRuleField"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:88:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:89:1: ( ruleField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:90:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField121);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField128); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:97:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:101:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:102:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:102:1: ( ( rule__Field__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:103:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:104:1: ( rule__Field__Group__0 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:104:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField154);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:116:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:117:1: ( ruleFieldType EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:118:1: ruleFieldType EOF
            {
             before(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType181);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType188); 

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
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:125:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:129:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:130:1: ( ( rule__FieldType__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:130:1: ( ( rule__FieldType__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:131:1: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:132:1: ( rule__FieldType__Alternatives )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:132:2: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType214);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "rule__FieldType__Alternatives"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:144:1: rule__FieldType__Alternatives : ( ( ( rule__FieldType__ClassTypeAssignment_0 ) ) | ( ( rule__FieldType__MethodTypeAssignment_1 ) ) | ( ( rule__FieldType__FieldTypeAssignment_2 ) ) | ( ( rule__FieldType__TrycatchTypeAssignment_3 ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:148:1: ( ( ( rule__FieldType__ClassTypeAssignment_0 ) ) | ( ( rule__FieldType__MethodTypeAssignment_1 ) ) | ( ( rule__FieldType__FieldTypeAssignment_2 ) ) | ( ( rule__FieldType__TrycatchTypeAssignment_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:149:1: ( ( rule__FieldType__ClassTypeAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:149:1: ( ( rule__FieldType__ClassTypeAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:150:1: ( rule__FieldType__ClassTypeAssignment_0 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getClassTypeAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:151:1: ( rule__FieldType__ClassTypeAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:151:2: rule__FieldType__ClassTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FieldType__ClassTypeAssignment_0_in_rule__FieldType__Alternatives250);
                    rule__FieldType__ClassTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getClassTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:155:6: ( ( rule__FieldType__MethodTypeAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:155:6: ( ( rule__FieldType__MethodTypeAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:156:1: ( rule__FieldType__MethodTypeAssignment_1 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getMethodTypeAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:157:1: ( rule__FieldType__MethodTypeAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:157:2: rule__FieldType__MethodTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FieldType__MethodTypeAssignment_1_in_rule__FieldType__Alternatives268);
                    rule__FieldType__MethodTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getMethodTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:161:6: ( ( rule__FieldType__FieldTypeAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:161:6: ( ( rule__FieldType__FieldTypeAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:162:1: ( rule__FieldType__FieldTypeAssignment_2 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getFieldTypeAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:163:1: ( rule__FieldType__FieldTypeAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:163:2: rule__FieldType__FieldTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FieldType__FieldTypeAssignment_2_in_rule__FieldType__Alternatives286);
                    rule__FieldType__FieldTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getFieldTypeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:167:6: ( ( rule__FieldType__TrycatchTypeAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:167:6: ( ( rule__FieldType__TrycatchTypeAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:168:1: ( rule__FieldType__TrycatchTypeAssignment_3 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getTrycatchTypeAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:169:1: ( rule__FieldType__TrycatchTypeAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:169:2: rule__FieldType__TrycatchTypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__FieldType__TrycatchTypeAssignment_3_in_rule__FieldType__Alternatives304);
                    rule__FieldType__TrycatchTypeAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getTrycatchTypeAssignment_3()); 

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
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:180:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:184:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:185:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0335);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0338);
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:192:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:196:1: ( ( 'package' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:197:1: ( 'package' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:197:1: ( 'package' )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:198:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl366); 
             after(grammarAccess.getModelAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:211:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:215:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:216:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1397);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1400);
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:223:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:227:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:228:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:228:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:229:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:230:1: ( rule__Model__PackageNameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:230:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl427);
            rule__Model__PackageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:240:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:244:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:245:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2457);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2460);
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:252:1: rule__Model__Group__2__Impl : ( 'class' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:256:1: ( ( 'class' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:257:1: ( 'class' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:257:1: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:258:1: 'class'
            {
             before(grammarAccess.getModelAccess().getClassKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__2__Impl488); 
             after(grammarAccess.getModelAccess().getClassKeyword_2()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:271:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:275:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:276:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3519);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3522);
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:283:1: rule__Model__Group__3__Impl : ( ( rule__Model__ClassNameAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:287:1: ( ( ( rule__Model__ClassNameAssignment_3 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:288:1: ( ( rule__Model__ClassNameAssignment_3 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:288:1: ( ( rule__Model__ClassNameAssignment_3 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:289:1: ( rule__Model__ClassNameAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getClassNameAssignment_3()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:290:1: ( rule__Model__ClassNameAssignment_3 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:290:2: rule__Model__ClassNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__ClassNameAssignment_3_in_rule__Model__Group__3__Impl549);
            rule__Model__ClassNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getClassNameAssignment_3()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:300:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:304:1: ( rule__Model__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:305:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4579);
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:311:1: rule__Model__Group__4__Impl : ( ( rule__Model__FieldsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:315:1: ( ( ( rule__Model__FieldsAssignment_4 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:316:1: ( ( rule__Model__FieldsAssignment_4 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:316:1: ( ( rule__Model__FieldsAssignment_4 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:317:1: ( rule__Model__FieldsAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getFieldsAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:318:1: ( rule__Model__FieldsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:318:2: rule__Model__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__FieldsAssignment_4_in_rule__Model__Group__4__Impl606);
            	    rule__Model__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFieldsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Field__Group__0"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:338:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:342:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:343:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__0647);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__0650);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:350:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:354:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:355:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:355:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:356:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:357:1: ( rule__Field__NameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:357:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl677);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:367:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:371:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:372:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__1707);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__1710);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:379:1: rule__Field__Group__1__Impl : ( ';' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:383:1: ( ( ';' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:384:1: ( ';' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:384:1: ( ';' )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:385:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Field__Group__1__Impl738); 
             after(grammarAccess.getFieldAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:398:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:402:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:403:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__2769);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__2772);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:410:1: rule__Field__Group__2__Impl : ( ( rule__Field__ValueAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:414:1: ( ( ( rule__Field__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:415:1: ( ( rule__Field__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:415:1: ( ( rule__Field__ValueAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:416:1: ( rule__Field__ValueAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:417:1: ( rule__Field__ValueAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:417:2: rule__Field__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__ValueAssignment_2_in_rule__Field__Group__2__Impl799);
            rule__Field__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:427:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:431:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:432:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__3829);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__3832);
            rule__Field__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:439:1: rule__Field__Group__3__Impl : ( ';' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:443:1: ( ( ';' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:444:1: ( ';' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:444:1: ( ';' )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:445:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Field__Group__3__Impl860); 
             after(grammarAccess.getFieldAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:458:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:462:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:463:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__4891);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__4894);
            rule__Field__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:470:1: rule__Field__Group__4__Impl : ( ( rule__Field__TypesAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:474:1: ( ( ( rule__Field__TypesAssignment_4 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:475:1: ( ( rule__Field__TypesAssignment_4 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:475:1: ( ( rule__Field__TypesAssignment_4 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:476:1: ( rule__Field__TypesAssignment_4 )
            {
             before(grammarAccess.getFieldAccess().getTypesAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:477:1: ( rule__Field__TypesAssignment_4 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:477:2: rule__Field__TypesAssignment_4
            {
            pushFollow(FOLLOW_rule__Field__TypesAssignment_4_in_rule__Field__Group__4__Impl921);
            rule__Field__TypesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:487:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:491:1: ( rule__Field__Group__5__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:492:2: rule__Field__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__5951);
            rule__Field__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:498:1: rule__Field__Group__5__Impl : ( ( rule__Field__Group_5__0 )* ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:502:1: ( ( ( rule__Field__Group_5__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:503:1: ( ( rule__Field__Group_5__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:503:1: ( ( rule__Field__Group_5__0 )* )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:504:1: ( rule__Field__Group_5__0 )*
            {
             before(grammarAccess.getFieldAccess().getGroup_5()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:505:1: ( rule__Field__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:505:2: rule__Field__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Field__Group_5__0_in_rule__Field__Group__5__Impl978);
            	    rule__Field__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFieldAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group_5__0"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:527:1: rule__Field__Group_5__0 : rule__Field__Group_5__0__Impl rule__Field__Group_5__1 ;
    public final void rule__Field__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:531:1: ( rule__Field__Group_5__0__Impl rule__Field__Group_5__1 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:532:2: rule__Field__Group_5__0__Impl rule__Field__Group_5__1
            {
            pushFollow(FOLLOW_rule__Field__Group_5__0__Impl_in_rule__Field__Group_5__01021);
            rule__Field__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_5__1_in_rule__Field__Group_5__01024);
            rule__Field__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_5__0"


    // $ANTLR start "rule__Field__Group_5__0__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:539:1: rule__Field__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Field__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:543:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:544:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:544:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:545:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_5_0()); 
            match(input,14,FOLLOW_14_in_rule__Field__Group_5__0__Impl1052); 
             after(grammarAccess.getFieldAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_5__0__Impl"


    // $ANTLR start "rule__Field__Group_5__1"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:558:1: rule__Field__Group_5__1 : rule__Field__Group_5__1__Impl ;
    public final void rule__Field__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:562:1: ( rule__Field__Group_5__1__Impl )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:563:2: rule__Field__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_5__1__Impl_in_rule__Field__Group_5__11083);
            rule__Field__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_5__1"


    // $ANTLR start "rule__Field__Group_5__1__Impl"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:569:1: rule__Field__Group_5__1__Impl : ( ( rule__Field__TypesAssignment_5_1 ) ) ;
    public final void rule__Field__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:573:1: ( ( ( rule__Field__TypesAssignment_5_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:574:1: ( ( rule__Field__TypesAssignment_5_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:574:1: ( ( rule__Field__TypesAssignment_5_1 ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:575:1: ( rule__Field__TypesAssignment_5_1 )
            {
             before(grammarAccess.getFieldAccess().getTypesAssignment_5_1()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:576:1: ( rule__Field__TypesAssignment_5_1 )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:576:2: rule__Field__TypesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Field__TypesAssignment_5_1_in_rule__Field__Group_5__1__Impl1110);
            rule__Field__TypesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_5__1__Impl"


    // $ANTLR start "rule__Model__PackageNameAssignment_1"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:591:1: rule__Model__PackageNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:595:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:596:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:596:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:597:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getPackageNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__PackageNameAssignment_11149); 
             after(grammarAccess.getModelAccess().getPackageNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackageNameAssignment_1"


    // $ANTLR start "rule__Model__ClassNameAssignment_3"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:606:1: rule__Model__ClassNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Model__ClassNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:610:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:611:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:611:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:612:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ClassNameAssignment_31180); 
             after(grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ClassNameAssignment_3"


    // $ANTLR start "rule__Model__FieldsAssignment_4"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:621:1: rule__Model__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Model__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:625:1: ( ( ruleField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:626:1: ( ruleField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:626:1: ( ruleField )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:627:1: ruleField
            {
             before(grammarAccess.getModelAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Model__FieldsAssignment_41211);
            ruleField();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFieldsFieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FieldsAssignment_4"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:636:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:640:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:641:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:641:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:642:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_01242); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__ValueAssignment_2"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:651:1: rule__Field__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Field__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:655:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:656:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:656:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:657:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__ValueAssignment_21273); 
             after(grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ValueAssignment_2"


    // $ANTLR start "rule__Field__TypesAssignment_4"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:666:1: rule__Field__TypesAssignment_4 : ( ruleFieldType ) ;
    public final void rule__Field__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:670:1: ( ( ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:671:1: ( ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:671:1: ( ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:672:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_41304);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypesAssignment_4"


    // $ANTLR start "rule__Field__TypesAssignment_5_1"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:681:1: rule__Field__TypesAssignment_5_1 : ( ruleFieldType ) ;
    public final void rule__Field__TypesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:685:1: ( ( ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:686:1: ( ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:686:1: ( ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:687:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_5_11335);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypesAssignment_5_1"


    // $ANTLR start "rule__FieldType__ClassTypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:696:1: rule__FieldType__ClassTypeAssignment_0 : ( ( 'class' ) ) ;
    public final void rule__FieldType__ClassTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:700:1: ( ( ( 'class' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:701:1: ( ( 'class' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:701:1: ( ( 'class' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:702:1: ( 'class' )
            {
             before(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:703:1: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:704:1: 'class'
            {
             before(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); 
            match(input,12,FOLLOW_12_in_rule__FieldType__ClassTypeAssignment_01371); 
             after(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__ClassTypeAssignment_0"


    // $ANTLR start "rule__FieldType__MethodTypeAssignment_1"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:719:1: rule__FieldType__MethodTypeAssignment_1 : ( ( 'method' ) ) ;
    public final void rule__FieldType__MethodTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:723:1: ( ( ( 'method' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:724:1: ( ( 'method' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:724:1: ( ( 'method' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:725:1: ( 'method' )
            {
             before(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:726:1: ( 'method' )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:727:1: 'method'
            {
             before(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__FieldType__MethodTypeAssignment_11415); 
             after(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__MethodTypeAssignment_1"


    // $ANTLR start "rule__FieldType__FieldTypeAssignment_2"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:742:1: rule__FieldType__FieldTypeAssignment_2 : ( ( 'field' ) ) ;
    public final void rule__FieldType__FieldTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:746:1: ( ( ( 'field' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:747:1: ( ( 'field' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:747:1: ( ( 'field' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:748:1: ( 'field' )
            {
             before(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:749:1: ( 'field' )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:750:1: 'field'
            {
             before(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__FieldType__FieldTypeAssignment_21459); 
             after(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__FieldTypeAssignment_2"


    // $ANTLR start "rule__FieldType__TrycatchTypeAssignment_3"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:765:1: rule__FieldType__TrycatchTypeAssignment_3 : ( ( 'trycatch' ) ) ;
    public final void rule__FieldType__TrycatchTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:769:1: ( ( ( 'trycatch' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:770:1: ( ( 'trycatch' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:770:1: ( ( 'trycatch' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:771:1: ( 'trycatch' )
            {
             before(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:772:1: ( 'trycatch' )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:773:1: 'trycatch'
            {
             before(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__FieldType__TrycatchTypeAssignment_31503); 
             after(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__TrycatchTypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__ClassTypeAssignment_0_in_rule__FieldType__Alternatives250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__MethodTypeAssignment_1_in_rule__FieldType__Alternatives268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__FieldTypeAssignment_2_in_rule__FieldType__Alternatives286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__TrycatchTypeAssignment_3_in_rule__FieldType__Alternatives304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1397 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__2__Impl488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ClassNameAssignment_3_in_rule__Model__Group__3__Impl549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FieldsAssignment_4_in_rule__Model__Group__4__Impl606 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__0647 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__0650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__1707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Group__1__Impl738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__2769 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ValueAssignment_2_in_rule__Field__Group__2__Impl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__3829 = new BitSet(new long[]{0x0000000000039000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Group__3__Impl860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__4891 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypesAssignment_4_in_rule__Field__Group__4__Impl921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__0_in_rule__Field__Group__5__Impl978 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__0__Impl_in_rule__Field__Group_5__01021 = new BitSet(new long[]{0x0000000000039000L});
    public static final BitSet FOLLOW_rule__Field__Group_5__1_in_rule__Field__Group_5__01024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Field__Group_5__0__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__1__Impl_in_rule__Field__Group_5__11083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypesAssignment_5_1_in_rule__Field__Group_5__1__Impl1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__PackageNameAssignment_11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ClassNameAssignment_31180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Model__FieldsAssignment_41211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_01242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__ValueAssignment_21273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_41304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_5_11335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FieldType__ClassTypeAssignment_01371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FieldType__MethodTypeAssignment_11415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FieldType__FieldTypeAssignment_21459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FieldType__TrycatchTypeAssignment_31503 = new BitSet(new long[]{0x0000000000000002L});

}