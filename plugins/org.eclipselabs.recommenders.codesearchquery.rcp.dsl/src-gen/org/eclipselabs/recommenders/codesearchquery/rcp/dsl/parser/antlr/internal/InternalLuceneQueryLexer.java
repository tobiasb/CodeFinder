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
    public static final int RULE_ID=8;
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
    public static final int RULE_ANY_OTHER=13;
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
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=6;
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
    public static final int RULE_PATHWITHWC=7;
    public static final int RULE_NAMEWITHWC=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_BOOST=4;
    public static final int RULE_WS=12;

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

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:14:7: ( 'FullyQualifiedName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:14:9: 'FullyQualifiedName'
            {
            match("FullyQualifiedName"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:15:7: ( 'FriendlyName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:15:9: 'FriendlyName'
            {
            match("FriendlyName"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:16:7: ( 'DeclaredMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:16:9: 'DeclaredMethods'
            {
            match("DeclaredMethods"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:17:7: ( 'ReturnVariableEexpressions' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:17:9: 'ReturnVariableEexpressions'
            {
            match("ReturnVariableEexpressions"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:18:7: ( 'AllDeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:18:9: 'AllDeclaredMethodNames'
            {
            match("AllDeclaredMethodNames"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:19:7: ( 'DeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:19:9: 'DeclaredMethodNames'
            {
            match("DeclaredMethodNames"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:20:7: ( 'DeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:20:9: 'DeclaredFieldNames'
            {
            match("DeclaredFieldNames"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:21:7: ( 'AllDeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:21:9: 'AllDeclaredFieldNames'
            {
            match("AllDeclaredFieldNames"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:22:7: ( 'FullText' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:22:9: 'FullText'
            {
            match("FullText"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:23:7: ( 'FieldsRead' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:23:9: 'FieldsRead'
            {
            match("FieldsRead"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:24:7: ( 'FieldsWritten' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:24:9: 'FieldsWritten'
            {
            match("FieldsWritten"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:25:7: ( 'UsedFieldsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:25:9: 'UsedFieldsInFinally'
            {
            match("UsedFieldsInFinally"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:26:7: ( 'UsedFieldsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:26:9: 'UsedFieldsInTry'
            {
            match("UsedFieldsInTry"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:27:7: ( 'ImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:27:9: 'ImplementedTypes'
            {
            match("ImplementedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:28:7: ( 'ExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:28:9: 'ExtendedTypes'
            {
            match("ExtendedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:29:7: ( 'UsedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:29:9: 'UsedTypes'
            {
            match("UsedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:30:7: ( 'UsedTypesInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:30:9: 'UsedTypesInTry'
            {
            match("UsedTypesInTry"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:31:7: ( 'UsedTypesInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:31:9: 'UsedTypesInFinally'
            {
            match("UsedTypesInFinally"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:32:7: ( 'ParameterTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:32:9: 'ParameterTypes'
            {
            match("ParameterTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:33:7: ( 'ReturnType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:33:9: 'ReturnType'
            {
            match("ReturnType"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:34:7: ( 'InstanceofTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:34:9: 'InstanceofTypes'
            {
            match("InstanceofTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:35:7: ( 'AllImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:35:9: 'AllImplementedTypes'
            {
            match("AllImplementedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:36:7: ( 'AllExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:36:9: 'AllExtendedTypes'
            {
            match("AllExtendedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:37:7: ( 'FieldType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:37:9: 'FieldType'
            {
            match("FieldType"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:38:7: ( 'CaughtType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:38:9: 'CaughtType'
            {
            match("CaughtType"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:39:7: ( 'DeclaredFieldTypes' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:39:9: 'DeclaredFieldTypes'
            {
            match("DeclaredFieldTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:40:7: ( 'DeclaringType' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:40:9: 'DeclaringType'
            {
            match("DeclaringType"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:41:7: ( 'UsedMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:41:9: 'UsedMethods'
            {
            match("UsedMethods"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:42:7: ( 'UsedMethodsInTry' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:42:9: 'UsedMethodsInTry'
            {
            match("UsedMethodsInTry"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:43:7: ( 'UsedMethodsInFinally' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:43:9: 'UsedMethodsInFinally'
            {
            match("UsedMethodsInFinally"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:44:7: ( 'OverriddenMethods' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:44:9: 'OverriddenMethods'
            {
            match("OverriddenMethods"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:45:7: ( 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:45:9: 'ResourcePath'
            {
            match("ResourcePath"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:46:7: ( 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:46:9: 'ParameterCount'
            {
            match("ParameterCount"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:47:7: ( 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:47:9: 'Modifiers'
            {
            match("Modifiers"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:48:7: ( 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:48:9: 'Timestamp'
            {
            match("Timestamp"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:49:7: ( 'Type' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:49:9: 'Type'
            {
            match("Type"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:50:7: ( 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:50:9: 'ProjectName'
            {
            match("ProjectName"); 


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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:51:7: ( 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:51:9: 'Annotations'
            {
            match("Annotations"); 


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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:68:7: ( '||' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:68:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "RULE_BOOST"
    public final void mRULE_BOOST() throws RecognitionException {
        try {
            int _type = RULE_BOOST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2314:12: ( '^' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2314:14: '^' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            match('^'); 
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2314:18: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2314:19: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2314:30: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2314:31: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2314:35: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2314:36: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


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
    // $ANTLR end "RULE_BOOST"

    // $ANTLR start "RULE_NAMEWITHWC"
    public final void mRULE_NAMEWITHWC() throws RecognitionException {
        try {
            int _type = RULE_NAMEWITHWC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2316:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2316:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )*
            {
            if ( input.LA(1)=='*'||input.LA(1)=='<'||(input.LA(1)>='>' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2316:67: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*'||LA4_0=='.'||(LA4_0>='0' && LA4_0<='9')||LA4_0=='<'||(LA4_0>='>' && LA4_0<='?')||(LA4_0>='A' && LA4_0<='[')||LA4_0==']'||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2318:17: ( ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2318:19: ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )*
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2318:19: ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='A' && LA5_0<='Z')) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==':') ) {
                    alt5=1;
                }
                else {
                    alt5=2;}
            }
            else if ( (LA5_0=='/'||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2318:20: 'A' .. 'Z' ':'
                    {
                    matchRange('A','Z'); 
                    match(':'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2318:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' )
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

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2318:62: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*'||(LA6_0>='.' && LA6_0<='9')||LA6_0=='?'||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2320:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2320:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2320:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2320:11: '^'
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

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2320:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    break loop8;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2322:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2322:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2322:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2322:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2324:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2326:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2326:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2326:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2326:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2328:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2328:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2328:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2328:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2328:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2328:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2328:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2328:41: '\\r'
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2330:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2330:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2330:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2332:16: ( . )
            // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:2332:18: .
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
        // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_BOOST | RULE_NAMEWITHWC | RULE_PATHWITHWC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=68;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:358: RULE_BOOST
                {
                mRULE_BOOST(); 

                }
                break;
            case 60 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:369: RULE_NAMEWITHWC
                {
                mRULE_NAMEWITHWC(); 

                }
                break;
            case 61 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:385: RULE_PATHWITHWC
                {
                mRULE_PATHWITHWC(); 

                }
                break;
            case 62 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:401: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 63 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:409: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 64 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:418: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 65 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:430: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 66 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:446: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 67 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:462: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 68 :
                // ../org.eclipselabs.recommenders.codesearchquery.rcp.dsl/src-gen/org/eclipselabs/recommenders/codesearchquery/rcp/dsl/parser/antlr/internal/InternalLuceneQuery.g:1:470: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\4\uffff\23\55\1\uffff\1\55\2\uffff\2\45\2\55\1\uffff\1\54\1\uffff"+
        "\2\45\5\uffff\3\55\2\uffff\17\55\1\146\13\55\1\uffff\1\55\5\uffff"+
        "\2\54\3\uffff\10\55\1\u0084\10\55\1\uffff\15\55\1\u009a\1\54\1\uffff"+
        "\2\54\1\uffff\12\55\1\uffff\12\55\1\u00b3\12\55\1\uffff\1\54\27"+
        "\55\1\uffff\4\55\1\u00da\1\u00db\1\55\1\u00dd\34\55\1\u00fd\1\u00fe"+
        "\2\uffff\1\55\1\uffff\1\u0100\34\55\1\u011d\1\55\2\uffff\1\55\1"+
        "\uffff\2\55\1\u0122\31\55\1\uffff\1\55\1\u013e\1\u013f\1\55\1\uffff"+
        "\3\55\1\u0144\13\55\1\u0151\10\55\1\u015b\1\u015c\1\u015d\2\uffff"+
        "\2\55\1\u0160\1\55\1\uffff\4\55\1\u0166\7\55\1\uffff\7\55\1\u0175"+
        "\1\55\3\uffff\2\55\1\uffff\5\55\1\uffff\4\55\1\u0183\2\55\1\u0188"+
        "\5\55\1\u018e\1\uffff\2\55\1\u0191\5\55\1\u0197\4\55\1\uffff\4\55"+
        "\1\uffff\5\55\1\uffff\2\55\1\uffff\1\u01a8\2\55\1\u01ac\1\55\1\uffff"+
        "\13\55\1\u01ba\4\55\1\uffff\3\55\1\uffff\7\55\1\u01ca\5\55\1\uffff"+
        "\1\u01d0\1\u01d1\2\55\1\u01d4\11\55\1\u01de\1\uffff\4\55\1\u01e3"+
        "\2\uffff\2\55\1\uffff\7\55\1\u01ed\1\55\1\uffff\1\55\1\u01f0\1\55"+
        "\1\u01f2\1\uffff\11\55\1\uffff\2\55\1\uffff\1\55\1\uffff\1\u01ff"+
        "\1\u0200\1\55\1\u0202\1\u0203\5\55\1\u0209\1\55\2\uffff\1\u020b"+
        "\2\uffff\3\55\1\u020f\1\u0210\1\uffff\1\55\1\uffff\3\55\2\uffff"+
        "\1\u0215\2\55\1\u0218\1\uffff\1\55\1\u021a\1\uffff\1\55\1\uffff"+
        "\2\55\1\u021e\1\uffff";
    static final String DFA18_eofS =
        "\u021f\uffff";
    static final String DFA18_minS =
        "\1\0\3\uffff\23\52\1\uffff\1\52\2\uffff\1\174\1\60\2\52\1\uffff"+
        "\1\52\1\uffff\2\0\5\uffff\3\52\2\uffff\33\52\1\uffff\1\52\5\uffff"+
        "\2\0\3\uffff\21\52\1\uffff\16\52\1\0\1\uffff\2\0\1\uffff\12\52\1"+
        "\uffff\25\52\1\uffff\1\0\27\52\1\uffff\46\52\2\uffff\1\52\1\uffff"+
        "\37\52\2\uffff\1\52\1\uffff\34\52\1\uffff\4\52\1\uffff\33\52\2\uffff"+
        "\4\52\1\uffff\14\52\1\uffff\11\52\3\uffff\2\52\1\uffff\5\52\1\uffff"+
        "\16\52\1\uffff\15\52\1\uffff\4\52\1\uffff\5\52\1\uffff\2\52\1\uffff"+
        "\5\52\1\uffff\20\52\1\uffff\3\52\1\uffff\15\52\1\uffff\17\52\1\uffff"+
        "\5\52\2\uffff\2\52\1\uffff\11\52\1\uffff\4\52\1\uffff\11\52\1\uffff"+
        "\2\52\1\uffff\1\52\1\uffff\14\52\2\uffff\1\52\2\uffff\5\52\1\uffff"+
        "\1\52\1\uffff\3\52\2\uffff\4\52\1\uffff\2\52\1\uffff\1\52\1\uffff"+
        "\3\52\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\3\uffff\23\172\1\uffff\1\172\2\uffff\1\174\3\172\1\uffff"+
        "\1\57\1\uffff\2\uffff\5\uffff\3\172\2\uffff\33\172\1\uffff\1\172"+
        "\5\uffff\2\uffff\3\uffff\21\172\1\uffff\16\172\1\uffff\1\uffff\2"+
        "\uffff\1\uffff\12\172\1\uffff\25\172\1\uffff\1\uffff\27\172\1\uffff"+
        "\46\172\2\uffff\1\172\1\uffff\37\172\2\uffff\1\172\1\uffff\34\172"+
        "\1\uffff\4\172\1\uffff\33\172\2\uffff\4\172\1\uffff\14\172\1\uffff"+
        "\11\172\3\uffff\2\172\1\uffff\5\172\1\uffff\16\172\1\uffff\15\172"+
        "\1\uffff\4\172\1\uffff\5\172\1\uffff\2\172\1\uffff\5\172\1\uffff"+
        "\20\172\1\uffff\3\172\1\uffff\15\172\1\uffff\17\172\1\uffff\5\172"+
        "\2\uffff\2\172\1\uffff\11\172\1\uffff\4\172\1\uffff\11\172\1\uffff"+
        "\2\172\1\uffff\1\172\1\uffff\14\172\2\uffff\1\172\2\uffff\5\172"+
        "\1\uffff\1\172\1\uffff\3\172\2\uffff\4\172\1\uffff\2\172\1\uffff"+
        "\1\172\1\uffff\3\172\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\23\uffff\1\64\1\uffff\1\66\1\67\4\uffff\1"+
        "\74\1\uffff\1\77\2\uffff\1\103\1\104\1\1\1\2\1\3\3\uffff\1\75\1"+
        "\74\33\uffff\1\64\1\uffff\1\66\1\67\1\72\1\73\1\76\2\uffff\1\77"+
        "\1\100\1\103\21\uffff\1\71\17\uffff\1\101\2\uffff\1\102\12\uffff"+
        "\1\70\25\uffff\1\65\30\uffff\1\47\46\uffff\1\55\1\62\1\uffff\1\60"+
        "\37\uffff\1\53\1\54\1\uffff\1\61\34\uffff\1\52\4\uffff\1\14\33\uffff"+
        "\1\56\1\63\4\uffff\1\33\14\uffff\1\23\11\uffff\1\45\1\46\1\57\2"+
        "\uffff\1\15\5\uffff\1\27\16\uffff\1\34\15\uffff\1\51\4\uffff\1\37"+
        "\5\uffff\1\50\2\uffff\1\5\5\uffff\1\43\20\uffff\1\16\3\uffff\1\36"+
        "\15\uffff\1\22\17\uffff\1\24\5\uffff\1\26\1\44\2\uffff\1\6\11\uffff"+
        "\1\20\4\uffff\1\30\11\uffff\1\32\2\uffff\1\40\1\uffff\1\21\14\uffff"+
        "\1\42\1\4\1\uffff\1\12\1\35\5\uffff\1\25\1\uffff\1\11\3\uffff\1"+
        "\31\1\17\4\uffff\1\41\2\uffff\1\13\1\uffff\1\10\3\uffff\1\7";
    static final String DFA18_specialS =
        "\1\3\41\uffff\1\7\1\5\54\uffff\1\2\1\4\43\uffff\1\1\1\uffff\1\0"+
        "\1\10\42\uffff\1\6\u0183\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\31\1\42\4\45\1\43\1\1\1"+
            "\2\1\37\1\32\1\45\1\27\1\45\1\40\12\41\1\3\1\45\1\37\1\45\2"+
            "\37\1\45\1\7\1\35\1\14\1\5\1\12\1\4\2\35\1\11\3\35\1\16\1\30"+
            "\1\15\1\13\1\35\1\6\1\35\1\17\1\10\5\35\1\37\1\45\1\37\1\34"+
            "\1\36\1\45\1\23\1\36\1\24\2\36\1\22\6\36\1\25\2\36\1\20\2\36"+
            "\1\21\1\26\6\36\1\45\1\33\uff83\45",
            "",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\10\56\1\53\10\56\1\52\2\56\1\51\5\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\4\56\1\60\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\4\56\1\61\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\15"+
            "\56\1\64\14\56\4\uffff\1\56\1\uffff\13\56\1\62\1\56\1\63\14"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\22\56\1\65\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\14\56\1\66\1\67\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\27\56\1\70\2\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\1\71\20\56\1\72\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\1\73\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\21"+
            "\56\1\75\10\56\4\uffff\1\56\1\uffff\25\56\1\74\4\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\16\56\1\76\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\10\56\1\77\17\56\1\100\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\101\2\56\1\102\5\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\103\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\104\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\56\1\105\30\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\106\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\107\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\110\10\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\16"+
            "\56\1\112\13\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\115",
            "\12\116\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\57\3\uffff\1\57\1\54\12\56\1\54\4\uffff\1\57\1\uffff\32"+
            "\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\32\56",
            "",
            "\1\120\4\uffff\1\121",
            "",
            "\0\123",
            "\0\123",
            "",
            "",
            "",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\125\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\126\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\127\25\56",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\57\5\uffff\1\57\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\32\57",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\130\27\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\132\1\131\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\133\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\134\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\3\56\1"+
            "\135\26\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\136\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\137\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\140\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\141\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\142\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\143\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\24\56\1\144\5\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\145\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\147\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\150\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\151\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\152\5\56\1\153\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\56\1\154\30\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\155\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\157\10\56\1\156\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\160\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\161\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\162\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\163\1\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\164\6\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "\52\166\1\165\3\166\14\167\5\166\1\167\1\166\32\167\4\166"+
            "\1\167\1\166\32\167\uff85\166",
            "\52\171\1\170\3\171\14\170\5\171\1\170\1\171\32\170\4\171"+
            "\1\170\1\171\32\170\uff85\171",
            "",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\172\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\173\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\174\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\175\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\24\56\1\176\5\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\177\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\3\56\1"+
            "\u0080\1\u0082\3\56\1\u0081\21\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\u0083\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u0085\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u0086\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0087\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0088\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u0089\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\11\56\1\u008a\20\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\6\56\1\u008b\23\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u008c\10\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u008d\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u008e\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u008f\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\25\56\1\u0090\4\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0091\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u0092\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0093\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u0094\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u0095\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0096\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u0097\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\7\56\1\u0098\22\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\u0099\27\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\52\166\1\165\3\166\1\167\1\u009b\12\167\5\166\1\167\1\166"+
            "\32\167\4\166\1\167\1\166\32\167\uff85\166",
            "",
            "\52\166\1\165\3\166\14\167\5\166\1\167\1\166\32\167\4\166"+
            "\1\167\1\166\32\167\uff85\166",
            "\52\171\1\170\3\171\14\170\5\171\1\170\1\171\32\170\4\171"+
            "\1\170\1\171\32\170\uff85\171",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\u009d\6\56\4\uffff\1\56\1\uffff\30\56\1\u009c\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u009e\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u009f\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u00a0\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u00a1\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\24\56\1\u00a2\5\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00a3\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u00a4\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\27\56\1\u00a5\2\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00a6\6\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\5\56\1"+
            "\u00a7\6\56\1\u00a9\6\56\1\u00a8\6\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00aa\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u00ab\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u00ac\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u00ad\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00ae\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\7\56\1\u00af\22\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u00b0\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\5\56\1\u00b1\24\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u00b2\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u00b4\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00b5\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u00b6\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u00b7\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u00b8\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u00b9\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u00ba\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u00bb\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\u00bc\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u00bd\31\56",
            "",
            "\52\166\1\165\3\166\14\167\5\166\1\167\1\166\32\167\4\166"+
            "\1\167\1\166\32\167\uff85\166",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\20\56\1"+
            "\u00be\11\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00bf\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u00c0\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\u00c2\6\56\4\uffff\1\56\1\uffff\22\56\1\u00c1\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u00c3\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u00c4\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u00c5\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\u00c6\27\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u00c7\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00c8\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u00c9\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u00ca\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u00cb\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00cc\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u00cd\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u00ce\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u00cf\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00d0\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\u00d1\27\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00d2\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u00d3\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u00d4\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00d5\6\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00d6\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\u00d7\27\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\u00d8\27\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\u00d9\27\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u00dc\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u00de\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00df\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\24\56\1\u00e0\5\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\27\56\1\u00e1\2\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u00e2\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\21\56\1"+
            "\u00e3\4\56\1\u00e4\3\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u00e5\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00e6\3\56\1\u00e7\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\u00e9\1\56\1\u00e8\4\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\u00ea\27\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u00eb\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u00ec\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00ed\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00ee\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00ef\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u00f0\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00f1\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00f2\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\u00f3\27\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00f4\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00f5\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00f6\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\u00f7\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u00f8\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00f9\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u00fa\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u00fb\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u00fc\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\u00ff\27\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\2\56\1\u0101\27\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u0102\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0103\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u0104\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0105\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u0106\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u0107\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u0108\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u0109\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u010a\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u010b\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u010c\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u010d\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u010e\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u010f\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u0110\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u0111\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0112\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\7\56\1\u0113\22\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u0114\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0115\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u0116\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0117\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\15\56\1"+
            "\u0118\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u0119\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u011a\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u011b\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u011c\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u011e\25\56",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u011f\6\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\7\56\1\u0120\22\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u0121\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\15\56\1"+
            "\u0123\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u0124\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u0125\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0126\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\5\56\1"+
            "\u0128\6\56\1\u0127\15\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\6\56\1\u0129\23\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u012a\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u012b\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\17\56\1"+
            "\u012c\12\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u012d\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u012e\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u012f\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\u0130\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u0131\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u0132\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\u0133\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0134\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\u0135\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\u0136\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u0137\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u0138\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u0139\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u013a\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u013b\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u013c\12\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u013d\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u0140\21\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u0141\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u0142\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0143\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0145\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u0146\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\u0147\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u0148\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0149\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u014a\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u014b\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u014c\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u014d\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u014e\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u014f\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\10\56\1\u0150\21\56\1\55\1\uffff\1\55\1\uffff\1"+
            "\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u0152\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0153\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\5\56\1\u0154\24\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u0155\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\2\56\1"+
            "\u0157\20\56\1\u0156\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u0158\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0159\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u015a\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\5\56\1\u015e\24\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u015f\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0161\6\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0162\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0163\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u0164\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u0165\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0167\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u0168\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u0169\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u016a\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u016b\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\10\56\1"+
            "\u016c\21\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u016d\14\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u016e\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u016f\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\u0170\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u0171\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u0172\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\u0173\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0174\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\14\56\1"+
            "\u0176\15\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u0177\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0178\25\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0179\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\7\56\1\u017a\22\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u017b\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u017c\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\56\1\u017d\30\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\7\56\1\u017e\22\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\5\56\1"+
            "\u0180\6\56\1\u017f\15\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u0181\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\u0182\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u0184\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\5\56\1"+
            "\u0186\15\56\1\u0185\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\10\56\1\u0187\21\56\1\55\1\uffff\1\55\1\uffff\1"+
            "\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\u0189\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u018a\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u018b\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u018c\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\24\56\1\u018d\5\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u018f\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0190\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u0192\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\u0193\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u0194\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0195\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u0196\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0198\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u0199\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u019a\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u019b\1\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\5\56\1"+
            "\u019c\15\56\1\u019d\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u019e\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u019f\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u01a0\14\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u01a1\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u01a2\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u01a3\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01a4\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u01a5\14\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u01a6\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u01a7\26\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u01a9\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\15\56\1"+
            "\u01aa\5\56\1\u01ab\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01ad\25\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u01ae\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01af\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u01b0\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u01b1\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u01b2\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u01b3\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u01b4\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u01b5\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\5\56\1"+
            "\u01b7\15\56\1\u01b6\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u01b8\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01b9\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u01bb\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\23\56\1\u01bc\6\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\7\56\1\u01bd\22\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\15\56\1"+
            "\u01be\14\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\15\56\1"+
            "\u01c0\14\56\4\uffff\1\56\1\uffff\22\56\1\u01bf\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u01c1\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u01c2\1\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\4\56\1"+
            "\u01c3\25\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\7\56\1\u01c4\22\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u01c5\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\23\56\1"+
            "\u01c6\6\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01c7\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u01c8\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u01c9\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u01cb\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u01cc\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u01cd\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01ce\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u01cf\7\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\u01d2\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u01d3\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u01d5\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u01d6\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u01d7\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01d8\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\u01d9\13\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u01da\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u01db\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u01dc\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u01dd\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u01df\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u01e0\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u01e1\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u01e2\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u01e4\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u01e5\15\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u01e6\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01e7\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01e8\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\27\56\1\u01e9\2\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\3\56\1\u01ea\26\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\15\56\1"+
            "\u01eb\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u01ec\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u01ee\16\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u01ef\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u01f1\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u01f3\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01f4\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01f5\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u01f6\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u01f7\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\17\56\1\u01f8\12\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\15\56\1"+
            "\u01f9\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u01fa\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u01fb\25\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u01fc\16\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u01fd\1\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u01fe\16\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u0201\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\21\56\1\u0204\10\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\1\u0205\31\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u0206\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u0207\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u0208\1\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\13\56\1\u020a\16\56",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u020c\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\14\56\1\u020d\15\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u020e\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\30\56\1\u0211\1\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u0212\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\4\56\1\u0213\25\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u0214\7\56",
            "",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u0216\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u0217\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\10\56\1\u0219\21\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\16\56\1\u021b\13\56",
            "",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\15\56\1\u021c\14\56",
            "\1\57\3\uffff\1\57\1\54\12\56\5\uffff\1\57\1\uffff\32\56\4"+
            "\uffff\1\56\1\uffff\22\56\1\u021d\7\56",
            "\1\57\3\uffff\1\57\1\54\12\56\2\uffff\1\55\1\uffff\1\55\1"+
            "\57\1\uffff\32\56\1\55\1\uffff\1\55\1\uffff\1\56\1\uffff\32"+
            "\56",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_BOOST | RULE_NAMEWITHWC | RULE_PATHWITHWC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_119 = input.LA(1);

                        s = -1;
                        if ( (LA18_119=='*') ) {s = 117;}

                        else if ( ((LA18_119>='.' && LA18_119<='9')||LA18_119=='?'||(LA18_119>='A' && LA18_119<='Z')||LA18_119=='_'||(LA18_119>='a' && LA18_119<='z')) ) {s = 119;}

                        else if ( ((LA18_119>='\u0000' && LA18_119<=')')||(LA18_119>='+' && LA18_119<='-')||(LA18_119>=':' && LA18_119<='>')||LA18_119=='@'||(LA18_119>='[' && LA18_119<='^')||LA18_119=='`'||(LA18_119>='{' && LA18_119<='\uFFFF')) ) {s = 118;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_117 = input.LA(1);

                        s = -1;
                        if ( (LA18_117=='/') ) {s = 155;}

                        else if ( (LA18_117=='*') ) {s = 117;}

                        else if ( (LA18_117=='.'||(LA18_117>='0' && LA18_117<='9')||LA18_117=='?'||(LA18_117>='A' && LA18_117<='Z')||LA18_117=='_'||(LA18_117>='a' && LA18_117<='z')) ) {s = 119;}

                        else if ( ((LA18_117>='\u0000' && LA18_117<=')')||(LA18_117>='+' && LA18_117<='-')||(LA18_117>=':' && LA18_117<='>')||LA18_117=='@'||(LA18_117>='[' && LA18_117<='^')||LA18_117=='`'||(LA18_117>='{' && LA18_117<='\uFFFF')) ) {s = 118;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_80 = input.LA(1);

                        s = -1;
                        if ( (LA18_80=='*') ) {s = 117;}

                        else if ( ((LA18_80>='\u0000' && LA18_80<=')')||(LA18_80>='+' && LA18_80<='-')||(LA18_80>=':' && LA18_80<='>')||LA18_80=='@'||(LA18_80>='[' && LA18_80<='^')||LA18_80=='`'||(LA18_80>='{' && LA18_80<='\uFFFF')) ) {s = 118;}

                        else if ( ((LA18_80>='.' && LA18_80<='9')||LA18_80=='?'||(LA18_80>='A' && LA18_80<='Z')||LA18_80=='_'||(LA18_80>='a' && LA18_80<='z')) ) {s = 119;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='(') ) {s = 1;}

                        else if ( (LA18_0==')') ) {s = 2;}

                        else if ( (LA18_0==':') ) {s = 3;}

                        else if ( (LA18_0=='F') ) {s = 4;}

                        else if ( (LA18_0=='D') ) {s = 5;}

                        else if ( (LA18_0=='R') ) {s = 6;}

                        else if ( (LA18_0=='A') ) {s = 7;}

                        else if ( (LA18_0=='U') ) {s = 8;}

                        else if ( (LA18_0=='I') ) {s = 9;}

                        else if ( (LA18_0=='E') ) {s = 10;}

                        else if ( (LA18_0=='P') ) {s = 11;}

                        else if ( (LA18_0=='C') ) {s = 12;}

                        else if ( (LA18_0=='O') ) {s = 13;}

                        else if ( (LA18_0=='M') ) {s = 14;}

                        else if ( (LA18_0=='T') ) {s = 15;}

                        else if ( (LA18_0=='p') ) {s = 16;}

                        else if ( (LA18_0=='s') ) {s = 17;}

                        else if ( (LA18_0=='f') ) {s = 18;}

                        else if ( (LA18_0=='a') ) {s = 19;}

                        else if ( (LA18_0=='c') ) {s = 20;}

                        else if ( (LA18_0=='m') ) {s = 21;}

                        else if ( (LA18_0=='t') ) {s = 22;}

                        else if ( (LA18_0=='-') ) {s = 23;}

                        else if ( (LA18_0=='N') ) {s = 24;}

                        else if ( (LA18_0=='!') ) {s = 25;}

                        else if ( (LA18_0=='+') ) {s = 26;}

                        else if ( (LA18_0=='|') ) {s = 27;}

                        else if ( (LA18_0=='^') ) {s = 28;}

                        else if ( (LA18_0=='B'||(LA18_0>='G' && LA18_0<='H')||(LA18_0>='J' && LA18_0<='L')||LA18_0=='Q'||LA18_0=='S'||(LA18_0>='V' && LA18_0<='Z')) ) {s = 29;}

                        else if ( (LA18_0=='_'||LA18_0=='b'||(LA18_0>='d' && LA18_0<='e')||(LA18_0>='g' && LA18_0<='l')||(LA18_0>='n' && LA18_0<='o')||(LA18_0>='q' && LA18_0<='r')||(LA18_0>='u' && LA18_0<='z')) ) {s = 30;}

                        else if ( (LA18_0=='*'||LA18_0=='<'||(LA18_0>='>' && LA18_0<='?')||LA18_0=='['||LA18_0==']') ) {s = 31;}

                        else if ( (LA18_0=='/') ) {s = 32;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 33;}

                        else if ( (LA18_0=='\"') ) {s = 34;}

                        else if ( (LA18_0=='\'') ) {s = 35;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 36;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||(LA18_0>='#' && LA18_0<='&')||LA18_0==','||LA18_0=='.'||LA18_0==';'||LA18_0=='='||LA18_0=='@'||LA18_0=='\\'||LA18_0=='`'||LA18_0=='{'||(LA18_0>='}' && LA18_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_81 = input.LA(1);

                        s = -1;
                        if ( (LA18_81=='*'||(LA18_81>='.' && LA18_81<='9')||LA18_81=='?'||(LA18_81>='A' && LA18_81<='Z')||LA18_81=='_'||(LA18_81>='a' && LA18_81<='z')) ) {s = 120;}

                        else if ( ((LA18_81>='\u0000' && LA18_81<=')')||(LA18_81>='+' && LA18_81<='-')||(LA18_81>=':' && LA18_81<='>')||LA18_81=='@'||(LA18_81>='[' && LA18_81<='^')||LA18_81=='`'||(LA18_81>='{' && LA18_81<='\uFFFF')) ) {s = 121;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_35 = input.LA(1);

                        s = -1;
                        if ( ((LA18_35>='\u0000' && LA18_35<='\uFFFF')) ) {s = 83;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_155 = input.LA(1);

                        s = -1;
                        if ( (LA18_155=='*') ) {s = 117;}

                        else if ( ((LA18_155>='.' && LA18_155<='9')||LA18_155=='?'||(LA18_155>='A' && LA18_155<='Z')||LA18_155=='_'||(LA18_155>='a' && LA18_155<='z')) ) {s = 119;}

                        else if ( ((LA18_155>='\u0000' && LA18_155<=')')||(LA18_155>='+' && LA18_155<='-')||(LA18_155>=':' && LA18_155<='>')||LA18_155=='@'||(LA18_155>='[' && LA18_155<='^')||LA18_155=='`'||(LA18_155>='{' && LA18_155<='\uFFFF')) ) {s = 118;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_34 = input.LA(1);

                        s = -1;
                        if ( ((LA18_34>='\u0000' && LA18_34<='\uFFFF')) ) {s = 83;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_120 = input.LA(1);

                        s = -1;
                        if ( ((LA18_120>='\u0000' && LA18_120<=')')||(LA18_120>='+' && LA18_120<='-')||(LA18_120>=':' && LA18_120<='>')||LA18_120=='@'||(LA18_120>='[' && LA18_120<='^')||LA18_120=='`'||(LA18_120>='{' && LA18_120<='\uFFFF')) ) {s = 121;}

                        else if ( (LA18_120=='*'||(LA18_120>='.' && LA18_120<='9')||LA18_120=='?'||(LA18_120>='A' && LA18_120<='Z')||LA18_120=='_'||(LA18_120>='a' && LA18_120<='z')) ) {s = 120;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}