/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.services.LuceneFieldsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuceneFieldsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'{'", "'}'", "'('", "')'", "'='", "','", "'type'", "'method'", "'field'", "'trycatch'", "'varusage'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLuceneFieldsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLuceneFieldsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLuceneFieldsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g"; }



     	private LuceneFieldsGrammarAccess grammarAccess;
     	
        public InternalLuceneFieldsParser(TokenStream input, LuceneFieldsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected LuceneFieldsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'class' ( (lv_className_1_0= RULE_ID ) ) ( (lv_fieldCategories_2_0= ruleFieldCategory ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_className_1_0=null;
        EObject lv_fieldCategories_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:79:28: ( (otherlv_0= 'class' ( (lv_className_1_0= RULE_ID ) ) ( (lv_fieldCategories_2_0= ruleFieldCategory ) )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:80:1: (otherlv_0= 'class' ( (lv_className_1_0= RULE_ID ) ) ( (lv_fieldCategories_2_0= ruleFieldCategory ) )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:80:1: (otherlv_0= 'class' ( (lv_className_1_0= RULE_ID ) ) ( (lv_fieldCategories_2_0= ruleFieldCategory ) )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:80:3: otherlv_0= 'class' ( (lv_className_1_0= RULE_ID ) ) ( (lv_fieldCategories_2_0= ruleFieldCategory ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getClassKeyword_0());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:84:1: ( (lv_className_1_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:85:1: (lv_className_1_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:85:1: (lv_className_1_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:86:3: lv_className_1_0= RULE_ID
            {
            lv_className_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_className_1_0, grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"className",
                    		lv_className_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:102:2: ( (lv_fieldCategories_2_0= ruleFieldCategory ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:103:1: (lv_fieldCategories_2_0= ruleFieldCategory )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:103:1: (lv_fieldCategories_2_0= ruleFieldCategory )
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:104:3: lv_fieldCategories_2_0= ruleFieldCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFieldCategoriesFieldCategoryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldCategory_in_ruleModel165);
            	    lv_fieldCategories_2_0=ruleFieldCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fieldCategories",
            	            		lv_fieldCategories_2_0, 
            	            		"FieldCategory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFieldCategory"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:128:1: entryRuleFieldCategory returns [EObject current=null] : iv_ruleFieldCategory= ruleFieldCategory EOF ;
    public final EObject entryRuleFieldCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldCategory = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:129:2: (iv_ruleFieldCategory= ruleFieldCategory EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:130:2: iv_ruleFieldCategory= ruleFieldCategory EOF
            {
             newCompositeNode(grammarAccess.getFieldCategoryRule()); 
            pushFollow(FOLLOW_ruleFieldCategory_in_entryRuleFieldCategory202);
            iv_ruleFieldCategory=ruleFieldCategory();

            state._fsp--;

             current =iv_ruleFieldCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldCategory212); 

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
    // $ANTLR end "entryRuleFieldCategory"


    // $ANTLR start "ruleFieldCategory"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:137:1: ruleFieldCategory returns [EObject current=null] : ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_fields_2_0= ruleField ) )* otherlv_3= '}' (otherlv_4= '(' ( (lv_desc_5_0= RULE_STRING ) ) otherlv_6= ')' )? ) ;
    public final EObject ruleFieldCategory() throws RecognitionException {
        EObject current = null;

        Token lv_categoryName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_desc_5_0=null;
        Token otherlv_6=null;
        EObject lv_fields_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:140:28: ( ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_fields_2_0= ruleField ) )* otherlv_3= '}' (otherlv_4= '(' ( (lv_desc_5_0= RULE_STRING ) ) otherlv_6= ')' )? ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:141:1: ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_fields_2_0= ruleField ) )* otherlv_3= '}' (otherlv_4= '(' ( (lv_desc_5_0= RULE_STRING ) ) otherlv_6= ')' )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:141:1: ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_fields_2_0= ruleField ) )* otherlv_3= '}' (otherlv_4= '(' ( (lv_desc_5_0= RULE_STRING ) ) otherlv_6= ')' )? )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:141:2: ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_fields_2_0= ruleField ) )* otherlv_3= '}' (otherlv_4= '(' ( (lv_desc_5_0= RULE_STRING ) ) otherlv_6= ')' )?
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:141:2: ( (lv_categoryName_0_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:142:1: (lv_categoryName_0_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:142:1: (lv_categoryName_0_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:143:3: lv_categoryName_0_0= RULE_ID
            {
            lv_categoryName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldCategory254); 

            			newLeafNode(lv_categoryName_0_0, grammarAccess.getFieldCategoryAccess().getCategoryNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"categoryName",
                    		lv_categoryName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleFieldCategory271); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldCategoryAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:163:1: ( (lv_fields_2_0= ruleField ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:164:1: (lv_fields_2_0= ruleField )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:164:1: (lv_fields_2_0= ruleField )
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:165:3: lv_fields_2_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldCategoryAccess().getFieldsFieldParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleFieldCategory292);
            	    lv_fields_2_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldCategoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_2_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFieldCategory305); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldCategoryAccess().getRightCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:185:1: (otherlv_4= '(' ( (lv_desc_5_0= RULE_STRING ) ) otherlv_6= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:185:3: otherlv_4= '(' ( (lv_desc_5_0= RULE_STRING ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleFieldCategory318); 

                        	newLeafNode(otherlv_4, grammarAccess.getFieldCategoryAccess().getLeftParenthesisKeyword_4_0());
                        
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:189:1: ( (lv_desc_5_0= RULE_STRING ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:190:1: (lv_desc_5_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:190:1: (lv_desc_5_0= RULE_STRING )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:191:3: lv_desc_5_0= RULE_STRING
                    {
                    lv_desc_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFieldCategory335); 

                    			newLeafNode(lv_desc_5_0, grammarAccess.getFieldCategoryAccess().getDescSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldCategoryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"desc",
                            		lv_desc_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleFieldCategory352); 

                        	newLeafNode(otherlv_6, grammarAccess.getFieldCategoryAccess().getRightParenthesisKeyword_4_2());
                        

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
    // $ANTLR end "ruleFieldCategory"


    // $ANTLR start "entryRuleField"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:219:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:220:2: (iv_ruleField= ruleField EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:221:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField390);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField400); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:228:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* otherlv_7= '}' (otherlv_8= '(' ( (lv_desc_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_desc_9_0=null;
        Token otherlv_10=null;
        EObject lv_types_4_0 = null;

        EObject lv_types_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:231:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* otherlv_7= '}' (otherlv_8= '(' ( (lv_desc_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:232:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* otherlv_7= '}' (otherlv_8= '(' ( (lv_desc_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:232:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* otherlv_7= '}' (otherlv_8= '(' ( (lv_desc_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:232:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* otherlv_7= '}' (otherlv_8= '(' ( (lv_desc_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:232:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:233:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:233:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:234:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField442); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleField459); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getEqualsSignKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:254:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:255:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:255:1: (lv_value_2_0= RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:256:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField476); 

            			newLeafNode(lv_value_2_0, grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleField493); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:276:1: ( (lv_types_4_0= ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:277:1: (lv_types_4_0= ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:277:1: (lv_types_4_0= ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:278:3: lv_types_4_0= ruleFieldType
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFieldType_in_ruleField514);
            lv_types_4_0=ruleFieldType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		add(
                   			current, 
                   			"types",
                    		lv_types_4_0, 
                    		"FieldType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:294:2: (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:294:4: otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleField527); 

            	        	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:298:1: ( (lv_types_6_0= ruleFieldType ) )
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:299:1: (lv_types_6_0= ruleFieldType )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:299:1: (lv_types_6_0= ruleFieldType )
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:300:3: lv_types_6_0= ruleFieldType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldType_in_ruleField548);
            	    lv_types_6_0=ruleFieldType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_6_0, 
            	            		"FieldType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleField562); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_6());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:320:1: (otherlv_8= '(' ( (lv_desc_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:320:3: otherlv_8= '(' ( (lv_desc_9_0= RULE_STRING ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleField575); 

                        	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getLeftParenthesisKeyword_7_0());
                        
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:324:1: ( (lv_desc_9_0= RULE_STRING ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:325:1: (lv_desc_9_0= RULE_STRING )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:325:1: (lv_desc_9_0= RULE_STRING )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:326:3: lv_desc_9_0= RULE_STRING
                    {
                    lv_desc_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField592); 

                    			newLeafNode(lv_desc_9_0, grammarAccess.getFieldAccess().getDescSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"desc",
                            		lv_desc_9_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleField609); 

                        	newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getRightParenthesisKeyword_7_2());
                        

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:354:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:355:2: (iv_ruleFieldType= ruleFieldType EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:356:2: iv_ruleFieldType= ruleFieldType EOF
            {
             newCompositeNode(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType647);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;

             current =iv_ruleFieldType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType657); 

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
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:363:1: ruleFieldType returns [EObject current=null] : ( ( (lv_type_0_0= 'type' ) ) | ( (lv_method_1_0= 'method' ) ) | ( (lv_field_2_0= 'field' ) ) | ( (lv_trycatch_3_0= 'trycatch' ) ) | ( (lv_varusage_4_0= 'varusage' ) ) ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_method_1_0=null;
        Token lv_field_2_0=null;
        Token lv_trycatch_3_0=null;
        Token lv_varusage_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:366:28: ( ( ( (lv_type_0_0= 'type' ) ) | ( (lv_method_1_0= 'method' ) ) | ( (lv_field_2_0= 'field' ) ) | ( (lv_trycatch_3_0= 'trycatch' ) ) | ( (lv_varusage_4_0= 'varusage' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:367:1: ( ( (lv_type_0_0= 'type' ) ) | ( (lv_method_1_0= 'method' ) ) | ( (lv_field_2_0= 'field' ) ) | ( (lv_trycatch_3_0= 'trycatch' ) ) | ( (lv_varusage_4_0= 'varusage' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:367:1: ( ( (lv_type_0_0= 'type' ) ) | ( (lv_method_1_0= 'method' ) ) | ( (lv_field_2_0= 'field' ) ) | ( (lv_trycatch_3_0= 'trycatch' ) ) | ( (lv_varusage_4_0= 'varusage' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:367:2: ( (lv_type_0_0= 'type' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:367:2: ( (lv_type_0_0= 'type' ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:368:1: (lv_type_0_0= 'type' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:368:1: (lv_type_0_0= 'type' )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:369:3: lv_type_0_0= 'type'
                    {
                    lv_type_0_0=(Token)match(input,18,FOLLOW_18_in_ruleFieldType700); 

                            newLeafNode(lv_type_0_0, grammarAccess.getFieldTypeAccess().getTypeTypeKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "type", true, "type");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:383:6: ( (lv_method_1_0= 'method' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:383:6: ( (lv_method_1_0= 'method' ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:384:1: (lv_method_1_0= 'method' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:384:1: (lv_method_1_0= 'method' )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:385:3: lv_method_1_0= 'method'
                    {
                    lv_method_1_0=(Token)match(input,19,FOLLOW_19_in_ruleFieldType737); 

                            newLeafNode(lv_method_1_0, grammarAccess.getFieldTypeAccess().getMethodMethodKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "method", true, "method");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:399:6: ( (lv_field_2_0= 'field' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:399:6: ( (lv_field_2_0= 'field' ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:400:1: (lv_field_2_0= 'field' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:400:1: (lv_field_2_0= 'field' )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:401:3: lv_field_2_0= 'field'
                    {
                    lv_field_2_0=(Token)match(input,20,FOLLOW_20_in_ruleFieldType774); 

                            newLeafNode(lv_field_2_0, grammarAccess.getFieldTypeAccess().getFieldFieldKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "field", true, "field");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:415:6: ( (lv_trycatch_3_0= 'trycatch' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:415:6: ( (lv_trycatch_3_0= 'trycatch' ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:416:1: (lv_trycatch_3_0= 'trycatch' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:416:1: (lv_trycatch_3_0= 'trycatch' )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:417:3: lv_trycatch_3_0= 'trycatch'
                    {
                    lv_trycatch_3_0=(Token)match(input,21,FOLLOW_21_in_ruleFieldType811); 

                            newLeafNode(lv_trycatch_3_0, grammarAccess.getFieldTypeAccess().getTrycatchTrycatchKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "trycatch", true, "trycatch");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:431:6: ( (lv_varusage_4_0= 'varusage' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:431:6: ( (lv_varusage_4_0= 'varusage' ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:432:1: (lv_varusage_4_0= 'varusage' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:432:1: (lv_varusage_4_0= 'varusage' )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:433:3: lv_varusage_4_0= 'varusage'
                    {
                    lv_varusage_4_0=(Token)match(input,22,FOLLOW_22_in_ruleFieldType848); 

                            newLeafNode(lv_varusage_4_0, grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "varusage", true, "varusage");
                    	    

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
    // $ANTLR end "ruleFieldType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFieldCategory_in_ruleModel165 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFieldCategory_in_entryRuleFieldCategory202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldCategory212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldCategory254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFieldCategory271 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleField_in_ruleFieldCategory292 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleFieldCategory305 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleFieldCategory318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFieldCategory335 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFieldCategory352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField442 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleField459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField476 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleField493 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField514 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleField527 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField548 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleField562 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleField575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField592 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleField609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFieldType700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFieldType737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFieldType774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFieldType811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFieldType848 = new BitSet(new long[]{0x0000000000000002L});

}
