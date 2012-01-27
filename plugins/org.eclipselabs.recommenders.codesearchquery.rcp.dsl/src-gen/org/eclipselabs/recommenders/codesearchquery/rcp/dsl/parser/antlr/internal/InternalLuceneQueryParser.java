package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.services.LuceneQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuceneQueryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_INT", "RULE_PATHWITHWC", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'InstanceofTypes'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'CaughtType'", "'DeclaredFieldTypes'", "'DeclaringType'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'ResourcePath'", "'ParameterCount'", "'Modifiers'", "'Timestamp'", "'Type'", "'ProjectName'", "'Annotations'", "'FullyQualifiedName'", "'FriendlyName'", "'DeclaredMethods'", "'ReturnVariableEexpressions'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'", "'private'", "'public'", "'static'", "'final'", "'abstract'", "'protected'", "'class'", "'method'", "'field'", "'trycatch'", "'-'", "'NOT'", "'!'", "'+'", "'AND'", "'OR'"
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
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g"; }



     	private LuceneQueryGrammarAccess grammarAccess;
     	
        public InternalLuceneQueryParser(TokenStream input, LuceneQueryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Exp1";	
       	}
       	
       	@Override
       	protected LuceneQueryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExp1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:68:1: entryRuleExp1 returns [EObject current=null] : iv_ruleExp1= ruleExp1 EOF ;
    public final EObject entryRuleExp1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp1 = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:69:2: (iv_ruleExp1= ruleExp1 EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:70:2: iv_ruleExp1= ruleExp1 EOF
            {
             newCompositeNode(grammarAccess.getExp1Rule()); 
            pushFollow(FOLLOW_ruleExp1_in_entryRuleExp175);
            iv_ruleExp1=ruleExp1();

            state._fsp--;

             current =iv_ruleExp1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp185); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp1"


    // $ANTLR start "ruleExp1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:77:1: ruleExp1 returns [EObject current=null] : (this_Exp2_0= ruleExp2 ( () ( (lv_b_2_0= ruleBinaryExp ) )? ( (lv_right_3_0= ruleExp1 ) ) )? ) ;
    public final EObject ruleExp1() throws RecognitionException {
        EObject current = null;

        EObject this_Exp2_0 = null;

        Enumerator lv_b_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:80:28: ( (this_Exp2_0= ruleExp2 ( () ( (lv_b_2_0= ruleBinaryExp ) )? ( (lv_right_3_0= ruleExp1 ) ) )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:81:1: (this_Exp2_0= ruleExp2 ( () ( (lv_b_2_0= ruleBinaryExp ) )? ( (lv_right_3_0= ruleExp1 ) ) )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:81:1: (this_Exp2_0= ruleExp2 ( () ( (lv_b_2_0= ruleBinaryExp ) )? ( (lv_right_3_0= ruleExp1 ) ) )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:82:5: this_Exp2_0= ruleExp2 ( () ( (lv_b_2_0= ruleBinaryExp ) )? ( (lv_right_3_0= ruleExp1 ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getExp1Access().getExp2ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExp2_in_ruleExp1132);
            this_Exp2_0=ruleExp2();

            state._fsp--;

             
                    current = this_Exp2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:90:1: ( () ( (lv_b_2_0= ruleBinaryExp ) )? ( (lv_right_3_0= ruleExp1 ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13||(LA2_0>=16 && LA2_0<=53)||(LA2_0>=64 && LA2_0<=69)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:90:2: () ( (lv_b_2_0= ruleBinaryExp ) )? ( (lv_right_3_0= ruleExp1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:90:2: ()
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:91:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExp1Access().getExp1LeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:96:2: ( (lv_b_2_0= ruleBinaryExp ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=68 && LA1_0<=69)) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:97:1: (lv_b_2_0= ruleBinaryExp )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:97:1: (lv_b_2_0= ruleBinaryExp )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:98:3: lv_b_2_0= ruleBinaryExp
                            {
                             
                            	        newCompositeNode(grammarAccess.getExp1Access().getBBinaryExpEnumRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleBinaryExp_in_ruleExp1162);
                            lv_b_2_0=ruleBinaryExp();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getExp1Rule());
                            	        }
                                   		set(
                                   			current, 
                                   			"b",
                                    		lv_b_2_0, 
                                    		"BinaryExp");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:114:3: ( (lv_right_3_0= ruleExp1 ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:115:1: (lv_right_3_0= ruleExp1 )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:115:1: (lv_right_3_0= ruleExp1 )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:116:3: lv_right_3_0= ruleExp1
                    {
                     
                    	        newCompositeNode(grammarAccess.getExp1Access().getRightExp1ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExp1_in_ruleExp1184);
                    lv_right_3_0=ruleExp1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExp1Rule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Exp1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp1"


    // $ANTLR start "entryRuleExp2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:140:1: entryRuleExp2 returns [EObject current=null] : iv_ruleExp2= ruleExp2 EOF ;
    public final EObject entryRuleExp2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp2 = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:141:2: (iv_ruleExp2= ruleExp2 EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:142:2: iv_ruleExp2= ruleExp2 EOF
            {
             newCompositeNode(grammarAccess.getExp2Rule()); 
            pushFollow(FOLLOW_ruleExp2_in_entryRuleExp2222);
            iv_ruleExp2=ruleExp2();

            state._fsp--;

             current =iv_ruleExp2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp2232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp2"


    // $ANTLR start "ruleExp2"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:149:1: ruleExp2 returns [EObject current=null] : ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' ) ) ;
    public final EObject ruleExp2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_0_0 = null;

        EObject this_Exp1_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:152:28: ( ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:153:1: ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:153:1: ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 64:
                {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=16 && LA4_1<=53)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==13) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==13) ) {
                    alt4=2;
                }
                else if ( ((LA4_2>=16 && LA4_2<=53)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                int LA4_3 = input.LA(2);

                if ( ((LA4_3>=16 && LA4_3<=53)) ) {
                    alt4=1;
                }
                else if ( (LA4_3==13) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                int LA4_4 = input.LA(2);

                if ( ((LA4_4>=16 && LA4_4<=53)) ) {
                    alt4=1;
                }
                else if ( (LA4_4==13) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
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
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:153:2: ( (lv_value_0_0= ruleClauseExpression ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:153:2: ( (lv_value_0_0= ruleClauseExpression ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:154:1: (lv_value_0_0= ruleClauseExpression )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:154:1: (lv_value_0_0= ruleClauseExpression )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:155:3: lv_value_0_0= ruleClauseExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExp2Access().getValueClauseExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClauseExpression_in_ruleExp2278);
                    lv_value_0_0=ruleClauseExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExp2Rule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"ClauseExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:6: ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:6: ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:7: ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')'
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:7: ( ruleUnaryExpression )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=64 && LA3_0<=67)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:173:5: ruleUnaryExpression
                            {
                             
                                    newCompositeNode(grammarAccess.getExp2Access().getUnaryExpressionParserRuleCall_1_0()); 
                                
                            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleExp2302);
                            ruleUnaryExpression();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleExp2315); 

                        	newLeafNode(otherlv_2, grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_1());
                        
                     
                            newCompositeNode(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleExp1_in_ruleExp2337);
                    this_Exp1_3=ruleExp1();

                    state._fsp--;

                     
                            current = this_Exp1_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleExp2348); 

                        	newLeafNode(otherlv_4, grammarAccess.getExp2Access().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp2"


    // $ANTLR start "entryRuleClauseExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:205:1: entryRuleClauseExpression returns [EObject current=null] : iv_ruleClauseExpression= ruleClauseExpression EOF ;
    public final EObject entryRuleClauseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClauseExpression = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:206:2: (iv_ruleClauseExpression= ruleClauseExpression EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:207:2: iv_ruleClauseExpression= ruleClauseExpression EOF
            {
             newCompositeNode(grammarAccess.getClauseExpressionRule()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression385);
            iv_ruleClauseExpression=ruleClauseExpression();

            state._fsp--;

             current =iv_ruleClauseExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClauseExpression395); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClauseExpression"


    // $ANTLR start "ruleClauseExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:214:1: ruleClauseExpression returns [EObject current=null] : ( ( ruleUnaryExpression )? ( ( ( (lv_field_1_0= ruleSimpleField ) ) otherlv_2= ':' ( (lv_value_3_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_4_0= ruleTypeField ) ) otherlv_5= ':' ( (lv_value_6_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_7_0= ruleMethodField ) ) otherlv_8= ':' ( (lv_value_9_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_10_0= ruleFilePathField ) ) otherlv_11= ':' ( (lv_value_12_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_13_0= ruleNumberField ) ) otherlv_14= ':' ( (lv_value_15_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_16_0= ruleModifierField ) ) otherlv_17= ':' ( (lv_value_18_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_19_0= ruleTimeField ) ) otherlv_20= ':' ( (lv_value_21_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_22_0= ruleDocumentTypeField ) ) otherlv_23= ':' ( (lv_value_24_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_25_0= ruleProjectNameField ) ) otherlv_26= ':' ( (lv_value_27_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_28_0= ruleAnnotationField ) ) otherlv_29= ':' ( (lv_value_30_0= ruleAnnotationFieldValue ) ) ) ) ) ;
    public final EObject ruleClauseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        EObject lv_field_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        EObject lv_field_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        EObject lv_field_7_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;

        EObject lv_field_10_0 = null;

        AntlrDatatypeRuleToken lv_value_12_0 = null;

        EObject lv_field_13_0 = null;

        AntlrDatatypeRuleToken lv_value_15_0 = null;

        EObject lv_field_16_0 = null;

        AntlrDatatypeRuleToken lv_value_18_0 = null;

        EObject lv_field_19_0 = null;

        AntlrDatatypeRuleToken lv_value_21_0 = null;

        EObject lv_field_22_0 = null;

        AntlrDatatypeRuleToken lv_value_24_0 = null;

        EObject lv_field_25_0 = null;

        AntlrDatatypeRuleToken lv_value_27_0 = null;

        EObject lv_field_28_0 = null;

        AntlrDatatypeRuleToken lv_value_30_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:217:28: ( ( ( ruleUnaryExpression )? ( ( ( (lv_field_1_0= ruleSimpleField ) ) otherlv_2= ':' ( (lv_value_3_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_4_0= ruleTypeField ) ) otherlv_5= ':' ( (lv_value_6_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_7_0= ruleMethodField ) ) otherlv_8= ':' ( (lv_value_9_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_10_0= ruleFilePathField ) ) otherlv_11= ':' ( (lv_value_12_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_13_0= ruleNumberField ) ) otherlv_14= ':' ( (lv_value_15_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_16_0= ruleModifierField ) ) otherlv_17= ':' ( (lv_value_18_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_19_0= ruleTimeField ) ) otherlv_20= ':' ( (lv_value_21_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_22_0= ruleDocumentTypeField ) ) otherlv_23= ':' ( (lv_value_24_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_25_0= ruleProjectNameField ) ) otherlv_26= ':' ( (lv_value_27_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_28_0= ruleAnnotationField ) ) otherlv_29= ':' ( (lv_value_30_0= ruleAnnotationFieldValue ) ) ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:218:1: ( ( ruleUnaryExpression )? ( ( ( (lv_field_1_0= ruleSimpleField ) ) otherlv_2= ':' ( (lv_value_3_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_4_0= ruleTypeField ) ) otherlv_5= ':' ( (lv_value_6_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_7_0= ruleMethodField ) ) otherlv_8= ':' ( (lv_value_9_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_10_0= ruleFilePathField ) ) otherlv_11= ':' ( (lv_value_12_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_13_0= ruleNumberField ) ) otherlv_14= ':' ( (lv_value_15_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_16_0= ruleModifierField ) ) otherlv_17= ':' ( (lv_value_18_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_19_0= ruleTimeField ) ) otherlv_20= ':' ( (lv_value_21_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_22_0= ruleDocumentTypeField ) ) otherlv_23= ':' ( (lv_value_24_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_25_0= ruleProjectNameField ) ) otherlv_26= ':' ( (lv_value_27_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_28_0= ruleAnnotationField ) ) otherlv_29= ':' ( (lv_value_30_0= ruleAnnotationFieldValue ) ) ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:218:1: ( ( ruleUnaryExpression )? ( ( ( (lv_field_1_0= ruleSimpleField ) ) otherlv_2= ':' ( (lv_value_3_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_4_0= ruleTypeField ) ) otherlv_5= ':' ( (lv_value_6_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_7_0= ruleMethodField ) ) otherlv_8= ':' ( (lv_value_9_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_10_0= ruleFilePathField ) ) otherlv_11= ':' ( (lv_value_12_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_13_0= ruleNumberField ) ) otherlv_14= ':' ( (lv_value_15_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_16_0= ruleModifierField ) ) otherlv_17= ':' ( (lv_value_18_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_19_0= ruleTimeField ) ) otherlv_20= ':' ( (lv_value_21_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_22_0= ruleDocumentTypeField ) ) otherlv_23= ':' ( (lv_value_24_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_25_0= ruleProjectNameField ) ) otherlv_26= ':' ( (lv_value_27_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_28_0= ruleAnnotationField ) ) otherlv_29= ':' ( (lv_value_30_0= ruleAnnotationFieldValue ) ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:218:2: ( ruleUnaryExpression )? ( ( ( (lv_field_1_0= ruleSimpleField ) ) otherlv_2= ':' ( (lv_value_3_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_4_0= ruleTypeField ) ) otherlv_5= ':' ( (lv_value_6_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_7_0= ruleMethodField ) ) otherlv_8= ':' ( (lv_value_9_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_10_0= ruleFilePathField ) ) otherlv_11= ':' ( (lv_value_12_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_13_0= ruleNumberField ) ) otherlv_14= ':' ( (lv_value_15_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_16_0= ruleModifierField ) ) otherlv_17= ':' ( (lv_value_18_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_19_0= ruleTimeField ) ) otherlv_20= ':' ( (lv_value_21_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_22_0= ruleDocumentTypeField ) ) otherlv_23= ':' ( (lv_value_24_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_25_0= ruleProjectNameField ) ) otherlv_26= ':' ( (lv_value_27_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_28_0= ruleAnnotationField ) ) otherlv_29= ':' ( (lv_value_30_0= ruleAnnotationFieldValue ) ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:218:2: ( ruleUnaryExpression )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=64 && LA5_0<=67)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:219:5: ruleUnaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression437);
                    ruleUnaryExpression();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:226:3: ( ( ( (lv_field_1_0= ruleSimpleField ) ) otherlv_2= ':' ( (lv_value_3_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_4_0= ruleTypeField ) ) otherlv_5= ':' ( (lv_value_6_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_7_0= ruleMethodField ) ) otherlv_8= ':' ( (lv_value_9_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_10_0= ruleFilePathField ) ) otherlv_11= ':' ( (lv_value_12_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_13_0= ruleNumberField ) ) otherlv_14= ':' ( (lv_value_15_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_16_0= ruleModifierField ) ) otherlv_17= ':' ( (lv_value_18_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_19_0= ruleTimeField ) ) otherlv_20= ':' ( (lv_value_21_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_22_0= ruleDocumentTypeField ) ) otherlv_23= ':' ( (lv_value_24_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_25_0= ruleProjectNameField ) ) otherlv_26= ':' ( (lv_value_27_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_28_0= ruleAnnotationField ) ) otherlv_29= ':' ( (lv_value_30_0= ruleAnnotationFieldValue ) ) ) )
            int alt6=10;
            switch ( input.LA(1) ) {
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
                {
                alt6=1;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt6=3;
                }
                break;
            case 34:
                {
                alt6=4;
                }
                break;
            case 35:
                {
                alt6=5;
                }
                break;
            case 36:
                {
                alt6=6;
                }
                break;
            case 37:
                {
                alt6=7;
                }
                break;
            case 38:
                {
                alt6=8;
                }
                break;
            case 39:
                {
                alt6=9;
                }
                break;
            case 40:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:226:4: ( ( (lv_field_1_0= ruleSimpleField ) ) otherlv_2= ':' ( (lv_value_3_0= ruleSimpleFieldValue ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:226:4: ( ( (lv_field_1_0= ruleSimpleField ) ) otherlv_2= ':' ( (lv_value_3_0= ruleSimpleFieldValue ) ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:226:5: ( (lv_field_1_0= ruleSimpleField ) ) otherlv_2= ':' ( (lv_value_3_0= ruleSimpleFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:226:5: ( (lv_field_1_0= ruleSimpleField ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:227:1: (lv_field_1_0= ruleSimpleField )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:227:1: (lv_field_1_0= ruleSimpleField )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:228:3: lv_field_1_0= ruleSimpleField
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldSimpleFieldParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleField_in_ruleClauseExpression461);
                    lv_field_1_0=ruleSimpleField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"field",
                            		lv_field_1_0, 
                            		"SimpleField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression473); 

                        	newLeafNode(otherlv_2, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_0_1());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:248:1: ( (lv_value_3_0= ruleSimpleFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:249:1: (lv_value_3_0= ruleSimpleFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:249:1: (lv_value_3_0= ruleSimpleFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:250:3: lv_value_3_0= ruleSimpleFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueSimpleFieldValueParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression494);
                    lv_value_3_0=ruleSimpleFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"SimpleFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:267:6: ( ( (lv_field_4_0= ruleTypeField ) ) otherlv_5= ':' ( (lv_value_6_0= ruleTypeFieldValue ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:267:6: ( ( (lv_field_4_0= ruleTypeField ) ) otherlv_5= ':' ( (lv_value_6_0= ruleTypeFieldValue ) ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:267:7: ( (lv_field_4_0= ruleTypeField ) ) otherlv_5= ':' ( (lv_value_6_0= ruleTypeFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:267:7: ( (lv_field_4_0= ruleTypeField ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:268:1: (lv_field_4_0= ruleTypeField )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:268:1: (lv_field_4_0= ruleTypeField )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:269:3: lv_field_4_0= ruleTypeField
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldTypeFieldParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeField_in_ruleClauseExpression523);
                    lv_field_4_0=ruleTypeField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"field",
                            		lv_field_4_0, 
                            		"TypeField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression535); 

                        	newLeafNode(otherlv_5, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_1());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:289:1: ( (lv_value_6_0= ruleTypeFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:290:1: (lv_value_6_0= ruleTypeFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:290:1: (lv_value_6_0= ruleTypeFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:291:3: lv_value_6_0= ruleTypeFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueTypeFieldValueParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression556);
                    lv_value_6_0=ruleTypeFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"TypeFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:308:6: ( ( (lv_field_7_0= ruleMethodField ) ) otherlv_8= ':' ( (lv_value_9_0= ruleMethodFieldValue ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:308:6: ( ( (lv_field_7_0= ruleMethodField ) ) otherlv_8= ':' ( (lv_value_9_0= ruleMethodFieldValue ) ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:308:7: ( (lv_field_7_0= ruleMethodField ) ) otherlv_8= ':' ( (lv_value_9_0= ruleMethodFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:308:7: ( (lv_field_7_0= ruleMethodField ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:309:1: (lv_field_7_0= ruleMethodField )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:309:1: (lv_field_7_0= ruleMethodField )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:310:3: lv_field_7_0= ruleMethodField
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldMethodFieldParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMethodField_in_ruleClauseExpression585);
                    lv_field_7_0=ruleMethodField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"field",
                            		lv_field_7_0, 
                            		"MethodField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression597); 

                        	newLeafNode(otherlv_8, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_2_1());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:330:1: ( (lv_value_9_0= ruleMethodFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:331:1: (lv_value_9_0= ruleMethodFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:331:1: (lv_value_9_0= ruleMethodFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:332:3: lv_value_9_0= ruleMethodFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueMethodFieldValueParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression618);
                    lv_value_9_0=ruleMethodFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_9_0, 
                            		"MethodFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:349:6: ( ( (lv_field_10_0= ruleFilePathField ) ) otherlv_11= ':' ( (lv_value_12_0= ruleFilePathFieldValue ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:349:6: ( ( (lv_field_10_0= ruleFilePathField ) ) otherlv_11= ':' ( (lv_value_12_0= ruleFilePathFieldValue ) ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:349:7: ( (lv_field_10_0= ruleFilePathField ) ) otherlv_11= ':' ( (lv_value_12_0= ruleFilePathFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:349:7: ( (lv_field_10_0= ruleFilePathField ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:350:1: (lv_field_10_0= ruleFilePathField )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:350:1: (lv_field_10_0= ruleFilePathField )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:351:3: lv_field_10_0= ruleFilePathField
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldFilePathFieldParserRuleCall_1_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilePathField_in_ruleClauseExpression647);
                    lv_field_10_0=ruleFilePathField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"field",
                            		lv_field_10_0, 
                            		"FilePathField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression659); 

                        	newLeafNode(otherlv_11, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_3_1());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:371:1: ( (lv_value_12_0= ruleFilePathFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:372:1: (lv_value_12_0= ruleFilePathFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:372:1: (lv_value_12_0= ruleFilePathFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:373:3: lv_value_12_0= ruleFilePathFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueFilePathFieldValueParserRuleCall_1_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression680);
                    lv_value_12_0=ruleFilePathFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_12_0, 
                            		"FilePathFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:390:6: ( ( (lv_field_13_0= ruleNumberField ) ) otherlv_14= ':' ( (lv_value_15_0= ruleNumberFieldValue ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:390:6: ( ( (lv_field_13_0= ruleNumberField ) ) otherlv_14= ':' ( (lv_value_15_0= ruleNumberFieldValue ) ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:390:7: ( (lv_field_13_0= ruleNumberField ) ) otherlv_14= ':' ( (lv_value_15_0= ruleNumberFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:390:7: ( (lv_field_13_0= ruleNumberField ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:391:1: (lv_field_13_0= ruleNumberField )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:391:1: (lv_field_13_0= ruleNumberField )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:392:3: lv_field_13_0= ruleNumberField
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldNumberFieldParserRuleCall_1_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumberField_in_ruleClauseExpression709);
                    lv_field_13_0=ruleNumberField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"field",
                            		lv_field_13_0, 
                            		"NumberField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression721); 

                        	newLeafNode(otherlv_14, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_4_1());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:412:1: ( (lv_value_15_0= ruleNumberFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:413:1: (lv_value_15_0= ruleNumberFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:413:1: (lv_value_15_0= ruleNumberFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:414:3: lv_value_15_0= ruleNumberFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueNumberFieldValueParserRuleCall_1_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression742);
                    lv_value_15_0=ruleNumberFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_15_0, 
                            		"NumberFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:431:6: ( ( (lv_field_16_0= ruleModifierField ) ) otherlv_17= ':' ( (lv_value_18_0= ruleModifierFieldValue ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:431:6: ( ( (lv_field_16_0= ruleModifierField ) ) otherlv_17= ':' ( (lv_value_18_0= ruleModifierFieldValue ) ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:431:7: ( (lv_field_16_0= ruleModifierField ) ) otherlv_17= ':' ( (lv_value_18_0= ruleModifierFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:431:7: ( (lv_field_16_0= ruleModifierField ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:432:1: (lv_field_16_0= ruleModifierField )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:432:1: (lv_field_16_0= ruleModifierField )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:433:3: lv_field_16_0= ruleModifierField
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldModifierFieldParserRuleCall_1_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModifierField_in_ruleClauseExpression771);
                    lv_field_16_0=ruleModifierField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"field",
                            		lv_field_16_0, 
                            		"ModifierField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression783); 

                        	newLeafNode(otherlv_17, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_5_1());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:453:1: ( (lv_value_18_0= ruleModifierFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:454:1: (lv_value_18_0= ruleModifierFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:454:1: (lv_value_18_0= ruleModifierFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:455:3: lv_value_18_0= ruleModifierFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueModifierFieldValueParserRuleCall_1_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression804);
                    lv_value_18_0=ruleModifierFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_18_0, 
                            		"ModifierFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:472:6: ( ( (lv_field_19_0= ruleTimeField ) ) otherlv_20= ':' ( (lv_value_21_0= ruleTimeFieldValue ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:472:6: ( ( (lv_field_19_0= ruleTimeField ) ) otherlv_20= ':' ( (lv_value_21_0= ruleTimeFieldValue ) ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:472:7: ( (lv_field_19_0= ruleTimeField ) ) otherlv_20= ':' ( (lv_value_21_0= ruleTimeFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:472:7: ( (lv_field_19_0= ruleTimeField ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:473:1: (lv_field_19_0= ruleTimeField )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:473:1: (lv_field_19_0= ruleTimeField )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:474:3: lv_field_19_0= ruleTimeField
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldTimeFieldParserRuleCall_1_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeField_in_ruleClauseExpression833);
                    lv_field_19_0=ruleTimeField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"field",
                            		lv_field_19_0, 
                            		"TimeField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_20=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression845); 

                        	newLeafNode(otherlv_20, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_6_1());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:494:1: ( (lv_value_21_0= ruleTimeFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:495:1: (lv_value_21_0= ruleTimeFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:495:1: (lv_value_21_0= ruleTimeFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:496:3: lv_value_21_0= ruleTimeFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueTimeFieldValueParserRuleCall_1_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeFieldValue_in_ruleClauseExpression866);
                    lv_value_21_0=ruleTimeFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_21_0, 
                            		"TimeFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:513:6: ( ( (lv_field_22_0= ruleDocumentTypeField ) ) otherlv_23= ':' ( (lv_value_24_0= ruleDocumentTypeFieldValue ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:513:6: ( ( (lv_field_22_0= ruleDocumentTypeField ) ) otherlv_23= ':' ( (lv_value_24_0= ruleDocumentTypeFieldValue ) ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:513:7: ( (lv_field_22_0= ruleDocumentTypeField ) ) otherlv_23= ':' ( (lv_value_24_0= ruleDocumentTypeFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:513:7: ( (lv_field_22_0= ruleDocumentTypeField ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:514:1: (lv_field_22_0= ruleDocumentTypeField )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:514:1: (lv_field_22_0= ruleDocumentTypeField )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:515:3: lv_field_22_0= ruleDocumentTypeField
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldDocumentTypeFieldParserRuleCall_1_7_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocumentTypeField_in_ruleClauseExpression895);
                    lv_field_22_0=ruleDocumentTypeField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"field",
                            		lv_field_22_0, 
                            		"DocumentTypeField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression907); 

                        	newLeafNode(otherlv_23, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_7_1());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:535:1: ( (lv_value_24_0= ruleDocumentTypeFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:536:1: (lv_value_24_0= ruleDocumentTypeFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:536:1: (lv_value_24_0= ruleDocumentTypeFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:537:3: lv_value_24_0= ruleDocumentTypeFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueDocumentTypeFieldValueParserRuleCall_1_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression928);
                    lv_value_24_0=ruleDocumentTypeFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_24_0, 
                            		"DocumentTypeFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:554:6: ( ( (lv_field_25_0= ruleProjectNameField ) ) otherlv_26= ':' ( (lv_value_27_0= ruleProjectNameFieldValue ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:554:6: ( ( (lv_field_25_0= ruleProjectNameField ) ) otherlv_26= ':' ( (lv_value_27_0= ruleProjectNameFieldValue ) ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:554:7: ( (lv_field_25_0= ruleProjectNameField ) ) otherlv_26= ':' ( (lv_value_27_0= ruleProjectNameFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:554:7: ( (lv_field_25_0= ruleProjectNameField ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:555:1: (lv_field_25_0= ruleProjectNameField )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:555:1: (lv_field_25_0= ruleProjectNameField )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:556:3: lv_field_25_0= ruleProjectNameField
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldProjectNameFieldParserRuleCall_1_8_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectNameField_in_ruleClauseExpression957);
                    lv_field_25_0=ruleProjectNameField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"field",
                            		lv_field_25_0, 
                            		"ProjectNameField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression969); 

                        	newLeafNode(otherlv_26, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_8_1());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:576:1: ( (lv_value_27_0= ruleProjectNameFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:577:1: (lv_value_27_0= ruleProjectNameFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:577:1: (lv_value_27_0= ruleProjectNameFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:578:3: lv_value_27_0= ruleProjectNameFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueProjectNameFieldValueParserRuleCall_1_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression990);
                    lv_value_27_0=ruleProjectNameFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_27_0, 
                            		"ProjectNameFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:595:6: ( ( (lv_field_28_0= ruleAnnotationField ) ) otherlv_29= ':' ( (lv_value_30_0= ruleAnnotationFieldValue ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:595:6: ( ( (lv_field_28_0= ruleAnnotationField ) ) otherlv_29= ':' ( (lv_value_30_0= ruleAnnotationFieldValue ) ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:595:7: ( (lv_field_28_0= ruleAnnotationField ) ) otherlv_29= ':' ( (lv_value_30_0= ruleAnnotationFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:595:7: ( (lv_field_28_0= ruleAnnotationField ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:596:1: (lv_field_28_0= ruleAnnotationField )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:596:1: (lv_field_28_0= ruleAnnotationField )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:597:3: lv_field_28_0= ruleAnnotationField
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldAnnotationFieldParserRuleCall_1_9_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotationField_in_ruleClauseExpression1019);
                    lv_field_28_0=ruleAnnotationField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"field",
                            		lv_field_28_0, 
                            		"AnnotationField");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_29=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression1031); 

                        	newLeafNode(otherlv_29, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_9_1());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:617:1: ( (lv_value_30_0= ruleAnnotationFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:618:1: (lv_value_30_0= ruleAnnotationFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:618:1: (lv_value_30_0= ruleAnnotationFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:619:3: lv_value_30_0= ruleAnnotationFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueAnnotationFieldValueParserRuleCall_1_9_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotationFieldValue_in_ruleClauseExpression1052);
                    lv_value_30_0=ruleAnnotationFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_30_0, 
                            		"AnnotationFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClauseExpression"


    // $ANTLR start "entryRuleTypeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:643:1: entryRuleTypeField returns [EObject current=null] : iv_ruleTypeField= ruleTypeField EOF ;
    public final EObject entryRuleTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:644:2: (iv_ruleTypeField= ruleTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:645:2: iv_ruleTypeField= ruleTypeField EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldRule()); 
            pushFollow(FOLLOW_ruleTypeField_in_entryRuleTypeField1090);
            iv_ruleTypeField=ruleTypeField();

            state._fsp--;

             current =iv_ruleTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeField1100); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeField"


    // $ANTLR start "ruleTypeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:652:1: ruleTypeField returns [EObject current=null] : ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_DeclaringType_13_0= 'DeclaringType' ) ) ) ;
    public final EObject ruleTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_ImplementedTypes_0_0=null;
        Token lv_ExtendedTypes_1_0=null;
        Token lv_UsedTypes_2_0=null;
        Token lv_UsedTypesInTry_3_0=null;
        Token lv_UsedTypesInFinally_4_0=null;
        Token lv_ParameterTypes_5_0=null;
        Token lv_ReturnType_6_0=null;
        Token lv_InstanceofTypes_7_0=null;
        Token lv_AllImplementedTypes_8_0=null;
        Token lv_AllExtendedTypes_9_0=null;
        Token lv_FieldType_10_0=null;
        Token lv_CaughtType_11_0=null;
        Token lv_DeclaredFieldTypes_12_0=null;
        Token lv_DeclaringType_13_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:655:28: ( ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_DeclaringType_13_0= 'DeclaringType' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:656:1: ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_DeclaringType_13_0= 'DeclaringType' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:656:1: ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_DeclaringType_13_0= 'DeclaringType' ) ) )
            int alt7=14;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            case 24:
                {
                alt7=9;
                }
                break;
            case 25:
                {
                alt7=10;
                }
                break;
            case 26:
                {
                alt7=11;
                }
                break;
            case 27:
                {
                alt7=12;
                }
                break;
            case 28:
                {
                alt7=13;
                }
                break;
            case 29:
                {
                alt7=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:656:2: ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:656:2: ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:657:1: (lv_ImplementedTypes_0_0= 'ImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:657:1: (lv_ImplementedTypes_0_0= 'ImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:658:3: lv_ImplementedTypes_0_0= 'ImplementedTypes'
                    {
                    lv_ImplementedTypes_0_0=(Token)match(input,16,FOLLOW_16_in_ruleTypeField1143); 

                            newLeafNode(lv_ImplementedTypes_0_0, grammarAccess.getTypeFieldAccess().getImplementedTypesImplementedTypesKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "ImplementedTypes", lv_ImplementedTypes_0_0, "ImplementedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:672:6: ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:672:6: ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:673:1: (lv_ExtendedTypes_1_0= 'ExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:673:1: (lv_ExtendedTypes_1_0= 'ExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:674:3: lv_ExtendedTypes_1_0= 'ExtendedTypes'
                    {
                    lv_ExtendedTypes_1_0=(Token)match(input,17,FOLLOW_17_in_ruleTypeField1180); 

                            newLeafNode(lv_ExtendedTypes_1_0, grammarAccess.getTypeFieldAccess().getExtendedTypesExtendedTypesKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "ExtendedTypes", lv_ExtendedTypes_1_0, "ExtendedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:688:6: ( (lv_UsedTypes_2_0= 'UsedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:688:6: ( (lv_UsedTypes_2_0= 'UsedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:689:1: (lv_UsedTypes_2_0= 'UsedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:689:1: (lv_UsedTypes_2_0= 'UsedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:690:3: lv_UsedTypes_2_0= 'UsedTypes'
                    {
                    lv_UsedTypes_2_0=(Token)match(input,18,FOLLOW_18_in_ruleTypeField1217); 

                            newLeafNode(lv_UsedTypes_2_0, grammarAccess.getTypeFieldAccess().getUsedTypesUsedTypesKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "UsedTypes", lv_UsedTypes_2_0, "UsedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:704:6: ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:704:6: ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:705:1: (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:705:1: (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:706:3: lv_UsedTypesInTry_3_0= 'UsedTypesInTry'
                    {
                    lv_UsedTypesInTry_3_0=(Token)match(input,19,FOLLOW_19_in_ruleTypeField1254); 

                            newLeafNode(lv_UsedTypesInTry_3_0, grammarAccess.getTypeFieldAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "UsedTypesInTry", lv_UsedTypesInTry_3_0, "UsedTypesInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:720:6: ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:720:6: ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:721:1: (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:721:1: (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:722:3: lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally'
                    {
                    lv_UsedTypesInFinally_4_0=(Token)match(input,20,FOLLOW_20_in_ruleTypeField1291); 

                            newLeafNode(lv_UsedTypesInFinally_4_0, grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "UsedTypesInFinally", lv_UsedTypesInFinally_4_0, "UsedTypesInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:736:6: ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:736:6: ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:737:1: (lv_ParameterTypes_5_0= 'ParameterTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:737:1: (lv_ParameterTypes_5_0= 'ParameterTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:738:3: lv_ParameterTypes_5_0= 'ParameterTypes'
                    {
                    lv_ParameterTypes_5_0=(Token)match(input,21,FOLLOW_21_in_ruleTypeField1328); 

                            newLeafNode(lv_ParameterTypes_5_0, grammarAccess.getTypeFieldAccess().getParameterTypesParameterTypesKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "ParameterTypes", lv_ParameterTypes_5_0, "ParameterTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:752:6: ( (lv_ReturnType_6_0= 'ReturnType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:752:6: ( (lv_ReturnType_6_0= 'ReturnType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:753:1: (lv_ReturnType_6_0= 'ReturnType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:753:1: (lv_ReturnType_6_0= 'ReturnType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:754:3: lv_ReturnType_6_0= 'ReturnType'
                    {
                    lv_ReturnType_6_0=(Token)match(input,22,FOLLOW_22_in_ruleTypeField1365); 

                            newLeafNode(lv_ReturnType_6_0, grammarAccess.getTypeFieldAccess().getReturnTypeReturnTypeKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "ReturnType", lv_ReturnType_6_0, "ReturnType");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:768:6: ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:768:6: ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:769:1: (lv_InstanceofTypes_7_0= 'InstanceofTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:769:1: (lv_InstanceofTypes_7_0= 'InstanceofTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:770:3: lv_InstanceofTypes_7_0= 'InstanceofTypes'
                    {
                    lv_InstanceofTypes_7_0=(Token)match(input,23,FOLLOW_23_in_ruleTypeField1402); 

                            newLeafNode(lv_InstanceofTypes_7_0, grammarAccess.getTypeFieldAccess().getInstanceofTypesInstanceofTypesKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "InstanceofTypes", lv_InstanceofTypes_7_0, "InstanceofTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:784:6: ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:784:6: ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:785:1: (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:785:1: (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:786:3: lv_AllImplementedTypes_8_0= 'AllImplementedTypes'
                    {
                    lv_AllImplementedTypes_8_0=(Token)match(input,24,FOLLOW_24_in_ruleTypeField1439); 

                            newLeafNode(lv_AllImplementedTypes_8_0, grammarAccess.getTypeFieldAccess().getAllImplementedTypesAllImplementedTypesKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "AllImplementedTypes", lv_AllImplementedTypes_8_0, "AllImplementedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:800:6: ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:800:6: ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:801:1: (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:801:1: (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:802:3: lv_AllExtendedTypes_9_0= 'AllExtendedTypes'
                    {
                    lv_AllExtendedTypes_9_0=(Token)match(input,25,FOLLOW_25_in_ruleTypeField1476); 

                            newLeafNode(lv_AllExtendedTypes_9_0, grammarAccess.getTypeFieldAccess().getAllExtendedTypesAllExtendedTypesKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "AllExtendedTypes", lv_AllExtendedTypes_9_0, "AllExtendedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:816:6: ( (lv_FieldType_10_0= 'FieldType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:816:6: ( (lv_FieldType_10_0= 'FieldType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:817:1: (lv_FieldType_10_0= 'FieldType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:817:1: (lv_FieldType_10_0= 'FieldType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:818:3: lv_FieldType_10_0= 'FieldType'
                    {
                    lv_FieldType_10_0=(Token)match(input,26,FOLLOW_26_in_ruleTypeField1513); 

                            newLeafNode(lv_FieldType_10_0, grammarAccess.getTypeFieldAccess().getFieldTypeFieldTypeKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "FieldType", lv_FieldType_10_0, "FieldType");
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:832:6: ( (lv_CaughtType_11_0= 'CaughtType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:832:6: ( (lv_CaughtType_11_0= 'CaughtType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:833:1: (lv_CaughtType_11_0= 'CaughtType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:833:1: (lv_CaughtType_11_0= 'CaughtType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:834:3: lv_CaughtType_11_0= 'CaughtType'
                    {
                    lv_CaughtType_11_0=(Token)match(input,27,FOLLOW_27_in_ruleTypeField1550); 

                            newLeafNode(lv_CaughtType_11_0, grammarAccess.getTypeFieldAccess().getCaughtTypeCaughtTypeKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "CaughtType", lv_CaughtType_11_0, "CaughtType");
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:848:6: ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:848:6: ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:849:1: (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:849:1: (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:850:3: lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes'
                    {
                    lv_DeclaredFieldTypes_12_0=(Token)match(input,28,FOLLOW_28_in_ruleTypeField1587); 

                            newLeafNode(lv_DeclaredFieldTypes_12_0, grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredFieldTypes", lv_DeclaredFieldTypes_12_0, "DeclaredFieldTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:864:6: ( (lv_DeclaringType_13_0= 'DeclaringType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:864:6: ( (lv_DeclaringType_13_0= 'DeclaringType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:865:1: (lv_DeclaringType_13_0= 'DeclaringType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:865:1: (lv_DeclaringType_13_0= 'DeclaringType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:866:3: lv_DeclaringType_13_0= 'DeclaringType'
                    {
                    lv_DeclaringType_13_0=(Token)match(input,29,FOLLOW_29_in_ruleTypeField1624); 

                            newLeafNode(lv_DeclaringType_13_0, grammarAccess.getTypeFieldAccess().getDeclaringTypeDeclaringTypeKeyword_13_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaringType", lv_DeclaringType_13_0, "DeclaringType");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeField"


    // $ANTLR start "entryRuleMethodField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:887:1: entryRuleMethodField returns [EObject current=null] : iv_ruleMethodField= ruleMethodField EOF ;
    public final EObject entryRuleMethodField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:888:2: (iv_ruleMethodField= ruleMethodField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:889:2: iv_ruleMethodField= ruleMethodField EOF
            {
             newCompositeNode(grammarAccess.getMethodFieldRule()); 
            pushFollow(FOLLOW_ruleMethodField_in_entryRuleMethodField1673);
            iv_ruleMethodField=ruleMethodField();

            state._fsp--;

             current =iv_ruleMethodField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodField1683); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodField"


    // $ANTLR start "ruleMethodField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:896:1: ruleMethodField returns [EObject current=null] : ( ( (lv_UsedMethods_0_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) ) ) ;
    public final EObject ruleMethodField() throws RecognitionException {
        EObject current = null;

        Token lv_UsedMethods_0_0=null;
        Token lv_UsedMethodsInTry_1_0=null;
        Token lv_UsedMethodsInFinally_2_0=null;
        Token lv_OverriddenMethods_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:899:28: ( ( ( (lv_UsedMethods_0_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:900:1: ( ( (lv_UsedMethods_0_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:900:1: ( ( (lv_UsedMethods_0_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            case 33:
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:900:2: ( (lv_UsedMethods_0_0= 'UsedMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:900:2: ( (lv_UsedMethods_0_0= 'UsedMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:901:1: (lv_UsedMethods_0_0= 'UsedMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:901:1: (lv_UsedMethods_0_0= 'UsedMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:902:3: lv_UsedMethods_0_0= 'UsedMethods'
                    {
                    lv_UsedMethods_0_0=(Token)match(input,30,FOLLOW_30_in_ruleMethodField1726); 

                            newLeafNode(lv_UsedMethods_0_0, grammarAccess.getMethodFieldAccess().getUsedMethodsUsedMethodsKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "UsedMethods", lv_UsedMethods_0_0, "UsedMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:916:6: ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:916:6: ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:917:1: (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:917:1: (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:918:3: lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry'
                    {
                    lv_UsedMethodsInTry_1_0=(Token)match(input,31,FOLLOW_31_in_ruleMethodField1763); 

                            newLeafNode(lv_UsedMethodsInTry_1_0, grammarAccess.getMethodFieldAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "UsedMethodsInTry", lv_UsedMethodsInTry_1_0, "UsedMethodsInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:932:6: ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:932:6: ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:933:1: (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:933:1: (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:934:3: lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally'
                    {
                    lv_UsedMethodsInFinally_2_0=(Token)match(input,32,FOLLOW_32_in_ruleMethodField1800); 

                            newLeafNode(lv_UsedMethodsInFinally_2_0, grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "UsedMethodsInFinally", lv_UsedMethodsInFinally_2_0, "UsedMethodsInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:948:6: ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:948:6: ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:949:1: (lv_OverriddenMethods_3_0= 'OverriddenMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:949:1: (lv_OverriddenMethods_3_0= 'OverriddenMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:950:3: lv_OverriddenMethods_3_0= 'OverriddenMethods'
                    {
                    lv_OverriddenMethods_3_0=(Token)match(input,33,FOLLOW_33_in_ruleMethodField1837); 

                            newLeafNode(lv_OverriddenMethods_3_0, grammarAccess.getMethodFieldAccess().getOverriddenMethodsOverriddenMethodsKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "OverriddenMethods", lv_OverriddenMethods_3_0, "OverriddenMethods");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodField"


    // $ANTLR start "entryRuleFilePathField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:971:1: entryRuleFilePathField returns [EObject current=null] : iv_ruleFilePathField= ruleFilePathField EOF ;
    public final EObject entryRuleFilePathField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilePathField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:972:2: (iv_ruleFilePathField= ruleFilePathField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:973:2: iv_ruleFilePathField= ruleFilePathField EOF
            {
             newCompositeNode(grammarAccess.getFilePathFieldRule()); 
            pushFollow(FOLLOW_ruleFilePathField_in_entryRuleFilePathField1886);
            iv_ruleFilePathField=ruleFilePathField();

            state._fsp--;

             current =iv_ruleFilePathField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathField1896); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilePathField"


    // $ANTLR start "ruleFilePathField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:980:1: ruleFilePathField returns [EObject current=null] : ( (lv_ResourcePath_0_0= 'ResourcePath' ) ) ;
    public final EObject ruleFilePathField() throws RecognitionException {
        EObject current = null;

        Token lv_ResourcePath_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:983:28: ( ( (lv_ResourcePath_0_0= 'ResourcePath' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:984:1: ( (lv_ResourcePath_0_0= 'ResourcePath' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:984:1: ( (lv_ResourcePath_0_0= 'ResourcePath' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:985:1: (lv_ResourcePath_0_0= 'ResourcePath' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:985:1: (lv_ResourcePath_0_0= 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:986:3: lv_ResourcePath_0_0= 'ResourcePath'
            {
            lv_ResourcePath_0_0=(Token)match(input,34,FOLLOW_34_in_ruleFilePathField1938); 

                    newLeafNode(lv_ResourcePath_0_0, grammarAccess.getFilePathFieldAccess().getResourcePathResourcePathKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFilePathFieldRule());
            	        }
                   		setWithLastConsumed(current, "ResourcePath", lv_ResourcePath_0_0, "ResourcePath");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilePathField"


    // $ANTLR start "entryRuleNumberField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1007:1: entryRuleNumberField returns [EObject current=null] : iv_ruleNumberField= ruleNumberField EOF ;
    public final EObject entryRuleNumberField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1008:2: (iv_ruleNumberField= ruleNumberField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1009:2: iv_ruleNumberField= ruleNumberField EOF
            {
             newCompositeNode(grammarAccess.getNumberFieldRule()); 
            pushFollow(FOLLOW_ruleNumberField_in_entryRuleNumberField1986);
            iv_ruleNumberField=ruleNumberField();

            state._fsp--;

             current =iv_ruleNumberField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberField1996); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberField"


    // $ANTLR start "ruleNumberField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1016:1: ruleNumberField returns [EObject current=null] : ( (lv_ParameterCount_0_0= 'ParameterCount' ) ) ;
    public final EObject ruleNumberField() throws RecognitionException {
        EObject current = null;

        Token lv_ParameterCount_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1019:28: ( ( (lv_ParameterCount_0_0= 'ParameterCount' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1020:1: ( (lv_ParameterCount_0_0= 'ParameterCount' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1020:1: ( (lv_ParameterCount_0_0= 'ParameterCount' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1021:1: (lv_ParameterCount_0_0= 'ParameterCount' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1021:1: (lv_ParameterCount_0_0= 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1022:3: lv_ParameterCount_0_0= 'ParameterCount'
            {
            lv_ParameterCount_0_0=(Token)match(input,35,FOLLOW_35_in_ruleNumberField2038); 

                    newLeafNode(lv_ParameterCount_0_0, grammarAccess.getNumberFieldAccess().getParameterCountParameterCountKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberFieldRule());
            	        }
                   		setWithLastConsumed(current, "ParameterCount", lv_ParameterCount_0_0, "ParameterCount");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberField"


    // $ANTLR start "entryRuleModifierField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1043:1: entryRuleModifierField returns [EObject current=null] : iv_ruleModifierField= ruleModifierField EOF ;
    public final EObject entryRuleModifierField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1044:2: (iv_ruleModifierField= ruleModifierField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1045:2: iv_ruleModifierField= ruleModifierField EOF
            {
             newCompositeNode(grammarAccess.getModifierFieldRule()); 
            pushFollow(FOLLOW_ruleModifierField_in_entryRuleModifierField2086);
            iv_ruleModifierField=ruleModifierField();

            state._fsp--;

             current =iv_ruleModifierField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierField2096); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifierField"


    // $ANTLR start "ruleModifierField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1052:1: ruleModifierField returns [EObject current=null] : ( (lv_Modifiers_0_0= 'Modifiers' ) ) ;
    public final EObject ruleModifierField() throws RecognitionException {
        EObject current = null;

        Token lv_Modifiers_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1055:28: ( ( (lv_Modifiers_0_0= 'Modifiers' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1056:1: ( (lv_Modifiers_0_0= 'Modifiers' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1056:1: ( (lv_Modifiers_0_0= 'Modifiers' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1057:1: (lv_Modifiers_0_0= 'Modifiers' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1057:1: (lv_Modifiers_0_0= 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1058:3: lv_Modifiers_0_0= 'Modifiers'
            {
            lv_Modifiers_0_0=(Token)match(input,36,FOLLOW_36_in_ruleModifierField2138); 

                    newLeafNode(lv_Modifiers_0_0, grammarAccess.getModifierFieldAccess().getModifiersModifiersKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModifierFieldRule());
            	        }
                   		setWithLastConsumed(current, "Modifiers", lv_Modifiers_0_0, "Modifiers");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifierField"


    // $ANTLR start "entryRuleTimeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1079:1: entryRuleTimeField returns [EObject current=null] : iv_ruleTimeField= ruleTimeField EOF ;
    public final EObject entryRuleTimeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1080:2: (iv_ruleTimeField= ruleTimeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1081:2: iv_ruleTimeField= ruleTimeField EOF
            {
             newCompositeNode(grammarAccess.getTimeFieldRule()); 
            pushFollow(FOLLOW_ruleTimeField_in_entryRuleTimeField2186);
            iv_ruleTimeField=ruleTimeField();

            state._fsp--;

             current =iv_ruleTimeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeField2196); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeField"


    // $ANTLR start "ruleTimeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1088:1: ruleTimeField returns [EObject current=null] : ( (lv_Timestamp_0_0= 'Timestamp' ) ) ;
    public final EObject ruleTimeField() throws RecognitionException {
        EObject current = null;

        Token lv_Timestamp_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1091:28: ( ( (lv_Timestamp_0_0= 'Timestamp' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1092:1: ( (lv_Timestamp_0_0= 'Timestamp' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1092:1: ( (lv_Timestamp_0_0= 'Timestamp' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1093:1: (lv_Timestamp_0_0= 'Timestamp' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1093:1: (lv_Timestamp_0_0= 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1094:3: lv_Timestamp_0_0= 'Timestamp'
            {
            lv_Timestamp_0_0=(Token)match(input,37,FOLLOW_37_in_ruleTimeField2238); 

                    newLeafNode(lv_Timestamp_0_0, grammarAccess.getTimeFieldAccess().getTimestampTimestampKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeFieldRule());
            	        }
                   		setWithLastConsumed(current, "Timestamp", lv_Timestamp_0_0, "Timestamp");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeField"


    // $ANTLR start "entryRuleDocumentTypeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1115:1: entryRuleDocumentTypeField returns [EObject current=null] : iv_ruleDocumentTypeField= ruleDocumentTypeField EOF ;
    public final EObject entryRuleDocumentTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentTypeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1116:2: (iv_ruleDocumentTypeField= ruleDocumentTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1117:2: iv_ruleDocumentTypeField= ruleDocumentTypeField EOF
            {
             newCompositeNode(grammarAccess.getDocumentTypeFieldRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField2286);
            iv_ruleDocumentTypeField=ruleDocumentTypeField();

            state._fsp--;

             current =iv_ruleDocumentTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeField2296); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentTypeField"


    // $ANTLR start "ruleDocumentTypeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1124:1: ruleDocumentTypeField returns [EObject current=null] : ( (lv_Type_0_0= 'Type' ) ) ;
    public final EObject ruleDocumentTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_Type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1127:28: ( ( (lv_Type_0_0= 'Type' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1128:1: ( (lv_Type_0_0= 'Type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1128:1: ( (lv_Type_0_0= 'Type' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1129:1: (lv_Type_0_0= 'Type' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1129:1: (lv_Type_0_0= 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1130:3: lv_Type_0_0= 'Type'
            {
            lv_Type_0_0=(Token)match(input,38,FOLLOW_38_in_ruleDocumentTypeField2338); 

                    newLeafNode(lv_Type_0_0, grammarAccess.getDocumentTypeFieldAccess().getTypeTypeKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDocumentTypeFieldRule());
            	        }
                   		setWithLastConsumed(current, "Type", lv_Type_0_0, "Type");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentTypeField"


    // $ANTLR start "entryRuleProjectNameField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1151:1: entryRuleProjectNameField returns [EObject current=null] : iv_ruleProjectNameField= ruleProjectNameField EOF ;
    public final EObject entryRuleProjectNameField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectNameField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1152:2: (iv_ruleProjectNameField= ruleProjectNameField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1153:2: iv_ruleProjectNameField= ruleProjectNameField EOF
            {
             newCompositeNode(grammarAccess.getProjectNameFieldRule()); 
            pushFollow(FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField2386);
            iv_ruleProjectNameField=ruleProjectNameField();

            state._fsp--;

             current =iv_ruleProjectNameField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameField2396); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjectNameField"


    // $ANTLR start "ruleProjectNameField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1160:1: ruleProjectNameField returns [EObject current=null] : ( (lv_ProjectName_0_0= 'ProjectName' ) ) ;
    public final EObject ruleProjectNameField() throws RecognitionException {
        EObject current = null;

        Token lv_ProjectName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1163:28: ( ( (lv_ProjectName_0_0= 'ProjectName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1164:1: ( (lv_ProjectName_0_0= 'ProjectName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1164:1: ( (lv_ProjectName_0_0= 'ProjectName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1165:1: (lv_ProjectName_0_0= 'ProjectName' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1165:1: (lv_ProjectName_0_0= 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1166:3: lv_ProjectName_0_0= 'ProjectName'
            {
            lv_ProjectName_0_0=(Token)match(input,39,FOLLOW_39_in_ruleProjectNameField2438); 

                    newLeafNode(lv_ProjectName_0_0, grammarAccess.getProjectNameFieldAccess().getProjectNameProjectNameKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectNameFieldRule());
            	        }
                   		setWithLastConsumed(current, "ProjectName", lv_ProjectName_0_0, "ProjectName");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectNameField"


    // $ANTLR start "entryRuleAnnotationField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1187:1: entryRuleAnnotationField returns [EObject current=null] : iv_ruleAnnotationField= ruleAnnotationField EOF ;
    public final EObject entryRuleAnnotationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1188:2: (iv_ruleAnnotationField= ruleAnnotationField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1189:2: iv_ruleAnnotationField= ruleAnnotationField EOF
            {
             newCompositeNode(grammarAccess.getAnnotationFieldRule()); 
            pushFollow(FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField2486);
            iv_ruleAnnotationField=ruleAnnotationField();

            state._fsp--;

             current =iv_ruleAnnotationField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationField2496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationField"


    // $ANTLR start "ruleAnnotationField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1196:1: ruleAnnotationField returns [EObject current=null] : ( (lv_Annotations_0_0= 'Annotations' ) ) ;
    public final EObject ruleAnnotationField() throws RecognitionException {
        EObject current = null;

        Token lv_Annotations_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1199:28: ( ( (lv_Annotations_0_0= 'Annotations' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1200:1: ( (lv_Annotations_0_0= 'Annotations' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1200:1: ( (lv_Annotations_0_0= 'Annotations' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1201:1: (lv_Annotations_0_0= 'Annotations' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1201:1: (lv_Annotations_0_0= 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1202:3: lv_Annotations_0_0= 'Annotations'
            {
            lv_Annotations_0_0=(Token)match(input,40,FOLLOW_40_in_ruleAnnotationField2538); 

                    newLeafNode(lv_Annotations_0_0, grammarAccess.getAnnotationFieldAccess().getAnnotationsAnnotationsKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationFieldRule());
            	        }
                   		setWithLastConsumed(current, "Annotations", lv_Annotations_0_0, "Annotations");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationField"


    // $ANTLR start "entryRuleSimpleField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1223:1: entryRuleSimpleField returns [EObject current=null] : iv_ruleSimpleField= ruleSimpleField EOF ;
    public final EObject entryRuleSimpleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1224:2: (iv_ruleSimpleField= ruleSimpleField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1225:2: iv_ruleSimpleField= ruleSimpleField EOF
            {
             newCompositeNode(grammarAccess.getSimpleFieldRule()); 
            pushFollow(FOLLOW_ruleSimpleField_in_entryRuleSimpleField2586);
            iv_ruleSimpleField=ruleSimpleField();

            state._fsp--;

             current =iv_ruleSimpleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleField2596); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleField"


    // $ANTLR start "ruleSimpleField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1232:1: ruleSimpleField returns [EObject current=null] : ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) ) | ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) ) | ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_8_0= 'FullText' ) ) | ( (lv_FieldsRead_9_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) ) ) ;
    public final EObject ruleSimpleField() throws RecognitionException {
        EObject current = null;

        Token lv_FullyQualifiedName_0_0=null;
        Token lv_FriendlyName_1_0=null;
        Token lv_DeclaredMethods_2_0=null;
        Token lv_ReturnVariableEexpressions_3_0=null;
        Token lv_AllDeclaredMethodNames_4_0=null;
        Token lv_DeclaredMethodNames_5_0=null;
        Token lv_DeclaredFieldNames_6_0=null;
        Token lv_AllDeclaredFieldNames_7_0=null;
        Token lv_FullText_8_0=null;
        Token lv_FieldsRead_9_0=null;
        Token lv_FieldsWritten_10_0=null;
        Token lv_UsedFieldsInFinally_11_0=null;
        Token lv_UsedFieldsInTry_12_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1235:28: ( ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) ) | ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) ) | ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_8_0= 'FullText' ) ) | ( (lv_FieldsRead_9_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1236:1: ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) ) | ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) ) | ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_8_0= 'FullText' ) ) | ( (lv_FieldsRead_9_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1236:1: ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) ) | ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) ) | ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_8_0= 'FullText' ) ) | ( (lv_FieldsRead_9_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) ) )
            int alt9=13;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt9=1;
                }
                break;
            case 42:
                {
                alt9=2;
                }
                break;
            case 43:
                {
                alt9=3;
                }
                break;
            case 44:
                {
                alt9=4;
                }
                break;
            case 45:
                {
                alt9=5;
                }
                break;
            case 46:
                {
                alt9=6;
                }
                break;
            case 47:
                {
                alt9=7;
                }
                break;
            case 48:
                {
                alt9=8;
                }
                break;
            case 49:
                {
                alt9=9;
                }
                break;
            case 50:
                {
                alt9=10;
                }
                break;
            case 51:
                {
                alt9=11;
                }
                break;
            case 52:
                {
                alt9=12;
                }
                break;
            case 53:
                {
                alt9=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1236:2: ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1236:2: ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1237:1: (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1237:1: (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1238:3: lv_FullyQualifiedName_0_0= 'FullyQualifiedName'
                    {
                    lv_FullyQualifiedName_0_0=(Token)match(input,41,FOLLOW_41_in_ruleSimpleField2639); 

                            newLeafNode(lv_FullyQualifiedName_0_0, grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "FullyQualifiedName", lv_FullyQualifiedName_0_0, "FullyQualifiedName");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1252:6: ( (lv_FriendlyName_1_0= 'FriendlyName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1252:6: ( (lv_FriendlyName_1_0= 'FriendlyName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1253:1: (lv_FriendlyName_1_0= 'FriendlyName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1253:1: (lv_FriendlyName_1_0= 'FriendlyName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1254:3: lv_FriendlyName_1_0= 'FriendlyName'
                    {
                    lv_FriendlyName_1_0=(Token)match(input,42,FOLLOW_42_in_ruleSimpleField2676); 

                            newLeafNode(lv_FriendlyName_1_0, grammarAccess.getSimpleFieldAccess().getFriendlyNameFriendlyNameKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "FriendlyName", lv_FriendlyName_1_0, "FriendlyName");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1268:6: ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1268:6: ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1269:1: (lv_DeclaredMethods_2_0= 'DeclaredMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1269:1: (lv_DeclaredMethods_2_0= 'DeclaredMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1270:3: lv_DeclaredMethods_2_0= 'DeclaredMethods'
                    {
                    lv_DeclaredMethods_2_0=(Token)match(input,43,FOLLOW_43_in_ruleSimpleField2713); 

                            newLeafNode(lv_DeclaredMethods_2_0, grammarAccess.getSimpleFieldAccess().getDeclaredMethodsDeclaredMethodsKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredMethods", lv_DeclaredMethods_2_0, "DeclaredMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1284:6: ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1284:6: ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1285:1: (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1285:1: (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1286:3: lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions'
                    {
                    lv_ReturnVariableEexpressions_3_0=(Token)match(input,44,FOLLOW_44_in_ruleSimpleField2750); 

                            newLeafNode(lv_ReturnVariableEexpressions_3_0, grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "ReturnVariableEexpressions", lv_ReturnVariableEexpressions_3_0, "ReturnVariableEexpressions");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1300:6: ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1300:6: ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1301:1: (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1301:1: (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1302:3: lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames'
                    {
                    lv_AllDeclaredMethodNames_4_0=(Token)match(input,45,FOLLOW_45_in_ruleSimpleField2787); 

                            newLeafNode(lv_AllDeclaredMethodNames_4_0, grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "AllDeclaredMethodNames", lv_AllDeclaredMethodNames_4_0, "AllDeclaredMethodNames");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1316:6: ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1316:6: ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1317:1: (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1317:1: (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1318:3: lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames'
                    {
                    lv_DeclaredMethodNames_5_0=(Token)match(input,46,FOLLOW_46_in_ruleSimpleField2824); 

                            newLeafNode(lv_DeclaredMethodNames_5_0, grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredMethodNames", lv_DeclaredMethodNames_5_0, "DeclaredMethodNames");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1332:6: ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1332:6: ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1333:1: (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1333:1: (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1334:3: lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames'
                    {
                    lv_DeclaredFieldNames_6_0=(Token)match(input,47,FOLLOW_47_in_ruleSimpleField2861); 

                            newLeafNode(lv_DeclaredFieldNames_6_0, grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredFieldNames", lv_DeclaredFieldNames_6_0, "DeclaredFieldNames");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1348:6: ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1348:6: ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1349:1: (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1349:1: (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1350:3: lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames'
                    {
                    lv_AllDeclaredFieldNames_7_0=(Token)match(input,48,FOLLOW_48_in_ruleSimpleField2898); 

                            newLeafNode(lv_AllDeclaredFieldNames_7_0, grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "AllDeclaredFieldNames", lv_AllDeclaredFieldNames_7_0, "AllDeclaredFieldNames");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1364:6: ( (lv_FullText_8_0= 'FullText' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1364:6: ( (lv_FullText_8_0= 'FullText' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1365:1: (lv_FullText_8_0= 'FullText' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1365:1: (lv_FullText_8_0= 'FullText' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1366:3: lv_FullText_8_0= 'FullText'
                    {
                    lv_FullText_8_0=(Token)match(input,49,FOLLOW_49_in_ruleSimpleField2935); 

                            newLeafNode(lv_FullText_8_0, grammarAccess.getSimpleFieldAccess().getFullTextFullTextKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "FullText", lv_FullText_8_0, "FullText");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1380:6: ( (lv_FieldsRead_9_0= 'FieldsRead' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1380:6: ( (lv_FieldsRead_9_0= 'FieldsRead' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1381:1: (lv_FieldsRead_9_0= 'FieldsRead' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1381:1: (lv_FieldsRead_9_0= 'FieldsRead' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1382:3: lv_FieldsRead_9_0= 'FieldsRead'
                    {
                    lv_FieldsRead_9_0=(Token)match(input,50,FOLLOW_50_in_ruleSimpleField2972); 

                            newLeafNode(lv_FieldsRead_9_0, grammarAccess.getSimpleFieldAccess().getFieldsReadFieldsReadKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "FieldsRead", lv_FieldsRead_9_0, "FieldsRead");
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1396:6: ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1396:6: ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1397:1: (lv_FieldsWritten_10_0= 'FieldsWritten' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1397:1: (lv_FieldsWritten_10_0= 'FieldsWritten' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1398:3: lv_FieldsWritten_10_0= 'FieldsWritten'
                    {
                    lv_FieldsWritten_10_0=(Token)match(input,51,FOLLOW_51_in_ruleSimpleField3009); 

                            newLeafNode(lv_FieldsWritten_10_0, grammarAccess.getSimpleFieldAccess().getFieldsWrittenFieldsWrittenKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "FieldsWritten", lv_FieldsWritten_10_0, "FieldsWritten");
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1412:6: ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1412:6: ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1413:1: (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1413:1: (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1414:3: lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally'
                    {
                    lv_UsedFieldsInFinally_11_0=(Token)match(input,52,FOLLOW_52_in_ruleSimpleField3046); 

                            newLeafNode(lv_UsedFieldsInFinally_11_0, grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "UsedFieldsInFinally", lv_UsedFieldsInFinally_11_0, "UsedFieldsInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1428:6: ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1428:6: ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1429:1: (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1429:1: (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1430:3: lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry'
                    {
                    lv_UsedFieldsInTry_12_0=(Token)match(input,53,FOLLOW_53_in_ruleSimpleField3083); 

                            newLeafNode(lv_UsedFieldsInTry_12_0, grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "UsedFieldsInTry", lv_UsedFieldsInTry_12_0, "UsedFieldsInTry");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleField"


    // $ANTLR start "entryRuleSimpleFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1451:1: entryRuleSimpleFieldValue returns [String current=null] : iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF ;
    public final String entryRuleSimpleFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1452:2: (iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1453:2: iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleFieldValueRule()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue3133);
            iv_ruleSimpleFieldValue=ruleSimpleFieldValue();

            state._fsp--;

             current =iv_ruleSimpleFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldValue3144); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleFieldValue"


    // $ANTLR start "ruleSimpleFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1460:1: ruleSimpleFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleSimpleFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1463:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1464:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue3183); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getSimpleFieldValueAccess().getNameWithWCTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleFieldValue"


    // $ANTLR start "entryRuleMethodFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1479:1: entryRuleMethodFieldValue returns [String current=null] : iv_ruleMethodFieldValue= ruleMethodFieldValue EOF ;
    public final String entryRuleMethodFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1480:2: (iv_ruleMethodFieldValue= ruleMethodFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1481:2: iv_ruleMethodFieldValue= ruleMethodFieldValue EOF
            {
             newCompositeNode(grammarAccess.getMethodFieldValueRule()); 
            pushFollow(FOLLOW_ruleMethodFieldValue_in_entryRuleMethodFieldValue3228);
            iv_ruleMethodFieldValue=ruleMethodFieldValue();

            state._fsp--;

             current =iv_ruleMethodFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodFieldValue3239); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodFieldValue"


    // $ANTLR start "ruleMethodFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1488:1: ruleMethodFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleMethodFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1491:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1492:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethodFieldValue3278); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getMethodFieldValueAccess().getNameWithWCTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodFieldValue"


    // $ANTLR start "entryRuleProjectNameFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1507:1: entryRuleProjectNameFieldValue returns [String current=null] : iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF ;
    public final String entryRuleProjectNameFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProjectNameFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1508:2: (iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1509:2: iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF
            {
             newCompositeNode(grammarAccess.getProjectNameFieldValueRule()); 
            pushFollow(FOLLOW_ruleProjectNameFieldValue_in_entryRuleProjectNameFieldValue3323);
            iv_ruleProjectNameFieldValue=ruleProjectNameFieldValue();

            state._fsp--;

             current =iv_ruleProjectNameFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameFieldValue3334); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjectNameFieldValue"


    // $ANTLR start "ruleProjectNameFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1516:1: ruleProjectNameFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleProjectNameFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1519:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1520:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleProjectNameFieldValue3373); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getProjectNameFieldValueAccess().getNameWithWCTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectNameFieldValue"


    // $ANTLR start "entryRuleNumberFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1535:1: entryRuleNumberFieldValue returns [String current=null] : iv_ruleNumberFieldValue= ruleNumberFieldValue EOF ;
    public final String entryRuleNumberFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1536:2: (iv_ruleNumberFieldValue= ruleNumberFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1537:2: iv_ruleNumberFieldValue= ruleNumberFieldValue EOF
            {
             newCompositeNode(grammarAccess.getNumberFieldValueRule()); 
            pushFollow(FOLLOW_ruleNumberFieldValue_in_entryRuleNumberFieldValue3418);
            iv_ruleNumberFieldValue=ruleNumberFieldValue();

            state._fsp--;

             current =iv_ruleNumberFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFieldValue3429); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberFieldValue"


    // $ANTLR start "ruleNumberFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1544:1: ruleNumberFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumberFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1547:28: (this_INT_0= RULE_INT )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1548:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberFieldValue3468); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getNumberFieldValueAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberFieldValue"


    // $ANTLR start "entryRuleModifierFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1563:1: entryRuleModifierFieldValue returns [String current=null] : iv_ruleModifierFieldValue= ruleModifierFieldValue EOF ;
    public final String entryRuleModifierFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifierFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1564:2: (iv_ruleModifierFieldValue= ruleModifierFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1565:2: iv_ruleModifierFieldValue= ruleModifierFieldValue EOF
            {
             newCompositeNode(grammarAccess.getModifierFieldValueRule()); 
            pushFollow(FOLLOW_ruleModifierFieldValue_in_entryRuleModifierFieldValue3513);
            iv_ruleModifierFieldValue=ruleModifierFieldValue();

            state._fsp--;

             current =iv_ruleModifierFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierFieldValue3524); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifierFieldValue"


    // $ANTLR start "ruleModifierFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1572:1: ruleModifierFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleModifierFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1575:28: ( (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1576:1: (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1576:1: (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt10=1;
                }
                break;
            case 55:
                {
                alt10=2;
                }
                break;
            case 56:
                {
                alt10=3;
                }
                break;
            case 57:
                {
                alt10=4;
                }
                break;
            case 58:
                {
                alt10=5;
                }
                break;
            case 59:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1577:2: kw= 'private'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleModifierFieldValue3562); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1584:2: kw= 'public'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleModifierFieldValue3581); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getPublicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1591:2: kw= 'static'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleModifierFieldValue3600); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getStaticKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1598:2: kw= 'final'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleModifierFieldValue3619); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getFinalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1605:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleModifierFieldValue3638); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getAbstractKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1612:2: kw= 'protected'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleModifierFieldValue3657); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getProtectedKeyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifierFieldValue"


    // $ANTLR start "entryRuleTimeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1625:1: entryRuleTimeFieldValue returns [String current=null] : iv_ruleTimeFieldValue= ruleTimeFieldValue EOF ;
    public final String entryRuleTimeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1626:2: (iv_ruleTimeFieldValue= ruleTimeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1627:2: iv_ruleTimeFieldValue= ruleTimeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getTimeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTimeFieldValue_in_entryRuleTimeFieldValue3698);
            iv_ruleTimeFieldValue=ruleTimeFieldValue();

            state._fsp--;

             current =iv_ruleTimeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeFieldValue3709); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeFieldValue"


    // $ANTLR start "ruleTimeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1634:1: ruleTimeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleTimeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1637:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1638:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleTimeFieldValue3748); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getTimeFieldValueAccess().getNameWithWCTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeFieldValue"


    // $ANTLR start "entryRuleDocumentTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1653:1: entryRuleDocumentTypeFieldValue returns [String current=null] : iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF ;
    public final String entryRuleDocumentTypeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDocumentTypeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1654:2: (iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1655:2: iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getDocumentTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_entryRuleDocumentTypeFieldValue3793);
            iv_ruleDocumentTypeFieldValue=ruleDocumentTypeFieldValue();

            state._fsp--;

             current =iv_ruleDocumentTypeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeFieldValue3804); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentTypeFieldValue"


    // $ANTLR start "ruleDocumentTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1662:1: ruleDocumentTypeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' ) ;
    public final AntlrDatatypeRuleToken ruleDocumentTypeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1665:28: ( (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1666:1: (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1666:1: (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt11=1;
                }
                break;
            case 61:
                {
                alt11=2;
                }
                break;
            case 62:
                {
                alt11=3;
                }
                break;
            case 63:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1667:2: kw= 'class'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleDocumentTypeFieldValue3842); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getClassKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1674:2: kw= 'method'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleDocumentTypeFieldValue3861); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getMethodKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1681:2: kw= 'field'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleDocumentTypeFieldValue3880); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getFieldKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1688:2: kw= 'trycatch'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleDocumentTypeFieldValue3899); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getTrycatchKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentTypeFieldValue"


    // $ANTLR start "entryRuleAnnotationFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1701:1: entryRuleAnnotationFieldValue returns [String current=null] : iv_ruleAnnotationFieldValue= ruleAnnotationFieldValue EOF ;
    public final String entryRuleAnnotationFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1702:2: (iv_ruleAnnotationFieldValue= ruleAnnotationFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1703:2: iv_ruleAnnotationFieldValue= ruleAnnotationFieldValue EOF
            {
             newCompositeNode(grammarAccess.getAnnotationFieldValueRule()); 
            pushFollow(FOLLOW_ruleAnnotationFieldValue_in_entryRuleAnnotationFieldValue3940);
            iv_ruleAnnotationFieldValue=ruleAnnotationFieldValue();

            state._fsp--;

             current =iv_ruleAnnotationFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationFieldValue3951); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationFieldValue"


    // $ANTLR start "ruleAnnotationFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1710:1: ruleAnnotationFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleAnnotationFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1713:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1714:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleAnnotationFieldValue3990); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getAnnotationFieldValueAccess().getNameWithWCTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationFieldValue"


    // $ANTLR start "entryRuleTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1729:1: entryRuleTypeFieldValue returns [String current=null] : iv_ruleTypeFieldValue= ruleTypeFieldValue EOF ;
    public final String entryRuleTypeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1730:2: (iv_ruleTypeFieldValue= ruleTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1731:2: iv_ruleTypeFieldValue= ruleTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue4035);
            iv_ruleTypeFieldValue=ruleTypeFieldValue();

            state._fsp--;

             current =iv_ruleTypeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldValue4046); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeFieldValue"


    // $ANTLR start "ruleTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1738:1: ruleTypeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleTypeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1741:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1742:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue4085); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getTypeFieldValueAccess().getNameWithWCTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeFieldValue"


    // $ANTLR start "entryRuleFilePathFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1757:1: entryRuleFilePathFieldValue returns [String current=null] : iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF ;
    public final String entryRuleFilePathFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePathFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1758:2: (iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1759:2: iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF
            {
             newCompositeNode(grammarAccess.getFilePathFieldValueRule()); 
            pushFollow(FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue4130);
            iv_ruleFilePathFieldValue=ruleFilePathFieldValue();

            state._fsp--;

             current =iv_ruleFilePathFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathFieldValue4141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilePathFieldValue"


    // $ANTLR start "ruleFilePathFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1766:1: ruleFilePathFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PathWithWC_0= RULE_PATHWITHWC ;
    public final AntlrDatatypeRuleToken ruleFilePathFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PathWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1769:28: (this_PathWithWC_0= RULE_PATHWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1770:5: this_PathWithWC_0= RULE_PATHWITHWC
            {
            this_PathWithWC_0=(Token)match(input,RULE_PATHWITHWC,FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue4180); 

            		current.merge(this_PathWithWC_0);
                
             
                newLeafNode(this_PathWithWC_0, grammarAccess.getFilePathFieldValueAccess().getPathWithWCTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilePathFieldValue"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1785:1: entryRuleUnaryExpression returns [String current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final String entryRuleUnaryExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryExpression = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1786:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1787:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4225);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression4236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1794:1: ruleUnaryExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1797:28: ( (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1798:1: (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1798:1: (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt12=1;
                }
                break;
            case 65:
                {
                alt12=2;
                }
                break;
            case 66:
                {
                alt12=3;
                }
                break;
            case 67:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1799:2: kw= '-'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleUnaryExpression4274); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1806:2: kw= 'NOT'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleUnaryExpression4293); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getNOTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1813:2: kw= '!'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleUnaryExpression4312); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1820:2: kw= '+'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleUnaryExpression4331); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getPlusSignKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "ruleBinaryExp"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1833:1: ruleBinaryExp returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBinaryExp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1835:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1836:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1836:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==68) ) {
                alt13=1;
            }
            else if ( (LA13_0==69) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1836:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1836:2: (enumLiteral_0= 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1836:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleBinaryExp4385); 

                            current = grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1842:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1842:6: (enumLiteral_1= 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1842:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleBinaryExp4402); 

                            current = grammarAccess.getBinaryExpAccess().getOr1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryExpAccess().getOr1EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExp1_in_entryRuleExp175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_ruleExp1132 = new BitSet(new long[]{0x003FFFFFFFFF2002L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleBinaryExp_in_ruleExp1162 = new BitSet(new long[]{0x003FFFFFFFFF2000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleExp1_in_ruleExp1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_entryRuleExp2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_ruleExp2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleExp2302 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExp2315 = new BitSet(new long[]{0x003FFFFFFFFF2000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleExp1_in_ruleExp2337 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExp2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClauseExpression395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression437 = new BitSet(new long[]{0x003FFFFFFFFF0000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleSimpleField_in_ruleClauseExpression461 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_ruleClauseExpression523 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_ruleClauseExpression585 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_ruleClauseExpression647 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression659 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_ruleClauseExpression709 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_ruleClauseExpression771 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression783 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_ruleClauseExpression833 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_ruleClauseExpression866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_ruleClauseExpression895 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression907 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_ruleClauseExpression957 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_ruleClauseExpression1019 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression1031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_ruleClauseExpression1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_entryRuleTypeField1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeField1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTypeField1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTypeField1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTypeField1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTypeField1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTypeField1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTypeField1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTypeField1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTypeField1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTypeField1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTypeField1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeField1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTypeField1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTypeField1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTypeField1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_entryRuleMethodField1673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodField1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMethodField1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMethodField1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMethodField1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMethodField1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_entryRuleFilePathField1886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathField1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFilePathField1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_entryRuleNumberField1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberField1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNumberField2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_entryRuleModifierField2086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierField2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleModifierField2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_entryRuleTimeField2186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeField2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTimeField2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeField2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDocumentTypeField2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField2386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameField2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleProjectNameField2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField2486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationField2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAnnotationField2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_entryRuleSimpleField2586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleField2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSimpleField2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSimpleField2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSimpleField2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSimpleField2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSimpleField2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSimpleField2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSimpleField2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSimpleField2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSimpleField2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSimpleField2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSimpleField3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSimpleField3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSimpleField3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue3133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldValue3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_entryRuleMethodFieldValue3228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodFieldValue3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethodFieldValue3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_entryRuleProjectNameFieldValue3323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameFieldValue3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleProjectNameFieldValue3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_entryRuleNumberFieldValue3418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFieldValue3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberFieldValue3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_entryRuleModifierFieldValue3513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierFieldValue3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleModifierFieldValue3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleModifierFieldValue3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleModifierFieldValue3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleModifierFieldValue3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleModifierFieldValue3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleModifierFieldValue3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_entryRuleTimeFieldValue3698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeFieldValue3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleTimeFieldValue3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_entryRuleDocumentTypeFieldValue3793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeFieldValue3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDocumentTypeFieldValue3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDocumentTypeFieldValue3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDocumentTypeFieldValue3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDocumentTypeFieldValue3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_entryRuleAnnotationFieldValue3940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationFieldValue3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleAnnotationFieldValue3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue4035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldValue4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue4130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathFieldValue4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleUnaryExpression4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleUnaryExpression4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleUnaryExpression4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleUnaryExpression4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBinaryExp4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBinaryExp4402 = new BitSet(new long[]{0x0000000000000002L});

}