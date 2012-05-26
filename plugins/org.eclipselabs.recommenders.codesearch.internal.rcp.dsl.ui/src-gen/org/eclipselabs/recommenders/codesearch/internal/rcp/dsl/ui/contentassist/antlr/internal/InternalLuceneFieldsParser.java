package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui.contentassist.antlr.internal; 

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
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.services.LuceneFieldsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuceneFieldsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'packages'", "'class'", "'{'", "'}'", "'('", "')'", "'='", "','", "'method'", "'field'", "'trycatch'", "'varusage'"
    };
    public static final int RULE_ID=5;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLuceneFieldsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLuceneFieldsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLuceneFieldsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g"; }


     
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:61:1: ( ruleModel EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:62:1: ruleModel EOF
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:76:1: ( rule__Model__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:76:2: rule__Model__Group__0
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


    // $ANTLR start "entryRuleFieldCategory"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:88:1: entryRuleFieldCategory : ruleFieldCategory EOF ;
    public final void entryRuleFieldCategory() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:89:1: ( ruleFieldCategory EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:90:1: ruleFieldCategory EOF
            {
             before(grammarAccess.getFieldCategoryRule()); 
            pushFollow(FOLLOW_ruleFieldCategory_in_entryRuleFieldCategory121);
            ruleFieldCategory();

            state._fsp--;

             after(grammarAccess.getFieldCategoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldCategory128); 

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
    // $ANTLR end "entryRuleFieldCategory"


    // $ANTLR start "ruleFieldCategory"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:97:1: ruleFieldCategory : ( ( rule__FieldCategory__Group__0 ) ) ;
    public final void ruleFieldCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:101:2: ( ( ( rule__FieldCategory__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:102:1: ( ( rule__FieldCategory__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:102:1: ( ( rule__FieldCategory__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:103:1: ( rule__FieldCategory__Group__0 )
            {
             before(grammarAccess.getFieldCategoryAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:104:1: ( rule__FieldCategory__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:104:2: rule__FieldCategory__Group__0
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__0_in_ruleFieldCategory154);
            rule__FieldCategory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldCategoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldCategory"


    // $ANTLR start "entryRuleField"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:116:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:117:1: ( ruleField EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:118:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField181);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField188); 

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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:125:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:129:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:130:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:130:1: ( ( rule__Field__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:131:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:132:1: ( rule__Field__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:132:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField214);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:144:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:145:1: ( ruleFieldType EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:146:1: ruleFieldType EOF
            {
             before(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType241);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType248); 

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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:153:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:157:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:158:1: ( ( rule__FieldType__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:158:1: ( ( rule__FieldType__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:159:1: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:160:1: ( rule__FieldType__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:160:2: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType274);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:172:1: rule__FieldType__Alternatives : ( ( ( rule__FieldType__ClassTypeAssignment_0 ) ) | ( ( rule__FieldType__MethodTypeAssignment_1 ) ) | ( ( rule__FieldType__FieldTypeAssignment_2 ) ) | ( ( rule__FieldType__TrycatchTypeAssignment_3 ) ) | ( ( rule__FieldType__VarusageAssignment_4 ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:176:1: ( ( ( rule__FieldType__ClassTypeAssignment_0 ) ) | ( ( rule__FieldType__MethodTypeAssignment_1 ) ) | ( ( rule__FieldType__FieldTypeAssignment_2 ) ) | ( ( rule__FieldType__TrycatchTypeAssignment_3 ) ) | ( ( rule__FieldType__VarusageAssignment_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 22:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:177:1: ( ( rule__FieldType__ClassTypeAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:177:1: ( ( rule__FieldType__ClassTypeAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:178:1: ( rule__FieldType__ClassTypeAssignment_0 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getClassTypeAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:179:1: ( rule__FieldType__ClassTypeAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:179:2: rule__FieldType__ClassTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FieldType__ClassTypeAssignment_0_in_rule__FieldType__Alternatives310);
                    rule__FieldType__ClassTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getClassTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:183:6: ( ( rule__FieldType__MethodTypeAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:183:6: ( ( rule__FieldType__MethodTypeAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:184:1: ( rule__FieldType__MethodTypeAssignment_1 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getMethodTypeAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:185:1: ( rule__FieldType__MethodTypeAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:185:2: rule__FieldType__MethodTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FieldType__MethodTypeAssignment_1_in_rule__FieldType__Alternatives328);
                    rule__FieldType__MethodTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getMethodTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:189:6: ( ( rule__FieldType__FieldTypeAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:189:6: ( ( rule__FieldType__FieldTypeAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:190:1: ( rule__FieldType__FieldTypeAssignment_2 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getFieldTypeAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:191:1: ( rule__FieldType__FieldTypeAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:191:2: rule__FieldType__FieldTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FieldType__FieldTypeAssignment_2_in_rule__FieldType__Alternatives346);
                    rule__FieldType__FieldTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getFieldTypeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:195:6: ( ( rule__FieldType__TrycatchTypeAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:195:6: ( ( rule__FieldType__TrycatchTypeAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:196:1: ( rule__FieldType__TrycatchTypeAssignment_3 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getTrycatchTypeAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:197:1: ( rule__FieldType__TrycatchTypeAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:197:2: rule__FieldType__TrycatchTypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__FieldType__TrycatchTypeAssignment_3_in_rule__FieldType__Alternatives364);
                    rule__FieldType__TrycatchTypeAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getTrycatchTypeAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:201:6: ( ( rule__FieldType__VarusageAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:201:6: ( ( rule__FieldType__VarusageAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:202:1: ( rule__FieldType__VarusageAssignment_4 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getVarusageAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:203:1: ( rule__FieldType__VarusageAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:203:2: rule__FieldType__VarusageAssignment_4
                    {
                    pushFollow(FOLLOW_rule__FieldType__VarusageAssignment_4_in_rule__FieldType__Alternatives382);
                    rule__FieldType__VarusageAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getVarusageAssignment_4()); 

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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:214:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:218:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:219:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0413);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0416);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:226:1: rule__Model__Group__0__Impl : ( 'packages' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:230:1: ( ( 'packages' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:231:1: ( 'packages' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:231:1: ( 'packages' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:232:1: 'packages'
            {
             before(grammarAccess.getModelAccess().getPackagesKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl444); 
             after(grammarAccess.getModelAccess().getPackagesKeyword_0()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:245:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:249:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:250:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1475);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1478);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:257:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNamesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:261:1: ( ( ( rule__Model__PackageNamesAssignment_1 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:262:1: ( ( rule__Model__PackageNamesAssignment_1 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:262:1: ( ( rule__Model__PackageNamesAssignment_1 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:263:1: ( rule__Model__PackageNamesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getPackageNamesAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:264:1: ( rule__Model__PackageNamesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:264:2: rule__Model__PackageNamesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackageNamesAssignment_1_in_rule__Model__Group__1__Impl505);
            	    rule__Model__PackageNamesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackageNamesAssignment_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:274:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:278:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:279:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2536);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2539);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:286:1: rule__Model__Group__2__Impl : ( 'class' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:290:1: ( ( 'class' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:291:1: ( 'class' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:291:1: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:292:1: 'class'
            {
             before(grammarAccess.getModelAccess().getClassKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__2__Impl567); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:305:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:309:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:310:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3598);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3601);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:317:1: rule__Model__Group__3__Impl : ( ( rule__Model__ClassNameAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:321:1: ( ( ( rule__Model__ClassNameAssignment_3 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:322:1: ( ( rule__Model__ClassNameAssignment_3 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:322:1: ( ( rule__Model__ClassNameAssignment_3 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:323:1: ( rule__Model__ClassNameAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getClassNameAssignment_3()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:324:1: ( rule__Model__ClassNameAssignment_3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:324:2: rule__Model__ClassNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__ClassNameAssignment_3_in_rule__Model__Group__3__Impl628);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:334:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:338:1: ( rule__Model__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:339:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4658);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:345:1: rule__Model__Group__4__Impl : ( ( rule__Model__FieldCategoriesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:349:1: ( ( ( rule__Model__FieldCategoriesAssignment_4 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:350:1: ( ( rule__Model__FieldCategoriesAssignment_4 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:350:1: ( ( rule__Model__FieldCategoriesAssignment_4 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:351:1: ( rule__Model__FieldCategoriesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getFieldCategoriesAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:352:1: ( rule__Model__FieldCategoriesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:352:2: rule__Model__FieldCategoriesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__FieldCategoriesAssignment_4_in_rule__Model__Group__4__Impl685);
            	    rule__Model__FieldCategoriesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFieldCategoriesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__FieldCategory__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:372:1: rule__FieldCategory__Group__0 : rule__FieldCategory__Group__0__Impl rule__FieldCategory__Group__1 ;
    public final void rule__FieldCategory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:376:1: ( rule__FieldCategory__Group__0__Impl rule__FieldCategory__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:377:2: rule__FieldCategory__Group__0__Impl rule__FieldCategory__Group__1
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__0__Impl_in_rule__FieldCategory__Group__0726);
            rule__FieldCategory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__1_in_rule__FieldCategory__Group__0729);
            rule__FieldCategory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__0"


    // $ANTLR start "rule__FieldCategory__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:384:1: rule__FieldCategory__Group__0__Impl : ( ( rule__FieldCategory__CategoryNameAssignment_0 ) ) ;
    public final void rule__FieldCategory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:388:1: ( ( ( rule__FieldCategory__CategoryNameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:389:1: ( ( rule__FieldCategory__CategoryNameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:389:1: ( ( rule__FieldCategory__CategoryNameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:390:1: ( rule__FieldCategory__CategoryNameAssignment_0 )
            {
             before(grammarAccess.getFieldCategoryAccess().getCategoryNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:391:1: ( rule__FieldCategory__CategoryNameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:391:2: rule__FieldCategory__CategoryNameAssignment_0
            {
            pushFollow(FOLLOW_rule__FieldCategory__CategoryNameAssignment_0_in_rule__FieldCategory__Group__0__Impl756);
            rule__FieldCategory__CategoryNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldCategoryAccess().getCategoryNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__0__Impl"


    // $ANTLR start "rule__FieldCategory__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:401:1: rule__FieldCategory__Group__1 : rule__FieldCategory__Group__1__Impl rule__FieldCategory__Group__2 ;
    public final void rule__FieldCategory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:405:1: ( rule__FieldCategory__Group__1__Impl rule__FieldCategory__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:406:2: rule__FieldCategory__Group__1__Impl rule__FieldCategory__Group__2
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__1__Impl_in_rule__FieldCategory__Group__1786);
            rule__FieldCategory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__2_in_rule__FieldCategory__Group__1789);
            rule__FieldCategory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__1"


    // $ANTLR start "rule__FieldCategory__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:413:1: rule__FieldCategory__Group__1__Impl : ( '{' ) ;
    public final void rule__FieldCategory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:417:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:418:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:418:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:419:1: '{'
            {
             before(grammarAccess.getFieldCategoryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__FieldCategory__Group__1__Impl817); 
             after(grammarAccess.getFieldCategoryAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__1__Impl"


    // $ANTLR start "rule__FieldCategory__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:432:1: rule__FieldCategory__Group__2 : rule__FieldCategory__Group__2__Impl rule__FieldCategory__Group__3 ;
    public final void rule__FieldCategory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:436:1: ( rule__FieldCategory__Group__2__Impl rule__FieldCategory__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:437:2: rule__FieldCategory__Group__2__Impl rule__FieldCategory__Group__3
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__2__Impl_in_rule__FieldCategory__Group__2848);
            rule__FieldCategory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__3_in_rule__FieldCategory__Group__2851);
            rule__FieldCategory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__2"


    // $ANTLR start "rule__FieldCategory__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:444:1: rule__FieldCategory__Group__2__Impl : ( ( rule__FieldCategory__FieldsAssignment_2 )* ) ;
    public final void rule__FieldCategory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:448:1: ( ( ( rule__FieldCategory__FieldsAssignment_2 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:449:1: ( ( rule__FieldCategory__FieldsAssignment_2 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:449:1: ( ( rule__FieldCategory__FieldsAssignment_2 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:450:1: ( rule__FieldCategory__FieldsAssignment_2 )*
            {
             before(grammarAccess.getFieldCategoryAccess().getFieldsAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:451:1: ( rule__FieldCategory__FieldsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:451:2: rule__FieldCategory__FieldsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__FieldCategory__FieldsAssignment_2_in_rule__FieldCategory__Group__2__Impl878);
            	    rule__FieldCategory__FieldsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFieldCategoryAccess().getFieldsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__2__Impl"


    // $ANTLR start "rule__FieldCategory__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:461:1: rule__FieldCategory__Group__3 : rule__FieldCategory__Group__3__Impl rule__FieldCategory__Group__4 ;
    public final void rule__FieldCategory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:465:1: ( rule__FieldCategory__Group__3__Impl rule__FieldCategory__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:466:2: rule__FieldCategory__Group__3__Impl rule__FieldCategory__Group__4
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__3__Impl_in_rule__FieldCategory__Group__3909);
            rule__FieldCategory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__4_in_rule__FieldCategory__Group__3912);
            rule__FieldCategory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__3"


    // $ANTLR start "rule__FieldCategory__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:473:1: rule__FieldCategory__Group__3__Impl : ( '}' ) ;
    public final void rule__FieldCategory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:477:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:478:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:478:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:479:1: '}'
            {
             before(grammarAccess.getFieldCategoryAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__FieldCategory__Group__3__Impl940); 
             after(grammarAccess.getFieldCategoryAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__3__Impl"


    // $ANTLR start "rule__FieldCategory__Group__4"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:492:1: rule__FieldCategory__Group__4 : rule__FieldCategory__Group__4__Impl ;
    public final void rule__FieldCategory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:496:1: ( rule__FieldCategory__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:497:2: rule__FieldCategory__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__4__Impl_in_rule__FieldCategory__Group__4971);
            rule__FieldCategory__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__4"


    // $ANTLR start "rule__FieldCategory__Group__4__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:503:1: rule__FieldCategory__Group__4__Impl : ( ( rule__FieldCategory__Group_4__0 )? ) ;
    public final void rule__FieldCategory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:507:1: ( ( ( rule__FieldCategory__Group_4__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:508:1: ( ( rule__FieldCategory__Group_4__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:508:1: ( ( rule__FieldCategory__Group_4__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:509:1: ( rule__FieldCategory__Group_4__0 )?
            {
             before(grammarAccess.getFieldCategoryAccess().getGroup_4()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:510:1: ( rule__FieldCategory__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:510:2: rule__FieldCategory__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FieldCategory__Group_4__0_in_rule__FieldCategory__Group__4__Impl998);
                    rule__FieldCategory__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldCategoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__4__Impl"


    // $ANTLR start "rule__FieldCategory__Group_4__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:530:1: rule__FieldCategory__Group_4__0 : rule__FieldCategory__Group_4__0__Impl rule__FieldCategory__Group_4__1 ;
    public final void rule__FieldCategory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:534:1: ( rule__FieldCategory__Group_4__0__Impl rule__FieldCategory__Group_4__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:535:2: rule__FieldCategory__Group_4__0__Impl rule__FieldCategory__Group_4__1
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group_4__0__Impl_in_rule__FieldCategory__Group_4__01039);
            rule__FieldCategory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group_4__1_in_rule__FieldCategory__Group_4__01042);
            rule__FieldCategory__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__0"


    // $ANTLR start "rule__FieldCategory__Group_4__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:542:1: rule__FieldCategory__Group_4__0__Impl : ( '(' ) ;
    public final void rule__FieldCategory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:546:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:547:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:547:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:548:1: '('
            {
             before(grammarAccess.getFieldCategoryAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,15,FOLLOW_15_in_rule__FieldCategory__Group_4__0__Impl1070); 
             after(grammarAccess.getFieldCategoryAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__0__Impl"


    // $ANTLR start "rule__FieldCategory__Group_4__1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:561:1: rule__FieldCategory__Group_4__1 : rule__FieldCategory__Group_4__1__Impl rule__FieldCategory__Group_4__2 ;
    public final void rule__FieldCategory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:565:1: ( rule__FieldCategory__Group_4__1__Impl rule__FieldCategory__Group_4__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:566:2: rule__FieldCategory__Group_4__1__Impl rule__FieldCategory__Group_4__2
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group_4__1__Impl_in_rule__FieldCategory__Group_4__11101);
            rule__FieldCategory__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group_4__2_in_rule__FieldCategory__Group_4__11104);
            rule__FieldCategory__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__1"


    // $ANTLR start "rule__FieldCategory__Group_4__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:573:1: rule__FieldCategory__Group_4__1__Impl : ( ( rule__FieldCategory__DescAssignment_4_1 ) ) ;
    public final void rule__FieldCategory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:577:1: ( ( ( rule__FieldCategory__DescAssignment_4_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:578:1: ( ( rule__FieldCategory__DescAssignment_4_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:578:1: ( ( rule__FieldCategory__DescAssignment_4_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:579:1: ( rule__FieldCategory__DescAssignment_4_1 )
            {
             before(grammarAccess.getFieldCategoryAccess().getDescAssignment_4_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:580:1: ( rule__FieldCategory__DescAssignment_4_1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:580:2: rule__FieldCategory__DescAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FieldCategory__DescAssignment_4_1_in_rule__FieldCategory__Group_4__1__Impl1131);
            rule__FieldCategory__DescAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldCategoryAccess().getDescAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__1__Impl"


    // $ANTLR start "rule__FieldCategory__Group_4__2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:590:1: rule__FieldCategory__Group_4__2 : rule__FieldCategory__Group_4__2__Impl ;
    public final void rule__FieldCategory__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:594:1: ( rule__FieldCategory__Group_4__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:595:2: rule__FieldCategory__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group_4__2__Impl_in_rule__FieldCategory__Group_4__21161);
            rule__FieldCategory__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__2"


    // $ANTLR start "rule__FieldCategory__Group_4__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:601:1: rule__FieldCategory__Group_4__2__Impl : ( ')' ) ;
    public final void rule__FieldCategory__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:605:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:606:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:606:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:607:1: ')'
            {
             before(grammarAccess.getFieldCategoryAccess().getRightParenthesisKeyword_4_2()); 
            match(input,16,FOLLOW_16_in_rule__FieldCategory__Group_4__2__Impl1189); 
             after(grammarAccess.getFieldCategoryAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__2__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:626:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:630:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:631:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01226);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01229);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:638:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:642:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:643:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:643:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:644:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:645:1: ( rule__Field__NameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:645:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl1256);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:655:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:659:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:660:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11286);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11289);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:667:1: rule__Field__Group__1__Impl : ( '=' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:671:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:672:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:672:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:673:1: '='
            {
             before(grammarAccess.getFieldAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Field__Group__1__Impl1317); 
             after(grammarAccess.getFieldAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:686:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:690:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:691:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21348);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21351);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:698:1: rule__Field__Group__2__Impl : ( ( rule__Field__ValueAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:702:1: ( ( ( rule__Field__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:703:1: ( ( rule__Field__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:703:1: ( ( rule__Field__ValueAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:704:1: ( rule__Field__ValueAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:705:1: ( rule__Field__ValueAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:705:2: rule__Field__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__ValueAssignment_2_in_rule__Field__Group__2__Impl1378);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:715:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:719:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:720:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__31408);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__31411);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:727:1: rule__Field__Group__3__Impl : ( '{' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:731:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:732:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:732:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:733:1: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Field__Group__3__Impl1439); 
             after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:746:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:750:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:751:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__41470);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__41473);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:758:1: rule__Field__Group__4__Impl : ( ( rule__Field__TypesAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:762:1: ( ( ( rule__Field__TypesAssignment_4 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:763:1: ( ( rule__Field__TypesAssignment_4 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:763:1: ( ( rule__Field__TypesAssignment_4 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:764:1: ( rule__Field__TypesAssignment_4 )
            {
             before(grammarAccess.getFieldAccess().getTypesAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:765:1: ( rule__Field__TypesAssignment_4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:765:2: rule__Field__TypesAssignment_4
            {
            pushFollow(FOLLOW_rule__Field__TypesAssignment_4_in_rule__Field__Group__4__Impl1500);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:775:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:779:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:780:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__51530);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__51533);
            rule__Field__Group__6();

            state._fsp--;


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:787:1: rule__Field__Group__5__Impl : ( ( rule__Field__Group_5__0 )* ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:791:1: ( ( ( rule__Field__Group_5__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:792:1: ( ( rule__Field__Group_5__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:792:1: ( ( rule__Field__Group_5__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:793:1: ( rule__Field__Group_5__0 )*
            {
             before(grammarAccess.getFieldAccess().getGroup_5()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:794:1: ( rule__Field__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:794:2: rule__Field__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Field__Group_5__0_in_rule__Field__Group__5__Impl1560);
            	    rule__Field__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "rule__Field__Group__6"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:804:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:808:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:809:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__61591);
            rule__Field__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__7_in_rule__Field__Group__61594);
            rule__Field__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6"


    // $ANTLR start "rule__Field__Group__6__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:816:1: rule__Field__Group__6__Impl : ( '}' ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:820:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:821:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:821:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:822:1: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Field__Group__6__Impl1622); 
             after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6__Impl"


    // $ANTLR start "rule__Field__Group__7"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:835:1: rule__Field__Group__7 : rule__Field__Group__7__Impl ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:839:1: ( rule__Field__Group__7__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:840:2: rule__Field__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__71653);
            rule__Field__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__7"


    // $ANTLR start "rule__Field__Group__7__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:846:1: rule__Field__Group__7__Impl : ( ( rule__Field__Group_7__0 )? ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:850:1: ( ( ( rule__Field__Group_7__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:851:1: ( ( rule__Field__Group_7__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:851:1: ( ( rule__Field__Group_7__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:852:1: ( rule__Field__Group_7__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_7()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:853:1: ( rule__Field__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:853:2: rule__Field__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_7__0_in_rule__Field__Group__7__Impl1680);
                    rule__Field__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__7__Impl"


    // $ANTLR start "rule__Field__Group_5__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:879:1: rule__Field__Group_5__0 : rule__Field__Group_5__0__Impl rule__Field__Group_5__1 ;
    public final void rule__Field__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:883:1: ( rule__Field__Group_5__0__Impl rule__Field__Group_5__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:884:2: rule__Field__Group_5__0__Impl rule__Field__Group_5__1
            {
            pushFollow(FOLLOW_rule__Field__Group_5__0__Impl_in_rule__Field__Group_5__01727);
            rule__Field__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_5__1_in_rule__Field__Group_5__01730);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:891:1: rule__Field__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Field__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:895:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:896:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:896:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:897:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_18_in_rule__Field__Group_5__0__Impl1758); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:910:1: rule__Field__Group_5__1 : rule__Field__Group_5__1__Impl ;
    public final void rule__Field__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:914:1: ( rule__Field__Group_5__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:915:2: rule__Field__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_5__1__Impl_in_rule__Field__Group_5__11789);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:921:1: rule__Field__Group_5__1__Impl : ( ( rule__Field__TypesAssignment_5_1 ) ) ;
    public final void rule__Field__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:925:1: ( ( ( rule__Field__TypesAssignment_5_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:926:1: ( ( rule__Field__TypesAssignment_5_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:926:1: ( ( rule__Field__TypesAssignment_5_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:927:1: ( rule__Field__TypesAssignment_5_1 )
            {
             before(grammarAccess.getFieldAccess().getTypesAssignment_5_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:928:1: ( rule__Field__TypesAssignment_5_1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:928:2: rule__Field__TypesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Field__TypesAssignment_5_1_in_rule__Field__Group_5__1__Impl1816);
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


    // $ANTLR start "rule__Field__Group_7__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:942:1: rule__Field__Group_7__0 : rule__Field__Group_7__0__Impl rule__Field__Group_7__1 ;
    public final void rule__Field__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:946:1: ( rule__Field__Group_7__0__Impl rule__Field__Group_7__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:947:2: rule__Field__Group_7__0__Impl rule__Field__Group_7__1
            {
            pushFollow(FOLLOW_rule__Field__Group_7__0__Impl_in_rule__Field__Group_7__01850);
            rule__Field__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_7__1_in_rule__Field__Group_7__01853);
            rule__Field__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__0"


    // $ANTLR start "rule__Field__Group_7__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:954:1: rule__Field__Group_7__0__Impl : ( '(' ) ;
    public final void rule__Field__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:958:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:959:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:959:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:960:1: '('
            {
             before(grammarAccess.getFieldAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group_7__0__Impl1881); 
             after(grammarAccess.getFieldAccess().getLeftParenthesisKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__0__Impl"


    // $ANTLR start "rule__Field__Group_7__1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:973:1: rule__Field__Group_7__1 : rule__Field__Group_7__1__Impl rule__Field__Group_7__2 ;
    public final void rule__Field__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:977:1: ( rule__Field__Group_7__1__Impl rule__Field__Group_7__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:978:2: rule__Field__Group_7__1__Impl rule__Field__Group_7__2
            {
            pushFollow(FOLLOW_rule__Field__Group_7__1__Impl_in_rule__Field__Group_7__11912);
            rule__Field__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_7__2_in_rule__Field__Group_7__11915);
            rule__Field__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__1"


    // $ANTLR start "rule__Field__Group_7__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:985:1: rule__Field__Group_7__1__Impl : ( ( rule__Field__DescAssignment_7_1 ) ) ;
    public final void rule__Field__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:989:1: ( ( ( rule__Field__DescAssignment_7_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:990:1: ( ( rule__Field__DescAssignment_7_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:990:1: ( ( rule__Field__DescAssignment_7_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:991:1: ( rule__Field__DescAssignment_7_1 )
            {
             before(grammarAccess.getFieldAccess().getDescAssignment_7_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:992:1: ( rule__Field__DescAssignment_7_1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:992:2: rule__Field__DescAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Field__DescAssignment_7_1_in_rule__Field__Group_7__1__Impl1942);
            rule__Field__DescAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getDescAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__1__Impl"


    // $ANTLR start "rule__Field__Group_7__2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1002:1: rule__Field__Group_7__2 : rule__Field__Group_7__2__Impl ;
    public final void rule__Field__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1006:1: ( rule__Field__Group_7__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1007:2: rule__Field__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_7__2__Impl_in_rule__Field__Group_7__21972);
            rule__Field__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__2"


    // $ANTLR start "rule__Field__Group_7__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1013:1: rule__Field__Group_7__2__Impl : ( ')' ) ;
    public final void rule__Field__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1017:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1018:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1018:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1019:1: ')'
            {
             before(grammarAccess.getFieldAccess().getRightParenthesisKeyword_7_2()); 
            match(input,16,FOLLOW_16_in_rule__Field__Group_7__2__Impl2000); 
             after(grammarAccess.getFieldAccess().getRightParenthesisKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__2__Impl"


    // $ANTLR start "rule__Model__PackageNamesAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1039:1: rule__Model__PackageNamesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__PackageNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1043:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1044:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1044:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1045:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getPackageNamesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__PackageNamesAssignment_12042); 
             after(grammarAccess.getModelAccess().getPackageNamesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackageNamesAssignment_1"


    // $ANTLR start "rule__Model__ClassNameAssignment_3"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1054:1: rule__Model__ClassNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Model__ClassNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1058:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1059:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1059:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1060:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ClassNameAssignment_32073); 
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


    // $ANTLR start "rule__Model__FieldCategoriesAssignment_4"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1069:1: rule__Model__FieldCategoriesAssignment_4 : ( ruleFieldCategory ) ;
    public final void rule__Model__FieldCategoriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1073:1: ( ( ruleFieldCategory ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1074:1: ( ruleFieldCategory )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1074:1: ( ruleFieldCategory )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1075:1: ruleFieldCategory
            {
             before(grammarAccess.getModelAccess().getFieldCategoriesFieldCategoryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldCategory_in_rule__Model__FieldCategoriesAssignment_42104);
            ruleFieldCategory();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFieldCategoriesFieldCategoryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FieldCategoriesAssignment_4"


    // $ANTLR start "rule__FieldCategory__CategoryNameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1084:1: rule__FieldCategory__CategoryNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FieldCategory__CategoryNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1088:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1089:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1089:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1090:1: RULE_ID
            {
             before(grammarAccess.getFieldCategoryAccess().getCategoryNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldCategory__CategoryNameAssignment_02135); 
             after(grammarAccess.getFieldCategoryAccess().getCategoryNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__CategoryNameAssignment_0"


    // $ANTLR start "rule__FieldCategory__FieldsAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1099:1: rule__FieldCategory__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__FieldCategory__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1103:1: ( ( ruleField ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1104:1: ( ruleField )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1104:1: ( ruleField )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1105:1: ruleField
            {
             before(grammarAccess.getFieldCategoryAccess().getFieldsFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__FieldCategory__FieldsAssignment_22166);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldCategoryAccess().getFieldsFieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__FieldsAssignment_2"


    // $ANTLR start "rule__FieldCategory__DescAssignment_4_1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1114:1: rule__FieldCategory__DescAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldCategory__DescAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1118:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1119:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1119:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1120:1: RULE_STRING
            {
             before(grammarAccess.getFieldCategoryAccess().getDescSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FieldCategory__DescAssignment_4_12197); 
             after(grammarAccess.getFieldCategoryAccess().getDescSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__DescAssignment_4_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1129:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1133:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1134:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1134:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1135:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_02228); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1144:1: rule__Field__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Field__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1148:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1149:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1149:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1150:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__ValueAssignment_22259); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1159:1: rule__Field__TypesAssignment_4 : ( ruleFieldType ) ;
    public final void rule__Field__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1163:1: ( ( ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1164:1: ( ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1164:1: ( ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1165:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_42290);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1174:1: rule__Field__TypesAssignment_5_1 : ( ruleFieldType ) ;
    public final void rule__Field__TypesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1178:1: ( ( ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1179:1: ( ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1179:1: ( ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1180:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_5_12321);
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


    // $ANTLR start "rule__Field__DescAssignment_7_1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1189:1: rule__Field__DescAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Field__DescAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1193:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1194:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1194:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1195:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getDescSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__DescAssignment_7_12352); 
             after(grammarAccess.getFieldAccess().getDescSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__DescAssignment_7_1"


    // $ANTLR start "rule__FieldType__ClassTypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1204:1: rule__FieldType__ClassTypeAssignment_0 : ( ( 'class' ) ) ;
    public final void rule__FieldType__ClassTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1208:1: ( ( ( 'class' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1209:1: ( ( 'class' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1209:1: ( ( 'class' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1210:1: ( 'class' )
            {
             before(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1211:1: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1212:1: 'class'
            {
             before(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); 
            match(input,12,FOLLOW_12_in_rule__FieldType__ClassTypeAssignment_02388); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1227:1: rule__FieldType__MethodTypeAssignment_1 : ( ( 'method' ) ) ;
    public final void rule__FieldType__MethodTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1231:1: ( ( ( 'method' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1232:1: ( ( 'method' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1232:1: ( ( 'method' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1233:1: ( 'method' )
            {
             before(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1234:1: ( 'method' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1235:1: 'method'
            {
             before(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__FieldType__MethodTypeAssignment_12432); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1250:1: rule__FieldType__FieldTypeAssignment_2 : ( ( 'field' ) ) ;
    public final void rule__FieldType__FieldTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1254:1: ( ( ( 'field' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1255:1: ( ( 'field' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1255:1: ( ( 'field' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1256:1: ( 'field' )
            {
             before(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1257:1: ( 'field' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1258:1: 'field'
            {
             before(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__FieldType__FieldTypeAssignment_22476); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1273:1: rule__FieldType__TrycatchTypeAssignment_3 : ( ( 'trycatch' ) ) ;
    public final void rule__FieldType__TrycatchTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1277:1: ( ( ( 'trycatch' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1278:1: ( ( 'trycatch' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1278:1: ( ( 'trycatch' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1279:1: ( 'trycatch' )
            {
             before(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1280:1: ( 'trycatch' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1281:1: 'trycatch'
            {
             before(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__FieldType__TrycatchTypeAssignment_32520); 
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


    // $ANTLR start "rule__FieldType__VarusageAssignment_4"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1296:1: rule__FieldType__VarusageAssignment_4 : ( ( 'varusage' ) ) ;
    public final void rule__FieldType__VarusageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1300:1: ( ( ( 'varusage' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1301:1: ( ( 'varusage' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1301:1: ( ( 'varusage' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1302:1: ( 'varusage' )
            {
             before(grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1303:1: ( 'varusage' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1304:1: 'varusage'
            {
             before(grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__FieldType__VarusageAssignment_42564); 
             after(grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__VarusageAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldCategory_in_entryRuleFieldCategory121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldCategory128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__0_in_ruleFieldCategory154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__ClassTypeAssignment_0_in_rule__FieldType__Alternatives310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__MethodTypeAssignment_1_in_rule__FieldType__Alternatives328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__FieldTypeAssignment_2_in_rule__FieldType__Alternatives346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__TrycatchTypeAssignment_3_in_rule__FieldType__Alternatives364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__VarusageAssignment_4_in_rule__FieldType__Alternatives382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0413 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1475 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNamesAssignment_1_in_rule__Model__Group__1__Impl505 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__2__Impl567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ClassNameAssignment_3_in_rule__Model__Group__3__Impl628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FieldCategoriesAssignment_4_in_rule__Model__Group__4__Impl685 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__0__Impl_in_rule__FieldCategory__Group__0726 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__1_in_rule__FieldCategory__Group__0729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__CategoryNameAssignment_0_in_rule__FieldCategory__Group__0__Impl756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__1__Impl_in_rule__FieldCategory__Group__1786 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__2_in_rule__FieldCategory__Group__1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FieldCategory__Group__1__Impl817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__2__Impl_in_rule__FieldCategory__Group__2848 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__3_in_rule__FieldCategory__Group__2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__FieldsAssignment_2_in_rule__FieldCategory__Group__2__Impl878 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__3__Impl_in_rule__FieldCategory__Group__3909 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__4_in_rule__FieldCategory__Group__3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FieldCategory__Group__3__Impl940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__4__Impl_in_rule__FieldCategory__Group__4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__0_in_rule__FieldCategory__Group__4__Impl998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__0__Impl_in_rule__FieldCategory__Group_4__01039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__1_in_rule__FieldCategory__Group_4__01042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FieldCategory__Group_4__0__Impl1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__1__Impl_in_rule__FieldCategory__Group_4__11101 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__2_in_rule__FieldCategory__Group_4__11104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__DescAssignment_4_1_in_rule__FieldCategory__Group_4__1__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__2__Impl_in_rule__FieldCategory__Group_4__21161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FieldCategory__Group_4__2__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01226 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Field__Group__1__Impl1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21348 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ValueAssignment_2_in_rule__Field__Group__2__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__31408 = new BitSet(new long[]{0x0000000000781000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__31411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Group__3__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__41470 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__41473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypesAssignment_4_in_rule__Field__Group__4__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__51530 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__51533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__0_in_rule__Field__Group__5__Impl1560 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__61591 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Field__Group__7_in_rule__Field__Group__61594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Field__Group__6__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__71653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_7__0_in_rule__Field__Group__7__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__0__Impl_in_rule__Field__Group_5__01727 = new BitSet(new long[]{0x0000000000781000L});
    public static final BitSet FOLLOW_rule__Field__Group_5__1_in_rule__Field__Group_5__01730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Field__Group_5__0__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__1__Impl_in_rule__Field__Group_5__11789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypesAssignment_5_1_in_rule__Field__Group_5__1__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_7__0__Impl_in_rule__Field__Group_7__01850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group_7__1_in_rule__Field__Group_7__01853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group_7__0__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_7__1__Impl_in_rule__Field__Group_7__11912 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Field__Group_7__2_in_rule__Field__Group_7__11915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__DescAssignment_7_1_in_rule__Field__Group_7__1__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_7__2__Impl_in_rule__Field__Group_7__21972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Field__Group_7__2__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__PackageNamesAssignment_12042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ClassNameAssignment_32073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldCategory_in_rule__Model__FieldCategoriesAssignment_42104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldCategory__CategoryNameAssignment_02135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__FieldCategory__FieldsAssignment_22166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FieldCategory__DescAssignment_4_12197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_02228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__ValueAssignment_22259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_42290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_5_12321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__DescAssignment_7_12352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FieldType__ClassTypeAssignment_02388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FieldType__MethodTypeAssignment_12432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FieldType__FieldTypeAssignment_22476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FieldType__TrycatchTypeAssignment_32520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FieldType__VarusageAssignment_42564 = new BitSet(new long[]{0x0000000000000002L});

}