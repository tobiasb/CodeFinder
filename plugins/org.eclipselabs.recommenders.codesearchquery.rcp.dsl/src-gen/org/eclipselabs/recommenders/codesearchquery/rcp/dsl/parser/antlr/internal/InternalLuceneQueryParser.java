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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'/'", "'.'", "'*'", "'?'", "'FullyQualifiedName'", "'Type'", "'FriendlyName'", "'DeclaredMethods'", "'ParameterCount'", "'ReturnVariableEexpressions'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'ProjectName'", "'ResourcePath'", "'Modifiers'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'DeclaredFieldTypes'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'", "'Annotations'", "'Timestamp'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'DeclaringType'", "'CaughtType'", "'InstanceofTypes'", "'AND'", "'OR'", "'-'", "'NOT'", "'!'", "'+'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
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
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:77:1: ruleExp1 returns [EObject current=null] : (this_Exp2_0= ruleExp2 ( () ( (lv_b_2_0= ruleBooleanExp ) ) ( (lv_right_3_0= ruleExp2 ) ) )* ) ;
    public final EObject ruleExp1() throws RecognitionException {
        EObject current = null;

        EObject this_Exp2_0 = null;

        Enumerator lv_b_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:80:28: ( (this_Exp2_0= ruleExp2 ( () ( (lv_b_2_0= ruleBooleanExp ) ) ( (lv_right_3_0= ruleExp2 ) ) )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:81:1: (this_Exp2_0= ruleExp2 ( () ( (lv_b_2_0= ruleBooleanExp ) ) ( (lv_right_3_0= ruleExp2 ) ) )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:81:1: (this_Exp2_0= ruleExp2 ( () ( (lv_b_2_0= ruleBooleanExp ) ) ( (lv_right_3_0= ruleExp2 ) ) )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:82:5: this_Exp2_0= ruleExp2 ( () ( (lv_b_2_0= ruleBooleanExp ) ) ( (lv_right_3_0= ruleExp2 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExp1Access().getExp2ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExp2_in_ruleExp1132);
            this_Exp2_0=ruleExp2();

            state._fsp--;

             
                    current = this_Exp2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:90:1: ( () ( (lv_b_2_0= ruleBooleanExp ) ) ( (lv_right_3_0= ruleExp2 ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=56 && LA1_0<=57)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:90:2: () ( (lv_b_2_0= ruleBooleanExp ) ) ( (lv_right_3_0= ruleExp2 ) )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:90:2: ()
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:91:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExp1Access().getExp1LeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:96:2: ( (lv_b_2_0= ruleBooleanExp ) )
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:97:1: (lv_b_2_0= ruleBooleanExp )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:97:1: (lv_b_2_0= ruleBooleanExp )
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:98:3: lv_b_2_0= ruleBooleanExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExp1Access().getBBooleanExpEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanExp_in_ruleExp1162);
            	    lv_b_2_0=ruleBooleanExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExp1Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"b",
            	            		lv_b_2_0, 
            	            		"BooleanExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:114:2: ( (lv_right_3_0= ruleExp2 ) )
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:115:1: (lv_right_3_0= ruleExp2 )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:115:1: (lv_right_3_0= ruleExp2 )
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:116:3: lv_right_3_0= ruleExp2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExp1Access().getRightExp2ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExp2_in_ruleExp1183);
            	    lv_right_3_0=ruleExp2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExp1Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Exp2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
            pushFollow(FOLLOW_ruleExp2_in_entryRuleExp2221);
            iv_ruleExp2=ruleExp2();

            state._fsp--;

             current =iv_ruleExp2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp2231); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:149:1: ruleExp2 returns [EObject current=null] : ( ( (lv_value_0_0= ruleClauseExpression ) ) | (otherlv_1= '(' this_Exp1_2= ruleExp1 otherlv_3= ')' ) ) ;
    public final EObject ruleExp2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_0_0 = null;

        EObject this_Exp1_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:152:28: ( ( ( (lv_value_0_0= ruleClauseExpression ) ) | (otherlv_1= '(' this_Exp1_2= ruleExp1 otherlv_3= ')' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:153:1: ( ( (lv_value_0_0= ruleClauseExpression ) ) | (otherlv_1= '(' this_Exp1_2= ruleExp1 otherlv_3= ')' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:153:1: ( ( (lv_value_0_0= ruleClauseExpression ) ) | (otherlv_1= '(' this_Exp1_2= ruleExp1 otherlv_3= ')' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=55)||(LA2_0>=58 && LA2_0<=61)) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
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
                    	    
                    pushFollow(FOLLOW_ruleClauseExpression_in_ruleExp2277);
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:6: (otherlv_1= '(' this_Exp1_2= ruleExp1 otherlv_3= ')' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:6: (otherlv_1= '(' this_Exp1_2= ruleExp1 otherlv_3= ')' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:172:8: otherlv_1= '(' this_Exp1_2= ruleExp1 otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleExp2296); 

                        	newLeafNode(otherlv_1, grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleExp1_in_ruleExp2318);
                    this_Exp1_2=ruleExp1();

                    state._fsp--;

                     
                            current = this_Exp1_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleExp2329); 

                        	newLeafNode(otherlv_3, grammarAccess.getExp2Access().getRightParenthesisKeyword_1_2());
                        

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:197:1: entryRuleClauseExpression returns [EObject current=null] : iv_ruleClauseExpression= ruleClauseExpression EOF ;
    public final EObject entryRuleClauseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClauseExpression = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:198:2: (iv_ruleClauseExpression= ruleClauseExpression EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:199:2: iv_ruleClauseExpression= ruleClauseExpression EOF
            {
             newCompositeNode(grammarAccess.getClauseExpressionRule()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression366);
            iv_ruleClauseExpression=ruleClauseExpression();

            state._fsp--;

             current =iv_ruleClauseExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClauseExpression376); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:206:1: ruleClauseExpression returns [EObject current=null] : ( ( ( (lv_n_0_0= ruleNotExpression ) ) | ( (lv_m_1_0= ruleMustExpression ) ) )? ( ( (lv_clause_2_0= ruleSimpleClause ) ) | ( (lv_clause_3_0= ruleTypeClause ) ) ) ) ;
    public final EObject ruleClauseExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_n_0_0 = null;

        Enumerator lv_m_1_0 = null;

        EObject lv_clause_2_0 = null;

        EObject lv_clause_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:209:28: ( ( ( ( (lv_n_0_0= ruleNotExpression ) ) | ( (lv_m_1_0= ruleMustExpression ) ) )? ( ( (lv_clause_2_0= ruleSimpleClause ) ) | ( (lv_clause_3_0= ruleTypeClause ) ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:1: ( ( ( (lv_n_0_0= ruleNotExpression ) ) | ( (lv_m_1_0= ruleMustExpression ) ) )? ( ( (lv_clause_2_0= ruleSimpleClause ) ) | ( (lv_clause_3_0= ruleTypeClause ) ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:1: ( ( ( (lv_n_0_0= ruleNotExpression ) ) | ( (lv_m_1_0= ruleMustExpression ) ) )? ( ( (lv_clause_2_0= ruleSimpleClause ) ) | ( (lv_clause_3_0= ruleTypeClause ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:2: ( ( (lv_n_0_0= ruleNotExpression ) ) | ( (lv_m_1_0= ruleMustExpression ) ) )? ( ( (lv_clause_2_0= ruleSimpleClause ) ) | ( (lv_clause_3_0= ruleTypeClause ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:2: ( ( (lv_n_0_0= ruleNotExpression ) ) | ( (lv_m_1_0= ruleMustExpression ) ) )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=58 && LA3_0<=60)) ) {
                alt3=1;
            }
            else if ( (LA3_0==61) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:3: ( (lv_n_0_0= ruleNotExpression ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:3: ( (lv_n_0_0= ruleNotExpression ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:211:1: (lv_n_0_0= ruleNotExpression )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:211:1: (lv_n_0_0= ruleNotExpression )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:212:3: lv_n_0_0= ruleNotExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getNNotExpressionEnumRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleClauseExpression423);
                    lv_n_0_0=ruleNotExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"n",
                            		lv_n_0_0, 
                            		"NotExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:229:6: ( (lv_m_1_0= ruleMustExpression ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:229:6: ( (lv_m_1_0= ruleMustExpression ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:230:1: (lv_m_1_0= ruleMustExpression )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:230:1: (lv_m_1_0= ruleMustExpression )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:231:3: lv_m_1_0= ruleMustExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getMMustExpressionEnumRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMustExpression_in_ruleClauseExpression450);
                    lv_m_1_0=ruleMustExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"m",
                            		lv_m_1_0, 
                            		"MustExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:247:4: ( ( (lv_clause_2_0= ruleSimpleClause ) ) | ( (lv_clause_3_0= ruleTypeClause ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=18 && LA4_0<=42)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=43 && LA4_0<=55)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:247:5: ( (lv_clause_2_0= ruleSimpleClause ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:247:5: ( (lv_clause_2_0= ruleSimpleClause ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:248:1: (lv_clause_2_0= ruleSimpleClause )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:248:1: (lv_clause_2_0= ruleSimpleClause )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:249:3: lv_clause_2_0= ruleSimpleClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getClauseSimpleClauseParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleClause_in_ruleClauseExpression474);
                    lv_clause_2_0=ruleSimpleClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"clause",
                            		lv_clause_2_0, 
                            		"SimpleClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:266:6: ( (lv_clause_3_0= ruleTypeClause ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:266:6: ( (lv_clause_3_0= ruleTypeClause ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:267:1: (lv_clause_3_0= ruleTypeClause )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:267:1: (lv_clause_3_0= ruleTypeClause )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:268:3: lv_clause_3_0= ruleTypeClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getClauseTypeClauseParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeClause_in_ruleClauseExpression501);
                    lv_clause_3_0=ruleTypeClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"clause",
                            		lv_clause_3_0, 
                            		"TypeClause");
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
    // $ANTLR end "ruleClauseExpression"


    // $ANTLR start "entryRuleSimpleClause"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:292:1: entryRuleSimpleClause returns [EObject current=null] : iv_ruleSimpleClause= ruleSimpleClause EOF ;
    public final EObject entryRuleSimpleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleClause = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:293:2: (iv_ruleSimpleClause= ruleSimpleClause EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:294:2: iv_ruleSimpleClause= ruleSimpleClause EOF
            {
             newCompositeNode(grammarAccess.getSimpleClauseRule()); 
            pushFollow(FOLLOW_ruleSimpleClause_in_entryRuleSimpleClause538);
            iv_ruleSimpleClause=ruleSimpleClause();

            state._fsp--;

             current =iv_ruleSimpleClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleClause548); 

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
    // $ANTLR end "entryRuleSimpleClause"


    // $ANTLR start "ruleSimpleClause"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:301:1: ruleSimpleClause returns [EObject current=null] : ( ( (lv_field_0_0= ruleFieldName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleFieldValue ) ) ) ;
    public final EObject ruleSimpleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_field_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:304:28: ( ( ( (lv_field_0_0= ruleFieldName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleFieldValue ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:305:1: ( ( (lv_field_0_0= ruleFieldName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleFieldValue ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:305:1: ( ( (lv_field_0_0= ruleFieldName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleFieldValue ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:305:2: ( (lv_field_0_0= ruleFieldName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleFieldValue ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:305:2: ( (lv_field_0_0= ruleFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:306:1: (lv_field_0_0= ruleFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:306:1: (lv_field_0_0= ruleFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:307:3: lv_field_0_0= ruleFieldName
            {
             
            	        newCompositeNode(grammarAccess.getSimpleClauseAccess().getFieldFieldNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFieldName_in_ruleSimpleClause594);
            lv_field_0_0=ruleFieldName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleClauseRule());
            	        }
                   		set(
                   			current, 
                   			"field",
                    		lv_field_0_0, 
                    		"FieldName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleSimpleClause606); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleClauseAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:327:1: ( (lv_value_2_0= ruleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:328:1: (lv_value_2_0= ruleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:328:1: (lv_value_2_0= ruleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:329:3: lv_value_2_0= ruleFieldValue
            {
             
            	        newCompositeNode(grammarAccess.getSimpleClauseAccess().getValueFieldValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFieldValue_in_ruleSimpleClause627);
            lv_value_2_0=ruleFieldValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleClauseRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"FieldValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSimpleClause"


    // $ANTLR start "entryRuleTypeClause"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:353:1: entryRuleTypeClause returns [EObject current=null] : iv_ruleTypeClause= ruleTypeClause EOF ;
    public final EObject entryRuleTypeClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeClause = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:354:2: (iv_ruleTypeClause= ruleTypeClause EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:355:2: iv_ruleTypeClause= ruleTypeClause EOF
            {
             newCompositeNode(grammarAccess.getTypeClauseRule()); 
            pushFollow(FOLLOW_ruleTypeClause_in_entryRuleTypeClause663);
            iv_ruleTypeClause=ruleTypeClause();

            state._fsp--;

             current =iv_ruleTypeClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeClause673); 

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
    // $ANTLR end "entryRuleTypeClause"


    // $ANTLR start "ruleTypeClause"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:362:1: ruleTypeClause returns [EObject current=null] : ( ( (lv_field_0_0= ruleTypeFieldName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleTypeValue ) ) ) ;
    public final EObject ruleTypeClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_field_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:365:28: ( ( ( (lv_field_0_0= ruleTypeFieldName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleTypeValue ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:366:1: ( ( (lv_field_0_0= ruleTypeFieldName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleTypeValue ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:366:1: ( ( (lv_field_0_0= ruleTypeFieldName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleTypeValue ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:366:2: ( (lv_field_0_0= ruleTypeFieldName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleTypeValue ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:366:2: ( (lv_field_0_0= ruleTypeFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:367:1: (lv_field_0_0= ruleTypeFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:367:1: (lv_field_0_0= ruleTypeFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:368:3: lv_field_0_0= ruleTypeFieldName
            {
             
            	        newCompositeNode(grammarAccess.getTypeClauseAccess().getFieldTypeFieldNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeFieldName_in_ruleTypeClause719);
            lv_field_0_0=ruleTypeFieldName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeClauseRule());
            	        }
                   		set(
                   			current, 
                   			"field",
                    		lv_field_0_0, 
                    		"TypeFieldName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleTypeClause731); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeClauseAccess().getColonKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:388:1: ( (lv_value_2_0= ruleTypeValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:389:1: (lv_value_2_0= ruleTypeValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:389:1: (lv_value_2_0= ruleTypeValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:390:3: lv_value_2_0= ruleTypeValue
            {
             
            	        newCompositeNode(grammarAccess.getTypeClauseAccess().getValueTypeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeValue_in_ruleTypeClause752);
            lv_value_2_0=ruleTypeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeClauseRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"TypeValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTypeClause"


    // $ANTLR start "entryRuleFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:414:1: entryRuleFieldValue returns [String current=null] : iv_ruleFieldValue= ruleFieldValue EOF ;
    public final String entryRuleFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:415:2: (iv_ruleFieldValue= ruleFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:416:2: iv_ruleFieldValue= ruleFieldValue EOF
            {
             newCompositeNode(grammarAccess.getFieldValueRule()); 
            pushFollow(FOLLOW_ruleFieldValue_in_entryRuleFieldValue789);
            iv_ruleFieldValue=ruleFieldValue();

            state._fsp--;

             current =iv_ruleFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldValue800); 

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
    // $ANTLR end "entryRuleFieldValue"


    // $ANTLR start "ruleFieldValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:423:1: ruleFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Value_0= ruleValue ;
    public final AntlrDatatypeRuleToken ruleFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Value_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:426:28: (this_Value_0= ruleValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:428:5: this_Value_0= ruleValue
            {
             
                    newCompositeNode(grammarAccess.getFieldValueAccess().getValueParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleFieldValue846);
            this_Value_0=ruleValue();

            state._fsp--;


            		current.merge(this_Value_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleFieldValue"


    // $ANTLR start "entryRuleTypeValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:446:1: entryRuleTypeValue returns [String current=null] : iv_ruleTypeValue= ruleTypeValue EOF ;
    public final String entryRuleTypeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:447:2: (iv_ruleTypeValue= ruleTypeValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:448:2: iv_ruleTypeValue= ruleTypeValue EOF
            {
             newCompositeNode(grammarAccess.getTypeValueRule()); 
            pushFollow(FOLLOW_ruleTypeValue_in_entryRuleTypeValue891);
            iv_ruleTypeValue=ruleTypeValue();

            state._fsp--;

             current =iv_ruleTypeValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeValue902); 

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
    // $ANTLR end "entryRuleTypeValue"


    // $ANTLR start "ruleTypeValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:455:1: ruleTypeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedNameWithWildcard_0= ruleQualifiedNameWithWildcard ;
    public final AntlrDatatypeRuleToken ruleTypeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedNameWithWildcard_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:458:28: (this_QualifiedNameWithWildcard_0= ruleQualifiedNameWithWildcard )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:460:5: this_QualifiedNameWithWildcard_0= ruleQualifiedNameWithWildcard
            {
             
                    newCompositeNode(grammarAccess.getTypeValueAccess().getQualifiedNameWithWildcardParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleTypeValue948);
            this_QualifiedNameWithWildcard_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            		current.merge(this_QualifiedNameWithWildcard_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleTypeValue"


    // $ANTLR start "entryRuleValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:478:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:479:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:480:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue993);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1004); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:487:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Wildcard_0= ruleWildcard )? (this_ID_1= RULE_ID (this_Wildcard_2= ruleWildcard this_ID_3= RULE_ID )* (this_Wildcard_4= ruleWildcard )? )? ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_Wildcard_0 = null;

        AntlrDatatypeRuleToken this_Wildcard_2 = null;

        AntlrDatatypeRuleToken this_Wildcard_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:490:28: ( ( (this_Wildcard_0= ruleWildcard )? (this_ID_1= RULE_ID (this_Wildcard_2= ruleWildcard this_ID_3= RULE_ID )* (this_Wildcard_4= ruleWildcard )? )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:1: ( (this_Wildcard_0= ruleWildcard )? (this_ID_1= RULE_ID (this_Wildcard_2= ruleWildcard this_ID_3= RULE_ID )* (this_Wildcard_4= ruleWildcard )? )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:1: ( (this_Wildcard_0= ruleWildcard )? (this_ID_1= RULE_ID (this_Wildcard_2= ruleWildcard this_ID_3= RULE_ID )* (this_Wildcard_4= ruleWildcard )? )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:2: (this_Wildcard_0= ruleWildcard )? (this_ID_1= RULE_ID (this_Wildcard_2= ruleWildcard this_ID_3= RULE_ID )* (this_Wildcard_4= ruleWildcard )? )?
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:2: (this_Wildcard_0= ruleWildcard )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:492:5: this_Wildcard_0= ruleWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getWildcardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWildcard_in_ruleValue1052);
                    this_Wildcard_0=ruleWildcard();

                    state._fsp--;


                    		current.merge(this_Wildcard_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:502:3: (this_ID_1= RULE_ID (this_Wildcard_2= ruleWildcard this_ID_3= RULE_ID )* (this_Wildcard_4= ruleWildcard )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:502:8: this_ID_1= RULE_ID (this_Wildcard_2= ruleWildcard this_ID_3= RULE_ID )* (this_Wildcard_4= ruleWildcard )?
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue1075); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getValueAccess().getIDTerminalRuleCall_1_0()); 
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:509:1: (this_Wildcard_2= ruleWildcard this_ID_3= RULE_ID )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==RULE_ID) ) {
                                alt6=1;
                            }


                        }
                        else if ( (LA6_0==17) ) {
                            int LA6_2 = input.LA(2);

                            if ( (LA6_2==RULE_ID) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:510:5: this_Wildcard_2= ruleWildcard this_ID_3= RULE_ID
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getValueAccess().getWildcardParserRuleCall_1_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleWildcard_in_ruleValue1103);
                    	    this_Wildcard_2=ruleWildcard();

                    	    state._fsp--;


                    	    		current.merge(this_Wildcard_2);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue1123); 

                    	    		current.merge(this_ID_3);
                    	        
                    	     
                    	        newLeafNode(this_ID_3, grammarAccess.getValueAccess().getIDTerminalRuleCall_1_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:527:3: (this_Wildcard_4= ruleWildcard )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==16) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==17) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:528:5: this_Wildcard_4= ruleWildcard
                            {
                             
                                    newCompositeNode(grammarAccess.getValueAccess().getWildcardParserRuleCall_1_2()); 
                                
                            pushFollow(FOLLOW_ruleWildcard_in_ruleValue1153);
                            this_Wildcard_4=ruleWildcard();

                            state._fsp--;


                            		current.merge(this_Wildcard_4);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:546:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:550:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:551:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1209);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1220); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:561:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Value_0= ruleValue ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )* (this_Wildcard_5= ruleWildcard )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Value_0 = null;

        AntlrDatatypeRuleToken this_Wildcard_1 = null;

        AntlrDatatypeRuleToken this_Sep_2 = null;

        AntlrDatatypeRuleToken this_Wildcard_3 = null;

        AntlrDatatypeRuleToken this_Value_4 = null;

        AntlrDatatypeRuleToken this_Wildcard_5 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:565:28: ( (this_Value_0= ruleValue ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )* (this_Wildcard_5= ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:566:1: (this_Value_0= ruleValue ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )* (this_Wildcard_5= ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:566:1: (this_Value_0= ruleValue ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )* (this_Wildcard_5= ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:567:5: this_Value_0= ruleValue ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )* (this_Wildcard_5= ruleWildcard )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleQualifiedNameWithWildcard1271);
            this_Value_0=ruleValue();

            state._fsp--;


            		current.merge(this_Value_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:577:1: ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )*
            loop11:
            do {
                int alt11=2;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA11_1 = input.LA(2);

                    if ( ((LA11_1>=14 && LA11_1<=15)) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 17:
                    {
                    int LA11_2 = input.LA(2);

                    if ( ((LA11_2>=14 && LA11_2<=15)) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 14:
                case 15:
                    {
                    alt11=1;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:577:2: (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue
            	    {
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:577:2: (this_Wildcard_1= ruleWildcard )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>=16 && LA9_0<=17)) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:578:5: this_Wildcard_1= ruleWildcard
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_1_0()); 
            	                
            	            pushFollow(FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1300);
            	            this_Wildcard_1=ruleWildcard();

            	            state._fsp--;


            	            		current.merge(this_Wildcard_1);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getSepParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleSep_in_ruleQualifiedNameWithWildcard1329);
            	    this_Sep_2=ruleSep();

            	    state._fsp--;


            	    		current.merge(this_Sep_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:599:1: (this_Wildcard_3= ruleWildcard )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==16) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==17) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:600:5: this_Wildcard_3= ruleWildcard
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_1_2()); 
            	                
            	            pushFollow(FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1357);
            	            this_Wildcard_3=ruleWildcard();

            	            state._fsp--;


            	            		current.merge(this_Wildcard_3);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getValueParserRuleCall_1_3()); 
            	        
            	    pushFollow(FOLLOW_ruleValue_in_ruleQualifiedNameWithWildcard1386);
            	    this_Value_4=ruleValue();

            	    state._fsp--;


            	    		current.merge(this_Value_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:621:3: (this_Wildcard_5= ruleWildcard )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=16 && LA12_0<=17)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:622:5: this_Wildcard_5= ruleWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1416);
                    this_Wildcard_5=ruleWildcard();

                    state._fsp--;


                    		current.merge(this_Wildcard_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleSep"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:643:1: entryRuleSep returns [String current=null] : iv_ruleSep= ruleSep EOF ;
    public final String entryRuleSep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSep = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:644:2: (iv_ruleSep= ruleSep EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:645:2: iv_ruleSep= ruleSep EOF
            {
             newCompositeNode(grammarAccess.getSepRule()); 
            pushFollow(FOLLOW_ruleSep_in_entryRuleSep1468);
            iv_ruleSep=ruleSep();

            state._fsp--;

             current =iv_ruleSep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSep1479); 

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
    // $ANTLR end "entryRuleSep"


    // $ANTLR start "ruleSep"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:652:1: ruleSep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' | kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleSep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:655:28: ( (kw= '/' | kw= '.' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:656:1: (kw= '/' | kw= '.' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:656:1: (kw= '/' | kw= '.' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            else if ( (LA13_0==15) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:657:2: kw= '/'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleSep1517); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSepAccess().getSolidusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:664:2: kw= '.'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleSep1536); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSepAccess().getFullStopKeyword_1()); 
                        

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
    // $ANTLR end "ruleSep"


    // $ANTLR start "entryRuleWildcard"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:677:1: entryRuleWildcard returns [String current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final String entryRuleWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWildcard = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:678:2: (iv_ruleWildcard= ruleWildcard EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:679:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_ruleWildcard_in_entryRuleWildcard1577);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcard1588); 

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
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:686:1: ruleWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '?' ) ;
    public final AntlrDatatypeRuleToken ruleWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:689:28: ( (kw= '*' | kw= '?' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:690:1: (kw= '*' | kw= '?' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:690:1: (kw= '*' | kw= '?' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            else if ( (LA14_0==17) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:691:2: kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleWildcard1626); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWildcardAccess().getAsteriskKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:698:2: kw= '?'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleWildcard1645); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWildcardAccess().getQuestionMarkKeyword_1()); 
                        

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
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleFieldName"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:711:1: entryRuleFieldName returns [EObject current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final EObject entryRuleFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:712:2: (iv_ruleFieldName= ruleFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:713:2: iv_ruleFieldName= ruleFieldName EOF
            {
             newCompositeNode(grammarAccess.getFieldNameRule()); 
            pushFollow(FOLLOW_ruleFieldName_in_entryRuleFieldName1685);
            iv_ruleFieldName=ruleFieldName();

            state._fsp--;

             current =iv_ruleFieldName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldName1695); 

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
    // $ANTLR end "entryRuleFieldName"


    // $ANTLR start "ruleFieldName"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:720:1: ruleFieldName returns [EObject current=null] : ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_Type_1_0= 'Type' ) ) | ( (lv_FriendlyName_2_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_4_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_6_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_10_0= 'ProjectName' ) ) | ( (lv_ResourcePath_11_0= 'ResourcePath' ) ) | ( (lv_Modifiers_12_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_18_0= 'FullText' ) ) | ( (lv_FieldsRead_19_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_23_0= 'Annotations' ) ) | ( (lv_Timestamp_24_0= 'Timestamp' ) ) ) ;
    public final EObject ruleFieldName() throws RecognitionException {
        EObject current = null;

        Token lv_FullyQualifiedName_0_0=null;
        Token lv_Type_1_0=null;
        Token lv_FriendlyName_2_0=null;
        Token lv_DeclaredMethods_3_0=null;
        Token lv_ParameterCount_4_0=null;
        Token lv_ReturnVariableEexpressions_5_0=null;
        Token lv_UsedMethods_6_0=null;
        Token lv_UsedMethodsInTry_7_0=null;
        Token lv_UsedMethodsInFinally_8_0=null;
        Token lv_OverriddenMethods_9_0=null;
        Token lv_ProjectName_10_0=null;
        Token lv_ResourcePath_11_0=null;
        Token lv_Modifiers_12_0=null;
        Token lv_AllDeclaredMethodNames_13_0=null;
        Token lv_DeclaredMethodNames_14_0=null;
        Token lv_DeclaredFieldNames_15_0=null;
        Token lv_DeclaredFieldTypes_16_0=null;
        Token lv_AllDeclaredFieldNames_17_0=null;
        Token lv_FullText_18_0=null;
        Token lv_FieldsRead_19_0=null;
        Token lv_FieldsWritten_20_0=null;
        Token lv_UsedFieldsInFinally_21_0=null;
        Token lv_UsedFieldsInTry_22_0=null;
        Token lv_Annotations_23_0=null;
        Token lv_Timestamp_24_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:723:28: ( ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_Type_1_0= 'Type' ) ) | ( (lv_FriendlyName_2_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_4_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_6_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_10_0= 'ProjectName' ) ) | ( (lv_ResourcePath_11_0= 'ResourcePath' ) ) | ( (lv_Modifiers_12_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_18_0= 'FullText' ) ) | ( (lv_FieldsRead_19_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_23_0= 'Annotations' ) ) | ( (lv_Timestamp_24_0= 'Timestamp' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:724:1: ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_Type_1_0= 'Type' ) ) | ( (lv_FriendlyName_2_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_4_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_6_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_10_0= 'ProjectName' ) ) | ( (lv_ResourcePath_11_0= 'ResourcePath' ) ) | ( (lv_Modifiers_12_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_18_0= 'FullText' ) ) | ( (lv_FieldsRead_19_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_23_0= 'Annotations' ) ) | ( (lv_Timestamp_24_0= 'Timestamp' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:724:1: ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_Type_1_0= 'Type' ) ) | ( (lv_FriendlyName_2_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_4_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_6_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_10_0= 'ProjectName' ) ) | ( (lv_ResourcePath_11_0= 'ResourcePath' ) ) | ( (lv_Modifiers_12_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_18_0= 'FullText' ) ) | ( (lv_FieldsRead_19_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_23_0= 'Annotations' ) ) | ( (lv_Timestamp_24_0= 'Timestamp' ) ) )
            int alt15=25;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt15=1;
                }
                break;
            case 19:
                {
                alt15=2;
                }
                break;
            case 20:
                {
                alt15=3;
                }
                break;
            case 21:
                {
                alt15=4;
                }
                break;
            case 22:
                {
                alt15=5;
                }
                break;
            case 23:
                {
                alt15=6;
                }
                break;
            case 24:
                {
                alt15=7;
                }
                break;
            case 25:
                {
                alt15=8;
                }
                break;
            case 26:
                {
                alt15=9;
                }
                break;
            case 27:
                {
                alt15=10;
                }
                break;
            case 28:
                {
                alt15=11;
                }
                break;
            case 29:
                {
                alt15=12;
                }
                break;
            case 30:
                {
                alt15=13;
                }
                break;
            case 31:
                {
                alt15=14;
                }
                break;
            case 32:
                {
                alt15=15;
                }
                break;
            case 33:
                {
                alt15=16;
                }
                break;
            case 34:
                {
                alt15=17;
                }
                break;
            case 35:
                {
                alt15=18;
                }
                break;
            case 36:
                {
                alt15=19;
                }
                break;
            case 37:
                {
                alt15=20;
                }
                break;
            case 38:
                {
                alt15=21;
                }
                break;
            case 39:
                {
                alt15=22;
                }
                break;
            case 40:
                {
                alt15=23;
                }
                break;
            case 41:
                {
                alt15=24;
                }
                break;
            case 42:
                {
                alt15=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:724:2: ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:724:2: ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:725:1: (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:725:1: (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:726:3: lv_FullyQualifiedName_0_0= 'FullyQualifiedName'
                    {
                    lv_FullyQualifiedName_0_0=(Token)match(input,18,FOLLOW_18_in_ruleFieldName1738); 

                            newLeafNode(lv_FullyQualifiedName_0_0, grammarAccess.getFieldNameAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FullyQualifiedName", lv_FullyQualifiedName_0_0, "FullyQualifiedName");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:740:6: ( (lv_Type_1_0= 'Type' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:740:6: ( (lv_Type_1_0= 'Type' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:741:1: (lv_Type_1_0= 'Type' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:741:1: (lv_Type_1_0= 'Type' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:742:3: lv_Type_1_0= 'Type'
                    {
                    lv_Type_1_0=(Token)match(input,19,FOLLOW_19_in_ruleFieldName1775); 

                            newLeafNode(lv_Type_1_0, grammarAccess.getFieldNameAccess().getTypeTypeKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "Type", lv_Type_1_0, "Type");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:756:6: ( (lv_FriendlyName_2_0= 'FriendlyName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:756:6: ( (lv_FriendlyName_2_0= 'FriendlyName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:757:1: (lv_FriendlyName_2_0= 'FriendlyName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:757:1: (lv_FriendlyName_2_0= 'FriendlyName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:758:3: lv_FriendlyName_2_0= 'FriendlyName'
                    {
                    lv_FriendlyName_2_0=(Token)match(input,20,FOLLOW_20_in_ruleFieldName1812); 

                            newLeafNode(lv_FriendlyName_2_0, grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FriendlyName", lv_FriendlyName_2_0, "FriendlyName");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:772:6: ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:772:6: ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:773:1: (lv_DeclaredMethods_3_0= 'DeclaredMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:773:1: (lv_DeclaredMethods_3_0= 'DeclaredMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:774:3: lv_DeclaredMethods_3_0= 'DeclaredMethods'
                    {
                    lv_DeclaredMethods_3_0=(Token)match(input,21,FOLLOW_21_in_ruleFieldName1849); 

                            newLeafNode(lv_DeclaredMethods_3_0, grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredMethods", lv_DeclaredMethods_3_0, "DeclaredMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:788:6: ( (lv_ParameterCount_4_0= 'ParameterCount' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:788:6: ( (lv_ParameterCount_4_0= 'ParameterCount' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:789:1: (lv_ParameterCount_4_0= 'ParameterCount' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:789:1: (lv_ParameterCount_4_0= 'ParameterCount' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:790:3: lv_ParameterCount_4_0= 'ParameterCount'
                    {
                    lv_ParameterCount_4_0=(Token)match(input,22,FOLLOW_22_in_ruleFieldName1886); 

                            newLeafNode(lv_ParameterCount_4_0, grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ParameterCount", lv_ParameterCount_4_0, "ParameterCount");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:804:6: ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:804:6: ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:805:1: (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:805:1: (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:806:3: lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions'
                    {
                    lv_ReturnVariableEexpressions_5_0=(Token)match(input,23,FOLLOW_23_in_ruleFieldName1923); 

                            newLeafNode(lv_ReturnVariableEexpressions_5_0, grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ReturnVariableEexpressions", lv_ReturnVariableEexpressions_5_0, "ReturnVariableEexpressions");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:820:6: ( (lv_UsedMethods_6_0= 'UsedMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:820:6: ( (lv_UsedMethods_6_0= 'UsedMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:821:1: (lv_UsedMethods_6_0= 'UsedMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:821:1: (lv_UsedMethods_6_0= 'UsedMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:822:3: lv_UsedMethods_6_0= 'UsedMethods'
                    {
                    lv_UsedMethods_6_0=(Token)match(input,24,FOLLOW_24_in_ruleFieldName1960); 

                            newLeafNode(lv_UsedMethods_6_0, grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedMethods", lv_UsedMethods_6_0, "UsedMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:836:6: ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:836:6: ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:837:1: (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:837:1: (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:838:3: lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry'
                    {
                    lv_UsedMethodsInTry_7_0=(Token)match(input,25,FOLLOW_25_in_ruleFieldName1997); 

                            newLeafNode(lv_UsedMethodsInTry_7_0, grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedMethodsInTry", lv_UsedMethodsInTry_7_0, "UsedMethodsInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:852:6: ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:852:6: ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:853:1: (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:853:1: (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:854:3: lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally'
                    {
                    lv_UsedMethodsInFinally_8_0=(Token)match(input,26,FOLLOW_26_in_ruleFieldName2034); 

                            newLeafNode(lv_UsedMethodsInFinally_8_0, grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedMethodsInFinally", lv_UsedMethodsInFinally_8_0, "UsedMethodsInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:868:6: ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:868:6: ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:869:1: (lv_OverriddenMethods_9_0= 'OverriddenMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:869:1: (lv_OverriddenMethods_9_0= 'OverriddenMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:870:3: lv_OverriddenMethods_9_0= 'OverriddenMethods'
                    {
                    lv_OverriddenMethods_9_0=(Token)match(input,27,FOLLOW_27_in_ruleFieldName2071); 

                            newLeafNode(lv_OverriddenMethods_9_0, grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "OverriddenMethods", lv_OverriddenMethods_9_0, "OverriddenMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:884:6: ( (lv_ProjectName_10_0= 'ProjectName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:884:6: ( (lv_ProjectName_10_0= 'ProjectName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:885:1: (lv_ProjectName_10_0= 'ProjectName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:885:1: (lv_ProjectName_10_0= 'ProjectName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:886:3: lv_ProjectName_10_0= 'ProjectName'
                    {
                    lv_ProjectName_10_0=(Token)match(input,28,FOLLOW_28_in_ruleFieldName2108); 

                            newLeafNode(lv_ProjectName_10_0, grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ProjectName", lv_ProjectName_10_0, "ProjectName");
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:900:6: ( (lv_ResourcePath_11_0= 'ResourcePath' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:900:6: ( (lv_ResourcePath_11_0= 'ResourcePath' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:901:1: (lv_ResourcePath_11_0= 'ResourcePath' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:901:1: (lv_ResourcePath_11_0= 'ResourcePath' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:902:3: lv_ResourcePath_11_0= 'ResourcePath'
                    {
                    lv_ResourcePath_11_0=(Token)match(input,29,FOLLOW_29_in_ruleFieldName2145); 

                            newLeafNode(lv_ResourcePath_11_0, grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ResourcePath", lv_ResourcePath_11_0, "ResourcePath");
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:916:6: ( (lv_Modifiers_12_0= 'Modifiers' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:916:6: ( (lv_Modifiers_12_0= 'Modifiers' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:917:1: (lv_Modifiers_12_0= 'Modifiers' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:917:1: (lv_Modifiers_12_0= 'Modifiers' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:918:3: lv_Modifiers_12_0= 'Modifiers'
                    {
                    lv_Modifiers_12_0=(Token)match(input,30,FOLLOW_30_in_ruleFieldName2182); 

                            newLeafNode(lv_Modifiers_12_0, grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "Modifiers", lv_Modifiers_12_0, "Modifiers");
                    	    

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:932:6: ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:932:6: ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:933:1: (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:933:1: (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:934:3: lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames'
                    {
                    lv_AllDeclaredMethodNames_13_0=(Token)match(input,31,FOLLOW_31_in_ruleFieldName2219); 

                            newLeafNode(lv_AllDeclaredMethodNames_13_0, grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_13_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "AllDeclaredMethodNames", lv_AllDeclaredMethodNames_13_0, "AllDeclaredMethodNames");
                    	    

                    }


                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:948:6: ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:948:6: ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:949:1: (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:949:1: (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:950:3: lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames'
                    {
                    lv_DeclaredMethodNames_14_0=(Token)match(input,32,FOLLOW_32_in_ruleFieldName2256); 

                            newLeafNode(lv_DeclaredMethodNames_14_0, grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_14_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredMethodNames", lv_DeclaredMethodNames_14_0, "DeclaredMethodNames");
                    	    

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:964:6: ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:964:6: ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:965:1: (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:965:1: (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:966:3: lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames'
                    {
                    lv_DeclaredFieldNames_15_0=(Token)match(input,33,FOLLOW_33_in_ruleFieldName2293); 

                            newLeafNode(lv_DeclaredFieldNames_15_0, grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_15_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredFieldNames", lv_DeclaredFieldNames_15_0, "DeclaredFieldNames");
                    	    

                    }


                    }


                    }
                    break;
                case 17 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:980:6: ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:980:6: ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:981:1: (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:981:1: (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:982:3: lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes'
                    {
                    lv_DeclaredFieldTypes_16_0=(Token)match(input,34,FOLLOW_34_in_ruleFieldName2330); 

                            newLeafNode(lv_DeclaredFieldTypes_16_0, grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_16_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredFieldTypes", lv_DeclaredFieldTypes_16_0, "DeclaredFieldTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 18 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:996:6: ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:996:6: ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:997:1: (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:997:1: (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:998:3: lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames'
                    {
                    lv_AllDeclaredFieldNames_17_0=(Token)match(input,35,FOLLOW_35_in_ruleFieldName2367); 

                            newLeafNode(lv_AllDeclaredFieldNames_17_0, grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_17_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "AllDeclaredFieldNames", lv_AllDeclaredFieldNames_17_0, "AllDeclaredFieldNames");
                    	    

                    }


                    }


                    }
                    break;
                case 19 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1012:6: ( (lv_FullText_18_0= 'FullText' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1012:6: ( (lv_FullText_18_0= 'FullText' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1013:1: (lv_FullText_18_0= 'FullText' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1013:1: (lv_FullText_18_0= 'FullText' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1014:3: lv_FullText_18_0= 'FullText'
                    {
                    lv_FullText_18_0=(Token)match(input,36,FOLLOW_36_in_ruleFieldName2404); 

                            newLeafNode(lv_FullText_18_0, grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_18_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FullText", lv_FullText_18_0, "FullText");
                    	    

                    }


                    }


                    }
                    break;
                case 20 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1028:6: ( (lv_FieldsRead_19_0= 'FieldsRead' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1028:6: ( (lv_FieldsRead_19_0= 'FieldsRead' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1029:1: (lv_FieldsRead_19_0= 'FieldsRead' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1029:1: (lv_FieldsRead_19_0= 'FieldsRead' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1030:3: lv_FieldsRead_19_0= 'FieldsRead'
                    {
                    lv_FieldsRead_19_0=(Token)match(input,37,FOLLOW_37_in_ruleFieldName2441); 

                            newLeafNode(lv_FieldsRead_19_0, grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_19_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FieldsRead", lv_FieldsRead_19_0, "FieldsRead");
                    	    

                    }


                    }


                    }
                    break;
                case 21 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1044:6: ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1044:6: ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1045:1: (lv_FieldsWritten_20_0= 'FieldsWritten' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1045:1: (lv_FieldsWritten_20_0= 'FieldsWritten' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1046:3: lv_FieldsWritten_20_0= 'FieldsWritten'
                    {
                    lv_FieldsWritten_20_0=(Token)match(input,38,FOLLOW_38_in_ruleFieldName2478); 

                            newLeafNode(lv_FieldsWritten_20_0, grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_20_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FieldsWritten", lv_FieldsWritten_20_0, "FieldsWritten");
                    	    

                    }


                    }


                    }
                    break;
                case 22 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1060:6: ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1060:6: ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1061:1: (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1061:1: (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1062:3: lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally'
                    {
                    lv_UsedFieldsInFinally_21_0=(Token)match(input,39,FOLLOW_39_in_ruleFieldName2515); 

                            newLeafNode(lv_UsedFieldsInFinally_21_0, grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_21_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedFieldsInFinally", lv_UsedFieldsInFinally_21_0, "UsedFieldsInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 23 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1076:6: ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1076:6: ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1077:1: (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1077:1: (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1078:3: lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry'
                    {
                    lv_UsedFieldsInTry_22_0=(Token)match(input,40,FOLLOW_40_in_ruleFieldName2552); 

                            newLeafNode(lv_UsedFieldsInTry_22_0, grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_22_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedFieldsInTry", lv_UsedFieldsInTry_22_0, "UsedFieldsInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 24 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1092:6: ( (lv_Annotations_23_0= 'Annotations' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1092:6: ( (lv_Annotations_23_0= 'Annotations' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1093:1: (lv_Annotations_23_0= 'Annotations' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1093:1: (lv_Annotations_23_0= 'Annotations' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1094:3: lv_Annotations_23_0= 'Annotations'
                    {
                    lv_Annotations_23_0=(Token)match(input,41,FOLLOW_41_in_ruleFieldName2589); 

                            newLeafNode(lv_Annotations_23_0, grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_23_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "Annotations", lv_Annotations_23_0, "Annotations");
                    	    

                    }


                    }


                    }
                    break;
                case 25 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1108:6: ( (lv_Timestamp_24_0= 'Timestamp' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1108:6: ( (lv_Timestamp_24_0= 'Timestamp' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1109:1: (lv_Timestamp_24_0= 'Timestamp' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1109:1: (lv_Timestamp_24_0= 'Timestamp' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1110:3: lv_Timestamp_24_0= 'Timestamp'
                    {
                    lv_Timestamp_24_0=(Token)match(input,42,FOLLOW_42_in_ruleFieldName2626); 

                            newLeafNode(lv_Timestamp_24_0, grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_24_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "Timestamp", lv_Timestamp_24_0, "Timestamp");
                    	    

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
    // $ANTLR end "ruleFieldName"


    // $ANTLR start "entryRuleTypeFieldName"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1131:1: entryRuleTypeFieldName returns [EObject current=null] : iv_ruleTypeFieldName= ruleTypeFieldName EOF ;
    public final EObject entryRuleTypeFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFieldName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1132:2: (iv_ruleTypeFieldName= ruleTypeFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1133:2: iv_ruleTypeFieldName= ruleTypeFieldName EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldNameRule()); 
            pushFollow(FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName2675);
            iv_ruleTypeFieldName=ruleTypeFieldName();

            state._fsp--;

             current =iv_ruleTypeFieldName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldName2685); 

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
    // $ANTLR end "entryRuleTypeFieldName"


    // $ANTLR start "ruleTypeFieldName"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1140:1: ruleTypeFieldName returns [EObject current=null] : ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_9_0= 'FieldType' ) ) | ( (lv_DeclaringType_10_0= 'DeclaringType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) ) ) ;
    public final EObject ruleTypeFieldName() throws RecognitionException {
        EObject current = null;

        Token lv_ImplementedTypes_0_0=null;
        Token lv_ExtendedTypes_1_0=null;
        Token lv_UsedTypes_2_0=null;
        Token lv_UsedTypesInTry_3_0=null;
        Token lv_UsedTypesInFinally_4_0=null;
        Token lv_ParameterTypes_5_0=null;
        Token lv_ReturnType_6_0=null;
        Token lv_AllImplementedTypes_7_0=null;
        Token lv_AllExtendedTypes_8_0=null;
        Token lv_FieldType_9_0=null;
        Token lv_DeclaringType_10_0=null;
        Token lv_CaughtType_11_0=null;
        Token lv_InstanceofTypes_12_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1143:28: ( ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_9_0= 'FieldType' ) ) | ( (lv_DeclaringType_10_0= 'DeclaringType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1144:1: ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_9_0= 'FieldType' ) ) | ( (lv_DeclaringType_10_0= 'DeclaringType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1144:1: ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_9_0= 'FieldType' ) ) | ( (lv_DeclaringType_10_0= 'DeclaringType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) ) )
            int alt16=13;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt16=1;
                }
                break;
            case 44:
                {
                alt16=2;
                }
                break;
            case 45:
                {
                alt16=3;
                }
                break;
            case 46:
                {
                alt16=4;
                }
                break;
            case 47:
                {
                alt16=5;
                }
                break;
            case 48:
                {
                alt16=6;
                }
                break;
            case 49:
                {
                alt16=7;
                }
                break;
            case 50:
                {
                alt16=8;
                }
                break;
            case 51:
                {
                alt16=9;
                }
                break;
            case 52:
                {
                alt16=10;
                }
                break;
            case 53:
                {
                alt16=11;
                }
                break;
            case 54:
                {
                alt16=12;
                }
                break;
            case 55:
                {
                alt16=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1144:2: ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1144:2: ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1145:1: (lv_ImplementedTypes_0_0= 'ImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1145:1: (lv_ImplementedTypes_0_0= 'ImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1146:3: lv_ImplementedTypes_0_0= 'ImplementedTypes'
                    {
                    lv_ImplementedTypes_0_0=(Token)match(input,43,FOLLOW_43_in_ruleTypeFieldName2728); 

                            newLeafNode(lv_ImplementedTypes_0_0, grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ImplementedTypes", lv_ImplementedTypes_0_0, "ImplementedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1160:6: ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1160:6: ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1161:1: (lv_ExtendedTypes_1_0= 'ExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1161:1: (lv_ExtendedTypes_1_0= 'ExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1162:3: lv_ExtendedTypes_1_0= 'ExtendedTypes'
                    {
                    lv_ExtendedTypes_1_0=(Token)match(input,44,FOLLOW_44_in_ruleTypeFieldName2765); 

                            newLeafNode(lv_ExtendedTypes_1_0, grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ExtendedTypes", lv_ExtendedTypes_1_0, "ExtendedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1176:6: ( (lv_UsedTypes_2_0= 'UsedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1176:6: ( (lv_UsedTypes_2_0= 'UsedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1177:1: (lv_UsedTypes_2_0= 'UsedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1177:1: (lv_UsedTypes_2_0= 'UsedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1178:3: lv_UsedTypes_2_0= 'UsedTypes'
                    {
                    lv_UsedTypes_2_0=(Token)match(input,45,FOLLOW_45_in_ruleTypeFieldName2802); 

                            newLeafNode(lv_UsedTypes_2_0, grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedTypes", lv_UsedTypes_2_0, "UsedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1192:6: ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1192:6: ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1193:1: (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1193:1: (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1194:3: lv_UsedTypesInTry_3_0= 'UsedTypesInTry'
                    {
                    lv_UsedTypesInTry_3_0=(Token)match(input,46,FOLLOW_46_in_ruleTypeFieldName2839); 

                            newLeafNode(lv_UsedTypesInTry_3_0, grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedTypesInTry", lv_UsedTypesInTry_3_0, "UsedTypesInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1208:6: ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1208:6: ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1209:1: (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1209:1: (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1210:3: lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally'
                    {
                    lv_UsedTypesInFinally_4_0=(Token)match(input,47,FOLLOW_47_in_ruleTypeFieldName2876); 

                            newLeafNode(lv_UsedTypesInFinally_4_0, grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedTypesInFinally", lv_UsedTypesInFinally_4_0, "UsedTypesInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1224:6: ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1224:6: ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1225:1: (lv_ParameterTypes_5_0= 'ParameterTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1225:1: (lv_ParameterTypes_5_0= 'ParameterTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1226:3: lv_ParameterTypes_5_0= 'ParameterTypes'
                    {
                    lv_ParameterTypes_5_0=(Token)match(input,48,FOLLOW_48_in_ruleTypeFieldName2913); 

                            newLeafNode(lv_ParameterTypes_5_0, grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ParameterTypes", lv_ParameterTypes_5_0, "ParameterTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1240:6: ( (lv_ReturnType_6_0= 'ReturnType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1240:6: ( (lv_ReturnType_6_0= 'ReturnType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1241:1: (lv_ReturnType_6_0= 'ReturnType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1241:1: (lv_ReturnType_6_0= 'ReturnType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1242:3: lv_ReturnType_6_0= 'ReturnType'
                    {
                    lv_ReturnType_6_0=(Token)match(input,49,FOLLOW_49_in_ruleTypeFieldName2950); 

                            newLeafNode(lv_ReturnType_6_0, grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ReturnType", lv_ReturnType_6_0, "ReturnType");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1256:6: ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1256:6: ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1257:1: (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1257:1: (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1258:3: lv_AllImplementedTypes_7_0= 'AllImplementedTypes'
                    {
                    lv_AllImplementedTypes_7_0=(Token)match(input,50,FOLLOW_50_in_ruleTypeFieldName2987); 

                            newLeafNode(lv_AllImplementedTypes_7_0, grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "AllImplementedTypes", lv_AllImplementedTypes_7_0, "AllImplementedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1272:6: ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1272:6: ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1273:1: (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1273:1: (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1274:3: lv_AllExtendedTypes_8_0= 'AllExtendedTypes'
                    {
                    lv_AllExtendedTypes_8_0=(Token)match(input,51,FOLLOW_51_in_ruleTypeFieldName3024); 

                            newLeafNode(lv_AllExtendedTypes_8_0, grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "AllExtendedTypes", lv_AllExtendedTypes_8_0, "AllExtendedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1288:6: ( (lv_FieldType_9_0= 'FieldType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1288:6: ( (lv_FieldType_9_0= 'FieldType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1289:1: (lv_FieldType_9_0= 'FieldType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1289:1: (lv_FieldType_9_0= 'FieldType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1290:3: lv_FieldType_9_0= 'FieldType'
                    {
                    lv_FieldType_9_0=(Token)match(input,52,FOLLOW_52_in_ruleTypeFieldName3061); 

                            newLeafNode(lv_FieldType_9_0, grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FieldType", lv_FieldType_9_0, "FieldType");
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1304:6: ( (lv_DeclaringType_10_0= 'DeclaringType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1304:6: ( (lv_DeclaringType_10_0= 'DeclaringType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1305:1: (lv_DeclaringType_10_0= 'DeclaringType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1305:1: (lv_DeclaringType_10_0= 'DeclaringType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1306:3: lv_DeclaringType_10_0= 'DeclaringType'
                    {
                    lv_DeclaringType_10_0=(Token)match(input,53,FOLLOW_53_in_ruleTypeFieldName3098); 

                            newLeafNode(lv_DeclaringType_10_0, grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaringType", lv_DeclaringType_10_0, "DeclaringType");
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1320:6: ( (lv_CaughtType_11_0= 'CaughtType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1320:6: ( (lv_CaughtType_11_0= 'CaughtType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1321:1: (lv_CaughtType_11_0= 'CaughtType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1321:1: (lv_CaughtType_11_0= 'CaughtType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1322:3: lv_CaughtType_11_0= 'CaughtType'
                    {
                    lv_CaughtType_11_0=(Token)match(input,54,FOLLOW_54_in_ruleTypeFieldName3135); 

                            newLeafNode(lv_CaughtType_11_0, grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "CaughtType", lv_CaughtType_11_0, "CaughtType");
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1336:6: ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1336:6: ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1337:1: (lv_InstanceofTypes_12_0= 'InstanceofTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1337:1: (lv_InstanceofTypes_12_0= 'InstanceofTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1338:3: lv_InstanceofTypes_12_0= 'InstanceofTypes'
                    {
                    lv_InstanceofTypes_12_0=(Token)match(input,55,FOLLOW_55_in_ruleTypeFieldName3172); 

                            newLeafNode(lv_InstanceofTypes_12_0, grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "InstanceofTypes", lv_InstanceofTypes_12_0, "InstanceofTypes");
                    	    

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
    // $ANTLR end "ruleTypeFieldName"


    // $ANTLR start "ruleBooleanExp"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1359:1: ruleBooleanExp returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBooleanExp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1361:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1362:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1362:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==56) ) {
                alt17=1;
            }
            else if ( (LA17_0==57) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1362:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1362:2: (enumLiteral_0= 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1362:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleBooleanExp3235); 

                            current = grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1368:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1368:6: (enumLiteral_1= 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1368:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleBooleanExp3252); 

                            current = grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "ruleNotExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1378:1: ruleNotExpression returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) ) ;
    public final Enumerator ruleNotExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1380:28: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1381:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1381:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt18=1;
                }
                break;
            case 59:
                {
                alt18=2;
                }
                break;
            case 60:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1381:2: (enumLiteral_0= '-' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1381:2: (enumLiteral_0= '-' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1381:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleNotExpression3297); 

                            current = grammarAccess.getNotExpressionAccess().getN1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNotExpressionAccess().getN1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1387:6: (enumLiteral_1= 'NOT' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1387:6: (enumLiteral_1= 'NOT' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1387:8: enumLiteral_1= 'NOT'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleNotExpression3314); 

                            current = grammarAccess.getNotExpressionAccess().getN2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNotExpressionAccess().getN2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1393:6: (enumLiteral_2= '!' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1393:6: (enumLiteral_2= '!' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1393:8: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleNotExpression3331); 

                            current = grammarAccess.getNotExpressionAccess().getN3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getNotExpressionAccess().getN3EnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "ruleMustExpression"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1403:1: ruleMustExpression returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleMustExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1405:28: ( (enumLiteral_0= '+' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1406:1: (enumLiteral_0= '+' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1406:1: (enumLiteral_0= '+' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1406:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,61,FOLLOW_61_in_ruleMustExpression3375); 

                    current = grammarAccess.getMustExpressionAccess().getMEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getMustExpressionAccess().getMEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleMustExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExp1_in_entryRuleExp175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_ruleExp1132 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_ruleExp1162 = new BitSet(new long[]{0x3CFFFFFFFFFC0800L});
    public static final BitSet FOLLOW_ruleExp2_in_ruleExp1183 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_entryRuleExp2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_ruleExp2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExp2296 = new BitSet(new long[]{0x3CFFFFFFFFFC0800L});
    public static final BitSet FOLLOW_ruleExp1_in_ruleExp2318 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExp2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClauseExpression376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleClauseExpression423 = new BitSet(new long[]{0x3CFFFFFFFFFC0000L});
    public static final BitSet FOLLOW_ruleMustExpression_in_ruleClauseExpression450 = new BitSet(new long[]{0x3CFFFFFFFFFC0000L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_ruleClauseExpression474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_ruleClauseExpression501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_entryRuleSimpleClause538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClause548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_ruleSimpleClause594 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSimpleClause606 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_ruleFieldValue_in_ruleSimpleClause627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_entryRuleTypeClause663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeClause673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_ruleTypeClause719 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTypeClause731 = new BitSet(new long[]{0x000000000003C010L});
    public static final BitSet FOLLOW_ruleTypeValue_in_ruleTypeClause752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldValue_in_entryRuleFieldValue789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldValue800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFieldValue846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeValue_in_entryRuleTypeValue891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeValue902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleTypeValue948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleValue1052 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue1075 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleValue1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue1123 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleValue1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleQualifiedNameWithWildcard1271 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1300 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleSep_in_ruleQualifiedNameWithWildcard1329 = new BitSet(new long[]{0x000000000003C010L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1357 = new BitSet(new long[]{0x000000000003C010L});
    public static final BitSet FOLLOW_ruleValue_in_ruleQualifiedNameWithWildcard1386 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_entryRuleSep1468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSep1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSep1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSep1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcard1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleWildcard1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleWildcard1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_entryRuleFieldName1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldName1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFieldName1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFieldName1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFieldName1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFieldName1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFieldName1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFieldName1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFieldName1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFieldName1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFieldName2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFieldName2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFieldName2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFieldName2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFieldName2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFieldName2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFieldName2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFieldName2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFieldName2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFieldName2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFieldName2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFieldName2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFieldName2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFieldName2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFieldName2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleFieldName2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFieldName2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName2675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldName2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTypeFieldName2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTypeFieldName2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTypeFieldName2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeFieldName2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeFieldName2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTypeFieldName2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeFieldName2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeFieldName2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeFieldName3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTypeFieldName3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTypeFieldName3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTypeFieldName3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTypeFieldName3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBooleanExp3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBooleanExp3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNotExpression3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNotExpression3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNotExpression3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMustExpression3375 = new BitSet(new long[]{0x0000000000000002L});

}