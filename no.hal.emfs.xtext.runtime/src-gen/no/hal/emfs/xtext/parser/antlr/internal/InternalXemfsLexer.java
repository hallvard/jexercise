package no.hal.emfs.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXemfsLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_STRING_CONTENT=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=7;

    // delegates
    // delegators

    public InternalXemfsLexer() {;} 
    public InternalXemfsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXemfsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:11:6: ( 'emfs' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:11:8: 'emfs'
            {
            match("emfs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:12:6: ( '#' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:12:8: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:13:7: ( 'extends' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:13:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:14:7: ( ';' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:15:7: ( '/' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:15:9: '/'
            {
            match('/'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:16:7: ( '.' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:16:9: '.'
            {
            match('.'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:17:7: ( ',' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:17:9: ','
            {
            match(','); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:18:7: ( '$' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:18:9: '$'
            {
            match('$'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:19:7: ( '=' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:19:9: '='
            {
            match('='); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:20:7: ( '*' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:20:9: '*'
            {
            match('*'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:21:7: ( '@' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:21:9: '@'
            {
            match('@'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:22:7: ( ':' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:22:9: ':'
            {
            match(':'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:23:7: ( '{' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:23:9: '{'
            {
            match('{'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:24:7: ( '}' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:24:9: '}'
            {
            match('}'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:25:7: ( 'http' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:25:9: 'http'
            {
            match("http"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:26:7: ( 'https' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:26:9: 'https'
            {
            match("https"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:27:7: ( 'ftp' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:27:9: 'ftp'
            {
            match("ftp"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:28:7: ( 'file' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:28:9: 'file'
            {
            match("file"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:29:7: ( '//' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:29:9: '//'
            {
            match("//"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:30:7: ( '0' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:30:9: '0'
            {
            match('0'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:31:7: ( '1' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:31:9: '1'
            {
            match('1'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:32:7: ( '2' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:32:9: '2'
            {
            match('2'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:33:7: ( '3' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:33:9: '3'
            {
            match('3'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:34:7: ( '4' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:34:9: '4'
            {
            match('4'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:35:7: ( '5' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:35:9: '5'
            {
            match('5'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:36:7: ( '6' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:36:9: '6'
            {
            match('6'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:37:7: ( '7' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:37:9: '7'
            {
            match('7'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:38:7: ( '8' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:38:9: '8'
            {
            match('8'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:39:7: ( '9' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:39:9: '9'
            {
            match('9'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:40:7: ( 'git' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:40:9: 'git'
            {
            match("git"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:41:7: ( 'dot.classpath' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:41:9: 'dot.classpath'
            {
            match("dot.classpath"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:42:7: ( '(' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:42:9: '('
            {
            match('('); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:43:7: ( ')' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:43:9: ')'
            {
            match(')'); 

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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:44:7: ( 'dot.project' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:44:9: 'dot.project'
            {
            match("dot.project"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:45:7: ( 'source-folder' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:45:9: 'source-folder'
            {
            match("source-folder"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:46:7: ( 'output-folder' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:46:9: 'output-folder'
            {
            match("output-folder"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:47:7: ( 'library-jar' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:47:9: 'library-jar'
            {
            match("library-jar"); 


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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:48:7: ( 'class-container' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:48:9: 'class-container'
            {
            match("class-container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_STRING_CONTENT"
    public final void mRULE_STRING_CONTENT() throws RecognitionException {
        try {
            int _type = RULE_STRING_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2449:21: ( '---8<---' ( '\\r' )? '\\n' ( options {greedy=false; } : . )* '\\n--->8---' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2449:23: '---8<---' ( '\\r' )? '\\n' ( options {greedy=false; } : . )* '\\n--->8---'
            {
            match("---8<---"); 

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2449:34: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2449:34: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2449:45: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2449:73: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("\n--->8---"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_CONTENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2451:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+ )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2451:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2451:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2451:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2451:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2453:137: ~ ( ( '\\\\' | '\\'' ) )
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2455:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2455:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2455:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_STRING_CONTENT | RULE_ID | RULE_STRING | RULE_WS )
        int alt9=42;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:128: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:134: T__29
                {
                mT__29(); 

                }
                break;
            case 23 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:140: T__30
                {
                mT__30(); 

                }
                break;
            case 24 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:146: T__31
                {
                mT__31(); 

                }
                break;
            case 25 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:152: T__32
                {
                mT__32(); 

                }
                break;
            case 26 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:158: T__33
                {
                mT__33(); 

                }
                break;
            case 27 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:164: T__34
                {
                mT__34(); 

                }
                break;
            case 28 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:170: T__35
                {
                mT__35(); 

                }
                break;
            case 29 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:176: T__36
                {
                mT__36(); 

                }
                break;
            case 30 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:182: T__37
                {
                mT__37(); 

                }
                break;
            case 31 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:188: T__38
                {
                mT__38(); 

                }
                break;
            case 32 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:194: T__39
                {
                mT__39(); 

                }
                break;
            case 33 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:200: T__40
                {
                mT__40(); 

                }
                break;
            case 34 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:206: T__41
                {
                mT__41(); 

                }
                break;
            case 35 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:212: T__42
                {
                mT__42(); 

                }
                break;
            case 36 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:218: T__43
                {
                mT__43(); 

                }
                break;
            case 37 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:224: T__44
                {
                mT__44(); 

                }
                break;
            case 38 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:230: T__45
                {
                mT__45(); 

                }
                break;
            case 39 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:236: RULE_STRING_CONTENT
                {
                mRULE_STRING_CONTENT(); 

                }
                break;
            case 40 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:256: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:264: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1:276: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA2_eotS =
        "\13\uffff";
    static final String DFA2_eofS =
        "\13\uffff";
    static final String DFA2_minS =
        "\2\0\1\uffff\7\0\1\uffff";
    static final String DFA2_maxS =
        "\2\uffff\1\uffff\7\uffff\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\7\uffff\1\2";
    static final String DFA2_specialS =
        "\1\3\1\10\1\uffff\1\6\1\7\1\4\1\5\1\1\1\2\1\0\1\uffff}>";
    static final String[] DFA2_transitionS = {
            "\12\2\1\1\ufff5\2",
            "\55\2\1\3\uffd2\2",
            "",
            "\55\2\1\4\uffd2\2",
            "\55\2\1\5\uffd2\2",
            "\76\2\1\6\uffc1\2",
            "\70\2\1\7\uffc7\2",
            "\55\2\1\10\uffd2\2",
            "\55\2\1\11\uffd2\2",
            "\55\2\1\12\uffd2\2",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    static class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 2449:45: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_9 = input.LA(1);

                        s = -1;
                        if ( (LA2_9=='-') ) {s = 10;}

                        else if ( ((LA2_9>='\u0000' && LA2_9<=',')||(LA2_9>='.' && LA2_9<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_7 = input.LA(1);

                        s = -1;
                        if ( (LA2_7=='-') ) {s = 8;}

                        else if ( ((LA2_7>='\u0000' && LA2_7<=',')||(LA2_7>='.' && LA2_7<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_8 = input.LA(1);

                        s = -1;
                        if ( (LA2_8=='-') ) {s = 9;}

                        else if ( ((LA2_8>='\u0000' && LA2_8<=',')||(LA2_8>='.' && LA2_8<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_0 = input.LA(1);

                        s = -1;
                        if ( (LA2_0=='\n') ) {s = 1;}

                        else if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                        s = -1;
                        if ( (LA2_5=='>') ) {s = 6;}

                        else if ( ((LA2_5>='\u0000' && LA2_5<='=')||(LA2_5>='?' && LA2_5<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                        s = -1;
                        if ( (LA2_6=='8') ) {s = 7;}

                        else if ( ((LA2_6>='\u0000' && LA2_6<='7')||(LA2_6>='9' && LA2_6<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_3 = input.LA(1);

                        s = -1;
                        if ( (LA2_3=='-') ) {s = 4;}

                        else if ( ((LA2_3>='\u0000' && LA2_3<=',')||(LA2_3>='.' && LA2_3<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_4 = input.LA(1);

                        s = -1;
                        if ( (LA2_4=='-') ) {s = 5;}

                        else if ( ((LA2_4>='\u0000' && LA2_4<=',')||(LA2_4>='.' && LA2_4<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_1 = input.LA(1);

                        s = -1;
                        if ( (LA2_1=='-') ) {s = 3;}

                        else if ( ((LA2_1>='\u0000' && LA2_1<=',')||(LA2_1>='.' && LA2_1<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\1\uffff\1\43\2\uffff\1\51\11\uffff\2\43\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\2\43\2\uffff\5\43\3\uffff\2\43\2\uffff\3\43\12\uffff\12\43\1\115\1\43\1\117\6\43\1\126\1\43\1\131\1\uffff\1\132\2\uffff\5\43\1\uffff\1\43\1\143\4\uffff\4\43\1\uffff\1\43\1\uffff\4\43\1\155\4\43\1\uffff\16\43\1\u0080\3\43\1\uffff\1\43\1\u0085\1\u0086\1\43\2\uffff\1\43\1\u0089\1\uffff";
    static final String DFA9_eofS =
        "\u008a\uffff";
    static final String DFA9_minS =
        "\1\11\1\155\2\uffff\1\57\11\uffff\1\164\1\151\12\55\1\151\1\157\2\uffff\1\157\1\165\1\151\1\154\1\55\3\uffff\1\146\1\164\2\uffff\1\164\1\160\1\154\12\uffff\2\164\1\165\1\164\1\142\1\141\1\55\1\163\1\145\1\160\1\55\1\145\1\55\1\56\1\162\1\160\1\162\1\163\1\70\1\55\1\156\1\55\1\uffff\1\55\1\uffff\2\143\1\165\1\141\1\163\1\74\1\uffff\1\144\1\55\4\uffff\1\145\1\164\1\162\1\55\1\uffff\1\163\1\uffff\2\55\1\171\1\143\1\55\2\146\1\55\1\157\1\uffff\2\157\1\152\1\156\2\154\1\141\1\164\2\144\1\162\1\141\2\145\1\55\1\151\2\162\1\uffff\1\156\2\55\1\145\2\uffff\1\162\1\55\1\uffff";
    static final String DFA9_maxS =
        "\1\175\1\170\2\uffff\1\57\11\uffff\2\164\12\172\1\151\1\157\2\uffff\1\157\1\165\1\151\1\154\1\55\3\uffff\1\146\1\164\2\uffff\1\164\1\160\1\154\12\uffff\2\164\1\165\1\164\1\142\1\141\1\55\1\163\1\145\1\160\1\172\1\145\1\172\1\56\1\162\1\160\1\162\1\163\1\70\1\172\1\156\1\172\1\uffff\1\172\1\uffff\1\160\1\143\1\165\1\141\1\163\1\74\1\uffff\1\144\1\172\4\uffff\1\145\1\164\1\162\1\55\1\uffff\1\163\1\uffff\2\55\1\171\1\143\1\172\2\146\1\55\1\157\1\uffff\2\157\1\152\1\156\2\154\1\141\1\164\2\144\1\162\1\141\2\145\1\172\1\151\2\162\1\uffff\1\156\2\172\1\145\2\uffff\1\162\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\16\uffff\1\40\1\41\5\uffff\1\50\1\51\1\52\2\uffff\1\23\1\5\3\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\26\uffff\1\21\1\uffff\1\36\6\uffff\1\1\2\uffff\1\17\1\22\1\37\1\42\4\uffff\1\47\1\uffff\1\20\11\uffff\1\3\22\uffff\1\45\4\uffff\1\43\1\44\2\uffff\1\46";
    static final String DFA9_specialS =
        "\u008a\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\45\2\uffff\1\45\22\uffff\1\45\1\uffff\1\44\1\2\1\7\2\uffff\1\44\1\34\1\35\1\11\1\uffff\1\6\1\42\1\5\1\4\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\13\1\3\1\uffff\1\10\2\uffff\1\12\32\43\3\uffff\2\43\1\uffff\2\43\1\41\1\33\1\1\1\17\1\32\1\16\3\43\1\40\2\43\1\37\3\43\1\36\7\43\1\14\1\uffff\1\15",
            "\1\46\12\uffff\1\47",
            "",
            "",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\54\12\uffff\1\53",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
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
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\116",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\127",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\130\7\43",
            "",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\133\14\uffff\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0087",
            "",
            "",
            "\1\u0088",
            "\1\43\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_STRING_CONTENT | RULE_ID | RULE_STRING | RULE_WS );";
        }
    }
 

}