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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOST", "RULE_NAMEWITHWC", "RULE_INT", "RULE_PATHWITHWC", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'FullyQualifiedName'", "'FriendlyName'", "'ReturnVariableExpressions'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'InstanceofTypes'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'CaughtType'", "'DeclaredFieldTypes'", "'DeclaringType'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'DeclaredMethods'", "'ResourcePath'", "'ParameterCount'", "'Modifiers'", "'Timestamp'", "'Type'", "'ProjectName'", "'Annotations'", "'private'", "'public'", "'static'", "'final'", "'abstract'", "'protected'", "'class'", "'method'", "'field'", "'trycatch'", "'-'", "'NOT'", "'!'", "'+'", "'AND'", "'OR'", "'||'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=8;
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
    public static final int RULE_ANY_OTHER=13;
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
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=6;
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
    public static final int RULE_PATHWITHWC=7;
    public static final int RULE_NAMEWITHWC=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_BOOST=4;
    public static final int RULE_WS=12;

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

            if ( (LA2_0==RULE_NAMEWITHWC||LA2_0==14||(LA2_0>=17 && LA2_0<=54)||(LA2_0>=65 && LA2_0<=71)) ) {
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

                    if ( ((LA1_0>=69 && LA1_0<=71)) ) {
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:149:1: ruleExp2 returns [EObject current=null] : ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' (this_Boost_5= RULE_BOOST )? ) ) ;
    public final EObject ruleExp2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_Boost_5=null;
        EObject lv_value_0_0 = null;

        EObject this_Exp1_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:152:28: ( ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' (this_Boost_5= RULE_BOOST )? ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:153:1: ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' (this_Boost_5= RULE_BOOST )? ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:153:1: ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' (this_Boost_5= RULE_BOOST )? ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 65:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==14) ) {
                    alt5=2;
                }
                else if ( (LA5_1==RULE_NAMEWITHWC||(LA5_1>=17 && LA5_1<=54)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_NAMEWITHWC||(LA5_2>=17 && LA5_2<=54)) ) {
                    alt5=1;
                }
                else if ( (LA5_2==14) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==14) ) {
                    alt5=2;
                }
                else if ( (LA5_3==RULE_NAMEWITHWC||(LA5_3>=17 && LA5_3<=54)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==14) ) {
                    alt5=2;
                }
                else if ( (LA5_4==RULE_NAMEWITHWC||(LA5_4>=17 && LA5_4<=54)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NAMEWITHWC:
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
            case 54:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:6: ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' (this_Boost_5= RULE_BOOST )? )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:6: ( ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' (this_Boost_5= RULE_BOOST )? )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:7: ( ruleUnaryExpression )? otherlv_2= '(' this_Exp1_3= ruleExp1 otherlv_4= ')' (this_Boost_5= RULE_BOOST )?
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:7: ( ruleUnaryExpression )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=65 && LA3_0<=68)) ) {
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

                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleExp2315); 

                        	newLeafNode(otherlv_2, grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_1());
                        
                     
                            newCompositeNode(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleExp1_in_ruleExp2337);
                    this_Exp1_3=ruleExp1();

                    state._fsp--;

                     
                            current = this_Exp1_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExp2348); 

                        	newLeafNode(otherlv_4, grammarAccess.getExp2Access().getRightParenthesisKeyword_1_3());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:197:1: (this_Boost_5= RULE_BOOST )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_BOOST) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:197:2: this_Boost_5= RULE_BOOST
                            {
                            this_Boost_5=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleExp2360); 
                             
                                newLeafNode(this_Boost_5, grammarAccess.getExp2Access().getBoostTerminalRuleCall_1_4()); 
                                

                            }
                            break;

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
    // $ANTLR end "ruleExp2"


    // $ANTLR start "entryRuleClauseExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:209:1: entryRuleClauseExpression returns [EObject current=null] : iv_ruleClauseExpression= ruleClauseExpression EOF ;
    public final EObject entryRuleClauseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClauseExpression = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:2: (iv_ruleClauseExpression= ruleClauseExpression EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:211:2: iv_ruleClauseExpression= ruleClauseExpression EOF
            {
             newCompositeNode(grammarAccess.getClauseExpressionRule()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression398);
            iv_ruleClauseExpression=ruleClauseExpression();

            state._fsp--;

             current =iv_ruleClauseExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClauseExpression408); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:218:1: ruleClauseExpression returns [EObject current=null] : ( ( ruleUnaryExpression )? ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) | ( ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )? ) ) ) ) ;
    public final EObject ruleClauseExpression() throws RecognitionException {
        EObject current = null;

        Token this_Boost_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_Boost_9=null;
        Token otherlv_10=null;
        Token this_Boost_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token this_Boost_18=null;
        Token otherlv_19=null;
        Token this_Boost_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token this_Boost_27=null;
        Token otherlv_28=null;
        Token this_Boost_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token this_Boost_36=null;
        Token otherlv_37=null;
        Token this_Boost_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token this_Boost_45=null;
        Token otherlv_46=null;
        Token this_Boost_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token this_Boost_54=null;
        Token otherlv_55=null;
        Token this_Boost_56=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token this_Boost_63=null;
        Token otherlv_64=null;
        Token this_Boost_65=null;
        Token otherlv_67=null;
        Token otherlv_69=null;
        Token this_Boost_72=null;
        Token otherlv_73=null;
        Token this_Boost_74=null;
        Token otherlv_76=null;
        Token otherlv_78=null;
        Token this_Boost_81=null;
        Token otherlv_82=null;
        Token this_Boost_83=null;
        Token otherlv_85=null;
        Token otherlv_87=null;
        Token this_Boost_90=null;
        Token otherlv_91=null;
        Token this_Boost_92=null;
        AntlrDatatypeRuleToken lv_default_1_0 = null;

        EObject lv_field_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_8_0 = null;

        EObject lv_field_12_0 = null;

        AntlrDatatypeRuleToken lv_values_14_0 = null;

        AntlrDatatypeRuleToken lv_values_17_0 = null;

        EObject lv_field_21_0 = null;

        AntlrDatatypeRuleToken lv_values_23_0 = null;

        AntlrDatatypeRuleToken lv_values_26_0 = null;

        EObject lv_field_30_0 = null;

        AntlrDatatypeRuleToken lv_values_32_0 = null;

        AntlrDatatypeRuleToken lv_values_35_0 = null;

        EObject lv_field_39_0 = null;

        AntlrDatatypeRuleToken lv_values_41_0 = null;

        AntlrDatatypeRuleToken lv_values_44_0 = null;

        EObject lv_field_48_0 = null;

        AntlrDatatypeRuleToken lv_values_50_0 = null;

        AntlrDatatypeRuleToken lv_values_53_0 = null;

        EObject lv_field_57_0 = null;

        AntlrDatatypeRuleToken lv_values_59_0 = null;

        AntlrDatatypeRuleToken lv_values_62_0 = null;

        EObject lv_field_66_0 = null;

        AntlrDatatypeRuleToken lv_values_68_0 = null;

        AntlrDatatypeRuleToken lv_values_71_0 = null;

        EObject lv_field_75_0 = null;

        AntlrDatatypeRuleToken lv_values_77_0 = null;

        AntlrDatatypeRuleToken lv_values_80_0 = null;

        EObject lv_field_84_0 = null;

        AntlrDatatypeRuleToken lv_values_86_0 = null;

        AntlrDatatypeRuleToken lv_values_89_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:221:28: ( ( ( ruleUnaryExpression )? ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) | ( ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )? ) ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:222:1: ( ( ruleUnaryExpression )? ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) | ( ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )? ) ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:222:1: ( ( ruleUnaryExpression )? ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) | ( ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )? ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:222:2: ( ruleUnaryExpression )? ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) | ( ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )? ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:222:2: ( ruleUnaryExpression )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=65 && LA6_0<=68)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:223:5: ruleUnaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression450);
                    ruleUnaryExpression();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:230:3: ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) | ( ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )? ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_NAMEWITHWC) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=17 && LA59_0<=54)) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:230:4: ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:230:4: ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:230:5: ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )?
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:230:5: ( (lv_default_1_0= ruleSimpleFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:231:1: (lv_default_1_0= ruleSimpleFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:231:1: (lv_default_1_0= ruleSimpleFieldValue )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:232:3: lv_default_1_0= ruleSimpleFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getDefaultSimpleFieldValueParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression474);
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

                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:248:2: (this_Boost_2= RULE_BOOST )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_BOOST) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:248:3: this_Boost_2= RULE_BOOST
                            {
                            this_Boost_2=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression486); 
                             
                                newLeafNode(this_Boost_2, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:253:6: ( ( ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) | ( ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )? ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:253:6: ( ( ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) | ( ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )? ) )
                    int alt58=10;
                    switch ( input.LA(1) ) {
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
                        {
                        alt58=1;
                        }
                        break;
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
                        {
                        alt58=2;
                        }
                        break;
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                        {
                        alt58=3;
                        }
                        break;
                    case 48:
                        {
                        alt58=4;
                        }
                        break;
                    case 49:
                        {
                        alt58=5;
                        }
                        break;
                    case 50:
                        {
                        alt58=6;
                        }
                        break;
                    case 51:
                        {
                        alt58=7;
                        }
                        break;
                    case 52:
                        {
                        alt58=8;
                        }
                        break;
                    case 53:
                        {
                        alt58=9;
                        }
                        break;
                    case 54:
                        {
                        alt58=10;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }

                    switch (alt58) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:253:7: ( ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:253:7: ( ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:253:8: ( (lv_field_3_0= ruleSimpleField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:253:8: ( (lv_field_3_0= ruleSimpleField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:254:1: (lv_field_3_0= ruleSimpleField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:254:1: (lv_field_3_0= ruleSimpleField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:255:3: lv_field_3_0= ruleSimpleField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldSimpleFieldParserRuleCall_1_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleField_in_ruleClauseExpression517);
                            lv_field_3_0=ruleSimpleField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_3_0, 
                                    		"SimpleField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleClauseExpression529); 

                                	newLeafNode(otherlv_4, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_0_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:275:1: ( ( (lv_values_5_0= ruleSimpleFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) )
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==RULE_NAMEWITHWC) ) {
                                alt11=1;
                            }
                            else if ( (LA11_0==14) ) {
                                alt11=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 0, input);

                                throw nvae;
                            }
                            switch (alt11) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:275:2: ( (lv_values_5_0= ruleSimpleFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:275:2: ( (lv_values_5_0= ruleSimpleFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:276:1: (lv_values_5_0= ruleSimpleFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:276:1: (lv_values_5_0= ruleSimpleFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:277:3: lv_values_5_0= ruleSimpleFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesSimpleFieldValueParserRuleCall_1_1_0_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression551);
                                    lv_values_5_0=ruleSimpleFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_5_0, 
                                            		"SimpleFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:294:6: (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:294:6: (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:294:8: otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')'
                                    {
                                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleClauseExpression570); 

                                        	newLeafNode(otherlv_6, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_0_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:298:1: ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )? )*
                                    loop10:
                                    do {
                                        int alt10=2;
                                        int LA10_0 = input.LA(1);

                                        if ( (LA10_0==RULE_NAMEWITHWC||(LA10_0>=65 && LA10_0<=68)) ) {
                                            alt10=1;
                                        }


                                        switch (alt10) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:298:2: ( ruleUnaryExpression )? ( (lv_values_8_0= ruleSimpleFieldValue ) ) (this_Boost_9= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:298:2: ( ruleUnaryExpression )?
                                    	    int alt8=2;
                                    	    int LA8_0 = input.LA(1);

                                    	    if ( ((LA8_0>=65 && LA8_0<=68)) ) {
                                    	        alt8=1;
                                    	    }
                                    	    switch (alt8) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:299:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_0_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression588);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:306:3: ( (lv_values_8_0= ruleSimpleFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:307:1: (lv_values_8_0= ruleSimpleFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:307:1: (lv_values_8_0= ruleSimpleFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:308:3: lv_values_8_0= ruleSimpleFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesSimpleFieldValueParserRuleCall_1_1_0_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression610);
                                    	    lv_values_8_0=ruleSimpleFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_8_0, 
                                    	            		"SimpleFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:324:2: (this_Boost_9= RULE_BOOST )?
                                    	    int alt9=2;
                                    	    int LA9_0 = input.LA(1);

                                    	    if ( (LA9_0==RULE_BOOST) ) {
                                    	        alt9=1;
                                    	    }
                                    	    switch (alt9) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:324:3: this_Boost_9= RULE_BOOST
                                    	            {
                                    	            this_Boost_9=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression622); 
                                    	             
                                    	                newLeafNode(this_Boost_9, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_0_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop10;
                                        }
                                    } while (true);

                                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression637); 

                                        	newLeafNode(otherlv_10, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_0_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:332:3: (this_Boost_11= RULE_BOOST )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==RULE_BOOST) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:332:4: this_Boost_11= RULE_BOOST
                                    {
                                    this_Boost_11=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression651); 
                                     
                                        newLeafNode(this_Boost_11, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_0_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:337:6: ( ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:337:6: ( ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:337:7: ( (lv_field_12_0= ruleTypeField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:337:7: ( (lv_field_12_0= ruleTypeField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:338:1: (lv_field_12_0= ruleTypeField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:338:1: (lv_field_12_0= ruleTypeField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:339:3: lv_field_12_0= ruleTypeField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldTypeFieldParserRuleCall_1_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeField_in_ruleClauseExpression681);
                            lv_field_12_0=ruleTypeField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_12_0, 
                                    		"TypeField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleClauseExpression693); 

                                	newLeafNode(otherlv_13, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_1_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:359:1: ( ( (lv_values_14_0= ruleTypeFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) )
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==RULE_NAMEWITHWC) ) {
                                alt16=1;
                            }
                            else if ( (LA16_0==14) ) {
                                alt16=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 0, input);

                                throw nvae;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:359:2: ( (lv_values_14_0= ruleTypeFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:359:2: ( (lv_values_14_0= ruleTypeFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:360:1: (lv_values_14_0= ruleTypeFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:360:1: (lv_values_14_0= ruleTypeFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:361:3: lv_values_14_0= ruleTypeFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesTypeFieldValueParserRuleCall_1_1_1_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression715);
                                    lv_values_14_0=ruleTypeFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_14_0, 
                                            		"TypeFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:378:6: (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:378:6: (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:378:8: otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')'
                                    {
                                    otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleClauseExpression734); 

                                        	newLeafNode(otherlv_15, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_1_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:382:1: ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )? )*
                                    loop15:
                                    do {
                                        int alt15=2;
                                        int LA15_0 = input.LA(1);

                                        if ( (LA15_0==RULE_NAMEWITHWC||(LA15_0>=65 && LA15_0<=68)) ) {
                                            alt15=1;
                                        }


                                        switch (alt15) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:382:2: ( ruleUnaryExpression )? ( (lv_values_17_0= ruleTypeFieldValue ) ) (this_Boost_18= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:382:2: ( ruleUnaryExpression )?
                                    	    int alt13=2;
                                    	    int LA13_0 = input.LA(1);

                                    	    if ( ((LA13_0>=65 && LA13_0<=68)) ) {
                                    	        alt13=1;
                                    	    }
                                    	    switch (alt13) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:383:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_1_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression752);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:390:3: ( (lv_values_17_0= ruleTypeFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:391:1: (lv_values_17_0= ruleTypeFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:391:1: (lv_values_17_0= ruleTypeFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:392:3: lv_values_17_0= ruleTypeFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesTypeFieldValueParserRuleCall_1_1_1_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression774);
                                    	    lv_values_17_0=ruleTypeFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_17_0, 
                                    	            		"TypeFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:408:2: (this_Boost_18= RULE_BOOST )?
                                    	    int alt14=2;
                                    	    int LA14_0 = input.LA(1);

                                    	    if ( (LA14_0==RULE_BOOST) ) {
                                    	        alt14=1;
                                    	    }
                                    	    switch (alt14) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:408:3: this_Boost_18= RULE_BOOST
                                    	            {
                                    	            this_Boost_18=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression786); 
                                    	             
                                    	                newLeafNode(this_Boost_18, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_1_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop15;
                                        }
                                    } while (true);

                                    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression801); 

                                        	newLeafNode(otherlv_19, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_1_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:416:3: (this_Boost_20= RULE_BOOST )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==RULE_BOOST) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:416:4: this_Boost_20= RULE_BOOST
                                    {
                                    this_Boost_20=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression815); 
                                     
                                        newLeafNode(this_Boost_20, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_1_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:421:6: ( ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:421:6: ( ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:421:7: ( (lv_field_21_0= ruleMethodField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:421:7: ( (lv_field_21_0= ruleMethodField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:422:1: (lv_field_21_0= ruleMethodField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:422:1: (lv_field_21_0= ruleMethodField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:423:3: lv_field_21_0= ruleMethodField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldMethodFieldParserRuleCall_1_1_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMethodField_in_ruleClauseExpression845);
                            lv_field_21_0=ruleMethodField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_21_0, 
                                    		"MethodField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_22=(Token)match(input,16,FOLLOW_16_in_ruleClauseExpression857); 

                                	newLeafNode(otherlv_22, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_2_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:443:1: ( ( (lv_values_23_0= ruleMethodFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) )
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==RULE_NAMEWITHWC) ) {
                                alt21=1;
                            }
                            else if ( (LA21_0==14) ) {
                                alt21=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 21, 0, input);

                                throw nvae;
                            }
                            switch (alt21) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:443:2: ( (lv_values_23_0= ruleMethodFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:443:2: ( (lv_values_23_0= ruleMethodFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:444:1: (lv_values_23_0= ruleMethodFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:444:1: (lv_values_23_0= ruleMethodFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:445:3: lv_values_23_0= ruleMethodFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesMethodFieldValueParserRuleCall_1_1_2_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression879);
                                    lv_values_23_0=ruleMethodFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_23_0, 
                                            		"MethodFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:462:6: (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:462:6: (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:462:8: otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')'
                                    {
                                    otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleClauseExpression898); 

                                        	newLeafNode(otherlv_24, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_2_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:466:1: ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )? )*
                                    loop20:
                                    do {
                                        int alt20=2;
                                        int LA20_0 = input.LA(1);

                                        if ( (LA20_0==RULE_NAMEWITHWC||(LA20_0>=65 && LA20_0<=68)) ) {
                                            alt20=1;
                                        }


                                        switch (alt20) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:466:2: ( ruleUnaryExpression )? ( (lv_values_26_0= ruleMethodFieldValue ) ) (this_Boost_27= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:466:2: ( ruleUnaryExpression )?
                                    	    int alt18=2;
                                    	    int LA18_0 = input.LA(1);

                                    	    if ( ((LA18_0>=65 && LA18_0<=68)) ) {
                                    	        alt18=1;
                                    	    }
                                    	    switch (alt18) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:467:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_2_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression916);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:474:3: ( (lv_values_26_0= ruleMethodFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:475:1: (lv_values_26_0= ruleMethodFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:475:1: (lv_values_26_0= ruleMethodFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:476:3: lv_values_26_0= ruleMethodFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesMethodFieldValueParserRuleCall_1_1_2_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression938);
                                    	    lv_values_26_0=ruleMethodFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_26_0, 
                                    	            		"MethodFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:492:2: (this_Boost_27= RULE_BOOST )?
                                    	    int alt19=2;
                                    	    int LA19_0 = input.LA(1);

                                    	    if ( (LA19_0==RULE_BOOST) ) {
                                    	        alt19=1;
                                    	    }
                                    	    switch (alt19) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:492:3: this_Boost_27= RULE_BOOST
                                    	            {
                                    	            this_Boost_27=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression950); 
                                    	             
                                    	                newLeafNode(this_Boost_27, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_2_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop20;
                                        }
                                    } while (true);

                                    otherlv_28=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression965); 

                                        	newLeafNode(otherlv_28, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_2_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:500:3: (this_Boost_29= RULE_BOOST )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==RULE_BOOST) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:500:4: this_Boost_29= RULE_BOOST
                                    {
                                    this_Boost_29=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression979); 
                                     
                                        newLeafNode(this_Boost_29, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_2_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:505:6: ( ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:505:6: ( ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:505:7: ( (lv_field_30_0= ruleFilePathField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:505:7: ( (lv_field_30_0= ruleFilePathField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:506:1: (lv_field_30_0= ruleFilePathField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:506:1: (lv_field_30_0= ruleFilePathField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:507:3: lv_field_30_0= ruleFilePathField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldFilePathFieldParserRuleCall_1_1_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFilePathField_in_ruleClauseExpression1009);
                            lv_field_30_0=ruleFilePathField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_30_0, 
                                    		"FilePathField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_31=(Token)match(input,16,FOLLOW_16_in_ruleClauseExpression1021); 

                                	newLeafNode(otherlv_31, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_3_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:527:1: ( ( (lv_values_32_0= ruleFilePathFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) )
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==RULE_PATHWITHWC) ) {
                                alt26=1;
                            }
                            else if ( (LA26_0==14) ) {
                                alt26=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 0, input);

                                throw nvae;
                            }
                            switch (alt26) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:527:2: ( (lv_values_32_0= ruleFilePathFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:527:2: ( (lv_values_32_0= ruleFilePathFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:528:1: (lv_values_32_0= ruleFilePathFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:528:1: (lv_values_32_0= ruleFilePathFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:529:3: lv_values_32_0= ruleFilePathFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesFilePathFieldValueParserRuleCall_1_1_3_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression1043);
                                    lv_values_32_0=ruleFilePathFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_32_0, 
                                            		"FilePathFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:546:6: (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:546:6: (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:546:8: otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')'
                                    {
                                    otherlv_33=(Token)match(input,14,FOLLOW_14_in_ruleClauseExpression1062); 

                                        	newLeafNode(otherlv_33, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_3_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:550:1: ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )? )*
                                    loop25:
                                    do {
                                        int alt25=2;
                                        int LA25_0 = input.LA(1);

                                        if ( (LA25_0==RULE_PATHWITHWC||(LA25_0>=65 && LA25_0<=68)) ) {
                                            alt25=1;
                                        }


                                        switch (alt25) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:550:2: ( ruleUnaryExpression )? ( (lv_values_35_0= ruleFilePathFieldValue ) ) (this_Boost_36= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:550:2: ( ruleUnaryExpression )?
                                    	    int alt23=2;
                                    	    int LA23_0 = input.LA(1);

                                    	    if ( ((LA23_0>=65 && LA23_0<=68)) ) {
                                    	        alt23=1;
                                    	    }
                                    	    switch (alt23) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:551:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_3_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1080);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:558:3: ( (lv_values_35_0= ruleFilePathFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:559:1: (lv_values_35_0= ruleFilePathFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:559:1: (lv_values_35_0= ruleFilePathFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:560:3: lv_values_35_0= ruleFilePathFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesFilePathFieldValueParserRuleCall_1_1_3_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression1102);
                                    	    lv_values_35_0=ruleFilePathFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_35_0, 
                                    	            		"FilePathFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:576:2: (this_Boost_36= RULE_BOOST )?
                                    	    int alt24=2;
                                    	    int LA24_0 = input.LA(1);

                                    	    if ( (LA24_0==RULE_BOOST) ) {
                                    	        alt24=1;
                                    	    }
                                    	    switch (alt24) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:576:3: this_Boost_36= RULE_BOOST
                                    	            {
                                    	            this_Boost_36=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1114); 
                                    	             
                                    	                newLeafNode(this_Boost_36, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_3_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop25;
                                        }
                                    } while (true);

                                    otherlv_37=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression1129); 

                                        	newLeafNode(otherlv_37, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_3_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:584:3: (this_Boost_38= RULE_BOOST )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==RULE_BOOST) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:584:4: this_Boost_38= RULE_BOOST
                                    {
                                    this_Boost_38=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1143); 
                                     
                                        newLeafNode(this_Boost_38, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_3_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:589:6: ( ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:589:6: ( ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:589:7: ( (lv_field_39_0= ruleNumberField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:589:7: ( (lv_field_39_0= ruleNumberField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:590:1: (lv_field_39_0= ruleNumberField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:590:1: (lv_field_39_0= ruleNumberField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:591:3: lv_field_39_0= ruleNumberField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldNumberFieldParserRuleCall_1_1_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNumberField_in_ruleClauseExpression1173);
                            lv_field_39_0=ruleNumberField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_39_0, 
                                    		"NumberField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_40=(Token)match(input,16,FOLLOW_16_in_ruleClauseExpression1185); 

                                	newLeafNode(otherlv_40, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_4_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:611:1: ( ( (lv_values_41_0= ruleNumberFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) )
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==RULE_INT) ) {
                                alt31=1;
                            }
                            else if ( (LA31_0==14) ) {
                                alt31=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 0, input);

                                throw nvae;
                            }
                            switch (alt31) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:611:2: ( (lv_values_41_0= ruleNumberFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:611:2: ( (lv_values_41_0= ruleNumberFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:612:1: (lv_values_41_0= ruleNumberFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:612:1: (lv_values_41_0= ruleNumberFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:613:3: lv_values_41_0= ruleNumberFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesNumberFieldValueParserRuleCall_1_1_4_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression1207);
                                    lv_values_41_0=ruleNumberFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_41_0, 
                                            		"NumberFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:630:6: (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:630:6: (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:630:8: otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')'
                                    {
                                    otherlv_42=(Token)match(input,14,FOLLOW_14_in_ruleClauseExpression1226); 

                                        	newLeafNode(otherlv_42, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_4_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:634:1: ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )? )*
                                    loop30:
                                    do {
                                        int alt30=2;
                                        int LA30_0 = input.LA(1);

                                        if ( (LA30_0==RULE_INT||(LA30_0>=65 && LA30_0<=68)) ) {
                                            alt30=1;
                                        }


                                        switch (alt30) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:634:2: ( ruleUnaryExpression )? ( (lv_values_44_0= ruleNumberFieldValue ) ) (this_Boost_45= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:634:2: ( ruleUnaryExpression )?
                                    	    int alt28=2;
                                    	    int LA28_0 = input.LA(1);

                                    	    if ( ((LA28_0>=65 && LA28_0<=68)) ) {
                                    	        alt28=1;
                                    	    }
                                    	    switch (alt28) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:635:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_4_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1244);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:642:3: ( (lv_values_44_0= ruleNumberFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:643:1: (lv_values_44_0= ruleNumberFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:643:1: (lv_values_44_0= ruleNumberFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:644:3: lv_values_44_0= ruleNumberFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesNumberFieldValueParserRuleCall_1_1_4_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression1266);
                                    	    lv_values_44_0=ruleNumberFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_44_0, 
                                    	            		"NumberFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:660:2: (this_Boost_45= RULE_BOOST )?
                                    	    int alt29=2;
                                    	    int LA29_0 = input.LA(1);

                                    	    if ( (LA29_0==RULE_BOOST) ) {
                                    	        alt29=1;
                                    	    }
                                    	    switch (alt29) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:660:3: this_Boost_45= RULE_BOOST
                                    	            {
                                    	            this_Boost_45=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1278); 
                                    	             
                                    	                newLeafNode(this_Boost_45, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_4_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop30;
                                        }
                                    } while (true);

                                    otherlv_46=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression1293); 

                                        	newLeafNode(otherlv_46, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_4_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:668:3: (this_Boost_47= RULE_BOOST )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==RULE_BOOST) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:668:4: this_Boost_47= RULE_BOOST
                                    {
                                    this_Boost_47=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1307); 
                                     
                                        newLeafNode(this_Boost_47, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_4_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:673:6: ( ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:673:6: ( ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:673:7: ( (lv_field_48_0= ruleModifierField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:673:7: ( (lv_field_48_0= ruleModifierField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:674:1: (lv_field_48_0= ruleModifierField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:674:1: (lv_field_48_0= ruleModifierField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:675:3: lv_field_48_0= ruleModifierField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldModifierFieldParserRuleCall_1_1_5_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleModifierField_in_ruleClauseExpression1337);
                            lv_field_48_0=ruleModifierField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_48_0, 
                                    		"ModifierField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_49=(Token)match(input,16,FOLLOW_16_in_ruleClauseExpression1349); 

                                	newLeafNode(otherlv_49, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_5_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:695:1: ( ( (lv_values_50_0= ruleModifierFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) )
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( ((LA36_0>=55 && LA36_0<=60)) ) {
                                alt36=1;
                            }
                            else if ( (LA36_0==14) ) {
                                alt36=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 36, 0, input);

                                throw nvae;
                            }
                            switch (alt36) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:695:2: ( (lv_values_50_0= ruleModifierFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:695:2: ( (lv_values_50_0= ruleModifierFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:696:1: (lv_values_50_0= ruleModifierFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:696:1: (lv_values_50_0= ruleModifierFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:697:3: lv_values_50_0= ruleModifierFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesModifierFieldValueParserRuleCall_1_1_5_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression1371);
                                    lv_values_50_0=ruleModifierFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_50_0, 
                                            		"ModifierFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:714:6: (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:714:6: (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:714:8: otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')'
                                    {
                                    otherlv_51=(Token)match(input,14,FOLLOW_14_in_ruleClauseExpression1390); 

                                        	newLeafNode(otherlv_51, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_5_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:718:1: ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )? )*
                                    loop35:
                                    do {
                                        int alt35=2;
                                        int LA35_0 = input.LA(1);

                                        if ( ((LA35_0>=55 && LA35_0<=60)||(LA35_0>=65 && LA35_0<=68)) ) {
                                            alt35=1;
                                        }


                                        switch (alt35) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:718:2: ( ruleUnaryExpression )? ( (lv_values_53_0= ruleModifierFieldValue ) ) (this_Boost_54= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:718:2: ( ruleUnaryExpression )?
                                    	    int alt33=2;
                                    	    int LA33_0 = input.LA(1);

                                    	    if ( ((LA33_0>=65 && LA33_0<=68)) ) {
                                    	        alt33=1;
                                    	    }
                                    	    switch (alt33) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:719:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_5_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1408);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:726:3: ( (lv_values_53_0= ruleModifierFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:727:1: (lv_values_53_0= ruleModifierFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:727:1: (lv_values_53_0= ruleModifierFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:728:3: lv_values_53_0= ruleModifierFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesModifierFieldValueParserRuleCall_1_1_5_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression1430);
                                    	    lv_values_53_0=ruleModifierFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_53_0, 
                                    	            		"ModifierFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:744:2: (this_Boost_54= RULE_BOOST )?
                                    	    int alt34=2;
                                    	    int LA34_0 = input.LA(1);

                                    	    if ( (LA34_0==RULE_BOOST) ) {
                                    	        alt34=1;
                                    	    }
                                    	    switch (alt34) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:744:3: this_Boost_54= RULE_BOOST
                                    	            {
                                    	            this_Boost_54=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1442); 
                                    	             
                                    	                newLeafNode(this_Boost_54, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_5_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop35;
                                        }
                                    } while (true);

                                    otherlv_55=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression1457); 

                                        	newLeafNode(otherlv_55, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_5_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:752:3: (this_Boost_56= RULE_BOOST )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==RULE_BOOST) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:752:4: this_Boost_56= RULE_BOOST
                                    {
                                    this_Boost_56=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1471); 
                                     
                                        newLeafNode(this_Boost_56, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_5_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 7 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:757:6: ( ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:757:6: ( ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:757:7: ( (lv_field_57_0= ruleTimeField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:757:7: ( (lv_field_57_0= ruleTimeField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:758:1: (lv_field_57_0= ruleTimeField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:758:1: (lv_field_57_0= ruleTimeField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:759:3: lv_field_57_0= ruleTimeField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldTimeFieldParserRuleCall_1_1_6_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTimeField_in_ruleClauseExpression1501);
                            lv_field_57_0=ruleTimeField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_57_0, 
                                    		"TimeField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_58=(Token)match(input,16,FOLLOW_16_in_ruleClauseExpression1513); 

                                	newLeafNode(otherlv_58, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_6_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:779:1: ( ( (lv_values_59_0= ruleTimeFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) )
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==RULE_NAMEWITHWC) ) {
                                alt41=1;
                            }
                            else if ( (LA41_0==14) ) {
                                alt41=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 41, 0, input);

                                throw nvae;
                            }
                            switch (alt41) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:779:2: ( (lv_values_59_0= ruleTimeFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:779:2: ( (lv_values_59_0= ruleTimeFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:780:1: (lv_values_59_0= ruleTimeFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:780:1: (lv_values_59_0= ruleTimeFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:781:3: lv_values_59_0= ruleTimeFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesTimeFieldValueParserRuleCall_1_1_6_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleTimeFieldValue_in_ruleClauseExpression1535);
                                    lv_values_59_0=ruleTimeFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_59_0, 
                                            		"TimeFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:798:6: (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:798:6: (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:798:8: otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')'
                                    {
                                    otherlv_60=(Token)match(input,14,FOLLOW_14_in_ruleClauseExpression1554); 

                                        	newLeafNode(otherlv_60, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_6_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:802:1: ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )? )*
                                    loop40:
                                    do {
                                        int alt40=2;
                                        int LA40_0 = input.LA(1);

                                        if ( (LA40_0==RULE_NAMEWITHWC||(LA40_0>=65 && LA40_0<=68)) ) {
                                            alt40=1;
                                        }


                                        switch (alt40) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:802:2: ( ruleUnaryExpression )? ( (lv_values_62_0= ruleTimeFieldValue ) ) (this_Boost_63= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:802:2: ( ruleUnaryExpression )?
                                    	    int alt38=2;
                                    	    int LA38_0 = input.LA(1);

                                    	    if ( ((LA38_0>=65 && LA38_0<=68)) ) {
                                    	        alt38=1;
                                    	    }
                                    	    switch (alt38) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:803:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_6_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1572);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:810:3: ( (lv_values_62_0= ruleTimeFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:811:1: (lv_values_62_0= ruleTimeFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:811:1: (lv_values_62_0= ruleTimeFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:812:3: lv_values_62_0= ruleTimeFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesTimeFieldValueParserRuleCall_1_1_6_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleTimeFieldValue_in_ruleClauseExpression1594);
                                    	    lv_values_62_0=ruleTimeFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_62_0, 
                                    	            		"TimeFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:828:2: (this_Boost_63= RULE_BOOST )?
                                    	    int alt39=2;
                                    	    int LA39_0 = input.LA(1);

                                    	    if ( (LA39_0==RULE_BOOST) ) {
                                    	        alt39=1;
                                    	    }
                                    	    switch (alt39) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:828:3: this_Boost_63= RULE_BOOST
                                    	            {
                                    	            this_Boost_63=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1606); 
                                    	             
                                    	                newLeafNode(this_Boost_63, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_6_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop40;
                                        }
                                    } while (true);

                                    otherlv_64=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression1621); 

                                        	newLeafNode(otherlv_64, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_6_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:836:3: (this_Boost_65= RULE_BOOST )?
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==RULE_BOOST) ) {
                                alt42=1;
                            }
                            switch (alt42) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:836:4: this_Boost_65= RULE_BOOST
                                    {
                                    this_Boost_65=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1635); 
                                     
                                        newLeafNode(this_Boost_65, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_6_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 8 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:841:6: ( ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:841:6: ( ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:841:7: ( (lv_field_66_0= ruleDocumentTypeField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:841:7: ( (lv_field_66_0= ruleDocumentTypeField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:842:1: (lv_field_66_0= ruleDocumentTypeField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:842:1: (lv_field_66_0= ruleDocumentTypeField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:843:3: lv_field_66_0= ruleDocumentTypeField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldDocumentTypeFieldParserRuleCall_1_1_7_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDocumentTypeField_in_ruleClauseExpression1665);
                            lv_field_66_0=ruleDocumentTypeField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_66_0, 
                                    		"DocumentTypeField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_67=(Token)match(input,16,FOLLOW_16_in_ruleClauseExpression1677); 

                                	newLeafNode(otherlv_67, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_7_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:863:1: ( ( (lv_values_68_0= ruleDocumentTypeFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) )
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( ((LA46_0>=61 && LA46_0<=64)) ) {
                                alt46=1;
                            }
                            else if ( (LA46_0==14) ) {
                                alt46=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 46, 0, input);

                                throw nvae;
                            }
                            switch (alt46) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:863:2: ( (lv_values_68_0= ruleDocumentTypeFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:863:2: ( (lv_values_68_0= ruleDocumentTypeFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:864:1: (lv_values_68_0= ruleDocumentTypeFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:864:1: (lv_values_68_0= ruleDocumentTypeFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:865:3: lv_values_68_0= ruleDocumentTypeFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesDocumentTypeFieldValueParserRuleCall_1_1_7_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression1699);
                                    lv_values_68_0=ruleDocumentTypeFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_68_0, 
                                            		"DocumentTypeFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:882:6: (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:882:6: (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:882:8: otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')'
                                    {
                                    otherlv_69=(Token)match(input,14,FOLLOW_14_in_ruleClauseExpression1718); 

                                        	newLeafNode(otherlv_69, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_7_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:886:1: ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )? )*
                                    loop45:
                                    do {
                                        int alt45=2;
                                        int LA45_0 = input.LA(1);

                                        if ( ((LA45_0>=61 && LA45_0<=68)) ) {
                                            alt45=1;
                                        }


                                        switch (alt45) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:886:2: ( ruleUnaryExpression )? ( (lv_values_71_0= ruleDocumentTypeFieldValue ) ) (this_Boost_72= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:886:2: ( ruleUnaryExpression )?
                                    	    int alt43=2;
                                    	    int LA43_0 = input.LA(1);

                                    	    if ( ((LA43_0>=65 && LA43_0<=68)) ) {
                                    	        alt43=1;
                                    	    }
                                    	    switch (alt43) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:887:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_7_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1736);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:894:3: ( (lv_values_71_0= ruleDocumentTypeFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:895:1: (lv_values_71_0= ruleDocumentTypeFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:895:1: (lv_values_71_0= ruleDocumentTypeFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:896:3: lv_values_71_0= ruleDocumentTypeFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesDocumentTypeFieldValueParserRuleCall_1_1_7_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression1758);
                                    	    lv_values_71_0=ruleDocumentTypeFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_71_0, 
                                    	            		"DocumentTypeFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:912:2: (this_Boost_72= RULE_BOOST )?
                                    	    int alt44=2;
                                    	    int LA44_0 = input.LA(1);

                                    	    if ( (LA44_0==RULE_BOOST) ) {
                                    	        alt44=1;
                                    	    }
                                    	    switch (alt44) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:912:3: this_Boost_72= RULE_BOOST
                                    	            {
                                    	            this_Boost_72=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1770); 
                                    	             
                                    	                newLeafNode(this_Boost_72, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_7_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop45;
                                        }
                                    } while (true);

                                    otherlv_73=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression1785); 

                                        	newLeafNode(otherlv_73, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_7_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:920:3: (this_Boost_74= RULE_BOOST )?
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==RULE_BOOST) ) {
                                alt47=1;
                            }
                            switch (alt47) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:920:4: this_Boost_74= RULE_BOOST
                                    {
                                    this_Boost_74=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1799); 
                                     
                                        newLeafNode(this_Boost_74, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_7_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 9 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:925:6: ( ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:925:6: ( ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:925:7: ( (lv_field_75_0= ruleProjectNameField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:925:7: ( (lv_field_75_0= ruleProjectNameField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:926:1: (lv_field_75_0= ruleProjectNameField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:926:1: (lv_field_75_0= ruleProjectNameField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:927:3: lv_field_75_0= ruleProjectNameField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldProjectNameFieldParserRuleCall_1_1_8_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleProjectNameField_in_ruleClauseExpression1829);
                            lv_field_75_0=ruleProjectNameField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_75_0, 
                                    		"ProjectNameField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_76=(Token)match(input,16,FOLLOW_16_in_ruleClauseExpression1841); 

                                	newLeafNode(otherlv_76, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_8_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:947:1: ( ( (lv_values_77_0= ruleProjectNameFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) )
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==RULE_NAMEWITHWC) ) {
                                alt51=1;
                            }
                            else if ( (LA51_0==14) ) {
                                alt51=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 0, input);

                                throw nvae;
                            }
                            switch (alt51) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:947:2: ( (lv_values_77_0= ruleProjectNameFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:947:2: ( (lv_values_77_0= ruleProjectNameFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:948:1: (lv_values_77_0= ruleProjectNameFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:948:1: (lv_values_77_0= ruleProjectNameFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:949:3: lv_values_77_0= ruleProjectNameFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesProjectNameFieldValueParserRuleCall_1_1_8_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression1863);
                                    lv_values_77_0=ruleProjectNameFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_77_0, 
                                            		"ProjectNameFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:966:6: (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:966:6: (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:966:8: otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')'
                                    {
                                    otherlv_78=(Token)match(input,14,FOLLOW_14_in_ruleClauseExpression1882); 

                                        	newLeafNode(otherlv_78, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_8_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:970:1: ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )? )*
                                    loop50:
                                    do {
                                        int alt50=2;
                                        int LA50_0 = input.LA(1);

                                        if ( (LA50_0==RULE_NAMEWITHWC||(LA50_0>=65 && LA50_0<=68)) ) {
                                            alt50=1;
                                        }


                                        switch (alt50) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:970:2: ( ruleUnaryExpression )? ( (lv_values_80_0= ruleProjectNameFieldValue ) ) (this_Boost_81= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:970:2: ( ruleUnaryExpression )?
                                    	    int alt48=2;
                                    	    int LA48_0 = input.LA(1);

                                    	    if ( ((LA48_0>=65 && LA48_0<=68)) ) {
                                    	        alt48=1;
                                    	    }
                                    	    switch (alt48) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:971:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_8_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1900);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:978:3: ( (lv_values_80_0= ruleProjectNameFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:979:1: (lv_values_80_0= ruleProjectNameFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:979:1: (lv_values_80_0= ruleProjectNameFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:980:3: lv_values_80_0= ruleProjectNameFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesProjectNameFieldValueParserRuleCall_1_1_8_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression1922);
                                    	    lv_values_80_0=ruleProjectNameFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_80_0, 
                                    	            		"ProjectNameFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:996:2: (this_Boost_81= RULE_BOOST )?
                                    	    int alt49=2;
                                    	    int LA49_0 = input.LA(1);

                                    	    if ( (LA49_0==RULE_BOOST) ) {
                                    	        alt49=1;
                                    	    }
                                    	    switch (alt49) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:996:3: this_Boost_81= RULE_BOOST
                                    	            {
                                    	            this_Boost_81=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1934); 
                                    	             
                                    	                newLeafNode(this_Boost_81, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_8_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop50;
                                        }
                                    } while (true);

                                    otherlv_82=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression1949); 

                                        	newLeafNode(otherlv_82, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_8_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1004:3: (this_Boost_83= RULE_BOOST )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==RULE_BOOST) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1004:4: this_Boost_83= RULE_BOOST
                                    {
                                    this_Boost_83=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1963); 
                                     
                                        newLeafNode(this_Boost_83, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_8_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 10 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1009:6: ( ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1009:6: ( ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1009:7: ( (lv_field_84_0= ruleAnnotationField ) ) otherlv_85= ':' ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) ) (this_Boost_92= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1009:7: ( (lv_field_84_0= ruleAnnotationField ) )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1010:1: (lv_field_84_0= ruleAnnotationField )
                            {
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1010:1: (lv_field_84_0= ruleAnnotationField )
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1011:3: lv_field_84_0= ruleAnnotationField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldAnnotationFieldParserRuleCall_1_1_9_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAnnotationField_in_ruleClauseExpression1993);
                            lv_field_84_0=ruleAnnotationField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_84_0, 
                                    		"AnnotationField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_85=(Token)match(input,16,FOLLOW_16_in_ruleClauseExpression2005); 

                                	newLeafNode(otherlv_85, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_9_1());
                                
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1031:1: ( ( (lv_values_86_0= ruleAnnotationFieldValue ) ) | (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' ) )
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==RULE_NAMEWITHWC) ) {
                                alt56=1;
                            }
                            else if ( (LA56_0==14) ) {
                                alt56=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 56, 0, input);

                                throw nvae;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1031:2: ( (lv_values_86_0= ruleAnnotationFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1031:2: ( (lv_values_86_0= ruleAnnotationFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1032:1: (lv_values_86_0= ruleAnnotationFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1032:1: (lv_values_86_0= ruleAnnotationFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1033:3: lv_values_86_0= ruleAnnotationFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesAnnotationFieldValueParserRuleCall_1_1_9_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleAnnotationFieldValue_in_ruleClauseExpression2027);
                                    lv_values_86_0=ruleAnnotationFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_86_0, 
                                            		"AnnotationFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1050:6: (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1050:6: (otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')' )
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1050:8: otherlv_87= '(' ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )* otherlv_91= ')'
                                    {
                                    otherlv_87=(Token)match(input,14,FOLLOW_14_in_ruleClauseExpression2046); 

                                        	newLeafNode(otherlv_87, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_9_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1054:1: ( ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )? )*
                                    loop55:
                                    do {
                                        int alt55=2;
                                        int LA55_0 = input.LA(1);

                                        if ( (LA55_0==RULE_NAMEWITHWC||(LA55_0>=65 && LA55_0<=68)) ) {
                                            alt55=1;
                                        }


                                        switch (alt55) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1054:2: ( ruleUnaryExpression )? ( (lv_values_89_0= ruleAnnotationFieldValue ) ) (this_Boost_90= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1054:2: ( ruleUnaryExpression )?
                                    	    int alt53=2;
                                    	    int LA53_0 = input.LA(1);

                                    	    if ( ((LA53_0>=65 && LA53_0<=68)) ) {
                                    	        alt53=1;
                                    	    }
                                    	    switch (alt53) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1055:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_9_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression2064);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1062:3: ( (lv_values_89_0= ruleAnnotationFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1063:1: (lv_values_89_0= ruleAnnotationFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1063:1: (lv_values_89_0= ruleAnnotationFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1064:3: lv_values_89_0= ruleAnnotationFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesAnnotationFieldValueParserRuleCall_1_1_9_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleAnnotationFieldValue_in_ruleClauseExpression2086);
                                    	    lv_values_89_0=ruleAnnotationFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_89_0, 
                                    	            		"AnnotationFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1080:2: (this_Boost_90= RULE_BOOST )?
                                    	    int alt54=2;
                                    	    int LA54_0 = input.LA(1);

                                    	    if ( (LA54_0==RULE_BOOST) ) {
                                    	        alt54=1;
                                    	    }
                                    	    switch (alt54) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1080:3: this_Boost_90= RULE_BOOST
                                    	            {
                                    	            this_Boost_90=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression2098); 
                                    	             
                                    	                newLeafNode(this_Boost_90, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_9_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop55;
                                        }
                                    } while (true);

                                    otherlv_91=(Token)match(input,15,FOLLOW_15_in_ruleClauseExpression2113); 

                                        	newLeafNode(otherlv_91, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_9_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1088:3: (this_Boost_92= RULE_BOOST )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==RULE_BOOST) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1088:4: this_Boost_92= RULE_BOOST
                                    {
                                    this_Boost_92=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression2127); 
                                     
                                        newLeafNode(this_Boost_92, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_9_3()); 
                                        

                                    }
                                    break;

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


    // $ANTLR start "entryRuleSimpleField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1100:1: entryRuleSimpleField returns [EObject current=null] : iv_ruleSimpleField= ruleSimpleField EOF ;
    public final EObject entryRuleSimpleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1101:2: (iv_ruleSimpleField= ruleSimpleField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1102:2: iv_ruleSimpleField= ruleSimpleField EOF
            {
             newCompositeNode(grammarAccess.getSimpleFieldRule()); 
            pushFollow(FOLLOW_ruleSimpleField_in_entryRuleSimpleField2167);
            iv_ruleSimpleField=ruleSimpleField();

            state._fsp--;

             current =iv_ruleSimpleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleField2177); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1109:1: ruleSimpleField returns [EObject current=null] : ( ( (lv_value_0_0= 'FullyQualifiedName' ) ) | ( (lv_value_1_0= 'FriendlyName' ) ) | ( (lv_value_2_0= 'ReturnVariableExpressions' ) ) | ( (lv_value_3_0= 'AllDeclaredMethodNames' ) ) | ( (lv_value_4_0= 'DeclaredMethodNames' ) ) | ( (lv_value_5_0= 'DeclaredFieldNames' ) ) | ( (lv_value_6_0= 'AllDeclaredFieldNames' ) ) | ( (lv_value_7_0= 'FullText' ) ) | ( (lv_value_8_0= 'FieldsRead' ) ) | ( (lv_value_9_0= 'FieldsWritten' ) ) | ( (lv_value_10_0= 'UsedFieldsInFinally' ) ) | ( (lv_value_11_0= 'UsedFieldsInTry' ) ) ) ;
    public final EObject ruleSimpleField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Token lv_value_5_0=null;
        Token lv_value_6_0=null;
        Token lv_value_7_0=null;
        Token lv_value_8_0=null;
        Token lv_value_9_0=null;
        Token lv_value_10_0=null;
        Token lv_value_11_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1112:28: ( ( ( (lv_value_0_0= 'FullyQualifiedName' ) ) | ( (lv_value_1_0= 'FriendlyName' ) ) | ( (lv_value_2_0= 'ReturnVariableExpressions' ) ) | ( (lv_value_3_0= 'AllDeclaredMethodNames' ) ) | ( (lv_value_4_0= 'DeclaredMethodNames' ) ) | ( (lv_value_5_0= 'DeclaredFieldNames' ) ) | ( (lv_value_6_0= 'AllDeclaredFieldNames' ) ) | ( (lv_value_7_0= 'FullText' ) ) | ( (lv_value_8_0= 'FieldsRead' ) ) | ( (lv_value_9_0= 'FieldsWritten' ) ) | ( (lv_value_10_0= 'UsedFieldsInFinally' ) ) | ( (lv_value_11_0= 'UsedFieldsInTry' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1113:1: ( ( (lv_value_0_0= 'FullyQualifiedName' ) ) | ( (lv_value_1_0= 'FriendlyName' ) ) | ( (lv_value_2_0= 'ReturnVariableExpressions' ) ) | ( (lv_value_3_0= 'AllDeclaredMethodNames' ) ) | ( (lv_value_4_0= 'DeclaredMethodNames' ) ) | ( (lv_value_5_0= 'DeclaredFieldNames' ) ) | ( (lv_value_6_0= 'AllDeclaredFieldNames' ) ) | ( (lv_value_7_0= 'FullText' ) ) | ( (lv_value_8_0= 'FieldsRead' ) ) | ( (lv_value_9_0= 'FieldsWritten' ) ) | ( (lv_value_10_0= 'UsedFieldsInFinally' ) ) | ( (lv_value_11_0= 'UsedFieldsInTry' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1113:1: ( ( (lv_value_0_0= 'FullyQualifiedName' ) ) | ( (lv_value_1_0= 'FriendlyName' ) ) | ( (lv_value_2_0= 'ReturnVariableExpressions' ) ) | ( (lv_value_3_0= 'AllDeclaredMethodNames' ) ) | ( (lv_value_4_0= 'DeclaredMethodNames' ) ) | ( (lv_value_5_0= 'DeclaredFieldNames' ) ) | ( (lv_value_6_0= 'AllDeclaredFieldNames' ) ) | ( (lv_value_7_0= 'FullText' ) ) | ( (lv_value_8_0= 'FieldsRead' ) ) | ( (lv_value_9_0= 'FieldsWritten' ) ) | ( (lv_value_10_0= 'UsedFieldsInFinally' ) ) | ( (lv_value_11_0= 'UsedFieldsInTry' ) ) )
            int alt60=12;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt60=1;
                }
                break;
            case 18:
                {
                alt60=2;
                }
                break;
            case 19:
                {
                alt60=3;
                }
                break;
            case 20:
                {
                alt60=4;
                }
                break;
            case 21:
                {
                alt60=5;
                }
                break;
            case 22:
                {
                alt60=6;
                }
                break;
            case 23:
                {
                alt60=7;
                }
                break;
            case 24:
                {
                alt60=8;
                }
                break;
            case 25:
                {
                alt60=9;
                }
                break;
            case 26:
                {
                alt60=10;
                }
                break;
            case 27:
                {
                alt60=11;
                }
                break;
            case 28:
                {
                alt60=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1113:2: ( (lv_value_0_0= 'FullyQualifiedName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1113:2: ( (lv_value_0_0= 'FullyQualifiedName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1114:1: (lv_value_0_0= 'FullyQualifiedName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1114:1: (lv_value_0_0= 'FullyQualifiedName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1115:3: lv_value_0_0= 'FullyQualifiedName'
                    {
                    lv_value_0_0=(Token)match(input,17,FOLLOW_17_in_ruleSimpleField2220); 

                            newLeafNode(lv_value_0_0, grammarAccess.getSimpleFieldAccess().getValueFullyQualifiedNameKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "FullyQualifiedName");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1129:6: ( (lv_value_1_0= 'FriendlyName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1129:6: ( (lv_value_1_0= 'FriendlyName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1130:1: (lv_value_1_0= 'FriendlyName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1130:1: (lv_value_1_0= 'FriendlyName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1131:3: lv_value_1_0= 'FriendlyName'
                    {
                    lv_value_1_0=(Token)match(input,18,FOLLOW_18_in_ruleSimpleField2257); 

                            newLeafNode(lv_value_1_0, grammarAccess.getSimpleFieldAccess().getValueFriendlyNameKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "FriendlyName");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1145:6: ( (lv_value_2_0= 'ReturnVariableExpressions' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1145:6: ( (lv_value_2_0= 'ReturnVariableExpressions' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1146:1: (lv_value_2_0= 'ReturnVariableExpressions' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1146:1: (lv_value_2_0= 'ReturnVariableExpressions' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1147:3: lv_value_2_0= 'ReturnVariableExpressions'
                    {
                    lv_value_2_0=(Token)match(input,19,FOLLOW_19_in_ruleSimpleField2294); 

                            newLeafNode(lv_value_2_0, grammarAccess.getSimpleFieldAccess().getValueReturnVariableExpressionsKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "ReturnVariableExpressions");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1161:6: ( (lv_value_3_0= 'AllDeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1161:6: ( (lv_value_3_0= 'AllDeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1162:1: (lv_value_3_0= 'AllDeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1162:1: (lv_value_3_0= 'AllDeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1163:3: lv_value_3_0= 'AllDeclaredMethodNames'
                    {
                    lv_value_3_0=(Token)match(input,20,FOLLOW_20_in_ruleSimpleField2331); 

                            newLeafNode(lv_value_3_0, grammarAccess.getSimpleFieldAccess().getValueAllDeclaredMethodNamesKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "AllDeclaredMethodNames");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1177:6: ( (lv_value_4_0= 'DeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1177:6: ( (lv_value_4_0= 'DeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1178:1: (lv_value_4_0= 'DeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1178:1: (lv_value_4_0= 'DeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1179:3: lv_value_4_0= 'DeclaredMethodNames'
                    {
                    lv_value_4_0=(Token)match(input,21,FOLLOW_21_in_ruleSimpleField2368); 

                            newLeafNode(lv_value_4_0, grammarAccess.getSimpleFieldAccess().getValueDeclaredMethodNamesKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "DeclaredMethodNames");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1193:6: ( (lv_value_5_0= 'DeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1193:6: ( (lv_value_5_0= 'DeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1194:1: (lv_value_5_0= 'DeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1194:1: (lv_value_5_0= 'DeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1195:3: lv_value_5_0= 'DeclaredFieldNames'
                    {
                    lv_value_5_0=(Token)match(input,22,FOLLOW_22_in_ruleSimpleField2405); 

                            newLeafNode(lv_value_5_0, grammarAccess.getSimpleFieldAccess().getValueDeclaredFieldNamesKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_5_0, "DeclaredFieldNames");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1209:6: ( (lv_value_6_0= 'AllDeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1209:6: ( (lv_value_6_0= 'AllDeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1210:1: (lv_value_6_0= 'AllDeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1210:1: (lv_value_6_0= 'AllDeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1211:3: lv_value_6_0= 'AllDeclaredFieldNames'
                    {
                    lv_value_6_0=(Token)match(input,23,FOLLOW_23_in_ruleSimpleField2442); 

                            newLeafNode(lv_value_6_0, grammarAccess.getSimpleFieldAccess().getValueAllDeclaredFieldNamesKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_6_0, "AllDeclaredFieldNames");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1225:6: ( (lv_value_7_0= 'FullText' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1225:6: ( (lv_value_7_0= 'FullText' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1226:1: (lv_value_7_0= 'FullText' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1226:1: (lv_value_7_0= 'FullText' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1227:3: lv_value_7_0= 'FullText'
                    {
                    lv_value_7_0=(Token)match(input,24,FOLLOW_24_in_ruleSimpleField2479); 

                            newLeafNode(lv_value_7_0, grammarAccess.getSimpleFieldAccess().getValueFullTextKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_7_0, "FullText");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1241:6: ( (lv_value_8_0= 'FieldsRead' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1241:6: ( (lv_value_8_0= 'FieldsRead' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1242:1: (lv_value_8_0= 'FieldsRead' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1242:1: (lv_value_8_0= 'FieldsRead' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1243:3: lv_value_8_0= 'FieldsRead'
                    {
                    lv_value_8_0=(Token)match(input,25,FOLLOW_25_in_ruleSimpleField2516); 

                            newLeafNode(lv_value_8_0, grammarAccess.getSimpleFieldAccess().getValueFieldsReadKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_8_0, "FieldsRead");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1257:6: ( (lv_value_9_0= 'FieldsWritten' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1257:6: ( (lv_value_9_0= 'FieldsWritten' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1258:1: (lv_value_9_0= 'FieldsWritten' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1258:1: (lv_value_9_0= 'FieldsWritten' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1259:3: lv_value_9_0= 'FieldsWritten'
                    {
                    lv_value_9_0=(Token)match(input,26,FOLLOW_26_in_ruleSimpleField2553); 

                            newLeafNode(lv_value_9_0, grammarAccess.getSimpleFieldAccess().getValueFieldsWrittenKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_9_0, "FieldsWritten");
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1273:6: ( (lv_value_10_0= 'UsedFieldsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1273:6: ( (lv_value_10_0= 'UsedFieldsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1274:1: (lv_value_10_0= 'UsedFieldsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1274:1: (lv_value_10_0= 'UsedFieldsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1275:3: lv_value_10_0= 'UsedFieldsInFinally'
                    {
                    lv_value_10_0=(Token)match(input,27,FOLLOW_27_in_ruleSimpleField2590); 

                            newLeafNode(lv_value_10_0, grammarAccess.getSimpleFieldAccess().getValueUsedFieldsInFinallyKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_10_0, "UsedFieldsInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1289:6: ( (lv_value_11_0= 'UsedFieldsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1289:6: ( (lv_value_11_0= 'UsedFieldsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1290:1: (lv_value_11_0= 'UsedFieldsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1290:1: (lv_value_11_0= 'UsedFieldsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1291:3: lv_value_11_0= 'UsedFieldsInTry'
                    {
                    lv_value_11_0=(Token)match(input,28,FOLLOW_28_in_ruleSimpleField2627); 

                            newLeafNode(lv_value_11_0, grammarAccess.getSimpleFieldAccess().getValueUsedFieldsInTryKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_11_0, "UsedFieldsInTry");
                    	    

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


    // $ANTLR start "entryRuleTypeField"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1312:1: entryRuleTypeField returns [EObject current=null] : iv_ruleTypeField= ruleTypeField EOF ;
    public final EObject entryRuleTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1313:2: (iv_ruleTypeField= ruleTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1314:2: iv_ruleTypeField= ruleTypeField EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldRule()); 
            pushFollow(FOLLOW_ruleTypeField_in_entryRuleTypeField2676);
            iv_ruleTypeField=ruleTypeField();

            state._fsp--;

             current =iv_ruleTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeField2686); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1321:1: ruleTypeField returns [EObject current=null] : ( ( (lv_value_0_0= 'ImplementedTypes' ) ) | ( (lv_value_1_0= 'ExtendedTypes' ) ) | ( (lv_value_2_0= 'UsedTypes' ) ) | ( (lv_value_3_0= 'UsedTypesInTry' ) ) | ( (lv_value_4_0= 'UsedTypesInFinally' ) ) | ( (lv_value_5_0= 'ParameterTypes' ) ) | ( (lv_value_6_0= 'ReturnType' ) ) | ( (lv_value_7_0= 'InstanceofTypes' ) ) | ( (lv_value_8_0= 'AllImplementedTypes' ) ) | ( (lv_value_9_0= 'AllExtendedTypes' ) ) | ( (lv_value_10_0= 'FieldType' ) ) | ( (lv_value_11_0= 'CaughtType' ) ) | ( (lv_value_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_value_13_0= 'DeclaringType' ) ) ) ;
    public final EObject ruleTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Token lv_value_5_0=null;
        Token lv_value_6_0=null;
        Token lv_value_7_0=null;
        Token lv_value_8_0=null;
        Token lv_value_9_0=null;
        Token lv_value_10_0=null;
        Token lv_value_11_0=null;
        Token lv_value_12_0=null;
        Token lv_value_13_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1324:28: ( ( ( (lv_value_0_0= 'ImplementedTypes' ) ) | ( (lv_value_1_0= 'ExtendedTypes' ) ) | ( (lv_value_2_0= 'UsedTypes' ) ) | ( (lv_value_3_0= 'UsedTypesInTry' ) ) | ( (lv_value_4_0= 'UsedTypesInFinally' ) ) | ( (lv_value_5_0= 'ParameterTypes' ) ) | ( (lv_value_6_0= 'ReturnType' ) ) | ( (lv_value_7_0= 'InstanceofTypes' ) ) | ( (lv_value_8_0= 'AllImplementedTypes' ) ) | ( (lv_value_9_0= 'AllExtendedTypes' ) ) | ( (lv_value_10_0= 'FieldType' ) ) | ( (lv_value_11_0= 'CaughtType' ) ) | ( (lv_value_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_value_13_0= 'DeclaringType' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1325:1: ( ( (lv_value_0_0= 'ImplementedTypes' ) ) | ( (lv_value_1_0= 'ExtendedTypes' ) ) | ( (lv_value_2_0= 'UsedTypes' ) ) | ( (lv_value_3_0= 'UsedTypesInTry' ) ) | ( (lv_value_4_0= 'UsedTypesInFinally' ) ) | ( (lv_value_5_0= 'ParameterTypes' ) ) | ( (lv_value_6_0= 'ReturnType' ) ) | ( (lv_value_7_0= 'InstanceofTypes' ) ) | ( (lv_value_8_0= 'AllImplementedTypes' ) ) | ( (lv_value_9_0= 'AllExtendedTypes' ) ) | ( (lv_value_10_0= 'FieldType' ) ) | ( (lv_value_11_0= 'CaughtType' ) ) | ( (lv_value_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_value_13_0= 'DeclaringType' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1325:1: ( ( (lv_value_0_0= 'ImplementedTypes' ) ) | ( (lv_value_1_0= 'ExtendedTypes' ) ) | ( (lv_value_2_0= 'UsedTypes' ) ) | ( (lv_value_3_0= 'UsedTypesInTry' ) ) | ( (lv_value_4_0= 'UsedTypesInFinally' ) ) | ( (lv_value_5_0= 'ParameterTypes' ) ) | ( (lv_value_6_0= 'ReturnType' ) ) | ( (lv_value_7_0= 'InstanceofTypes' ) ) | ( (lv_value_8_0= 'AllImplementedTypes' ) ) | ( (lv_value_9_0= 'AllExtendedTypes' ) ) | ( (lv_value_10_0= 'FieldType' ) ) | ( (lv_value_11_0= 'CaughtType' ) ) | ( (lv_value_12_0= 'DeclaredFieldTypes' ) ) | ( (lv_value_13_0= 'DeclaringType' ) ) )
            int alt61=14;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt61=1;
                }
                break;
            case 30:
                {
                alt61=2;
                }
                break;
            case 31:
                {
                alt61=3;
                }
                break;
            case 32:
                {
                alt61=4;
                }
                break;
            case 33:
                {
                alt61=5;
                }
                break;
            case 34:
                {
                alt61=6;
                }
                break;
            case 35:
                {
                alt61=7;
                }
                break;
            case 36:
                {
                alt61=8;
                }
                break;
            case 37:
                {
                alt61=9;
                }
                break;
            case 38:
                {
                alt61=10;
                }
                break;
            case 39:
                {
                alt61=11;
                }
                break;
            case 40:
                {
                alt61=12;
                }
                break;
            case 41:
                {
                alt61=13;
                }
                break;
            case 42:
                {
                alt61=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1325:2: ( (lv_value_0_0= 'ImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1325:2: ( (lv_value_0_0= 'ImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1326:1: (lv_value_0_0= 'ImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1326:1: (lv_value_0_0= 'ImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1327:3: lv_value_0_0= 'ImplementedTypes'
                    {
                    lv_value_0_0=(Token)match(input,29,FOLLOW_29_in_ruleTypeField2729); 

                            newLeafNode(lv_value_0_0, grammarAccess.getTypeFieldAccess().getValueImplementedTypesKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "ImplementedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1341:6: ( (lv_value_1_0= 'ExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1341:6: ( (lv_value_1_0= 'ExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1342:1: (lv_value_1_0= 'ExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1342:1: (lv_value_1_0= 'ExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1343:3: lv_value_1_0= 'ExtendedTypes'
                    {
                    lv_value_1_0=(Token)match(input,30,FOLLOW_30_in_ruleTypeField2766); 

                            newLeafNode(lv_value_1_0, grammarAccess.getTypeFieldAccess().getValueExtendedTypesKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "ExtendedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1357:6: ( (lv_value_2_0= 'UsedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1357:6: ( (lv_value_2_0= 'UsedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1358:1: (lv_value_2_0= 'UsedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1358:1: (lv_value_2_0= 'UsedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1359:3: lv_value_2_0= 'UsedTypes'
                    {
                    lv_value_2_0=(Token)match(input,31,FOLLOW_31_in_ruleTypeField2803); 

                            newLeafNode(lv_value_2_0, grammarAccess.getTypeFieldAccess().getValueUsedTypesKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "UsedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1373:6: ( (lv_value_3_0= 'UsedTypesInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1373:6: ( (lv_value_3_0= 'UsedTypesInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1374:1: (lv_value_3_0= 'UsedTypesInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1374:1: (lv_value_3_0= 'UsedTypesInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1375:3: lv_value_3_0= 'UsedTypesInTry'
                    {
                    lv_value_3_0=(Token)match(input,32,FOLLOW_32_in_ruleTypeField2840); 

                            newLeafNode(lv_value_3_0, grammarAccess.getTypeFieldAccess().getValueUsedTypesInTryKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "UsedTypesInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1389:6: ( (lv_value_4_0= 'UsedTypesInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1389:6: ( (lv_value_4_0= 'UsedTypesInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1390:1: (lv_value_4_0= 'UsedTypesInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1390:1: (lv_value_4_0= 'UsedTypesInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1391:3: lv_value_4_0= 'UsedTypesInFinally'
                    {
                    lv_value_4_0=(Token)match(input,33,FOLLOW_33_in_ruleTypeField2877); 

                            newLeafNode(lv_value_4_0, grammarAccess.getTypeFieldAccess().getValueUsedTypesInFinallyKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "UsedTypesInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1405:6: ( (lv_value_5_0= 'ParameterTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1405:6: ( (lv_value_5_0= 'ParameterTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1406:1: (lv_value_5_0= 'ParameterTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1406:1: (lv_value_5_0= 'ParameterTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1407:3: lv_value_5_0= 'ParameterTypes'
                    {
                    lv_value_5_0=(Token)match(input,34,FOLLOW_34_in_ruleTypeField2914); 

                            newLeafNode(lv_value_5_0, grammarAccess.getTypeFieldAccess().getValueParameterTypesKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_5_0, "ParameterTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1421:6: ( (lv_value_6_0= 'ReturnType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1421:6: ( (lv_value_6_0= 'ReturnType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1422:1: (lv_value_6_0= 'ReturnType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1422:1: (lv_value_6_0= 'ReturnType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1423:3: lv_value_6_0= 'ReturnType'
                    {
                    lv_value_6_0=(Token)match(input,35,FOLLOW_35_in_ruleTypeField2951); 

                            newLeafNode(lv_value_6_0, grammarAccess.getTypeFieldAccess().getValueReturnTypeKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_6_0, "ReturnType");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1437:6: ( (lv_value_7_0= 'InstanceofTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1437:6: ( (lv_value_7_0= 'InstanceofTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1438:1: (lv_value_7_0= 'InstanceofTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1438:1: (lv_value_7_0= 'InstanceofTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1439:3: lv_value_7_0= 'InstanceofTypes'
                    {
                    lv_value_7_0=(Token)match(input,36,FOLLOW_36_in_ruleTypeField2988); 

                            newLeafNode(lv_value_7_0, grammarAccess.getTypeFieldAccess().getValueInstanceofTypesKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_7_0, "InstanceofTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1453:6: ( (lv_value_8_0= 'AllImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1453:6: ( (lv_value_8_0= 'AllImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1454:1: (lv_value_8_0= 'AllImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1454:1: (lv_value_8_0= 'AllImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1455:3: lv_value_8_0= 'AllImplementedTypes'
                    {
                    lv_value_8_0=(Token)match(input,37,FOLLOW_37_in_ruleTypeField3025); 

                            newLeafNode(lv_value_8_0, grammarAccess.getTypeFieldAccess().getValueAllImplementedTypesKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_8_0, "AllImplementedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1469:6: ( (lv_value_9_0= 'AllExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1469:6: ( (lv_value_9_0= 'AllExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1470:1: (lv_value_9_0= 'AllExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1470:1: (lv_value_9_0= 'AllExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1471:3: lv_value_9_0= 'AllExtendedTypes'
                    {
                    lv_value_9_0=(Token)match(input,38,FOLLOW_38_in_ruleTypeField3062); 

                            newLeafNode(lv_value_9_0, grammarAccess.getTypeFieldAccess().getValueAllExtendedTypesKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_9_0, "AllExtendedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1485:6: ( (lv_value_10_0= 'FieldType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1485:6: ( (lv_value_10_0= 'FieldType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1486:1: (lv_value_10_0= 'FieldType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1486:1: (lv_value_10_0= 'FieldType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1487:3: lv_value_10_0= 'FieldType'
                    {
                    lv_value_10_0=(Token)match(input,39,FOLLOW_39_in_ruleTypeField3099); 

                            newLeafNode(lv_value_10_0, grammarAccess.getTypeFieldAccess().getValueFieldTypeKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_10_0, "FieldType");
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1501:6: ( (lv_value_11_0= 'CaughtType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1501:6: ( (lv_value_11_0= 'CaughtType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1502:1: (lv_value_11_0= 'CaughtType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1502:1: (lv_value_11_0= 'CaughtType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1503:3: lv_value_11_0= 'CaughtType'
                    {
                    lv_value_11_0=(Token)match(input,40,FOLLOW_40_in_ruleTypeField3136); 

                            newLeafNode(lv_value_11_0, grammarAccess.getTypeFieldAccess().getValueCaughtTypeKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_11_0, "CaughtType");
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1517:6: ( (lv_value_12_0= 'DeclaredFieldTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1517:6: ( (lv_value_12_0= 'DeclaredFieldTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1518:1: (lv_value_12_0= 'DeclaredFieldTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1518:1: (lv_value_12_0= 'DeclaredFieldTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1519:3: lv_value_12_0= 'DeclaredFieldTypes'
                    {
                    lv_value_12_0=(Token)match(input,41,FOLLOW_41_in_ruleTypeField3173); 

                            newLeafNode(lv_value_12_0, grammarAccess.getTypeFieldAccess().getValueDeclaredFieldTypesKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_12_0, "DeclaredFieldTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1533:6: ( (lv_value_13_0= 'DeclaringType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1533:6: ( (lv_value_13_0= 'DeclaringType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1534:1: (lv_value_13_0= 'DeclaringType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1534:1: (lv_value_13_0= 'DeclaringType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1535:3: lv_value_13_0= 'DeclaringType'
                    {
                    lv_value_13_0=(Token)match(input,42,FOLLOW_42_in_ruleTypeField3210); 

                            newLeafNode(lv_value_13_0, grammarAccess.getTypeFieldAccess().getValueDeclaringTypeKeyword_13_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_13_0, "DeclaringType");
                    	    

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1556:1: entryRuleMethodField returns [EObject current=null] : iv_ruleMethodField= ruleMethodField EOF ;
    public final EObject entryRuleMethodField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1557:2: (iv_ruleMethodField= ruleMethodField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1558:2: iv_ruleMethodField= ruleMethodField EOF
            {
             newCompositeNode(grammarAccess.getMethodFieldRule()); 
            pushFollow(FOLLOW_ruleMethodField_in_entryRuleMethodField3259);
            iv_ruleMethodField=ruleMethodField();

            state._fsp--;

             current =iv_ruleMethodField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodField3269); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1565:1: ruleMethodField returns [EObject current=null] : ( ( (lv_value_0_0= 'UsedMethods' ) ) | ( (lv_value_1_0= 'UsedMethodsInTry' ) ) | ( (lv_value_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_value_3_0= 'OverriddenMethods' ) ) | ( (lv_value_4_0= 'DeclaredMethods' ) ) ) ;
    public final EObject ruleMethodField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1568:28: ( ( ( (lv_value_0_0= 'UsedMethods' ) ) | ( (lv_value_1_0= 'UsedMethodsInTry' ) ) | ( (lv_value_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_value_3_0= 'OverriddenMethods' ) ) | ( (lv_value_4_0= 'DeclaredMethods' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1569:1: ( ( (lv_value_0_0= 'UsedMethods' ) ) | ( (lv_value_1_0= 'UsedMethodsInTry' ) ) | ( (lv_value_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_value_3_0= 'OverriddenMethods' ) ) | ( (lv_value_4_0= 'DeclaredMethods' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1569:1: ( ( (lv_value_0_0= 'UsedMethods' ) ) | ( (lv_value_1_0= 'UsedMethodsInTry' ) ) | ( (lv_value_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_value_3_0= 'OverriddenMethods' ) ) | ( (lv_value_4_0= 'DeclaredMethods' ) ) )
            int alt62=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt62=1;
                }
                break;
            case 44:
                {
                alt62=2;
                }
                break;
            case 45:
                {
                alt62=3;
                }
                break;
            case 46:
                {
                alt62=4;
                }
                break;
            case 47:
                {
                alt62=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1569:2: ( (lv_value_0_0= 'UsedMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1569:2: ( (lv_value_0_0= 'UsedMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1570:1: (lv_value_0_0= 'UsedMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1570:1: (lv_value_0_0= 'UsedMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1571:3: lv_value_0_0= 'UsedMethods'
                    {
                    lv_value_0_0=(Token)match(input,43,FOLLOW_43_in_ruleMethodField3312); 

                            newLeafNode(lv_value_0_0, grammarAccess.getMethodFieldAccess().getValueUsedMethodsKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "UsedMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1585:6: ( (lv_value_1_0= 'UsedMethodsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1585:6: ( (lv_value_1_0= 'UsedMethodsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1586:1: (lv_value_1_0= 'UsedMethodsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1586:1: (lv_value_1_0= 'UsedMethodsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1587:3: lv_value_1_0= 'UsedMethodsInTry'
                    {
                    lv_value_1_0=(Token)match(input,44,FOLLOW_44_in_ruleMethodField3349); 

                            newLeafNode(lv_value_1_0, grammarAccess.getMethodFieldAccess().getValueUsedMethodsInTryKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "UsedMethodsInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1601:6: ( (lv_value_2_0= 'UsedMethodsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1601:6: ( (lv_value_2_0= 'UsedMethodsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1602:1: (lv_value_2_0= 'UsedMethodsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1602:1: (lv_value_2_0= 'UsedMethodsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1603:3: lv_value_2_0= 'UsedMethodsInFinally'
                    {
                    lv_value_2_0=(Token)match(input,45,FOLLOW_45_in_ruleMethodField3386); 

                            newLeafNode(lv_value_2_0, grammarAccess.getMethodFieldAccess().getValueUsedMethodsInFinallyKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "UsedMethodsInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1617:6: ( (lv_value_3_0= 'OverriddenMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1617:6: ( (lv_value_3_0= 'OverriddenMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1618:1: (lv_value_3_0= 'OverriddenMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1618:1: (lv_value_3_0= 'OverriddenMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1619:3: lv_value_3_0= 'OverriddenMethods'
                    {
                    lv_value_3_0=(Token)match(input,46,FOLLOW_46_in_ruleMethodField3423); 

                            newLeafNode(lv_value_3_0, grammarAccess.getMethodFieldAccess().getValueOverriddenMethodsKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "OverriddenMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1633:6: ( (lv_value_4_0= 'DeclaredMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1633:6: ( (lv_value_4_0= 'DeclaredMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1634:1: (lv_value_4_0= 'DeclaredMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1634:1: (lv_value_4_0= 'DeclaredMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1635:3: lv_value_4_0= 'DeclaredMethods'
                    {
                    lv_value_4_0=(Token)match(input,47,FOLLOW_47_in_ruleMethodField3460); 

                            newLeafNode(lv_value_4_0, grammarAccess.getMethodFieldAccess().getValueDeclaredMethodsKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "DeclaredMethods");
                    	    

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1656:1: entryRuleFilePathField returns [EObject current=null] : iv_ruleFilePathField= ruleFilePathField EOF ;
    public final EObject entryRuleFilePathField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilePathField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1657:2: (iv_ruleFilePathField= ruleFilePathField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1658:2: iv_ruleFilePathField= ruleFilePathField EOF
            {
             newCompositeNode(grammarAccess.getFilePathFieldRule()); 
            pushFollow(FOLLOW_ruleFilePathField_in_entryRuleFilePathField3509);
            iv_ruleFilePathField=ruleFilePathField();

            state._fsp--;

             current =iv_ruleFilePathField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathField3519); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1665:1: ruleFilePathField returns [EObject current=null] : ( (lv_value_0_0= 'ResourcePath' ) ) ;
    public final EObject ruleFilePathField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1668:28: ( ( (lv_value_0_0= 'ResourcePath' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1669:1: ( (lv_value_0_0= 'ResourcePath' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1669:1: ( (lv_value_0_0= 'ResourcePath' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1670:1: (lv_value_0_0= 'ResourcePath' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1670:1: (lv_value_0_0= 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1671:3: lv_value_0_0= 'ResourcePath'
            {
            lv_value_0_0=(Token)match(input,48,FOLLOW_48_in_ruleFilePathField3561); 

                    newLeafNode(lv_value_0_0, grammarAccess.getFilePathFieldAccess().getValueResourcePathKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFilePathFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "ResourcePath");
            	    

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1692:1: entryRuleNumberField returns [EObject current=null] : iv_ruleNumberField= ruleNumberField EOF ;
    public final EObject entryRuleNumberField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1693:2: (iv_ruleNumberField= ruleNumberField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1694:2: iv_ruleNumberField= ruleNumberField EOF
            {
             newCompositeNode(grammarAccess.getNumberFieldRule()); 
            pushFollow(FOLLOW_ruleNumberField_in_entryRuleNumberField3609);
            iv_ruleNumberField=ruleNumberField();

            state._fsp--;

             current =iv_ruleNumberField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberField3619); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1701:1: ruleNumberField returns [EObject current=null] : ( (lv_value_0_0= 'ParameterCount' ) ) ;
    public final EObject ruleNumberField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1704:28: ( ( (lv_value_0_0= 'ParameterCount' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1705:1: ( (lv_value_0_0= 'ParameterCount' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1705:1: ( (lv_value_0_0= 'ParameterCount' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1706:1: (lv_value_0_0= 'ParameterCount' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1706:1: (lv_value_0_0= 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1707:3: lv_value_0_0= 'ParameterCount'
            {
            lv_value_0_0=(Token)match(input,49,FOLLOW_49_in_ruleNumberField3661); 

                    newLeafNode(lv_value_0_0, grammarAccess.getNumberFieldAccess().getValueParameterCountKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "ParameterCount");
            	    

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1728:1: entryRuleModifierField returns [EObject current=null] : iv_ruleModifierField= ruleModifierField EOF ;
    public final EObject entryRuleModifierField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1729:2: (iv_ruleModifierField= ruleModifierField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1730:2: iv_ruleModifierField= ruleModifierField EOF
            {
             newCompositeNode(grammarAccess.getModifierFieldRule()); 
            pushFollow(FOLLOW_ruleModifierField_in_entryRuleModifierField3709);
            iv_ruleModifierField=ruleModifierField();

            state._fsp--;

             current =iv_ruleModifierField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierField3719); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1737:1: ruleModifierField returns [EObject current=null] : ( (lv_value_0_0= 'Modifiers' ) ) ;
    public final EObject ruleModifierField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1740:28: ( ( (lv_value_0_0= 'Modifiers' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1741:1: ( (lv_value_0_0= 'Modifiers' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1741:1: ( (lv_value_0_0= 'Modifiers' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1742:1: (lv_value_0_0= 'Modifiers' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1742:1: (lv_value_0_0= 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1743:3: lv_value_0_0= 'Modifiers'
            {
            lv_value_0_0=(Token)match(input,50,FOLLOW_50_in_ruleModifierField3761); 

                    newLeafNode(lv_value_0_0, grammarAccess.getModifierFieldAccess().getValueModifiersKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModifierFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "Modifiers");
            	    

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1764:1: entryRuleTimeField returns [EObject current=null] : iv_ruleTimeField= ruleTimeField EOF ;
    public final EObject entryRuleTimeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1765:2: (iv_ruleTimeField= ruleTimeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1766:2: iv_ruleTimeField= ruleTimeField EOF
            {
             newCompositeNode(grammarAccess.getTimeFieldRule()); 
            pushFollow(FOLLOW_ruleTimeField_in_entryRuleTimeField3809);
            iv_ruleTimeField=ruleTimeField();

            state._fsp--;

             current =iv_ruleTimeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeField3819); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1773:1: ruleTimeField returns [EObject current=null] : ( (lv_value_0_0= 'Timestamp' ) ) ;
    public final EObject ruleTimeField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1776:28: ( ( (lv_value_0_0= 'Timestamp' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1777:1: ( (lv_value_0_0= 'Timestamp' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1777:1: ( (lv_value_0_0= 'Timestamp' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1778:1: (lv_value_0_0= 'Timestamp' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1778:1: (lv_value_0_0= 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1779:3: lv_value_0_0= 'Timestamp'
            {
            lv_value_0_0=(Token)match(input,51,FOLLOW_51_in_ruleTimeField3861); 

                    newLeafNode(lv_value_0_0, grammarAccess.getTimeFieldAccess().getValueTimestampKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "Timestamp");
            	    

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1800:1: entryRuleDocumentTypeField returns [EObject current=null] : iv_ruleDocumentTypeField= ruleDocumentTypeField EOF ;
    public final EObject entryRuleDocumentTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentTypeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1801:2: (iv_ruleDocumentTypeField= ruleDocumentTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1802:2: iv_ruleDocumentTypeField= ruleDocumentTypeField EOF
            {
             newCompositeNode(grammarAccess.getDocumentTypeFieldRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField3909);
            iv_ruleDocumentTypeField=ruleDocumentTypeField();

            state._fsp--;

             current =iv_ruleDocumentTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeField3919); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1809:1: ruleDocumentTypeField returns [EObject current=null] : ( (lv_value_0_0= 'Type' ) ) ;
    public final EObject ruleDocumentTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1812:28: ( ( (lv_value_0_0= 'Type' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1813:1: ( (lv_value_0_0= 'Type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1813:1: ( (lv_value_0_0= 'Type' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1814:1: (lv_value_0_0= 'Type' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1814:1: (lv_value_0_0= 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1815:3: lv_value_0_0= 'Type'
            {
            lv_value_0_0=(Token)match(input,52,FOLLOW_52_in_ruleDocumentTypeField3961); 

                    newLeafNode(lv_value_0_0, grammarAccess.getDocumentTypeFieldAccess().getValueTypeKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDocumentTypeFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "Type");
            	    

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1836:1: entryRuleProjectNameField returns [EObject current=null] : iv_ruleProjectNameField= ruleProjectNameField EOF ;
    public final EObject entryRuleProjectNameField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectNameField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1837:2: (iv_ruleProjectNameField= ruleProjectNameField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1838:2: iv_ruleProjectNameField= ruleProjectNameField EOF
            {
             newCompositeNode(grammarAccess.getProjectNameFieldRule()); 
            pushFollow(FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField4009);
            iv_ruleProjectNameField=ruleProjectNameField();

            state._fsp--;

             current =iv_ruleProjectNameField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameField4019); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1845:1: ruleProjectNameField returns [EObject current=null] : ( (lv_value_0_0= 'ProjectName' ) ) ;
    public final EObject ruleProjectNameField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1848:28: ( ( (lv_value_0_0= 'ProjectName' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1849:1: ( (lv_value_0_0= 'ProjectName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1849:1: ( (lv_value_0_0= 'ProjectName' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1850:1: (lv_value_0_0= 'ProjectName' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1850:1: (lv_value_0_0= 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1851:3: lv_value_0_0= 'ProjectName'
            {
            lv_value_0_0=(Token)match(input,53,FOLLOW_53_in_ruleProjectNameField4061); 

                    newLeafNode(lv_value_0_0, grammarAccess.getProjectNameFieldAccess().getValueProjectNameKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectNameFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "ProjectName");
            	    

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1872:1: entryRuleAnnotationField returns [EObject current=null] : iv_ruleAnnotationField= ruleAnnotationField EOF ;
    public final EObject entryRuleAnnotationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1873:2: (iv_ruleAnnotationField= ruleAnnotationField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1874:2: iv_ruleAnnotationField= ruleAnnotationField EOF
            {
             newCompositeNode(grammarAccess.getAnnotationFieldRule()); 
            pushFollow(FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField4109);
            iv_ruleAnnotationField=ruleAnnotationField();

            state._fsp--;

             current =iv_ruleAnnotationField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationField4119); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1881:1: ruleAnnotationField returns [EObject current=null] : ( (lv_value_0_0= 'Annotations' ) ) ;
    public final EObject ruleAnnotationField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1884:28: ( ( (lv_value_0_0= 'Annotations' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1885:1: ( (lv_value_0_0= 'Annotations' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1885:1: ( (lv_value_0_0= 'Annotations' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1886:1: (lv_value_0_0= 'Annotations' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1886:1: (lv_value_0_0= 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1887:3: lv_value_0_0= 'Annotations'
            {
            lv_value_0_0=(Token)match(input,54,FOLLOW_54_in_ruleAnnotationField4161); 

                    newLeafNode(lv_value_0_0, grammarAccess.getAnnotationFieldAccess().getValueAnnotationsKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "Annotations");
            	    

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


    // $ANTLR start "entryRuleSimpleFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1908:1: entryRuleSimpleFieldValue returns [String current=null] : iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF ;
    public final String entryRuleSimpleFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1909:2: (iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1910:2: iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleFieldValueRule()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue4210);
            iv_ruleSimpleFieldValue=ruleSimpleFieldValue();

            state._fsp--;

             current =iv_ruleSimpleFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldValue4221); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1917:1: ruleSimpleFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleSimpleFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1920:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1921:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue4260); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1936:1: entryRuleMethodFieldValue returns [String current=null] : iv_ruleMethodFieldValue= ruleMethodFieldValue EOF ;
    public final String entryRuleMethodFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1937:2: (iv_ruleMethodFieldValue= ruleMethodFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1938:2: iv_ruleMethodFieldValue= ruleMethodFieldValue EOF
            {
             newCompositeNode(grammarAccess.getMethodFieldValueRule()); 
            pushFollow(FOLLOW_ruleMethodFieldValue_in_entryRuleMethodFieldValue4305);
            iv_ruleMethodFieldValue=ruleMethodFieldValue();

            state._fsp--;

             current =iv_ruleMethodFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodFieldValue4316); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1945:1: ruleMethodFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleMethodFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1948:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1949:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethodFieldValue4355); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1964:1: entryRuleProjectNameFieldValue returns [String current=null] : iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF ;
    public final String entryRuleProjectNameFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProjectNameFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1965:2: (iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1966:2: iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF
            {
             newCompositeNode(grammarAccess.getProjectNameFieldValueRule()); 
            pushFollow(FOLLOW_ruleProjectNameFieldValue_in_entryRuleProjectNameFieldValue4400);
            iv_ruleProjectNameFieldValue=ruleProjectNameFieldValue();

            state._fsp--;

             current =iv_ruleProjectNameFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameFieldValue4411); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1973:1: ruleProjectNameFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleProjectNameFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1976:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1977:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleProjectNameFieldValue4450); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1992:1: entryRuleNumberFieldValue returns [String current=null] : iv_ruleNumberFieldValue= ruleNumberFieldValue EOF ;
    public final String entryRuleNumberFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1993:2: (iv_ruleNumberFieldValue= ruleNumberFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1994:2: iv_ruleNumberFieldValue= ruleNumberFieldValue EOF
            {
             newCompositeNode(grammarAccess.getNumberFieldValueRule()); 
            pushFollow(FOLLOW_ruleNumberFieldValue_in_entryRuleNumberFieldValue4495);
            iv_ruleNumberFieldValue=ruleNumberFieldValue();

            state._fsp--;

             current =iv_ruleNumberFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFieldValue4506); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2001:1: ruleNumberFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumberFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2004:28: (this_INT_0= RULE_INT )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2005:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberFieldValue4545); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2020:1: entryRuleModifierFieldValue returns [String current=null] : iv_ruleModifierFieldValue= ruleModifierFieldValue EOF ;
    public final String entryRuleModifierFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifierFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2021:2: (iv_ruleModifierFieldValue= ruleModifierFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2022:2: iv_ruleModifierFieldValue= ruleModifierFieldValue EOF
            {
             newCompositeNode(grammarAccess.getModifierFieldValueRule()); 
            pushFollow(FOLLOW_ruleModifierFieldValue_in_entryRuleModifierFieldValue4590);
            iv_ruleModifierFieldValue=ruleModifierFieldValue();

            state._fsp--;

             current =iv_ruleModifierFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierFieldValue4601); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2029:1: ruleModifierFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleModifierFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2032:28: ( (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2033:1: (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2033:1: (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' )
            int alt63=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt63=1;
                }
                break;
            case 56:
                {
                alt63=2;
                }
                break;
            case 57:
                {
                alt63=3;
                }
                break;
            case 58:
                {
                alt63=4;
                }
                break;
            case 59:
                {
                alt63=5;
                }
                break;
            case 60:
                {
                alt63=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2034:2: kw= 'private'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleModifierFieldValue4639); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2041:2: kw= 'public'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleModifierFieldValue4658); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getPublicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2048:2: kw= 'static'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleModifierFieldValue4677); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getStaticKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2055:2: kw= 'final'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleModifierFieldValue4696); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getFinalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2062:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleModifierFieldValue4715); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getAbstractKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2069:2: kw= 'protected'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleModifierFieldValue4734); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2082:1: entryRuleTimeFieldValue returns [String current=null] : iv_ruleTimeFieldValue= ruleTimeFieldValue EOF ;
    public final String entryRuleTimeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2083:2: (iv_ruleTimeFieldValue= ruleTimeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2084:2: iv_ruleTimeFieldValue= ruleTimeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getTimeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTimeFieldValue_in_entryRuleTimeFieldValue4775);
            iv_ruleTimeFieldValue=ruleTimeFieldValue();

            state._fsp--;

             current =iv_ruleTimeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeFieldValue4786); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2091:1: ruleTimeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleTimeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2094:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2095:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleTimeFieldValue4825); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2110:1: entryRuleDocumentTypeFieldValue returns [String current=null] : iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF ;
    public final String entryRuleDocumentTypeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDocumentTypeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2111:2: (iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2112:2: iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getDocumentTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_entryRuleDocumentTypeFieldValue4870);
            iv_ruleDocumentTypeFieldValue=ruleDocumentTypeFieldValue();

            state._fsp--;

             current =iv_ruleDocumentTypeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeFieldValue4881); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2119:1: ruleDocumentTypeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' ) ;
    public final AntlrDatatypeRuleToken ruleDocumentTypeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2122:28: ( (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2123:1: (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2123:1: (kw= 'class' | kw= 'method' | kw= 'field' | kw= 'trycatch' )
            int alt64=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt64=1;
                }
                break;
            case 62:
                {
                alt64=2;
                }
                break;
            case 63:
                {
                alt64=3;
                }
                break;
            case 64:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2124:2: kw= 'class'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleDocumentTypeFieldValue4919); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getClassKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2131:2: kw= 'method'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleDocumentTypeFieldValue4938); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getMethodKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2138:2: kw= 'field'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleDocumentTypeFieldValue4957); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getFieldKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2145:2: kw= 'trycatch'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleDocumentTypeFieldValue4976); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2158:1: entryRuleAnnotationFieldValue returns [String current=null] : iv_ruleAnnotationFieldValue= ruleAnnotationFieldValue EOF ;
    public final String entryRuleAnnotationFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2159:2: (iv_ruleAnnotationFieldValue= ruleAnnotationFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2160:2: iv_ruleAnnotationFieldValue= ruleAnnotationFieldValue EOF
            {
             newCompositeNode(grammarAccess.getAnnotationFieldValueRule()); 
            pushFollow(FOLLOW_ruleAnnotationFieldValue_in_entryRuleAnnotationFieldValue5017);
            iv_ruleAnnotationFieldValue=ruleAnnotationFieldValue();

            state._fsp--;

             current =iv_ruleAnnotationFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationFieldValue5028); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2167:1: ruleAnnotationFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleAnnotationFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2170:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2171:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleAnnotationFieldValue5067); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2186:1: entryRuleTypeFieldValue returns [String current=null] : iv_ruleTypeFieldValue= ruleTypeFieldValue EOF ;
    public final String entryRuleTypeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2187:2: (iv_ruleTypeFieldValue= ruleTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2188:2: iv_ruleTypeFieldValue= ruleTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue5112);
            iv_ruleTypeFieldValue=ruleTypeFieldValue();

            state._fsp--;

             current =iv_ruleTypeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldValue5123); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2195:1: ruleTypeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleTypeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2198:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2199:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue5162); 

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


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2214:1: entryRuleUnaryExpression returns [String current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final String entryRuleUnaryExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryExpression = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2215:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2216:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression5207);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression5218); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2223:1: ruleUnaryExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2226:28: ( (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2227:1: (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2227:1: (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt65=1;
                }
                break;
            case 66:
                {
                alt65=2;
                }
                break;
            case 67:
                {
                alt65=3;
                }
                break;
            case 68:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2228:2: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleUnaryExpression5256); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2235:2: kw= 'NOT'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleUnaryExpression5275); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getNOTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2242:2: kw= '!'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleUnaryExpression5294); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2249:2: kw= '+'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleUnaryExpression5313); 

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


    // $ANTLR start "entryRuleFilePathFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2262:1: entryRuleFilePathFieldValue returns [String current=null] : iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF ;
    public final String entryRuleFilePathFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePathFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2263:2: (iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2264:2: iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF
            {
             newCompositeNode(grammarAccess.getFilePathFieldValueRule()); 
            pushFollow(FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue5354);
            iv_ruleFilePathFieldValue=ruleFilePathFieldValue();

            state._fsp--;

             current =iv_ruleFilePathFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathFieldValue5365); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2271:1: ruleFilePathFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PathWithWC_0= RULE_PATHWITHWC ;
    public final AntlrDatatypeRuleToken ruleFilePathFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PathWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2274:28: (this_PathWithWC_0= RULE_PATHWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2275:5: this_PathWithWC_0= RULE_PATHWITHWC
            {
            this_PathWithWC_0=(Token)match(input,RULE_PATHWITHWC,FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue5404); 

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


    // $ANTLR start "ruleBinaryExp"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2290:1: ruleBinaryExp returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= '||' ) ) ;
    public final Enumerator ruleBinaryExp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2292:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= '||' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2293:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= '||' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2293:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= '||' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt66=1;
                }
                break;
            case 70:
                {
                alt66=2;
                }
                break;
            case 71:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2293:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2293:2: (enumLiteral_0= 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2293:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleBinaryExp5462); 

                            current = grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2299:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2299:6: (enumLiteral_1= 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2299:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleBinaryExp5479); 

                            current = grammarAccess.getBinaryExpAccess().getOr1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryExpAccess().getOr1EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2305:6: (enumLiteral_2= '||' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2305:6: (enumLiteral_2= '||' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2305:8: enumLiteral_2= '||'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_71_in_ruleBinaryExp5496); 

                            current = grammarAccess.getBinaryExpAccess().getOr2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBinaryExpAccess().getOr2EnumLiteralDeclaration_2()); 
                        

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
    public static final BitSet FOLLOW_ruleExp2_in_ruleExp1132 = new BitSet(new long[]{0x007FFFFFFFFE4022L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleBinaryExp_in_ruleExp1162 = new BitSet(new long[]{0x007FFFFFFFFE4020L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleExp1_in_ruleExp1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_entryRuleExp2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_ruleExp2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleExp2302 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExp2315 = new BitSet(new long[]{0x007FFFFFFFFE4020L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleExp1_in_ruleExp2337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExp2348 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleExp2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClauseExpression408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression450 = new BitSet(new long[]{0x007FFFFFFFFE0020L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression474 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_ruleClauseExpression517 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClauseExpression529 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression551 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14_in_ruleClauseExpression570 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression610 = new BitSet(new long[]{0x0000000000008030L,0x000000000000001EL});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression622 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression637 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_ruleClauseExpression681 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClauseExpression693 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression715 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14_in_ruleClauseExpression734 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression774 = new BitSet(new long[]{0x0000000000008030L,0x000000000000001EL});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression786 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression801 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_ruleClauseExpression845 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClauseExpression857 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression879 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14_in_ruleClauseExpression898 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression916 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression938 = new BitSet(new long[]{0x0000000000008030L,0x000000000000001EL});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression950 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression965 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_ruleClauseExpression1009 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClauseExpression1021 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression1043 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14_in_ruleClauseExpression1062 = new BitSet(new long[]{0x0000000000008080L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1080 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression1102 = new BitSet(new long[]{0x0000000000008090L,0x000000000000001EL});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1114 = new BitSet(new long[]{0x0000000000008080L,0x000000000000001EL});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression1129 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_ruleClauseExpression1173 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClauseExpression1185 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression1207 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14_in_ruleClauseExpression1226 = new BitSet(new long[]{0x0000000000008040L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1244 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression1266 = new BitSet(new long[]{0x0000000000008050L,0x000000000000001EL});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1278 = new BitSet(new long[]{0x0000000000008040L,0x000000000000001EL});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression1293 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_ruleClauseExpression1337 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClauseExpression1349 = new BitSet(new long[]{0x1F80000000004000L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression1371 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14_in_ruleClauseExpression1390 = new BitSet(new long[]{0x1F80000000008000L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1408 = new BitSet(new long[]{0x1F80000000000000L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression1430 = new BitSet(new long[]{0x1F80000000008010L,0x000000000000001EL});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1442 = new BitSet(new long[]{0x1F80000000008000L,0x000000000000001EL});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression1457 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_ruleClauseExpression1501 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClauseExpression1513 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_ruleClauseExpression1535 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14_in_ruleClauseExpression1554 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1572 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_ruleClauseExpression1594 = new BitSet(new long[]{0x0000000000008030L,0x000000000000001EL});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1606 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression1621 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_ruleClauseExpression1665 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClauseExpression1677 = new BitSet(new long[]{0xE000000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression1699 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14_in_ruleClauseExpression1718 = new BitSet(new long[]{0xE000000000008000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1736 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression1758 = new BitSet(new long[]{0xE000000000008010L,0x000000000000001FL});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1770 = new BitSet(new long[]{0xE000000000008000L,0x000000000000001FL});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression1785 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_ruleClauseExpression1829 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClauseExpression1841 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression1863 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14_in_ruleClauseExpression1882 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1900 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression1922 = new BitSet(new long[]{0x0000000000008030L,0x000000000000001EL});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1934 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression1949 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_ruleClauseExpression1993 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleClauseExpression2005 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_ruleClauseExpression2027 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14_in_ruleClauseExpression2046 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression2064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_ruleClauseExpression2086 = new BitSet(new long[]{0x0000000000008030L,0x000000000000001EL});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression2098 = new BitSet(new long[]{0x0000000000008020L,0x000000000000001EL});
    public static final BitSet FOLLOW_15_in_ruleClauseExpression2113 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_entryRuleSimpleField2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleField2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSimpleField2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSimpleField2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSimpleField2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSimpleField2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSimpleField2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSimpleField2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSimpleField2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSimpleField2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSimpleField2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSimpleField2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSimpleField2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSimpleField2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_entryRuleTypeField2676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeField2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTypeField2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTypeField2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTypeField2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTypeField2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTypeField2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTypeField2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTypeField2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTypeField2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTypeField3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTypeField3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeField3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTypeField3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTypeField3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTypeField3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_entryRuleMethodField3259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodField3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMethodField3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMethodField3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMethodField3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMethodField3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMethodField3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_entryRuleFilePathField3509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathField3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFilePathField3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_entryRuleNumberField3609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberField3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNumberField3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_entryRuleModifierField3709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierField3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleModifierField3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeField_in_entryRuleTimeField3809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeField3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTimeField3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField3909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeField3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDocumentTypeField3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField4009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameField4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleProjectNameField4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationField_in_entryRuleAnnotationField4109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationField4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAnnotationField4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue4210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldValue4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_entryRuleMethodFieldValue4305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodFieldValue4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethodFieldValue4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_entryRuleProjectNameFieldValue4400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameFieldValue4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleProjectNameFieldValue4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_entryRuleNumberFieldValue4495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFieldValue4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberFieldValue4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_entryRuleModifierFieldValue4590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierFieldValue4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleModifierFieldValue4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleModifierFieldValue4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleModifierFieldValue4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleModifierFieldValue4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleModifierFieldValue4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleModifierFieldValue4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeFieldValue_in_entryRuleTimeFieldValue4775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeFieldValue4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleTimeFieldValue4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_entryRuleDocumentTypeFieldValue4870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeFieldValue4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDocumentTypeFieldValue4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDocumentTypeFieldValue4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDocumentTypeFieldValue4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDocumentTypeFieldValue4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationFieldValue_in_entryRuleAnnotationFieldValue5017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationFieldValue5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleAnnotationFieldValue5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue5112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldValue5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression5207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleUnaryExpression5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleUnaryExpression5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleUnaryExpression5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleUnaryExpression5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue5354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathFieldValue5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBinaryExp5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBinaryExp5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleBinaryExp5496 = new BitSet(new long[]{0x0000000000000002L});

}