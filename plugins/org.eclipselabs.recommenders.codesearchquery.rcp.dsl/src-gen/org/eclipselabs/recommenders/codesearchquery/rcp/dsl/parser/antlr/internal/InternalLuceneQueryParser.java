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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'test1'", "'test2'", "'+'", "'-'", "'FullyQualifiedName'", "'FriendlyName'", "'DeclaredMethods'", "'ParameterCount'", "'ReturnVariableEexpressions'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'ProjectName'", "'ResourcePath'", "'Modifiers'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'DeclaredFieldTypes'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'", "'Annotations'", "'Timestamp'", "'type'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'DeclaringType'", "'CaughtType'", "'InstanceofTypes'", "'AND'", "'and'", "'OR'", "'or'", "'not'", "'NOT'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
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
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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

                if ( ((LA1_0>=56 && LA1_0<=59)) ) {
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

            if ( ((LA2_0>=18 && LA2_0<=55)||(LA2_0>=60 && LA2_0<=62)) ) {
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:206:1: ruleClauseExpression returns [EObject current=null] : ( ( (lv_clause_0_0= ruleSimpleClause ) ) | ( (lv_clause_1_0= ruleTypeClause ) ) ) ;
    public final EObject ruleClauseExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_clause_0_0 = null;

        EObject lv_clause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:209:28: ( ( ( (lv_clause_0_0= ruleSimpleClause ) ) | ( (lv_clause_1_0= ruleTypeClause ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:1: ( ( (lv_clause_0_0= ruleSimpleClause ) ) | ( (lv_clause_1_0= ruleTypeClause ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:1: ( ( (lv_clause_0_0= ruleSimpleClause ) ) | ( (lv_clause_1_0= ruleTypeClause ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 60:
                {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=42 && LA3_1<=55)) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=18 && LA3_1<=41)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 61:
                {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=18 && LA3_2<=41)) ) {
                    alt3=1;
                }
                else if ( ((LA3_2>=42 && LA3_2<=55)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 62:
                {
                int LA3_3 = input.LA(2);

                if ( ((LA3_3>=18 && LA3_3<=41)) ) {
                    alt3=1;
                }
                else if ( ((LA3_3>=42 && LA3_3<=55)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
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
                {
                alt3=1;
                }
                break;
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
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:2: ( (lv_clause_0_0= ruleSimpleClause ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:210:2: ( (lv_clause_0_0= ruleSimpleClause ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:211:1: (lv_clause_0_0= ruleSimpleClause )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:211:1: (lv_clause_0_0= ruleSimpleClause )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:212:3: lv_clause_0_0= ruleSimpleClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getClauseSimpleClauseParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleClause_in_ruleClauseExpression422);
                    lv_clause_0_0=ruleSimpleClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"clause",
                            		lv_clause_0_0, 
                            		"SimpleClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:229:6: ( (lv_clause_1_0= ruleTypeClause ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:229:6: ( (lv_clause_1_0= ruleTypeClause ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:230:1: (lv_clause_1_0= ruleTypeClause )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:230:1: (lv_clause_1_0= ruleTypeClause )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:231:3: lv_clause_1_0= ruleTypeClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getClauseTypeClauseParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeClause_in_ruleClauseExpression449);
                    lv_clause_1_0=ruleTypeClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"clause",
                            		lv_clause_1_0, 
                            		"TypeClause");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleClauseExpression"


    // $ANTLR start "entryRuleSimpleClause"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:255:1: entryRuleSimpleClause returns [EObject current=null] : iv_ruleSimpleClause= ruleSimpleClause EOF ;
    public final EObject entryRuleSimpleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleClause = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:256:2: (iv_ruleSimpleClause= ruleSimpleClause EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:257:2: iv_ruleSimpleClause= ruleSimpleClause EOF
            {
             newCompositeNode(grammarAccess.getSimpleClauseRule()); 
            pushFollow(FOLLOW_ruleSimpleClause_in_entryRuleSimpleClause485);
            iv_ruleSimpleClause=ruleSimpleClause();

            state._fsp--;

             current =iv_ruleSimpleClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleClause495); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:264:1: ruleSimpleClause returns [EObject current=null] : ( ( (lv_n_0_0= ruleNotExpression ) )? ( (lv_field_1_0= ruleFieldName ) ) otherlv_2= ':' ( (lv_value_3_0= ruleFieldValue ) ) ) ;
    public final EObject ruleSimpleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_n_0_0 = null;

        EObject lv_field_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:267:28: ( ( ( (lv_n_0_0= ruleNotExpression ) )? ( (lv_field_1_0= ruleFieldName ) ) otherlv_2= ':' ( (lv_value_3_0= ruleFieldValue ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:268:1: ( ( (lv_n_0_0= ruleNotExpression ) )? ( (lv_field_1_0= ruleFieldName ) ) otherlv_2= ':' ( (lv_value_3_0= ruleFieldValue ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:268:1: ( ( (lv_n_0_0= ruleNotExpression ) )? ( (lv_field_1_0= ruleFieldName ) ) otherlv_2= ':' ( (lv_value_3_0= ruleFieldValue ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:268:2: ( (lv_n_0_0= ruleNotExpression ) )? ( (lv_field_1_0= ruleFieldName ) ) otherlv_2= ':' ( (lv_value_3_0= ruleFieldValue ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:268:2: ( (lv_n_0_0= ruleNotExpression ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=60 && LA4_0<=62)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:269:1: (lv_n_0_0= ruleNotExpression )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:269:1: (lv_n_0_0= ruleNotExpression )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:270:3: lv_n_0_0= ruleNotExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleClauseAccess().getNNotExpressionEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleSimpleClause541);
                    lv_n_0_0=ruleNotExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"n",
                            		lv_n_0_0, 
                            		"NotExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:286:3: ( (lv_field_1_0= ruleFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:287:1: (lv_field_1_0= ruleFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:287:1: (lv_field_1_0= ruleFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:288:3: lv_field_1_0= ruleFieldName
            {
             
            	        newCompositeNode(grammarAccess.getSimpleClauseAccess().getFieldFieldNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFieldName_in_ruleSimpleClause563);
            lv_field_1_0=ruleFieldName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleClauseRule());
            	        }
                   		set(
                   			current, 
                   			"field",
                    		lv_field_1_0, 
                    		"FieldName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSimpleClause575); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleClauseAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:308:1: ( (lv_value_3_0= ruleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:309:1: (lv_value_3_0= ruleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:309:1: (lv_value_3_0= ruleFieldValue )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:310:3: lv_value_3_0= ruleFieldValue
            {
             
            	        newCompositeNode(grammarAccess.getSimpleClauseAccess().getValueFieldValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFieldValue_in_ruleSimpleClause596);
            lv_value_3_0=ruleFieldValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleClauseRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:334:1: entryRuleTypeClause returns [EObject current=null] : iv_ruleTypeClause= ruleTypeClause EOF ;
    public final EObject entryRuleTypeClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeClause = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:335:2: (iv_ruleTypeClause= ruleTypeClause EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:336:2: iv_ruleTypeClause= ruleTypeClause EOF
            {
             newCompositeNode(grammarAccess.getTypeClauseRule()); 
            pushFollow(FOLLOW_ruleTypeClause_in_entryRuleTypeClause632);
            iv_ruleTypeClause=ruleTypeClause();

            state._fsp--;

             current =iv_ruleTypeClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeClause642); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:343:1: ruleTypeClause returns [EObject current=null] : ( ( (lv_n_0_0= ruleNotExpression ) )? ( (lv_field_1_0= ruleTypeFieldName ) ) otherlv_2= ':' ( (lv_value_3_0= ruleTypeTest ) ) ) ;
    public final EObject ruleTypeClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_n_0_0 = null;

        EObject lv_field_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:346:28: ( ( ( (lv_n_0_0= ruleNotExpression ) )? ( (lv_field_1_0= ruleTypeFieldName ) ) otherlv_2= ':' ( (lv_value_3_0= ruleTypeTest ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:347:1: ( ( (lv_n_0_0= ruleNotExpression ) )? ( (lv_field_1_0= ruleTypeFieldName ) ) otherlv_2= ':' ( (lv_value_3_0= ruleTypeTest ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:347:1: ( ( (lv_n_0_0= ruleNotExpression ) )? ( (lv_field_1_0= ruleTypeFieldName ) ) otherlv_2= ':' ( (lv_value_3_0= ruleTypeTest ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:347:2: ( (lv_n_0_0= ruleNotExpression ) )? ( (lv_field_1_0= ruleTypeFieldName ) ) otherlv_2= ':' ( (lv_value_3_0= ruleTypeTest ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:347:2: ( (lv_n_0_0= ruleNotExpression ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=60 && LA5_0<=62)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:348:1: (lv_n_0_0= ruleNotExpression )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:348:1: (lv_n_0_0= ruleNotExpression )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:349:3: lv_n_0_0= ruleNotExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeClauseAccess().getNNotExpressionEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleTypeClause688);
                    lv_n_0_0=ruleNotExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"n",
                            		lv_n_0_0, 
                            		"NotExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:365:3: ( (lv_field_1_0= ruleTypeFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:366:1: (lv_field_1_0= ruleTypeFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:366:1: (lv_field_1_0= ruleTypeFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:367:3: lv_field_1_0= ruleTypeFieldName
            {
             
            	        newCompositeNode(grammarAccess.getTypeClauseAccess().getFieldTypeFieldNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeFieldName_in_ruleTypeClause710);
            lv_field_1_0=ruleTypeFieldName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeClauseRule());
            	        }
                   		set(
                   			current, 
                   			"field",
                    		lv_field_1_0, 
                    		"TypeFieldName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleTypeClause722); 

                	newLeafNode(otherlv_2, grammarAccess.getTypeClauseAccess().getColonKeyword_2());
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:387:1: ( (lv_value_3_0= ruleTypeTest ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:388:1: (lv_value_3_0= ruleTypeTest )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:388:1: (lv_value_3_0= ruleTypeTest )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:389:3: lv_value_3_0= ruleTypeTest
            {
             
            	        newCompositeNode(grammarAccess.getTypeClauseAccess().getValueTypeTestParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeTest_in_ruleTypeClause743);
            lv_value_3_0=ruleTypeTest();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeClauseRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"TypeTest");
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:413:1: entryRuleFieldValue returns [String current=null] : iv_ruleFieldValue= ruleFieldValue EOF ;
    public final String entryRuleFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:414:2: (iv_ruleFieldValue= ruleFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:415:2: iv_ruleFieldValue= ruleFieldValue EOF
            {
             newCompositeNode(grammarAccess.getFieldValueRule()); 
            pushFollow(FOLLOW_ruleFieldValue_in_entryRuleFieldValue780);
            iv_ruleFieldValue=ruleFieldValue();

            state._fsp--;

             current =iv_ruleFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldValue791); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:422:1: ruleFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Value_0= ruleValue | (kw= '(' (this_Value_2= ruleValue )* kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Value_0 = null;

        AntlrDatatypeRuleToken this_Value_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:425:28: ( (this_Value_0= ruleValue | (kw= '(' (this_Value_2= ruleValue )* kw= ')' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:426:1: (this_Value_0= ruleValue | (kw= '(' (this_Value_2= ruleValue )* kw= ')' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:426:1: (this_Value_0= ruleValue | (kw= '(' (this_Value_2= ruleValue )* kw= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||(LA7_0>=16 && LA7_0<=17)) ) {
                alt7=1;
            }
            else if ( (LA7_0==11) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:427:5: this_Value_0= ruleValue
                    {
                     
                            newCompositeNode(grammarAccess.getFieldValueAccess().getValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleValue_in_ruleFieldValue838);
                    this_Value_0=ruleValue();

                    state._fsp--;


                    		current.merge(this_Value_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:438:6: (kw= '(' (this_Value_2= ruleValue )* kw= ')' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:438:6: (kw= '(' (this_Value_2= ruleValue )* kw= ')' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:439:2: kw= '(' (this_Value_2= ruleValue )* kw= ')'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleFieldValue863); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFieldValueAccess().getLeftParenthesisKeyword_1_0()); 
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:444:1: (this_Value_2= ruleValue )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||(LA6_0>=16 && LA6_0<=17)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:445:5: this_Value_2= ruleValue
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFieldValueAccess().getValueParserRuleCall_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleValue_in_ruleFieldValue886);
                    	    this_Value_2=ruleValue();

                    	    state._fsp--;


                    	    		current.merge(this_Value_2);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    kw=(Token)match(input,12,FOLLOW_12_in_ruleFieldValue906); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFieldValueAccess().getRightParenthesisKeyword_1_2()); 
                        

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
    // $ANTLR end "ruleFieldValue"


    // $ANTLR start "entryRuleTypeTest"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:469:1: entryRuleTypeTest returns [EObject current=null] : iv_ruleTypeTest= ruleTypeTest EOF ;
    public final EObject entryRuleTypeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTest = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:470:2: (iv_ruleTypeTest= ruleTypeTest EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:471:2: iv_ruleTypeTest= ruleTypeTest EOF
            {
             newCompositeNode(grammarAccess.getTypeTestRule()); 
            pushFollow(FOLLOW_ruleTypeTest_in_entryRuleTypeTest947);
            iv_ruleTypeTest=ruleTypeTest();

            state._fsp--;

             current =iv_ruleTypeTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeTest957); 

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
    // $ANTLR end "entryRuleTypeTest"


    // $ANTLR start "ruleTypeTest"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:478:1: ruleTypeTest returns [EObject current=null] : ( ( (lv_test1_0_0= 'test1' ) ) | ( (lv_test2_1_0= 'test2' ) ) ) ;
    public final EObject ruleTypeTest() throws RecognitionException {
        EObject current = null;

        Token lv_test1_0_0=null;
        Token lv_test2_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:481:28: ( ( ( (lv_test1_0_0= 'test1' ) ) | ( (lv_test2_1_0= 'test2' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:482:1: ( ( (lv_test1_0_0= 'test1' ) ) | ( (lv_test2_1_0= 'test2' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:482:1: ( ( (lv_test1_0_0= 'test1' ) ) | ( (lv_test2_1_0= 'test2' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:482:2: ( (lv_test1_0_0= 'test1' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:482:2: ( (lv_test1_0_0= 'test1' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:483:1: (lv_test1_0_0= 'test1' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:483:1: (lv_test1_0_0= 'test1' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:484:3: lv_test1_0_0= 'test1'
                    {
                    lv_test1_0_0=(Token)match(input,14,FOLLOW_14_in_ruleTypeTest1000); 

                            newLeafNode(lv_test1_0_0, grammarAccess.getTypeTestAccess().getTest1Test1Keyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeTestRule());
                    	        }
                           		setWithLastConsumed(current, "test1", lv_test1_0_0, "test1");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:498:6: ( (lv_test2_1_0= 'test2' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:498:6: ( (lv_test2_1_0= 'test2' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:499:1: (lv_test2_1_0= 'test2' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:499:1: (lv_test2_1_0= 'test2' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:500:3: lv_test2_1_0= 'test2'
                    {
                    lv_test2_1_0=(Token)match(input,15,FOLLOW_15_in_ruleTypeTest1037); 

                            newLeafNode(lv_test2_1_0, grammarAccess.getTypeTestAccess().getTest2Test2Keyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeTestRule());
                    	        }
                           		setWithLastConsumed(current, "test2", lv_test2_1_0, "test2");
                    	    

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
    // $ANTLR end "ruleTypeTest"


    // $ANTLR start "entryRuleValue"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:521:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:522:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:523:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1087);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1098); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:530:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING ) ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_STRING_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:533:28: ( ( (kw= '+' | kw= '-' )? (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:534:1: ( (kw= '+' | kw= '-' )? (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:534:1: ( (kw= '+' | kw= '-' )? (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:534:2: (kw= '+' | kw= '-' )? (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:534:2: (kw= '+' | kw= '-' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:535:2: kw= '+'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleValue1137); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValueAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:542:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleValue1156); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValueAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:547:3: (this_ID_2= RULE_ID | this_STRING_3= RULE_STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:547:8: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue1174); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getValueAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:555:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue1200); 

                    		current.merge(this_STRING_3);
                        
                     
                        newLeafNode(this_STRING_3, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1_1()); 
                        

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


    // $ANTLR start "entryRuleFieldName"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:570:1: entryRuleFieldName returns [EObject current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final EObject entryRuleFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:571:2: (iv_ruleFieldName= ruleFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:572:2: iv_ruleFieldName= ruleFieldName EOF
            {
             newCompositeNode(grammarAccess.getFieldNameRule()); 
            pushFollow(FOLLOW_ruleFieldName_in_entryRuleFieldName1246);
            iv_ruleFieldName=ruleFieldName();

            state._fsp--;

             current =iv_ruleFieldName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldName1256); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:579:1: ruleFieldName returns [EObject current=null] : ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_3_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_4_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_5_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_6_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_7_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_8_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_9_0= 'ProjectName' ) ) | ( (lv_ResourcePath_10_0= 'ResourcePath' ) ) | ( (lv_Modifiers_11_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_12_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_13_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_14_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_15_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_16_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_17_0= 'FullText' ) ) | ( (lv_FieldsRead_18_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_19_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_20_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_21_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_22_0= 'Annotations' ) ) | ( (lv_Timestamp_23_0= 'Timestamp' ) ) ) ;
    public final EObject ruleFieldName() throws RecognitionException {
        EObject current = null;

        Token lv_FullyQualifiedName_0_0=null;
        Token lv_FriendlyName_1_0=null;
        Token lv_DeclaredMethods_2_0=null;
        Token lv_ParameterCount_3_0=null;
        Token lv_ReturnVariableEexpressions_4_0=null;
        Token lv_UsedMethods_5_0=null;
        Token lv_UsedMethodsInTry_6_0=null;
        Token lv_UsedMethodsInFinally_7_0=null;
        Token lv_OverriddenMethods_8_0=null;
        Token lv_ProjectName_9_0=null;
        Token lv_ResourcePath_10_0=null;
        Token lv_Modifiers_11_0=null;
        Token lv_AllDeclaredMethodNames_12_0=null;
        Token lv_DeclaredMethodNames_13_0=null;
        Token lv_DeclaredFieldNames_14_0=null;
        Token lv_DeclaredFieldTypes_15_0=null;
        Token lv_AllDeclaredFieldNames_16_0=null;
        Token lv_FullText_17_0=null;
        Token lv_FieldsRead_18_0=null;
        Token lv_FieldsWritten_19_0=null;
        Token lv_UsedFieldsInFinally_20_0=null;
        Token lv_UsedFieldsInTry_21_0=null;
        Token lv_Annotations_22_0=null;
        Token lv_Timestamp_23_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:582:28: ( ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_3_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_4_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_5_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_6_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_7_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_8_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_9_0= 'ProjectName' ) ) | ( (lv_ResourcePath_10_0= 'ResourcePath' ) ) | ( (lv_Modifiers_11_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_12_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_13_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_14_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_15_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_16_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_17_0= 'FullText' ) ) | ( (lv_FieldsRead_18_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_19_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_20_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_21_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_22_0= 'Annotations' ) ) | ( (lv_Timestamp_23_0= 'Timestamp' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:583:1: ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_3_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_4_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_5_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_6_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_7_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_8_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_9_0= 'ProjectName' ) ) | ( (lv_ResourcePath_10_0= 'ResourcePath' ) ) | ( (lv_Modifiers_11_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_12_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_13_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_14_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_15_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_16_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_17_0= 'FullText' ) ) | ( (lv_FieldsRead_18_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_19_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_20_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_21_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_22_0= 'Annotations' ) ) | ( (lv_Timestamp_23_0= 'Timestamp' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:583:1: ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_FriendlyName_1_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_3_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_4_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_5_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_6_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_7_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_8_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_9_0= 'ProjectName' ) ) | ( (lv_ResourcePath_10_0= 'ResourcePath' ) ) | ( (lv_Modifiers_11_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_12_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_13_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_14_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_15_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_16_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_17_0= 'FullText' ) ) | ( (lv_FieldsRead_18_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_19_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_20_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_21_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_22_0= 'Annotations' ) ) | ( (lv_Timestamp_23_0= 'Timestamp' ) ) )
            int alt11=24;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 22:
                {
                alt11=5;
                }
                break;
            case 23:
                {
                alt11=6;
                }
                break;
            case 24:
                {
                alt11=7;
                }
                break;
            case 25:
                {
                alt11=8;
                }
                break;
            case 26:
                {
                alt11=9;
                }
                break;
            case 27:
                {
                alt11=10;
                }
                break;
            case 28:
                {
                alt11=11;
                }
                break;
            case 29:
                {
                alt11=12;
                }
                break;
            case 30:
                {
                alt11=13;
                }
                break;
            case 31:
                {
                alt11=14;
                }
                break;
            case 32:
                {
                alt11=15;
                }
                break;
            case 33:
                {
                alt11=16;
                }
                break;
            case 34:
                {
                alt11=17;
                }
                break;
            case 35:
                {
                alt11=18;
                }
                break;
            case 36:
                {
                alt11=19;
                }
                break;
            case 37:
                {
                alt11=20;
                }
                break;
            case 38:
                {
                alt11=21;
                }
                break;
            case 39:
                {
                alt11=22;
                }
                break;
            case 40:
                {
                alt11=23;
                }
                break;
            case 41:
                {
                alt11=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:583:2: ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:583:2: ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:584:1: (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:584:1: (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:585:3: lv_FullyQualifiedName_0_0= 'FullyQualifiedName'
                    {
                    lv_FullyQualifiedName_0_0=(Token)match(input,18,FOLLOW_18_in_ruleFieldName1299); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:599:6: ( (lv_FriendlyName_1_0= 'FriendlyName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:599:6: ( (lv_FriendlyName_1_0= 'FriendlyName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:600:1: (lv_FriendlyName_1_0= 'FriendlyName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:600:1: (lv_FriendlyName_1_0= 'FriendlyName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:601:3: lv_FriendlyName_1_0= 'FriendlyName'
                    {
                    lv_FriendlyName_1_0=(Token)match(input,19,FOLLOW_19_in_ruleFieldName1336); 

                            newLeafNode(lv_FriendlyName_1_0, grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FriendlyName", lv_FriendlyName_1_0, "FriendlyName");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:615:6: ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:615:6: ( (lv_DeclaredMethods_2_0= 'DeclaredMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:616:1: (lv_DeclaredMethods_2_0= 'DeclaredMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:616:1: (lv_DeclaredMethods_2_0= 'DeclaredMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:617:3: lv_DeclaredMethods_2_0= 'DeclaredMethods'
                    {
                    lv_DeclaredMethods_2_0=(Token)match(input,20,FOLLOW_20_in_ruleFieldName1373); 

                            newLeafNode(lv_DeclaredMethods_2_0, grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredMethods", lv_DeclaredMethods_2_0, "DeclaredMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:631:6: ( (lv_ParameterCount_3_0= 'ParameterCount' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:631:6: ( (lv_ParameterCount_3_0= 'ParameterCount' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:632:1: (lv_ParameterCount_3_0= 'ParameterCount' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:632:1: (lv_ParameterCount_3_0= 'ParameterCount' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:633:3: lv_ParameterCount_3_0= 'ParameterCount'
                    {
                    lv_ParameterCount_3_0=(Token)match(input,21,FOLLOW_21_in_ruleFieldName1410); 

                            newLeafNode(lv_ParameterCount_3_0, grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ParameterCount", lv_ParameterCount_3_0, "ParameterCount");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:647:6: ( (lv_ReturnVariableEexpressions_4_0= 'ReturnVariableEexpressions' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:647:6: ( (lv_ReturnVariableEexpressions_4_0= 'ReturnVariableEexpressions' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:648:1: (lv_ReturnVariableEexpressions_4_0= 'ReturnVariableEexpressions' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:648:1: (lv_ReturnVariableEexpressions_4_0= 'ReturnVariableEexpressions' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:649:3: lv_ReturnVariableEexpressions_4_0= 'ReturnVariableEexpressions'
                    {
                    lv_ReturnVariableEexpressions_4_0=(Token)match(input,22,FOLLOW_22_in_ruleFieldName1447); 

                            newLeafNode(lv_ReturnVariableEexpressions_4_0, grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ReturnVariableEexpressions", lv_ReturnVariableEexpressions_4_0, "ReturnVariableEexpressions");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:663:6: ( (lv_UsedMethods_5_0= 'UsedMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:663:6: ( (lv_UsedMethods_5_0= 'UsedMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:664:1: (lv_UsedMethods_5_0= 'UsedMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:664:1: (lv_UsedMethods_5_0= 'UsedMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:665:3: lv_UsedMethods_5_0= 'UsedMethods'
                    {
                    lv_UsedMethods_5_0=(Token)match(input,23,FOLLOW_23_in_ruleFieldName1484); 

                            newLeafNode(lv_UsedMethods_5_0, grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedMethods", lv_UsedMethods_5_0, "UsedMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:679:6: ( (lv_UsedMethodsInTry_6_0= 'UsedMethodsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:679:6: ( (lv_UsedMethodsInTry_6_0= 'UsedMethodsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:680:1: (lv_UsedMethodsInTry_6_0= 'UsedMethodsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:680:1: (lv_UsedMethodsInTry_6_0= 'UsedMethodsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:681:3: lv_UsedMethodsInTry_6_0= 'UsedMethodsInTry'
                    {
                    lv_UsedMethodsInTry_6_0=(Token)match(input,24,FOLLOW_24_in_ruleFieldName1521); 

                            newLeafNode(lv_UsedMethodsInTry_6_0, grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedMethodsInTry", lv_UsedMethodsInTry_6_0, "UsedMethodsInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:695:6: ( (lv_UsedMethodsInFinally_7_0= 'UsedMethodsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:695:6: ( (lv_UsedMethodsInFinally_7_0= 'UsedMethodsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:696:1: (lv_UsedMethodsInFinally_7_0= 'UsedMethodsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:696:1: (lv_UsedMethodsInFinally_7_0= 'UsedMethodsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:697:3: lv_UsedMethodsInFinally_7_0= 'UsedMethodsInFinally'
                    {
                    lv_UsedMethodsInFinally_7_0=(Token)match(input,25,FOLLOW_25_in_ruleFieldName1558); 

                            newLeafNode(lv_UsedMethodsInFinally_7_0, grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedMethodsInFinally", lv_UsedMethodsInFinally_7_0, "UsedMethodsInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:711:6: ( (lv_OverriddenMethods_8_0= 'OverriddenMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:711:6: ( (lv_OverriddenMethods_8_0= 'OverriddenMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:712:1: (lv_OverriddenMethods_8_0= 'OverriddenMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:712:1: (lv_OverriddenMethods_8_0= 'OverriddenMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:713:3: lv_OverriddenMethods_8_0= 'OverriddenMethods'
                    {
                    lv_OverriddenMethods_8_0=(Token)match(input,26,FOLLOW_26_in_ruleFieldName1595); 

                            newLeafNode(lv_OverriddenMethods_8_0, grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "OverriddenMethods", lv_OverriddenMethods_8_0, "OverriddenMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:727:6: ( (lv_ProjectName_9_0= 'ProjectName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:727:6: ( (lv_ProjectName_9_0= 'ProjectName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:728:1: (lv_ProjectName_9_0= 'ProjectName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:728:1: (lv_ProjectName_9_0= 'ProjectName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:729:3: lv_ProjectName_9_0= 'ProjectName'
                    {
                    lv_ProjectName_9_0=(Token)match(input,27,FOLLOW_27_in_ruleFieldName1632); 

                            newLeafNode(lv_ProjectName_9_0, grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ProjectName", lv_ProjectName_9_0, "ProjectName");
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:743:6: ( (lv_ResourcePath_10_0= 'ResourcePath' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:743:6: ( (lv_ResourcePath_10_0= 'ResourcePath' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:744:1: (lv_ResourcePath_10_0= 'ResourcePath' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:744:1: (lv_ResourcePath_10_0= 'ResourcePath' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:745:3: lv_ResourcePath_10_0= 'ResourcePath'
                    {
                    lv_ResourcePath_10_0=(Token)match(input,28,FOLLOW_28_in_ruleFieldName1669); 

                            newLeafNode(lv_ResourcePath_10_0, grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ResourcePath", lv_ResourcePath_10_0, "ResourcePath");
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:759:6: ( (lv_Modifiers_11_0= 'Modifiers' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:759:6: ( (lv_Modifiers_11_0= 'Modifiers' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:760:1: (lv_Modifiers_11_0= 'Modifiers' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:760:1: (lv_Modifiers_11_0= 'Modifiers' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:761:3: lv_Modifiers_11_0= 'Modifiers'
                    {
                    lv_Modifiers_11_0=(Token)match(input,29,FOLLOW_29_in_ruleFieldName1706); 

                            newLeafNode(lv_Modifiers_11_0, grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "Modifiers", lv_Modifiers_11_0, "Modifiers");
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:775:6: ( (lv_AllDeclaredMethodNames_12_0= 'AllDeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:775:6: ( (lv_AllDeclaredMethodNames_12_0= 'AllDeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:776:1: (lv_AllDeclaredMethodNames_12_0= 'AllDeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:776:1: (lv_AllDeclaredMethodNames_12_0= 'AllDeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:777:3: lv_AllDeclaredMethodNames_12_0= 'AllDeclaredMethodNames'
                    {
                    lv_AllDeclaredMethodNames_12_0=(Token)match(input,30,FOLLOW_30_in_ruleFieldName1743); 

                            newLeafNode(lv_AllDeclaredMethodNames_12_0, grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "AllDeclaredMethodNames", lv_AllDeclaredMethodNames_12_0, "AllDeclaredMethodNames");
                    	    

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:791:6: ( (lv_DeclaredMethodNames_13_0= 'DeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:791:6: ( (lv_DeclaredMethodNames_13_0= 'DeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:792:1: (lv_DeclaredMethodNames_13_0= 'DeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:792:1: (lv_DeclaredMethodNames_13_0= 'DeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:793:3: lv_DeclaredMethodNames_13_0= 'DeclaredMethodNames'
                    {
                    lv_DeclaredMethodNames_13_0=(Token)match(input,31,FOLLOW_31_in_ruleFieldName1780); 

                            newLeafNode(lv_DeclaredMethodNames_13_0, grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_13_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredMethodNames", lv_DeclaredMethodNames_13_0, "DeclaredMethodNames");
                    	    

                    }


                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:807:6: ( (lv_DeclaredFieldNames_14_0= 'DeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:807:6: ( (lv_DeclaredFieldNames_14_0= 'DeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:808:1: (lv_DeclaredFieldNames_14_0= 'DeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:808:1: (lv_DeclaredFieldNames_14_0= 'DeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:809:3: lv_DeclaredFieldNames_14_0= 'DeclaredFieldNames'
                    {
                    lv_DeclaredFieldNames_14_0=(Token)match(input,32,FOLLOW_32_in_ruleFieldName1817); 

                            newLeafNode(lv_DeclaredFieldNames_14_0, grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_14_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredFieldNames", lv_DeclaredFieldNames_14_0, "DeclaredFieldNames");
                    	    

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:823:6: ( (lv_DeclaredFieldTypes_15_0= 'DeclaredFieldTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:823:6: ( (lv_DeclaredFieldTypes_15_0= 'DeclaredFieldTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:824:1: (lv_DeclaredFieldTypes_15_0= 'DeclaredFieldTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:824:1: (lv_DeclaredFieldTypes_15_0= 'DeclaredFieldTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:825:3: lv_DeclaredFieldTypes_15_0= 'DeclaredFieldTypes'
                    {
                    lv_DeclaredFieldTypes_15_0=(Token)match(input,33,FOLLOW_33_in_ruleFieldName1854); 

                            newLeafNode(lv_DeclaredFieldTypes_15_0, grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_15_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaredFieldTypes", lv_DeclaredFieldTypes_15_0, "DeclaredFieldTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 17 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:839:6: ( (lv_AllDeclaredFieldNames_16_0= 'AllDeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:839:6: ( (lv_AllDeclaredFieldNames_16_0= 'AllDeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:840:1: (lv_AllDeclaredFieldNames_16_0= 'AllDeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:840:1: (lv_AllDeclaredFieldNames_16_0= 'AllDeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:841:3: lv_AllDeclaredFieldNames_16_0= 'AllDeclaredFieldNames'
                    {
                    lv_AllDeclaredFieldNames_16_0=(Token)match(input,34,FOLLOW_34_in_ruleFieldName1891); 

                            newLeafNode(lv_AllDeclaredFieldNames_16_0, grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_16_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "AllDeclaredFieldNames", lv_AllDeclaredFieldNames_16_0, "AllDeclaredFieldNames");
                    	    

                    }


                    }


                    }
                    break;
                case 18 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:855:6: ( (lv_FullText_17_0= 'FullText' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:855:6: ( (lv_FullText_17_0= 'FullText' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:856:1: (lv_FullText_17_0= 'FullText' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:856:1: (lv_FullText_17_0= 'FullText' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:857:3: lv_FullText_17_0= 'FullText'
                    {
                    lv_FullText_17_0=(Token)match(input,35,FOLLOW_35_in_ruleFieldName1928); 

                            newLeafNode(lv_FullText_17_0, grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_17_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FullText", lv_FullText_17_0, "FullText");
                    	    

                    }


                    }


                    }
                    break;
                case 19 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:871:6: ( (lv_FieldsRead_18_0= 'FieldsRead' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:871:6: ( (lv_FieldsRead_18_0= 'FieldsRead' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:872:1: (lv_FieldsRead_18_0= 'FieldsRead' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:872:1: (lv_FieldsRead_18_0= 'FieldsRead' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:873:3: lv_FieldsRead_18_0= 'FieldsRead'
                    {
                    lv_FieldsRead_18_0=(Token)match(input,36,FOLLOW_36_in_ruleFieldName1965); 

                            newLeafNode(lv_FieldsRead_18_0, grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_18_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FieldsRead", lv_FieldsRead_18_0, "FieldsRead");
                    	    

                    }


                    }


                    }
                    break;
                case 20 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:887:6: ( (lv_FieldsWritten_19_0= 'FieldsWritten' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:887:6: ( (lv_FieldsWritten_19_0= 'FieldsWritten' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:888:1: (lv_FieldsWritten_19_0= 'FieldsWritten' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:888:1: (lv_FieldsWritten_19_0= 'FieldsWritten' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:889:3: lv_FieldsWritten_19_0= 'FieldsWritten'
                    {
                    lv_FieldsWritten_19_0=(Token)match(input,37,FOLLOW_37_in_ruleFieldName2002); 

                            newLeafNode(lv_FieldsWritten_19_0, grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_19_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FieldsWritten", lv_FieldsWritten_19_0, "FieldsWritten");
                    	    

                    }


                    }


                    }
                    break;
                case 21 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:903:6: ( (lv_UsedFieldsInFinally_20_0= 'UsedFieldsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:903:6: ( (lv_UsedFieldsInFinally_20_0= 'UsedFieldsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:904:1: (lv_UsedFieldsInFinally_20_0= 'UsedFieldsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:904:1: (lv_UsedFieldsInFinally_20_0= 'UsedFieldsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:905:3: lv_UsedFieldsInFinally_20_0= 'UsedFieldsInFinally'
                    {
                    lv_UsedFieldsInFinally_20_0=(Token)match(input,38,FOLLOW_38_in_ruleFieldName2039); 

                            newLeafNode(lv_UsedFieldsInFinally_20_0, grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_20_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedFieldsInFinally", lv_UsedFieldsInFinally_20_0, "UsedFieldsInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 22 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:919:6: ( (lv_UsedFieldsInTry_21_0= 'UsedFieldsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:919:6: ( (lv_UsedFieldsInTry_21_0= 'UsedFieldsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:920:1: (lv_UsedFieldsInTry_21_0= 'UsedFieldsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:920:1: (lv_UsedFieldsInTry_21_0= 'UsedFieldsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:921:3: lv_UsedFieldsInTry_21_0= 'UsedFieldsInTry'
                    {
                    lv_UsedFieldsInTry_21_0=(Token)match(input,39,FOLLOW_39_in_ruleFieldName2076); 

                            newLeafNode(lv_UsedFieldsInTry_21_0, grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_21_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedFieldsInTry", lv_UsedFieldsInTry_21_0, "UsedFieldsInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 23 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:935:6: ( (lv_Annotations_22_0= 'Annotations' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:935:6: ( (lv_Annotations_22_0= 'Annotations' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:936:1: (lv_Annotations_22_0= 'Annotations' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:936:1: (lv_Annotations_22_0= 'Annotations' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:937:3: lv_Annotations_22_0= 'Annotations'
                    {
                    lv_Annotations_22_0=(Token)match(input,40,FOLLOW_40_in_ruleFieldName2113); 

                            newLeafNode(lv_Annotations_22_0, grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_22_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "Annotations", lv_Annotations_22_0, "Annotations");
                    	    

                    }


                    }


                    }
                    break;
                case 24 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:951:6: ( (lv_Timestamp_23_0= 'Timestamp' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:951:6: ( (lv_Timestamp_23_0= 'Timestamp' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:952:1: (lv_Timestamp_23_0= 'Timestamp' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:952:1: (lv_Timestamp_23_0= 'Timestamp' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:953:3: lv_Timestamp_23_0= 'Timestamp'
                    {
                    lv_Timestamp_23_0=(Token)match(input,41,FOLLOW_41_in_ruleFieldName2150); 

                            newLeafNode(lv_Timestamp_23_0, grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_23_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "Timestamp", lv_Timestamp_23_0, "Timestamp");
                    	    

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:974:1: entryRuleTypeFieldName returns [EObject current=null] : iv_ruleTypeFieldName= ruleTypeFieldName EOF ;
    public final EObject entryRuleTypeFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFieldName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:975:2: (iv_ruleTypeFieldName= ruleTypeFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:976:2: iv_ruleTypeFieldName= ruleTypeFieldName EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldNameRule()); 
            pushFollow(FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName2199);
            iv_ruleTypeFieldName=ruleTypeFieldName();

            state._fsp--;

             current =iv_ruleTypeFieldName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldName2209); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:983:1: ruleTypeFieldName returns [EObject current=null] : ( ( (lv_type_0_0= 'type' ) ) | ( (lv_ImplementedTypes_1_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_2_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_3_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_4_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_5_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_6_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_7_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_DeclaringType_11_0= 'DeclaringType' ) ) | ( (lv_CaughtType_12_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_13_0= 'InstanceofTypes' ) ) ) ;
    public final EObject ruleTypeFieldName() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_ImplementedTypes_1_0=null;
        Token lv_ExtendedTypes_2_0=null;
        Token lv_UsedTypes_3_0=null;
        Token lv_UsedTypesInTry_4_0=null;
        Token lv_UsedTypesInFinally_5_0=null;
        Token lv_ParameterTypes_6_0=null;
        Token lv_ReturnType_7_0=null;
        Token lv_AllImplementedTypes_8_0=null;
        Token lv_AllExtendedTypes_9_0=null;
        Token lv_FieldType_10_0=null;
        Token lv_DeclaringType_11_0=null;
        Token lv_CaughtType_12_0=null;
        Token lv_InstanceofTypes_13_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:986:28: ( ( ( (lv_type_0_0= 'type' ) ) | ( (lv_ImplementedTypes_1_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_2_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_3_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_4_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_5_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_6_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_7_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_DeclaringType_11_0= 'DeclaringType' ) ) | ( (lv_CaughtType_12_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_13_0= 'InstanceofTypes' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:987:1: ( ( (lv_type_0_0= 'type' ) ) | ( (lv_ImplementedTypes_1_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_2_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_3_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_4_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_5_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_6_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_7_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_DeclaringType_11_0= 'DeclaringType' ) ) | ( (lv_CaughtType_12_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_13_0= 'InstanceofTypes' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:987:1: ( ( (lv_type_0_0= 'type' ) ) | ( (lv_ImplementedTypes_1_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_2_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_3_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_4_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_5_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_6_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_7_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_10_0= 'FieldType' ) ) | ( (lv_DeclaringType_11_0= 'DeclaringType' ) ) | ( (lv_CaughtType_12_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_13_0= 'InstanceofTypes' ) ) )
            int alt12=14;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt12=1;
                }
                break;
            case 43:
                {
                alt12=2;
                }
                break;
            case 44:
                {
                alt12=3;
                }
                break;
            case 45:
                {
                alt12=4;
                }
                break;
            case 46:
                {
                alt12=5;
                }
                break;
            case 47:
                {
                alt12=6;
                }
                break;
            case 48:
                {
                alt12=7;
                }
                break;
            case 49:
                {
                alt12=8;
                }
                break;
            case 50:
                {
                alt12=9;
                }
                break;
            case 51:
                {
                alt12=10;
                }
                break;
            case 52:
                {
                alt12=11;
                }
                break;
            case 53:
                {
                alt12=12;
                }
                break;
            case 54:
                {
                alt12=13;
                }
                break;
            case 55:
                {
                alt12=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:987:2: ( (lv_type_0_0= 'type' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:987:2: ( (lv_type_0_0= 'type' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:988:1: (lv_type_0_0= 'type' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:988:1: (lv_type_0_0= 'type' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:989:3: lv_type_0_0= 'type'
                    {
                    lv_type_0_0=(Token)match(input,42,FOLLOW_42_in_ruleTypeFieldName2252); 

                            newLeafNode(lv_type_0_0, grammarAccess.getTypeFieldNameAccess().getTypeTypeKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_0, "type");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1003:6: ( (lv_ImplementedTypes_1_0= 'ImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1003:6: ( (lv_ImplementedTypes_1_0= 'ImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1004:1: (lv_ImplementedTypes_1_0= 'ImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1004:1: (lv_ImplementedTypes_1_0= 'ImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1005:3: lv_ImplementedTypes_1_0= 'ImplementedTypes'
                    {
                    lv_ImplementedTypes_1_0=(Token)match(input,43,FOLLOW_43_in_ruleTypeFieldName2289); 

                            newLeafNode(lv_ImplementedTypes_1_0, grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ImplementedTypes", lv_ImplementedTypes_1_0, "ImplementedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1019:6: ( (lv_ExtendedTypes_2_0= 'ExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1019:6: ( (lv_ExtendedTypes_2_0= 'ExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1020:1: (lv_ExtendedTypes_2_0= 'ExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1020:1: (lv_ExtendedTypes_2_0= 'ExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1021:3: lv_ExtendedTypes_2_0= 'ExtendedTypes'
                    {
                    lv_ExtendedTypes_2_0=(Token)match(input,44,FOLLOW_44_in_ruleTypeFieldName2326); 

                            newLeafNode(lv_ExtendedTypes_2_0, grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ExtendedTypes", lv_ExtendedTypes_2_0, "ExtendedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1035:6: ( (lv_UsedTypes_3_0= 'UsedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1035:6: ( (lv_UsedTypes_3_0= 'UsedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1036:1: (lv_UsedTypes_3_0= 'UsedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1036:1: (lv_UsedTypes_3_0= 'UsedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1037:3: lv_UsedTypes_3_0= 'UsedTypes'
                    {
                    lv_UsedTypes_3_0=(Token)match(input,45,FOLLOW_45_in_ruleTypeFieldName2363); 

                            newLeafNode(lv_UsedTypes_3_0, grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedTypes", lv_UsedTypes_3_0, "UsedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1051:6: ( (lv_UsedTypesInTry_4_0= 'UsedTypesInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1051:6: ( (lv_UsedTypesInTry_4_0= 'UsedTypesInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1052:1: (lv_UsedTypesInTry_4_0= 'UsedTypesInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1052:1: (lv_UsedTypesInTry_4_0= 'UsedTypesInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1053:3: lv_UsedTypesInTry_4_0= 'UsedTypesInTry'
                    {
                    lv_UsedTypesInTry_4_0=(Token)match(input,46,FOLLOW_46_in_ruleTypeFieldName2400); 

                            newLeafNode(lv_UsedTypesInTry_4_0, grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedTypesInTry", lv_UsedTypesInTry_4_0, "UsedTypesInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1067:6: ( (lv_UsedTypesInFinally_5_0= 'UsedTypesInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1067:6: ( (lv_UsedTypesInFinally_5_0= 'UsedTypesInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1068:1: (lv_UsedTypesInFinally_5_0= 'UsedTypesInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1068:1: (lv_UsedTypesInFinally_5_0= 'UsedTypesInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1069:3: lv_UsedTypesInFinally_5_0= 'UsedTypesInFinally'
                    {
                    lv_UsedTypesInFinally_5_0=(Token)match(input,47,FOLLOW_47_in_ruleTypeFieldName2437); 

                            newLeafNode(lv_UsedTypesInFinally_5_0, grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "UsedTypesInFinally", lv_UsedTypesInFinally_5_0, "UsedTypesInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1083:6: ( (lv_ParameterTypes_6_0= 'ParameterTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1083:6: ( (lv_ParameterTypes_6_0= 'ParameterTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1084:1: (lv_ParameterTypes_6_0= 'ParameterTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1084:1: (lv_ParameterTypes_6_0= 'ParameterTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1085:3: lv_ParameterTypes_6_0= 'ParameterTypes'
                    {
                    lv_ParameterTypes_6_0=(Token)match(input,48,FOLLOW_48_in_ruleTypeFieldName2474); 

                            newLeafNode(lv_ParameterTypes_6_0, grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ParameterTypes", lv_ParameterTypes_6_0, "ParameterTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1099:6: ( (lv_ReturnType_7_0= 'ReturnType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1099:6: ( (lv_ReturnType_7_0= 'ReturnType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1100:1: (lv_ReturnType_7_0= 'ReturnType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1100:1: (lv_ReturnType_7_0= 'ReturnType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1101:3: lv_ReturnType_7_0= 'ReturnType'
                    {
                    lv_ReturnType_7_0=(Token)match(input,49,FOLLOW_49_in_ruleTypeFieldName2511); 

                            newLeafNode(lv_ReturnType_7_0, grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "ReturnType", lv_ReturnType_7_0, "ReturnType");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1115:6: ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1115:6: ( (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1116:1: (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1116:1: (lv_AllImplementedTypes_8_0= 'AllImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1117:3: lv_AllImplementedTypes_8_0= 'AllImplementedTypes'
                    {
                    lv_AllImplementedTypes_8_0=(Token)match(input,50,FOLLOW_50_in_ruleTypeFieldName2548); 

                            newLeafNode(lv_AllImplementedTypes_8_0, grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "AllImplementedTypes", lv_AllImplementedTypes_8_0, "AllImplementedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1131:6: ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1131:6: ( (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1132:1: (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1132:1: (lv_AllExtendedTypes_9_0= 'AllExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1133:3: lv_AllExtendedTypes_9_0= 'AllExtendedTypes'
                    {
                    lv_AllExtendedTypes_9_0=(Token)match(input,51,FOLLOW_51_in_ruleTypeFieldName2585); 

                            newLeafNode(lv_AllExtendedTypes_9_0, grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "AllExtendedTypes", lv_AllExtendedTypes_9_0, "AllExtendedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1147:6: ( (lv_FieldType_10_0= 'FieldType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1147:6: ( (lv_FieldType_10_0= 'FieldType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1148:1: (lv_FieldType_10_0= 'FieldType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1148:1: (lv_FieldType_10_0= 'FieldType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1149:3: lv_FieldType_10_0= 'FieldType'
                    {
                    lv_FieldType_10_0=(Token)match(input,52,FOLLOW_52_in_ruleTypeFieldName2622); 

                            newLeafNode(lv_FieldType_10_0, grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "FieldType", lv_FieldType_10_0, "FieldType");
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1163:6: ( (lv_DeclaringType_11_0= 'DeclaringType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1163:6: ( (lv_DeclaringType_11_0= 'DeclaringType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1164:1: (lv_DeclaringType_11_0= 'DeclaringType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1164:1: (lv_DeclaringType_11_0= 'DeclaringType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1165:3: lv_DeclaringType_11_0= 'DeclaringType'
                    {
                    lv_DeclaringType_11_0=(Token)match(input,53,FOLLOW_53_in_ruleTypeFieldName2659); 

                            newLeafNode(lv_DeclaringType_11_0, grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "DeclaringType", lv_DeclaringType_11_0, "DeclaringType");
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1179:6: ( (lv_CaughtType_12_0= 'CaughtType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1179:6: ( (lv_CaughtType_12_0= 'CaughtType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1180:1: (lv_CaughtType_12_0= 'CaughtType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1180:1: (lv_CaughtType_12_0= 'CaughtType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1181:3: lv_CaughtType_12_0= 'CaughtType'
                    {
                    lv_CaughtType_12_0=(Token)match(input,54,FOLLOW_54_in_ruleTypeFieldName2696); 

                            newLeafNode(lv_CaughtType_12_0, grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "CaughtType", lv_CaughtType_12_0, "CaughtType");
                    	    

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1195:6: ( (lv_InstanceofTypes_13_0= 'InstanceofTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1195:6: ( (lv_InstanceofTypes_13_0= 'InstanceofTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1196:1: (lv_InstanceofTypes_13_0= 'InstanceofTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1196:1: (lv_InstanceofTypes_13_0= 'InstanceofTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1197:3: lv_InstanceofTypes_13_0= 'InstanceofTypes'
                    {
                    lv_InstanceofTypes_13_0=(Token)match(input,55,FOLLOW_55_in_ruleTypeFieldName2733); 

                            newLeafNode(lv_InstanceofTypes_13_0, grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_13_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldNameRule());
                    	        }
                           		setWithLastConsumed(current, "InstanceofTypes", lv_InstanceofTypes_13_0, "InstanceofTypes");
                    	    

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1218:1: ruleBooleanExp returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'OR' ) | (enumLiteral_3= 'or' ) ) ;
    public final Enumerator ruleBooleanExp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1220:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'OR' ) | (enumLiteral_3= 'or' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1221:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'OR' ) | (enumLiteral_3= 'or' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1221:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'OR' ) | (enumLiteral_3= 'or' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt13=1;
                }
                break;
            case 57:
                {
                alt13=2;
                }
                break;
            case 58:
                {
                alt13=3;
                }
                break;
            case 59:
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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1221:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1221:2: (enumLiteral_0= 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1221:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleBooleanExp2796); 

                            current = grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1227:6: (enumLiteral_1= 'and' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1227:6: (enumLiteral_1= 'and' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1227:8: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleBooleanExp2813); 

                            current = grammarAccess.getBooleanExpAccess().getAnd2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanExpAccess().getAnd2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1233:6: (enumLiteral_2= 'OR' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1233:6: (enumLiteral_2= 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1233:8: enumLiteral_2= 'OR'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleBooleanExp2830); 

                            current = grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1239:6: (enumLiteral_3= 'or' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1239:6: (enumLiteral_3= 'or' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1239:8: enumLiteral_3= 'or'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleBooleanExp2847); 

                            current = grammarAccess.getBooleanExpAccess().getOr2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBooleanExpAccess().getOr2EnumLiteralDeclaration_3()); 
                        

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1249:1: ruleNotExpression returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) ) ;
    public final Enumerator ruleNotExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1251:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1252:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1252:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt14=1;
                }
                break;
            case 61:
                {
                alt14=2;
                }
                break;
            case 62:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1252:2: (enumLiteral_0= 'not' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1252:2: (enumLiteral_0= 'not' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1252:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleNotExpression2892); 

                            current = grammarAccess.getNotExpressionAccess().getNot1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNotExpressionAccess().getNot1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1258:6: (enumLiteral_1= 'NOT' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1258:6: (enumLiteral_1= 'NOT' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1258:8: enumLiteral_1= 'NOT'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleNotExpression2909); 

                            current = grammarAccess.getNotExpressionAccess().getNot2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNotExpressionAccess().getNot2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1264:6: (enumLiteral_2= '!' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1264:6: (enumLiteral_2= '!' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1264:8: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleNotExpression2926); 

                            current = grammarAccess.getNotExpressionAccess().getNot3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getNotExpressionAccess().getNot3EnumLiteralDeclaration_2()); 
                        

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExp1_in_entryRuleExp175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_ruleExp1132 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_ruleExp1162 = new BitSet(new long[]{0x70FFFFFFFFFC0800L});
    public static final BitSet FOLLOW_ruleExp2_in_ruleExp1183 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_entryRuleExp2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_ruleExp2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExp2296 = new BitSet(new long[]{0x70FFFFFFFFFC0800L});
    public static final BitSet FOLLOW_ruleExp1_in_ruleExp2318 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExp2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClauseExpression376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_ruleClauseExpression422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_ruleClauseExpression449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_entryRuleSimpleClause485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClause495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleSimpleClause541 = new BitSet(new long[]{0x700003FFFFFC0000L});
    public static final BitSet FOLLOW_ruleFieldName_in_ruleSimpleClause563 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSimpleClause575 = new BitSet(new long[]{0x0000000000030830L});
    public static final BitSet FOLLOW_ruleFieldValue_in_ruleSimpleClause596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_entryRuleTypeClause632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeClause642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleTypeClause688 = new BitSet(new long[]{0x70FFFFFFFFFC0000L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_ruleTypeClause710 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTypeClause722 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleTypeTest_in_ruleTypeClause743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldValue_in_entryRuleFieldValue780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldValue791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFieldValue838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFieldValue863 = new BitSet(new long[]{0x0000000000031030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFieldValue886 = new BitSet(new long[]{0x0000000000031030L});
    public static final BitSet FOLLOW_12_in_ruleFieldValue906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeTest_in_entryRuleTypeTest947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeTest957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTypeTest1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTypeTest1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleValue1137 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17_in_ruleValue1156 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_entryRuleFieldName1246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldName1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFieldName1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFieldName1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFieldName1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFieldName1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFieldName1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFieldName1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFieldName1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFieldName1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFieldName1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFieldName1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFieldName1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFieldName1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFieldName1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFieldName1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFieldName1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFieldName1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFieldName1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFieldName1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFieldName1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFieldName2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFieldName2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFieldName2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFieldName2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleFieldName2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName2199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldName2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTypeFieldName2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTypeFieldName2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTypeFieldName2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTypeFieldName2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeFieldName2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeFieldName2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTypeFieldName2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeFieldName2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeFieldName2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeFieldName2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTypeFieldName2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTypeFieldName2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTypeFieldName2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTypeFieldName2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBooleanExp2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBooleanExp2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBooleanExp2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBooleanExp2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNotExpression2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNotExpression2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleNotExpression2926 = new BitSet(new long[]{0x0000000000000002L});

}