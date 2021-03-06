package org.eclipselabs.recommenders.codesearch.rcp.dsl.parser.antlr.internal; 

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
import org.eclipselabs.recommenders.codesearch.rcp.dsl.services.LuceneQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuceneQueryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOST", "RULE_QUOTEDNAMEWITHWC", "RULE_NAMEWITHWC", "RULE_INT", "RULE_PATHWITHWC", "RULE_LUCENESPECIALCHAR", "RULE_ESCAPEDSPECIALCHAR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'Type'", "'Handle'", "'FriendlyName'", "'ReturnVariableExpressions'", "'AllDeclaredMethodNames'", "'DeclaredMethodNames'", "'DeclaredFieldNames'", "'AllDeclaredFieldNames'", "'FullText'", "'FieldsRead'", "'FieldsWritten'", "'UsedFieldsInFinally'", "'UsedFieldsInTry'", "'VariableName'", "'ParameterTypesStructural'", "'Annotations'", "'FullyQualifiedName'", "'ImplementedTypes'", "'ExtendedTypes'", "'UsedTypes'", "'UsedTypesInTry'", "'UsedTypesInFinally'", "'ParameterTypes'", "'ReturnType'", "'InstanceofTypes'", "'AllImplementedTypes'", "'AllExtendedTypes'", "'FieldType'", "'CaughtType'", "'DeclaredFieldTypes'", "'DeclaringType'", "'VariableType'", "'CheckedExceptions'", "'UsedMethods'", "'UsedMethodsInTry'", "'UsedMethodsInFinally'", "'OverriddenMethods'", "'DeclaredMethods'", "'DeclaringMethod'", "'UsedAsParameterInMethods'", "'UsedAsTargetForMethods'", "'ResourcePath'", "'ParameterCount'", "'Timestamp'", "'Modifiers'", "'ProjectName'", "'VariableDefinition'", "'private'", "'public'", "'static'", "'final'", "'abstract'", "'protected'", "'type'", "'method'", "'field'", "'trycatch'", "'varusage'", "'parameter'", "'nullLiteral'", "'methodInvocation'", "'instanceCreation'", "'uninitialized'", "'-'", "'NOT'", "'!'", "'+'", "'OR'", "'||'", "'AND'", "'&&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=11;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__90=90;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_PATHWITHWC=8;
    public static final int RULE_NAMEWITHWC=6;
    public static final int RULE_QUOTEDNAMEWITHWC=5;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=12;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_LUCENESPECIALCHAR=9;
    public static final int T__39=39;
    public static final int RULE_BOOST=4;
    public static final int RULE_ESCAPEDSPECIALCHAR=10;
    public static final int RULE_WS=15;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalLuceneQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLuceneQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLuceneQueryParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g"; }



     	private LuceneQueryGrammarAccess grammarAccess;
     	
        public InternalLuceneQueryParser(TokenStream input, LuceneQueryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "OrExp";	
       	}
       	
       	@Override
       	protected LuceneQueryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleOrExp"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:68:1: entryRuleOrExp returns [EObject current=null] : iv_ruleOrExp= ruleOrExp EOF ;
    public final EObject entryRuleOrExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExp = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:69:2: (iv_ruleOrExp= ruleOrExp EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:70:2: iv_ruleOrExp= ruleOrExp EOF
            {
             newCompositeNode(grammarAccess.getOrExpRule()); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp75);
            iv_ruleOrExp=ruleOrExp();

            state._fsp--;

             current =iv_ruleOrExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp85); 

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
    // $ANTLR end "entryRuleOrExp"


    // $ANTLR start "ruleOrExp"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:77:1: ruleOrExp returns [EObject current=null] : (this_AndExp_0= ruleAndExp ( () ( (lv_or_2_0= ruleBinaryOr ) )? ( (lv_right_3_0= ruleOrExp ) ) )? ) ;
    public final EObject ruleOrExp() throws RecognitionException {
        EObject current = null;

        EObject this_AndExp_0 = null;

        Enumerator lv_or_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:80:28: ( (this_AndExp_0= ruleAndExp ( () ( (lv_or_2_0= ruleBinaryOr ) )? ( (lv_right_3_0= ruleOrExp ) ) )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:81:1: (this_AndExp_0= ruleAndExp ( () ( (lv_or_2_0= ruleBinaryOr ) )? ( (lv_right_3_0= ruleOrExp ) ) )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:81:1: (this_AndExp_0= ruleAndExp ( () ( (lv_or_2_0= ruleBinaryOr ) )? ( (lv_right_3_0= ruleOrExp ) ) )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:82:5: this_AndExp_0= ruleAndExp ( () ( (lv_or_2_0= ruleBinaryOr ) )? ( (lv_right_3_0= ruleOrExp ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp132);
            this_AndExp_0=ruleAndExp();

            state._fsp--;

             
                    current = this_AndExp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:90:1: ( () ( (lv_or_2_0= ruleBinaryOr ) )? ( (lv_right_3_0= ruleOrExp ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_QUOTEDNAMEWITHWC && LA2_0<=RULE_NAMEWITHWC)||LA2_0==17||(LA2_0>=20 && LA2_0<=66)||(LA2_0>=83 && LA2_0<=88)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:90:2: () ( (lv_or_2_0= ruleBinaryOr ) )? ( (lv_right_3_0= ruleOrExp ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:90:2: ()
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:91:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getOrExpAccess().getOrExpLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:96:2: ( (lv_or_2_0= ruleBinaryOr ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=87 && LA1_0<=88)) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:97:1: (lv_or_2_0= ruleBinaryOr )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:97:1: (lv_or_2_0= ruleBinaryOr )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:98:3: lv_or_2_0= ruleBinaryOr
                            {
                             
                            	        newCompositeNode(grammarAccess.getOrExpAccess().getOrBinaryOrEnumRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleBinaryOr_in_ruleOrExp162);
                            lv_or_2_0=ruleBinaryOr();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getOrExpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"or",
                                    		lv_or_2_0, 
                                    		"BinaryOr");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:114:3: ( (lv_right_3_0= ruleOrExp ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:115:1: (lv_right_3_0= ruleOrExp )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:115:1: (lv_right_3_0= ruleOrExp )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:116:3: lv_right_3_0= ruleOrExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrExpAccess().getRightOrExpParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExp_in_ruleOrExp184);
                    lv_right_3_0=ruleOrExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrExpRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"OrExp");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleOrExp"


    // $ANTLR start "entryRuleAndExp"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:140:1: entryRuleAndExp returns [EObject current=null] : iv_ruleAndExp= ruleAndExp EOF ;
    public final EObject entryRuleAndExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExp = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:141:2: (iv_ruleAndExp= ruleAndExp EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:142:2: iv_ruleAndExp= ruleAndExp EOF
            {
             newCompositeNode(grammarAccess.getAndExpRule()); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp222);
            iv_ruleAndExp=ruleAndExp();

            state._fsp--;

             current =iv_ruleAndExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp232); 

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
    // $ANTLR end "entryRuleAndExp"


    // $ANTLR start "ruleAndExp"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:149:1: ruleAndExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_and_2_0= ruleBinaryAnd ) ) ( (lv_right_3_0= ruleAndExp ) ) )? ) ;
    public final EObject ruleAndExp() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        Enumerator lv_and_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:152:28: ( (this_Primary_0= rulePrimary ( () ( (lv_and_2_0= ruleBinaryAnd ) ) ( (lv_right_3_0= ruleAndExp ) ) )? ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:153:1: (this_Primary_0= rulePrimary ( () ( (lv_and_2_0= ruleBinaryAnd ) ) ( (lv_right_3_0= ruleAndExp ) ) )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:153:1: (this_Primary_0= rulePrimary ( () ( (lv_and_2_0= ruleBinaryAnd ) ) ( (lv_right_3_0= ruleAndExp ) ) )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:154:5: this_Primary_0= rulePrimary ( () ( (lv_and_2_0= ruleBinaryAnd ) ) ( (lv_right_3_0= ruleAndExp ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAndExpAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleAndExp279);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:162:1: ( () ( (lv_and_2_0= ruleBinaryAnd ) ) ( (lv_right_3_0= ruleAndExp ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=89 && LA3_0<=90)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:162:2: () ( (lv_and_2_0= ruleBinaryAnd ) ) ( (lv_right_3_0= ruleAndExp ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:162:2: ()
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:163:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAndExpAccess().getAndExpLeftAction_1_0(),
                                current);
                        

                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:168:2: ( (lv_and_2_0= ruleBinaryAnd ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:169:1: (lv_and_2_0= ruleBinaryAnd )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:169:1: (lv_and_2_0= ruleBinaryAnd )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:170:3: lv_and_2_0= ruleBinaryAnd
                    {
                     
                    	        newCompositeNode(grammarAccess.getAndExpAccess().getAndBinaryAndEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBinaryAnd_in_ruleAndExp309);
                    lv_and_2_0=ruleBinaryAnd();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAndExpRule());
                    	        }
                           		set(
                           			current, 
                           			"and",
                            		lv_and_2_0, 
                            		"BinaryAnd");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:186:2: ( (lv_right_3_0= ruleAndExp ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:187:1: (lv_right_3_0= ruleAndExp )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:187:1: (lv_right_3_0= ruleAndExp )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:188:3: lv_right_3_0= ruleAndExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getAndExpAccess().getRightAndExpParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAndExp_in_ruleAndExp330);
                    lv_right_3_0=ruleAndExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAndExpRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"AndExp");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleAndExp"


    // $ANTLR start "entryRulePrimary"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:212:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:213:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:214:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary368);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary378); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:221:1: rulePrimary returns [EObject current=null] : ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_OrExp_3= ruleOrExp otherlv_4= ')' (this_Boost_5= RULE_BOOST )? ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_Boost_5=null;
        EObject lv_value_0_0 = null;

        EObject this_OrExp_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:224:28: ( ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_OrExp_3= ruleOrExp otherlv_4= ')' (this_Boost_5= RULE_BOOST )? ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:225:1: ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_OrExp_3= ruleOrExp otherlv_4= ')' (this_Boost_5= RULE_BOOST )? ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:225:1: ( ( (lv_value_0_0= ruleClauseExpression ) ) | ( ( ruleUnaryExpression )? otherlv_2= '(' this_OrExp_3= ruleOrExp otherlv_4= ')' (this_Boost_5= RULE_BOOST )? ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 83:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==17) ) {
                    alt6=2;
                }
                else if ( ((LA6_1>=RULE_QUOTEDNAMEWITHWC && LA6_1<=RULE_NAMEWITHWC)||(LA6_1>=20 && LA6_1<=66)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 84:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==17) ) {
                    alt6=2;
                }
                else if ( ((LA6_2>=RULE_QUOTEDNAMEWITHWC && LA6_2<=RULE_NAMEWITHWC)||(LA6_2>=20 && LA6_2<=66)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 85:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==17) ) {
                    alt6=2;
                }
                else if ( ((LA6_3>=RULE_QUOTEDNAMEWITHWC && LA6_3<=RULE_NAMEWITHWC)||(LA6_3>=20 && LA6_3<=66)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 86:
                {
                int LA6_4 = input.LA(2);

                if ( ((LA6_4>=RULE_QUOTEDNAMEWITHWC && LA6_4<=RULE_NAMEWITHWC)||(LA6_4>=20 && LA6_4<=66)) ) {
                    alt6=1;
                }
                else if ( (LA6_4==17) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_QUOTEDNAMEWITHWC:
            case RULE_NAMEWITHWC:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:225:2: ( (lv_value_0_0= ruleClauseExpression ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:225:2: ( (lv_value_0_0= ruleClauseExpression ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:226:1: (lv_value_0_0= ruleClauseExpression )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:226:1: (lv_value_0_0= ruleClauseExpression )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:227:3: lv_value_0_0= ruleClauseExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getValueClauseExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClauseExpression_in_rulePrimary424);
                    lv_value_0_0=ruleClauseExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"ClauseExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:244:6: ( ( ruleUnaryExpression )? otherlv_2= '(' this_OrExp_3= ruleOrExp otherlv_4= ')' (this_Boost_5= RULE_BOOST )? )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:244:6: ( ( ruleUnaryExpression )? otherlv_2= '(' this_OrExp_3= ruleOrExp otherlv_4= ')' (this_Boost_5= RULE_BOOST )? )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:244:7: ( ruleUnaryExpression )? otherlv_2= '(' this_OrExp_3= ruleOrExp otherlv_4= ')' (this_Boost_5= RULE_BOOST )?
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:244:7: ( ruleUnaryExpression )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=83 && LA4_0<=86)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:245:5: ruleUnaryExpression
                            {
                             
                                    newCompositeNode(grammarAccess.getPrimaryAccess().getUnaryExpressionParserRuleCall_1_0()); 
                                
                            pushFollow(FOLLOW_ruleUnaryExpression_in_rulePrimary448);
                            ruleUnaryExpression();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePrimary461); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getOrExpParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleOrExp_in_rulePrimary483);
                    this_OrExp_3=ruleOrExp();

                    state._fsp--;

                     
                            current = this_OrExp_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePrimary494); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3());
                        
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:269:1: (this_Boost_5= RULE_BOOST )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_BOOST) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:269:2: this_Boost_5= RULE_BOOST
                            {
                            this_Boost_5=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_rulePrimary506); 
                             
                                newLeafNode(this_Boost_5, grammarAccess.getPrimaryAccess().getBoostTerminalRuleCall_1_4()); 
                                

                            }
                            break;

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleClauseExpression"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:281:1: entryRuleClauseExpression returns [EObject current=null] : iv_ruleClauseExpression= ruleClauseExpression EOF ;
    public final EObject entryRuleClauseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClauseExpression = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:282:2: (iv_ruleClauseExpression= ruleClauseExpression EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:283:2: iv_ruleClauseExpression= ruleClauseExpression EOF
            {
             newCompositeNode(grammarAccess.getClauseExpressionRule()); 
            pushFollow(FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression544);
            iv_ruleClauseExpression=ruleClauseExpression();

            state._fsp--;

             current =iv_ruleClauseExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClauseExpression554); 

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
    // $ANTLR end "entryRuleClauseExpression"


    // $ANTLR start "ruleClauseExpression"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:290:1: ruleClauseExpression returns [EObject current=null] : ( ( ruleUnaryExpression )? ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) ) ) ) ;
    public final EObject ruleClauseExpression() throws RecognitionException {
        EObject current = null;

        Token this_Boost_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_Boost_9=null;
        Token otherlv_10=null;
        Token this_Boost_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token this_Boost_18=null;
        Token otherlv_19=null;
        Token this_Boost_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token this_Boost_27=null;
        Token otherlv_28=null;
        Token this_Boost_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token this_Boost_36=null;
        Token otherlv_37=null;
        Token this_Boost_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token this_Boost_45=null;
        Token otherlv_46=null;
        Token this_Boost_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token this_Boost_54=null;
        Token otherlv_55=null;
        Token this_Boost_56=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token this_Boost_63=null;
        Token otherlv_64=null;
        Token this_Boost_65=null;
        Token otherlv_67=null;
        Token otherlv_69=null;
        Token this_Boost_72=null;
        Token otherlv_73=null;
        Token this_Boost_74=null;
        Token otherlv_76=null;
        Token otherlv_78=null;
        Token this_Boost_81=null;
        Token otherlv_82=null;
        Token this_Boost_83=null;
        AntlrDatatypeRuleToken lv_default_1_0 = null;

        EObject lv_field_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_8_0 = null;

        EObject lv_field_12_0 = null;

        AntlrDatatypeRuleToken lv_values_14_0 = null;

        AntlrDatatypeRuleToken lv_values_17_0 = null;

        EObject lv_field_21_0 = null;

        AntlrDatatypeRuleToken lv_values_23_0 = null;

        AntlrDatatypeRuleToken lv_values_26_0 = null;

        EObject lv_field_30_0 = null;

        AntlrDatatypeRuleToken lv_values_32_0 = null;

        AntlrDatatypeRuleToken lv_values_35_0 = null;

        EObject lv_field_39_0 = null;

        AntlrDatatypeRuleToken lv_values_41_0 = null;

        AntlrDatatypeRuleToken lv_values_44_0 = null;

        EObject lv_field_48_0 = null;

        AntlrDatatypeRuleToken lv_values_50_0 = null;

        AntlrDatatypeRuleToken lv_values_53_0 = null;

        EObject lv_field_57_0 = null;

        AntlrDatatypeRuleToken lv_values_59_0 = null;

        AntlrDatatypeRuleToken lv_values_62_0 = null;

        EObject lv_field_66_0 = null;

        AntlrDatatypeRuleToken lv_values_68_0 = null;

        AntlrDatatypeRuleToken lv_values_71_0 = null;

        EObject lv_field_75_0 = null;

        AntlrDatatypeRuleToken lv_values_77_0 = null;

        AntlrDatatypeRuleToken lv_values_80_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:293:28: ( ( ( ruleUnaryExpression )? ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:294:1: ( ( ruleUnaryExpression )? ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:294:1: ( ( ruleUnaryExpression )? ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:294:2: ( ruleUnaryExpression )? ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:294:2: ( ruleUnaryExpression )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=83 && LA7_0<=86)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:295:5: ruleUnaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression596);
                    ruleUnaryExpression();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:302:3: ( ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? ) | ( ( ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_QUOTEDNAMEWITHWC && LA55_0<=RULE_NAMEWITHWC)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=20 && LA55_0<=66)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:302:4: ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:302:4: ( ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )? )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:302:5: ( (lv_default_1_0= ruleSimpleFieldValue ) ) (this_Boost_2= RULE_BOOST )?
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:302:5: ( (lv_default_1_0= ruleSimpleFieldValue ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:303:1: (lv_default_1_0= ruleSimpleFieldValue )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:303:1: (lv_default_1_0= ruleSimpleFieldValue )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:304:3: lv_default_1_0= ruleSimpleFieldValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getDefaultSimpleFieldValueParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression620);
                    lv_default_1_0=ruleSimpleFieldValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_1_0, 
                            		"SimpleFieldValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:320:2: (this_Boost_2= RULE_BOOST )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_BOOST) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:320:3: this_Boost_2= RULE_BOOST
                            {
                            this_Boost_2=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression632); 
                             
                                newLeafNode(this_Boost_2, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:325:6: ( ( ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:325:6: ( ( ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? ) | ( ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? ) | ( ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? ) | ( ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? ) | ( ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? ) | ( ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? ) | ( ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? ) | ( ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? ) | ( ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? ) )
                    int alt54=9;
                    switch ( input.LA(1) ) {
                    case 20:
                        {
                        alt54=1;
                        }
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        {
                        alt54=2;
                        }
                        break;
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                        {
                        alt54=3;
                        }
                        break;
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        alt54=4;
                        }
                        break;
                    case 61:
                        {
                        alt54=5;
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        alt54=6;
                        }
                        break;
                    case 64:
                        {
                        alt54=7;
                        }
                        break;
                    case 65:
                        {
                        alt54=8;
                        }
                        break;
                    case 66:
                        {
                        alt54=9;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:325:7: ( ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:325:7: ( ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:325:8: ( (lv_field_3_0= ruleDocumentTypeField ) ) otherlv_4= ':' ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) ) (this_Boost_11= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:325:8: ( (lv_field_3_0= ruleDocumentTypeField ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:326:1: (lv_field_3_0= ruleDocumentTypeField )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:326:1: (lv_field_3_0= ruleDocumentTypeField )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:327:3: lv_field_3_0= ruleDocumentTypeField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldDocumentTypeFieldParserRuleCall_1_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDocumentTypeField_in_ruleClauseExpression663);
                            lv_field_3_0=ruleDocumentTypeField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_3_0, 
                                    		"DocumentTypeField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleClauseExpression675); 

                                	newLeafNode(otherlv_4, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_0_1());
                                
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:347:1: ( ( (lv_values_5_0= ruleDocumentTypeFieldValue ) ) | (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' ) )
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( ((LA12_0>=73 && LA12_0<=77)) ) {
                                alt12=1;
                            }
                            else if ( (LA12_0==17) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 0, input);

                                throw nvae;
                            }
                            switch (alt12) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:347:2: ( (lv_values_5_0= ruleDocumentTypeFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:347:2: ( (lv_values_5_0= ruleDocumentTypeFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:348:1: (lv_values_5_0= ruleDocumentTypeFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:348:1: (lv_values_5_0= ruleDocumentTypeFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:349:3: lv_values_5_0= ruleDocumentTypeFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesDocumentTypeFieldValueParserRuleCall_1_1_0_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression697);
                                    lv_values_5_0=ruleDocumentTypeFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_5_0, 
                                            		"DocumentTypeFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:366:6: (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:366:6: (otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')' )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:366:8: otherlv_6= '(' ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )* otherlv_10= ')'
                                    {
                                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleClauseExpression716); 

                                        	newLeafNode(otherlv_6, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_0_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:370:1: ( ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )? )*
                                    loop11:
                                    do {
                                        int alt11=2;
                                        int LA11_0 = input.LA(1);

                                        if ( ((LA11_0>=73 && LA11_0<=77)||(LA11_0>=83 && LA11_0<=86)) ) {
                                            alt11=1;
                                        }


                                        switch (alt11) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:370:2: ( ruleUnaryExpression )? ( (lv_values_8_0= ruleDocumentTypeFieldValue ) ) (this_Boost_9= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:370:2: ( ruleUnaryExpression )?
                                    	    int alt9=2;
                                    	    int LA9_0 = input.LA(1);

                                    	    if ( ((LA9_0>=83 && LA9_0<=86)) ) {
                                    	        alt9=1;
                                    	    }
                                    	    switch (alt9) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:371:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_0_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression734);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:378:3: ( (lv_values_8_0= ruleDocumentTypeFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:379:1: (lv_values_8_0= ruleDocumentTypeFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:379:1: (lv_values_8_0= ruleDocumentTypeFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:380:3: lv_values_8_0= ruleDocumentTypeFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesDocumentTypeFieldValueParserRuleCall_1_1_0_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression756);
                                    	    lv_values_8_0=ruleDocumentTypeFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_8_0, 
                                    	            		"DocumentTypeFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:396:2: (this_Boost_9= RULE_BOOST )?
                                    	    int alt10=2;
                                    	    int LA10_0 = input.LA(1);

                                    	    if ( (LA10_0==RULE_BOOST) ) {
                                    	        alt10=1;
                                    	    }
                                    	    switch (alt10) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:396:3: this_Boost_9= RULE_BOOST
                                    	            {
                                    	            this_Boost_9=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression768); 
                                    	             
                                    	                newLeafNode(this_Boost_9, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_0_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop11;
                                        }
                                    } while (true);

                                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleClauseExpression783); 

                                        	newLeafNode(otherlv_10, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_0_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:404:3: (this_Boost_11= RULE_BOOST )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==RULE_BOOST) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:404:4: this_Boost_11= RULE_BOOST
                                    {
                                    this_Boost_11=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression797); 
                                     
                                        newLeafNode(this_Boost_11, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_0_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:409:6: ( ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:409:6: ( ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:409:7: ( (lv_field_12_0= ruleSimpleField ) ) otherlv_13= ':' ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) ) (this_Boost_20= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:409:7: ( (lv_field_12_0= ruleSimpleField ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:410:1: (lv_field_12_0= ruleSimpleField )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:410:1: (lv_field_12_0= ruleSimpleField )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:411:3: lv_field_12_0= ruleSimpleField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldSimpleFieldParserRuleCall_1_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSimpleField_in_ruleClauseExpression827);
                            lv_field_12_0=ruleSimpleField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_12_0, 
                                    		"SimpleField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleClauseExpression839); 

                                	newLeafNode(otherlv_13, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_1_1());
                                
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:431:1: ( ( (lv_values_14_0= ruleSimpleFieldValue ) ) | (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' ) )
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( ((LA17_0>=RULE_QUOTEDNAMEWITHWC && LA17_0<=RULE_NAMEWITHWC)) ) {
                                alt17=1;
                            }
                            else if ( (LA17_0==17) ) {
                                alt17=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 0, input);

                                throw nvae;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:431:2: ( (lv_values_14_0= ruleSimpleFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:431:2: ( (lv_values_14_0= ruleSimpleFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:432:1: (lv_values_14_0= ruleSimpleFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:432:1: (lv_values_14_0= ruleSimpleFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:433:3: lv_values_14_0= ruleSimpleFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesSimpleFieldValueParserRuleCall_1_1_1_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression861);
                                    lv_values_14_0=ruleSimpleFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_14_0, 
                                            		"SimpleFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:450:6: (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:450:6: (otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')' )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:450:8: otherlv_15= '(' ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )* otherlv_19= ')'
                                    {
                                    otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleClauseExpression880); 

                                        	newLeafNode(otherlv_15, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_1_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:454:1: ( ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )? )*
                                    loop16:
                                    do {
                                        int alt16=2;
                                        int LA16_0 = input.LA(1);

                                        if ( ((LA16_0>=RULE_QUOTEDNAMEWITHWC && LA16_0<=RULE_NAMEWITHWC)||(LA16_0>=83 && LA16_0<=86)) ) {
                                            alt16=1;
                                        }


                                        switch (alt16) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:454:2: ( ruleUnaryExpression )? ( (lv_values_17_0= ruleSimpleFieldValue ) ) (this_Boost_18= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:454:2: ( ruleUnaryExpression )?
                                    	    int alt14=2;
                                    	    int LA14_0 = input.LA(1);

                                    	    if ( ((LA14_0>=83 && LA14_0<=86)) ) {
                                    	        alt14=1;
                                    	    }
                                    	    switch (alt14) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:455:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_1_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression898);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:462:3: ( (lv_values_17_0= ruleSimpleFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:463:1: (lv_values_17_0= ruleSimpleFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:463:1: (lv_values_17_0= ruleSimpleFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:464:3: lv_values_17_0= ruleSimpleFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesSimpleFieldValueParserRuleCall_1_1_1_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression920);
                                    	    lv_values_17_0=ruleSimpleFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_17_0, 
                                    	            		"SimpleFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:480:2: (this_Boost_18= RULE_BOOST )?
                                    	    int alt15=2;
                                    	    int LA15_0 = input.LA(1);

                                    	    if ( (LA15_0==RULE_BOOST) ) {
                                    	        alt15=1;
                                    	    }
                                    	    switch (alt15) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:480:3: this_Boost_18= RULE_BOOST
                                    	            {
                                    	            this_Boost_18=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression932); 
                                    	             
                                    	                newLeafNode(this_Boost_18, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_1_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop16;
                                        }
                                    } while (true);

                                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleClauseExpression947); 

                                        	newLeafNode(otherlv_19, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_1_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:488:3: (this_Boost_20= RULE_BOOST )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==RULE_BOOST) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:488:4: this_Boost_20= RULE_BOOST
                                    {
                                    this_Boost_20=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression961); 
                                     
                                        newLeafNode(this_Boost_20, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_1_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:493:6: ( ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:493:6: ( ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:493:7: ( (lv_field_21_0= ruleTypeField ) ) otherlv_22= ':' ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) ) (this_Boost_29= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:493:7: ( (lv_field_21_0= ruleTypeField ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:494:1: (lv_field_21_0= ruleTypeField )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:494:1: (lv_field_21_0= ruleTypeField )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:495:3: lv_field_21_0= ruleTypeField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldTypeFieldParserRuleCall_1_1_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeField_in_ruleClauseExpression991);
                            lv_field_21_0=ruleTypeField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_21_0, 
                                    		"TypeField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleClauseExpression1003); 

                                	newLeafNode(otherlv_22, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_2_1());
                                
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:515:1: ( ( (lv_values_23_0= ruleTypeFieldValue ) ) | (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' ) )
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==RULE_NAMEWITHWC) ) {
                                alt22=1;
                            }
                            else if ( (LA22_0==17) ) {
                                alt22=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 0, input);

                                throw nvae;
                            }
                            switch (alt22) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:515:2: ( (lv_values_23_0= ruleTypeFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:515:2: ( (lv_values_23_0= ruleTypeFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:516:1: (lv_values_23_0= ruleTypeFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:516:1: (lv_values_23_0= ruleTypeFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:517:3: lv_values_23_0= ruleTypeFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesTypeFieldValueParserRuleCall_1_1_2_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression1025);
                                    lv_values_23_0=ruleTypeFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_23_0, 
                                            		"TypeFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:534:6: (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:534:6: (otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')' )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:534:8: otherlv_24= '(' ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )* otherlv_28= ')'
                                    {
                                    otherlv_24=(Token)match(input,17,FOLLOW_17_in_ruleClauseExpression1044); 

                                        	newLeafNode(otherlv_24, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_2_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:538:1: ( ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )? )*
                                    loop21:
                                    do {
                                        int alt21=2;
                                        int LA21_0 = input.LA(1);

                                        if ( (LA21_0==RULE_NAMEWITHWC||(LA21_0>=83 && LA21_0<=86)) ) {
                                            alt21=1;
                                        }


                                        switch (alt21) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:538:2: ( ruleUnaryExpression )? ( (lv_values_26_0= ruleTypeFieldValue ) ) (this_Boost_27= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:538:2: ( ruleUnaryExpression )?
                                    	    int alt19=2;
                                    	    int LA19_0 = input.LA(1);

                                    	    if ( ((LA19_0>=83 && LA19_0<=86)) ) {
                                    	        alt19=1;
                                    	    }
                                    	    switch (alt19) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:539:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_2_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1062);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:546:3: ( (lv_values_26_0= ruleTypeFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:547:1: (lv_values_26_0= ruleTypeFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:547:1: (lv_values_26_0= ruleTypeFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:548:3: lv_values_26_0= ruleTypeFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesTypeFieldValueParserRuleCall_1_1_2_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression1084);
                                    	    lv_values_26_0=ruleTypeFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_26_0, 
                                    	            		"TypeFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:564:2: (this_Boost_27= RULE_BOOST )?
                                    	    int alt20=2;
                                    	    int LA20_0 = input.LA(1);

                                    	    if ( (LA20_0==RULE_BOOST) ) {
                                    	        alt20=1;
                                    	    }
                                    	    switch (alt20) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:564:3: this_Boost_27= RULE_BOOST
                                    	            {
                                    	            this_Boost_27=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1096); 
                                    	             
                                    	                newLeafNode(this_Boost_27, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_2_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop21;
                                        }
                                    } while (true);

                                    otherlv_28=(Token)match(input,18,FOLLOW_18_in_ruleClauseExpression1111); 

                                        	newLeafNode(otherlv_28, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_2_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:572:3: (this_Boost_29= RULE_BOOST )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==RULE_BOOST) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:572:4: this_Boost_29= RULE_BOOST
                                    {
                                    this_Boost_29=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1125); 
                                     
                                        newLeafNode(this_Boost_29, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_2_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:577:6: ( ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:577:6: ( ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:577:7: ( (lv_field_30_0= ruleMethodField ) ) otherlv_31= ':' ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) ) (this_Boost_38= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:577:7: ( (lv_field_30_0= ruleMethodField ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:578:1: (lv_field_30_0= ruleMethodField )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:578:1: (lv_field_30_0= ruleMethodField )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:579:3: lv_field_30_0= ruleMethodField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldMethodFieldParserRuleCall_1_1_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMethodField_in_ruleClauseExpression1155);
                            lv_field_30_0=ruleMethodField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_30_0, 
                                    		"MethodField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_31=(Token)match(input,19,FOLLOW_19_in_ruleClauseExpression1167); 

                                	newLeafNode(otherlv_31, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_3_1());
                                
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:599:1: ( ( (lv_values_32_0= ruleMethodFieldValue ) ) | (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' ) )
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==RULE_NAMEWITHWC) ) {
                                alt27=1;
                            }
                            else if ( (LA27_0==17) ) {
                                alt27=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 0, input);

                                throw nvae;
                            }
                            switch (alt27) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:599:2: ( (lv_values_32_0= ruleMethodFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:599:2: ( (lv_values_32_0= ruleMethodFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:600:1: (lv_values_32_0= ruleMethodFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:600:1: (lv_values_32_0= ruleMethodFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:601:3: lv_values_32_0= ruleMethodFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesMethodFieldValueParserRuleCall_1_1_3_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression1189);
                                    lv_values_32_0=ruleMethodFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_32_0, 
                                            		"MethodFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:618:6: (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:618:6: (otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')' )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:618:8: otherlv_33= '(' ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )* otherlv_37= ')'
                                    {
                                    otherlv_33=(Token)match(input,17,FOLLOW_17_in_ruleClauseExpression1208); 

                                        	newLeafNode(otherlv_33, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_3_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:622:1: ( ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )? )*
                                    loop26:
                                    do {
                                        int alt26=2;
                                        int LA26_0 = input.LA(1);

                                        if ( (LA26_0==RULE_NAMEWITHWC||(LA26_0>=83 && LA26_0<=86)) ) {
                                            alt26=1;
                                        }


                                        switch (alt26) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:622:2: ( ruleUnaryExpression )? ( (lv_values_35_0= ruleMethodFieldValue ) ) (this_Boost_36= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:622:2: ( ruleUnaryExpression )?
                                    	    int alt24=2;
                                    	    int LA24_0 = input.LA(1);

                                    	    if ( ((LA24_0>=83 && LA24_0<=86)) ) {
                                    	        alt24=1;
                                    	    }
                                    	    switch (alt24) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:623:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_3_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1226);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:630:3: ( (lv_values_35_0= ruleMethodFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:631:1: (lv_values_35_0= ruleMethodFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:631:1: (lv_values_35_0= ruleMethodFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:632:3: lv_values_35_0= ruleMethodFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesMethodFieldValueParserRuleCall_1_1_3_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression1248);
                                    	    lv_values_35_0=ruleMethodFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_35_0, 
                                    	            		"MethodFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:648:2: (this_Boost_36= RULE_BOOST )?
                                    	    int alt25=2;
                                    	    int LA25_0 = input.LA(1);

                                    	    if ( (LA25_0==RULE_BOOST) ) {
                                    	        alt25=1;
                                    	    }
                                    	    switch (alt25) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:648:3: this_Boost_36= RULE_BOOST
                                    	            {
                                    	            this_Boost_36=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1260); 
                                    	             
                                    	                newLeafNode(this_Boost_36, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_3_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop26;
                                        }
                                    } while (true);

                                    otherlv_37=(Token)match(input,18,FOLLOW_18_in_ruleClauseExpression1275); 

                                        	newLeafNode(otherlv_37, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_3_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:656:3: (this_Boost_38= RULE_BOOST )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==RULE_BOOST) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:656:4: this_Boost_38= RULE_BOOST
                                    {
                                    this_Boost_38=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1289); 
                                     
                                        newLeafNode(this_Boost_38, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_3_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:661:6: ( ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:661:6: ( ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:661:7: ( (lv_field_39_0= ruleFilePathField ) ) otherlv_40= ':' ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) ) (this_Boost_47= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:661:7: ( (lv_field_39_0= ruleFilePathField ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:662:1: (lv_field_39_0= ruleFilePathField )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:662:1: (lv_field_39_0= ruleFilePathField )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:663:3: lv_field_39_0= ruleFilePathField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldFilePathFieldParserRuleCall_1_1_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFilePathField_in_ruleClauseExpression1319);
                            lv_field_39_0=ruleFilePathField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_39_0, 
                                    		"FilePathField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_40=(Token)match(input,19,FOLLOW_19_in_ruleClauseExpression1331); 

                                	newLeafNode(otherlv_40, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_4_1());
                                
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:683:1: ( ( (lv_values_41_0= ruleFilePathFieldValue ) ) | (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' ) )
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==RULE_PATHWITHWC) ) {
                                alt32=1;
                            }
                            else if ( (LA32_0==17) ) {
                                alt32=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 0, input);

                                throw nvae;
                            }
                            switch (alt32) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:683:2: ( (lv_values_41_0= ruleFilePathFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:683:2: ( (lv_values_41_0= ruleFilePathFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:684:1: (lv_values_41_0= ruleFilePathFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:684:1: (lv_values_41_0= ruleFilePathFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:685:3: lv_values_41_0= ruleFilePathFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesFilePathFieldValueParserRuleCall_1_1_4_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression1353);
                                    lv_values_41_0=ruleFilePathFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_41_0, 
                                            		"FilePathFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:702:6: (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:702:6: (otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')' )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:702:8: otherlv_42= '(' ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )* otherlv_46= ')'
                                    {
                                    otherlv_42=(Token)match(input,17,FOLLOW_17_in_ruleClauseExpression1372); 

                                        	newLeafNode(otherlv_42, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_4_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:706:1: ( ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )? )*
                                    loop31:
                                    do {
                                        int alt31=2;
                                        int LA31_0 = input.LA(1);

                                        if ( (LA31_0==RULE_PATHWITHWC||(LA31_0>=83 && LA31_0<=86)) ) {
                                            alt31=1;
                                        }


                                        switch (alt31) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:706:2: ( ruleUnaryExpression )? ( (lv_values_44_0= ruleFilePathFieldValue ) ) (this_Boost_45= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:706:2: ( ruleUnaryExpression )?
                                    	    int alt29=2;
                                    	    int LA29_0 = input.LA(1);

                                    	    if ( ((LA29_0>=83 && LA29_0<=86)) ) {
                                    	        alt29=1;
                                    	    }
                                    	    switch (alt29) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:707:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_4_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1390);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:714:3: ( (lv_values_44_0= ruleFilePathFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:715:1: (lv_values_44_0= ruleFilePathFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:715:1: (lv_values_44_0= ruleFilePathFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:716:3: lv_values_44_0= ruleFilePathFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesFilePathFieldValueParserRuleCall_1_1_4_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression1412);
                                    	    lv_values_44_0=ruleFilePathFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_44_0, 
                                    	            		"FilePathFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:732:2: (this_Boost_45= RULE_BOOST )?
                                    	    int alt30=2;
                                    	    int LA30_0 = input.LA(1);

                                    	    if ( (LA30_0==RULE_BOOST) ) {
                                    	        alt30=1;
                                    	    }
                                    	    switch (alt30) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:732:3: this_Boost_45= RULE_BOOST
                                    	            {
                                    	            this_Boost_45=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1424); 
                                    	             
                                    	                newLeafNode(this_Boost_45, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_4_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop31;
                                        }
                                    } while (true);

                                    otherlv_46=(Token)match(input,18,FOLLOW_18_in_ruleClauseExpression1439); 

                                        	newLeafNode(otherlv_46, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_4_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:740:3: (this_Boost_47= RULE_BOOST )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==RULE_BOOST) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:740:4: this_Boost_47= RULE_BOOST
                                    {
                                    this_Boost_47=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1453); 
                                     
                                        newLeafNode(this_Boost_47, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_4_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:745:6: ( ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:745:6: ( ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:745:7: ( (lv_field_48_0= ruleNumberField ) ) otherlv_49= ':' ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) ) (this_Boost_56= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:745:7: ( (lv_field_48_0= ruleNumberField ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:746:1: (lv_field_48_0= ruleNumberField )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:746:1: (lv_field_48_0= ruleNumberField )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:747:3: lv_field_48_0= ruleNumberField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldNumberFieldParserRuleCall_1_1_5_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNumberField_in_ruleClauseExpression1483);
                            lv_field_48_0=ruleNumberField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_48_0, 
                                    		"NumberField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_49=(Token)match(input,19,FOLLOW_19_in_ruleClauseExpression1495); 

                                	newLeafNode(otherlv_49, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_5_1());
                                
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:767:1: ( ( (lv_values_50_0= ruleNumberFieldValue ) ) | (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' ) )
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==RULE_INT) ) {
                                alt37=1;
                            }
                            else if ( (LA37_0==17) ) {
                                alt37=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 37, 0, input);

                                throw nvae;
                            }
                            switch (alt37) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:767:2: ( (lv_values_50_0= ruleNumberFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:767:2: ( (lv_values_50_0= ruleNumberFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:768:1: (lv_values_50_0= ruleNumberFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:768:1: (lv_values_50_0= ruleNumberFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:769:3: lv_values_50_0= ruleNumberFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesNumberFieldValueParserRuleCall_1_1_5_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression1517);
                                    lv_values_50_0=ruleNumberFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_50_0, 
                                            		"NumberFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:786:6: (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:786:6: (otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')' )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:786:8: otherlv_51= '(' ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )* otherlv_55= ')'
                                    {
                                    otherlv_51=(Token)match(input,17,FOLLOW_17_in_ruleClauseExpression1536); 

                                        	newLeafNode(otherlv_51, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_5_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:790:1: ( ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )? )*
                                    loop36:
                                    do {
                                        int alt36=2;
                                        int LA36_0 = input.LA(1);

                                        if ( (LA36_0==RULE_INT||(LA36_0>=83 && LA36_0<=86)) ) {
                                            alt36=1;
                                        }


                                        switch (alt36) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:790:2: ( ruleUnaryExpression )? ( (lv_values_53_0= ruleNumberFieldValue ) ) (this_Boost_54= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:790:2: ( ruleUnaryExpression )?
                                    	    int alt34=2;
                                    	    int LA34_0 = input.LA(1);

                                    	    if ( ((LA34_0>=83 && LA34_0<=86)) ) {
                                    	        alt34=1;
                                    	    }
                                    	    switch (alt34) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:791:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_5_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1554);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:798:3: ( (lv_values_53_0= ruleNumberFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:799:1: (lv_values_53_0= ruleNumberFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:799:1: (lv_values_53_0= ruleNumberFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:800:3: lv_values_53_0= ruleNumberFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesNumberFieldValueParserRuleCall_1_1_5_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression1576);
                                    	    lv_values_53_0=ruleNumberFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_53_0, 
                                    	            		"NumberFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:816:2: (this_Boost_54= RULE_BOOST )?
                                    	    int alt35=2;
                                    	    int LA35_0 = input.LA(1);

                                    	    if ( (LA35_0==RULE_BOOST) ) {
                                    	        alt35=1;
                                    	    }
                                    	    switch (alt35) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:816:3: this_Boost_54= RULE_BOOST
                                    	            {
                                    	            this_Boost_54=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1588); 
                                    	             
                                    	                newLeafNode(this_Boost_54, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_5_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop36;
                                        }
                                    } while (true);

                                    otherlv_55=(Token)match(input,18,FOLLOW_18_in_ruleClauseExpression1603); 

                                        	newLeafNode(otherlv_55, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_5_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:824:3: (this_Boost_56= RULE_BOOST )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==RULE_BOOST) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:824:4: this_Boost_56= RULE_BOOST
                                    {
                                    this_Boost_56=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1617); 
                                     
                                        newLeafNode(this_Boost_56, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_5_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 7 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:829:6: ( ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:829:6: ( ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:829:7: ( (lv_field_57_0= ruleModifierField ) ) otherlv_58= ':' ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) ) (this_Boost_65= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:829:7: ( (lv_field_57_0= ruleModifierField ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:830:1: (lv_field_57_0= ruleModifierField )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:830:1: (lv_field_57_0= ruleModifierField )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:831:3: lv_field_57_0= ruleModifierField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldModifierFieldParserRuleCall_1_1_6_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleModifierField_in_ruleClauseExpression1647);
                            lv_field_57_0=ruleModifierField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_57_0, 
                                    		"ModifierField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_58=(Token)match(input,19,FOLLOW_19_in_ruleClauseExpression1659); 

                                	newLeafNode(otherlv_58, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_6_1());
                                
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:851:1: ( ( (lv_values_59_0= ruleModifierFieldValue ) ) | (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' ) )
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( ((LA42_0>=67 && LA42_0<=72)) ) {
                                alt42=1;
                            }
                            else if ( (LA42_0==17) ) {
                                alt42=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 42, 0, input);

                                throw nvae;
                            }
                            switch (alt42) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:851:2: ( (lv_values_59_0= ruleModifierFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:851:2: ( (lv_values_59_0= ruleModifierFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:852:1: (lv_values_59_0= ruleModifierFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:852:1: (lv_values_59_0= ruleModifierFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:853:3: lv_values_59_0= ruleModifierFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesModifierFieldValueParserRuleCall_1_1_6_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression1681);
                                    lv_values_59_0=ruleModifierFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_59_0, 
                                            		"ModifierFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:870:6: (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:870:6: (otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')' )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:870:8: otherlv_60= '(' ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )* otherlv_64= ')'
                                    {
                                    otherlv_60=(Token)match(input,17,FOLLOW_17_in_ruleClauseExpression1700); 

                                        	newLeafNode(otherlv_60, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_6_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:874:1: ( ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )? )*
                                    loop41:
                                    do {
                                        int alt41=2;
                                        int LA41_0 = input.LA(1);

                                        if ( ((LA41_0>=67 && LA41_0<=72)||(LA41_0>=83 && LA41_0<=86)) ) {
                                            alt41=1;
                                        }


                                        switch (alt41) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:874:2: ( ruleUnaryExpression )? ( (lv_values_62_0= ruleModifierFieldValue ) ) (this_Boost_63= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:874:2: ( ruleUnaryExpression )?
                                    	    int alt39=2;
                                    	    int LA39_0 = input.LA(1);

                                    	    if ( ((LA39_0>=83 && LA39_0<=86)) ) {
                                    	        alt39=1;
                                    	    }
                                    	    switch (alt39) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:875:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_6_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1718);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:882:3: ( (lv_values_62_0= ruleModifierFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:883:1: (lv_values_62_0= ruleModifierFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:883:1: (lv_values_62_0= ruleModifierFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:884:3: lv_values_62_0= ruleModifierFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesModifierFieldValueParserRuleCall_1_1_6_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression1740);
                                    	    lv_values_62_0=ruleModifierFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_62_0, 
                                    	            		"ModifierFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:900:2: (this_Boost_63= RULE_BOOST )?
                                    	    int alt40=2;
                                    	    int LA40_0 = input.LA(1);

                                    	    if ( (LA40_0==RULE_BOOST) ) {
                                    	        alt40=1;
                                    	    }
                                    	    switch (alt40) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:900:3: this_Boost_63= RULE_BOOST
                                    	            {
                                    	            this_Boost_63=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1752); 
                                    	             
                                    	                newLeafNode(this_Boost_63, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_6_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop41;
                                        }
                                    } while (true);

                                    otherlv_64=(Token)match(input,18,FOLLOW_18_in_ruleClauseExpression1767); 

                                        	newLeafNode(otherlv_64, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_6_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:908:3: (this_Boost_65= RULE_BOOST )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==RULE_BOOST) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:908:4: this_Boost_65= RULE_BOOST
                                    {
                                    this_Boost_65=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1781); 
                                     
                                        newLeafNode(this_Boost_65, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_6_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 8 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:913:6: ( ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:913:6: ( ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:913:7: ( (lv_field_66_0= ruleProjectNameField ) ) otherlv_67= ':' ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) ) (this_Boost_74= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:913:7: ( (lv_field_66_0= ruleProjectNameField ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:914:1: (lv_field_66_0= ruleProjectNameField )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:914:1: (lv_field_66_0= ruleProjectNameField )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:915:3: lv_field_66_0= ruleProjectNameField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldProjectNameFieldParserRuleCall_1_1_7_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleProjectNameField_in_ruleClauseExpression1811);
                            lv_field_66_0=ruleProjectNameField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_66_0, 
                                    		"ProjectNameField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_67=(Token)match(input,19,FOLLOW_19_in_ruleClauseExpression1823); 

                                	newLeafNode(otherlv_67, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_7_1());
                                
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:935:1: ( ( (lv_values_68_0= ruleProjectNameFieldValue ) ) | (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' ) )
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==RULE_NAMEWITHWC) ) {
                                alt47=1;
                            }
                            else if ( (LA47_0==17) ) {
                                alt47=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 0, input);

                                throw nvae;
                            }
                            switch (alt47) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:935:2: ( (lv_values_68_0= ruleProjectNameFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:935:2: ( (lv_values_68_0= ruleProjectNameFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:936:1: (lv_values_68_0= ruleProjectNameFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:936:1: (lv_values_68_0= ruleProjectNameFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:937:3: lv_values_68_0= ruleProjectNameFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesProjectNameFieldValueParserRuleCall_1_1_7_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression1845);
                                    lv_values_68_0=ruleProjectNameFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_68_0, 
                                            		"ProjectNameFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:954:6: (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:954:6: (otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')' )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:954:8: otherlv_69= '(' ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )* otherlv_73= ')'
                                    {
                                    otherlv_69=(Token)match(input,17,FOLLOW_17_in_ruleClauseExpression1864); 

                                        	newLeafNode(otherlv_69, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_7_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:958:1: ( ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )? )*
                                    loop46:
                                    do {
                                        int alt46=2;
                                        int LA46_0 = input.LA(1);

                                        if ( (LA46_0==RULE_NAMEWITHWC||(LA46_0>=83 && LA46_0<=86)) ) {
                                            alt46=1;
                                        }


                                        switch (alt46) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:958:2: ( ruleUnaryExpression )? ( (lv_values_71_0= ruleProjectNameFieldValue ) ) (this_Boost_72= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:958:2: ( ruleUnaryExpression )?
                                    	    int alt44=2;
                                    	    int LA44_0 = input.LA(1);

                                    	    if ( ((LA44_0>=83 && LA44_0<=86)) ) {
                                    	        alt44=1;
                                    	    }
                                    	    switch (alt44) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:959:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_7_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1882);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:966:3: ( (lv_values_71_0= ruleProjectNameFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:967:1: (lv_values_71_0= ruleProjectNameFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:967:1: (lv_values_71_0= ruleProjectNameFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:968:3: lv_values_71_0= ruleProjectNameFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesProjectNameFieldValueParserRuleCall_1_1_7_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression1904);
                                    	    lv_values_71_0=ruleProjectNameFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_71_0, 
                                    	            		"ProjectNameFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:984:2: (this_Boost_72= RULE_BOOST )?
                                    	    int alt45=2;
                                    	    int LA45_0 = input.LA(1);

                                    	    if ( (LA45_0==RULE_BOOST) ) {
                                    	        alt45=1;
                                    	    }
                                    	    switch (alt45) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:984:3: this_Boost_72= RULE_BOOST
                                    	            {
                                    	            this_Boost_72=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1916); 
                                    	             
                                    	                newLeafNode(this_Boost_72, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_7_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop46;
                                        }
                                    } while (true);

                                    otherlv_73=(Token)match(input,18,FOLLOW_18_in_ruleClauseExpression1931); 

                                        	newLeafNode(otherlv_73, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_7_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:992:3: (this_Boost_74= RULE_BOOST )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==RULE_BOOST) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:992:4: this_Boost_74= RULE_BOOST
                                    {
                                    this_Boost_74=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression1945); 
                                     
                                        newLeafNode(this_Boost_74, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_7_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 9 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:997:6: ( ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:997:6: ( ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )? )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:997:7: ( (lv_field_75_0= ruleDefinitionTypeField ) ) otherlv_76= ':' ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) ) (this_Boost_83= RULE_BOOST )?
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:997:7: ( (lv_field_75_0= ruleDefinitionTypeField ) )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:998:1: (lv_field_75_0= ruleDefinitionTypeField )
                            {
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:998:1: (lv_field_75_0= ruleDefinitionTypeField )
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:999:3: lv_field_75_0= ruleDefinitionTypeField
                            {
                             
                            	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getFieldDefinitionTypeFieldParserRuleCall_1_1_8_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDefinitionTypeField_in_ruleClauseExpression1975);
                            lv_field_75_0=ruleDefinitionTypeField();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"field",
                                    		lv_field_75_0, 
                                    		"DefinitionTypeField");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_76=(Token)match(input,19,FOLLOW_19_in_ruleClauseExpression1987); 

                                	newLeafNode(otherlv_76, grammarAccess.getClauseExpressionAccess().getColonKeyword_1_1_8_1());
                                
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1019:1: ( ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) ) | (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' ) )
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( ((LA52_0>=78 && LA52_0<=82)) ) {
                                alt52=1;
                            }
                            else if ( (LA52_0==17) ) {
                                alt52=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 52, 0, input);

                                throw nvae;
                            }
                            switch (alt52) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1019:2: ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1019:2: ( (lv_values_77_0= ruleDefinitionTypeFieldValue ) )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1020:1: (lv_values_77_0= ruleDefinitionTypeFieldValue )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1020:1: (lv_values_77_0= ruleDefinitionTypeFieldValue )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1021:3: lv_values_77_0= ruleDefinitionTypeFieldValue
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesDefinitionTypeFieldValueParserRuleCall_1_1_8_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleDefinitionTypeFieldValue_in_ruleClauseExpression2009);
                                    lv_values_77_0=ruleDefinitionTypeFieldValue();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"values",
                                            		lv_values_77_0, 
                                            		"DefinitionTypeFieldValue");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1038:6: (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' )
                                    {
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1038:6: (otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')' )
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1038:8: otherlv_78= '(' ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )* otherlv_82= ')'
                                    {
                                    otherlv_78=(Token)match(input,17,FOLLOW_17_in_ruleClauseExpression2028); 

                                        	newLeafNode(otherlv_78, grammarAccess.getClauseExpressionAccess().getLeftParenthesisKeyword_1_1_8_2_1_0());
                                        
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1042:1: ( ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )? )*
                                    loop51:
                                    do {
                                        int alt51=2;
                                        int LA51_0 = input.LA(1);

                                        if ( ((LA51_0>=78 && LA51_0<=86)) ) {
                                            alt51=1;
                                        }


                                        switch (alt51) {
                                    	case 1 :
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1042:2: ( ruleUnaryExpression )? ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) ) (this_Boost_81= RULE_BOOST )?
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1042:2: ( ruleUnaryExpression )?
                                    	    int alt49=2;
                                    	    int LA49_0 = input.LA(1);

                                    	    if ( ((LA49_0>=83 && LA49_0<=86)) ) {
                                    	        alt49=1;
                                    	    }
                                    	    switch (alt49) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1043:5: ruleUnaryExpression
                                    	            {
                                    	             
                                    	                    newCompositeNode(grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_8_2_1_1_0()); 
                                    	                
                                    	            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleClauseExpression2046);
                                    	            ruleUnaryExpression();

                                    	            state._fsp--;

                                    	             
                                    	                    afterParserOrEnumRuleCall();
                                    	                

                                    	            }
                                    	            break;

                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1050:3: ( (lv_values_80_0= ruleDefinitionTypeFieldValue ) )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1051:1: (lv_values_80_0= ruleDefinitionTypeFieldValue )
                                    	    {
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1051:1: (lv_values_80_0= ruleDefinitionTypeFieldValue )
                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1052:3: lv_values_80_0= ruleDefinitionTypeFieldValue
                                    	    {
                                    	     
                                    	    	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getValuesDefinitionTypeFieldValueParserRuleCall_1_1_8_2_1_1_1_0()); 
                                    	    	    
                                    	    pushFollow(FOLLOW_ruleDefinitionTypeFieldValue_in_ruleClauseExpression2068);
                                    	    lv_values_80_0=ruleDefinitionTypeFieldValue();

                                    	    state._fsp--;


                                    	    	        if (current==null) {
                                    	    	            current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
                                    	    	        }
                                    	           		add(
                                    	           			current, 
                                    	           			"values",
                                    	            		lv_values_80_0, 
                                    	            		"DefinitionTypeFieldValue");
                                    	    	        afterParserOrEnumRuleCall();
                                    	    	    

                                    	    }


                                    	    }

                                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1068:2: (this_Boost_81= RULE_BOOST )?
                                    	    int alt50=2;
                                    	    int LA50_0 = input.LA(1);

                                    	    if ( (LA50_0==RULE_BOOST) ) {
                                    	        alt50=1;
                                    	    }
                                    	    switch (alt50) {
                                    	        case 1 :
                                    	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1068:3: this_Boost_81= RULE_BOOST
                                    	            {
                                    	            this_Boost_81=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression2080); 
                                    	             
                                    	                newLeafNode(this_Boost_81, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_8_2_1_1_2()); 
                                    	                

                                    	            }
                                    	            break;

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop51;
                                        }
                                    } while (true);

                                    otherlv_82=(Token)match(input,18,FOLLOW_18_in_ruleClauseExpression2095); 

                                        	newLeafNode(otherlv_82, grammarAccess.getClauseExpressionAccess().getRightParenthesisKeyword_1_1_8_2_1_2());
                                        

                                    }


                                    }
                                    break;

                            }

                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1076:3: (this_Boost_83= RULE_BOOST )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==RULE_BOOST) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1076:4: this_Boost_83= RULE_BOOST
                                    {
                                    this_Boost_83=(Token)match(input,RULE_BOOST,FOLLOW_RULE_BOOST_in_ruleClauseExpression2109); 
                                     
                                        newLeafNode(this_Boost_83, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_8_3()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleClauseExpression"


    // $ANTLR start "entryRuleDocumentTypeField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1088:1: entryRuleDocumentTypeField returns [EObject current=null] : iv_ruleDocumentTypeField= ruleDocumentTypeField EOF ;
    public final EObject entryRuleDocumentTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentTypeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1089:2: (iv_ruleDocumentTypeField= ruleDocumentTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1090:2: iv_ruleDocumentTypeField= ruleDocumentTypeField EOF
            {
             newCompositeNode(grammarAccess.getDocumentTypeFieldRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField2149);
            iv_ruleDocumentTypeField=ruleDocumentTypeField();

            state._fsp--;

             current =iv_ruleDocumentTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeField2159); 

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
    // $ANTLR end "entryRuleDocumentTypeField"


    // $ANTLR start "ruleDocumentTypeField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1097:1: ruleDocumentTypeField returns [EObject current=null] : ( (lv_value_0_0= 'Type' ) ) ;
    public final EObject ruleDocumentTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1100:28: ( ( (lv_value_0_0= 'Type' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1101:1: ( (lv_value_0_0= 'Type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1101:1: ( (lv_value_0_0= 'Type' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1102:1: (lv_value_0_0= 'Type' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1102:1: (lv_value_0_0= 'Type' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1103:3: lv_value_0_0= 'Type'
            {
            lv_value_0_0=(Token)match(input,20,FOLLOW_20_in_ruleDocumentTypeField2201); 

                    newLeafNode(lv_value_0_0, grammarAccess.getDocumentTypeFieldAccess().getValueTypeKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDocumentTypeFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "Type");
            	    

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
    // $ANTLR end "ruleDocumentTypeField"


    // $ANTLR start "entryRuleSimpleField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1124:1: entryRuleSimpleField returns [EObject current=null] : iv_ruleSimpleField= ruleSimpleField EOF ;
    public final EObject entryRuleSimpleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1125:2: (iv_ruleSimpleField= ruleSimpleField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1126:2: iv_ruleSimpleField= ruleSimpleField EOF
            {
             newCompositeNode(grammarAccess.getSimpleFieldRule()); 
            pushFollow(FOLLOW_ruleSimpleField_in_entryRuleSimpleField2249);
            iv_ruleSimpleField=ruleSimpleField();

            state._fsp--;

             current =iv_ruleSimpleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleField2259); 

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
    // $ANTLR end "entryRuleSimpleField"


    // $ANTLR start "ruleSimpleField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1133:1: ruleSimpleField returns [EObject current=null] : ( ( (lv_value_0_0= 'Handle' ) ) | ( (lv_value_1_0= 'FriendlyName' ) ) | ( (lv_value_2_0= 'ReturnVariableExpressions' ) ) | ( (lv_value_3_0= 'AllDeclaredMethodNames' ) ) | ( (lv_value_4_0= 'DeclaredMethodNames' ) ) | ( (lv_value_5_0= 'DeclaredFieldNames' ) ) | ( (lv_value_6_0= 'AllDeclaredFieldNames' ) ) | ( (lv_value_7_0= 'FullText' ) ) | ( (lv_value_8_0= 'FieldsRead' ) ) | ( (lv_value_9_0= 'FieldsWritten' ) ) | ( (lv_value_10_0= 'UsedFieldsInFinally' ) ) | ( (lv_value_11_0= 'UsedFieldsInTry' ) ) | ( (lv_value_12_0= 'VariableName' ) ) | ( (lv_value_13_0= 'ParameterTypesStructural' ) ) | ( (lv_value_14_0= 'Annotations' ) ) ) ;
    public final EObject ruleSimpleField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Token lv_value_5_0=null;
        Token lv_value_6_0=null;
        Token lv_value_7_0=null;
        Token lv_value_8_0=null;
        Token lv_value_9_0=null;
        Token lv_value_10_0=null;
        Token lv_value_11_0=null;
        Token lv_value_12_0=null;
        Token lv_value_13_0=null;
        Token lv_value_14_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1136:28: ( ( ( (lv_value_0_0= 'Handle' ) ) | ( (lv_value_1_0= 'FriendlyName' ) ) | ( (lv_value_2_0= 'ReturnVariableExpressions' ) ) | ( (lv_value_3_0= 'AllDeclaredMethodNames' ) ) | ( (lv_value_4_0= 'DeclaredMethodNames' ) ) | ( (lv_value_5_0= 'DeclaredFieldNames' ) ) | ( (lv_value_6_0= 'AllDeclaredFieldNames' ) ) | ( (lv_value_7_0= 'FullText' ) ) | ( (lv_value_8_0= 'FieldsRead' ) ) | ( (lv_value_9_0= 'FieldsWritten' ) ) | ( (lv_value_10_0= 'UsedFieldsInFinally' ) ) | ( (lv_value_11_0= 'UsedFieldsInTry' ) ) | ( (lv_value_12_0= 'VariableName' ) ) | ( (lv_value_13_0= 'ParameterTypesStructural' ) ) | ( (lv_value_14_0= 'Annotations' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1137:1: ( ( (lv_value_0_0= 'Handle' ) ) | ( (lv_value_1_0= 'FriendlyName' ) ) | ( (lv_value_2_0= 'ReturnVariableExpressions' ) ) | ( (lv_value_3_0= 'AllDeclaredMethodNames' ) ) | ( (lv_value_4_0= 'DeclaredMethodNames' ) ) | ( (lv_value_5_0= 'DeclaredFieldNames' ) ) | ( (lv_value_6_0= 'AllDeclaredFieldNames' ) ) | ( (lv_value_7_0= 'FullText' ) ) | ( (lv_value_8_0= 'FieldsRead' ) ) | ( (lv_value_9_0= 'FieldsWritten' ) ) | ( (lv_value_10_0= 'UsedFieldsInFinally' ) ) | ( (lv_value_11_0= 'UsedFieldsInTry' ) ) | ( (lv_value_12_0= 'VariableName' ) ) | ( (lv_value_13_0= 'ParameterTypesStructural' ) ) | ( (lv_value_14_0= 'Annotations' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1137:1: ( ( (lv_value_0_0= 'Handle' ) ) | ( (lv_value_1_0= 'FriendlyName' ) ) | ( (lv_value_2_0= 'ReturnVariableExpressions' ) ) | ( (lv_value_3_0= 'AllDeclaredMethodNames' ) ) | ( (lv_value_4_0= 'DeclaredMethodNames' ) ) | ( (lv_value_5_0= 'DeclaredFieldNames' ) ) | ( (lv_value_6_0= 'AllDeclaredFieldNames' ) ) | ( (lv_value_7_0= 'FullText' ) ) | ( (lv_value_8_0= 'FieldsRead' ) ) | ( (lv_value_9_0= 'FieldsWritten' ) ) | ( (lv_value_10_0= 'UsedFieldsInFinally' ) ) | ( (lv_value_11_0= 'UsedFieldsInTry' ) ) | ( (lv_value_12_0= 'VariableName' ) ) | ( (lv_value_13_0= 'ParameterTypesStructural' ) ) | ( (lv_value_14_0= 'Annotations' ) ) )
            int alt56=15;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt56=1;
                }
                break;
            case 22:
                {
                alt56=2;
                }
                break;
            case 23:
                {
                alt56=3;
                }
                break;
            case 24:
                {
                alt56=4;
                }
                break;
            case 25:
                {
                alt56=5;
                }
                break;
            case 26:
                {
                alt56=6;
                }
                break;
            case 27:
                {
                alt56=7;
                }
                break;
            case 28:
                {
                alt56=8;
                }
                break;
            case 29:
                {
                alt56=9;
                }
                break;
            case 30:
                {
                alt56=10;
                }
                break;
            case 31:
                {
                alt56=11;
                }
                break;
            case 32:
                {
                alt56=12;
                }
                break;
            case 33:
                {
                alt56=13;
                }
                break;
            case 34:
                {
                alt56=14;
                }
                break;
            case 35:
                {
                alt56=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1137:2: ( (lv_value_0_0= 'Handle' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1137:2: ( (lv_value_0_0= 'Handle' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1138:1: (lv_value_0_0= 'Handle' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1138:1: (lv_value_0_0= 'Handle' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1139:3: lv_value_0_0= 'Handle'
                    {
                    lv_value_0_0=(Token)match(input,21,FOLLOW_21_in_ruleSimpleField2302); 

                            newLeafNode(lv_value_0_0, grammarAccess.getSimpleFieldAccess().getValueHandleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "Handle");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1153:6: ( (lv_value_1_0= 'FriendlyName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1153:6: ( (lv_value_1_0= 'FriendlyName' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1154:1: (lv_value_1_0= 'FriendlyName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1154:1: (lv_value_1_0= 'FriendlyName' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1155:3: lv_value_1_0= 'FriendlyName'
                    {
                    lv_value_1_0=(Token)match(input,22,FOLLOW_22_in_ruleSimpleField2339); 

                            newLeafNode(lv_value_1_0, grammarAccess.getSimpleFieldAccess().getValueFriendlyNameKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "FriendlyName");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1169:6: ( (lv_value_2_0= 'ReturnVariableExpressions' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1169:6: ( (lv_value_2_0= 'ReturnVariableExpressions' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1170:1: (lv_value_2_0= 'ReturnVariableExpressions' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1170:1: (lv_value_2_0= 'ReturnVariableExpressions' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1171:3: lv_value_2_0= 'ReturnVariableExpressions'
                    {
                    lv_value_2_0=(Token)match(input,23,FOLLOW_23_in_ruleSimpleField2376); 

                            newLeafNode(lv_value_2_0, grammarAccess.getSimpleFieldAccess().getValueReturnVariableExpressionsKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "ReturnVariableExpressions");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1185:6: ( (lv_value_3_0= 'AllDeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1185:6: ( (lv_value_3_0= 'AllDeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1186:1: (lv_value_3_0= 'AllDeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1186:1: (lv_value_3_0= 'AllDeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1187:3: lv_value_3_0= 'AllDeclaredMethodNames'
                    {
                    lv_value_3_0=(Token)match(input,24,FOLLOW_24_in_ruleSimpleField2413); 

                            newLeafNode(lv_value_3_0, grammarAccess.getSimpleFieldAccess().getValueAllDeclaredMethodNamesKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "AllDeclaredMethodNames");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1201:6: ( (lv_value_4_0= 'DeclaredMethodNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1201:6: ( (lv_value_4_0= 'DeclaredMethodNames' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1202:1: (lv_value_4_0= 'DeclaredMethodNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1202:1: (lv_value_4_0= 'DeclaredMethodNames' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1203:3: lv_value_4_0= 'DeclaredMethodNames'
                    {
                    lv_value_4_0=(Token)match(input,25,FOLLOW_25_in_ruleSimpleField2450); 

                            newLeafNode(lv_value_4_0, grammarAccess.getSimpleFieldAccess().getValueDeclaredMethodNamesKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "DeclaredMethodNames");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1217:6: ( (lv_value_5_0= 'DeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1217:6: ( (lv_value_5_0= 'DeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1218:1: (lv_value_5_0= 'DeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1218:1: (lv_value_5_0= 'DeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1219:3: lv_value_5_0= 'DeclaredFieldNames'
                    {
                    lv_value_5_0=(Token)match(input,26,FOLLOW_26_in_ruleSimpleField2487); 

                            newLeafNode(lv_value_5_0, grammarAccess.getSimpleFieldAccess().getValueDeclaredFieldNamesKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_5_0, "DeclaredFieldNames");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1233:6: ( (lv_value_6_0= 'AllDeclaredFieldNames' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1233:6: ( (lv_value_6_0= 'AllDeclaredFieldNames' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1234:1: (lv_value_6_0= 'AllDeclaredFieldNames' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1234:1: (lv_value_6_0= 'AllDeclaredFieldNames' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1235:3: lv_value_6_0= 'AllDeclaredFieldNames'
                    {
                    lv_value_6_0=(Token)match(input,27,FOLLOW_27_in_ruleSimpleField2524); 

                            newLeafNode(lv_value_6_0, grammarAccess.getSimpleFieldAccess().getValueAllDeclaredFieldNamesKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_6_0, "AllDeclaredFieldNames");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1249:6: ( (lv_value_7_0= 'FullText' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1249:6: ( (lv_value_7_0= 'FullText' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1250:1: (lv_value_7_0= 'FullText' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1250:1: (lv_value_7_0= 'FullText' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1251:3: lv_value_7_0= 'FullText'
                    {
                    lv_value_7_0=(Token)match(input,28,FOLLOW_28_in_ruleSimpleField2561); 

                            newLeafNode(lv_value_7_0, grammarAccess.getSimpleFieldAccess().getValueFullTextKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_7_0, "FullText");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1265:6: ( (lv_value_8_0= 'FieldsRead' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1265:6: ( (lv_value_8_0= 'FieldsRead' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1266:1: (lv_value_8_0= 'FieldsRead' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1266:1: (lv_value_8_0= 'FieldsRead' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1267:3: lv_value_8_0= 'FieldsRead'
                    {
                    lv_value_8_0=(Token)match(input,29,FOLLOW_29_in_ruleSimpleField2598); 

                            newLeafNode(lv_value_8_0, grammarAccess.getSimpleFieldAccess().getValueFieldsReadKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_8_0, "FieldsRead");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1281:6: ( (lv_value_9_0= 'FieldsWritten' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1281:6: ( (lv_value_9_0= 'FieldsWritten' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1282:1: (lv_value_9_0= 'FieldsWritten' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1282:1: (lv_value_9_0= 'FieldsWritten' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1283:3: lv_value_9_0= 'FieldsWritten'
                    {
                    lv_value_9_0=(Token)match(input,30,FOLLOW_30_in_ruleSimpleField2635); 

                            newLeafNode(lv_value_9_0, grammarAccess.getSimpleFieldAccess().getValueFieldsWrittenKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_9_0, "FieldsWritten");
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1297:6: ( (lv_value_10_0= 'UsedFieldsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1297:6: ( (lv_value_10_0= 'UsedFieldsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1298:1: (lv_value_10_0= 'UsedFieldsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1298:1: (lv_value_10_0= 'UsedFieldsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1299:3: lv_value_10_0= 'UsedFieldsInFinally'
                    {
                    lv_value_10_0=(Token)match(input,31,FOLLOW_31_in_ruleSimpleField2672); 

                            newLeafNode(lv_value_10_0, grammarAccess.getSimpleFieldAccess().getValueUsedFieldsInFinallyKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_10_0, "UsedFieldsInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1313:6: ( (lv_value_11_0= 'UsedFieldsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1313:6: ( (lv_value_11_0= 'UsedFieldsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1314:1: (lv_value_11_0= 'UsedFieldsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1314:1: (lv_value_11_0= 'UsedFieldsInTry' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1315:3: lv_value_11_0= 'UsedFieldsInTry'
                    {
                    lv_value_11_0=(Token)match(input,32,FOLLOW_32_in_ruleSimpleField2709); 

                            newLeafNode(lv_value_11_0, grammarAccess.getSimpleFieldAccess().getValueUsedFieldsInTryKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_11_0, "UsedFieldsInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1329:6: ( (lv_value_12_0= 'VariableName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1329:6: ( (lv_value_12_0= 'VariableName' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1330:1: (lv_value_12_0= 'VariableName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1330:1: (lv_value_12_0= 'VariableName' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1331:3: lv_value_12_0= 'VariableName'
                    {
                    lv_value_12_0=(Token)match(input,33,FOLLOW_33_in_ruleSimpleField2746); 

                            newLeafNode(lv_value_12_0, grammarAccess.getSimpleFieldAccess().getValueVariableNameKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_12_0, "VariableName");
                    	    

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1345:6: ( (lv_value_13_0= 'ParameterTypesStructural' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1345:6: ( (lv_value_13_0= 'ParameterTypesStructural' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1346:1: (lv_value_13_0= 'ParameterTypesStructural' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1346:1: (lv_value_13_0= 'ParameterTypesStructural' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1347:3: lv_value_13_0= 'ParameterTypesStructural'
                    {
                    lv_value_13_0=(Token)match(input,34,FOLLOW_34_in_ruleSimpleField2783); 

                            newLeafNode(lv_value_13_0, grammarAccess.getSimpleFieldAccess().getValueParameterTypesStructuralKeyword_13_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_13_0, "ParameterTypesStructural");
                    	    

                    }


                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1361:6: ( (lv_value_14_0= 'Annotations' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1361:6: ( (lv_value_14_0= 'Annotations' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1362:1: (lv_value_14_0= 'Annotations' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1362:1: (lv_value_14_0= 'Annotations' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1363:3: lv_value_14_0= 'Annotations'
                    {
                    lv_value_14_0=(Token)match(input,35,FOLLOW_35_in_ruleSimpleField2820); 

                            newLeafNode(lv_value_14_0, grammarAccess.getSimpleFieldAccess().getValueAnnotationsKeyword_14_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_14_0, "Annotations");
                    	    

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
    // $ANTLR end "ruleSimpleField"


    // $ANTLR start "entryRuleTypeField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1384:1: entryRuleTypeField returns [EObject current=null] : iv_ruleTypeField= ruleTypeField EOF ;
    public final EObject entryRuleTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1385:2: (iv_ruleTypeField= ruleTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1386:2: iv_ruleTypeField= ruleTypeField EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldRule()); 
            pushFollow(FOLLOW_ruleTypeField_in_entryRuleTypeField2869);
            iv_ruleTypeField=ruleTypeField();

            state._fsp--;

             current =iv_ruleTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeField2879); 

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
    // $ANTLR end "entryRuleTypeField"


    // $ANTLR start "ruleTypeField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1393:1: ruleTypeField returns [EObject current=null] : ( ( (lv_value_0_0= 'FullyQualifiedName' ) ) | ( (lv_value_1_0= 'ImplementedTypes' ) ) | ( (lv_value_2_0= 'ExtendedTypes' ) ) | ( (lv_value_3_0= 'UsedTypes' ) ) | ( (lv_value_4_0= 'UsedTypesInTry' ) ) | ( (lv_value_5_0= 'UsedTypesInFinally' ) ) | ( (lv_value_6_0= 'ParameterTypes' ) ) | ( (lv_value_7_0= 'ReturnType' ) ) | ( (lv_value_8_0= 'InstanceofTypes' ) ) | ( (lv_value_9_0= 'AllImplementedTypes' ) ) | ( (lv_value_10_0= 'AllExtendedTypes' ) ) | ( (lv_value_11_0= 'FieldType' ) ) | ( (lv_value_12_0= 'CaughtType' ) ) | ( (lv_value_13_0= 'DeclaredFieldTypes' ) ) | ( (lv_value_14_0= 'DeclaringType' ) ) | ( (lv_value_15_0= 'VariableType' ) ) | ( (lv_value_16_0= 'CheckedExceptions' ) ) ) ;
    public final EObject ruleTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Token lv_value_5_0=null;
        Token lv_value_6_0=null;
        Token lv_value_7_0=null;
        Token lv_value_8_0=null;
        Token lv_value_9_0=null;
        Token lv_value_10_0=null;
        Token lv_value_11_0=null;
        Token lv_value_12_0=null;
        Token lv_value_13_0=null;
        Token lv_value_14_0=null;
        Token lv_value_15_0=null;
        Token lv_value_16_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1396:28: ( ( ( (lv_value_0_0= 'FullyQualifiedName' ) ) | ( (lv_value_1_0= 'ImplementedTypes' ) ) | ( (lv_value_2_0= 'ExtendedTypes' ) ) | ( (lv_value_3_0= 'UsedTypes' ) ) | ( (lv_value_4_0= 'UsedTypesInTry' ) ) | ( (lv_value_5_0= 'UsedTypesInFinally' ) ) | ( (lv_value_6_0= 'ParameterTypes' ) ) | ( (lv_value_7_0= 'ReturnType' ) ) | ( (lv_value_8_0= 'InstanceofTypes' ) ) | ( (lv_value_9_0= 'AllImplementedTypes' ) ) | ( (lv_value_10_0= 'AllExtendedTypes' ) ) | ( (lv_value_11_0= 'FieldType' ) ) | ( (lv_value_12_0= 'CaughtType' ) ) | ( (lv_value_13_0= 'DeclaredFieldTypes' ) ) | ( (lv_value_14_0= 'DeclaringType' ) ) | ( (lv_value_15_0= 'VariableType' ) ) | ( (lv_value_16_0= 'CheckedExceptions' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1397:1: ( ( (lv_value_0_0= 'FullyQualifiedName' ) ) | ( (lv_value_1_0= 'ImplementedTypes' ) ) | ( (lv_value_2_0= 'ExtendedTypes' ) ) | ( (lv_value_3_0= 'UsedTypes' ) ) | ( (lv_value_4_0= 'UsedTypesInTry' ) ) | ( (lv_value_5_0= 'UsedTypesInFinally' ) ) | ( (lv_value_6_0= 'ParameterTypes' ) ) | ( (lv_value_7_0= 'ReturnType' ) ) | ( (lv_value_8_0= 'InstanceofTypes' ) ) | ( (lv_value_9_0= 'AllImplementedTypes' ) ) | ( (lv_value_10_0= 'AllExtendedTypes' ) ) | ( (lv_value_11_0= 'FieldType' ) ) | ( (lv_value_12_0= 'CaughtType' ) ) | ( (lv_value_13_0= 'DeclaredFieldTypes' ) ) | ( (lv_value_14_0= 'DeclaringType' ) ) | ( (lv_value_15_0= 'VariableType' ) ) | ( (lv_value_16_0= 'CheckedExceptions' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1397:1: ( ( (lv_value_0_0= 'FullyQualifiedName' ) ) | ( (lv_value_1_0= 'ImplementedTypes' ) ) | ( (lv_value_2_0= 'ExtendedTypes' ) ) | ( (lv_value_3_0= 'UsedTypes' ) ) | ( (lv_value_4_0= 'UsedTypesInTry' ) ) | ( (lv_value_5_0= 'UsedTypesInFinally' ) ) | ( (lv_value_6_0= 'ParameterTypes' ) ) | ( (lv_value_7_0= 'ReturnType' ) ) | ( (lv_value_8_0= 'InstanceofTypes' ) ) | ( (lv_value_9_0= 'AllImplementedTypes' ) ) | ( (lv_value_10_0= 'AllExtendedTypes' ) ) | ( (lv_value_11_0= 'FieldType' ) ) | ( (lv_value_12_0= 'CaughtType' ) ) | ( (lv_value_13_0= 'DeclaredFieldTypes' ) ) | ( (lv_value_14_0= 'DeclaringType' ) ) | ( (lv_value_15_0= 'VariableType' ) ) | ( (lv_value_16_0= 'CheckedExceptions' ) ) )
            int alt57=17;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt57=1;
                }
                break;
            case 37:
                {
                alt57=2;
                }
                break;
            case 38:
                {
                alt57=3;
                }
                break;
            case 39:
                {
                alt57=4;
                }
                break;
            case 40:
                {
                alt57=5;
                }
                break;
            case 41:
                {
                alt57=6;
                }
                break;
            case 42:
                {
                alt57=7;
                }
                break;
            case 43:
                {
                alt57=8;
                }
                break;
            case 44:
                {
                alt57=9;
                }
                break;
            case 45:
                {
                alt57=10;
                }
                break;
            case 46:
                {
                alt57=11;
                }
                break;
            case 47:
                {
                alt57=12;
                }
                break;
            case 48:
                {
                alt57=13;
                }
                break;
            case 49:
                {
                alt57=14;
                }
                break;
            case 50:
                {
                alt57=15;
                }
                break;
            case 51:
                {
                alt57=16;
                }
                break;
            case 52:
                {
                alt57=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1397:2: ( (lv_value_0_0= 'FullyQualifiedName' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1397:2: ( (lv_value_0_0= 'FullyQualifiedName' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1398:1: (lv_value_0_0= 'FullyQualifiedName' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1398:1: (lv_value_0_0= 'FullyQualifiedName' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1399:3: lv_value_0_0= 'FullyQualifiedName'
                    {
                    lv_value_0_0=(Token)match(input,36,FOLLOW_36_in_ruleTypeField2922); 

                            newLeafNode(lv_value_0_0, grammarAccess.getTypeFieldAccess().getValueFullyQualifiedNameKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "FullyQualifiedName");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1413:6: ( (lv_value_1_0= 'ImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1413:6: ( (lv_value_1_0= 'ImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1414:1: (lv_value_1_0= 'ImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1414:1: (lv_value_1_0= 'ImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1415:3: lv_value_1_0= 'ImplementedTypes'
                    {
                    lv_value_1_0=(Token)match(input,37,FOLLOW_37_in_ruleTypeField2959); 

                            newLeafNode(lv_value_1_0, grammarAccess.getTypeFieldAccess().getValueImplementedTypesKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "ImplementedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1429:6: ( (lv_value_2_0= 'ExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1429:6: ( (lv_value_2_0= 'ExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1430:1: (lv_value_2_0= 'ExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1430:1: (lv_value_2_0= 'ExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1431:3: lv_value_2_0= 'ExtendedTypes'
                    {
                    lv_value_2_0=(Token)match(input,38,FOLLOW_38_in_ruleTypeField2996); 

                            newLeafNode(lv_value_2_0, grammarAccess.getTypeFieldAccess().getValueExtendedTypesKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "ExtendedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1445:6: ( (lv_value_3_0= 'UsedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1445:6: ( (lv_value_3_0= 'UsedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1446:1: (lv_value_3_0= 'UsedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1446:1: (lv_value_3_0= 'UsedTypes' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1447:3: lv_value_3_0= 'UsedTypes'
                    {
                    lv_value_3_0=(Token)match(input,39,FOLLOW_39_in_ruleTypeField3033); 

                            newLeafNode(lv_value_3_0, grammarAccess.getTypeFieldAccess().getValueUsedTypesKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "UsedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1461:6: ( (lv_value_4_0= 'UsedTypesInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1461:6: ( (lv_value_4_0= 'UsedTypesInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1462:1: (lv_value_4_0= 'UsedTypesInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1462:1: (lv_value_4_0= 'UsedTypesInTry' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1463:3: lv_value_4_0= 'UsedTypesInTry'
                    {
                    lv_value_4_0=(Token)match(input,40,FOLLOW_40_in_ruleTypeField3070); 

                            newLeafNode(lv_value_4_0, grammarAccess.getTypeFieldAccess().getValueUsedTypesInTryKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "UsedTypesInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1477:6: ( (lv_value_5_0= 'UsedTypesInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1477:6: ( (lv_value_5_0= 'UsedTypesInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1478:1: (lv_value_5_0= 'UsedTypesInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1478:1: (lv_value_5_0= 'UsedTypesInFinally' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1479:3: lv_value_5_0= 'UsedTypesInFinally'
                    {
                    lv_value_5_0=(Token)match(input,41,FOLLOW_41_in_ruleTypeField3107); 

                            newLeafNode(lv_value_5_0, grammarAccess.getTypeFieldAccess().getValueUsedTypesInFinallyKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_5_0, "UsedTypesInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1493:6: ( (lv_value_6_0= 'ParameterTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1493:6: ( (lv_value_6_0= 'ParameterTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1494:1: (lv_value_6_0= 'ParameterTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1494:1: (lv_value_6_0= 'ParameterTypes' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1495:3: lv_value_6_0= 'ParameterTypes'
                    {
                    lv_value_6_0=(Token)match(input,42,FOLLOW_42_in_ruleTypeField3144); 

                            newLeafNode(lv_value_6_0, grammarAccess.getTypeFieldAccess().getValueParameterTypesKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_6_0, "ParameterTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1509:6: ( (lv_value_7_0= 'ReturnType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1509:6: ( (lv_value_7_0= 'ReturnType' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1510:1: (lv_value_7_0= 'ReturnType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1510:1: (lv_value_7_0= 'ReturnType' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1511:3: lv_value_7_0= 'ReturnType'
                    {
                    lv_value_7_0=(Token)match(input,43,FOLLOW_43_in_ruleTypeField3181); 

                            newLeafNode(lv_value_7_0, grammarAccess.getTypeFieldAccess().getValueReturnTypeKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_7_0, "ReturnType");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1525:6: ( (lv_value_8_0= 'InstanceofTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1525:6: ( (lv_value_8_0= 'InstanceofTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1526:1: (lv_value_8_0= 'InstanceofTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1526:1: (lv_value_8_0= 'InstanceofTypes' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1527:3: lv_value_8_0= 'InstanceofTypes'
                    {
                    lv_value_8_0=(Token)match(input,44,FOLLOW_44_in_ruleTypeField3218); 

                            newLeafNode(lv_value_8_0, grammarAccess.getTypeFieldAccess().getValueInstanceofTypesKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_8_0, "InstanceofTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1541:6: ( (lv_value_9_0= 'AllImplementedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1541:6: ( (lv_value_9_0= 'AllImplementedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1542:1: (lv_value_9_0= 'AllImplementedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1542:1: (lv_value_9_0= 'AllImplementedTypes' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1543:3: lv_value_9_0= 'AllImplementedTypes'
                    {
                    lv_value_9_0=(Token)match(input,45,FOLLOW_45_in_ruleTypeField3255); 

                            newLeafNode(lv_value_9_0, grammarAccess.getTypeFieldAccess().getValueAllImplementedTypesKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_9_0, "AllImplementedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1557:6: ( (lv_value_10_0= 'AllExtendedTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1557:6: ( (lv_value_10_0= 'AllExtendedTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1558:1: (lv_value_10_0= 'AllExtendedTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1558:1: (lv_value_10_0= 'AllExtendedTypes' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1559:3: lv_value_10_0= 'AllExtendedTypes'
                    {
                    lv_value_10_0=(Token)match(input,46,FOLLOW_46_in_ruleTypeField3292); 

                            newLeafNode(lv_value_10_0, grammarAccess.getTypeFieldAccess().getValueAllExtendedTypesKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_10_0, "AllExtendedTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1573:6: ( (lv_value_11_0= 'FieldType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1573:6: ( (lv_value_11_0= 'FieldType' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1574:1: (lv_value_11_0= 'FieldType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1574:1: (lv_value_11_0= 'FieldType' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1575:3: lv_value_11_0= 'FieldType'
                    {
                    lv_value_11_0=(Token)match(input,47,FOLLOW_47_in_ruleTypeField3329); 

                            newLeafNode(lv_value_11_0, grammarAccess.getTypeFieldAccess().getValueFieldTypeKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_11_0, "FieldType");
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1589:6: ( (lv_value_12_0= 'CaughtType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1589:6: ( (lv_value_12_0= 'CaughtType' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1590:1: (lv_value_12_0= 'CaughtType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1590:1: (lv_value_12_0= 'CaughtType' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1591:3: lv_value_12_0= 'CaughtType'
                    {
                    lv_value_12_0=(Token)match(input,48,FOLLOW_48_in_ruleTypeField3366); 

                            newLeafNode(lv_value_12_0, grammarAccess.getTypeFieldAccess().getValueCaughtTypeKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_12_0, "CaughtType");
                    	    

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1605:6: ( (lv_value_13_0= 'DeclaredFieldTypes' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1605:6: ( (lv_value_13_0= 'DeclaredFieldTypes' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1606:1: (lv_value_13_0= 'DeclaredFieldTypes' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1606:1: (lv_value_13_0= 'DeclaredFieldTypes' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1607:3: lv_value_13_0= 'DeclaredFieldTypes'
                    {
                    lv_value_13_0=(Token)match(input,49,FOLLOW_49_in_ruleTypeField3403); 

                            newLeafNode(lv_value_13_0, grammarAccess.getTypeFieldAccess().getValueDeclaredFieldTypesKeyword_13_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_13_0, "DeclaredFieldTypes");
                    	    

                    }


                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1621:6: ( (lv_value_14_0= 'DeclaringType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1621:6: ( (lv_value_14_0= 'DeclaringType' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1622:1: (lv_value_14_0= 'DeclaringType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1622:1: (lv_value_14_0= 'DeclaringType' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1623:3: lv_value_14_0= 'DeclaringType'
                    {
                    lv_value_14_0=(Token)match(input,50,FOLLOW_50_in_ruleTypeField3440); 

                            newLeafNode(lv_value_14_0, grammarAccess.getTypeFieldAccess().getValueDeclaringTypeKeyword_14_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_14_0, "DeclaringType");
                    	    

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1637:6: ( (lv_value_15_0= 'VariableType' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1637:6: ( (lv_value_15_0= 'VariableType' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1638:1: (lv_value_15_0= 'VariableType' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1638:1: (lv_value_15_0= 'VariableType' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1639:3: lv_value_15_0= 'VariableType'
                    {
                    lv_value_15_0=(Token)match(input,51,FOLLOW_51_in_ruleTypeField3477); 

                            newLeafNode(lv_value_15_0, grammarAccess.getTypeFieldAccess().getValueVariableTypeKeyword_15_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_15_0, "VariableType");
                    	    

                    }


                    }


                    }
                    break;
                case 17 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1653:6: ( (lv_value_16_0= 'CheckedExceptions' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1653:6: ( (lv_value_16_0= 'CheckedExceptions' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1654:1: (lv_value_16_0= 'CheckedExceptions' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1654:1: (lv_value_16_0= 'CheckedExceptions' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1655:3: lv_value_16_0= 'CheckedExceptions'
                    {
                    lv_value_16_0=(Token)match(input,52,FOLLOW_52_in_ruleTypeField3514); 

                            newLeafNode(lv_value_16_0, grammarAccess.getTypeFieldAccess().getValueCheckedExceptionsKeyword_16_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_16_0, "CheckedExceptions");
                    	    

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
    // $ANTLR end "ruleTypeField"


    // $ANTLR start "entryRuleMethodField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1676:1: entryRuleMethodField returns [EObject current=null] : iv_ruleMethodField= ruleMethodField EOF ;
    public final EObject entryRuleMethodField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1677:2: (iv_ruleMethodField= ruleMethodField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1678:2: iv_ruleMethodField= ruleMethodField EOF
            {
             newCompositeNode(grammarAccess.getMethodFieldRule()); 
            pushFollow(FOLLOW_ruleMethodField_in_entryRuleMethodField3563);
            iv_ruleMethodField=ruleMethodField();

            state._fsp--;

             current =iv_ruleMethodField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodField3573); 

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
    // $ANTLR end "entryRuleMethodField"


    // $ANTLR start "ruleMethodField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1685:1: ruleMethodField returns [EObject current=null] : ( ( (lv_value_0_0= 'UsedMethods' ) ) | ( (lv_value_1_0= 'UsedMethodsInTry' ) ) | ( (lv_value_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_value_3_0= 'OverriddenMethods' ) ) | ( (lv_value_4_0= 'DeclaredMethods' ) ) | ( (lv_value_5_0= 'DeclaringMethod' ) ) | ( (lv_value_6_0= 'UsedAsParameterInMethods' ) ) | ( (lv_value_7_0= 'UsedAsTargetForMethods' ) ) ) ;
    public final EObject ruleMethodField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Token lv_value_5_0=null;
        Token lv_value_6_0=null;
        Token lv_value_7_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1688:28: ( ( ( (lv_value_0_0= 'UsedMethods' ) ) | ( (lv_value_1_0= 'UsedMethodsInTry' ) ) | ( (lv_value_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_value_3_0= 'OverriddenMethods' ) ) | ( (lv_value_4_0= 'DeclaredMethods' ) ) | ( (lv_value_5_0= 'DeclaringMethod' ) ) | ( (lv_value_6_0= 'UsedAsParameterInMethods' ) ) | ( (lv_value_7_0= 'UsedAsTargetForMethods' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1689:1: ( ( (lv_value_0_0= 'UsedMethods' ) ) | ( (lv_value_1_0= 'UsedMethodsInTry' ) ) | ( (lv_value_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_value_3_0= 'OverriddenMethods' ) ) | ( (lv_value_4_0= 'DeclaredMethods' ) ) | ( (lv_value_5_0= 'DeclaringMethod' ) ) | ( (lv_value_6_0= 'UsedAsParameterInMethods' ) ) | ( (lv_value_7_0= 'UsedAsTargetForMethods' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1689:1: ( ( (lv_value_0_0= 'UsedMethods' ) ) | ( (lv_value_1_0= 'UsedMethodsInTry' ) ) | ( (lv_value_2_0= 'UsedMethodsInFinally' ) ) | ( (lv_value_3_0= 'OverriddenMethods' ) ) | ( (lv_value_4_0= 'DeclaredMethods' ) ) | ( (lv_value_5_0= 'DeclaringMethod' ) ) | ( (lv_value_6_0= 'UsedAsParameterInMethods' ) ) | ( (lv_value_7_0= 'UsedAsTargetForMethods' ) ) )
            int alt58=8;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt58=1;
                }
                break;
            case 54:
                {
                alt58=2;
                }
                break;
            case 55:
                {
                alt58=3;
                }
                break;
            case 56:
                {
                alt58=4;
                }
                break;
            case 57:
                {
                alt58=5;
                }
                break;
            case 58:
                {
                alt58=6;
                }
                break;
            case 59:
                {
                alt58=7;
                }
                break;
            case 60:
                {
                alt58=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1689:2: ( (lv_value_0_0= 'UsedMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1689:2: ( (lv_value_0_0= 'UsedMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1690:1: (lv_value_0_0= 'UsedMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1690:1: (lv_value_0_0= 'UsedMethods' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1691:3: lv_value_0_0= 'UsedMethods'
                    {
                    lv_value_0_0=(Token)match(input,53,FOLLOW_53_in_ruleMethodField3616); 

                            newLeafNode(lv_value_0_0, grammarAccess.getMethodFieldAccess().getValueUsedMethodsKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "UsedMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1705:6: ( (lv_value_1_0= 'UsedMethodsInTry' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1705:6: ( (lv_value_1_0= 'UsedMethodsInTry' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1706:1: (lv_value_1_0= 'UsedMethodsInTry' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1706:1: (lv_value_1_0= 'UsedMethodsInTry' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1707:3: lv_value_1_0= 'UsedMethodsInTry'
                    {
                    lv_value_1_0=(Token)match(input,54,FOLLOW_54_in_ruleMethodField3653); 

                            newLeafNode(lv_value_1_0, grammarAccess.getMethodFieldAccess().getValueUsedMethodsInTryKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "UsedMethodsInTry");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1721:6: ( (lv_value_2_0= 'UsedMethodsInFinally' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1721:6: ( (lv_value_2_0= 'UsedMethodsInFinally' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1722:1: (lv_value_2_0= 'UsedMethodsInFinally' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1722:1: (lv_value_2_0= 'UsedMethodsInFinally' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1723:3: lv_value_2_0= 'UsedMethodsInFinally'
                    {
                    lv_value_2_0=(Token)match(input,55,FOLLOW_55_in_ruleMethodField3690); 

                            newLeafNode(lv_value_2_0, grammarAccess.getMethodFieldAccess().getValueUsedMethodsInFinallyKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_0, "UsedMethodsInFinally");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1737:6: ( (lv_value_3_0= 'OverriddenMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1737:6: ( (lv_value_3_0= 'OverriddenMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1738:1: (lv_value_3_0= 'OverriddenMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1738:1: (lv_value_3_0= 'OverriddenMethods' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1739:3: lv_value_3_0= 'OverriddenMethods'
                    {
                    lv_value_3_0=(Token)match(input,56,FOLLOW_56_in_ruleMethodField3727); 

                            newLeafNode(lv_value_3_0, grammarAccess.getMethodFieldAccess().getValueOverriddenMethodsKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "OverriddenMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1753:6: ( (lv_value_4_0= 'DeclaredMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1753:6: ( (lv_value_4_0= 'DeclaredMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1754:1: (lv_value_4_0= 'DeclaredMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1754:1: (lv_value_4_0= 'DeclaredMethods' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1755:3: lv_value_4_0= 'DeclaredMethods'
                    {
                    lv_value_4_0=(Token)match(input,57,FOLLOW_57_in_ruleMethodField3764); 

                            newLeafNode(lv_value_4_0, grammarAccess.getMethodFieldAccess().getValueDeclaredMethodsKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "DeclaredMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1769:6: ( (lv_value_5_0= 'DeclaringMethod' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1769:6: ( (lv_value_5_0= 'DeclaringMethod' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1770:1: (lv_value_5_0= 'DeclaringMethod' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1770:1: (lv_value_5_0= 'DeclaringMethod' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1771:3: lv_value_5_0= 'DeclaringMethod'
                    {
                    lv_value_5_0=(Token)match(input,58,FOLLOW_58_in_ruleMethodField3801); 

                            newLeafNode(lv_value_5_0, grammarAccess.getMethodFieldAccess().getValueDeclaringMethodKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_5_0, "DeclaringMethod");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1785:6: ( (lv_value_6_0= 'UsedAsParameterInMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1785:6: ( (lv_value_6_0= 'UsedAsParameterInMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1786:1: (lv_value_6_0= 'UsedAsParameterInMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1786:1: (lv_value_6_0= 'UsedAsParameterInMethods' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1787:3: lv_value_6_0= 'UsedAsParameterInMethods'
                    {
                    lv_value_6_0=(Token)match(input,59,FOLLOW_59_in_ruleMethodField3838); 

                            newLeafNode(lv_value_6_0, grammarAccess.getMethodFieldAccess().getValueUsedAsParameterInMethodsKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_6_0, "UsedAsParameterInMethods");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1801:6: ( (lv_value_7_0= 'UsedAsTargetForMethods' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1801:6: ( (lv_value_7_0= 'UsedAsTargetForMethods' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1802:1: (lv_value_7_0= 'UsedAsTargetForMethods' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1802:1: (lv_value_7_0= 'UsedAsTargetForMethods' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1803:3: lv_value_7_0= 'UsedAsTargetForMethods'
                    {
                    lv_value_7_0=(Token)match(input,60,FOLLOW_60_in_ruleMethodField3875); 

                            newLeafNode(lv_value_7_0, grammarAccess.getMethodFieldAccess().getValueUsedAsTargetForMethodsKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_7_0, "UsedAsTargetForMethods");
                    	    

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
    // $ANTLR end "ruleMethodField"


    // $ANTLR start "entryRuleFilePathField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1824:1: entryRuleFilePathField returns [EObject current=null] : iv_ruleFilePathField= ruleFilePathField EOF ;
    public final EObject entryRuleFilePathField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilePathField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1825:2: (iv_ruleFilePathField= ruleFilePathField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1826:2: iv_ruleFilePathField= ruleFilePathField EOF
            {
             newCompositeNode(grammarAccess.getFilePathFieldRule()); 
            pushFollow(FOLLOW_ruleFilePathField_in_entryRuleFilePathField3924);
            iv_ruleFilePathField=ruleFilePathField();

            state._fsp--;

             current =iv_ruleFilePathField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathField3934); 

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
    // $ANTLR end "entryRuleFilePathField"


    // $ANTLR start "ruleFilePathField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1833:1: ruleFilePathField returns [EObject current=null] : ( (lv_value_0_0= 'ResourcePath' ) ) ;
    public final EObject ruleFilePathField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1836:28: ( ( (lv_value_0_0= 'ResourcePath' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1837:1: ( (lv_value_0_0= 'ResourcePath' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1837:1: ( (lv_value_0_0= 'ResourcePath' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1838:1: (lv_value_0_0= 'ResourcePath' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1838:1: (lv_value_0_0= 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1839:3: lv_value_0_0= 'ResourcePath'
            {
            lv_value_0_0=(Token)match(input,61,FOLLOW_61_in_ruleFilePathField3976); 

                    newLeafNode(lv_value_0_0, grammarAccess.getFilePathFieldAccess().getValueResourcePathKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFilePathFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "ResourcePath");
            	    

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
    // $ANTLR end "ruleFilePathField"


    // $ANTLR start "entryRuleNumberField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1860:1: entryRuleNumberField returns [EObject current=null] : iv_ruleNumberField= ruleNumberField EOF ;
    public final EObject entryRuleNumberField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1861:2: (iv_ruleNumberField= ruleNumberField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1862:2: iv_ruleNumberField= ruleNumberField EOF
            {
             newCompositeNode(grammarAccess.getNumberFieldRule()); 
            pushFollow(FOLLOW_ruleNumberField_in_entryRuleNumberField4024);
            iv_ruleNumberField=ruleNumberField();

            state._fsp--;

             current =iv_ruleNumberField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberField4034); 

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
    // $ANTLR end "entryRuleNumberField"


    // $ANTLR start "ruleNumberField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1869:1: ruleNumberField returns [EObject current=null] : ( ( (lv_value_0_0= 'ParameterCount' ) ) | ( (lv_value_1_0= 'Timestamp' ) ) ) ;
    public final EObject ruleNumberField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1872:28: ( ( ( (lv_value_0_0= 'ParameterCount' ) ) | ( (lv_value_1_0= 'Timestamp' ) ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1873:1: ( ( (lv_value_0_0= 'ParameterCount' ) ) | ( (lv_value_1_0= 'Timestamp' ) ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1873:1: ( ( (lv_value_0_0= 'ParameterCount' ) ) | ( (lv_value_1_0= 'Timestamp' ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==62) ) {
                alt59=1;
            }
            else if ( (LA59_0==63) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1873:2: ( (lv_value_0_0= 'ParameterCount' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1873:2: ( (lv_value_0_0= 'ParameterCount' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1874:1: (lv_value_0_0= 'ParameterCount' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1874:1: (lv_value_0_0= 'ParameterCount' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1875:3: lv_value_0_0= 'ParameterCount'
                    {
                    lv_value_0_0=(Token)match(input,62,FOLLOW_62_in_ruleNumberField4077); 

                            newLeafNode(lv_value_0_0, grammarAccess.getNumberFieldAccess().getValueParameterCountKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_0, "ParameterCount");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1889:6: ( (lv_value_1_0= 'Timestamp' ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1889:6: ( (lv_value_1_0= 'Timestamp' ) )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1890:1: (lv_value_1_0= 'Timestamp' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1890:1: (lv_value_1_0= 'Timestamp' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1891:3: lv_value_1_0= 'Timestamp'
                    {
                    lv_value_1_0=(Token)match(input,63,FOLLOW_63_in_ruleNumberField4114); 

                            newLeafNode(lv_value_1_0, grammarAccess.getNumberFieldAccess().getValueTimestampKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberFieldRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_0, "Timestamp");
                    	    

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
    // $ANTLR end "ruleNumberField"


    // $ANTLR start "entryRuleModifierField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1912:1: entryRuleModifierField returns [EObject current=null] : iv_ruleModifierField= ruleModifierField EOF ;
    public final EObject entryRuleModifierField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1913:2: (iv_ruleModifierField= ruleModifierField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1914:2: iv_ruleModifierField= ruleModifierField EOF
            {
             newCompositeNode(grammarAccess.getModifierFieldRule()); 
            pushFollow(FOLLOW_ruleModifierField_in_entryRuleModifierField4163);
            iv_ruleModifierField=ruleModifierField();

            state._fsp--;

             current =iv_ruleModifierField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierField4173); 

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
    // $ANTLR end "entryRuleModifierField"


    // $ANTLR start "ruleModifierField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1921:1: ruleModifierField returns [EObject current=null] : ( (lv_value_0_0= 'Modifiers' ) ) ;
    public final EObject ruleModifierField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1924:28: ( ( (lv_value_0_0= 'Modifiers' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1925:1: ( (lv_value_0_0= 'Modifiers' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1925:1: ( (lv_value_0_0= 'Modifiers' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1926:1: (lv_value_0_0= 'Modifiers' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1926:1: (lv_value_0_0= 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1927:3: lv_value_0_0= 'Modifiers'
            {
            lv_value_0_0=(Token)match(input,64,FOLLOW_64_in_ruleModifierField4215); 

                    newLeafNode(lv_value_0_0, grammarAccess.getModifierFieldAccess().getValueModifiersKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModifierFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "Modifiers");
            	    

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
    // $ANTLR end "ruleModifierField"


    // $ANTLR start "entryRuleProjectNameField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1948:1: entryRuleProjectNameField returns [EObject current=null] : iv_ruleProjectNameField= ruleProjectNameField EOF ;
    public final EObject entryRuleProjectNameField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectNameField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1949:2: (iv_ruleProjectNameField= ruleProjectNameField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1950:2: iv_ruleProjectNameField= ruleProjectNameField EOF
            {
             newCompositeNode(grammarAccess.getProjectNameFieldRule()); 
            pushFollow(FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField4263);
            iv_ruleProjectNameField=ruleProjectNameField();

            state._fsp--;

             current =iv_ruleProjectNameField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameField4273); 

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
    // $ANTLR end "entryRuleProjectNameField"


    // $ANTLR start "ruleProjectNameField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1957:1: ruleProjectNameField returns [EObject current=null] : ( (lv_value_0_0= 'ProjectName' ) ) ;
    public final EObject ruleProjectNameField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1960:28: ( ( (lv_value_0_0= 'ProjectName' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1961:1: ( (lv_value_0_0= 'ProjectName' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1961:1: ( (lv_value_0_0= 'ProjectName' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1962:1: (lv_value_0_0= 'ProjectName' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1962:1: (lv_value_0_0= 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1963:3: lv_value_0_0= 'ProjectName'
            {
            lv_value_0_0=(Token)match(input,65,FOLLOW_65_in_ruleProjectNameField4315); 

                    newLeafNode(lv_value_0_0, grammarAccess.getProjectNameFieldAccess().getValueProjectNameKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectNameFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "ProjectName");
            	    

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
    // $ANTLR end "ruleProjectNameField"


    // $ANTLR start "entryRuleDefinitionTypeField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1984:1: entryRuleDefinitionTypeField returns [EObject current=null] : iv_ruleDefinitionTypeField= ruleDefinitionTypeField EOF ;
    public final EObject entryRuleDefinitionTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionTypeField = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1985:2: (iv_ruleDefinitionTypeField= ruleDefinitionTypeField EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1986:2: iv_ruleDefinitionTypeField= ruleDefinitionTypeField EOF
            {
             newCompositeNode(grammarAccess.getDefinitionTypeFieldRule()); 
            pushFollow(FOLLOW_ruleDefinitionTypeField_in_entryRuleDefinitionTypeField4363);
            iv_ruleDefinitionTypeField=ruleDefinitionTypeField();

            state._fsp--;

             current =iv_ruleDefinitionTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionTypeField4373); 

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
    // $ANTLR end "entryRuleDefinitionTypeField"


    // $ANTLR start "ruleDefinitionTypeField"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1993:1: ruleDefinitionTypeField returns [EObject current=null] : ( (lv_value_0_0= 'VariableDefinition' ) ) ;
    public final EObject ruleDefinitionTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1996:28: ( ( (lv_value_0_0= 'VariableDefinition' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1997:1: ( (lv_value_0_0= 'VariableDefinition' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1997:1: ( (lv_value_0_0= 'VariableDefinition' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1998:1: (lv_value_0_0= 'VariableDefinition' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1998:1: (lv_value_0_0= 'VariableDefinition' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1999:3: lv_value_0_0= 'VariableDefinition'
            {
            lv_value_0_0=(Token)match(input,66,FOLLOW_66_in_ruleDefinitionTypeField4415); 

                    newLeafNode(lv_value_0_0, grammarAccess.getDefinitionTypeFieldAccess().getValueVariableDefinitionKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionTypeFieldRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "VariableDefinition");
            	    

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
    // $ANTLR end "ruleDefinitionTypeField"


    // $ANTLR start "entryRuleSimpleFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2020:1: entryRuleSimpleFieldValue returns [String current=null] : iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF ;
    public final String entryRuleSimpleFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2021:2: (iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2022:2: iv_ruleSimpleFieldValue= ruleSimpleFieldValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleFieldValueRule()); 
            pushFollow(FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue4464);
            iv_ruleSimpleFieldValue=ruleSimpleFieldValue();

            state._fsp--;

             current =iv_ruleSimpleFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFieldValue4475); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2029:1: ruleSimpleFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QuotedNameWithWC_0= RULE_QUOTEDNAMEWITHWC | this_NameWithWC_1= RULE_NAMEWITHWC ) ;
    public final AntlrDatatypeRuleToken ruleSimpleFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QuotedNameWithWC_0=null;
        Token this_NameWithWC_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2032:28: ( (this_QuotedNameWithWC_0= RULE_QUOTEDNAMEWITHWC | this_NameWithWC_1= RULE_NAMEWITHWC ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2033:1: (this_QuotedNameWithWC_0= RULE_QUOTEDNAMEWITHWC | this_NameWithWC_1= RULE_NAMEWITHWC )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2033:1: (this_QuotedNameWithWC_0= RULE_QUOTEDNAMEWITHWC | this_NameWithWC_1= RULE_NAMEWITHWC )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_QUOTEDNAMEWITHWC) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_NAMEWITHWC) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2033:6: this_QuotedNameWithWC_0= RULE_QUOTEDNAMEWITHWC
                    {
                    this_QuotedNameWithWC_0=(Token)match(input,RULE_QUOTEDNAMEWITHWC,FOLLOW_RULE_QUOTEDNAMEWITHWC_in_ruleSimpleFieldValue4515); 

                    		current.merge(this_QuotedNameWithWC_0);
                        
                     
                        newLeafNode(this_QuotedNameWithWC_0, grammarAccess.getSimpleFieldValueAccess().getQuotedNameWithWCTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2041:10: this_NameWithWC_1= RULE_NAMEWITHWC
                    {
                    this_NameWithWC_1=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue4541); 

                    		current.merge(this_NameWithWC_1);
                        
                     
                        newLeafNode(this_NameWithWC_1, grammarAccess.getSimpleFieldValueAccess().getNameWithWCTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleSimpleFieldValue"


    // $ANTLR start "entryRuleMethodFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2056:1: entryRuleMethodFieldValue returns [String current=null] : iv_ruleMethodFieldValue= ruleMethodFieldValue EOF ;
    public final String entryRuleMethodFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2057:2: (iv_ruleMethodFieldValue= ruleMethodFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2058:2: iv_ruleMethodFieldValue= ruleMethodFieldValue EOF
            {
             newCompositeNode(grammarAccess.getMethodFieldValueRule()); 
            pushFollow(FOLLOW_ruleMethodFieldValue_in_entryRuleMethodFieldValue4587);
            iv_ruleMethodFieldValue=ruleMethodFieldValue();

            state._fsp--;

             current =iv_ruleMethodFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodFieldValue4598); 

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
    // $ANTLR end "entryRuleMethodFieldValue"


    // $ANTLR start "ruleMethodFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2065:1: ruleMethodFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleMethodFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2068:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2069:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleMethodFieldValue4637); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getMethodFieldValueAccess().getNameWithWCTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleMethodFieldValue"


    // $ANTLR start "entryRuleProjectNameFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2084:1: entryRuleProjectNameFieldValue returns [String current=null] : iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF ;
    public final String entryRuleProjectNameFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProjectNameFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2085:2: (iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2086:2: iv_ruleProjectNameFieldValue= ruleProjectNameFieldValue EOF
            {
             newCompositeNode(grammarAccess.getProjectNameFieldValueRule()); 
            pushFollow(FOLLOW_ruleProjectNameFieldValue_in_entryRuleProjectNameFieldValue4682);
            iv_ruleProjectNameFieldValue=ruleProjectNameFieldValue();

            state._fsp--;

             current =iv_ruleProjectNameFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectNameFieldValue4693); 

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
    // $ANTLR end "entryRuleProjectNameFieldValue"


    // $ANTLR start "ruleProjectNameFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2093:1: ruleProjectNameFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleProjectNameFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2096:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2097:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleProjectNameFieldValue4732); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getProjectNameFieldValueAccess().getNameWithWCTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleProjectNameFieldValue"


    // $ANTLR start "entryRuleNumberFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2112:1: entryRuleNumberFieldValue returns [String current=null] : iv_ruleNumberFieldValue= ruleNumberFieldValue EOF ;
    public final String entryRuleNumberFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2113:2: (iv_ruleNumberFieldValue= ruleNumberFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2114:2: iv_ruleNumberFieldValue= ruleNumberFieldValue EOF
            {
             newCompositeNode(grammarAccess.getNumberFieldValueRule()); 
            pushFollow(FOLLOW_ruleNumberFieldValue_in_entryRuleNumberFieldValue4777);
            iv_ruleNumberFieldValue=ruleNumberFieldValue();

            state._fsp--;

             current =iv_ruleNumberFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFieldValue4788); 

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
    // $ANTLR end "entryRuleNumberFieldValue"


    // $ANTLR start "ruleNumberFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2121:1: ruleNumberFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumberFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2124:28: (this_INT_0= RULE_INT )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2125:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberFieldValue4827); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getNumberFieldValueAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleNumberFieldValue"


    // $ANTLR start "entryRuleModifierFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2140:1: entryRuleModifierFieldValue returns [String current=null] : iv_ruleModifierFieldValue= ruleModifierFieldValue EOF ;
    public final String entryRuleModifierFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifierFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2141:2: (iv_ruleModifierFieldValue= ruleModifierFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2142:2: iv_ruleModifierFieldValue= ruleModifierFieldValue EOF
            {
             newCompositeNode(grammarAccess.getModifierFieldValueRule()); 
            pushFollow(FOLLOW_ruleModifierFieldValue_in_entryRuleModifierFieldValue4872);
            iv_ruleModifierFieldValue=ruleModifierFieldValue();

            state._fsp--;

             current =iv_ruleModifierFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifierFieldValue4883); 

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
    // $ANTLR end "entryRuleModifierFieldValue"


    // $ANTLR start "ruleModifierFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2149:1: ruleModifierFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleModifierFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2152:28: ( (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2153:1: (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2153:1: (kw= 'private' | kw= 'public' | kw= 'static' | kw= 'final' | kw= 'abstract' | kw= 'protected' )
            int alt61=6;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt61=1;
                }
                break;
            case 68:
                {
                alt61=2;
                }
                break;
            case 69:
                {
                alt61=3;
                }
                break;
            case 70:
                {
                alt61=4;
                }
                break;
            case 71:
                {
                alt61=5;
                }
                break;
            case 72:
                {
                alt61=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2154:2: kw= 'private'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleModifierFieldValue4921); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2161:2: kw= 'public'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleModifierFieldValue4940); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getPublicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2168:2: kw= 'static'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleModifierFieldValue4959); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getStaticKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2175:2: kw= 'final'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleModifierFieldValue4978); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getFinalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2182:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleModifierFieldValue4997); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getAbstractKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2189:2: kw= 'protected'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleModifierFieldValue5016); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModifierFieldValueAccess().getProtectedKeyword_5()); 
                        

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
    // $ANTLR end "ruleModifierFieldValue"


    // $ANTLR start "entryRuleDocumentTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2202:1: entryRuleDocumentTypeFieldValue returns [String current=null] : iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF ;
    public final String entryRuleDocumentTypeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDocumentTypeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2203:2: (iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2204:2: iv_ruleDocumentTypeFieldValue= ruleDocumentTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getDocumentTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleDocumentTypeFieldValue_in_entryRuleDocumentTypeFieldValue5057);
            iv_ruleDocumentTypeFieldValue=ruleDocumentTypeFieldValue();

            state._fsp--;

             current =iv_ruleDocumentTypeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTypeFieldValue5068); 

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
    // $ANTLR end "entryRuleDocumentTypeFieldValue"


    // $ANTLR start "ruleDocumentTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2211:1: ruleDocumentTypeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'type' | kw= 'method' | kw= 'field' | kw= 'trycatch' | kw= 'varusage' ) ;
    public final AntlrDatatypeRuleToken ruleDocumentTypeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2214:28: ( (kw= 'type' | kw= 'method' | kw= 'field' | kw= 'trycatch' | kw= 'varusage' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2215:1: (kw= 'type' | kw= 'method' | kw= 'field' | kw= 'trycatch' | kw= 'varusage' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2215:1: (kw= 'type' | kw= 'method' | kw= 'field' | kw= 'trycatch' | kw= 'varusage' )
            int alt62=5;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt62=1;
                }
                break;
            case 74:
                {
                alt62=2;
                }
                break;
            case 75:
                {
                alt62=3;
                }
                break;
            case 76:
                {
                alt62=4;
                }
                break;
            case 77:
                {
                alt62=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2216:2: kw= 'type'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleDocumentTypeFieldValue5106); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getTypeKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2223:2: kw= 'method'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleDocumentTypeFieldValue5125); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getMethodKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2230:2: kw= 'field'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleDocumentTypeFieldValue5144); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getFieldKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2237:2: kw= 'trycatch'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleDocumentTypeFieldValue5163); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getTrycatchKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2244:2: kw= 'varusage'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleDocumentTypeFieldValue5182); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDocumentTypeFieldValueAccess().getVarusageKeyword_4()); 
                        

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
    // $ANTLR end "ruleDocumentTypeFieldValue"


    // $ANTLR start "entryRuleTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2257:1: entryRuleTypeFieldValue returns [String current=null] : iv_ruleTypeFieldValue= ruleTypeFieldValue EOF ;
    public final String entryRuleTypeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2258:2: (iv_ruleTypeFieldValue= ruleTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2259:2: iv_ruleTypeFieldValue= ruleTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue5223);
            iv_ruleTypeFieldValue=ruleTypeFieldValue();

            state._fsp--;

             current =iv_ruleTypeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFieldValue5234); 

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
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2266:1: ruleTypeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NameWithWC_0= RULE_NAMEWITHWC ;
    public final AntlrDatatypeRuleToken ruleTypeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NameWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2269:28: (this_NameWithWC_0= RULE_NAMEWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2270:5: this_NameWithWC_0= RULE_NAMEWITHWC
            {
            this_NameWithWC_0=(Token)match(input,RULE_NAMEWITHWC,FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue5273); 

            		current.merge(this_NameWithWC_0);
                
             
                newLeafNode(this_NameWithWC_0, grammarAccess.getTypeFieldValueAccess().getNameWithWCTerminalRuleCall()); 
                

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


    // $ANTLR start "entryRuleDefinitionTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2285:1: entryRuleDefinitionTypeFieldValue returns [String current=null] : iv_ruleDefinitionTypeFieldValue= ruleDefinitionTypeFieldValue EOF ;
    public final String entryRuleDefinitionTypeFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefinitionTypeFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2286:2: (iv_ruleDefinitionTypeFieldValue= ruleDefinitionTypeFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2287:2: iv_ruleDefinitionTypeFieldValue= ruleDefinitionTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getDefinitionTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleDefinitionTypeFieldValue_in_entryRuleDefinitionTypeFieldValue5318);
            iv_ruleDefinitionTypeFieldValue=ruleDefinitionTypeFieldValue();

            state._fsp--;

             current =iv_ruleDefinitionTypeFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionTypeFieldValue5329); 

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
    // $ANTLR end "entryRuleDefinitionTypeFieldValue"


    // $ANTLR start "ruleDefinitionTypeFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2294:1: ruleDefinitionTypeFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'parameter' | kw= 'nullLiteral' | kw= 'methodInvocation' | kw= 'instanceCreation' | kw= 'uninitialized' ) ;
    public final AntlrDatatypeRuleToken ruleDefinitionTypeFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2297:28: ( (kw= 'parameter' | kw= 'nullLiteral' | kw= 'methodInvocation' | kw= 'instanceCreation' | kw= 'uninitialized' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2298:1: (kw= 'parameter' | kw= 'nullLiteral' | kw= 'methodInvocation' | kw= 'instanceCreation' | kw= 'uninitialized' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2298:1: (kw= 'parameter' | kw= 'nullLiteral' | kw= 'methodInvocation' | kw= 'instanceCreation' | kw= 'uninitialized' )
            int alt63=5;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt63=1;
                }
                break;
            case 79:
                {
                alt63=2;
                }
                break;
            case 80:
                {
                alt63=3;
                }
                break;
            case 81:
                {
                alt63=4;
                }
                break;
            case 82:
                {
                alt63=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2299:2: kw= 'parameter'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleDefinitionTypeFieldValue5367); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefinitionTypeFieldValueAccess().getParameterKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2306:2: kw= 'nullLiteral'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleDefinitionTypeFieldValue5386); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefinitionTypeFieldValueAccess().getNullLiteralKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2313:2: kw= 'methodInvocation'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleDefinitionTypeFieldValue5405); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefinitionTypeFieldValueAccess().getMethodInvocationKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2320:2: kw= 'instanceCreation'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleDefinitionTypeFieldValue5424); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefinitionTypeFieldValueAccess().getInstanceCreationKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2327:2: kw= 'uninitialized'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleDefinitionTypeFieldValue5443); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefinitionTypeFieldValueAccess().getUninitializedKeyword_4()); 
                        

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
    // $ANTLR end "ruleDefinitionTypeFieldValue"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2340:1: entryRuleUnaryExpression returns [String current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final String entryRuleUnaryExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryExpression = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2341:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2342:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression5484);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression5495); 

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2349:1: ruleUnaryExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2352:28: ( (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2353:1: (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2353:1: (kw= '-' | kw= 'NOT' | kw= '!' | kw= '+' )
            int alt64=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt64=1;
                }
                break;
            case 84:
                {
                alt64=2;
                }
                break;
            case 85:
                {
                alt64=3;
                }
                break;
            case 86:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2354:2: kw= '-'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleUnaryExpression5533); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2361:2: kw= 'NOT'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleUnaryExpression5552); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getNOTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2368:2: kw= '!'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleUnaryExpression5571); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2375:2: kw= '+'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleUnaryExpression5590); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getPlusSignKeyword_3()); 
                        

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleFilePathFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2388:1: entryRuleFilePathFieldValue returns [String current=null] : iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF ;
    public final String entryRuleFilePathFieldValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePathFieldValue = null;


        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2389:2: (iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2390:2: iv_ruleFilePathFieldValue= ruleFilePathFieldValue EOF
            {
             newCompositeNode(grammarAccess.getFilePathFieldValueRule()); 
            pushFollow(FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue5631);
            iv_ruleFilePathFieldValue=ruleFilePathFieldValue();

            state._fsp--;

             current =iv_ruleFilePathFieldValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePathFieldValue5642); 

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
    // $ANTLR end "entryRuleFilePathFieldValue"


    // $ANTLR start "ruleFilePathFieldValue"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2397:1: ruleFilePathFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_PathWithWC_0= RULE_PATHWITHWC ;
    public final AntlrDatatypeRuleToken ruleFilePathFieldValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PathWithWC_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2400:28: (this_PathWithWC_0= RULE_PATHWITHWC )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2401:5: this_PathWithWC_0= RULE_PATHWITHWC
            {
            this_PathWithWC_0=(Token)match(input,RULE_PATHWITHWC,FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue5681); 

            		current.merge(this_PathWithWC_0);
                
             
                newLeafNode(this_PathWithWC_0, grammarAccess.getFilePathFieldValueAccess().getPathWithWCTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleFilePathFieldValue"


    // $ANTLR start "ruleBinaryOr"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2416:1: ruleBinaryOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleBinaryOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2418:28: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= '||' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2419:1: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= '||' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2419:1: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= '||' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==87) ) {
                alt65=1;
            }
            else if ( (LA65_0==88) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2419:2: (enumLiteral_0= 'OR' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2419:2: (enumLiteral_0= 'OR' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2419:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleBinaryOr5739); 

                            current = grammarAccess.getBinaryOrAccess().getOr1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryOrAccess().getOr1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2425:6: (enumLiteral_1= '||' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2425:6: (enumLiteral_1= '||' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2425:8: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleBinaryOr5756); 

                            current = grammarAccess.getBinaryOrAccess().getOr2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryOrAccess().getOr2EnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleBinaryOr"


    // $ANTLR start "ruleBinaryAnd"
    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2435:1: ruleBinaryAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= '&&' ) ) ;
    public final Enumerator ruleBinaryAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2437:28: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= '&&' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2438:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= '&&' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2438:1: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= '&&' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==89) ) {
                alt66=1;
            }
            else if ( (LA66_0==90) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2438:2: (enumLiteral_0= 'AND' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2438:2: (enumLiteral_0= 'AND' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2438:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleBinaryAnd5801); 

                            current = grammarAccess.getBinaryAndAccess().getAnd1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryAndAccess().getAnd1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2444:6: (enumLiteral_1= '&&' )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2444:6: (enumLiteral_1= '&&' )
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2444:8: enumLiteral_1= '&&'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleBinaryAnd5818); 

                            current = grammarAccess.getBinaryAndAccess().getAnd2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryAndAccess().getAnd2EnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleBinaryAnd"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp132 = new BitSet(new long[]{0xFFFFFFFFFFF20062L,0x0000000001F80007L});
    public static final BitSet FOLLOW_ruleBinaryOr_in_ruleOrExp162 = new BitSet(new long[]{0xFFFFFFFFFFF20060L,0x0000000001F80007L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleOrExp184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleAndExp279 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBinaryAnd_in_ruleAndExp309 = new BitSet(new long[]{0xFFFFFFFFFFF20060L,0x0000000001F80007L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleAndExp330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_rulePrimary424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rulePrimary448 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimary461 = new BitSet(new long[]{0xFFFFFFFFFFF20060L,0x0000000001F80007L});
    public static final BitSet FOLLOW_ruleOrExp_in_rulePrimary483 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePrimary494 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_rulePrimary506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClauseExpression_in_entryRuleClauseExpression544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClauseExpression554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression596 = new BitSet(new long[]{0xFFFFFFFFFFF00060L,0x0000000000780007L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression620 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_ruleClauseExpression663 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleClauseExpression675 = new BitSet(new long[]{0x0000000000020000L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression697 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17_in_ruleClauseExpression716 = new BitSet(new long[]{0x0000000000040000L,0x0000000000783E00L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_ruleClauseExpression756 = new BitSet(new long[]{0x0000000000040010L,0x0000000000783E00L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression768 = new BitSet(new long[]{0x0000000000040000L,0x0000000000783E00L});
    public static final BitSet FOLLOW_18_in_ruleClauseExpression783 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_ruleClauseExpression827 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleClauseExpression839 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression861 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17_in_ruleClauseExpression880 = new BitSet(new long[]{0x0000000000040060L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression898 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_ruleClauseExpression920 = new BitSet(new long[]{0x0000000000040070L,0x0000000000780000L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression932 = new BitSet(new long[]{0x0000000000040060L,0x0000000000780000L});
    public static final BitSet FOLLOW_18_in_ruleClauseExpression947 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_ruleClauseExpression991 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleClauseExpression1003 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression1025 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17_in_ruleClauseExpression1044 = new BitSet(new long[]{0x0000000000040040L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1062 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_ruleClauseExpression1084 = new BitSet(new long[]{0x0000000000040050L,0x0000000000780000L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1096 = new BitSet(new long[]{0x0000000000040040L,0x0000000000780000L});
    public static final BitSet FOLLOW_18_in_ruleClauseExpression1111 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_ruleClauseExpression1155 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleClauseExpression1167 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression1189 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17_in_ruleClauseExpression1208 = new BitSet(new long[]{0x0000000000040040L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1226 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_ruleClauseExpression1248 = new BitSet(new long[]{0x0000000000040050L,0x0000000000780000L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1260 = new BitSet(new long[]{0x0000000000040040L,0x0000000000780000L});
    public static final BitSet FOLLOW_18_in_ruleClauseExpression1275 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_ruleClauseExpression1319 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleClauseExpression1331 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression1353 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17_in_ruleClauseExpression1372 = new BitSet(new long[]{0x0000000000040100L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1390 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_ruleClauseExpression1412 = new BitSet(new long[]{0x0000000000040110L,0x0000000000780000L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1424 = new BitSet(new long[]{0x0000000000040100L,0x0000000000780000L});
    public static final BitSet FOLLOW_18_in_ruleClauseExpression1439 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_ruleClauseExpression1483 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleClauseExpression1495 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression1517 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17_in_ruleClauseExpression1536 = new BitSet(new long[]{0x0000000000040080L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1554 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_ruleClauseExpression1576 = new BitSet(new long[]{0x0000000000040090L,0x0000000000780000L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1588 = new BitSet(new long[]{0x0000000000040080L,0x0000000000780000L});
    public static final BitSet FOLLOW_18_in_ruleClauseExpression1603 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_ruleClauseExpression1647 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleClauseExpression1659 = new BitSet(new long[]{0x0000000000020000L,0x00000000000001F8L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression1681 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17_in_ruleClauseExpression1700 = new BitSet(new long[]{0x0000000000040000L,0x00000000007801F8L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1718 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F8L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_ruleClauseExpression1740 = new BitSet(new long[]{0x0000000000040010L,0x00000000007801F8L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1752 = new BitSet(new long[]{0x0000000000040000L,0x00000000007801F8L});
    public static final BitSet FOLLOW_18_in_ruleClauseExpression1767 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_ruleClauseExpression1811 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleClauseExpression1823 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression1845 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17_in_ruleClauseExpression1864 = new BitSet(new long[]{0x0000000000040040L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression1882 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_ruleClauseExpression1904 = new BitSet(new long[]{0x0000000000040050L,0x0000000000780000L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1916 = new BitSet(new long[]{0x0000000000040040L,0x0000000000780000L});
    public static final BitSet FOLLOW_18_in_ruleClauseExpression1931 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionTypeField_in_ruleClauseExpression1975 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleClauseExpression1987 = new BitSet(new long[]{0x0000000000020000L,0x000000000007C000L});
    public static final BitSet FOLLOW_ruleDefinitionTypeFieldValue_in_ruleClauseExpression2009 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17_in_ruleClauseExpression2028 = new BitSet(new long[]{0x0000000000040000L,0x00000000007FC000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleClauseExpression2046 = new BitSet(new long[]{0x0000000000000000L,0x000000000007C000L});
    public static final BitSet FOLLOW_ruleDefinitionTypeFieldValue_in_ruleClauseExpression2068 = new BitSet(new long[]{0x0000000000040010L,0x00000000007FC000L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression2080 = new BitSet(new long[]{0x0000000000040000L,0x00000000007FC000L});
    public static final BitSet FOLLOW_18_in_ruleClauseExpression2095 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_BOOST_in_ruleClauseExpression2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeField_in_entryRuleDocumentTypeField2149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeField2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDocumentTypeField2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_entryRuleSimpleField2249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleField2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSimpleField2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSimpleField2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSimpleField2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSimpleField2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSimpleField2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSimpleField2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSimpleField2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSimpleField2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSimpleField2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSimpleField2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSimpleField2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSimpleField2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSimpleField2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSimpleField2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSimpleField2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeField_in_entryRuleTypeField2869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeField2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTypeField2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTypeField2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTypeField2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeField3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTypeField3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTypeField3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTypeField3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTypeField3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTypeField3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTypeField3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeField3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeField3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTypeField3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTypeField3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeField3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeField3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTypeField3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodField_in_entryRuleMethodField3563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodField3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleMethodField3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMethodField3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleMethodField3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMethodField3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleMethodField3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMethodField3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMethodField3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleMethodField3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathField_in_entryRuleFilePathField3924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathField3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleFilePathField3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_entryRuleNumberField4024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberField4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleNumberField4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleNumberField4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierField_in_entryRuleModifierField4163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierField4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleModifierField4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameField_in_entryRuleProjectNameField4263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameField4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleProjectNameField4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionTypeField_in_entryRuleDefinitionTypeField4363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionTypeField4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDefinitionTypeField4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFieldValue_in_entryRuleSimpleFieldValue4464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFieldValue4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTEDNAMEWITHWC_in_ruleSimpleFieldValue4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleSimpleFieldValue4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodFieldValue_in_entryRuleMethodFieldValue4587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodFieldValue4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleMethodFieldValue4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectNameFieldValue_in_entryRuleProjectNameFieldValue4682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectNameFieldValue4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleProjectNameFieldValue4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFieldValue_in_entryRuleNumberFieldValue4777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFieldValue4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberFieldValue4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifierFieldValue_in_entryRuleModifierFieldValue4872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifierFieldValue4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleModifierFieldValue4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleModifierFieldValue4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleModifierFieldValue4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleModifierFieldValue4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleModifierFieldValue4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleModifierFieldValue5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTypeFieldValue_in_entryRuleDocumentTypeFieldValue5057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTypeFieldValue5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDocumentTypeFieldValue5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDocumentTypeFieldValue5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDocumentTypeFieldValue5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDocumentTypeFieldValue5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDocumentTypeFieldValue5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFieldValue_in_entryRuleTypeFieldValue5223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFieldValue5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAMEWITHWC_in_ruleTypeFieldValue5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionTypeFieldValue_in_entryRuleDefinitionTypeFieldValue5318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionTypeFieldValue5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDefinitionTypeFieldValue5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDefinitionTypeFieldValue5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDefinitionTypeFieldValue5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDefinitionTypeFieldValue5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDefinitionTypeFieldValue5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression5484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleUnaryExpression5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleUnaryExpression5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleUnaryExpression5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleUnaryExpression5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePathFieldValue_in_entryRuleFilePathFieldValue5631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePathFieldValue5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATHWITHWC_in_ruleFilePathFieldValue5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleBinaryOr5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleBinaryOr5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleBinaryAnd5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleBinaryAnd5818 = new BitSet(new long[]{0x0000000000000002L});

}