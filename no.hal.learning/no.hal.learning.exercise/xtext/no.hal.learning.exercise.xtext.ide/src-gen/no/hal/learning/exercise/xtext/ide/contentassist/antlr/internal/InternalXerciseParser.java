package no.hal.learning.exercise.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import no.hal.learning.exercise.xtext.services.XerciseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXerciseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'yes'", "'true'", "'no'", "'false'", "'-'", "'x'", "'activated'", "'changed'", "'broughtToTop'", "'closed'", "'deactivated'", "'opened'", "'executeSuccess'", "'executeFailure'", "'create'", "'terminate'", "'resume'", "'suspend'", "'stepInto'", "'stepOver'", "'stepReturn'", "'stepEnd'", "'breakpoint'", "'evaluation'", "'exercise'", "'.'", "'part'", "'ref'", "'/'", "'+-'", "'('", "')'", "'['", "']'", "'junit'", "'{'", "'}'", "','", "'java'", "'edit'", "'launch'", "'perspective'", "'#'", "'command'", "'debug'", "'~'", "'v'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
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
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalXerciseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXerciseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXerciseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXercise.g"; }


    	private XerciseGrammarAccess grammarAccess;

    	public void setGrammarAccess(XerciseGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleExercise"
    // InternalXercise.g:53:1: entryRuleExercise : ruleExercise EOF ;
    public final void entryRuleExercise() throws RecognitionException {
        try {
            // InternalXercise.g:54:1: ( ruleExercise EOF )
            // InternalXercise.g:55:1: ruleExercise EOF
            {
             before(grammarAccess.getExerciseRule()); 
            pushFollow(FOLLOW_1);
            ruleExercise();

            state._fsp--;

             after(grammarAccess.getExerciseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExercise"


    // $ANTLR start "ruleExercise"
    // InternalXercise.g:62:1: ruleExercise : ( ( rule__Exercise__Group__0 ) ) ;
    public final void ruleExercise() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:66:2: ( ( ( rule__Exercise__Group__0 ) ) )
            // InternalXercise.g:67:2: ( ( rule__Exercise__Group__0 ) )
            {
            // InternalXercise.g:67:2: ( ( rule__Exercise__Group__0 ) )
            // InternalXercise.g:68:3: ( rule__Exercise__Group__0 )
            {
             before(grammarAccess.getExerciseAccess().getGroup()); 
            // InternalXercise.g:69:3: ( rule__Exercise__Group__0 )
            // InternalXercise.g:69:4: rule__Exercise__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getGroup()); 

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
    // $ANTLR end "ruleExercise"


    // $ANTLR start "entryRuleQName"
    // InternalXercise.g:78:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // InternalXercise.g:79:1: ( ruleQName EOF )
            // InternalXercise.g:80:1: ruleQName EOF
            {
             before(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // InternalXercise.g:87:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:91:2: ( ( ( rule__QName__Group__0 ) ) )
            // InternalXercise.g:92:2: ( ( rule__QName__Group__0 ) )
            {
            // InternalXercise.g:92:2: ( ( rule__QName__Group__0 ) )
            // InternalXercise.g:93:3: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // InternalXercise.g:94:3: ( rule__QName__Group__0 )
            // InternalXercise.g:94:4: rule__QName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleAbstractExercisePart"
    // InternalXercise.g:103:1: entryRuleAbstractExercisePart : ruleAbstractExercisePart EOF ;
    public final void entryRuleAbstractExercisePart() throws RecognitionException {
        try {
            // InternalXercise.g:104:1: ( ruleAbstractExercisePart EOF )
            // InternalXercise.g:105:1: ruleAbstractExercisePart EOF
            {
             before(grammarAccess.getAbstractExercisePartRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractExercisePart();

            state._fsp--;

             after(grammarAccess.getAbstractExercisePartRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractExercisePart"


    // $ANTLR start "ruleAbstractExercisePart"
    // InternalXercise.g:112:1: ruleAbstractExercisePart : ( ( rule__AbstractExercisePart__Alternatives ) ) ;
    public final void ruleAbstractExercisePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:116:2: ( ( ( rule__AbstractExercisePart__Alternatives ) ) )
            // InternalXercise.g:117:2: ( ( rule__AbstractExercisePart__Alternatives ) )
            {
            // InternalXercise.g:117:2: ( ( rule__AbstractExercisePart__Alternatives ) )
            // InternalXercise.g:118:3: ( rule__AbstractExercisePart__Alternatives )
            {
             before(grammarAccess.getAbstractExercisePartAccess().getAlternatives()); 
            // InternalXercise.g:119:3: ( rule__AbstractExercisePart__Alternatives )
            // InternalXercise.g:119:4: rule__AbstractExercisePart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractExercisePart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractExercisePartAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractExercisePart"


    // $ANTLR start "entryRuleExercisePart"
    // InternalXercise.g:128:1: entryRuleExercisePart : ruleExercisePart EOF ;
    public final void entryRuleExercisePart() throws RecognitionException {
        try {
            // InternalXercise.g:129:1: ( ruleExercisePart EOF )
            // InternalXercise.g:130:1: ruleExercisePart EOF
            {
             before(grammarAccess.getExercisePartRule()); 
            pushFollow(FOLLOW_1);
            ruleExercisePart();

            state._fsp--;

             after(grammarAccess.getExercisePartRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExercisePart"


    // $ANTLR start "ruleExercisePart"
    // InternalXercise.g:137:1: ruleExercisePart : ( ( rule__ExercisePart__Group__0 ) ) ;
    public final void ruleExercisePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:141:2: ( ( ( rule__ExercisePart__Group__0 ) ) )
            // InternalXercise.g:142:2: ( ( rule__ExercisePart__Group__0 ) )
            {
            // InternalXercise.g:142:2: ( ( rule__ExercisePart__Group__0 ) )
            // InternalXercise.g:143:3: ( rule__ExercisePart__Group__0 )
            {
             before(grammarAccess.getExercisePartAccess().getGroup()); 
            // InternalXercise.g:144:3: ( rule__ExercisePart__Group__0 )
            // InternalXercise.g:144:4: rule__ExercisePart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExercisePart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExercisePartAccess().getGroup()); 

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
    // $ANTLR end "ruleExercisePart"


    // $ANTLR start "entryRuleExercisePartRef"
    // InternalXercise.g:153:1: entryRuleExercisePartRef : ruleExercisePartRef EOF ;
    public final void entryRuleExercisePartRef() throws RecognitionException {
        try {
            // InternalXercise.g:154:1: ( ruleExercisePartRef EOF )
            // InternalXercise.g:155:1: ruleExercisePartRef EOF
            {
             before(grammarAccess.getExercisePartRefRule()); 
            pushFollow(FOLLOW_1);
            ruleExercisePartRef();

            state._fsp--;

             after(grammarAccess.getExercisePartRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExercisePartRef"


    // $ANTLR start "ruleExercisePartRef"
    // InternalXercise.g:162:1: ruleExercisePartRef : ( ( rule__ExercisePartRef__Group__0 ) ) ;
    public final void ruleExercisePartRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:166:2: ( ( ( rule__ExercisePartRef__Group__0 ) ) )
            // InternalXercise.g:167:2: ( ( rule__ExercisePartRef__Group__0 ) )
            {
            // InternalXercise.g:167:2: ( ( rule__ExercisePartRef__Group__0 ) )
            // InternalXercise.g:168:3: ( rule__ExercisePartRef__Group__0 )
            {
             before(grammarAccess.getExercisePartRefAccess().getGroup()); 
            // InternalXercise.g:169:3: ( rule__ExercisePartRef__Group__0 )
            // InternalXercise.g:169:4: rule__ExercisePartRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExercisePartRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExercisePartRefAccess().getGroup()); 

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
    // $ANTLR end "ruleExercisePartRef"


    // $ANTLR start "entryRuleAnonymousExercisePart"
    // InternalXercise.g:178:1: entryRuleAnonymousExercisePart : ruleAnonymousExercisePart EOF ;
    public final void entryRuleAnonymousExercisePart() throws RecognitionException {
        try {
            // InternalXercise.g:179:1: ( ruleAnonymousExercisePart EOF )
            // InternalXercise.g:180:1: ruleAnonymousExercisePart EOF
            {
             before(grammarAccess.getAnonymousExercisePartRule()); 
            pushFollow(FOLLOW_1);
            ruleAnonymousExercisePart();

            state._fsp--;

             after(grammarAccess.getAnonymousExercisePartRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnonymousExercisePart"


    // $ANTLR start "ruleAnonymousExercisePart"
    // InternalXercise.g:187:1: ruleAnonymousExercisePart : ( ( rule__AnonymousExercisePart__Group__0 ) ) ;
    public final void ruleAnonymousExercisePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:191:2: ( ( ( rule__AnonymousExercisePart__Group__0 ) ) )
            // InternalXercise.g:192:2: ( ( rule__AnonymousExercisePart__Group__0 ) )
            {
            // InternalXercise.g:192:2: ( ( rule__AnonymousExercisePart__Group__0 ) )
            // InternalXercise.g:193:3: ( rule__AnonymousExercisePart__Group__0 )
            {
             before(grammarAccess.getAnonymousExercisePartAccess().getGroup()); 
            // InternalXercise.g:194:3: ( rule__AnonymousExercisePart__Group__0 )
            // InternalXercise.g:194:4: rule__AnonymousExercisePart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousExercisePart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnonymousExercisePartAccess().getGroup()); 

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
    // $ANTLR end "ruleAnonymousExercisePart"


    // $ANTLR start "entryRuleAbstractTask"
    // InternalXercise.g:203:1: entryRuleAbstractTask : ruleAbstractTask EOF ;
    public final void entryRuleAbstractTask() throws RecognitionException {
        try {
            // InternalXercise.g:204:1: ( ruleAbstractTask EOF )
            // InternalXercise.g:205:1: ruleAbstractTask EOF
            {
             before(grammarAccess.getAbstractTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getAbstractTaskRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractTask"


    // $ANTLR start "ruleAbstractTask"
    // InternalXercise.g:212:1: ruleAbstractTask : ( ( rule__AbstractTask__Alternatives ) ) ;
    public final void ruleAbstractTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:216:2: ( ( ( rule__AbstractTask__Alternatives ) ) )
            // InternalXercise.g:217:2: ( ( rule__AbstractTask__Alternatives ) )
            {
            // InternalXercise.g:217:2: ( ( rule__AbstractTask__Alternatives ) )
            // InternalXercise.g:218:3: ( rule__AbstractTask__Alternatives )
            {
             before(grammarAccess.getAbstractTaskAccess().getAlternatives()); 
            // InternalXercise.g:219:3: ( rule__AbstractTask__Alternatives )
            // InternalXercise.g:219:4: rule__AbstractTask__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractTask__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTaskAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractTask"


    // $ANTLR start "entryRuleTaskRef"
    // InternalXercise.g:228:1: entryRuleTaskRef : ruleTaskRef EOF ;
    public final void entryRuleTaskRef() throws RecognitionException {
        try {
            // InternalXercise.g:229:1: ( ruleTaskRef EOF )
            // InternalXercise.g:230:1: ruleTaskRef EOF
            {
             before(grammarAccess.getTaskRefRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskRef();

            state._fsp--;

             after(grammarAccess.getTaskRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTaskRef"


    // $ANTLR start "ruleTaskRef"
    // InternalXercise.g:237:1: ruleTaskRef : ( ( rule__TaskRef__Group__0 ) ) ;
    public final void ruleTaskRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:241:2: ( ( ( rule__TaskRef__Group__0 ) ) )
            // InternalXercise.g:242:2: ( ( rule__TaskRef__Group__0 ) )
            {
            // InternalXercise.g:242:2: ( ( rule__TaskRef__Group__0 ) )
            // InternalXercise.g:243:3: ( rule__TaskRef__Group__0 )
            {
             before(grammarAccess.getTaskRefAccess().getGroup()); 
            // InternalXercise.g:244:3: ( rule__TaskRef__Group__0 )
            // InternalXercise.g:244:4: rule__TaskRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskRefAccess().getGroup()); 

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
    // $ANTLR end "ruleTaskRef"


    // $ANTLR start "entryRuleTask"
    // InternalXercise.g:253:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalXercise.g:254:1: ( ruleTask EOF )
            // InternalXercise.g:255:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalXercise.g:262:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:266:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalXercise.g:267:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalXercise.g:267:2: ( ( rule__Task__Group__0 ) )
            // InternalXercise.g:268:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalXercise.g:269:3: ( rule__Task__Group__0 )
            // InternalXercise.g:269:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleQuestion"
    // InternalXercise.g:278:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalXercise.g:279:1: ( ruleQuestion EOF )
            // InternalXercise.g:280:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalXercise.g:287:1: ruleQuestion : ( ruleStringQuestion ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:291:2: ( ( ruleStringQuestion ) )
            // InternalXercise.g:292:2: ( ruleStringQuestion )
            {
            // InternalXercise.g:292:2: ( ruleStringQuestion )
            // InternalXercise.g:293:3: ruleStringQuestion
            {
             before(grammarAccess.getQuestionAccess().getStringQuestionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleStringQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getStringQuestionParserRuleCall()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleStringQuestion"
    // InternalXercise.g:303:1: entryRuleStringQuestion : ruleStringQuestion EOF ;
    public final void entryRuleStringQuestion() throws RecognitionException {
        try {
            // InternalXercise.g:304:1: ( ruleStringQuestion EOF )
            // InternalXercise.g:305:1: ruleStringQuestion EOF
            {
             before(grammarAccess.getStringQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringQuestion();

            state._fsp--;

             after(grammarAccess.getStringQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringQuestion"


    // $ANTLR start "ruleStringQuestion"
    // InternalXercise.g:312:1: ruleStringQuestion : ( ( rule__StringQuestion__QuestionAssignment ) ) ;
    public final void ruleStringQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:316:2: ( ( ( rule__StringQuestion__QuestionAssignment ) ) )
            // InternalXercise.g:317:2: ( ( rule__StringQuestion__QuestionAssignment ) )
            {
            // InternalXercise.g:317:2: ( ( rule__StringQuestion__QuestionAssignment ) )
            // InternalXercise.g:318:3: ( rule__StringQuestion__QuestionAssignment )
            {
             before(grammarAccess.getStringQuestionAccess().getQuestionAssignment()); 
            // InternalXercise.g:319:3: ( rule__StringQuestion__QuestionAssignment )
            // InternalXercise.g:319:4: rule__StringQuestion__QuestionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringQuestion__QuestionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringQuestionAccess().getQuestionAssignment()); 

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
    // $ANTLR end "ruleStringQuestion"


    // $ANTLR start "entryRuleAnswer"
    // InternalXercise.g:328:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:329:1: ( ruleAnswer EOF )
            // InternalXercise.g:330:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // InternalXercise.g:337:1: ruleAnswer : ( ( rule__Answer__Alternatives ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:341:2: ( ( ( rule__Answer__Alternatives ) ) )
            // InternalXercise.g:342:2: ( ( rule__Answer__Alternatives ) )
            {
            // InternalXercise.g:342:2: ( ( rule__Answer__Alternatives ) )
            // InternalXercise.g:343:3: ( rule__Answer__Alternatives )
            {
             before(grammarAccess.getAnswerAccess().getAlternatives()); 
            // InternalXercise.g:344:3: ( rule__Answer__Alternatives )
            // InternalXercise.g:344:4: rule__Answer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Answer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleOptionAnswer"
    // InternalXercise.g:353:1: entryRuleOptionAnswer : ruleOptionAnswer EOF ;
    public final void entryRuleOptionAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:354:1: ( ruleOptionAnswer EOF )
            // InternalXercise.g:355:1: ruleOptionAnswer EOF
            {
             before(grammarAccess.getOptionAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionAnswer();

            state._fsp--;

             after(grammarAccess.getOptionAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOptionAnswer"


    // $ANTLR start "ruleOptionAnswer"
    // InternalXercise.g:362:1: ruleOptionAnswer : ( ruleSimpleAnswer ) ;
    public final void ruleOptionAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:366:2: ( ( ruleSimpleAnswer ) )
            // InternalXercise.g:367:2: ( ruleSimpleAnswer )
            {
            // InternalXercise.g:367:2: ( ruleSimpleAnswer )
            // InternalXercise.g:368:3: ruleSimpleAnswer
            {
             before(grammarAccess.getOptionAnswerAccess().getSimpleAnswerParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSimpleAnswer();

            state._fsp--;

             after(grammarAccess.getOptionAnswerAccess().getSimpleAnswerParserRuleCall()); 

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
    // $ANTLR end "ruleOptionAnswer"


    // $ANTLR start "entryRuleSimpleAnswer"
    // InternalXercise.g:378:1: entryRuleSimpleAnswer : ruleSimpleAnswer EOF ;
    public final void entryRuleSimpleAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:379:1: ( ruleSimpleAnswer EOF )
            // InternalXercise.g:380:1: ruleSimpleAnswer EOF
            {
             before(grammarAccess.getSimpleAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleAnswer();

            state._fsp--;

             after(grammarAccess.getSimpleAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleAnswer"


    // $ANTLR start "ruleSimpleAnswer"
    // InternalXercise.g:387:1: ruleSimpleAnswer : ( ( rule__SimpleAnswer__Alternatives ) ) ;
    public final void ruleSimpleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:391:2: ( ( ( rule__SimpleAnswer__Alternatives ) ) )
            // InternalXercise.g:392:2: ( ( rule__SimpleAnswer__Alternatives ) )
            {
            // InternalXercise.g:392:2: ( ( rule__SimpleAnswer__Alternatives ) )
            // InternalXercise.g:393:3: ( rule__SimpleAnswer__Alternatives )
            {
             before(grammarAccess.getSimpleAnswerAccess().getAlternatives()); 
            // InternalXercise.g:394:3: ( rule__SimpleAnswer__Alternatives )
            // InternalXercise.g:394:4: rule__SimpleAnswer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAnswer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAnswerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSimpleAnswer"


    // $ANTLR start "entryRuleStringAnswer"
    // InternalXercise.g:403:1: entryRuleStringAnswer : ruleStringAnswer EOF ;
    public final void entryRuleStringAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:404:1: ( ruleStringAnswer EOF )
            // InternalXercise.g:405:1: ruleStringAnswer EOF
            {
             before(grammarAccess.getStringAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleStringAnswer();

            state._fsp--;

             after(grammarAccess.getStringAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringAnswer"


    // $ANTLR start "ruleStringAnswer"
    // InternalXercise.g:412:1: ruleStringAnswer : ( ( rule__StringAnswer__Group__0 ) ) ;
    public final void ruleStringAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:416:2: ( ( ( rule__StringAnswer__Group__0 ) ) )
            // InternalXercise.g:417:2: ( ( rule__StringAnswer__Group__0 ) )
            {
            // InternalXercise.g:417:2: ( ( rule__StringAnswer__Group__0 ) )
            // InternalXercise.g:418:3: ( rule__StringAnswer__Group__0 )
            {
             before(grammarAccess.getStringAnswerAccess().getGroup()); 
            // InternalXercise.g:419:3: ( rule__StringAnswer__Group__0 )
            // InternalXercise.g:419:4: rule__StringAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleStringAnswer"


    // $ANTLR start "entryRuleRegexAnswer"
    // InternalXercise.g:428:1: entryRuleRegexAnswer : ruleRegexAnswer EOF ;
    public final void entryRuleRegexAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:429:1: ( ruleRegexAnswer EOF )
            // InternalXercise.g:430:1: ruleRegexAnswer EOF
            {
             before(grammarAccess.getRegexAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleRegexAnswer();

            state._fsp--;

             after(grammarAccess.getRegexAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRegexAnswer"


    // $ANTLR start "ruleRegexAnswer"
    // InternalXercise.g:437:1: ruleRegexAnswer : ( ( rule__RegexAnswer__Group__0 ) ) ;
    public final void ruleRegexAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:441:2: ( ( ( rule__RegexAnswer__Group__0 ) ) )
            // InternalXercise.g:442:2: ( ( rule__RegexAnswer__Group__0 ) )
            {
            // InternalXercise.g:442:2: ( ( rule__RegexAnswer__Group__0 ) )
            // InternalXercise.g:443:3: ( rule__RegexAnswer__Group__0 )
            {
             before(grammarAccess.getRegexAnswerAccess().getGroup()); 
            // InternalXercise.g:444:3: ( rule__RegexAnswer__Group__0 )
            // InternalXercise.g:444:4: rule__RegexAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegexAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegexAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleRegexAnswer"


    // $ANTLR start "entryRuleNumberAnswer"
    // InternalXercise.g:453:1: entryRuleNumberAnswer : ruleNumberAnswer EOF ;
    public final void entryRuleNumberAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:454:1: ( ruleNumberAnswer EOF )
            // InternalXercise.g:455:1: ruleNumberAnswer EOF
            {
             before(grammarAccess.getNumberAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberAnswer();

            state._fsp--;

             after(grammarAccess.getNumberAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberAnswer"


    // $ANTLR start "ruleNumberAnswer"
    // InternalXercise.g:462:1: ruleNumberAnswer : ( ( rule__NumberAnswer__Group__0 ) ) ;
    public final void ruleNumberAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:466:2: ( ( ( rule__NumberAnswer__Group__0 ) ) )
            // InternalXercise.g:467:2: ( ( rule__NumberAnswer__Group__0 ) )
            {
            // InternalXercise.g:467:2: ( ( rule__NumberAnswer__Group__0 ) )
            // InternalXercise.g:468:3: ( rule__NumberAnswer__Group__0 )
            {
             before(grammarAccess.getNumberAnswerAccess().getGroup()); 
            // InternalXercise.g:469:3: ( rule__NumberAnswer__Group__0 )
            // InternalXercise.g:469:4: rule__NumberAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleNumberAnswer"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalXercise.g:478:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalXercise.g:479:1: ( ruleEDoubleObject EOF )
            // InternalXercise.g:480:1: ruleEDoubleObject EOF
            {
             before(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getEDoubleObjectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalXercise.g:487:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Group__0 ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:491:2: ( ( ( rule__EDoubleObject__Group__0 ) ) )
            // InternalXercise.g:492:2: ( ( rule__EDoubleObject__Group__0 ) )
            {
            // InternalXercise.g:492:2: ( ( rule__EDoubleObject__Group__0 ) )
            // InternalXercise.g:493:3: ( rule__EDoubleObject__Group__0 )
            {
             before(grammarAccess.getEDoubleObjectAccess().getGroup()); 
            // InternalXercise.g:494:3: ( rule__EDoubleObject__Group__0 )
            // InternalXercise.g:494:4: rule__EDoubleObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleBooleanAnswer"
    // InternalXercise.g:503:1: entryRuleBooleanAnswer : ruleBooleanAnswer EOF ;
    public final void entryRuleBooleanAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:504:1: ( ruleBooleanAnswer EOF )
            // InternalXercise.g:505:1: ruleBooleanAnswer EOF
            {
             before(grammarAccess.getBooleanAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanAnswer();

            state._fsp--;

             after(grammarAccess.getBooleanAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanAnswer"


    // $ANTLR start "ruleBooleanAnswer"
    // InternalXercise.g:512:1: ruleBooleanAnswer : ( ( rule__BooleanAnswer__Group__0 ) ) ;
    public final void ruleBooleanAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:516:2: ( ( ( rule__BooleanAnswer__Group__0 ) ) )
            // InternalXercise.g:517:2: ( ( rule__BooleanAnswer__Group__0 ) )
            {
            // InternalXercise.g:517:2: ( ( rule__BooleanAnswer__Group__0 ) )
            // InternalXercise.g:518:3: ( rule__BooleanAnswer__Group__0 )
            {
             before(grammarAccess.getBooleanAnswerAccess().getGroup()); 
            // InternalXercise.g:519:3: ( rule__BooleanAnswer__Group__0 )
            // InternalXercise.g:519:4: rule__BooleanAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanAnswer"


    // $ANTLR start "entryRuleOptionsAnswer"
    // InternalXercise.g:528:1: entryRuleOptionsAnswer : ruleOptionsAnswer EOF ;
    public final void entryRuleOptionsAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:529:1: ( ruleOptionsAnswer EOF )
            // InternalXercise.g:530:1: ruleOptionsAnswer EOF
            {
             before(grammarAccess.getOptionsAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionsAnswer();

            state._fsp--;

             after(grammarAccess.getOptionsAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOptionsAnswer"


    // $ANTLR start "ruleOptionsAnswer"
    // InternalXercise.g:537:1: ruleOptionsAnswer : ( ( rule__OptionsAnswer__Alternatives ) ) ;
    public final void ruleOptionsAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:541:2: ( ( ( rule__OptionsAnswer__Alternatives ) ) )
            // InternalXercise.g:542:2: ( ( rule__OptionsAnswer__Alternatives ) )
            {
            // InternalXercise.g:542:2: ( ( rule__OptionsAnswer__Alternatives ) )
            // InternalXercise.g:543:3: ( rule__OptionsAnswer__Alternatives )
            {
             before(grammarAccess.getOptionsAnswerAccess().getAlternatives()); 
            // InternalXercise.g:544:3: ( rule__OptionsAnswer__Alternatives )
            // InternalXercise.g:544:4: rule__OptionsAnswer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OptionsAnswer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAnswerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOptionsAnswer"


    // $ANTLR start "entryRuleSingleOptionsAnswer"
    // InternalXercise.g:553:1: entryRuleSingleOptionsAnswer : ruleSingleOptionsAnswer EOF ;
    public final void entryRuleSingleOptionsAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:554:1: ( ruleSingleOptionsAnswer EOF )
            // InternalXercise.g:555:1: ruleSingleOptionsAnswer EOF
            {
             before(grammarAccess.getSingleOptionsAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleOptionsAnswer();

            state._fsp--;

             after(grammarAccess.getSingleOptionsAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleOptionsAnswer"


    // $ANTLR start "ruleSingleOptionsAnswer"
    // InternalXercise.g:562:1: ruleSingleOptionsAnswer : ( ( rule__SingleOptionsAnswer__Alternatives ) ) ;
    public final void ruleSingleOptionsAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:566:2: ( ( ( rule__SingleOptionsAnswer__Alternatives ) ) )
            // InternalXercise.g:567:2: ( ( rule__SingleOptionsAnswer__Alternatives ) )
            {
            // InternalXercise.g:567:2: ( ( rule__SingleOptionsAnswer__Alternatives ) )
            // InternalXercise.g:568:3: ( rule__SingleOptionsAnswer__Alternatives )
            {
             before(grammarAccess.getSingleOptionsAnswerAccess().getAlternatives()); 
            // InternalXercise.g:569:3: ( rule__SingleOptionsAnswer__Alternatives )
            // InternalXercise.g:569:4: rule__SingleOptionsAnswer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleOptionsAnswer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingleOptionsAnswerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSingleOptionsAnswer"


    // $ANTLR start "entryRuleSingleBoxOptionsAnswer"
    // InternalXercise.g:578:1: entryRuleSingleBoxOptionsAnswer : ruleSingleBoxOptionsAnswer EOF ;
    public final void entryRuleSingleBoxOptionsAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:579:1: ( ruleSingleBoxOptionsAnswer EOF )
            // InternalXercise.g:580:1: ruleSingleBoxOptionsAnswer EOF
            {
             before(grammarAccess.getSingleBoxOptionsAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleBoxOptionsAnswer();

            state._fsp--;

             after(grammarAccess.getSingleBoxOptionsAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleBoxOptionsAnswer"


    // $ANTLR start "ruleSingleBoxOptionsAnswer"
    // InternalXercise.g:587:1: ruleSingleBoxOptionsAnswer : ( ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* ) ) ;
    public final void ruleSingleBoxOptionsAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:591:2: ( ( ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* ) ) )
            // InternalXercise.g:592:2: ( ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* ) )
            {
            // InternalXercise.g:592:2: ( ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* ) )
            // InternalXercise.g:593:3: ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* )
            {
            // InternalXercise.g:593:3: ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) )
            // InternalXercise.g:594:4: ( rule__SingleBoxOptionsAnswer__OptionsAssignment )
            {
             before(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsAssignment()); 
            // InternalXercise.g:595:4: ( rule__SingleBoxOptionsAnswer__OptionsAssignment )
            // InternalXercise.g:595:5: rule__SingleBoxOptionsAnswer__OptionsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__SingleBoxOptionsAnswer__OptionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsAssignment()); 

            }

            // InternalXercise.g:598:3: ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* )
            // InternalXercise.g:599:4: ( rule__SingleBoxOptionsAnswer__OptionsAssignment )*
            {
             before(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsAssignment()); 
            // InternalXercise.g:600:4: ( rule__SingleBoxOptionsAnswer__OptionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXercise.g:600:5: rule__SingleBoxOptionsAnswer__OptionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SingleBoxOptionsAnswer__OptionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsAssignment()); 

            }


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
    // $ANTLR end "ruleSingleBoxOptionsAnswer"


    // $ANTLR start "entryRuleSingleBoxOption"
    // InternalXercise.g:610:1: entryRuleSingleBoxOption : ruleSingleBoxOption EOF ;
    public final void entryRuleSingleBoxOption() throws RecognitionException {
        try {
            // InternalXercise.g:611:1: ( ruleSingleBoxOption EOF )
            // InternalXercise.g:612:1: ruleSingleBoxOption EOF
            {
             before(grammarAccess.getSingleBoxOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleBoxOption();

            state._fsp--;

             after(grammarAccess.getSingleBoxOptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleBoxOption"


    // $ANTLR start "ruleSingleBoxOption"
    // InternalXercise.g:619:1: ruleSingleBoxOption : ( ( rule__SingleBoxOption__Group__0 ) ) ;
    public final void ruleSingleBoxOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:623:2: ( ( ( rule__SingleBoxOption__Group__0 ) ) )
            // InternalXercise.g:624:2: ( ( rule__SingleBoxOption__Group__0 ) )
            {
            // InternalXercise.g:624:2: ( ( rule__SingleBoxOption__Group__0 ) )
            // InternalXercise.g:625:3: ( rule__SingleBoxOption__Group__0 )
            {
             before(grammarAccess.getSingleBoxOptionAccess().getGroup()); 
            // InternalXercise.g:626:3: ( rule__SingleBoxOption__Group__0 )
            // InternalXercise.g:626:4: rule__SingleBoxOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleBoxOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleBoxOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleBoxOption"


    // $ANTLR start "entryRuleSingleListOptionsAnswer"
    // InternalXercise.g:635:1: entryRuleSingleListOptionsAnswer : ruleSingleListOptionsAnswer EOF ;
    public final void entryRuleSingleListOptionsAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:636:1: ( ruleSingleListOptionsAnswer EOF )
            // InternalXercise.g:637:1: ruleSingleListOptionsAnswer EOF
            {
             before(grammarAccess.getSingleListOptionsAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleListOptionsAnswer();

            state._fsp--;

             after(grammarAccess.getSingleListOptionsAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleListOptionsAnswer"


    // $ANTLR start "ruleSingleListOptionsAnswer"
    // InternalXercise.g:644:1: ruleSingleListOptionsAnswer : ( ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* ) ) ;
    public final void ruleSingleListOptionsAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:648:2: ( ( ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* ) ) )
            // InternalXercise.g:649:2: ( ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* ) )
            {
            // InternalXercise.g:649:2: ( ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* ) )
            // InternalXercise.g:650:3: ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* )
            {
            // InternalXercise.g:650:3: ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) )
            // InternalXercise.g:651:4: ( rule__SingleListOptionsAnswer__OptionsAssignment )
            {
             before(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsAssignment()); 
            // InternalXercise.g:652:4: ( rule__SingleListOptionsAnswer__OptionsAssignment )
            // InternalXercise.g:652:5: rule__SingleListOptionsAnswer__OptionsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__SingleListOptionsAnswer__OptionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsAssignment()); 

            }

            // InternalXercise.g:655:3: ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* )
            // InternalXercise.g:656:4: ( rule__SingleListOptionsAnswer__OptionsAssignment )*
            {
             before(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsAssignment()); 
            // InternalXercise.g:657:4: ( rule__SingleListOptionsAnswer__OptionsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)||LA2_0==57) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXercise.g:657:5: rule__SingleListOptionsAnswer__OptionsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__SingleListOptionsAnswer__OptionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsAssignment()); 

            }


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
    // $ANTLR end "ruleSingleListOptionsAnswer"


    // $ANTLR start "entryRuleSingleListOption"
    // InternalXercise.g:667:1: entryRuleSingleListOption : ruleSingleListOption EOF ;
    public final void entryRuleSingleListOption() throws RecognitionException {
        try {
            // InternalXercise.g:668:1: ( ruleSingleListOption EOF )
            // InternalXercise.g:669:1: ruleSingleListOption EOF
            {
             before(grammarAccess.getSingleListOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleListOption();

            state._fsp--;

             after(grammarAccess.getSingleListOptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleListOption"


    // $ANTLR start "ruleSingleListOption"
    // InternalXercise.g:676:1: ruleSingleListOption : ( ( rule__SingleListOption__Group__0 ) ) ;
    public final void ruleSingleListOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:680:2: ( ( ( rule__SingleListOption__Group__0 ) ) )
            // InternalXercise.g:681:2: ( ( rule__SingleListOption__Group__0 ) )
            {
            // InternalXercise.g:681:2: ( ( rule__SingleListOption__Group__0 ) )
            // InternalXercise.g:682:3: ( rule__SingleListOption__Group__0 )
            {
             before(grammarAccess.getSingleListOptionAccess().getGroup()); 
            // InternalXercise.g:683:3: ( rule__SingleListOption__Group__0 )
            // InternalXercise.g:683:4: rule__SingleListOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleListOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleListOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleListOption"


    // $ANTLR start "entryRuleManyOptionsAnswer"
    // InternalXercise.g:692:1: entryRuleManyOptionsAnswer : ruleManyOptionsAnswer EOF ;
    public final void entryRuleManyOptionsAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:693:1: ( ruleManyOptionsAnswer EOF )
            // InternalXercise.g:694:1: ruleManyOptionsAnswer EOF
            {
             before(grammarAccess.getManyOptionsAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleManyOptionsAnswer();

            state._fsp--;

             after(grammarAccess.getManyOptionsAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManyOptionsAnswer"


    // $ANTLR start "ruleManyOptionsAnswer"
    // InternalXercise.g:701:1: ruleManyOptionsAnswer : ( ( ( rule__ManyOptionsAnswer__OptionsAssignment ) ) ( ( rule__ManyOptionsAnswer__OptionsAssignment )* ) ) ;
    public final void ruleManyOptionsAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:705:2: ( ( ( ( rule__ManyOptionsAnswer__OptionsAssignment ) ) ( ( rule__ManyOptionsAnswer__OptionsAssignment )* ) ) )
            // InternalXercise.g:706:2: ( ( ( rule__ManyOptionsAnswer__OptionsAssignment ) ) ( ( rule__ManyOptionsAnswer__OptionsAssignment )* ) )
            {
            // InternalXercise.g:706:2: ( ( ( rule__ManyOptionsAnswer__OptionsAssignment ) ) ( ( rule__ManyOptionsAnswer__OptionsAssignment )* ) )
            // InternalXercise.g:707:3: ( ( rule__ManyOptionsAnswer__OptionsAssignment ) ) ( ( rule__ManyOptionsAnswer__OptionsAssignment )* )
            {
            // InternalXercise.g:707:3: ( ( rule__ManyOptionsAnswer__OptionsAssignment ) )
            // InternalXercise.g:708:4: ( rule__ManyOptionsAnswer__OptionsAssignment )
            {
             before(grammarAccess.getManyOptionsAnswerAccess().getOptionsAssignment()); 
            // InternalXercise.g:709:4: ( rule__ManyOptionsAnswer__OptionsAssignment )
            // InternalXercise.g:709:5: rule__ManyOptionsAnswer__OptionsAssignment
            {
            pushFollow(FOLLOW_5);
            rule__ManyOptionsAnswer__OptionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getManyOptionsAnswerAccess().getOptionsAssignment()); 

            }

            // InternalXercise.g:712:3: ( ( rule__ManyOptionsAnswer__OptionsAssignment )* )
            // InternalXercise.g:713:4: ( rule__ManyOptionsAnswer__OptionsAssignment )*
            {
             before(grammarAccess.getManyOptionsAnswerAccess().getOptionsAssignment()); 
            // InternalXercise.g:714:4: ( rule__ManyOptionsAnswer__OptionsAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==43) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXercise.g:714:5: rule__ManyOptionsAnswer__OptionsAssignment
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ManyOptionsAnswer__OptionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getManyOptionsAnswerAccess().getOptionsAssignment()); 

            }


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
    // $ANTLR end "ruleManyOptionsAnswer"


    // $ANTLR start "entryRuleManyOption"
    // InternalXercise.g:724:1: entryRuleManyOption : ruleManyOption EOF ;
    public final void entryRuleManyOption() throws RecognitionException {
        try {
            // InternalXercise.g:725:1: ( ruleManyOption EOF )
            // InternalXercise.g:726:1: ruleManyOption EOF
            {
             before(grammarAccess.getManyOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleManyOption();

            state._fsp--;

             after(grammarAccess.getManyOptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManyOption"


    // $ANTLR start "ruleManyOption"
    // InternalXercise.g:733:1: ruleManyOption : ( ( rule__ManyOption__Group__0 ) ) ;
    public final void ruleManyOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:737:2: ( ( ( rule__ManyOption__Group__0 ) ) )
            // InternalXercise.g:738:2: ( ( rule__ManyOption__Group__0 ) )
            {
            // InternalXercise.g:738:2: ( ( rule__ManyOption__Group__0 ) )
            // InternalXercise.g:739:3: ( rule__ManyOption__Group__0 )
            {
             before(grammarAccess.getManyOptionAccess().getGroup()); 
            // InternalXercise.g:740:3: ( rule__ManyOption__Group__0 )
            // InternalXercise.g:740:4: rule__ManyOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManyOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleManyOption"


    // $ANTLR start "entryRuleJunitTestAnswer"
    // InternalXercise.g:749:1: entryRuleJunitTestAnswer : ruleJunitTestAnswer EOF ;
    public final void entryRuleJunitTestAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:750:1: ( ruleJunitTestAnswer EOF )
            // InternalXercise.g:751:1: ruleJunitTestAnswer EOF
            {
             before(grammarAccess.getJunitTestAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleJunitTestAnswer();

            state._fsp--;

             after(grammarAccess.getJunitTestAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJunitTestAnswer"


    // $ANTLR start "ruleJunitTestAnswer"
    // InternalXercise.g:758:1: ruleJunitTestAnswer : ( ( rule__JunitTestAnswer__Group__0 ) ) ;
    public final void ruleJunitTestAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:762:2: ( ( ( rule__JunitTestAnswer__Group__0 ) ) )
            // InternalXercise.g:763:2: ( ( rule__JunitTestAnswer__Group__0 ) )
            {
            // InternalXercise.g:763:2: ( ( rule__JunitTestAnswer__Group__0 ) )
            // InternalXercise.g:764:3: ( rule__JunitTestAnswer__Group__0 )
            {
             before(grammarAccess.getJunitTestAnswerAccess().getGroup()); 
            // InternalXercise.g:765:3: ( rule__JunitTestAnswer__Group__0 )
            // InternalXercise.g:765:4: rule__JunitTestAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJunitTestAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleJunitTestAnswer"


    // $ANTLR start "entryRuleJdtSourceEditAnswer"
    // InternalXercise.g:774:1: entryRuleJdtSourceEditAnswer : ruleJdtSourceEditAnswer EOF ;
    public final void entryRuleJdtSourceEditAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:775:1: ( ruleJdtSourceEditAnswer EOF )
            // InternalXercise.g:776:1: ruleJdtSourceEditAnswer EOF
            {
             before(grammarAccess.getJdtSourceEditAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleJdtSourceEditAnswer();

            state._fsp--;

             after(grammarAccess.getJdtSourceEditAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJdtSourceEditAnswer"


    // $ANTLR start "ruleJdtSourceEditAnswer"
    // InternalXercise.g:783:1: ruleJdtSourceEditAnswer : ( ( rule__JdtSourceEditAnswer__Group__0 ) ) ;
    public final void ruleJdtSourceEditAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:787:2: ( ( ( rule__JdtSourceEditAnswer__Group__0 ) ) )
            // InternalXercise.g:788:2: ( ( rule__JdtSourceEditAnswer__Group__0 ) )
            {
            // InternalXercise.g:788:2: ( ( rule__JdtSourceEditAnswer__Group__0 ) )
            // InternalXercise.g:789:3: ( rule__JdtSourceEditAnswer__Group__0 )
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getGroup()); 
            // InternalXercise.g:790:3: ( rule__JdtSourceEditAnswer__Group__0 )
            // InternalXercise.g:790:4: rule__JdtSourceEditAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJdtSourceEditAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleJdtSourceEditAnswer"


    // $ANTLR start "entryRuleJdtLaunchAnswer"
    // InternalXercise.g:799:1: entryRuleJdtLaunchAnswer : ruleJdtLaunchAnswer EOF ;
    public final void entryRuleJdtLaunchAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:800:1: ( ruleJdtLaunchAnswer EOF )
            // InternalXercise.g:801:1: ruleJdtLaunchAnswer EOF
            {
             before(grammarAccess.getJdtLaunchAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleJdtLaunchAnswer();

            state._fsp--;

             after(grammarAccess.getJdtLaunchAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJdtLaunchAnswer"


    // $ANTLR start "ruleJdtLaunchAnswer"
    // InternalXercise.g:808:1: ruleJdtLaunchAnswer : ( ( rule__JdtLaunchAnswer__Group__0 ) ) ;
    public final void ruleJdtLaunchAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:812:2: ( ( ( rule__JdtLaunchAnswer__Group__0 ) ) )
            // InternalXercise.g:813:2: ( ( rule__JdtLaunchAnswer__Group__0 ) )
            {
            // InternalXercise.g:813:2: ( ( rule__JdtLaunchAnswer__Group__0 ) )
            // InternalXercise.g:814:3: ( rule__JdtLaunchAnswer__Group__0 )
            {
             before(grammarAccess.getJdtLaunchAnswerAccess().getGroup()); 
            // InternalXercise.g:815:3: ( rule__JdtLaunchAnswer__Group__0 )
            // InternalXercise.g:815:4: rule__JdtLaunchAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JdtLaunchAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJdtLaunchAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleJdtLaunchAnswer"


    // $ANTLR start "entryRuleTaskAnswer"
    // InternalXercise.g:824:1: entryRuleTaskAnswer : ruleTaskAnswer EOF ;
    public final void entryRuleTaskAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:825:1: ( ruleTaskAnswer EOF )
            // InternalXercise.g:826:1: ruleTaskAnswer EOF
            {
             before(grammarAccess.getTaskAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskAnswer();

            state._fsp--;

             after(grammarAccess.getTaskAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTaskAnswer"


    // $ANTLR start "ruleTaskAnswer"
    // InternalXercise.g:833:1: ruleTaskAnswer : ( ( rule__TaskAnswer__Alternatives ) ) ;
    public final void ruleTaskAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:837:2: ( ( ( rule__TaskAnswer__Alternatives ) ) )
            // InternalXercise.g:838:2: ( ( rule__TaskAnswer__Alternatives ) )
            {
            // InternalXercise.g:838:2: ( ( rule__TaskAnswer__Alternatives ) )
            // InternalXercise.g:839:3: ( rule__TaskAnswer__Alternatives )
            {
             before(grammarAccess.getTaskAnswerAccess().getAlternatives()); 
            // InternalXercise.g:840:3: ( rule__TaskAnswer__Alternatives )
            // InternalXercise.g:840:4: rule__TaskAnswer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TaskAnswer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskAnswerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTaskAnswer"


    // $ANTLR start "entryRulePerspectiveTaskAnswer"
    // InternalXercise.g:849:1: entryRulePerspectiveTaskAnswer : rulePerspectiveTaskAnswer EOF ;
    public final void entryRulePerspectiveTaskAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:850:1: ( rulePerspectiveTaskAnswer EOF )
            // InternalXercise.g:851:1: rulePerspectiveTaskAnswer EOF
            {
             before(grammarAccess.getPerspectiveTaskAnswerRule()); 
            pushFollow(FOLLOW_1);
            rulePerspectiveTaskAnswer();

            state._fsp--;

             after(grammarAccess.getPerspectiveTaskAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerspectiveTaskAnswer"


    // $ANTLR start "rulePerspectiveTaskAnswer"
    // InternalXercise.g:858:1: rulePerspectiveTaskAnswer : ( ( rule__PerspectiveTaskAnswer__Group__0 ) ) ;
    public final void rulePerspectiveTaskAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:862:2: ( ( ( rule__PerspectiveTaskAnswer__Group__0 ) ) )
            // InternalXercise.g:863:2: ( ( rule__PerspectiveTaskAnswer__Group__0 ) )
            {
            // InternalXercise.g:863:2: ( ( rule__PerspectiveTaskAnswer__Group__0 ) )
            // InternalXercise.g:864:3: ( rule__PerspectiveTaskAnswer__Group__0 )
            {
             before(grammarAccess.getPerspectiveTaskAnswerAccess().getGroup()); 
            // InternalXercise.g:865:3: ( rule__PerspectiveTaskAnswer__Group__0 )
            // InternalXercise.g:865:4: rule__PerspectiveTaskAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveTaskAnswerAccess().getGroup()); 

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
    // $ANTLR end "rulePerspectiveTaskAnswer"


    // $ANTLR start "entryRulePartTaskAnswer"
    // InternalXercise.g:874:1: entryRulePartTaskAnswer : rulePartTaskAnswer EOF ;
    public final void entryRulePartTaskAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:875:1: ( rulePartTaskAnswer EOF )
            // InternalXercise.g:876:1: rulePartTaskAnswer EOF
            {
             before(grammarAccess.getPartTaskAnswerRule()); 
            pushFollow(FOLLOW_1);
            rulePartTaskAnswer();

            state._fsp--;

             after(grammarAccess.getPartTaskAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePartTaskAnswer"


    // $ANTLR start "rulePartTaskAnswer"
    // InternalXercise.g:883:1: rulePartTaskAnswer : ( ( rule__PartTaskAnswer__Group__0 ) ) ;
    public final void rulePartTaskAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:887:2: ( ( ( rule__PartTaskAnswer__Group__0 ) ) )
            // InternalXercise.g:888:2: ( ( rule__PartTaskAnswer__Group__0 ) )
            {
            // InternalXercise.g:888:2: ( ( rule__PartTaskAnswer__Group__0 ) )
            // InternalXercise.g:889:3: ( rule__PartTaskAnswer__Group__0 )
            {
             before(grammarAccess.getPartTaskAnswerAccess().getGroup()); 
            // InternalXercise.g:890:3: ( rule__PartTaskAnswer__Group__0 )
            // InternalXercise.g:890:4: rule__PartTaskAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartTaskAnswerAccess().getGroup()); 

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
    // $ANTLR end "rulePartTaskAnswer"


    // $ANTLR start "entryRuleCommandExecutionAnswer"
    // InternalXercise.g:899:1: entryRuleCommandExecutionAnswer : ruleCommandExecutionAnswer EOF ;
    public final void entryRuleCommandExecutionAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:900:1: ( ruleCommandExecutionAnswer EOF )
            // InternalXercise.g:901:1: ruleCommandExecutionAnswer EOF
            {
             before(grammarAccess.getCommandExecutionAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandExecutionAnswer();

            state._fsp--;

             after(grammarAccess.getCommandExecutionAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommandExecutionAnswer"


    // $ANTLR start "ruleCommandExecutionAnswer"
    // InternalXercise.g:908:1: ruleCommandExecutionAnswer : ( ( rule__CommandExecutionAnswer__Group__0 ) ) ;
    public final void ruleCommandExecutionAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:912:2: ( ( ( rule__CommandExecutionAnswer__Group__0 ) ) )
            // InternalXercise.g:913:2: ( ( rule__CommandExecutionAnswer__Group__0 ) )
            {
            // InternalXercise.g:913:2: ( ( rule__CommandExecutionAnswer__Group__0 ) )
            // InternalXercise.g:914:3: ( rule__CommandExecutionAnswer__Group__0 )
            {
             before(grammarAccess.getCommandExecutionAnswerAccess().getGroup()); 
            // InternalXercise.g:915:3: ( rule__CommandExecutionAnswer__Group__0 )
            // InternalXercise.g:915:4: rule__CommandExecutionAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandExecutionAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleCommandExecutionAnswer"


    // $ANTLR start "entryRuleDebugEventAnswer"
    // InternalXercise.g:924:1: entryRuleDebugEventAnswer : ruleDebugEventAnswer EOF ;
    public final void entryRuleDebugEventAnswer() throws RecognitionException {
        try {
            // InternalXercise.g:925:1: ( ruleDebugEventAnswer EOF )
            // InternalXercise.g:926:1: ruleDebugEventAnswer EOF
            {
             before(grammarAccess.getDebugEventAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleDebugEventAnswer();

            state._fsp--;

             after(grammarAccess.getDebugEventAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDebugEventAnswer"


    // $ANTLR start "ruleDebugEventAnswer"
    // InternalXercise.g:933:1: ruleDebugEventAnswer : ( ( rule__DebugEventAnswer__Group__0 ) ) ;
    public final void ruleDebugEventAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:937:2: ( ( ( rule__DebugEventAnswer__Group__0 ) ) )
            // InternalXercise.g:938:2: ( ( rule__DebugEventAnswer__Group__0 ) )
            {
            // InternalXercise.g:938:2: ( ( rule__DebugEventAnswer__Group__0 ) )
            // InternalXercise.g:939:3: ( rule__DebugEventAnswer__Group__0 )
            {
             before(grammarAccess.getDebugEventAnswerAccess().getGroup()); 
            // InternalXercise.g:940:3: ( rule__DebugEventAnswer__Group__0 )
            // InternalXercise.g:940:4: rule__DebugEventAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDebugEventAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleDebugEventAnswer"


    // $ANTLR start "rule__Exercise__Alternatives_2"
    // InternalXercise.g:948:1: rule__Exercise__Alternatives_2 : ( ( ( rule__Exercise__Group_2_0__0 ) ) | ( ( rule__Exercise__PartsAssignment_2_1 ) ) );
    public final void rule__Exercise__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:952:1: ( ( ( rule__Exercise__Group_2_0__0 ) ) | ( ( rule__Exercise__PartsAssignment_2_1 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalXercise.g:953:2: ( ( rule__Exercise__Group_2_0__0 ) )
                    {
                    // InternalXercise.g:953:2: ( ( rule__Exercise__Group_2_0__0 ) )
                    // InternalXercise.g:954:3: ( rule__Exercise__Group_2_0__0 )
                    {
                     before(grammarAccess.getExerciseAccess().getGroup_2_0()); 
                    // InternalXercise.g:955:3: ( rule__Exercise__Group_2_0__0 )
                    // InternalXercise.g:955:4: rule__Exercise__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExerciseAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:959:2: ( ( rule__Exercise__PartsAssignment_2_1 ) )
                    {
                    // InternalXercise.g:959:2: ( ( rule__Exercise__PartsAssignment_2_1 ) )
                    // InternalXercise.g:960:3: ( rule__Exercise__PartsAssignment_2_1 )
                    {
                     before(grammarAccess.getExerciseAccess().getPartsAssignment_2_1()); 
                    // InternalXercise.g:961:3: ( rule__Exercise__PartsAssignment_2_1 )
                    // InternalXercise.g:961:4: rule__Exercise__PartsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__PartsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExerciseAccess().getPartsAssignment_2_1()); 

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
    // $ANTLR end "rule__Exercise__Alternatives_2"


    // $ANTLR start "rule__AbstractExercisePart__Alternatives"
    // InternalXercise.g:969:1: rule__AbstractExercisePart__Alternatives : ( ( ruleExercisePart ) | ( ruleExercisePartRef ) );
    public final void rule__AbstractExercisePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:973:1: ( ( ruleExercisePart ) | ( ruleExercisePartRef ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==38) ) {
                    alt5=2;
                }
                else if ( (LA5_1==RULE_ID) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXercise.g:974:2: ( ruleExercisePart )
                    {
                    // InternalXercise.g:974:2: ( ruleExercisePart )
                    // InternalXercise.g:975:3: ruleExercisePart
                    {
                     before(grammarAccess.getAbstractExercisePartAccess().getExercisePartParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExercisePart();

                    state._fsp--;

                     after(grammarAccess.getAbstractExercisePartAccess().getExercisePartParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:980:2: ( ruleExercisePartRef )
                    {
                    // InternalXercise.g:980:2: ( ruleExercisePartRef )
                    // InternalXercise.g:981:3: ruleExercisePartRef
                    {
                     before(grammarAccess.getAbstractExercisePartAccess().getExercisePartRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExercisePartRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractExercisePartAccess().getExercisePartRefParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractExercisePart__Alternatives"


    // $ANTLR start "rule__AbstractTask__Alternatives"
    // InternalXercise.g:990:1: rule__AbstractTask__Alternatives : ( ( ruleTask ) | ( ruleTaskRef ) );
    public final void rule__AbstractTask__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:994:1: ( ( ruleTask ) | ( ruleTaskRef ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==38) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXercise.g:995:2: ( ruleTask )
                    {
                    // InternalXercise.g:995:2: ( ruleTask )
                    // InternalXercise.g:996:3: ruleTask
                    {
                     before(grammarAccess.getAbstractTaskAccess().getTaskParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTask();

                    state._fsp--;

                     after(grammarAccess.getAbstractTaskAccess().getTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1001:2: ( ruleTaskRef )
                    {
                    // InternalXercise.g:1001:2: ( ruleTaskRef )
                    // InternalXercise.g:1002:3: ruleTaskRef
                    {
                     before(grammarAccess.getAbstractTaskAccess().getTaskRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTaskRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractTaskAccess().getTaskRefParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractTask__Alternatives"


    // $ANTLR start "rule__Answer__Alternatives"
    // InternalXercise.g:1011:1: rule__Answer__Alternatives : ( ( ruleOptionAnswer ) | ( ruleOptionsAnswer ) | ( ruleTaskAnswer ) );
    public final void rule__Answer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1015:1: ( ( ruleOptionAnswer ) | ( ruleOptionsAnswer ) | ( ruleTaskAnswer ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 11:
            case 12:
            case 13:
            case 14:
            case 39:
                {
                alt7=1;
                }
                break;
            case 15:
            case 16:
            case 41:
            case 43:
            case 57:
                {
                alt7=2;
                }
                break;
            case 37:
            case 45:
            case 49:
            case 52:
            case 54:
            case 55:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXercise.g:1016:2: ( ruleOptionAnswer )
                    {
                    // InternalXercise.g:1016:2: ( ruleOptionAnswer )
                    // InternalXercise.g:1017:3: ruleOptionAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOptionAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1022:2: ( ruleOptionsAnswer )
                    {
                    // InternalXercise.g:1022:2: ( ruleOptionsAnswer )
                    // InternalXercise.g:1023:3: ruleOptionsAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getOptionsAnswerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOptionsAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getOptionsAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXercise.g:1028:2: ( ruleTaskAnswer )
                    {
                    // InternalXercise.g:1028:2: ( ruleTaskAnswer )
                    // InternalXercise.g:1029:3: ruleTaskAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getTaskAnswerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTaskAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getTaskAnswerParserRuleCall_2()); 

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
    // $ANTLR end "rule__Answer__Alternatives"


    // $ANTLR start "rule__SimpleAnswer__Alternatives"
    // InternalXercise.g:1038:1: rule__SimpleAnswer__Alternatives : ( ( ruleStringAnswer ) | ( ruleRegexAnswer ) | ( ruleNumberAnswer ) | ( ruleBooleanAnswer ) );
    public final void rule__SimpleAnswer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1042:1: ( ( ruleStringAnswer ) | ( ruleRegexAnswer ) | ( ruleNumberAnswer ) | ( ruleBooleanAnswer ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
                {
                alt8=3;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXercise.g:1043:2: ( ruleStringAnswer )
                    {
                    // InternalXercise.g:1043:2: ( ruleStringAnswer )
                    // InternalXercise.g:1044:3: ruleStringAnswer
                    {
                     before(grammarAccess.getSimpleAnswerAccess().getStringAnswerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringAnswer();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnswerAccess().getStringAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1049:2: ( ruleRegexAnswer )
                    {
                    // InternalXercise.g:1049:2: ( ruleRegexAnswer )
                    // InternalXercise.g:1050:3: ruleRegexAnswer
                    {
                     before(grammarAccess.getSimpleAnswerAccess().getRegexAnswerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRegexAnswer();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnswerAccess().getRegexAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXercise.g:1055:2: ( ruleNumberAnswer )
                    {
                    // InternalXercise.g:1055:2: ( ruleNumberAnswer )
                    // InternalXercise.g:1056:3: ruleNumberAnswer
                    {
                     before(grammarAccess.getSimpleAnswerAccess().getNumberAnswerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberAnswer();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnswerAccess().getNumberAnswerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXercise.g:1061:2: ( ruleBooleanAnswer )
                    {
                    // InternalXercise.g:1061:2: ( ruleBooleanAnswer )
                    // InternalXercise.g:1062:3: ruleBooleanAnswer
                    {
                     before(grammarAccess.getSimpleAnswerAccess().getBooleanAnswerParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanAnswer();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnswerAccess().getBooleanAnswerParserRuleCall_3()); 

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
    // $ANTLR end "rule__SimpleAnswer__Alternatives"


    // $ANTLR start "rule__BooleanAnswer__Alternatives_1"
    // InternalXercise.g:1071:1: rule__BooleanAnswer__Alternatives_1 : ( ( ( rule__BooleanAnswer__ValueAssignment_1_0 ) ) | ( ( rule__BooleanAnswer__Alternatives_1_1 ) ) );
    public final void rule__BooleanAnswer__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1075:1: ( ( ( rule__BooleanAnswer__ValueAssignment_1_0 ) ) | ( ( rule__BooleanAnswer__Alternatives_1_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=13 && LA9_0<=14)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXercise.g:1076:2: ( ( rule__BooleanAnswer__ValueAssignment_1_0 ) )
                    {
                    // InternalXercise.g:1076:2: ( ( rule__BooleanAnswer__ValueAssignment_1_0 ) )
                    // InternalXercise.g:1077:3: ( rule__BooleanAnswer__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getValueAssignment_1_0()); 
                    // InternalXercise.g:1078:3: ( rule__BooleanAnswer__ValueAssignment_1_0 )
                    // InternalXercise.g:1078:4: rule__BooleanAnswer__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanAnswer__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanAnswerAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1082:2: ( ( rule__BooleanAnswer__Alternatives_1_1 ) )
                    {
                    // InternalXercise.g:1082:2: ( ( rule__BooleanAnswer__Alternatives_1_1 ) )
                    // InternalXercise.g:1083:3: ( rule__BooleanAnswer__Alternatives_1_1 )
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getAlternatives_1_1()); 
                    // InternalXercise.g:1084:3: ( rule__BooleanAnswer__Alternatives_1_1 )
                    // InternalXercise.g:1084:4: rule__BooleanAnswer__Alternatives_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanAnswer__Alternatives_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanAnswerAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__BooleanAnswer__Alternatives_1"


    // $ANTLR start "rule__BooleanAnswer__ValueAlternatives_1_0_0"
    // InternalXercise.g:1092:1: rule__BooleanAnswer__ValueAlternatives_1_0_0 : ( ( 'yes' ) | ( 'true' ) );
    public final void rule__BooleanAnswer__ValueAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1096:1: ( ( 'yes' ) | ( 'true' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXercise.g:1097:2: ( 'yes' )
                    {
                    // InternalXercise.g:1097:2: ( 'yes' )
                    // InternalXercise.g:1098:3: 'yes'
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getValueYesKeyword_1_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanAnswerAccess().getValueYesKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1103:2: ( 'true' )
                    {
                    // InternalXercise.g:1103:2: ( 'true' )
                    // InternalXercise.g:1104:3: 'true'
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getValueTrueKeyword_1_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAnswerAccess().getValueTrueKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__BooleanAnswer__ValueAlternatives_1_0_0"


    // $ANTLR start "rule__BooleanAnswer__Alternatives_1_1"
    // InternalXercise.g:1113:1: rule__BooleanAnswer__Alternatives_1_1 : ( ( 'no' ) | ( 'false' ) );
    public final void rule__BooleanAnswer__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1117:1: ( ( 'no' ) | ( 'false' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalXercise.g:1118:2: ( 'no' )
                    {
                    // InternalXercise.g:1118:2: ( 'no' )
                    // InternalXercise.g:1119:3: 'no'
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getNoKeyword_1_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBooleanAnswerAccess().getNoKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1124:2: ( 'false' )
                    {
                    // InternalXercise.g:1124:2: ( 'false' )
                    // InternalXercise.g:1125:3: 'false'
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getFalseKeyword_1_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanAnswerAccess().getFalseKeyword_1_1_1()); 

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
    // $ANTLR end "rule__BooleanAnswer__Alternatives_1_1"


    // $ANTLR start "rule__OptionsAnswer__Alternatives"
    // InternalXercise.g:1134:1: rule__OptionsAnswer__Alternatives : ( ( ruleSingleOptionsAnswer ) | ( ruleManyOptionsAnswer ) );
    public final void rule__OptionsAnswer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1138:1: ( ( ruleSingleOptionsAnswer ) | ( ruleManyOptionsAnswer ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=15 && LA12_0<=16)||LA12_0==41||LA12_0==57) ) {
                alt12=1;
            }
            else if ( (LA12_0==43) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalXercise.g:1139:2: ( ruleSingleOptionsAnswer )
                    {
                    // InternalXercise.g:1139:2: ( ruleSingleOptionsAnswer )
                    // InternalXercise.g:1140:3: ruleSingleOptionsAnswer
                    {
                     before(grammarAccess.getOptionsAnswerAccess().getSingleOptionsAnswerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleOptionsAnswer();

                    state._fsp--;

                     after(grammarAccess.getOptionsAnswerAccess().getSingleOptionsAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1145:2: ( ruleManyOptionsAnswer )
                    {
                    // InternalXercise.g:1145:2: ( ruleManyOptionsAnswer )
                    // InternalXercise.g:1146:3: ruleManyOptionsAnswer
                    {
                     before(grammarAccess.getOptionsAnswerAccess().getManyOptionsAnswerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleManyOptionsAnswer();

                    state._fsp--;

                     after(grammarAccess.getOptionsAnswerAccess().getManyOptionsAnswerParserRuleCall_1()); 

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
    // $ANTLR end "rule__OptionsAnswer__Alternatives"


    // $ANTLR start "rule__SingleOptionsAnswer__Alternatives"
    // InternalXercise.g:1155:1: rule__SingleOptionsAnswer__Alternatives : ( ( ruleSingleBoxOptionsAnswer ) | ( ruleSingleListOptionsAnswer ) );
    public final void rule__SingleOptionsAnswer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1159:1: ( ( ruleSingleBoxOptionsAnswer ) | ( ruleSingleListOptionsAnswer ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=15 && LA13_0<=16)||LA13_0==57) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXercise.g:1160:2: ( ruleSingleBoxOptionsAnswer )
                    {
                    // InternalXercise.g:1160:2: ( ruleSingleBoxOptionsAnswer )
                    // InternalXercise.g:1161:3: ruleSingleBoxOptionsAnswer
                    {
                     before(grammarAccess.getSingleOptionsAnswerAccess().getSingleBoxOptionsAnswerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleBoxOptionsAnswer();

                    state._fsp--;

                     after(grammarAccess.getSingleOptionsAnswerAccess().getSingleBoxOptionsAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1166:2: ( ruleSingleListOptionsAnswer )
                    {
                    // InternalXercise.g:1166:2: ( ruleSingleListOptionsAnswer )
                    // InternalXercise.g:1167:3: ruleSingleListOptionsAnswer
                    {
                     before(grammarAccess.getSingleOptionsAnswerAccess().getSingleListOptionsAnswerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleListOptionsAnswer();

                    state._fsp--;

                     after(grammarAccess.getSingleOptionsAnswerAccess().getSingleListOptionsAnswerParserRuleCall_1()); 

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
    // $ANTLR end "rule__SingleOptionsAnswer__Alternatives"


    // $ANTLR start "rule__SingleListOption__Alternatives_0"
    // InternalXercise.g:1176:1: rule__SingleListOption__Alternatives_0 : ( ( ( rule__SingleListOption__Alternatives_0_0 ) ) | ( ( rule__SingleListOption__CorrectAssignment_0_1 ) ) );
    public final void rule__SingleListOption__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1180:1: ( ( ( rule__SingleListOption__Alternatives_0_0 ) ) | ( ( rule__SingleListOption__CorrectAssignment_0_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=15 && LA14_0<=16)) ) {
                alt14=1;
            }
            else if ( (LA14_0==57) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXercise.g:1181:2: ( ( rule__SingleListOption__Alternatives_0_0 ) )
                    {
                    // InternalXercise.g:1181:2: ( ( rule__SingleListOption__Alternatives_0_0 ) )
                    // InternalXercise.g:1182:3: ( rule__SingleListOption__Alternatives_0_0 )
                    {
                     before(grammarAccess.getSingleListOptionAccess().getAlternatives_0_0()); 
                    // InternalXercise.g:1183:3: ( rule__SingleListOption__Alternatives_0_0 )
                    // InternalXercise.g:1183:4: rule__SingleListOption__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleListOption__Alternatives_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleListOptionAccess().getAlternatives_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1187:2: ( ( rule__SingleListOption__CorrectAssignment_0_1 ) )
                    {
                    // InternalXercise.g:1187:2: ( ( rule__SingleListOption__CorrectAssignment_0_1 ) )
                    // InternalXercise.g:1188:3: ( rule__SingleListOption__CorrectAssignment_0_1 )
                    {
                     before(grammarAccess.getSingleListOptionAccess().getCorrectAssignment_0_1()); 
                    // InternalXercise.g:1189:3: ( rule__SingleListOption__CorrectAssignment_0_1 )
                    // InternalXercise.g:1189:4: rule__SingleListOption__CorrectAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleListOption__CorrectAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleListOptionAccess().getCorrectAssignment_0_1()); 

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
    // $ANTLR end "rule__SingleListOption__Alternatives_0"


    // $ANTLR start "rule__SingleListOption__Alternatives_0_0"
    // InternalXercise.g:1197:1: rule__SingleListOption__Alternatives_0_0 : ( ( '-' ) | ( 'x' ) );
    public final void rule__SingleListOption__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1201:1: ( ( '-' ) | ( 'x' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalXercise.g:1202:2: ( '-' )
                    {
                    // InternalXercise.g:1202:2: ( '-' )
                    // InternalXercise.g:1203:3: '-'
                    {
                     before(grammarAccess.getSingleListOptionAccess().getHyphenMinusKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSingleListOptionAccess().getHyphenMinusKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1208:2: ( 'x' )
                    {
                    // InternalXercise.g:1208:2: ( 'x' )
                    // InternalXercise.g:1209:3: 'x'
                    {
                     before(grammarAccess.getSingleListOptionAccess().getXKeyword_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSingleListOptionAccess().getXKeyword_0_0_1()); 

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
    // $ANTLR end "rule__SingleListOption__Alternatives_0_0"


    // $ANTLR start "rule__TaskAnswer__Alternatives"
    // InternalXercise.g:1218:1: rule__TaskAnswer__Alternatives : ( ( rulePerspectiveTaskAnswer ) | ( rulePartTaskAnswer ) | ( ruleCommandExecutionAnswer ) | ( ruleDebugEventAnswer ) | ( ruleJunitTestAnswer ) | ( ruleJdtSourceEditAnswer ) | ( ruleJdtLaunchAnswer ) );
    public final void rule__TaskAnswer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1222:1: ( ( rulePerspectiveTaskAnswer ) | ( rulePartTaskAnswer ) | ( ruleCommandExecutionAnswer ) | ( ruleDebugEventAnswer ) | ( ruleJunitTestAnswer ) | ( ruleJdtSourceEditAnswer ) | ( ruleJdtLaunchAnswer ) )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 54:
                {
                alt16=3;
                }
                break;
            case 55:
                {
                alt16=4;
                }
                break;
            case 45:
                {
                alt16=5;
                }
                break;
            case 49:
                {
                int LA16_6 = input.LA(2);

                if ( (LA16_6==51) ) {
                    alt16=7;
                }
                else if ( (LA16_6==50) ) {
                    alt16=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalXercise.g:1223:2: ( rulePerspectiveTaskAnswer )
                    {
                    // InternalXercise.g:1223:2: ( rulePerspectiveTaskAnswer )
                    // InternalXercise.g:1224:3: rulePerspectiveTaskAnswer
                    {
                     before(grammarAccess.getTaskAnswerAccess().getPerspectiveTaskAnswerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePerspectiveTaskAnswer();

                    state._fsp--;

                     after(grammarAccess.getTaskAnswerAccess().getPerspectiveTaskAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1229:2: ( rulePartTaskAnswer )
                    {
                    // InternalXercise.g:1229:2: ( rulePartTaskAnswer )
                    // InternalXercise.g:1230:3: rulePartTaskAnswer
                    {
                     before(grammarAccess.getTaskAnswerAccess().getPartTaskAnswerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePartTaskAnswer();

                    state._fsp--;

                     after(grammarAccess.getTaskAnswerAccess().getPartTaskAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXercise.g:1235:2: ( ruleCommandExecutionAnswer )
                    {
                    // InternalXercise.g:1235:2: ( ruleCommandExecutionAnswer )
                    // InternalXercise.g:1236:3: ruleCommandExecutionAnswer
                    {
                     before(grammarAccess.getTaskAnswerAccess().getCommandExecutionAnswerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCommandExecutionAnswer();

                    state._fsp--;

                     after(grammarAccess.getTaskAnswerAccess().getCommandExecutionAnswerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXercise.g:1241:2: ( ruleDebugEventAnswer )
                    {
                    // InternalXercise.g:1241:2: ( ruleDebugEventAnswer )
                    // InternalXercise.g:1242:3: ruleDebugEventAnswer
                    {
                     before(grammarAccess.getTaskAnswerAccess().getDebugEventAnswerParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDebugEventAnswer();

                    state._fsp--;

                     after(grammarAccess.getTaskAnswerAccess().getDebugEventAnswerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXercise.g:1247:2: ( ruleJunitTestAnswer )
                    {
                    // InternalXercise.g:1247:2: ( ruleJunitTestAnswer )
                    // InternalXercise.g:1248:3: ruleJunitTestAnswer
                    {
                     before(grammarAccess.getTaskAnswerAccess().getJunitTestAnswerParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleJunitTestAnswer();

                    state._fsp--;

                     after(grammarAccess.getTaskAnswerAccess().getJunitTestAnswerParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXercise.g:1253:2: ( ruleJdtSourceEditAnswer )
                    {
                    // InternalXercise.g:1253:2: ( ruleJdtSourceEditAnswer )
                    // InternalXercise.g:1254:3: ruleJdtSourceEditAnswer
                    {
                     before(grammarAccess.getTaskAnswerAccess().getJdtSourceEditAnswerParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleJdtSourceEditAnswer();

                    state._fsp--;

                     after(grammarAccess.getTaskAnswerAccess().getJdtSourceEditAnswerParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXercise.g:1259:2: ( ruleJdtLaunchAnswer )
                    {
                    // InternalXercise.g:1259:2: ( ruleJdtLaunchAnswer )
                    // InternalXercise.g:1260:3: ruleJdtLaunchAnswer
                    {
                     before(grammarAccess.getTaskAnswerAccess().getJdtLaunchAnswerParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleJdtLaunchAnswer();

                    state._fsp--;

                     after(grammarAccess.getTaskAnswerAccess().getJdtLaunchAnswerParserRuleCall_6()); 

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
    // $ANTLR end "rule__TaskAnswer__Alternatives"


    // $ANTLR start "rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0"
    // InternalXercise.g:1269:1: rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0 : ( ( 'activated' ) | ( 'changed' ) );
    public final void rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1273:1: ( ( 'activated' ) | ( 'changed' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            else if ( (LA17_0==18) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalXercise.g:1274:2: ( 'activated' )
                    {
                    // InternalXercise.g:1274:2: ( 'activated' )
                    // InternalXercise.g:1275:3: 'activated'
                    {
                     before(grammarAccess.getPerspectiveTaskAnswerAccess().getActionActivatedKeyword_2_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPerspectiveTaskAnswerAccess().getActionActivatedKeyword_2_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1280:2: ( 'changed' )
                    {
                    // InternalXercise.g:1280:2: ( 'changed' )
                    // InternalXercise.g:1281:3: 'changed'
                    {
                     before(grammarAccess.getPerspectiveTaskAnswerAccess().getActionChangedKeyword_2_1_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPerspectiveTaskAnswerAccess().getActionChangedKeyword_2_1_1_0_1()); 

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0"


    // $ANTLR start "rule__PartTaskAnswer__ActionAlternatives_2_1_1_0"
    // InternalXercise.g:1290:1: rule__PartTaskAnswer__ActionAlternatives_2_1_1_0 : ( ( 'activated' ) | ( 'broughtToTop' ) | ( 'closed' ) | ( 'deactivated' ) | ( 'opened' ) );
    public final void rule__PartTaskAnswer__ActionAlternatives_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1294:1: ( ( 'activated' ) | ( 'broughtToTop' ) | ( 'closed' ) | ( 'deactivated' ) | ( 'opened' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt18=1;
                }
                break;
            case 19:
                {
                alt18=2;
                }
                break;
            case 20:
                {
                alt18=3;
                }
                break;
            case 21:
                {
                alt18=4;
                }
                break;
            case 22:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalXercise.g:1295:2: ( 'activated' )
                    {
                    // InternalXercise.g:1295:2: ( 'activated' )
                    // InternalXercise.g:1296:3: 'activated'
                    {
                     before(grammarAccess.getPartTaskAnswerAccess().getActionActivatedKeyword_2_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPartTaskAnswerAccess().getActionActivatedKeyword_2_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1301:2: ( 'broughtToTop' )
                    {
                    // InternalXercise.g:1301:2: ( 'broughtToTop' )
                    // InternalXercise.g:1302:3: 'broughtToTop'
                    {
                     before(grammarAccess.getPartTaskAnswerAccess().getActionBroughtToTopKeyword_2_1_1_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getPartTaskAnswerAccess().getActionBroughtToTopKeyword_2_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXercise.g:1307:2: ( 'closed' )
                    {
                    // InternalXercise.g:1307:2: ( 'closed' )
                    // InternalXercise.g:1308:3: 'closed'
                    {
                     before(grammarAccess.getPartTaskAnswerAccess().getActionClosedKeyword_2_1_1_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getPartTaskAnswerAccess().getActionClosedKeyword_2_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXercise.g:1313:2: ( 'deactivated' )
                    {
                    // InternalXercise.g:1313:2: ( 'deactivated' )
                    // InternalXercise.g:1314:3: 'deactivated'
                    {
                     before(grammarAccess.getPartTaskAnswerAccess().getActionDeactivatedKeyword_2_1_1_0_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getPartTaskAnswerAccess().getActionDeactivatedKeyword_2_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXercise.g:1319:2: ( 'opened' )
                    {
                    // InternalXercise.g:1319:2: ( 'opened' )
                    // InternalXercise.g:1320:3: 'opened'
                    {
                     before(grammarAccess.getPartTaskAnswerAccess().getActionOpenedKeyword_2_1_1_0_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getPartTaskAnswerAccess().getActionOpenedKeyword_2_1_1_0_4()); 

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
    // $ANTLR end "rule__PartTaskAnswer__ActionAlternatives_2_1_1_0"


    // $ANTLR start "rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0"
    // InternalXercise.g:1329:1: rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0 : ( ( 'executeSuccess' ) | ( 'executeFailure' ) );
    public final void rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1333:1: ( ( 'executeSuccess' ) | ( 'executeFailure' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            else if ( (LA19_0==24) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalXercise.g:1334:2: ( 'executeSuccess' )
                    {
                    // InternalXercise.g:1334:2: ( 'executeSuccess' )
                    // InternalXercise.g:1335:3: 'executeSuccess'
                    {
                     before(grammarAccess.getCommandExecutionAnswerAccess().getActionExecuteSuccessKeyword_2_1_1_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCommandExecutionAnswerAccess().getActionExecuteSuccessKeyword_2_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1340:2: ( 'executeFailure' )
                    {
                    // InternalXercise.g:1340:2: ( 'executeFailure' )
                    // InternalXercise.g:1341:3: 'executeFailure'
                    {
                     before(grammarAccess.getCommandExecutionAnswerAccess().getActionExecuteFailureKeyword_2_1_1_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getCommandExecutionAnswerAccess().getActionExecuteFailureKeyword_2_1_1_0_1()); 

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
    // $ANTLR end "rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0"


    // $ANTLR start "rule__DebugEventAnswer__ActionAlternatives_2_1_1_0"
    // InternalXercise.g:1350:1: rule__DebugEventAnswer__ActionAlternatives_2_1_1_0 : ( ( 'create' ) | ( 'terminate' ) | ( 'resume' ) | ( 'suspend' ) | ( 'stepInto' ) | ( 'stepOver' ) | ( 'stepReturn' ) | ( 'stepEnd' ) | ( 'breakpoint' ) | ( 'evaluation' ) );
    public final void rule__DebugEventAnswer__ActionAlternatives_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1354:1: ( ( 'create' ) | ( 'terminate' ) | ( 'resume' ) | ( 'suspend' ) | ( 'stepInto' ) | ( 'stepOver' ) | ( 'stepReturn' ) | ( 'stepEnd' ) | ( 'breakpoint' ) | ( 'evaluation' ) )
            int alt20=10;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt20=1;
                }
                break;
            case 26:
                {
                alt20=2;
                }
                break;
            case 27:
                {
                alt20=3;
                }
                break;
            case 28:
                {
                alt20=4;
                }
                break;
            case 29:
                {
                alt20=5;
                }
                break;
            case 30:
                {
                alt20=6;
                }
                break;
            case 31:
                {
                alt20=7;
                }
                break;
            case 32:
                {
                alt20=8;
                }
                break;
            case 33:
                {
                alt20=9;
                }
                break;
            case 34:
                {
                alt20=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalXercise.g:1355:2: ( 'create' )
                    {
                    // InternalXercise.g:1355:2: ( 'create' )
                    // InternalXercise.g:1356:3: 'create'
                    {
                     before(grammarAccess.getDebugEventAnswerAccess().getActionCreateKeyword_2_1_1_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDebugEventAnswerAccess().getActionCreateKeyword_2_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1361:2: ( 'terminate' )
                    {
                    // InternalXercise.g:1361:2: ( 'terminate' )
                    // InternalXercise.g:1362:3: 'terminate'
                    {
                     before(grammarAccess.getDebugEventAnswerAccess().getActionTerminateKeyword_2_1_1_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getDebugEventAnswerAccess().getActionTerminateKeyword_2_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXercise.g:1367:2: ( 'resume' )
                    {
                    // InternalXercise.g:1367:2: ( 'resume' )
                    // InternalXercise.g:1368:3: 'resume'
                    {
                     before(grammarAccess.getDebugEventAnswerAccess().getActionResumeKeyword_2_1_1_0_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getDebugEventAnswerAccess().getActionResumeKeyword_2_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXercise.g:1373:2: ( 'suspend' )
                    {
                    // InternalXercise.g:1373:2: ( 'suspend' )
                    // InternalXercise.g:1374:3: 'suspend'
                    {
                     before(grammarAccess.getDebugEventAnswerAccess().getActionSuspendKeyword_2_1_1_0_3()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getDebugEventAnswerAccess().getActionSuspendKeyword_2_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXercise.g:1379:2: ( 'stepInto' )
                    {
                    // InternalXercise.g:1379:2: ( 'stepInto' )
                    // InternalXercise.g:1380:3: 'stepInto'
                    {
                     before(grammarAccess.getDebugEventAnswerAccess().getActionStepIntoKeyword_2_1_1_0_4()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getDebugEventAnswerAccess().getActionStepIntoKeyword_2_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXercise.g:1385:2: ( 'stepOver' )
                    {
                    // InternalXercise.g:1385:2: ( 'stepOver' )
                    // InternalXercise.g:1386:3: 'stepOver'
                    {
                     before(grammarAccess.getDebugEventAnswerAccess().getActionStepOverKeyword_2_1_1_0_5()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getDebugEventAnswerAccess().getActionStepOverKeyword_2_1_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXercise.g:1391:2: ( 'stepReturn' )
                    {
                    // InternalXercise.g:1391:2: ( 'stepReturn' )
                    // InternalXercise.g:1392:3: 'stepReturn'
                    {
                     before(grammarAccess.getDebugEventAnswerAccess().getActionStepReturnKeyword_2_1_1_0_6()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getDebugEventAnswerAccess().getActionStepReturnKeyword_2_1_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXercise.g:1397:2: ( 'stepEnd' )
                    {
                    // InternalXercise.g:1397:2: ( 'stepEnd' )
                    // InternalXercise.g:1398:3: 'stepEnd'
                    {
                     before(grammarAccess.getDebugEventAnswerAccess().getActionStepEndKeyword_2_1_1_0_7()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getDebugEventAnswerAccess().getActionStepEndKeyword_2_1_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXercise.g:1403:2: ( 'breakpoint' )
                    {
                    // InternalXercise.g:1403:2: ( 'breakpoint' )
                    // InternalXercise.g:1404:3: 'breakpoint'
                    {
                     before(grammarAccess.getDebugEventAnswerAccess().getActionBreakpointKeyword_2_1_1_0_8()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getDebugEventAnswerAccess().getActionBreakpointKeyword_2_1_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXercise.g:1409:2: ( 'evaluation' )
                    {
                    // InternalXercise.g:1409:2: ( 'evaluation' )
                    // InternalXercise.g:1410:3: 'evaluation'
                    {
                     before(grammarAccess.getDebugEventAnswerAccess().getActionEvaluationKeyword_2_1_1_0_9()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getDebugEventAnswerAccess().getActionEvaluationKeyword_2_1_1_0_9()); 

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
    // $ANTLR end "rule__DebugEventAnswer__ActionAlternatives_2_1_1_0"


    // $ANTLR start "rule__Exercise__Group__0"
    // InternalXercise.g:1419:1: rule__Exercise__Group__0 : rule__Exercise__Group__0__Impl rule__Exercise__Group__1 ;
    public final void rule__Exercise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1423:1: ( rule__Exercise__Group__0__Impl rule__Exercise__Group__1 )
            // InternalXercise.g:1424:2: rule__Exercise__Group__0__Impl rule__Exercise__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Exercise__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__1();

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
    // $ANTLR end "rule__Exercise__Group__0"


    // $ANTLR start "rule__Exercise__Group__0__Impl"
    // InternalXercise.g:1431:1: rule__Exercise__Group__0__Impl : ( () ) ;
    public final void rule__Exercise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1435:1: ( ( () ) )
            // InternalXercise.g:1436:1: ( () )
            {
            // InternalXercise.g:1436:1: ( () )
            // InternalXercise.g:1437:2: ()
            {
             before(grammarAccess.getExerciseAccess().getExerciseAction_0()); 
            // InternalXercise.g:1438:2: ()
            // InternalXercise.g:1438:3: 
            {
            }

             after(grammarAccess.getExerciseAccess().getExerciseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exercise__Group__0__Impl"


    // $ANTLR start "rule__Exercise__Group__1"
    // InternalXercise.g:1446:1: rule__Exercise__Group__1 : rule__Exercise__Group__1__Impl rule__Exercise__Group__2 ;
    public final void rule__Exercise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1450:1: ( rule__Exercise__Group__1__Impl rule__Exercise__Group__2 )
            // InternalXercise.g:1451:2: rule__Exercise__Group__1__Impl rule__Exercise__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Exercise__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group__2();

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
    // $ANTLR end "rule__Exercise__Group__1"


    // $ANTLR start "rule__Exercise__Group__1__Impl"
    // InternalXercise.g:1458:1: rule__Exercise__Group__1__Impl : ( 'exercise' ) ;
    public final void rule__Exercise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1462:1: ( ( 'exercise' ) )
            // InternalXercise.g:1463:1: ( 'exercise' )
            {
            // InternalXercise.g:1463:1: ( 'exercise' )
            // InternalXercise.g:1464:2: 'exercise'
            {
             before(grammarAccess.getExerciseAccess().getExerciseKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getExerciseKeyword_1()); 

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
    // $ANTLR end "rule__Exercise__Group__1__Impl"


    // $ANTLR start "rule__Exercise__Group__2"
    // InternalXercise.g:1473:1: rule__Exercise__Group__2 : rule__Exercise__Group__2__Impl ;
    public final void rule__Exercise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1477:1: ( rule__Exercise__Group__2__Impl )
            // InternalXercise.g:1478:2: rule__Exercise__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group__2__Impl();

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
    // $ANTLR end "rule__Exercise__Group__2"


    // $ANTLR start "rule__Exercise__Group__2__Impl"
    // InternalXercise.g:1484:1: rule__Exercise__Group__2__Impl : ( ( rule__Exercise__Alternatives_2 ) ) ;
    public final void rule__Exercise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1488:1: ( ( ( rule__Exercise__Alternatives_2 ) ) )
            // InternalXercise.g:1489:1: ( ( rule__Exercise__Alternatives_2 ) )
            {
            // InternalXercise.g:1489:1: ( ( rule__Exercise__Alternatives_2 ) )
            // InternalXercise.g:1490:2: ( rule__Exercise__Alternatives_2 )
            {
             before(grammarAccess.getExerciseAccess().getAlternatives_2()); 
            // InternalXercise.g:1491:2: ( rule__Exercise__Alternatives_2 )
            // InternalXercise.g:1491:3: rule__Exercise__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getExerciseAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Exercise__Group__2__Impl"


    // $ANTLR start "rule__Exercise__Group_2_0__0"
    // InternalXercise.g:1500:1: rule__Exercise__Group_2_0__0 : rule__Exercise__Group_2_0__0__Impl rule__Exercise__Group_2_0__1 ;
    public final void rule__Exercise__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1504:1: ( rule__Exercise__Group_2_0__0__Impl rule__Exercise__Group_2_0__1 )
            // InternalXercise.g:1505:2: rule__Exercise__Group_2_0__0__Impl rule__Exercise__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Exercise__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2_0__1();

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
    // $ANTLR end "rule__Exercise__Group_2_0__0"


    // $ANTLR start "rule__Exercise__Group_2_0__0__Impl"
    // InternalXercise.g:1512:1: rule__Exercise__Group_2_0__0__Impl : ( ( rule__Exercise__NameAssignment_2_0_0 )? ) ;
    public final void rule__Exercise__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1516:1: ( ( ( rule__Exercise__NameAssignment_2_0_0 )? ) )
            // InternalXercise.g:1517:1: ( ( rule__Exercise__NameAssignment_2_0_0 )? )
            {
            // InternalXercise.g:1517:1: ( ( rule__Exercise__NameAssignment_2_0_0 )? )
            // InternalXercise.g:1518:2: ( rule__Exercise__NameAssignment_2_0_0 )?
            {
             before(grammarAccess.getExerciseAccess().getNameAssignment_2_0_0()); 
            // InternalXercise.g:1519:2: ( rule__Exercise__NameAssignment_2_0_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXercise.g:1519:3: rule__Exercise__NameAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__NameAssignment_2_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExerciseAccess().getNameAssignment_2_0_0()); 

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
    // $ANTLR end "rule__Exercise__Group_2_0__0__Impl"


    // $ANTLR start "rule__Exercise__Group_2_0__1"
    // InternalXercise.g:1527:1: rule__Exercise__Group_2_0__1 : rule__Exercise__Group_2_0__1__Impl rule__Exercise__Group_2_0__2 ;
    public final void rule__Exercise__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1531:1: ( rule__Exercise__Group_2_0__1__Impl rule__Exercise__Group_2_0__2 )
            // InternalXercise.g:1532:2: rule__Exercise__Group_2_0__1__Impl rule__Exercise__Group_2_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Exercise__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2_0__2();

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
    // $ANTLR end "rule__Exercise__Group_2_0__1"


    // $ANTLR start "rule__Exercise__Group_2_0__1__Impl"
    // InternalXercise.g:1539:1: rule__Exercise__Group_2_0__1__Impl : ( ( rule__Exercise__TitleAssignment_2_0_1 )? ) ;
    public final void rule__Exercise__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1543:1: ( ( ( rule__Exercise__TitleAssignment_2_0_1 )? ) )
            // InternalXercise.g:1544:1: ( ( rule__Exercise__TitleAssignment_2_0_1 )? )
            {
            // InternalXercise.g:1544:1: ( ( rule__Exercise__TitleAssignment_2_0_1 )? )
            // InternalXercise.g:1545:2: ( rule__Exercise__TitleAssignment_2_0_1 )?
            {
             before(grammarAccess.getExerciseAccess().getTitleAssignment_2_0_1()); 
            // InternalXercise.g:1546:2: ( rule__Exercise__TitleAssignment_2_0_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXercise.g:1546:3: rule__Exercise__TitleAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exercise__TitleAssignment_2_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExerciseAccess().getTitleAssignment_2_0_1()); 

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
    // $ANTLR end "rule__Exercise__Group_2_0__1__Impl"


    // $ANTLR start "rule__Exercise__Group_2_0__2"
    // InternalXercise.g:1554:1: rule__Exercise__Group_2_0__2 : rule__Exercise__Group_2_0__2__Impl ;
    public final void rule__Exercise__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1558:1: ( rule__Exercise__Group_2_0__2__Impl )
            // InternalXercise.g:1559:2: rule__Exercise__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exercise__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__Exercise__Group_2_0__2"


    // $ANTLR start "rule__Exercise__Group_2_0__2__Impl"
    // InternalXercise.g:1565:1: rule__Exercise__Group_2_0__2__Impl : ( ( rule__Exercise__PartsAssignment_2_0_2 )* ) ;
    public final void rule__Exercise__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1569:1: ( ( ( rule__Exercise__PartsAssignment_2_0_2 )* ) )
            // InternalXercise.g:1570:1: ( ( rule__Exercise__PartsAssignment_2_0_2 )* )
            {
            // InternalXercise.g:1570:1: ( ( rule__Exercise__PartsAssignment_2_0_2 )* )
            // InternalXercise.g:1571:2: ( rule__Exercise__PartsAssignment_2_0_2 )*
            {
             before(grammarAccess.getExerciseAccess().getPartsAssignment_2_0_2()); 
            // InternalXercise.g:1572:2: ( rule__Exercise__PartsAssignment_2_0_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalXercise.g:1572:3: rule__Exercise__PartsAssignment_2_0_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Exercise__PartsAssignment_2_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getExerciseAccess().getPartsAssignment_2_0_2()); 

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
    // $ANTLR end "rule__Exercise__Group_2_0__2__Impl"


    // $ANTLR start "rule__QName__Group__0"
    // InternalXercise.g:1581:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1585:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // InternalXercise.g:1586:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QName__Group__1();

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
    // $ANTLR end "rule__QName__Group__0"


    // $ANTLR start "rule__QName__Group__0__Impl"
    // InternalXercise.g:1593:1: rule__QName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1597:1: ( ( RULE_ID ) )
            // InternalXercise.g:1598:1: ( RULE_ID )
            {
            // InternalXercise.g:1598:1: ( RULE_ID )
            // InternalXercise.g:1599:2: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QName__Group__0__Impl"


    // $ANTLR start "rule__QName__Group__1"
    // InternalXercise.g:1608:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1612:1: ( rule__QName__Group__1__Impl )
            // InternalXercise.g:1613:2: rule__QName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QName__Group__1__Impl();

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
    // $ANTLR end "rule__QName__Group__1"


    // $ANTLR start "rule__QName__Group__1__Impl"
    // InternalXercise.g:1619:1: rule__QName__Group__1__Impl : ( ( rule__QName__Group_1__0 )* ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1623:1: ( ( ( rule__QName__Group_1__0 )* ) )
            // InternalXercise.g:1624:1: ( ( rule__QName__Group_1__0 )* )
            {
            // InternalXercise.g:1624:1: ( ( rule__QName__Group_1__0 )* )
            // InternalXercise.g:1625:2: ( rule__QName__Group_1__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_1()); 
            // InternalXercise.g:1626:2: ( rule__QName__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXercise.g:1626:3: rule__QName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__QName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getQNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QName__Group__1__Impl"


    // $ANTLR start "rule__QName__Group_1__0"
    // InternalXercise.g:1635:1: rule__QName__Group_1__0 : rule__QName__Group_1__0__Impl rule__QName__Group_1__1 ;
    public final void rule__QName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1639:1: ( rule__QName__Group_1__0__Impl rule__QName__Group_1__1 )
            // InternalXercise.g:1640:2: rule__QName__Group_1__0__Impl rule__QName__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__QName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QName__Group_1__1();

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
    // $ANTLR end "rule__QName__Group_1__0"


    // $ANTLR start "rule__QName__Group_1__0__Impl"
    // InternalXercise.g:1647:1: rule__QName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1651:1: ( ( '.' ) )
            // InternalXercise.g:1652:1: ( '.' )
            {
            // InternalXercise.g:1652:1: ( '.' )
            // InternalXercise.g:1653:2: '.'
            {
             before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QName__Group_1__0__Impl"


    // $ANTLR start "rule__QName__Group_1__1"
    // InternalXercise.g:1662:1: rule__QName__Group_1__1 : rule__QName__Group_1__1__Impl ;
    public final void rule__QName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1666:1: ( rule__QName__Group_1__1__Impl )
            // InternalXercise.g:1667:2: rule__QName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QName__Group_1__1"


    // $ANTLR start "rule__QName__Group_1__1__Impl"
    // InternalXercise.g:1673:1: rule__QName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1677:1: ( ( RULE_ID ) )
            // InternalXercise.g:1678:1: ( RULE_ID )
            {
            // InternalXercise.g:1678:1: ( RULE_ID )
            // InternalXercise.g:1679:2: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QName__Group_1__1__Impl"


    // $ANTLR start "rule__ExercisePart__Group__0"
    // InternalXercise.g:1689:1: rule__ExercisePart__Group__0 : rule__ExercisePart__Group__0__Impl rule__ExercisePart__Group__1 ;
    public final void rule__ExercisePart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1693:1: ( rule__ExercisePart__Group__0__Impl rule__ExercisePart__Group__1 )
            // InternalXercise.g:1694:2: rule__ExercisePart__Group__0__Impl rule__ExercisePart__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ExercisePart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExercisePart__Group__1();

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
    // $ANTLR end "rule__ExercisePart__Group__0"


    // $ANTLR start "rule__ExercisePart__Group__0__Impl"
    // InternalXercise.g:1701:1: rule__ExercisePart__Group__0__Impl : ( 'part' ) ;
    public final void rule__ExercisePart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1705:1: ( ( 'part' ) )
            // InternalXercise.g:1706:1: ( 'part' )
            {
            // InternalXercise.g:1706:1: ( 'part' )
            // InternalXercise.g:1707:2: 'part'
            {
             before(grammarAccess.getExercisePartAccess().getPartKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExercisePartAccess().getPartKeyword_0()); 

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
    // $ANTLR end "rule__ExercisePart__Group__0__Impl"


    // $ANTLR start "rule__ExercisePart__Group__1"
    // InternalXercise.g:1716:1: rule__ExercisePart__Group__1 : rule__ExercisePart__Group__1__Impl rule__ExercisePart__Group__2 ;
    public final void rule__ExercisePart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1720:1: ( rule__ExercisePart__Group__1__Impl rule__ExercisePart__Group__2 )
            // InternalXercise.g:1721:2: rule__ExercisePart__Group__1__Impl rule__ExercisePart__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ExercisePart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExercisePart__Group__2();

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
    // $ANTLR end "rule__ExercisePart__Group__1"


    // $ANTLR start "rule__ExercisePart__Group__1__Impl"
    // InternalXercise.g:1728:1: rule__ExercisePart__Group__1__Impl : ( ( rule__ExercisePart__NameAssignment_1 ) ) ;
    public final void rule__ExercisePart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1732:1: ( ( ( rule__ExercisePart__NameAssignment_1 ) ) )
            // InternalXercise.g:1733:1: ( ( rule__ExercisePart__NameAssignment_1 ) )
            {
            // InternalXercise.g:1733:1: ( ( rule__ExercisePart__NameAssignment_1 ) )
            // InternalXercise.g:1734:2: ( rule__ExercisePart__NameAssignment_1 )
            {
             before(grammarAccess.getExercisePartAccess().getNameAssignment_1()); 
            // InternalXercise.g:1735:2: ( rule__ExercisePart__NameAssignment_1 )
            // InternalXercise.g:1735:3: rule__ExercisePart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExercisePart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExercisePartAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ExercisePart__Group__1__Impl"


    // $ANTLR start "rule__ExercisePart__Group__2"
    // InternalXercise.g:1743:1: rule__ExercisePart__Group__2 : rule__ExercisePart__Group__2__Impl rule__ExercisePart__Group__3 ;
    public final void rule__ExercisePart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1747:1: ( rule__ExercisePart__Group__2__Impl rule__ExercisePart__Group__3 )
            // InternalXercise.g:1748:2: rule__ExercisePart__Group__2__Impl rule__ExercisePart__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ExercisePart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExercisePart__Group__3();

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
    // $ANTLR end "rule__ExercisePart__Group__2"


    // $ANTLR start "rule__ExercisePart__Group__2__Impl"
    // InternalXercise.g:1755:1: rule__ExercisePart__Group__2__Impl : ( ( rule__ExercisePart__TitleAssignment_2 ) ) ;
    public final void rule__ExercisePart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1759:1: ( ( ( rule__ExercisePart__TitleAssignment_2 ) ) )
            // InternalXercise.g:1760:1: ( ( rule__ExercisePart__TitleAssignment_2 ) )
            {
            // InternalXercise.g:1760:1: ( ( rule__ExercisePart__TitleAssignment_2 ) )
            // InternalXercise.g:1761:2: ( rule__ExercisePart__TitleAssignment_2 )
            {
             before(grammarAccess.getExercisePartAccess().getTitleAssignment_2()); 
            // InternalXercise.g:1762:2: ( rule__ExercisePart__TitleAssignment_2 )
            // InternalXercise.g:1762:3: rule__ExercisePart__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExercisePart__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExercisePartAccess().getTitleAssignment_2()); 

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
    // $ANTLR end "rule__ExercisePart__Group__2__Impl"


    // $ANTLR start "rule__ExercisePart__Group__3"
    // InternalXercise.g:1770:1: rule__ExercisePart__Group__3 : rule__ExercisePart__Group__3__Impl ;
    public final void rule__ExercisePart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1774:1: ( rule__ExercisePart__Group__3__Impl )
            // InternalXercise.g:1775:2: rule__ExercisePart__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExercisePart__Group__3__Impl();

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
    // $ANTLR end "rule__ExercisePart__Group__3"


    // $ANTLR start "rule__ExercisePart__Group__3__Impl"
    // InternalXercise.g:1781:1: rule__ExercisePart__Group__3__Impl : ( ( rule__ExercisePart__TasksAssignment_3 )* ) ;
    public final void rule__ExercisePart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1785:1: ( ( ( rule__ExercisePart__TasksAssignment_3 )* ) )
            // InternalXercise.g:1786:1: ( ( rule__ExercisePart__TasksAssignment_3 )* )
            {
            // InternalXercise.g:1786:1: ( ( rule__ExercisePart__TasksAssignment_3 )* )
            // InternalXercise.g:1787:2: ( rule__ExercisePart__TasksAssignment_3 )*
            {
             before(grammarAccess.getExercisePartAccess().getTasksAssignment_3()); 
            // InternalXercise.g:1788:2: ( rule__ExercisePart__TasksAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==RULE_STRING||LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXercise.g:1788:3: rule__ExercisePart__TasksAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ExercisePart__TasksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getExercisePartAccess().getTasksAssignment_3()); 

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
    // $ANTLR end "rule__ExercisePart__Group__3__Impl"


    // $ANTLR start "rule__ExercisePartRef__Group__0"
    // InternalXercise.g:1797:1: rule__ExercisePartRef__Group__0 : rule__ExercisePartRef__Group__0__Impl rule__ExercisePartRef__Group__1 ;
    public final void rule__ExercisePartRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1801:1: ( rule__ExercisePartRef__Group__0__Impl rule__ExercisePartRef__Group__1 )
            // InternalXercise.g:1802:2: rule__ExercisePartRef__Group__0__Impl rule__ExercisePartRef__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ExercisePartRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExercisePartRef__Group__1();

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
    // $ANTLR end "rule__ExercisePartRef__Group__0"


    // $ANTLR start "rule__ExercisePartRef__Group__0__Impl"
    // InternalXercise.g:1809:1: rule__ExercisePartRef__Group__0__Impl : ( 'part' ) ;
    public final void rule__ExercisePartRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1813:1: ( ( 'part' ) )
            // InternalXercise.g:1814:1: ( 'part' )
            {
            // InternalXercise.g:1814:1: ( 'part' )
            // InternalXercise.g:1815:2: 'part'
            {
             before(grammarAccess.getExercisePartRefAccess().getPartKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExercisePartRefAccess().getPartKeyword_0()); 

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
    // $ANTLR end "rule__ExercisePartRef__Group__0__Impl"


    // $ANTLR start "rule__ExercisePartRef__Group__1"
    // InternalXercise.g:1824:1: rule__ExercisePartRef__Group__1 : rule__ExercisePartRef__Group__1__Impl rule__ExercisePartRef__Group__2 ;
    public final void rule__ExercisePartRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1828:1: ( rule__ExercisePartRef__Group__1__Impl rule__ExercisePartRef__Group__2 )
            // InternalXercise.g:1829:2: rule__ExercisePartRef__Group__1__Impl rule__ExercisePartRef__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ExercisePartRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExercisePartRef__Group__2();

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
    // $ANTLR end "rule__ExercisePartRef__Group__1"


    // $ANTLR start "rule__ExercisePartRef__Group__1__Impl"
    // InternalXercise.g:1836:1: rule__ExercisePartRef__Group__1__Impl : ( 'ref' ) ;
    public final void rule__ExercisePartRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1840:1: ( ( 'ref' ) )
            // InternalXercise.g:1841:1: ( 'ref' )
            {
            // InternalXercise.g:1841:1: ( 'ref' )
            // InternalXercise.g:1842:2: 'ref'
            {
             before(grammarAccess.getExercisePartRefAccess().getRefKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExercisePartRefAccess().getRefKeyword_1()); 

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
    // $ANTLR end "rule__ExercisePartRef__Group__1__Impl"


    // $ANTLR start "rule__ExercisePartRef__Group__2"
    // InternalXercise.g:1851:1: rule__ExercisePartRef__Group__2 : rule__ExercisePartRef__Group__2__Impl ;
    public final void rule__ExercisePartRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1855:1: ( rule__ExercisePartRef__Group__2__Impl )
            // InternalXercise.g:1856:2: rule__ExercisePartRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExercisePartRef__Group__2__Impl();

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
    // $ANTLR end "rule__ExercisePartRef__Group__2"


    // $ANTLR start "rule__ExercisePartRef__Group__2__Impl"
    // InternalXercise.g:1862:1: rule__ExercisePartRef__Group__2__Impl : ( ( rule__ExercisePartRef__PartRefAssignment_2 ) ) ;
    public final void rule__ExercisePartRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1866:1: ( ( ( rule__ExercisePartRef__PartRefAssignment_2 ) ) )
            // InternalXercise.g:1867:1: ( ( rule__ExercisePartRef__PartRefAssignment_2 ) )
            {
            // InternalXercise.g:1867:1: ( ( rule__ExercisePartRef__PartRefAssignment_2 ) )
            // InternalXercise.g:1868:2: ( rule__ExercisePartRef__PartRefAssignment_2 )
            {
             before(grammarAccess.getExercisePartRefAccess().getPartRefAssignment_2()); 
            // InternalXercise.g:1869:2: ( rule__ExercisePartRef__PartRefAssignment_2 )
            // InternalXercise.g:1869:3: rule__ExercisePartRef__PartRefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExercisePartRef__PartRefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExercisePartRefAccess().getPartRefAssignment_2()); 

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
    // $ANTLR end "rule__ExercisePartRef__Group__2__Impl"


    // $ANTLR start "rule__AnonymousExercisePart__Group__0"
    // InternalXercise.g:1878:1: rule__AnonymousExercisePart__Group__0 : rule__AnonymousExercisePart__Group__0__Impl rule__AnonymousExercisePart__Group__1 ;
    public final void rule__AnonymousExercisePart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1882:1: ( rule__AnonymousExercisePart__Group__0__Impl rule__AnonymousExercisePart__Group__1 )
            // InternalXercise.g:1883:2: rule__AnonymousExercisePart__Group__0__Impl rule__AnonymousExercisePart__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AnonymousExercisePart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnonymousExercisePart__Group__1();

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
    // $ANTLR end "rule__AnonymousExercisePart__Group__0"


    // $ANTLR start "rule__AnonymousExercisePart__Group__0__Impl"
    // InternalXercise.g:1890:1: rule__AnonymousExercisePart__Group__0__Impl : ( () ) ;
    public final void rule__AnonymousExercisePart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1894:1: ( ( () ) )
            // InternalXercise.g:1895:1: ( () )
            {
            // InternalXercise.g:1895:1: ( () )
            // InternalXercise.g:1896:2: ()
            {
             before(grammarAccess.getAnonymousExercisePartAccess().getExercisePartAction_0()); 
            // InternalXercise.g:1897:2: ()
            // InternalXercise.g:1897:3: 
            {
            }

             after(grammarAccess.getAnonymousExercisePartAccess().getExercisePartAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousExercisePart__Group__0__Impl"


    // $ANTLR start "rule__AnonymousExercisePart__Group__1"
    // InternalXercise.g:1905:1: rule__AnonymousExercisePart__Group__1 : rule__AnonymousExercisePart__Group__1__Impl ;
    public final void rule__AnonymousExercisePart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1909:1: ( rule__AnonymousExercisePart__Group__1__Impl )
            // InternalXercise.g:1910:2: rule__AnonymousExercisePart__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnonymousExercisePart__Group__1__Impl();

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
    // $ANTLR end "rule__AnonymousExercisePart__Group__1"


    // $ANTLR start "rule__AnonymousExercisePart__Group__1__Impl"
    // InternalXercise.g:1916:1: rule__AnonymousExercisePart__Group__1__Impl : ( ( rule__AnonymousExercisePart__TasksAssignment_1 )* ) ;
    public final void rule__AnonymousExercisePart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1920:1: ( ( ( rule__AnonymousExercisePart__TasksAssignment_1 )* ) )
            // InternalXercise.g:1921:1: ( ( rule__AnonymousExercisePart__TasksAssignment_1 )* )
            {
            // InternalXercise.g:1921:1: ( ( rule__AnonymousExercisePart__TasksAssignment_1 )* )
            // InternalXercise.g:1922:2: ( rule__AnonymousExercisePart__TasksAssignment_1 )*
            {
             before(grammarAccess.getAnonymousExercisePartAccess().getTasksAssignment_1()); 
            // InternalXercise.g:1923:2: ( rule__AnonymousExercisePart__TasksAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==RULE_STRING||LA26_0==38) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalXercise.g:1923:3: rule__AnonymousExercisePart__TasksAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AnonymousExercisePart__TasksAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAnonymousExercisePartAccess().getTasksAssignment_1()); 

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
    // $ANTLR end "rule__AnonymousExercisePart__Group__1__Impl"


    // $ANTLR start "rule__TaskRef__Group__0"
    // InternalXercise.g:1932:1: rule__TaskRef__Group__0 : rule__TaskRef__Group__0__Impl rule__TaskRef__Group__1 ;
    public final void rule__TaskRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1936:1: ( rule__TaskRef__Group__0__Impl rule__TaskRef__Group__1 )
            // InternalXercise.g:1937:2: rule__TaskRef__Group__0__Impl rule__TaskRef__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__TaskRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRef__Group__1();

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
    // $ANTLR end "rule__TaskRef__Group__0"


    // $ANTLR start "rule__TaskRef__Group__0__Impl"
    // InternalXercise.g:1944:1: rule__TaskRef__Group__0__Impl : ( 'ref' ) ;
    public final void rule__TaskRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1948:1: ( ( 'ref' ) )
            // InternalXercise.g:1949:1: ( 'ref' )
            {
            // InternalXercise.g:1949:1: ( 'ref' )
            // InternalXercise.g:1950:2: 'ref'
            {
             before(grammarAccess.getTaskRefAccess().getRefKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTaskRefAccess().getRefKeyword_0()); 

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
    // $ANTLR end "rule__TaskRef__Group__0__Impl"


    // $ANTLR start "rule__TaskRef__Group__1"
    // InternalXercise.g:1959:1: rule__TaskRef__Group__1 : rule__TaskRef__Group__1__Impl ;
    public final void rule__TaskRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1963:1: ( rule__TaskRef__Group__1__Impl )
            // InternalXercise.g:1964:2: rule__TaskRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskRef__Group__1__Impl();

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
    // $ANTLR end "rule__TaskRef__Group__1"


    // $ANTLR start "rule__TaskRef__Group__1__Impl"
    // InternalXercise.g:1970:1: rule__TaskRef__Group__1__Impl : ( ( rule__TaskRef__TaskRefAssignment_1 ) ) ;
    public final void rule__TaskRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1974:1: ( ( ( rule__TaskRef__TaskRefAssignment_1 ) ) )
            // InternalXercise.g:1975:1: ( ( rule__TaskRef__TaskRefAssignment_1 ) )
            {
            // InternalXercise.g:1975:1: ( ( rule__TaskRef__TaskRefAssignment_1 ) )
            // InternalXercise.g:1976:2: ( rule__TaskRef__TaskRefAssignment_1 )
            {
             before(grammarAccess.getTaskRefAccess().getTaskRefAssignment_1()); 
            // InternalXercise.g:1977:2: ( rule__TaskRef__TaskRefAssignment_1 )
            // InternalXercise.g:1977:3: rule__TaskRef__TaskRefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskRef__TaskRefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskRefAccess().getTaskRefAssignment_1()); 

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
    // $ANTLR end "rule__TaskRef__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalXercise.g:1986:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:1990:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalXercise.g:1991:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

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
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalXercise.g:1998:1: rule__Task__Group__0__Impl : ( ( rule__Task__NameAssignment_0 )? ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2002:1: ( ( ( rule__Task__NameAssignment_0 )? ) )
            // InternalXercise.g:2003:1: ( ( rule__Task__NameAssignment_0 )? )
            {
            // InternalXercise.g:2003:1: ( ( rule__Task__NameAssignment_0 )? )
            // InternalXercise.g:2004:2: ( rule__Task__NameAssignment_0 )?
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_0()); 
            // InternalXercise.g:2005:2: ( rule__Task__NameAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXercise.g:2005:3: rule__Task__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalXercise.g:2013:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2017:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalXercise.g:2018:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

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
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalXercise.g:2025:1: rule__Task__Group__1__Impl : ( ( rule__Task__QAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2029:1: ( ( ( rule__Task__QAssignment_1 ) ) )
            // InternalXercise.g:2030:1: ( ( rule__Task__QAssignment_1 ) )
            {
            // InternalXercise.g:2030:1: ( ( rule__Task__QAssignment_1 ) )
            // InternalXercise.g:2031:2: ( rule__Task__QAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getQAssignment_1()); 
            // InternalXercise.g:2032:2: ( rule__Task__QAssignment_1 )
            // InternalXercise.g:2032:3: rule__Task__QAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__QAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getQAssignment_1()); 

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
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalXercise.g:2040:1: rule__Task__Group__2 : rule__Task__Group__2__Impl ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2044:1: ( rule__Task__Group__2__Impl )
            // InternalXercise.g:2045:2: rule__Task__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__2__Impl();

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
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalXercise.g:2051:1: rule__Task__Group__2__Impl : ( ( rule__Task__AAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2055:1: ( ( ( rule__Task__AAssignment_2 ) ) )
            // InternalXercise.g:2056:1: ( ( rule__Task__AAssignment_2 ) )
            {
            // InternalXercise.g:2056:1: ( ( rule__Task__AAssignment_2 ) )
            // InternalXercise.g:2057:2: ( rule__Task__AAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getAAssignment_2()); 
            // InternalXercise.g:2058:2: ( rule__Task__AAssignment_2 )
            // InternalXercise.g:2058:3: rule__Task__AAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__AAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAAssignment_2()); 

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
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__StringAnswer__Group__0"
    // InternalXercise.g:2067:1: rule__StringAnswer__Group__0 : rule__StringAnswer__Group__0__Impl rule__StringAnswer__Group__1 ;
    public final void rule__StringAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2071:1: ( rule__StringAnswer__Group__0__Impl rule__StringAnswer__Group__1 )
            // InternalXercise.g:2072:2: rule__StringAnswer__Group__0__Impl rule__StringAnswer__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__StringAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringAnswer__Group__1();

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
    // $ANTLR end "rule__StringAnswer__Group__0"


    // $ANTLR start "rule__StringAnswer__Group__0__Impl"
    // InternalXercise.g:2079:1: rule__StringAnswer__Group__0__Impl : ( ( rule__StringAnswer__ValueAssignment_0 ) ) ;
    public final void rule__StringAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2083:1: ( ( ( rule__StringAnswer__ValueAssignment_0 ) ) )
            // InternalXercise.g:2084:1: ( ( rule__StringAnswer__ValueAssignment_0 ) )
            {
            // InternalXercise.g:2084:1: ( ( rule__StringAnswer__ValueAssignment_0 ) )
            // InternalXercise.g:2085:2: ( rule__StringAnswer__ValueAssignment_0 )
            {
             before(grammarAccess.getStringAnswerAccess().getValueAssignment_0()); 
            // InternalXercise.g:2086:2: ( rule__StringAnswer__ValueAssignment_0 )
            // InternalXercise.g:2086:3: rule__StringAnswer__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringAnswer__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringAnswerAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__StringAnswer__Group__0__Impl"


    // $ANTLR start "rule__StringAnswer__Group__1"
    // InternalXercise.g:2094:1: rule__StringAnswer__Group__1 : rule__StringAnswer__Group__1__Impl ;
    public final void rule__StringAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2098:1: ( rule__StringAnswer__Group__1__Impl )
            // InternalXercise.g:2099:2: rule__StringAnswer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringAnswer__Group__1__Impl();

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
    // $ANTLR end "rule__StringAnswer__Group__1"


    // $ANTLR start "rule__StringAnswer__Group__1__Impl"
    // InternalXercise.g:2105:1: rule__StringAnswer__Group__1__Impl : ( ( rule__StringAnswer__IgnoreCaseAssignment_1 )? ) ;
    public final void rule__StringAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2109:1: ( ( ( rule__StringAnswer__IgnoreCaseAssignment_1 )? ) )
            // InternalXercise.g:2110:1: ( ( rule__StringAnswer__IgnoreCaseAssignment_1 )? )
            {
            // InternalXercise.g:2110:1: ( ( rule__StringAnswer__IgnoreCaseAssignment_1 )? )
            // InternalXercise.g:2111:2: ( rule__StringAnswer__IgnoreCaseAssignment_1 )?
            {
             before(grammarAccess.getStringAnswerAccess().getIgnoreCaseAssignment_1()); 
            // InternalXercise.g:2112:2: ( rule__StringAnswer__IgnoreCaseAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXercise.g:2112:3: rule__StringAnswer__IgnoreCaseAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringAnswer__IgnoreCaseAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringAnswerAccess().getIgnoreCaseAssignment_1()); 

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
    // $ANTLR end "rule__StringAnswer__Group__1__Impl"


    // $ANTLR start "rule__RegexAnswer__Group__0"
    // InternalXercise.g:2121:1: rule__RegexAnswer__Group__0 : rule__RegexAnswer__Group__0__Impl rule__RegexAnswer__Group__1 ;
    public final void rule__RegexAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2125:1: ( rule__RegexAnswer__Group__0__Impl rule__RegexAnswer__Group__1 )
            // InternalXercise.g:2126:2: rule__RegexAnswer__Group__0__Impl rule__RegexAnswer__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RegexAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegexAnswer__Group__1();

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
    // $ANTLR end "rule__RegexAnswer__Group__0"


    // $ANTLR start "rule__RegexAnswer__Group__0__Impl"
    // InternalXercise.g:2133:1: rule__RegexAnswer__Group__0__Impl : ( ( rule__RegexAnswer__RegexpAssignment_0 ) ) ;
    public final void rule__RegexAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2137:1: ( ( ( rule__RegexAnswer__RegexpAssignment_0 ) ) )
            // InternalXercise.g:2138:1: ( ( rule__RegexAnswer__RegexpAssignment_0 ) )
            {
            // InternalXercise.g:2138:1: ( ( rule__RegexAnswer__RegexpAssignment_0 ) )
            // InternalXercise.g:2139:2: ( rule__RegexAnswer__RegexpAssignment_0 )
            {
             before(grammarAccess.getRegexAnswerAccess().getRegexpAssignment_0()); 
            // InternalXercise.g:2140:2: ( rule__RegexAnswer__RegexpAssignment_0 )
            // InternalXercise.g:2140:3: rule__RegexAnswer__RegexpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RegexAnswer__RegexpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegexAnswerAccess().getRegexpAssignment_0()); 

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
    // $ANTLR end "rule__RegexAnswer__Group__0__Impl"


    // $ANTLR start "rule__RegexAnswer__Group__1"
    // InternalXercise.g:2148:1: rule__RegexAnswer__Group__1 : rule__RegexAnswer__Group__1__Impl rule__RegexAnswer__Group__2 ;
    public final void rule__RegexAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2152:1: ( rule__RegexAnswer__Group__1__Impl rule__RegexAnswer__Group__2 )
            // InternalXercise.g:2153:2: rule__RegexAnswer__Group__1__Impl rule__RegexAnswer__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__RegexAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegexAnswer__Group__2();

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
    // $ANTLR end "rule__RegexAnswer__Group__1"


    // $ANTLR start "rule__RegexAnswer__Group__1__Impl"
    // InternalXercise.g:2160:1: rule__RegexAnswer__Group__1__Impl : ( ( rule__RegexAnswer__ValueAssignment_1 ) ) ;
    public final void rule__RegexAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2164:1: ( ( ( rule__RegexAnswer__ValueAssignment_1 ) ) )
            // InternalXercise.g:2165:1: ( ( rule__RegexAnswer__ValueAssignment_1 ) )
            {
            // InternalXercise.g:2165:1: ( ( rule__RegexAnswer__ValueAssignment_1 ) )
            // InternalXercise.g:2166:2: ( rule__RegexAnswer__ValueAssignment_1 )
            {
             before(grammarAccess.getRegexAnswerAccess().getValueAssignment_1()); 
            // InternalXercise.g:2167:2: ( rule__RegexAnswer__ValueAssignment_1 )
            // InternalXercise.g:2167:3: rule__RegexAnswer__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RegexAnswer__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegexAnswerAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__RegexAnswer__Group__1__Impl"


    // $ANTLR start "rule__RegexAnswer__Group__2"
    // InternalXercise.g:2175:1: rule__RegexAnswer__Group__2 : rule__RegexAnswer__Group__2__Impl rule__RegexAnswer__Group__3 ;
    public final void rule__RegexAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2179:1: ( rule__RegexAnswer__Group__2__Impl rule__RegexAnswer__Group__3 )
            // InternalXercise.g:2180:2: rule__RegexAnswer__Group__2__Impl rule__RegexAnswer__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__RegexAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegexAnswer__Group__3();

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
    // $ANTLR end "rule__RegexAnswer__Group__2"


    // $ANTLR start "rule__RegexAnswer__Group__2__Impl"
    // InternalXercise.g:2187:1: rule__RegexAnswer__Group__2__Impl : ( '/' ) ;
    public final void rule__RegexAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2191:1: ( ( '/' ) )
            // InternalXercise.g:2192:1: ( '/' )
            {
            // InternalXercise.g:2192:1: ( '/' )
            // InternalXercise.g:2193:2: '/'
            {
             before(grammarAccess.getRegexAnswerAccess().getSolidusKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRegexAnswerAccess().getSolidusKeyword_2()); 

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
    // $ANTLR end "rule__RegexAnswer__Group__2__Impl"


    // $ANTLR start "rule__RegexAnswer__Group__3"
    // InternalXercise.g:2202:1: rule__RegexAnswer__Group__3 : rule__RegexAnswer__Group__3__Impl ;
    public final void rule__RegexAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2206:1: ( rule__RegexAnswer__Group__3__Impl )
            // InternalXercise.g:2207:2: rule__RegexAnswer__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegexAnswer__Group__3__Impl();

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
    // $ANTLR end "rule__RegexAnswer__Group__3"


    // $ANTLR start "rule__RegexAnswer__Group__3__Impl"
    // InternalXercise.g:2213:1: rule__RegexAnswer__Group__3__Impl : ( ( rule__RegexAnswer__IgnoreCaseAssignment_3 )? ) ;
    public final void rule__RegexAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2217:1: ( ( ( rule__RegexAnswer__IgnoreCaseAssignment_3 )? ) )
            // InternalXercise.g:2218:1: ( ( rule__RegexAnswer__IgnoreCaseAssignment_3 )? )
            {
            // InternalXercise.g:2218:1: ( ( rule__RegexAnswer__IgnoreCaseAssignment_3 )? )
            // InternalXercise.g:2219:2: ( rule__RegexAnswer__IgnoreCaseAssignment_3 )?
            {
             before(grammarAccess.getRegexAnswerAccess().getIgnoreCaseAssignment_3()); 
            // InternalXercise.g:2220:2: ( rule__RegexAnswer__IgnoreCaseAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==56) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXercise.g:2220:3: rule__RegexAnswer__IgnoreCaseAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegexAnswer__IgnoreCaseAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegexAnswerAccess().getIgnoreCaseAssignment_3()); 

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
    // $ANTLR end "rule__RegexAnswer__Group__3__Impl"


    // $ANTLR start "rule__NumberAnswer__Group__0"
    // InternalXercise.g:2229:1: rule__NumberAnswer__Group__0 : rule__NumberAnswer__Group__0__Impl rule__NumberAnswer__Group__1 ;
    public final void rule__NumberAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2233:1: ( rule__NumberAnswer__Group__0__Impl rule__NumberAnswer__Group__1 )
            // InternalXercise.g:2234:2: rule__NumberAnswer__Group__0__Impl rule__NumberAnswer__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__NumberAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberAnswer__Group__1();

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
    // $ANTLR end "rule__NumberAnswer__Group__0"


    // $ANTLR start "rule__NumberAnswer__Group__0__Impl"
    // InternalXercise.g:2241:1: rule__NumberAnswer__Group__0__Impl : ( ( rule__NumberAnswer__ValueAssignment_0 ) ) ;
    public final void rule__NumberAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2245:1: ( ( ( rule__NumberAnswer__ValueAssignment_0 ) ) )
            // InternalXercise.g:2246:1: ( ( rule__NumberAnswer__ValueAssignment_0 ) )
            {
            // InternalXercise.g:2246:1: ( ( rule__NumberAnswer__ValueAssignment_0 ) )
            // InternalXercise.g:2247:2: ( rule__NumberAnswer__ValueAssignment_0 )
            {
             before(grammarAccess.getNumberAnswerAccess().getValueAssignment_0()); 
            // InternalXercise.g:2248:2: ( rule__NumberAnswer__ValueAssignment_0 )
            // InternalXercise.g:2248:3: rule__NumberAnswer__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumberAnswer__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__NumberAnswer__Group__0__Impl"


    // $ANTLR start "rule__NumberAnswer__Group__1"
    // InternalXercise.g:2256:1: rule__NumberAnswer__Group__1 : rule__NumberAnswer__Group__1__Impl ;
    public final void rule__NumberAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2260:1: ( rule__NumberAnswer__Group__1__Impl )
            // InternalXercise.g:2261:2: rule__NumberAnswer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberAnswer__Group__1__Impl();

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
    // $ANTLR end "rule__NumberAnswer__Group__1"


    // $ANTLR start "rule__NumberAnswer__Group__1__Impl"
    // InternalXercise.g:2267:1: rule__NumberAnswer__Group__1__Impl : ( ( rule__NumberAnswer__Group_1__0 )? ) ;
    public final void rule__NumberAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2271:1: ( ( ( rule__NumberAnswer__Group_1__0 )? ) )
            // InternalXercise.g:2272:1: ( ( rule__NumberAnswer__Group_1__0 )? )
            {
            // InternalXercise.g:2272:1: ( ( rule__NumberAnswer__Group_1__0 )? )
            // InternalXercise.g:2273:2: ( rule__NumberAnswer__Group_1__0 )?
            {
             before(grammarAccess.getNumberAnswerAccess().getGroup_1()); 
            // InternalXercise.g:2274:2: ( rule__NumberAnswer__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXercise.g:2274:3: rule__NumberAnswer__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberAnswer__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAnswerAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NumberAnswer__Group__1__Impl"


    // $ANTLR start "rule__NumberAnswer__Group_1__0"
    // InternalXercise.g:2283:1: rule__NumberAnswer__Group_1__0 : rule__NumberAnswer__Group_1__0__Impl rule__NumberAnswer__Group_1__1 ;
    public final void rule__NumberAnswer__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2287:1: ( rule__NumberAnswer__Group_1__0__Impl rule__NumberAnswer__Group_1__1 )
            // InternalXercise.g:2288:2: rule__NumberAnswer__Group_1__0__Impl rule__NumberAnswer__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__NumberAnswer__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberAnswer__Group_1__1();

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
    // $ANTLR end "rule__NumberAnswer__Group_1__0"


    // $ANTLR start "rule__NumberAnswer__Group_1__0__Impl"
    // InternalXercise.g:2295:1: rule__NumberAnswer__Group_1__0__Impl : ( '+-' ) ;
    public final void rule__NumberAnswer__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2299:1: ( ( '+-' ) )
            // InternalXercise.g:2300:1: ( '+-' )
            {
            // InternalXercise.g:2300:1: ( '+-' )
            // InternalXercise.g:2301:2: '+-'
            {
             before(grammarAccess.getNumberAnswerAccess().getPlusSignHyphenMinusKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNumberAnswerAccess().getPlusSignHyphenMinusKeyword_1_0()); 

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
    // $ANTLR end "rule__NumberAnswer__Group_1__0__Impl"


    // $ANTLR start "rule__NumberAnswer__Group_1__1"
    // InternalXercise.g:2310:1: rule__NumberAnswer__Group_1__1 : rule__NumberAnswer__Group_1__1__Impl ;
    public final void rule__NumberAnswer__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2314:1: ( rule__NumberAnswer__Group_1__1__Impl )
            // InternalXercise.g:2315:2: rule__NumberAnswer__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberAnswer__Group_1__1__Impl();

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
    // $ANTLR end "rule__NumberAnswer__Group_1__1"


    // $ANTLR start "rule__NumberAnswer__Group_1__1__Impl"
    // InternalXercise.g:2321:1: rule__NumberAnswer__Group_1__1__Impl : ( ( rule__NumberAnswer__ErrorMarginAssignment_1_1 ) ) ;
    public final void rule__NumberAnswer__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2325:1: ( ( ( rule__NumberAnswer__ErrorMarginAssignment_1_1 ) ) )
            // InternalXercise.g:2326:1: ( ( rule__NumberAnswer__ErrorMarginAssignment_1_1 ) )
            {
            // InternalXercise.g:2326:1: ( ( rule__NumberAnswer__ErrorMarginAssignment_1_1 ) )
            // InternalXercise.g:2327:2: ( rule__NumberAnswer__ErrorMarginAssignment_1_1 )
            {
             before(grammarAccess.getNumberAnswerAccess().getErrorMarginAssignment_1_1()); 
            // InternalXercise.g:2328:2: ( rule__NumberAnswer__ErrorMarginAssignment_1_1 )
            // InternalXercise.g:2328:3: rule__NumberAnswer__ErrorMarginAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberAnswer__ErrorMarginAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getErrorMarginAssignment_1_1()); 

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
    // $ANTLR end "rule__NumberAnswer__Group_1__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__0"
    // InternalXercise.g:2337:1: rule__EDoubleObject__Group__0 : rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1 ;
    public final void rule__EDoubleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2341:1: ( rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1 )
            // InternalXercise.g:2342:2: rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EDoubleObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__1();

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
    // $ANTLR end "rule__EDoubleObject__Group__0"


    // $ANTLR start "rule__EDoubleObject__Group__0__Impl"
    // InternalXercise.g:2349:1: rule__EDoubleObject__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EDoubleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2353:1: ( ( RULE_INT ) )
            // InternalXercise.g:2354:1: ( RULE_INT )
            {
            // InternalXercise.g:2354:1: ( RULE_INT )
            // InternalXercise.g:2355:2: RULE_INT
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__0__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__1"
    // InternalXercise.g:2364:1: rule__EDoubleObject__Group__1 : rule__EDoubleObject__Group__1__Impl ;
    public final void rule__EDoubleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2368:1: ( rule__EDoubleObject__Group__1__Impl )
            // InternalXercise.g:2369:2: rule__EDoubleObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__1__Impl();

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
    // $ANTLR end "rule__EDoubleObject__Group__1"


    // $ANTLR start "rule__EDoubleObject__Group__1__Impl"
    // InternalXercise.g:2375:1: rule__EDoubleObject__Group__1__Impl : ( ( rule__EDoubleObject__Group_1__0 )? ) ;
    public final void rule__EDoubleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2379:1: ( ( ( rule__EDoubleObject__Group_1__0 )? ) )
            // InternalXercise.g:2380:1: ( ( rule__EDoubleObject__Group_1__0 )? )
            {
            // InternalXercise.g:2380:1: ( ( rule__EDoubleObject__Group_1__0 )? )
            // InternalXercise.g:2381:2: ( rule__EDoubleObject__Group_1__0 )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getGroup_1()); 
            // InternalXercise.g:2382:2: ( rule__EDoubleObject__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXercise.g:2382:3: rule__EDoubleObject__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDoubleObject__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group_1__0"
    // InternalXercise.g:2391:1: rule__EDoubleObject__Group_1__0 : rule__EDoubleObject__Group_1__0__Impl rule__EDoubleObject__Group_1__1 ;
    public final void rule__EDoubleObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2395:1: ( rule__EDoubleObject__Group_1__0__Impl rule__EDoubleObject__Group_1__1 )
            // InternalXercise.g:2396:2: rule__EDoubleObject__Group_1__0__Impl rule__EDoubleObject__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__EDoubleObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group_1__1();

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
    // $ANTLR end "rule__EDoubleObject__Group_1__0"


    // $ANTLR start "rule__EDoubleObject__Group_1__0__Impl"
    // InternalXercise.g:2403:1: rule__EDoubleObject__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EDoubleObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2407:1: ( ( '.' ) )
            // InternalXercise.g:2408:1: ( '.' )
            {
            // InternalXercise.g:2408:1: ( '.' )
            // InternalXercise.g:2409:2: '.'
            {
             before(grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__EDoubleObject__Group_1__0__Impl"


    // $ANTLR start "rule__EDoubleObject__Group_1__1"
    // InternalXercise.g:2418:1: rule__EDoubleObject__Group_1__1 : rule__EDoubleObject__Group_1__1__Impl ;
    public final void rule__EDoubleObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2422:1: ( rule__EDoubleObject__Group_1__1__Impl )
            // InternalXercise.g:2423:2: rule__EDoubleObject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group_1__1__Impl();

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
    // $ANTLR end "rule__EDoubleObject__Group_1__1"


    // $ANTLR start "rule__EDoubleObject__Group_1__1__Impl"
    // InternalXercise.g:2429:1: rule__EDoubleObject__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__EDoubleObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2433:1: ( ( RULE_INT ) )
            // InternalXercise.g:2434:1: ( RULE_INT )
            {
            // InternalXercise.g:2434:1: ( RULE_INT )
            // InternalXercise.g:2435:2: RULE_INT
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__EDoubleObject__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanAnswer__Group__0"
    // InternalXercise.g:2445:1: rule__BooleanAnswer__Group__0 : rule__BooleanAnswer__Group__0__Impl rule__BooleanAnswer__Group__1 ;
    public final void rule__BooleanAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2449:1: ( rule__BooleanAnswer__Group__0__Impl rule__BooleanAnswer__Group__1 )
            // InternalXercise.g:2450:2: rule__BooleanAnswer__Group__0__Impl rule__BooleanAnswer__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__BooleanAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanAnswer__Group__1();

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
    // $ANTLR end "rule__BooleanAnswer__Group__0"


    // $ANTLR start "rule__BooleanAnswer__Group__0__Impl"
    // InternalXercise.g:2457:1: rule__BooleanAnswer__Group__0__Impl : ( () ) ;
    public final void rule__BooleanAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2461:1: ( ( () ) )
            // InternalXercise.g:2462:1: ( () )
            {
            // InternalXercise.g:2462:1: ( () )
            // InternalXercise.g:2463:2: ()
            {
             before(grammarAccess.getBooleanAnswerAccess().getBooleanAnswerAction_0()); 
            // InternalXercise.g:2464:2: ()
            // InternalXercise.g:2464:3: 
            {
            }

             after(grammarAccess.getBooleanAnswerAccess().getBooleanAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnswer__Group__0__Impl"


    // $ANTLR start "rule__BooleanAnswer__Group__1"
    // InternalXercise.g:2472:1: rule__BooleanAnswer__Group__1 : rule__BooleanAnswer__Group__1__Impl ;
    public final void rule__BooleanAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2476:1: ( rule__BooleanAnswer__Group__1__Impl )
            // InternalXercise.g:2477:2: rule__BooleanAnswer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAnswer__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanAnswer__Group__1"


    // $ANTLR start "rule__BooleanAnswer__Group__1__Impl"
    // InternalXercise.g:2483:1: rule__BooleanAnswer__Group__1__Impl : ( ( rule__BooleanAnswer__Alternatives_1 ) ) ;
    public final void rule__BooleanAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2487:1: ( ( ( rule__BooleanAnswer__Alternatives_1 ) ) )
            // InternalXercise.g:2488:1: ( ( rule__BooleanAnswer__Alternatives_1 ) )
            {
            // InternalXercise.g:2488:1: ( ( rule__BooleanAnswer__Alternatives_1 ) )
            // InternalXercise.g:2489:2: ( rule__BooleanAnswer__Alternatives_1 )
            {
             before(grammarAccess.getBooleanAnswerAccess().getAlternatives_1()); 
            // InternalXercise.g:2490:2: ( rule__BooleanAnswer__Alternatives_1 )
            // InternalXercise.g:2490:3: rule__BooleanAnswer__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAnswer__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAnswerAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__BooleanAnswer__Group__1__Impl"


    // $ANTLR start "rule__SingleBoxOption__Group__0"
    // InternalXercise.g:2499:1: rule__SingleBoxOption__Group__0 : rule__SingleBoxOption__Group__0__Impl rule__SingleBoxOption__Group__1 ;
    public final void rule__SingleBoxOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2503:1: ( rule__SingleBoxOption__Group__0__Impl rule__SingleBoxOption__Group__1 )
            // InternalXercise.g:2504:2: rule__SingleBoxOption__Group__0__Impl rule__SingleBoxOption__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__SingleBoxOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBoxOption__Group__1();

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
    // $ANTLR end "rule__SingleBoxOption__Group__0"


    // $ANTLR start "rule__SingleBoxOption__Group__0__Impl"
    // InternalXercise.g:2511:1: rule__SingleBoxOption__Group__0__Impl : ( '(' ) ;
    public final void rule__SingleBoxOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2515:1: ( ( '(' ) )
            // InternalXercise.g:2516:1: ( '(' )
            {
            // InternalXercise.g:2516:1: ( '(' )
            // InternalXercise.g:2517:2: '('
            {
             before(grammarAccess.getSingleBoxOptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSingleBoxOptionAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__SingleBoxOption__Group__0__Impl"


    // $ANTLR start "rule__SingleBoxOption__Group__1"
    // InternalXercise.g:2526:1: rule__SingleBoxOption__Group__1 : rule__SingleBoxOption__Group__1__Impl rule__SingleBoxOption__Group__2 ;
    public final void rule__SingleBoxOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2530:1: ( rule__SingleBoxOption__Group__1__Impl rule__SingleBoxOption__Group__2 )
            // InternalXercise.g:2531:2: rule__SingleBoxOption__Group__1__Impl rule__SingleBoxOption__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__SingleBoxOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBoxOption__Group__2();

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
    // $ANTLR end "rule__SingleBoxOption__Group__1"


    // $ANTLR start "rule__SingleBoxOption__Group__1__Impl"
    // InternalXercise.g:2538:1: rule__SingleBoxOption__Group__1__Impl : ( ( rule__SingleBoxOption__CorrectAssignment_1 )? ) ;
    public final void rule__SingleBoxOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2542:1: ( ( ( rule__SingleBoxOption__CorrectAssignment_1 )? ) )
            // InternalXercise.g:2543:1: ( ( rule__SingleBoxOption__CorrectAssignment_1 )? )
            {
            // InternalXercise.g:2543:1: ( ( rule__SingleBoxOption__CorrectAssignment_1 )? )
            // InternalXercise.g:2544:2: ( rule__SingleBoxOption__CorrectAssignment_1 )?
            {
             before(grammarAccess.getSingleBoxOptionAccess().getCorrectAssignment_1()); 
            // InternalXercise.g:2545:2: ( rule__SingleBoxOption__CorrectAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXercise.g:2545:3: rule__SingleBoxOption__CorrectAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleBoxOption__CorrectAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleBoxOptionAccess().getCorrectAssignment_1()); 

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
    // $ANTLR end "rule__SingleBoxOption__Group__1__Impl"


    // $ANTLR start "rule__SingleBoxOption__Group__2"
    // InternalXercise.g:2553:1: rule__SingleBoxOption__Group__2 : rule__SingleBoxOption__Group__2__Impl rule__SingleBoxOption__Group__3 ;
    public final void rule__SingleBoxOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2557:1: ( rule__SingleBoxOption__Group__2__Impl rule__SingleBoxOption__Group__3 )
            // InternalXercise.g:2558:2: rule__SingleBoxOption__Group__2__Impl rule__SingleBoxOption__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__SingleBoxOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBoxOption__Group__3();

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
    // $ANTLR end "rule__SingleBoxOption__Group__2"


    // $ANTLR start "rule__SingleBoxOption__Group__2__Impl"
    // InternalXercise.g:2565:1: rule__SingleBoxOption__Group__2__Impl : ( ')' ) ;
    public final void rule__SingleBoxOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2569:1: ( ( ')' ) )
            // InternalXercise.g:2570:1: ( ')' )
            {
            // InternalXercise.g:2570:1: ( ')' )
            // InternalXercise.g:2571:2: ')'
            {
             before(grammarAccess.getSingleBoxOptionAccess().getRightParenthesisKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSingleBoxOptionAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__SingleBoxOption__Group__2__Impl"


    // $ANTLR start "rule__SingleBoxOption__Group__3"
    // InternalXercise.g:2580:1: rule__SingleBoxOption__Group__3 : rule__SingleBoxOption__Group__3__Impl ;
    public final void rule__SingleBoxOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2584:1: ( rule__SingleBoxOption__Group__3__Impl )
            // InternalXercise.g:2585:2: rule__SingleBoxOption__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleBoxOption__Group__3__Impl();

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
    // $ANTLR end "rule__SingleBoxOption__Group__3"


    // $ANTLR start "rule__SingleBoxOption__Group__3__Impl"
    // InternalXercise.g:2591:1: rule__SingleBoxOption__Group__3__Impl : ( ( rule__SingleBoxOption__OptionAssignment_3 ) ) ;
    public final void rule__SingleBoxOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2595:1: ( ( ( rule__SingleBoxOption__OptionAssignment_3 ) ) )
            // InternalXercise.g:2596:1: ( ( rule__SingleBoxOption__OptionAssignment_3 ) )
            {
            // InternalXercise.g:2596:1: ( ( rule__SingleBoxOption__OptionAssignment_3 ) )
            // InternalXercise.g:2597:2: ( rule__SingleBoxOption__OptionAssignment_3 )
            {
             before(grammarAccess.getSingleBoxOptionAccess().getOptionAssignment_3()); 
            // InternalXercise.g:2598:2: ( rule__SingleBoxOption__OptionAssignment_3 )
            // InternalXercise.g:2598:3: rule__SingleBoxOption__OptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SingleBoxOption__OptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleBoxOptionAccess().getOptionAssignment_3()); 

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
    // $ANTLR end "rule__SingleBoxOption__Group__3__Impl"


    // $ANTLR start "rule__SingleListOption__Group__0"
    // InternalXercise.g:2607:1: rule__SingleListOption__Group__0 : rule__SingleListOption__Group__0__Impl rule__SingleListOption__Group__1 ;
    public final void rule__SingleListOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2611:1: ( rule__SingleListOption__Group__0__Impl rule__SingleListOption__Group__1 )
            // InternalXercise.g:2612:2: rule__SingleListOption__Group__0__Impl rule__SingleListOption__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__SingleListOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleListOption__Group__1();

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
    // $ANTLR end "rule__SingleListOption__Group__0"


    // $ANTLR start "rule__SingleListOption__Group__0__Impl"
    // InternalXercise.g:2619:1: rule__SingleListOption__Group__0__Impl : ( ( rule__SingleListOption__Alternatives_0 ) ) ;
    public final void rule__SingleListOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2623:1: ( ( ( rule__SingleListOption__Alternatives_0 ) ) )
            // InternalXercise.g:2624:1: ( ( rule__SingleListOption__Alternatives_0 ) )
            {
            // InternalXercise.g:2624:1: ( ( rule__SingleListOption__Alternatives_0 ) )
            // InternalXercise.g:2625:2: ( rule__SingleListOption__Alternatives_0 )
            {
             before(grammarAccess.getSingleListOptionAccess().getAlternatives_0()); 
            // InternalXercise.g:2626:2: ( rule__SingleListOption__Alternatives_0 )
            // InternalXercise.g:2626:3: rule__SingleListOption__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleListOption__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleListOptionAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__SingleListOption__Group__0__Impl"


    // $ANTLR start "rule__SingleListOption__Group__1"
    // InternalXercise.g:2634:1: rule__SingleListOption__Group__1 : rule__SingleListOption__Group__1__Impl ;
    public final void rule__SingleListOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2638:1: ( rule__SingleListOption__Group__1__Impl )
            // InternalXercise.g:2639:2: rule__SingleListOption__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleListOption__Group__1__Impl();

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
    // $ANTLR end "rule__SingleListOption__Group__1"


    // $ANTLR start "rule__SingleListOption__Group__1__Impl"
    // InternalXercise.g:2645:1: rule__SingleListOption__Group__1__Impl : ( ( rule__SingleListOption__OptionAssignment_1 ) ) ;
    public final void rule__SingleListOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2649:1: ( ( ( rule__SingleListOption__OptionAssignment_1 ) ) )
            // InternalXercise.g:2650:1: ( ( rule__SingleListOption__OptionAssignment_1 ) )
            {
            // InternalXercise.g:2650:1: ( ( rule__SingleListOption__OptionAssignment_1 ) )
            // InternalXercise.g:2651:2: ( rule__SingleListOption__OptionAssignment_1 )
            {
             before(grammarAccess.getSingleListOptionAccess().getOptionAssignment_1()); 
            // InternalXercise.g:2652:2: ( rule__SingleListOption__OptionAssignment_1 )
            // InternalXercise.g:2652:3: rule__SingleListOption__OptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleListOption__OptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleListOptionAccess().getOptionAssignment_1()); 

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
    // $ANTLR end "rule__SingleListOption__Group__1__Impl"


    // $ANTLR start "rule__ManyOption__Group__0"
    // InternalXercise.g:2661:1: rule__ManyOption__Group__0 : rule__ManyOption__Group__0__Impl rule__ManyOption__Group__1 ;
    public final void rule__ManyOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2665:1: ( rule__ManyOption__Group__0__Impl rule__ManyOption__Group__1 )
            // InternalXercise.g:2666:2: rule__ManyOption__Group__0__Impl rule__ManyOption__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ManyOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyOption__Group__1();

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
    // $ANTLR end "rule__ManyOption__Group__0"


    // $ANTLR start "rule__ManyOption__Group__0__Impl"
    // InternalXercise.g:2673:1: rule__ManyOption__Group__0__Impl : ( '[' ) ;
    public final void rule__ManyOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2677:1: ( ( '[' ) )
            // InternalXercise.g:2678:1: ( '[' )
            {
            // InternalXercise.g:2678:1: ( '[' )
            // InternalXercise.g:2679:2: '['
            {
             before(grammarAccess.getManyOptionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getManyOptionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__ManyOption__Group__0__Impl"


    // $ANTLR start "rule__ManyOption__Group__1"
    // InternalXercise.g:2688:1: rule__ManyOption__Group__1 : rule__ManyOption__Group__1__Impl rule__ManyOption__Group__2 ;
    public final void rule__ManyOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2692:1: ( rule__ManyOption__Group__1__Impl rule__ManyOption__Group__2 )
            // InternalXercise.g:2693:2: rule__ManyOption__Group__1__Impl rule__ManyOption__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ManyOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyOption__Group__2();

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
    // $ANTLR end "rule__ManyOption__Group__1"


    // $ANTLR start "rule__ManyOption__Group__1__Impl"
    // InternalXercise.g:2700:1: rule__ManyOption__Group__1__Impl : ( ( rule__ManyOption__CorrectAssignment_1 )? ) ;
    public final void rule__ManyOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2704:1: ( ( ( rule__ManyOption__CorrectAssignment_1 )? ) )
            // InternalXercise.g:2705:1: ( ( rule__ManyOption__CorrectAssignment_1 )? )
            {
            // InternalXercise.g:2705:1: ( ( rule__ManyOption__CorrectAssignment_1 )? )
            // InternalXercise.g:2706:2: ( rule__ManyOption__CorrectAssignment_1 )?
            {
             before(grammarAccess.getManyOptionAccess().getCorrectAssignment_1()); 
            // InternalXercise.g:2707:2: ( rule__ManyOption__CorrectAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXercise.g:2707:3: rule__ManyOption__CorrectAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManyOption__CorrectAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManyOptionAccess().getCorrectAssignment_1()); 

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
    // $ANTLR end "rule__ManyOption__Group__1__Impl"


    // $ANTLR start "rule__ManyOption__Group__2"
    // InternalXercise.g:2715:1: rule__ManyOption__Group__2 : rule__ManyOption__Group__2__Impl rule__ManyOption__Group__3 ;
    public final void rule__ManyOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2719:1: ( rule__ManyOption__Group__2__Impl rule__ManyOption__Group__3 )
            // InternalXercise.g:2720:2: rule__ManyOption__Group__2__Impl rule__ManyOption__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ManyOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManyOption__Group__3();

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
    // $ANTLR end "rule__ManyOption__Group__2"


    // $ANTLR start "rule__ManyOption__Group__2__Impl"
    // InternalXercise.g:2727:1: rule__ManyOption__Group__2__Impl : ( ']' ) ;
    public final void rule__ManyOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2731:1: ( ( ']' ) )
            // InternalXercise.g:2732:1: ( ']' )
            {
            // InternalXercise.g:2732:1: ( ']' )
            // InternalXercise.g:2733:2: ']'
            {
             before(grammarAccess.getManyOptionAccess().getRightSquareBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getManyOptionAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__ManyOption__Group__2__Impl"


    // $ANTLR start "rule__ManyOption__Group__3"
    // InternalXercise.g:2742:1: rule__ManyOption__Group__3 : rule__ManyOption__Group__3__Impl ;
    public final void rule__ManyOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2746:1: ( rule__ManyOption__Group__3__Impl )
            // InternalXercise.g:2747:2: rule__ManyOption__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManyOption__Group__3__Impl();

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
    // $ANTLR end "rule__ManyOption__Group__3"


    // $ANTLR start "rule__ManyOption__Group__3__Impl"
    // InternalXercise.g:2753:1: rule__ManyOption__Group__3__Impl : ( ( rule__ManyOption__OptionAssignment_3 ) ) ;
    public final void rule__ManyOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2757:1: ( ( ( rule__ManyOption__OptionAssignment_3 ) ) )
            // InternalXercise.g:2758:1: ( ( rule__ManyOption__OptionAssignment_3 ) )
            {
            // InternalXercise.g:2758:1: ( ( rule__ManyOption__OptionAssignment_3 ) )
            // InternalXercise.g:2759:2: ( rule__ManyOption__OptionAssignment_3 )
            {
             before(grammarAccess.getManyOptionAccess().getOptionAssignment_3()); 
            // InternalXercise.g:2760:2: ( rule__ManyOption__OptionAssignment_3 )
            // InternalXercise.g:2760:3: rule__ManyOption__OptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ManyOption__OptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyOptionAccess().getOptionAssignment_3()); 

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
    // $ANTLR end "rule__ManyOption__Group__3__Impl"


    // $ANTLR start "rule__JunitTestAnswer__Group__0"
    // InternalXercise.g:2769:1: rule__JunitTestAnswer__Group__0 : rule__JunitTestAnswer__Group__0__Impl rule__JunitTestAnswer__Group__1 ;
    public final void rule__JunitTestAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2773:1: ( rule__JunitTestAnswer__Group__0__Impl rule__JunitTestAnswer__Group__1 )
            // InternalXercise.g:2774:2: rule__JunitTestAnswer__Group__0__Impl rule__JunitTestAnswer__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__JunitTestAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__Group__1();

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
    // $ANTLR end "rule__JunitTestAnswer__Group__0"


    // $ANTLR start "rule__JunitTestAnswer__Group__0__Impl"
    // InternalXercise.g:2781:1: rule__JunitTestAnswer__Group__0__Impl : ( 'junit' ) ;
    public final void rule__JunitTestAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2785:1: ( ( 'junit' ) )
            // InternalXercise.g:2786:1: ( 'junit' )
            {
            // InternalXercise.g:2786:1: ( 'junit' )
            // InternalXercise.g:2787:2: 'junit'
            {
             before(grammarAccess.getJunitTestAnswerAccess().getJunitKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getJunitTestAnswerAccess().getJunitKeyword_0()); 

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
    // $ANTLR end "rule__JunitTestAnswer__Group__0__Impl"


    // $ANTLR start "rule__JunitTestAnswer__Group__1"
    // InternalXercise.g:2796:1: rule__JunitTestAnswer__Group__1 : rule__JunitTestAnswer__Group__1__Impl rule__JunitTestAnswer__Group__2 ;
    public final void rule__JunitTestAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2800:1: ( rule__JunitTestAnswer__Group__1__Impl rule__JunitTestAnswer__Group__2 )
            // InternalXercise.g:2801:2: rule__JunitTestAnswer__Group__1__Impl rule__JunitTestAnswer__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__JunitTestAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__Group__2();

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
    // $ANTLR end "rule__JunitTestAnswer__Group__1"


    // $ANTLR start "rule__JunitTestAnswer__Group__1__Impl"
    // InternalXercise.g:2808:1: rule__JunitTestAnswer__Group__1__Impl : ( ( rule__JunitTestAnswer__TestRunNameAssignment_1 ) ) ;
    public final void rule__JunitTestAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2812:1: ( ( ( rule__JunitTestAnswer__TestRunNameAssignment_1 ) ) )
            // InternalXercise.g:2813:1: ( ( rule__JunitTestAnswer__TestRunNameAssignment_1 ) )
            {
            // InternalXercise.g:2813:1: ( ( rule__JunitTestAnswer__TestRunNameAssignment_1 ) )
            // InternalXercise.g:2814:2: ( rule__JunitTestAnswer__TestRunNameAssignment_1 )
            {
             before(grammarAccess.getJunitTestAnswerAccess().getTestRunNameAssignment_1()); 
            // InternalXercise.g:2815:2: ( rule__JunitTestAnswer__TestRunNameAssignment_1 )
            // InternalXercise.g:2815:3: rule__JunitTestAnswer__TestRunNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__TestRunNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJunitTestAnswerAccess().getTestRunNameAssignment_1()); 

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
    // $ANTLR end "rule__JunitTestAnswer__Group__1__Impl"


    // $ANTLR start "rule__JunitTestAnswer__Group__2"
    // InternalXercise.g:2823:1: rule__JunitTestAnswer__Group__2 : rule__JunitTestAnswer__Group__2__Impl ;
    public final void rule__JunitTestAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2827:1: ( rule__JunitTestAnswer__Group__2__Impl )
            // InternalXercise.g:2828:2: rule__JunitTestAnswer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__Group__2__Impl();

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
    // $ANTLR end "rule__JunitTestAnswer__Group__2"


    // $ANTLR start "rule__JunitTestAnswer__Group__2__Impl"
    // InternalXercise.g:2834:1: rule__JunitTestAnswer__Group__2__Impl : ( ( rule__JunitTestAnswer__Group_2__0 )? ) ;
    public final void rule__JunitTestAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2838:1: ( ( ( rule__JunitTestAnswer__Group_2__0 )? ) )
            // InternalXercise.g:2839:1: ( ( rule__JunitTestAnswer__Group_2__0 )? )
            {
            // InternalXercise.g:2839:1: ( ( rule__JunitTestAnswer__Group_2__0 )? )
            // InternalXercise.g:2840:2: ( rule__JunitTestAnswer__Group_2__0 )?
            {
             before(grammarAccess.getJunitTestAnswerAccess().getGroup_2()); 
            // InternalXercise.g:2841:2: ( rule__JunitTestAnswer__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXercise.g:2841:3: rule__JunitTestAnswer__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JunitTestAnswer__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJunitTestAnswerAccess().getGroup_2()); 

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
    // $ANTLR end "rule__JunitTestAnswer__Group__2__Impl"


    // $ANTLR start "rule__JunitTestAnswer__Group_2__0"
    // InternalXercise.g:2850:1: rule__JunitTestAnswer__Group_2__0 : rule__JunitTestAnswer__Group_2__0__Impl rule__JunitTestAnswer__Group_2__1 ;
    public final void rule__JunitTestAnswer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2854:1: ( rule__JunitTestAnswer__Group_2__0__Impl rule__JunitTestAnswer__Group_2__1 )
            // InternalXercise.g:2855:2: rule__JunitTestAnswer__Group_2__0__Impl rule__JunitTestAnswer__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__JunitTestAnswer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__Group_2__1();

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2__0"


    // $ANTLR start "rule__JunitTestAnswer__Group_2__0__Impl"
    // InternalXercise.g:2862:1: rule__JunitTestAnswer__Group_2__0__Impl : ( '{' ) ;
    public final void rule__JunitTestAnswer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2866:1: ( ( '{' ) )
            // InternalXercise.g:2867:1: ( '{' )
            {
            // InternalXercise.g:2867:1: ( '{' )
            // InternalXercise.g:2868:2: '{'
            {
             before(grammarAccess.getJunitTestAnswerAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getJunitTestAnswerAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2__0__Impl"


    // $ANTLR start "rule__JunitTestAnswer__Group_2__1"
    // InternalXercise.g:2877:1: rule__JunitTestAnswer__Group_2__1 : rule__JunitTestAnswer__Group_2__1__Impl rule__JunitTestAnswer__Group_2__2 ;
    public final void rule__JunitTestAnswer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2881:1: ( rule__JunitTestAnswer__Group_2__1__Impl rule__JunitTestAnswer__Group_2__2 )
            // InternalXercise.g:2882:2: rule__JunitTestAnswer__Group_2__1__Impl rule__JunitTestAnswer__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__JunitTestAnswer__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__Group_2__2();

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2__1"


    // $ANTLR start "rule__JunitTestAnswer__Group_2__1__Impl"
    // InternalXercise.g:2889:1: rule__JunitTestAnswer__Group_2__1__Impl : ( ( rule__JunitTestAnswer__MethodNamesAssignment_2_1 ) ) ;
    public final void rule__JunitTestAnswer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2893:1: ( ( ( rule__JunitTestAnswer__MethodNamesAssignment_2_1 ) ) )
            // InternalXercise.g:2894:1: ( ( rule__JunitTestAnswer__MethodNamesAssignment_2_1 ) )
            {
            // InternalXercise.g:2894:1: ( ( rule__JunitTestAnswer__MethodNamesAssignment_2_1 ) )
            // InternalXercise.g:2895:2: ( rule__JunitTestAnswer__MethodNamesAssignment_2_1 )
            {
             before(grammarAccess.getJunitTestAnswerAccess().getMethodNamesAssignment_2_1()); 
            // InternalXercise.g:2896:2: ( rule__JunitTestAnswer__MethodNamesAssignment_2_1 )
            // InternalXercise.g:2896:3: rule__JunitTestAnswer__MethodNamesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__MethodNamesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJunitTestAnswerAccess().getMethodNamesAssignment_2_1()); 

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2__1__Impl"


    // $ANTLR start "rule__JunitTestAnswer__Group_2__2"
    // InternalXercise.g:2904:1: rule__JunitTestAnswer__Group_2__2 : rule__JunitTestAnswer__Group_2__2__Impl rule__JunitTestAnswer__Group_2__3 ;
    public final void rule__JunitTestAnswer__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2908:1: ( rule__JunitTestAnswer__Group_2__2__Impl rule__JunitTestAnswer__Group_2__3 )
            // InternalXercise.g:2909:2: rule__JunitTestAnswer__Group_2__2__Impl rule__JunitTestAnswer__Group_2__3
            {
            pushFollow(FOLLOW_27);
            rule__JunitTestAnswer__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__Group_2__3();

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2__2"


    // $ANTLR start "rule__JunitTestAnswer__Group_2__2__Impl"
    // InternalXercise.g:2916:1: rule__JunitTestAnswer__Group_2__2__Impl : ( ( rule__JunitTestAnswer__Group_2_2__0 )* ) ;
    public final void rule__JunitTestAnswer__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2920:1: ( ( ( rule__JunitTestAnswer__Group_2_2__0 )* ) )
            // InternalXercise.g:2921:1: ( ( rule__JunitTestAnswer__Group_2_2__0 )* )
            {
            // InternalXercise.g:2921:1: ( ( rule__JunitTestAnswer__Group_2_2__0 )* )
            // InternalXercise.g:2922:2: ( rule__JunitTestAnswer__Group_2_2__0 )*
            {
             before(grammarAccess.getJunitTestAnswerAccess().getGroup_2_2()); 
            // InternalXercise.g:2923:2: ( rule__JunitTestAnswer__Group_2_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==48) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalXercise.g:2923:3: rule__JunitTestAnswer__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__JunitTestAnswer__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getJunitTestAnswerAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2__2__Impl"


    // $ANTLR start "rule__JunitTestAnswer__Group_2__3"
    // InternalXercise.g:2931:1: rule__JunitTestAnswer__Group_2__3 : rule__JunitTestAnswer__Group_2__3__Impl ;
    public final void rule__JunitTestAnswer__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2935:1: ( rule__JunitTestAnswer__Group_2__3__Impl )
            // InternalXercise.g:2936:2: rule__JunitTestAnswer__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__Group_2__3__Impl();

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2__3"


    // $ANTLR start "rule__JunitTestAnswer__Group_2__3__Impl"
    // InternalXercise.g:2942:1: rule__JunitTestAnswer__Group_2__3__Impl : ( '}' ) ;
    public final void rule__JunitTestAnswer__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2946:1: ( ( '}' ) )
            // InternalXercise.g:2947:1: ( '}' )
            {
            // InternalXercise.g:2947:1: ( '}' )
            // InternalXercise.g:2948:2: '}'
            {
             before(grammarAccess.getJunitTestAnswerAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getJunitTestAnswerAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2__3__Impl"


    // $ANTLR start "rule__JunitTestAnswer__Group_2_2__0"
    // InternalXercise.g:2958:1: rule__JunitTestAnswer__Group_2_2__0 : rule__JunitTestAnswer__Group_2_2__0__Impl rule__JunitTestAnswer__Group_2_2__1 ;
    public final void rule__JunitTestAnswer__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2962:1: ( rule__JunitTestAnswer__Group_2_2__0__Impl rule__JunitTestAnswer__Group_2_2__1 )
            // InternalXercise.g:2963:2: rule__JunitTestAnswer__Group_2_2__0__Impl rule__JunitTestAnswer__Group_2_2__1
            {
            pushFollow(FOLLOW_12);
            rule__JunitTestAnswer__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__Group_2_2__1();

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2_2__0"


    // $ANTLR start "rule__JunitTestAnswer__Group_2_2__0__Impl"
    // InternalXercise.g:2970:1: rule__JunitTestAnswer__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__JunitTestAnswer__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2974:1: ( ( ',' ) )
            // InternalXercise.g:2975:1: ( ',' )
            {
            // InternalXercise.g:2975:1: ( ',' )
            // InternalXercise.g:2976:2: ','
            {
             before(grammarAccess.getJunitTestAnswerAccess().getCommaKeyword_2_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getJunitTestAnswerAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2_2__0__Impl"


    // $ANTLR start "rule__JunitTestAnswer__Group_2_2__1"
    // InternalXercise.g:2985:1: rule__JunitTestAnswer__Group_2_2__1 : rule__JunitTestAnswer__Group_2_2__1__Impl ;
    public final void rule__JunitTestAnswer__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:2989:1: ( rule__JunitTestAnswer__Group_2_2__1__Impl )
            // InternalXercise.g:2990:2: rule__JunitTestAnswer__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2_2__1"


    // $ANTLR start "rule__JunitTestAnswer__Group_2_2__1__Impl"
    // InternalXercise.g:2996:1: rule__JunitTestAnswer__Group_2_2__1__Impl : ( ( rule__JunitTestAnswer__MethodNamesAssignment_2_2_1 ) ) ;
    public final void rule__JunitTestAnswer__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3000:1: ( ( ( rule__JunitTestAnswer__MethodNamesAssignment_2_2_1 ) ) )
            // InternalXercise.g:3001:1: ( ( rule__JunitTestAnswer__MethodNamesAssignment_2_2_1 ) )
            {
            // InternalXercise.g:3001:1: ( ( rule__JunitTestAnswer__MethodNamesAssignment_2_2_1 ) )
            // InternalXercise.g:3002:2: ( rule__JunitTestAnswer__MethodNamesAssignment_2_2_1 )
            {
             before(grammarAccess.getJunitTestAnswerAccess().getMethodNamesAssignment_2_2_1()); 
            // InternalXercise.g:3003:2: ( rule__JunitTestAnswer__MethodNamesAssignment_2_2_1 )
            // InternalXercise.g:3003:3: rule__JunitTestAnswer__MethodNamesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JunitTestAnswer__MethodNamesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJunitTestAnswerAccess().getMethodNamesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__JunitTestAnswer__Group_2_2__1__Impl"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group__0"
    // InternalXercise.g:3012:1: rule__JdtSourceEditAnswer__Group__0 : rule__JdtSourceEditAnswer__Group__0__Impl rule__JdtSourceEditAnswer__Group__1 ;
    public final void rule__JdtSourceEditAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3016:1: ( rule__JdtSourceEditAnswer__Group__0__Impl rule__JdtSourceEditAnswer__Group__1 )
            // InternalXercise.g:3017:2: rule__JdtSourceEditAnswer__Group__0__Impl rule__JdtSourceEditAnswer__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__JdtSourceEditAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group__1();

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group__0"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group__0__Impl"
    // InternalXercise.g:3024:1: rule__JdtSourceEditAnswer__Group__0__Impl : ( 'java' ) ;
    public final void rule__JdtSourceEditAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3028:1: ( ( 'java' ) )
            // InternalXercise.g:3029:1: ( 'java' )
            {
            // InternalXercise.g:3029:1: ( 'java' )
            // InternalXercise.g:3030:2: 'java'
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getJavaKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getJdtSourceEditAnswerAccess().getJavaKeyword_0()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group__0__Impl"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group__1"
    // InternalXercise.g:3039:1: rule__JdtSourceEditAnswer__Group__1 : rule__JdtSourceEditAnswer__Group__1__Impl rule__JdtSourceEditAnswer__Group__2 ;
    public final void rule__JdtSourceEditAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3043:1: ( rule__JdtSourceEditAnswer__Group__1__Impl rule__JdtSourceEditAnswer__Group__2 )
            // InternalXercise.g:3044:2: rule__JdtSourceEditAnswer__Group__1__Impl rule__JdtSourceEditAnswer__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__JdtSourceEditAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group__2();

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group__1"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group__1__Impl"
    // InternalXercise.g:3051:1: rule__JdtSourceEditAnswer__Group__1__Impl : ( 'edit' ) ;
    public final void rule__JdtSourceEditAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3055:1: ( ( 'edit' ) )
            // InternalXercise.g:3056:1: ( 'edit' )
            {
            // InternalXercise.g:3056:1: ( 'edit' )
            // InternalXercise.g:3057:2: 'edit'
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getEditKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getJdtSourceEditAnswerAccess().getEditKeyword_1()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group__1__Impl"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group__2"
    // InternalXercise.g:3066:1: rule__JdtSourceEditAnswer__Group__2 : rule__JdtSourceEditAnswer__Group__2__Impl rule__JdtSourceEditAnswer__Group__3 ;
    public final void rule__JdtSourceEditAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3070:1: ( rule__JdtSourceEditAnswer__Group__2__Impl rule__JdtSourceEditAnswer__Group__3 )
            // InternalXercise.g:3071:2: rule__JdtSourceEditAnswer__Group__2__Impl rule__JdtSourceEditAnswer__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__JdtSourceEditAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group__3();

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group__2"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group__2__Impl"
    // InternalXercise.g:3078:1: rule__JdtSourceEditAnswer__Group__2__Impl : ( ( rule__JdtSourceEditAnswer__ClassNameAssignment_2 ) ) ;
    public final void rule__JdtSourceEditAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3082:1: ( ( ( rule__JdtSourceEditAnswer__ClassNameAssignment_2 ) ) )
            // InternalXercise.g:3083:1: ( ( rule__JdtSourceEditAnswer__ClassNameAssignment_2 ) )
            {
            // InternalXercise.g:3083:1: ( ( rule__JdtSourceEditAnswer__ClassNameAssignment_2 ) )
            // InternalXercise.g:3084:2: ( rule__JdtSourceEditAnswer__ClassNameAssignment_2 )
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getClassNameAssignment_2()); 
            // InternalXercise.g:3085:2: ( rule__JdtSourceEditAnswer__ClassNameAssignment_2 )
            // InternalXercise.g:3085:3: rule__JdtSourceEditAnswer__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJdtSourceEditAnswerAccess().getClassNameAssignment_2()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group__2__Impl"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group__3"
    // InternalXercise.g:3093:1: rule__JdtSourceEditAnswer__Group__3 : rule__JdtSourceEditAnswer__Group__3__Impl ;
    public final void rule__JdtSourceEditAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3097:1: ( rule__JdtSourceEditAnswer__Group__3__Impl )
            // InternalXercise.g:3098:2: rule__JdtSourceEditAnswer__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group__3__Impl();

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group__3"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group__3__Impl"
    // InternalXercise.g:3104:1: rule__JdtSourceEditAnswer__Group__3__Impl : ( ( rule__JdtSourceEditAnswer__Group_3__0 )? ) ;
    public final void rule__JdtSourceEditAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3108:1: ( ( ( rule__JdtSourceEditAnswer__Group_3__0 )? ) )
            // InternalXercise.g:3109:1: ( ( rule__JdtSourceEditAnswer__Group_3__0 )? )
            {
            // InternalXercise.g:3109:1: ( ( rule__JdtSourceEditAnswer__Group_3__0 )? )
            // InternalXercise.g:3110:2: ( rule__JdtSourceEditAnswer__Group_3__0 )?
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getGroup_3()); 
            // InternalXercise.g:3111:2: ( rule__JdtSourceEditAnswer__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXercise.g:3111:3: rule__JdtSourceEditAnswer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JdtSourceEditAnswer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJdtSourceEditAnswerAccess().getGroup_3()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group__3__Impl"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3__0"
    // InternalXercise.g:3120:1: rule__JdtSourceEditAnswer__Group_3__0 : rule__JdtSourceEditAnswer__Group_3__0__Impl rule__JdtSourceEditAnswer__Group_3__1 ;
    public final void rule__JdtSourceEditAnswer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3124:1: ( rule__JdtSourceEditAnswer__Group_3__0__Impl rule__JdtSourceEditAnswer__Group_3__1 )
            // InternalXercise.g:3125:2: rule__JdtSourceEditAnswer__Group_3__0__Impl rule__JdtSourceEditAnswer__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__JdtSourceEditAnswer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group_3__1();

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3__0"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3__0__Impl"
    // InternalXercise.g:3132:1: rule__JdtSourceEditAnswer__Group_3__0__Impl : ( '{' ) ;
    public final void rule__JdtSourceEditAnswer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3136:1: ( ( '{' ) )
            // InternalXercise.g:3137:1: ( '{' )
            {
            // InternalXercise.g:3137:1: ( '{' )
            // InternalXercise.g:3138:2: '{'
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getJdtSourceEditAnswerAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3__0__Impl"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3__1"
    // InternalXercise.g:3147:1: rule__JdtSourceEditAnswer__Group_3__1 : rule__JdtSourceEditAnswer__Group_3__1__Impl rule__JdtSourceEditAnswer__Group_3__2 ;
    public final void rule__JdtSourceEditAnswer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3151:1: ( rule__JdtSourceEditAnswer__Group_3__1__Impl rule__JdtSourceEditAnswer__Group_3__2 )
            // InternalXercise.g:3152:2: rule__JdtSourceEditAnswer__Group_3__1__Impl rule__JdtSourceEditAnswer__Group_3__2
            {
            pushFollow(FOLLOW_27);
            rule__JdtSourceEditAnswer__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group_3__2();

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3__1"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3__1__Impl"
    // InternalXercise.g:3159:1: rule__JdtSourceEditAnswer__Group_3__1__Impl : ( ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1 ) ) ;
    public final void rule__JdtSourceEditAnswer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3163:1: ( ( ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1 ) ) )
            // InternalXercise.g:3164:1: ( ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1 ) )
            {
            // InternalXercise.g:3164:1: ( ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1 ) )
            // InternalXercise.g:3165:2: ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1 )
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getMethodNamesAssignment_3_1()); 
            // InternalXercise.g:3166:2: ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1 )
            // InternalXercise.g:3166:3: rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJdtSourceEditAnswerAccess().getMethodNamesAssignment_3_1()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3__1__Impl"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3__2"
    // InternalXercise.g:3174:1: rule__JdtSourceEditAnswer__Group_3__2 : rule__JdtSourceEditAnswer__Group_3__2__Impl rule__JdtSourceEditAnswer__Group_3__3 ;
    public final void rule__JdtSourceEditAnswer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3178:1: ( rule__JdtSourceEditAnswer__Group_3__2__Impl rule__JdtSourceEditAnswer__Group_3__3 )
            // InternalXercise.g:3179:2: rule__JdtSourceEditAnswer__Group_3__2__Impl rule__JdtSourceEditAnswer__Group_3__3
            {
            pushFollow(FOLLOW_27);
            rule__JdtSourceEditAnswer__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group_3__3();

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3__2"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3__2__Impl"
    // InternalXercise.g:3186:1: rule__JdtSourceEditAnswer__Group_3__2__Impl : ( ( rule__JdtSourceEditAnswer__Group_3_2__0 )* ) ;
    public final void rule__JdtSourceEditAnswer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3190:1: ( ( ( rule__JdtSourceEditAnswer__Group_3_2__0 )* ) )
            // InternalXercise.g:3191:1: ( ( rule__JdtSourceEditAnswer__Group_3_2__0 )* )
            {
            // InternalXercise.g:3191:1: ( ( rule__JdtSourceEditAnswer__Group_3_2__0 )* )
            // InternalXercise.g:3192:2: ( rule__JdtSourceEditAnswer__Group_3_2__0 )*
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getGroup_3_2()); 
            // InternalXercise.g:3193:2: ( rule__JdtSourceEditAnswer__Group_3_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==48) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXercise.g:3193:3: rule__JdtSourceEditAnswer__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__JdtSourceEditAnswer__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getJdtSourceEditAnswerAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3__2__Impl"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3__3"
    // InternalXercise.g:3201:1: rule__JdtSourceEditAnswer__Group_3__3 : rule__JdtSourceEditAnswer__Group_3__3__Impl ;
    public final void rule__JdtSourceEditAnswer__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3205:1: ( rule__JdtSourceEditAnswer__Group_3__3__Impl )
            // InternalXercise.g:3206:2: rule__JdtSourceEditAnswer__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group_3__3__Impl();

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3__3"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3__3__Impl"
    // InternalXercise.g:3212:1: rule__JdtSourceEditAnswer__Group_3__3__Impl : ( '}' ) ;
    public final void rule__JdtSourceEditAnswer__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3216:1: ( ( '}' ) )
            // InternalXercise.g:3217:1: ( '}' )
            {
            // InternalXercise.g:3217:1: ( '}' )
            // InternalXercise.g:3218:2: '}'
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getJdtSourceEditAnswerAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3__3__Impl"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3_2__0"
    // InternalXercise.g:3228:1: rule__JdtSourceEditAnswer__Group_3_2__0 : rule__JdtSourceEditAnswer__Group_3_2__0__Impl rule__JdtSourceEditAnswer__Group_3_2__1 ;
    public final void rule__JdtSourceEditAnswer__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3232:1: ( rule__JdtSourceEditAnswer__Group_3_2__0__Impl rule__JdtSourceEditAnswer__Group_3_2__1 )
            // InternalXercise.g:3233:2: rule__JdtSourceEditAnswer__Group_3_2__0__Impl rule__JdtSourceEditAnswer__Group_3_2__1
            {
            pushFollow(FOLLOW_12);
            rule__JdtSourceEditAnswer__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group_3_2__1();

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3_2__0"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3_2__0__Impl"
    // InternalXercise.g:3240:1: rule__JdtSourceEditAnswer__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__JdtSourceEditAnswer__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3244:1: ( ( ',' ) )
            // InternalXercise.g:3245:1: ( ',' )
            {
            // InternalXercise.g:3245:1: ( ',' )
            // InternalXercise.g:3246:2: ','
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getCommaKeyword_3_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getJdtSourceEditAnswerAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3_2__0__Impl"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3_2__1"
    // InternalXercise.g:3255:1: rule__JdtSourceEditAnswer__Group_3_2__1 : rule__JdtSourceEditAnswer__Group_3_2__1__Impl ;
    public final void rule__JdtSourceEditAnswer__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3259:1: ( rule__JdtSourceEditAnswer__Group_3_2__1__Impl )
            // InternalXercise.g:3260:2: rule__JdtSourceEditAnswer__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3_2__1"


    // $ANTLR start "rule__JdtSourceEditAnswer__Group_3_2__1__Impl"
    // InternalXercise.g:3266:1: rule__JdtSourceEditAnswer__Group_3_2__1__Impl : ( ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1 ) ) ;
    public final void rule__JdtSourceEditAnswer__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3270:1: ( ( ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1 ) ) )
            // InternalXercise.g:3271:1: ( ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1 ) )
            {
            // InternalXercise.g:3271:1: ( ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1 ) )
            // InternalXercise.g:3272:2: ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1 )
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getMethodNamesAssignment_3_2_1()); 
            // InternalXercise.g:3273:2: ( rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1 )
            // InternalXercise.g:3273:3: rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJdtSourceEditAnswerAccess().getMethodNamesAssignment_3_2_1()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__Group_3_2__1__Impl"


    // $ANTLR start "rule__JdtLaunchAnswer__Group__0"
    // InternalXercise.g:3282:1: rule__JdtLaunchAnswer__Group__0 : rule__JdtLaunchAnswer__Group__0__Impl rule__JdtLaunchAnswer__Group__1 ;
    public final void rule__JdtLaunchAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3286:1: ( rule__JdtLaunchAnswer__Group__0__Impl rule__JdtLaunchAnswer__Group__1 )
            // InternalXercise.g:3287:2: rule__JdtLaunchAnswer__Group__0__Impl rule__JdtLaunchAnswer__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__JdtLaunchAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JdtLaunchAnswer__Group__1();

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
    // $ANTLR end "rule__JdtLaunchAnswer__Group__0"


    // $ANTLR start "rule__JdtLaunchAnswer__Group__0__Impl"
    // InternalXercise.g:3294:1: rule__JdtLaunchAnswer__Group__0__Impl : ( 'java' ) ;
    public final void rule__JdtLaunchAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3298:1: ( ( 'java' ) )
            // InternalXercise.g:3299:1: ( 'java' )
            {
            // InternalXercise.g:3299:1: ( 'java' )
            // InternalXercise.g:3300:2: 'java'
            {
             before(grammarAccess.getJdtLaunchAnswerAccess().getJavaKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getJdtLaunchAnswerAccess().getJavaKeyword_0()); 

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
    // $ANTLR end "rule__JdtLaunchAnswer__Group__0__Impl"


    // $ANTLR start "rule__JdtLaunchAnswer__Group__1"
    // InternalXercise.g:3309:1: rule__JdtLaunchAnswer__Group__1 : rule__JdtLaunchAnswer__Group__1__Impl rule__JdtLaunchAnswer__Group__2 ;
    public final void rule__JdtLaunchAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3313:1: ( rule__JdtLaunchAnswer__Group__1__Impl rule__JdtLaunchAnswer__Group__2 )
            // InternalXercise.g:3314:2: rule__JdtLaunchAnswer__Group__1__Impl rule__JdtLaunchAnswer__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__JdtLaunchAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JdtLaunchAnswer__Group__2();

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
    // $ANTLR end "rule__JdtLaunchAnswer__Group__1"


    // $ANTLR start "rule__JdtLaunchAnswer__Group__1__Impl"
    // InternalXercise.g:3321:1: rule__JdtLaunchAnswer__Group__1__Impl : ( 'launch' ) ;
    public final void rule__JdtLaunchAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3325:1: ( ( 'launch' ) )
            // InternalXercise.g:3326:1: ( 'launch' )
            {
            // InternalXercise.g:3326:1: ( 'launch' )
            // InternalXercise.g:3327:2: 'launch'
            {
             before(grammarAccess.getJdtLaunchAnswerAccess().getLaunchKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getJdtLaunchAnswerAccess().getLaunchKeyword_1()); 

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
    // $ANTLR end "rule__JdtLaunchAnswer__Group__1__Impl"


    // $ANTLR start "rule__JdtLaunchAnswer__Group__2"
    // InternalXercise.g:3336:1: rule__JdtLaunchAnswer__Group__2 : rule__JdtLaunchAnswer__Group__2__Impl ;
    public final void rule__JdtLaunchAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3340:1: ( rule__JdtLaunchAnswer__Group__2__Impl )
            // InternalXercise.g:3341:2: rule__JdtLaunchAnswer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JdtLaunchAnswer__Group__2__Impl();

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
    // $ANTLR end "rule__JdtLaunchAnswer__Group__2"


    // $ANTLR start "rule__JdtLaunchAnswer__Group__2__Impl"
    // InternalXercise.g:3347:1: rule__JdtLaunchAnswer__Group__2__Impl : ( ( rule__JdtLaunchAnswer__ClassNameAssignment_2 ) ) ;
    public final void rule__JdtLaunchAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3351:1: ( ( ( rule__JdtLaunchAnswer__ClassNameAssignment_2 ) ) )
            // InternalXercise.g:3352:1: ( ( rule__JdtLaunchAnswer__ClassNameAssignment_2 ) )
            {
            // InternalXercise.g:3352:1: ( ( rule__JdtLaunchAnswer__ClassNameAssignment_2 ) )
            // InternalXercise.g:3353:2: ( rule__JdtLaunchAnswer__ClassNameAssignment_2 )
            {
             before(grammarAccess.getJdtLaunchAnswerAccess().getClassNameAssignment_2()); 
            // InternalXercise.g:3354:2: ( rule__JdtLaunchAnswer__ClassNameAssignment_2 )
            // InternalXercise.g:3354:3: rule__JdtLaunchAnswer__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__JdtLaunchAnswer__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJdtLaunchAnswerAccess().getClassNameAssignment_2()); 

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
    // $ANTLR end "rule__JdtLaunchAnswer__Group__2__Impl"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group__0"
    // InternalXercise.g:3363:1: rule__PerspectiveTaskAnswer__Group__0 : rule__PerspectiveTaskAnswer__Group__0__Impl rule__PerspectiveTaskAnswer__Group__1 ;
    public final void rule__PerspectiveTaskAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3367:1: ( rule__PerspectiveTaskAnswer__Group__0__Impl rule__PerspectiveTaskAnswer__Group__1 )
            // InternalXercise.g:3368:2: rule__PerspectiveTaskAnswer__Group__0__Impl rule__PerspectiveTaskAnswer__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__PerspectiveTaskAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__Group__1();

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group__0"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group__0__Impl"
    // InternalXercise.g:3375:1: rule__PerspectiveTaskAnswer__Group__0__Impl : ( () ) ;
    public final void rule__PerspectiveTaskAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3379:1: ( ( () ) )
            // InternalXercise.g:3380:1: ( () )
            {
            // InternalXercise.g:3380:1: ( () )
            // InternalXercise.g:3381:2: ()
            {
             before(grammarAccess.getPerspectiveTaskAnswerAccess().getPerspectiveTaskAnswerAction_0()); 
            // InternalXercise.g:3382:2: ()
            // InternalXercise.g:3382:3: 
            {
            }

             after(grammarAccess.getPerspectiveTaskAnswerAccess().getPerspectiveTaskAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group__0__Impl"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group__1"
    // InternalXercise.g:3390:1: rule__PerspectiveTaskAnswer__Group__1 : rule__PerspectiveTaskAnswer__Group__1__Impl rule__PerspectiveTaskAnswer__Group__2 ;
    public final void rule__PerspectiveTaskAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3394:1: ( rule__PerspectiveTaskAnswer__Group__1__Impl rule__PerspectiveTaskAnswer__Group__2 )
            // InternalXercise.g:3395:2: rule__PerspectiveTaskAnswer__Group__1__Impl rule__PerspectiveTaskAnswer__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PerspectiveTaskAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__Group__2();

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group__1"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group__1__Impl"
    // InternalXercise.g:3402:1: rule__PerspectiveTaskAnswer__Group__1__Impl : ( 'perspective' ) ;
    public final void rule__PerspectiveTaskAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3406:1: ( ( 'perspective' ) )
            // InternalXercise.g:3407:1: ( 'perspective' )
            {
            // InternalXercise.g:3407:1: ( 'perspective' )
            // InternalXercise.g:3408:2: 'perspective'
            {
             before(grammarAccess.getPerspectiveTaskAnswerAccess().getPerspectiveKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPerspectiveTaskAnswerAccess().getPerspectiveKeyword_1()); 

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group__1__Impl"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group__2"
    // InternalXercise.g:3417:1: rule__PerspectiveTaskAnswer__Group__2 : rule__PerspectiveTaskAnswer__Group__2__Impl ;
    public final void rule__PerspectiveTaskAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3421:1: ( rule__PerspectiveTaskAnswer__Group__2__Impl )
            // InternalXercise.g:3422:2: rule__PerspectiveTaskAnswer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__Group__2__Impl();

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group__2"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group__2__Impl"
    // InternalXercise.g:3428:1: rule__PerspectiveTaskAnswer__Group__2__Impl : ( ( rule__PerspectiveTaskAnswer__Group_2__0 ) ) ;
    public final void rule__PerspectiveTaskAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3432:1: ( ( ( rule__PerspectiveTaskAnswer__Group_2__0 ) ) )
            // InternalXercise.g:3433:1: ( ( rule__PerspectiveTaskAnswer__Group_2__0 ) )
            {
            // InternalXercise.g:3433:1: ( ( rule__PerspectiveTaskAnswer__Group_2__0 ) )
            // InternalXercise.g:3434:2: ( rule__PerspectiveTaskAnswer__Group_2__0 )
            {
             before(grammarAccess.getPerspectiveTaskAnswerAccess().getGroup_2()); 
            // InternalXercise.g:3435:2: ( rule__PerspectiveTaskAnswer__Group_2__0 )
            // InternalXercise.g:3435:3: rule__PerspectiveTaskAnswer__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveTaskAnswerAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group__2__Impl"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group_2__0"
    // InternalXercise.g:3444:1: rule__PerspectiveTaskAnswer__Group_2__0 : rule__PerspectiveTaskAnswer__Group_2__0__Impl rule__PerspectiveTaskAnswer__Group_2__1 ;
    public final void rule__PerspectiveTaskAnswer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3448:1: ( rule__PerspectiveTaskAnswer__Group_2__0__Impl rule__PerspectiveTaskAnswer__Group_2__1 )
            // InternalXercise.g:3449:2: rule__PerspectiveTaskAnswer__Group_2__0__Impl rule__PerspectiveTaskAnswer__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__PerspectiveTaskAnswer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__Group_2__1();

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group_2__0"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group_2__0__Impl"
    // InternalXercise.g:3456:1: rule__PerspectiveTaskAnswer__Group_2__0__Impl : ( ( rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0 ) ) ;
    public final void rule__PerspectiveTaskAnswer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3460:1: ( ( ( rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0 ) ) )
            // InternalXercise.g:3461:1: ( ( rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0 ) )
            {
            // InternalXercise.g:3461:1: ( ( rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0 ) )
            // InternalXercise.g:3462:2: ( rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0 )
            {
             before(grammarAccess.getPerspectiveTaskAnswerAccess().getElementIdAssignment_2_0()); 
            // InternalXercise.g:3463:2: ( rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0 )
            // InternalXercise.g:3463:3: rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveTaskAnswerAccess().getElementIdAssignment_2_0()); 

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group_2__0__Impl"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group_2__1"
    // InternalXercise.g:3471:1: rule__PerspectiveTaskAnswer__Group_2__1 : rule__PerspectiveTaskAnswer__Group_2__1__Impl ;
    public final void rule__PerspectiveTaskAnswer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3475:1: ( rule__PerspectiveTaskAnswer__Group_2__1__Impl )
            // InternalXercise.g:3476:2: rule__PerspectiveTaskAnswer__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__Group_2__1__Impl();

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group_2__1"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group_2__1__Impl"
    // InternalXercise.g:3482:1: rule__PerspectiveTaskAnswer__Group_2__1__Impl : ( ( rule__PerspectiveTaskAnswer__Group_2_1__0 )? ) ;
    public final void rule__PerspectiveTaskAnswer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3486:1: ( ( ( rule__PerspectiveTaskAnswer__Group_2_1__0 )? ) )
            // InternalXercise.g:3487:1: ( ( rule__PerspectiveTaskAnswer__Group_2_1__0 )? )
            {
            // InternalXercise.g:3487:1: ( ( rule__PerspectiveTaskAnswer__Group_2_1__0 )? )
            // InternalXercise.g:3488:2: ( rule__PerspectiveTaskAnswer__Group_2_1__0 )?
            {
             before(grammarAccess.getPerspectiveTaskAnswerAccess().getGroup_2_1()); 
            // InternalXercise.g:3489:2: ( rule__PerspectiveTaskAnswer__Group_2_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXercise.g:3489:3: rule__PerspectiveTaskAnswer__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PerspectiveTaskAnswer__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPerspectiveTaskAnswerAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group_2__1__Impl"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group_2_1__0"
    // InternalXercise.g:3498:1: rule__PerspectiveTaskAnswer__Group_2_1__0 : rule__PerspectiveTaskAnswer__Group_2_1__0__Impl rule__PerspectiveTaskAnswer__Group_2_1__1 ;
    public final void rule__PerspectiveTaskAnswer__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3502:1: ( rule__PerspectiveTaskAnswer__Group_2_1__0__Impl rule__PerspectiveTaskAnswer__Group_2_1__1 )
            // InternalXercise.g:3503:2: rule__PerspectiveTaskAnswer__Group_2_1__0__Impl rule__PerspectiveTaskAnswer__Group_2_1__1
            {
            pushFollow(FOLLOW_33);
            rule__PerspectiveTaskAnswer__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__Group_2_1__1();

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group_2_1__0"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group_2_1__0__Impl"
    // InternalXercise.g:3510:1: rule__PerspectiveTaskAnswer__Group_2_1__0__Impl : ( '#' ) ;
    public final void rule__PerspectiveTaskAnswer__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3514:1: ( ( '#' ) )
            // InternalXercise.g:3515:1: ( '#' )
            {
            // InternalXercise.g:3515:1: ( '#' )
            // InternalXercise.g:3516:2: '#'
            {
             before(grammarAccess.getPerspectiveTaskAnswerAccess().getNumberSignKeyword_2_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPerspectiveTaskAnswerAccess().getNumberSignKeyword_2_1_0()); 

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group_2_1__0__Impl"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group_2_1__1"
    // InternalXercise.g:3525:1: rule__PerspectiveTaskAnswer__Group_2_1__1 : rule__PerspectiveTaskAnswer__Group_2_1__1__Impl ;
    public final void rule__PerspectiveTaskAnswer__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3529:1: ( rule__PerspectiveTaskAnswer__Group_2_1__1__Impl )
            // InternalXercise.g:3530:2: rule__PerspectiveTaskAnswer__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group_2_1__1"


    // $ANTLR start "rule__PerspectiveTaskAnswer__Group_2_1__1__Impl"
    // InternalXercise.g:3536:1: rule__PerspectiveTaskAnswer__Group_2_1__1__Impl : ( ( rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1 ) ) ;
    public final void rule__PerspectiveTaskAnswer__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3540:1: ( ( ( rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1 ) ) )
            // InternalXercise.g:3541:1: ( ( rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1 ) )
            {
            // InternalXercise.g:3541:1: ( ( rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1 ) )
            // InternalXercise.g:3542:2: ( rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1 )
            {
             before(grammarAccess.getPerspectiveTaskAnswerAccess().getActionAssignment_2_1_1()); 
            // InternalXercise.g:3543:2: ( rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1 )
            // InternalXercise.g:3543:3: rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveTaskAnswerAccess().getActionAssignment_2_1_1()); 

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__Group_2_1__1__Impl"


    // $ANTLR start "rule__PartTaskAnswer__Group__0"
    // InternalXercise.g:3552:1: rule__PartTaskAnswer__Group__0 : rule__PartTaskAnswer__Group__0__Impl rule__PartTaskAnswer__Group__1 ;
    public final void rule__PartTaskAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3556:1: ( rule__PartTaskAnswer__Group__0__Impl rule__PartTaskAnswer__Group__1 )
            // InternalXercise.g:3557:2: rule__PartTaskAnswer__Group__0__Impl rule__PartTaskAnswer__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__PartTaskAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__Group__1();

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
    // $ANTLR end "rule__PartTaskAnswer__Group__0"


    // $ANTLR start "rule__PartTaskAnswer__Group__0__Impl"
    // InternalXercise.g:3564:1: rule__PartTaskAnswer__Group__0__Impl : ( () ) ;
    public final void rule__PartTaskAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3568:1: ( ( () ) )
            // InternalXercise.g:3569:1: ( () )
            {
            // InternalXercise.g:3569:1: ( () )
            // InternalXercise.g:3570:2: ()
            {
             before(grammarAccess.getPartTaskAnswerAccess().getPartTaskAnswerAction_0()); 
            // InternalXercise.g:3571:2: ()
            // InternalXercise.g:3571:3: 
            {
            }

             after(grammarAccess.getPartTaskAnswerAccess().getPartTaskAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartTaskAnswer__Group__0__Impl"


    // $ANTLR start "rule__PartTaskAnswer__Group__1"
    // InternalXercise.g:3579:1: rule__PartTaskAnswer__Group__1 : rule__PartTaskAnswer__Group__1__Impl rule__PartTaskAnswer__Group__2 ;
    public final void rule__PartTaskAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3583:1: ( rule__PartTaskAnswer__Group__1__Impl rule__PartTaskAnswer__Group__2 )
            // InternalXercise.g:3584:2: rule__PartTaskAnswer__Group__1__Impl rule__PartTaskAnswer__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PartTaskAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__Group__2();

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
    // $ANTLR end "rule__PartTaskAnswer__Group__1"


    // $ANTLR start "rule__PartTaskAnswer__Group__1__Impl"
    // InternalXercise.g:3591:1: rule__PartTaskAnswer__Group__1__Impl : ( 'part' ) ;
    public final void rule__PartTaskAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3595:1: ( ( 'part' ) )
            // InternalXercise.g:3596:1: ( 'part' )
            {
            // InternalXercise.g:3596:1: ( 'part' )
            // InternalXercise.g:3597:2: 'part'
            {
             before(grammarAccess.getPartTaskAnswerAccess().getPartKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPartTaskAnswerAccess().getPartKeyword_1()); 

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
    // $ANTLR end "rule__PartTaskAnswer__Group__1__Impl"


    // $ANTLR start "rule__PartTaskAnswer__Group__2"
    // InternalXercise.g:3606:1: rule__PartTaskAnswer__Group__2 : rule__PartTaskAnswer__Group__2__Impl ;
    public final void rule__PartTaskAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3610:1: ( rule__PartTaskAnswer__Group__2__Impl )
            // InternalXercise.g:3611:2: rule__PartTaskAnswer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__Group__2__Impl();

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
    // $ANTLR end "rule__PartTaskAnswer__Group__2"


    // $ANTLR start "rule__PartTaskAnswer__Group__2__Impl"
    // InternalXercise.g:3617:1: rule__PartTaskAnswer__Group__2__Impl : ( ( rule__PartTaskAnswer__Group_2__0 ) ) ;
    public final void rule__PartTaskAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3621:1: ( ( ( rule__PartTaskAnswer__Group_2__0 ) ) )
            // InternalXercise.g:3622:1: ( ( rule__PartTaskAnswer__Group_2__0 ) )
            {
            // InternalXercise.g:3622:1: ( ( rule__PartTaskAnswer__Group_2__0 ) )
            // InternalXercise.g:3623:2: ( rule__PartTaskAnswer__Group_2__0 )
            {
             before(grammarAccess.getPartTaskAnswerAccess().getGroup_2()); 
            // InternalXercise.g:3624:2: ( rule__PartTaskAnswer__Group_2__0 )
            // InternalXercise.g:3624:3: rule__PartTaskAnswer__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPartTaskAnswerAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PartTaskAnswer__Group__2__Impl"


    // $ANTLR start "rule__PartTaskAnswer__Group_2__0"
    // InternalXercise.g:3633:1: rule__PartTaskAnswer__Group_2__0 : rule__PartTaskAnswer__Group_2__0__Impl rule__PartTaskAnswer__Group_2__1 ;
    public final void rule__PartTaskAnswer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3637:1: ( rule__PartTaskAnswer__Group_2__0__Impl rule__PartTaskAnswer__Group_2__1 )
            // InternalXercise.g:3638:2: rule__PartTaskAnswer__Group_2__0__Impl rule__PartTaskAnswer__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__PartTaskAnswer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__Group_2__1();

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
    // $ANTLR end "rule__PartTaskAnswer__Group_2__0"


    // $ANTLR start "rule__PartTaskAnswer__Group_2__0__Impl"
    // InternalXercise.g:3645:1: rule__PartTaskAnswer__Group_2__0__Impl : ( ( rule__PartTaskAnswer__ElementIdAssignment_2_0 ) ) ;
    public final void rule__PartTaskAnswer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3649:1: ( ( ( rule__PartTaskAnswer__ElementIdAssignment_2_0 ) ) )
            // InternalXercise.g:3650:1: ( ( rule__PartTaskAnswer__ElementIdAssignment_2_0 ) )
            {
            // InternalXercise.g:3650:1: ( ( rule__PartTaskAnswer__ElementIdAssignment_2_0 ) )
            // InternalXercise.g:3651:2: ( rule__PartTaskAnswer__ElementIdAssignment_2_0 )
            {
             before(grammarAccess.getPartTaskAnswerAccess().getElementIdAssignment_2_0()); 
            // InternalXercise.g:3652:2: ( rule__PartTaskAnswer__ElementIdAssignment_2_0 )
            // InternalXercise.g:3652:3: rule__PartTaskAnswer__ElementIdAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__ElementIdAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPartTaskAnswerAccess().getElementIdAssignment_2_0()); 

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
    // $ANTLR end "rule__PartTaskAnswer__Group_2__0__Impl"


    // $ANTLR start "rule__PartTaskAnswer__Group_2__1"
    // InternalXercise.g:3660:1: rule__PartTaskAnswer__Group_2__1 : rule__PartTaskAnswer__Group_2__1__Impl ;
    public final void rule__PartTaskAnswer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3664:1: ( rule__PartTaskAnswer__Group_2__1__Impl )
            // InternalXercise.g:3665:2: rule__PartTaskAnswer__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__Group_2__1__Impl();

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
    // $ANTLR end "rule__PartTaskAnswer__Group_2__1"


    // $ANTLR start "rule__PartTaskAnswer__Group_2__1__Impl"
    // InternalXercise.g:3671:1: rule__PartTaskAnswer__Group_2__1__Impl : ( ( rule__PartTaskAnswer__Group_2_1__0 )? ) ;
    public final void rule__PartTaskAnswer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3675:1: ( ( ( rule__PartTaskAnswer__Group_2_1__0 )? ) )
            // InternalXercise.g:3676:1: ( ( rule__PartTaskAnswer__Group_2_1__0 )? )
            {
            // InternalXercise.g:3676:1: ( ( rule__PartTaskAnswer__Group_2_1__0 )? )
            // InternalXercise.g:3677:2: ( rule__PartTaskAnswer__Group_2_1__0 )?
            {
             before(grammarAccess.getPartTaskAnswerAccess().getGroup_2_1()); 
            // InternalXercise.g:3678:2: ( rule__PartTaskAnswer__Group_2_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXercise.g:3678:3: rule__PartTaskAnswer__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartTaskAnswer__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPartTaskAnswerAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__PartTaskAnswer__Group_2__1__Impl"


    // $ANTLR start "rule__PartTaskAnswer__Group_2_1__0"
    // InternalXercise.g:3687:1: rule__PartTaskAnswer__Group_2_1__0 : rule__PartTaskAnswer__Group_2_1__0__Impl rule__PartTaskAnswer__Group_2_1__1 ;
    public final void rule__PartTaskAnswer__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3691:1: ( rule__PartTaskAnswer__Group_2_1__0__Impl rule__PartTaskAnswer__Group_2_1__1 )
            // InternalXercise.g:3692:2: rule__PartTaskAnswer__Group_2_1__0__Impl rule__PartTaskAnswer__Group_2_1__1
            {
            pushFollow(FOLLOW_35);
            rule__PartTaskAnswer__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__Group_2_1__1();

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
    // $ANTLR end "rule__PartTaskAnswer__Group_2_1__0"


    // $ANTLR start "rule__PartTaskAnswer__Group_2_1__0__Impl"
    // InternalXercise.g:3699:1: rule__PartTaskAnswer__Group_2_1__0__Impl : ( '#' ) ;
    public final void rule__PartTaskAnswer__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3703:1: ( ( '#' ) )
            // InternalXercise.g:3704:1: ( '#' )
            {
            // InternalXercise.g:3704:1: ( '#' )
            // InternalXercise.g:3705:2: '#'
            {
             before(grammarAccess.getPartTaskAnswerAccess().getNumberSignKeyword_2_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPartTaskAnswerAccess().getNumberSignKeyword_2_1_0()); 

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
    // $ANTLR end "rule__PartTaskAnswer__Group_2_1__0__Impl"


    // $ANTLR start "rule__PartTaskAnswer__Group_2_1__1"
    // InternalXercise.g:3714:1: rule__PartTaskAnswer__Group_2_1__1 : rule__PartTaskAnswer__Group_2_1__1__Impl ;
    public final void rule__PartTaskAnswer__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3718:1: ( rule__PartTaskAnswer__Group_2_1__1__Impl )
            // InternalXercise.g:3719:2: rule__PartTaskAnswer__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__PartTaskAnswer__Group_2_1__1"


    // $ANTLR start "rule__PartTaskAnswer__Group_2_1__1__Impl"
    // InternalXercise.g:3725:1: rule__PartTaskAnswer__Group_2_1__1__Impl : ( ( rule__PartTaskAnswer__ActionAssignment_2_1_1 ) ) ;
    public final void rule__PartTaskAnswer__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3729:1: ( ( ( rule__PartTaskAnswer__ActionAssignment_2_1_1 ) ) )
            // InternalXercise.g:3730:1: ( ( rule__PartTaskAnswer__ActionAssignment_2_1_1 ) )
            {
            // InternalXercise.g:3730:1: ( ( rule__PartTaskAnswer__ActionAssignment_2_1_1 ) )
            // InternalXercise.g:3731:2: ( rule__PartTaskAnswer__ActionAssignment_2_1_1 )
            {
             before(grammarAccess.getPartTaskAnswerAccess().getActionAssignment_2_1_1()); 
            // InternalXercise.g:3732:2: ( rule__PartTaskAnswer__ActionAssignment_2_1_1 )
            // InternalXercise.g:3732:3: rule__PartTaskAnswer__ActionAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__ActionAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPartTaskAnswerAccess().getActionAssignment_2_1_1()); 

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
    // $ANTLR end "rule__PartTaskAnswer__Group_2_1__1__Impl"


    // $ANTLR start "rule__CommandExecutionAnswer__Group__0"
    // InternalXercise.g:3741:1: rule__CommandExecutionAnswer__Group__0 : rule__CommandExecutionAnswer__Group__0__Impl rule__CommandExecutionAnswer__Group__1 ;
    public final void rule__CommandExecutionAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3745:1: ( rule__CommandExecutionAnswer__Group__0__Impl rule__CommandExecutionAnswer__Group__1 )
            // InternalXercise.g:3746:2: rule__CommandExecutionAnswer__Group__0__Impl rule__CommandExecutionAnswer__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__CommandExecutionAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__Group__1();

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group__0"


    // $ANTLR start "rule__CommandExecutionAnswer__Group__0__Impl"
    // InternalXercise.g:3753:1: rule__CommandExecutionAnswer__Group__0__Impl : ( () ) ;
    public final void rule__CommandExecutionAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3757:1: ( ( () ) )
            // InternalXercise.g:3758:1: ( () )
            {
            // InternalXercise.g:3758:1: ( () )
            // InternalXercise.g:3759:2: ()
            {
             before(grammarAccess.getCommandExecutionAnswerAccess().getCommandExecutionAnswerAction_0()); 
            // InternalXercise.g:3760:2: ()
            // InternalXercise.g:3760:3: 
            {
            }

             after(grammarAccess.getCommandExecutionAnswerAccess().getCommandExecutionAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandExecutionAnswer__Group__0__Impl"


    // $ANTLR start "rule__CommandExecutionAnswer__Group__1"
    // InternalXercise.g:3768:1: rule__CommandExecutionAnswer__Group__1 : rule__CommandExecutionAnswer__Group__1__Impl rule__CommandExecutionAnswer__Group__2 ;
    public final void rule__CommandExecutionAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3772:1: ( rule__CommandExecutionAnswer__Group__1__Impl rule__CommandExecutionAnswer__Group__2 )
            // InternalXercise.g:3773:2: rule__CommandExecutionAnswer__Group__1__Impl rule__CommandExecutionAnswer__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__CommandExecutionAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__Group__2();

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group__1"


    // $ANTLR start "rule__CommandExecutionAnswer__Group__1__Impl"
    // InternalXercise.g:3780:1: rule__CommandExecutionAnswer__Group__1__Impl : ( 'command' ) ;
    public final void rule__CommandExecutionAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3784:1: ( ( 'command' ) )
            // InternalXercise.g:3785:1: ( 'command' )
            {
            // InternalXercise.g:3785:1: ( 'command' )
            // InternalXercise.g:3786:2: 'command'
            {
             before(grammarAccess.getCommandExecutionAnswerAccess().getCommandKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCommandExecutionAnswerAccess().getCommandKeyword_1()); 

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group__1__Impl"


    // $ANTLR start "rule__CommandExecutionAnswer__Group__2"
    // InternalXercise.g:3795:1: rule__CommandExecutionAnswer__Group__2 : rule__CommandExecutionAnswer__Group__2__Impl ;
    public final void rule__CommandExecutionAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3799:1: ( rule__CommandExecutionAnswer__Group__2__Impl )
            // InternalXercise.g:3800:2: rule__CommandExecutionAnswer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__Group__2__Impl();

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group__2"


    // $ANTLR start "rule__CommandExecutionAnswer__Group__2__Impl"
    // InternalXercise.g:3806:1: rule__CommandExecutionAnswer__Group__2__Impl : ( ( rule__CommandExecutionAnswer__Group_2__0 ) ) ;
    public final void rule__CommandExecutionAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3810:1: ( ( ( rule__CommandExecutionAnswer__Group_2__0 ) ) )
            // InternalXercise.g:3811:1: ( ( rule__CommandExecutionAnswer__Group_2__0 ) )
            {
            // InternalXercise.g:3811:1: ( ( rule__CommandExecutionAnswer__Group_2__0 ) )
            // InternalXercise.g:3812:2: ( rule__CommandExecutionAnswer__Group_2__0 )
            {
             before(grammarAccess.getCommandExecutionAnswerAccess().getGroup_2()); 
            // InternalXercise.g:3813:2: ( rule__CommandExecutionAnswer__Group_2__0 )
            // InternalXercise.g:3813:3: rule__CommandExecutionAnswer__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandExecutionAnswerAccess().getGroup_2()); 

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group__2__Impl"


    // $ANTLR start "rule__CommandExecutionAnswer__Group_2__0"
    // InternalXercise.g:3822:1: rule__CommandExecutionAnswer__Group_2__0 : rule__CommandExecutionAnswer__Group_2__0__Impl rule__CommandExecutionAnswer__Group_2__1 ;
    public final void rule__CommandExecutionAnswer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3826:1: ( rule__CommandExecutionAnswer__Group_2__0__Impl rule__CommandExecutionAnswer__Group_2__1 )
            // InternalXercise.g:3827:2: rule__CommandExecutionAnswer__Group_2__0__Impl rule__CommandExecutionAnswer__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__CommandExecutionAnswer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__Group_2__1();

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group_2__0"


    // $ANTLR start "rule__CommandExecutionAnswer__Group_2__0__Impl"
    // InternalXercise.g:3834:1: rule__CommandExecutionAnswer__Group_2__0__Impl : ( ( rule__CommandExecutionAnswer__ElementIdAssignment_2_0 ) ) ;
    public final void rule__CommandExecutionAnswer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3838:1: ( ( ( rule__CommandExecutionAnswer__ElementIdAssignment_2_0 ) ) )
            // InternalXercise.g:3839:1: ( ( rule__CommandExecutionAnswer__ElementIdAssignment_2_0 ) )
            {
            // InternalXercise.g:3839:1: ( ( rule__CommandExecutionAnswer__ElementIdAssignment_2_0 ) )
            // InternalXercise.g:3840:2: ( rule__CommandExecutionAnswer__ElementIdAssignment_2_0 )
            {
             before(grammarAccess.getCommandExecutionAnswerAccess().getElementIdAssignment_2_0()); 
            // InternalXercise.g:3841:2: ( rule__CommandExecutionAnswer__ElementIdAssignment_2_0 )
            // InternalXercise.g:3841:3: rule__CommandExecutionAnswer__ElementIdAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__ElementIdAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandExecutionAnswerAccess().getElementIdAssignment_2_0()); 

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group_2__0__Impl"


    // $ANTLR start "rule__CommandExecutionAnswer__Group_2__1"
    // InternalXercise.g:3849:1: rule__CommandExecutionAnswer__Group_2__1 : rule__CommandExecutionAnswer__Group_2__1__Impl ;
    public final void rule__CommandExecutionAnswer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3853:1: ( rule__CommandExecutionAnswer__Group_2__1__Impl )
            // InternalXercise.g:3854:2: rule__CommandExecutionAnswer__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__Group_2__1__Impl();

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group_2__1"


    // $ANTLR start "rule__CommandExecutionAnswer__Group_2__1__Impl"
    // InternalXercise.g:3860:1: rule__CommandExecutionAnswer__Group_2__1__Impl : ( ( rule__CommandExecutionAnswer__Group_2_1__0 )? ) ;
    public final void rule__CommandExecutionAnswer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3864:1: ( ( ( rule__CommandExecutionAnswer__Group_2_1__0 )? ) )
            // InternalXercise.g:3865:1: ( ( rule__CommandExecutionAnswer__Group_2_1__0 )? )
            {
            // InternalXercise.g:3865:1: ( ( rule__CommandExecutionAnswer__Group_2_1__0 )? )
            // InternalXercise.g:3866:2: ( rule__CommandExecutionAnswer__Group_2_1__0 )?
            {
             before(grammarAccess.getCommandExecutionAnswerAccess().getGroup_2_1()); 
            // InternalXercise.g:3867:2: ( rule__CommandExecutionAnswer__Group_2_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXercise.g:3867:3: rule__CommandExecutionAnswer__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandExecutionAnswer__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandExecutionAnswerAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group_2__1__Impl"


    // $ANTLR start "rule__CommandExecutionAnswer__Group_2_1__0"
    // InternalXercise.g:3876:1: rule__CommandExecutionAnswer__Group_2_1__0 : rule__CommandExecutionAnswer__Group_2_1__0__Impl rule__CommandExecutionAnswer__Group_2_1__1 ;
    public final void rule__CommandExecutionAnswer__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3880:1: ( rule__CommandExecutionAnswer__Group_2_1__0__Impl rule__CommandExecutionAnswer__Group_2_1__1 )
            // InternalXercise.g:3881:2: rule__CommandExecutionAnswer__Group_2_1__0__Impl rule__CommandExecutionAnswer__Group_2_1__1
            {
            pushFollow(FOLLOW_37);
            rule__CommandExecutionAnswer__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__Group_2_1__1();

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group_2_1__0"


    // $ANTLR start "rule__CommandExecutionAnswer__Group_2_1__0__Impl"
    // InternalXercise.g:3888:1: rule__CommandExecutionAnswer__Group_2_1__0__Impl : ( '#' ) ;
    public final void rule__CommandExecutionAnswer__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3892:1: ( ( '#' ) )
            // InternalXercise.g:3893:1: ( '#' )
            {
            // InternalXercise.g:3893:1: ( '#' )
            // InternalXercise.g:3894:2: '#'
            {
             before(grammarAccess.getCommandExecutionAnswerAccess().getNumberSignKeyword_2_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCommandExecutionAnswerAccess().getNumberSignKeyword_2_1_0()); 

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group_2_1__0__Impl"


    // $ANTLR start "rule__CommandExecutionAnswer__Group_2_1__1"
    // InternalXercise.g:3903:1: rule__CommandExecutionAnswer__Group_2_1__1 : rule__CommandExecutionAnswer__Group_2_1__1__Impl ;
    public final void rule__CommandExecutionAnswer__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3907:1: ( rule__CommandExecutionAnswer__Group_2_1__1__Impl )
            // InternalXercise.g:3908:2: rule__CommandExecutionAnswer__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group_2_1__1"


    // $ANTLR start "rule__CommandExecutionAnswer__Group_2_1__1__Impl"
    // InternalXercise.g:3914:1: rule__CommandExecutionAnswer__Group_2_1__1__Impl : ( ( rule__CommandExecutionAnswer__ActionAssignment_2_1_1 ) ) ;
    public final void rule__CommandExecutionAnswer__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3918:1: ( ( ( rule__CommandExecutionAnswer__ActionAssignment_2_1_1 ) ) )
            // InternalXercise.g:3919:1: ( ( rule__CommandExecutionAnswer__ActionAssignment_2_1_1 ) )
            {
            // InternalXercise.g:3919:1: ( ( rule__CommandExecutionAnswer__ActionAssignment_2_1_1 ) )
            // InternalXercise.g:3920:2: ( rule__CommandExecutionAnswer__ActionAssignment_2_1_1 )
            {
             before(grammarAccess.getCommandExecutionAnswerAccess().getActionAssignment_2_1_1()); 
            // InternalXercise.g:3921:2: ( rule__CommandExecutionAnswer__ActionAssignment_2_1_1 )
            // InternalXercise.g:3921:3: rule__CommandExecutionAnswer__ActionAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__ActionAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandExecutionAnswerAccess().getActionAssignment_2_1_1()); 

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
    // $ANTLR end "rule__CommandExecutionAnswer__Group_2_1__1__Impl"


    // $ANTLR start "rule__DebugEventAnswer__Group__0"
    // InternalXercise.g:3930:1: rule__DebugEventAnswer__Group__0 : rule__DebugEventAnswer__Group__0__Impl rule__DebugEventAnswer__Group__1 ;
    public final void rule__DebugEventAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3934:1: ( rule__DebugEventAnswer__Group__0__Impl rule__DebugEventAnswer__Group__1 )
            // InternalXercise.g:3935:2: rule__DebugEventAnswer__Group__0__Impl rule__DebugEventAnswer__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__DebugEventAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__Group__1();

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
    // $ANTLR end "rule__DebugEventAnswer__Group__0"


    // $ANTLR start "rule__DebugEventAnswer__Group__0__Impl"
    // InternalXercise.g:3942:1: rule__DebugEventAnswer__Group__0__Impl : ( () ) ;
    public final void rule__DebugEventAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3946:1: ( ( () ) )
            // InternalXercise.g:3947:1: ( () )
            {
            // InternalXercise.g:3947:1: ( () )
            // InternalXercise.g:3948:2: ()
            {
             before(grammarAccess.getDebugEventAnswerAccess().getDebugEventAnswerAction_0()); 
            // InternalXercise.g:3949:2: ()
            // InternalXercise.g:3949:3: 
            {
            }

             after(grammarAccess.getDebugEventAnswerAccess().getDebugEventAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DebugEventAnswer__Group__0__Impl"


    // $ANTLR start "rule__DebugEventAnswer__Group__1"
    // InternalXercise.g:3957:1: rule__DebugEventAnswer__Group__1 : rule__DebugEventAnswer__Group__1__Impl rule__DebugEventAnswer__Group__2 ;
    public final void rule__DebugEventAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3961:1: ( rule__DebugEventAnswer__Group__1__Impl rule__DebugEventAnswer__Group__2 )
            // InternalXercise.g:3962:2: rule__DebugEventAnswer__Group__1__Impl rule__DebugEventAnswer__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DebugEventAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__Group__2();

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
    // $ANTLR end "rule__DebugEventAnswer__Group__1"


    // $ANTLR start "rule__DebugEventAnswer__Group__1__Impl"
    // InternalXercise.g:3969:1: rule__DebugEventAnswer__Group__1__Impl : ( 'debug' ) ;
    public final void rule__DebugEventAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3973:1: ( ( 'debug' ) )
            // InternalXercise.g:3974:1: ( 'debug' )
            {
            // InternalXercise.g:3974:1: ( 'debug' )
            // InternalXercise.g:3975:2: 'debug'
            {
             before(grammarAccess.getDebugEventAnswerAccess().getDebugKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDebugEventAnswerAccess().getDebugKeyword_1()); 

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
    // $ANTLR end "rule__DebugEventAnswer__Group__1__Impl"


    // $ANTLR start "rule__DebugEventAnswer__Group__2"
    // InternalXercise.g:3984:1: rule__DebugEventAnswer__Group__2 : rule__DebugEventAnswer__Group__2__Impl ;
    public final void rule__DebugEventAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3988:1: ( rule__DebugEventAnswer__Group__2__Impl )
            // InternalXercise.g:3989:2: rule__DebugEventAnswer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__Group__2__Impl();

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
    // $ANTLR end "rule__DebugEventAnswer__Group__2"


    // $ANTLR start "rule__DebugEventAnswer__Group__2__Impl"
    // InternalXercise.g:3995:1: rule__DebugEventAnswer__Group__2__Impl : ( ( rule__DebugEventAnswer__Group_2__0 ) ) ;
    public final void rule__DebugEventAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:3999:1: ( ( ( rule__DebugEventAnswer__Group_2__0 ) ) )
            // InternalXercise.g:4000:1: ( ( rule__DebugEventAnswer__Group_2__0 ) )
            {
            // InternalXercise.g:4000:1: ( ( rule__DebugEventAnswer__Group_2__0 ) )
            // InternalXercise.g:4001:2: ( rule__DebugEventAnswer__Group_2__0 )
            {
             before(grammarAccess.getDebugEventAnswerAccess().getGroup_2()); 
            // InternalXercise.g:4002:2: ( rule__DebugEventAnswer__Group_2__0 )
            // InternalXercise.g:4002:3: rule__DebugEventAnswer__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getDebugEventAnswerAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DebugEventAnswer__Group__2__Impl"


    // $ANTLR start "rule__DebugEventAnswer__Group_2__0"
    // InternalXercise.g:4011:1: rule__DebugEventAnswer__Group_2__0 : rule__DebugEventAnswer__Group_2__0__Impl rule__DebugEventAnswer__Group_2__1 ;
    public final void rule__DebugEventAnswer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4015:1: ( rule__DebugEventAnswer__Group_2__0__Impl rule__DebugEventAnswer__Group_2__1 )
            // InternalXercise.g:4016:2: rule__DebugEventAnswer__Group_2__0__Impl rule__DebugEventAnswer__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__DebugEventAnswer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__Group_2__1();

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
    // $ANTLR end "rule__DebugEventAnswer__Group_2__0"


    // $ANTLR start "rule__DebugEventAnswer__Group_2__0__Impl"
    // InternalXercise.g:4023:1: rule__DebugEventAnswer__Group_2__0__Impl : ( ( rule__DebugEventAnswer__ElementIdAssignment_2_0 ) ) ;
    public final void rule__DebugEventAnswer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4027:1: ( ( ( rule__DebugEventAnswer__ElementIdAssignment_2_0 ) ) )
            // InternalXercise.g:4028:1: ( ( rule__DebugEventAnswer__ElementIdAssignment_2_0 ) )
            {
            // InternalXercise.g:4028:1: ( ( rule__DebugEventAnswer__ElementIdAssignment_2_0 ) )
            // InternalXercise.g:4029:2: ( rule__DebugEventAnswer__ElementIdAssignment_2_0 )
            {
             before(grammarAccess.getDebugEventAnswerAccess().getElementIdAssignment_2_0()); 
            // InternalXercise.g:4030:2: ( rule__DebugEventAnswer__ElementIdAssignment_2_0 )
            // InternalXercise.g:4030:3: rule__DebugEventAnswer__ElementIdAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__ElementIdAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDebugEventAnswerAccess().getElementIdAssignment_2_0()); 

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
    // $ANTLR end "rule__DebugEventAnswer__Group_2__0__Impl"


    // $ANTLR start "rule__DebugEventAnswer__Group_2__1"
    // InternalXercise.g:4038:1: rule__DebugEventAnswer__Group_2__1 : rule__DebugEventAnswer__Group_2__1__Impl ;
    public final void rule__DebugEventAnswer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4042:1: ( rule__DebugEventAnswer__Group_2__1__Impl )
            // InternalXercise.g:4043:2: rule__DebugEventAnswer__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__Group_2__1__Impl();

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
    // $ANTLR end "rule__DebugEventAnswer__Group_2__1"


    // $ANTLR start "rule__DebugEventAnswer__Group_2__1__Impl"
    // InternalXercise.g:4049:1: rule__DebugEventAnswer__Group_2__1__Impl : ( ( rule__DebugEventAnswer__Group_2_1__0 )? ) ;
    public final void rule__DebugEventAnswer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4053:1: ( ( ( rule__DebugEventAnswer__Group_2_1__0 )? ) )
            // InternalXercise.g:4054:1: ( ( rule__DebugEventAnswer__Group_2_1__0 )? )
            {
            // InternalXercise.g:4054:1: ( ( rule__DebugEventAnswer__Group_2_1__0 )? )
            // InternalXercise.g:4055:2: ( rule__DebugEventAnswer__Group_2_1__0 )?
            {
             before(grammarAccess.getDebugEventAnswerAccess().getGroup_2_1()); 
            // InternalXercise.g:4056:2: ( rule__DebugEventAnswer__Group_2_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXercise.g:4056:3: rule__DebugEventAnswer__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DebugEventAnswer__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDebugEventAnswerAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__DebugEventAnswer__Group_2__1__Impl"


    // $ANTLR start "rule__DebugEventAnswer__Group_2_1__0"
    // InternalXercise.g:4065:1: rule__DebugEventAnswer__Group_2_1__0 : rule__DebugEventAnswer__Group_2_1__0__Impl rule__DebugEventAnswer__Group_2_1__1 ;
    public final void rule__DebugEventAnswer__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4069:1: ( rule__DebugEventAnswer__Group_2_1__0__Impl rule__DebugEventAnswer__Group_2_1__1 )
            // InternalXercise.g:4070:2: rule__DebugEventAnswer__Group_2_1__0__Impl rule__DebugEventAnswer__Group_2_1__1
            {
            pushFollow(FOLLOW_39);
            rule__DebugEventAnswer__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__Group_2_1__1();

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
    // $ANTLR end "rule__DebugEventAnswer__Group_2_1__0"


    // $ANTLR start "rule__DebugEventAnswer__Group_2_1__0__Impl"
    // InternalXercise.g:4077:1: rule__DebugEventAnswer__Group_2_1__0__Impl : ( '#' ) ;
    public final void rule__DebugEventAnswer__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4081:1: ( ( '#' ) )
            // InternalXercise.g:4082:1: ( '#' )
            {
            // InternalXercise.g:4082:1: ( '#' )
            // InternalXercise.g:4083:2: '#'
            {
             before(grammarAccess.getDebugEventAnswerAccess().getNumberSignKeyword_2_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDebugEventAnswerAccess().getNumberSignKeyword_2_1_0()); 

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
    // $ANTLR end "rule__DebugEventAnswer__Group_2_1__0__Impl"


    // $ANTLR start "rule__DebugEventAnswer__Group_2_1__1"
    // InternalXercise.g:4092:1: rule__DebugEventAnswer__Group_2_1__1 : rule__DebugEventAnswer__Group_2_1__1__Impl ;
    public final void rule__DebugEventAnswer__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4096:1: ( rule__DebugEventAnswer__Group_2_1__1__Impl )
            // InternalXercise.g:4097:2: rule__DebugEventAnswer__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__DebugEventAnswer__Group_2_1__1"


    // $ANTLR start "rule__DebugEventAnswer__Group_2_1__1__Impl"
    // InternalXercise.g:4103:1: rule__DebugEventAnswer__Group_2_1__1__Impl : ( ( rule__DebugEventAnswer__ActionAssignment_2_1_1 ) ) ;
    public final void rule__DebugEventAnswer__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4107:1: ( ( ( rule__DebugEventAnswer__ActionAssignment_2_1_1 ) ) )
            // InternalXercise.g:4108:1: ( ( rule__DebugEventAnswer__ActionAssignment_2_1_1 ) )
            {
            // InternalXercise.g:4108:1: ( ( rule__DebugEventAnswer__ActionAssignment_2_1_1 ) )
            // InternalXercise.g:4109:2: ( rule__DebugEventAnswer__ActionAssignment_2_1_1 )
            {
             before(grammarAccess.getDebugEventAnswerAccess().getActionAssignment_2_1_1()); 
            // InternalXercise.g:4110:2: ( rule__DebugEventAnswer__ActionAssignment_2_1_1 )
            // InternalXercise.g:4110:3: rule__DebugEventAnswer__ActionAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__ActionAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDebugEventAnswerAccess().getActionAssignment_2_1_1()); 

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
    // $ANTLR end "rule__DebugEventAnswer__Group_2_1__1__Impl"


    // $ANTLR start "rule__Exercise__NameAssignment_2_0_0"
    // InternalXercise.g:4119:1: rule__Exercise__NameAssignment_2_0_0 : ( ruleQName ) ;
    public final void rule__Exercise__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4123:1: ( ( ruleQName ) )
            // InternalXercise.g:4124:2: ( ruleQName )
            {
            // InternalXercise.g:4124:2: ( ruleQName )
            // InternalXercise.g:4125:3: ruleQName
            {
             before(grammarAccess.getExerciseAccess().getNameQNameParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getNameQNameParserRuleCall_2_0_0_0()); 

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
    // $ANTLR end "rule__Exercise__NameAssignment_2_0_0"


    // $ANTLR start "rule__Exercise__TitleAssignment_2_0_1"
    // InternalXercise.g:4134:1: rule__Exercise__TitleAssignment_2_0_1 : ( RULE_STRING ) ;
    public final void rule__Exercise__TitleAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4138:1: ( ( RULE_STRING ) )
            // InternalXercise.g:4139:2: ( RULE_STRING )
            {
            // InternalXercise.g:4139:2: ( RULE_STRING )
            // InternalXercise.g:4140:3: RULE_STRING
            {
             before(grammarAccess.getExerciseAccess().getTitleSTRINGTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExerciseAccess().getTitleSTRINGTerminalRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__Exercise__TitleAssignment_2_0_1"


    // $ANTLR start "rule__Exercise__PartsAssignment_2_0_2"
    // InternalXercise.g:4149:1: rule__Exercise__PartsAssignment_2_0_2 : ( ruleAbstractExercisePart ) ;
    public final void rule__Exercise__PartsAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4153:1: ( ( ruleAbstractExercisePart ) )
            // InternalXercise.g:4154:2: ( ruleAbstractExercisePart )
            {
            // InternalXercise.g:4154:2: ( ruleAbstractExercisePart )
            // InternalXercise.g:4155:3: ruleAbstractExercisePart
            {
             before(grammarAccess.getExerciseAccess().getPartsAbstractExercisePartParserRuleCall_2_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractExercisePart();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getPartsAbstractExercisePartParserRuleCall_2_0_2_0()); 

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
    // $ANTLR end "rule__Exercise__PartsAssignment_2_0_2"


    // $ANTLR start "rule__Exercise__PartsAssignment_2_1"
    // InternalXercise.g:4164:1: rule__Exercise__PartsAssignment_2_1 : ( ruleAnonymousExercisePart ) ;
    public final void rule__Exercise__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4168:1: ( ( ruleAnonymousExercisePart ) )
            // InternalXercise.g:4169:2: ( ruleAnonymousExercisePart )
            {
            // InternalXercise.g:4169:2: ( ruleAnonymousExercisePart )
            // InternalXercise.g:4170:3: ruleAnonymousExercisePart
            {
             before(grammarAccess.getExerciseAccess().getPartsAnonymousExercisePartParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnonymousExercisePart();

            state._fsp--;

             after(grammarAccess.getExerciseAccess().getPartsAnonymousExercisePartParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Exercise__PartsAssignment_2_1"


    // $ANTLR start "rule__ExercisePart__NameAssignment_1"
    // InternalXercise.g:4179:1: rule__ExercisePart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExercisePart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4183:1: ( ( RULE_ID ) )
            // InternalXercise.g:4184:2: ( RULE_ID )
            {
            // InternalXercise.g:4184:2: ( RULE_ID )
            // InternalXercise.g:4185:3: RULE_ID
            {
             before(grammarAccess.getExercisePartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExercisePartAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExercisePart__NameAssignment_1"


    // $ANTLR start "rule__ExercisePart__TitleAssignment_2"
    // InternalXercise.g:4194:1: rule__ExercisePart__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ExercisePart__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4198:1: ( ( RULE_STRING ) )
            // InternalXercise.g:4199:2: ( RULE_STRING )
            {
            // InternalXercise.g:4199:2: ( RULE_STRING )
            // InternalXercise.g:4200:3: RULE_STRING
            {
             before(grammarAccess.getExercisePartAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExercisePartAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExercisePart__TitleAssignment_2"


    // $ANTLR start "rule__ExercisePart__TasksAssignment_3"
    // InternalXercise.g:4209:1: rule__ExercisePart__TasksAssignment_3 : ( ruleAbstractTask ) ;
    public final void rule__ExercisePart__TasksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4213:1: ( ( ruleAbstractTask ) )
            // InternalXercise.g:4214:2: ( ruleAbstractTask )
            {
            // InternalXercise.g:4214:2: ( ruleAbstractTask )
            // InternalXercise.g:4215:3: ruleAbstractTask
            {
             before(grammarAccess.getExercisePartAccess().getTasksAbstractTaskParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getExercisePartAccess().getTasksAbstractTaskParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExercisePart__TasksAssignment_3"


    // $ANTLR start "rule__ExercisePartRef__PartRefAssignment_2"
    // InternalXercise.g:4224:1: rule__ExercisePartRef__PartRefAssignment_2 : ( ( ruleQName ) ) ;
    public final void rule__ExercisePartRef__PartRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4228:1: ( ( ( ruleQName ) ) )
            // InternalXercise.g:4229:2: ( ( ruleQName ) )
            {
            // InternalXercise.g:4229:2: ( ( ruleQName ) )
            // InternalXercise.g:4230:3: ( ruleQName )
            {
             before(grammarAccess.getExercisePartRefAccess().getPartRefExercisePartCrossReference_2_0()); 
            // InternalXercise.g:4231:3: ( ruleQName )
            // InternalXercise.g:4232:4: ruleQName
            {
             before(grammarAccess.getExercisePartRefAccess().getPartRefExercisePartQNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getExercisePartRefAccess().getPartRefExercisePartQNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExercisePartRefAccess().getPartRefExercisePartCrossReference_2_0()); 

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
    // $ANTLR end "rule__ExercisePartRef__PartRefAssignment_2"


    // $ANTLR start "rule__AnonymousExercisePart__TasksAssignment_1"
    // InternalXercise.g:4243:1: rule__AnonymousExercisePart__TasksAssignment_1 : ( ruleAbstractTask ) ;
    public final void rule__AnonymousExercisePart__TasksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4247:1: ( ( ruleAbstractTask ) )
            // InternalXercise.g:4248:2: ( ruleAbstractTask )
            {
            // InternalXercise.g:4248:2: ( ruleAbstractTask )
            // InternalXercise.g:4249:3: ruleAbstractTask
            {
             before(grammarAccess.getAnonymousExercisePartAccess().getTasksAbstractTaskParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getAnonymousExercisePartAccess().getTasksAbstractTaskParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AnonymousExercisePart__TasksAssignment_1"


    // $ANTLR start "rule__TaskRef__TaskRefAssignment_1"
    // InternalXercise.g:4258:1: rule__TaskRef__TaskRefAssignment_1 : ( ( ruleQName ) ) ;
    public final void rule__TaskRef__TaskRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4262:1: ( ( ( ruleQName ) ) )
            // InternalXercise.g:4263:2: ( ( ruleQName ) )
            {
            // InternalXercise.g:4263:2: ( ( ruleQName ) )
            // InternalXercise.g:4264:3: ( ruleQName )
            {
             before(grammarAccess.getTaskRefAccess().getTaskRefTaskCrossReference_1_0()); 
            // InternalXercise.g:4265:3: ( ruleQName )
            // InternalXercise.g:4266:4: ruleQName
            {
             before(grammarAccess.getTaskRefAccess().getTaskRefTaskQNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getTaskRefAccess().getTaskRefTaskQNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTaskRefAccess().getTaskRefTaskCrossReference_1_0()); 

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
    // $ANTLR end "rule__TaskRef__TaskRefAssignment_1"


    // $ANTLR start "rule__Task__NameAssignment_0"
    // InternalXercise.g:4277:1: rule__Task__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4281:1: ( ( RULE_ID ) )
            // InternalXercise.g:4282:2: ( RULE_ID )
            {
            // InternalXercise.g:4282:2: ( RULE_ID )
            // InternalXercise.g:4283:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Task__NameAssignment_0"


    // $ANTLR start "rule__Task__QAssignment_1"
    // InternalXercise.g:4292:1: rule__Task__QAssignment_1 : ( ruleQuestion ) ;
    public final void rule__Task__QAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4296:1: ( ( ruleQuestion ) )
            // InternalXercise.g:4297:2: ( ruleQuestion )
            {
            // InternalXercise.g:4297:2: ( ruleQuestion )
            // InternalXercise.g:4298:3: ruleQuestion
            {
             before(grammarAccess.getTaskAccess().getQQuestionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getQQuestionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Task__QAssignment_1"


    // $ANTLR start "rule__Task__AAssignment_2"
    // InternalXercise.g:4307:1: rule__Task__AAssignment_2 : ( ruleAnswer ) ;
    public final void rule__Task__AAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4311:1: ( ( ruleAnswer ) )
            // InternalXercise.g:4312:2: ( ruleAnswer )
            {
            // InternalXercise.g:4312:2: ( ruleAnswer )
            // InternalXercise.g:4313:3: ruleAnswer
            {
             before(grammarAccess.getTaskAccess().getAAnswerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getAAnswerParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Task__AAssignment_2"


    // $ANTLR start "rule__StringQuestion__QuestionAssignment"
    // InternalXercise.g:4322:1: rule__StringQuestion__QuestionAssignment : ( RULE_STRING ) ;
    public final void rule__StringQuestion__QuestionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4326:1: ( ( RULE_STRING ) )
            // InternalXercise.g:4327:2: ( RULE_STRING )
            {
            // InternalXercise.g:4327:2: ( RULE_STRING )
            // InternalXercise.g:4328:3: RULE_STRING
            {
             before(grammarAccess.getStringQuestionAccess().getQuestionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringQuestionAccess().getQuestionSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringQuestion__QuestionAssignment"


    // $ANTLR start "rule__StringAnswer__ValueAssignment_0"
    // InternalXercise.g:4337:1: rule__StringAnswer__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringAnswer__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4341:1: ( ( RULE_STRING ) )
            // InternalXercise.g:4342:2: ( RULE_STRING )
            {
            // InternalXercise.g:4342:2: ( RULE_STRING )
            // InternalXercise.g:4343:3: RULE_STRING
            {
             before(grammarAccess.getStringAnswerAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringAnswerAccess().getValueSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__StringAnswer__ValueAssignment_0"


    // $ANTLR start "rule__StringAnswer__IgnoreCaseAssignment_1"
    // InternalXercise.g:4352:1: rule__StringAnswer__IgnoreCaseAssignment_1 : ( ( '~' ) ) ;
    public final void rule__StringAnswer__IgnoreCaseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4356:1: ( ( ( '~' ) ) )
            // InternalXercise.g:4357:2: ( ( '~' ) )
            {
            // InternalXercise.g:4357:2: ( ( '~' ) )
            // InternalXercise.g:4358:3: ( '~' )
            {
             before(grammarAccess.getStringAnswerAccess().getIgnoreCaseTildeKeyword_1_0()); 
            // InternalXercise.g:4359:3: ( '~' )
            // InternalXercise.g:4360:4: '~'
            {
             before(grammarAccess.getStringAnswerAccess().getIgnoreCaseTildeKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getStringAnswerAccess().getIgnoreCaseTildeKeyword_1_0()); 

            }

             after(grammarAccess.getStringAnswerAccess().getIgnoreCaseTildeKeyword_1_0()); 

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
    // $ANTLR end "rule__StringAnswer__IgnoreCaseAssignment_1"


    // $ANTLR start "rule__RegexAnswer__RegexpAssignment_0"
    // InternalXercise.g:4371:1: rule__RegexAnswer__RegexpAssignment_0 : ( ( '/' ) ) ;
    public final void rule__RegexAnswer__RegexpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4375:1: ( ( ( '/' ) ) )
            // InternalXercise.g:4376:2: ( ( '/' ) )
            {
            // InternalXercise.g:4376:2: ( ( '/' ) )
            // InternalXercise.g:4377:3: ( '/' )
            {
             before(grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0()); 
            // InternalXercise.g:4378:3: ( '/' )
            // InternalXercise.g:4379:4: '/'
            {
             before(grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0()); 

            }

             after(grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0()); 

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
    // $ANTLR end "rule__RegexAnswer__RegexpAssignment_0"


    // $ANTLR start "rule__RegexAnswer__ValueAssignment_1"
    // InternalXercise.g:4390:1: rule__RegexAnswer__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RegexAnswer__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4394:1: ( ( RULE_STRING ) )
            // InternalXercise.g:4395:2: ( RULE_STRING )
            {
            // InternalXercise.g:4395:2: ( RULE_STRING )
            // InternalXercise.g:4396:3: RULE_STRING
            {
             before(grammarAccess.getRegexAnswerAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRegexAnswerAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RegexAnswer__ValueAssignment_1"


    // $ANTLR start "rule__RegexAnswer__IgnoreCaseAssignment_3"
    // InternalXercise.g:4405:1: rule__RegexAnswer__IgnoreCaseAssignment_3 : ( ( '~' ) ) ;
    public final void rule__RegexAnswer__IgnoreCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4409:1: ( ( ( '~' ) ) )
            // InternalXercise.g:4410:2: ( ( '~' ) )
            {
            // InternalXercise.g:4410:2: ( ( '~' ) )
            // InternalXercise.g:4411:3: ( '~' )
            {
             before(grammarAccess.getRegexAnswerAccess().getIgnoreCaseTildeKeyword_3_0()); 
            // InternalXercise.g:4412:3: ( '~' )
            // InternalXercise.g:4413:4: '~'
            {
             before(grammarAccess.getRegexAnswerAccess().getIgnoreCaseTildeKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRegexAnswerAccess().getIgnoreCaseTildeKeyword_3_0()); 

            }

             after(grammarAccess.getRegexAnswerAccess().getIgnoreCaseTildeKeyword_3_0()); 

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
    // $ANTLR end "rule__RegexAnswer__IgnoreCaseAssignment_3"


    // $ANTLR start "rule__NumberAnswer__ValueAssignment_0"
    // InternalXercise.g:4424:1: rule__NumberAnswer__ValueAssignment_0 : ( ruleEDoubleObject ) ;
    public final void rule__NumberAnswer__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4428:1: ( ( ruleEDoubleObject ) )
            // InternalXercise.g:4429:2: ( ruleEDoubleObject )
            {
            // InternalXercise.g:4429:2: ( ruleEDoubleObject )
            // InternalXercise.g:4430:3: ruleEDoubleObject
            {
             before(grammarAccess.getNumberAnswerAccess().getValueEDoubleObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getNumberAnswerAccess().getValueEDoubleObjectParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NumberAnswer__ValueAssignment_0"


    // $ANTLR start "rule__NumberAnswer__ErrorMarginAssignment_1_1"
    // InternalXercise.g:4439:1: rule__NumberAnswer__ErrorMarginAssignment_1_1 : ( ruleEDoubleObject ) ;
    public final void rule__NumberAnswer__ErrorMarginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4443:1: ( ( ruleEDoubleObject ) )
            // InternalXercise.g:4444:2: ( ruleEDoubleObject )
            {
            // InternalXercise.g:4444:2: ( ruleEDoubleObject )
            // InternalXercise.g:4445:3: ruleEDoubleObject
            {
             before(grammarAccess.getNumberAnswerAccess().getErrorMarginEDoubleObjectParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getNumberAnswerAccess().getErrorMarginEDoubleObjectParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__NumberAnswer__ErrorMarginAssignment_1_1"


    // $ANTLR start "rule__BooleanAnswer__ValueAssignment_1_0"
    // InternalXercise.g:4454:1: rule__BooleanAnswer__ValueAssignment_1_0 : ( ( rule__BooleanAnswer__ValueAlternatives_1_0_0 ) ) ;
    public final void rule__BooleanAnswer__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4458:1: ( ( ( rule__BooleanAnswer__ValueAlternatives_1_0_0 ) ) )
            // InternalXercise.g:4459:2: ( ( rule__BooleanAnswer__ValueAlternatives_1_0_0 ) )
            {
            // InternalXercise.g:4459:2: ( ( rule__BooleanAnswer__ValueAlternatives_1_0_0 ) )
            // InternalXercise.g:4460:3: ( rule__BooleanAnswer__ValueAlternatives_1_0_0 )
            {
             before(grammarAccess.getBooleanAnswerAccess().getValueAlternatives_1_0_0()); 
            // InternalXercise.g:4461:3: ( rule__BooleanAnswer__ValueAlternatives_1_0_0 )
            // InternalXercise.g:4461:4: rule__BooleanAnswer__ValueAlternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanAnswer__ValueAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAnswerAccess().getValueAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__BooleanAnswer__ValueAssignment_1_0"


    // $ANTLR start "rule__SingleBoxOptionsAnswer__OptionsAssignment"
    // InternalXercise.g:4469:1: rule__SingleBoxOptionsAnswer__OptionsAssignment : ( ruleSingleBoxOption ) ;
    public final void rule__SingleBoxOptionsAnswer__OptionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4473:1: ( ( ruleSingleBoxOption ) )
            // InternalXercise.g:4474:2: ( ruleSingleBoxOption )
            {
            // InternalXercise.g:4474:2: ( ruleSingleBoxOption )
            // InternalXercise.g:4475:3: ruleSingleBoxOption
            {
             before(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsSingleBoxOptionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleBoxOption();

            state._fsp--;

             after(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsSingleBoxOptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__SingleBoxOptionsAnswer__OptionsAssignment"


    // $ANTLR start "rule__SingleBoxOption__CorrectAssignment_1"
    // InternalXercise.g:4484:1: rule__SingleBoxOption__CorrectAssignment_1 : ( ( 'x' ) ) ;
    public final void rule__SingleBoxOption__CorrectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4488:1: ( ( ( 'x' ) ) )
            // InternalXercise.g:4489:2: ( ( 'x' ) )
            {
            // InternalXercise.g:4489:2: ( ( 'x' ) )
            // InternalXercise.g:4490:3: ( 'x' )
            {
             before(grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0()); 
            // InternalXercise.g:4491:3: ( 'x' )
            // InternalXercise.g:4492:4: 'x'
            {
             before(grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0()); 

            }

             after(grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0()); 

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
    // $ANTLR end "rule__SingleBoxOption__CorrectAssignment_1"


    // $ANTLR start "rule__SingleBoxOption__OptionAssignment_3"
    // InternalXercise.g:4503:1: rule__SingleBoxOption__OptionAssignment_3 : ( ruleOptionAnswer ) ;
    public final void rule__SingleBoxOption__OptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4507:1: ( ( ruleOptionAnswer ) )
            // InternalXercise.g:4508:2: ( ruleOptionAnswer )
            {
            // InternalXercise.g:4508:2: ( ruleOptionAnswer )
            // InternalXercise.g:4509:3: ruleOptionAnswer
            {
             before(grammarAccess.getSingleBoxOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionAnswer();

            state._fsp--;

             after(grammarAccess.getSingleBoxOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SingleBoxOption__OptionAssignment_3"


    // $ANTLR start "rule__SingleListOptionsAnswer__OptionsAssignment"
    // InternalXercise.g:4518:1: rule__SingleListOptionsAnswer__OptionsAssignment : ( ruleSingleListOption ) ;
    public final void rule__SingleListOptionsAnswer__OptionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4522:1: ( ( ruleSingleListOption ) )
            // InternalXercise.g:4523:2: ( ruleSingleListOption )
            {
            // InternalXercise.g:4523:2: ( ruleSingleListOption )
            // InternalXercise.g:4524:3: ruleSingleListOption
            {
             before(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsSingleListOptionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleListOption();

            state._fsp--;

             after(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsSingleListOptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__SingleListOptionsAnswer__OptionsAssignment"


    // $ANTLR start "rule__SingleListOption__CorrectAssignment_0_1"
    // InternalXercise.g:4533:1: rule__SingleListOption__CorrectAssignment_0_1 : ( ( 'v' ) ) ;
    public final void rule__SingleListOption__CorrectAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4537:1: ( ( ( 'v' ) ) )
            // InternalXercise.g:4538:2: ( ( 'v' ) )
            {
            // InternalXercise.g:4538:2: ( ( 'v' ) )
            // InternalXercise.g:4539:3: ( 'v' )
            {
             before(grammarAccess.getSingleListOptionAccess().getCorrectVKeyword_0_1_0()); 
            // InternalXercise.g:4540:3: ( 'v' )
            // InternalXercise.g:4541:4: 'v'
            {
             before(grammarAccess.getSingleListOptionAccess().getCorrectVKeyword_0_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getSingleListOptionAccess().getCorrectVKeyword_0_1_0()); 

            }

             after(grammarAccess.getSingleListOptionAccess().getCorrectVKeyword_0_1_0()); 

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
    // $ANTLR end "rule__SingleListOption__CorrectAssignment_0_1"


    // $ANTLR start "rule__SingleListOption__OptionAssignment_1"
    // InternalXercise.g:4552:1: rule__SingleListOption__OptionAssignment_1 : ( ruleOptionAnswer ) ;
    public final void rule__SingleListOption__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4556:1: ( ( ruleOptionAnswer ) )
            // InternalXercise.g:4557:2: ( ruleOptionAnswer )
            {
            // InternalXercise.g:4557:2: ( ruleOptionAnswer )
            // InternalXercise.g:4558:3: ruleOptionAnswer
            {
             before(grammarAccess.getSingleListOptionAccess().getOptionOptionAnswerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionAnswer();

            state._fsp--;

             after(grammarAccess.getSingleListOptionAccess().getOptionOptionAnswerParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SingleListOption__OptionAssignment_1"


    // $ANTLR start "rule__ManyOptionsAnswer__OptionsAssignment"
    // InternalXercise.g:4567:1: rule__ManyOptionsAnswer__OptionsAssignment : ( ruleManyOption ) ;
    public final void rule__ManyOptionsAnswer__OptionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4571:1: ( ( ruleManyOption ) )
            // InternalXercise.g:4572:2: ( ruleManyOption )
            {
            // InternalXercise.g:4572:2: ( ruleManyOption )
            // InternalXercise.g:4573:3: ruleManyOption
            {
             before(grammarAccess.getManyOptionsAnswerAccess().getOptionsManyOptionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleManyOption();

            state._fsp--;

             after(grammarAccess.getManyOptionsAnswerAccess().getOptionsManyOptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__ManyOptionsAnswer__OptionsAssignment"


    // $ANTLR start "rule__ManyOption__CorrectAssignment_1"
    // InternalXercise.g:4582:1: rule__ManyOption__CorrectAssignment_1 : ( ( 'x' ) ) ;
    public final void rule__ManyOption__CorrectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4586:1: ( ( ( 'x' ) ) )
            // InternalXercise.g:4587:2: ( ( 'x' ) )
            {
            // InternalXercise.g:4587:2: ( ( 'x' ) )
            // InternalXercise.g:4588:3: ( 'x' )
            {
             before(grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0()); 
            // InternalXercise.g:4589:3: ( 'x' )
            // InternalXercise.g:4590:4: 'x'
            {
             before(grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0()); 

            }

             after(grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0()); 

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
    // $ANTLR end "rule__ManyOption__CorrectAssignment_1"


    // $ANTLR start "rule__ManyOption__OptionAssignment_3"
    // InternalXercise.g:4601:1: rule__ManyOption__OptionAssignment_3 : ( ruleOptionAnswer ) ;
    public final void rule__ManyOption__OptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4605:1: ( ( ruleOptionAnswer ) )
            // InternalXercise.g:4606:2: ( ruleOptionAnswer )
            {
            // InternalXercise.g:4606:2: ( ruleOptionAnswer )
            // InternalXercise.g:4607:3: ruleOptionAnswer
            {
             before(grammarAccess.getManyOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionAnswer();

            state._fsp--;

             after(grammarAccess.getManyOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ManyOption__OptionAssignment_3"


    // $ANTLR start "rule__JunitTestAnswer__TestRunNameAssignment_1"
    // InternalXercise.g:4616:1: rule__JunitTestAnswer__TestRunNameAssignment_1 : ( ruleQName ) ;
    public final void rule__JunitTestAnswer__TestRunNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4620:1: ( ( ruleQName ) )
            // InternalXercise.g:4621:2: ( ruleQName )
            {
            // InternalXercise.g:4621:2: ( ruleQName )
            // InternalXercise.g:4622:3: ruleQName
            {
             before(grammarAccess.getJunitTestAnswerAccess().getTestRunNameQNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getJunitTestAnswerAccess().getTestRunNameQNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__JunitTestAnswer__TestRunNameAssignment_1"


    // $ANTLR start "rule__JunitTestAnswer__MethodNamesAssignment_2_1"
    // InternalXercise.g:4631:1: rule__JunitTestAnswer__MethodNamesAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__JunitTestAnswer__MethodNamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4635:1: ( ( RULE_ID ) )
            // InternalXercise.g:4636:2: ( RULE_ID )
            {
            // InternalXercise.g:4636:2: ( RULE_ID )
            // InternalXercise.g:4637:3: RULE_ID
            {
             before(grammarAccess.getJunitTestAnswerAccess().getMethodNamesIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJunitTestAnswerAccess().getMethodNamesIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__JunitTestAnswer__MethodNamesAssignment_2_1"


    // $ANTLR start "rule__JunitTestAnswer__MethodNamesAssignment_2_2_1"
    // InternalXercise.g:4646:1: rule__JunitTestAnswer__MethodNamesAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__JunitTestAnswer__MethodNamesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4650:1: ( ( RULE_ID ) )
            // InternalXercise.g:4651:2: ( RULE_ID )
            {
            // InternalXercise.g:4651:2: ( RULE_ID )
            // InternalXercise.g:4652:3: RULE_ID
            {
             before(grammarAccess.getJunitTestAnswerAccess().getMethodNamesIDTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJunitTestAnswerAccess().getMethodNamesIDTerminalRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__JunitTestAnswer__MethodNamesAssignment_2_2_1"


    // $ANTLR start "rule__JdtSourceEditAnswer__ClassNameAssignment_2"
    // InternalXercise.g:4661:1: rule__JdtSourceEditAnswer__ClassNameAssignment_2 : ( ruleQName ) ;
    public final void rule__JdtSourceEditAnswer__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4665:1: ( ( ruleQName ) )
            // InternalXercise.g:4666:2: ( ruleQName )
            {
            // InternalXercise.g:4666:2: ( ruleQName )
            // InternalXercise.g:4667:3: ruleQName
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getClassNameQNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getJdtSourceEditAnswerAccess().getClassNameQNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__ClassNameAssignment_2"


    // $ANTLR start "rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1"
    // InternalXercise.g:4676:1: rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4680:1: ( ( RULE_ID ) )
            // InternalXercise.g:4681:2: ( RULE_ID )
            {
            // InternalXercise.g:4681:2: ( RULE_ID )
            // InternalXercise.g:4682:3: RULE_ID
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getMethodNamesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJdtSourceEditAnswerAccess().getMethodNamesIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__MethodNamesAssignment_3_1"


    // $ANTLR start "rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1"
    // InternalXercise.g:4691:1: rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4695:1: ( ( RULE_ID ) )
            // InternalXercise.g:4696:2: ( RULE_ID )
            {
            // InternalXercise.g:4696:2: ( RULE_ID )
            // InternalXercise.g:4697:3: RULE_ID
            {
             before(grammarAccess.getJdtSourceEditAnswerAccess().getMethodNamesIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJdtSourceEditAnswerAccess().getMethodNamesIDTerminalRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__JdtSourceEditAnswer__MethodNamesAssignment_3_2_1"


    // $ANTLR start "rule__JdtLaunchAnswer__ClassNameAssignment_2"
    // InternalXercise.g:4706:1: rule__JdtLaunchAnswer__ClassNameAssignment_2 : ( ruleQName ) ;
    public final void rule__JdtLaunchAnswer__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4710:1: ( ( ruleQName ) )
            // InternalXercise.g:4711:2: ( ruleQName )
            {
            // InternalXercise.g:4711:2: ( ruleQName )
            // InternalXercise.g:4712:3: ruleQName
            {
             before(grammarAccess.getJdtLaunchAnswerAccess().getClassNameQNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getJdtLaunchAnswerAccess().getClassNameQNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__JdtLaunchAnswer__ClassNameAssignment_2"


    // $ANTLR start "rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0"
    // InternalXercise.g:4721:1: rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0 : ( ruleQName ) ;
    public final void rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4725:1: ( ( ruleQName ) )
            // InternalXercise.g:4726:2: ( ruleQName )
            {
            // InternalXercise.g:4726:2: ( ruleQName )
            // InternalXercise.g:4727:3: ruleQName
            {
             before(grammarAccess.getPerspectiveTaskAnswerAccess().getElementIdQNameParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getPerspectiveTaskAnswerAccess().getElementIdQNameParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__ElementIdAssignment_2_0"


    // $ANTLR start "rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1"
    // InternalXercise.g:4736:1: rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1 : ( ( rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0 ) ) ;
    public final void rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4740:1: ( ( ( rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0 ) ) )
            // InternalXercise.g:4741:2: ( ( rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0 ) )
            {
            // InternalXercise.g:4741:2: ( ( rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0 ) )
            // InternalXercise.g:4742:3: ( rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0 )
            {
             before(grammarAccess.getPerspectiveTaskAnswerAccess().getActionAlternatives_2_1_1_0()); 
            // InternalXercise.g:4743:3: ( rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0 )
            // InternalXercise.g:4743:4: rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveTaskAnswer__ActionAlternatives_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveTaskAnswerAccess().getActionAlternatives_2_1_1_0()); 

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
    // $ANTLR end "rule__PerspectiveTaskAnswer__ActionAssignment_2_1_1"


    // $ANTLR start "rule__PartTaskAnswer__ElementIdAssignment_2_0"
    // InternalXercise.g:4751:1: rule__PartTaskAnswer__ElementIdAssignment_2_0 : ( ruleQName ) ;
    public final void rule__PartTaskAnswer__ElementIdAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4755:1: ( ( ruleQName ) )
            // InternalXercise.g:4756:2: ( ruleQName )
            {
            // InternalXercise.g:4756:2: ( ruleQName )
            // InternalXercise.g:4757:3: ruleQName
            {
             before(grammarAccess.getPartTaskAnswerAccess().getElementIdQNameParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getPartTaskAnswerAccess().getElementIdQNameParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__PartTaskAnswer__ElementIdAssignment_2_0"


    // $ANTLR start "rule__PartTaskAnswer__ActionAssignment_2_1_1"
    // InternalXercise.g:4766:1: rule__PartTaskAnswer__ActionAssignment_2_1_1 : ( ( rule__PartTaskAnswer__ActionAlternatives_2_1_1_0 ) ) ;
    public final void rule__PartTaskAnswer__ActionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4770:1: ( ( ( rule__PartTaskAnswer__ActionAlternatives_2_1_1_0 ) ) )
            // InternalXercise.g:4771:2: ( ( rule__PartTaskAnswer__ActionAlternatives_2_1_1_0 ) )
            {
            // InternalXercise.g:4771:2: ( ( rule__PartTaskAnswer__ActionAlternatives_2_1_1_0 ) )
            // InternalXercise.g:4772:3: ( rule__PartTaskAnswer__ActionAlternatives_2_1_1_0 )
            {
             before(grammarAccess.getPartTaskAnswerAccess().getActionAlternatives_2_1_1_0()); 
            // InternalXercise.g:4773:3: ( rule__PartTaskAnswer__ActionAlternatives_2_1_1_0 )
            // InternalXercise.g:4773:4: rule__PartTaskAnswer__ActionAlternatives_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PartTaskAnswer__ActionAlternatives_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPartTaskAnswerAccess().getActionAlternatives_2_1_1_0()); 

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
    // $ANTLR end "rule__PartTaskAnswer__ActionAssignment_2_1_1"


    // $ANTLR start "rule__CommandExecutionAnswer__ElementIdAssignment_2_0"
    // InternalXercise.g:4781:1: rule__CommandExecutionAnswer__ElementIdAssignment_2_0 : ( ruleQName ) ;
    public final void rule__CommandExecutionAnswer__ElementIdAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4785:1: ( ( ruleQName ) )
            // InternalXercise.g:4786:2: ( ruleQName )
            {
            // InternalXercise.g:4786:2: ( ruleQName )
            // InternalXercise.g:4787:3: ruleQName
            {
             before(grammarAccess.getCommandExecutionAnswerAccess().getElementIdQNameParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getCommandExecutionAnswerAccess().getElementIdQNameParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__CommandExecutionAnswer__ElementIdAssignment_2_0"


    // $ANTLR start "rule__CommandExecutionAnswer__ActionAssignment_2_1_1"
    // InternalXercise.g:4796:1: rule__CommandExecutionAnswer__ActionAssignment_2_1_1 : ( ( rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0 ) ) ;
    public final void rule__CommandExecutionAnswer__ActionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4800:1: ( ( ( rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0 ) ) )
            // InternalXercise.g:4801:2: ( ( rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0 ) )
            {
            // InternalXercise.g:4801:2: ( ( rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0 ) )
            // InternalXercise.g:4802:3: ( rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0 )
            {
             before(grammarAccess.getCommandExecutionAnswerAccess().getActionAlternatives_2_1_1_0()); 
            // InternalXercise.g:4803:3: ( rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0 )
            // InternalXercise.g:4803:4: rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandExecutionAnswer__ActionAlternatives_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandExecutionAnswerAccess().getActionAlternatives_2_1_1_0()); 

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
    // $ANTLR end "rule__CommandExecutionAnswer__ActionAssignment_2_1_1"


    // $ANTLR start "rule__DebugEventAnswer__ElementIdAssignment_2_0"
    // InternalXercise.g:4811:1: rule__DebugEventAnswer__ElementIdAssignment_2_0 : ( ruleQName ) ;
    public final void rule__DebugEventAnswer__ElementIdAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4815:1: ( ( ruleQName ) )
            // InternalXercise.g:4816:2: ( ruleQName )
            {
            // InternalXercise.g:4816:2: ( ruleQName )
            // InternalXercise.g:4817:3: ruleQName
            {
             before(grammarAccess.getDebugEventAnswerAccess().getElementIdQNameParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getDebugEventAnswerAccess().getElementIdQNameParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__DebugEventAnswer__ElementIdAssignment_2_0"


    // $ANTLR start "rule__DebugEventAnswer__ActionAssignment_2_1_1"
    // InternalXercise.g:4826:1: rule__DebugEventAnswer__ActionAssignment_2_1_1 : ( ( rule__DebugEventAnswer__ActionAlternatives_2_1_1_0 ) ) ;
    public final void rule__DebugEventAnswer__ActionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXercise.g:4830:1: ( ( ( rule__DebugEventAnswer__ActionAlternatives_2_1_1_0 ) ) )
            // InternalXercise.g:4831:2: ( ( rule__DebugEventAnswer__ActionAlternatives_2_1_1_0 ) )
            {
            // InternalXercise.g:4831:2: ( ( rule__DebugEventAnswer__ActionAlternatives_2_1_1_0 ) )
            // InternalXercise.g:4832:3: ( rule__DebugEventAnswer__ActionAlternatives_2_1_1_0 )
            {
             before(grammarAccess.getDebugEventAnswerAccess().getActionAlternatives_2_1_1_0()); 
            // InternalXercise.g:4833:3: ( rule__DebugEventAnswer__ActionAlternatives_2_1_1_0 )
            // InternalXercise.g:4833:4: rule__DebugEventAnswer__ActionAlternatives_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DebugEventAnswer__ActionAlternatives_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDebugEventAnswerAccess().getActionAlternatives_2_1_1_0()); 

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
    // $ANTLR end "rule__DebugEventAnswer__ActionAssignment_2_1_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\4\4\uffff\1\5\1\4\1\5\1\4";
    static final String dfa_3s = "\1\4\1\6\1\5\3\uffff\5\4";
    static final String dfa_4s = "\1\46\1\45\1\71\3\uffff\1\46\1\65\3\71";
    static final String dfa_5s = "\3\uffff\2\1\1\2\5\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\2\36\uffff\1\3\1\5",
            "\1\2\35\uffff\1\4\1\3",
            "\2\5\4\uffff\6\5\24\uffff\1\6\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5",
            "",
            "",
            "",
            "\1\7\41\uffff\1\4",
            "\1\5\1\uffff\1\10\35\uffff\1\5\1\uffff\1\5\16\uffff\1\5",
            "\1\4\1\5\1\11\4\uffff\6\5\24\uffff\1\6\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5",
            "\1\5\1\4\1\12\4\uffff\6\4\24\uffff\1\4\1\5\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\5\1\4",
            "\1\4\1\5\1\11\4\uffff\6\5\24\uffff\1\6\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\4\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "948:1: rule__Exercise__Alternatives_2 : ( ( ( rule__Exercise__Group_2_0__0 ) ) | ( ( rule__Exercise__PartsAssignment_2_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0200000000018002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000006000000050L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000050L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000052L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x02D22AA00001F860L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000007860L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000007FE000000L});

}