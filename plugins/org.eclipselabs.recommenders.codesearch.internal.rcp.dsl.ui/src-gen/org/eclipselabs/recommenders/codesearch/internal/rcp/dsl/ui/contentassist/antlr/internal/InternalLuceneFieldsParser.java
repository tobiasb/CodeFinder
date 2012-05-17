package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui.contentassist.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.services.LuceneFieldsGrammarAccess;

@SuppressWarnings("all")
public class InternalLuceneFieldsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'packages'", "'class'", "'{'", "'}'", "'='", "','", "'method'", "'field'", "'trycatch'", "'varusage'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
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
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            case 20:
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:461:1: rule__FieldCategory__Group__3 : rule__FieldCategory__Group__3__Impl ;
    public final void rule__FieldCategory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:465:1: ( rule__FieldCategory__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:466:2: rule__FieldCategory__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__3__Impl_in_rule__FieldCategory__Group__3909);
            rule__FieldCategory__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:472:1: rule__FieldCategory__Group__3__Impl : ( '}' ) ;
    public final void rule__FieldCategory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:476:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:477:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:477:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:478:1: '}'
            {
             before(grammarAccess.getFieldCategoryAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__FieldCategory__Group__3__Impl937); 
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


    // $ANTLR start "rule__Field__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:499:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:503:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:504:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__0976);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__0979);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:511:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:515:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:516:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:516:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:517:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:518:1: ( rule__Field__NameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:518:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl1006);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:528:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:532:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:533:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11036);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11039);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:540:1: rule__Field__Group__1__Impl : ( '=' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:544:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:545:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:545:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:546:1: '='
            {
             before(grammarAccess.getFieldAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group__1__Impl1067); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:559:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:563:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:564:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21098);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21101);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:571:1: rule__Field__Group__2__Impl : ( ( rule__Field__ValueAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:575:1: ( ( ( rule__Field__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:576:1: ( ( rule__Field__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:576:1: ( ( rule__Field__ValueAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:577:1: ( rule__Field__ValueAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:578:1: ( rule__Field__ValueAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:578:2: rule__Field__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__ValueAssignment_2_in_rule__Field__Group__2__Impl1128);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:588:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:592:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:593:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__31158);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__31161);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:600:1: rule__Field__Group__3__Impl : ( '{' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:604:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:605:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:605:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:606:1: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Field__Group__3__Impl1189); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:619:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:623:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:624:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__41220);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__41223);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:631:1: rule__Field__Group__4__Impl : ( ( rule__Field__TypesAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:635:1: ( ( ( rule__Field__TypesAssignment_4 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:636:1: ( ( rule__Field__TypesAssignment_4 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:636:1: ( ( rule__Field__TypesAssignment_4 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:637:1: ( rule__Field__TypesAssignment_4 )
            {
             before(grammarAccess.getFieldAccess().getTypesAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:638:1: ( rule__Field__TypesAssignment_4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:638:2: rule__Field__TypesAssignment_4
            {
            pushFollow(FOLLOW_rule__Field__TypesAssignment_4_in_rule__Field__Group__4__Impl1250);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:648:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:652:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:653:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__51280);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__51283);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:660:1: rule__Field__Group__5__Impl : ( ( rule__Field__Group_5__0 )* ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:664:1: ( ( ( rule__Field__Group_5__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:665:1: ( ( rule__Field__Group_5__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:665:1: ( ( rule__Field__Group_5__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:666:1: ( rule__Field__Group_5__0 )*
            {
             before(grammarAccess.getFieldAccess().getGroup_5()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:667:1: ( rule__Field__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:667:2: rule__Field__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Field__Group_5__0_in_rule__Field__Group__5__Impl1310);
            	    rule__Field__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:677:1: rule__Field__Group__6 : rule__Field__Group__6__Impl ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:681:1: ( rule__Field__Group__6__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:682:2: rule__Field__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__61341);
            rule__Field__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:688:1: rule__Field__Group__6__Impl : ( '}' ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:692:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:693:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:693:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:694:1: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Field__Group__6__Impl1369); 
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


    // $ANTLR start "rule__Field__Group_5__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:721:1: rule__Field__Group_5__0 : rule__Field__Group_5__0__Impl rule__Field__Group_5__1 ;
    public final void rule__Field__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:725:1: ( rule__Field__Group_5__0__Impl rule__Field__Group_5__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:726:2: rule__Field__Group_5__0__Impl rule__Field__Group_5__1
            {
            pushFollow(FOLLOW_rule__Field__Group_5__0__Impl_in_rule__Field__Group_5__01414);
            rule__Field__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_5__1_in_rule__Field__Group_5__01417);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:733:1: rule__Field__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Field__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:737:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:738:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:738:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:739:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__Field__Group_5__0__Impl1445); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:752:1: rule__Field__Group_5__1 : rule__Field__Group_5__1__Impl ;
    public final void rule__Field__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:756:1: ( rule__Field__Group_5__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:757:2: rule__Field__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_5__1__Impl_in_rule__Field__Group_5__11476);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:763:1: rule__Field__Group_5__1__Impl : ( ( rule__Field__TypesAssignment_5_1 ) ) ;
    public final void rule__Field__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:767:1: ( ( ( rule__Field__TypesAssignment_5_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:768:1: ( ( rule__Field__TypesAssignment_5_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:768:1: ( ( rule__Field__TypesAssignment_5_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:769:1: ( rule__Field__TypesAssignment_5_1 )
            {
             before(grammarAccess.getFieldAccess().getTypesAssignment_5_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:770:1: ( rule__Field__TypesAssignment_5_1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:770:2: rule__Field__TypesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Field__TypesAssignment_5_1_in_rule__Field__Group_5__1__Impl1503);
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


    // $ANTLR start "rule__Model__PackageNamesAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:785:1: rule__Model__PackageNamesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__PackageNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:789:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:790:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:790:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:791:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getPackageNamesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__PackageNamesAssignment_11542); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:800:1: rule__Model__ClassNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Model__ClassNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:804:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:805:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:805:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:806:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ClassNameAssignment_31573); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:815:1: rule__Model__FieldCategoriesAssignment_4 : ( ruleFieldCategory ) ;
    public final void rule__Model__FieldCategoriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:819:1: ( ( ruleFieldCategory ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:820:1: ( ruleFieldCategory )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:820:1: ( ruleFieldCategory )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:821:1: ruleFieldCategory
            {
             before(grammarAccess.getModelAccess().getFieldCategoriesFieldCategoryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldCategory_in_rule__Model__FieldCategoriesAssignment_41604);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:830:1: rule__FieldCategory__CategoryNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FieldCategory__CategoryNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:834:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:835:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:835:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:836:1: RULE_ID
            {
             before(grammarAccess.getFieldCategoryAccess().getCategoryNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldCategory__CategoryNameAssignment_01635); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:845:1: rule__FieldCategory__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__FieldCategory__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:849:1: ( ( ruleField ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:850:1: ( ruleField )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:850:1: ( ruleField )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:851:1: ruleField
            {
             before(grammarAccess.getFieldCategoryAccess().getFieldsFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__FieldCategory__FieldsAssignment_21666);
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


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:860:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:864:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:865:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:865:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:866:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_01697); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:875:1: rule__Field__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Field__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:879:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:880:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:880:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:881:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__ValueAssignment_21728); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:890:1: rule__Field__TypesAssignment_4 : ( ruleFieldType ) ;
    public final void rule__Field__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:894:1: ( ( ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:895:1: ( ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:895:1: ( ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:896:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_41759);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:905:1: rule__Field__TypesAssignment_5_1 : ( ruleFieldType ) ;
    public final void rule__Field__TypesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:909:1: ( ( ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:910:1: ( ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:910:1: ( ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:911:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_5_11790);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:920:1: rule__FieldType__ClassTypeAssignment_0 : ( ( 'class' ) ) ;
    public final void rule__FieldType__ClassTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:924:1: ( ( ( 'class' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:925:1: ( ( 'class' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:925:1: ( ( 'class' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:926:1: ( 'class' )
            {
             before(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:927:1: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:928:1: 'class'
            {
             before(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); 
            match(input,12,FOLLOW_12_in_rule__FieldType__ClassTypeAssignment_01826); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:943:1: rule__FieldType__MethodTypeAssignment_1 : ( ( 'method' ) ) ;
    public final void rule__FieldType__MethodTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:947:1: ( ( ( 'method' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:948:1: ( ( 'method' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:948:1: ( ( 'method' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:949:1: ( 'method' )
            {
             before(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:950:1: ( 'method' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:951:1: 'method'
            {
             before(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__FieldType__MethodTypeAssignment_11870); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:966:1: rule__FieldType__FieldTypeAssignment_2 : ( ( 'field' ) ) ;
    public final void rule__FieldType__FieldTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:970:1: ( ( ( 'field' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:971:1: ( ( 'field' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:971:1: ( ( 'field' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:972:1: ( 'field' )
            {
             before(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:973:1: ( 'field' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:974:1: 'field'
            {
             before(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__FieldType__FieldTypeAssignment_21914); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:989:1: rule__FieldType__TrycatchTypeAssignment_3 : ( ( 'trycatch' ) ) ;
    public final void rule__FieldType__TrycatchTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:993:1: ( ( ( 'trycatch' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:994:1: ( ( 'trycatch' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:994:1: ( ( 'trycatch' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:995:1: ( 'trycatch' )
            {
             before(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:996:1: ( 'trycatch' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:997:1: 'trycatch'
            {
             before(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__FieldType__TrycatchTypeAssignment_31958); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1012:1: rule__FieldType__VarusageAssignment_4 : ( ( 'varusage' ) ) ;
    public final void rule__FieldType__VarusageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1016:1: ( ( ( 'varusage' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1017:1: ( ( 'varusage' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1017:1: ( ( 'varusage' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1018:1: ( 'varusage' )
            {
             before(grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1019:1: ( 'varusage' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1020:1: 'varusage'
            {
             before(grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__FieldType__VarusageAssignment_42002); 
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
    public static final BitSet FOLLOW_rule__FieldCategory__Group__3__Impl_in_rule__FieldCategory__Group__3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FieldCategory__Group__3__Impl937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__0976 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__0979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group__1__Impl1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21098 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ValueAssignment_2_in_rule__Field__Group__2__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__31158 = new BitSet(new long[]{0x00000000001E1000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__31161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Group__3__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__41220 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__41223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypesAssignment_4_in_rule__Field__Group__4__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__51280 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__51283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__0_in_rule__Field__Group__5__Impl1310 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__61341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Field__Group__6__Impl1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__0__Impl_in_rule__Field__Group_5__01414 = new BitSet(new long[]{0x00000000001E1000L});
    public static final BitSet FOLLOW_rule__Field__Group_5__1_in_rule__Field__Group_5__01417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Field__Group_5__0__Impl1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__1__Impl_in_rule__Field__Group_5__11476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypesAssignment_5_1_in_rule__Field__Group_5__1__Impl1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__PackageNamesAssignment_11542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ClassNameAssignment_31573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldCategory_in_rule__Model__FieldCategoriesAssignment_41604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldCategory__CategoryNameAssignment_01635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__FieldCategory__FieldsAssignment_21666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_01697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__ValueAssignment_21728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_41759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_5_11790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FieldType__ClassTypeAssignment_01826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FieldType__MethodTypeAssignment_11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FieldType__FieldTypeAssignment_21914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FieldType__TrycatchTypeAssignment_31958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FieldType__VarusageAssignment_42002 = new BitSet(new long[]{0x0000000000000002L});

}