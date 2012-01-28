package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuceneQueryLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=7;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_PATHWITHWC=6;
    public static final int RULE_NAMEWITHWC=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators

    public InternalLuceneQueryLexer() {;} 
    public InternalLuceneQueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLuceneQueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:11:7: ( '(' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:12:7: ( ')' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:13:7: ( ':' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:14:7: ( 'ImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:14:9: 'ImplementedTypes'
            {
            match("ImplementedTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:15:7: ( 'ExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:15:9: 'ExtendedTypes'
            {
            match("ExtendedTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:16:7: ( 'UsedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:16:9: 'UsedTypes'
            {
            match("UsedTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:17:7: ( 'UsedTypesInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:17:9: 'UsedTypesInTry'
            {
            match("UsedTypesInTry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:18:7: ( 'UsedTypesInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:18:9: 'UsedTypesInFinally'
            {
            match("UsedTypesInFinally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:19:7: ( 'ParameterTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:19:9: 'ParameterTypes'
            {
            match("ParameterTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:20:7: ( 'ReturnType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:20:9: 'ReturnType'
            {
            match("ReturnType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:21:7: ( 'InstanceofTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:21:9: 'InstanceofTypes'
            {
            match("InstanceofTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:22:7: ( 'AllImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:22:9: 'AllImplementedTypes'
            {
            match("AllImplementedTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:23:7: ( 'AllExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:23:9: 'AllExtendedTypes'
            {
            match("AllExtendedTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:24:7: ( 'FieldType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:24:9: 'FieldType'
            {
            match("FieldType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:25:7: ( 'CaughtType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:25:9: 'CaughtType'
            {
            match("CaughtType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:26:7: ( 'DeclaredFieldTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:26:9: 'DeclaredFieldTypes'
            {
            match("DeclaredFieldTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:27:7: ( 'DeclaringType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:27:9: 'DeclaringType'
            {
            match("DeclaringType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:28:7: ( 'UsedMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:28:9: 'UsedMethods'
            {
            match("UsedMethods"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:29:7: ( 'UsedMethodsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:29:9: 'UsedMethodsInTry'
            {
            match("UsedMethodsInTry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:30:7: ( 'UsedMethodsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:30:9: 'UsedMethodsInFinally'
            {
            match("UsedMethodsInFinally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:31:7: ( 'OverriddenMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:31:9: 'OverriddenMethods'
            {
            match("OverriddenMethods"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:32:7: ( 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:32:9: 'ResourcePath'
            {
            match("ResourcePath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:33:7: ( 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:33:9: 'ParameterCount'
            {
            match("ParameterCount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:34:7: ( 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:34:9: 'Modifiers'
            {
            match("Modifiers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:35:7: ( 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:35:9: 'Timestamp'
            {
            match("Timestamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:36:7: ( 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:36:9: 'Type'
            {
            match("Type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:37:7: ( 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:37:9: 'ProjectName'
            {
            match("ProjectName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:38:7: ( 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:38:9: 'Annotations'
            {
            match("Annotations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:39:7: ( 'FullyQualifiedName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:39:9: 'FullyQualifiedName'
            {
            match("FullyQualifiedName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:40:7: ( 'FriendlyName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:40:9: 'FriendlyName'
            {
            match("FriendlyName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:41:7: ( 'DeclaredMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:41:9: 'DeclaredMethods'
            {
            match("DeclaredMethods"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:42:7: ( 'ReturnVariableEexpressions' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:42:9: 'ReturnVariableEexpressions'
            {
            match("ReturnVariableEexpressions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:43:7: ( 'AllDeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:43:9: 'AllDeclaredMethodNames'
            {
            match("AllDeclaredMethodNames"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:44:7: ( 'DeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:44:9: 'DeclaredMethodNames'
            {
            match("DeclaredMethodNames"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:45:7: ( 'DeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:45:9: 'DeclaredFieldNames'
            {
            match("DeclaredFieldNames"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:46:7: ( 'AllDeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:46:9: 'AllDeclaredFieldNames'
            {
            match("AllDeclaredFieldNames"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:47:7: ( 'FullText' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:47:9: 'FullText'
            {
            match("FullText"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:48:7: ( 'FieldsRead' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:48:9: 'FieldsRead'
            {
            match("FieldsRead"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:49:7: ( 'FieldsWritten' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:49:9: 'FieldsWritten'
            {
            match("FieldsWritten"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:50:7: ( 'UsedFieldsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:50:9: 'UsedFieldsInFinally'
            {
            match("UsedFieldsInFinally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:51:7: ( 'UsedFieldsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:51:9: 'UsedFieldsInTry'
            {
            match("UsedFieldsInTry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:52:7: ( 'private' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:52:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:53:7: ( 'public' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:53:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:54:7: ( 'static' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:54:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:55:7: ( 'final' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:55:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:56:7: ( 'abstract' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:56:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:57:7: ( 'protected' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:57:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:58:7: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:58:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:59:7: ( 'method' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:59:9: 'method'
            {
            match("method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:60:7: ( 'field' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:60:9: 'field'
            {
            match("field"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:61:7: ( 'trycatch' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:61:9: 'trycatch'
            {
            match("trycatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:62:7: ( '-' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:62:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:63:7: ( 'NOT' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:63:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:64:7: ( '!' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:64:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:65:7: ( '+' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:65:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:66:7: ( 'AND' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:66:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:67:7: ( 'OR' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:67:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "RULE_NAMEWITHWC"
    public final void mRULE_NAMEWITHWC() throws RecognitionException {
        try {
            int _type = RULE_NAMEWITHWC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1870:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1870:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )*
            {
            if ( input.LA(1)=='*'||input.LA(1)=='<'||(input.LA(1)>='>' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1870:67: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*'||LA1_0=='.'||(LA1_0>='0' && LA1_0<='9')||LA1_0=='<'||(LA1_0>='>' && LA1_0<='?')||(LA1_0>='A' && LA1_0<='[')||LA1_0==']'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:
            	    {
            	    if ( input.LA(1)=='*'||input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='<'||(input.LA(1)>='>' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAMEWITHWC"

    // $ANTLR start "RULE_PATHWITHWC"
    public final void mRULE_PATHWITHWC() throws RecognitionException {
        try {
            int _type = RULE_PATHWITHWC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1872:17: ( ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1872:19: ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )*
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1872:19: ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==':') ) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else if ( (LA2_0=='/'||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1872:20: 'A' .. 'Z' ':'
                    {
                    matchRange('A','Z'); 
                    match(':'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1872:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' )
                    {
                    if ( input.LA(1)=='/'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1872:62: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*'||(LA3_0>='.' && LA3_0<='9')||LA3_0=='?'||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:
            	    {
            	    if ( input.LA(1)=='*'||(input.LA(1)>='.' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATHWITHWC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1874:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1874:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1874:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1874:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1874:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1876:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1876:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1876:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1876:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1878:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1880:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1880:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1880:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1880:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1882:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1882:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1882:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1882:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1882:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1882:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1882:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1882:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1884:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1884:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1884:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1886:16: ( . )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1886:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_NAMEWITHWC | RULE_PATHWITHWC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=66;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:352: RULE_NAMEWITHWC
                {
                mRULE_NAMEWITHWC(); 

                }
                break;
            case 59 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:368: RULE_PATHWITHWC
                {
                mRULE_PATHWITHWC(); 

                }
                break;
            case 60 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:384: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 61 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:392: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 62 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:401: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 63 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:413: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 64 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:429: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 65 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:445: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 66 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:453: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\4\uffff\23\54\1\uffff\1\54\2\uffff\2\54\1\uffff\1\52\1\44\1\uffff"+
        "\2\44\5\uffff\2\54\1\uffff\1\54\1\uffff\17\54\1\143\13\54\1\uffff"+
        "\1\54\2\uffff\2\52\4\uffff\12\54\1\u0083\6\54\1\uffff\15\54\1\u0097"+
        "\1\52\1\uffff\2\52\1\uffff\14\54\1\uffff\10\54\1\u00b0\12\54\1\uffff"+
        "\1\52\27\54\1\uffff\4\54\1\u00d7\1\u00d8\1\54\1\u00da\34\54\1\u00fa"+
        "\1\u00fb\2\uffff\1\54\1\uffff\1\u00fd\34\54\1\u011a\1\54\2\uffff"+
        "\1\54\1\uffff\24\54\1\u0131\7\54\1\uffff\1\54\1\u013b\1\u013c\3"+
        "\54\1\u0141\13\54\1\u014e\3\54\1\uffff\6\54\1\u0158\1\u0159\1\u015a"+
        "\2\uffff\4\54\1\uffff\5\54\1\u0164\6\54\1\uffff\1\u016b\3\54\1\u016f"+
        "\4\54\3\uffff\4\54\1\u017a\3\54\1\u017e\1\uffff\5\54\1\u0185\1\uffff"+
        "\3\54\1\uffff\12\54\1\uffff\3\54\1\uffff\1\54\1\u0198\4\54\1\uffff"+
        "\2\54\1\u019f\6\54\1\u01a6\10\54\1\uffff\4\54\1\u01b4\1\54\1\uffff"+
        "\2\54\1\u01b9\3\54\1\uffff\1\u01bd\5\54\1\u01c3\1\u01c4\5\54\1\uffff"+
        "\4\54\1\uffff\2\54\1\u01d1\1\uffff\4\54\1\u01d6\2\uffff\10\54\1"+
        "\u01df\2\54\1\u01e2\1\uffff\1\54\1\u01e4\2\54\1\uffff\2\54\1\u01e9"+
        "\5\54\1\uffff\2\54\1\uffff\1\54\1\uffff\4\54\1\uffff\6\54\1\u01fc"+
        "\1\u01fd\6\54\1\u0204\1\u0205\1\u0206\1\54\2\uffff\1\54\1\u0209"+
        "\1\54\1\u020b\2\54\3\uffff\1\u020e\1\u020f\1\uffff\1\54\1\uffff"+
        "\2\54\2\uffff\2\54\1\u0215\1\54\1\u0217\1\uffff\1\54\1\uffff\2\54"+
        "\1\u021b\1\uffff";
    static final String DFA15_eofS =
        "\u021c\uffff";
    static final String DFA15_minS =
        "\1\0\3\uffff\23\52\1\uffff\1\52\2\uffff\2\52\1\uffff\1\52\1\101"+
        "\1\uffff\2\0\5\uffff\2\52\1\uffff\1\52\1\uffff\33\52\1\uffff\1\52"+
        "\2\uffff\2\0\4\uffff\21\52\1\uffff\16\52\1\0\1\uffff\2\0\1\uffff"+
        "\14\52\1\uffff\23\52\1\uffff\1\0\27\52\1\uffff\46\52\2\uffff\1\52"+
        "\1\uffff\37\52\2\uffff\1\52\1\uffff\34\52\1\uffff\26\52\1\uffff"+
        "\11\52\2\uffff\4\52\1\uffff\14\52\1\uffff\11\52\3\uffff\11\52\1"+
        "\uffff\6\52\1\uffff\3\52\1\uffff\12\52\1\uffff\3\52\1\uffff\6\52"+
        "\1\uffff\22\52\1\uffff\6\52\1\uffff\6\52\1\uffff\15\52\1\uffff\4"+
        "\52\1\uffff\3\52\1\uffff\5\52\2\uffff\14\52\1\uffff\4\52\1\uffff"+
        "\10\52\1\uffff\2\52\1\uffff\1\52\1\uffff\4\52\1\uffff\22\52\2\uffff"+
        "\6\52\3\uffff\2\52\1\uffff\1\52\1\uffff\2\52\2\uffff\5\52\1\uffff"+
        "\1\52\1\uffff\3\52\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\3\uffff\23\172\1\uffff\1\172\2\uffff\2\172\1\uffff\1\57"+
        "\1\172\1\uffff\2\uffff\5\uffff\2\172\1\uffff\1\172\1\uffff\33\172"+
        "\1\uffff\1\172\2\uffff\2\uffff\4\uffff\21\172\1\uffff\16\172\1\uffff"+
        "\1\uffff\2\uffff\1\uffff\14\172\1\uffff\23\172\1\uffff\1\uffff\27"+
        "\172\1\uffff\46\172\2\uffff\1\172\1\uffff\37\172\2\uffff\1\172\1"+
        "\uffff\34\172\1\uffff\26\172\1\uffff\11\172\2\uffff\4\172\1\uffff"+
        "\14\172\1\uffff\11\172\3\uffff\11\172\1\uffff\6\172\1\uffff\3\172"+
        "\1\uffff\12\172\1\uffff\3\172\1\uffff\6\172\1\uffff\22\172\1\uffff"+
        "\6\172\1\uffff\6\172\1\uffff\15\172\1\uffff\4\172\1\uffff\3\172"+
        "\1\uffff\5\172\2\uffff\14\172\1\uffff\4\172\1\uffff\10\172\1\uffff"+
        "\2\172\1\uffff\1\172\1\uffff\4\172\1\uffff\22\172\2\uffff\6\172"+
        "\3\uffff\2\172\1\uffff\1\172\1\uffff\2\172\2\uffff\5\172\1\uffff"+
        "\1\172\1\uffff\3\172\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\23\uffff\1\64\1\uffff\1\66\1\67\2\uffff\1"+
        "\72\2\uffff\1\75\2\uffff\1\101\1\102\1\1\1\2\1\3\2\uffff\1\73\1"+
        "\uffff\1\72\33\uffff\1\64\1\uffff\1\66\1\67\2\uffff\1\74\1\75\1"+
        "\76\1\101\21\uffff\1\71\17\uffff\1\77\2\uffff\1\100\14\uffff\1\70"+
        "\23\uffff\1\65\30\uffff\1\32\46\uffff\1\55\1\62\1\uffff\1\60\37"+
        "\uffff\1\53\1\54\1\uffff\1\61\34\uffff\1\52\26\uffff\1\45\11\uffff"+
        "\1\56\1\63\4\uffff\1\6\14\uffff\1\16\11\uffff\1\30\1\31\1\57\11"+
        "\uffff\1\12\6\uffff\1\46\3\uffff\1\17\12\uffff\1\22\3\uffff\1\33"+
        "\6\uffff\1\34\22\uffff\1\26\6\uffff\1\36\6\uffff\1\5\15\uffff\1"+
        "\47\4\uffff\1\21\3\uffff\1\7\5\uffff\1\11\1\27\14\uffff\1\13\4\uffff"+
        "\1\51\10\uffff\1\37\2\uffff\1\4\1\uffff\1\23\4\uffff\1\15\22\uffff"+
        "\1\25\1\10\6\uffff\1\35\1\20\1\43\2\uffff\1\50\1\uffff\1\14\2\uffff"+
        "\1\42\1\24\5\uffff\1\44\1\uffff\1\41\3\uffff\1\40";
    static final String DFA15_specialS =
        "\1\4\40\uffff\1\2\1\1\51\uffff\1\5\1\3\44\uffff\1\6\1\uffff\1\7"+
        "\1\0\42\uffff\1\10\u0183\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\31\1\41\4\44\1\42\1\1\1"+
            "\2\1\35\1\32\1\44\1\27\1\44\1\36\12\40\1\3\1\44\1\35\1\44\2"+
            "\35\1\44\1\11\1\33\1\13\1\14\1\5\1\12\2\33\1\4\3\33\1\16\1\30"+
            "\1\15\1\7\1\33\1\10\1\33\1\17\1\6\5\33\1\35\1\44\1\35\1\37\1"+
            "\34\1\44\1\23\1\34\1\24\2\34\1\22\6\34\1\25\2\34\1\20\2\34\1"+
            "\21\1\26\6\34\uff85\44",
            "",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\14\53\1\50\1\51\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\27\53\1\56\2\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\22\53\1\57\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\1\60\20\53\1\61\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\4\53\1\62\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\15"+
            "\53\1\65\14\53\4\uffff\1\53\1\uffff\13\53\1\63\1\53\1\64\14"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\10\53\1\66\10\53\1\70\2\53\1\67\5\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\1\71\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\4\53\1\72\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\21"+
            "\53\1\74\10\53\4\uffff\1\53\1\uffff\25\53\1\73\4\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\16\53\1\75\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\10\53\1\76\17\53\1\77\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\100\2\53\1\101\5\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\102\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\103\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\53\1\104\30\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\105\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\106\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\107\10\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\16"+
            "\53\1\111\13\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\1\52\4\uffff\1\55\1\uffff\32"+
            "\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\32\53",
            "",
            "\1\114\4\uffff\1\115",
            "\32\116\4\uffff\1\116\1\uffff\32\116",
            "",
            "\0\120",
            "\0\120",
            "",
            "",
            "",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\122\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\123\7\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\32\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\55\5\uffff\1\55\1\uffff\32\55\4"+
            "\uffff\1\55\1\uffff\32\55",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\124\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\125\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\126\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\127\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\131\1\130\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\132\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\133\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\3\53\1"+
            "\134\26\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\135\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\136\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\137\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\24\53\1\140\5\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\141\27\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\142\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\144\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\145\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\146\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\147\5\53\1\150\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\53\1\151\30\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\152\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\154\10\53\1\153\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\155\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\156\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\157\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\160\1\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\161\6\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\52\163\1\162\3\163\14\164\5\163\1\164\1\163\32\164\4\163"+
            "\1\164\1\163\32\164\uff85\163",
            "\52\166\1\165\3\166\14\165\5\166\1\165\1\166\32\165\4\166"+
            "\1\165\1\166\32\165\uff85\166",
            "",
            "",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\167\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\170\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\171\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\172\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\173\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\11\53\1\174\20\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\24\53\1\175\5\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\176\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\3\53\1"+
            "\u0081\1\u0080\3\53\1\177\21\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\u0082\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u0084\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u0085\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0086\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\6\53\1\u0087\23\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u0088\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u0089\10\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u008a\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u008b\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u008c\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\25\53\1\u008d\4\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u008e\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u008f\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u0090\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u0091\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u0092\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u0093\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u0094\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\7\53\1\u0095\22\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\u0096\27\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\52\163\1\162\3\163\1\164\1\u0098\12\164\5\163\1\164\1\163"+
            "\32\164\4\163\1\164\1\163\32\164\uff85\163",
            "",
            "\52\163\1\162\3\163\14\164\5\163\1\164\1\163\32\164\4\163"+
            "\1\164\1\163\32\164\uff85\163",
            "\52\166\1\165\3\166\14\165\5\166\1\165\1\166\32\165\4\166"+
            "\1\165\1\166\32\165\uff85\166",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0099\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u009a\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u009b\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\5\53\1"+
            "\u009e\6\53\1\u009d\6\53\1\u009c\6\53\4\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u009f\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00a0\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u00a1\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\24\53\1\u00a2\5\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u00a3\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\27\53\1\u00a4\2\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00a5\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00a6\6\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u00a7\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\u00a9\6\53\4\uffff\1\53\1\uffff\30\53\1\u00a8\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u00aa\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\7\53\1\u00ab\22\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u00ac\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u00ad\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\5\53\1\u00ae\24\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u00af\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u00b1\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00b2\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u00b3\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u00b4\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u00b5\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u00b6\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u00b7\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u00b8\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\u00b9\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u00ba\31\53",
            "",
            "\52\163\1\162\3\163\14\164\5\163\1\164\1\163\32\164\4\163"+
            "\1\164\1\163\32\164\uff85\163",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u00bb\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u00bc\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u00bd\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u00be\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00bf\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u00c0\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00c1\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\u00c2\27\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u00c3\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u00c4\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u00c5\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00c6\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\u00c7\27\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u00c8\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\u00c9\6\53\4\uffff\1\53\1\uffff\22\53\1\u00ca\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\20\53\1"+
            "\u00cb\11\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00cc\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u00cd\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00ce\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u00cf\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u00d0\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u00d1\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00d2\6\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00d3\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\u00d4\27\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\u00d5\27\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\u00d6\27\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u00d9\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u00db\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00dc\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00dd\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\u00de\27\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00df\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u00e0\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00e1\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00e2\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00e3\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00e4\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\u00e5\1\53\1\u00e6\4\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\u00e7\27\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u00e8\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00e9\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u00ea\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00eb\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u00ec\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\21\53\1"+
            "\u00ed\4\53\1\u00ee\3\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\24\53\1\u00ef\5\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\27\53\1\u00f0\2\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u00f1\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\u00f2\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00f3\3\53\1\u00f4\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u00f5\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00f6\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u00f7\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u00f8\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u00f9\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\u00fc\27\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\2\53\1\u00fe\27\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u00ff\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0100\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u0101\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0102\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\7\53\1\u0103\22\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u0104\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0105\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\15\53\1"+
            "\u0106\14\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u0107\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u0108\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0109\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u010a\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u010b\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u010c\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u010d\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u010e\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u010f\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u0110\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u0111\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u0112\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u0113\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u0114\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u0115\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u0116\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u0117\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u0118\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u0119\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u011b\25\53",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u011c\6\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\7\53\1\u011d\22\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u011e\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\u011f\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\u0120\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u0121\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\u0122\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u0123\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u0124\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u0125\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u0126\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u0127\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\17\53\1"+
            "\u0128\12\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u0129\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u012a\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u012b\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\u012c\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u012d\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u012e\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u012f\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u0130\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\15\53\1"+
            "\u0132\14\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u0133\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\5\53\1"+
            "\u0134\6\53\1\u0135\15\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\6\53\1\u0136\23\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0137\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u0138\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u0139\12\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u013a\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u013d\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\5\53\1\u013e\24\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u013f\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\10\53\1\u0140\21\53\1\54\1\uffff\1\54\1\uffff\1"+
            "\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u0142\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u0143\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\2\53\1"+
            "\u0145\20\53\1\u0144\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u0146\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0147\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u0148\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u0149\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u014a\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u014b\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u014c\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u014d\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u014f\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u0150\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u0151\21\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u0152\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0153\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u0154\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0155\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\u0156\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u0157\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u015b\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\u015c\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u015d\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u015e\14\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u015f\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\10\53\1"+
            "\u0160\21\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u0161\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\u0162\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0163\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u0165\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u0166\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u0167\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u0168\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u0169\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u016a\7\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u016c\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\5\53\1\u016d\24\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u016e\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0170\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u0171\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u0172\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\14\53\1"+
            "\u0173\15\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\u0174\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u0175\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0176\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\5\53\1"+
            "\u0178\15\53\1\u0177\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\10\53\1\u0179\21\53\1\54\1\uffff\1\54\1\uffff\1"+
            "\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u017b\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u017c\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\24\53\1\u017d\5\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\53\1\u017f\30\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\7\53\1\u0180\22\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u0181\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\u0182\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\5\53\1"+
            "\u0184\6\53\1\u0183\15\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0186\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u0187\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0188\25\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u0189\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\7\53\1\u018a\22\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u018b\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u018c\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u018d\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u018e\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u018f\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u0190\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u0191\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u0192\14\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\5\53\1"+
            "\u0193\15\53\1\u0194\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0195\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u0196\14\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u0197\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0199\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u019a\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u019b\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u019c\21\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u019d\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u019e\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u01a0\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\u01a1\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01a2\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u01a3\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u01a4\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01a5\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u01a7\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u01a8\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\5\53\1"+
            "\u01aa\15\53\1\u01a9\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u01ab\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u01ac\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u01ad\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u01ae\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01af\25\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u01b0\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u01b1\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\23\53\1\u01b2\6\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01b3\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u01b5\26\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\15\53\1"+
            "\u01b7\5\53\1\u01b6\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u01b8\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\7\53\1\u01ba\22\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01bb\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u01bc\7\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u01be\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u01bf\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u01c0\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u01c1\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u01c2\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\4\53\1"+
            "\u01c5\25\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\23\53\1"+
            "\u01c6\6\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01c7\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\7\53\1\u01c8\22\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u01c9\16\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\15\53\1"+
            "\u01ca\14\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u01cb\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u01cc\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\15\53\1"+
            "\u01ce\14\53\4\uffff\1\53\1\uffff\22\53\1\u01cd\7\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\u01cf\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u01d0\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u01d2\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u01d3\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u01d4\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u01d5\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01d7\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u01d8\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u01d9\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\u01da\13\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u01db\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u01dc\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u01dd\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u01de\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u01e0\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u01e1\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u01e3\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u01e5\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u01e6\16\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\27\53\1\u01e7\2\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u01e8\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\3\53\1\u01ea\26\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\15\53\1"+
            "\u01eb\14\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u01ec\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01ed\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01ee\25\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u01ef\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u01f0\7\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u01f1\1\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u01f2\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u01f3\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\17\53\1\u01f4\12\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01f5\25\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\15\53\1"+
            "\u01f6\14\53\4\uffff\1\53\1\uffff\32\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u01f7\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01f8\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u01f9\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u01fa\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u01fb\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\13\53\1\u01fe\16\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u01ff\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\21\53\1\u0200\10\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u0201\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\1\u0202\31\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u0203\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u0207\7\53",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\30\53\1\u0208\1\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u020a\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\14\53\1\u020c\15\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u020d\25\53",
            "",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u0210\7\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\4\53\1\u0211\25\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u0212\7\53",
            "",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u0213\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u0214\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\10\53\1\u0216\21\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\16\53\1\u0218\13\53",
            "",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\15\53\1\u0219\14\53",
            "\1\55\3\uffff\1\55\1\52\12\53\5\uffff\1\55\1\uffff\32\53\4"+
            "\uffff\1\53\1\uffff\22\53\1\u021a\7\53",
            "\1\55\3\uffff\1\55\1\52\12\53\2\uffff\1\54\1\uffff\1\54\1"+
            "\55\1\uffff\32\53\1\54\1\uffff\1\54\1\uffff\1\53\1\uffff\32"+
            "\53",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_NAMEWITHWC | RULE_PATHWITHWC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_117 = input.LA(1);

                        s = -1;
                        if ( (LA15_117=='*'||(LA15_117>='.' && LA15_117<='9')||LA15_117=='?'||(LA15_117>='A' && LA15_117<='Z')||LA15_117=='_'||(LA15_117>='a' && LA15_117<='z')) ) {s = 117;}

                        else if ( ((LA15_117>='\u0000' && LA15_117<=')')||(LA15_117>='+' && LA15_117<='-')||(LA15_117>=':' && LA15_117<='>')||LA15_117=='@'||(LA15_117>='[' && LA15_117<='^')||LA15_117=='`'||(LA15_117>='{' && LA15_117<='\uFFFF')) ) {s = 118;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_34 = input.LA(1);

                        s = -1;
                        if ( ((LA15_34>='\u0000' && LA15_34<='\uFFFF')) ) {s = 80;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_33 = input.LA(1);

                        s = -1;
                        if ( ((LA15_33>='\u0000' && LA15_33<='\uFFFF')) ) {s = 80;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_77 = input.LA(1);

                        s = -1;
                        if ( (LA15_77=='*'||(LA15_77>='.' && LA15_77<='9')||LA15_77=='?'||(LA15_77>='A' && LA15_77<='Z')||LA15_77=='_'||(LA15_77>='a' && LA15_77<='z')) ) {s = 117;}

                        else if ( ((LA15_77>='\u0000' && LA15_77<=')')||(LA15_77>='+' && LA15_77<='-')||(LA15_77>=':' && LA15_77<='>')||LA15_77=='@'||(LA15_77>='[' && LA15_77<='^')||LA15_77=='`'||(LA15_77>='{' && LA15_77<='\uFFFF')) ) {s = 118;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='(') ) {s = 1;}

                        else if ( (LA15_0==')') ) {s = 2;}

                        else if ( (LA15_0==':') ) {s = 3;}

                        else if ( (LA15_0=='I') ) {s = 4;}

                        else if ( (LA15_0=='E') ) {s = 5;}

                        else if ( (LA15_0=='U') ) {s = 6;}

                        else if ( (LA15_0=='P') ) {s = 7;}

                        else if ( (LA15_0=='R') ) {s = 8;}

                        else if ( (LA15_0=='A') ) {s = 9;}

                        else if ( (LA15_0=='F') ) {s = 10;}

                        else if ( (LA15_0=='C') ) {s = 11;}

                        else if ( (LA15_0=='D') ) {s = 12;}

                        else if ( (LA15_0=='O') ) {s = 13;}

                        else if ( (LA15_0=='M') ) {s = 14;}

                        else if ( (LA15_0=='T') ) {s = 15;}

                        else if ( (LA15_0=='p') ) {s = 16;}

                        else if ( (LA15_0=='s') ) {s = 17;}

                        else if ( (LA15_0=='f') ) {s = 18;}

                        else if ( (LA15_0=='a') ) {s = 19;}

                        else if ( (LA15_0=='c') ) {s = 20;}

                        else if ( (LA15_0=='m') ) {s = 21;}

                        else if ( (LA15_0=='t') ) {s = 22;}

                        else if ( (LA15_0=='-') ) {s = 23;}

                        else if ( (LA15_0=='N') ) {s = 24;}

                        else if ( (LA15_0=='!') ) {s = 25;}

                        else if ( (LA15_0=='+') ) {s = 26;}

                        else if ( (LA15_0=='B'||(LA15_0>='G' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='L')||LA15_0=='Q'||LA15_0=='S'||(LA15_0>='V' && LA15_0<='Z')) ) {s = 27;}

                        else if ( (LA15_0=='_'||LA15_0=='b'||(LA15_0>='d' && LA15_0<='e')||(LA15_0>='g' && LA15_0<='l')||(LA15_0>='n' && LA15_0<='o')||(LA15_0>='q' && LA15_0<='r')||(LA15_0>='u' && LA15_0<='z')) ) {s = 28;}

                        else if ( (LA15_0=='*'||LA15_0=='<'||(LA15_0>='>' && LA15_0<='?')||LA15_0=='['||LA15_0==']') ) {s = 29;}

                        else if ( (LA15_0=='/') ) {s = 30;}

                        else if ( (LA15_0=='^') ) {s = 31;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 32;}

                        else if ( (LA15_0=='\"') ) {s = 33;}

                        else if ( (LA15_0=='\'') ) {s = 34;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 35;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='&')||LA15_0==','||LA15_0=='.'||LA15_0==';'||LA15_0=='='||LA15_0=='@'||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_76 = input.LA(1);

                        s = -1;
                        if ( (LA15_76=='*') ) {s = 114;}

                        else if ( ((LA15_76>='\u0000' && LA15_76<=')')||(LA15_76>='+' && LA15_76<='-')||(LA15_76>=':' && LA15_76<='>')||LA15_76=='@'||(LA15_76>='[' && LA15_76<='^')||LA15_76=='`'||(LA15_76>='{' && LA15_76<='\uFFFF')) ) {s = 115;}

                        else if ( ((LA15_76>='.' && LA15_76<='9')||LA15_76=='?'||(LA15_76>='A' && LA15_76<='Z')||LA15_76=='_'||(LA15_76>='a' && LA15_76<='z')) ) {s = 116;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_114 = input.LA(1);

                        s = -1;
                        if ( (LA15_114=='/') ) {s = 152;}

                        else if ( (LA15_114=='*') ) {s = 114;}

                        else if ( (LA15_114=='.'||(LA15_114>='0' && LA15_114<='9')||LA15_114=='?'||(LA15_114>='A' && LA15_114<='Z')||LA15_114=='_'||(LA15_114>='a' && LA15_114<='z')) ) {s = 116;}

                        else if ( ((LA15_114>='\u0000' && LA15_114<=')')||(LA15_114>='+' && LA15_114<='-')||(LA15_114>=':' && LA15_114<='>')||LA15_114=='@'||(LA15_114>='[' && LA15_114<='^')||LA15_114=='`'||(LA15_114>='{' && LA15_114<='\uFFFF')) ) {s = 115;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_116 = input.LA(1);

                        s = -1;
                        if ( (LA15_116=='*') ) {s = 114;}

                        else if ( ((LA15_116>='.' && LA15_116<='9')||LA15_116=='?'||(LA15_116>='A' && LA15_116<='Z')||LA15_116=='_'||(LA15_116>='a' && LA15_116<='z')) ) {s = 116;}

                        else if ( ((LA15_116>='\u0000' && LA15_116<=')')||(LA15_116>='+' && LA15_116<='-')||(LA15_116>=':' && LA15_116<='>')||LA15_116=='@'||(LA15_116>='[' && LA15_116<='^')||LA15_116=='`'||(LA15_116>='{' && LA15_116<='\uFFFF')) ) {s = 115;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_152 = input.LA(1);

                        s = -1;
                        if ( (LA15_152=='*') ) {s = 114;}

                        else if ( ((LA15_152>='.' && LA15_152<='9')||LA15_152=='?'||(LA15_152>='A' && LA15_152<='Z')||LA15_152=='_'||(LA15_152>='a' && LA15_152<='z')) ) {s = 116;}

                        else if ( ((LA15_152>='\u0000' && LA15_152<=')')||(LA15_152>='+' && LA15_152<='-')||(LA15_152>=':' && LA15_152<='>')||LA15_152=='@'||(LA15_152>='[' && LA15_152<='^')||LA15_152=='`'||(LA15_152>='{' && LA15_152<='\uFFFF')) ) {s = 115;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}