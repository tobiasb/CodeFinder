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
    public static final int RULE_ID=11;
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
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
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
    public static final int RULE_QUOTEDNAMEWITHWC=7;
    public static final int T__84=84;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=12;
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
    public static final int RULE_LUCENESPECIALCHAR=9;
    public static final int RULE_BOOST=8;
    public static final int RULE_ESCAPEDSPECIALCHAR=10;
    public static final int T__76=76;
    public static final int RULE_WS=15;
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

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:11:7: ( 'private' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:11:9: 'private'
            {
            match("private"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:12:7: ( 'public' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:12:9: 'public'
            {
            match("public"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:13:7: ( 'static' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:13:9: 'static'
            {
            match("static"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:14:7: ( 'final' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:14:9: 'final'
            {
            match("final"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:15:7: ( 'abstract' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:15:9: 'abstract'
            {
            match("abstract"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:16:7: ( 'protected' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:16:9: 'protected'
            {
            match("protected"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:17:7: ( 'class' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:17:9: 'class'
            {
            match("class"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:18:7: ( 'method' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:18:9: 'method'
            {
            match("method"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:19:7: ( 'field' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:19:9: 'field'
            {
            match("field"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:20:7: ( 'trycatch' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:20:9: 'trycatch'
            {
            match("trycatch"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:21:7: ( 'varusage' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:21:9: 'varusage'
            {
            match("varusage"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:22:7: ( 'parameter' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:22:9: 'parameter'
            {
            match("parameter"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:23:7: ( 'nullLiteral' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:23:9: 'nullLiteral'
            {
            match("nullLiteral"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:24:7: ( 'methodInvocation' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:24:9: 'methodInvocation'
            {
            match("methodInvocation"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:25:7: ( 'instanceCreation' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:25:9: 'instanceCreation'
            {
            match("instanceCreation"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:26:7: ( 'uninitialized' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:26:9: 'uninitialized'
            {
            match("uninitialized"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:27:7: ( '-' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:27:9: '-'
            {
            match('-'); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:28:7: ( 'NOT' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:28:9: 'NOT'
            {
            match("NOT"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:29:7: ( '!' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:29:9: '!'
            {
            match('!'); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:30:7: ( '+' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:30:9: '+'
            {
            match('+'); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:31:7: ( 'OR' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:31:9: 'OR'
            {
            match("OR"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:32:7: ( '||' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:32:9: '||'
            {
            match("||"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:33:7: ( 'AND' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:33:9: 'AND'
            {
            match("AND"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:34:7: ( '&&' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:34:9: '&&'
            {
            match("&&"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:35:7: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:35:9: '('
            {
            match('('); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:36:7: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:36:9: ')'
            {
            match(')'); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:37:7: ( ':' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:37:9: ':'
            {
            match(':'); 

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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:51:7: ( 'FullyQualifiedName' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:51:9: 'FullyQualifiedName'
            {
            match("FullyQualifiedName"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:52:7: ( 'ImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:52:9: 'ImplementedTypes'
            {
            match("ImplementedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:53:7: ( 'ExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:53:9: 'ExtendedTypes'
            {
            match("ExtendedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:54:7: ( 'UsedTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:54:9: 'UsedTypes'
            {
            match("UsedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:55:7: ( 'UsedTypesInTry' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:55:9: 'UsedTypesInTry'
            {
            match("UsedTypesInTry"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:56:7: ( 'UsedTypesInFinally' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:56:9: 'UsedTypesInFinally'
            {
            match("UsedTypesInFinally"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:57:7: ( 'ParameterTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:57:9: 'ParameterTypes'
            {
            match("ParameterTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:58:7: ( 'ReturnType' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:58:9: 'ReturnType'
            {
            match("ReturnType"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:59:7: ( 'InstanceofTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:59:9: 'InstanceofTypes'
            {
            match("InstanceofTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:60:7: ( 'AllImplementedTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:60:9: 'AllImplementedTypes'
            {
            match("AllImplementedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:61:7: ( 'AllExtendedTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:61:9: 'AllExtendedTypes'
            {
            match("AllExtendedTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:62:7: ( 'FieldType' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:62:9: 'FieldType'
            {
            match("FieldType"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:63:7: ( 'CaughtType' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:63:9: 'CaughtType'
            {
            match("CaughtType"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:64:7: ( 'DeclaredFieldTypes' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:64:9: 'DeclaredFieldTypes'
            {
            match("DeclaredFieldTypes"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:65:7: ( 'DeclaringType' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:65:9: 'DeclaringType'
            {
            match("DeclaringType"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:66:7: ( 'VariableType' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:66:9: 'VariableType'
            {
            match("VariableType"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:67:7: ( 'CheckedExceptions' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:67:9: 'CheckedExceptions'
            {
            match("CheckedExceptions"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:68:7: ( 'UsedMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:68:9: 'UsedMethods'
            {
            match("UsedMethods"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:69:7: ( 'UsedMethodsInTry' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:69:9: 'UsedMethodsInTry'
            {
            match("UsedMethodsInTry"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:70:7: ( 'UsedMethodsInFinally' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:70:9: 'UsedMethodsInFinally'
            {
            match("UsedMethodsInFinally"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:71:7: ( 'OverriddenMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:71:9: 'OverriddenMethods'
            {
            match("OverriddenMethods"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:72:7: ( 'DeclaredMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:72:9: 'DeclaredMethods'
            {
            match("DeclaredMethods"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:73:7: ( 'DeclaringMethod' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:73:9: 'DeclaringMethod'
            {
            match("DeclaringMethod"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:74:7: ( 'UsedAsParameterInMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:74:9: 'UsedAsParameterInMethods'
            {
            match("UsedAsParameterInMethods"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:75:7: ( 'UsedAsTargetForMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:75:9: 'UsedAsTargetForMethods'
            {
            match("UsedAsTargetForMethods"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:76:7: ( 'ResourcePath' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:76:9: 'ResourcePath'
            {
            match("ResourcePath"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:77:7: ( 'ParameterCount' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:77:9: 'ParameterCount'
            {
            match("ParameterCount"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:78:7: ( 'Modifiers' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:78:9: 'Modifiers'
            {
            match("Modifiers"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:79:7: ( 'Timestamp' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:79:9: 'Timestamp'
            {
            match("Timestamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:80:7: ( 'Type' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:80:9: 'Type'
            {
            match("Type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:81:7: ( 'ProjectName' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:81:9: 'ProjectName'
            {
            match("ProjectName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:82:7: ( 'Annotations' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:82:9: 'Annotations'
            {
            match("Annotations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:83:7: ( 'VariableDefinition' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:83:9: 'VariableDefinition'
            {
            match("VariableDefinition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "RULE_BOOST"
    public final void mRULE_BOOST() throws RecognitionException {
        try {
            int _type = RULE_BOOST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7424:12: ( '^' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7424:14: '^' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            match('^'); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7424:18: ( '0' .. '9' )+
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
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7424:19: '0' .. '9'
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7424:30: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7424:31: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7424:35: ( '0' .. '9' )+
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
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7424:36: '0' .. '9'
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

    // $ANTLR start "RULE_QUOTEDNAMEWITHWC"
    public final void mRULE_QUOTEDNAMEWITHWC() throws RecognitionException {
        try {
            int _type = RULE_QUOTEDNAMEWITHWC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7426:23: ( '\"' ( ' ' )? RULE_NAMEWITHWC ( ' ' ( RULE_NAMEWITHWC )? )* '\"' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7426:25: '\"' ( ' ' )? RULE_NAMEWITHWC ( ' ' ( RULE_NAMEWITHWC )? )* '\"'
            {
            match('\"'); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7426:29: ( ' ' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==' ') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7426:29: ' '
                    {
                    match(' '); 

                    }
                    break;

            }

            mRULE_NAMEWITHWC(); 
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7426:50: ( ' ' ( RULE_NAMEWITHWC )? )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7426:51: ' ' ( RULE_NAMEWITHWC )?
            	    {
            	    match(' '); 
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7426:55: ( RULE_NAMEWITHWC )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0=='*'||LA5_0=='<'||(LA5_0>='>' && LA5_0<='?')||(LA5_0>='A' && LA5_0<=']')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7426:55: RULE_NAMEWITHWC
            	            {
            	            mRULE_NAMEWITHWC(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUOTEDNAMEWITHWC"

    // $ANTLR start "RULE_ESCAPEDSPECIALCHAR"
    public final void mRULE_ESCAPEDSPECIALCHAR() throws RecognitionException {
        try {
            int _type = RULE_ESCAPEDSPECIALCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7428:25: ( '\\\\' RULE_LUCENESPECIALCHAR )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7428:27: '\\\\' RULE_LUCENESPECIALCHAR
            {
            match('\\'); 
            mRULE_LUCENESPECIALCHAR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPEDSPECIALCHAR"

    // $ANTLR start "RULE_NAMEWITHWC"
    public final void mRULE_NAMEWITHWC() throws RecognitionException {
        try {
            int _type = RULE_NAMEWITHWC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' | RULE_ESCAPEDSPECIALCHAR ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | RULE_ESCAPEDSPECIALCHAR | '.' )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' | RULE_ESCAPEDSPECIALCHAR ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | RULE_ESCAPEDSPECIALCHAR | '.' )*
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' | RULE_ESCAPEDSPECIALCHAR )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt7=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt7=2;
                }
                break;
            case '_':
                {
                alt7=3;
                }
                break;
            case '*':
                {
                alt7=4;
                }
                break;
            case '?':
                {
                alt7=5;
                }
                break;
            case '<':
                {
                alt7=6;
                }
                break;
            case '>':
                {
                alt7=7;
                }
                break;
            case '[':
                {
                alt7=8;
                }
                break;
            case ']':
                {
                alt7=9;
                }
                break;
            case '\\':
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:20: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:29: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:38: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:42: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:46: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:50: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:54: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:58: '['
                    {
                    match('['); 

                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:62: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:66: RULE_ESCAPEDSPECIALCHAR
                    {
                    mRULE_ESCAPEDSPECIALCHAR(); 

                    }
                    break;

            }

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:91: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | RULE_ESCAPEDSPECIALCHAR | '.' )*
            loop8:
            do {
                int alt8=13;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:92: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:101: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:110: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:114: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:123: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:127: '?'
            	    {
            	    match('?'); 

            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:131: '<'
            	    {
            	    match('<'); 

            	    }
            	    break;
            	case 8 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:135: '>'
            	    {
            	    match('>'); 

            	    }
            	    break;
            	case 9 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:139: '['
            	    {
            	    match('['); 

            	    }
            	    break;
            	case 10 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:143: ']'
            	    {
            	    match(']'); 

            	    }
            	    break;
            	case 11 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:147: RULE_ESCAPEDSPECIALCHAR
            	    {
            	    mRULE_ESCAPEDSPECIALCHAR(); 

            	    }
            	    break;
            	case 12 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7430:171: '.'
            	    {
            	    match('.'); 

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
    // $ANTLR end "RULE_NAMEWITHWC"

    // $ANTLR start "RULE_PATHWITHWC"
    public final void mRULE_PATHWITHWC() throws RecognitionException {
        try {
            int _type = RULE_PATHWITHWC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7432:17: ( ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7432:19: ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )*
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7432:19: ( 'A' .. 'Z' ':' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='A' && LA9_0<='Z')) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==':') ) {
                    alt9=1;
                }
                else {
                    alt9=2;}
            }
            else if ( (LA9_0=='/'||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7432:20: 'A' .. 'Z' ':'
                    {
                    matchRange('A','Z'); 
                    match(':'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7432:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' )
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7432:62: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '.' | '/' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*'||(LA10_0>='.' && LA10_0<='9')||LA10_0=='?'||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    break loop10;
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

    // $ANTLR start "RULE_LUCENESPECIALCHAR"
    public final void mRULE_LUCENESPECIALCHAR() throws RecognitionException {
        try {
            int _type = RULE_LUCENESPECIALCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:24: ( ( '+' | '-' | '&&' | '||' | '!' | '(' | ')' | '{' | '}' | '[' | ']' | '^' | '\"' | '~' | '*' | '?' | ':' | '\\\\' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:26: ( '+' | '-' | '&&' | '||' | '!' | '(' | ')' | '{' | '}' | '[' | ']' | '^' | '\"' | '~' | '*' | '?' | ':' | '\\\\' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:26: ( '+' | '-' | '&&' | '||' | '!' | '(' | ')' | '{' | '}' | '[' | ']' | '^' | '\"' | '~' | '*' | '?' | ':' | '\\\\' )
            int alt11=18;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt11=1;
                }
                break;
            case '-':
                {
                alt11=2;
                }
                break;
            case '&':
                {
                alt11=3;
                }
                break;
            case '|':
                {
                alt11=4;
                }
                break;
            case '!':
                {
                alt11=5;
                }
                break;
            case '(':
                {
                alt11=6;
                }
                break;
            case ')':
                {
                alt11=7;
                }
                break;
            case '{':
                {
                alt11=8;
                }
                break;
            case '}':
                {
                alt11=9;
                }
                break;
            case '[':
                {
                alt11=10;
                }
                break;
            case ']':
                {
                alt11=11;
                }
                break;
            case '^':
                {
                alt11=12;
                }
                break;
            case '\"':
                {
                alt11=13;
                }
                break;
            case '~':
                {
                alt11=14;
                }
                break;
            case '*':
                {
                alt11=15;
                }
                break;
            case '?':
                {
                alt11=16;
                }
                break;
            case ':':
                {
                alt11=17;
                }
                break;
            case '\\':
                {
                alt11=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:27: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:31: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:35: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:40: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:45: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:49: '('
                    {
                    match('('); 

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:53: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:57: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 9 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:61: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 10 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:65: '['
                    {
                    match('['); 

                    }
                    break;
                case 11 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:69: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 12 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:73: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 13 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:77: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 14 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:81: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 15 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:85: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 16 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:89: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 17 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:93: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 18 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7434:97: '\\\\'
                    {
                    match('\\'); 

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
    // $ANTLR end "RULE_LUCENESPECIALCHAR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7436:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7436:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7436:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7436:11: '^'
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7436:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    break loop13;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7438:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7438:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7438:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7438:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7440:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop16;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7442:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7442:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7442:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7442:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7444:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7444:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7444:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7444:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop19;
                }
            } while (true);

            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7444:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7444:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7444:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7444:41: '\\r'
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7446:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7446:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7446:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7448:16: ( . )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:7448:18: .
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
        // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | RULE_BOOST | RULE_QUOTEDNAMEWITHWC | RULE_ESCAPEDSPECIALCHAR | RULE_NAMEWITHWC | RULE_PATHWITHWC | RULE_LUCENESPECIALCHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=86;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:448: RULE_BOOST
                {
                mRULE_BOOST(); 

                }
                break;
            case 75 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:459: RULE_QUOTEDNAMEWITHWC
                {
                mRULE_QUOTEDNAMEWITHWC(); 

                }
                break;
            case 76 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:481: RULE_ESCAPEDSPECIALCHAR
                {
                mRULE_ESCAPEDSPECIALCHAR(); 

                }
                break;
            case 77 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:505: RULE_NAMEWITHWC
                {
                mRULE_NAMEWITHWC(); 

                }
                break;
            case 78 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:521: RULE_PATHWITHWC
                {
                mRULE_PATHWITHWC(); 

                }
                break;
            case 79 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:537: RULE_LUCENESPECIALCHAR
                {
                mRULE_LUCENESPECIALCHAR(); 

                }
                break;
            case 80 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:560: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 81 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:568: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 82 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:577: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 83 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:589: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 84 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:605: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 85 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:621: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 86 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dsl.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dsl/ui/contentassist/antlr/internal/InternalLuceneQuery.g:1:629: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA8_eotS =
        "\1\1\15\uffff";
    static final String DFA8_eofS =
        "\16\uffff";
    static final String DFA8_minS =
        "\1\52\15\uffff";
    static final String DFA8_maxS =
        "\1\172\15\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14";
    static final String DFA8_specialS =
        "\16\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\6\3\uffff\1\15\1\uffff\12\5\2\uffff\1\10\1\uffff\1\11\1"+
            "\7\1\uffff\32\3\1\12\1\14\1\13\1\uffff\1\4\1\uffff\32\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 7430:91: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | RULE_ESCAPEDSPECIALCHAR | '.' )*";
        }
    }
    static final String DFA23_eotS =
        "\66\uffff";
    static final String DFA23_eofS =
        "\66\uffff";
    static final String DFA23_minS =
        "\1\0\65\uffff";
    static final String DFA23_maxS =
        "\1\uffff\65\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\3\1\4\1\5\1\7\1\10\1\12\1\13\1\15\1\17\1\20\1\21"+
        "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\37"+
        "\1\45\1\47\1\50\1\52\1\53\1\65\1\104\1\105\1\112\1\113\1\114\11"+
        "\115\1\116\3\117\1\121\1\122\1\125\1\126";
    static final String DFA23_specialS =
        "\1\0\65\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\65\2\64\2\65\1\64\22\65\1\64\1\16\1\43\3\65\1\23\1\63\1"+
            "\24\1\25\1\50\1\17\1\65\1\14\1\65\1\56\12\62\1\26\1\65\1\52"+
            "\1\65\1\53\1\51\1\65\1\22\1\46\1\37\1\31\1\36\1\27\2\46\1\35"+
            "\3\46\1\40\1\15\1\20\1\34\1\46\1\30\1\46\1\41\1\32\1\33\4\46"+
            "\1\54\1\44\1\55\1\42\1\47\1\65\1\4\1\45\1\5\2\45\1\3\2\45\1"+
            "\12\3\45\1\6\1\11\1\45\1\1\2\45\1\2\1\7\1\13\1\10\4\45\1\57"+
            "\1\21\1\60\1\61\uff81\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | RULE_BOOST | RULE_QUOTEDNAMEWITHWC | RULE_ESCAPEDSPECIALCHAR | RULE_NAMEWITHWC | RULE_PATHWITHWC | RULE_LUCENESPECIALCHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0=='p') ) {s = 1;}

                        else if ( (LA23_0=='s') ) {s = 2;}

                        else if ( (LA23_0=='f') ) {s = 3;}

                        else if ( (LA23_0=='a') ) {s = 4;}

                        else if ( (LA23_0=='c') ) {s = 5;}

                        else if ( (LA23_0=='m') ) {s = 6;}

                        else if ( (LA23_0=='t') ) {s = 7;}

                        else if ( (LA23_0=='v') ) {s = 8;}

                        else if ( (LA23_0=='n') ) {s = 9;}

                        else if ( (LA23_0=='i') ) {s = 10;}

                        else if ( (LA23_0=='u') ) {s = 11;}

                        else if ( (LA23_0=='-') ) {s = 12;}

                        else if ( (LA23_0=='N') ) {s = 13;}

                        else if ( (LA23_0=='!') ) {s = 14;}

                        else if ( (LA23_0=='+') ) {s = 15;}

                        else if ( (LA23_0=='O') ) {s = 16;}

                        else if ( (LA23_0=='|') ) {s = 17;}

                        else if ( (LA23_0=='A') ) {s = 18;}

                        else if ( (LA23_0=='&') ) {s = 19;}

                        else if ( (LA23_0=='(') ) {s = 20;}

                        else if ( (LA23_0==')') ) {s = 21;}

                        else if ( (LA23_0==':') ) {s = 22;}

                        else if ( (LA23_0=='F') ) {s = 23;}

                        else if ( (LA23_0=='R') ) {s = 24;}

                        else if ( (LA23_0=='D') ) {s = 25;}

                        else if ( (LA23_0=='U') ) {s = 26;}

                        else if ( (LA23_0=='V') ) {s = 27;}

                        else if ( (LA23_0=='P') ) {s = 28;}

                        else if ( (LA23_0=='I') ) {s = 29;}

                        else if ( (LA23_0=='E') ) {s = 30;}

                        else if ( (LA23_0=='C') ) {s = 31;}

                        else if ( (LA23_0=='M') ) {s = 32;}

                        else if ( (LA23_0=='T') ) {s = 33;}

                        else if ( (LA23_0=='^') ) {s = 34;}

                        else if ( (LA23_0=='\"') ) {s = 35;}

                        else if ( (LA23_0=='\\') ) {s = 36;}

                        else if ( (LA23_0=='b'||(LA23_0>='d' && LA23_0<='e')||(LA23_0>='g' && LA23_0<='h')||(LA23_0>='j' && LA23_0<='l')||LA23_0=='o'||(LA23_0>='q' && LA23_0<='r')||(LA23_0>='w' && LA23_0<='z')) ) {s = 37;}

                        else if ( (LA23_0=='B'||(LA23_0>='G' && LA23_0<='H')||(LA23_0>='J' && LA23_0<='L')||LA23_0=='Q'||LA23_0=='S'||(LA23_0>='W' && LA23_0<='Z')) ) {s = 38;}

                        else if ( (LA23_0=='_') ) {s = 39;}

                        else if ( (LA23_0=='*') ) {s = 40;}

                        else if ( (LA23_0=='?') ) {s = 41;}

                        else if ( (LA23_0=='<') ) {s = 42;}

                        else if ( (LA23_0=='>') ) {s = 43;}

                        else if ( (LA23_0=='[') ) {s = 44;}

                        else if ( (LA23_0==']') ) {s = 45;}

                        else if ( (LA23_0=='/') ) {s = 46;}

                        else if ( (LA23_0=='{') ) {s = 47;}

                        else if ( (LA23_0=='}') ) {s = 48;}

                        else if ( (LA23_0=='~') ) {s = 49;}

                        else if ( ((LA23_0>='0' && LA23_0<='9')) ) {s = 50;}

                        else if ( (LA23_0=='\'') ) {s = 51;}

                        else if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 52;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||(LA23_0>='#' && LA23_0<='%')||LA23_0==','||LA23_0=='.'||LA23_0==';'||LA23_0=='='||LA23_0=='@'||LA23_0=='`'||(LA23_0>='\u007F' && LA23_0<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}