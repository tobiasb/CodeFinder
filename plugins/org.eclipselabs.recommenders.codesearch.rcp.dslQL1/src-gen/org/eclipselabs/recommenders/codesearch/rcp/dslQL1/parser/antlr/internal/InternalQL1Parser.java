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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "','", "')'", "'static'", "'private'", "'public'", "'final'", "'abstract'", "'protected'", "'{'", "'|'", "'}'", "'..'", "'throws'"
    };
    public static final int RULE_ID=5;
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:115:1: ruleMethodPatternDefinition returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )? ( (lv_throwsClause_4_0= ruleThrows ) )? ) ;
    public final EObject ruleMethodPatternDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_modifiers_0_0 = null;

        EObject lv_returnType_1_0 = null;

        EObject lv_methodName_2_0 = null;

        EObject lv_parameterDefinition_3_0 = null;

        EObject lv_throwsClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:118:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )? ( (lv_throwsClause_4_0= ruleThrows ) )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:119:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )? ( (lv_throwsClause_4_0= ruleThrows ) )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:119:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )? ( (lv_throwsClause_4_0= ruleThrows ) )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:119:2: ( (lv_modifiers_0_0= ruleModifier ) )* ( (lv_returnType_1_0= ruleReturnType ) ) ( (lv_methodName_2_0= ruleMethodName ) ) ( (lv_parameterDefinition_3_0= ruleParameterDefinition ) )? ( (lv_throwsClause_4_0= ruleThrows ) )?
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:119:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:120:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:120:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:121:3: lv_modifiers_0_0= ruleModifier
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getModifiersModifierParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifier_in_ruleMethodPatternDefinition221);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:137:3: ( (lv_returnType_1_0= ruleReturnType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:138:1: (lv_returnType_1_0= ruleReturnType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:138:1: (lv_returnType_1_0= ruleReturnType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:139:3: lv_returnType_1_0= ruleReturnType
            {
             
            	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getReturnTypeReturnTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReturnType_in_ruleMethodPatternDefinition243);
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
            	    
            pushFollow(FOLLOW_ruleMethodName_in_ruleMethodPatternDefinition264);
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
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:174:1: (lv_parameterDefinition_3_0= ruleParameterDefinition )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:174:1: (lv_parameterDefinition_3_0= ruleParameterDefinition )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:175:3: lv_parameterDefinition_3_0= ruleParameterDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getParameterDefinitionParameterDefinitionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterDefinition_in_ruleMethodPatternDefinition285);
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
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:192:1: (lv_throwsClause_4_0= ruleThrows )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:192:1: (lv_throwsClause_4_0= ruleThrows )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:193:3: lv_throwsClause_4_0= ruleThrows
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleThrows_in_ruleMethodPatternDefinition307);
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
            pushFollow(FOLLOW_ruleParameterDefinition_in_entryRuleParameterDefinition344);
            iv_ruleParameterDefinition=ruleParameterDefinition();

            state._fsp--;

             current =iv_ruleParameterDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDefinition354); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:226:1: ruleParameterDefinition returns [EObject current=null] : (otherlv_0= '(' ( (lv_parameterElementholder_1_0= ruleParameterElementHolder ) ) (otherlv_2= ',' ( (lv_parameterElementholder_3_0= ruleParameterElementHolder ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterElementholder_1_0 = null;

        EObject lv_parameterElementholder_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:229:28: ( (otherlv_0= '(' ( (lv_parameterElementholder_1_0= ruleParameterElementHolder ) ) (otherlv_2= ',' ( (lv_parameterElementholder_3_0= ruleParameterElementHolder ) ) )* otherlv_4= ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:230:1: (otherlv_0= '(' ( (lv_parameterElementholder_1_0= ruleParameterElementHolder ) ) (otherlv_2= ',' ( (lv_parameterElementholder_3_0= ruleParameterElementHolder ) ) )* otherlv_4= ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:230:1: (otherlv_0= '(' ( (lv_parameterElementholder_1_0= ruleParameterElementHolder ) ) (otherlv_2= ',' ( (lv_parameterElementholder_3_0= ruleParameterElementHolder ) ) )* otherlv_4= ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:230:3: otherlv_0= '(' ( (lv_parameterElementholder_1_0= ruleParameterElementHolder ) ) (otherlv_2= ',' ( (lv_parameterElementholder_3_0= ruleParameterElementHolder ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleParameterDefinition391); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterDefinitionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:234:1: ( (lv_parameterElementholder_1_0= ruleParameterElementHolder ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:235:1: (lv_parameterElementholder_1_0= ruleParameterElementHolder )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:235:1: (lv_parameterElementholder_1_0= ruleParameterElementHolder )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:236:3: lv_parameterElementholder_1_0= ruleParameterElementHolder
            {
             
            	        newCompositeNode(grammarAccess.getParameterDefinitionAccess().getParameterElementholderParameterElementHolderParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterElementHolder_in_ruleParameterDefinition412);
            lv_parameterElementholder_1_0=ruleParameterElementHolder();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
            	        }
                   		add(
                   			current, 
                   			"parameterElementholder",
                    		lv_parameterElementholder_1_0, 
                    		"ParameterElementHolder");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:252:2: (otherlv_2= ',' ( (lv_parameterElementholder_3_0= ruleParameterElementHolder ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:252:4: otherlv_2= ',' ( (lv_parameterElementholder_3_0= ruleParameterElementHolder ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleParameterDefinition425); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParameterDefinitionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:256:1: ( (lv_parameterElementholder_3_0= ruleParameterElementHolder ) )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:257:1: (lv_parameterElementholder_3_0= ruleParameterElementHolder )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:257:1: (lv_parameterElementholder_3_0= ruleParameterElementHolder )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:258:3: lv_parameterElementholder_3_0= ruleParameterElementHolder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterDefinitionAccess().getParameterElementholderParameterElementHolderParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterElementHolder_in_ruleParameterDefinition446);
            	    lv_parameterElementholder_3_0=ruleParameterElementHolder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameterElementholder",
            	            		lv_parameterElementholder_3_0, 
            	            		"ParameterElementHolder");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleParameterDefinition460); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterDefinitionAccess().getRightParenthesisKeyword_3());
                

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


    // $ANTLR start "entryRuleModifier"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:286:1: entryRuleModifier returns [EObject current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final EObject entryRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifier = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:287:2: (iv_ruleModifier= ruleModifier EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:288:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier496);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier506); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:295:1: ruleModifier returns [EObject current=null] : ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) ) ;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:298:28: ( ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:299:1: ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:299:1: ( ( (lv_value_0_0= 'static' ) ) | ( (lv_value_1_0= 'private' ) ) | ( (lv_value_2_0= 'public' ) ) | ( (lv_value_3_0= 'final' ) ) | ( (lv_value_4_0= 'abstract' ) ) | ( (lv_value_5_0= 'protected' ) ) )
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:299:2: ( (lv_value_0_0= 'static' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:299:2: ( (lv_value_0_0= 'static' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:300:1: (lv_value_0_0= 'static' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:300:1: (lv_value_0_0= 'static' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:301:3: lv_value_0_0= 'static'
                    {
                    lv_value_0_0=(Token)match(input,15,FOLLOW_15_in_ruleModifier549); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:315:6: ( (lv_value_1_0= 'private' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:315:6: ( (lv_value_1_0= 'private' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:316:1: (lv_value_1_0= 'private' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:316:1: (lv_value_1_0= 'private' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:317:3: lv_value_1_0= 'private'
                    {
                    lv_value_1_0=(Token)match(input,16,FOLLOW_16_in_ruleModifier586); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:331:6: ( (lv_value_2_0= 'public' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:331:6: ( (lv_value_2_0= 'public' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:332:1: (lv_value_2_0= 'public' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:332:1: (lv_value_2_0= 'public' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:333:3: lv_value_2_0= 'public'
                    {
                    lv_value_2_0=(Token)match(input,17,FOLLOW_17_in_ruleModifier623); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:347:6: ( (lv_value_3_0= 'final' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:347:6: ( (lv_value_3_0= 'final' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:348:1: (lv_value_3_0= 'final' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:348:1: (lv_value_3_0= 'final' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:349:3: lv_value_3_0= 'final'
                    {
                    lv_value_3_0=(Token)match(input,18,FOLLOW_18_in_ruleModifier660); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:363:6: ( (lv_value_4_0= 'abstract' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:363:6: ( (lv_value_4_0= 'abstract' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:364:1: (lv_value_4_0= 'abstract' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:364:1: (lv_value_4_0= 'abstract' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:365:3: lv_value_4_0= 'abstract'
                    {
                    lv_value_4_0=(Token)match(input,19,FOLLOW_19_in_ruleModifier697); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:379:6: ( (lv_value_5_0= 'protected' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:379:6: ( (lv_value_5_0= 'protected' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:380:1: (lv_value_5_0= 'protected' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:380:1: (lv_value_5_0= 'protected' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:381:3: lv_value_5_0= 'protected'
                    {
                    lv_value_5_0=(Token)match(input,20,FOLLOW_20_in_ruleModifier734); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:402:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:403:2: (iv_ruleReturnType= ruleReturnType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:404:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_ruleReturnType_in_entryRuleReturnType783);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnType793); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:411:1: ruleReturnType returns [EObject current=null] : ( (lv_value_0_0= RULE_NAMEWITHWC ) ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:414:28: ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:415:1: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:415:1: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:416:1: (lv_value_0_0= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:416:1: (lv_value_0_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:417:3: lv_value_0_0= RULE_NAMEWITHWC
            {
            lv_value_0_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleReturnType834); 

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


    // $ANTLR start "entryRuleParameterElementHolder"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:441:1: entryRuleParameterElementHolder returns [EObject current=null] : iv_ruleParameterElementHolder= ruleParameterElementHolder EOF ;
    public final EObject entryRuleParameterElementHolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterElementHolder = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:442:2: (iv_ruleParameterElementHolder= ruleParameterElementHolder EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:443:2: iv_ruleParameterElementHolder= ruleParameterElementHolder EOF
            {
             newCompositeNode(grammarAccess.getParameterElementHolderRule()); 
            pushFollow(FOLLOW_ruleParameterElementHolder_in_entryRuleParameterElementHolder874);
            iv_ruleParameterElementHolder=ruleParameterElementHolder();

            state._fsp--;

             current =iv_ruleParameterElementHolder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterElementHolder884); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:450:1: ruleParameterElementHolder returns [EObject current=null] : ( ( (lv_element_0_0= ruleSingleElement ) ) | ( (lv_element_1_0= ruleMultiElement ) ) ) ;
    public final EObject ruleParameterElementHolder() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_element_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:453:28: ( ( ( (lv_element_0_0= ruleSingleElement ) ) | ( (lv_element_1_0= ruleMultiElement ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:454:1: ( ( (lv_element_0_0= ruleSingleElement ) ) | ( (lv_element_1_0= ruleMultiElement ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:454:1: ( ( (lv_element_0_0= ruleSingleElement ) ) | ( (lv_element_1_0= ruleMultiElement ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_NAMEWITHWC||LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:454:2: ( (lv_element_0_0= ruleSingleElement ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:454:2: ( (lv_element_0_0= ruleSingleElement ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:455:1: (lv_element_0_0= ruleSingleElement )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:455:1: (lv_element_0_0= ruleSingleElement )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:456:3: lv_element_0_0= ruleSingleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterElementHolderAccess().getElementSingleElementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSingleElement_in_ruleParameterElementHolder930);
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:473:6: ( (lv_element_1_0= ruleMultiElement ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:473:6: ( (lv_element_1_0= ruleMultiElement ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:474:1: (lv_element_1_0= ruleMultiElement )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:474:1: (lv_element_1_0= ruleMultiElement )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:475:3: lv_element_1_0= ruleMultiElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterElementHolderAccess().getElementMultiElementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiElement_in_ruleParameterElementHolder957);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:499:1: entryRuleSingleElement returns [EObject current=null] : iv_ruleSingleElement= ruleSingleElement EOF ;
    public final EObject entryRuleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleElement = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:500:2: (iv_ruleSingleElement= ruleSingleElement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:501:2: iv_ruleSingleElement= ruleSingleElement EOF
            {
             newCompositeNode(grammarAccess.getSingleElementRule()); 
            pushFollow(FOLLOW_ruleSingleElement_in_entryRuleSingleElement993);
            iv_ruleSingleElement=ruleSingleElement();

            state._fsp--;

             current =iv_ruleSingleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleElement1003); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:508:1: ruleSingleElement returns [EObject current=null] : ( (lv_value_0_0= ruleParameterType ) ) ;
    public final EObject ruleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:511:28: ( ( (lv_value_0_0= ruleParameterType ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:512:1: ( (lv_value_0_0= ruleParameterType ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:512:1: ( (lv_value_0_0= ruleParameterType ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:513:1: (lv_value_0_0= ruleParameterType )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:513:1: (lv_value_0_0= ruleParameterType )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:514:3: lv_value_0_0= ruleParameterType
            {
             
            	        newCompositeNode(grammarAccess.getSingleElementAccess().getValueParameterTypeParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterType_in_ruleSingleElement1048);
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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:538:1: entryRuleMultiElement returns [EObject current=null] : iv_ruleMultiElement= ruleMultiElement EOF ;
    public final EObject entryRuleMultiElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiElement = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:539:2: (iv_ruleMultiElement= ruleMultiElement EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:540:2: iv_ruleMultiElement= ruleMultiElement EOF
            {
             newCompositeNode(grammarAccess.getMultiElementRule()); 
            pushFollow(FOLLOW_ruleMultiElement_in_entryRuleMultiElement1083);
            iv_ruleMultiElement=ruleMultiElement();

            state._fsp--;

             current =iv_ruleMultiElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiElement1093); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:547:1: ruleMultiElement returns [EObject current=null] : (otherlv_0= '{' ( (lv_elements_1_0= ruleSingleElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleMultiElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:550:28: ( (otherlv_0= '{' ( (lv_elements_1_0= ruleSingleElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )* otherlv_4= '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:551:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleSingleElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )* otherlv_4= '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:551:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleSingleElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )* otherlv_4= '}' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:551:3: otherlv_0= '{' ( (lv_elements_1_0= ruleSingleElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleMultiElement1130); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiElementAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:555:1: ( (lv_elements_1_0= ruleSingleElement ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:556:1: (lv_elements_1_0= ruleSingleElement )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:556:1: (lv_elements_1_0= ruleSingleElement )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:557:3: lv_elements_1_0= ruleSingleElement
            {
             
            	        newCompositeNode(grammarAccess.getMultiElementAccess().getElementsSingleElementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleElement_in_ruleMultiElement1151);
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:573:2: (otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:573:4: otherlv_2= '|' ( (lv_elements_3_0= ruleSingleElement ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleMultiElement1164); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultiElementAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:577:1: ( (lv_elements_3_0= ruleSingleElement ) )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:578:1: (lv_elements_3_0= ruleSingleElement )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:578:1: (lv_elements_3_0= ruleSingleElement )
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:579:3: lv_elements_3_0= ruleSingleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiElementAccess().getElementsSingleElementParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSingleElement_in_ruleMultiElement1185);
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
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMultiElement1199); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:607:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:608:2: (iv_ruleParameterType= ruleParameterType EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:609:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_ruleParameterType_in_entryRuleParameterType1235);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterType1245); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:616:1: ruleParameterType returns [EObject current=null] : ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) | ( (lv_value_1_0= '..' ) ) ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:619:28: ( ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) | ( (lv_value_1_0= '..' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:620:1: ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) | ( (lv_value_1_0= '..' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:620:1: ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) | ( (lv_value_1_0= '..' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NAMEWITHWC) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:620:2: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:620:2: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:621:1: (lv_value_0_0= RULE_NAMEWITHWC )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:621:1: (lv_value_0_0= RULE_NAMEWITHWC )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:622:3: lv_value_0_0= RULE_NAMEWITHWC
                    {
                    lv_value_0_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleParameterType1287); 

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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:639:6: ( (lv_value_1_0= '..' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:639:6: ( (lv_value_1_0= '..' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:640:1: (lv_value_1_0= '..' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:640:1: (lv_value_1_0= '..' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:641:3: lv_value_1_0= '..'
                    {
                    lv_value_1_0=(Token)match(input,24,FOLLOW_24_in_ruleParameterType1316); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:662:1: entryRuleThrows returns [EObject current=null] : iv_ruleThrows= ruleThrows EOF ;
    public final EObject entryRuleThrows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrows = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:663:2: (iv_ruleThrows= ruleThrows EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:664:2: iv_ruleThrows= ruleThrows EOF
            {
             newCompositeNode(grammarAccess.getThrowsRule()); 
            pushFollow(FOLLOW_ruleThrows_in_entryRuleThrows1365);
            iv_ruleThrows=ruleThrows();

            state._fsp--;

             current =iv_ruleThrows; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrows1375); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:671:1: ruleThrows returns [EObject current=null] : (otherlv_0= 'throws' ( (lv_value_1_0= RULE_NAMEWITHWC ) ) ) ;
    public final EObject ruleThrows() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:674:28: ( (otherlv_0= 'throws' ( (lv_value_1_0= RULE_NAMEWITHWC ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:675:1: (otherlv_0= 'throws' ( (lv_value_1_0= RULE_NAMEWITHWC ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:675:1: (otherlv_0= 'throws' ( (lv_value_1_0= RULE_NAMEWITHWC ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:675:3: otherlv_0= 'throws' ( (lv_value_1_0= RULE_NAMEWITHWC ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleThrows1412); 

                	newLeafNode(otherlv_0, grammarAccess.getThrowsAccess().getThrowsKeyword_0());
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:679:1: ( (lv_value_1_0= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:680:1: (lv_value_1_0= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:680:1: (lv_value_1_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:681:3: lv_value_1_0= RULE_NAMEWITHWC
            {
            lv_value_1_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleThrows1429); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:705:1: entryRuleMethodName returns [EObject current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final EObject entryRuleMethodName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:706:2: (iv_ruleMethodName= ruleMethodName EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:707:2: iv_ruleMethodName= ruleMethodName EOF
            {
             newCompositeNode(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName1470);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;

             current =iv_ruleMethodName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName1480); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:714:1: ruleMethodName returns [EObject current=null] : ( (lv_value_0_0= RULE_NAMEWITHWC ) ) ;
    public final EObject ruleMethodName() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:717:28: ( ( (lv_value_0_0= RULE_NAMEWITHWC ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:718:1: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:718:1: ( (lv_value_0_0= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:719:1: (lv_value_0_0= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:719:1: (lv_value_0_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:720:3: lv_value_0_0= RULE_NAMEWITHWC
            {
            lv_value_0_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethodName1521); 

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
    public static final BitSet FOLLOW_ruleMethodPatternDefinition_in_ruleMethodPattern130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodPatternDefinition_in_entryRuleMethodPatternDefinition165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodPatternDefinition175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMethodPatternDefinition221 = new BitSet(new long[]{0x00000000001F8010L});
    public static final BitSet FOLLOW_ruleReturnType_in_ruleMethodPatternDefinition243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodPatternDefinition264 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_ruleParameterDefinition_in_ruleMethodPatternDefinition285 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleThrows_in_ruleMethodPatternDefinition307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDefinition_in_entryRuleParameterDefinition344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDefinition354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleParameterDefinition391 = new BitSet(new long[]{0x0000000001200010L});
    public static final BitSet FOLLOW_ruleParameterElementHolder_in_ruleParameterDefinition412 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleParameterDefinition425 = new BitSet(new long[]{0x0000000001200010L});
    public static final BitSet FOLLOW_ruleParameterElementHolder_in_ruleParameterDefinition446 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleParameterDefinition460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModifier549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleModifier586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleModifier623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModifier660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModifier697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleModifier734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnType_in_entryRuleReturnType783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnType793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleReturnType834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterElementHolder_in_entryRuleParameterElementHolder874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterElementHolder884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_ruleParameterElementHolder930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiElement_in_ruleParameterElementHolder957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleElement_in_entryRuleSingleElement993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleElement1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleSingleElement1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiElement_in_entryRuleMultiElement1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiElement1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMultiElement1130 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleSingleElement_in_ruleMultiElement1151 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleMultiElement1164 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleSingleElement_in_ruleMultiElement1185 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleMultiElement1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_entryRuleParameterType1235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterType1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleParameterType1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleParameterType1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrows_in_entryRuleThrows1365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrows1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleThrows1412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleThrows1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName1470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethodName1521 = new BitSet(new long[]{0x0000000000000002L});

}