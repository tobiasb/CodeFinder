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

package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.services.LuceneFieldsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuceneFieldsParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g"; }


     
     	private LuceneFieldsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LuceneFieldsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:61:1: ( ruleModel EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:76:1: ( rule__Model__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFieldCategory"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:88:1: entryRuleFieldCategory : ruleFieldCategory EOF ;
    public final void entryRuleFieldCategory() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:89:1: ( ruleFieldCategory EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:90:1: ruleFieldCategory EOF
            {
             before(grammarAccess.getFieldCategoryRule()); 
            pushFollow(FOLLOW_ruleFieldCategory_in_entryRuleFieldCategory121);
            ruleFieldCategory();

            state._fsp--;

             after(grammarAccess.getFieldCategoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldCategory128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldCategory"


    // $ANTLR start "ruleFieldCategory"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:97:1: ruleFieldCategory : ( ( rule__FieldCategory__Group__0 ) ) ;
    public final void ruleFieldCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:101:2: ( ( ( rule__FieldCategory__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:102:1: ( ( rule__FieldCategory__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:102:1: ( ( rule__FieldCategory__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:103:1: ( rule__FieldCategory__Group__0 )
            {
             before(grammarAccess.getFieldCategoryAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:104:1: ( rule__FieldCategory__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:104:2: rule__FieldCategory__Group__0
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__0_in_ruleFieldCategory154);
            rule__FieldCategory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldCategoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldCategory"


    // $ANTLR start "entryRuleField"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:116:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:117:1: ( ruleField EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:118:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField181);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:125:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:129:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:130:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:130:1: ( ( rule__Field__Group__0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:131:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:132:1: ( rule__Field__Group__0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:132:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField214);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:144:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:145:1: ( ruleFieldType EOF )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:146:1: ruleFieldType EOF
            {
             before(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType241);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:153:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:157:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:158:1: ( ( rule__FieldType__Alternatives ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:158:1: ( ( rule__FieldType__Alternatives ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:159:1: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:160:1: ( rule__FieldType__Alternatives )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:160:2: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType274);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "rule__FieldType__Alternatives"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:172:1: rule__FieldType__Alternatives : ( ( ( rule__FieldType__TypeAssignment_0 ) ) | ( ( rule__FieldType__MethodAssignment_1 ) ) | ( ( rule__FieldType__FieldAssignment_2 ) ) | ( ( rule__FieldType__TrycatchAssignment_3 ) ) | ( ( rule__FieldType__VarusageAssignment_4 ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:176:1: ( ( ( rule__FieldType__TypeAssignment_0 ) ) | ( ( rule__FieldType__MethodAssignment_1 ) ) | ( ( rule__FieldType__FieldAssignment_2 ) ) | ( ( rule__FieldType__TrycatchAssignment_3 ) ) | ( ( rule__FieldType__VarusageAssignment_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 22:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:177:1: ( ( rule__FieldType__TypeAssignment_0 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:177:1: ( ( rule__FieldType__TypeAssignment_0 ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:178:1: ( rule__FieldType__TypeAssignment_0 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getTypeAssignment_0()); 
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:179:1: ( rule__FieldType__TypeAssignment_0 )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:179:2: rule__FieldType__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FieldType__TypeAssignment_0_in_rule__FieldType__Alternatives310);
                    rule__FieldType__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:183:6: ( ( rule__FieldType__MethodAssignment_1 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:183:6: ( ( rule__FieldType__MethodAssignment_1 ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:184:1: ( rule__FieldType__MethodAssignment_1 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getMethodAssignment_1()); 
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:185:1: ( rule__FieldType__MethodAssignment_1 )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:185:2: rule__FieldType__MethodAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FieldType__MethodAssignment_1_in_rule__FieldType__Alternatives328);
                    rule__FieldType__MethodAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getMethodAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:189:6: ( ( rule__FieldType__FieldAssignment_2 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:189:6: ( ( rule__FieldType__FieldAssignment_2 ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:190:1: ( rule__FieldType__FieldAssignment_2 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getFieldAssignment_2()); 
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:191:1: ( rule__FieldType__FieldAssignment_2 )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:191:2: rule__FieldType__FieldAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FieldType__FieldAssignment_2_in_rule__FieldType__Alternatives346);
                    rule__FieldType__FieldAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getFieldAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:195:6: ( ( rule__FieldType__TrycatchAssignment_3 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:195:6: ( ( rule__FieldType__TrycatchAssignment_3 ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:196:1: ( rule__FieldType__TrycatchAssignment_3 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getTrycatchAssignment_3()); 
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:197:1: ( rule__FieldType__TrycatchAssignment_3 )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:197:2: rule__FieldType__TrycatchAssignment_3
                    {
                    pushFollow(FOLLOW_rule__FieldType__TrycatchAssignment_3_in_rule__FieldType__Alternatives364);
                    rule__FieldType__TrycatchAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getTrycatchAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:201:6: ( ( rule__FieldType__VarusageAssignment_4 ) )
                    {
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:201:6: ( ( rule__FieldType__VarusageAssignment_4 ) )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:202:1: ( rule__FieldType__VarusageAssignment_4 )
                    {
                     before(grammarAccess.getFieldTypeAccess().getVarusageAssignment_4()); 
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:203:1: ( rule__FieldType__VarusageAssignment_4 )
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:203:2: rule__FieldType__VarusageAssignment_4
                    {
                    pushFollow(FOLLOW_rule__FieldType__VarusageAssignment_4_in_rule__FieldType__Alternatives382);
                    rule__FieldType__VarusageAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldTypeAccess().getVarusageAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:214:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:218:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:219:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0413);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0416);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:226:1: rule__Model__Group__0__Impl : ( 'class' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:230:1: ( ( 'class' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:231:1: ( 'class' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:231:1: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:232:1: 'class'
            {
             before(grammarAccess.getModelAccess().getClassKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl444); 
             after(grammarAccess.getModelAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:245:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:249:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:250:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1475);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1478);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:257:1: rule__Model__Group__1__Impl : ( ( rule__Model__ClassNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:261:1: ( ( ( rule__Model__ClassNameAssignment_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:262:1: ( ( rule__Model__ClassNameAssignment_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:262:1: ( ( rule__Model__ClassNameAssignment_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:263:1: ( rule__Model__ClassNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getClassNameAssignment_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:264:1: ( rule__Model__ClassNameAssignment_1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:264:2: rule__Model__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ClassNameAssignment_1_in_rule__Model__Group__1__Impl505);
            rule__Model__ClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:274:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:278:1: ( rule__Model__Group__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:279:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2535);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:285:1: rule__Model__Group__2__Impl : ( ( rule__Model__FieldCategoriesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:289:1: ( ( ( rule__Model__FieldCategoriesAssignment_2 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:290:1: ( ( rule__Model__FieldCategoriesAssignment_2 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:290:1: ( ( rule__Model__FieldCategoriesAssignment_2 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:291:1: ( rule__Model__FieldCategoriesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getFieldCategoriesAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:292:1: ( rule__Model__FieldCategoriesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:292:2: rule__Model__FieldCategoriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__FieldCategoriesAssignment_2_in_rule__Model__Group__2__Impl562);
            	    rule__Model__FieldCategoriesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFieldCategoriesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__FieldCategory__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:308:1: rule__FieldCategory__Group__0 : rule__FieldCategory__Group__0__Impl rule__FieldCategory__Group__1 ;
    public final void rule__FieldCategory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:312:1: ( rule__FieldCategory__Group__0__Impl rule__FieldCategory__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:313:2: rule__FieldCategory__Group__0__Impl rule__FieldCategory__Group__1
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__0__Impl_in_rule__FieldCategory__Group__0599);
            rule__FieldCategory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__1_in_rule__FieldCategory__Group__0602);
            rule__FieldCategory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__0"


    // $ANTLR start "rule__FieldCategory__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:320:1: rule__FieldCategory__Group__0__Impl : ( ( rule__FieldCategory__CategoryNameAssignment_0 ) ) ;
    public final void rule__FieldCategory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:324:1: ( ( ( rule__FieldCategory__CategoryNameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:325:1: ( ( rule__FieldCategory__CategoryNameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:325:1: ( ( rule__FieldCategory__CategoryNameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:326:1: ( rule__FieldCategory__CategoryNameAssignment_0 )
            {
             before(grammarAccess.getFieldCategoryAccess().getCategoryNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:327:1: ( rule__FieldCategory__CategoryNameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:327:2: rule__FieldCategory__CategoryNameAssignment_0
            {
            pushFollow(FOLLOW_rule__FieldCategory__CategoryNameAssignment_0_in_rule__FieldCategory__Group__0__Impl629);
            rule__FieldCategory__CategoryNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldCategoryAccess().getCategoryNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__0__Impl"


    // $ANTLR start "rule__FieldCategory__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:337:1: rule__FieldCategory__Group__1 : rule__FieldCategory__Group__1__Impl rule__FieldCategory__Group__2 ;
    public final void rule__FieldCategory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:341:1: ( rule__FieldCategory__Group__1__Impl rule__FieldCategory__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:342:2: rule__FieldCategory__Group__1__Impl rule__FieldCategory__Group__2
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__1__Impl_in_rule__FieldCategory__Group__1659);
            rule__FieldCategory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__2_in_rule__FieldCategory__Group__1662);
            rule__FieldCategory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__1"


    // $ANTLR start "rule__FieldCategory__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:349:1: rule__FieldCategory__Group__1__Impl : ( '{' ) ;
    public final void rule__FieldCategory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:353:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:354:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:354:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:355:1: '{'
            {
             before(grammarAccess.getFieldCategoryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__FieldCategory__Group__1__Impl690); 
             after(grammarAccess.getFieldCategoryAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__1__Impl"


    // $ANTLR start "rule__FieldCategory__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:368:1: rule__FieldCategory__Group__2 : rule__FieldCategory__Group__2__Impl rule__FieldCategory__Group__3 ;
    public final void rule__FieldCategory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:372:1: ( rule__FieldCategory__Group__2__Impl rule__FieldCategory__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:373:2: rule__FieldCategory__Group__2__Impl rule__FieldCategory__Group__3
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__2__Impl_in_rule__FieldCategory__Group__2721);
            rule__FieldCategory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__3_in_rule__FieldCategory__Group__2724);
            rule__FieldCategory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__2"


    // $ANTLR start "rule__FieldCategory__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:380:1: rule__FieldCategory__Group__2__Impl : ( ( rule__FieldCategory__FieldsAssignment_2 )* ) ;
    public final void rule__FieldCategory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:384:1: ( ( ( rule__FieldCategory__FieldsAssignment_2 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:385:1: ( ( rule__FieldCategory__FieldsAssignment_2 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:385:1: ( ( rule__FieldCategory__FieldsAssignment_2 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:386:1: ( rule__FieldCategory__FieldsAssignment_2 )*
            {
             before(grammarAccess.getFieldCategoryAccess().getFieldsAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:387:1: ( rule__FieldCategory__FieldsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:387:2: rule__FieldCategory__FieldsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__FieldCategory__FieldsAssignment_2_in_rule__FieldCategory__Group__2__Impl751);
            	    rule__FieldCategory__FieldsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFieldCategoryAccess().getFieldsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__2__Impl"


    // $ANTLR start "rule__FieldCategory__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:397:1: rule__FieldCategory__Group__3 : rule__FieldCategory__Group__3__Impl rule__FieldCategory__Group__4 ;
    public final void rule__FieldCategory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:401:1: ( rule__FieldCategory__Group__3__Impl rule__FieldCategory__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:402:2: rule__FieldCategory__Group__3__Impl rule__FieldCategory__Group__4
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__3__Impl_in_rule__FieldCategory__Group__3782);
            rule__FieldCategory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group__4_in_rule__FieldCategory__Group__3785);
            rule__FieldCategory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__3"


    // $ANTLR start "rule__FieldCategory__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:409:1: rule__FieldCategory__Group__3__Impl : ( '}' ) ;
    public final void rule__FieldCategory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:413:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:414:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:414:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:415:1: '}'
            {
             before(grammarAccess.getFieldCategoryAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__FieldCategory__Group__3__Impl813); 
             after(grammarAccess.getFieldCategoryAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__3__Impl"


    // $ANTLR start "rule__FieldCategory__Group__4"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:428:1: rule__FieldCategory__Group__4 : rule__FieldCategory__Group__4__Impl ;
    public final void rule__FieldCategory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:432:1: ( rule__FieldCategory__Group__4__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:433:2: rule__FieldCategory__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group__4__Impl_in_rule__FieldCategory__Group__4844);
            rule__FieldCategory__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__4"


    // $ANTLR start "rule__FieldCategory__Group__4__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:439:1: rule__FieldCategory__Group__4__Impl : ( ( rule__FieldCategory__Group_4__0 )? ) ;
    public final void rule__FieldCategory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:443:1: ( ( ( rule__FieldCategory__Group_4__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:444:1: ( ( rule__FieldCategory__Group_4__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:444:1: ( ( rule__FieldCategory__Group_4__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:445:1: ( rule__FieldCategory__Group_4__0 )?
            {
             before(grammarAccess.getFieldCategoryAccess().getGroup_4()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:446:1: ( rule__FieldCategory__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:446:2: rule__FieldCategory__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FieldCategory__Group_4__0_in_rule__FieldCategory__Group__4__Impl871);
                    rule__FieldCategory__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldCategoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group__4__Impl"


    // $ANTLR start "rule__FieldCategory__Group_4__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:466:1: rule__FieldCategory__Group_4__0 : rule__FieldCategory__Group_4__0__Impl rule__FieldCategory__Group_4__1 ;
    public final void rule__FieldCategory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:470:1: ( rule__FieldCategory__Group_4__0__Impl rule__FieldCategory__Group_4__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:471:2: rule__FieldCategory__Group_4__0__Impl rule__FieldCategory__Group_4__1
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group_4__0__Impl_in_rule__FieldCategory__Group_4__0912);
            rule__FieldCategory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group_4__1_in_rule__FieldCategory__Group_4__0915);
            rule__FieldCategory__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__0"


    // $ANTLR start "rule__FieldCategory__Group_4__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:478:1: rule__FieldCategory__Group_4__0__Impl : ( '(' ) ;
    public final void rule__FieldCategory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:482:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:483:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:483:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:484:1: '('
            {
             before(grammarAccess.getFieldCategoryAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,14,FOLLOW_14_in_rule__FieldCategory__Group_4__0__Impl943); 
             after(grammarAccess.getFieldCategoryAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__0__Impl"


    // $ANTLR start "rule__FieldCategory__Group_4__1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:497:1: rule__FieldCategory__Group_4__1 : rule__FieldCategory__Group_4__1__Impl rule__FieldCategory__Group_4__2 ;
    public final void rule__FieldCategory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:501:1: ( rule__FieldCategory__Group_4__1__Impl rule__FieldCategory__Group_4__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:502:2: rule__FieldCategory__Group_4__1__Impl rule__FieldCategory__Group_4__2
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group_4__1__Impl_in_rule__FieldCategory__Group_4__1974);
            rule__FieldCategory__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldCategory__Group_4__2_in_rule__FieldCategory__Group_4__1977);
            rule__FieldCategory__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__1"


    // $ANTLR start "rule__FieldCategory__Group_4__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:509:1: rule__FieldCategory__Group_4__1__Impl : ( ( rule__FieldCategory__DescAssignment_4_1 ) ) ;
    public final void rule__FieldCategory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:513:1: ( ( ( rule__FieldCategory__DescAssignment_4_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:514:1: ( ( rule__FieldCategory__DescAssignment_4_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:514:1: ( ( rule__FieldCategory__DescAssignment_4_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:515:1: ( rule__FieldCategory__DescAssignment_4_1 )
            {
             before(grammarAccess.getFieldCategoryAccess().getDescAssignment_4_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:516:1: ( rule__FieldCategory__DescAssignment_4_1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:516:2: rule__FieldCategory__DescAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FieldCategory__DescAssignment_4_1_in_rule__FieldCategory__Group_4__1__Impl1004);
            rule__FieldCategory__DescAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldCategoryAccess().getDescAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__1__Impl"


    // $ANTLR start "rule__FieldCategory__Group_4__2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:526:1: rule__FieldCategory__Group_4__2 : rule__FieldCategory__Group_4__2__Impl ;
    public final void rule__FieldCategory__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:530:1: ( rule__FieldCategory__Group_4__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:531:2: rule__FieldCategory__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__FieldCategory__Group_4__2__Impl_in_rule__FieldCategory__Group_4__21034);
            rule__FieldCategory__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__2"


    // $ANTLR start "rule__FieldCategory__Group_4__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:537:1: rule__FieldCategory__Group_4__2__Impl : ( ')' ) ;
    public final void rule__FieldCategory__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:541:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:542:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:542:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:543:1: ')'
            {
             before(grammarAccess.getFieldCategoryAccess().getRightParenthesisKeyword_4_2()); 
            match(input,15,FOLLOW_15_in_rule__FieldCategory__Group_4__2__Impl1062); 
             after(grammarAccess.getFieldCategoryAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__Group_4__2__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:562:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:566:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:567:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01099);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01102);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:574:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:578:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:579:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:579:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:580:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:581:1: ( rule__Field__NameAssignment_0 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:581:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl1129);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:591:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:595:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:596:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11159);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11162);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:603:1: rule__Field__Group__1__Impl : ( '=' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:607:1: ( ( '=' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:608:1: ( '=' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:608:1: ( '=' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:609:1: '='
            {
             before(grammarAccess.getFieldAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Field__Group__1__Impl1190); 
             after(grammarAccess.getFieldAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:622:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:626:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:627:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21221);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21224);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:634:1: rule__Field__Group__2__Impl : ( ( rule__Field__ValueAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:638:1: ( ( ( rule__Field__ValueAssignment_2 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:639:1: ( ( rule__Field__ValueAssignment_2 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:639:1: ( ( rule__Field__ValueAssignment_2 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:640:1: ( rule__Field__ValueAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getValueAssignment_2()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:641:1: ( rule__Field__ValueAssignment_2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:641:2: rule__Field__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__ValueAssignment_2_in_rule__Field__Group__2__Impl1251);
            rule__Field__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:651:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:655:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:656:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__31281);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__31284);
            rule__Field__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:663:1: rule__Field__Group__3__Impl : ( '{' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:667:1: ( ( '{' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:668:1: ( '{' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:668:1: ( '{' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:669:1: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Field__Group__3__Impl1312); 
             after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:682:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:686:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:687:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__41343);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__41346);
            rule__Field__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:694:1: rule__Field__Group__4__Impl : ( ( rule__Field__TypesAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:698:1: ( ( ( rule__Field__TypesAssignment_4 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:699:1: ( ( rule__Field__TypesAssignment_4 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:699:1: ( ( rule__Field__TypesAssignment_4 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:700:1: ( rule__Field__TypesAssignment_4 )
            {
             before(grammarAccess.getFieldAccess().getTypesAssignment_4()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:701:1: ( rule__Field__TypesAssignment_4 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:701:2: rule__Field__TypesAssignment_4
            {
            pushFollow(FOLLOW_rule__Field__TypesAssignment_4_in_rule__Field__Group__4__Impl1373);
            rule__Field__TypesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:711:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:715:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:716:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__51403);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__51406);
            rule__Field__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:723:1: rule__Field__Group__5__Impl : ( ( rule__Field__Group_5__0 )* ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:727:1: ( ( ( rule__Field__Group_5__0 )* ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:728:1: ( ( rule__Field__Group_5__0 )* )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:728:1: ( ( rule__Field__Group_5__0 )* )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:729:1: ( rule__Field__Group_5__0 )*
            {
             before(grammarAccess.getFieldAccess().getGroup_5()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:730:1: ( rule__Field__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:730:2: rule__Field__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Field__Group_5__0_in_rule__Field__Group__5__Impl1433);
            	    rule__Field__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFieldAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group__6"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:740:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:744:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:745:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__61464);
            rule__Field__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__7_in_rule__Field__Group__61467);
            rule__Field__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6"


    // $ANTLR start "rule__Field__Group__6__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:752:1: rule__Field__Group__6__Impl : ( '}' ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:756:1: ( ( '}' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:757:1: ( '}' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:757:1: ( '}' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:758:1: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Field__Group__6__Impl1495); 
             after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6__Impl"


    // $ANTLR start "rule__Field__Group__7"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:771:1: rule__Field__Group__7 : rule__Field__Group__7__Impl ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:775:1: ( rule__Field__Group__7__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:776:2: rule__Field__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__71526);
            rule__Field__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__7"


    // $ANTLR start "rule__Field__Group__7__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:782:1: rule__Field__Group__7__Impl : ( ( rule__Field__Group_7__0 )? ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:786:1: ( ( ( rule__Field__Group_7__0 )? ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:787:1: ( ( rule__Field__Group_7__0 )? )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:787:1: ( ( rule__Field__Group_7__0 )? )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:788:1: ( rule__Field__Group_7__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_7()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:789:1: ( rule__Field__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:789:2: rule__Field__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Field__Group_7__0_in_rule__Field__Group__7__Impl1553);
                    rule__Field__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__7__Impl"


    // $ANTLR start "rule__Field__Group_5__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:815:1: rule__Field__Group_5__0 : rule__Field__Group_5__0__Impl rule__Field__Group_5__1 ;
    public final void rule__Field__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:819:1: ( rule__Field__Group_5__0__Impl rule__Field__Group_5__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:820:2: rule__Field__Group_5__0__Impl rule__Field__Group_5__1
            {
            pushFollow(FOLLOW_rule__Field__Group_5__0__Impl_in_rule__Field__Group_5__01600);
            rule__Field__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_5__1_in_rule__Field__Group_5__01603);
            rule__Field__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_5__0"


    // $ANTLR start "rule__Field__Group_5__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:827:1: rule__Field__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Field__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:831:1: ( ( ',' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:832:1: ( ',' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:832:1: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:833:1: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_17_in_rule__Field__Group_5__0__Impl1631); 
             after(grammarAccess.getFieldAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_5__0__Impl"


    // $ANTLR start "rule__Field__Group_5__1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:846:1: rule__Field__Group_5__1 : rule__Field__Group_5__1__Impl ;
    public final void rule__Field__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:850:1: ( rule__Field__Group_5__1__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:851:2: rule__Field__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_5__1__Impl_in_rule__Field__Group_5__11662);
            rule__Field__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_5__1"


    // $ANTLR start "rule__Field__Group_5__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:857:1: rule__Field__Group_5__1__Impl : ( ( rule__Field__TypesAssignment_5_1 ) ) ;
    public final void rule__Field__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:861:1: ( ( ( rule__Field__TypesAssignment_5_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:862:1: ( ( rule__Field__TypesAssignment_5_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:862:1: ( ( rule__Field__TypesAssignment_5_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:863:1: ( rule__Field__TypesAssignment_5_1 )
            {
             before(grammarAccess.getFieldAccess().getTypesAssignment_5_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:864:1: ( rule__Field__TypesAssignment_5_1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:864:2: rule__Field__TypesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Field__TypesAssignment_5_1_in_rule__Field__Group_5__1__Impl1689);
            rule__Field__TypesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_5__1__Impl"


    // $ANTLR start "rule__Field__Group_7__0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:878:1: rule__Field__Group_7__0 : rule__Field__Group_7__0__Impl rule__Field__Group_7__1 ;
    public final void rule__Field__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:882:1: ( rule__Field__Group_7__0__Impl rule__Field__Group_7__1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:883:2: rule__Field__Group_7__0__Impl rule__Field__Group_7__1
            {
            pushFollow(FOLLOW_rule__Field__Group_7__0__Impl_in_rule__Field__Group_7__01723);
            rule__Field__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_7__1_in_rule__Field__Group_7__01726);
            rule__Field__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__0"


    // $ANTLR start "rule__Field__Group_7__0__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:890:1: rule__Field__Group_7__0__Impl : ( '(' ) ;
    public final void rule__Field__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:894:1: ( ( '(' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:895:1: ( '(' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:895:1: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:896:1: '('
            {
             before(grammarAccess.getFieldAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,14,FOLLOW_14_in_rule__Field__Group_7__0__Impl1754); 
             after(grammarAccess.getFieldAccess().getLeftParenthesisKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__0__Impl"


    // $ANTLR start "rule__Field__Group_7__1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:909:1: rule__Field__Group_7__1 : rule__Field__Group_7__1__Impl rule__Field__Group_7__2 ;
    public final void rule__Field__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:913:1: ( rule__Field__Group_7__1__Impl rule__Field__Group_7__2 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:914:2: rule__Field__Group_7__1__Impl rule__Field__Group_7__2
            {
            pushFollow(FOLLOW_rule__Field__Group_7__1__Impl_in_rule__Field__Group_7__11785);
            rule__Field__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group_7__2_in_rule__Field__Group_7__11788);
            rule__Field__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__1"


    // $ANTLR start "rule__Field__Group_7__1__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:921:1: rule__Field__Group_7__1__Impl : ( ( rule__Field__DescAssignment_7_1 ) ) ;
    public final void rule__Field__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:925:1: ( ( ( rule__Field__DescAssignment_7_1 ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:926:1: ( ( rule__Field__DescAssignment_7_1 ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:926:1: ( ( rule__Field__DescAssignment_7_1 ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:927:1: ( rule__Field__DescAssignment_7_1 )
            {
             before(grammarAccess.getFieldAccess().getDescAssignment_7_1()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:928:1: ( rule__Field__DescAssignment_7_1 )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:928:2: rule__Field__DescAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Field__DescAssignment_7_1_in_rule__Field__Group_7__1__Impl1815);
            rule__Field__DescAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getDescAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__1__Impl"


    // $ANTLR start "rule__Field__Group_7__2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:938:1: rule__Field__Group_7__2 : rule__Field__Group_7__2__Impl ;
    public final void rule__Field__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:942:1: ( rule__Field__Group_7__2__Impl )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:943:2: rule__Field__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group_7__2__Impl_in_rule__Field__Group_7__21845);
            rule__Field__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__2"


    // $ANTLR start "rule__Field__Group_7__2__Impl"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:949:1: rule__Field__Group_7__2__Impl : ( ')' ) ;
    public final void rule__Field__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:953:1: ( ( ')' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:954:1: ( ')' )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:954:1: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:955:1: ')'
            {
             before(grammarAccess.getFieldAccess().getRightParenthesisKeyword_7_2()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group_7__2__Impl1873); 
             after(grammarAccess.getFieldAccess().getRightParenthesisKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__2__Impl"


    // $ANTLR start "rule__Model__ClassNameAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:975:1: rule__Model__ClassNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:979:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:980:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:980:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:981:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__ClassNameAssignment_11915); 
             after(grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ClassNameAssignment_1"


    // $ANTLR start "rule__Model__FieldCategoriesAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:990:1: rule__Model__FieldCategoriesAssignment_2 : ( ruleFieldCategory ) ;
    public final void rule__Model__FieldCategoriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:994:1: ( ( ruleFieldCategory ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:995:1: ( ruleFieldCategory )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:995:1: ( ruleFieldCategory )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:996:1: ruleFieldCategory
            {
             before(grammarAccess.getModelAccess().getFieldCategoriesFieldCategoryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFieldCategory_in_rule__Model__FieldCategoriesAssignment_21946);
            ruleFieldCategory();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFieldCategoriesFieldCategoryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FieldCategoriesAssignment_2"


    // $ANTLR start "rule__FieldCategory__CategoryNameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1005:1: rule__FieldCategory__CategoryNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FieldCategory__CategoryNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1009:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1010:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1010:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1011:1: RULE_ID
            {
             before(grammarAccess.getFieldCategoryAccess().getCategoryNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldCategory__CategoryNameAssignment_01977); 
             after(grammarAccess.getFieldCategoryAccess().getCategoryNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__CategoryNameAssignment_0"


    // $ANTLR start "rule__FieldCategory__FieldsAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1020:1: rule__FieldCategory__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__FieldCategory__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1024:1: ( ( ruleField ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1025:1: ( ruleField )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1025:1: ( ruleField )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1026:1: ruleField
            {
             before(grammarAccess.getFieldCategoryAccess().getFieldsFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__FieldCategory__FieldsAssignment_22008);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldCategoryAccess().getFieldsFieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__FieldsAssignment_2"


    // $ANTLR start "rule__FieldCategory__DescAssignment_4_1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1035:1: rule__FieldCategory__DescAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldCategory__DescAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1039:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1040:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1040:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1041:1: RULE_STRING
            {
             before(grammarAccess.getFieldCategoryAccess().getDescSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FieldCategory__DescAssignment_4_12039); 
             after(grammarAccess.getFieldCategoryAccess().getDescSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldCategory__DescAssignment_4_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1050:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1054:1: ( ( RULE_ID ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1055:1: ( RULE_ID )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1055:1: ( RULE_ID )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1056:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_02070); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__ValueAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1065:1: rule__Field__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Field__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1069:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1070:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1070:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1071:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__ValueAssignment_22101); 
             after(grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ValueAssignment_2"


    // $ANTLR start "rule__Field__TypesAssignment_4"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1080:1: rule__Field__TypesAssignment_4 : ( ruleFieldType ) ;
    public final void rule__Field__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1084:1: ( ( ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1085:1: ( ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1085:1: ( ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1086:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_42132);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypesAssignment_4"


    // $ANTLR start "rule__Field__TypesAssignment_5_1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1095:1: rule__Field__TypesAssignment_5_1 : ( ruleFieldType ) ;
    public final void rule__Field__TypesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1099:1: ( ( ruleFieldType ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1100:1: ( ruleFieldType )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1100:1: ( ruleFieldType )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1101:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_5_12163);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypesAssignment_5_1"


    // $ANTLR start "rule__Field__DescAssignment_7_1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1110:1: rule__Field__DescAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Field__DescAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1114:1: ( ( RULE_STRING ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1115:1: ( RULE_STRING )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1115:1: ( RULE_STRING )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1116:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getDescSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__DescAssignment_7_12194); 
             after(grammarAccess.getFieldAccess().getDescSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__DescAssignment_7_1"


    // $ANTLR start "rule__FieldType__TypeAssignment_0"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1125:1: rule__FieldType__TypeAssignment_0 : ( ( 'type' ) ) ;
    public final void rule__FieldType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1129:1: ( ( ( 'type' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1130:1: ( ( 'type' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1130:1: ( ( 'type' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1131:1: ( 'type' )
            {
             before(grammarAccess.getFieldTypeAccess().getTypeTypeKeyword_0_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1132:1: ( 'type' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1133:1: 'type'
            {
             before(grammarAccess.getFieldTypeAccess().getTypeTypeKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__FieldType__TypeAssignment_02230); 
             after(grammarAccess.getFieldTypeAccess().getTypeTypeKeyword_0_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getTypeTypeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__TypeAssignment_0"


    // $ANTLR start "rule__FieldType__MethodAssignment_1"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1148:1: rule__FieldType__MethodAssignment_1 : ( ( 'method' ) ) ;
    public final void rule__FieldType__MethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1152:1: ( ( ( 'method' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1153:1: ( ( 'method' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1153:1: ( ( 'method' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1154:1: ( 'method' )
            {
             before(grammarAccess.getFieldTypeAccess().getMethodMethodKeyword_1_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1155:1: ( 'method' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1156:1: 'method'
            {
             before(grammarAccess.getFieldTypeAccess().getMethodMethodKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__FieldType__MethodAssignment_12274); 
             after(grammarAccess.getFieldTypeAccess().getMethodMethodKeyword_1_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getMethodMethodKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__MethodAssignment_1"


    // $ANTLR start "rule__FieldType__FieldAssignment_2"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1171:1: rule__FieldType__FieldAssignment_2 : ( ( 'field' ) ) ;
    public final void rule__FieldType__FieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1175:1: ( ( ( 'field' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1176:1: ( ( 'field' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1176:1: ( ( 'field' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1177:1: ( 'field' )
            {
             before(grammarAccess.getFieldTypeAccess().getFieldFieldKeyword_2_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1178:1: ( 'field' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1179:1: 'field'
            {
             before(grammarAccess.getFieldTypeAccess().getFieldFieldKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__FieldType__FieldAssignment_22318); 
             after(grammarAccess.getFieldTypeAccess().getFieldFieldKeyword_2_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getFieldFieldKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__FieldAssignment_2"


    // $ANTLR start "rule__FieldType__TrycatchAssignment_3"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1194:1: rule__FieldType__TrycatchAssignment_3 : ( ( 'trycatch' ) ) ;
    public final void rule__FieldType__TrycatchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1198:1: ( ( ( 'trycatch' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1199:1: ( ( 'trycatch' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1199:1: ( ( 'trycatch' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1200:1: ( 'trycatch' )
            {
             before(grammarAccess.getFieldTypeAccess().getTrycatchTrycatchKeyword_3_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1201:1: ( 'trycatch' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1202:1: 'trycatch'
            {
             before(grammarAccess.getFieldTypeAccess().getTrycatchTrycatchKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__FieldType__TrycatchAssignment_32362); 
             after(grammarAccess.getFieldTypeAccess().getTrycatchTrycatchKeyword_3_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getTrycatchTrycatchKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__TrycatchAssignment_3"


    // $ANTLR start "rule__FieldType__VarusageAssignment_4"
    // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1217:1: rule__FieldType__VarusageAssignment_4 : ( ( 'varusage' ) ) ;
    public final void rule__FieldType__VarusageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1221:1: ( ( ( 'varusage' ) ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1222:1: ( ( 'varusage' ) )
            {
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1222:1: ( ( 'varusage' ) )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1223:1: ( 'varusage' )
            {
             before(grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0()); 
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1224:1: ( 'varusage' )
            // ../org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneFields.g:1225:1: 'varusage'
            {
             before(grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__FieldType__VarusageAssignment_42406); 
             after(grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getVarusageVarusageKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__VarusageAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldCategory_in_entryRuleFieldCategory121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldCategory128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__0_in_ruleFieldCategory154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__TypeAssignment_0_in_rule__FieldType__Alternatives310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__MethodAssignment_1_in_rule__FieldType__Alternatives328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__FieldAssignment_2_in_rule__FieldType__Alternatives346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__TrycatchAssignment_3_in_rule__FieldType__Alternatives364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__VarusageAssignment_4_in_rule__FieldType__Alternatives382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ClassNameAssignment_1_in_rule__Model__Group__1__Impl505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FieldCategoriesAssignment_2_in_rule__Model__Group__2__Impl562 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__0__Impl_in_rule__FieldCategory__Group__0599 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__1_in_rule__FieldCategory__Group__0602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__CategoryNameAssignment_0_in_rule__FieldCategory__Group__0__Impl629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__1__Impl_in_rule__FieldCategory__Group__1659 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__2_in_rule__FieldCategory__Group__1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FieldCategory__Group__1__Impl690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__2__Impl_in_rule__FieldCategory__Group__2721 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__3_in_rule__FieldCategory__Group__2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__FieldsAssignment_2_in_rule__FieldCategory__Group__2__Impl751 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__3__Impl_in_rule__FieldCategory__Group__3782 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__4_in_rule__FieldCategory__Group__3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FieldCategory__Group__3__Impl813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group__4__Impl_in_rule__FieldCategory__Group__4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__0_in_rule__FieldCategory__Group__4__Impl871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__0__Impl_in_rule__FieldCategory__Group_4__0912 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__1_in_rule__FieldCategory__Group_4__0915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FieldCategory__Group_4__0__Impl943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__1__Impl_in_rule__FieldCategory__Group_4__1974 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__2_in_rule__FieldCategory__Group_4__1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__DescAssignment_4_1_in_rule__FieldCategory__Group_4__1__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldCategory__Group_4__2__Impl_in_rule__FieldCategory__Group_4__21034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FieldCategory__Group_4__2__Impl1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01099 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Field__Group__1__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21221 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ValueAssignment_2_in_rule__Field__Group__2__Impl1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__31281 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__31284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Field__Group__3__Impl1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__41343 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__41346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypesAssignment_4_in_rule__Field__Group__4__Impl1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__51403 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__51406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__0_in_rule__Field__Group__5__Impl1433 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__61464 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Field__Group__7_in_rule__Field__Group__61467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Field__Group__6__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__71526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_7__0_in_rule__Field__Group__7__Impl1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__0__Impl_in_rule__Field__Group_5__01600 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_rule__Field__Group_5__1_in_rule__Field__Group_5__01603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Field__Group_5__0__Impl1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_5__1__Impl_in_rule__Field__Group_5__11662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypesAssignment_5_1_in_rule__Field__Group_5__1__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_7__0__Impl_in_rule__Field__Group_7__01723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group_7__1_in_rule__Field__Group_7__01726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Field__Group_7__0__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_7__1__Impl_in_rule__Field__Group_7__11785 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Field__Group_7__2_in_rule__Field__Group_7__11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__DescAssignment_7_1_in_rule__Field__Group_7__1__Impl1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group_7__2__Impl_in_rule__Field__Group_7__21845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group_7__2__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__ClassNameAssignment_11915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldCategory_in_rule__Model__FieldCategoriesAssignment_21946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldCategory__CategoryNameAssignment_01977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__FieldCategory__FieldsAssignment_22008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FieldCategory__DescAssignment_4_12039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_02070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__ValueAssignment_22101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_42132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypesAssignment_5_12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__DescAssignment_7_12194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FieldType__TypeAssignment_02230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FieldType__MethodAssignment_12274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FieldType__FieldAssignment_22318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FieldType__TrycatchAssignment_32362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FieldType__VarusageAssignment_42406 = new BitSet(new long[]{0x0000000000000002L});

}
