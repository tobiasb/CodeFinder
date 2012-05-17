package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.services.QL1GrammarAccess;

@SuppressWarnings("all")
public class InternalQL1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "','", "')'", "'static'", "'private'", "'public'", "'final'", "'abstract'", "'protected'", "'{'", "'|'", "'}'", "'..'", "'throws'", "'void'"
    };
    public static final int RULE_ID=5;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:76:1: ruleMethodPattern returns [EObject current=null] : ( (lv_definition_0_0= ruleMethodPatternDefinition ) ) ;
    public final EObject ruleMethodPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_definition_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:79:28: ( ( (lv_definition_0_0= ruleMethodPatternDefinition ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:1: ( (lv_definition_0_0= ruleMethodPatternDefinition ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:1: ( (lv_definition_0_0= ruleMethodPatternDefinition ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:81:1: (lv_definition_0_0= ruleMethodPatternDefinition )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:81:1: (lv_definition_0_0= ruleMethodPatternDefinition )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:82:3: lv_definition_0_0= ruleMethodPatternDefinition
            {
             
            	        newCompositeNode(grammarAccess.getMethodPatternAccess().getDefinitionMethodPatternDefinitionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleMethodPatternDefinition_in_ruleMethodPattern130);
            lv_definition_0_0=ruleMethodPatternDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodPatternRule());
            	        }
                   		set(
                   			current, 
                   			"definition",
                    		lv_definition_0_0, 
                    		"MethodPatternDefinition");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRuleMethodPatternDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:106:1: entryRuleMethodPatternDefinition returns [EObject current=null] : iv_ruleMethodPatternDefinition= ruleMethodPatternDefinition EOF ;
    public final EObject entryRuleMethodPatternDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodPatternDefinition = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:107:2: (iv_ruleMethodPatternDefinition= ruleMethodPatternDefinition EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:108:2: iv_ruleMethodPatternDefinition= ruleMethodPatternDefinition EOF
            {
             newCompositeNode(grammarAccess.getMethodPatternDefinitionRule()); 
            pushFollow(FOLLOW_ruleMethodPatternDefinition_in_entryRuleMethodPatternDefinition165);
            iv_ruleMethodPatternDefinition=ruleMethodPatternDefinition();

            state._fsp--;

             current =iv_ruleMethodPatternDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodPatternDefinition175); 

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
    // $ANTLR end "entryRuleMethodPatternDefinition"


    // $ANTLR start "ruleMethodPatternDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:115:1: ruleMethodPatternDefinition returns [EObject current=null] : ( ( (lv_modifierDefinition_0_0= ruleModifierDefinition ) ) ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )? ( (lv_throwsClause_4_0= ruleThrows ) )? ) ;
    public final EObject ruleMethodPatternDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_modifierDefinition_0_0 = null;

        EObject lv_returnType_1_0 = null;

        EObject lv_methodName_2_0 = null;

        EObject lv_parameterDefinition_3_0 = null;

        EObject lv_throwsClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:118:28: ( ( ( (lv_modifierDefinition_0_0= ruleModifierDefinition ) ) ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )? ( (lv_throwsClause_4_0= ruleThrows ) )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:119:1: ( ( (lv_modifierDefinition_0_0= ruleModifierDefinition ) ) ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )? ( (lv_throwsClause_4_0= ruleThrows ) )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:119:1: ( ( (lv_modifierDefinition_0_0= ruleModifierDefinition ) ) ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )? ( (lv_throwsClause_4_0= ruleThrows ) )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:119:2: ( (lv_modifierDefinition_0_0= ruleModifierDefinition ) ) ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )? ( (lv_throwsClause_4_0= ruleThrows ) )?
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:119:2: ( (lv_modifierDefinition_0_0= ruleModifierDefinition ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:120:1: (lv_modifierDefinition_0_0= ruleModifierDefinition )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:120:1: (lv_modifierDefinition_0_0= ruleModifierDefinition )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:121:3: lv_modifierDefinition_0_0= ruleModifierDefinition
            {
             
            	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getModifierDefinitionModifierDefinitionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModifierDefinition_in_ruleMethodPatternDefinition221);
            lv_modifierDefinition_0_0=ruleModifierDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"modifierDefinition",
                    		lv_modifierDefinition_0_0, 
                    		"ModifierDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:137:2: ( (lv_returnType_1_0= ruleReturnType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:138:1: (lv_returnType_1_0= ruleReturnType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:138:1: (lv_returnType_1_0= ruleReturnType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:139:3: lv_returnType_1_0= ruleReturnType
            {
             
            	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getReturnTypeReturnTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReturnType_in_ruleMethodPatternDefinition242);
            lv_returnType_1_0=ruleReturnType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"returnType",
                    		lv_returnType_1_0, 
                    		"ReturnType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:155:2: ( (lv_methodName_2_0= ruleMethodName ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:156:1: (lv_methodName_2_0= ruleMethodName )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:156:1: (lv_methodName_2_0= ruleMethodName )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:157:3: lv_methodName_2_0= ruleMethodName
            {
             
            	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getMethodNameMethodNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMethodName_in_ruleMethodPatternDefinition263);
            lv_methodName_2_0=ruleMethodName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"methodName",
                    		lv_methodName_2_0, 
                    		"MethodName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:173:2: ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:174:1: (lv_parameterDefinition_3_0= ruleParameterDefinition )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:174:1: (lv_parameterDefinition_3_0= ruleParameterDefinition )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:175:3: lv_parameterDefinition_3_0= ruleParameterDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getParameterDefinitionParameterDefinitionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterDefinition_in_ruleMethodPatternDefinition284);
                    lv_parameterDefinition_3_0=ruleParameterDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterDefinition",
                            		lv_parameterDefinition_3_0, 
                            		"ParameterDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:191:3: ( (lv_throwsClause_4_0= ruleThrows ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:192:1: (lv_throwsClause_4_0= ruleThrows )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:192:1: (lv_throwsClause_4_0= ruleThrows )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:193:3: lv_throwsClause_4_0= ruleThrows
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleThrows_in_ruleMethodPatternDefinition306);
                    lv_throwsClause_4_0=ruleThrows();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"throwsClause",
                            		lv_throwsClause_4_0, 
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
    // $ANTLR end "ruleMethodPatternDefinition"


    // $ANTLR start "entryRuleParameterDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:217:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:218:2: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:219:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getParameterDefinitionRule()); 
            pushFollow(FOLLOW_ruleParameterDefinition_in_entryRuleParameterDefinition343);
            iv_ruleParameterDefinition=ruleParameterDefinition();

            state._fsp--;

             current =iv_ruleParameterDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDefinition353); 

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
    // $ANTLR end "entryRuleParameterDefinition"


    // $ANTLR start "ruleParameterDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:226:1: ruleParameterDefinition returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_parameterElementholder_2_0= ruleParameterElementHolder ) ) (otherlv_3= ',' ( (lv_parameterElementholder_4_0= ruleParameterElementHolder ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterElementholder_2_0 = null;

        EObject lv_parameterElementholder_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:229:28: ( ( () otherlv_1= '(' ( ( (lv_parameterElementholder_2_0= ruleParameterElementHolder ) ) (otherlv_3= ',' ( (lv_parameterElementholder_4_0= ruleParameterElementHolder ) ) )* )? otherlv_5= ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:230:1: ( () otherlv_1= '(' ( ( (lv_parameterElementholder_2_0= ruleParameterElementHolder ) ) (otherlv_3= ',' ( (lv_parameterElementholder_4_0= ruleParameterElementHolder ) ) )* )? otherlv_5= ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:230:1: ( () otherlv_1= '(' ( ( (lv_parameterElementholder_2_0= ruleParameterElementHolder ) ) (otherlv_3= ',' ( (lv_parameterElementholder_4_0= ruleParameterElementHolder ) ) )* )? otherlv_5= ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:230:2: () otherlv_1= '(' ( ( (lv_parameterElementholder_2_0= ruleParameterElementHolder ) ) (otherlv_3= ',' ( (lv_parameterElementholder_4_0= ruleParameterElementHolder ) ) )* )? otherlv_5= ')'
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:230:2: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:231:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterDefinitionAccess().getParameterDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleParameterDefinition399); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterDefinitionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:240:1: ( ( (lv_parameterElementholder_2_0= ruleParameterElementHolder ) ) (otherlv_3= ',' ( (lv_parameterElementholder_4_0= ruleParameterElementHolder ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NAMEWITHWC||LA4_0==21||LA4_0==24||LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:240:2: ( (lv_parameterElementholder_2_0= ruleParameterElementHolder ) ) (otherlv_3= ',' ( (lv_parameterElementholder_4_0= ruleParameterElementHolder ) ) )*
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:240:2: ( (lv_parameterElementholder_2_0= ruleParameterElementHolder ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:241:1: (lv_parameterElementholder_2_0= ruleParameterElementHolder )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:241:1: (lv_parameterElementholder_2_0= ruleParameterElementHolder )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:242:3: lv_parameterElementholder_2_0= ruleParameterElementHolder
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterDefinitionAccess().getParameterElementholderParameterElementHolderParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterElementHolder_in_ruleParameterDefinition421);
                    lv_parameterElementholder_2_0=ruleParameterElementHolder();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterElementholder",
                            		lv_parameterElementholder_2_0, 
                            		"ParameterElementHolder");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:258:2: (otherlv_3= ',' ( (lv_parameterElementholder_4_0= ruleParameterElementHolder ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:258:4: otherlv_3= ',' ( (lv_parameterElementholder_4_0= ruleParameterElementHolder ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleParameterDefinition434); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getParameterDefinitionAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:262:1: ( (lv_parameterElementholder_4_0= ruleParameterElementHolder ) )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:263:1: (lv_parameterElementholder_4_0= ruleParameterElementHolder )
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:263:1: (lv_parameterElementholder_4_0= ruleParameterElementHolder )
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:264:3: lv_parameterElementholder_4_0= ruleParameterElementHolder
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterDefinitionAccess().getParameterElementholderParameterElementHolderParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterElementHolder_in_ruleParameterDefinition455);
                    	    lv_parameterElementholder_4_0=ruleParameterElementHolder();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterElementholder",
                    	            		lv_parameterElementholder_4_0, 
                    	            		"ParameterElementHolder");
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
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleParameterDefinition471); 

                	newLeafNode(otherlv_5, grammarAccess.getParameterDefinitionAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleParameterDefinition"


    // $ANTLR start "entryRuleModifierDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:292:1: entryRuleModifierDefinition returns [EObject current=null] : iv_ruleModifierDefinition= ruleModifierDefinition EOF ;
    public final EObject entryRuleModifierDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierDefinition = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:293:2: (iv_ruleModifierDefinition= ruleModifierDefinition EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:294:2: iv_ruleModifierDefinition= ruleModifierDefinition EOF
            {
             newCompositeNode(grammarAccess.getModifierDefinitionRule()); 
            pushFollow(FOLLOW_ruleModifierDefinition_in_entryRuleModifierDefinition507);
            iv_ruleModifierDefinition=ruleModifierDefinition();

            state._fsp--;

             current =iv_ruleModifierDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierDefinition517); 

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
    // $ANTLR end "entryRuleModifierDefinition"


    // $ANTLR start "ruleModifierDefinition"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:301:1: ruleModifierDefinition returns [EObject current=null] : ( () ( (lv_modifiers_1_0= ruleModifier ) )* ) ;
    public final EObject ruleModifierDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_modifiers_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:304:28: ( ( () ( (lv_modifiers_1_0= ruleModifier ) )* ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:305:1: ( () ( (lv_modifiers_1_0= ruleModifier ) )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:305:1: ( () ( (lv_modifiers_1_0= ruleModifier ) )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:305:2: () ( (lv_modifiers_1_0= ruleModifier ) )*
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:305:2: ()
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:306:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModifierDefinitionAccess().getModifierDefinitionAction_0(),
                        current);
                

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:311:2: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:312:1: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:312:1: (lv_modifiers_1_0= ruleModifier )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:313:3: lv_modifiers_1_0= ruleModifier
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModifierDefinitionAccess().getModifiersModifierParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifier_in_ruleModifierDefinition572);
            	    lv_modifiers_1_0=ruleModifier();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModifierDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modifiers",
            	            		lv_modifiers_1_0, 
            	            		"Modifier");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleModifierDefinition"


    // $ANTLR start "entryRuleModifier"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:337:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:338:2: (iv_ruleModifier= ruleModifier EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:339:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier609);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier619); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:346:1: ruleModifier returns [EObject current=null] : ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) ) ;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:349:28: ( ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:350:1: ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:350:1: ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 20:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:350:2: ( (lv_value_0_0= 'static' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:350:2: ( (lv_value_0_0= 'static' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:351:1: (lv_value_0_0= 'static' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:351:1: (lv_value_0_0= 'static' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:352:3: lv_value_0_0= 'static'
                    {
                    lv_value_0_0=(Token)match(input,15,FOLLOW_15_in_ruleModifier662); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:366:6: ( (lv_value_1_0= 'private' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:366:6: ( (lv_value_1_0= 'private' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:367:1: (lv_value_1_0= 'private' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:367:1: (lv_value_1_0= 'private' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:368:3: lv_value_1_0= 'private'
                    {
                    lv_value_1_0=(Token)match(input,16,FOLLOW_16_in_ruleModifier699); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:382:6: ( (lv_value_2_0= 'public' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:382:6: ( (lv_value_2_0= 'public' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:383:1: (lv_value_2_0= 'public' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:383:1: (lv_value_2_0= 'public' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:384:3: lv_value_2_0= 'public'
                    {
                    lv_value_2_0=(Token)match(input,17,FOLLOW_17_in_ruleModifier736); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:398:6: ( (lv_value_3_0= 'final' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:398:6: ( (lv_value_3_0= 'final' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:399:1: (lv_value_3_0= 'final' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:399:1: (lv_value_3_0= 'final' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:400:3: lv_value_3_0= 'final'
                    {
                    lv_value_3_0=(Token)match(input,18,FOLLOW_18_in_ruleModifier773); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:414:6: ( (lv_value_4_0= 'abstract' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:414:6: ( (lv_value_4_0= 'abstract' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:415:1: (lv_value_4_0= 'abstract' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:415:1: (lv_value_4_0= 'abstract' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:416:3: lv_value_4_0= 'abstract'
                    {
                    lv_value_4_0=(Token)match(input,19,FOLLOW_19_in_ruleModifier810); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:430:6: ( (lv_value_5_0= 'protected' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:430:6: ( (lv_value_5_0= 'protected' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:431:1: (lv_value_5_0= 'protected' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:431:1: (lv_value_5_0= 'protected' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:432:3: lv_value_5_0= 'protected'
                    {
                    lv_value_5_0=(Token)match(input,20,FOLLOW_20_in_ruleModifier847); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:453:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:454:2: (iv_ruleReturnType= ruleReturnType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:455:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_ruleReturnType_in_entryRuleReturnType896);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnType906); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:462:1: ruleReturnType returns [EObject current=null] : ( (lv_value_0_0= ruleTypeFieldValue ) ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:465:28: ( ( (lv_value_0_0= ruleTypeFieldValue ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:466:1: ( (lv_value_0_0= ruleTypeFieldValue ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:466:1: ( (lv_value_0_0= ruleTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:467:1: (lv_value_0_0= ruleTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:467:1: (lv_value_0_0= ruleTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:468:3: lv_value_0_0= ruleTypeFieldValue
            {
             
            	        newCompositeNode(grammarAccess.getReturnTypeAccess().getValueTypeFieldValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeFieldValue_in_ruleReturnType951);
            lv_value_0_0=ruleTypeFieldValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReturnTypeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"TypeFieldValue");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRuleParameterElementHolder"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:492:1: entryRuleParameterElementHolder returns [EObject current=null] : iv_ruleParameterElementHolder= ruleParameterElementHolder EOF ;
    public final EObject entryRuleParameterElementHolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterElementHolder = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:493:2: (iv_ruleParameterElementHolder= ruleParameterElementHolder EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:494:2: iv_ruleParameterElementHolder= ruleParameterElementHolder EOF
            {
             newCompositeNode(grammarAccess.getParameterElementHolderRule()); 
            pushFollow(FOLLOW_ruleParameterElementHolder_in_entryRuleParameterElementHolder986);
            iv_ruleParameterElementHolder=ruleParameterElementHolder();

            state._fsp--;

             current =iv_ruleParameterElementHolder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterElementHolder996); 

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
    // $ANTLR end "entryRuleParameterElementHolder"


    // $ANTLR start "ruleParameterElementHolder"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:501:1: ruleParameterElementHolder returns [EObject current=null] : ( ( (lv_element_0_0= ruleSingleElement ) ) | ( (lv_element_1_0= ruleMultiElement ) ) ) ;
    public final EObject ruleParameterElementHolder() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_element_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:504:28: ( ( ( (lv_element_0_0= ruleSingleElement ) ) | ( (lv_element_1_0= ruleMultiElement ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:505:1: ( ( (lv_element_0_0= ruleSingleElement ) ) | ( (lv_element_1_0= ruleMultiElement ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:505:1: ( ( (lv_element_0_0= ruleSingleElement ) ) | ( (lv_element_1_0= ruleMultiElement ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NAMEWITHWC||LA7_0==24||LA7_0==26) ) {
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:505:2: ( (lv_element_0_0= ruleSingleElement ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:505:2: ( (lv_element_0_0= ruleSingleElement ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:506:1: (lv_element_0_0= ruleSingleElement )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:506:1: (lv_element_0_0= ruleSingleElement )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:507:3: lv_element_0_0= ruleSingleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterElementHolderAccess().getElementSingleElementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSingleElement_in_ruleParameterElementHolder1042);
                    lv_element_0_0=ruleSingleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterElementHolderRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_0, 
                            		"SingleElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:524:6: ( (lv_element_1_0= ruleMultiElement ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:524:6: ( (lv_element_1_0= ruleMultiElement ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:525:1: (lv_element_1_0= ruleMultiElement )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:525:1: (lv_element_1_0= ruleMultiElement )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:526:3: lv_element_1_0= ruleMultiElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterElementHolderAccess().getElementMultiElementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiElement_in_ruleParameterElementHolder1069);
                    lv_element_1_0=ruleMultiElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterElementHolderRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_1_0, 
                            		"MultiElement");
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
    // $ANTLR end "ruleParameterElementHolder"


    // $ANTLR start "entryRuleSingleElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:550:1: entryRuleSingleElement returns [EObject current=null] : iv_ruleSingleElement= ruleSingleElement EOF ;
    public final EObject entryRuleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleElement = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:551:2: (iv_ruleSingleElement= ruleSingleElement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:552:2: iv_ruleSingleElement= ruleSingleElement EOF
            {
             newCompositeNode(grammarAccess.getSingleElementRule()); 
            pushFollow(FOLLOW_ruleSingleElement_in_entryRuleSingleElement1105);
            iv_ruleSingleElement=ruleSingleElement();

            state._fsp--;

             current =iv_ruleSingleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleElement1115); 

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
    // $ANTLR end "entryRuleSingleElement"


    // $ANTLR start "ruleSingleElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:559:1: ruleSingleElement returns [EObject current=null] : ( (lv_value_0_0= ruleParameterType ) ) ;
    public final EObject ruleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:562:28: ( ( (lv_value_0_0= ruleParameterType ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:563:1: ( (lv_value_0_0= ruleParameterType ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:563:1: ( (lv_value_0_0= ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:564:1: (lv_value_0_0= ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:564:1: (lv_value_0_0= ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:565:3: lv_value_0_0= ruleParameterType
            {
             
            	        newCompositeNode(grammarAccess.getSingleElementAccess().getValueParameterTypeParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterType_in_ruleSingleElement1160);
            lv_value_0_0=ruleParameterType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleElementRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"ParameterType");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleSingleElement"


    // $ANTLR start "entryRuleMultiElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:589:1: entryRuleMultiElement returns [EObject current=null] : iv_ruleMultiElement= ruleMultiElement EOF ;
    public final EObject entryRuleMultiElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiElement = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:590:2: (iv_ruleMultiElement= ruleMultiElement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:591:2: iv_ruleMultiElement= ruleMultiElement EOF
            {
             newCompositeNode(grammarAccess.getMultiElementRule()); 
            pushFollow(FOLLOW_ruleMultiElement_in_entryRuleMultiElement1195);
            iv_ruleMultiElement=ruleMultiElement();

            state._fsp--;

             current =iv_ruleMultiElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiElement1205); 

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
    // $ANTLR end "entryRuleMultiElement"


    // $ANTLR start "ruleMultiElement"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:598:1: ruleMultiElement returns [EObject current=null] : (otherlv_0= '{' ( (lv_elements_1_0= ruleSingleElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleMultiElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:601:28: ( (otherlv_0= '{' ( (lv_elements_1_0= ruleSingleElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )* otherlv_4= '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:602:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleSingleElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )* otherlv_4= '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:602:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleSingleElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )* otherlv_4= '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:602:3: otherlv_0= '{' ( (lv_elements_1_0= ruleSingleElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleMultiElement1242); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiElementAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:606:1: ( (lv_elements_1_0= ruleSingleElement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:607:1: (lv_elements_1_0= ruleSingleElement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:607:1: (lv_elements_1_0= ruleSingleElement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:608:3: lv_elements_1_0= ruleSingleElement
            {
             
            	        newCompositeNode(grammarAccess.getMultiElementAccess().getElementsSingleElementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleElement_in_ruleMultiElement1263);
            lv_elements_1_0=ruleSingleElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiElementRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_1_0, 
                    		"SingleElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:624:2: (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:624:4: otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleMultiElement1276); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultiElementAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:628:1: ( (lv_elements_3_0= ruleSingleElement ) )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:629:1: (lv_elements_3_0= ruleSingleElement )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:629:1: (lv_elements_3_0= ruleSingleElement )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:630:3: lv_elements_3_0= ruleSingleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiElementAccess().getElementsSingleElementParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSingleElement_in_ruleMultiElement1297);
            	    lv_elements_3_0=ruleSingleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"SingleElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMultiElement1311); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiElementAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleMultiElement"


    // $ANTLR start "entryRuleParameterType"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:658:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:659:2: (iv_ruleParameterType= ruleParameterType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:660:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_ruleParameterType_in_entryRuleParameterType1347);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterType1357); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:667:1: ruleParameterType returns [EObject current=null] : ( ( (lv_value_0_0= ruleTypeFieldValue ) ) | ( (lv_value_1_0= '..' ) ) ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:670:28: ( ( ( (lv_value_0_0= ruleTypeFieldValue ) ) | ( (lv_value_1_0= '..' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:671:1: ( ( (lv_value_0_0= ruleTypeFieldValue ) ) | ( (lv_value_1_0= '..' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:671:1: ( ( (lv_value_0_0= ruleTypeFieldValue ) ) | ( (lv_value_1_0= '..' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_NAMEWITHWC||LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:671:2: ( (lv_value_0_0= ruleTypeFieldValue ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:671:2: ( (lv_value_0_0= ruleTypeFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:672:1: (lv_value_0_0= ruleTypeFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:672:1: (lv_value_0_0= ruleTypeFieldValue )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:673:3: lv_value_0_0= ruleTypeFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterTypeAccess().getValueTypeFieldValueParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeFieldValue_in_ruleParameterType1403);
                    lv_value_0_0=ruleTypeFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"TypeFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:690:6: ( (lv_value_1_0= '..' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:690:6: ( (lv_value_1_0= '..' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:691:1: (lv_value_1_0= '..' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:691:1: (lv_value_1_0= '..' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:692:3: lv_value_1_0= '..'
                    {
                    lv_value_1_0=(Token)match(input,24,FOLLOW_24_in_ruleParameterType1427); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:713:1: entryRuleThrows returns [EObject current=null] : iv_ruleThrows= ruleThrows EOF ;
    public final EObject entryRuleThrows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrows = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:714:2: (iv_ruleThrows= ruleThrows EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:715:2: iv_ruleThrows= ruleThrows EOF
            {
             newCompositeNode(grammarAccess.getThrowsRule()); 
            pushFollow(FOLLOW_ruleThrows_in_entryRuleThrows1476);
            iv_ruleThrows=ruleThrows();

            state._fsp--;

             current =iv_ruleThrows; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrows1486); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:722:1: ruleThrows returns [EObject current=null] : (otherlv_0= 'throws' ( (lv_value_1_0= ruleTypeFieldValue ) ) ) ;
    public final EObject ruleThrows() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:725:28: ( (otherlv_0= 'throws' ( (lv_value_1_0= ruleTypeFieldValue ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:726:1: (otherlv_0= 'throws' ( (lv_value_1_0= ruleTypeFieldValue ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:726:1: (otherlv_0= 'throws' ( (lv_value_1_0= ruleTypeFieldValue ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:726:3: otherlv_0= 'throws' ( (lv_value_1_0= ruleTypeFieldValue ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleThrows1523); 

                	newLeafNode(otherlv_0, grammarAccess.getThrowsAccess().getThrowsKeyword_0());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:730:1: ( (lv_value_1_0= ruleTypeFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:731:1: (lv_value_1_0= ruleTypeFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:731:1: (lv_value_1_0= ruleTypeFieldValue )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:732:3: lv_value_1_0= ruleTypeFieldValue
            {
             
            	        newCompositeNode(grammarAccess.getThrowsAccess().getValueTypeFieldValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeFieldValue_in_ruleThrows1544);
            lv_value_1_0=ruleTypeFieldValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getThrowsRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"TypeFieldValue");
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
    // $ANTLR end "ruleThrows"


    // $ANTLR start "entryRuleMethodName"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:756:1: entryRuleMethodName returns [EObject current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final EObject entryRuleMethodName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:757:2: (iv_ruleMethodName= ruleMethodName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:758:2: iv_ruleMethodName= ruleMethodName EOF
            {
             newCompositeNode(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName1580);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;

             current =iv_ruleMethodName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName1590); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:765:1: ruleMethodName returns [EObject current=null] : ( (lv_value_0_0= ruleSimpleFieldValue ) ) ;
    public final EObject ruleMethodName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:768:28: ( ( (lv_value_0_0= ruleSimpleFieldValue ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:769:1: ( (lv_value_0_0= ruleSimpleFieldValue ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:769:1: ( (lv_value_0_0= ruleSimpleFieldValue ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:770:1: (lv_value_0_0= ruleSimpleFieldValue )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:770:1: (lv_value_0_0= ruleSimpleFieldValue )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:771:3: lv_value_0_0= ruleSimpleFieldValue
            {
             
            	        newCompositeNode(grammarAccess.getMethodNameAccess().getValueSimpleFieldValueParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_ruleMethodName1635);
            lv_value_0_0=ruleSimpleFieldValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodNameRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"SimpleFieldValue");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRuleSimpleFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:795:1: entryRuleSimpleFieldValue returns [String current=null] : iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF ;
    public final String entryRuleSimpleFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:796:2: (iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:797:2: iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleFieldValueRule()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue1671);
            iv_ruleSimpleFieldValue=ruleSimpleFieldValue();

            state._fsp--;

             current =iv_ruleSimpleFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldValue1682); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:804:1: ruleSimpleFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleSimpleFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:807:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:808:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue1721); 

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


    // $ANTLR start "entryRuleTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:823:1: entryRuleTypeFieldValue returns [String current=null] : iv_ruleTypeFieldValue= ruleTypeFieldValue EOF ;
    public final String entryRuleTypeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:824:2: (iv_ruleTypeFieldValue= ruleTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:825:2: iv_ruleTypeFieldValue= ruleTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue1766);
            iv_ruleTypeFieldValue=ruleTypeFieldValue();

            state._fsp--;

             current =iv_ruleTypeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldValue1777); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:832:1: ruleTypeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | this_NameWithWC_1= RULE_NAMEWITHWC ) ;
    public final AntlrDatatypeRuleToken ruleTypeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NameWithWC_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:835:28: ( (kw= 'void' | this_NameWithWC_1= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:836:1: (kw= 'void' | this_NameWithWC_1= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:836:1: (kw= 'void' | this_NameWithWC_1= RULE_NAMEWITHWC )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_NAMEWITHWC) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:837:2: kw= 'void'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleTypeFieldValue1815); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeFieldValueAccess().getVoidKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:843:10: this_NameWithWC_1= RULE_NAMEWITHWC
                    {
                    this_NameWithWC_1=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue1836); 

                    		current.merge(this_NameWithWC_1);
                        
                     
                        newLeafNode(this_NameWithWC_1, grammarAccess.getTypeFieldValueAccess().getNameWithWCTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleTypeFieldValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMethodPattern_in_entryRuleMethodPattern75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodPattern85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodPatternDefinition_in_ruleMethodPattern130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodPatternDefinition_in_entryRuleMethodPatternDefinition165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodPatternDefinition175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierDefinition_in_ruleMethodPatternDefinition221 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleMethodPatternDefinition242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodPatternDefinition263 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_ruleParameterDefinition_in_ruleMethodPatternDefinition284 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleThrows_in_ruleMethodPatternDefinition306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDefinition_in_entryRuleParameterDefinition343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDefinition353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleParameterDefinition399 = new BitSet(new long[]{0x0000000005204010L});
    public static final BitSet FOLLOW_ruleParameterElementHolder_in_ruleParameterDefinition421 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleParameterDefinition434 = new BitSet(new long[]{0x0000000005200010L});
    public static final BitSet FOLLOW_ruleParameterElementHolder_in_ruleParameterDefinition455 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleParameterDefinition471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierDefinition_in_entryRuleModifierDefinition507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierDefinition517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleModifierDefinition572 = new BitSet(new long[]{0x00000000001F8002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModifier662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleModifier699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleModifier736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModifier773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModifier810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleModifier847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_entryRuleReturnType896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnType906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_ruleReturnType951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElementHolder_in_entryRuleParameterElementHolder986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterElementHolder996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_ruleParameterElementHolder1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiElement_in_ruleParameterElementHolder1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_entryRuleSingleElement1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleElement1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleSingleElement1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiElement_in_entryRuleMultiElement1195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiElement1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMultiElement1242 = new BitSet(new long[]{0x0000000005000010L});
    public static final BitSet FOLLOW_ruleSingleElement_in_ruleMultiElement1263 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleMultiElement1276 = new BitSet(new long[]{0x0000000005000010L});
    public static final BitSet FOLLOW_ruleSingleElement_in_ruleMultiElement1297 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleMultiElement1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_entryRuleParameterType1347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterType1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_ruleParameterType1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleParameterType1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_entryRuleThrows1476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrows1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleThrows1523 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_ruleThrows1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_ruleMethodName1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldValue1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue1766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldValue1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeFieldValue1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue1836 = new BitSet(new long[]{0x0000000000000002L});

}