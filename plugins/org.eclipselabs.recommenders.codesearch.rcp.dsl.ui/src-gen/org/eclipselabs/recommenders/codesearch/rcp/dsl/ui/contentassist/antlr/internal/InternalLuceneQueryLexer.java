package org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


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
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__82=82;
    public static final int T__45=45;
    public static final int T__83=83;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_PATHWITHWC=6;
    public static final int RULE_NAMEWITHWC=4;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_BOOST=7;
    public static final int T__76=76;
    public static final int RULE_WS=12;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalLuceneQueryLexer() {;} 
    public InternalLuceneQueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLuceneQueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:11:7: ( 'AND' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:11:9: 'AND'
            {
            match("AND"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:12:7: ( 'private' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:12:9: 'private'
            {
            match("private"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:13:7: ( 'public' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:13:9: 'public'
            {
            match("public"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:14:7: ( 'static' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:14:9: 'static'
            {
            match("static"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:15:7: ( 'final' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:15:9: 'final'
            {
            match("final"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:16:7: ( 'abstract' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:16:9: 'abstract'
            {
            match("abstract"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:17:7: ( 'protected' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:17:9: 'protected'
            {
            match("protected"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:18:7: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:18:9: 'class'
            {
            match("class"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:19:7: ( 'method' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:19:9: 'method'
            {
            match("method"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:20:7: ( 'field' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:20:9: 'field'
            {
            match("field"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:21:7: ( 'trycatch' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:21:9: 'trycatch'
            {
            match("trycatch"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:22:7: ( 'varusage' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:22:9: 'varusage'
            {
            match("varusage"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:23:7: ( 'parameter' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:23:9: 'parameter'
            {
            match("parameter"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:24:7: ( 'nullLiteral' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:24:9: 'nullLiteral'
            {
            match("nullLiteral"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:25:7: ( 'methodInvocation' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:25:9: 'methodInvocation'
            {
            match("methodInvocation"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:26:7: ( 'instanceCreation' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:26:9: 'instanceCreation'
            {
            match("instanceCreation"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:27:7: ( 'uninitialized' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:27:9: 'uninitialized'
            {
            match("uninitialized"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:28:7: ( '-' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:28:9: '-'
            {
            match('-'); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:29:7: ( 'NOT' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:29:9: 'NOT'
            {
            match("NOT"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:30:7: ( '!' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:30:9: '!'
            {
            match('!'); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:31:7: ( '+' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:31:9: '+'
            {
            match('+'); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:32:7: ( 'OR' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:32:9: 'OR'
            {
            match("OR"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:33:7: ( '||' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:33:9: '||'
            {
            match("||"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:34:7: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:34:9: '('
            {
            match('('); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:35:7: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:35:9: ')'
            {
            match(')'); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:36:7: ( ':' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:36:9: ':'
            {
            match(':'); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:37:7: ( 'FullyQualifiedName' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:37:9: 'FullyQualifiedName'
            {
            match("FullyQualifiedName"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:38:7: ( 'FriendlyName' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:38:9: 'FriendlyName'
            {
            match("FriendlyName"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:39:7: ( 'ReturnVariableExpressions' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:39:9: 'ReturnVariableExpressions'
            {
            match("ReturnVariableExpressions"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:40:7: ( 'AllDeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:40:9: 'AllDeclaredMethodNames'
            {
            match("AllDeclaredMethodNames"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:41:7: ( 'DeclaredMethodNames' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:41:9: 'DeclaredMethodNames'
            {
            match("DeclaredMethodNames"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:42:7: ( 'DeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:42:9: 'DeclaredFieldNames'
            {
            match("DeclaredFieldNames"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:43:7: ( 'AllDeclaredFieldNames' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:43:9: 'AllDeclaredFieldNames'
            {
            match("AllDeclaredFieldNames"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:44:7: ( 'FullText' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:44:9: 'FullText'
            {
            match("FullText"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:45:7: ( 'FieldsRead' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:45:9: 'FieldsRead'
            {
            match("FieldsRead"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:46:7: ( 'FieldsWritten' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:46:9: 'FieldsWritten'
            {
            match("FieldsWritten"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:47:7: ( 'UsedFieldsInFinally' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:47:9: 'UsedFieldsInFinally'
            {
            match("UsedFieldsInFinally"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:48:7: ( 'UsedFieldsInTry' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:48:9: 'UsedFieldsInTry'
            {
            match("UsedFieldsInTry"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:49:7: ( 'VariableName' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:49:9: 'VariableName'
            {
            match("VariableName"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:50:7: ( 'ParameterTypesStructural' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:50:9: 'ParameterTypesStructural'
            {
            match("ParameterTypesStructural"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:51:7: ( 'ImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:51:9: 'ImplementedTypes'
            {
            match("ImplementedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:52:7: ( 'ExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:52:9: 'ExtendedTypes'
            {
            match("ExtendedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:53:7: ( 'UsedTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:53:9: 'UsedTypes'
            {
            match("UsedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:54:7: ( 'UsedTypesInTry' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:54:9: 'UsedTypesInTry'
            {
            match("UsedTypesInTry"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:55:7: ( 'UsedTypesInFinally' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:55:9: 'UsedTypesInFinally'
            {
            match("UsedTypesInFinally"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:56:7: ( 'ParameterTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:56:9: 'ParameterTypes'
            {
            match("ParameterTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:57:7: ( 'ReturnType' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:57:9: 'ReturnType'
            {
            match("ReturnType"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:58:7: ( 'InstanceofTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:58:9: 'InstanceofTypes'
            {
            match("InstanceofTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:59:7: ( 'AllImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:59:9: 'AllImplementedTypes'
            {
            match("AllImplementedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:60:7: ( 'AllExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:60:9: 'AllExtendedTypes'
            {
            match("AllExtendedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:61:7: ( 'FieldType' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:61:9: 'FieldType'
            {
            match("FieldType"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:62:7: ( 'CaughtType' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:62:9: 'CaughtType'
            {
            match("CaughtType"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:63:7: ( 'DeclaredFieldTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:63:9: 'DeclaredFieldTypes'
            {
            match("DeclaredFieldTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:64:7: ( 'DeclaringType' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:64:9: 'DeclaringType'
            {
            match("DeclaringType"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:65:7: ( 'VariableType' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:65:9: 'VariableType'
            {
            match("VariableType"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:66:7: ( 'CheckedExceptions' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:66:9: 'CheckedExceptions'
            {
            match("CheckedExceptions"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:67:7: ( 'UsedMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:67:9: 'UsedMethods'
            {
            match("UsedMethods"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:68:7: ( 'UsedMethodsInTry' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:68:9: 'UsedMethodsInTry'
            {
            match("UsedMethodsInTry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:69:7: ( 'UsedMethodsInFinally' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:69:9: 'UsedMethodsInFinally'
            {
            match("UsedMethodsInFinally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:70:7: ( 'OverriddenMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:70:9: 'OverriddenMethods'
            {
            match("OverriddenMethods"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:71:7: ( 'DeclaredMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:71:9: 'DeclaredMethods'
            {
            match("DeclaredMethods"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:72:7: ( 'DeclaringMethod' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:72:9: 'DeclaringMethod'
            {
            match("DeclaringMethod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:73:7: ( 'UsedAsParameterInMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:73:9: 'UsedAsParameterInMethods'
            {
            match("UsedAsParameterInMethods"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:74:7: ( 'UsedAsTargetForMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:74:9: 'UsedAsTargetForMethods'
            {
            match("UsedAsTargetForMethods"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:75:7: ( 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:75:9: 'ResourcePath'
            {
            match("ResourcePath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:76:7: ( 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:76:9: 'ParameterCount'
            {
            match("ParameterCount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:77:7: ( 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:77:9: 'Modifiers'
            {
            match("Modifiers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:78:7: ( 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:78:9: 'Timestamp'
            {
            match("Timestamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:79:7: ( 'Type' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:79:9: 'Type'
            {
            match("Type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:80:7: ( 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:80:9: 'ProjectName'
            {
            match("ProjectName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:81:7: ( 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:81:9: 'Annotations'
            {
            match("Annotations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:82:7: ( 'VariableDefinition' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:82:9: 'VariableDefinition'
            {
            match("VariableDefinition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "RULE_BOOST"
    public final void mRULE_BOOST() throws RecognitionException {
        try {
            int _type = RULE_BOOST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7379:12: ( '^' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7379:14: '^' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            match('^'); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7379:18: ( '0' .. '9' )+
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
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7379:19: '0' .. '9'
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7379:30: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7379:31: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7379:35: ( '0' .. '9' )+
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
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7379:36: '0' .. '9'
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7381:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7381:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )*
            {
            if ( input.LA(1)=='*'||input.LA(1)=='<'||(input.LA(1)>='>' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7381:67: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*'||LA4_0=='.'||(LA4_0>='0' && LA4_0<='9')||LA4_0=='<'||(LA4_0>='>' && LA4_0<='?')||(LA4_0>='A' && LA4_0<='[')||LA4_0==']'||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7383:17: ( ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7383:19: ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )*
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7383:19: ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) )
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7383:20: 'A' .. 'Z' ':'
                    {
                    matchRange('A','Z'); 
                    match(':'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7383:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' )
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7383:62: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*'||(LA6_0>='.' && LA6_0<='9')||LA6_0=='?'||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7385:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7385:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7385:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7385:11: '^'
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7385:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7387:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7387:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7387:12: ( '0' .. '9' )+
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
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7387:13: '0' .. '9'
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7389:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7391:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7391:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7391:24: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7391:52: .
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7393:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7393:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7393:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7393:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7393:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7393:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7393:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7393:41: '\\r'
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7395:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7395:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7395:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7397:16: ( . )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7397:18: .
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
        // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | RULE_BOOST | RULE_NAMEWITHWC | RULE_PATHWITHWC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=82;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:442: RULE_BOOST
                {
                mRULE_BOOST(); 

                }
                break;
            case 74 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:453: RULE_NAMEWITHWC
                {
                mRULE_NAMEWITHWC(); 

                }
                break;
            case 75 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:469: RULE_PATHWITHWC
                {
                mRULE_PATHWITHWC(); 

                }
                break;
            case 76 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:485: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 77 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:493: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 78 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:502: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 79 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:514: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 80 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:530: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 81 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:546: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 82 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:554: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\14\60\1\uffff\1\60\2\uffff\1\60\1\52\3\uffff\13\60\1\52"+
        "\2\60\1\uffff\1\56\1\uffff\2\52\2\uffff\3\60\1\uffff\1\60\1\uffff"+
        "\16\60\1\uffff\1\60\2\uffff\1\164\1\60\4\uffff\21\60\2\uffff\2\56"+
        "\3\uffff\1\u008d\21\60\1\u00a1\1\uffff\23\60\2\56\1\uffff\1\56\2"+
        "\uffff\23\60\1\uffff\22\60\1\u00df\1\56\11\60\1\u00e9\1\u00ea\1"+
        "\60\1\u00ec\34\60\1\uffff\6\60\1\u0110\1\60\1\u0112\2\uffff\1\60"+
        "\1\uffff\1\u0115\40\60\1\u013a\1\60\1\uffff\1\60\1\uffff\2\60\1"+
        "\uffff\44\60\1\uffff\2\60\1\u0165\1\60\1\u0167\1\u0168\5\60\1\u016e"+
        "\34\60\1\u018e\1\u018f\1\uffff\1\60\2\uffff\5\60\1\uffff\3\60\1"+
        "\u0199\7\60\1\u01a3\15\60\1\u01b2\1\u01b3\4\60\2\uffff\7\60\1\u01bf"+
        "\1\60\1\uffff\1\60\1\u01c2\7\60\1\uffff\14\60\1\u01d6\1\60\2\uffff"+
        "\3\60\1\u01dc\1\60\1\u01de\5\60\1\uffff\2\60\1\uffff\7\60\1\u01ef"+
        "\7\60\1\u01f7\3\60\1\uffff\5\60\1\uffff\1\60\1\uffff\4\60\1\u0205"+
        "\2\60\1\u0208\10\60\1\uffff\2\60\1\u0214\1\u0215\3\60\1\uffff\12"+
        "\60\1\u0223\2\60\1\uffff\1\u0226\1\60\1\uffff\2\60\1\u022b\10\60"+
        "\2\uffff\5\60\1\u023a\7\60\1\uffff\2\60\1\uffff\4\60\1\uffff\3\60"+
        "\1\u024c\6\60\1\u0254\1\u0255\2\60\1\uffff\13\60\1\u0263\2\60\1"+
        "\u0266\1\60\1\u0268\1\uffff\7\60\2\uffff\1\60\1\u0271\4\60\1\u0276"+
        "\1\u0277\1\u0278\4\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60\1\u0281"+
        "\5\60\1\u0287\1\uffff\4\60\3\uffff\1\u028c\7\60\1\uffff\5\60\1\uffff"+
        "\1\u0299\3\60\1\uffff\1\u029d\2\60\1\u02a0\1\u02a1\1\60\1\u02a3"+
        "\3\60\1\u02a7\1\60\1\uffff\2\60\1\u02ab\1\uffff\1\60\1\u02ad\2\uffff"+
        "\1\u02ae\1\uffff\3\60\1\uffff\3\60\1\uffff\1\60\2\uffff\1\u02b6"+
        "\4\60\1\u02bb\1\60\1\uffff\3\60\1\u02c0\1\uffff\2\60\1\u02c3\1\60"+
        "\1\uffff\2\60\1\uffff\2\60\1\u02c9\1\u02ca\1\u02cb\3\uffff";
    static final String DFA18_eofS =
        "\u02cc\uffff";
    static final String DFA18_minS =
        "\1\0\14\52\1\uffff\1\52\2\uffff\1\52\1\174\3\uffff\13\52\1\60\2"+
        "\52\1\uffff\1\52\1\uffff\2\0\2\uffff\3\52\1\uffff\1\52\1\uffff\16"+
        "\52\1\uffff\1\52\2\uffff\2\52\4\uffff\21\52\2\uffff\2\0\3\uffff"+
        "\23\52\1\uffff\23\52\2\0\1\uffff\1\0\2\uffff\23\52\1\uffff\23\52"+
        "\1\0\51\52\1\uffff\11\52\2\uffff\1\52\1\uffff\43\52\1\uffff\1\52"+
        "\1\uffff\2\52\1\uffff\44\52\1\uffff\52\52\1\uffff\1\52\2\uffff\5"+
        "\52\1\uffff\37\52\2\uffff\11\52\1\uffff\11\52\1\uffff\16\52\2\uffff"+
        "\13\52\1\uffff\2\52\1\uffff\23\52\1\uffff\5\52\1\uffff\1\52\1\uffff"+
        "\20\52\1\uffff\7\52\1\uffff\15\52\1\uffff\2\52\1\uffff\13\52\2\uffff"+
        "\15\52\1\uffff\2\52\1\uffff\4\52\1\uffff\16\52\1\uffff\21\52\1\uffff"+
        "\7\52\2\uffff\15\52\1\uffff\2\52\1\uffff\1\52\1\uffff\10\52\1\uffff"+
        "\4\52\3\uffff\10\52\1\uffff\5\52\1\uffff\4\52\1\uffff\14\52\1\uffff"+
        "\3\52\1\uffff\2\52\2\uffff\1\52\1\uffff\3\52\1\uffff\3\52\1\uffff"+
        "\1\52\2\uffff\7\52\1\uffff\4\52\1\uffff\4\52\1\uffff\2\52\1\uffff"+
        "\5\52\3\uffff";
    static final String DFA18_maxS =
        "\1\uffff\14\172\1\uffff\1\172\2\uffff\1\172\1\174\3\uffff\16\172"+
        "\1\uffff\1\57\1\uffff\2\uffff\2\uffff\3\172\1\uffff\1\172\1\uffff"+
        "\16\172\1\uffff\1\172\2\uffff\2\172\4\uffff\21\172\2\uffff\2\uffff"+
        "\3\uffff\23\172\1\uffff\23\172\2\uffff\1\uffff\1\uffff\2\uffff\23"+
        "\172\1\uffff\23\172\1\uffff\51\172\1\uffff\11\172\2\uffff\1\172"+
        "\1\uffff\43\172\1\uffff\1\172\1\uffff\2\172\1\uffff\44\172\1\uffff"+
        "\52\172\1\uffff\1\172\2\uffff\5\172\1\uffff\37\172\2\uffff\11\172"+
        "\1\uffff\11\172\1\uffff\16\172\2\uffff\13\172\1\uffff\2\172\1\uffff"+
        "\23\172\1\uffff\5\172\1\uffff\1\172\1\uffff\20\172\1\uffff\7\172"+
        "\1\uffff\15\172\1\uffff\2\172\1\uffff\13\172\2\uffff\15\172\1\uffff"+
        "\2\172\1\uffff\4\172\1\uffff\16\172\1\uffff\21\172\1\uffff\7\172"+
        "\2\uffff\15\172\1\uffff\2\172\1\uffff\1\172\1\uffff\10\172\1\uffff"+
        "\4\172\3\uffff\10\172\1\uffff\5\172\1\uffff\4\172\1\uffff\14\172"+
        "\1\uffff\3\172\1\uffff\2\172\2\uffff\1\172\1\uffff\3\172\1\uffff"+
        "\3\172\1\uffff\1\172\2\uffff\7\172\1\uffff\4\172\1\uffff\4\172\1"+
        "\uffff\2\172\1\uffff\5\172\3\uffff";
    static final String DFA18_acceptS =
        "\15\uffff\1\22\1\uffff\1\24\1\25\2\uffff\1\30\1\31\1\32\16\uffff"+
        "\1\112\1\uffff\1\115\2\uffff\1\121\1\122\3\uffff\1\113\1\uffff\1"+
        "\112\16\uffff\1\22\1\uffff\1\24\1\25\2\uffff\1\27\1\30\1\31\1\32"+
        "\21\uffff\1\111\1\114\2\uffff\1\115\1\116\1\121\23\uffff\1\26\25"+
        "\uffff\1\117\1\uffff\1\120\1\1\23\uffff\1\23\75\uffff\1\105\11\uffff"+
        "\1\5\1\12\1\uffff\1\10\43\uffff\1\3\1\uffff\1\4\2\uffff\1\11\44"+
        "\uffff\1\2\52\uffff\1\6\1\uffff\1\13\1\14\5\uffff\1\42\37\uffff"+
        "\1\7\1\15\11\uffff\1\63\11\uffff\1\53\16\uffff\1\103\1\104\13\uffff"+
        "\1\43\2\uffff\1\57\23\uffff\1\64\5\uffff\1\107\1\uffff\1\16\20\uffff"+
        "\1\71\7\uffff\1\106\15\uffff\1\34\2\uffff\1\101\13\uffff\1\47\1"+
        "\67\15\uffff\1\21\2\uffff\1\44\4\uffff\1\66\16\uffff\1\52\21\uffff"+
        "\1\54\7\uffff\1\56\1\102\15\uffff\1\75\2\uffff\1\76\1\uffff\1\46"+
        "\10\uffff\1\60\4\uffff\1\62\1\17\1\20\10\uffff\1\72\5\uffff\1\51"+
        "\4\uffff\1\74\14\uffff\1\70\3\uffff\1\33\2\uffff\1\40\1\65\1\uffff"+
        "\1\55\3\uffff\1\110\3\uffff\1\61\1\uffff\1\37\1\45\7\uffff\1\73"+
        "\4\uffff\1\41\4\uffff\1\36\2\uffff\1\100\5\uffff\1\77\1\50\1\35";
    static final String DFA18_specialS =
        "\1\2\46\uffff\1\10\1\6\63\uffff\1\4\1\7\52\uffff\1\0\1\3\1\uffff"+
        "\1\1\51\uffff\1\5\u0216\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\17\1\47\4\52\1\50\1\23\1"+
            "\24\1\44\1\20\1\52\1\15\1\52\1\45\12\46\1\25\1\52\1\44\1\52"+
            "\2\44\1\52\1\1\1\42\1\36\1\30\1\35\1\26\2\42\1\34\3\42\1\37"+
            "\1\16\1\21\1\33\1\42\1\27\1\42\1\40\1\31\1\32\4\42\1\44\1\52"+
            "\1\44\1\41\1\43\1\52\1\5\1\43\1\6\2\43\1\4\2\43\1\13\3\43\1"+
            "\7\1\12\1\43\1\2\2\43\1\3\1\10\1\14\1\11\4\43\1\52\1\22\uff83"+
            "\52",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\15"+
            "\57\1\53\14\57\4\uffff\1\57\1\uffff\13\57\1\54\1\57\1\55\14"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\64\20\57\1\62\2\57\1\63\5\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\65\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\66\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\57\1\67\30\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\70\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\71\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\72\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\73\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\24\57\1\74\5\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\75\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\76\14\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\16"+
            "\57\1\100\13\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\21"+
            "\57\1\103\10\57\4\uffff\1\57\1\uffff\25\57\1\104\4\57",
            "\1\105",
            "",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\10\57\1\113\10\57\1\112\2\57\1\111"+
            "\5\57",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\4\57\1\114\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\4\57\1\115\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\22\57\1\116\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\1\117\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\1\120\20\57\1\121\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\14\57\1\122\1\123\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\27\57\1\124\2\57",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\1\125\6\57\1\126\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\16\57\1\127\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\10\57\1\130\17\57\1\131\1\57",
            "\12\132\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\61\3\uffff\1\61\1\56\12\57\1\56\4\uffff\1\61\1\uffff\32"+
            "\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\32\57",
            "",
            "\1\134\4\uffff\1\135",
            "",
            "\0\137",
            "\0\137",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\3\57\1"+
            "\141\26\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\142\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\143\14\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\32\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\61\5\uffff\1\61\1\uffff\32\61\4"+
            "\uffff\1\61\1\uffff\32\61",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\144\5\57\1\145\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\57\1\146\30\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\147\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\150\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\152\10\57\1\151\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\153\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\154\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\155\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\156\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\157\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\160\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\161\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\162\21\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\23\57\1"+
            "\163\6\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\165\25\57",
            "",
            "",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\166\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\167\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\170\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\172\1\171\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\173\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\174\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\175\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\176\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\177\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u0080\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u0081\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0082\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\24\57\1\u0083\5\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0084\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0085\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u0086\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u0087\12\57",
            "",
            "",
            "\52\u008a\1\u0088\3\u008a\14\u0089\5\u008a\1\u0089\1\u008a"+
            "\32\u0089\4\u008a\1\u0089\1\u008a\32\u0089\uff85\u008a",
            "\52\u008c\1\u008b\3\u008c\14\u008b\5\u008c\1\u008b\1\u008c"+
            "\32\u008b\4\u008c\1\u008b\1\u008c\32\u008b\uff85\u008c",
            "",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\3\57\1"+
            "\u008e\1\u0090\3\57\1\u008f\21\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0091\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\25\57\1\u0092\4\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0093\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u0094\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0095\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0096\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0097\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u0098\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0099\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u009a\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u009b\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u009c\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\24\57\1\u009d\5\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u009e\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u009f\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u00a0\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u00a2\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u00a3\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00a4\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u00a5\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\24\57\1\u00a6\5\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u00a7\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u00a8\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u00a9\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u00aa\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u00ab\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\11\57\1\u00ac\20\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u00ad\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u00ae\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00af\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\6\57\1\u00b0\23\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u00b1\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u00b2\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00b3\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00b4\25\57",
            "\52\u008a\1\u0088\3\u008a\1\u0089\1\u00b5\12\u0089\5\u008a"+
            "\1\u0089\1\u008a\32\u0089\4\u008a\1\u0089\1\u008a\32\u0089\uff85"+
            "\u008a",
            "\52\u008a\1\u0088\3\u008a\14\u0089\5\u008a\1\u0089\1\u008a"+
            "\32\u0089\4\u008a\1\u0089\1\u008a\32\u0089\uff85\u008a",
            "",
            "\52\u008c\1\u008b\3\u008c\14\u008b\5\u008c\1\u008b\1\u008c"+
            "\32\u008b\4\u008c\1\u008b\1\u008c\32\u008b\uff85\u008c",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00b6\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u00b7\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\27\57\1\u00b8\2\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u00b9\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u00ba\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00bb\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u00bc\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u00bd\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u00be\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u00bf\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u00c0\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u00c1\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u00c2\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u00c3\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u00c4\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u00c5\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\13\57\1"+
            "\u00c6\16\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u00c7\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u00c8\21\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u00c9\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\23\57\1"+
            "\u00cb\6\57\4\uffff\1\57\1\uffff\30\57\1\u00ca\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u00cc\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u00cd\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u00ce\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\24\57\1\u00cf\5\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u00d0\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\1\u00d4"+
            "\4\57\1\u00d1\6\57\1\u00d3\6\57\1\u00d2\6\57\4\uffff\1\57\1"+
            "\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u00d5\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u00d6\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00d7\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00d8\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u00d9\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u00da\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u00db\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\12\57\1\u00dc\17\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\5\57\1\u00dd\24\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u00de\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\52\u008a\1\u0088\3\u008a\14\u0089\5\u008a\1\u0089\1\u008a"+
            "\32\u0089\4\u008a\1\u0089\1\u008a\32\u0089\uff85\u008a",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u00e0\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u00e1\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u00e2\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u00e3\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u00e4\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u00e5\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u00e6\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00e7\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u00e8\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u00eb\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u00ed\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u00ee\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u00ef\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u00f0\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u00f1\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u00f2\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u00f3\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\20\57\1"+
            "\u00f4\11\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00f5\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u00f6\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\23\57\1"+
            "\u00f8\6\57\4\uffff\1\57\1\uffff\22\57\1\u00f7\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u00f9\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u00fa\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u00fb\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u00fc\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u00fd\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u00fe\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u00ff\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\57\1\u0100\30\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0101\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u0102\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u0103\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0104\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0105\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0106\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0107\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u0108\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0109\6\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u010a\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u010b\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u010c\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u010d\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u010e\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u010f\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0111\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u0113\27\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\10\57\1\u0114\21\57\1\60\1\uffff\1\60\1\uffff\1"+
            "\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u0116\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\6\57\1\u0117\23\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0118\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u0119\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u011a\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u011b\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\24\57\1\u011c\5\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\27\57\1\u011d\2\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u011e\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\21\57\1"+
            "\u011f\4\57\1\u0120\3\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u0121\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\23\57\1"+
            "\u0123\1\57\1\u0122\4\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u0124\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0125\3\57\1\u0126\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0127\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u0128\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0129\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\17\57\1"+
            "\u012a\3\57\1\u012b\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u012c\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u012d\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u012e\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u012f\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u0130\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0131\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\23\57\1"+
            "\u0132\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0133\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0134\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0135\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0136\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0137\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0138\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u0139\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u013b\25\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u013c\25\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u013d\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u013e\14\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u013f\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0140\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0141\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0142\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0143\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0144\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0145\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0146\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u0147\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0148\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u0149\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u014a\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u014b\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u014c\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u014d\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u014e\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u014f\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u0150\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0151\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u0152\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0153\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0154\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0155\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0156\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\15\57\1"+
            "\u0157\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0158\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0159\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u015a\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u015b\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\4\57\1"+
            "\u015c\25\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u015d\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u015e\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u015f\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u0160\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0161\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0162\13\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0163\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u0164\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\25\57\1\u0166\4\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u0169\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\2\57\1"+
            "\u016a\27\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u016b\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u016c\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u016d\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\15\57\1"+
            "\u016f\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0170\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u0171\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0172\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u0173\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u0174\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\17\57\1"+
            "\u0175\12\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\5\57\1"+
            "\u0177\6\57\1\u0176\15\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\6\57\1\u0178\23\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0179\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u017a\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u017b\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u017c\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u017d\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\3\57\1"+
            "\u0180\11\57\1\u017e\5\57\1\u017f\6\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u0181\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0182\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0183\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0184\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\23\57\1"+
            "\u0185\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u0186\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\27\57\1\u0187\2\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u0188\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u0189\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u018a\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u018b\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u018c\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u018d\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0190\13\57",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0191\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u0192\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u0193\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0194\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u0195\21\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0196\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0197\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0198\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u019a\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u019b\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u019c\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u019d\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u019e\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\14\57\1"+
            "\u01a0\6\57\1\u019f\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u01a1\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\10\57\1\u01a2\21\57\1\60\1\uffff\1\60\1\uffff\1"+
            "\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u01a4\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u01a5\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\6\57\1\u01a6\23\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u01a7\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u01a8\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01a9\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\2\57\1"+
            "\u01ab\20\57\1\u01aa\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u01ac\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01ad\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\5\57\1\u01ae\24\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u01af\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01b0\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u01b1\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u01b4\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u01b5\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u01b6\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u01b7\7\57",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u01b8\27\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u01b9\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01ba\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\31\57\1\u01bb",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\14\57\1"+
            "\u01bc\15\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\5\57\1\u01bd\24\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u01be\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u01c0\6\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u01c1\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u01c3\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u01c4\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01c5\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u01c6\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01c7\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\10\57\1"+
            "\u01c8\21\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u01c9\14\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u01ca\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u01cb\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01cc\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u01cd\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u01ce\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\5\57\1\u01cf\24\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u01d0\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u01d1\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01d2\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u01d3\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\23\57\1"+
            "\u01d4\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u01d5\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01d7\25\57",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\5\57\1"+
            "\u01d9\6\57\1\u01d8\15\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u01da\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\23\57\1"+
            "\u01db\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u01dd\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u01df\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01e0\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01e1\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u01e2\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01e3\25\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01e4\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\57\1\u01e5\30\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u01e6\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u01e7\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u01e8\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u01e9\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u01ea\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u01eb\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\5\57\1"+
            "\u01ed\15\57\1\u01ec\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\10\57\1\u01ee\21\57\1\60\1\uffff\1\60\1\uffff\1"+
            "\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01f0\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u01f1\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01f2\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01f3\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u01f4\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u01f5\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\24\57\1\u01f6\5\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\23\57\1"+
            "\u01f8\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u01f9\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01fa\25\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u01fb\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01fc\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u01fd\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u01fe\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u01ff\1\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0200\6\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0201\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0202\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0203\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0204\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0206\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u0207\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0209\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u020a\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u020b\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u020c\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\5\57\1"+
            "\u020d\15\57\1\u020e\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u020f\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u0210\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0211\14\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0212\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\5\57\1"+
            "\u0213\24\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0216\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0217\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0218\14\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u0219\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u021a\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u021b\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u021c\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u021d\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u021e\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u021f\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u0220\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u0221\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u0222\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u0224\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0225\26\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0227\25\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0228\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\15\57\1"+
            "\u0229\5\57\1\u022a\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u022c\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u022d\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u022e\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u022f\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0230\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\5\57\1"+
            "\u0232\15\57\1\u0231\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0233\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0234\13\57",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u0235\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u0236\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0237\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u0238\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0239\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u023b\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u023c\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u023d\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\23\57\1"+
            "\u023e\6\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u023f\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0240\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0241\13\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0242\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\15\57\1"+
            "\u0243\14\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\4\57\1"+
            "\u0244\25\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\15\57\1"+
            "\u0245\14\57\4\uffff\1\57\1\uffff\22\57\1\u0246\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0247\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u0248\1\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0249\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u024a\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u024b\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u024d\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u024e\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u024f\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u0250\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u0251\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0252\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\22\57\1\u0253\7\57\1\60\1\uffff\1\60\1\uffff\1\57"+
            "\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0256\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u0257\7\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0258\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0259\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u025a\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u025b\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u025c\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u025d\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u025e\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u025f\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0260\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\27\57\1\u0261\2\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0262\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u0264\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u0265\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0267\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u0269\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u026a\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u026b\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\10\57\1"+
            "\u026c\21\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\14\57\1"+
            "\u026d\15\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u026e\21\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u026f\6\57",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u0270\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0272\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u0273\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\15\57\1"+
            "\u0274\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u0275\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u0279\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u027a\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\17\57\1\u027b\12\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u027c\15\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u027d\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u027e\25\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u027f\16\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u0280\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u0282\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0283\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u0284\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u0285\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u0286\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u0288\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\15\57\1"+
            "\u0289\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u028a\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u028b\25\57",
            "",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u028d\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u028e\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u028f\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u0290\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u0291\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u0292\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u0293\1\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u0294\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\14\57\1"+
            "\u0295\15\57\4\uffff\1\57\1\uffff\32\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u0296\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u0297\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\24\57\1\u0298\5\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u029a\31\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u029b\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u029c\7\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u029e\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u029f\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u02a2\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u02a4\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u02a5\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u02a6\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\2\57\1\u02a8\27\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\14\57\1\u02a9\15\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u02aa\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u02ac\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\30\57\1\u02af\1\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u02b0\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u02b1\13\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\23\57\1\u02b2\6\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\4\57\1\u02b3\25\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u02b4\7\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u02b5\7\57",
            "",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\7\57\1\u02b7\22\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u02b8\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\24\57\1\u02b9\5\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u02ba\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\10\57\1\u02bc\21\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u02bd\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u02be\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\21\57\1\u02bf\10\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\16\57\1\u02c1\13\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\3\57\1\u02c2\26\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\1\u02c4\31\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\15\57\1\u02c5\14\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u02c6\7\57",
            "",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\13\57\1\u02c7\16\57",
            "\1\61\3\uffff\1\61\1\56\12\57\5\uffff\1\61\1\uffff\32\57\4"+
            "\uffff\1\57\1\uffff\22\57\1\u02c8\7\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\61\3\uffff\1\61\1\56\12\57\2\uffff\1\60\1\uffff\1\60\1"+
            "\61\1\uffff\32\57\1\60\1\uffff\1\60\1\uffff\1\57\1\uffff\32"+
            "\57",
            "",
            "",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | RULE_BOOST | RULE_NAMEWITHWC | RULE_PATHWITHWC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_136 = input.LA(1);

                        s = -1;
                        if ( (LA18_136=='/') ) {s = 181;}

                        else if ( (LA18_136=='*') ) {s = 136;}

                        else if ( (LA18_136=='.'||(LA18_136>='0' && LA18_136<='9')||LA18_136=='?'||(LA18_136>='A' && LA18_136<='Z')||LA18_136=='_'||(LA18_136>='a' && LA18_136<='z')) ) {s = 137;}

                        else if ( ((LA18_136>='\u0000' && LA18_136<=')')||(LA18_136>='+' && LA18_136<='-')||(LA18_136>=':' && LA18_136<='>')||LA18_136=='@'||(LA18_136>='[' && LA18_136<='^')||LA18_136=='`'||(LA18_136>='{' && LA18_136<='\uFFFF')) ) {s = 138;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_139 = input.LA(1);

                        s = -1;
                        if ( ((LA18_139>='\u0000' && LA18_139<=')')||(LA18_139>='+' && LA18_139<='-')||(LA18_139>=':' && LA18_139<='>')||LA18_139=='@'||(LA18_139>='[' && LA18_139<='^')||LA18_139=='`'||(LA18_139>='{' && LA18_139<='\uFFFF')) ) {s = 140;}

                        else if ( (LA18_139=='*'||(LA18_139>='.' && LA18_139<='9')||LA18_139=='?'||(LA18_139>='A' && LA18_139<='Z')||LA18_139=='_'||(LA18_139>='a' && LA18_139<='z')) ) {s = 139;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='A') ) {s = 1;}

                        else if ( (LA18_0=='p') ) {s = 2;}

                        else if ( (LA18_0=='s') ) {s = 3;}

                        else if ( (LA18_0=='f') ) {s = 4;}

                        else if ( (LA18_0=='a') ) {s = 5;}

                        else if ( (LA18_0=='c') ) {s = 6;}

                        else if ( (LA18_0=='m') ) {s = 7;}

                        else if ( (LA18_0=='t') ) {s = 8;}

                        else if ( (LA18_0=='v') ) {s = 9;}

                        else if ( (LA18_0=='n') ) {s = 10;}

                        else if ( (LA18_0=='i') ) {s = 11;}

                        else if ( (LA18_0=='u') ) {s = 12;}

                        else if ( (LA18_0=='-') ) {s = 13;}

                        else if ( (LA18_0=='N') ) {s = 14;}

                        else if ( (LA18_0=='!') ) {s = 15;}

                        else if ( (LA18_0=='+') ) {s = 16;}

                        else if ( (LA18_0=='O') ) {s = 17;}

                        else if ( (LA18_0=='|') ) {s = 18;}

                        else if ( (LA18_0=='(') ) {s = 19;}

                        else if ( (LA18_0==')') ) {s = 20;}

                        else if ( (LA18_0==':') ) {s = 21;}

                        else if ( (LA18_0=='F') ) {s = 22;}

                        else if ( (LA18_0=='R') ) {s = 23;}

                        else if ( (LA18_0=='D') ) {s = 24;}

                        else if ( (LA18_0=='U') ) {s = 25;}

                        else if ( (LA18_0=='V') ) {s = 26;}

                        else if ( (LA18_0=='P') ) {s = 27;}

                        else if ( (LA18_0=='I') ) {s = 28;}

                        else if ( (LA18_0=='E') ) {s = 29;}

                        else if ( (LA18_0=='C') ) {s = 30;}

                        else if ( (LA18_0=='M') ) {s = 31;}

                        else if ( (LA18_0=='T') ) {s = 32;}

                        else if ( (LA18_0=='^') ) {s = 33;}

                        else if ( (LA18_0=='B'||(LA18_0>='G' && LA18_0<='H')||(LA18_0>='J' && LA18_0<='L')||LA18_0=='Q'||LA18_0=='S'||(LA18_0>='W' && LA18_0<='Z')) ) {s = 34;}

                        else if ( (LA18_0=='_'||LA18_0=='b'||(LA18_0>='d' && LA18_0<='e')||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='l')||LA18_0=='o'||(LA18_0>='q' && LA18_0<='r')||(LA18_0>='w' && LA18_0<='z')) ) {s = 35;}

                        else if ( (LA18_0=='*'||LA18_0=='<'||(LA18_0>='>' && LA18_0<='?')||LA18_0=='['||LA18_0==']') ) {s = 36;}

                        else if ( (LA18_0=='/') ) {s = 37;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 38;}

                        else if ( (LA18_0=='\"') ) {s = 39;}

                        else if ( (LA18_0=='\'') ) {s = 40;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 41;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||(LA18_0>='#' && LA18_0<='&')||LA18_0==','||LA18_0=='.'||LA18_0==';'||LA18_0=='='||LA18_0=='@'||LA18_0=='\\'||LA18_0=='`'||LA18_0=='{'||(LA18_0>='}' && LA18_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_137 = input.LA(1);

                        s = -1;
                        if ( (LA18_137=='*') ) {s = 136;}

                        else if ( ((LA18_137>='.' && LA18_137<='9')||LA18_137=='?'||(LA18_137>='A' && LA18_137<='Z')||LA18_137=='_'||(LA18_137>='a' && LA18_137<='z')) ) {s = 137;}

                        else if ( ((LA18_137>='\u0000' && LA18_137<=')')||(LA18_137>='+' && LA18_137<='-')||(LA18_137>=':' && LA18_137<='>')||LA18_137=='@'||(LA18_137>='[' && LA18_137<='^')||LA18_137=='`'||(LA18_137>='{' && LA18_137<='\uFFFF')) ) {s = 138;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_92 = input.LA(1);

                        s = -1;
                        if ( (LA18_92=='*') ) {s = 136;}

                        else if ( ((LA18_92>='.' && LA18_92<='9')||LA18_92=='?'||(LA18_92>='A' && LA18_92<='Z')||LA18_92=='_'||(LA18_92>='a' && LA18_92<='z')) ) {s = 137;}

                        else if ( ((LA18_92>='\u0000' && LA18_92<=')')||(LA18_92>='+' && LA18_92<='-')||(LA18_92>=':' && LA18_92<='>')||LA18_92=='@'||(LA18_92>='[' && LA18_92<='^')||LA18_92=='`'||(LA18_92>='{' && LA18_92<='\uFFFF')) ) {s = 138;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_181 = input.LA(1);

                        s = -1;
                        if ( (LA18_181=='*') ) {s = 136;}

                        else if ( ((LA18_181>='.' && LA18_181<='9')||LA18_181=='?'||(LA18_181>='A' && LA18_181<='Z')||LA18_181=='_'||(LA18_181>='a' && LA18_181<='z')) ) {s = 137;}

                        else if ( ((LA18_181>='\u0000' && LA18_181<=')')||(LA18_181>='+' && LA18_181<='-')||(LA18_181>=':' && LA18_181<='>')||LA18_181=='@'||(LA18_181>='[' && LA18_181<='^')||LA18_181=='`'||(LA18_181>='{' && LA18_181<='\uFFFF')) ) {s = 138;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_40 = input.LA(1);

                        s = -1;
                        if ( ((LA18_40>='\u0000' && LA18_40<='\uFFFF')) ) {s = 95;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_93 = input.LA(1);

                        s = -1;
                        if ( (LA18_93=='*'||(LA18_93>='.' && LA18_93<='9')||LA18_93=='?'||(LA18_93>='A' && LA18_93<='Z')||LA18_93=='_'||(LA18_93>='a' && LA18_93<='z')) ) {s = 139;}

                        else if ( ((LA18_93>='\u0000' && LA18_93<=')')||(LA18_93>='+' && LA18_93<='-')||(LA18_93>=':' && LA18_93<='>')||LA18_93=='@'||(LA18_93>='[' && LA18_93<='^')||LA18_93=='`'||(LA18_93>='{' && LA18_93<='\uFFFF')) ) {s = 140;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_39 = input.LA(1);

                        s = -1;
                        if ( ((LA18_39>='\u0000' && LA18_39<='\uFFFF')) ) {s = 95;}

                        else s = 42;

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