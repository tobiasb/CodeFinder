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

@SuppressWarnings("all")
public class InternalQL2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "','", "')'", "'='", "'*'", "'.'", "'()'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_NAMEWITHWC=4;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:76:1: ruleModel returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )? ( (lv_statements_6_0= ruleStatement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_vars_2_0 = null;

        EObject lv_vars_4_0 = null;

        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:79:28: ( ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )? ( (lv_statements_6_0= ruleStatement ) )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:80:1: ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )? ( (lv_statements_6_0= ruleStatement ) )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:80:1: ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )? ( (lv_statements_6_0= ruleStatement ) )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:80:2: () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )? ( (lv_statements_6_0= ruleStatement ) )*
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:80:2: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:86:2: (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:86:4: otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModel132); 

                        	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:90:1: ( (lv_vars_2_0= ruleVarDeclaration ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:91:1: (lv_vars_2_0= ruleVarDeclaration )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:91:1: (lv_vars_2_0= ruleVarDeclaration )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:92:3: lv_vars_2_0= ruleVarDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleModel153);
                    lv_vars_2_0=ruleVarDeclaration();

                    state._fsp--;


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

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:108:2: (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:108:4: otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleModel166); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:112:1: ( (lv_vars_4_0= ruleVarDeclaration ) )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:113:1: (lv_vars_4_0= ruleVarDeclaration )
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:113:1: (lv_vars_4_0= ruleVarDeclaration )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:114:3: lv_vars_4_0= ruleVarDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleModel187);
                    	    lv_vars_4_0=ruleVarDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"vars",
                    	            		lv_vars_4_0, 
                    	            		"VarDeclaration");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleModel201); 

                        	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightParenthesisKeyword_1_3());
                        

                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:134:3: ( (lv_statements_6_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_NAMEWITHWC) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:135:1: (lv_statements_6_0= ruleStatement )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:135:1: (lv_statements_6_0= ruleStatement )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:136:3: lv_statements_6_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleModel224);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_6_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:160:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:161:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:162:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement261);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement271); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:169:1: ruleStatement returns [EObject current=null] : (this_VarDef_0= ruleVarDef | this_MethodCall_1= ruleMethodCall ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VarDef_0 = null;

        EObject this_MethodCall_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:172:28: ( (this_VarDef_0= ruleVarDef | this_MethodCall_1= ruleMethodCall ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:173:1: (this_VarDef_0= ruleVarDef | this_MethodCall_1= ruleMethodCall )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:173:1: (this_VarDef_0= ruleVarDef | this_MethodCall_1= ruleMethodCall )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NAMEWITHWC) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_NAMEWITHWC) ) {
                    alt4=1;
                }
                else if ( (LA4_1==17) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:174:5: this_VarDef_0= ruleVarDef
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getVarDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVarDef_in_ruleStatement318);
                    this_VarDef_0=ruleVarDef();

                    state._fsp--;

                     
                            current = this_VarDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:184:5: this_MethodCall_1= ruleMethodCall
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMethodCall_in_ruleStatement345);
                    this_MethodCall_1=ruleMethodCall();

                    state._fsp--;

                     
                            current = this_MethodCall_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVarDef"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:200:1: entryRuleVarDef returns [EObject current=null] : iv_ruleVarDef= ruleVarDef EOF ;
    public final EObject entryRuleVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDef = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:201:2: (iv_ruleVarDef= ruleVarDef EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:202:2: iv_ruleVarDef= ruleVarDef EOF
            {
             newCompositeNode(grammarAccess.getVarDefRule()); 
            pushFollow(FOLLOW_ruleVarDef_in_entryRuleVarDef380);
            iv_ruleVarDef=ruleVarDef();

            state._fsp--;

             current =iv_ruleVarDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDef390); 

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
    // $ANTLR end "entryRuleVarDef"


    // $ANTLR start "ruleVarDef"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:209:1: ruleVarDef returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVarInitialisation ) ) | ( (lv_vars_1_0= ruleVarDeclaration ) ) ) ;
    public final EObject ruleVarDef() throws RecognitionException {
        EObject current = null;

        EObject lv_vars_0_0 = null;

        EObject lv_vars_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:212:28: ( ( ( (lv_vars_0_0= ruleVarInitialisation ) ) | ( (lv_vars_1_0= ruleVarDeclaration ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:213:1: ( ( (lv_vars_0_0= ruleVarInitialisation ) ) | ( (lv_vars_1_0= ruleVarDeclaration ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:213:1: ( ( (lv_vars_0_0= ruleVarInitialisation ) ) | ( (lv_vars_1_0= ruleVarDeclaration ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NAMEWITHWC) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_NAMEWITHWC) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==EOF||LA5_2==RULE_NAMEWITHWC) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==15) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:213:2: ( (lv_vars_0_0= ruleVarInitialisation ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:213:2: ( (lv_vars_0_0= ruleVarInitialisation ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:214:1: (lv_vars_0_0= ruleVarInitialisation )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:214:1: (lv_vars_0_0= ruleVarInitialisation )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:215:3: lv_vars_0_0= ruleVarInitialisation
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarDefAccess().getVarsVarInitialisationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarInitialisation_in_ruleVarDef436);
                    lv_vars_0_0=ruleVarInitialisation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarDefRule());
                    	        }
                           		add(
                           			current, 
                           			"vars",
                            		lv_vars_0_0, 
                            		"VarInitialisation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:232:6: ( (lv_vars_1_0= ruleVarDeclaration ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:232:6: ( (lv_vars_1_0= ruleVarDeclaration ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:233:1: (lv_vars_1_0= ruleVarDeclaration )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:233:1: (lv_vars_1_0= ruleVarDeclaration )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:234:3: lv_vars_1_0= ruleVarDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarDefAccess().getVarsVarDeclarationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleVarDef463);
                    lv_vars_1_0=ruleVarDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarDefRule());
                    	        }
                           		add(
                           			current, 
                           			"vars",
                            		lv_vars_1_0, 
                            		"VarDeclaration");
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
    // $ANTLR end "ruleVarDef"


    // $ANTLR start "entryRuleVarInitialisation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:258:1: entryRuleVarInitialisation returns [EObject current=null] : iv_ruleVarInitialisation= ruleVarInitialisation EOF ;
    public final EObject entryRuleVarInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInitialisation = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:259:2: (iv_ruleVarInitialisation= ruleVarInitialisation EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:260:2: iv_ruleVarInitialisation= ruleVarInitialisation EOF
            {
             newCompositeNode(grammarAccess.getVarInitialisationRule()); 
            pushFollow(FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation499);
            iv_ruleVarInitialisation=ruleVarInitialisation();

            state._fsp--;

             current =iv_ruleVarInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInitialisation509); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:267:1: ruleVarInitialisation returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) otherlv_2= '=' otherlv_3= '*' ) ;
    public final EObject ruleVarInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:270:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) otherlv_2= '=' otherlv_3= '*' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:271:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) otherlv_2= '=' otherlv_3= '*' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:271:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) otherlv_2= '=' otherlv_3= '*' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:271:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) otherlv_2= '=' otherlv_3= '*'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:271:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:272:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:272:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:273:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVarInitialisation555);
            lv_type_0_0=ruleType();

            state._fsp--;


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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:289:2: ( (lv_name_1_0= ruleVarName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:290:1: (lv_name_1_0= ruleVarName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:290:1: (lv_name_1_0= ruleVarName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:291:3: lv_name_1_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getVarInitialisationAccess().getNameVarNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleVarInitialisation576);
            lv_name_1_0=ruleVarName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVarInitialisationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"VarName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleVarInitialisation588); 

                	newLeafNode(otherlv_2, grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleVarInitialisation600); 

                	newLeafNode(otherlv_3, grammarAccess.getVarInitialisationAccess().getAsteriskKeyword_3());
                

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
    // $ANTLR end "ruleVarInitialisation"


    // $ANTLR start "entryRuleVarDeclaration"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:323:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:324:2: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:325:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration636);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration646); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:332:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:335:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:336:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:336:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:336:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:336:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:337:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:337:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:338:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVarDeclaration692);
            lv_type_0_0=ruleType();

            state._fsp--;


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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:354:2: ( (lv_name_1_0= ruleVarName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:355:1: (lv_name_1_0= ruleVarName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:355:1: (lv_name_1_0= ruleVarName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:356:3: lv_name_1_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getNameVarNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleVarDeclaration713);
            lv_name_1_0=ruleVarName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"VarName");
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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleMethodCall"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:380:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:381:2: (iv_ruleMethodCall= ruleMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:382:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
             newCompositeNode(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_ruleMethodCall_in_entryRuleMethodCall749);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;

             current =iv_ruleMethodCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCall759); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:389:1: ruleMethodCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleVarName ) ) otherlv_1= '.' ( (lv_method_2_0= RULE_NAMEWITHWC ) ) otherlv_3= '()' ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_method_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:392:28: ( ( ( (lv_name_0_0= ruleVarName ) ) otherlv_1= '.' ( (lv_method_2_0= RULE_NAMEWITHWC ) ) otherlv_3= '()' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:393:1: ( ( (lv_name_0_0= ruleVarName ) ) otherlv_1= '.' ( (lv_method_2_0= RULE_NAMEWITHWC ) ) otherlv_3= '()' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:393:1: ( ( (lv_name_0_0= ruleVarName ) ) otherlv_1= '.' ( (lv_method_2_0= RULE_NAMEWITHWC ) ) otherlv_3= '()' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:393:2: ( (lv_name_0_0= ruleVarName ) ) otherlv_1= '.' ( (lv_method_2_0= RULE_NAMEWITHWC ) ) otherlv_3= '()'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:393:2: ( (lv_name_0_0= ruleVarName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:394:1: (lv_name_0_0= ruleVarName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:394:1: (lv_name_0_0= ruleVarName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:395:3: lv_name_0_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getMethodCallAccess().getNameVarNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleMethodCall805);
            lv_name_0_0=ruleVarName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodCallRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"VarName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMethodCall817); 

                	newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getFullStopKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:415:1: ( (lv_method_2_0= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:416:1: (lv_method_2_0= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:416:1: (lv_method_2_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:417:3: lv_method_2_0= RULE_NAMEWITHWC
            {
            lv_method_2_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethodCall834); 

            			newLeafNode(lv_method_2_0, grammarAccess.getMethodCallAccess().getMethodNameWithWCTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodCallRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"method",
                    		lv_method_2_0, 
                    		"NameWithWC");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleMethodCall851); 

                	newLeafNode(otherlv_3, grammarAccess.getMethodCallAccess().getLeftParenthesisRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleVarName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:445:1: entryRuleVarName returns [String current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final String entryRuleVarName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:446:2: (iv_ruleVarName= ruleVarName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:447:2: iv_ruleVarName= ruleVarName EOF
            {
             newCompositeNode(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_ruleVarName_in_entryRuleVarName888);
            iv_ruleVarName=ruleVarName();

            state._fsp--;

             current =iv_ruleVarName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarName899); 

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
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:454:1: ruleVarName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleVarName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:457:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:458:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleVarName938); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getVarNameAccess().getNameWithWCTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:473:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:474:2: (iv_ruleType= ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:475:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType983);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType994); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:482:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:485:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:486:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleType1033); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getTypeAccess().getNameWithWCTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleModel153 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleModel166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleModel187 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleModel201 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModel224 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDef_in_ruleStatement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_ruleStatement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDef_in_entryRuleVarDef380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDef390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_ruleVarDef436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleVarDef463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInitialisation509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarInitialisation555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleVarInitialisation576 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVarInitialisation588 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVarInitialisation600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDeclaration692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleVarDeclaration713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleMethodCall805 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMethodCall817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethodCall834 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMethodCall851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarName_in_entryRuleVarName888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarName899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleVarName938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleType1033 = new BitSet(new long[]{0x0000000000000002L});

}