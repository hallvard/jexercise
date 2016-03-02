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
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int RULE_XML_TEXT=7;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__9=9;
    public static final int T__60=60;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=8;
    public static final int RULE_STRING_CONTENT=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalXemfsLexer() {;} 
    public InternalXemfsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXemfsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXemfs.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXemfs.g:11:6: ( 'emfs' )
            // InternalXemfs.g:11:8: 'emfs'
            {
            match("emfs"); 


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
            // InternalXemfs.g:12:7: ( '#' )
            // InternalXemfs.g:12:9: '#'
            {
            match('#'); 

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
            // InternalXemfs.g:13:7: ( 'extends' )
            // InternalXemfs.g:13:9: 'extends'
            {
            match("extends"); 


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
            // InternalXemfs.g:14:7: ( ';' )
            // InternalXemfs.g:14:9: ';'
            {
            match(';'); 

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
            // InternalXemfs.g:15:7: ( '/' )
            // InternalXemfs.g:15:9: '/'
            {
            match('/'); 

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
            // InternalXemfs.g:16:7: ( '.' )
            // InternalXemfs.g:16:9: '.'
            {
            match('.'); 

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
            // InternalXemfs.g:17:7: ( ',' )
            // InternalXemfs.g:17:9: ','
            {
            match(','); 

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
            // InternalXemfs.g:18:7: ( '$' )
            // InternalXemfs.g:18:9: '$'
            {
            match('$'); 

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
            // InternalXemfs.g:19:7: ( '=' )
            // InternalXemfs.g:19:9: '='
            {
            match('='); 

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
            // InternalXemfs.g:20:7: ( '*' )
            // InternalXemfs.g:20:9: '*'
            {
            match('*'); 

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
            // InternalXemfs.g:21:7: ( '@' )
            // InternalXemfs.g:21:9: '@'
            {
            match('@'); 

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
            // InternalXemfs.g:22:7: ( ':' )
            // InternalXemfs.g:22:9: ':'
            {
            match(':'); 

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
            // InternalXemfs.g:23:7: ( '---' )
            // InternalXemfs.g:23:9: '---'
            {
            match("---"); 


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
            // InternalXemfs.g:24:7: ( '{' )
            // InternalXemfs.g:24:9: '{'
            {
            match('{'); 

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
            // InternalXemfs.g:25:7: ( '}' )
            // InternalXemfs.g:25:9: '}'
            {
            match('}'); 

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
            // InternalXemfs.g:26:7: ( '[' )
            // InternalXemfs.g:26:9: '['
            {
            match('['); 

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
            // InternalXemfs.g:27:7: ( ']' )
            // InternalXemfs.g:27:9: ']'
            {
            match(']'); 

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
            // InternalXemfs.g:28:7: ( 'http' )
            // InternalXemfs.g:28:9: 'http'
            {
            match("http"); 


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
            // InternalXemfs.g:29:7: ( 'https' )
            // InternalXemfs.g:29:9: 'https'
            {
            match("https"); 


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
            // InternalXemfs.g:30:7: ( 'ftp' )
            // InternalXemfs.g:30:9: 'ftp'
            {
            match("ftp"); 


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
            // InternalXemfs.g:31:7: ( 'file' )
            // InternalXemfs.g:31:9: 'file'
            {
            match("file"); 


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
            // InternalXemfs.g:32:7: ( '//' )
            // InternalXemfs.g:32:9: '//'
            {
            match("//"); 


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
            // InternalXemfs.g:33:7: ( '0' )
            // InternalXemfs.g:33:9: '0'
            {
            match('0'); 

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
            // InternalXemfs.g:34:7: ( '1' )
            // InternalXemfs.g:34:9: '1'
            {
            match('1'); 

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
            // InternalXemfs.g:35:7: ( '2' )
            // InternalXemfs.g:35:9: '2'
            {
            match('2'); 

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
            // InternalXemfs.g:36:7: ( '3' )
            // InternalXemfs.g:36:9: '3'
            {
            match('3'); 

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
            // InternalXemfs.g:37:7: ( '4' )
            // InternalXemfs.g:37:9: '4'
            {
            match('4'); 

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
            // InternalXemfs.g:38:7: ( '5' )
            // InternalXemfs.g:38:9: '5'
            {
            match('5'); 

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
            // InternalXemfs.g:39:7: ( '6' )
            // InternalXemfs.g:39:9: '6'
            {
            match('6'); 

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
            // InternalXemfs.g:40:7: ( '7' )
            // InternalXemfs.g:40:9: '7'
            {
            match('7'); 

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
            // InternalXemfs.g:41:7: ( '8' )
            // InternalXemfs.g:41:9: '8'
            {
            match('8'); 

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
            // InternalXemfs.g:42:7: ( '9' )
            // InternalXemfs.g:42:9: '9'
            {
            match('9'); 

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
            // InternalXemfs.g:43:7: ( 'git' )
            // InternalXemfs.g:43:9: 'git'
            {
            match("git"); 


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
            // InternalXemfs.g:44:7: ( 'dot.classpath' )
            // InternalXemfs.g:44:9: 'dot.classpath'
            {
            match("dot.classpath"); 


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
            // InternalXemfs.g:45:7: ( '(' )
            // InternalXemfs.g:45:9: '('
            {
            match('('); 

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
            // InternalXemfs.g:46:7: ( ')' )
            // InternalXemfs.g:46:9: ')'
            {
            match(')'); 

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
            // InternalXemfs.g:47:7: ( 'dot.project' )
            // InternalXemfs.g:47:9: 'dot.project'
            {
            match("dot.project"); 


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
            // InternalXemfs.g:48:7: ( '<<' )
            // InternalXemfs.g:48:9: '<<'
            {
            match("<<"); 


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
            // InternalXemfs.g:49:7: ( '>>' )
            // InternalXemfs.g:49:9: '>>'
            {
            match(">>"); 


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
            // InternalXemfs.g:50:7: ( '?' )
            // InternalXemfs.g:50:9: '?'
            {
            match('?'); 

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
            // InternalXemfs.g:51:7: ( 'b' )
            // InternalXemfs.g:51:9: 'b'
            {
            match('b'); 

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
            // InternalXemfs.g:52:7: ( 'o' )
            // InternalXemfs.g:52:9: 'o'
            {
            match('o'); 

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
            // InternalXemfs.g:53:7: ( 'x' )
            // InternalXemfs.g:53:9: 'x'
            {
            match('x'); 

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
            // InternalXemfs.g:54:7: ( 'a' )
            // InternalXemfs.g:54:9: 'a'
            {
            match('a'); 

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
            // InternalXemfs.g:55:7: ( 'c' )
            // InternalXemfs.g:55:9: 'c'
            {
            match('c'); 

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
            // InternalXemfs.g:56:7: ( 'd' )
            // InternalXemfs.g:56:9: 'd'
            {
            match('d'); 

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
            // InternalXemfs.g:57:7: ( 'e' )
            // InternalXemfs.g:57:9: 'e'
            {
            match('e'); 

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
            // InternalXemfs.g:58:7: ( 'f' )
            // InternalXemfs.g:58:9: 'f'
            {
            match('f'); 

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
            // InternalXemfs.g:59:7: ( 'source-folder' )
            // InternalXemfs.g:59:9: 'source-folder'
            {
            match("source-folder"); 


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
            // InternalXemfs.g:60:7: ( 'output-folder' )
            // InternalXemfs.g:60:9: 'output-folder'
            {
            match("output-folder"); 


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
            // InternalXemfs.g:61:7: ( 'library-jar' )
            // InternalXemfs.g:61:9: 'library-jar'
            {
            match("library-jar"); 


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
            // InternalXemfs.g:62:7: ( 'class-container' )
            // InternalXemfs.g:62:9: 'class-container'
            {
            match("class-container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "RULE_STRING_CONTENT"
    public final void mRULE_STRING_CONTENT() throws RecognitionException {
        try {
            int _type = RULE_STRING_CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXemfs.g:3410:21: ( '8<---' ( '\\r' )? '\\n' ( options {greedy=false; } : . )* '\\n--->8' )
            // InternalXemfs.g:3410:23: '8<---' ( '\\r' )? '\\n' ( options {greedy=false; } : . )* '\\n--->8'
            {
            match("8<---"); 

            // InternalXemfs.g:3410:31: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXemfs.g:3410:31: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // InternalXemfs.g:3410:42: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='-') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='-') ) {
                            int LA2_4 = input.LA(4);

                            if ( (LA2_4=='-') ) {
                                int LA2_5 = input.LA(5);

                                if ( (LA2_5=='>') ) {
                                    int LA2_6 = input.LA(6);

                                    if ( (LA2_6=='8') ) {
                                        alt2=2;
                                    }
                                    else if ( ((LA2_6>='\u0000' && LA2_6<='7')||(LA2_6>='9' && LA2_6<='\uFFFF')) ) {
                                        alt2=1;
                                    }


                                }
                                else if ( ((LA2_5>='\u0000' && LA2_5<='=')||(LA2_5>='?' && LA2_5<='\uFFFF')) ) {
                                    alt2=1;
                                }


                            }
                            else if ( ((LA2_4>='\u0000' && LA2_4<=',')||(LA2_4>='.' && LA2_4<='\uFFFF')) ) {
                                alt2=1;
                            }


                        }
                        else if ( ((LA2_3>='\u0000' && LA2_3<=',')||(LA2_3>='.' && LA2_3<='\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<=',')||(LA2_1>='.' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXemfs.g:3410:70: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("\n--->8"); 


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
            // InternalXemfs.g:3412:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+ )
            // InternalXemfs.g:3412:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+
            {
            // InternalXemfs.g:3412:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXemfs.g:3412:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalXemfs.g:3412:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )+
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
            	    // InternalXemfs.g:
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
            // InternalXemfs.g:3414:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalXemfs.g:3414:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalXemfs.g:3414:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalXemfs.g:3414:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalXemfs.g:3414:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalXemfs.g:3414:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalXemfs.g:3414:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalXemfs.g:3414:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalXemfs.g:3414:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalXemfs.g:3414:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalXemfs.g:3414:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalXemfs.g:3416:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXemfs.g:3416:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXemfs.g:3416:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalXemfs.g:
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

    // $ANTLR start "RULE_XML_TEXT"
    public final void mRULE_XML_TEXT() throws RecognitionException {
        try {
            int _type = RULE_XML_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXemfs.g:3418:15: ( '>' ( '<' | ~ ( ( '<' | '>' ) ) (~ ( '<' ) )* '<' ) )
            // InternalXemfs.g:3418:17: '>' ( '<' | ~ ( ( '<' | '>' ) ) (~ ( '<' ) )* '<' )
            {
            match('>'); 
            // InternalXemfs.g:3418:21: ( '<' | ~ ( ( '<' | '>' ) ) (~ ( '<' ) )* '<' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='<') ) {
                alt10=1;
            }
            else if ( ((LA10_0>='\u0000' && LA10_0<=';')||LA10_0=='='||(LA10_0>='?' && LA10_0<='\uFFFF')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXemfs.g:3418:22: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // InternalXemfs.g:3418:26: ~ ( ( '<' | '>' ) ) (~ ( '<' ) )* '<'
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalXemfs.g:3418:39: (~ ( '<' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='\u0000' && LA9_0<=';')||(LA9_0>='=' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalXemfs.g:3418:39: ~ ( '<' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='\uFFFF') ) {
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

                    match('<'); 

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
    // $ANTLR end "RULE_XML_TEXT"

    public void mTokens() throws RecognitionException {
        // InternalXemfs.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_STRING_CONTENT | RULE_ID | RULE_STRING | RULE_WS | RULE_XML_TEXT )
        int alt11=57;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalXemfs.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // InternalXemfs.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // InternalXemfs.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // InternalXemfs.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // InternalXemfs.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // InternalXemfs.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // InternalXemfs.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // InternalXemfs.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // InternalXemfs.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // InternalXemfs.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // InternalXemfs.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // InternalXemfs.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // InternalXemfs.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // InternalXemfs.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // InternalXemfs.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // InternalXemfs.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // InternalXemfs.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // InternalXemfs.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // InternalXemfs.g:1:117: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // InternalXemfs.g:1:123: T__28
                {
                mT__28(); 

                }
                break;
            case 21 :
                // InternalXemfs.g:1:129: T__29
                {
                mT__29(); 

                }
                break;
            case 22 :
                // InternalXemfs.g:1:135: T__30
                {
                mT__30(); 

                }
                break;
            case 23 :
                // InternalXemfs.g:1:141: T__31
                {
                mT__31(); 

                }
                break;
            case 24 :
                // InternalXemfs.g:1:147: T__32
                {
                mT__32(); 

                }
                break;
            case 25 :
                // InternalXemfs.g:1:153: T__33
                {
                mT__33(); 

                }
                break;
            case 26 :
                // InternalXemfs.g:1:159: T__34
                {
                mT__34(); 

                }
                break;
            case 27 :
                // InternalXemfs.g:1:165: T__35
                {
                mT__35(); 

                }
                break;
            case 28 :
                // InternalXemfs.g:1:171: T__36
                {
                mT__36(); 

                }
                break;
            case 29 :
                // InternalXemfs.g:1:177: T__37
                {
                mT__37(); 

                }
                break;
            case 30 :
                // InternalXemfs.g:1:183: T__38
                {
                mT__38(); 

                }
                break;
            case 31 :
                // InternalXemfs.g:1:189: T__39
                {
                mT__39(); 

                }
                break;
            case 32 :
                // InternalXemfs.g:1:195: T__40
                {
                mT__40(); 

                }
                break;
            case 33 :
                // InternalXemfs.g:1:201: T__41
                {
                mT__41(); 

                }
                break;
            case 34 :
                // InternalXemfs.g:1:207: T__42
                {
                mT__42(); 

                }
                break;
            case 35 :
                // InternalXemfs.g:1:213: T__43
                {
                mT__43(); 

                }
                break;
            case 36 :
                // InternalXemfs.g:1:219: T__44
                {
                mT__44(); 

                }
                break;
            case 37 :
                // InternalXemfs.g:1:225: T__45
                {
                mT__45(); 

                }
                break;
            case 38 :
                // InternalXemfs.g:1:231: T__46
                {
                mT__46(); 

                }
                break;
            case 39 :
                // InternalXemfs.g:1:237: T__47
                {
                mT__47(); 

                }
                break;
            case 40 :
                // InternalXemfs.g:1:243: T__48
                {
                mT__48(); 

                }
                break;
            case 41 :
                // InternalXemfs.g:1:249: T__49
                {
                mT__49(); 

                }
                break;
            case 42 :
                // InternalXemfs.g:1:255: T__50
                {
                mT__50(); 

                }
                break;
            case 43 :
                // InternalXemfs.g:1:261: T__51
                {
                mT__51(); 

                }
                break;
            case 44 :
                // InternalXemfs.g:1:267: T__52
                {
                mT__52(); 

                }
                break;
            case 45 :
                // InternalXemfs.g:1:273: T__53
                {
                mT__53(); 

                }
                break;
            case 46 :
                // InternalXemfs.g:1:279: T__54
                {
                mT__54(); 

                }
                break;
            case 47 :
                // InternalXemfs.g:1:285: T__55
                {
                mT__55(); 

                }
                break;
            case 48 :
                // InternalXemfs.g:1:291: T__56
                {
                mT__56(); 

                }
                break;
            case 49 :
                // InternalXemfs.g:1:297: T__57
                {
                mT__57(); 

                }
                break;
            case 50 :
                // InternalXemfs.g:1:303: T__58
                {
                mT__58(); 

                }
                break;
            case 51 :
                // InternalXemfs.g:1:309: T__59
                {
                mT__59(); 

                }
                break;
            case 52 :
                // InternalXemfs.g:1:315: T__60
                {
                mT__60(); 

                }
                break;
            case 53 :
                // InternalXemfs.g:1:321: RULE_STRING_CONTENT
                {
                mRULE_STRING_CONTENT(); 

                }
                break;
            case 54 :
                // InternalXemfs.g:1:341: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 55 :
                // InternalXemfs.g:1:349: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // InternalXemfs.g:1:361: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 57 :
                // InternalXemfs.g:1:369: RULE_XML_TEXT
                {
                mRULE_XML_TEXT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\60\2\uffff\1\62\7\uffff\1\53\4\uffff\1\53\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101\1\102\1\53\1\105\5\uffff\1\110\1\112\1\113\1\114\1\116\2\53\3\uffff\2\53\3\uffff\4\53\14\uffff\2\53\4\uffff\1\53\3\uffff\1\53\1\uffff\4\53\1\137\1\53\1\141\1\53\1\143\5\53\1\151\1\53\1\uffff\1\154\1\uffff\1\155\2\uffff\4\53\1\uffff\1\53\1\165\4\uffff\5\53\1\uffff\4\53\1\177\4\53\1\uffff\17\53\1\u0093\3\53\1\uffff\1\u0097\1\53\1\u0099\1\uffff\1\53\1\uffff\1\u009b\1\uffff";
    static final String DFA11_eofS =
        "\u009c\uffff";
    static final String DFA11_minS =
        "\1\11\1\55\2\uffff\1\57\7\uffff\1\55\4\uffff\1\164\13\55\1\151\1\55\3\uffff\1\0\1\uffff\5\55\1\157\1\151\3\uffff\1\146\1\164\3\uffff\1\55\1\164\1\160\1\154\14\uffff\2\164\4\uffff\1\164\3\uffff\1\141\1\uffff\1\165\1\142\1\163\1\145\1\55\1\160\1\55\1\145\1\55\1\56\1\160\1\163\2\162\1\55\1\156\1\uffff\1\55\1\uffff\1\55\1\uffff\1\143\1\165\1\163\1\143\1\141\1\uffff\1\144\1\55\4\uffff\1\164\1\55\1\145\1\162\1\163\1\uffff\1\55\1\143\1\55\1\171\1\55\1\146\1\157\1\146\1\55\1\uffff\1\157\1\156\1\157\1\152\1\154\1\164\1\154\1\141\1\144\1\141\1\144\1\162\1\145\1\151\1\145\1\55\1\162\1\156\1\162\1\uffff\1\55\1\145\1\55\1\uffff\1\162\1\uffff\1\55\1\uffff";
    static final String DFA11_maxS =
        "\1\175\1\172\2\uffff\1\57\7\uffff\1\55\4\uffff\1\164\13\172\1\151\1\172\3\uffff\1\uffff\1\uffff\5\172\1\157\1\151\3\uffff\1\146\1\164\3\uffff\1\55\1\164\1\160\1\154\14\uffff\2\164\4\uffff\1\164\3\uffff\1\141\1\uffff\1\165\1\142\1\163\1\145\1\172\1\160\1\172\1\145\1\172\1\56\1\160\1\163\2\162\1\172\1\156\1\uffff\1\172\1\uffff\1\172\1\uffff\1\160\1\165\1\163\1\143\1\141\1\uffff\1\144\1\172\4\uffff\1\164\1\55\1\145\1\162\1\163\1\uffff\1\55\1\143\1\55\1\171\1\172\1\146\1\157\1\146\1\55\1\uffff\1\157\1\156\1\157\1\152\1\154\1\164\1\154\1\141\1\144\1\141\1\144\1\162\1\145\1\151\1\145\1\172\1\162\1\156\1\162\1\uffff\1\172\1\145\1\172\1\uffff\1\162\1\uffff\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff\1\16\1\17\1\20\1\21\16\uffff\1\43\1\44\1\46\1\uffff\1\50\7\uffff\1\66\1\67\1\70\2\uffff\1\57\1\26\1\5\4\uffff\1\60\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\65\1\37\1\40\2\uffff\1\56\1\47\1\71\1\51\1\uffff\1\52\1\53\1\54\1\uffff\1\55\20\uffff\1\15\1\uffff\1\24\1\uffff\1\41\5\uffff\1\1\2\uffff\1\22\1\25\1\42\1\45\5\uffff\1\23\11\uffff\1\3\23\uffff\1\63\3\uffff\1\62\1\uffff\1\61\1\uffff\1\64";
    static final String DFA11_specialS =
        "\42\uffff\1\0\171\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\55\2\uffff\1\55\22\uffff\1\55\1\uffff\1\54\1\2\1\7\2\uffff\1\54\1\37\1\40\1\11\1\uffff\1\6\1\14\1\5\1\4\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\13\1\3\1\41\1\10\1\42\1\43\1\12\32\53\1\17\1\uffff\1\20\2\53\1\uffff\1\47\1\44\1\50\1\36\1\1\1\22\1\35\1\21\3\53\1\52\2\53\1\45\3\53\1\51\4\53\1\46\2\53\1\15\1\uffff\1\16",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\56\12\53\1\57\2\53",
            "",
            "",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\66\12\53\1\65\6\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\2\uffff\1\100\4\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\103",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\104\13\53",
            "",
            "",
            "",
            "\76\107\1\106\uffc1\107",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\111\5\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\115\16\53",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
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
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "\1\131",
            "",
            "",
            "",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\140",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\142",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\152",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\153\7\53",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\156\14\uffff\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0098",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u009a",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    static class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_STRING_CONTENT | RULE_ID | RULE_STRING | RULE_WS | RULE_XML_TEXT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_34 = input.LA(1);

                        s = -1;
                        if ( (LA11_34=='>') ) {s = 70;}

                        else if ( ((LA11_34>='\u0000' && LA11_34<='=')||(LA11_34>='?' && LA11_34<='\uFFFF')) ) {s = 71;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}