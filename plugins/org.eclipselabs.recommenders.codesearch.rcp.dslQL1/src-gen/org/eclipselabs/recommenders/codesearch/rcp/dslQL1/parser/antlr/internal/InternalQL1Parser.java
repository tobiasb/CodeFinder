package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "','", "')'", "'static'", "'private'", "'public'", "'final'", "'abstract'", "'protected'", "'{'", "'}'", "'..'", "'throws'"
    };
    public static final int RULE_ID=5;
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
        	return "MethodPattern";	
       	}
       	
       	@Override
       	protected QL1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMethodPattern"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:67:1: entryRuleMethodPattern returns [EObject current=null] : iv_ruleMethodPattern= ruleMethodPattern EOF ;
    public final EObject entryRuleMethodPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodPattern = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:68:2: (iv_ruleMethodPattern= ruleMethodPattern EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:69:2: iv_ruleMethodPattern= ruleMethodPattern EOF
            {
             newCompositeNode(grammarAccess.getMethodPatternRule()); 
            pushFollow(FOLLOW_ruleMethodPattern_in_entryRuleMethodPattern75);
            iv_ruleMethodPattern=ruleMethodPattern();

            state._fsp--;

             current =iv_ruleMethodPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodPattern85); 

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
    // $ANTLR end "entryRuleMethodPattern"


    // $ANTLR start "ruleMethodPattern"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:76:1: ruleMethodPattern returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) (otherlv_3= '(' ( (lv_parameterElements_4_0= ruleParameterElement ) ) (otherlv_5= ',' ( (lv_parameterElements_6_0= ruleParameterElement ) ) )* otherlv_7= ')' )? ( (lv_throwsClause_8_0= ruleThrows ) )? ) ;
    public final EObject ruleMethodPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_modifiers_0_0 = null;

        EObject lv_returnType_1_0 = null;

        EObject lv_methodName_2_0 = null;

        EObject lv_parameterElements_4_0 = null;

        EObject lv_parameterElements_6_0 = null;

        EObject lv_throwsClause_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:79:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) (otherlv_3= '(' ( (lv_parameterElements_4_0= ruleParameterElement ) ) (otherlv_5= ',' ( (lv_parameterElements_6_0= ruleParameterElement ) ) )* otherlv_7= ')' )? ( (lv_throwsClause_8_0= ruleThrows ) )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) (otherlv_3= '(' ( (lv_parameterElements_4_0= ruleParameterElement ) ) (otherlv_5= ',' ( (lv_parameterElements_6_0= ruleParameterElement ) ) )* otherlv_7= ')' )? ( (lv_throwsClause_8_0= ruleThrows ) )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) (otherlv_3= '(' ( (lv_parameterElements_4_0= ruleParameterElement ) ) (otherlv_5= ',' ( (lv_parameterElements_6_0= ruleParameterElement ) ) )* otherlv_7= ')' )? ( (lv_throwsClause_8_0= ruleThrows ) )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) (otherlv_3= '(' ( (lv_parameterElements_4_0= ruleParameterElement ) ) (otherlv_5= ',' ( (lv_parameterElements_6_0= ruleParameterElement ) ) )* otherlv_7= ')' )? ( (lv_throwsClause_8_0= ruleThrows ) )?
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:81:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:81:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:82:3: lv_modifiers_0_0= ruleModifier
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodPatternAccess().getModifiersModifierParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifier_in_ruleMethodPattern131);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodPatternRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modifiers",
            	            		lv_modifiers_0_0, 
            	            		"Modifier");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:98:3: ( (lv_returnType_1_0= ruleReturnType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:99:1: (lv_returnType_1_0= ruleReturnType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:99:1: (lv_returnType_1_0= ruleReturnType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:100:3: lv_returnType_1_0= ruleReturnType
            {
             
            	        newCompositeNode(grammarAccess.getMethodPatternAccess().getReturnTypeReturnTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReturnType_in_ruleMethodPattern153);
            lv_returnType_1_0=ruleReturnType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodPatternRule());
            	        }
                   		set(
                   			current, 
                   			"returnType",
                    		lv_returnType_1_0, 
                    		"ReturnType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:116:2: ( (lv_methodName_2_0= ruleMethodName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:117:1: (lv_methodName_2_0= ruleMethodName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:117:1: (lv_methodName_2_0= ruleMethodName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:118:3: lv_methodName_2_0= ruleMethodName
            {
             
            	        newCompositeNode(grammarAccess.getMethodPatternAccess().getMethodNameMethodNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMethodName_in_ruleMethodPattern174);
            lv_methodName_2_0=ruleMethodName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodPatternRule());
            	        }
                   		set(
                   			current, 
                   			"methodName",
                    		lv_methodName_2_0, 
                    		"MethodName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:134:2: (otherlv_3= '(' ( (lv_parameterElements_4_0= ruleParameterElement ) ) (otherlv_5= ',' ( (lv_parameterElements_6_0= ruleParameterElement ) ) )* otherlv_7= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:134:4: otherlv_3= '(' ( (lv_parameterElements_4_0= ruleParameterElement ) ) (otherlv_5= ',' ( (lv_parameterElements_6_0= ruleParameterElement ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleMethodPattern187); 

                        	newLeafNode(otherlv_3, grammarAccess.getMethodPatternAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:138:1: ( (lv_parameterElements_4_0= ruleParameterElement ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:139:1: (lv_parameterElements_4_0= ruleParameterElement )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:139:1: (lv_parameterElements_4_0= ruleParameterElement )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:140:3: lv_parameterElements_4_0= ruleParameterElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodPatternAccess().getParameterElementsParameterElementParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterElement_in_ruleMethodPattern208);
                    lv_parameterElements_4_0=ruleParameterElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodPatternRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterElements",
                            		lv_parameterElements_4_0, 
                            		"ParameterElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:156:2: (otherlv_5= ',' ( (lv_parameterElements_6_0= ruleParameterElement ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:156:4: otherlv_5= ',' ( (lv_parameterElements_6_0= ruleParameterElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMethodPattern221); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMethodPatternAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:160:1: ( (lv_parameterElements_6_0= ruleParameterElement ) )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:161:1: (lv_parameterElements_6_0= ruleParameterElement )
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:161:1: (lv_parameterElements_6_0= ruleParameterElement )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:162:3: lv_parameterElements_6_0= ruleParameterElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodPatternAccess().getParameterElementsParameterElementParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterElement_in_ruleMethodPattern242);
                    	    lv_parameterElements_6_0=ruleParameterElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMethodPatternRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterElements",
                    	            		lv_parameterElements_6_0, 
                    	            		"ParameterElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleMethodPattern256); 

                        	newLeafNode(otherlv_7, grammarAccess.getMethodPatternAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:182:3: ( (lv_throwsClause_8_0= ruleThrows ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:183:1: (lv_throwsClause_8_0= ruleThrows )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:183:1: (lv_throwsClause_8_0= ruleThrows )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:184:3: lv_throwsClause_8_0= ruleThrows
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodPatternAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleThrows_in_ruleMethodPattern279);
                    lv_throwsClause_8_0=ruleThrows();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodPatternRule());
                    	        }
                           		set(
                           			current, 
                           			"throwsClause",
                            		lv_throwsClause_8_0, 
                            		"Throws");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleMethodPattern"


    // $ANTLR start "entryRuleModifier"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:208:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:209:2: (iv_ruleModifier= ruleModifier EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:210:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier316);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier326); 

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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:217:1: ruleModifier returns [EObject current=null] : ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) ) ;
    public final EObject ruleModifier() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Token lv_value_5_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:220:28: ( ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:221:1: ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:221:1: ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:221:2: ( (lv_value_0_0= 'static' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:221:2: ( (lv_value_0_0= 'static' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:222:1: (lv_value_0_0= 'static' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:222:1: (lv_value_0_0= 'static' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:223:3: lv_value_0_0= 'static'
                    {
                    lv_value_0_0=(Token)match(input,15,FOLLOW_15_in_ruleModifier369); 

                            newLeafNode(lv_value_0_0, grammarAccess.getModifierAccess().getValueStaticKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModifierRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "static");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:237:6: ( (lv_value_1_0= 'private' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:237:6: ( (lv_value_1_0= 'private' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:238:1: (lv_value_1_0= 'private' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:238:1: (lv_value_1_0= 'private' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:239:3: lv_value_1_0= 'private'
                    {
                    lv_value_1_0=(Token)match(input,16,FOLLOW_16_in_ruleModifier406); 

                            newLeafNode(lv_value_1_0, grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModifierRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "private");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:253:6: ( (lv_value_2_0= 'public' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:253:6: ( (lv_value_2_0= 'public' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:254:1: (lv_value_2_0= 'public' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:254:1: (lv_value_2_0= 'public' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:255:3: lv_value_2_0= 'public'
                    {
                    lv_value_2_0=(Token)match(input,17,FOLLOW_17_in_ruleModifier443); 

                            newLeafNode(lv_value_2_0, grammarAccess.getModifierAccess().getValuePublicKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModifierRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "public");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:269:6: ( (lv_value_3_0= 'final' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:269:6: ( (lv_value_3_0= 'final' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:270:1: (lv_value_3_0= 'final' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:270:1: (lv_value_3_0= 'final' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:271:3: lv_value_3_0= 'final'
                    {
                    lv_value_3_0=(Token)match(input,18,FOLLOW_18_in_ruleModifier480); 

                            newLeafNode(lv_value_3_0, grammarAccess.getModifierAccess().getValueFinalKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModifierRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "final");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:285:6: ( (lv_value_4_0= 'abstract' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:285:6: ( (lv_value_4_0= 'abstract' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:286:1: (lv_value_4_0= 'abstract' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:286:1: (lv_value_4_0= 'abstract' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:287:3: lv_value_4_0= 'abstract'
                    {
                    lv_value_4_0=(Token)match(input,19,FOLLOW_19_in_ruleModifier517); 

                            newLeafNode(lv_value_4_0, grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModifierRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "abstract");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:301:6: ( (lv_value_5_0= 'protected' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:301:6: ( (lv_value_5_0= 'protected' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:302:1: (lv_value_5_0= 'protected' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:302:1: (lv_value_5_0= 'protected' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:303:3: lv_value_5_0= 'protected'
                    {
                    lv_value_5_0=(Token)match(input,20,FOLLOW_20_in_ruleModifier554); 

                            newLeafNode(lv_value_5_0, grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModifierRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_5_0, "protected");
                    	    

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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleReturnType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:324:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:325:2: (iv_ruleReturnType= ruleReturnType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:326:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_ruleReturnType_in_entryRuleReturnType603);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnType613); 

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
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:333:1: ruleReturnType returns [EObject current=null] : ( (lv_value_0_0= RULE_NAMEWITHWC ) ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:336:28: ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:337:1: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:337:1: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:338:1: (lv_value_0_0= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:338:1: (lv_value_0_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:339:3: lv_value_0_0= RULE_NAMEWITHWC
            {
            lv_value_0_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleReturnType654); 

            			newLeafNode(lv_value_0_0, grammarAccess.getReturnTypeAccess().getValueNameWithWCTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReturnTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"NameWithWC");
            	    

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
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleParameterElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:363:1: entryRuleParameterElement returns [EObject current=null] : iv_ruleParameterElement= ruleParameterElement EOF ;
    public final EObject entryRuleParameterElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterElement = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:364:2: (iv_ruleParameterElement= ruleParameterElement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:365:2: iv_ruleParameterElement= ruleParameterElement EOF
            {
             newCompositeNode(grammarAccess.getParameterElementRule()); 
            pushFollow(FOLLOW_ruleParameterElement_in_entryRuleParameterElement694);
            iv_ruleParameterElement=ruleParameterElement();

            state._fsp--;

             current =iv_ruleParameterElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterElement704); 

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
    // $ANTLR end "entryRuleParameterElement"


    // $ANTLR start "ruleParameterElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:372:1: ruleParameterElement returns [EObject current=null] : ( ( () ( (lv_values_1_0= ruleParameterType ) ) ) | (otherlv_2= '{' ( (lv_types_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) ) ;
    public final EObject ruleParameterElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_values_1_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_types_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:375:28: ( ( ( () ( (lv_values_1_0= ruleParameterType ) ) ) | (otherlv_2= '{' ( (lv_types_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:376:1: ( ( () ( (lv_values_1_0= ruleParameterType ) ) ) | (otherlv_2= '{' ( (lv_types_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:376:1: ( ( () ( (lv_values_1_0= ruleParameterType ) ) ) | (otherlv_2= '{' ( (lv_types_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NAMEWITHWC||LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:376:2: ( () ( (lv_values_1_0= ruleParameterType ) ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:376:2: ( () ( (lv_values_1_0= ruleParameterType ) ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:376:3: () ( (lv_values_1_0= ruleParameterType ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:376:3: ()
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:377:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterElementAccess().getParameterElementAction_0_0(),
                                current);
                        

                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:382:2: ( (lv_values_1_0= ruleParameterType ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:383:1: (lv_values_1_0= ruleParameterType )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:383:1: (lv_values_1_0= ruleParameterType )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:384:3: lv_values_1_0= ruleParameterType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterElementAccess().getValuesParameterTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterType_in_ruleParameterElement760);
                    lv_values_1_0=ruleParameterType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterElementRule());
                    	        }
                           		add(
                           			current, 
                           			"values",
                            		lv_values_1_0, 
                            		"ParameterType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:401:6: (otherlv_2= '{' ( (lv_types_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleParameterType ) ) )* otherlv_6= '}' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:401:6: (otherlv_2= '{' ( (lv_types_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleParameterType ) ) )* otherlv_6= '}' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:401:8: otherlv_2= '{' ( (lv_types_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleParameterType ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleParameterElement780); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterElementAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:405:1: ( (lv_types_3_0= ruleParameterType ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:406:1: (lv_types_3_0= ruleParameterType )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:406:1: (lv_types_3_0= ruleParameterType )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:407:3: lv_types_3_0= ruleParameterType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterElementAccess().getTypesParameterTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterType_in_ruleParameterElement801);
                    lv_types_3_0=ruleParameterType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterElementRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_3_0, 
                            		"ParameterType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:423:2: (otherlv_4= ',' ( (lv_types_5_0= ruleParameterType ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:423:4: otherlv_4= ',' ( (lv_types_5_0= ruleParameterType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleParameterElement814); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getParameterElementAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:427:1: ( (lv_types_5_0= ruleParameterType ) )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:428:1: (lv_types_5_0= ruleParameterType )
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:428:1: (lv_types_5_0= ruleParameterType )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:429:3: lv_types_5_0= ruleParameterType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterElementAccess().getTypesParameterTypeParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterType_in_ruleParameterElement835);
                    	    lv_types_5_0=ruleParameterType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_5_0, 
                    	            		"ParameterType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleParameterElement849); 

                        	newLeafNode(otherlv_6, grammarAccess.getParameterElementAccess().getRightCurlyBracketKeyword_1_3());
                        

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
    // $ANTLR end "ruleParameterElement"


    // $ANTLR start "entryRuleParameterType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:457:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:458:2: (iv_ruleParameterType= ruleParameterType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:459:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_ruleParameterType_in_entryRuleParameterType886);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterType896); 

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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:466:1: ruleParameterType returns [EObject current=null] : ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) | ( (lv_value_1_0= '..' ) ) ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:469:28: ( ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) | ( (lv_value_1_0= '..' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:470:1: ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) | ( (lv_value_1_0= '..' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:470:1: ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) | ( (lv_value_1_0= '..' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NAMEWITHWC) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:470:2: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:470:2: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:471:1: (lv_value_0_0= RULE_NAMEWITHWC )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:471:1: (lv_value_0_0= RULE_NAMEWITHWC )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:472:3: lv_value_0_0= RULE_NAMEWITHWC
                    {
                    lv_value_0_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleParameterType938); 

                    			newLeafNode(lv_value_0_0, grammarAccess.getParameterTypeAccess().getValueNameWithWCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"NameWithWC");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:489:6: ( (lv_value_1_0= '..' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:489:6: ( (lv_value_1_0= '..' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:490:1: (lv_value_1_0= '..' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:490:1: (lv_value_1_0= '..' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:491:3: lv_value_1_0= '..'
                    {
                    lv_value_1_0=(Token)match(input,23,FOLLOW_23_in_ruleParameterType967); 

                            newLeafNode(lv_value_1_0, grammarAccess.getParameterTypeAccess().getValueFullStopFullStopKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterTypeRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "..");
                    	    

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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleThrows"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:512:1: entryRuleThrows returns [EObject current=null] : iv_ruleThrows= ruleThrows EOF ;
    public final EObject entryRuleThrows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrows = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:513:2: (iv_ruleThrows= ruleThrows EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:514:2: iv_ruleThrows= ruleThrows EOF
            {
             newCompositeNode(grammarAccess.getThrowsRule()); 
            pushFollow(FOLLOW_ruleThrows_in_entryRuleThrows1016);
            iv_ruleThrows=ruleThrows();

            state._fsp--;

             current =iv_ruleThrows; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrows1026); 

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
    // $ANTLR end "entryRuleThrows"


    // $ANTLR start "ruleThrows"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:521:1: ruleThrows returns [EObject current=null] : (otherlv_0= 'throws' ( (lv_value_1_0= RULE_NAMEWITHWC ) ) ) ;
    public final EObject ruleThrows() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:524:28: ( (otherlv_0= 'throws' ( (lv_value_1_0= RULE_NAMEWITHWC ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:525:1: (otherlv_0= 'throws' ( (lv_value_1_0= RULE_NAMEWITHWC ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:525:1: (otherlv_0= 'throws' ( (lv_value_1_0= RULE_NAMEWITHWC ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:525:3: otherlv_0= 'throws' ( (lv_value_1_0= RULE_NAMEWITHWC ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleThrows1063); 

                	newLeafNode(otherlv_0, grammarAccess.getThrowsAccess().getThrowsKeyword_0());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:529:1: ( (lv_value_1_0= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:530:1: (lv_value_1_0= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:530:1: (lv_value_1_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:531:3: lv_value_1_0= RULE_NAMEWITHWC
            {
            lv_value_1_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleThrows1080); 

            			newLeafNode(lv_value_1_0, grammarAccess.getThrowsAccess().getValueNameWithWCTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getThrowsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
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
    // $ANTLR end "ruleThrows"


    // $ANTLR start "entryRuleMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:555:1: entryRuleMethodName returns [EObject current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final EObject entryRuleMethodName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:556:2: (iv_ruleMethodName= ruleMethodName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:557:2: iv_ruleMethodName= ruleMethodName EOF
            {
             newCompositeNode(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName1121);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;

             current =iv_ruleMethodName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName1131); 

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
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:564:1: ruleMethodName returns [EObject current=null] : ( (lv_value_0_0= RULE_NAMEWITHWC ) ) ;
    public final EObject ruleMethodName() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:567:28: ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:568:1: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:568:1: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:569:1: (lv_value_0_0= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:569:1: (lv_value_0_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:570:3: lv_value_0_0= RULE_NAMEWITHWC
            {
            lv_value_0_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethodName1172); 

            			newLeafNode(lv_value_0_0, grammarAccess.getMethodNameAccess().getValueNameWithWCTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"NameWithWC");
            	    

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
    // $ANTLR end "ruleMethodName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMethodPattern_in_entryRuleMethodPattern75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodPattern85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMethodPattern131 = new BitSet(new long[]{0x00000000001F8010L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleMethodPattern153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodPattern174 = new BitSet(new long[]{0x0000000001001002L});
    public static final BitSet FOLLOW_12_in_ruleMethodPattern187 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_ruleParameterElement_in_ruleMethodPattern208 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleMethodPattern221 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_ruleParameterElement_in_ruleMethodPattern242 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleMethodPattern256 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleThrows_in_ruleMethodPattern279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModifier369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleModifier406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleModifier443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModifier480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModifier517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleModifier554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_entryRuleReturnType603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnType613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleReturnType654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElement_in_entryRuleParameterElement694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterElement704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleParameterElement760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleParameterElement780 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleParameterElement801 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_ruleParameterElement814 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleParameterElement835 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22_in_ruleParameterElement849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_entryRuleParameterType886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterType896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleParameterType938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParameterType967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_entryRuleThrows1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrows1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleThrows1063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleThrows1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName1121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethodName1172 = new BitSet(new long[]{0x0000000000000002L});

}