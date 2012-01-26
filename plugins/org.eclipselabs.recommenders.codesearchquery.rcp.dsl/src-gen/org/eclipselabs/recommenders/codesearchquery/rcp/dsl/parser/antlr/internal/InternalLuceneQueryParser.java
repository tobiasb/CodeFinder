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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'/'", "'.'", "'\\\\'", "'-'", "'*'", "'?'", "'FullyQualifiedName'", "'Type'", "'FriendlyName'", "'DeclaredMethods'", "'ParameterCount'", "'ReturnVariableEexpressions'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'ProjectName'", "'ResourcePath'", "'Modifiers'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'DeclaredFieldTypes'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'", "'Annotations'", "'Timestamp'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'DeclaringType'", "'CaughtType'", "'InstanceofTypes'", "'AND'", "'OR'", "'NOT'", "'!'", "'+'"
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

                if ( ((LA1_0>=58 && LA1_0<=59)) ) {
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

            if ( (LA2_0==17||(LA2_0>=20 && LA2_0<=57)||(LA2_0>=60 && LA2_0<=62)) ) {
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

            if ( (LA3_0==17||(LA3_0>=60 && LA3_0<=61)) ) {
                alt3=1;
            }
            else if ( (LA3_0==62) ) {
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

            if ( ((LA4_0>=20 && LA4_0<=44)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=45 && LA4_0<=57)) ) {
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:487:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Wildcard_0= ruleWildcard )? ( (this_ID_1= RULE_ID (this_SpecialChar_2= ruleSpecialChar )? ) ( (this_Wildcard_3= ruleWildcard )? this_ID_4= RULE_ID (this_SpecialChar_5= ruleSpecialChar )? )* (this_Wildcard_6= ruleWildcard )? )? ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_Wildcard_0 = null;

        AntlrDatatypeRuleToken this_SpecialChar_2 = null;

        AntlrDatatypeRuleToken this_Wildcard_3 = null;

        AntlrDatatypeRuleToken this_SpecialChar_5 = null;

        AntlrDatatypeRuleToken this_Wildcard_6 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:490:28: ( ( (this_Wildcard_0= ruleWildcard )? ( (this_ID_1= RULE_ID (this_SpecialChar_2= ruleSpecialChar )? ) ( (this_Wildcard_3= ruleWildcard )? this_ID_4= RULE_ID (this_SpecialChar_5= ruleSpecialChar )? )* (this_Wildcard_6= ruleWildcard )? )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:1: ( (this_Wildcard_0= ruleWildcard )? ( (this_ID_1= RULE_ID (this_SpecialChar_2= ruleSpecialChar )? ) ( (this_Wildcard_3= ruleWildcard )? this_ID_4= RULE_ID (this_SpecialChar_5= ruleSpecialChar )? )* (this_Wildcard_6= ruleWildcard )? )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:1: ( (this_Wildcard_0= ruleWildcard )? ( (this_ID_1= RULE_ID (this_SpecialChar_2= ruleSpecialChar )? ) ( (this_Wildcard_3= ruleWildcard )? this_ID_4= RULE_ID (this_SpecialChar_5= ruleSpecialChar )? )* (this_Wildcard_6= ruleWildcard )? )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:2: (this_Wildcard_0= ruleWildcard )? ( (this_ID_1= RULE_ID (this_SpecialChar_2= ruleSpecialChar )? ) ( (this_Wildcard_3= ruleWildcard )? this_ID_4= RULE_ID (this_SpecialChar_5= ruleSpecialChar )? )* (this_Wildcard_6= ruleWildcard )? )?
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:491:2: (this_Wildcard_0= ruleWildcard )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
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

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:502:3: ( (this_ID_1= RULE_ID (this_SpecialChar_2= ruleSpecialChar )? ) ( (this_Wildcard_3= ruleWildcard )? this_ID_4= RULE_ID (this_SpecialChar_5= ruleSpecialChar )? )* (this_Wildcard_6= ruleWildcard )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:502:4: (this_ID_1= RULE_ID (this_SpecialChar_2= ruleSpecialChar )? ) ( (this_Wildcard_3= ruleWildcard )? this_ID_4= RULE_ID (this_SpecialChar_5= ruleSpecialChar )? )* (this_Wildcard_6= ruleWildcard )?
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:502:4: (this_ID_1= RULE_ID (this_SpecialChar_2= ruleSpecialChar )? )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:502:9: this_ID_1= RULE_ID (this_SpecialChar_2= ruleSpecialChar )?
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue1076); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getValueAccess().getIDTerminalRuleCall_1_0_0()); 
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:509:1: (this_SpecialChar_2= ruleSpecialChar )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==16) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==14) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:510:5: this_SpecialChar_2= ruleSpecialChar
                            {
                             
                                    newCompositeNode(grammarAccess.getValueAccess().getSpecialCharParserRuleCall_1_0_1()); 
                                
                            pushFollow(FOLLOW_ruleSpecialChar_in_ruleValue1104);
                            this_SpecialChar_2=ruleSpecialChar();

                            state._fsp--;


                            		current.merge(this_SpecialChar_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }

                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:520:4: ( (this_Wildcard_3= ruleWildcard )? this_ID_4= RULE_ID (this_SpecialChar_5= ruleSpecialChar )? )*
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case 18:
                            {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1==RULE_ID) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case 19:
                            {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==RULE_ID) ) {
                                alt9=1;
                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            alt9=1;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:520:5: (this_Wildcard_3= ruleWildcard )? this_ID_4= RULE_ID (this_SpecialChar_5= ruleSpecialChar )?
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:520:5: (this_Wildcard_3= ruleWildcard )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( ((LA7_0>=18 && LA7_0<=19)) ) {
                    	        alt7=1;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:521:5: this_Wildcard_3= ruleWildcard
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getValueAccess().getWildcardParserRuleCall_1_1_0()); 
                    	                
                    	            pushFollow(FOLLOW_ruleWildcard_in_ruleValue1136);
                    	            this_Wildcard_3=ruleWildcard();

                    	            state._fsp--;


                    	            		current.merge(this_Wildcard_3);
                    	                
                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;

                    	    }

                    	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue1158); 

                    	    		current.merge(this_ID_4);
                    	        
                    	     
                    	        newLeafNode(this_ID_4, grammarAccess.getValueAccess().getIDTerminalRuleCall_1_1_1()); 
                    	        
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:538:1: (this_SpecialChar_5= ruleSpecialChar )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==16) ) {
                    	        alt8=1;
                    	    }
                    	    else if ( (LA8_0==14) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:539:5: this_SpecialChar_5= ruleSpecialChar
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getValueAccess().getSpecialCharParserRuleCall_1_1_2()); 
                    	                
                    	            pushFollow(FOLLOW_ruleSpecialChar_in_ruleValue1186);
                    	            this_SpecialChar_5=ruleSpecialChar();

                    	            state._fsp--;


                    	            		current.merge(this_SpecialChar_5);
                    	                
                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:549:5: (this_Wildcard_6= ruleWildcard )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==18) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==19) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:550:5: this_Wildcard_6= ruleWildcard
                            {
                             
                                    newCompositeNode(grammarAccess.getValueAccess().getWildcardParserRuleCall_1_2()); 
                                
                            pushFollow(FOLLOW_ruleWildcard_in_ruleValue1218);
                            this_Wildcard_6=ruleWildcard();

                            state._fsp--;


                            		current.merge(this_Wildcard_6);
                                
                             
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:568:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:572:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:573:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1274);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1285); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:583:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Value_0= ruleValue ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )* (this_Wildcard_5= ruleWildcard )? ) ;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:587:28: ( (this_Value_0= ruleValue ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )* (this_Wildcard_5= ruleWildcard )? ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:588:1: (this_Value_0= ruleValue ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )* (this_Wildcard_5= ruleWildcard )? )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:588:1: (this_Value_0= ruleValue ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )* (this_Wildcard_5= ruleWildcard )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:589:5: this_Value_0= ruleValue ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )* (this_Wildcard_5= ruleWildcard )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getValueParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleValue_in_ruleQualifiedNameWithWildcard1336);
            this_Value_0=ruleValue();

            state._fsp--;


            		current.merge(this_Value_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:599:1: ( (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    int LA14_1 = input.LA(2);

                    if ( ((LA14_1>=14 && LA14_1<=15)) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA14_2 = input.LA(2);

                    if ( ((LA14_2>=14 && LA14_2<=15)) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 14:
                case 15:
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:599:2: (this_Wildcard_1= ruleWildcard )? this_Sep_2= ruleSep (this_Wildcard_3= ruleWildcard )? this_Value_4= ruleValue
            	    {
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:599:2: (this_Wildcard_1= ruleWildcard )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( ((LA12_0>=18 && LA12_0<=19)) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:600:5: this_Wildcard_1= ruleWildcard
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_1_0()); 
            	                
            	            pushFollow(FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1365);
            	            this_Wildcard_1=ruleWildcard();

            	            state._fsp--;


            	            		current.merge(this_Wildcard_1);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getSepParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleSep_in_ruleQualifiedNameWithWildcard1394);
            	    this_Sep_2=ruleSep();

            	    state._fsp--;


            	    		current.merge(this_Sep_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:621:1: (this_Wildcard_3= ruleWildcard )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==18) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==19) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:622:5: this_Wildcard_3= ruleWildcard
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_1_2()); 
            	                
            	            pushFollow(FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1422);
            	            this_Wildcard_3=ruleWildcard();

            	            state._fsp--;


            	            		current.merge(this_Wildcard_3);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getValueParserRuleCall_1_3()); 
            	        
            	    pushFollow(FOLLOW_ruleValue_in_ruleQualifiedNameWithWildcard1451);
            	    this_Value_4=ruleValue();

            	    state._fsp--;


            	    		current.merge(this_Value_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:643:3: (this_Wildcard_5= ruleWildcard )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=18 && LA15_0<=19)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:644:5: this_Wildcard_5= ruleWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getWildcardParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1481);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:665:1: entryRuleSep returns [String current=null] : iv_ruleSep= ruleSep EOF ;
    public final String entryRuleSep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSep = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:666:2: (iv_ruleSep= ruleSep EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:667:2: iv_ruleSep= ruleSep EOF
            {
             newCompositeNode(grammarAccess.getSepRule()); 
            pushFollow(FOLLOW_ruleSep_in_entryRuleSep1533);
            iv_ruleSep=ruleSep();

            state._fsp--;

             current =iv_ruleSep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSep1544); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:674:1: ruleSep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' | kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleSep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:677:28: ( (kw= '/' | kw= '.' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:678:1: (kw= '/' | kw= '.' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:678:1: (kw= '/' | kw= '.' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            else if ( (LA16_0==15) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:679:2: kw= '/'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleSep1582); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSepAccess().getSolidusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:686:2: kw= '.'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleSep1601); 

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


    // $ANTLR start "entryRuleSpecialChar"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:699:1: entryRuleSpecialChar returns [String current=null] : iv_ruleSpecialChar= ruleSpecialChar EOF ;
    public final String entryRuleSpecialChar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialChar = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:700:2: (iv_ruleSpecialChar= ruleSpecialChar EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:701:2: iv_ruleSpecialChar= ruleSpecialChar EOF
            {
             newCompositeNode(grammarAccess.getSpecialCharRule()); 
            pushFollow(FOLLOW_ruleSpecialChar_in_entryRuleSpecialChar1642);
            iv_ruleSpecialChar=ruleSpecialChar();

            state._fsp--;

             current =iv_ruleSpecialChar.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialChar1653); 

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
    // $ANTLR end "entryRuleSpecialChar"


    // $ANTLR start "ruleSpecialChar"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:708:1: ruleSpecialChar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '\\\\' kw= '-' ) | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleSpecialChar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:711:28: ( ( (kw= '\\\\' kw= '-' ) | kw= '/' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:712:1: ( (kw= '\\\\' kw= '-' ) | kw= '/' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:712:1: ( (kw= '\\\\' kw= '-' ) | kw= '/' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            else if ( (LA17_0==14) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:712:2: (kw= '\\\\' kw= '-' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:712:2: (kw= '\\\\' kw= '-' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:713:2: kw= '\\\\' kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleSpecialChar1692); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSpecialCharAccess().getReverseSolidusKeyword_0_0()); 
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleSpecialChar1705); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSpecialCharAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:726:2: kw= '/'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleSpecialChar1725); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSpecialCharAccess().getSolidusKeyword_1()); 
                        

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
    // $ANTLR end "ruleSpecialChar"


    // $ANTLR start "entryRuleWildcard"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:739:1: entryRuleWildcard returns [String current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final String entryRuleWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWildcard = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:740:2: (iv_ruleWildcard= ruleWildcard EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:741:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_ruleWildcard_in_entryRuleWildcard1766);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcard1777); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:748:1: ruleWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '?' ) ;
    public final AntlrDatatypeRuleToken ruleWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:751:28: ( (kw= '*' | kw= '?' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:752:1: (kw= '*' | kw= '?' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:752:1: (kw= '*' | kw= '?' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            else if ( (LA18_0==19) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:753:2: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleWildcard1815); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWildcardAccess().getAsteriskKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:760:2: kw= '?'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleWildcard1834); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:773:1: entryRuleFieldName returns [EObject current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final EObject entryRuleFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:774:2: (iv_ruleFieldName= ruleFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:775:2: iv_ruleFieldName= ruleFieldName EOF
            {
             newCompositeNode(grammarAccess.getFieldNameRule()); 
            pushFollow(FOLLOW_ruleFieldName_in_entryRuleFieldName1874);
            iv_ruleFieldName=ruleFieldName();

            state._fsp--;

             current =iv_ruleFieldName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldName1884); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:782:1: ruleFieldName returns [EObject current=null] : ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_Type_1_0= 'Type' ) ) | ( (lv_FriendlyName_2_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_4_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_6_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_10_0= 'ProjectName' ) ) | ( (lv_ResourcePath_11_0= 'ResourcePath' ) ) | ( (lv_Modifiers_12_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_18_0= 'FullText' ) ) | ( (lv_FieldsRead_19_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_23_0= 'Annotations' ) ) | ( (lv_Timestamp_24_0= 'Timestamp' ) ) ) ;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:785:28: ( ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_Type_1_0= 'Type' ) ) | ( (lv_FriendlyName_2_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_4_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_6_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_10_0= 'ProjectName' ) ) | ( (lv_ResourcePath_11_0= 'ResourcePath' ) ) | ( (lv_Modifiers_12_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_18_0= 'FullText' ) ) | ( (lv_FieldsRead_19_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_23_0= 'Annotations' ) ) | ( (lv_Timestamp_24_0= 'Timestamp' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:786:1: ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_Type_1_0= 'Type' ) ) | ( (lv_FriendlyName_2_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_4_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_6_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_10_0= 'ProjectName' ) ) | ( (lv_ResourcePath_11_0= 'ResourcePath' ) ) | ( (lv_Modifiers_12_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_18_0= 'FullText' ) ) | ( (lv_FieldsRead_19_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_23_0= 'Annotations' ) ) | ( (lv_Timestamp_24_0= 'Timestamp' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:786:1: ( ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) ) | ( (lv_Type_1_0= 'Type' ) ) | ( (lv_FriendlyName_2_0= 'FriendlyName' ) ) | ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) ) | ( (lv_ParameterCount_4_0= 'ParameterCount' ) ) | ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) ) | ( (lv_UsedMethods_6_0= 'UsedMethods' ) ) | ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) ) | ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) ) | ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) ) | ( (lv_ProjectName_10_0= 'ProjectName' ) ) | ( (lv_ResourcePath_11_0= 'ResourcePath' ) ) | ( (lv_Modifiers_12_0= 'Modifiers' ) ) | ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) ) | ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) ) | ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) ) | ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) ) | ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) ) | ( (lv_FullText_18_0= 'FullText' ) ) | ( (lv_FieldsRead_19_0= 'FieldsRead' ) ) | ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) ) | ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) ) | ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) ) | ( (lv_Annotations_23_0= 'Annotations' ) ) | ( (lv_Timestamp_24_0= 'Timestamp' ) ) )
            int alt19=25;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt19=1;
                }
                break;
            case 21:
                {
                alt19=2;
                }
                break;
            case 22:
                {
                alt19=3;
                }
                break;
            case 23:
                {
                alt19=4;
                }
                break;
            case 24:
                {
                alt19=5;
                }
                break;
            case 25:
                {
                alt19=6;
                }
                break;
            case 26:
                {
                alt19=7;
                }
                break;
            case 27:
                {
                alt19=8;
                }
                break;
            case 28:
                {
                alt19=9;
                }
                break;
            case 29:
                {
                alt19=10;
                }
                break;
            case 30:
                {
                alt19=11;
                }
                break;
            case 31:
                {
                alt19=12;
                }
                break;
            case 32:
                {
                alt19=13;
                }
                break;
            case 33:
                {
                alt19=14;
                }
                break;
            case 34:
                {
                alt19=15;
                }
                break;
            case 35:
                {
                alt19=16;
                }
                break;
            case 36:
                {
                alt19=17;
                }
                break;
            case 37:
                {
                alt19=18;
                }
                break;
            case 38:
                {
                alt19=19;
                }
                break;
            case 39:
                {
                alt19=20;
                }
                break;
            case 40:
                {
                alt19=21;
                }
                break;
            case 41:
                {
                alt19=22;
                }
                break;
            case 42:
                {
                alt19=23;
                }
                break;
            case 43:
                {
                alt19=24;
                }
                break;
            case 44:
                {
                alt19=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:786:2: ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:786:2: ( (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:787:1: (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:787:1: (lv_FullyQualifiedName_0_0= 'FullyQualifiedName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:788:3: lv_FullyQualifiedName_0_0= 'FullyQualifiedName'
                    {
                    lv_FullyQualifiedName_0_0=(Token)match(input,20,FOLLOW_20_in_ruleFieldName1927); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:802:6: ( (lv_Type_1_0= 'Type' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:802:6: ( (lv_Type_1_0= 'Type' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:803:1: (lv_Type_1_0= 'Type' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:803:1: (lv_Type_1_0= 'Type' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:804:3: lv_Type_1_0= 'Type'
                    {
                    lv_Type_1_0=(Token)match(input,21,FOLLOW_21_in_ruleFieldName1964); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:818:6: ( (lv_FriendlyName_2_0= 'FriendlyName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:818:6: ( (lv_FriendlyName_2_0= 'FriendlyName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:819:1: (lv_FriendlyName_2_0= 'FriendlyName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:819:1: (lv_FriendlyName_2_0= 'FriendlyName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:820:3: lv_FriendlyName_2_0= 'FriendlyName'
                    {
                    lv_FriendlyName_2_0=(Token)match(input,22,FOLLOW_22_in_ruleFieldName2001); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:834:6: ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:834:6: ( (lv_DeclaredMethods_3_0= 'DeclaredMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:835:1: (lv_DeclaredMethods_3_0= 'DeclaredMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:835:1: (lv_DeclaredMethods_3_0= 'DeclaredMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:836:3: lv_DeclaredMethods_3_0= 'DeclaredMethods'
                    {
                    lv_DeclaredMethods_3_0=(Token)match(input,23,FOLLOW_23_in_ruleFieldName2038); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:850:6: ( (lv_ParameterCount_4_0= 'ParameterCount' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:850:6: ( (lv_ParameterCount_4_0= 'ParameterCount' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:851:1: (lv_ParameterCount_4_0= 'ParameterCount' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:851:1: (lv_ParameterCount_4_0= 'ParameterCount' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:852:3: lv_ParameterCount_4_0= 'ParameterCount'
                    {
                    lv_ParameterCount_4_0=(Token)match(input,24,FOLLOW_24_in_ruleFieldName2075); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:866:6: ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:866:6: ( (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:867:1: (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:867:1: (lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:868:3: lv_ReturnVariableEexpressions_5_0= 'ReturnVariableEexpressions'
                    {
                    lv_ReturnVariableEexpressions_5_0=(Token)match(input,25,FOLLOW_25_in_ruleFieldName2112); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:882:6: ( (lv_UsedMethods_6_0= 'UsedMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:882:6: ( (lv_UsedMethods_6_0= 'UsedMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:883:1: (lv_UsedMethods_6_0= 'UsedMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:883:1: (lv_UsedMethods_6_0= 'UsedMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:884:3: lv_UsedMethods_6_0= 'UsedMethods'
                    {
                    lv_UsedMethods_6_0=(Token)match(input,26,FOLLOW_26_in_ruleFieldName2149); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:898:6: ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:898:6: ( (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:899:1: (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:899:1: (lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:900:3: lv_UsedMethodsInTry_7_0= 'UsedMethodsInTry'
                    {
                    lv_UsedMethodsInTry_7_0=(Token)match(input,27,FOLLOW_27_in_ruleFieldName2186); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:914:6: ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:914:6: ( (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:915:1: (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:915:1: (lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:916:3: lv_UsedMethodsInFinally_8_0= 'UsedMethodsInFinally'
                    {
                    lv_UsedMethodsInFinally_8_0=(Token)match(input,28,FOLLOW_28_in_ruleFieldName2223); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:930:6: ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:930:6: ( (lv_OverriddenMethods_9_0= 'OverriddenMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:931:1: (lv_OverriddenMethods_9_0= 'OverriddenMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:931:1: (lv_OverriddenMethods_9_0= 'OverriddenMethods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:932:3: lv_OverriddenMethods_9_0= 'OverriddenMethods'
                    {
                    lv_OverriddenMethods_9_0=(Token)match(input,29,FOLLOW_29_in_ruleFieldName2260); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:946:6: ( (lv_ProjectName_10_0= 'ProjectName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:946:6: ( (lv_ProjectName_10_0= 'ProjectName' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:947:1: (lv_ProjectName_10_0= 'ProjectName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:947:1: (lv_ProjectName_10_0= 'ProjectName' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:948:3: lv_ProjectName_10_0= 'ProjectName'
                    {
                    lv_ProjectName_10_0=(Token)match(input,30,FOLLOW_30_in_ruleFieldName2297); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:962:6: ( (lv_ResourcePath_11_0= 'ResourcePath' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:962:6: ( (lv_ResourcePath_11_0= 'ResourcePath' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:963:1: (lv_ResourcePath_11_0= 'ResourcePath' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:963:1: (lv_ResourcePath_11_0= 'ResourcePath' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:964:3: lv_ResourcePath_11_0= 'ResourcePath'
                    {
                    lv_ResourcePath_11_0=(Token)match(input,31,FOLLOW_31_in_ruleFieldName2334); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:978:6: ( (lv_Modifiers_12_0= 'Modifiers' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:978:6: ( (lv_Modifiers_12_0= 'Modifiers' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:979:1: (lv_Modifiers_12_0= 'Modifiers' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:979:1: (lv_Modifiers_12_0= 'Modifiers' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:980:3: lv_Modifiers_12_0= 'Modifiers'
                    {
                    lv_Modifiers_12_0=(Token)match(input,32,FOLLOW_32_in_ruleFieldName2371); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:994:6: ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:994:6: ( (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:995:1: (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:995:1: (lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:996:3: lv_AllDeclaredMethodNames_13_0= 'AllDeclaredMethodNames'
                    {
                    lv_AllDeclaredMethodNames_13_0=(Token)match(input,33,FOLLOW_33_in_ruleFieldName2408); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1010:6: ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1010:6: ( (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1011:1: (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1011:1: (lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1012:3: lv_DeclaredMethodNames_14_0= 'DeclaredMethodNames'
                    {
                    lv_DeclaredMethodNames_14_0=(Token)match(input,34,FOLLOW_34_in_ruleFieldName2445); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1026:6: ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1026:6: ( (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1027:1: (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1027:1: (lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1028:3: lv_DeclaredFieldNames_15_0= 'DeclaredFieldNames'
                    {
                    lv_DeclaredFieldNames_15_0=(Token)match(input,35,FOLLOW_35_in_ruleFieldName2482); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1042:6: ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1042:6: ( (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1043:1: (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1043:1: (lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1044:3: lv_DeclaredFieldTypes_16_0= 'DeclaredFieldTypes'
                    {
                    lv_DeclaredFieldTypes_16_0=(Token)match(input,36,FOLLOW_36_in_ruleFieldName2519); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1058:6: ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1058:6: ( (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1059:1: (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1059:1: (lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1060:3: lv_AllDeclaredFieldNames_17_0= 'AllDeclaredFieldNames'
                    {
                    lv_AllDeclaredFieldNames_17_0=(Token)match(input,37,FOLLOW_37_in_ruleFieldName2556); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1074:6: ( (lv_FullText_18_0= 'FullText' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1074:6: ( (lv_FullText_18_0= 'FullText' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1075:1: (lv_FullText_18_0= 'FullText' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1075:1: (lv_FullText_18_0= 'FullText' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1076:3: lv_FullText_18_0= 'FullText'
                    {
                    lv_FullText_18_0=(Token)match(input,38,FOLLOW_38_in_ruleFieldName2593); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1090:6: ( (lv_FieldsRead_19_0= 'FieldsRead' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1090:6: ( (lv_FieldsRead_19_0= 'FieldsRead' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1091:1: (lv_FieldsRead_19_0= 'FieldsRead' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1091:1: (lv_FieldsRead_19_0= 'FieldsRead' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1092:3: lv_FieldsRead_19_0= 'FieldsRead'
                    {
                    lv_FieldsRead_19_0=(Token)match(input,39,FOLLOW_39_in_ruleFieldName2630); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1106:6: ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1106:6: ( (lv_FieldsWritten_20_0= 'FieldsWritten' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1107:1: (lv_FieldsWritten_20_0= 'FieldsWritten' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1107:1: (lv_FieldsWritten_20_0= 'FieldsWritten' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1108:3: lv_FieldsWritten_20_0= 'FieldsWritten'
                    {
                    lv_FieldsWritten_20_0=(Token)match(input,40,FOLLOW_40_in_ruleFieldName2667); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1122:6: ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1122:6: ( (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1123:1: (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1123:1: (lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1124:3: lv_UsedFieldsInFinally_21_0= 'UsedFieldsInFinally'
                    {
                    lv_UsedFieldsInFinally_21_0=(Token)match(input,41,FOLLOW_41_in_ruleFieldName2704); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1138:6: ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1138:6: ( (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1139:1: (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1139:1: (lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1140:3: lv_UsedFieldsInTry_22_0= 'UsedFieldsInTry'
                    {
                    lv_UsedFieldsInTry_22_0=(Token)match(input,42,FOLLOW_42_in_ruleFieldName2741); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1154:6: ( (lv_Annotations_23_0= 'Annotations' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1154:6: ( (lv_Annotations_23_0= 'Annotations' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1155:1: (lv_Annotations_23_0= 'Annotations' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1155:1: (lv_Annotations_23_0= 'Annotations' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1156:3: lv_Annotations_23_0= 'Annotations'
                    {
                    lv_Annotations_23_0=(Token)match(input,43,FOLLOW_43_in_ruleFieldName2778); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1170:6: ( (lv_Timestamp_24_0= 'Timestamp' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1170:6: ( (lv_Timestamp_24_0= 'Timestamp' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1171:1: (lv_Timestamp_24_0= 'Timestamp' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1171:1: (lv_Timestamp_24_0= 'Timestamp' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1172:3: lv_Timestamp_24_0= 'Timestamp'
                    {
                    lv_Timestamp_24_0=(Token)match(input,44,FOLLOW_44_in_ruleFieldName2815); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1193:1: entryRuleTypeFieldName returns [EObject current=null] : iv_ruleTypeFieldName= ruleTypeFieldName EOF ;
    public final EObject entryRuleTypeFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFieldName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1194:2: (iv_ruleTypeFieldName= ruleTypeFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1195:2: iv_ruleTypeFieldName= ruleTypeFieldName EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldNameRule()); 
            pushFollow(FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName2864);
            iv_ruleTypeFieldName=ruleTypeFieldName();

            state._fsp--;

             current =iv_ruleTypeFieldName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldName2874); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1202:1: ruleTypeFieldName returns [EObject current=null] : ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_9_0= 'FieldType' ) ) | ( (lv_DeclaringType_10_0= 'DeclaringType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) ) ) ;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1205:28: ( ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_9_0= 'FieldType' ) ) | ( (lv_DeclaringType_10_0= 'DeclaringType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1206:1: ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_9_0= 'FieldType' ) ) | ( (lv_DeclaringType_10_0= 'DeclaringType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1206:1: ( ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) ) | ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) ) | ( (lv_UsedTypes_2_0= 'UsedTypes' ) ) | ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) ) | ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) ) | ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) ) | ( (lv_ReturnType_6_0= 'ReturnType' ) ) | ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) ) | ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) ) | ( (lv_FieldType_9_0= 'FieldType' ) ) | ( (lv_DeclaringType_10_0= 'DeclaringType' ) ) | ( (lv_CaughtType_11_0= 'CaughtType' ) ) | ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) ) )
            int alt20=13;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt20=1;
                }
                break;
            case 46:
                {
                alt20=2;
                }
                break;
            case 47:
                {
                alt20=3;
                }
                break;
            case 48:
                {
                alt20=4;
                }
                break;
            case 49:
                {
                alt20=5;
                }
                break;
            case 50:
                {
                alt20=6;
                }
                break;
            case 51:
                {
                alt20=7;
                }
                break;
            case 52:
                {
                alt20=8;
                }
                break;
            case 53:
                {
                alt20=9;
                }
                break;
            case 54:
                {
                alt20=10;
                }
                break;
            case 55:
                {
                alt20=11;
                }
                break;
            case 56:
                {
                alt20=12;
                }
                break;
            case 57:
                {
                alt20=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1206:2: ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1206:2: ( (lv_ImplementedTypes_0_0= 'ImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1207:1: (lv_ImplementedTypes_0_0= 'ImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1207:1: (lv_ImplementedTypes_0_0= 'ImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1208:3: lv_ImplementedTypes_0_0= 'ImplementedTypes'
                    {
                    lv_ImplementedTypes_0_0=(Token)match(input,45,FOLLOW_45_in_ruleTypeFieldName2917); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1222:6: ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1222:6: ( (lv_ExtendedTypes_1_0= 'ExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1223:1: (lv_ExtendedTypes_1_0= 'ExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1223:1: (lv_ExtendedTypes_1_0= 'ExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1224:3: lv_ExtendedTypes_1_0= 'ExtendedTypes'
                    {
                    lv_ExtendedTypes_1_0=(Token)match(input,46,FOLLOW_46_in_ruleTypeFieldName2954); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1238:6: ( (lv_UsedTypes_2_0= 'UsedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1238:6: ( (lv_UsedTypes_2_0= 'UsedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1239:1: (lv_UsedTypes_2_0= 'UsedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1239:1: (lv_UsedTypes_2_0= 'UsedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1240:3: lv_UsedTypes_2_0= 'UsedTypes'
                    {
                    lv_UsedTypes_2_0=(Token)match(input,47,FOLLOW_47_in_ruleTypeFieldName2991); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1254:6: ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1254:6: ( (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1255:1: (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1255:1: (lv_UsedTypesInTry_3_0= 'UsedTypesInTry' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1256:3: lv_UsedTypesInTry_3_0= 'UsedTypesInTry'
                    {
                    lv_UsedTypesInTry_3_0=(Token)match(input,48,FOLLOW_48_in_ruleTypeFieldName3028); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1270:6: ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1270:6: ( (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1271:1: (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1271:1: (lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1272:3: lv_UsedTypesInFinally_4_0= 'UsedTypesInFinally'
                    {
                    lv_UsedTypesInFinally_4_0=(Token)match(input,49,FOLLOW_49_in_ruleTypeFieldName3065); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1286:6: ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1286:6: ( (lv_ParameterTypes_5_0= 'ParameterTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1287:1: (lv_ParameterTypes_5_0= 'ParameterTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1287:1: (lv_ParameterTypes_5_0= 'ParameterTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1288:3: lv_ParameterTypes_5_0= 'ParameterTypes'
                    {
                    lv_ParameterTypes_5_0=(Token)match(input,50,FOLLOW_50_in_ruleTypeFieldName3102); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1302:6: ( (lv_ReturnType_6_0= 'ReturnType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1302:6: ( (lv_ReturnType_6_0= 'ReturnType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1303:1: (lv_ReturnType_6_0= 'ReturnType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1303:1: (lv_ReturnType_6_0= 'ReturnType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1304:3: lv_ReturnType_6_0= 'ReturnType'
                    {
                    lv_ReturnType_6_0=(Token)match(input,51,FOLLOW_51_in_ruleTypeFieldName3139); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1318:6: ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1318:6: ( (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1319:1: (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1319:1: (lv_AllImplementedTypes_7_0= 'AllImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1320:3: lv_AllImplementedTypes_7_0= 'AllImplementedTypes'
                    {
                    lv_AllImplementedTypes_7_0=(Token)match(input,52,FOLLOW_52_in_ruleTypeFieldName3176); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1334:6: ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1334:6: ( (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1335:1: (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1335:1: (lv_AllExtendedTypes_8_0= 'AllExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1336:3: lv_AllExtendedTypes_8_0= 'AllExtendedTypes'
                    {
                    lv_AllExtendedTypes_8_0=(Token)match(input,53,FOLLOW_53_in_ruleTypeFieldName3213); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1350:6: ( (lv_FieldType_9_0= 'FieldType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1350:6: ( (lv_FieldType_9_0= 'FieldType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1351:1: (lv_FieldType_9_0= 'FieldType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1351:1: (lv_FieldType_9_0= 'FieldType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1352:3: lv_FieldType_9_0= 'FieldType'
                    {
                    lv_FieldType_9_0=(Token)match(input,54,FOLLOW_54_in_ruleTypeFieldName3250); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1366:6: ( (lv_DeclaringType_10_0= 'DeclaringType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1366:6: ( (lv_DeclaringType_10_0= 'DeclaringType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1367:1: (lv_DeclaringType_10_0= 'DeclaringType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1367:1: (lv_DeclaringType_10_0= 'DeclaringType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1368:3: lv_DeclaringType_10_0= 'DeclaringType'
                    {
                    lv_DeclaringType_10_0=(Token)match(input,55,FOLLOW_55_in_ruleTypeFieldName3287); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1382:6: ( (lv_CaughtType_11_0= 'CaughtType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1382:6: ( (lv_CaughtType_11_0= 'CaughtType' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1383:1: (lv_CaughtType_11_0= 'CaughtType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1383:1: (lv_CaughtType_11_0= 'CaughtType' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1384:3: lv_CaughtType_11_0= 'CaughtType'
                    {
                    lv_CaughtType_11_0=(Token)match(input,56,FOLLOW_56_in_ruleTypeFieldName3324); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1398:6: ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1398:6: ( (lv_InstanceofTypes_12_0= 'InstanceofTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1399:1: (lv_InstanceofTypes_12_0= 'InstanceofTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1399:1: (lv_InstanceofTypes_12_0= 'InstanceofTypes' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1400:3: lv_InstanceofTypes_12_0= 'InstanceofTypes'
                    {
                    lv_InstanceofTypes_12_0=(Token)match(input,57,FOLLOW_57_in_ruleTypeFieldName3361); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1421:1: ruleBooleanExp returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBooleanExp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1423:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1424:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1424:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==58) ) {
                alt21=1;
            }
            else if ( (LA21_0==59) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1424:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1424:2: (enumLiteral_0= 'AND' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1424:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleBooleanExp3424); 

                            current = grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1430:6: (enumLiteral_1= 'OR' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1430:6: (enumLiteral_1= 'OR' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1430:8: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleBooleanExp3441); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1440:1: ruleNotExpression returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) ) ;
    public final Enumerator ruleNotExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1442:28: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1443:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1443:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= 'NOT' ) | (enumLiteral_2= '!' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt22=1;
                }
                break;
            case 60:
                {
                alt22=2;
                }
                break;
            case 61:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1443:2: (enumLiteral_0= '-' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1443:2: (enumLiteral_0= '-' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1443:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_17_in_ruleNotExpression3486); 

                            current = grammarAccess.getNotExpressionAccess().getN1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNotExpressionAccess().getN1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1449:6: (enumLiteral_1= 'NOT' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1449:6: (enumLiteral_1= 'NOT' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1449:8: enumLiteral_1= 'NOT'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleNotExpression3503); 

                            current = grammarAccess.getNotExpressionAccess().getN2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNotExpressionAccess().getN2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1455:6: (enumLiteral_2= '!' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1455:6: (enumLiteral_2= '!' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1455:8: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleNotExpression3520); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1465:1: ruleMustExpression returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleMustExpression() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1467:28: ( (enumLiteral_0= '+' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1468:1: (enumLiteral_0= '+' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1468:1: (enumLiteral_0= '+' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1468:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleMustExpression3564); 

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
    public static final BitSet FOLLOW_ruleExp2_in_ruleExp1132 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_ruleExp1162 = new BitSet(new long[]{0x73FFFFFFFFF20800L});
    public static final BitSet FOLLOW_ruleExp2_in_ruleExp1183 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_ruleExp2_in_entryRuleExp2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_ruleExp2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExp2296 = new BitSet(new long[]{0x73FFFFFFFFF20800L});
    public static final BitSet FOLLOW_ruleExp1_in_ruleExp2318 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExp2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClauseExpression376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleClauseExpression423 = new BitSet(new long[]{0x73FFFFFFFFF20000L});
    public static final BitSet FOLLOW_ruleMustExpression_in_ruleClauseExpression450 = new BitSet(new long[]{0x73FFFFFFFFF20000L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_ruleClauseExpression474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_ruleClauseExpression501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClause_in_entryRuleSimpleClause538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClause548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_ruleSimpleClause594 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSimpleClause606 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_ruleFieldValue_in_ruleSimpleClause627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeClause_in_entryRuleTypeClause663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeClause673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_ruleTypeClause719 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTypeClause731 = new BitSet(new long[]{0x00000000000CC010L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue1076 = new BitSet(new long[]{0x00000000000D4012L});
    public static final BitSet FOLLOW_ruleSpecialChar_in_ruleValue1104 = new BitSet(new long[]{0x00000000000C0012L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleValue1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue1158 = new BitSet(new long[]{0x00000000000D4012L});
    public static final BitSet FOLLOW_ruleSpecialChar_in_ruleValue1186 = new BitSet(new long[]{0x00000000000C0012L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleValue1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleQualifiedNameWithWildcard1336 = new BitSet(new long[]{0x00000000000CC002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1365 = new BitSet(new long[]{0x00000000000CC000L});
    public static final BitSet FOLLOW_ruleSep_in_ruleQualifiedNameWithWildcard1394 = new BitSet(new long[]{0x00000000000CC010L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1422 = new BitSet(new long[]{0x00000000000CC010L});
    public static final BitSet FOLLOW_ruleValue_in_ruleQualifiedNameWithWildcard1451 = new BitSet(new long[]{0x00000000000CC002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleQualifiedNameWithWildcard1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_entryRuleSep1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSep1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSep1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSep1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialChar_in_entryRuleSpecialChar1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialChar1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSpecialChar1692 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSpecialChar1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSpecialChar1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard1766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcard1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWildcard1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWildcard1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_entryRuleFieldName1874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldName1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFieldName1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFieldName1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFieldName2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFieldName2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFieldName2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFieldName2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFieldName2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFieldName2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFieldName2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFieldName2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFieldName2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFieldName2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFieldName2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFieldName2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFieldName2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFieldName2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFieldName2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFieldName2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFieldName2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFieldName2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFieldName2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleFieldName2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFieldName2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleFieldName2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleFieldName2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldName_in_entryRuleTypeFieldName2864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldName2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTypeFieldName2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeFieldName2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeFieldName2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTypeFieldName3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeFieldName3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeFieldName3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeFieldName3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTypeFieldName3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTypeFieldName3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTypeFieldName3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTypeFieldName3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTypeFieldName3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTypeFieldName3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBooleanExp3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBooleanExp3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNotExpression3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNotExpression3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNotExpression3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleMustExpression3564 = new BitSet(new long[]{0x0000000000000002L});

}