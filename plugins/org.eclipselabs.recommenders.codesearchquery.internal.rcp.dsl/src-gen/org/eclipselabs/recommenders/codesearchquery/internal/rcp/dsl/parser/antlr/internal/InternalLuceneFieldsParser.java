package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.services.LuceneFieldsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuceneFieldsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'class'", "';'", "','", "'method'", "'field'", "'trycatch'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalLuceneFieldsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLuceneFieldsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLuceneFieldsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g"; }



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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_STRING ) ) otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) ( (lv_fields_4_0= ruleField ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_packageName_1_0=null;
        Token otherlv_2=null;
        Token lv_className_3_0=null;
        EObject lv_fields_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:79:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_STRING ) ) otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) ( (lv_fields_4_0= ruleField ) )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_STRING ) ) otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) ( (lv_fields_4_0= ruleField ) )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_STRING ) ) otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) ( (lv_fields_4_0= ruleField ) )* )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:80:3: otherlv_0= 'package' ( (lv_packageName_1_0= RULE_STRING ) ) otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) ( (lv_fields_4_0= ruleField ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:84:1: ( (lv_packageName_1_0= RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:85:1: (lv_packageName_1_0= RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:85:1: (lv_packageName_1_0= RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:86:3: lv_packageName_1_0= RULE_STRING
            {
            lv_packageName_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel139); 

            			newLeafNode(lv_packageName_1_0, grammarAccess.getModelAccess().getPackageNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"packageName",
                    		lv_packageName_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getClassKeyword_2());
                
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:106:1: ( (lv_className_3_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:107:1: (lv_className_3_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:107:1: (lv_className_3_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:108:3: lv_className_3_0= RULE_ID
            {
            lv_className_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel173); 

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

            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:124:2: ( (lv_fields_4_0= ruleField ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:125:1: (lv_fields_4_0= ruleField )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:125:1: (lv_fields_4_0= ruleField )
            	    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:126:3: lv_fields_4_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFieldsFieldParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleModel199);
            	    lv_fields_4_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_4_0, 
            	            		"Field");
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


    // $ANTLR start "entryRuleField"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:150:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:151:2: (iv_ruleField= ruleField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:152:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField236);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField246); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:159:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_4_0 = null;

        EObject lv_types_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:162:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:163:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:163:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )* )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:163:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ( (lv_types_4_0= ruleFieldType ) ) (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )*
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:163:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:164:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:164:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:165:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField288); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleField305); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getSemicolonKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:185:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:186:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:186:1: (lv_value_2_0= RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:187:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField322); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleField339); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getSemicolonKeyword_3());
                
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:207:1: ( (lv_types_4_0= ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:208:1: (lv_types_4_0= ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:208:1: (lv_types_4_0= ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:209:3: lv_types_4_0= ruleFieldType
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFieldType_in_ruleField360);
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

            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:225:2: (otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:225:4: otherlv_5= ',' ( (lv_types_6_0= ruleFieldType ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleField373); 

            	        	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:229:1: ( (lv_types_6_0= ruleFieldType ) )
            	    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:230:1: (lv_types_6_0= ruleFieldType )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:230:1: (lv_types_6_0= ruleFieldType )
            	    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:231:3: lv_types_6_0= ruleFieldType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldType_in_ruleField394);
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:255:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:256:2: (iv_ruleFieldType= ruleFieldType EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:257:2: iv_ruleFieldType= ruleFieldType EOF
            {
             newCompositeNode(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType432);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;

             current =iv_ruleFieldType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType442); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:264:1: ruleFieldType returns [EObject current=null] : ( ( (lv_classType_0_0= 'class' ) ) | ( (lv_methodType_1_0= 'method' ) ) | ( (lv_fieldType_2_0= 'field' ) ) | ( (lv_trycatchType_3_0= 'trycatch' ) ) ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        Token lv_classType_0_0=null;
        Token lv_methodType_1_0=null;
        Token lv_fieldType_2_0=null;
        Token lv_trycatchType_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:267:28: ( ( ( (lv_classType_0_0= 'class' ) ) | ( (lv_methodType_1_0= 'method' ) ) | ( (lv_fieldType_2_0= 'field' ) ) | ( (lv_trycatchType_3_0= 'trycatch' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:268:1: ( ( (lv_classType_0_0= 'class' ) ) | ( (lv_methodType_1_0= 'method' ) ) | ( (lv_fieldType_2_0= 'field' ) ) | ( (lv_trycatchType_3_0= 'trycatch' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:268:1: ( ( (lv_classType_0_0= 'class' ) ) | ( (lv_methodType_1_0= 'method' ) ) | ( (lv_fieldType_2_0= 'field' ) ) | ( (lv_trycatchType_3_0= 'trycatch' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:268:2: ( (lv_classType_0_0= 'class' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:268:2: ( (lv_classType_0_0= 'class' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:269:1: (lv_classType_0_0= 'class' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:269:1: (lv_classType_0_0= 'class' )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:270:3: lv_classType_0_0= 'class'
                    {
                    lv_classType_0_0=(Token)match(input,12,FOLLOW_12_in_ruleFieldType485); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:284:6: ( (lv_methodType_1_0= 'method' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:284:6: ( (lv_methodType_1_0= 'method' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:285:1: (lv_methodType_1_0= 'method' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:285:1: (lv_methodType_1_0= 'method' )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:286:3: lv_methodType_1_0= 'method'
                    {
                    lv_methodType_1_0=(Token)match(input,15,FOLLOW_15_in_ruleFieldType522); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:300:6: ( (lv_fieldType_2_0= 'field' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:300:6: ( (lv_fieldType_2_0= 'field' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:301:1: (lv_fieldType_2_0= 'field' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:301:1: (lv_fieldType_2_0= 'field' )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:302:3: lv_fieldType_2_0= 'field'
                    {
                    lv_fieldType_2_0=(Token)match(input,16,FOLLOW_16_in_ruleFieldType559); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:316:6: ( (lv_trycatchType_3_0= 'trycatch' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:316:6: ( (lv_trycatchType_3_0= 'trycatch' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:317:1: (lv_trycatchType_3_0= 'trycatch' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:317:1: (lv_trycatchType_3_0= 'trycatch' )
                    // ../org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.g:318:3: lv_trycatchType_3_0= 'trycatch'
                    {
                    lv_trycatchType_3_0=(Token)match(input,17,FOLLOW_17_in_ruleFieldType596); 

                            newLeafNode(lv_trycatchType_3_0, grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldTypeRule());
                    	        }
                           		setWithLastConsumed(current, "trycatchType", true, "trycatch");
                    	    

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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel173 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleField_in_ruleModel199 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField288 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField322 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField339 = new BitSet(new long[]{0x0000000000039000L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField360 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleField373 = new BitSet(new long[]{0x0000000000039000L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField394 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFieldType485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFieldType522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFieldType559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleFieldType596 = new BitSet(new long[]{0x0000000000000002L});

}