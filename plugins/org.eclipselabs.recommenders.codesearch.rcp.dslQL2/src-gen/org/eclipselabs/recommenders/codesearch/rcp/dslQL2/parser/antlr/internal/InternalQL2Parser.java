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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "','", "')'", "'{'", "'}'", "'='", "'*'", "'.'", "'()'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int RULE_NAMEWITHWC=4;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:76:1: ruleModel returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )? otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}' ) ;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:79:28: ( ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )? otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:80:1: ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )? otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:80:1: ( () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )? otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:80:2: () (otherlv_1= '(' ( (lv_vars_2_0= ruleVarDeclaration ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVarDeclaration ) ) )* otherlv_5= ')' )? otherlv_6= '{' ( (lv_statements_7_0= ruleStatement ) )* otherlv_8= '}'
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleModel215); 

                	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:138:1: ( (lv_statements_7_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_NAMEWITHWC) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:139:1: (lv_statements_7_0= ruleStatement )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:139:1: (lv_statements_7_0= ruleStatement )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:140:3: lv_statements_7_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleModel236);
            	    lv_statements_7_0=ruleStatement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleModel249); 

                	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:168:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:169:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:170:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement285);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement295); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:177:1: ruleStatement returns [EObject current=null] : (this_VarDef_0= ruleVarDef | this_MethodCall_1= ruleMethodCall ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VarDef_0 = null;

        EObject this_MethodCall_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:180:28: ( (this_VarDef_0= ruleVarDef | this_MethodCall_1= ruleMethodCall ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:181:1: (this_VarDef_0= ruleVarDef | this_MethodCall_1= ruleMethodCall )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:181:1: (this_VarDef_0= ruleVarDef | this_MethodCall_1= ruleMethodCall )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NAMEWITHWC) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==19) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_NAMEWITHWC) ) {
                    alt4=1;
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:182:5: this_VarDef_0= ruleVarDef
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getVarDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVarDef_in_ruleStatement342);
                    this_VarDef_0=ruleVarDef();

                    state._fsp--;

                     
                            current = this_VarDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:192:5: this_MethodCall_1= ruleMethodCall
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMethodCall_in_ruleStatement369);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:208:1: entryRuleVarDef returns [EObject current=null] : iv_ruleVarDef= ruleVarDef EOF ;
    public final EObject entryRuleVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDef = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:209:2: (iv_ruleVarDef= ruleVarDef EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:210:2: iv_ruleVarDef= ruleVarDef EOF
            {
             newCompositeNode(grammarAccess.getVarDefRule()); 
            pushFollow(FOLLOW_ruleVarDef_in_entryRuleVarDef404);
            iv_ruleVarDef=ruleVarDef();

            state._fsp--;

             current =iv_ruleVarDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDef414); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:217:1: ruleVarDef returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVarInitialisation ) ) | ( (lv_vars_1_0= ruleVarDeclaration ) ) ) ;
    public final EObject ruleVarDef() throws RecognitionException {
        EObject current = null;

        EObject lv_vars_0_0 = null;

        EObject lv_vars_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:220:28: ( ( ( (lv_vars_0_0= ruleVarInitialisation ) ) | ( (lv_vars_1_0= ruleVarDeclaration ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:221:1: ( ( (lv_vars_0_0= ruleVarInitialisation ) ) | ( (lv_vars_1_0= ruleVarDeclaration ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:221:1: ( ( (lv_vars_0_0= ruleVarInitialisation ) ) | ( (lv_vars_1_0= ruleVarDeclaration ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NAMEWITHWC) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_NAMEWITHWC) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==EOF||LA5_2==RULE_NAMEWITHWC||LA5_2==16) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==17) ) {
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:221:2: ( (lv_vars_0_0= ruleVarInitialisation ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:221:2: ( (lv_vars_0_0= ruleVarInitialisation ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:222:1: (lv_vars_0_0= ruleVarInitialisation )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:222:1: (lv_vars_0_0= ruleVarInitialisation )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:223:3: lv_vars_0_0= ruleVarInitialisation
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarDefAccess().getVarsVarInitialisationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarInitialisation_in_ruleVarDef460);
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:240:6: ( (lv_vars_1_0= ruleVarDeclaration ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:240:6: ( (lv_vars_1_0= ruleVarDeclaration ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:241:1: (lv_vars_1_0= ruleVarDeclaration )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:241:1: (lv_vars_1_0= ruleVarDeclaration )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:242:3: lv_vars_1_0= ruleVarDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarDefAccess().getVarsVarDeclarationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleVarDef487);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:266:1: entryRuleVarInitialisation returns [EObject current=null] : iv_ruleVarInitialisation= ruleVarInitialisation EOF ;
    public final EObject entryRuleVarInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInitialisation = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:267:2: (iv_ruleVarInitialisation= ruleVarInitialisation EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:268:2: iv_ruleVarInitialisation= ruleVarInitialisation EOF
            {
             newCompositeNode(grammarAccess.getVarInitialisationRule()); 
            pushFollow(FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation523);
            iv_ruleVarInitialisation=ruleVarInitialisation();

            state._fsp--;

             current =iv_ruleVarInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarInitialisation533); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:275:1: ruleVarInitialisation returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) otherlv_2= '=' otherlv_3= '*' ) ;
    public final EObject ruleVarInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:278:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) otherlv_2= '=' otherlv_3= '*' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:279:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) otherlv_2= '=' otherlv_3= '*' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:279:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) otherlv_2= '=' otherlv_3= '*' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:279:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) otherlv_2= '=' otherlv_3= '*'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:279:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:280:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:280:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:281:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVarInitialisation579);
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:297:2: ( (lv_name_1_0= ruleVarName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:298:1: (lv_name_1_0= ruleVarName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:298:1: (lv_name_1_0= ruleVarName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:299:3: lv_name_1_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getVarInitialisationAccess().getNameVarNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleVarInitialisation600);
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleVarInitialisation612); 

                	newLeafNode(otherlv_2, grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleVarInitialisation624); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:331:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:332:2: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:333:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration660);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration670); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:340:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:343:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:344:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:344:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:344:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleVarName ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:344:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:345:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:345:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:346:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVarDeclaration716);
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:362:2: ( (lv_name_1_0= ruleVarName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:363:1: (lv_name_1_0= ruleVarName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:363:1: (lv_name_1_0= ruleVarName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:364:3: lv_name_1_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getNameVarNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleVarDeclaration737);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:388:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:389:2: (iv_ruleMethodCall= ruleMethodCall EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:390:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
             newCompositeNode(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_ruleMethodCall_in_entryRuleMethodCall773);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;

             current =iv_ruleMethodCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCall783); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:397:1: ruleMethodCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleVarName ) ) otherlv_1= '.' ( (lv_method_2_0= RULE_NAMEWITHWC ) ) otherlv_3= '()' ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_method_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:400:28: ( ( ( (lv_name_0_0= ruleVarName ) ) otherlv_1= '.' ( (lv_method_2_0= RULE_NAMEWITHWC ) ) otherlv_3= '()' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:401:1: ( ( (lv_name_0_0= ruleVarName ) ) otherlv_1= '.' ( (lv_method_2_0= RULE_NAMEWITHWC ) ) otherlv_3= '()' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:401:1: ( ( (lv_name_0_0= ruleVarName ) ) otherlv_1= '.' ( (lv_method_2_0= RULE_NAMEWITHWC ) ) otherlv_3= '()' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:401:2: ( (lv_name_0_0= ruleVarName ) ) otherlv_1= '.' ( (lv_method_2_0= RULE_NAMEWITHWC ) ) otherlv_3= '()'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:401:2: ( (lv_name_0_0= ruleVarName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:402:1: (lv_name_0_0= ruleVarName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:402:1: (lv_name_0_0= ruleVarName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:403:3: lv_name_0_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getMethodCallAccess().getNameVarNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleMethodCall829);
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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleMethodCall841); 

                	newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getFullStopKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:423:1: ( (lv_method_2_0= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:424:1: (lv_method_2_0= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:424:1: (lv_method_2_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:425:3: lv_method_2_0= RULE_NAMEWITHWC
            {
            lv_method_2_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethodCall858); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMethodCall875); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:453:1: entryRuleVarName returns [String current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final String entryRuleVarName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:454:2: (iv_ruleVarName= ruleVarName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:455:2: iv_ruleVarName= ruleVarName EOF
            {
             newCompositeNode(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_ruleVarName_in_entryRuleVarName912);
            iv_ruleVarName=ruleVarName();

            state._fsp--;

             current =iv_ruleVarName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarName923); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:462:1: ruleVarName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleVarName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:465:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:466:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleVarName962); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:481:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:482:2: (iv_ruleType= ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:483:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1007);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1018); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:490:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:493:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL2/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL2/parser/antlr/internal/InternalQL2.g:494:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleType1057); 

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
    public static final BitSet FOLLOW_14_in_ruleModel201 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModel215 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModel236 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleModel249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDef_in_ruleStatement342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_ruleStatement369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDef_in_entryRuleVarDef404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDef414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_ruleVarDef460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleVarDef487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarInitialisation_in_entryRuleVarInitialisation523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarInitialisation533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarInitialisation579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleVarInitialisation600 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVarInitialisation612 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVarInitialisation624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDeclaration716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleVarDeclaration737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCall_in_entryRuleMethodCall773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCall783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleMethodCall829 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMethodCall841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethodCall858 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMethodCall875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarName_in_entryRuleVarName912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarName923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleVarName962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleType1057 = new BitSet(new long[]{0x0000000000000002L});

}