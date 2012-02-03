package org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.services.QL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQL1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAMEWITHWC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'where'", "','", "'Methods'", "'Types'", "'is'", "'has'", "'('", "')'", "'IsStatic'", "'IsPrivate'", "'IsPublic'", "'IsFinal'", "'IsAbstract'", "'IsProtected'", "'Name'", "'CalledMethods'", "'!'"
    };
    public static final int RULE_ID=5;
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
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g"; }



     	private QL1GrammarAccess grammarAccess;
     	
        public InternalQL1Parser(TokenStream input, QL1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Exp1";	
       	}
       	
       	@Override
       	protected QL1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExp1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:67:1: entryRuleExp1 returns [EObject current=null] : iv_ruleExp1= ruleExp1 EOF ;
    public final EObject entryRuleExp1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp1 = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:68:2: (iv_ruleExp1= ruleExp1 EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:69:2: iv_ruleExp1= ruleExp1 EOF
            {
             newCompositeNode(grammarAccess.getExp1Rule()); 
            pushFollow(FOLLOW_ruleExp1_in_entryRuleExp175);
            iv_ruleExp1=ruleExp1();

            state._fsp--;

             current =iv_ruleExp1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp185); 

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
    // $ANTLR end "entryRuleExp1"


    // $ANTLR start "ruleExp1"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:76:1: ruleExp1 returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_fieldExpr_2_0= ruleFieldExpr ) ) (otherlv_3= ',' ( (lv_fieldExpr_4_0= ruleFieldExpr ) ) )* ) ;
    public final EObject ruleExp1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_fieldExpr_2_0 = null;

        EObject lv_fieldExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:79:28: ( ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_fieldExpr_2_0= ruleFieldExpr ) ) (otherlv_3= ',' ( (lv_fieldExpr_4_0= ruleFieldExpr ) ) )* ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:1: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_fieldExpr_2_0= ruleFieldExpr ) ) (otherlv_3= ',' ( (lv_fieldExpr_4_0= ruleFieldExpr ) ) )* )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:1: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_fieldExpr_2_0= ruleFieldExpr ) ) (otherlv_3= ',' ( (lv_fieldExpr_4_0= ruleFieldExpr ) ) )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:2: ( (lv_type_0_0= ruleType ) ) otherlv_1= 'where' ( (lv_fieldExpr_2_0= ruleFieldExpr ) ) (otherlv_3= ',' ( (lv_fieldExpr_4_0= ruleFieldExpr ) ) )*
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:80:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:81:1: (lv_type_0_0= ruleType )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:81:1: (lv_type_0_0= ruleType )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:82:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getExp1Access().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleExp1131);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExp1Rule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleExp1143); 

                	newLeafNode(otherlv_1, grammarAccess.getExp1Access().getWhereKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:102:1: ( (lv_fieldExpr_2_0= ruleFieldExpr ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:103:1: (lv_fieldExpr_2_0= ruleFieldExpr )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:103:1: (lv_fieldExpr_2_0= ruleFieldExpr )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:104:3: lv_fieldExpr_2_0= ruleFieldExpr
            {
             
            	        newCompositeNode(grammarAccess.getExp1Access().getFieldExprFieldExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFieldExpr_in_ruleExp1164);
            lv_fieldExpr_2_0=ruleFieldExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExp1Rule());
            	        }
                   		add(
                   			current, 
                   			"fieldExpr",
                    		lv_fieldExpr_2_0, 
                    		"FieldExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:120:2: (otherlv_3= ',' ( (lv_fieldExpr_4_0= ruleFieldExpr ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:120:4: otherlv_3= ',' ( (lv_fieldExpr_4_0= ruleFieldExpr ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleExp1177); 

            	        	newLeafNode(otherlv_3, grammarAccess.getExp1Access().getCommaKeyword_3_0());
            	        
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:124:1: ( (lv_fieldExpr_4_0= ruleFieldExpr ) )
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:125:1: (lv_fieldExpr_4_0= ruleFieldExpr )
            	    {
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:125:1: (lv_fieldExpr_4_0= ruleFieldExpr )
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:126:3: lv_fieldExpr_4_0= ruleFieldExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExp1Access().getFieldExprFieldExprParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFieldExpr_in_ruleExp1198);
            	    lv_fieldExpr_4_0=ruleFieldExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExp1Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fieldExpr",
            	            		lv_fieldExpr_4_0, 
            	            		"FieldExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleExp1"


    // $ANTLR start "entryRuleFieldExpr"
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:150:1: entryRuleFieldExpr returns [EObject current=null] : iv_ruleFieldExpr= ruleFieldExpr EOF ;
    public final EObject entryRuleFieldExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldExpr = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:151:2: (iv_ruleFieldExpr= ruleFieldExpr EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:152:2: iv_ruleFieldExpr= ruleFieldExpr EOF
            {
             newCompositeNode(grammarAccess.getFieldExprRule()); 
            pushFollow(FOLLOW_ruleFieldExpr_in_entryRuleFieldExpr236);
            iv_ruleFieldExpr=ruleFieldExpr();

            state._fsp--;

             current =iv_ruleFieldExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldExpr246); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:159:1: ruleFieldExpr returns [EObject current=null] : (this_SingleValueField_0= ruleSingleValueField | this_MultiValueField_1= ruleMultiValueField | this_BooleanField_2= ruleBooleanField ) ;
    public final EObject ruleFieldExpr() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValueField_0 = null;

        EObject this_MultiValueField_1 = null;

        EObject this_BooleanField_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:162:28: ( (this_SingleValueField_0= ruleSingleValueField | this_MultiValueField_1= ruleMultiValueField | this_BooleanField_2= ruleBooleanField ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:163:1: (this_SingleValueField_0= ruleSingleValueField | this_MultiValueField_1= ruleMultiValueField | this_BooleanField_2= ruleBooleanField )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:163:1: (this_SingleValueField_0= ruleSingleValueField | this_MultiValueField_1= ruleMultiValueField | this_BooleanField_2= ruleBooleanField )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 28:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:164:5: this_SingleValueField_0= ruleSingleValueField
                    {
                     
                            newCompositeNode(grammarAccess.getFieldExprAccess().getSingleValueFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleValueField_in_ruleFieldExpr293);
                    this_SingleValueField_0=ruleSingleValueField();

                    state._fsp--;

                     
                            current = this_SingleValueField_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:174:5: this_MultiValueField_1= ruleMultiValueField
                    {
                     
                            newCompositeNode(grammarAccess.getFieldExprAccess().getMultiValueFieldParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMultiValueField_in_ruleFieldExpr320);
                    this_MultiValueField_1=ruleMultiValueField();

                    state._fsp--;

                     
                            current = this_MultiValueField_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:184:5: this_BooleanField_2= ruleBooleanField
                    {
                     
                            newCompositeNode(grammarAccess.getFieldExprAccess().getBooleanFieldParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanField_in_ruleFieldExpr347);
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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:200:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:201:2: (iv_ruleType= ruleType EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:202:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType382);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType392); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:209:1: ruleType returns [EObject current=null] : ( ( (lv_value_0_0= 'Methods' ) ) | ( (lv_method_1_0= 'Types' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_method_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:212:28: ( ( ( (lv_value_0_0= 'Methods' ) ) | ( (lv_method_1_0= 'Types' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:213:1: ( ( (lv_value_0_0= 'Methods' ) ) | ( (lv_method_1_0= 'Types' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:213:1: ( ( (lv_value_0_0= 'Methods' ) ) | ( (lv_method_1_0= 'Types' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:213:2: ( (lv_value_0_0= 'Methods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:213:2: ( (lv_value_0_0= 'Methods' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:214:1: (lv_value_0_0= 'Methods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:214:1: (lv_value_0_0= 'Methods' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:215:3: lv_value_0_0= 'Methods'
                    {
                    lv_value_0_0=(Token)match(input,14,FOLLOW_14_in_ruleType435); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:229:6: ( (lv_method_1_0= 'Types' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:229:6: ( (lv_method_1_0= 'Types' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:230:1: (lv_method_1_0= 'Types' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:230:1: (lv_method_1_0= 'Types' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:231:3: lv_method_1_0= 'Types'
                    {
                    lv_method_1_0=(Token)match(input,15,FOLLOW_15_in_ruleType472); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:252:1: entryRuleSingleValueField returns [EObject current=null] : iv_ruleSingleValueField= ruleSingleValueField EOF ;
    public final EObject entryRuleSingleValueField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValueField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:253:2: (iv_ruleSingleValueField= ruleSingleValueField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:254:2: iv_ruleSingleValueField= ruleSingleValueField EOF
            {
             newCompositeNode(grammarAccess.getSingleValueFieldRule()); 
            pushFollow(FOLLOW_ruleSingleValueField_in_entryRuleSingleValueField521);
            iv_ruleSingleValueField=ruleSingleValueField();

            state._fsp--;

             current =iv_ruleSingleValueField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleValueField531); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:261:1: ruleSingleValueField returns [EObject current=null] : ( ( (lv_name_0_0= ruleSingleValueFieldName ) ) ( (lv_n_1_0= ruleNegation ) )? otherlv_2= 'is' ( (lv_value_3_0= RULE_NAMEWITHWC ) ) ) ;
    public final EObject ruleSingleValueField() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_value_3_0=null;
        EObject lv_name_0_0 = null;

        EObject lv_n_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:264:28: ( ( ( (lv_name_0_0= ruleSingleValueFieldName ) ) ( (lv_n_1_0= ruleNegation ) )? otherlv_2= 'is' ( (lv_value_3_0= RULE_NAMEWITHWC ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:265:1: ( ( (lv_name_0_0= ruleSingleValueFieldName ) ) ( (lv_n_1_0= ruleNegation ) )? otherlv_2= 'is' ( (lv_value_3_0= RULE_NAMEWITHWC ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:265:1: ( ( (lv_name_0_0= ruleSingleValueFieldName ) ) ( (lv_n_1_0= ruleNegation ) )? otherlv_2= 'is' ( (lv_value_3_0= RULE_NAMEWITHWC ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:265:2: ( (lv_name_0_0= ruleSingleValueFieldName ) ) ( (lv_n_1_0= ruleNegation ) )? otherlv_2= 'is' ( (lv_value_3_0= RULE_NAMEWITHWC ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:265:2: ( (lv_name_0_0= ruleSingleValueFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:266:1: (lv_name_0_0= ruleSingleValueFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:266:1: (lv_name_0_0= ruleSingleValueFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:267:3: lv_name_0_0= ruleSingleValueFieldName
            {
             
            	        newCompositeNode(grammarAccess.getSingleValueFieldAccess().getNameSingleValueFieldNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleValueFieldName_in_ruleSingleValueField577);
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

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:283:2: ( (lv_n_1_0= ruleNegation ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:284:1: (lv_n_1_0= ruleNegation )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:284:1: (lv_n_1_0= ruleNegation )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:285:3: lv_n_1_0= ruleNegation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleValueFieldAccess().getNNegationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNegation_in_ruleSingleValueField598);
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSingleValueField611); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleValueFieldAccess().getIsKeyword_2());
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:305:1: ( (lv_value_3_0= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:306:1: (lv_value_3_0= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:306:1: (lv_value_3_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:307:3: lv_value_3_0= RULE_NAMEWITHWC
            {
            lv_value_3_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleSingleValueField628); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:331:1: entryRuleMultiValueField returns [EObject current=null] : iv_ruleMultiValueField= ruleMultiValueField EOF ;
    public final EObject entryRuleMultiValueField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValueField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:332:2: (iv_ruleMultiValueField= ruleMultiValueField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:333:2: iv_ruleMultiValueField= ruleMultiValueField EOF
            {
             newCompositeNode(grammarAccess.getMultiValueFieldRule()); 
            pushFollow(FOLLOW_ruleMultiValueField_in_entryRuleMultiValueField669);
            iv_ruleMultiValueField=ruleMultiValueField();

            state._fsp--;

             current =iv_ruleMultiValueField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValueField679); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:340:1: ruleMultiValueField returns [EObject current=null] : ( ( (lv_name_0_0= ruleMultiValueFieldName ) ) otherlv_1= 'has' ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) ) ) ;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:343:28: ( ( ( (lv_name_0_0= ruleMultiValueFieldName ) ) otherlv_1= 'has' ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:344:1: ( ( (lv_name_0_0= ruleMultiValueFieldName ) ) otherlv_1= 'has' ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:344:1: ( ( (lv_name_0_0= ruleMultiValueFieldName ) ) otherlv_1= 'has' ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:344:2: ( (lv_name_0_0= ruleMultiValueFieldName ) ) otherlv_1= 'has' ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:344:2: ( (lv_name_0_0= ruleMultiValueFieldName ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:345:1: (lv_name_0_0= ruleMultiValueFieldName )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:345:1: (lv_name_0_0= ruleMultiValueFieldName )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:346:3: lv_name_0_0= ruleMultiValueFieldName
            {
             
            	        newCompositeNode(grammarAccess.getMultiValueFieldAccess().getNameMultiValueFieldNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiValueFieldName_in_ruleMultiValueField725);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMultiValueField737); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiValueFieldAccess().getHasKeyword_1());
                
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:366:1: ( ( (lv_values_2_0= RULE_NAMEWITHWC ) ) | (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_NAMEWITHWC) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:366:2: ( (lv_values_2_0= RULE_NAMEWITHWC ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:366:2: ( (lv_values_2_0= RULE_NAMEWITHWC ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:367:1: (lv_values_2_0= RULE_NAMEWITHWC )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:367:1: (lv_values_2_0= RULE_NAMEWITHWC )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:368:3: lv_values_2_0= RULE_NAMEWITHWC
                    {
                    lv_values_2_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField755); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:385:6: (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:385:6: (otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:385:8: otherlv_3= '(' ( (lv_values_4_0= RULE_NAMEWITHWC ) ) (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleMultiValueField779); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultiValueFieldAccess().getLeftParenthesisKeyword_2_1_0());
                        
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:389:1: ( (lv_values_4_0= RULE_NAMEWITHWC ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:390:1: (lv_values_4_0= RULE_NAMEWITHWC )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:390:1: (lv_values_4_0= RULE_NAMEWITHWC )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:391:3: lv_values_4_0= RULE_NAMEWITHWC
                    {
                    lv_values_4_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField796); 

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

                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:407:2: (otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:407:4: otherlv_5= ',' ( (lv_values_6_0= RULE_NAMEWITHWC ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleMultiValueField814); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMultiValueFieldAccess().getCommaKeyword_2_1_2_0());
                    	        
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:411:1: ( (lv_values_6_0= RULE_NAMEWITHWC ) )
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:412:1: (lv_values_6_0= RULE_NAMEWITHWC )
                    	    {
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:412:1: (lv_values_6_0= RULE_NAMEWITHWC )
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:413:3: lv_values_6_0= RULE_NAMEWITHWC
                    	    {
                    	    lv_values_6_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField831); 

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
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleMultiValueField850); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:441:1: entryRuleBooleanField returns [EObject current=null] : iv_ruleBooleanField= ruleBooleanField EOF ;
    public final EObject entryRuleBooleanField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:442:2: (iv_ruleBooleanField= ruleBooleanField EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:443:2: iv_ruleBooleanField= ruleBooleanField EOF
            {
             newCompositeNode(grammarAccess.getBooleanFieldRule()); 
            pushFollow(FOLLOW_ruleBooleanField_in_entryRuleBooleanField888);
            iv_ruleBooleanField=ruleBooleanField();

            state._fsp--;

             current =iv_ruleBooleanField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanField898); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:450:1: ruleBooleanField returns [EObject current=null] : ( ( (lv_n_0_0= ruleNegation ) )? ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) ) ) ;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:453:28: ( ( ( (lv_n_0_0= ruleNegation ) )? ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:454:1: ( ( (lv_n_0_0= ruleNegation ) )? ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:454:1: ( ( (lv_n_0_0= ruleNegation ) )? ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:454:2: ( (lv_n_0_0= ruleNegation ) )? ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:454:2: ( (lv_n_0_0= ruleNegation ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:455:1: (lv_n_0_0= ruleNegation )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:455:1: (lv_n_0_0= ruleNegation )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:456:3: lv_n_0_0= ruleNegation
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanFieldAccess().getNNegationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanField944);
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

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:472:3: ( ( (lv_value_1_0= 'IsStatic' ) ) | ( (lv_value_2_0= 'IsPrivate' ) ) | ( (lv_value_3_0= 'IsPublic' ) ) | ( (lv_value_4_0= 'IsFinal' ) ) | ( (lv_value_5_0= 'IsAbstract' ) ) | ( (lv_value_6_0= 'IsProtected' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:472:4: ( (lv_value_1_0= 'IsStatic' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:472:4: ( (lv_value_1_0= 'IsStatic' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:473:1: (lv_value_1_0= 'IsStatic' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:473:1: (lv_value_1_0= 'IsStatic' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:474:3: lv_value_1_0= 'IsStatic'
                    {
                    lv_value_1_0=(Token)match(input,20,FOLLOW_20_in_ruleBooleanField964); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:488:6: ( (lv_value_2_0= 'IsPrivate' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:488:6: ( (lv_value_2_0= 'IsPrivate' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:489:1: (lv_value_2_0= 'IsPrivate' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:489:1: (lv_value_2_0= 'IsPrivate' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:490:3: lv_value_2_0= 'IsPrivate'
                    {
                    lv_value_2_0=(Token)match(input,21,FOLLOW_21_in_ruleBooleanField1001); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:504:6: ( (lv_value_3_0= 'IsPublic' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:504:6: ( (lv_value_3_0= 'IsPublic' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:505:1: (lv_value_3_0= 'IsPublic' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:505:1: (lv_value_3_0= 'IsPublic' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:506:3: lv_value_3_0= 'IsPublic'
                    {
                    lv_value_3_0=(Token)match(input,22,FOLLOW_22_in_ruleBooleanField1038); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:520:6: ( (lv_value_4_0= 'IsFinal' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:520:6: ( (lv_value_4_0= 'IsFinal' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:521:1: (lv_value_4_0= 'IsFinal' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:521:1: (lv_value_4_0= 'IsFinal' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:522:3: lv_value_4_0= 'IsFinal'
                    {
                    lv_value_4_0=(Token)match(input,23,FOLLOW_23_in_ruleBooleanField1075); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:536:6: ( (lv_value_5_0= 'IsAbstract' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:536:6: ( (lv_value_5_0= 'IsAbstract' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:537:1: (lv_value_5_0= 'IsAbstract' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:537:1: (lv_value_5_0= 'IsAbstract' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:538:3: lv_value_5_0= 'IsAbstract'
                    {
                    lv_value_5_0=(Token)match(input,24,FOLLOW_24_in_ruleBooleanField1112); 

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
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:552:6: ( (lv_value_6_0= 'IsProtected' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:552:6: ( (lv_value_6_0= 'IsProtected' ) )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:553:1: (lv_value_6_0= 'IsProtected' )
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:553:1: (lv_value_6_0= 'IsProtected' )
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:554:3: lv_value_6_0= 'IsProtected'
                    {
                    lv_value_6_0=(Token)match(input,25,FOLLOW_25_in_ruleBooleanField1149); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:575:1: entryRuleSingleValueFieldName returns [EObject current=null] : iv_ruleSingleValueFieldName= ruleSingleValueFieldName EOF ;
    public final EObject entryRuleSingleValueFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValueFieldName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:576:2: (iv_ruleSingleValueFieldName= ruleSingleValueFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:577:2: iv_ruleSingleValueFieldName= ruleSingleValueFieldName EOF
            {
             newCompositeNode(grammarAccess.getSingleValueFieldNameRule()); 
            pushFollow(FOLLOW_ruleSingleValueFieldName_in_entryRuleSingleValueFieldName1199);
            iv_ruleSingleValueFieldName=ruleSingleValueFieldName();

            state._fsp--;

             current =iv_ruleSingleValueFieldName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleValueFieldName1209); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:584:1: ruleSingleValueFieldName returns [EObject current=null] : ( (lv_value_0_0= 'Name' ) ) ;
    public final EObject ruleSingleValueFieldName() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:587:28: ( ( (lv_value_0_0= 'Name' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:588:1: ( (lv_value_0_0= 'Name' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:588:1: ( (lv_value_0_0= 'Name' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:589:1: (lv_value_0_0= 'Name' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:589:1: (lv_value_0_0= 'Name' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:590:3: lv_value_0_0= 'Name'
            {
            lv_value_0_0=(Token)match(input,26,FOLLOW_26_in_ruleSingleValueFieldName1251); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:611:1: entryRuleMultiValueFieldName returns [EObject current=null] : iv_ruleMultiValueFieldName= ruleMultiValueFieldName EOF ;
    public final EObject entryRuleMultiValueFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValueFieldName = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:612:2: (iv_ruleMultiValueFieldName= ruleMultiValueFieldName EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:613:2: iv_ruleMultiValueFieldName= ruleMultiValueFieldName EOF
            {
             newCompositeNode(grammarAccess.getMultiValueFieldNameRule()); 
            pushFollow(FOLLOW_ruleMultiValueFieldName_in_entryRuleMultiValueFieldName1299);
            iv_ruleMultiValueFieldName=ruleMultiValueFieldName();

            state._fsp--;

             current =iv_ruleMultiValueFieldName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValueFieldName1309); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:620:1: ruleMultiValueFieldName returns [EObject current=null] : ( (lv_value_0_0= 'CalledMethods' ) ) ;
    public final EObject ruleMultiValueFieldName() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:623:28: ( ( (lv_value_0_0= 'CalledMethods' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:624:1: ( (lv_value_0_0= 'CalledMethods' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:624:1: ( (lv_value_0_0= 'CalledMethods' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:625:1: (lv_value_0_0= 'CalledMethods' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:625:1: (lv_value_0_0= 'CalledMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:626:3: lv_value_0_0= 'CalledMethods'
            {
            lv_value_0_0=(Token)match(input,27,FOLLOW_27_in_ruleMultiValueFieldName1351); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:647:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:648:2: (iv_ruleNegation= ruleNegation EOF )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:649:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation1399);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation1409); 

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
    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:656:1: ruleNegation returns [EObject current=null] : ( (lv_value_0_0= '!' ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:659:28: ( ( (lv_value_0_0= '!' ) ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:660:1: ( (lv_value_0_0= '!' ) )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:660:1: ( (lv_value_0_0= '!' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:661:1: (lv_value_0_0= '!' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:661:1: (lv_value_0_0= '!' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dslQL1/parser/antlr/internal/InternalQL1.g:662:3: lv_value_0_0= '!'
            {
            lv_value_0_0=(Token)match(input,28,FOLLOW_28_in_ruleNegation1451); 

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


 

    public static final BitSet FOLLOW_ruleExp1_in_entryRuleExp175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleExp1131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExp1143 = new BitSet(new long[]{0x000000001FF00000L});
    public static final BitSet FOLLOW_ruleFieldExpr_in_ruleExp1164 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleExp1177 = new BitSet(new long[]{0x000000001FF00000L});
    public static final BitSet FOLLOW_ruleFieldExpr_in_ruleExp1198 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFieldExpr_in_entryRuleFieldExpr236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldExpr246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueField_in_ruleFieldExpr293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueField_in_ruleFieldExpr320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanField_in_ruleFieldExpr347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleType435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleType472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueField_in_entryRuleSingleValueField521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleValueField531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueFieldName_in_ruleSingleValueField577 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleSingleValueField598 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleValueField611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleSingleValueField628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueField_in_entryRuleMultiValueField669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValueField679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueFieldName_in_ruleMultiValueField725 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMultiValueField737 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMultiValueField779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField796 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13_in_ruleMultiValueField814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMultiValueField831 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_19_in_ruleMultiValueField850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanField_in_entryRuleBooleanField888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanField898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanField944 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_20_in_ruleBooleanField964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBooleanField1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBooleanField1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBooleanField1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBooleanField1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBooleanField1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueFieldName_in_entryRuleSingleValueFieldName1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleValueFieldName1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSingleValueFieldName1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueFieldName_in_entryRuleMultiValueFieldName1299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValueFieldName1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMultiValueFieldName1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation1399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNegation1451 = new BitSet(new long[]{0x0000000000000002L});

}