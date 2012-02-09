package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.parser.antlr.internal; 

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
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.services.QL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQL1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'where'", "'Containing'", "'('", "')'", "'and'", "'or'", "'Methods'", "'Types'", "'is'", "'has'", "','", "'IsStatic'", "'IsPrivate'", "'IsPublic'", "'IsFinal'", "'IsAbstract'", "'IsProtected'", "'Name'", "'CalledMethods'", "'!'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NAMEWITHWC=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
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


        public InternalQL1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQL1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQL1Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g"; }



     	private QL1GrammarAccess grammarAccess;
     	
        public InternalQL1Parser(TokenStream input, QL1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "First";	
       	}
       	
       	@Override
       	protected QL1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFirst"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:68:1: entryRuleFirst returns [EObject current=null] : iv_ruleFirst= ruleFirst EOF ;
    public final EObject entryRuleFirst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirst = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:69:2: (iv_ruleFirst= ruleFirst EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:70:2: iv_ruleFirst= ruleFirst EOF
            {
             newCompositeNode(grammarAccess.getFirstRule()); 
            pushFollow(FOLLOW_ruleFirst_in_entryRuleFirst75);
            iv_ruleFirst=ruleFirst();

            state._fsp--;

             current =iv_ruleFirst; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFirst85); 

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
    // $ANTLR end "entryRuleFirst"


    // $ANTLR start "ruleFirst"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:77:1: ruleFirst returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_e_2_0= ruleOrExpr ) ) (otherlv_3= 'Containing' otherlv_4= '(' ( (lv_c_5_0= ruleContains ) ) otherlv_6= ')' (otherlv_7= 'and' otherlv_8= '(' ( (lv_c_9_0= ruleContains ) ) otherlv_10= ')' )* )? ) ;
    public final EObject ruleFirst() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_type_0_0 = null;

        EObject lv_e_2_0 = null;

        EObject lv_c_5_0 = null;

        EObject lv_c_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:28: ( ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_e_2_0= ruleOrExpr ) ) (otherlv_3= 'Containing' otherlv_4= '(' ( (lv_c_5_0= ruleContains ) ) otherlv_6= ')' (otherlv_7= 'and' otherlv_8= '(' ( (lv_c_9_0= ruleContains ) ) otherlv_10= ')' )* )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:81:1: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_e_2_0= ruleOrExpr ) ) (otherlv_3= 'Containing' otherlv_4= '(' ( (lv_c_5_0= ruleContains ) ) otherlv_6= ')' (otherlv_7= 'and' otherlv_8= '(' ( (lv_c_9_0= ruleContains ) ) otherlv_10= ')' )* )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:81:1: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_e_2_0= ruleOrExpr ) ) (otherlv_3= 'Containing' otherlv_4= '(' ( (lv_c_5_0= ruleContains ) ) otherlv_6= ')' (otherlv_7= 'and' otherlv_8= '(' ( (lv_c_9_0= ruleContains ) ) otherlv_10= ')' )* )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:81:2: ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_e_2_0= ruleOrExpr ) ) (otherlv_3= 'Containing' otherlv_4= '(' ( (lv_c_5_0= ruleContains ) ) otherlv_6= ')' (otherlv_7= 'and' otherlv_8= '(' ( (lv_c_9_0= ruleContains ) ) otherlv_10= ')' )* )?
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:81:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:82:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:82:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:83:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFirstAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFirst131);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFirstRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleFirst143); 

                	newLeafNode(otherlv_1, grammarAccess.getFirstAccess().getWhereKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:103:1: ( (lv_e_2_0= ruleOrExpr ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:104:1: (lv_e_2_0= ruleOrExpr )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:104:1: (lv_e_2_0= ruleOrExpr )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:105:3: lv_e_2_0= ruleOrExpr
            {
             
            	        newCompositeNode(grammarAccess.getFirstAccess().getEOrExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpr_in_ruleFirst164);
            lv_e_2_0=ruleOrExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFirstRule());
            	        }
                   		set(
                   			current, 
                   			"e",
                    		lv_e_2_0, 
                    		"OrExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:121:2: (otherlv_3= 'Containing' otherlv_4= '(' ( (lv_c_5_0= ruleContains ) ) otherlv_6= ')' (otherlv_7= 'and' otherlv_8= '(' ( (lv_c_9_0= ruleContains ) ) otherlv_10= ')' )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:121:4: otherlv_3= 'Containing' otherlv_4= '(' ( (lv_c_5_0= ruleContains ) ) otherlv_6= ')' (otherlv_7= 'and' otherlv_8= '(' ( (lv_c_9_0= ruleContains ) ) otherlv_10= ')' )*
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFirst177); 

                        	newLeafNode(otherlv_3, grammarAccess.getFirstAccess().getContainingKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleFirst189); 

                        	newLeafNode(otherlv_4, grammarAccess.getFirstAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:129:1: ( (lv_c_5_0= ruleContains ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:130:1: (lv_c_5_0= ruleContains )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:130:1: (lv_c_5_0= ruleContains )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:131:3: lv_c_5_0= ruleContains
                    {
                     
                    	        newCompositeNode(grammarAccess.getFirstAccess().getCContainsParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContains_in_ruleFirst210);
                    lv_c_5_0=ruleContains();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFirstRule());
                    	        }
                           		add(
                           			current, 
                           			"c",
                            		lv_c_5_0, 
                            		"Contains");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleFirst222); 

                        	newLeafNode(otherlv_6, grammarAccess.getFirstAccess().getRightParenthesisKeyword_3_3());
                        
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:151:1: (otherlv_7= 'and' otherlv_8= '(' ( (lv_c_9_0= ruleContains ) ) otherlv_10= ')' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:151:3: otherlv_7= 'and' otherlv_8= '(' ( (lv_c_9_0= ruleContains ) ) otherlv_10= ')'
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleFirst235); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getFirstAccess().getAndKeyword_3_4_0());
                    	        
                    	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleFirst247); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getFirstAccess().getLeftParenthesisKeyword_3_4_1());
                    	        
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:159:1: ( (lv_c_9_0= ruleContains ) )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:160:1: (lv_c_9_0= ruleContains )
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:160:1: (lv_c_9_0= ruleContains )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:161:3: lv_c_9_0= ruleContains
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFirstAccess().getCContainsParserRuleCall_3_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleContains_in_ruleFirst268);
                    	    lv_c_9_0=ruleContains();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFirstRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"c",
                    	            		lv_c_9_0, 
                    	            		"Contains");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleFirst280); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getFirstAccess().getRightParenthesisKeyword_3_4_3());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


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
    // $ANTLR end "ruleFirst"


    // $ANTLR start "entryRuleContains"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:189:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:190:2: (iv_ruleContains= ruleContains EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:191:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_ruleContains_in_entryRuleContains320);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContains330); 

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
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:198:1: ruleContains returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_e_2_0= ruleOrExpr ) ) ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_e_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:201:28: ( ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_e_2_0= ruleOrExpr ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:202:1: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_e_2_0= ruleOrExpr ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:202:1: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_e_2_0= ruleOrExpr ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:202:2: ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_e_2_0= ruleOrExpr ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:202:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:203:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:203:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:204:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getContainsAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleContains376);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainsRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleContains388); 

                	newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getWhereKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:224:1: ( (lv_e_2_0= ruleOrExpr ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:225:1: (lv_e_2_0= ruleOrExpr )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:225:1: (lv_e_2_0= ruleOrExpr )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:226:3: lv_e_2_0= ruleOrExpr
            {
             
            	        newCompositeNode(grammarAccess.getContainsAccess().getEOrExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpr_in_ruleContains409);
            lv_e_2_0=ruleOrExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainsRule());
            	        }
                   		set(
                   			current, 
                   			"e",
                    		lv_e_2_0, 
                    		"OrExpr");
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
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleOrExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:250:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:251:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:252:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr445);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr455); 

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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:259:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:262:28: ( (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:263:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:263:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:264:5: this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr502);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;

             
                    current = this_AndExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:272:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:272:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:272:2: ()
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:273:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleOrExpr523); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getOrKeyword_1_1());
            	        
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:282:1: ( (lv_right_3_0= ruleAndExpr ) )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:283:1: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:283:1: (lv_right_3_0= ruleAndExpr )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:284:3: lv_right_3_0= ruleAndExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr544);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AndExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:308:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:309:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:310:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr582);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr592); 

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:317:1: ruleAndExpr returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:320:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:321:1: (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:321:1: (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:322:5: this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExprAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleAndExpr639);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:330:1: ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:330:2: () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:330:2: ()
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:331:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExprAccess().getMultiplicationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAndExpr660); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getAndKeyword_1_1());
            	        
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:340:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:341:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:341:1: (lv_right_3_0= rulePrimary )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:342:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExprAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleAndExpr681);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRulePrimary"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:366:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:367:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:368:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary719);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary729); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:375:1: rulePrimary returns [EObject current=null] : (this_FieldExpr_0= ruleFieldExpr | (otherlv_1= '(' this_OrExpr_2= ruleOrExpr otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_FieldExpr_0 = null;

        EObject this_OrExpr_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:378:28: ( (this_FieldExpr_0= ruleFieldExpr | (otherlv_1= '(' this_OrExpr_2= ruleOrExpr otherlv_3= ')' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:379:1: (this_FieldExpr_0= ruleFieldExpr | (otherlv_1= '(' this_OrExpr_2= ruleOrExpr otherlv_3= ')' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:379:1: (this_FieldExpr_0= ruleFieldExpr | (otherlv_1= '(' this_OrExpr_2= ruleOrExpr otherlv_3= ')' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=23 && LA5_0<=31)) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:380:5: this_FieldExpr_0= ruleFieldExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getFieldExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFieldExpr_in_rulePrimary776);
                    this_FieldExpr_0=ruleFieldExpr();

                    state._fsp--;

                     
                            current = this_FieldExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:389:6: (otherlv_1= '(' this_OrExpr_2= ruleOrExpr otherlv_3= ')' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:389:6: (otherlv_1= '(' this_OrExpr_2= ruleOrExpr otherlv_3= ')' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:389:8: otherlv_1= '(' this_OrExpr_2= ruleOrExpr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePrimary794); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getOrExprParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleOrExpr_in_rulePrimary816);
                    this_OrExpr_2=ruleOrExpr();

                    state._fsp--;

                     
                            current = this_OrExpr_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePrimary827); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                        

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleFieldExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:414:1: entryRuleFieldExpr returns [EObject current=null] : iv_ruleFieldExpr= ruleFieldExpr EOF ;
    public final EObject entryRuleFieldExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldExpr = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:415:2: (iv_ruleFieldExpr= ruleFieldExpr EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:416:2: iv_ruleFieldExpr= ruleFieldExpr EOF
            {
             newCompositeNode(grammarAccess.getFieldExprRule()); 
            pushFollow(FOLLOW_ruleFieldExpr_in_entryRuleFieldExpr864);
            iv_ruleFieldExpr=ruleFieldExpr();

            state._fsp--;

             current =iv_ruleFieldExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldExpr874); 

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
    // $ANTLR end "entryRuleFieldExpr"


    // $ANTLR start "ruleFieldExpr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:423:1: ruleFieldExpr returns [EObject current=null] : (this_SingleValueField_0= ruleSingleValueField | this_MultiValueField_1= ruleMultiValueField | this_BooleanField_2= ruleBooleanField ) ;
    public final EObject ruleFieldExpr() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValueField_0 = null;

        EObject this_MultiValueField_1 = null;

        EObject this_BooleanField_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:426:28: ( (this_SingleValueField_0= ruleSingleValueField | this_MultiValueField_1= ruleMultiValueField | this_BooleanField_2= ruleBooleanField ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:427:1: (this_SingleValueField_0= ruleSingleValueField | this_MultiValueField_1= ruleMultiValueField | this_BooleanField_2= ruleBooleanField )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:427:1: (this_SingleValueField_0= ruleSingleValueField | this_MultiValueField_1= ruleMultiValueField | this_BooleanField_2= ruleBooleanField )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 31:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:428:5: this_SingleValueField_0= ruleSingleValueField
                    {
                     
                            newCompositeNode(grammarAccess.getFieldExprAccess().getSingleValueFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleValueField_in_ruleFieldExpr921);
                    this_SingleValueField_0=ruleSingleValueField();

                    state._fsp--;

                     
                            current = this_SingleValueField_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:438:5: this_MultiValueField_1= ruleMultiValueField
                    {
                     
                            newCompositeNode(grammarAccess.getFieldExprAccess().getMultiValueFieldParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMultiValueField_in_ruleFieldExpr948);
                    this_MultiValueField_1=ruleMultiValueField();

                    state._fsp--;

                     
                            current = this_MultiValueField_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:448:5: this_BooleanField_2= ruleBooleanField
                    {
                     
                            newCompositeNode(grammarAccess.getFieldExprAccess().getBooleanFieldParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanField_in_ruleFieldExpr975);
                    this_BooleanField_2=ruleBooleanField();

                    state._fsp--;

                     
                            current = this_BooleanField_2; 
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
    // $ANTLR end "ruleFieldExpr"


    // $ANTLR start "entryRuleType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:464:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:465:2: (iv_ruleType= ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:466:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1010);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1020); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:473:1: ruleType returns [EObject current=null] : ( ( (lv_value_0_0= 'Methods' ) ) | ( (lv_method_1_0= 'Types' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_method_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:476:28: ( ( ( (lv_value_0_0= 'Methods' ) ) | ( (lv_method_1_0= 'Types' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:477:1: ( ( (lv_value_0_0= 'Methods' ) ) | ( (lv_method_1_0= 'Types' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:477:1: ( ( (lv_value_0_0= 'Methods' ) ) | ( (lv_method_1_0= 'Types' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:477:2: ( (lv_value_0_0= 'Methods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:477:2: ( (lv_value_0_0= 'Methods' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:478:1: (lv_value_0_0= 'Methods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:478:1: (lv_value_0_0= 'Methods' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:479:3: lv_value_0_0= 'Methods'
                    {
                    lv_value_0_0=(Token)match(input,18,FOLLOW_18_in_ruleType1063); 

                            newLeafNode(lv_value_0_0, grammarAccess.getTypeAccess().getValueMethodsKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "Methods");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:493:6: ( (lv_method_1_0= 'Types' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:493:6: ( (lv_method_1_0= 'Types' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:494:1: (lv_method_1_0= 'Types' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:494:1: (lv_method_1_0= 'Types' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:495:3: lv_method_1_0= 'Types'
                    {
                    lv_method_1_0=(Token)match(input,19,FOLLOW_19_in_ruleType1100); 

                            newLeafNode(lv_method_1_0, grammarAccess.getTypeAccess().getMethodTypesKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "method", lv_method_1_0, "Types");
                    	    

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSingleValueField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:516:1: entryRuleSingleValueField returns [EObject current=null] : iv_ruleSingleValueField= ruleSingleValueField EOF ;
    public final EObject entryRuleSingleValueField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValueField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:517:2: (iv_ruleSingleValueField= ruleSingleValueField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:518:2: iv_ruleSingleValueField= ruleSingleValueField EOF
            {
             newCompositeNode(grammarAccess.getSingleValueFieldRule()); 
            pushFollow(FOLLOW_ruleSingleValueField_in_entryRuleSingleValueField1149);
            iv_ruleSingleValueField=ruleSingleValueField();

            state._fsp--;

             current =iv_ruleSingleValueField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleValueField1159); 

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
    // $ANTLR end "entryRuleSingleValueField"


    // $ANTLR start "ruleSingleValueField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:525:1: ruleSingleValueField returns [EObject current=null] : ( ( (lv_name_0_0= ruleSingleValueFieldName ) ) ( (lv_n_1_0= ruleNegation ) )? otherlv_2= 'is' ( (lv_value_3_0= RULE_NAMEWITHWC ) ) ) ;
    public final EObject ruleSingleValueField() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_value_3_0=null;
        EObject lv_name_0_0 = null;

        EObject lv_n_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:528:28: ( ( ( (lv_name_0_0= ruleSingleValueFieldName ) ) ( (lv_n_1_0= ruleNegation ) )? otherlv_2= 'is' ( (lv_value_3_0= RULE_NAMEWITHWC ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:529:1: ( ( (lv_name_0_0= ruleSingleValueFieldName ) ) ( (lv_n_1_0= ruleNegation ) )? otherlv_2= 'is' ( (lv_value_3_0= RULE_NAMEWITHWC ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:529:1: ( ( (lv_name_0_0= ruleSingleValueFieldName ) ) ( (lv_n_1_0= ruleNegation ) )? otherlv_2= 'is' ( (lv_value_3_0= RULE_NAMEWITHWC ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:529:2: ( (lv_name_0_0= ruleSingleValueFieldName ) ) ( (lv_n_1_0= ruleNegation ) )? otherlv_2= 'is' ( (lv_value_3_0= RULE_NAMEWITHWC ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:529:2: ( (lv_name_0_0= ruleSingleValueFieldName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:530:1: (lv_name_0_0= ruleSingleValueFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:530:1: (lv_name_0_0= ruleSingleValueFieldName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:531:3: lv_name_0_0= ruleSingleValueFieldName
            {
             
            	        newCompositeNode(grammarAccess.getSingleValueFieldAccess().getNameSingleValueFieldNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleValueFieldName_in_ruleSingleValueField1205);
            lv_name_0_0=ruleSingleValueFieldName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleValueFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"SingleValueFieldName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:547:2: ( (lv_n_1_0= ruleNegation ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:548:1: (lv_n_1_0= ruleNegation )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:548:1: (lv_n_1_0= ruleNegation )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:549:3: lv_n_1_0= ruleNegation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleValueFieldAccess().getNNegationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNegation_in_ruleSingleValueField1226);
                    lv_n_1_0=ruleNegation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleValueFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"n",
                            		lv_n_1_0, 
                            		"Negation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleSingleValueField1239); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleValueFieldAccess().getIsKeyword_2());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:569:1: ( (lv_value_3_0= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:570:1: (lv_value_3_0= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:570:1: (lv_value_3_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:571:3: lv_value_3_0= RULE_NAMEWITHWC
            {
            lv_value_3_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleSingleValueField1256); 

            			newLeafNode(lv_value_3_0, grammarAccess.getSingleValueFieldAccess().getValueNameWithWCTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleValueFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"NameWithWC");
            	    

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
    // $ANTLR end "ruleSingleValueField"


    // $ANTLR start "entryRuleMultiValueField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:595:1: entryRuleMultiValueField returns [EObject current=null] : iv_ruleMultiValueField= ruleMultiValueField EOF ;
    public final EObject entryRuleMultiValueField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValueField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:596:2: (iv_ruleMultiValueField= ruleMultiValueField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:597:2: iv_ruleMultiValueField= ruleMultiValueField EOF
            {
             newCompositeNode(grammarAccess.getMultiValueFieldRule()); 
            pushFollow(FOLLOW_ruleMultiValueField_in_entryRuleMultiValueField1297);
            iv_ruleMultiValueField=ruleMultiValueField();

            state._fsp--;

             current =iv_ruleMultiValueField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValueField1307); 

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
    // $ANTLR end "entryRuleMultiValueField"


    // $ANTLR start "ruleMultiValueField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:604:1: ruleMultiValueField returns [EObject current=null] : ( ( (lv_name_0_0= ruleMultiValueFieldName ) ) otherlv_1= 'has' ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) ) ) ;
    public final EObject ruleMultiValueField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;
        Token lv_values_6_0=null;
        Token otherlv_7=null;
        EObject lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:607:28: ( ( ( (lv_name_0_0= ruleMultiValueFieldName ) ) otherlv_1= 'has' ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:608:1: ( ( (lv_name_0_0= ruleMultiValueFieldName ) ) otherlv_1= 'has' ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:608:1: ( ( (lv_name_0_0= ruleMultiValueFieldName ) ) otherlv_1= 'has' ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:608:2: ( (lv_name_0_0= ruleMultiValueFieldName ) ) otherlv_1= 'has' ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:608:2: ( (lv_name_0_0= ruleMultiValueFieldName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:609:1: (lv_name_0_0= ruleMultiValueFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:609:1: (lv_name_0_0= ruleMultiValueFieldName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:610:3: lv_name_0_0= ruleMultiValueFieldName
            {
             
            	        newCompositeNode(grammarAccess.getMultiValueFieldAccess().getNameMultiValueFieldNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiValueFieldName_in_ruleMultiValueField1353);
            lv_name_0_0=ruleMultiValueFieldName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiValueFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"MultiValueFieldName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMultiValueField1365); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiValueFieldAccess().getHasKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:630:1: ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NAMEWITHWC) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:630:2: ( (lv_values_2_0= RULE_NAMEWITHWC ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:630:2: ( (lv_values_2_0= RULE_NAMEWITHWC ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:631:1: (lv_values_2_0= RULE_NAMEWITHWC )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:631:1: (lv_values_2_0= RULE_NAMEWITHWC )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:632:3: lv_values_2_0= RULE_NAMEWITHWC
                    {
                    lv_values_2_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField1383); 

                    			newLeafNode(lv_values_2_0, grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiValueFieldRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"values",
                            		lv_values_2_0, 
                            		"NameWithWC");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:649:6: (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:649:6: (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:649:8: otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMultiValueField1407); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultiValueFieldAccess().getLeftParenthesisKeyword_2_1_0());
                        
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:653:1: ( (lv_values_4_0= RULE_NAMEWITHWC ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:654:1: (lv_values_4_0= RULE_NAMEWITHWC )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:654:1: (lv_values_4_0= RULE_NAMEWITHWC )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:655:3: lv_values_4_0= RULE_NAMEWITHWC
                    {
                    lv_values_4_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField1424); 

                    			newLeafNode(lv_values_4_0, grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiValueFieldRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"values",
                            		lv_values_4_0, 
                            		"NameWithWC");
                    	    

                    }


                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:671:2: (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:671:4: otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleMultiValueField1442); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMultiValueFieldAccess().getCommaKeyword_2_1_2_0());
                    	        
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:675:1: ( (lv_values_6_0= RULE_NAMEWITHWC ) )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:676:1: (lv_values_6_0= RULE_NAMEWITHWC )
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:676:1: (lv_values_6_0= RULE_NAMEWITHWC )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:677:3: lv_values_6_0= RULE_NAMEWITHWC
                    	    {
                    	    lv_values_6_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField1459); 

                    	    			newLeafNode(lv_values_6_0, grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMultiValueFieldRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_6_0, 
                    	            		"NameWithWC");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleMultiValueField1478); 

                        	newLeafNode(otherlv_7, grammarAccess.getMultiValueFieldAccess().getRightParenthesisKeyword_2_1_3());
                        

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
    // $ANTLR end "ruleMultiValueField"


    // $ANTLR start "entryRuleBooleanField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:705:1: entryRuleBooleanField returns [EObject current=null] : iv_ruleBooleanField= ruleBooleanField EOF ;
    public final EObject entryRuleBooleanField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:706:2: (iv_ruleBooleanField= ruleBooleanField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:707:2: iv_ruleBooleanField= ruleBooleanField EOF
            {
             newCompositeNode(grammarAccess.getBooleanFieldRule()); 
            pushFollow(FOLLOW_ruleBooleanField_in_entryRuleBooleanField1516);
            iv_ruleBooleanField=ruleBooleanField();

            state._fsp--;

             current =iv_ruleBooleanField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanField1526); 

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
    // $ANTLR end "entryRuleBooleanField"


    // $ANTLR start "ruleBooleanField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:714:1: ruleBooleanField returns [EObject current=null] : ( ( (lv_n_0_0= ruleNegation ) )? ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) ) ) ;
    public final EObject ruleBooleanField() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Token lv_value_5_0=null;
        Token lv_value_6_0=null;
        EObject lv_n_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:717:28: ( ( ( (lv_n_0_0= ruleNegation ) )? ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:718:1: ( ( (lv_n_0_0= ruleNegation ) )? ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:718:1: ( ( (lv_n_0_0= ruleNegation ) )? ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:718:2: ( (lv_n_0_0= ruleNegation ) )? ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:718:2: ( (lv_n_0_0= ruleNegation ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:719:1: (lv_n_0_0= ruleNegation )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:719:1: (lv_n_0_0= ruleNegation )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:720:3: lv_n_0_0= ruleNegation
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanFieldAccess().getNNegationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanField1572);
                    lv_n_0_0=ruleNegation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"n",
                            		lv_n_0_0, 
                            		"Negation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:736:3: ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            case 27:
                {
                alt12=5;
                }
                break;
            case 28:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:736:4: ( (lv_value_1_0= 'IsStatic' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:736:4: ( (lv_value_1_0= 'IsStatic' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:737:1: (lv_value_1_0= 'IsStatic' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:737:1: (lv_value_1_0= 'IsStatic' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:738:3: lv_value_1_0= 'IsStatic'
                    {
                    lv_value_1_0=(Token)match(input,23,FOLLOW_23_in_ruleBooleanField1592); 

                            newLeafNode(lv_value_1_0, grammarAccess.getBooleanFieldAccess().getValueIsStaticKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "IsStatic");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:752:6: ( (lv_value_2_0= 'IsPrivate' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:752:6: ( (lv_value_2_0= 'IsPrivate' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:753:1: (lv_value_2_0= 'IsPrivate' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:753:1: (lv_value_2_0= 'IsPrivate' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:754:3: lv_value_2_0= 'IsPrivate'
                    {
                    lv_value_2_0=(Token)match(input,24,FOLLOW_24_in_ruleBooleanField1629); 

                            newLeafNode(lv_value_2_0, grammarAccess.getBooleanFieldAccess().getValueIsPrivateKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "IsPrivate");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:768:6: ( (lv_value_3_0= 'IsPublic' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:768:6: ( (lv_value_3_0= 'IsPublic' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:769:1: (lv_value_3_0= 'IsPublic' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:769:1: (lv_value_3_0= 'IsPublic' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:770:3: lv_value_3_0= 'IsPublic'
                    {
                    lv_value_3_0=(Token)match(input,25,FOLLOW_25_in_ruleBooleanField1666); 

                            newLeafNode(lv_value_3_0, grammarAccess.getBooleanFieldAccess().getValueIsPublicKeyword_1_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "IsPublic");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:784:6: ( (lv_value_4_0= 'IsFinal' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:784:6: ( (lv_value_4_0= 'IsFinal' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:785:1: (lv_value_4_0= 'IsFinal' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:785:1: (lv_value_4_0= 'IsFinal' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:786:3: lv_value_4_0= 'IsFinal'
                    {
                    lv_value_4_0=(Token)match(input,26,FOLLOW_26_in_ruleBooleanField1703); 

                            newLeafNode(lv_value_4_0, grammarAccess.getBooleanFieldAccess().getValueIsFinalKeyword_1_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "IsFinal");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:800:6: ( (lv_value_5_0= 'IsAbstract' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:800:6: ( (lv_value_5_0= 'IsAbstract' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:801:1: (lv_value_5_0= 'IsAbstract' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:801:1: (lv_value_5_0= 'IsAbstract' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:802:3: lv_value_5_0= 'IsAbstract'
                    {
                    lv_value_5_0=(Token)match(input,27,FOLLOW_27_in_ruleBooleanField1740); 

                            newLeafNode(lv_value_5_0, grammarAccess.getBooleanFieldAccess().getValueIsAbstractKeyword_1_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_5_0, "IsAbstract");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:816:6: ( (lv_value_6_0= 'IsProtected' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:816:6: ( (lv_value_6_0= 'IsProtected' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:817:1: (lv_value_6_0= 'IsProtected' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:817:1: (lv_value_6_0= 'IsProtected' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:818:3: lv_value_6_0= 'IsProtected'
                    {
                    lv_value_6_0=(Token)match(input,28,FOLLOW_28_in_ruleBooleanField1777); 

                            newLeafNode(lv_value_6_0, grammarAccess.getBooleanFieldAccess().getValueIsProtectedKeyword_1_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_6_0, "IsProtected");
                    	    

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
    // $ANTLR end "ruleBooleanField"


    // $ANTLR start "entryRuleSingleValueFieldName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:839:1: entryRuleSingleValueFieldName returns [EObject current=null] : iv_ruleSingleValueFieldName= ruleSingleValueFieldName EOF ;
    public final EObject entryRuleSingleValueFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValueFieldName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:840:2: (iv_ruleSingleValueFieldName= ruleSingleValueFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:841:2: iv_ruleSingleValueFieldName= ruleSingleValueFieldName EOF
            {
             newCompositeNode(grammarAccess.getSingleValueFieldNameRule()); 
            pushFollow(FOLLOW_ruleSingleValueFieldName_in_entryRuleSingleValueFieldName1827);
            iv_ruleSingleValueFieldName=ruleSingleValueFieldName();

            state._fsp--;

             current =iv_ruleSingleValueFieldName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleValueFieldName1837); 

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
    // $ANTLR end "entryRuleSingleValueFieldName"


    // $ANTLR start "ruleSingleValueFieldName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:848:1: ruleSingleValueFieldName returns [EObject current=null] : ( (lv_value_0_0= 'Name' ) ) ;
    public final EObject ruleSingleValueFieldName() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:851:28: ( ( (lv_value_0_0= 'Name' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:852:1: ( (lv_value_0_0= 'Name' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:852:1: ( (lv_value_0_0= 'Name' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:853:1: (lv_value_0_0= 'Name' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:853:1: (lv_value_0_0= 'Name' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:854:3: lv_value_0_0= 'Name'
            {
            lv_value_0_0=(Token)match(input,29,FOLLOW_29_in_ruleSingleValueFieldName1879); 

                    newLeafNode(lv_value_0_0, grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleValueFieldNameRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "Name");
            	    

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
    // $ANTLR end "ruleSingleValueFieldName"


    // $ANTLR start "entryRuleMultiValueFieldName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:875:1: entryRuleMultiValueFieldName returns [EObject current=null] : iv_ruleMultiValueFieldName= ruleMultiValueFieldName EOF ;
    public final EObject entryRuleMultiValueFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValueFieldName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:876:2: (iv_ruleMultiValueFieldName= ruleMultiValueFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:877:2: iv_ruleMultiValueFieldName= ruleMultiValueFieldName EOF
            {
             newCompositeNode(grammarAccess.getMultiValueFieldNameRule()); 
            pushFollow(FOLLOW_ruleMultiValueFieldName_in_entryRuleMultiValueFieldName1927);
            iv_ruleMultiValueFieldName=ruleMultiValueFieldName();

            state._fsp--;

             current =iv_ruleMultiValueFieldName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValueFieldName1937); 

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
    // $ANTLR end "entryRuleMultiValueFieldName"


    // $ANTLR start "ruleMultiValueFieldName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:884:1: ruleMultiValueFieldName returns [EObject current=null] : ( (lv_value_0_0= 'CalledMethods' ) ) ;
    public final EObject ruleMultiValueFieldName() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:887:28: ( ( (lv_value_0_0= 'CalledMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:888:1: ( (lv_value_0_0= 'CalledMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:888:1: ( (lv_value_0_0= 'CalledMethods' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:889:1: (lv_value_0_0= 'CalledMethods' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:889:1: (lv_value_0_0= 'CalledMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:890:3: lv_value_0_0= 'CalledMethods'
            {
            lv_value_0_0=(Token)match(input,30,FOLLOW_30_in_ruleMultiValueFieldName1979); 

                    newLeafNode(lv_value_0_0, grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiValueFieldNameRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "CalledMethods");
            	    

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
    // $ANTLR end "ruleMultiValueFieldName"


    // $ANTLR start "entryRuleNegation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:911:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:912:2: (iv_ruleNegation= ruleNegation EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:913:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation2027);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation2037); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:920:1: ruleNegation returns [EObject current=null] : ( (lv_value_0_0= '!' ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:923:28: ( ( (lv_value_0_0= '!' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:924:1: ( (lv_value_0_0= '!' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:924:1: ( (lv_value_0_0= '!' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:925:1: (lv_value_0_0= '!' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:925:1: (lv_value_0_0= '!' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:926:3: lv_value_0_0= '!'
            {
            lv_value_0_0=(Token)match(input,31,FOLLOW_31_in_ruleNegation2079); 

                    newLeafNode(lv_value_0_0, grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNegationRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "!");
            	    

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
    // $ANTLR end "ruleNegation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleFirst_in_entryRuleFirst75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFirst85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleFirst131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFirst143 = new BitSet(new long[]{0x00000000FF804000L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleFirst164 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleFirst177 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFirst189 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleContains_in_ruleFirst210 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFirst222 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleFirst235 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFirst247 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleContains_in_ruleFirst268 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFirst280 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleContains_in_entryRuleContains320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContains330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleContains376 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContains388 = new BitSet(new long[]{0x00000000FF804000L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleContains409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr502 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleOrExpr523 = new BitSet(new long[]{0x00000000FF804000L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr544 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleAndExpr639 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAndExpr660 = new BitSet(new long[]{0x00000000FF804000L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleAndExpr681 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldExpr_in_rulePrimary776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimary794 = new BitSet(new long[]{0x00000000FF804000L});
    public static final BitSet FOLLOW_ruleOrExpr_in_rulePrimary816 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimary827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldExpr_in_entryRuleFieldExpr864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldExpr874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueField_in_ruleFieldExpr921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueField_in_ruleFieldExpr948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanField_in_ruleFieldExpr975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueField_in_entryRuleSingleValueField1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleValueField1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueFieldName_in_ruleSingleValueField1205 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleSingleValueField1226 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSingleValueField1239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleSingleValueField1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueField_in_entryRuleMultiValueField1297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValueField1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueFieldName_in_ruleMultiValueField1353 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMultiValueField1365 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMultiValueField1407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField1424 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleMultiValueField1442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField1459 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_15_in_ruleMultiValueField1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanField_in_entryRuleBooleanField1516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanField1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanField1572 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_23_in_ruleBooleanField1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBooleanField1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBooleanField1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBooleanField1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBooleanField1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBooleanField1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueFieldName_in_entryRuleSingleValueFieldName1827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleValueFieldName1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSingleValueFieldName1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueFieldName_in_entryRuleMultiValueFieldName1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValueFieldName1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMultiValueFieldName1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation2027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleNegation2079 = new BitSet(new long[]{0x0000000000000002L});

}