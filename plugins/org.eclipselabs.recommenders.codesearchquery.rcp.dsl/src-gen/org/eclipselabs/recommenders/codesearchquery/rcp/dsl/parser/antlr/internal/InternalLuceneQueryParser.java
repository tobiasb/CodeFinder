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

            if ( (LA2_0==RULE_NAMEWITHWC||LA2_0==13||(LA2_0>=16 && LA2_0<=53)||(LA2_0>=64 && LA2_0<=69)) ) {
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

                if ( (LA4_1==RULE_NAMEWITHWC||(LA4_1>=16 && LA4_1<=53)) ) {
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

                if ( (LA4_2==RULE_NAMEWITHWC||(LA4_2>=16 && LA4_2<=53)) ) {
                    alt4=1;
                }
                else if ( (LA4_2==13) ) {
                    alt4=2;
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

                if ( (LA4_3==13) ) {
                    alt4=2;
                }
                else if ( (LA4_3==RULE_NAMEWITHWC||(LA4_3>=16 && LA4_3<=53)) ) {
                    alt4=1;
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

                if ( (LA4_4==RULE_NAMEWITHWC||(LA4_4>=16 && LA4_4<=53)) ) {
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
            case RULE_NAMEWITHWC:
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:214:1: ruleClauseExpression returns [EObject current=null] : ( ( ruleUnaryExpression )? ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) | ( ( ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) ) ) ) ) ) ;
    public final EObject ruleClauseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_27=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_default_1_0 = null;

        EObject lv_field_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_field_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;

        EObject lv_field_8_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        EObject lv_field_11_0 = null;

        AntlrDatatypeRuleToken lv_value_13_0 = null;

        EObject lv_field_14_0 = null;

        AntlrDatatypeRuleToken lv_value_16_0 = null;

        EObject lv_field_17_0 = null;

        AntlrDatatypeRuleToken lv_value_19_0 = null;

        EObject lv_field_20_0 = null;

        AntlrDatatypeRuleToken lv_value_22_0 = null;

        EObject lv_field_23_0 = null;

        AntlrDatatypeRuleToken lv_value_25_0 = null;

        EObject lv_field_26_0 = null;

        AntlrDatatypeRuleToken lv_value_28_0 = null;

        EObject lv_field_29_0 = null;

        AntlrDatatypeRuleToken lv_value_31_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:217:28: ( ( ( ruleUnaryExpression )? ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) | ( ( ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) ) ) ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:218:1: ( ( ruleUnaryExpression )? ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) | ( ( ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) ) ) ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:218:1: ( ( ruleUnaryExpression )? ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) | ( ( ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) ) ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:218:2: ( ruleUnaryExpression )? ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) | ( ( ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) ) ) ) )
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

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:226:3: ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) | ( ( ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NAMEWITHWC) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=16 && LA7_0<=53)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:226:4: ( (lv_default_1_0= ruleSimpleFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:226:4: ( (lv_default_1_0= ruleSimpleFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:227:1: (lv_default_1_0= ruleSimpleFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:227:1: (lv_default_1_0= ruleSimpleFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:228:3: lv_default_1_0= ruleSimpleFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getDefaultSimpleFieldValueParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression460);
                    lv_default_1_0=ruleSimpleFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_1_0, 
                            		"SimpleFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:245:6: ( ( ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:245:6: ( ( ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) ) ) | ( ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) ) ) | ( ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) ) ) | ( ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) ) ) | ( ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) ) ) | ( ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) ) ) | ( ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) ) ) | ( ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) ) ) | ( ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) ) ) | ( ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) ) ) )
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
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:245:7: ( ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:245:7: ( ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:245:8: ( (lv_field_2_0= ruleSimpleField ) ) otherlv_3= ':' ( (lv_value_4_0= ruleSimpleFieldValue ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:245:8: ( (lv_field_2_0= ruleSimpleField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:246:1: (lv_field_2_0= ruleSimpleField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:246:1: (lv_field_2_0= ruleSimpleField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:247:3: lv_field_2_0= ruleSimpleField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldSimpleFieldParserRuleCall_1_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleField_in_ruleClauseExpression489);
                            lv_field_2_0=ruleSimpleField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_2_0, 
                                    		"SimpleField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression501); 

                                	newLeafNode(otherlv_3, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_0_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:267:1: ( (lv_value_4_0= ruleSimpleFieldValue ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:268:1: (lv_value_4_0= ruleSimpleFieldValue )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:268:1: (lv_value_4_0= ruleSimpleFieldValue )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:269:3: lv_value_4_0= ruleSimpleFieldValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueSimpleFieldValueParserRuleCall_1_1_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression522);
                            lv_value_4_0=ruleSimpleFieldValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_4_0, 
                                    		"SimpleFieldValue");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:286:6: ( ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:286:6: ( ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:286:7: ( (lv_field_5_0= ruleTypeField ) ) otherlv_6= ':' ( (lv_value_7_0= ruleTypeFieldValue ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:286:7: ( (lv_field_5_0= ruleTypeField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:287:1: (lv_field_5_0= ruleTypeField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:287:1: (lv_field_5_0= ruleTypeField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:288:3: lv_field_5_0= ruleTypeField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldTypeFieldParserRuleCall_1_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeField_in_ruleClauseExpression551);
                            lv_field_5_0=ruleTypeField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_5_0, 
                                    		"TypeField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression563); 

                                	newLeafNode(otherlv_6, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_1_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:308:1: ( (lv_value_7_0= ruleTypeFieldValue ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:309:1: (lv_value_7_0= ruleTypeFieldValue )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:309:1: (lv_value_7_0= ruleTypeFieldValue )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:310:3: lv_value_7_0= ruleTypeFieldValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueTypeFieldValueParserRuleCall_1_1_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression584);
                            lv_value_7_0=ruleTypeFieldValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_7_0, 
                                    		"TypeFieldValue");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:327:6: ( ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:327:6: ( ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:327:7: ( (lv_field_8_0= ruleMethodField ) ) otherlv_9= ':' ( (lv_value_10_0= ruleMethodFieldValue ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:327:7: ( (lv_field_8_0= ruleMethodField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:328:1: (lv_field_8_0= ruleMethodField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:328:1: (lv_field_8_0= ruleMethodField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:329:3: lv_field_8_0= ruleMethodField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldMethodFieldParserRuleCall_1_1_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMethodField_in_ruleClauseExpression613);
                            lv_field_8_0=ruleMethodField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_8_0, 
                                    		"MethodField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression625); 

                                	newLeafNode(otherlv_9, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_2_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:349:1: ( (lv_value_10_0= ruleMethodFieldValue ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:350:1: (lv_value_10_0= ruleMethodFieldValue )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:350:1: (lv_value_10_0= ruleMethodFieldValue )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:351:3: lv_value_10_0= ruleMethodFieldValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueMethodFieldValueParserRuleCall_1_1_2_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression646);
                            lv_value_10_0=ruleMethodFieldValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_10_0, 
                                    		"MethodFieldValue");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:368:6: ( ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:368:6: ( ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:368:7: ( (lv_field_11_0= ruleFilePathField ) ) otherlv_12= ':' ( (lv_value_13_0= ruleFilePathFieldValue ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:368:7: ( (lv_field_11_0= ruleFilePathField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:369:1: (lv_field_11_0= ruleFilePathField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:369:1: (lv_field_11_0= ruleFilePathField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:370:3: lv_field_11_0= ruleFilePathField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldFilePathFieldParserRuleCall_1_1_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFilePathField_in_ruleClauseExpression675);
                            lv_field_11_0=ruleFilePathField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_11_0, 
                                    		"FilePathField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression687); 

                                	newLeafNode(otherlv_12, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_3_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:390:1: ( (lv_value_13_0= ruleFilePathFieldValue ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:391:1: (lv_value_13_0= ruleFilePathFieldValue )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:391:1: (lv_value_13_0= ruleFilePathFieldValue )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:392:3: lv_value_13_0= ruleFilePathFieldValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueFilePathFieldValueParserRuleCall_1_1_3_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression708);
                            lv_value_13_0=ruleFilePathFieldValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_13_0, 
                                    		"FilePathFieldValue");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:409:6: ( ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:409:6: ( ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:409:7: ( (lv_field_14_0= ruleNumberField ) ) otherlv_15= ':' ( (lv_value_16_0= ruleNumberFieldValue ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:409:7: ( (lv_field_14_0= ruleNumberField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:410:1: (lv_field_14_0= ruleNumberField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:410:1: (lv_field_14_0= ruleNumberField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:411:3: lv_field_14_0= ruleNumberField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldNumberFieldParserRuleCall_1_1_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNumberField_in_ruleClauseExpression737);
                            lv_field_14_0=ruleNumberField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_14_0, 
                                    		"NumberField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression749); 

                                	newLeafNode(otherlv_15, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_4_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:431:1: ( (lv_value_16_0= ruleNumberFieldValue ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:432:1: (lv_value_16_0= ruleNumberFieldValue )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:432:1: (lv_value_16_0= ruleNumberFieldValue )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:433:3: lv_value_16_0= ruleNumberFieldValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueNumberFieldValueParserRuleCall_1_1_4_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression770);
                            lv_value_16_0=ruleNumberFieldValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_16_0, 
                                    		"NumberFieldValue");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:450:6: ( ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:450:6: ( ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:450:7: ( (lv_field_17_0= ruleModifierField ) ) otherlv_18= ':' ( (lv_value_19_0= ruleModifierFieldValue ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:450:7: ( (lv_field_17_0= ruleModifierField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:451:1: (lv_field_17_0= ruleModifierField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:451:1: (lv_field_17_0= ruleModifierField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:452:3: lv_field_17_0= ruleModifierField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldModifierFieldParserRuleCall_1_1_5_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleModifierField_in_ruleClauseExpression799);
                            lv_field_17_0=ruleModifierField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_17_0, 
                                    		"ModifierField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression811); 

                                	newLeafNode(otherlv_18, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_5_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:472:1: ( (lv_value_19_0= ruleModifierFieldValue ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:473:1: (lv_value_19_0= ruleModifierFieldValue )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:473:1: (lv_value_19_0= ruleModifierFieldValue )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:474:3: lv_value_19_0= ruleModifierFieldValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueModifierFieldValueParserRuleCall_1_1_5_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression832);
                            lv_value_19_0=ruleModifierFieldValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_19_0, 
                                    		"ModifierFieldValue");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 7 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:6: ( ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:6: ( ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:7: ( (lv_field_20_0= ruleTimeField ) ) otherlv_21= ':' ( (lv_value_22_0= ruleTimeFieldValue ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:7: ( (lv_field_20_0= ruleTimeField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:492:1: (lv_field_20_0= ruleTimeField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:492:1: (lv_field_20_0= ruleTimeField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:493:3: lv_field_20_0= ruleTimeField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldTimeFieldParserRuleCall_1_1_6_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTimeField_in_ruleClauseExpression861);
                            lv_field_20_0=ruleTimeField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_20_0, 
                                    		"TimeField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression873); 

                                	newLeafNode(otherlv_21, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_6_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:513:1: ( (lv_value_22_0= ruleTimeFieldValue ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:514:1: (lv_value_22_0= ruleTimeFieldValue )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:514:1: (lv_value_22_0= ruleTimeFieldValue )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:515:3: lv_value_22_0= ruleTimeFieldValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueTimeFieldValueParserRuleCall_1_1_6_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTimeFieldValue_in_ruleClauseExpression894);
                            lv_value_22_0=ruleTimeFieldValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_22_0, 
                                    		"TimeFieldValue");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 8 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:532:6: ( ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:532:6: ( ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:532:7: ( (lv_field_23_0= ruleDocumentTypeField ) ) otherlv_24= ':' ( (lv_value_25_0= ruleDocumentTypeFieldValue ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:532:7: ( (lv_field_23_0= ruleDocumentTypeField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:533:1: (lv_field_23_0= ruleDocumentTypeField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:533:1: (lv_field_23_0= ruleDocumentTypeField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:534:3: lv_field_23_0= ruleDocumentTypeField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldDocumentTypeFieldParserRuleCall_1_1_7_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDocumentTypeField_in_ruleClauseExpression923);
                            lv_field_23_0=ruleDocumentTypeField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_23_0, 
                                    		"DocumentTypeField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression935); 

                                	newLeafNode(otherlv_24, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_7_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:554:1: ( (lv_value_25_0= ruleDocumentTypeFieldValue ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:555:1: (lv_value_25_0= ruleDocumentTypeFieldValue )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:555:1: (lv_value_25_0= ruleDocumentTypeFieldValue )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:556:3: lv_value_25_0= ruleDocumentTypeFieldValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueDocumentTypeFieldValueParserRuleCall_1_1_7_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression956);
                            lv_value_25_0=ruleDocumentTypeFieldValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_25_0, 
                                    		"DocumentTypeFieldValue");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 9 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:573:6: ( ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:573:6: ( ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:573:7: ( (lv_field_26_0= ruleProjectNameField ) ) otherlv_27= ':' ( (lv_value_28_0= ruleProjectNameFieldValue ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:573:7: ( (lv_field_26_0= ruleProjectNameField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:574:1: (lv_field_26_0= ruleProjectNameField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:574:1: (lv_field_26_0= ruleProjectNameField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:575:3: lv_field_26_0= ruleProjectNameField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldProjectNameFieldParserRuleCall_1_1_8_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleProjectNameField_in_ruleClauseExpression985);
                            lv_field_26_0=ruleProjectNameField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_26_0, 
                                    		"ProjectNameField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression997); 

                                	newLeafNode(otherlv_27, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_8_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:595:1: ( (lv_value_28_0= ruleProjectNameFieldValue ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:596:1: (lv_value_28_0= ruleProjectNameFieldValue )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:596:1: (lv_value_28_0= ruleProjectNameFieldValue )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:597:3: lv_value_28_0= ruleProjectNameFieldValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueProjectNameFieldValueParserRuleCall_1_1_8_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression1018);
                            lv_value_28_0=ruleProjectNameFieldValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_28_0, 
                                    		"ProjectNameFieldValue");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 10 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:614:6: ( ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:614:6: ( ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:614:7: ( (lv_field_29_0= ruleAnnotationField ) ) otherlv_30= ':' ( (lv_value_31_0= ruleAnnotationFieldValue ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:614:7: ( (lv_field_29_0= ruleAnnotationField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:615:1: (lv_field_29_0= ruleAnnotationField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:615:1: (lv_field_29_0= ruleAnnotationField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:616:3: lv_field_29_0= ruleAnnotationField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldAnnotationFieldParserRuleCall_1_1_9_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAnnotationField_in_ruleClauseExpression1047);
                            lv_field_29_0=ruleAnnotationField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_29_0, 
                                    		"AnnotationField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_30=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression1059); 

                                	newLeafNode(otherlv_30, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_9_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:636:1: ( (lv_value_31_0= ruleAnnotationFieldValue ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:637:1: (lv_value_31_0= ruleAnnotationFieldValue )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:637:1: (lv_value_31_0= ruleAnnotationFieldValue )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:638:3: lv_value_31_0= ruleAnnotationFieldValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValueAnnotationFieldValueParserRuleCall_1_1_9_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAnnotationFieldValue_in_ruleClauseExpression1080);
                            lv_value_31_0=ruleAnnotationFieldValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_31_0, 
                                    		"AnnotationFieldValue");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:662:1: entryRuleTypeField returns [EObject current=null] : iv_ruleTypeField= ruleTypeField EOF ;
    public final EObject entryRuleTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:663:2: (iv_ruleTypeField= ruleTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:664:2: iv_ruleTypeField= ruleTypeField EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldRule()); 
            pushFollow(FOLLOW_ruleTypeField_in_entryRuleTypeField1119);
            iv_ruleTypeField=ruleTypeField();

            state._fsp--;

             current =iv_ruleTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeField1129); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:671:1: ruleTypeField returns [EObject current=null] : ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_DeclaringType_13_0= 'DeclaringType' ) ) ) ;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:674:28: ( ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_DeclaringType_13_0= 'DeclaringType' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:675:1: ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_DeclaringType_13_0= 'DeclaringType' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:675:1: ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_DeclaringType_13_0= 'DeclaringType' ) ) )
            int alt8=14;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            case 19:
                {
                alt8=4;
                }
                break;
            case 20:
                {
                alt8=5;
                }
                break;
            case 21:
                {
                alt8=6;
                }
                break;
            case 22:
                {
                alt8=7;
                }
                break;
            case 23:
                {
                alt8=8;
                }
                break;
            case 24:
                {
                alt8=9;
                }
                break;
            case 25:
                {
                alt8=10;
                }
                break;
            case 26:
                {
                alt8=11;
                }
                break;
            case 27:
                {
                alt8=12;
                }
                break;
            case 28:
                {
                alt8=13;
                }
                break;
            case 29:
                {
                alt8=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:675:2: ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:675:2: ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:676:1: (lv_ImplementedTypes_0_0= 'ImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:676:1: (lv_ImplementedTypes_0_0= 'ImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:677:3: lv_ImplementedTypes_0_0= 'ImplementedTypes'
                    {
                    lv_ImplementedTypes_0_0=(Token)match(input,16,FOLLOW_16_in_ruleTypeField1172); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:691:6: ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:691:6: ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:692:1: (lv_ExtendedTypes_1_0= 'ExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:692:1: (lv_ExtendedTypes_1_0= 'ExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:693:3: lv_ExtendedTypes_1_0= 'ExtendedTypes'
                    {
                    lv_ExtendedTypes_1_0=(Token)match(input,17,FOLLOW_17_in_ruleTypeField1209); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:707:6: ( (lv_UsedTypes_2_0= 'UsedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:707:6: ( (lv_UsedTypes_2_0= 'UsedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:708:1: (lv_UsedTypes_2_0= 'UsedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:708:1: (lv_UsedTypes_2_0= 'UsedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:709:3: lv_UsedTypes_2_0= 'UsedTypes'
                    {
                    lv_UsedTypes_2_0=(Token)match(input,18,FOLLOW_18_in_ruleTypeField1246); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:723:6: ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:723:6: ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:724:1: (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:724:1: (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:725:3: lv_UsedTypesInTry_3_0= 'UsedTypesInTry'
                    {
                    lv_UsedTypesInTry_3_0=(Token)match(input,19,FOLLOW_19_in_ruleTypeField1283); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:739:6: ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:739:6: ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:740:1: (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:740:1: (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:741:3: lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally'
                    {
                    lv_UsedTypesInFinally_4_0=(Token)match(input,20,FOLLOW_20_in_ruleTypeField1320); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:755:6: ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:755:6: ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:756:1: (lv_ParameterTypes_5_0= 'ParameterTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:756:1: (lv_ParameterTypes_5_0= 'ParameterTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:757:3: lv_ParameterTypes_5_0= 'ParameterTypes'
                    {
                    lv_ParameterTypes_5_0=(Token)match(input,21,FOLLOW_21_in_ruleTypeField1357); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:771:6: ( (lv_ReturnType_6_0= 'ReturnType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:771:6: ( (lv_ReturnType_6_0= 'ReturnType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:772:1: (lv_ReturnType_6_0= 'ReturnType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:772:1: (lv_ReturnType_6_0= 'ReturnType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:773:3: lv_ReturnType_6_0= 'ReturnType'
                    {
                    lv_ReturnType_6_0=(Token)match(input,22,FOLLOW_22_in_ruleTypeField1394); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:787:6: ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:787:6: ( (lv_InstanceofTypes_7_0= 'InstanceofTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:788:1: (lv_InstanceofTypes_7_0= 'InstanceofTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:788:1: (lv_InstanceofTypes_7_0= 'InstanceofTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:789:3: lv_InstanceofTypes_7_0= 'InstanceofTypes'
                    {
                    lv_InstanceofTypes_7_0=(Token)match(input,23,FOLLOW_23_in_ruleTypeField1431); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:803:6: ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:803:6: ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:804:1: (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:804:1: (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:805:3: lv_AllImplementedTypes_8_0= 'AllImplementedTypes'
                    {
                    lv_AllImplementedTypes_8_0=(Token)match(input,24,FOLLOW_24_in_ruleTypeField1468); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:819:6: ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:819:6: ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:820:1: (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:820:1: (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:821:3: lv_AllExtendedTypes_9_0= 'AllExtendedTypes'
                    {
                    lv_AllExtendedTypes_9_0=(Token)match(input,25,FOLLOW_25_in_ruleTypeField1505); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:835:6: ( (lv_FieldType_10_0= 'FieldType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:835:6: ( (lv_FieldType_10_0= 'FieldType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:836:1: (lv_FieldType_10_0= 'FieldType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:836:1: (lv_FieldType_10_0= 'FieldType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:837:3: lv_FieldType_10_0= 'FieldType'
                    {
                    lv_FieldType_10_0=(Token)match(input,26,FOLLOW_26_in_ruleTypeField1542); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:851:6: ( (lv_CaughtType_11_0= 'CaughtType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:851:6: ( (lv_CaughtType_11_0= 'CaughtType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:852:1: (lv_CaughtType_11_0= 'CaughtType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:852:1: (lv_CaughtType_11_0= 'CaughtType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:853:3: lv_CaughtType_11_0= 'CaughtType'
                    {
                    lv_CaughtType_11_0=(Token)match(input,27,FOLLOW_27_in_ruleTypeField1579); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:867:6: ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:867:6: ( (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:868:1: (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:868:1: (lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:869:3: lv_DeclaredFieldTypes_12_0= 'DeclaredFieldTypes'
                    {
                    lv_DeclaredFieldTypes_12_0=(Token)match(input,28,FOLLOW_28_in_ruleTypeField1616); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:883:6: ( (lv_DeclaringType_13_0= 'DeclaringType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:883:6: ( (lv_DeclaringType_13_0= 'DeclaringType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:884:1: (lv_DeclaringType_13_0= 'DeclaringType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:884:1: (lv_DeclaringType_13_0= 'DeclaringType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:885:3: lv_DeclaringType_13_0= 'DeclaringType'
                    {
                    lv_DeclaringType_13_0=(Token)match(input,29,FOLLOW_29_in_ruleTypeField1653); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:906:1: entryRuleMethodField returns [EObject current=null] : iv_ruleMethodField= ruleMethodField EOF ;
    public final EObject entryRuleMethodField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:907:2: (iv_ruleMethodField= ruleMethodField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:908:2: iv_ruleMethodField= ruleMethodField EOF
            {
             newCompositeNode(grammarAccess.getMethodFieldRule()); 
            pushFollow(FOLLOW_ruleMethodField_in_entryRuleMethodField1702);
            iv_ruleMethodField=ruleMethodField();

            state._fsp--;

             current =iv_ruleMethodField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodField1712); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:915:1: ruleMethodField returns [EObject current=null] : ( ( (lv_UsedMethods_0_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) ) ) ;
    public final EObject ruleMethodField() throws RecognitionException {
        EObject current = null;

        Token lv_UsedMethods_0_0=null;
        Token lv_UsedMethodsInTry_1_0=null;
        Token lv_UsedMethodsInFinally_2_0=null;
        Token lv_OverriddenMethods_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:918:28: ( ( ( (lv_UsedMethods_0_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:919:1: ( ( (lv_UsedMethods_0_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:919:1: ( ( (lv_UsedMethods_0_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            case 33:
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:919:2: ( (lv_UsedMethods_0_0= 'UsedMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:919:2: ( (lv_UsedMethods_0_0= 'UsedMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:920:1: (lv_UsedMethods_0_0= 'UsedMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:920:1: (lv_UsedMethods_0_0= 'UsedMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:921:3: lv_UsedMethods_0_0= 'UsedMethods'
                    {
                    lv_UsedMethods_0_0=(Token)match(input,30,FOLLOW_30_in_ruleMethodField1755); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:935:6: ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:935:6: ( (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:936:1: (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:936:1: (lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:937:3: lv_UsedMethodsInTry_1_0= 'UsedMethodsInTry'
                    {
                    lv_UsedMethodsInTry_1_0=(Token)match(input,31,FOLLOW_31_in_ruleMethodField1792); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:951:6: ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:951:6: ( (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:952:1: (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:952:1: (lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:953:3: lv_UsedMethodsInFinally_2_0= 'UsedMethodsInFinally'
                    {
                    lv_UsedMethodsInFinally_2_0=(Token)match(input,32,FOLLOW_32_in_ruleMethodField1829); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:967:6: ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:967:6: ( (lv_OverriddenMethods_3_0= 'OverriddenMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:968:1: (lv_OverriddenMethods_3_0= 'OverriddenMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:968:1: (lv_OverriddenMethods_3_0= 'OverriddenMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:969:3: lv_OverriddenMethods_3_0= 'OverriddenMethods'
                    {
                    lv_OverriddenMethods_3_0=(Token)match(input,33,FOLLOW_33_in_ruleMethodField1866); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:990:1: entryRuleFilePathField returns [EObject current=null] : iv_ruleFilePathField= ruleFilePathField EOF ;
    public final EObject entryRuleFilePathField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilePathField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:991:2: (iv_ruleFilePathField= ruleFilePathField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:992:2: iv_ruleFilePathField= ruleFilePathField EOF
            {
             newCompositeNode(grammarAccess.getFilePathFieldRule()); 
            pushFollow(FOLLOW_ruleFilePathField_in_entryRuleFilePathField1915);
            iv_ruleFilePathField=ruleFilePathField();

            state._fsp--;

             current =iv_ruleFilePathField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathField1925); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:999:1: ruleFilePathField returns [EObject current=null] : ( (lv_ResourcePath_0_0= 'ResourcePath' ) ) ;
    public final EObject ruleFilePathField() throws RecognitionException {
        EObject current = null;

        Token lv_ResourcePath_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1002:28: ( ( (lv_ResourcePath_0_0= 'ResourcePath' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1003:1: ( (lv_ResourcePath_0_0= 'ResourcePath' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1003:1: ( (lv_ResourcePath_0_0= 'ResourcePath' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1004:1: (lv_ResourcePath_0_0= 'ResourcePath' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1004:1: (lv_ResourcePath_0_0= 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1005:3: lv_ResourcePath_0_0= 'ResourcePath'
            {
            lv_ResourcePath_0_0=(Token)match(input,34,FOLLOW_34_in_ruleFilePathField1967); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1026:1: entryRuleNumberField returns [EObject current=null] : iv_ruleNumberField= ruleNumberField EOF ;
    public final EObject entryRuleNumberField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1027:2: (iv_ruleNumberField= ruleNumberField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1028:2: iv_ruleNumberField= ruleNumberField EOF
            {
             newCompositeNode(grammarAccess.getNumberFieldRule()); 
            pushFollow(FOLLOW_ruleNumberField_in_entryRuleNumberField2015);
            iv_ruleNumberField=ruleNumberField();

            state._fsp--;

             current =iv_ruleNumberField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberField2025); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1035:1: ruleNumberField returns [EObject current=null] : ( (lv_ParameterCount_0_0= 'ParameterCount' ) ) ;
    public final EObject ruleNumberField() throws RecognitionException {
        EObject current = null;

        Token lv_ParameterCount_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1038:28: ( ( (lv_ParameterCount_0_0= 'ParameterCount' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1039:1: ( (lv_ParameterCount_0_0= 'ParameterCount' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1039:1: ( (lv_ParameterCount_0_0= 'ParameterCount' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1040:1: (lv_ParameterCount_0_0= 'ParameterCount' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1040:1: (lv_ParameterCount_0_0= 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1041:3: lv_ParameterCount_0_0= 'ParameterCount'
            {
            lv_ParameterCount_0_0=(Token)match(input,35,FOLLOW_35_in_ruleNumberField2067); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1062:1: entryRuleModifierField returns [EObject current=null] : iv_ruleModifierField= ruleModifierField EOF ;
    public final EObject entryRuleModifierField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1063:2: (iv_ruleModifierField= ruleModifierField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1064:2: iv_ruleModifierField= ruleModifierField EOF
            {
             newCompositeNode(grammarAccess.getModifierFieldRule()); 
            pushFollow(FOLLOW_ruleModifierField_in_entryRuleModifierField2115);
            iv_ruleModifierField=ruleModifierField();

            state._fsp--;

             current =iv_ruleModifierField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierField2125); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1071:1: ruleModifierField returns [EObject current=null] : ( (lv_Modifiers_0_0= 'Modifiers' ) ) ;
    public final EObject ruleModifierField() throws RecognitionException {
        EObject current = null;

        Token lv_Modifiers_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1074:28: ( ( (lv_Modifiers_0_0= 'Modifiers' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1075:1: ( (lv_Modifiers_0_0= 'Modifiers' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1075:1: ( (lv_Modifiers_0_0= 'Modifiers' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1076:1: (lv_Modifiers_0_0= 'Modifiers' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1076:1: (lv_Modifiers_0_0= 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1077:3: lv_Modifiers_0_0= 'Modifiers'
            {
            lv_Modifiers_0_0=(Token)match(input,36,FOLLOW_36_in_ruleModifierField2167); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1098:1: entryRuleTimeField returns [EObject current=null] : iv_ruleTimeField= ruleTimeField EOF ;
    public final EObject entryRuleTimeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1099:2: (iv_ruleTimeField= ruleTimeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1100:2: iv_ruleTimeField= ruleTimeField EOF
            {
             newCompositeNode(grammarAccess.getTimeFieldRule()); 
            pushFollow(FOLLOW_ruleTimeField_in_entryRuleTimeField2215);
            iv_ruleTimeField=ruleTimeField();

            state._fsp--;

             current =iv_ruleTimeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeField2225); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1107:1: ruleTimeField returns [EObject current=null] : ( (lv_Timestamp_0_0= 'Timestamp' ) ) ;
    public final EObject ruleTimeField() throws RecognitionException {
        EObject current = null;

        Token lv_Timestamp_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1110:28: ( ( (lv_Timestamp_0_0= 'Timestamp' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1111:1: ( (lv_Timestamp_0_0= 'Timestamp' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1111:1: ( (lv_Timestamp_0_0= 'Timestamp' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1112:1: (lv_Timestamp_0_0= 'Timestamp' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1112:1: (lv_Timestamp_0_0= 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1113:3: lv_Timestamp_0_0= 'Timestamp'
            {
            lv_Timestamp_0_0=(Token)match(input,37,FOLLOW_37_in_ruleTimeField2267); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1134:1: entryRuleDocumentTypeField returns [EObject current=null] : iv_ruleDocumentTypeField= ruleDocumentTypeField EOF ;
    public final EObject entryRuleDocumentTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentTypeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1135:2: (iv_ruleDocumentTypeField= ruleDocumentTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1136:2: iv_ruleDocumentTypeField= ruleDocumentTypeField EOF
            {
             newCompositeNode(grammarAccess.getDocumentTypeFieldRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField2315);
            iv_ruleDocumentTypeField=ruleDocumentTypeField();

            state._fsp--;

             current =iv_ruleDocumentTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeField2325); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1143:1: ruleDocumentTypeField returns [EObject current=null] : ( (lv_Type_0_0= 'Type' ) ) ;
    public final EObject ruleDocumentTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_Type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1146:28: ( ( (lv_Type_0_0= 'Type' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1147:1: ( (lv_Type_0_0= 'Type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1147:1: ( (lv_Type_0_0= 'Type' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1148:1: (lv_Type_0_0= 'Type' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1148:1: (lv_Type_0_0= 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1149:3: lv_Type_0_0= 'Type'
            {
            lv_Type_0_0=(Token)match(input,38,FOLLOW_38_in_ruleDocumentTypeField2367); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1170:1: entryRuleProjectNameField returns [EObject current=null] : iv_ruleProjectNameField= ruleProjectNameField EOF ;
    public final EObject entryRuleProjectNameField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectNameField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1171:2: (iv_ruleProjectNameField= ruleProjectNameField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1172:2: iv_ruleProjectNameField= ruleProjectNameField EOF
            {
             newCompositeNode(grammarAccess.getProjectNameFieldRule()); 
            pushFollow(FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField2415);
            iv_ruleProjectNameField=ruleProjectNameField();

            state._fsp--;

             current =iv_ruleProjectNameField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameField2425); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1179:1: ruleProjectNameField returns [EObject current=null] : ( (lv_ProjectName_0_0= 'ProjectName' ) ) ;
    public final EObject ruleProjectNameField() throws RecognitionException {
        EObject current = null;

        Token lv_ProjectName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1182:28: ( ( (lv_ProjectName_0_0= 'ProjectName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1183:1: ( (lv_ProjectName_0_0= 'ProjectName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1183:1: ( (lv_ProjectName_0_0= 'ProjectName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1184:1: (lv_ProjectName_0_0= 'ProjectName' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1184:1: (lv_ProjectName_0_0= 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1185:3: lv_ProjectName_0_0= 'ProjectName'
            {
            lv_ProjectName_0_0=(Token)match(input,39,FOLLOW_39_in_ruleProjectNameField2467); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1206:1: entryRuleAnnotationField returns [EObject current=null] : iv_ruleAnnotationField= ruleAnnotationField EOF ;
    public final EObject entryRuleAnnotationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1207:2: (iv_ruleAnnotationField= ruleAnnotationField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1208:2: iv_ruleAnnotationField= ruleAnnotationField EOF
            {
             newCompositeNode(grammarAccess.getAnnotationFieldRule()); 
            pushFollow(FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField2515);
            iv_ruleAnnotationField=ruleAnnotationField();

            state._fsp--;

             current =iv_ruleAnnotationField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationField2525); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1215:1: ruleAnnotationField returns [EObject current=null] : ( (lv_Annotations_0_0= 'Annotations' ) ) ;
    public final EObject ruleAnnotationField() throws RecognitionException {
        EObject current = null;

        Token lv_Annotations_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1218:28: ( ( (lv_Annotations_0_0= 'Annotations' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1219:1: ( (lv_Annotations_0_0= 'Annotations' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1219:1: ( (lv_Annotations_0_0= 'Annotations' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1220:1: (lv_Annotations_0_0= 'Annotations' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1220:1: (lv_Annotations_0_0= 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1221:3: lv_Annotations_0_0= 'Annotations'
            {
            lv_Annotations_0_0=(Token)match(input,40,FOLLOW_40_in_ruleAnnotationField2567); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1242:1: entryRuleSimpleField returns [EObject current=null] : iv_ruleSimpleField= ruleSimpleField EOF ;
    public final EObject entryRuleSimpleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1243:2: (iv_ruleSimpleField= ruleSimpleField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1244:2: iv_ruleSimpleField= ruleSimpleField EOF
            {
             newCompositeNode(grammarAccess.getSimpleFieldRule()); 
            pushFollow(FOLLOW_ruleSimpleField_in_entryRuleSimpleField2615);
            iv_ruleSimpleField=ruleSimpleField();

            state._fsp--;

             current =iv_ruleSimpleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleField2625); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1251:1: ruleSimpleField returns [EObject current=null] : ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) ) | ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) ) | ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_8_0= 'FullText' ) ) | ( (lv_FieldsRead_9_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) ) ) ;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1254:28: ( ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) ) | ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) ) | ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_8_0= 'FullText' ) ) | ( (lv_FieldsRead_9_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1255:1: ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) ) | ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) ) | ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_8_0= 'FullText' ) ) | ( (lv_FieldsRead_9_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1255:1: ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) ) | ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) ) | ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_8_0= 'FullText' ) ) | ( (lv_FieldsRead_9_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) ) )
            int alt10=13;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt10=1;
                }
                break;
            case 42:
                {
                alt10=2;
                }
                break;
            case 43:
                {
                alt10=3;
                }
                break;
            case 44:
                {
                alt10=4;
                }
                break;
            case 45:
                {
                alt10=5;
                }
                break;
            case 46:
                {
                alt10=6;
                }
                break;
            case 47:
                {
                alt10=7;
                }
                break;
            case 48:
                {
                alt10=8;
                }
                break;
            case 49:
                {
                alt10=9;
                }
                break;
            case 50:
                {
                alt10=10;
                }
                break;
            case 51:
                {
                alt10=11;
                }
                break;
            case 52:
                {
                alt10=12;
                }
                break;
            case 53:
                {
                alt10=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1255:2: ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1255:2: ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1256:1: (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1256:1: (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1257:3: lv_FullyQualifiedName_0_0= 'FullyQualifiedName'
                    {
                    lv_FullyQualifiedName_0_0=(Token)match(input,41,FOLLOW_41_in_ruleSimpleField2668); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1271:6: ( (lv_FriendlyName_1_0= 'FriendlyName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1271:6: ( (lv_FriendlyName_1_0= 'FriendlyName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1272:1: (lv_FriendlyName_1_0= 'FriendlyName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1272:1: (lv_FriendlyName_1_0= 'FriendlyName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1273:3: lv_FriendlyName_1_0= 'FriendlyName'
                    {
                    lv_FriendlyName_1_0=(Token)match(input,42,FOLLOW_42_in_ruleSimpleField2705); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1287:6: ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1287:6: ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1288:1: (lv_DeclaredMethods_2_0= 'DeclaredMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1288:1: (lv_DeclaredMethods_2_0= 'DeclaredMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1289:3: lv_DeclaredMethods_2_0= 'DeclaredMethods'
                    {
                    lv_DeclaredMethods_2_0=(Token)match(input,43,FOLLOW_43_in_ruleSimpleField2742); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1303:6: ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1303:6: ( (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1304:1: (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1304:1: (lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1305:3: lv_ReturnVariableEexpressions_3_0= 'ReturnVariableEexpressions'
                    {
                    lv_ReturnVariableEexpressions_3_0=(Token)match(input,44,FOLLOW_44_in_ruleSimpleField2779); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1319:6: ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1319:6: ( (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1320:1: (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1320:1: (lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1321:3: lv_AllDeclaredMethodNames_4_0= 'AllDeclaredMethodNames'
                    {
                    lv_AllDeclaredMethodNames_4_0=(Token)match(input,45,FOLLOW_45_in_ruleSimpleField2816); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1335:6: ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1335:6: ( (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1336:1: (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1336:1: (lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1337:3: lv_DeclaredMethodNames_5_0= 'DeclaredMethodNames'
                    {
                    lv_DeclaredMethodNames_5_0=(Token)match(input,46,FOLLOW_46_in_ruleSimpleField2853); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1351:6: ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1351:6: ( (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1352:1: (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1352:1: (lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1353:3: lv_DeclaredFieldNames_6_0= 'DeclaredFieldNames'
                    {
                    lv_DeclaredFieldNames_6_0=(Token)match(input,47,FOLLOW_47_in_ruleSimpleField2890); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1367:6: ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1367:6: ( (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1368:1: (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1368:1: (lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1369:3: lv_AllDeclaredFieldNames_7_0= 'AllDeclaredFieldNames'
                    {
                    lv_AllDeclaredFieldNames_7_0=(Token)match(input,48,FOLLOW_48_in_ruleSimpleField2927); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1383:6: ( (lv_FullText_8_0= 'FullText' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1383:6: ( (lv_FullText_8_0= 'FullText' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1384:1: (lv_FullText_8_0= 'FullText' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1384:1: (lv_FullText_8_0= 'FullText' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1385:3: lv_FullText_8_0= 'FullText'
                    {
                    lv_FullText_8_0=(Token)match(input,49,FOLLOW_49_in_ruleSimpleField2964); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1399:6: ( (lv_FieldsRead_9_0= 'FieldsRead' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1399:6: ( (lv_FieldsRead_9_0= 'FieldsRead' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1400:1: (lv_FieldsRead_9_0= 'FieldsRead' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1400:1: (lv_FieldsRead_9_0= 'FieldsRead' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1401:3: lv_FieldsRead_9_0= 'FieldsRead'
                    {
                    lv_FieldsRead_9_0=(Token)match(input,50,FOLLOW_50_in_ruleSimpleField3001); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1415:6: ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1415:6: ( (lv_FieldsWritten_10_0= 'FieldsWritten' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1416:1: (lv_FieldsWritten_10_0= 'FieldsWritten' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1416:1: (lv_FieldsWritten_10_0= 'FieldsWritten' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1417:3: lv_FieldsWritten_10_0= 'FieldsWritten'
                    {
                    lv_FieldsWritten_10_0=(Token)match(input,51,FOLLOW_51_in_ruleSimpleField3038); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1431:6: ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1431:6: ( (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1432:1: (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1432:1: (lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1433:3: lv_UsedFieldsInFinally_11_0= 'UsedFieldsInFinally'
                    {
                    lv_UsedFieldsInFinally_11_0=(Token)match(input,52,FOLLOW_52_in_ruleSimpleField3075); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1447:6: ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1447:6: ( (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1448:1: (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1448:1: (lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1449:3: lv_UsedFieldsInTry_12_0= 'UsedFieldsInTry'
                    {
                    lv_UsedFieldsInTry_12_0=(Token)match(input,53,FOLLOW_53_in_ruleSimpleField3112); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1470:1: entryRuleSimpleFieldValue returns [String current=null] : iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF ;
    public final String entryRuleSimpleFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1471:2: (iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1472:2: iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleFieldValueRule()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue3162);
            iv_ruleSimpleFieldValue=ruleSimpleFieldValue();

            state._fsp--;

             current =iv_ruleSimpleFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldValue3173); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1479:1: ruleSimpleFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleSimpleFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1482:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1483:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue3212); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1498:1: entryRuleMethodFieldValue returns [String current=null] : iv_ruleMethodFieldValue= ruleMethodFieldValue EOF ;
    public final String entryRuleMethodFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1499:2: (iv_ruleMethodFieldValue= ruleMethodFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1500:2: iv_ruleMethodFieldValue= ruleMethodFieldValue EOF
            {
             newCompositeNode(grammarAccess.getMethodFieldValueRule()); 
            pushFollow(FOLLOW_ruleMethodFieldValue_in_entryRuleMethodFieldValue3257);
            iv_ruleMethodFieldValue=ruleMethodFieldValue();

            state._fsp--;

             current =iv_ruleMethodFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodFieldValue3268); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1507:1: ruleMethodFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleMethodFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1510:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1511:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethodFieldValue3307); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1526:1: entryRuleProjectNameFieldValue returns [String current=null] : iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF ;
    public final String entryRuleProjectNameFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProjectNameFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1527:2: (iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1528:2: iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF
            {
             newCompositeNode(grammarAccess.getProjectNameFieldValueRule()); 
            pushFollow(FOLLOW_ruleProjectNameFieldValue_in_entryRuleProjectNameFieldValue3352);
            iv_ruleProjectNameFieldValue=ruleProjectNameFieldValue();

            state._fsp--;

             current =iv_ruleProjectNameFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameFieldValue3363); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1535:1: ruleProjectNameFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleProjectNameFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1538:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1539:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleProjectNameFieldValue3402); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1554:1: entryRuleNumberFieldValue returns [String current=null] : iv_ruleNumberFieldValue= ruleNumberFieldValue EOF ;
    public final String entryRuleNumberFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1555:2: (iv_ruleNumberFieldValue= ruleNumberFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1556:2: iv_ruleNumberFieldValue= ruleNumberFieldValue EOF
            {
             newCompositeNode(grammarAccess.getNumberFieldValueRule()); 
            pushFollow(FOLLOW_ruleNumberFieldValue_in_entryRuleNumberFieldValue3447);
            iv_ruleNumberFieldValue=ruleNumberFieldValue();

            state._fsp--;

             current =iv_ruleNumberFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFieldValue3458); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1563:1: ruleNumberFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumberFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1566:28: (this_INT_0= RULE_INT )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1567:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberFieldValue3497); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1582:1: entryRuleModifierFieldValue returns [String current=null] : iv_ruleModifierFieldValue= ruleModifierFieldValue EOF ;
    public final String entryRuleModifierFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifierFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1583:2: (iv_ruleModifierFieldValue= ruleModifierFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1584:2: iv_ruleModifierFieldValue= ruleModifierFieldValue EOF
            {
             newCompositeNode(grammarAccess.getModifierFieldValueRule()); 
            pushFollow(FOLLOW_ruleModifierFieldValue_in_entryRuleModifierFieldValue3542);
            iv_ruleModifierFieldValue=ruleModifierFieldValue();

            state._fsp--;

             current =iv_ruleModifierFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierFieldValue3553); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1591:1: ruleModifierFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleModifierFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1594:28: ( (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1595:1: (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1595:1: (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt11=1;
                }
                break;
            case 55:
                {
                alt11=2;
                }
                break;
            case 56:
                {
                alt11=3;
                }
                break;
            case 57:
                {
                alt11=4;
                }
                break;
            case 58:
                {
                alt11=5;
                }
                break;
            case 59:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1596:2: kw= 'private'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleModifierFieldValue3591); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1603:2: kw= 'public'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleModifierFieldValue3610); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getPublicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1610:2: kw= 'static'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleModifierFieldValue3629); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getStaticKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1617:2: kw= 'final'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleModifierFieldValue3648); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getFinalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1624:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleModifierFieldValue3667); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getAbstractKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1631:2: kw= 'protected'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleModifierFieldValue3686); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1644:1: entryRuleTimeFieldValue returns [String current=null] : iv_ruleTimeFieldValue= ruleTimeFieldValue EOF ;
    public final String entryRuleTimeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1645:2: (iv_ruleTimeFieldValue= ruleTimeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1646:2: iv_ruleTimeFieldValue= ruleTimeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getTimeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTimeFieldValue_in_entryRuleTimeFieldValue3727);
            iv_ruleTimeFieldValue=ruleTimeFieldValue();

            state._fsp--;

             current =iv_ruleTimeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeFieldValue3738); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1653:1: ruleTimeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleTimeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1656:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1657:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleTimeFieldValue3777); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1672:1: entryRuleDocumentTypeFieldValue returns [String current=null] : iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF ;
    public final String entryRuleDocumentTypeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDocumentTypeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1673:2: (iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1674:2: iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getDocumentTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_entryRuleDocumentTypeFieldValue3822);
            iv_ruleDocumentTypeFieldValue=ruleDocumentTypeFieldValue();

            state._fsp--;

             current =iv_ruleDocumentTypeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeFieldValue3833); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1681:1: ruleDocumentTypeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' ) ;
    public final AntlrDatatypeRuleToken ruleDocumentTypeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1684:28: ( (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1685:1: (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1685:1: (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt12=1;
                }
                break;
            case 61:
                {
                alt12=2;
                }
                break;
            case 62:
                {
                alt12=3;
                }
                break;
            case 63:
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1686:2: kw= 'class'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleDocumentTypeFieldValue3871); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getClassKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1693:2: kw= 'method'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleDocumentTypeFieldValue3890); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getMethodKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1700:2: kw= 'field'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleDocumentTypeFieldValue3909); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getFieldKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1707:2: kw= 'trycatch'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleDocumentTypeFieldValue3928); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1720:1: entryRuleAnnotationFieldValue returns [String current=null] : iv_ruleAnnotationFieldValue= ruleAnnotationFieldValue EOF ;
    public final String entryRuleAnnotationFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1721:2: (iv_ruleAnnotationFieldValue= ruleAnnotationFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1722:2: iv_ruleAnnotationFieldValue= ruleAnnotationFieldValue EOF
            {
             newCompositeNode(grammarAccess.getAnnotationFieldValueRule()); 
            pushFollow(FOLLOW_ruleAnnotationFieldValue_in_entryRuleAnnotationFieldValue3969);
            iv_ruleAnnotationFieldValue=ruleAnnotationFieldValue();

            state._fsp--;

             current =iv_ruleAnnotationFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationFieldValue3980); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1729:1: ruleAnnotationFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleAnnotationFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1732:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1733:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleAnnotationFieldValue4019); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1748:1: entryRuleTypeFieldValue returns [String current=null] : iv_ruleTypeFieldValue= ruleTypeFieldValue EOF ;
    public final String entryRuleTypeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1749:2: (iv_ruleTypeFieldValue= ruleTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1750:2: iv_ruleTypeFieldValue= ruleTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue4064);
            iv_ruleTypeFieldValue=ruleTypeFieldValue();

            state._fsp--;

             current =iv_ruleTypeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldValue4075); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1757:1: ruleTypeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleTypeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1760:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1761:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue4114); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1776:1: entryRuleFilePathFieldValue returns [String current=null] : iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF ;
    public final String entryRuleFilePathFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePathFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1777:2: (iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1778:2: iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF
            {
             newCompositeNode(grammarAccess.getFilePathFieldValueRule()); 
            pushFollow(FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue4159);
            iv_ruleFilePathFieldValue=ruleFilePathFieldValue();

            state._fsp--;

             current =iv_ruleFilePathFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathFieldValue4170); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1785:1: ruleFilePathFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PathWithWC_0= RULE_PATHWITHWC ;
    public final AntlrDatatypeRuleToken ruleFilePathFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PathWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1788:28: (this_PathWithWC_0= RULE_PATHWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1789:5: this_PathWithWC_0= RULE_PATHWITHWC
            {
            this_PathWithWC_0=(Token)match(input,RULE_PATHWITHWC,FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue4209); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1804:1: entryRuleUnaryExpression returns [String current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final String entryRuleUnaryExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryExpression = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1805:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1806:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4254);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression4265); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1813:1: ruleUnaryExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1816:28: ( (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1817:1: (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1817:1: (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt13=1;
                }
                break;
            case 65:
                {
                alt13=2;
                }
                break;
            case 66:
                {
                alt13=3;
                }
                break;
            case 67:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1818:2: kw= '-'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleUnaryExpression4303); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1825:2: kw= 'NOT'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleUnaryExpression4322); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getNOTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1832:2: kw= '!'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleUnaryExpression4341); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1839:2: kw= '+'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleUnaryExpression4360); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1852:1: ruleBinaryExp returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBinaryExp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1854:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1855:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1855:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==68) ) {
                alt14=1;
            }
            else if ( (LA14_0==69) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1855:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1855:2: (enumLiteral_0= 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1855:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleBinaryExp4414); 

                            current = grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1861:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1861:6: (enumLiteral_1= 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1861:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleBinaryExp4431); 

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
    public static final BitSet FOLLOW_ruleExp2_in_ruleExp1132 = new BitSet(new long[]{0x003FFFFFFFFF2012L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleBinaryExp_in_ruleExp1162 = new BitSet(new long[]{0x003FFFFFFFFF2010L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleExp1_in_ruleExp1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_entryRuleExp2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_ruleExp2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleExp2302 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExp2315 = new BitSet(new long[]{0x003FFFFFFFFF2010L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleExp1_in_ruleExp2337 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExp2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClauseExpression395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression437 = new BitSet(new long[]{0x003FFFFFFFFF0010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_ruleClauseExpression489 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_ruleClauseExpression551 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_ruleClauseExpression613 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_ruleClauseExpression675 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression687 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_ruleClauseExpression737 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression749 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_ruleClauseExpression799 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression811 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_ruleClauseExpression861 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_ruleClauseExpression894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_ruleClauseExpression923 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression935 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_ruleClauseExpression985 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_ruleClauseExpression1047 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression1059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_ruleClauseExpression1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_entryRuleTypeField1119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeField1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTypeField1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTypeField1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTypeField1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTypeField1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTypeField1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTypeField1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTypeField1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTypeField1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTypeField1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTypeField1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeField1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTypeField1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTypeField1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTypeField1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_entryRuleMethodField1702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodField1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMethodField1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMethodField1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMethodField1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMethodField1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_entryRuleFilePathField1915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathField1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFilePathField1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_entryRuleNumberField2015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberField2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNumberField2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_entryRuleModifierField2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierField2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleModifierField2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_entryRuleTimeField2215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeField2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTimeField2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeField2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDocumentTypeField2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField2415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameField2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleProjectNameField2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField2515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationField2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAnnotationField2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_entryRuleSimpleField2615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleField2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSimpleField2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSimpleField2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSimpleField2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSimpleField2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSimpleField2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSimpleField2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSimpleField2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSimpleField2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSimpleField2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSimpleField3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSimpleField3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSimpleField3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSimpleField3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue3162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldValue3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_entryRuleMethodFieldValue3257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodFieldValue3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethodFieldValue3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_entryRuleProjectNameFieldValue3352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameFieldValue3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleProjectNameFieldValue3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_entryRuleNumberFieldValue3447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFieldValue3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberFieldValue3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_entryRuleModifierFieldValue3542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierFieldValue3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleModifierFieldValue3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleModifierFieldValue3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleModifierFieldValue3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleModifierFieldValue3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleModifierFieldValue3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleModifierFieldValue3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_entryRuleTimeFieldValue3727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeFieldValue3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleTimeFieldValue3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_entryRuleDocumentTypeFieldValue3822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeFieldValue3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDocumentTypeFieldValue3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDocumentTypeFieldValue3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDocumentTypeFieldValue3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDocumentTypeFieldValue3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_entryRuleAnnotationFieldValue3969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationFieldValue3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleAnnotationFieldValue4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue4064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldValue4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue4159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathFieldValue4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleUnaryExpression4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleUnaryExpression4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleUnaryExpression4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleUnaryExpression4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBinaryExp4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBinaryExp4431 = new BitSet(new long[]{0x0000000000000002L});

}