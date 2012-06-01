package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.services.QL2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalQL2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'('", "','", "')'", "'{'", "'}'", "'call'", "'scall'", "'='", "'null'", "'*'", "'new'", "'return'", "'.'", "'?'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:82:1: ruleModel returns [EObject current=null] : ( () (otherlv_1= 'var' ( (lv_vars_2_0= ruleVarDeclaration ) ) )* (otherlv_3= '(' ( ( (lv_vars_4_0= ruleVarDeclarationParam ) ) (otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) ) )* )? otherlv_7= ')' )? (otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* ( (lv_returnStatement_10_0= ruleReturnStatement ) )? otherlv_11= '}' )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_vars_2_0 = null;

        EObject lv_vars_4_0 = null;

        EObject lv_vars_6_0 = null;

        EObject lv_statements_9_0 = null;

        EObject lv_returnStatement_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:85:28: ( ( () (otherlv_1= 'var' ( (lv_vars_2_0= ruleVarDeclaration ) ) )* (otherlv_3= '(' ( ( (lv_vars_4_0= ruleVarDeclarationParam ) ) (otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) ) )* )? otherlv_7= ')' )? (otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* ( (lv_returnStatement_10_0= ruleReturnStatement ) )? otherlv_11= '}' )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:86:1: ( () (otherlv_1= 'var' ( (lv_vars_2_0= ruleVarDeclaration ) ) )* (otherlv_3= '(' ( ( (lv_vars_4_0= ruleVarDeclarationParam ) ) (otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) ) )* )? otherlv_7= ')' )? (otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* ( (lv_returnStatement_10_0= ruleReturnStatement ) )? otherlv_11= '}' )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:86:1: ( () (otherlv_1= 'var' ( (lv_vars_2_0= ruleVarDeclaration ) ) )* (otherlv_3= '(' ( ( (lv_vars_4_0= ruleVarDeclarationParam ) ) (otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) ) )* )? otherlv_7= ')' )? (otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* ( (lv_returnStatement_10_0= ruleReturnStatement ) )? otherlv_11= '}' )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:86:2: () (otherlv_1= 'var' ( (lv_vars_2_0= ruleVarDeclaration ) ) )* (otherlv_3= '(' ( ( (lv_vars_4_0= ruleVarDeclarationParam ) ) (otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) ) )* )? otherlv_7= ')' )? (otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* ( (lv_returnStatement_10_0= ruleReturnStatement ) )? otherlv_11= '}' )?
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:95:2: (otherlv_1= 'var' ( (lv_vars_2_0= ruleVarDeclaration ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:95:4: otherlv_1= 'var' ( (lv_vars_2_0= ruleVarDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModel141); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getVarKeyword_1_0());
            	          
            	    }
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:99:1: ( (lv_vars_2_0= ruleVarDeclaration ) )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:100:1: (lv_vars_2_0= ruleVarDeclaration )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:100:1: (lv_vars_2_0= ruleVarDeclaration )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:101:3: lv_vars_2_0= ruleVarDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleModel162);
            	    lv_vars_2_0=ruleVarDeclaration();

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
            	              		"VarDeclaration");
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:117:4: (otherlv_3= '(' ( ( (lv_vars_4_0= ruleVarDeclarationParam ) ) (otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) ) )* )? otherlv_7= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:117:6: otherlv_3= '(' ( ( (lv_vars_4_0= ruleVarDeclarationParam ) ) (otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleModel177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:121:1: ( ( (lv_vars_4_0= ruleVarDeclarationParam ) ) (otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) ) )* )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_ID||LA3_0==21||LA3_0==25) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:121:2: ( (lv_vars_4_0= ruleVarDeclarationParam ) ) (otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) ) )*
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:121:2: ( (lv_vars_4_0= ruleVarDeclarationParam ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:122:1: (lv_vars_4_0= ruleVarDeclarationParam )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:122:1: (lv_vars_4_0= ruleVarDeclarationParam )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:123:3: lv_vars_4_0= ruleVarDeclarationParam
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVarDeclarationParam_in_ruleModel199);
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

                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:139:2: (otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) ) )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( (LA2_0==13) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:139:4: otherlv_5= ',' ( (lv_vars_6_0= ruleVarDeclarationParam ) )
                            	    {
                            	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleModel212); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:143:1: ( (lv_vars_6_0= ruleVarDeclarationParam ) )
                            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:144:1: (lv_vars_6_0= ruleVarDeclarationParam )
                            	    {
                            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:144:1: (lv_vars_6_0= ruleVarDeclarationParam )
                            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:145:3: lv_vars_6_0= ruleVarDeclarationParam
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParamParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleVarDeclarationParam_in_ruleModel233);
                            	    lv_vars_6_0=ruleVarDeclarationParam();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"vars",
                            	              		lv_vars_6_0, 
                            	              		"VarDeclarationParam");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleModel249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:165:3: (otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* ( (lv_returnStatement_10_0= ruleReturnStatement ) )? otherlv_11= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:165:5: otherlv_8= '{' ( (lv_statements_9_0= ruleStatement ) )* ( (lv_returnStatement_10_0= ruleReturnStatement ) )? otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleModel264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:169:1: ( (lv_statements_9_0= ruleStatement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==11||(LA5_0>=17 && LA5_0<=18)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:170:1: (lv_statements_9_0= ruleStatement )
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:170:1: (lv_statements_9_0= ruleStatement )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:171:3: lv_statements_9_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleModel285);
                    	    lv_statements_9_0=ruleStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_9_0, 
                    	              		"Statement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:187:3: ( (lv_returnStatement_10_0= ruleReturnStatement ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==23) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:188:1: (lv_returnStatement_10_0= ruleReturnStatement )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:188:1: (lv_returnStatement_10_0= ruleReturnStatement )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:189:3: lv_returnStatement_10_0= ruleReturnStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getModelAccess().getReturnStatementReturnStatementParserRuleCall_3_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReturnStatement_in_ruleModel307);
                            lv_returnStatement_10_0=ruleReturnStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getModelRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"returnStatement",
                                      		lv_returnStatement_10_0, 
                                      		"ReturnStatement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleModel320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_3());
                          
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:217:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:218:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:219:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement358);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement368); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:226:1: ruleStatement returns [EObject current=null] : ( (otherlv_0= 'var' ( ( (lv_var_1_0= ruleVarAssignment ) ) | ( (lv_var_2_0= ruleVarInstanceCreation ) ) | ( (lv_var_3_0= ruleVarNullLiteral ) ) | ( (lv_var_4_0= ruleVarDeclaration ) ) ) ) | (otherlv_5= 'call' this_MethodCall_6= ruleMethodCall ) | (otherlv_7= 'scall' this_StaticMethodCall_8= ruleStaticMethodCall ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_var_1_0 = null;

        EObject lv_var_2_0 = null;

        EObject lv_var_3_0 = null;

        EObject lv_var_4_0 = null;

        EObject this_MethodCall_6 = null;

        EObject this_StaticMethodCall_8 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:229:28: ( ( (otherlv_0= 'var' ( ( (lv_var_1_0= ruleVarAssignment ) ) | ( (lv_var_2_0= ruleVarInstanceCreation ) ) | ( (lv_var_3_0= ruleVarNullLiteral ) ) | ( (lv_var_4_0= ruleVarDeclaration ) ) ) ) | (otherlv_5= 'call' this_MethodCall_6= ruleMethodCall ) | (otherlv_7= 'scall' this_StaticMethodCall_8= ruleStaticMethodCall ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:230:1: ( (otherlv_0= 'var' ( ( (lv_var_1_0= ruleVarAssignment ) ) | ( (lv_var_2_0= ruleVarInstanceCreation ) ) | ( (lv_var_3_0= ruleVarNullLiteral ) ) | ( (lv_var_4_0= ruleVarDeclaration ) ) ) ) | (otherlv_5= 'call' this_MethodCall_6= ruleMethodCall ) | (otherlv_7= 'scall' this_StaticMethodCall_8= ruleStaticMethodCall ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:230:1: ( (otherlv_0= 'var' ( ( (lv_var_1_0= ruleVarAssignment ) ) | ( (lv_var_2_0= ruleVarInstanceCreation ) ) | ( (lv_var_3_0= ruleVarNullLiteral ) ) | ( (lv_var_4_0= ruleVarDeclaration ) ) ) ) | (otherlv_5= 'call' this_MethodCall_6= ruleMethodCall ) | (otherlv_7= 'scall' this_StaticMethodCall_8= ruleStaticMethodCall ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:230:2: (otherlv_0= 'var' ( ( (lv_var_1_0= ruleVarAssignment ) ) | ( (lv_var_2_0= ruleVarInstanceCreation ) ) | ( (lv_var_3_0= ruleVarNullLiteral ) ) | ( (lv_var_4_0= ruleVarDeclaration ) ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:230:2: (otherlv_0= 'var' ( ( (lv_var_1_0= ruleVarAssignment ) ) | ( (lv_var_2_0= ruleVarInstanceCreation ) ) | ( (lv_var_3_0= ruleVarNullLiteral ) ) | ( (lv_var_4_0= ruleVarDeclaration ) ) ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:230:4: otherlv_0= 'var' ( ( (lv_var_1_0= ruleVarAssignment ) ) | ( (lv_var_2_0= ruleVarInstanceCreation ) ) | ( (lv_var_3_0= ruleVarNullLiteral ) ) | ( (lv_var_4_0= ruleVarDeclaration ) ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStatement406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getVarKeyword_0_0());
                          
                    }
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:234:1: ( ( (lv_var_1_0= ruleVarAssignment ) ) | ( (lv_var_2_0= ruleVarInstanceCreation ) ) | ( (lv_var_3_0= ruleVarNullLiteral ) ) | ( (lv_var_4_0= ruleVarDeclaration ) ) )
                    int alt8=4;
                    alt8 = dfa8.predict(input);
                    switch (alt8) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:234:2: ( (lv_var_1_0= ruleVarAssignment ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:234:2: ( (lv_var_1_0= ruleVarAssignment ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:235:1: (lv_var_1_0= ruleVarAssignment )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:235:1: (lv_var_1_0= ruleVarAssignment )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:236:3: lv_var_1_0= ruleVarAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getVarVarAssignmentParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVarAssignment_in_ruleStatement428);
                            lv_var_1_0=ruleVarAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"var",
                                      		lv_var_1_0, 
                                      		"VarAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:253:6: ( (lv_var_2_0= ruleVarInstanceCreation ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:253:6: ( (lv_var_2_0= ruleVarInstanceCreation ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:254:1: (lv_var_2_0= ruleVarInstanceCreation )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:254:1: (lv_var_2_0= ruleVarInstanceCreation )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:255:3: lv_var_2_0= ruleVarInstanceCreation
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getVarVarInstanceCreationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVarInstanceCreation_in_ruleStatement455);
                            lv_var_2_0=ruleVarInstanceCreation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"var",
                                      		lv_var_2_0, 
                                      		"VarInstanceCreation");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:272:6: ( (lv_var_3_0= ruleVarNullLiteral ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:272:6: ( (lv_var_3_0= ruleVarNullLiteral ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:273:1: (lv_var_3_0= ruleVarNullLiteral )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:273:1: (lv_var_3_0= ruleVarNullLiteral )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:274:3: lv_var_3_0= ruleVarNullLiteral
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getVarVarNullLiteralParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVarNullLiteral_in_ruleStatement482);
                            lv_var_3_0=ruleVarNullLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"var",
                                      		lv_var_3_0, 
                                      		"VarNullLiteral");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:291:6: ( (lv_var_4_0= ruleVarDeclaration ) )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:291:6: ( (lv_var_4_0= ruleVarDeclaration ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:292:1: (lv_var_4_0= ruleVarDeclaration )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:292:1: (lv_var_4_0= ruleVarDeclaration )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:293:3: lv_var_4_0= ruleVarDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getVarVarDeclarationParserRuleCall_0_1_3_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVarDeclaration_in_ruleStatement509);
                            lv_var_4_0=ruleVarDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"var",
                                      		lv_var_4_0, 
                                      		"VarDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:310:6: (otherlv_5= 'call' this_MethodCall_6= ruleMethodCall )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:310:6: (otherlv_5= 'call' this_MethodCall_6= ruleMethodCall )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:310:8: otherlv_5= 'call' this_MethodCall_6= ruleMethodCall
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleStatement530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getCallKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMethodCall_in_ruleStatement555);
                    this_MethodCall_6=ruleMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MethodCall_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:327:6: (otherlv_7= 'scall' this_StaticMethodCall_8= ruleStaticMethodCall )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:327:6: (otherlv_7= 'scall' this_StaticMethodCall_8= ruleStaticMethodCall )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:327:8: otherlv_7= 'scall' this_StaticMethodCall_8= ruleStaticMethodCall
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleStatement574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getStatementAccess().getScallKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStaticMethodCallParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticMethodCall_in_ruleStatement599);
                    this_StaticMethodCall_8=ruleStaticMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StaticMethodCall_8; 
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


    // $ANTLR start "entryRuleVarDeclarationParam"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:351:1: entryRuleVarDeclarationParam returns [EObject current=null] : iv_ruleVarDeclarationParam= ruleVarDeclarationParam EOF ;
    public final EObject entryRuleVarDeclarationParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclarationParam = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:352:2: (iv_ruleVarDeclarationParam= ruleVarDeclarationParam EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:353:2: iv_ruleVarDeclarationParam= ruleVarDeclarationParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationParamRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationParam_in_entryRuleVarDeclarationParam635);
            iv_ruleVarDeclarationParam=ruleVarDeclarationParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclarationParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclarationParam645); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:360:1: ruleVarDeclarationParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVarDeclarationParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:363:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:364:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:364:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:364:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:364:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:365:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:365:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:366:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationParamAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVarDeclarationParam691);
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:382:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:383:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:383:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:384:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDeclarationParam708); if (state.failed) return current;
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


    // $ANTLR start "entryRuleVarNullLiteral"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:408:1: entryRuleVarNullLiteral returns [EObject current=null] : iv_ruleVarNullLiteral= ruleVarNullLiteral EOF ;
    public final EObject entryRuleVarNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarNullLiteral = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:409:2: (iv_ruleVarNullLiteral= ruleVarNullLiteral EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:410:2: iv_ruleVarNullLiteral= ruleVarNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleVarNullLiteral_in_entryRuleVarNullLiteral749);
            iv_ruleVarNullLiteral=ruleVarNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarNullLiteral759); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:417:1: ruleVarNullLiteral returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'null' ) ;
    public final EObject ruleVarNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:420:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'null' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:421:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'null' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:421:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'null' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:421:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'null'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:421:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:422:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:422:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:423:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarNullLiteralAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVarNullLiteral805);
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:439:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:440:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:440:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:441:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarNullLiteral822); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleVarNullLiteral839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVarNullLiteralAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVarNullLiteral851); if (state.failed) return current;
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


    // $ANTLR start "entryRuleVarAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:473:1: entryRuleVarAssignment returns [EObject current=null] : iv_ruleVarAssignment= ruleVarAssignment EOF ;
    public final EObject entryRuleVarAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssignment = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:474:2: (iv_ruleVarAssignment= ruleVarAssignment EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:475:2: iv_ruleVarAssignment= ruleVarAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleVarAssignment_in_entryRuleVarAssignment887);
            iv_ruleVarAssignment=ruleVarAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarAssignment897); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarAssignment"


    // $ANTLR start "ruleVarAssignment"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:482:1: ruleVarAssignment returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '*' ) ;
    public final EObject ruleVarAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:485:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '*' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:486:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '*' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:486:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '*' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:486:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '*'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:486:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:487:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:487:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:488:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarAssignmentAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVarAssignment943);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarAssignmentRule());
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:504:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:505:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:505:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:506:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarAssignment960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVarAssignmentAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarAssignmentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleVarAssignment977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVarAssignmentAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleVarAssignment989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVarAssignmentAccess().getAsteriskKeyword_3());
                  
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
    // $ANTLR end "ruleVarAssignment"


    // $ANTLR start "entryRuleVarInstanceCreation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:538:1: entryRuleVarInstanceCreation returns [EObject current=null] : iv_ruleVarInstanceCreation= ruleVarInstanceCreation EOF ;
    public final EObject entryRuleVarInstanceCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInstanceCreation = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:539:2: (iv_ruleVarInstanceCreation= ruleVarInstanceCreation EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:540:2: iv_ruleVarInstanceCreation= ruleVarInstanceCreation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarInstanceCreationRule()); 
            }
            pushFollow(FOLLOW_ruleVarInstanceCreation_in_entryRuleVarInstanceCreation1025);
            iv_ruleVarInstanceCreation=ruleVarInstanceCreation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarInstanceCreation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInstanceCreation1035); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarInstanceCreation"


    // $ANTLR start "ruleVarInstanceCreation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:547:1: ruleVarInstanceCreation returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'new' ) ;
    public final EObject ruleVarInstanceCreation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:550:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'new' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:551:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'new' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:551:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'new' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:551:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'new'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:551:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:552:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:552:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:553:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarInstanceCreationAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVarInstanceCreation1081);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarInstanceCreationRule());
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:569:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:570:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:570:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:571:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarInstanceCreation1098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVarInstanceCreationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarInstanceCreationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleVarInstanceCreation1115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVarInstanceCreationAccess().getEqualsSignKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleVarInstanceCreation1127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVarInstanceCreationAccess().getNewKeyword_3());
                  
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
    // $ANTLR end "ruleVarInstanceCreation"


    // $ANTLR start "entryRuleVarDeclaration"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:603:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:604:2: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:605:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration1163);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration1173); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:612:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:615:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:616:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:616:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:616:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:616:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:617:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:617:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:618:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVarDeclaration1219);
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:634:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:635:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:635:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:636:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDeclaration1236); if (state.failed) return current;
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


    // $ANTLR start "entryRuleReturnStatement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:660:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:661:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:662:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement1277);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement1287); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:669:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:672:28: ( (otherlv_0= 'return' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:673:1: (otherlv_0= 'return' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:673:1: (otherlv_0= 'return' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:673:3: otherlv_0= 'return' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleReturnStatement1324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
                  
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:677:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:678:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:678:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:679:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReturnStatement1341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getReturnStatementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReturnStatementRule());
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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:703:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:704:2: (iv_ruleMethodCall= ruleMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:705:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleMethodCall_in_entryRuleMethodCall1382);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCall1392); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:712:1: ruleMethodCall returns [EObject current=null] : ( ( (lv_nameCallee_0_0= ruleName ) ) otherlv_1= '.' ( (lv_method_2_0= ruleCalledMethodName ) ) otherlv_3= '(' ( (lv_nameCaller_4_0= ruleName ) )? otherlv_5= ')' ) ;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:715:28: ( ( ( (lv_nameCallee_0_0= ruleName ) ) otherlv_1= '.' ( (lv_method_2_0= ruleCalledMethodName ) ) otherlv_3= '(' ( (lv_nameCaller_4_0= ruleName ) )? otherlv_5= ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:716:1: ( ( (lv_nameCallee_0_0= ruleName ) ) otherlv_1= '.' ( (lv_method_2_0= ruleCalledMethodName ) ) otherlv_3= '(' ( (lv_nameCaller_4_0= ruleName ) )? otherlv_5= ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:716:1: ( ( (lv_nameCallee_0_0= ruleName ) ) otherlv_1= '.' ( (lv_method_2_0= ruleCalledMethodName ) ) otherlv_3= '(' ( (lv_nameCaller_4_0= ruleName ) )? otherlv_5= ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:716:2: ( (lv_nameCallee_0_0= ruleName ) ) otherlv_1= '.' ( (lv_method_2_0= ruleCalledMethodName ) ) otherlv_3= '(' ( (lv_nameCaller_4_0= ruleName ) )? otherlv_5= ')'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:716:2: ( (lv_nameCallee_0_0= ruleName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:717:1: (lv_nameCallee_0_0= ruleName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:717:1: (lv_nameCallee_0_0= ruleName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:718:3: lv_nameCallee_0_0= ruleName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodCallAccess().getNameCalleeNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleMethodCall1438);
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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleMethodCall1450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getFullStopKeyword_1());
                  
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:738:1: ( (lv_method_2_0= ruleCalledMethodName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:739:1: (lv_method_2_0= ruleCalledMethodName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:739:1: (lv_method_2_0= ruleCalledMethodName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:740:3: lv_method_2_0= ruleCalledMethodName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodCallAccess().getMethodCalledMethodNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCalledMethodName_in_ruleMethodCall1471);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleMethodCall1483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:760:1: ( (lv_nameCaller_4_0= ruleName ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:761:1: (lv_nameCaller_4_0= ruleName )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:761:1: (lv_nameCaller_4_0= ruleName )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:762:3: lv_nameCaller_4_0= ruleName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodCallAccess().getNameCallerNameParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleMethodCall1504);
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleMethodCall1517); if (state.failed) return current;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:790:1: entryRuleStaticMethodCall returns [EObject current=null] : iv_ruleStaticMethodCall= ruleStaticMethodCall EOF ;
    public final EObject entryRuleStaticMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticMethodCall = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:791:2: (iv_ruleStaticMethodCall= ruleStaticMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:792:2: iv_ruleStaticMethodCall= ruleStaticMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodCall_in_entryRuleStaticMethodCall1553);
            iv_ruleStaticMethodCall=ruleStaticMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticMethodCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticMethodCall1563); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:799:1: ruleStaticMethodCall returns [EObject current=null] : ( ( (lv_method_0_0= ruleWildcardNameConcatenated ) ) otherlv_1= '(' ( (lv_name_2_0= ruleName ) ) otherlv_3= ')' ) ;
    public final EObject ruleStaticMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_method_0_0 = null;

        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:802:28: ( ( ( (lv_method_0_0= ruleWildcardNameConcatenated ) ) otherlv_1= '(' ( (lv_name_2_0= ruleName ) ) otherlv_3= ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:803:1: ( ( (lv_method_0_0= ruleWildcardNameConcatenated ) ) otherlv_1= '(' ( (lv_name_2_0= ruleName ) ) otherlv_3= ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:803:1: ( ( (lv_method_0_0= ruleWildcardNameConcatenated ) ) otherlv_1= '(' ( (lv_name_2_0= ruleName ) ) otherlv_3= ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:803:2: ( (lv_method_0_0= ruleWildcardNameConcatenated ) ) otherlv_1= '(' ( (lv_name_2_0= ruleName ) ) otherlv_3= ')'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:803:2: ( (lv_method_0_0= ruleWildcardNameConcatenated ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:804:1: (lv_method_0_0= ruleWildcardNameConcatenated )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:804:1: (lv_method_0_0= ruleWildcardNameConcatenated )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:805:3: lv_method_0_0= ruleWildcardNameConcatenated
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStaticMethodCallAccess().getMethodWildcardNameConcatenatedParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_ruleStaticMethodCall1609);
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStaticMethodCall1621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStaticMethodCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:825:1: ( (lv_name_2_0= ruleName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:826:1: (lv_name_2_0= ruleName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:826:1: (lv_name_2_0= ruleName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:827:3: lv_name_2_0= ruleName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStaticMethodCallAccess().getNameNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleStaticMethodCall1642);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleStaticMethodCall1654); if (state.failed) return current;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:855:1: entryRuleCalledMethodName returns [EObject current=null] : iv_ruleCalledMethodName= ruleCalledMethodName EOF ;
    public final EObject entryRuleCalledMethodName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalledMethodName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:856:2: (iv_ruleCalledMethodName= ruleCalledMethodName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:857:2: iv_ruleCalledMethodName= ruleCalledMethodName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCalledMethodNameRule()); 
            }
            pushFollow(FOLLOW_ruleCalledMethodName_in_entryRuleCalledMethodName1690);
            iv_ruleCalledMethodName=ruleCalledMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCalledMethodName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalledMethodName1700); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:864:1: ruleCalledMethodName returns [EObject current=null] : ( (lv_value_0_0= ruleWildcardName ) ) ;
    public final EObject ruleCalledMethodName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:867:28: ( ( (lv_value_0_0= ruleWildcardName ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:868:1: ( (lv_value_0_0= ruleWildcardName ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:868:1: ( (lv_value_0_0= ruleWildcardName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:869:1: (lv_value_0_0= ruleWildcardName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:869:1: (lv_value_0_0= ruleWildcardName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:870:3: lv_value_0_0= ruleWildcardName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCalledMethodNameAccess().getValueWildcardNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleWildcardName_in_ruleCalledMethodName1745);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:894:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:895:2: (iv_ruleType= ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:896:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1780);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1790); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:903:1: ruleType returns [EObject current=null] : ( (lv_value_0_0= ruleWildcardNameConcatenated ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:906:28: ( ( (lv_value_0_0= ruleWildcardNameConcatenated ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:907:1: ( (lv_value_0_0= ruleWildcardNameConcatenated ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:907:1: ( (lv_value_0_0= ruleWildcardNameConcatenated ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:908:1: (lv_value_0_0= ruleWildcardNameConcatenated )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:908:1: (lv_value_0_0= ruleWildcardNameConcatenated )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:909:3: lv_value_0_0= ruleWildcardNameConcatenated
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getValueWildcardNameConcatenatedParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_ruleType1835);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:933:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:934:2: (iv_ruleName= ruleName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:935:2: iv_ruleName= ruleName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_ruleName_in_entryRuleName1870);
            iv_ruleName=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1880); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:942:1: ruleName returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:945:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:946:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:946:1: ( (lv_value_0_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:947:1: (lv_value_0_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:947:1: (lv_value_0_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:948:3: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName1921); if (state.failed) return current;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:972:1: entryRuleWildcardNameConcatenated returns [String current=null] : iv_ruleWildcardNameConcatenated= ruleWildcardNameConcatenated EOF ;
    public final String entryRuleWildcardNameConcatenated() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWildcardNameConcatenated = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:973:2: (iv_ruleWildcardNameConcatenated= ruleWildcardNameConcatenated EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:974:2: iv_ruleWildcardNameConcatenated= ruleWildcardNameConcatenated EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardNameConcatenatedRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNameConcatenated_in_entryRuleWildcardNameConcatenated1962);
            iv_ruleWildcardNameConcatenated=ruleWildcardNameConcatenated();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardNameConcatenated.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNameConcatenated1973); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:981:1: ruleWildcardNameConcatenated returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WildcardName_0= ruleWildcardName (kw= '.' this_WildcardName_2= ruleWildcardName )* ) ;
    public final AntlrDatatypeRuleToken ruleWildcardNameConcatenated() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_WildcardName_0 = null;

        AntlrDatatypeRuleToken this_WildcardName_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:984:28: ( (this_WildcardName_0= ruleWildcardName (kw= '.' this_WildcardName_2= ruleWildcardName )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:985:1: (this_WildcardName_0= ruleWildcardName (kw= '.' this_WildcardName_2= ruleWildcardName )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:985:1: (this_WildcardName_0= ruleWildcardName (kw= '.' this_WildcardName_2= ruleWildcardName )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:986:5: this_WildcardName_0= ruleWildcardName (kw= '.' this_WildcardName_2= ruleWildcardName )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWildcardNameConcatenatedAccess().getWildcardNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleWildcardName_in_ruleWildcardNameConcatenated2020);
            this_WildcardName_0=ruleWildcardName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_WildcardName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:996:1: (kw= '.' this_WildcardName_2= ruleWildcardName )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:997:2: kw= '.' this_WildcardName_2= ruleWildcardName
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleWildcardNameConcatenated2039); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getWildcardNameConcatenatedAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getWildcardNameConcatenatedAccess().getWildcardNameParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWildcardName_in_ruleWildcardNameConcatenated2061);
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
            	    break loop11;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:1021:1: entryRuleWildcardName returns [String current=null] : iv_ruleWildcardName= ruleWildcardName EOF ;
    public final String entryRuleWildcardName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWildcardName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:1022:2: (iv_ruleWildcardName= ruleWildcardName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:1023:2: iv_ruleWildcardName= ruleWildcardName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardNameRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardName_in_entryRuleWildcardName2109);
            iv_ruleWildcardName=ruleWildcardName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardName2120); if (state.failed) return current;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:1030:1: ruleWildcardName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '*' | kw= '?' )+ ;
    public final AntlrDatatypeRuleToken ruleWildcardName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:1033:28: ( (this_ID_0= RULE_ID | kw= '*' | kw= '?' )+ )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:1034:1: (this_ID_0= RULE_ID | kw= '*' | kw= '?' )+
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:1034:1: (this_ID_0= RULE_ID | kw= '*' | kw= '?' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=4;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:1034:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWildcardName2160); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getWildcardNameAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:1043:2: kw= '*'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleWildcardName2184); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getWildcardNameAccess().getAsteriskKeyword_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:1050:2: kw= '?'
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleWildcardName2203); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getWildcardNameAccess().getQuestionMarkKeyword_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA8_eotS =
        "\17\uffff";
    static final String DFA8_eofS =
        "\5\uffff\1\12\5\uffff\1\12\3\uffff";
    static final String DFA8_minS =
        "\11\4\1\24\1\uffff\1\4\3\uffff";
    static final String DFA8_maxS =
        "\11\31\1\26\1\uffff\1\31\3\uffff";
    static final String DFA8_acceptS =
        "\12\uffff\1\4\1\uffff\1\3\1\1\1\2";
    static final String DFA8_specialS =
        "\17\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\20\uffff\1\2\3\uffff\1\3",
            "\1\5\20\uffff\1\2\2\uffff\1\4\1\3",
            "\1\5\20\uffff\1\2\2\uffff\1\4\1\3",
            "\1\5\20\uffff\1\2\2\uffff\1\4\1\3",
            "\1\6\20\uffff\1\7\3\uffff\1\10",
            "\1\5\6\uffff\1\12\4\uffff\3\12\1\11\1\uffff\1\2\1\uffff\1"+
            "\12\1\4\1\3",
            "\1\13\20\uffff\1\7\2\uffff\1\4\1\10",
            "\1\13\20\uffff\1\7\2\uffff\1\4\1\10",
            "\1\13\20\uffff\1\7\2\uffff\1\4\1\10",
            "\1\14\1\15\1\16",
            "",
            "\1\13\6\uffff\1\12\4\uffff\3\12\1\11\1\uffff\1\7\1\uffff\1"+
            "\12\1\4\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "234:1: ( ( (lv_var_1_0= ruleVarAssignment ) ) | ( (lv_var_2_0= ruleVarInstanceCreation ) ) | ( (lv_var_3_0= ruleVarNullLiteral ) ) | ( (lv_var_4_0= ruleVarDeclaration ) ) )";
        }
    }
    static final String DFA12_eotS =
        "\15\uffff";
    static final String DFA12_eofS =
        "\1\1\1\uffff\1\6\3\uffff\1\12\2\uffff\1\13\1\uffff\1\14\1\uffff";
    static final String DFA12_minS =
        "\1\4\1\uffff\1\4\2\uffff\1\4\1\0\1\uffff\1\4\1\13\1\uffff\1\0\1"+
        "\uffff";
    static final String DFA12_maxS =
        "\1\31\1\uffff\1\31\2\uffff\1\31\1\0\1\uffff\1\31\1\27\1\uffff\1"+
        "\0\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\4\1\uffff\1\2\1\3\2\uffff\1\1\2\uffff\1\1\1\uffff\1"+
        "\1";
    static final String DFA12_specialS =
        "\15\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\7\uffff\1\1\10\uffff\1\3\2\uffff\1\1\1\4",
            "",
            "\1\7\6\uffff\1\1\1\5\7\1\1\uffff\1\7\1\uffff\1\1\2\7",
            "",
            "",
            "\1\10\11\uffff\1\11\6\uffff\1\1\3\uffff\1\1",
            "\1\uffff",
            "",
            "\1\1\11\uffff\1\7\6\uffff\1\1\2\uffff\2\1",
            "\1\7\3\uffff\1\1\3\7\4\uffff\1\7",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1034:1: (this_ID_0= RULE_ID | kw= '*' | kw= '?' )+";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel141 = new BitSet(new long[]{0x0000000002200010L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleModel162 = new BitSet(new long[]{0x0000000000009802L});
    public static final BitSet FOLLOW_12_in_ruleModel177 = new BitSet(new long[]{0x0000000002204010L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_ruleModel199 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleModel212 = new BitSet(new long[]{0x0000000002200010L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_ruleModel233 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleModel249 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleModel264 = new BitSet(new long[]{0x0000000000870800L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModel285 = new BitSet(new long[]{0x0000000000870800L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleModel307 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModel320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatement406 = new BitSet(new long[]{0x0000000002200010L});
    public static final BitSet FOLLOW_ruleVarAssignment_in_ruleStatement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInstanceCreation_in_ruleStatement455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarNullLiteral_in_ruleStatement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleStatement509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStatement530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethodCall_in_ruleStatement555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStatement574 = new BitSet(new long[]{0x0000000002200010L});
    public static final BitSet FOLLOW_ruleStaticMethodCall_in_ruleStatement599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationParam_in_entryRuleVarDeclarationParam635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclarationParam645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDeclarationParam691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDeclarationParam708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarNullLiteral_in_entryRuleVarNullLiteral749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarNullLiteral759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarNullLiteral805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarNullLiteral822 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVarNullLiteral839 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVarNullLiteral851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarAssignment_in_entryRuleVarAssignment887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarAssignment897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarAssignment943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarAssignment960 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVarAssignment977 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVarAssignment989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInstanceCreation_in_entryRuleVarInstanceCreation1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInstanceCreation1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarInstanceCreation1081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarInstanceCreation1098 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVarInstanceCreation1115 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleVarInstanceCreation1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration1163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDeclaration1219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDeclaration1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement1277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReturnStatement1324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReturnStatement1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleMethodCall1438 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMethodCall1450 = new BitSet(new long[]{0x0000000002200010L});
    public static final BitSet FOLLOW_ruleCalledMethodName_in_ruleMethodCall1471 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMethodCall1483 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleName_in_ruleMethodCall1504 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethodCall1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodCall_in_entryRuleStaticMethodCall1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticMethodCall1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_ruleStaticMethodCall1609 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStaticMethodCall1621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleName_in_ruleStaticMethodCall1642 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStaticMethodCall1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalledMethodName_in_entryRuleCalledMethodName1690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalledMethodName1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_ruleCalledMethodName1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_ruleType1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNameConcatenated_in_entryRuleWildcardNameConcatenated1962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNameConcatenated1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_ruleWildcardNameConcatenated2020 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleWildcardNameConcatenated2039 = new BitSet(new long[]{0x0000000002200010L});
    public static final BitSet FOLLOW_ruleWildcardName_in_ruleWildcardNameConcatenated2061 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleWildcardName_in_entryRuleWildcardName2109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardName2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWildcardName2160 = new BitSet(new long[]{0x0000000002200012L});
    public static final BitSet FOLLOW_21_in_ruleWildcardName2184 = new BitSet(new long[]{0x0000000002200012L});
    public static final BitSet FOLLOW_25_in_ruleWildcardName2203 = new BitSet(new long[]{0x0000000002200012L});

}