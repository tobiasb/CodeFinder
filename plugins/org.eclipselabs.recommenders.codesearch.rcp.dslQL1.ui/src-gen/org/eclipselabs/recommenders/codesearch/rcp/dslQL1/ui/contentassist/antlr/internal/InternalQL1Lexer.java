package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQL1Lexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
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

    public InternalQL1Lexer() {;} 
    public InternalQL1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQL1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:11:7: ( 'where' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:11:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:12:7: ( 'Containing' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:12:9: 'Containing'
            {
            match("Containing"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:13:7: ( '(' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:13:9: '('
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:14:7: ( ')' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:14:9: ')'
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:15:7: ( 'and' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:15:9: 'and'
            {
            match("and"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:16:7: ( 'or' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:16:9: 'or'
            {
            match("or"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:17:7: ( 'is' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:17:9: 'is'
            {
            match("is"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:18:7: ( 'has' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:18:9: 'has'
            {
            match("has"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:19:7: ( ',' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:19:9: ','
            {
            match(','); 

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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:20:7: ( 'Methods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:20:9: 'Methods'
            {
            match("Methods"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:21:7: ( 'Types' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:21:9: 'Types'
            {
            match("Types"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:22:7: ( 'IsStatic' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:22:9: 'IsStatic'
            {
            match("IsStatic"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:23:7: ( 'IsPrivate' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:23:9: 'IsPrivate'
            {
            match("IsPrivate"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:24:7: ( 'IsPublic' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:24:9: 'IsPublic'
            {
            match("IsPublic"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:25:7: ( 'IsFinal' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:25:9: 'IsFinal'
            {
            match("IsFinal"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:26:7: ( 'IsAbstract' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:26:9: 'IsAbstract'
            {
            match("IsAbstract"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:27:7: ( 'IsProtected' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:27:9: 'IsProtected'
            {
            match("IsProtected"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:28:7: ( 'Name' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:28:9: 'Name'
            {
            match("Name"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:29:7: ( 'CalledMethods' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:29:9: 'CalledMethods'
            {
            match("CalledMethods"); 


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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:30:7: ( '!' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:30:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_NAMEWITHWC"
    public final void mRULE_NAMEWITHWC() throws RecognitionException {
        try {
            int _type = RULE_NAMEWITHWC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2452:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2452:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '*' | '?' | '<' | '>' | '[' | ']' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )*
            {
            if ( input.LA(1)=='*'||input.LA(1)=='<'||(input.LA(1)>='>' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2452:67: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '*' | '?' | '<' | '>' | '[' | ']' | '.' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*'||LA1_0=='.'||(LA1_0>='0' && LA1_0<='9')||LA1_0=='<'||(LA1_0>='>' && LA1_0<='?')||(LA1_0>='A' && LA1_0<='[')||LA1_0==']'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2454:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2454:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2454:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2454:11: '^'
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

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2454:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2456:10: ( ( '0' .. '9' )+ )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2456:12: ( '0' .. '9' )+
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2456:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2456:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2458:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2460:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2460:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2460:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2460:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2462:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2462:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2462:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2462:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2462:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2462:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2462:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2462:41: '\\r'
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2464:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2464:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2464:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2466:16: ( . )
            // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:2466:18: .
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
        // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_NAMEWITHWC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=28;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:130: RULE_NAMEWITHWC
                {
                mRULE_NAMEWITHWC(); 

                }
                break;
            case 22 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:146: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:154: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:163: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:175: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:191: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:207: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../org.eclipselabs.recommenders.codesearch.rcp.dslQL1.ui/src-gen/org/eclipselabs/recommenders/codesearch/rcp/dslQL1/ui/contentassist/antlr/internal/InternalQL1.g:1:215: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\2\32\2\uffff\4\32\1\uffff\4\32\1\uffff\1\32\1\27\2\uffff"+
        "\3\27\2\uffff\2\32\1\uffff\2\32\2\uffff\1\32\1\63\1\64\1\32\1\uffff"+
        "\4\32\7\uffff\3\32\1\100\2\uffff\1\101\12\32\2\uffff\7\32\1\125"+
        "\1\126\3\32\1\132\6\32\2\uffff\3\32\1\uffff\10\32\1\154\4\32\1\161"+
        "\3\32\1\uffff\1\165\2\32\1\170\1\uffff\3\32\1\uffff\1\174\1\32\1"+
        "\uffff\1\32\1\177\1\32\1\uffff\1\32\1\u0082\1\uffff\1\32\1\u0084"+
        "\1\uffff\1\32\1\uffff\1\u0086\1\uffff";
    static final String DFA13_eofS =
        "\u0087\uffff";
    static final String DFA13_minS =
        "\1\0\2\60\2\uffff\4\60\1\uffff\4\60\1\uffff\1\60\1\101\2\uffff"+
        "\2\0\1\52\2\uffff\2\60\1\uffff\2\60\2\uffff\1\60\2\52\1\60\1\uffff"+
        "\4\60\7\uffff\3\60\1\52\2\uffff\1\52\12\60\2\uffff\7\60\2\52\3\60"+
        "\1\52\6\60\2\uffff\3\60\1\uffff\10\60\1\52\4\60\1\52\3\60\1\uffff"+
        "\1\52\2\60\1\52\1\uffff\3\60\1\uffff\1\52\1\60\1\uffff\1\60\1\52"+
        "\1\60\1\uffff\1\60\1\52\1\uffff\1\60\1\52\1\uffff\1\60\1\uffff\1"+
        "\52\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\2\172\2\uffff\4\172\1\uffff\4\172\1\uffff\2\172\2\uffff"+
        "\2\uffff\1\57\2\uffff\2\172\1\uffff\2\172\2\uffff\4\172\1\uffff"+
        "\4\172\7\uffff\4\172\2\uffff\13\172\2\uffff\23\172\2\uffff\3\172"+
        "\1\uffff\21\172\1\uffff\4\172\1\uffff\3\172\1\uffff\2\172\1\uffff"+
        "\3\172\1\uffff\2\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1"+
        "\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\4\4\uffff\1\11\4\uffff\1\24\2\uffff\1\25\1\27\3"+
        "\uffff\1\33\1\34\2\uffff\1\25\2\uffff\1\3\1\4\4\uffff\1\11\4\uffff"+
        "\1\24\1\26\1\27\1\30\1\31\1\32\1\33\4\uffff\1\6\1\7\13\uffff\1\5"+
        "\1\10\23\uffff\1\22\1\1\3\uffff\1\13\21\uffff\1\12\4\uffff\1\17"+
        "\3\uffff\1\14\2\uffff\1\16\3\uffff\1\15\2\uffff\1\2\2\uffff\1\20"+
        "\1\uffff\1\21\1\uffff\1\23";
    static final String DFA13_specialS =
        "\1\2\22\uffff\1\0\1\1\162\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\16\1\23\4\27\1\24\1\3\1"+
            "\4\1\21\1\27\1\11\2\27\1\25\12\22\2\27\1\21\1\27\2\21\1\27\2"+
            "\17\1\2\5\17\1\14\3\17\1\12\1\15\5\17\1\13\6\17\1\21\1\27\1"+
            "\21\1\20\1\17\1\27\1\5\6\17\1\10\1\7\5\17\1\6\7\17\1\1\3\17"+
            "\uff85\27",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\7\31\1\30\22\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\34\15\31\1\33"+
            "\13\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31\1\37\14\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31\1\40\10\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\41\7\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\42\31\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\44\25\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\30\31\1\45\1\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\46\7\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\47\31\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\0\53",
            "\0\53",
            "\1\54\4\uffff\1\55",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\57\25\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31\1\60\14\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31\1\61\16\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31\1\62\26\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\65\7\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31\1\66\6\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\17\31\1\67\12\31",
            "\12\31\7\uffff\1\73\4\31\1\72\11\31\1\71\2\31\1\70\7\31\4"+
            "\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\14\31\1\74\15\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31\1\75\10\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31\1\76\6\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31\1\77\16\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\7\31\1\102\22\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\103\25\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31\1\104\6\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31\1\105\2\31"+
            "\1\106\5\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31\1\107\21\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\31\1\110\30\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\111\25\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\112\25\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\113\31\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\114\25\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31\1\115\13\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\116\7\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\117\31\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31\1\120\5\31"+
            "\1\121\13\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\31\1\122\30\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31\1\123\14\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\124\7\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31\1\127\21\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31\1\130\26\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31\1\131\26\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31\1\133\6\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\25\31\1\134\4\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31\1\135\6\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31\1\136\16\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\137\31\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31\1\140\6\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31\1\141\14\31",
            "\12\31\7\uffff\14\31\1\142\15\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\143\7\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31\1\144\21\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\145\31\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\146\25\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31\1\147\21\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31\1\150\16\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31\1\151\10\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31\1\152\21\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\153\25\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\2\31\1\155\27\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31\1\156\6\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\2\31\1\157\27\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\2\31\1\160\27\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\162\31\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31\1\163\14\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31\1\164\6\31",
            "",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\166\25\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31\1\167\6\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\2\31\1\171\27\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\6\31\1\172\23\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\7\31\1\173\22\31",
            "",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\175\25\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31\1\176\6\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31\1\u0080\13"+
            "\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31\1\u0081\26"+
            "\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31\1\u0083\26"+
            "\31",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\u0085\7"+
            "\31",
            "",
            "\1\32\3\uffff\1\32\1\uffff\12\31\2\uffff\1\32\1\uffff\2\32"+
            "\1\uffff\32\31\1\32\1\uffff\1\32\1\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_NAMEWITHWC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='\u0000' && LA13_19<='\uFFFF')) ) {s = 43;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 43;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='w') ) {s = 1;}

                        else if ( (LA13_0=='C') ) {s = 2;}

                        else if ( (LA13_0=='(') ) {s = 3;}

                        else if ( (LA13_0==')') ) {s = 4;}

                        else if ( (LA13_0=='a') ) {s = 5;}

                        else if ( (LA13_0=='o') ) {s = 6;}

                        else if ( (LA13_0=='i') ) {s = 7;}

                        else if ( (LA13_0=='h') ) {s = 8;}

                        else if ( (LA13_0==',') ) {s = 9;}

                        else if ( (LA13_0=='M') ) {s = 10;}

                        else if ( (LA13_0=='T') ) {s = 11;}

                        else if ( (LA13_0=='I') ) {s = 12;}

                        else if ( (LA13_0=='N') ) {s = 13;}

                        else if ( (LA13_0=='!') ) {s = 14;}

                        else if ( ((LA13_0>='A' && LA13_0<='B')||(LA13_0>='D' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='L')||(LA13_0>='O' && LA13_0<='S')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='g')||(LA13_0>='j' && LA13_0<='n')||(LA13_0>='p' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 15;}

                        else if ( (LA13_0=='^') ) {s = 16;}

                        else if ( (LA13_0=='*'||LA13_0=='<'||(LA13_0>='>' && LA13_0<='?')||LA13_0=='['||LA13_0==']') ) {s = 17;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 18;}

                        else if ( (LA13_0=='\"') ) {s = 19;}

                        else if ( (LA13_0=='\'') ) {s = 20;}

                        else if ( (LA13_0=='/') ) {s = 21;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 22;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||LA13_0=='+'||(LA13_0>='-' && LA13_0<='.')||(LA13_0>=':' && LA13_0<=';')||LA13_0=='='||LA13_0=='@'||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}