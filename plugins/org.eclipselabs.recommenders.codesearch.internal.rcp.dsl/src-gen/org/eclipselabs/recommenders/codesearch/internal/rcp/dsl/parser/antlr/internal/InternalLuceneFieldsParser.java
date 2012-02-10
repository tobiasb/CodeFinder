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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'packages'", "'class'", "'{'", "'}'", "'='", "','", "'method'", "'field'", "'trycatch'", "'varusage'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'packages' ( (lv_packageNames_1_0= RULE_STRING ) )* otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) ( (lv_fieldCategories_4_0= ruleFieldCategory ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_packageNames_1_0=null;
        Token otherlv_2=null;
        Token lv_className_3_0=null;
        EObject lv_fieldCategories_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:79:28: ( (otherlv_0= 'packages' ( (lv_packageNames_1_0= RULE_STRING ) )* otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) ( (lv_fieldCategories_4_0= ruleFieldCategory ) )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:80:1: (otherlv_0= 'packages' ( (lv_packageNames_1_0= RULE_STRING ) )* otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) ( (lv_fieldCategories_4_0= ruleFieldCategory ) )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:80:1: (otherlv_0= 'packages' ( (lv_packageNames_1_0= RULE_STRING ) )* otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) ( (lv_fieldCategories_4_0= ruleFieldCategory ) )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:80:3: otherlv_0= 'packages' ( (lv_packageNames_1_0= RULE_STRING ) )* otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) ( (lv_fieldCategories_4_0= ruleFieldCategory ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackagesKeyword_0());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:84:1: ( (lv_packageNames_1_0= RULE_STRING ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:85:1: (lv_packageNames_1_0= RULE_STRING )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:85:1: (lv_packageNames_1_0= RULE_STRING )
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:86:3: lv_packageNames_1_0= RULE_STRING
            	    {
            	    lv_packageNames_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel139); 

            	    			newLeafNode(lv_packageNames_1_0, grammarAccess.getModelAccess().getPackageNamesSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getModelRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"packageNames",
            	            		lv_packageNames_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel157); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getClassKeyword_2());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:106:1: ( (lv_className_3_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:107:1: (lv_className_3_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:107:1: (lv_className_3_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:108:3: lv_className_3_0= RULE_ID
            {
            lv_className_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel174); 

            			newLeafNode(lv_className_3_0, grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"className",
                    		lv_className_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:124:2: ( (lv_fieldCategories_4_0= ruleFieldCategory ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:125:1: (lv_fieldCategories_4_0= ruleFieldCategory )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:125:1: (lv_fieldCategories_4_0= ruleFieldCategory )
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:126:3: lv_fieldCategories_4_0= ruleFieldCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFieldCategoriesFieldCategoryParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldCategory_in_ruleModel200);
            	    lv_fieldCategories_4_0=ruleFieldCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fieldCategories",
            	            		lv_fieldCategories_4_0, 
            	            		"FieldCategory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:150:1: entryRuleFieldCategory returns [EObject current=null] : iv_ruleFieldCategory= ruleFieldCategory EOF ;
    public final EObject entryRuleFieldCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldCategory = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:151:2: (iv_ruleFieldCategory= ruleFieldCategory EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:152:2: iv_ruleFieldCategory= ruleFieldCategory EOF
            {
             newCompositeNode(grammarAccess.getFieldCategoryRule()); 
            pushFollow(FOLLOW_ruleFieldCategory_in_entryRuleFieldCategory237);
            iv_ruleFieldCategory=ruleFieldCategory();

            state._fsp--;

             current =iv_ruleFieldCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldCategory247); 

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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:159:1: ruleFieldCategory returns [EObject current=null] : ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_fields_2_0= ruleField ) )* otherlv_3= '}' ) ;
    public final EObject ruleFieldCategory() throws RecognitionException {
        EObject current = null;

        Token lv_categoryName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:162:28: ( ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_fields_2_0= ruleField ) )* otherlv_3= '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:163:1: ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_fields_2_0= ruleField ) )* otherlv_3= '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:163:1: ( ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_fields_2_0= ruleField ) )* otherlv_3= '}' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:163:2: ( (lv_categoryName_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_fields_2_0= ruleField ) )* otherlv_3= '}'
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:163:2: ( (lv_categoryName_0_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:164:1: (lv_categoryName_0_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:164:1: (lv_categoryName_0_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:165:3: lv_categoryName_0_0= RULE_ID
            {
            lv_categoryName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldCategory289); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleFieldCategory306); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldCategoryAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:185:1: ( (lv_fields_2_0= ruleField ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:186:1: (lv_fields_2_0= ruleField )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:186:1: (lv_fields_2_0= ruleField )
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:187:3: lv_fields_2_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldCategoryAccess().getFieldsFieldParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleFieldCategory327);
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
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleFieldCategory340); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldCategoryAccess().getRightCurlyBracketKeyword_3());
                

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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:215:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:216:2: (iv_ruleField= ruleField EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:217:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField376);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField386); 

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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:224:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_types_4_0 = null;

        EObject lv_types_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:227:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* otherlv_7= '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:228:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* otherlv_7= '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:228:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* otherlv_7= '}' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:228:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* otherlv_7= '}'
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:228:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:229:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:229:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:230:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField428); 

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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleField445); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getEqualsSignKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:250:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:251:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:251:1: (lv_value_2_0= RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:252:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField462); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleField479); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:272:1: ( (lv_types_4_0= ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:273:1: (lv_types_4_0= ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:273:1: (lv_types_4_0= ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:274:3: lv_types_4_0= ruleFieldType
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFieldType_in_ruleField500);
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

            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:290:2: (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:290:4: otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleField513); 

            	        	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:294:1: ( (lv_types_6_0= ruleFieldType ) )
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:295:1: (lv_types_6_0= ruleFieldType )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:295:1: (lv_types_6_0= ruleFieldType )
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:296:3: lv_types_6_0= ruleFieldType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldType_in_ruleField534);
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

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleField548); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:324:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:325:2: (iv_ruleFieldType= ruleFieldType EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:326:2: iv_ruleFieldType= ruleFieldType EOF
            {
             newCompositeNode(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType584);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;

             current =iv_ruleFieldType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType594); 

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
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:333:1: ruleFieldType returns [EObject current=null] : ( ( (lv_classType_0_0= 'class' ) ) | ( (lv_methodType_1_0= 'method' ) ) | ( (lv_fieldType_2_0= 'field' ) ) | ( (lv_trycatchType_3_0= 'trycatch' ) ) | ( (lv_varusage_4_0= 'varusage' ) ) ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        Token lv_classType_0_0=null;
        Token lv_methodType_1_0=null;
        Token lv_fieldType_2_0=null;
        Token lv_trycatchType_3_0=null;
        Token lv_varusage_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:336:28: ( ( ( (lv_classType_0_0= 'class' ) ) | ( (lv_methodType_1_0= 'method' ) ) | ( (lv_fieldType_2_0= 'field' ) ) | ( (lv_trycatchType_3_0= 'trycatch' ) ) | ( (lv_varusage_4_0= 'varusage' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:337:1: ( ( (lv_classType_0_0= 'class' ) ) | ( (lv_methodType_1_0= 'method' ) ) | ( (lv_fieldType_2_0= 'field' ) ) | ( (lv_trycatchType_3_0= 'trycatch' ) ) | ( (lv_varusage_4_0= 'varusage' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:337:1: ( ( (lv_classType_0_0= 'class' ) ) | ( (lv_methodType_1_0= 'method' ) ) | ( (lv_fieldType_2_0= 'field' ) ) | ( (lv_trycatchType_3_0= 'trycatch' ) ) | ( (lv_varusage_4_0= 'varusage' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:337:2: ( (lv_classType_0_0= 'class' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:337:2: ( (lv_classType_0_0= 'class' ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:338:1: (lv_classType_0_0= 'class' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:338:1: (lv_classType_0_0= 'class' )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:339:3: lv_classType_0_0= 'class'
                    {
                    lv_classType_0_0=(Token)match(input,12,FOLLOW_12_in_ruleFieldType637); 

                            newLeafNode(lv_classType_0_0, grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "classType", true, "class");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:353:6: ( (lv_methodType_1_0= 'method' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:353:6: ( (lv_methodType_1_0= 'method' ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:354:1: (lv_methodType_1_0= 'method' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:354:1: (lv_methodType_1_0= 'method' )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:355:3: lv_methodType_1_0= 'method'
                    {
                    lv_methodType_1_0=(Token)match(input,17,FOLLOW_17_in_ruleFieldType674); 

                            newLeafNode(lv_methodType_1_0, grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "methodType", true, "method");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:369:6: ( (lv_fieldType_2_0= 'field' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:369:6: ( (lv_fieldType_2_0= 'field' ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:370:1: (lv_fieldType_2_0= 'field' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:370:1: (lv_fieldType_2_0= 'field' )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:371:3: lv_fieldType_2_0= 'field'
                    {
                    lv_fieldType_2_0=(Token)match(input,18,FOLLOW_18_in_ruleFieldType711); 

                            newLeafNode(lv_fieldType_2_0, grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "fieldType", true, "field");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:385:6: ( (lv_trycatchType_3_0= 'trycatch' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:385:6: ( (lv_trycatchType_3_0= 'trycatch' ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:386:1: (lv_trycatchType_3_0= 'trycatch' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:386:1: (lv_trycatchType_3_0= 'trycatch' )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:387:3: lv_trycatchType_3_0= 'trycatch'
                    {
                    lv_trycatchType_3_0=(Token)match(input,19,FOLLOW_19_in_ruleFieldType748); 

                            newLeafNode(lv_trycatchType_3_0, grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "trycatchType", true, "trycatch");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:401:6: ( (lv_varusage_4_0= 'varusage' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:401:6: ( (lv_varusage_4_0= 'varusage' ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:402:1: (lv_varusage_4_0= 'varusage' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:402:1: (lv_varusage_4_0= 'varusage' )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:403:3: lv_varusage_4_0= 'varusage'
                    {
                    lv_varusage_4_0=(Token)match(input,20,FOLLOW_20_in_ruleFieldType785); 

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
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel139 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleModel157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel174 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleFieldCategory_in_ruleModel200 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleFieldCategory_in_entryRuleFieldCategory237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldCategory247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldCategory289 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFieldCategory306 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleField_in_ruleFieldCategory327 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleFieldCategory340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField428 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleField445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField462 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField479 = new BitSet(new long[]{0x00000000001E1000L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField500 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleField513 = new BitSet(new long[]{0x00000000001E1000L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField534 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleField548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFieldType637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleFieldType674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFieldType711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFieldType748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFieldType785 = new BitSet(new long[]{0x0000000000000002L});

}