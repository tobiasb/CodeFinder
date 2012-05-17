package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.parser.antlr.internal; 

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.services.QL2GrammarAccess;
@SuppressWarnings("all")
public class InternalQL2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "','", "')'", "'{'", "'}'", "'var'", "'call'", "'scall'", "'='", "'*'", "'null'", "'.'", "'?'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalQL2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQL2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQL2Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private QL2GrammarAccess grammarAccess;
     	
        public InternalQL2Parser(TokenStream input, QL2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected QL2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:82:1: ruleModel returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclarationParam ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclarationParam ) ) )* otherlv_5= ')' )? (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_vars_2_0 = null;

        EObject lv_vars_4_0 = null;

        EObject lv_statements_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:85:28: ( ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclarationParam ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclarationParam ) ) )* otherlv_5= ')' )? (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}' )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:86:1: ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclarationParam ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclarationParam ) ) )* otherlv_5= ')' )? (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}' )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:86:1: ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclarationParam ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclarationParam ) ) )* otherlv_5= ')' )? (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}' )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:86:2: () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclarationParam ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclarationParam ) ) )* otherlv_5= ')' )? (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}' )?
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:86:2: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:87:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModelAccess().getModelAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:95:2: (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclarationParam ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclarationParam ) ) )* otherlv_5= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:95:4: otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclarationParam ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclarationParam ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModel141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:99:1: ( (lv_vars_2_0= ruleVarDeclarationParam ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:100:1: (lv_vars_2_0= ruleVarDeclarationParam )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:100:1: (lv_vars_2_0= ruleVarDeclarationParam )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:101:3: lv_vars_2_0= ruleVarDeclarationParam
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarDeclarationParam_in_ruleModel162);
                    lv_vars_2_0=ruleVarDeclarationParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelRule());
                      	        }
                             		add(
                             			current, 
                             			"vars",
                              		lv_vars_2_0, 
                              		"VarDeclarationParam");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:117:2: (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclarationParam ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:117:4: otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclarationParam ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleModel175); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:121:1: ( (lv_vars_4_0= ruleVarDeclarationParam ) )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:122:1: (lv_vars_4_0= ruleVarDeclarationParam )
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:122:1: (lv_vars_4_0= ruleVarDeclarationParam )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:123:3: lv_vars_4_0= ruleVarDeclarationParam
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVarDeclarationParam_in_ruleModel196);
                    	    lv_vars_4_0=ruleVarDeclarationParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"vars",
                    	              		lv_vars_4_0, 
                    	              		"VarDeclarationParam");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleModel210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:143:3: (otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:143:5: otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleModel225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:147:1: ( (lv_statements_7_0= ruleStatement ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=16 && LA3_0<=18)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:148:1: (lv_statements_7_0= ruleStatement )
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:148:1: (lv_statements_7_0= ruleStatement )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:149:3: lv_statements_7_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleModel246);
                    	    lv_statements_7_0=ruleStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_7_0, 
                    	              		"Statement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleModel259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:177:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:178:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:179:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement297);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement307); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:186:1: ruleStatement returns [EObject current=null] : ( (otherlv_0= 'var' (this_VarInitialisation_1= ruleVarInitialisation | this_VarNullLiteral_2= ruleVarNullLiteral | this_VarDeclaration_3= ruleVarDeclaration ) ) | (otherlv_4= 'call' this_MethodCall_5= ruleMethodCall ) | (otherlv_6= 'scall' this_StaticMethodCall_7= ruleStaticMethodCall ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_VarInitialisation_1 = null;

        EObject this_VarNullLiteral_2 = null;

        EObject this_VarDeclaration_3 = null;

        EObject this_MethodCall_5 = null;

        EObject this_StaticMethodCall_7 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:189:28: ( ( (otherlv_0= 'var' (this_VarInitialisation_1= ruleVarInitialisation | this_VarNullLiteral_2= ruleVarNullLiteral | this_VarDeclaration_3= ruleVarDeclaration ) ) | (otherlv_4= 'call' this_MethodCall_5= ruleMethodCall ) | (otherlv_6= 'scall' this_StaticMethodCall_7= ruleStaticMethodCall ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:190:1: ( (otherlv_0= 'var' (this_VarInitialisation_1= ruleVarInitialisation | this_VarNullLiteral_2= ruleVarNullLiteral | this_VarDeclaration_3= ruleVarDeclaration ) ) | (otherlv_4= 'call' this_MethodCall_5= ruleMethodCall ) | (otherlv_6= 'scall' this_StaticMethodCall_7= ruleStaticMethodCall ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:190:1: ( (otherlv_0= 'var' (this_VarInitialisation_1= ruleVarInitialisation | this_VarNullLiteral_2= ruleVarNullLiteral | this_VarDeclaration_3= ruleVarDeclaration ) ) | (otherlv_4= 'call' this_MethodCall_5= ruleMethodCall ) | (otherlv_6= 'scall' this_StaticMethodCall_7= ruleStaticMethodCall ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:190:2: (otherlv_0= 'var' (this_VarInitialisation_1= ruleVarInitialisation | this_VarNullLiteral_2= ruleVarNullLiteral | this_VarDeclaration_3= ruleVarDeclaration ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:190:2: (otherlv_0= 'var' (this_VarInitialisation_1= ruleVarInitialisation | this_VarNullLiteral_2= ruleVarNullLiteral | this_VarDeclaration_3= ruleVarDeclaration ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:190:4: otherlv_0= 'var' (this_VarInitialisation_1= ruleVarInitialisation | this_VarNullLiteral_2= ruleVarNullLiteral | this_VarDeclaration_3= ruleVarDeclaration )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleStatement345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getVarKeyword_0_0());
                          
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:194:1: (this_VarInitialisation_1= ruleVarInitialisation | this_VarNullLiteral_2= ruleVarNullLiteral | this_VarDeclaration_3= ruleVarDeclaration )
                    int alt5=3;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:195:2: this_VarInitialisation_1= ruleVarInitialisation
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getStatementAccess().getVarInitialisationParserRuleCall_0_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleVarInitialisation_in_ruleStatement371);
                            this_VarInitialisation_1=ruleVarInitialisation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_VarInitialisation_1; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:208:2: this_VarNullLiteral_2= ruleVarNullLiteral
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getStatementAccess().getVarNullLiteralParserRuleCall_0_1_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleVarNullLiteral_in_ruleStatement401);
                            this_VarNullLiteral_2=ruleVarNullLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_VarNullLiteral_2; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:221:2: this_VarDeclaration_3= ruleVarDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_1_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleVarDeclaration_in_ruleStatement431);
                            this_VarDeclaration_3=ruleVarDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_VarDeclaration_3; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:233:6: (otherlv_4= 'call' this_MethodCall_5= ruleMethodCall )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:233:6: (otherlv_4= 'call' this_MethodCall_5= ruleMethodCall )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:233:8: otherlv_4= 'call' this_MethodCall_5= ruleMethodCall
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleStatement451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getCallKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMethodCall_in_ruleStatement476);
                    this_MethodCall_5=ruleMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MethodCall_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:250:6: (otherlv_6= 'scall' this_StaticMethodCall_7= ruleStaticMethodCall )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:250:6: (otherlv_6= 'scall' this_StaticMethodCall_7= ruleStaticMethodCall )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:250:8: otherlv_6= 'scall' this_StaticMethodCall_7= ruleStaticMethodCall
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleStatement495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getScallKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStaticMethodCallParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticMethodCall_in_ruleStatement520);
                    this_StaticMethodCall_7=ruleStaticMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StaticMethodCall_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVarInitialisation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:274:1: entryRuleVarInitialisation returns [EObject current=null] : iv_ruleVarInitialisation= ruleVarInitialisation EOF ;
    public final EObject entryRuleVarInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInitialisation = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:275:2: (iv_ruleVarInitialisation= ruleVarInitialisation EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:276:2: iv_ruleVarInitialisation= ruleVarInitialisation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarInitialisationRule()); 
            }
            pushFollow(FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation556);
            iv_ruleVarInitialisation=ruleVarInitialisation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarInitialisation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInitialisation566); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarInitialisation"


    // $ANTLR start "ruleVarInitialisation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:283:1: ruleVarInitialisation returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '*' ) ;
    public final EObject ruleVarInitialisation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:286:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '*' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:287:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '*' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:287:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '*' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:287:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '*'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:287:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:288:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:288:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:289:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVarInitialisation612);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarInitialisationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:305:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:306:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:306:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:307:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarInitialisation629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVarInitialisationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarInitialisationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleVarInitialisation646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVarInitialisation658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVarInitialisationAccess().getAsteriskKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVarInitialisation"


    // $ANTLR start "entryRuleVarNullLiteral"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:339:1: entryRuleVarNullLiteral returns [EObject current=null] : iv_ruleVarNullLiteral= ruleVarNullLiteral EOF ;
    public final EObject entryRuleVarNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarNullLiteral = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:340:2: (iv_ruleVarNullLiteral= ruleVarNullLiteral EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:341:2: iv_ruleVarNullLiteral= ruleVarNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleVarNullLiteral_in_entryRuleVarNullLiteral694);
            iv_ruleVarNullLiteral=ruleVarNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarNullLiteral704); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarNullLiteral"


    // $ANTLR start "ruleVarNullLiteral"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:348:1: ruleVarNullLiteral returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'null' ) ;
    public final EObject ruleVarNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:351:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'null' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:352:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'null' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:352:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'null' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:352:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'null'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:352:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:353:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:353:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:354:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarNullLiteralAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVarNullLiteral750);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarNullLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:370:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:371:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:371:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:372:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarNullLiteral767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVarNullLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarNullLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleVarNullLiteral784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVarNullLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleVarNullLiteral796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVarNullLiteralAccess().getNullKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVarNullLiteral"


    // $ANTLR start "entryRuleVarDeclaration"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:404:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:405:2: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:406:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration832);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration842); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:413:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:416:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:417:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:417:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:417:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:417:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:418:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:418:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:419:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVarDeclaration888);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:435:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:436:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:436:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:437:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDeclaration905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVarDeclarationParam"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:461:1: entryRuleVarDeclarationParam returns [EObject current=null] : iv_ruleVarDeclarationParam= ruleVarDeclarationParam EOF ;
    public final EObject entryRuleVarDeclarationParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclarationParam = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:462:2: (iv_ruleVarDeclarationParam= ruleVarDeclarationParam EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:463:2: iv_ruleVarDeclarationParam= ruleVarDeclarationParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationParamRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_entryRuleVarDeclarationParam946);
            iv_ruleVarDeclarationParam=ruleVarDeclarationParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclarationParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclarationParam956); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarDeclarationParam"


    // $ANTLR start "ruleVarDeclarationParam"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:470:1: ruleVarDeclarationParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVarDeclarationParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:473:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:474:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:474:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:474:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:474:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:475:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:475:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:476:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationParamAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVarDeclarationParam1002);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarDeclarationParamRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:492:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:493:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:493:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:494:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDeclarationParam1019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVarDeclarationParamAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarDeclarationParamRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVarDeclarationParam"


    // $ANTLR start "entryRuleMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:518:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:519:2: (iv_ruleMethodCall= ruleMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:520:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleMethodCall_in_entryRuleMethodCall1060);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCall1070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:527:1: ruleMethodCall returns [EObject current=null] : ( ( (lv_nameCallee_0_0= ruleName ) ) otherlv_1= '.' ( (lv_method_2_0= ruleCalledMethodName ) ) otherlv_3= '(' ( (lv_nameCaller_4_0= ruleName ) )? otherlv_5= ')' ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_nameCallee_0_0 = null;

        EObject lv_method_2_0 = null;

        EObject lv_nameCaller_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:530:28: ( ( ( (lv_nameCallee_0_0= ruleName ) ) otherlv_1= '.' ( (lv_method_2_0= ruleCalledMethodName ) ) otherlv_3= '(' ( (lv_nameCaller_4_0= ruleName ) )? otherlv_5= ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:531:1: ( ( (lv_nameCallee_0_0= ruleName ) ) otherlv_1= '.' ( (lv_method_2_0= ruleCalledMethodName ) ) otherlv_3= '(' ( (lv_nameCaller_4_0= ruleName ) )? otherlv_5= ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:531:1: ( ( (lv_nameCallee_0_0= ruleName ) ) otherlv_1= '.' ( (lv_method_2_0= ruleCalledMethodName ) ) otherlv_3= '(' ( (lv_nameCaller_4_0= ruleName ) )? otherlv_5= ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:531:2: ( (lv_nameCallee_0_0= ruleName ) ) otherlv_1= '.' ( (lv_method_2_0= ruleCalledMethodName ) ) otherlv_3= '(' ( (lv_nameCaller_4_0= ruleName ) )? otherlv_5= ')'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:531:2: ( (lv_nameCallee_0_0= ruleName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:532:1: (lv_nameCallee_0_0= ruleName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:532:1: (lv_nameCallee_0_0= ruleName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:533:3: lv_nameCallee_0_0= ruleName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodCallAccess().getNameCalleeNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleMethodCall1116);
            lv_nameCallee_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
              	        }
                     		set(
                     			current, 
                     			"nameCallee",
                      		lv_nameCallee_0_0, 
                      		"Name");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleMethodCall1128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getFullStopKeyword_1());
                  
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:553:1: ( (lv_method_2_0= ruleCalledMethodName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:554:1: (lv_method_2_0= ruleCalledMethodName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:554:1: (lv_method_2_0= ruleCalledMethodName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:555:3: lv_method_2_0= ruleCalledMethodName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodCallAccess().getMethodCalledMethodNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCalledMethodName_in_ruleMethodCall1149);
            lv_method_2_0=ruleCalledMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
              	        }
                     		set(
                     			current, 
                     			"method",
                      		lv_method_2_0, 
                      		"CalledMethodName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleMethodCall1161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:575:1: ( (lv_nameCaller_4_0= ruleName ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:576:1: (lv_nameCaller_4_0= ruleName )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:576:1: (lv_nameCaller_4_0= ruleName )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:577:3: lv_nameCaller_4_0= ruleName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodCallAccess().getNameCallerNameParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleMethodCall1182);
                    lv_nameCaller_4_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
                      	        }
                             		set(
                             			current, 
                             			"nameCaller",
                              		lv_nameCaller_4_0, 
                              		"Name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMethodCall1195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleStaticMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:605:1: entryRuleStaticMethodCall returns [EObject current=null] : iv_ruleStaticMethodCall= ruleStaticMethodCall EOF ;
    public final EObject entryRuleStaticMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticMethodCall = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:606:2: (iv_ruleStaticMethodCall= ruleStaticMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:607:2: iv_ruleStaticMethodCall= ruleStaticMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodCall_in_entryRuleStaticMethodCall1231);
            iv_ruleStaticMethodCall=ruleStaticMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticMethodCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticMethodCall1241); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticMethodCall"


    // $ANTLR start "ruleStaticMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:614:1: ruleStaticMethodCall returns [EObject current=null] : ( ( (lv_method_0_0= ruleWildcardNameConcatenated ) ) otherlv_1= '(' ( (lv_name_2_0= ruleName ) ) otherlv_3= ')' ) ;
    public final EObject ruleStaticMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_method_0_0 = null;

        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:617:28: ( ( ( (lv_method_0_0= ruleWildcardNameConcatenated ) ) otherlv_1= '(' ( (lv_name_2_0= ruleName ) ) otherlv_3= ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:618:1: ( ( (lv_method_0_0= ruleWildcardNameConcatenated ) ) otherlv_1= '(' ( (lv_name_2_0= ruleName ) ) otherlv_3= ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:618:1: ( ( (lv_method_0_0= ruleWildcardNameConcatenated ) ) otherlv_1= '(' ( (lv_name_2_0= ruleName ) ) otherlv_3= ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:618:2: ( (lv_method_0_0= ruleWildcardNameConcatenated ) ) otherlv_1= '(' ( (lv_name_2_0= ruleName ) ) otherlv_3= ')'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:618:2: ( (lv_method_0_0= ruleWildcardNameConcatenated ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:619:1: (lv_method_0_0= ruleWildcardNameConcatenated )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:619:1: (lv_method_0_0= ruleWildcardNameConcatenated )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:620:3: lv_method_0_0= ruleWildcardNameConcatenated
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStaticMethodCallAccess().getMethodWildcardNameConcatenatedParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_ruleStaticMethodCall1287);
            lv_method_0_0=ruleWildcardNameConcatenated();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStaticMethodCallRule());
              	        }
                     		set(
                     			current, 
                     			"method",
                      		lv_method_0_0, 
                      		"WildcardNameConcatenated");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleStaticMethodCall1299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStaticMethodCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:640:1: ( (lv_name_2_0= ruleName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:641:1: (lv_name_2_0= ruleName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:641:1: (lv_name_2_0= ruleName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:642:3: lv_name_2_0= ruleName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStaticMethodCallAccess().getNameNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleStaticMethodCall1320);
            lv_name_2_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStaticMethodCallRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"Name");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStaticMethodCall1332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStaticMethodCallAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticMethodCall"


    // $ANTLR start "entryRuleCalledMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:670:1: entryRuleCalledMethodName returns [EObject current=null] : iv_ruleCalledMethodName= ruleCalledMethodName EOF ;
    public final EObject entryRuleCalledMethodName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalledMethodName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:671:2: (iv_ruleCalledMethodName= ruleCalledMethodName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:672:2: iv_ruleCalledMethodName= ruleCalledMethodName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCalledMethodNameRule()); 
            }
            pushFollow(FOLLOW_ruleCalledMethodName_in_entryRuleCalledMethodName1368);
            iv_ruleCalledMethodName=ruleCalledMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCalledMethodName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalledMethodName1378); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCalledMethodName"


    // $ANTLR start "ruleCalledMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:679:1: ruleCalledMethodName returns [EObject current=null] : ( (lv_value_0_0= ruleWildcardName ) ) ;
    public final EObject ruleCalledMethodName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:682:28: ( ( (lv_value_0_0= ruleWildcardName ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:683:1: ( (lv_value_0_0= ruleWildcardName ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:683:1: ( (lv_value_0_0= ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:684:1: (lv_value_0_0= ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:684:1: (lv_value_0_0= ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:685:3: lv_value_0_0= ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCalledMethodNameAccess().getValueWildcardNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleWildcardName_in_ruleCalledMethodName1423);
            lv_value_0_0=ruleWildcardName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCalledMethodNameRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"WildcardName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCalledMethodName"


    // $ANTLR start "entryRuleType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:709:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:710:2: (iv_ruleType= ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:711:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1458);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1468); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:718:1: ruleType returns [EObject current=null] : ( (lv_value_0_0= ruleWildcardNameConcatenated ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:721:28: ( ( (lv_value_0_0= ruleWildcardNameConcatenated ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:722:1: ( (lv_value_0_0= ruleWildcardNameConcatenated ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:722:1: ( (lv_value_0_0= ruleWildcardNameConcatenated ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:723:1: (lv_value_0_0= ruleWildcardNameConcatenated )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:723:1: (lv_value_0_0= ruleWildcardNameConcatenated )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:724:3: lv_value_0_0= ruleWildcardNameConcatenated
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getValueWildcardNameConcatenatedParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_ruleType1513);
            lv_value_0_0=ruleWildcardNameConcatenated();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"WildcardNameConcatenated");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:748:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:749:2: (iv_ruleName= ruleName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:750:2: iv_ruleName= ruleName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_ruleName_in_entryRuleName1548);
            iv_ruleName=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1558); if (state.failed) return current;

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:757:1: ruleName returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:760:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:761:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:761:1: ( (lv_value_0_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:762:1: (lv_value_0_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:762:1: (lv_value_0_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:763:3: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName1599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getNameAccess().getValueIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNameRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleWildcardNameConcatenated"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:787:1: entryRuleWildcardNameConcatenated returns [String current=null] : iv_ruleWildcardNameConcatenated= ruleWildcardNameConcatenated EOF ;
    public final String entryRuleWildcardNameConcatenated() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWildcardNameConcatenated = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:788:2: (iv_ruleWildcardNameConcatenated= ruleWildcardNameConcatenated EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:789:2: iv_ruleWildcardNameConcatenated= ruleWildcardNameConcatenated EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardNameConcatenatedRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_entryRuleWildcardNameConcatenated1640);
            iv_ruleWildcardNameConcatenated=ruleWildcardNameConcatenated();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardNameConcatenated.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNameConcatenated1651); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWildcardNameConcatenated"


    // $ANTLR start "ruleWildcardNameConcatenated"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:796:1: ruleWildcardNameConcatenated returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WildcardName_0= ruleWildcardName (kw= '.' this_WildcardName_2= ruleWildcardName )* ) ;
    public final AntlrDatatypeRuleToken ruleWildcardNameConcatenated() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_WildcardName_0 = null;

        AntlrDatatypeRuleToken this_WildcardName_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:799:28: ( (this_WildcardName_0= ruleWildcardName (kw= '.' this_WildcardName_2= ruleWildcardName )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:800:1: (this_WildcardName_0= ruleWildcardName (kw= '.' this_WildcardName_2= ruleWildcardName )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:800:1: (this_WildcardName_0= ruleWildcardName (kw= '.' this_WildcardName_2= ruleWildcardName )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:801:5: this_WildcardName_0= ruleWildcardName (kw= '.' this_WildcardName_2= ruleWildcardName )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWildcardNameConcatenatedAccess().getWildcardNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleWildcardName_in_ruleWildcardNameConcatenated1698);
            this_WildcardName_0=ruleWildcardName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_WildcardName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:811:1: (kw= '.' this_WildcardName_2= ruleWildcardName )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:812:2: kw= '.' this_WildcardName_2= ruleWildcardName
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleWildcardNameConcatenated1717); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getWildcardNameConcatenatedAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getWildcardNameConcatenatedAccess().getWildcardNameParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWildcardName_in_ruleWildcardNameConcatenated1739);
            	    this_WildcardName_2=ruleWildcardName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WildcardName_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWildcardNameConcatenated"


    // $ANTLR start "entryRuleWildcardName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:836:1: entryRuleWildcardName returns [String current=null] : iv_ruleWildcardName= ruleWildcardName EOF ;
    public final String entryRuleWildcardName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWildcardName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:837:2: (iv_ruleWildcardName= ruleWildcardName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:838:2: iv_ruleWildcardName= ruleWildcardName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardNameRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_entryRuleWildcardName1787);
            iv_ruleWildcardName=ruleWildcardName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardName1798); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWildcardName"


    // $ANTLR start "ruleWildcardName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:845:1: ruleWildcardName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '*' | kw= '?' )+ ;
    public final AntlrDatatypeRuleToken ruleWildcardName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:848:28: ( (this_ID_0= RULE_ID | kw= '*' | kw= '?' )+ )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:849:1: (this_ID_0= RULE_ID | kw= '*' | kw= '?' )+
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:849:1: (this_ID_0= RULE_ID | kw= '*' | kw= '?' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==EOF) ) {
                        int LA9_5 = input.LA(3);

                        if ( (LA9_5==EOF) ) {
                            alt9=1;
                        }


                    }
                    else if ( (LA9_2==RULE_ID||LA9_2==11||LA9_2==20||(LA9_2>=22 && LA9_2<=23)) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 20:
                    {
                    alt9=2;
                    }
                    break;
                case 23:
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:849:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWildcardName1838); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getWildcardNameAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:858:2: kw= '*'
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleWildcardName1862); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getWildcardNameAccess().getAsteriskKeyword_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:865:2: kw= '?'
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleWildcardName1881); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getWildcardNameAccess().getQuestionMarkKeyword_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWildcardName"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\16\uffff";
    static final String DFA5_eofS =
        "\5\uffff\1\12\5\uffff\1\12\2\uffff";
    static final String DFA5_minS =
        "\11\4\1\24\1\uffff\1\4\2\uffff";
    static final String DFA5_maxS =
        "\11\27\1\25\1\uffff\1\27\2\uffff";
    static final String DFA5_acceptS =
        "\12\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\16\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\17\uffff\1\2\2\uffff\1\3",
            "\1\5\17\uffff\1\2\1\uffff\1\4\1\3",
            "\1\5\17\uffff\1\2\1\uffff\1\4\1\3",
            "\1\5\17\uffff\1\2\1\uffff\1\4\1\3",
            "\1\6\17\uffff\1\7\2\uffff\1\10",
            "\1\5\12\uffff\4\12\1\11\1\2\1\uffff\1\4\1\3",
            "\1\13\17\uffff\1\7\1\uffff\1\4\1\10",
            "\1\13\17\uffff\1\7\1\uffff\1\4\1\10",
            "\1\13\17\uffff\1\7\1\uffff\1\4\1\10",
            "\1\14\1\15",
            "",
            "\1\13\12\uffff\4\12\1\11\1\7\1\uffff\1\4\1\10",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "194:1: (this_VarInitialisation_1= ruleVarInitialisation | this_VarNullLiteral_2= ruleVarNullLiteral | this_VarDeclaration_3= ruleVarDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel141 = new BitSet(new long[]{0x0000000000900010L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_ruleModel162 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleModel175 = new BitSet(new long[]{0x0000000000900010L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_ruleModel196 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleModel210 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleModel225 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModel246 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_15_in_ruleModel259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStatement345 = new BitSet(new long[]{0x0000000000900010L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_ruleStatement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarNullLiteral_in_ruleStatement401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleStatement431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStatement451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethodCall_in_ruleStatement476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStatement495 = new BitSet(new long[]{0x0000000000900010L});
    public static final BitSet FOLLOW_ruleStaticMethodCall_in_ruleStatement520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInitialisation566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarInitialisation612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarInitialisation629 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVarInitialisation646 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVarInitialisation658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarNullLiteral_in_entryRuleVarNullLiteral694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarNullLiteral704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarNullLiteral750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarNullLiteral767 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVarNullLiteral784 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVarNullLiteral796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDeclaration888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDeclaration905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_entryRuleVarDeclarationParam946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclarationParam956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDeclarationParam1002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDeclarationParam1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleMethodCall1116 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMethodCall1128 = new BitSet(new long[]{0x0000000000900010L});
    public static final BitSet FOLLOW_ruleCalledMethodName_in_ruleMethodCall1149 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleMethodCall1161 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleName_in_ruleMethodCall1182 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMethodCall1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodCall_in_entryRuleStaticMethodCall1231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticMethodCall1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_ruleStaticMethodCall1287 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleStaticMethodCall1299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleName_in_ruleStaticMethodCall1320 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStaticMethodCall1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalledMethodName_in_entryRuleCalledMethodName1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalledMethodName1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_ruleCalledMethodName1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_ruleType1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_entryRuleWildcardNameConcatenated1640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNameConcatenated1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_ruleWildcardNameConcatenated1698 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleWildcardNameConcatenated1717 = new BitSet(new long[]{0x0000000000900010L});
    public static final BitSet FOLLOW_ruleWildcardName_in_ruleWildcardNameConcatenated1739 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_entryRuleWildcardName1787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardName1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWildcardName1838 = new BitSet(new long[]{0x0000000000900012L});
    public static final BitSet FOLLOW_20_in_ruleWildcardName1862 = new BitSet(new long[]{0x0000000000900012L});
    public static final BitSet FOLLOW_23_in_ruleWildcardName1881 = new BitSet(new long[]{0x0000000000900012L});

}