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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'packages'", "'class'", "'{'", "'}'", "'='", "','", "'method'", "'field'", "'trycatch'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:172:1: rule__FieldType__Alternatives : ( ( ( rule__FieldType__ClassTypeAssignment_0 ) ) | ( ( rule__FieldType__MethodTypeAssignment_1 ) ) | ( ( rule__FieldType__FieldTypeAssignment_2 ) ) | ( ( rule__FieldType__TrycatchTypeAssignment_3 ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:176:1: ( ( ( rule__FieldType__ClassTypeAssignment_0 ) ) | ( ( rule__FieldType__MethodTypeAssignment_1 ) ) | ( ( rule__FieldType__FieldTypeAssignment_2 ) ) | ( ( rule__FieldType__TrycatchTypeAssignment_3 ) ) )
            int alt1=4;
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

            }
        }
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:208:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:212:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:213:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0395);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0398);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:220:1: rule__Model__Group__0__Impl : ( 'packages' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:224:1: ( ( 'packages' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:225:1: ( 'packages' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:225:1: ( 'packages' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:226:1: 'packages'
            {
             before(grammarAccess.getModelAccess().getPackagesKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl426); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:239:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:243:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:244:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1457);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1460);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:251:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNamesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:255:1: ( ( ( rule__Model__PackageNamesAssignment_1 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:256:1: ( ( rule__Model__PackageNamesAssignment_1 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:256:1: ( ( rule__Model__PackageNamesAssignment_1 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:257:1: ( rule__Model__PackageNamesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getPackageNamesAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:258:1: ( rule__Model__PackageNamesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:258:2: rule__Model__PackageNamesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackageNamesAssignment_1_in_rule__Model__Group__1__Impl487);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:268:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:272:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:273:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2518);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2521);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:280:1: rule__Model__Group__2__Impl : ( 'class' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:284:1: ( ( 'class' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:285:1: ( 'class' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:285:1: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:286:1: 'class'
            {
             before(grammarAccess.getModelAccess().getClassKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__2__Impl549); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:299:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:303:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:304:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3580);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3583);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:311:1: rule__Model__Group__3__Impl : ( ( rule__Model__ClassNameAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:315:1: ( ( ( rule__Model__ClassNameAssignment_3 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:316:1: ( ( rule__Model__ClassNameAssignment_3 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:316:1: ( ( rule__Model__ClassNameAssignment_3 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:317:1: ( rule__Model__ClassNameAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getClassNameAssignment_3()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:318:1: ( rule__Model__ClassNameAssignment_3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:318:2: rule__Model__ClassNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__ClassNameAssignment_3_in_rule__Model__Group__3__Impl610);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:328:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:332:1: ( rule__Model__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:333:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4640);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:339:1: rule__Model__Group__4__Impl : ( ( rule__Model__FieldCategoriesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:343:1: ( ( ( rule__Model__FieldCategoriesAssignment_4 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:344:1: ( ( rule__Model__FieldCategoriesAssignment_4 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:344:1: ( ( rule__Model__FieldCategoriesAssignment_4 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:345:1: ( rule__Model__FieldCategoriesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getFieldCategoriesAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:346:1: ( rule__Model__FieldCategoriesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:346:2: rule__Model__FieldCategoriesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__FieldCategoriesAssignment_4_in_rule__Model__Group__4__Impl667);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:366:1: rule__FieldCategory__Group__0 : rule__FieldCategory__Group__0__Impl rule__FieldCategory__Group__1 ;
    public final void rule__FieldCategory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:370:1: ( rule__FieldCategory__Group__0__Impl rule__FieldCategory__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:371:2: rule__FieldCategory__Group__0__Impl rule__FieldCategory__Group__1
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__0__Impl_in_rule__FieldCategory__Group__0708);
            rule__FieldCategory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__1_in_rule__FieldCategory__Group__0711);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:378:1: rule__FieldCategory__Group__0__Impl : ( ( rule__FieldCategory__CategoryNameAssignment_0 ) ) ;
    public final void rule__FieldCategory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:382:1: ( ( ( rule__FieldCategory__CategoryNameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:383:1: ( ( rule__FieldCategory__CategoryNameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:383:1: ( ( rule__FieldCategory__CategoryNameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:384:1: ( rule__FieldCategory__CategoryNameAssignment_0 )
            {
             before(grammarAccess.getFieldCategoryAccess().getCategoryNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:385:1: ( rule__FieldCategory__CategoryNameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:385:2: rule__FieldCategory__CategoryNameAssignment_0
            {
            pushFollow(FOLLOW_rule__FieldCategory__CategoryNameAssignment_0_in_rule__FieldCategory__Group__0__Impl738);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:395:1: rule__FieldCategory__Group__1 : rule__FieldCategory__Group__1__Impl rule__FieldCategory__Group__2 ;
    public final void rule__FieldCategory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:399:1: ( rule__FieldCategory__Group__1__Impl rule__FieldCategory__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:400:2: rule__FieldCategory__Group__1__Impl rule__FieldCategory__Group__2
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__1__Impl_in_rule__FieldCategory__Group__1768);
            rule__FieldCategory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__2_in_rule__FieldCategory__Group__1771);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:407:1: rule__FieldCategory__Group__1__Impl : ( '{' ) ;
    public final void rule__FieldCategory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:411:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:412:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:412:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:413:1: '{'
            {
             before(grammarAccess.getFieldCategoryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__FieldCategory__Group__1__Impl799); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:426:1: rule__FieldCategory__Group__2 : rule__FieldCategory__Group__2__Impl rule__FieldCategory__Group__3 ;
    public final void rule__FieldCategory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:430:1: ( rule__FieldCategory__Group__2__Impl rule__FieldCategory__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:431:2: rule__FieldCategory__Group__2__Impl rule__FieldCategory__Group__3
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__2__Impl_in_rule__FieldCategory__Group__2830);
            rule__FieldCategory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__3_in_rule__FieldCategory__Group__2833);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:438:1: rule__FieldCategory__Group__2__Impl : ( ( rule__FieldCategory__FieldsAssignment_2 )* ) ;
    public final void rule__FieldCategory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:442:1: ( ( ( rule__FieldCategory__FieldsAssignment_2 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:443:1: ( ( rule__FieldCategory__FieldsAssignment_2 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:443:1: ( ( rule__FieldCategory__FieldsAssignment_2 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:444:1: ( rule__FieldCategory__FieldsAssignment_2 )*
            {
             before(grammarAccess.getFieldCategoryAccess().getFieldsAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:445:1: ( rule__FieldCategory__FieldsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:445:2: rule__FieldCategory__FieldsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__FieldCategory__FieldsAssignment_2_in_rule__FieldCategory__Group__2__Impl860);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:455:1: rule__FieldCategory__Group__3 : rule__FieldCategory__Group__3__Impl ;
    public final void rule__FieldCategory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:459:1: ( rule__FieldCategory__Group__3__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:460:2: rule__FieldCategory__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__3__Impl_in_rule__FieldCategory__Group__3891);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:466:1: rule__FieldCategory__Group__3__Impl : ( '}' ) ;
    public final void rule__FieldCategory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:470:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:471:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:471:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:472:1: '}'
            {
             before(grammarAccess.getFieldCategoryAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__FieldCategory__Group__3__Impl919); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:493:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:497:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:498:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__0958);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__0961);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:505:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:509:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:510:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:510:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:511:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:512:1: ( rule__Field__NameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:512:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl988);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:522:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:526:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:527:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11018);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11021);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:534:1: rule__Field__Group__1__Impl : ( '=' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:538:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:539:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:539:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:540:1: '='
            {
             before(grammarAccess.getFieldAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group__1__Impl1049); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:553:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:557:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:558:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21080);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21083);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:565:1: rule__Field__Group__2__Impl : ( ( rule__Field__ValueAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:569:1: ( ( ( rule__Field__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:570:1: ( ( rule__Field__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:570:1: ( ( rule__Field__ValueAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:571:1: ( rule__Field__ValueAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:572:1: ( rule__Field__ValueAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:572:2: rule__Field__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__ValueAssignment_2_in_rule__Field__Group__2__Impl1110);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:582:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:586:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:587:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__31140);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__31143);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:594:1: rule__Field__Group__3__Impl : ( '{' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:598:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:599:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:599:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:600:1: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Field__Group__3__Impl1171); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:613:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:617:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:618:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__41202);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__41205);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:625:1: rule__Field__Group__4__Impl : ( ( rule__Field__TypesAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:629:1: ( ( ( rule__Field__TypesAssignment_4 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:630:1: ( ( rule__Field__TypesAssignment_4 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:630:1: ( ( rule__Field__TypesAssignment_4 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:631:1: ( rule__Field__TypesAssignment_4 )
            {
             before(grammarAccess.getFieldAccess().getTypesAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:632:1: ( rule__Field__TypesAssignment_4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:632:2: rule__Field__TypesAssignment_4
            {
            pushFollow(FOLLOW_rule__Field__TypesAssignment_4_in_rule__Field__Group__4__Impl1232);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:642:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:646:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:647:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__51262);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__51265);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:654:1: rule__Field__Group__5__Impl : ( ( rule__Field__Group_5__0 )* ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:658:1: ( ( ( rule__Field__Group_5__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:659:1: ( ( rule__Field__Group_5__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:659:1: ( ( rule__Field__Group_5__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:660:1: ( rule__Field__Group_5__0 )*
            {
             before(grammarAccess.getFieldAccess().getGroup_5()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:661:1: ( rule__Field__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:661:2: rule__Field__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Field__Group_5__0_in_rule__Field__Group__5__Impl1292);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:671:1: rule__Field__Group__6 : rule__Field__Group__6__Impl ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:675:1: ( rule__Field__Group__6__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:676:2: rule__Field__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__61323);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:682:1: rule__Field__Group__6__Impl : ( '}' ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:686:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:687:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:687:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:688:1: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Field__Group__6__Impl1351); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:715:1: rule__Field__Group_5__0 : rule__Field__Group_5__0__Impl rule__Field__Group_5__1 ;
    public final void rule__Field__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:719:1: ( rule__Field__Group_5__0__Impl rule__Field__Group_5__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:720:2: rule__Field__Group_5__0__Impl rule__Field__Group_5__1
            {
            pushFollow(FOLLOW_rule__Field__Group_5__0__Impl_in_rule__Field__Group_5__01396);
            rule__Field__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_5__1_in_rule__Field__Group_5__01399);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:727:1: rule__Field__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Field__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:731:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:732:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:732:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:733:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__Field__Group_5__0__Impl1427); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:746:1: rule__Field__Group_5__1 : rule__Field__Group_5__1__Impl ;
    public final void rule__Field__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:750:1: ( rule__Field__Group_5__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:751:2: rule__Field__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_5__1__Impl_in_rule__Field__Group_5__11458);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:757:1: rule__Field__Group_5__1__Impl : ( ( rule__Field__TypesAssignment_5_1 ) ) ;
    public final void rule__Field__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:761:1: ( ( ( rule__Field__TypesAssignment_5_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:762:1: ( ( rule__Field__TypesAssignment_5_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:762:1: ( ( rule__Field__TypesAssignment_5_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:763:1: ( rule__Field__TypesAssignment_5_1 )
            {
             before(grammarAccess.getFieldAccess().getTypesAssignment_5_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:764:1: ( rule__Field__TypesAssignment_5_1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:764:2: rule__Field__TypesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Field__TypesAssignment_5_1_in_rule__Field__Group_5__1__Impl1485);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:779:1: rule__Model__PackageNamesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__PackageNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:783:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:784:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:784:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:785:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getPackageNamesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__PackageNamesAssignment_11524); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:794:1: rule__Model__ClassNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Model__ClassNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:798:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:799:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:799:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:800:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ClassNameAssignment_31555); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:809:1: rule__Model__FieldCategoriesAssignment_4 : ( ruleFieldCategory ) ;
    public final void rule__Model__FieldCategoriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:813:1: ( ( ruleFieldCategory ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:814:1: ( ruleFieldCategory )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:814:1: ( ruleFieldCategory )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:815:1: ruleFieldCategory
            {
             before(grammarAccess.getModelAccess().getFieldCategoriesFieldCategoryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldCategory_in_rule__Model__FieldCategoriesAssignment_41586);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:824:1: rule__FieldCategory__CategoryNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FieldCategory__CategoryNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:828:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:829:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:829:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:830:1: RULE_ID
            {
             before(grammarAccess.getFieldCategoryAccess().getCategoryNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldCategory__CategoryNameAssignment_01617); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:839:1: rule__FieldCategory__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__FieldCategory__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:843:1: ( ( ruleField ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:844:1: ( ruleField )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:844:1: ( ruleField )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:845:1: ruleField
            {
             before(grammarAccess.getFieldCategoryAccess().getFieldsFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__FieldCategory__FieldsAssignment_21648);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:854:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:858:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:859:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:859:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:860:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_01679); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:869:1: rule__Field__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Field__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:873:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:874:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:874:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:875:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__ValueAssignment_21710); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:884:1: rule__Field__TypesAssignment_4 : ( ruleFieldType ) ;
    public final void rule__Field__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:888:1: ( ( ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:889:1: ( ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:889:1: ( ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:890:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_41741);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:899:1: rule__Field__TypesAssignment_5_1 : ( ruleFieldType ) ;
    public final void rule__Field__TypesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:903:1: ( ( ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:904:1: ( ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:904:1: ( ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:905:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_5_11772);
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:914:1: rule__FieldType__ClassTypeAssignment_0 : ( ( 'class' ) ) ;
    public final void rule__FieldType__ClassTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:918:1: ( ( ( 'class' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:919:1: ( ( 'class' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:919:1: ( ( 'class' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:920:1: ( 'class' )
            {
             before(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:921:1: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:922:1: 'class'
            {
             before(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); 
            match(input,12,FOLLOW_12_in_rule__FieldType__ClassTypeAssignment_01808); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:937:1: rule__FieldType__MethodTypeAssignment_1 : ( ( 'method' ) ) ;
    public final void rule__FieldType__MethodTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:941:1: ( ( ( 'method' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:942:1: ( ( 'method' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:942:1: ( ( 'method' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:943:1: ( 'method' )
            {
             before(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:944:1: ( 'method' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:945:1: 'method'
            {
             before(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__FieldType__MethodTypeAssignment_11852); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:960:1: rule__FieldType__FieldTypeAssignment_2 : ( ( 'field' ) ) ;
    public final void rule__FieldType__FieldTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:964:1: ( ( ( 'field' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:965:1: ( ( 'field' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:965:1: ( ( 'field' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:966:1: ( 'field' )
            {
             before(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:967:1: ( 'field' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:968:1: 'field'
            {
             before(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__FieldType__FieldTypeAssignment_21896); 
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:983:1: rule__FieldType__TrycatchTypeAssignment_3 : ( ( 'trycatch' ) ) ;
    public final void rule__FieldType__TrycatchTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:987:1: ( ( ( 'trycatch' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:988:1: ( ( 'trycatch' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:988:1: ( ( 'trycatch' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:989:1: ( 'trycatch' )
            {
             before(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:990:1: ( 'trycatch' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:991:1: 'trycatch'
            {
             before(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__FieldType__TrycatchTypeAssignment_31940); 
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
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0395 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1457 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNamesAssignment_1_in_rule__Model__Group__1__Impl487 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2518 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__2__Impl549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ClassNameAssignment_3_in_rule__Model__Group__3__Impl610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FieldCategoriesAssignment_4_in_rule__Model__Group__4__Impl667 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__0__Impl_in_rule__FieldCategory__Group__0708 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__1_in_rule__FieldCategory__Group__0711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__CategoryNameAssignment_0_in_rule__FieldCategory__Group__0__Impl738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__1__Impl_in_rule__FieldCategory__Group__1768 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__2_in_rule__FieldCategory__Group__1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FieldCategory__Group__1__Impl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__2__Impl_in_rule__FieldCategory__Group__2830 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__3_in_rule__FieldCategory__Group__2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__FieldsAssignment_2_in_rule__FieldCategory__Group__2__Impl860 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__3__Impl_in_rule__FieldCategory__Group__3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FieldCategory__Group__3__Impl919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__0958 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__0961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group__1__Impl1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21080 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ValueAssignment_2_in_rule__Field__Group__2__Impl1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__31140 = new BitSet(new long[]{0x00000000000E1000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__31143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Group__3__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__41202 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__41205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypesAssignment_4_in_rule__Field__Group__4__Impl1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__51262 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__51265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__0_in_rule__Field__Group__5__Impl1292 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__61323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Field__Group__6__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__0__Impl_in_rule__Field__Group_5__01396 = new BitSet(new long[]{0x00000000000E1000L});
    public static final BitSet FOLLOW_rule__Field__Group_5__1_in_rule__Field__Group_5__01399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Field__Group_5__0__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__1__Impl_in_rule__Field__Group_5__11458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypesAssignment_5_1_in_rule__Field__Group_5__1__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__PackageNamesAssignment_11524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ClassNameAssignment_31555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldCategory_in_rule__Model__FieldCategoriesAssignment_41586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldCategory__CategoryNameAssignment_01617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__FieldCategory__FieldsAssignment_21648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_01679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__ValueAssignment_21710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_41741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_5_11772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FieldType__ClassTypeAssignment_01808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FieldType__MethodTypeAssignment_11852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FieldType__FieldTypeAssignment_21896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FieldType__TrycatchTypeAssignment_31940 = new BitSet(new long[]{0x0000000000000002L});

}