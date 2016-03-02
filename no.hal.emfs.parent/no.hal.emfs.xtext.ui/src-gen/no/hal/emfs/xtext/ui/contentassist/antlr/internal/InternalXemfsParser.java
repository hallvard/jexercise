package no.hal.emfs.xtext.ui.contentassist.antlr.internal; 

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
import no.hal.emfs.xtext.services.XemfsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalXemfsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_STRING_CONTENT", "RULE_ID", "RULE_XML_TEXT", "RULE_WS", "';'", "'http'", "'https'", "'ftp'", "'file'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'/'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'source-folder'", "'output-folder'", "'library-jar'", "'class-container'", "'emfs'", "'#'", "'extends'", "'.'", "','", "'$'", "'='", "'@'", "':'", "'---'", "'{'", "'}'", "'['", "']'", "'//'", "'git'", "'dot.classpath'", "'('", "')'", "'dot.project'", "'<<'", "'>>'", "'?'", "'o'", "'x'", "'*'"
    };
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
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=4;
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
    public static final int RULE_STRING_CONTENT=5;
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


        public InternalXemfsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXemfsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXemfsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXemfs.g"; }


     
     	private XemfsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XemfsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEmfsRoot"
    // InternalXemfs.g:61:1: entryRuleEmfsRoot : ruleEmfsRoot EOF ;
    public final void entryRuleEmfsRoot() throws RecognitionException {
        try {
            // InternalXemfs.g:62:1: ( ruleEmfsRoot EOF )
            // InternalXemfs.g:63:1: ruleEmfsRoot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEmfsRoot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEmfsRoot"


    // $ANTLR start "ruleEmfsRoot"
    // InternalXemfs.g:70:1: ruleEmfsRoot : ( ( rule__EmfsRoot__Group__0 ) ) ;
    public final void ruleEmfsRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:74:2: ( ( ( rule__EmfsRoot__Group__0 ) ) )
            // InternalXemfs.g:75:1: ( ( rule__EmfsRoot__Group__0 ) )
            {
            // InternalXemfs.g:75:1: ( ( rule__EmfsRoot__Group__0 ) )
            // InternalXemfs.g:76:1: ( rule__EmfsRoot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup()); 
            }
            // InternalXemfs.g:77:1: ( rule__EmfsRoot__Group__0 )
            // InternalXemfs.g:77:2: rule__EmfsRoot__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getGroup()); 
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
    // $ANTLR end "ruleEmfsRoot"


    // $ANTLR start "entryRuleEmfsName"
    // InternalXemfs.g:89:1: entryRuleEmfsName : ruleEmfsName EOF ;
    public final void entryRuleEmfsName() throws RecognitionException {
        try {
            // InternalXemfs.g:90:1: ( ruleEmfsName EOF )
            // InternalXemfs.g:91:1: ruleEmfsName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEmfsName"


    // $ANTLR start "ruleEmfsName"
    // InternalXemfs.g:98:1: ruleEmfsName : ( ( rule__EmfsName__Group__0 ) ) ;
    public final void ruleEmfsName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:102:2: ( ( ( rule__EmfsName__Group__0 ) ) )
            // InternalXemfs.g:103:1: ( ( rule__EmfsName__Group__0 ) )
            {
            // InternalXemfs.g:103:1: ( ( rule__EmfsName__Group__0 ) )
            // InternalXemfs.g:104:1: ( rule__EmfsName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getGroup()); 
            }
            // InternalXemfs.g:105:1: ( rule__EmfsName__Group__0 )
            // InternalXemfs.g:105:2: rule__EmfsName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsNameAccess().getGroup()); 
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
    // $ANTLR end "ruleEmfsName"


    // $ANTLR start "entryRuleEmfsResourcesRef"
    // InternalXemfs.g:117:1: entryRuleEmfsResourcesRef : ruleEmfsResourcesRef EOF ;
    public final void entryRuleEmfsResourcesRef() throws RecognitionException {
        try {
            // InternalXemfs.g:118:1: ( ruleEmfsResourcesRef EOF )
            // InternalXemfs.g:119:1: ruleEmfsResourcesRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEmfsResourcesRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEmfsResourcesRef"


    // $ANTLR start "ruleEmfsResourcesRef"
    // InternalXemfs.g:126:1: ruleEmfsResourcesRef : ( ( rule__EmfsResourcesRef__Group__0 ) ) ;
    public final void ruleEmfsResourcesRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:130:2: ( ( ( rule__EmfsResourcesRef__Group__0 ) ) )
            // InternalXemfs.g:131:1: ( ( rule__EmfsResourcesRef__Group__0 ) )
            {
            // InternalXemfs.g:131:1: ( ( rule__EmfsResourcesRef__Group__0 ) )
            // InternalXemfs.g:132:1: ( rule__EmfsResourcesRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getGroup()); 
            }
            // InternalXemfs.g:133:1: ( rule__EmfsResourcesRef__Group__0 )
            // InternalXemfs.g:133:2: rule__EmfsResourcesRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsResourcesRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefAccess().getGroup()); 
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
    // $ANTLR end "ruleEmfsResourcesRef"


    // $ANTLR start "entryRuleResourceName"
    // InternalXemfs.g:145:1: entryRuleResourceName : ruleResourceName EOF ;
    public final void entryRuleResourceName() throws RecognitionException {
        try {
            // InternalXemfs.g:146:1: ( ruleResourceName EOF )
            // InternalXemfs.g:147:1: ruleResourceName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleResourceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResourceNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleResourceName"


    // $ANTLR start "ruleResourceName"
    // InternalXemfs.g:154:1: ruleResourceName : ( ( rule__ResourceName__Group__0 ) ) ;
    public final void ruleResourceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:158:2: ( ( ( rule__ResourceName__Group__0 ) ) )
            // InternalXemfs.g:159:1: ( ( rule__ResourceName__Group__0 ) )
            {
            // InternalXemfs.g:159:1: ( ( rule__ResourceName__Group__0 ) )
            // InternalXemfs.g:160:1: ( rule__ResourceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getGroup()); 
            }
            // InternalXemfs.g:161:1: ( rule__ResourceName__Group__0 )
            // InternalXemfs.g:161:2: rule__ResourceName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ResourceName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResourceNameAccess().getGroup()); 
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
    // $ANTLR end "ruleResourceName"


    // $ANTLR start "entryRuleEmfsResource"
    // InternalXemfs.g:173:1: entryRuleEmfsResource : ruleEmfsResource EOF ;
    public final void entryRuleEmfsResource() throws RecognitionException {
        try {
            // InternalXemfs.g:174:1: ( ruleEmfsResource EOF )
            // InternalXemfs.g:175:1: ruleEmfsResource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEmfsResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEmfsResource"


    // $ANTLR start "ruleEmfsResource"
    // InternalXemfs.g:182:1: ruleEmfsResource : ( ( rule__EmfsResource__Alternatives ) ) ;
    public final void ruleEmfsResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:186:2: ( ( ( rule__EmfsResource__Alternatives ) ) )
            // InternalXemfs.g:187:1: ( ( rule__EmfsResource__Alternatives ) )
            {
            // InternalXemfs.g:187:1: ( ( rule__EmfsResource__Alternatives ) )
            // InternalXemfs.g:188:1: ( rule__EmfsResource__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourceAccess().getAlternatives()); 
            }
            // InternalXemfs.g:189:1: ( rule__EmfsResource__Alternatives )
            // InternalXemfs.g:189:2: rule__EmfsResource__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsResource__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourceAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEmfsResource"


    // $ANTLR start "entryRuleProperty"
    // InternalXemfs.g:201:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalXemfs.g:202:1: ( ruleProperty EOF )
            // InternalXemfs.g:203:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalXemfs.g:210:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:214:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalXemfs.g:215:1: ( ( rule__Property__Group__0 ) )
            {
            // InternalXemfs.g:215:1: ( ( rule__Property__Group__0 ) )
            // InternalXemfs.g:216:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // InternalXemfs.g:217:1: ( rule__Property__Group__0 )
            // InternalXemfs.g:217:2: rule__Property__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleFolderName"
    // InternalXemfs.g:229:1: entryRuleFolderName : ruleFolderName EOF ;
    public final void entryRuleFolderName() throws RecognitionException {
        try {
            // InternalXemfs.g:230:1: ( ruleFolderName EOF )
            // InternalXemfs.g:231:1: ruleFolderName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFolderNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFolderName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFolderNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFolderName"


    // $ANTLR start "ruleFolderName"
    // InternalXemfs.g:238:1: ruleFolderName : ( ( rule__FolderName__Group__0 ) ) ;
    public final void ruleFolderName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:242:2: ( ( ( rule__FolderName__Group__0 ) ) )
            // InternalXemfs.g:243:1: ( ( rule__FolderName__Group__0 ) )
            {
            // InternalXemfs.g:243:1: ( ( rule__FolderName__Group__0 ) )
            // InternalXemfs.g:244:1: ( rule__FolderName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFolderNameAccess().getGroup()); 
            }
            // InternalXemfs.g:245:1: ( rule__FolderName__Group__0 )
            // InternalXemfs.g:245:2: rule__FolderName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FolderName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFolderNameAccess().getGroup()); 
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
    // $ANTLR end "ruleFolderName"


    // $ANTLR start "entryRuleEmfsContainer"
    // InternalXemfs.g:257:1: entryRuleEmfsContainer : ruleEmfsContainer EOF ;
    public final void entryRuleEmfsContainer() throws RecognitionException {
        try {
            // InternalXemfs.g:258:1: ( ruleEmfsContainer EOF )
            // InternalXemfs.g:259:1: ruleEmfsContainer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEmfsContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEmfsContainer"


    // $ANTLR start "ruleEmfsContainer"
    // InternalXemfs.g:266:1: ruleEmfsContainer : ( ( rule__EmfsContainer__Group__0 ) ) ;
    public final void ruleEmfsContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:270:2: ( ( ( rule__EmfsContainer__Group__0 ) ) )
            // InternalXemfs.g:271:1: ( ( rule__EmfsContainer__Group__0 ) )
            {
            // InternalXemfs.g:271:1: ( ( rule__EmfsContainer__Group__0 ) )
            // InternalXemfs.g:272:1: ( rule__EmfsContainer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getGroup()); 
            }
            // InternalXemfs.g:273:1: ( rule__EmfsContainer__Group__0 )
            // InternalXemfs.g:273:2: rule__EmfsContainer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getGroup()); 
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
    // $ANTLR end "ruleEmfsContainer"


    // $ANTLR start "entryRuleGitContentProvider"
    // InternalXemfs.g:285:1: entryRuleGitContentProvider : ruleGitContentProvider EOF ;
    public final void entryRuleGitContentProvider() throws RecognitionException {
        try {
            // InternalXemfs.g:286:1: ( ruleGitContentProvider EOF )
            // InternalXemfs.g:287:1: ruleGitContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGitContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGitContentProvider"


    // $ANTLR start "ruleGitContentProvider"
    // InternalXemfs.g:294:1: ruleGitContentProvider : ( ( rule__GitContentProvider__GitRefAssignment ) ) ;
    public final void ruleGitContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:298:2: ( ( ( rule__GitContentProvider__GitRefAssignment ) ) )
            // InternalXemfs.g:299:1: ( ( rule__GitContentProvider__GitRefAssignment ) )
            {
            // InternalXemfs.g:299:1: ( ( rule__GitContentProvider__GitRefAssignment ) )
            // InternalXemfs.g:300:1: ( rule__GitContentProvider__GitRefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentProviderAccess().getGitRefAssignment()); 
            }
            // InternalXemfs.g:301:1: ( rule__GitContentProvider__GitRefAssignment )
            // InternalXemfs.g:301:2: rule__GitContentProvider__GitRefAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentProvider__GitRefAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentProviderAccess().getGitRefAssignment()); 
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
    // $ANTLR end "ruleGitContentProvider"


    // $ANTLR start "entryRuleFileName"
    // InternalXemfs.g:313:1: entryRuleFileName : ruleFileName EOF ;
    public final void entryRuleFileName() throws RecognitionException {
        try {
            // InternalXemfs.g:314:1: ( ruleFileName EOF )
            // InternalXemfs.g:315:1: ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFileName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFileName"


    // $ANTLR start "ruleFileName"
    // InternalXemfs.g:322:1: ruleFileName : ( ruleResourceName ) ;
    public final void ruleFileName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:326:2: ( ( ruleResourceName ) )
            // InternalXemfs.g:327:1: ( ruleResourceName )
            {
            // InternalXemfs.g:327:1: ( ruleResourceName )
            // InternalXemfs.g:328:1: ruleResourceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileNameAccess().getResourceNameParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleResourceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileNameAccess().getResourceNameParserRuleCall()); 
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
    // $ANTLR end "ruleFileName"


    // $ANTLR start "entryRuleEmfsFile"
    // InternalXemfs.g:341:1: entryRuleEmfsFile : ruleEmfsFile EOF ;
    public final void entryRuleEmfsFile() throws RecognitionException {
        try {
            // InternalXemfs.g:342:1: ( ruleEmfsFile EOF )
            // InternalXemfs.g:343:1: ruleEmfsFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEmfsFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEmfsFile"


    // $ANTLR start "ruleEmfsFile"
    // InternalXemfs.g:350:1: ruleEmfsFile : ( ( rule__EmfsFile__Group__0 ) ) ;
    public final void ruleEmfsFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:354:2: ( ( ( rule__EmfsFile__Group__0 ) ) )
            // InternalXemfs.g:355:1: ( ( rule__EmfsFile__Group__0 ) )
            {
            // InternalXemfs.g:355:1: ( ( rule__EmfsFile__Group__0 ) )
            // InternalXemfs.g:356:1: ( rule__EmfsFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getGroup()); 
            }
            // InternalXemfs.g:357:1: ( rule__EmfsFile__Group__0 )
            // InternalXemfs.g:357:2: rule__EmfsFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getGroup()); 
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
    // $ANTLR end "ruleEmfsFile"


    // $ANTLR start "entryRuleStringContentProvider"
    // InternalXemfs.g:369:1: entryRuleStringContentProvider : ruleStringContentProvider EOF ;
    public final void entryRuleStringContentProvider() throws RecognitionException {
        try {
            // InternalXemfs.g:370:1: ( ruleStringContentProvider EOF )
            // InternalXemfs.g:371:1: ruleStringContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringContentProvider"


    // $ANTLR start "ruleStringContentProvider"
    // InternalXemfs.g:378:1: ruleStringContentProvider : ( ( ( rule__StringContentProvider__StringContentsAssignment ) ) ( ( rule__StringContentProvider__StringContentsAssignment )* ) ) ;
    public final void ruleStringContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:382:2: ( ( ( ( rule__StringContentProvider__StringContentsAssignment ) ) ( ( rule__StringContentProvider__StringContentsAssignment )* ) ) )
            // InternalXemfs.g:383:1: ( ( ( rule__StringContentProvider__StringContentsAssignment ) ) ( ( rule__StringContentProvider__StringContentsAssignment )* ) )
            {
            // InternalXemfs.g:383:1: ( ( ( rule__StringContentProvider__StringContentsAssignment ) ) ( ( rule__StringContentProvider__StringContentsAssignment )* ) )
            // InternalXemfs.g:384:1: ( ( rule__StringContentProvider__StringContentsAssignment ) ) ( ( rule__StringContentProvider__StringContentsAssignment )* )
            {
            // InternalXemfs.g:384:1: ( ( rule__StringContentProvider__StringContentsAssignment ) )
            // InternalXemfs.g:385:1: ( rule__StringContentProvider__StringContentsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringContentProviderAccess().getStringContentsAssignment()); 
            }
            // InternalXemfs.g:386:1: ( rule__StringContentProvider__StringContentsAssignment )
            // InternalXemfs.g:386:2: rule__StringContentProvider__StringContentsAssignment
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__StringContentProvider__StringContentsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringContentProviderAccess().getStringContentsAssignment()); 
            }

            }

            // InternalXemfs.g:389:1: ( ( rule__StringContentProvider__StringContentsAssignment )* )
            // InternalXemfs.g:390:1: ( rule__StringContentProvider__StringContentsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringContentProviderAccess().getStringContentsAssignment()); 
            }
            // InternalXemfs.g:391:1: ( rule__StringContentProvider__StringContentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_STRING_CONTENT)||LA1_0==40||LA1_0==44||LA1_0==55) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXemfs.g:391:2: rule__StringContentProvider__StringContentsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__StringContentProvider__StringContentsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringContentProviderAccess().getStringContentsAssignment()); 
            }

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
    // $ANTLR end "ruleStringContentProvider"


    // $ANTLR start "entryRuleAbstractStringContents"
    // InternalXemfs.g:404:1: entryRuleAbstractStringContents : ruleAbstractStringContents EOF ;
    public final void entryRuleAbstractStringContents() throws RecognitionException {
        try {
            // InternalXemfs.g:405:1: ( ruleAbstractStringContents EOF )
            // InternalXemfs.g:406:1: ruleAbstractStringContents EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractStringContentsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAbstractStringContents"


    // $ANTLR start "ruleAbstractStringContents"
    // InternalXemfs.g:413:1: ruleAbstractStringContents : ( ( rule__AbstractStringContents__Alternatives ) ) ;
    public final void ruleAbstractStringContents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:417:2: ( ( ( rule__AbstractStringContents__Alternatives ) ) )
            // InternalXemfs.g:418:1: ( ( rule__AbstractStringContents__Alternatives ) )
            {
            // InternalXemfs.g:418:1: ( ( rule__AbstractStringContents__Alternatives ) )
            // InternalXemfs.g:419:1: ( rule__AbstractStringContents__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractStringContentsAccess().getAlternatives()); 
            }
            // InternalXemfs.g:420:1: ( rule__AbstractStringContents__Alternatives )
            // InternalXemfs.g:420:2: rule__AbstractStringContents__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AbstractStringContents__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractStringContentsAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAbstractStringContents"


    // $ANTLR start "entryRuleVerbatimStringContents"
    // InternalXemfs.g:432:1: entryRuleVerbatimStringContents : ruleVerbatimStringContents EOF ;
    public final void entryRuleVerbatimStringContents() throws RecognitionException {
        try {
            // InternalXemfs.g:433:1: ( ruleVerbatimStringContents EOF )
            // InternalXemfs.g:434:1: ruleVerbatimStringContents EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVerbatimStringContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVerbatimStringContents"


    // $ANTLR start "ruleVerbatimStringContents"
    // InternalXemfs.g:441:1: ruleVerbatimStringContents : ( ( rule__VerbatimStringContents__Group__0 ) ) ;
    public final void ruleVerbatimStringContents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:445:2: ( ( ( rule__VerbatimStringContents__Group__0 ) ) )
            // InternalXemfs.g:446:1: ( ( rule__VerbatimStringContents__Group__0 ) )
            {
            // InternalXemfs.g:446:1: ( ( rule__VerbatimStringContents__Group__0 ) )
            // InternalXemfs.g:447:1: ( rule__VerbatimStringContents__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getGroup()); 
            }
            // InternalXemfs.g:448:1: ( rule__VerbatimStringContents__Group__0 )
            // InternalXemfs.g:448:2: rule__VerbatimStringContents__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getGroup()); 
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
    // $ANTLR end "ruleVerbatimStringContents"


    // $ANTLR start "entryRulePropertyValueString"
    // InternalXemfs.g:460:1: entryRulePropertyValueString : rulePropertyValueString EOF ;
    public final void entryRulePropertyValueString() throws RecognitionException {
        try {
            // InternalXemfs.g:461:1: ( rulePropertyValueString EOF )
            // InternalXemfs.g:462:1: rulePropertyValueString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePropertyValueString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertyValueString"


    // $ANTLR start "rulePropertyValueString"
    // InternalXemfs.g:469:1: rulePropertyValueString : ( ( rule__PropertyValueString__Group__0 ) ) ;
    public final void rulePropertyValueString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:473:2: ( ( ( rule__PropertyValueString__Group__0 ) ) )
            // InternalXemfs.g:474:1: ( ( rule__PropertyValueString__Group__0 ) )
            {
            // InternalXemfs.g:474:1: ( ( rule__PropertyValueString__Group__0 ) )
            // InternalXemfs.g:475:1: ( rule__PropertyValueString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getGroup()); 
            }
            // InternalXemfs.g:476:1: ( rule__PropertyValueString__Group__0 )
            // InternalXemfs.g:476:2: rule__PropertyValueString__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getGroup()); 
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
    // $ANTLR end "rulePropertyValueString"


    // $ANTLR start "entryRuleWrappingStringContentProvider"
    // InternalXemfs.g:488:1: entryRuleWrappingStringContentProvider : ruleWrappingStringContentProvider EOF ;
    public final void entryRuleWrappingStringContentProvider() throws RecognitionException {
        try {
            // InternalXemfs.g:489:1: ( ruleWrappingStringContentProvider EOF )
            // InternalXemfs.g:490:1: ruleWrappingStringContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleWrappingStringContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWrappingStringContentProvider"


    // $ANTLR start "ruleWrappingStringContentProvider"
    // InternalXemfs.g:497:1: ruleWrappingStringContentProvider : ( ( rule__WrappingStringContentProvider__Group__0 ) ) ;
    public final void ruleWrappingStringContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:501:2: ( ( ( rule__WrappingStringContentProvider__Group__0 ) ) )
            // InternalXemfs.g:502:1: ( ( rule__WrappingStringContentProvider__Group__0 ) )
            {
            // InternalXemfs.g:502:1: ( ( rule__WrappingStringContentProvider__Group__0 ) )
            // InternalXemfs.g:503:1: ( rule__WrappingStringContentProvider__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getGroup()); 
            }
            // InternalXemfs.g:504:1: ( rule__WrappingStringContentProvider__Group__0 )
            // InternalXemfs.g:504:2: rule__WrappingStringContentProvider__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getGroup()); 
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
    // $ANTLR end "ruleWrappingStringContentProvider"


    // $ANTLR start "entryRulePROPERTY_REF"
    // InternalXemfs.g:516:1: entryRulePROPERTY_REF : rulePROPERTY_REF EOF ;
    public final void entryRulePROPERTY_REF() throws RecognitionException {
        try {
            // InternalXemfs.g:517:1: ( rulePROPERTY_REF EOF )
            // InternalXemfs.g:518:1: rulePROPERTY_REF EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePROPERTY_REF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPROPERTY_REFRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePROPERTY_REF"


    // $ANTLR start "rulePROPERTY_REF"
    // InternalXemfs.g:525:1: rulePROPERTY_REF : ( ( rule__PROPERTY_REF__Group__0 ) ) ;
    public final void rulePROPERTY_REF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:529:2: ( ( ( rule__PROPERTY_REF__Group__0 ) ) )
            // InternalXemfs.g:530:1: ( ( rule__PROPERTY_REF__Group__0 ) )
            {
            // InternalXemfs.g:530:1: ( ( rule__PROPERTY_REF__Group__0 ) )
            // InternalXemfs.g:531:1: ( rule__PROPERTY_REF__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getGroup()); 
            }
            // InternalXemfs.g:532:1: ( rule__PROPERTY_REF__Group__0 )
            // InternalXemfs.g:532:2: rule__PROPERTY_REF__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PROPERTY_REF__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPROPERTY_REFAccess().getGroup()); 
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
    // $ANTLR end "rulePROPERTY_REF"


    // $ANTLR start "entryRuleURL_SCHEME"
    // InternalXemfs.g:544:1: entryRuleURL_SCHEME : ruleURL_SCHEME EOF ;
    public final void entryRuleURL_SCHEME() throws RecognitionException {
        try {
            // InternalXemfs.g:545:1: ( ruleURL_SCHEME EOF )
            // InternalXemfs.g:546:1: ruleURL_SCHEME EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_SCHEMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleURL_SCHEME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_SCHEMERule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleURL_SCHEME"


    // $ANTLR start "ruleURL_SCHEME"
    // InternalXemfs.g:553:1: ruleURL_SCHEME : ( ( rule__URL_SCHEME__Alternatives ) ) ;
    public final void ruleURL_SCHEME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:557:2: ( ( ( rule__URL_SCHEME__Alternatives ) ) )
            // InternalXemfs.g:558:1: ( ( rule__URL_SCHEME__Alternatives ) )
            {
            // InternalXemfs.g:558:1: ( ( rule__URL_SCHEME__Alternatives ) )
            // InternalXemfs.g:559:1: ( rule__URL_SCHEME__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_SCHEMEAccess().getAlternatives()); 
            }
            // InternalXemfs.g:560:1: ( rule__URL_SCHEME__Alternatives )
            // InternalXemfs.g:560:2: rule__URL_SCHEME__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_SCHEME__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_SCHEMEAccess().getAlternatives()); 
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
    // $ANTLR end "ruleURL_SCHEME"


    // $ANTLR start "entryRuleURL_HOST_NAME"
    // InternalXemfs.g:572:1: entryRuleURL_HOST_NAME : ruleURL_HOST_NAME EOF ;
    public final void entryRuleURL_HOST_NAME() throws RecognitionException {
        try {
            // InternalXemfs.g:573:1: ( ruleURL_HOST_NAME EOF )
            // InternalXemfs.g:574:1: ruleURL_HOST_NAME EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleURL_HOST_NAME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOST_NAMERule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleURL_HOST_NAME"


    // $ANTLR start "ruleURL_HOST_NAME"
    // InternalXemfs.g:581:1: ruleURL_HOST_NAME : ( ( rule__URL_HOST_NAME__Group__0 ) ) ;
    public final void ruleURL_HOST_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:585:2: ( ( ( rule__URL_HOST_NAME__Group__0 ) ) )
            // InternalXemfs.g:586:1: ( ( rule__URL_HOST_NAME__Group__0 ) )
            {
            // InternalXemfs.g:586:1: ( ( rule__URL_HOST_NAME__Group__0 ) )
            // InternalXemfs.g:587:1: ( rule__URL_HOST_NAME__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getGroup()); 
            }
            // InternalXemfs.g:588:1: ( rule__URL_HOST_NAME__Group__0 )
            // InternalXemfs.g:588:2: rule__URL_HOST_NAME__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST_NAME__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOST_NAMEAccess().getGroup()); 
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
    // $ANTLR end "ruleURL_HOST_NAME"


    // $ANTLR start "entryRuleURL_HOST"
    // InternalXemfs.g:600:1: entryRuleURL_HOST : ruleURL_HOST EOF ;
    public final void entryRuleURL_HOST() throws RecognitionException {
        try {
            // InternalXemfs.g:601:1: ( ruleURL_HOST EOF )
            // InternalXemfs.g:602:1: ruleURL_HOST EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleURL_HOST();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleURL_HOST"


    // $ANTLR start "ruleURL_HOST"
    // InternalXemfs.g:609:1: ruleURL_HOST : ( ( rule__URL_HOST__Group__0 ) ) ;
    public final void ruleURL_HOST() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:613:2: ( ( ( rule__URL_HOST__Group__0 ) ) )
            // InternalXemfs.g:614:1: ( ( rule__URL_HOST__Group__0 ) )
            {
            // InternalXemfs.g:614:1: ( ( rule__URL_HOST__Group__0 ) )
            // InternalXemfs.g:615:1: ( rule__URL_HOST__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getGroup()); 
            }
            // InternalXemfs.g:616:1: ( rule__URL_HOST__Group__0 )
            // InternalXemfs.g:616:2: rule__URL_HOST__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getGroup()); 
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
    // $ANTLR end "ruleURL_HOST"


    // $ANTLR start "entryRuleURL_PATH"
    // InternalXemfs.g:628:1: entryRuleURL_PATH : ruleURL_PATH EOF ;
    public final void entryRuleURL_PATH() throws RecognitionException {
        try {
            // InternalXemfs.g:629:1: ( ruleURL_PATH EOF )
            // InternalXemfs.g:630:1: ruleURL_PATH EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleURL_PATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleURL_PATH"


    // $ANTLR start "ruleURL_PATH"
    // InternalXemfs.g:637:1: ruleURL_PATH : ( ( rule__URL_PATH__Group__0 ) ) ;
    public final void ruleURL_PATH() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:641:2: ( ( ( rule__URL_PATH__Group__0 ) ) )
            // InternalXemfs.g:642:1: ( ( rule__URL_PATH__Group__0 ) )
            {
            // InternalXemfs.g:642:1: ( ( rule__URL_PATH__Group__0 ) )
            // InternalXemfs.g:643:1: ( rule__URL_PATH__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getGroup()); 
            }
            // InternalXemfs.g:644:1: ( rule__URL_PATH__Group__0 )
            // InternalXemfs.g:644:2: rule__URL_PATH__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_PATH__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHAccess().getGroup()); 
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
    // $ANTLR end "ruleURL_PATH"


    // $ANTLR start "entryRuleURL"
    // InternalXemfs.g:656:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // InternalXemfs.g:657:1: ( ruleURL EOF )
            // InternalXemfs.g:658:1: ruleURL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleURL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalXemfs.g:665:1: ruleURL : ( ( rule__URL__Group__0 ) ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:669:2: ( ( ( rule__URL__Group__0 ) ) )
            // InternalXemfs.g:670:1: ( ( rule__URL__Group__0 ) )
            {
            // InternalXemfs.g:670:1: ( ( rule__URL__Group__0 ) )
            // InternalXemfs.g:671:1: ( rule__URL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getGroup()); 
            }
            // InternalXemfs.g:672:1: ( rule__URL__Group__0 )
            // InternalXemfs.g:672:2: rule__URL__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLAccess().getGroup()); 
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
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleURLContentProvider"
    // InternalXemfs.g:684:1: entryRuleURLContentProvider : ruleURLContentProvider EOF ;
    public final void entryRuleURLContentProvider() throws RecognitionException {
        try {
            // InternalXemfs.g:685:1: ( ruleURLContentProvider EOF )
            // InternalXemfs.g:686:1: ruleURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleURLContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleURLContentProvider"


    // $ANTLR start "ruleURLContentProvider"
    // InternalXemfs.g:693:1: ruleURLContentProvider : ( ( rule__URLContentProvider__UrlStringAssignment ) ) ;
    public final void ruleURLContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:697:2: ( ( ( rule__URLContentProvider__UrlStringAssignment ) ) )
            // InternalXemfs.g:698:1: ( ( rule__URLContentProvider__UrlStringAssignment ) )
            {
            // InternalXemfs.g:698:1: ( ( rule__URLContentProvider__UrlStringAssignment ) )
            // InternalXemfs.g:699:1: ( rule__URLContentProvider__UrlStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLContentProviderAccess().getUrlStringAssignment()); 
            }
            // InternalXemfs.g:700:1: ( rule__URLContentProvider__UrlStringAssignment )
            // InternalXemfs.g:700:2: rule__URLContentProvider__UrlStringAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URLContentProvider__UrlStringAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLContentProviderAccess().getUrlStringAssignment()); 
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
    // $ANTLR end "ruleURLContentProvider"


    // $ANTLR start "entryRuleGitURLContentProvider"
    // InternalXemfs.g:712:1: entryRuleGitURLContentProvider : ruleGitURLContentProvider EOF ;
    public final void entryRuleGitURLContentProvider() throws RecognitionException {
        try {
            // InternalXemfs.g:713:1: ( ruleGitURLContentProvider EOF )
            // InternalXemfs.g:714:1: ruleGitURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGitURLContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitURLContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGitURLContentProvider"


    // $ANTLR start "ruleGitURLContentProvider"
    // InternalXemfs.g:721:1: ruleGitURLContentProvider : ( ( rule__GitURLContentProvider__GitRefAssignment ) ) ;
    public final void ruleGitURLContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:725:2: ( ( ( rule__GitURLContentProvider__GitRefAssignment ) ) )
            // InternalXemfs.g:726:1: ( ( rule__GitURLContentProvider__GitRefAssignment ) )
            {
            // InternalXemfs.g:726:1: ( ( rule__GitURLContentProvider__GitRefAssignment ) )
            // InternalXemfs.g:727:1: ( rule__GitURLContentProvider__GitRefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitURLContentProviderAccess().getGitRefAssignment()); 
            }
            // InternalXemfs.g:728:1: ( rule__GitURLContentProvider__GitRefAssignment )
            // InternalXemfs.g:728:2: rule__GitURLContentProvider__GitRefAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitURLContentProvider__GitRefAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitURLContentProviderAccess().getGitRefAssignment()); 
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
    // $ANTLR end "ruleGitURLContentProvider"


    // $ANTLR start "entryRuleGitContentRef"
    // InternalXemfs.g:740:1: entryRuleGitContentRef : ruleGitContentRef EOF ;
    public final void entryRuleGitContentRef() throws RecognitionException {
        try {
            // InternalXemfs.g:741:1: ( ruleGitContentRef EOF )
            // InternalXemfs.g:742:1: ruleGitContentRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGitContentRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGitContentRef"


    // $ANTLR start "ruleGitContentRef"
    // InternalXemfs.g:749:1: ruleGitContentRef : ( ( rule__GitContentRef__Group__0 ) ) ;
    public final void ruleGitContentRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:753:2: ( ( ( rule__GitContentRef__Group__0 ) ) )
            // InternalXemfs.g:754:1: ( ( rule__GitContentRef__Group__0 ) )
            {
            // InternalXemfs.g:754:1: ( ( rule__GitContentRef__Group__0 ) )
            // InternalXemfs.g:755:1: ( rule__GitContentRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getGroup()); 
            }
            // InternalXemfs.g:756:1: ( rule__GitContentRef__Group__0 )
            // InternalXemfs.g:756:2: rule__GitContentRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getGroup()); 
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
    // $ANTLR end "ruleGitContentRef"


    // $ANTLR start "entryRuleDotClasspathFileContentProvider"
    // InternalXemfs.g:768:1: entryRuleDotClasspathFileContentProvider : ruleDotClasspathFileContentProvider EOF ;
    public final void entryRuleDotClasspathFileContentProvider() throws RecognitionException {
        try {
            // InternalXemfs.g:769:1: ( ruleDotClasspathFileContentProvider EOF )
            // InternalXemfs.g:770:1: ruleDotClasspathFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDotClasspathFileContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDotClasspathFileContentProvider"


    // $ANTLR start "ruleDotClasspathFileContentProvider"
    // InternalXemfs.g:777:1: ruleDotClasspathFileContentProvider : ( ( rule__DotClasspathFileContentProvider__Group__0 ) ) ;
    public final void ruleDotClasspathFileContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:781:2: ( ( ( rule__DotClasspathFileContentProvider__Group__0 ) ) )
            // InternalXemfs.g:782:1: ( ( rule__DotClasspathFileContentProvider__Group__0 ) )
            {
            // InternalXemfs.g:782:1: ( ( rule__DotClasspathFileContentProvider__Group__0 ) )
            // InternalXemfs.g:783:1: ( rule__DotClasspathFileContentProvider__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getGroup()); 
            }
            // InternalXemfs.g:784:1: ( rule__DotClasspathFileContentProvider__Group__0 )
            // InternalXemfs.g:784:2: rule__DotClasspathFileContentProvider__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotClasspathFileContentProvider__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderAccess().getGroup()); 
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
    // $ANTLR end "ruleDotClasspathFileContentProvider"


    // $ANTLR start "entryRuleAbstractClasspathEntry"
    // InternalXemfs.g:796:1: entryRuleAbstractClasspathEntry : ruleAbstractClasspathEntry EOF ;
    public final void entryRuleAbstractClasspathEntry() throws RecognitionException {
        try {
            // InternalXemfs.g:797:1: ( ruleAbstractClasspathEntry EOF )
            // InternalXemfs.g:798:1: ruleAbstractClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAbstractClasspathEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractClasspathEntryRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAbstractClasspathEntry"


    // $ANTLR start "ruleAbstractClasspathEntry"
    // InternalXemfs.g:805:1: ruleAbstractClasspathEntry : ( ruleClasspathEntry ) ;
    public final void ruleAbstractClasspathEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:809:2: ( ( ruleClasspathEntry ) )
            // InternalXemfs.g:810:1: ( ruleClasspathEntry )
            {
            // InternalXemfs.g:810:1: ( ruleClasspathEntry )
            // InternalXemfs.g:811:1: ruleClasspathEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractClasspathEntryAccess().getClasspathEntryParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleClasspathEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractClasspathEntryAccess().getClasspathEntryParserRuleCall()); 
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
    // $ANTLR end "ruleAbstractClasspathEntry"


    // $ANTLR start "entryRuleCLASSPATH_ENTRY_PATH"
    // InternalXemfs.g:824:1: entryRuleCLASSPATH_ENTRY_PATH : ruleCLASSPATH_ENTRY_PATH EOF ;
    public final void entryRuleCLASSPATH_ENTRY_PATH() throws RecognitionException {
        try {
            // InternalXemfs.g:825:1: ( ruleCLASSPATH_ENTRY_PATH EOF )
            // InternalXemfs.g:826:1: ruleCLASSPATH_ENTRY_PATH EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCLASSPATH_ENTRY_PATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLASSPATH_ENTRY_PATHRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCLASSPATH_ENTRY_PATH"


    // $ANTLR start "ruleCLASSPATH_ENTRY_PATH"
    // InternalXemfs.g:833:1: ruleCLASSPATH_ENTRY_PATH : ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) ) ;
    public final void ruleCLASSPATH_ENTRY_PATH() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:837:2: ( ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) ) )
            // InternalXemfs.g:838:1: ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) )
            {
            // InternalXemfs.g:838:1: ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) )
            // InternalXemfs.g:839:1: ( rule__CLASSPATH_ENTRY_PATH__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getGroup()); 
            }
            // InternalXemfs.g:840:1: ( rule__CLASSPATH_ENTRY_PATH__Group__0 )
            // InternalXemfs.g:840:2: rule__CLASSPATH_ENTRY_PATH__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CLASSPATH_ENTRY_PATH__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getGroup()); 
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
    // $ANTLR end "ruleCLASSPATH_ENTRY_PATH"


    // $ANTLR start "entryRuleClasspathEntry"
    // InternalXemfs.g:852:1: entryRuleClasspathEntry : ruleClasspathEntry EOF ;
    public final void entryRuleClasspathEntry() throws RecognitionException {
        try {
            // InternalXemfs.g:853:1: ( ruleClasspathEntry EOF )
            // InternalXemfs.g:854:1: ruleClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleClasspathEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClasspathEntry"


    // $ANTLR start "ruleClasspathEntry"
    // InternalXemfs.g:861:1: ruleClasspathEntry : ( ( rule__ClasspathEntry__Group__0 ) ) ;
    public final void ruleClasspathEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:865:2: ( ( ( rule__ClasspathEntry__Group__0 ) ) )
            // InternalXemfs.g:866:1: ( ( rule__ClasspathEntry__Group__0 ) )
            {
            // InternalXemfs.g:866:1: ( ( rule__ClasspathEntry__Group__0 ) )
            // InternalXemfs.g:867:1: ( rule__ClasspathEntry__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getGroup()); 
            }
            // InternalXemfs.g:868:1: ( rule__ClasspathEntry__Group__0 )
            // InternalXemfs.g:868:2: rule__ClasspathEntry__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getGroup()); 
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
    // $ANTLR end "ruleClasspathEntry"


    // $ANTLR start "entryRuleVERSION"
    // InternalXemfs.g:880:1: entryRuleVERSION : ruleVERSION EOF ;
    public final void entryRuleVERSION() throws RecognitionException {
        try {
            // InternalXemfs.g:881:1: ( ruleVERSION EOF )
            // InternalXemfs.g:882:1: ruleVERSION EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVERSIONRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVERSION();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVERSIONRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVERSION"


    // $ANTLR start "ruleVERSION"
    // InternalXemfs.g:889:1: ruleVERSION : ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) ) ;
    public final void ruleVERSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:893:2: ( ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) ) )
            // InternalXemfs.g:894:1: ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) )
            {
            // InternalXemfs.g:894:1: ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) )
            // InternalXemfs.g:895:1: ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* )
            {
            // InternalXemfs.g:895:1: ( ( rule__VERSION__Alternatives ) )
            // InternalXemfs.g:896:1: ( rule__VERSION__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVERSIONAccess().getAlternatives()); 
            }
            // InternalXemfs.g:897:1: ( rule__VERSION__Alternatives )
            // InternalXemfs.g:897:2: rule__VERSION__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__VERSION__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVERSIONAccess().getAlternatives()); 
            }

            }

            // InternalXemfs.g:900:1: ( ( rule__VERSION__Alternatives )* )
            // InternalXemfs.g:901:1: ( rule__VERSION__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVERSIONAccess().getAlternatives()); 
            }
            // InternalXemfs.g:902:1: ( rule__VERSION__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=23)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXemfs.g:902:2: rule__VERSION__Alternatives
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__VERSION__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVERSIONAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleVERSION"


    // $ANTLR start "entryRuleDotProjectFileContentProvider"
    // InternalXemfs.g:915:1: entryRuleDotProjectFileContentProvider : ruleDotProjectFileContentProvider EOF ;
    public final void entryRuleDotProjectFileContentProvider() throws RecognitionException {
        try {
            // InternalXemfs.g:916:1: ( ruleDotProjectFileContentProvider EOF )
            // InternalXemfs.g:917:1: ruleDotProjectFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDotProjectFileContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDotProjectFileContentProvider"


    // $ANTLR start "ruleDotProjectFileContentProvider"
    // InternalXemfs.g:924:1: ruleDotProjectFileContentProvider : ( ( rule__DotProjectFileContentProvider__Group__0 ) ) ;
    public final void ruleDotProjectFileContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:928:2: ( ( ( rule__DotProjectFileContentProvider__Group__0 ) ) )
            // InternalXemfs.g:929:1: ( ( rule__DotProjectFileContentProvider__Group__0 ) )
            {
            // InternalXemfs.g:929:1: ( ( rule__DotProjectFileContentProvider__Group__0 ) )
            // InternalXemfs.g:930:1: ( rule__DotProjectFileContentProvider__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup()); 
            }
            // InternalXemfs.g:931:1: ( rule__DotProjectFileContentProvider__Group__0 )
            // InternalXemfs.g:931:2: rule__DotProjectFileContentProvider__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getGroup()); 
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
    // $ANTLR end "ruleDotProjectFileContentProvider"


    // $ANTLR start "entryRuleXmlStringContents"
    // InternalXemfs.g:943:1: entryRuleXmlStringContents : ruleXmlStringContents EOF ;
    public final void entryRuleXmlStringContents() throws RecognitionException {
        try {
            // InternalXemfs.g:944:1: ( ruleXmlStringContents EOF )
            // InternalXemfs.g:945:1: ruleXmlStringContents EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXmlStringContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlStringContentsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXmlStringContents"


    // $ANTLR start "ruleXmlStringContents"
    // InternalXemfs.g:952:1: ruleXmlStringContents : ( ( rule__XmlStringContents__Group__0 ) ) ;
    public final void ruleXmlStringContents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:956:2: ( ( ( rule__XmlStringContents__Group__0 ) ) )
            // InternalXemfs.g:957:1: ( ( rule__XmlStringContents__Group__0 ) )
            {
            // InternalXemfs.g:957:1: ( ( rule__XmlStringContents__Group__0 ) )
            // InternalXemfs.g:958:1: ( rule__XmlStringContents__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlStringContentsAccess().getGroup()); 
            }
            // InternalXemfs.g:959:1: ( rule__XmlStringContents__Group__0 )
            // InternalXemfs.g:959:2: rule__XmlStringContents__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlStringContents__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlStringContentsAccess().getGroup()); 
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
    // $ANTLR end "ruleXmlStringContents"


    // $ANTLR start "entryRuleXmlElement"
    // InternalXemfs.g:971:1: entryRuleXmlElement : ruleXmlElement EOF ;
    public final void entryRuleXmlElement() throws RecognitionException {
        try {
            // InternalXemfs.g:972:1: ( ruleXmlElement EOF )
            // InternalXemfs.g:973:1: ruleXmlElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXmlElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXmlElement"


    // $ANTLR start "ruleXmlElement"
    // InternalXemfs.g:980:1: ruleXmlElement : ( ( rule__XmlElement__Alternatives ) ) ;
    public final void ruleXmlElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:984:2: ( ( ( rule__XmlElement__Alternatives ) ) )
            // InternalXemfs.g:985:1: ( ( rule__XmlElement__Alternatives ) )
            {
            // InternalXemfs.g:985:1: ( ( rule__XmlElement__Alternatives ) )
            // InternalXemfs.g:986:1: ( rule__XmlElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlElementAccess().getAlternatives()); 
            }
            // InternalXemfs.g:987:1: ( rule__XmlElement__Alternatives )
            // InternalXemfs.g:987:2: rule__XmlElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleXmlElement"


    // $ANTLR start "entryRuleXmlPIElement"
    // InternalXemfs.g:999:1: entryRuleXmlPIElement : ruleXmlPIElement EOF ;
    public final void entryRuleXmlPIElement() throws RecognitionException {
        try {
            // InternalXemfs.g:1000:1: ( ruleXmlPIElement EOF )
            // InternalXemfs.g:1001:1: ruleXmlPIElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlPIElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXmlPIElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlPIElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXmlPIElement"


    // $ANTLR start "ruleXmlPIElement"
    // InternalXemfs.g:1008:1: ruleXmlPIElement : ( ( rule__XmlPIElement__Group__0 ) ) ;
    public final void ruleXmlPIElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1012:2: ( ( ( rule__XmlPIElement__Group__0 ) ) )
            // InternalXemfs.g:1013:1: ( ( rule__XmlPIElement__Group__0 ) )
            {
            // InternalXemfs.g:1013:1: ( ( rule__XmlPIElement__Group__0 ) )
            // InternalXemfs.g:1014:1: ( rule__XmlPIElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlPIElementAccess().getGroup()); 
            }
            // InternalXemfs.g:1015:1: ( rule__XmlPIElement__Group__0 )
            // InternalXemfs.g:1015:2: rule__XmlPIElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlPIElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlPIElementAccess().getGroup()); 
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
    // $ANTLR end "ruleXmlPIElement"


    // $ANTLR start "entryRuleXmlTagElement"
    // InternalXemfs.g:1027:1: entryRuleXmlTagElement : ruleXmlTagElement EOF ;
    public final void entryRuleXmlTagElement() throws RecognitionException {
        try {
            // InternalXemfs.g:1028:1: ( ruleXmlTagElement EOF )
            // InternalXemfs.g:1029:1: ruleXmlTagElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXmlTagElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXmlTagElement"


    // $ANTLR start "ruleXmlTagElement"
    // InternalXemfs.g:1036:1: ruleXmlTagElement : ( ( rule__XmlTagElement__Group__0 ) ) ;
    public final void ruleXmlTagElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1040:2: ( ( ( rule__XmlTagElement__Group__0 ) ) )
            // InternalXemfs.g:1041:1: ( ( rule__XmlTagElement__Group__0 ) )
            {
            // InternalXemfs.g:1041:1: ( ( rule__XmlTagElement__Group__0 ) )
            // InternalXemfs.g:1042:1: ( rule__XmlTagElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getGroup()); 
            }
            // InternalXemfs.g:1043:1: ( rule__XmlTagElement__Group__0 )
            // InternalXemfs.g:1043:2: rule__XmlTagElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getGroup()); 
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
    // $ANTLR end "ruleXmlTagElement"


    // $ANTLR start "entryRuleXmlTagName"
    // InternalXemfs.g:1055:1: entryRuleXmlTagName : ruleXmlTagName EOF ;
    public final void entryRuleXmlTagName() throws RecognitionException {
        try {
            // InternalXemfs.g:1056:1: ( ruleXmlTagName EOF )
            // InternalXemfs.g:1057:1: ruleXmlTagName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXmlTagName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXmlTagName"


    // $ANTLR start "ruleXmlTagName"
    // InternalXemfs.g:1064:1: ruleXmlTagName : ( ( rule__XmlTagName__Group__0 ) ) ;
    public final void ruleXmlTagName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1068:2: ( ( ( rule__XmlTagName__Group__0 ) ) )
            // InternalXemfs.g:1069:1: ( ( rule__XmlTagName__Group__0 ) )
            {
            // InternalXemfs.g:1069:1: ( ( rule__XmlTagName__Group__0 ) )
            // InternalXemfs.g:1070:1: ( rule__XmlTagName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagNameAccess().getGroup()); 
            }
            // InternalXemfs.g:1071:1: ( rule__XmlTagName__Group__0 )
            // InternalXemfs.g:1071:2: rule__XmlTagName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagNameAccess().getGroup()); 
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
    // $ANTLR end "ruleXmlTagName"


    // $ANTLR start "entryRuleXmlContents"
    // InternalXemfs.g:1083:1: entryRuleXmlContents : ruleXmlContents EOF ;
    public final void entryRuleXmlContents() throws RecognitionException {
        try {
            // InternalXemfs.g:1084:1: ( ruleXmlContents EOF )
            // InternalXemfs.g:1085:1: ruleXmlContents EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXmlContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlContentsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXmlContents"


    // $ANTLR start "ruleXmlContents"
    // InternalXemfs.g:1092:1: ruleXmlContents : ( ( rule__XmlContents__Group__0 ) ) ;
    public final void ruleXmlContents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1096:2: ( ( ( rule__XmlContents__Group__0 ) ) )
            // InternalXemfs.g:1097:1: ( ( rule__XmlContents__Group__0 ) )
            {
            // InternalXemfs.g:1097:1: ( ( rule__XmlContents__Group__0 ) )
            // InternalXemfs.g:1098:1: ( rule__XmlContents__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlContentsAccess().getGroup()); 
            }
            // InternalXemfs.g:1099:1: ( rule__XmlContents__Group__0 )
            // InternalXemfs.g:1099:2: rule__XmlContents__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlContents__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlContentsAccess().getGroup()); 
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
    // $ANTLR end "ruleXmlContents"


    // $ANTLR start "entryRuleXmlTag"
    // InternalXemfs.g:1111:1: entryRuleXmlTag : ruleXmlTag EOF ;
    public final void entryRuleXmlTag() throws RecognitionException {
        try {
            // InternalXemfs.g:1112:1: ( ruleXmlTag EOF )
            // InternalXemfs.g:1113:1: ruleXmlTag EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXmlTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXmlTag"


    // $ANTLR start "ruleXmlTag"
    // InternalXemfs.g:1120:1: ruleXmlTag : ( ( rule__XmlTag__Group__0 ) ) ;
    public final void ruleXmlTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1124:2: ( ( ( rule__XmlTag__Group__0 ) ) )
            // InternalXemfs.g:1125:1: ( ( rule__XmlTag__Group__0 ) )
            {
            // InternalXemfs.g:1125:1: ( ( rule__XmlTag__Group__0 ) )
            // InternalXemfs.g:1126:1: ( rule__XmlTag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagAccess().getGroup()); 
            }
            // InternalXemfs.g:1127:1: ( rule__XmlTag__Group__0 )
            // InternalXemfs.g:1127:2: rule__XmlTag__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTag__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagAccess().getGroup()); 
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
    // $ANTLR end "ruleXmlTag"


    // $ANTLR start "entryRuleXmlAttribute"
    // InternalXemfs.g:1139:1: entryRuleXmlAttribute : ruleXmlAttribute EOF ;
    public final void entryRuleXmlAttribute() throws RecognitionException {
        try {
            // InternalXemfs.g:1140:1: ( ruleXmlAttribute EOF )
            // InternalXemfs.g:1141:1: ruleXmlAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXmlAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlAttributeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXmlAttribute"


    // $ANTLR start "ruleXmlAttribute"
    // InternalXemfs.g:1148:1: ruleXmlAttribute : ( ( rule__XmlAttribute__Group__0 ) ) ;
    public final void ruleXmlAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1152:2: ( ( ( rule__XmlAttribute__Group__0 ) ) )
            // InternalXemfs.g:1153:1: ( ( rule__XmlAttribute__Group__0 ) )
            {
            // InternalXemfs.g:1153:1: ( ( rule__XmlAttribute__Group__0 ) )
            // InternalXemfs.g:1154:1: ( rule__XmlAttribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlAttributeAccess().getGroup()); 
            }
            // InternalXemfs.g:1155:1: ( rule__XmlAttribute__Group__0 )
            // InternalXemfs.g:1155:2: rule__XmlAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlAttribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlAttributeAccess().getGroup()); 
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
    // $ANTLR end "ruleXmlAttribute"


    // $ANTLR start "entryRuleXmlInt"
    // InternalXemfs.g:1167:1: entryRuleXmlInt : ruleXmlInt EOF ;
    public final void entryRuleXmlInt() throws RecognitionException {
        try {
            // InternalXemfs.g:1168:1: ( ruleXmlInt EOF )
            // InternalXemfs.g:1169:1: ruleXmlInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXmlInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXmlInt"


    // $ANTLR start "ruleXmlInt"
    // InternalXemfs.g:1176:1: ruleXmlInt : ( ( rule__XmlInt__Alternatives ) ) ;
    public final void ruleXmlInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1180:2: ( ( ( rule__XmlInt__Alternatives ) ) )
            // InternalXemfs.g:1181:1: ( ( rule__XmlInt__Alternatives ) )
            {
            // InternalXemfs.g:1181:1: ( ( rule__XmlInt__Alternatives ) )
            // InternalXemfs.g:1182:1: ( rule__XmlInt__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getAlternatives()); 
            }
            // InternalXemfs.g:1183:1: ( rule__XmlInt__Alternatives )
            // InternalXemfs.g:1183:2: rule__XmlInt__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getAlternatives()); 
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
    // $ANTLR end "ruleXmlInt"


    // $ANTLR start "ruleClasspathEntryKind"
    // InternalXemfs.g:1196:1: ruleClasspathEntryKind : ( ( rule__ClasspathEntryKind__Alternatives ) ) ;
    public final void ruleClasspathEntryKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1200:1: ( ( ( rule__ClasspathEntryKind__Alternatives ) ) )
            // InternalXemfs.g:1201:1: ( ( rule__ClasspathEntryKind__Alternatives ) )
            {
            // InternalXemfs.g:1201:1: ( ( rule__ClasspathEntryKind__Alternatives ) )
            // InternalXemfs.g:1202:1: ( rule__ClasspathEntryKind__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryKindAccess().getAlternatives()); 
            }
            // InternalXemfs.g:1203:1: ( rule__ClasspathEntryKind__Alternatives )
            // InternalXemfs.g:1203:2: rule__ClasspathEntryKind__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntryKind__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryKindAccess().getAlternatives()); 
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
    // $ANTLR end "ruleClasspathEntryKind"


    // $ANTLR start "rule__EmfsRoot__ContentProviderAlternatives_4_1_0"
    // InternalXemfs.g:1214:1: rule__EmfsRoot__ContentProviderAlternatives_4_1_0 : ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) );
    public final void rule__EmfsRoot__ContentProviderAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1218:1: ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==50) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXemfs.g:1219:1: ( ruleGitContentProvider )
                    {
                    // InternalXemfs.g:1219:1: ( ruleGitContentProvider )
                    // InternalXemfs.g:1220:1: ruleGitContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsRootAccess().getContentProviderGitContentProviderParserRuleCall_4_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGitContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsRootAccess().getContentProviderGitContentProviderParserRuleCall_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1225:6: ( ruleEmfsResourcesRef )
                    {
                    // InternalXemfs.g:1225:6: ( ruleEmfsResourcesRef )
                    // InternalXemfs.g:1226:1: ruleEmfsResourcesRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsRootAccess().getContentProviderEmfsResourcesRefParserRuleCall_4_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEmfsResourcesRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsRootAccess().getContentProviderEmfsResourcesRefParserRuleCall_4_1_0_1()); 
                    }

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
    // $ANTLR end "rule__EmfsRoot__ContentProviderAlternatives_4_1_0"


    // $ANTLR start "rule__EmfsResource__Alternatives"
    // InternalXemfs.g:1236:1: rule__EmfsResource__Alternatives : ( ( ruleEmfsContainer ) | ( ruleEmfsFile ) );
    public final void rule__EmfsResource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1240:1: ( ( ruleEmfsContainer ) | ( ruleEmfsFile ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalXemfs.g:1241:1: ( ruleEmfsContainer )
                    {
                    // InternalXemfs.g:1241:1: ( ruleEmfsContainer )
                    // InternalXemfs.g:1242:1: ruleEmfsContainer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsResourceAccess().getEmfsContainerParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEmfsContainer();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsResourceAccess().getEmfsContainerParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1247:6: ( ruleEmfsFile )
                    {
                    // InternalXemfs.g:1247:6: ( ruleEmfsFile )
                    // InternalXemfs.g:1248:1: ruleEmfsFile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsResourceAccess().getEmfsFileParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEmfsFile();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsResourceAccess().getEmfsFileParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__EmfsResource__Alternatives"


    // $ANTLR start "rule__Property__ValueAlternatives_3_0"
    // InternalXemfs.g:1258:1: rule__Property__ValueAlternatives_3_0 : ( ( RULE_STRING ) | ( ruleEmfsName ) );
    public final void rule__Property__ValueAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1262:1: ( ( RULE_STRING ) | ( ruleEmfsName ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXemfs.g:1263:1: ( RULE_STRING )
                    {
                    // InternalXemfs.g:1263:1: ( RULE_STRING )
                    // InternalXemfs.g:1264:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1269:6: ( ruleEmfsName )
                    {
                    // InternalXemfs.g:1269:6: ( ruleEmfsName )
                    // InternalXemfs.g:1270:1: ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getValueEmfsNameParserRuleCall_3_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEmfsName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getValueEmfsNameParserRuleCall_3_0_1()); 
                    }

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
    // $ANTLR end "rule__Property__ValueAlternatives_3_0"


    // $ANTLR start "rule__EmfsContainer__ContentProviderAlternatives_3_1_0"
    // InternalXemfs.g:1280:1: rule__EmfsContainer__ContentProviderAlternatives_3_1_0 : ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) );
    public final void rule__EmfsContainer__ContentProviderAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1284:1: ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==50) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXemfs.g:1285:1: ( ruleGitContentProvider )
                    {
                    // InternalXemfs.g:1285:1: ( ruleGitContentProvider )
                    // InternalXemfs.g:1286:1: ruleGitContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsContainerAccess().getContentProviderGitContentProviderParserRuleCall_3_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGitContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsContainerAccess().getContentProviderGitContentProviderParserRuleCall_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1291:6: ( ruleEmfsResourcesRef )
                    {
                    // InternalXemfs.g:1291:6: ( ruleEmfsResourcesRef )
                    // InternalXemfs.g:1292:1: ruleEmfsResourcesRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsContainerAccess().getContentProviderEmfsResourcesRefParserRuleCall_3_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEmfsResourcesRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsContainerAccess().getContentProviderEmfsResourcesRefParserRuleCall_3_1_0_1()); 
                    }

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
    // $ANTLR end "rule__EmfsContainer__ContentProviderAlternatives_3_1_0"


    // $ANTLR start "rule__EmfsFile__Alternatives_4"
    // InternalXemfs.g:1302:1: rule__EmfsFile__Alternatives_4 : ( ( ( rule__EmfsFile__Group_4_0__0 ) ) | ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) ) | ( ( rule__EmfsFile__Group_4_2__0 ) ) | ( ';' ) );
    public final void rule__EmfsFile__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1306:1: ( ( ( rule__EmfsFile__Group_4_0__0 ) ) | ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) ) | ( ( rule__EmfsFile__Group_4_2__0 ) ) | ( ';' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
            case RULE_STRING_CONTENT:
            case 40:
            case 44:
            case 47:
            case 55:
                {
                alt7=2;
                }
                break;
            case 43:
                {
                alt7=3;
                }
                break;
            case 9:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXemfs.g:1307:1: ( ( rule__EmfsFile__Group_4_0__0 ) )
                    {
                    // InternalXemfs.g:1307:1: ( ( rule__EmfsFile__Group_4_0__0 ) )
                    // InternalXemfs.g:1308:1: ( rule__EmfsFile__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getGroup_4_0()); 
                    }
                    // InternalXemfs.g:1309:1: ( rule__EmfsFile__Group_4_0__0 )
                    // InternalXemfs.g:1309:2: rule__EmfsFile__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EmfsFile__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsFileAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1313:6: ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) )
                    {
                    // InternalXemfs.g:1313:6: ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) )
                    // InternalXemfs.g:1314:1: ( rule__EmfsFile__ContentProviderAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_1()); 
                    }
                    // InternalXemfs.g:1315:1: ( rule__EmfsFile__ContentProviderAssignment_4_1 )
                    // InternalXemfs.g:1315:2: rule__EmfsFile__ContentProviderAssignment_4_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EmfsFile__ContentProviderAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:1319:6: ( ( rule__EmfsFile__Group_4_2__0 ) )
                    {
                    // InternalXemfs.g:1319:6: ( ( rule__EmfsFile__Group_4_2__0 ) )
                    // InternalXemfs.g:1320:1: ( rule__EmfsFile__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getGroup_4_2()); 
                    }
                    // InternalXemfs.g:1321:1: ( rule__EmfsFile__Group_4_2__0 )
                    // InternalXemfs.g:1321:2: rule__EmfsFile__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EmfsFile__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsFileAccess().getGroup_4_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXemfs.g:1325:6: ( ';' )
                    {
                    // InternalXemfs.g:1325:6: ( ';' )
                    // InternalXemfs.g:1326:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_3()); 
                    }
                    match(input,9,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_3()); 
                    }

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
    // $ANTLR end "rule__EmfsFile__Alternatives_4"


    // $ANTLR start "rule__EmfsFile__ContentProviderAlternatives_4_0_1_0"
    // InternalXemfs.g:1338:1: rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 : ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) );
    public final void rule__EmfsFile__ContentProviderAlternatives_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1342:1: ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING||(LA8_0>=10 && LA8_0<=13)) ) {
                alt8=1;
            }
            else if ( (LA8_0==50) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXemfs.g:1343:1: ( ruleURLContentProvider )
                    {
                    // InternalXemfs.g:1343:1: ( ruleURLContentProvider )
                    // InternalXemfs.g:1344:1: ruleURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderURLContentProviderParserRuleCall_4_0_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleURLContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsFileAccess().getContentProviderURLContentProviderParserRuleCall_4_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1349:6: ( ruleGitURLContentProvider )
                    {
                    // InternalXemfs.g:1349:6: ( ruleGitURLContentProvider )
                    // InternalXemfs.g:1350:1: ruleGitURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderGitURLContentProviderParserRuleCall_4_0_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGitURLContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsFileAccess().getContentProviderGitURLContentProviderParserRuleCall_4_0_1_0_1()); 
                    }

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
    // $ANTLR end "rule__EmfsFile__ContentProviderAlternatives_4_0_1_0"


    // $ANTLR start "rule__EmfsFile__ContentProviderAlternatives_4_1_0"
    // InternalXemfs.g:1360:1: rule__EmfsFile__ContentProviderAlternatives_4_1_0 : ( ( ruleStringContentProvider ) | ( ruleWrappingStringContentProvider ) );
    public final void rule__EmfsFile__ContentProviderAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1364:1: ( ( ruleStringContentProvider ) | ( ruleWrappingStringContentProvider ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_STRING_CONTENT)||LA9_0==40||LA9_0==44||LA9_0==55) ) {
                alt9=1;
            }
            else if ( (LA9_0==47) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXemfs.g:1365:1: ( ruleStringContentProvider )
                    {
                    // InternalXemfs.g:1365:1: ( ruleStringContentProvider )
                    // InternalXemfs.g:1366:1: ruleStringContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderStringContentProviderParserRuleCall_4_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleStringContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsFileAccess().getContentProviderStringContentProviderParserRuleCall_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1371:6: ( ruleWrappingStringContentProvider )
                    {
                    // InternalXemfs.g:1371:6: ( ruleWrappingStringContentProvider )
                    // InternalXemfs.g:1372:1: ruleWrappingStringContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderWrappingStringContentProviderParserRuleCall_4_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleWrappingStringContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsFileAccess().getContentProviderWrappingStringContentProviderParserRuleCall_4_1_0_1()); 
                    }

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
    // $ANTLR end "rule__EmfsFile__ContentProviderAlternatives_4_1_0"


    // $ANTLR start "rule__EmfsFile__ContentProviderAlternatives_4_2_1_0"
    // InternalXemfs.g:1382:1: rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 : ( ( ruleDotClasspathFileContentProvider ) | ( ruleDotProjectFileContentProvider ) );
    public final void rule__EmfsFile__ContentProviderAlternatives_4_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1386:1: ( ( ruleDotClasspathFileContentProvider ) | ( ruleDotProjectFileContentProvider ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            else if ( (LA10_0==54) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXemfs.g:1387:1: ( ruleDotClasspathFileContentProvider )
                    {
                    // InternalXemfs.g:1387:1: ( ruleDotClasspathFileContentProvider )
                    // InternalXemfs.g:1388:1: ruleDotClasspathFileContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderDotClasspathFileContentProviderParserRuleCall_4_2_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDotClasspathFileContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsFileAccess().getContentProviderDotClasspathFileContentProviderParserRuleCall_4_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1393:6: ( ruleDotProjectFileContentProvider )
                    {
                    // InternalXemfs.g:1393:6: ( ruleDotProjectFileContentProvider )
                    // InternalXemfs.g:1394:1: ruleDotProjectFileContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderDotProjectFileContentProviderParserRuleCall_4_2_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDotProjectFileContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsFileAccess().getContentProviderDotProjectFileContentProviderParserRuleCall_4_2_1_0_1()); 
                    }

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
    // $ANTLR end "rule__EmfsFile__ContentProviderAlternatives_4_2_1_0"


    // $ANTLR start "rule__AbstractStringContents__Alternatives"
    // InternalXemfs.g:1404:1: rule__AbstractStringContents__Alternatives : ( ( rulePropertyValueString ) | ( ruleVerbatimStringContents ) | ( ruleXmlStringContents ) );
    public final void rule__AbstractStringContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1408:1: ( ( rulePropertyValueString ) | ( ruleVerbatimStringContents ) | ( ruleXmlStringContents ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
            case RULE_STRING_CONTENT:
            case 44:
                {
                alt11=2;
                }
                break;
            case 55:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXemfs.g:1409:1: ( rulePropertyValueString )
                    {
                    // InternalXemfs.g:1409:1: ( rulePropertyValueString )
                    // InternalXemfs.g:1410:1: rulePropertyValueString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractStringContentsAccess().getPropertyValueStringParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePropertyValueString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractStringContentsAccess().getPropertyValueStringParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1415:6: ( ruleVerbatimStringContents )
                    {
                    // InternalXemfs.g:1415:6: ( ruleVerbatimStringContents )
                    // InternalXemfs.g:1416:1: ruleVerbatimStringContents
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractStringContentsAccess().getVerbatimStringContentsParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleVerbatimStringContents();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractStringContentsAccess().getVerbatimStringContentsParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:1421:6: ( ruleXmlStringContents )
                    {
                    // InternalXemfs.g:1421:6: ( ruleXmlStringContents )
                    // InternalXemfs.g:1422:1: ruleXmlStringContents
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractStringContentsAccess().getXmlStringContentsParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleXmlStringContents();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractStringContentsAccess().getXmlStringContentsParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__AbstractStringContents__Alternatives"


    // $ANTLR start "rule__VerbatimStringContents__StringContentAlternatives_1_0"
    // InternalXemfs.g:1432:1: rule__VerbatimStringContents__StringContentAlternatives_1_0 : ( ( RULE_STRING ) | ( RULE_STRING_CONTENT ) );
    public final void rule__VerbatimStringContents__StringContentAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1436:1: ( ( RULE_STRING ) | ( RULE_STRING_CONTENT ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING_CONTENT) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalXemfs.g:1437:1: ( RULE_STRING )
                    {
                    // InternalXemfs.g:1437:1: ( RULE_STRING )
                    // InternalXemfs.g:1438:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRINGTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRINGTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1443:6: ( RULE_STRING_CONTENT )
                    {
                    // InternalXemfs.g:1443:6: ( RULE_STRING_CONTENT )
                    // InternalXemfs.g:1444:1: RULE_STRING_CONTENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRING_CONTENTTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_STRING_CONTENT,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRING_CONTENTTerminalRuleCall_1_0_1()); 
                    }

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
    // $ANTLR end "rule__VerbatimStringContents__StringContentAlternatives_1_0"


    // $ANTLR start "rule__PropertyValueString__Alternatives_2"
    // InternalXemfs.g:1454:1: rule__PropertyValueString__Alternatives_2 : ( ( ( rule__PropertyValueString__PropertyNameAssignment_2_0 ) ) | ( ( rule__PropertyValueString__Group_2_1__0 ) ) );
    public final void rule__PropertyValueString__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1458:1: ( ( ( rule__PropertyValueString__PropertyNameAssignment_2_0 ) ) | ( ( rule__PropertyValueString__Group_2_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==45) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXemfs.g:1459:1: ( ( rule__PropertyValueString__PropertyNameAssignment_2_0 ) )
                    {
                    // InternalXemfs.g:1459:1: ( ( rule__PropertyValueString__PropertyNameAssignment_2_0 ) )
                    // InternalXemfs.g:1460:1: ( rule__PropertyValueString__PropertyNameAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getPropertyNameAssignment_2_0()); 
                    }
                    // InternalXemfs.g:1461:1: ( rule__PropertyValueString__PropertyNameAssignment_2_0 )
                    // InternalXemfs.g:1461:2: rule__PropertyValueString__PropertyNameAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PropertyValueString__PropertyNameAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueStringAccess().getPropertyNameAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1465:6: ( ( rule__PropertyValueString__Group_2_1__0 ) )
                    {
                    // InternalXemfs.g:1465:6: ( ( rule__PropertyValueString__Group_2_1__0 ) )
                    // InternalXemfs.g:1466:1: ( rule__PropertyValueString__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getGroup_2_1()); 
                    }
                    // InternalXemfs.g:1467:1: ( rule__PropertyValueString__Group_2_1__0 )
                    // InternalXemfs.g:1467:2: rule__PropertyValueString__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PropertyValueString__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueStringAccess().getGroup_2_1()); 
                    }

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
    // $ANTLR end "rule__PropertyValueString__Alternatives_2"


    // $ANTLR start "rule__PropertyValueString__DefaultValueAlternatives_3_1_0"
    // InternalXemfs.g:1476:1: rule__PropertyValueString__DefaultValueAlternatives_3_1_0 : ( ( RULE_STRING ) | ( ruleEmfsName ) );
    public final void rule__PropertyValueString__DefaultValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1480:1: ( ( RULE_STRING ) | ( ruleEmfsName ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXemfs.g:1481:1: ( RULE_STRING )
                    {
                    // InternalXemfs.g:1481:1: ( RULE_STRING )
                    // InternalXemfs.g:1482:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueStringAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1487:6: ( ruleEmfsName )
                    {
                    // InternalXemfs.g:1487:6: ( ruleEmfsName )
                    // InternalXemfs.g:1488:1: ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getDefaultValueEmfsNameParserRuleCall_3_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEmfsName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueStringAccess().getDefaultValueEmfsNameParserRuleCall_3_1_0_1()); 
                    }

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
    // $ANTLR end "rule__PropertyValueString__DefaultValueAlternatives_3_1_0"


    // $ANTLR start "rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0"
    // InternalXemfs.g:1498:1: rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 : ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) );
    public final void rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1502:1: ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING||(LA15_0>=10 && LA15_0<=13)) ) {
                alt15=1;
            }
            else if ( (LA15_0==50) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalXemfs.g:1503:1: ( ruleURLContentProvider )
                    {
                    // InternalXemfs.g:1503:1: ( ruleURLContentProvider )
                    // InternalXemfs.g:1504:1: ruleURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderURLContentProviderParserRuleCall_1_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleURLContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderURLContentProviderParserRuleCall_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1509:6: ( ruleGitURLContentProvider )
                    {
                    // InternalXemfs.g:1509:6: ( ruleGitURLContentProvider )
                    // InternalXemfs.g:1510:1: ruleGitURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderGitURLContentProviderParserRuleCall_1_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGitURLContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderGitURLContentProviderParserRuleCall_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0"


    // $ANTLR start "rule__PROPERTY_REF__Alternatives_1"
    // InternalXemfs.g:1520:1: rule__PROPERTY_REF__Alternatives_1 : ( ( ( rule__PROPERTY_REF__Group_1_0__0 ) ) | ( RULE_ID ) );
    public final void rule__PROPERTY_REF__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1524:1: ( ( ( rule__PROPERTY_REF__Group_1_0__0 ) ) | ( RULE_ID ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXemfs.g:1525:1: ( ( rule__PROPERTY_REF__Group_1_0__0 ) )
                    {
                    // InternalXemfs.g:1525:1: ( ( rule__PROPERTY_REF__Group_1_0__0 ) )
                    // InternalXemfs.g:1526:1: ( rule__PROPERTY_REF__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPROPERTY_REFAccess().getGroup_1_0()); 
                    }
                    // InternalXemfs.g:1527:1: ( rule__PROPERTY_REF__Group_1_0__0 )
                    // InternalXemfs.g:1527:2: rule__PROPERTY_REF__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PROPERTY_REF__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPROPERTY_REFAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1531:6: ( RULE_ID )
                    {
                    // InternalXemfs.g:1531:6: ( RULE_ID )
                    // InternalXemfs.g:1532:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPROPERTY_REFAccess().getIDTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPROPERTY_REFAccess().getIDTerminalRuleCall_1_1()); 
                    }

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
    // $ANTLR end "rule__PROPERTY_REF__Alternatives_1"


    // $ANTLR start "rule__URL_SCHEME__Alternatives"
    // InternalXemfs.g:1542:1: rule__URL_SCHEME__Alternatives : ( ( 'http' ) | ( 'https' ) | ( 'ftp' ) | ( 'file' ) );
    public final void rule__URL_SCHEME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1546:1: ( ( 'http' ) | ( 'https' ) | ( 'ftp' ) | ( 'file' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt17=1;
                }
                break;
            case 11:
                {
                alt17=2;
                }
                break;
            case 12:
                {
                alt17=3;
                }
                break;
            case 13:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalXemfs.g:1547:1: ( 'http' )
                    {
                    // InternalXemfs.g:1547:1: ( 'http' )
                    // InternalXemfs.g:1548:1: 'http'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getHttpKeyword_0()); 
                    }
                    match(input,10,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_SCHEMEAccess().getHttpKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1555:6: ( 'https' )
                    {
                    // InternalXemfs.g:1555:6: ( 'https' )
                    // InternalXemfs.g:1556:1: 'https'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getHttpsKeyword_1()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_SCHEMEAccess().getHttpsKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:1563:6: ( 'ftp' )
                    {
                    // InternalXemfs.g:1563:6: ( 'ftp' )
                    // InternalXemfs.g:1564:1: 'ftp'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getFtpKeyword_2()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_SCHEMEAccess().getFtpKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXemfs.g:1571:6: ( 'file' )
                    {
                    // InternalXemfs.g:1571:6: ( 'file' )
                    // InternalXemfs.g:1572:1: 'file'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getFileKeyword_3()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_SCHEMEAccess().getFileKeyword_3()); 
                    }

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
    // $ANTLR end "rule__URL_SCHEME__Alternatives"


    // $ANTLR start "rule__URL_HOST__Alternatives_1"
    // InternalXemfs.g:1584:1: rule__URL_HOST__Alternatives_1 : ( ( ( rule__URL_HOST__Group_1_0__0 ) ) | ( rulePROPERTY_REF ) );
    public final void rule__URL_HOST__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1588:1: ( ( ( rule__URL_HOST__Group_1_0__0 ) ) | ( rulePROPERTY_REF ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==40) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalXemfs.g:1589:1: ( ( rule__URL_HOST__Group_1_0__0 ) )
                    {
                    // InternalXemfs.g:1589:1: ( ( rule__URL_HOST__Group_1_0__0 ) )
                    // InternalXemfs.g:1590:1: ( rule__URL_HOST__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getGroup_1_0()); 
                    }
                    // InternalXemfs.g:1591:1: ( rule__URL_HOST__Group_1_0__0 )
                    // InternalXemfs.g:1591:2: rule__URL_HOST__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__URL_HOST__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1595:6: ( rulePROPERTY_REF )
                    {
                    // InternalXemfs.g:1595:6: ( rulePROPERTY_REF )
                    // InternalXemfs.g:1596:1: rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getPROPERTY_REFParserRuleCall_1_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePROPERTY_REF();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getPROPERTY_REFParserRuleCall_1_1()); 
                    }

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
    // $ANTLR end "rule__URL_HOST__Alternatives_1"


    // $ANTLR start "rule__URL_HOST__Alternatives_1_0_1_1"
    // InternalXemfs.g:1606:1: rule__URL_HOST__Alternatives_1_0_1_1 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__URL_HOST__Alternatives_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1610:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt19=10;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt19=1;
                }
                break;
            case 15:
                {
                alt19=2;
                }
                break;
            case 16:
                {
                alt19=3;
                }
                break;
            case 17:
                {
                alt19=4;
                }
                break;
            case 18:
                {
                alt19=5;
                }
                break;
            case 19:
                {
                alt19=6;
                }
                break;
            case 20:
                {
                alt19=7;
                }
                break;
            case 21:
                {
                alt19=8;
                }
                break;
            case 22:
                {
                alt19=9;
                }
                break;
            case 23:
                {
                alt19=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalXemfs.g:1611:1: ( '0' )
                    {
                    // InternalXemfs.g:1611:1: ( '0' )
                    // InternalXemfs.g:1612:1: '0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitZeroKeyword_1_0_1_1_0()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitZeroKeyword_1_0_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1619:6: ( '1' )
                    {
                    // InternalXemfs.g:1619:6: ( '1' )
                    // InternalXemfs.g:1620:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitOneKeyword_1_0_1_1_1()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitOneKeyword_1_0_1_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:1627:6: ( '2' )
                    {
                    // InternalXemfs.g:1627:6: ( '2' )
                    // InternalXemfs.g:1628:1: '2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitTwoKeyword_1_0_1_1_2()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitTwoKeyword_1_0_1_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXemfs.g:1635:6: ( '3' )
                    {
                    // InternalXemfs.g:1635:6: ( '3' )
                    // InternalXemfs.g:1636:1: '3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitThreeKeyword_1_0_1_1_3()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitThreeKeyword_1_0_1_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXemfs.g:1643:6: ( '4' )
                    {
                    // InternalXemfs.g:1643:6: ( '4' )
                    // InternalXemfs.g:1644:1: '4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitFourKeyword_1_0_1_1_4()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitFourKeyword_1_0_1_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXemfs.g:1651:6: ( '5' )
                    {
                    // InternalXemfs.g:1651:6: ( '5' )
                    // InternalXemfs.g:1652:1: '5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitFiveKeyword_1_0_1_1_5()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitFiveKeyword_1_0_1_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXemfs.g:1659:6: ( '6' )
                    {
                    // InternalXemfs.g:1659:6: ( '6' )
                    // InternalXemfs.g:1660:1: '6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitSixKeyword_1_0_1_1_6()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitSixKeyword_1_0_1_1_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXemfs.g:1667:6: ( '7' )
                    {
                    // InternalXemfs.g:1667:6: ( '7' )
                    // InternalXemfs.g:1668:1: '7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitSevenKeyword_1_0_1_1_7()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitSevenKeyword_1_0_1_1_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXemfs.g:1675:6: ( '8' )
                    {
                    // InternalXemfs.g:1675:6: ( '8' )
                    // InternalXemfs.g:1676:1: '8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitEightKeyword_1_0_1_1_8()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitEightKeyword_1_0_1_1_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXemfs.g:1683:6: ( '9' )
                    {
                    // InternalXemfs.g:1683:6: ( '9' )
                    // InternalXemfs.g:1684:1: '9'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitNineKeyword_1_0_1_1_9()); 
                    }
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitNineKeyword_1_0_1_1_9()); 
                    }

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
    // $ANTLR end "rule__URL_HOST__Alternatives_1_0_1_1"


    // $ANTLR start "rule__URL_PATH__Alternatives_1"
    // InternalXemfs.g:1696:1: rule__URL_PATH__Alternatives_1 : ( ( ruleFolderName ) | ( ( rule__URL_PATH__Group_1_1__0 ) ) );
    public final void rule__URL_PATH__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1700:1: ( ( ruleFolderName ) | ( ( rule__URL_PATH__Group_1_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==40) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalXemfs.g:1701:1: ( ruleFolderName )
                    {
                    // InternalXemfs.g:1701:1: ( ruleFolderName )
                    // InternalXemfs.g:1702:1: ruleFolderName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_PATHAccess().getFolderNameParserRuleCall_1_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFolderName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_PATHAccess().getFolderNameParserRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1707:6: ( ( rule__URL_PATH__Group_1_1__0 ) )
                    {
                    // InternalXemfs.g:1707:6: ( ( rule__URL_PATH__Group_1_1__0 ) )
                    // InternalXemfs.g:1708:1: ( rule__URL_PATH__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_PATHAccess().getGroup_1_1()); 
                    }
                    // InternalXemfs.g:1709:1: ( rule__URL_PATH__Group_1_1__0 )
                    // InternalXemfs.g:1709:2: rule__URL_PATH__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__URL_PATH__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_PATHAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__URL_PATH__Alternatives_1"


    // $ANTLR start "rule__URL_PATH__Alternatives_2"
    // InternalXemfs.g:1718:1: rule__URL_PATH__Alternatives_2 : ( ( ruleFileName ) | ( rulePROPERTY_REF ) );
    public final void rule__URL_PATH__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1722:1: ( ( ruleFileName ) | ( rulePROPERTY_REF ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==38) ) {
                alt21=1;
            }
            else if ( (LA21_0==40) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalXemfs.g:1723:1: ( ruleFileName )
                    {
                    // InternalXemfs.g:1723:1: ( ruleFileName )
                    // InternalXemfs.g:1724:1: ruleFileName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_PATHAccess().getFileNameParserRuleCall_2_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFileName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_PATHAccess().getFileNameParserRuleCall_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1729:6: ( rulePROPERTY_REF )
                    {
                    // InternalXemfs.g:1729:6: ( rulePROPERTY_REF )
                    // InternalXemfs.g:1730:1: rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_PATHAccess().getPROPERTY_REFParserRuleCall_2_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePROPERTY_REF();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_PATHAccess().getPROPERTY_REFParserRuleCall_2_1()); 
                    }

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
    // $ANTLR end "rule__URL_PATH__Alternatives_2"


    // $ANTLR start "rule__URLContentProvider__UrlStringAlternatives_0"
    // InternalXemfs.g:1740:1: rule__URLContentProvider__UrlStringAlternatives_0 : ( ( RULE_STRING ) | ( ruleURL ) );
    public final void rule__URLContentProvider__UrlStringAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1744:1: ( ( RULE_STRING ) | ( ruleURL ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=10 && LA22_0<=13)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalXemfs.g:1745:1: ( RULE_STRING )
                    {
                    // InternalXemfs.g:1745:1: ( RULE_STRING )
                    // InternalXemfs.g:1746:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURLContentProviderAccess().getUrlStringSTRINGTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURLContentProviderAccess().getUrlStringSTRINGTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1751:6: ( ruleURL )
                    {
                    // InternalXemfs.g:1751:6: ( ruleURL )
                    // InternalXemfs.g:1752:1: ruleURL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURLContentProviderAccess().getUrlStringURLParserRuleCall_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleURL();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURLContentProviderAccess().getUrlStringURLParserRuleCall_0_1()); 
                    }

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
    // $ANTLR end "rule__URLContentProvider__UrlStringAlternatives_0"


    // $ANTLR start "rule__GitContentRef__Alternatives_2"
    // InternalXemfs.g:1762:1: rule__GitContentRef__Alternatives_2 : ( ( ( rule__GitContentRef__Group_2_0__0 ) ) | ( ( rule__GitContentRef__OwnerAssignment_2_1 ) ) );
    public final void rule__GitContentRef__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1766:1: ( ( ( rule__GitContentRef__Group_2_0__0 ) ) | ( ( rule__GitContentRef__OwnerAssignment_2_1 ) ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalXemfs.g:1767:1: ( ( rule__GitContentRef__Group_2_0__0 ) )
                    {
                    // InternalXemfs.g:1767:1: ( ( rule__GitContentRef__Group_2_0__0 ) )
                    // InternalXemfs.g:1768:1: ( rule__GitContentRef__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getGroup_2_0()); 
                    }
                    // InternalXemfs.g:1769:1: ( rule__GitContentRef__Group_2_0__0 )
                    // InternalXemfs.g:1769:2: rule__GitContentRef__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GitContentRef__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGitContentRefAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1773:6: ( ( rule__GitContentRef__OwnerAssignment_2_1 ) )
                    {
                    // InternalXemfs.g:1773:6: ( ( rule__GitContentRef__OwnerAssignment_2_1 ) )
                    // InternalXemfs.g:1774:1: ( rule__GitContentRef__OwnerAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerAssignment_2_1()); 
                    }
                    // InternalXemfs.g:1775:1: ( rule__GitContentRef__OwnerAssignment_2_1 )
                    // InternalXemfs.g:1775:2: rule__GitContentRef__OwnerAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GitContentRef__OwnerAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGitContentRefAccess().getOwnerAssignment_2_1()); 
                    }

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
    // $ANTLR end "rule__GitContentRef__Alternatives_2"


    // $ANTLR start "rule__GitContentRef__HostAlternatives_2_0_0_0"
    // InternalXemfs.g:1784:1: rule__GitContentRef__HostAlternatives_2_0_0_0 : ( ( ruleURL_HOST_NAME ) | ( rulePROPERTY_REF ) );
    public final void rule__GitContentRef__HostAlternatives_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1788:1: ( ( ruleURL_HOST_NAME ) | ( rulePROPERTY_REF ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==40) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalXemfs.g:1789:1: ( ruleURL_HOST_NAME )
                    {
                    // InternalXemfs.g:1789:1: ( ruleURL_HOST_NAME )
                    // InternalXemfs.g:1790:1: ruleURL_HOST_NAME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getHostURL_HOST_NAMEParserRuleCall_2_0_0_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleURL_HOST_NAME();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGitContentRefAccess().getHostURL_HOST_NAMEParserRuleCall_2_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1795:6: ( rulePROPERTY_REF )
                    {
                    // InternalXemfs.g:1795:6: ( rulePROPERTY_REF )
                    // InternalXemfs.g:1796:1: rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getHostPROPERTY_REFParserRuleCall_2_0_0_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePROPERTY_REF();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGitContentRefAccess().getHostPROPERTY_REFParserRuleCall_2_0_0_0_1()); 
                    }

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
    // $ANTLR end "rule__GitContentRef__HostAlternatives_2_0_0_0"


    // $ANTLR start "rule__GitContentRef__OwnerAlternatives_2_0_1_1_0"
    // InternalXemfs.g:1806:1: rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 : ( ( RULE_ID ) | ( rulePROPERTY_REF ) );
    public final void rule__GitContentRef__OwnerAlternatives_2_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1810:1: ( ( RULE_ID ) | ( rulePROPERTY_REF ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==40) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalXemfs.g:1811:1: ( RULE_ID )
                    {
                    // InternalXemfs.g:1811:1: ( RULE_ID )
                    // InternalXemfs.g:1812:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_0_1_1_0_0()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_0_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1817:6: ( rulePROPERTY_REF )
                    {
                    // InternalXemfs.g:1817:6: ( rulePROPERTY_REF )
                    // InternalXemfs.g:1818:1: rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerPROPERTY_REFParserRuleCall_2_0_1_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePROPERTY_REF();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGitContentRefAccess().getOwnerPROPERTY_REFParserRuleCall_2_0_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__GitContentRef__OwnerAlternatives_2_0_1_1_0"


    // $ANTLR start "rule__GitContentRef__OwnerAlternatives_2_1_0"
    // InternalXemfs.g:1828:1: rule__GitContentRef__OwnerAlternatives_2_1_0 : ( ( RULE_ID ) | ( rulePROPERTY_REF ) );
    public final void rule__GitContentRef__OwnerAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1832:1: ( ( RULE_ID ) | ( rulePROPERTY_REF ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==40) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalXemfs.g:1833:1: ( RULE_ID )
                    {
                    // InternalXemfs.g:1833:1: ( RULE_ID )
                    // InternalXemfs.g:1834:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_1_0_0()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1839:6: ( rulePROPERTY_REF )
                    {
                    // InternalXemfs.g:1839:6: ( rulePROPERTY_REF )
                    // InternalXemfs.g:1840:1: rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerPROPERTY_REFParserRuleCall_2_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePROPERTY_REF();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGitContentRefAccess().getOwnerPROPERTY_REFParserRuleCall_2_1_0_1()); 
                    }

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
    // $ANTLR end "rule__GitContentRef__OwnerAlternatives_2_1_0"


    // $ANTLR start "rule__VERSION__Alternatives"
    // InternalXemfs.g:1850:1: rule__VERSION__Alternatives : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__VERSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1854:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt27=10;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt27=1;
                }
                break;
            case 15:
                {
                alt27=2;
                }
                break;
            case 16:
                {
                alt27=3;
                }
                break;
            case 17:
                {
                alt27=4;
                }
                break;
            case 18:
                {
                alt27=5;
                }
                break;
            case 19:
                {
                alt27=6;
                }
                break;
            case 20:
                {
                alt27=7;
                }
                break;
            case 21:
                {
                alt27=8;
                }
                break;
            case 22:
                {
                alt27=9;
                }
                break;
            case 23:
                {
                alt27=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalXemfs.g:1855:1: ( '0' )
                    {
                    // InternalXemfs.g:1855:1: ( '0' )
                    // InternalXemfs.g:1856:1: '0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitZeroKeyword_0()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitZeroKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1863:6: ( '1' )
                    {
                    // InternalXemfs.g:1863:6: ( '1' )
                    // InternalXemfs.g:1864:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitOneKeyword_1()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitOneKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:1871:6: ( '2' )
                    {
                    // InternalXemfs.g:1871:6: ( '2' )
                    // InternalXemfs.g:1872:1: '2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitTwoKeyword_2()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitTwoKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXemfs.g:1879:6: ( '3' )
                    {
                    // InternalXemfs.g:1879:6: ( '3' )
                    // InternalXemfs.g:1880:1: '3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitThreeKeyword_3()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitThreeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXemfs.g:1887:6: ( '4' )
                    {
                    // InternalXemfs.g:1887:6: ( '4' )
                    // InternalXemfs.g:1888:1: '4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitFourKeyword_4()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitFourKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXemfs.g:1895:6: ( '5' )
                    {
                    // InternalXemfs.g:1895:6: ( '5' )
                    // InternalXemfs.g:1896:1: '5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitFiveKeyword_5()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitFiveKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXemfs.g:1903:6: ( '6' )
                    {
                    // InternalXemfs.g:1903:6: ( '6' )
                    // InternalXemfs.g:1904:1: '6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitSixKeyword_6()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitSixKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXemfs.g:1911:6: ( '7' )
                    {
                    // InternalXemfs.g:1911:6: ( '7' )
                    // InternalXemfs.g:1912:1: '7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitSevenKeyword_7()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitSevenKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXemfs.g:1919:6: ( '8' )
                    {
                    // InternalXemfs.g:1919:6: ( '8' )
                    // InternalXemfs.g:1920:1: '8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitEightKeyword_8()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitEightKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXemfs.g:1927:6: ( '9' )
                    {
                    // InternalXemfs.g:1927:6: ( '9' )
                    // InternalXemfs.g:1928:1: '9'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitNineKeyword_9()); 
                    }
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitNineKeyword_9()); 
                    }

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
    // $ANTLR end "rule__VERSION__Alternatives"


    // $ANTLR start "rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0"
    // InternalXemfs.g:1940:1: rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 : ( ( RULE_STRING ) | ( ruleFileName ) );
    public final void rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1944:1: ( ( RULE_STRING ) | ( ruleFileName ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID||LA28_0==38) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalXemfs.g:1945:1: ( RULE_STRING )
                    {
                    // InternalXemfs.g:1945:1: ( RULE_STRING )
                    // InternalXemfs.g:1946:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysSTRINGTerminalRuleCall_1_1_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDotProjectFileContentProviderAccess().getKeysSTRINGTerminalRuleCall_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1951:6: ( ruleFileName )
                    {
                    // InternalXemfs.g:1951:6: ( ruleFileName )
                    // InternalXemfs.g:1952:1: ruleFileName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysFileNameParserRuleCall_1_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFileName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDotProjectFileContentProviderAccess().getKeysFileNameParserRuleCall_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0"


    // $ANTLR start "rule__XmlElement__Alternatives"
    // InternalXemfs.g:1962:1: rule__XmlElement__Alternatives : ( ( ruleXmlPIElement ) | ( ruleXmlTagElement ) );
    public final void rule__XmlElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1966:1: ( ( ruleXmlPIElement ) | ( ruleXmlTagElement ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==57) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalXemfs.g:1967:1: ( ruleXmlPIElement )
                    {
                    // InternalXemfs.g:1967:1: ( ruleXmlPIElement )
                    // InternalXemfs.g:1968:1: ruleXmlPIElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlElementAccess().getXmlPIElementParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleXmlPIElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlElementAccess().getXmlPIElementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1973:6: ( ruleXmlTagElement )
                    {
                    // InternalXemfs.g:1973:6: ( ruleXmlTagElement )
                    // InternalXemfs.g:1974:1: ruleXmlTagElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlElementAccess().getXmlTagElementParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleXmlTagElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlElementAccess().getXmlTagElementParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__XmlElement__Alternatives"


    // $ANTLR start "rule__XmlTagElement__Alternatives_1"
    // InternalXemfs.g:1984:1: rule__XmlTagElement__Alternatives_1 : ( ( '/' ) | ( ( rule__XmlTagElement__Group_1_1__0 ) ) );
    public final void rule__XmlTagElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:1988:1: ( ( '/' ) | ( ( rule__XmlTagElement__Group_1_1__0 ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_XML_TEXT) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalXemfs.g:1989:1: ( '/' )
                    {
                    // InternalXemfs.g:1989:1: ( '/' )
                    // InternalXemfs.g:1990:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_0()); 
                    }
                    match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1997:6: ( ( rule__XmlTagElement__Group_1_1__0 ) )
                    {
                    // InternalXemfs.g:1997:6: ( ( rule__XmlTagElement__Group_1_1__0 ) )
                    // InternalXemfs.g:1998:1: ( rule__XmlTagElement__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlTagElementAccess().getGroup_1_1()); 
                    }
                    // InternalXemfs.g:1999:1: ( rule__XmlTagElement__Group_1_1__0 )
                    // InternalXemfs.g:1999:2: rule__XmlTagElement__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XmlTagElement__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlTagElementAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__XmlTagElement__Alternatives_1"


    // $ANTLR start "rule__XmlAttribute__ValueAlternatives_1_1_0"
    // InternalXemfs.g:2008:1: rule__XmlAttribute__ValueAlternatives_1_1_0 : ( ( RULE_STRING ) | ( ruleXmlInt ) );
    public final void rule__XmlAttribute__ValueAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2012:1: ( ( RULE_STRING ) | ( ruleXmlInt ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=14 && LA31_0<=23)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalXemfs.g:2013:1: ( RULE_STRING )
                    {
                    // InternalXemfs.g:2013:1: ( RULE_STRING )
                    // InternalXemfs.g:2014:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlAttributeAccess().getValueSTRINGTerminalRuleCall_1_1_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlAttributeAccess().getValueSTRINGTerminalRuleCall_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2019:6: ( ruleXmlInt )
                    {
                    // InternalXemfs.g:2019:6: ( ruleXmlInt )
                    // InternalXemfs.g:2020:1: ruleXmlInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlAttributeAccess().getValueXmlIntParserRuleCall_1_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleXmlInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlAttributeAccess().getValueXmlIntParserRuleCall_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__XmlAttribute__ValueAlternatives_1_1_0"


    // $ANTLR start "rule__XmlInt__Alternatives"
    // InternalXemfs.g:2030:1: rule__XmlInt__Alternatives : ( ( ( rule__XmlInt__Group_0__0 ) ) | ( ( rule__XmlInt__Group_1__0 ) ) );
    public final void rule__XmlInt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2034:1: ( ( ( rule__XmlInt__Group_0__0 ) ) | ( ( rule__XmlInt__Group_1__0 ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=15 && LA32_0<=23)) ) {
                alt32=1;
            }
            else if ( (LA32_0==14) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalXemfs.g:2035:1: ( ( rule__XmlInt__Group_0__0 ) )
                    {
                    // InternalXemfs.g:2035:1: ( ( rule__XmlInt__Group_0__0 ) )
                    // InternalXemfs.g:2036:1: ( rule__XmlInt__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getGroup_0()); 
                    }
                    // InternalXemfs.g:2037:1: ( rule__XmlInt__Group_0__0 )
                    // InternalXemfs.g:2037:2: rule__XmlInt__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XmlInt__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2041:6: ( ( rule__XmlInt__Group_1__0 ) )
                    {
                    // InternalXemfs.g:2041:6: ( ( rule__XmlInt__Group_1__0 ) )
                    // InternalXemfs.g:2042:1: ( rule__XmlInt__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getGroup_1()); 
                    }
                    // InternalXemfs.g:2043:1: ( rule__XmlInt__Group_1__0 )
                    // InternalXemfs.g:2043:2: rule__XmlInt__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XmlInt__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__XmlInt__Alternatives"


    // $ANTLR start "rule__XmlInt__Alternatives_0_0"
    // InternalXemfs.g:2052:1: rule__XmlInt__Alternatives_0_0 : ( ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__XmlInt__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2056:1: ( ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt33=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt33=1;
                }
                break;
            case 16:
                {
                alt33=2;
                }
                break;
            case 17:
                {
                alt33=3;
                }
                break;
            case 18:
                {
                alt33=4;
                }
                break;
            case 19:
                {
                alt33=5;
                }
                break;
            case 20:
                {
                alt33=6;
                }
                break;
            case 21:
                {
                alt33=7;
                }
                break;
            case 22:
                {
                alt33=8;
                }
                break;
            case 23:
                {
                alt33=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalXemfs.g:2057:1: ( '1' )
                    {
                    // InternalXemfs.g:2057:1: ( '1' )
                    // InternalXemfs.g:2058:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitOneKeyword_0_0_0()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitOneKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2065:6: ( '2' )
                    {
                    // InternalXemfs.g:2065:6: ( '2' )
                    // InternalXemfs.g:2066:1: '2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitTwoKeyword_0_0_1()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitTwoKeyword_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:2073:6: ( '3' )
                    {
                    // InternalXemfs.g:2073:6: ( '3' )
                    // InternalXemfs.g:2074:1: '3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitThreeKeyword_0_0_2()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitThreeKeyword_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXemfs.g:2081:6: ( '4' )
                    {
                    // InternalXemfs.g:2081:6: ( '4' )
                    // InternalXemfs.g:2082:1: '4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitFourKeyword_0_0_3()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitFourKeyword_0_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXemfs.g:2089:6: ( '5' )
                    {
                    // InternalXemfs.g:2089:6: ( '5' )
                    // InternalXemfs.g:2090:1: '5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitFiveKeyword_0_0_4()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitFiveKeyword_0_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXemfs.g:2097:6: ( '6' )
                    {
                    // InternalXemfs.g:2097:6: ( '6' )
                    // InternalXemfs.g:2098:1: '6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitSixKeyword_0_0_5()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitSixKeyword_0_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXemfs.g:2105:6: ( '7' )
                    {
                    // InternalXemfs.g:2105:6: ( '7' )
                    // InternalXemfs.g:2106:1: '7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitSevenKeyword_0_0_6()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitSevenKeyword_0_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXemfs.g:2113:6: ( '8' )
                    {
                    // InternalXemfs.g:2113:6: ( '8' )
                    // InternalXemfs.g:2114:1: '8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitEightKeyword_0_0_7()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitEightKeyword_0_0_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXemfs.g:2121:6: ( '9' )
                    {
                    // InternalXemfs.g:2121:6: ( '9' )
                    // InternalXemfs.g:2122:1: '9'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitNineKeyword_0_0_8()); 
                    }
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitNineKeyword_0_0_8()); 
                    }

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
    // $ANTLR end "rule__XmlInt__Alternatives_0_0"


    // $ANTLR start "rule__XmlInt__Alternatives_0_1"
    // InternalXemfs.g:2134:1: rule__XmlInt__Alternatives_0_1 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__XmlInt__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2138:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt34=10;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt34=1;
                }
                break;
            case 15:
                {
                alt34=2;
                }
                break;
            case 16:
                {
                alt34=3;
                }
                break;
            case 17:
                {
                alt34=4;
                }
                break;
            case 18:
                {
                alt34=5;
                }
                break;
            case 19:
                {
                alt34=6;
                }
                break;
            case 20:
                {
                alt34=7;
                }
                break;
            case 21:
                {
                alt34=8;
                }
                break;
            case 22:
                {
                alt34=9;
                }
                break;
            case 23:
                {
                alt34=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalXemfs.g:2139:1: ( '0' )
                    {
                    // InternalXemfs.g:2139:1: ( '0' )
                    // InternalXemfs.g:2140:1: '0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitZeroKeyword_0_1_0()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitZeroKeyword_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2147:6: ( '1' )
                    {
                    // InternalXemfs.g:2147:6: ( '1' )
                    // InternalXemfs.g:2148:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitOneKeyword_0_1_1()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitOneKeyword_0_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:2155:6: ( '2' )
                    {
                    // InternalXemfs.g:2155:6: ( '2' )
                    // InternalXemfs.g:2156:1: '2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitTwoKeyword_0_1_2()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitTwoKeyword_0_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXemfs.g:2163:6: ( '3' )
                    {
                    // InternalXemfs.g:2163:6: ( '3' )
                    // InternalXemfs.g:2164:1: '3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitThreeKeyword_0_1_3()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitThreeKeyword_0_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXemfs.g:2171:6: ( '4' )
                    {
                    // InternalXemfs.g:2171:6: ( '4' )
                    // InternalXemfs.g:2172:1: '4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitFourKeyword_0_1_4()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitFourKeyword_0_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXemfs.g:2179:6: ( '5' )
                    {
                    // InternalXemfs.g:2179:6: ( '5' )
                    // InternalXemfs.g:2180:1: '5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitFiveKeyword_0_1_5()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitFiveKeyword_0_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXemfs.g:2187:6: ( '6' )
                    {
                    // InternalXemfs.g:2187:6: ( '6' )
                    // InternalXemfs.g:2188:1: '6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitSixKeyword_0_1_6()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitSixKeyword_0_1_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXemfs.g:2195:6: ( '7' )
                    {
                    // InternalXemfs.g:2195:6: ( '7' )
                    // InternalXemfs.g:2196:1: '7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitSevenKeyword_0_1_7()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitSevenKeyword_0_1_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXemfs.g:2203:6: ( '8' )
                    {
                    // InternalXemfs.g:2203:6: ( '8' )
                    // InternalXemfs.g:2204:1: '8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitEightKeyword_0_1_8()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitEightKeyword_0_1_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXemfs.g:2211:6: ( '9' )
                    {
                    // InternalXemfs.g:2211:6: ( '9' )
                    // InternalXemfs.g:2212:1: '9'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitNineKeyword_0_1_9()); 
                    }
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitNineKeyword_0_1_9()); 
                    }

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
    // $ANTLR end "rule__XmlInt__Alternatives_0_1"


    // $ANTLR start "rule__XmlInt__Alternatives_1_1"
    // InternalXemfs.g:2224:1: rule__XmlInt__Alternatives_1_1 : ( ( ( rule__XmlInt__Group_1_1_0__0 ) ) | ( ( rule__XmlInt__Group_1_1_1__0 ) ) | ( ( rule__XmlInt__Group_1_1_2__0 ) ) );
    public final void rule__XmlInt__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2228:1: ( ( ( rule__XmlInt__Group_1_1_0__0 ) ) | ( ( rule__XmlInt__Group_1_1_1__0 ) ) | ( ( rule__XmlInt__Group_1_1_2__0 ) ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt35=1;
                }
                break;
            case 58:
                {
                alt35=2;
                }
                break;
            case 59:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalXemfs.g:2229:1: ( ( rule__XmlInt__Group_1_1_0__0 ) )
                    {
                    // InternalXemfs.g:2229:1: ( ( rule__XmlInt__Group_1_1_0__0 ) )
                    // InternalXemfs.g:2230:1: ( rule__XmlInt__Group_1_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getGroup_1_1_0()); 
                    }
                    // InternalXemfs.g:2231:1: ( rule__XmlInt__Group_1_1_0__0 )
                    // InternalXemfs.g:2231:2: rule__XmlInt__Group_1_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XmlInt__Group_1_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getGroup_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2235:6: ( ( rule__XmlInt__Group_1_1_1__0 ) )
                    {
                    // InternalXemfs.g:2235:6: ( ( rule__XmlInt__Group_1_1_1__0 ) )
                    // InternalXemfs.g:2236:1: ( rule__XmlInt__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getGroup_1_1_1()); 
                    }
                    // InternalXemfs.g:2237:1: ( rule__XmlInt__Group_1_1_1__0 )
                    // InternalXemfs.g:2237:2: rule__XmlInt__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XmlInt__Group_1_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getGroup_1_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:2241:6: ( ( rule__XmlInt__Group_1_1_2__0 ) )
                    {
                    // InternalXemfs.g:2241:6: ( ( rule__XmlInt__Group_1_1_2__0 ) )
                    // InternalXemfs.g:2242:1: ( rule__XmlInt__Group_1_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getGroup_1_1_2()); 
                    }
                    // InternalXemfs.g:2243:1: ( rule__XmlInt__Group_1_1_2__0 )
                    // InternalXemfs.g:2243:2: rule__XmlInt__Group_1_1_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XmlInt__Group_1_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getGroup_1_1_2()); 
                    }

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
    // $ANTLR end "rule__XmlInt__Alternatives_1_1"


    // $ANTLR start "rule__XmlInt__Alternatives_1_1_0_1"
    // InternalXemfs.g:2252:1: rule__XmlInt__Alternatives_1_1_0_1 : ( ( '0' ) | ( '1' ) );
    public final void rule__XmlInt__Alternatives_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2256:1: ( ( '0' ) | ( '1' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            else if ( (LA36_0==15) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalXemfs.g:2257:1: ( '0' )
                    {
                    // InternalXemfs.g:2257:1: ( '0' )
                    // InternalXemfs.g:2258:1: '0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_1_0_1_0()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2265:6: ( '1' )
                    {
                    // InternalXemfs.g:2265:6: ( '1' )
                    // InternalXemfs.g:2266:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitOneKeyword_1_1_0_1_1()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitOneKeyword_1_1_0_1_1()); 
                    }

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
    // $ANTLR end "rule__XmlInt__Alternatives_1_1_0_1"


    // $ANTLR start "rule__XmlInt__Alternatives_1_1_1_1"
    // InternalXemfs.g:2278:1: rule__XmlInt__Alternatives_1_1_1_1 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) );
    public final void rule__XmlInt__Alternatives_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2282:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) )
            int alt37=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt37=1;
                }
                break;
            case 15:
                {
                alt37=2;
                }
                break;
            case 16:
                {
                alt37=3;
                }
                break;
            case 17:
                {
                alt37=4;
                }
                break;
            case 18:
                {
                alt37=5;
                }
                break;
            case 19:
                {
                alt37=6;
                }
                break;
            case 20:
                {
                alt37=7;
                }
                break;
            case 21:
                {
                alt37=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalXemfs.g:2283:1: ( '0' )
                    {
                    // InternalXemfs.g:2283:1: ( '0' )
                    // InternalXemfs.g:2284:1: '0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_1_1_1_0()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_1_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2291:6: ( '1' )
                    {
                    // InternalXemfs.g:2291:6: ( '1' )
                    // InternalXemfs.g:2292:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitOneKeyword_1_1_1_1_1()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitOneKeyword_1_1_1_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:2299:6: ( '2' )
                    {
                    // InternalXemfs.g:2299:6: ( '2' )
                    // InternalXemfs.g:2300:1: '2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitTwoKeyword_1_1_1_1_2()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitTwoKeyword_1_1_1_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXemfs.g:2307:6: ( '3' )
                    {
                    // InternalXemfs.g:2307:6: ( '3' )
                    // InternalXemfs.g:2308:1: '3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitThreeKeyword_1_1_1_1_3()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitThreeKeyword_1_1_1_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXemfs.g:2315:6: ( '4' )
                    {
                    // InternalXemfs.g:2315:6: ( '4' )
                    // InternalXemfs.g:2316:1: '4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitFourKeyword_1_1_1_1_4()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitFourKeyword_1_1_1_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXemfs.g:2323:6: ( '5' )
                    {
                    // InternalXemfs.g:2323:6: ( '5' )
                    // InternalXemfs.g:2324:1: '5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitFiveKeyword_1_1_1_1_5()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitFiveKeyword_1_1_1_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXemfs.g:2331:6: ( '6' )
                    {
                    // InternalXemfs.g:2331:6: ( '6' )
                    // InternalXemfs.g:2332:1: '6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitSixKeyword_1_1_1_1_6()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitSixKeyword_1_1_1_1_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXemfs.g:2339:6: ( '7' )
                    {
                    // InternalXemfs.g:2339:6: ( '7' )
                    // InternalXemfs.g:2340:1: '7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitSevenKeyword_1_1_1_1_7()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitSevenKeyword_1_1_1_1_7()); 
                    }

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
    // $ANTLR end "rule__XmlInt__Alternatives_1_1_1_1"


    // $ANTLR start "rule__XmlInt__Alternatives_1_1_2_1"
    // InternalXemfs.g:2352:1: rule__XmlInt__Alternatives_1_1_2_1 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) | ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) );
    public final void rule__XmlInt__Alternatives_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2356:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) | ( 'a' ) | ( 'b' ) | ( 'c' ) | ( 'd' ) | ( 'e' ) | ( 'f' ) )
            int alt38=16;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt38=1;
                }
                break;
            case 15:
                {
                alt38=2;
                }
                break;
            case 16:
                {
                alt38=3;
                }
                break;
            case 17:
                {
                alt38=4;
                }
                break;
            case 18:
                {
                alt38=5;
                }
                break;
            case 19:
                {
                alt38=6;
                }
                break;
            case 20:
                {
                alt38=7;
                }
                break;
            case 21:
                {
                alt38=8;
                }
                break;
            case 22:
                {
                alt38=9;
                }
                break;
            case 23:
                {
                alt38=10;
                }
                break;
            case 25:
                {
                alt38=11;
                }
                break;
            case 26:
                {
                alt38=12;
                }
                break;
            case 27:
                {
                alt38=13;
                }
                break;
            case 28:
                {
                alt38=14;
                }
                break;
            case 29:
                {
                alt38=15;
                }
                break;
            case 30:
                {
                alt38=16;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalXemfs.g:2357:1: ( '0' )
                    {
                    // InternalXemfs.g:2357:1: ( '0' )
                    // InternalXemfs.g:2358:1: '0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_1_2_1_0()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_1_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2365:6: ( '1' )
                    {
                    // InternalXemfs.g:2365:6: ( '1' )
                    // InternalXemfs.g:2366:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitOneKeyword_1_1_2_1_1()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitOneKeyword_1_1_2_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:2373:6: ( '2' )
                    {
                    // InternalXemfs.g:2373:6: ( '2' )
                    // InternalXemfs.g:2374:1: '2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitTwoKeyword_1_1_2_1_2()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitTwoKeyword_1_1_2_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXemfs.g:2381:6: ( '3' )
                    {
                    // InternalXemfs.g:2381:6: ( '3' )
                    // InternalXemfs.g:2382:1: '3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitThreeKeyword_1_1_2_1_3()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitThreeKeyword_1_1_2_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalXemfs.g:2389:6: ( '4' )
                    {
                    // InternalXemfs.g:2389:6: ( '4' )
                    // InternalXemfs.g:2390:1: '4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitFourKeyword_1_1_2_1_4()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitFourKeyword_1_1_2_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalXemfs.g:2397:6: ( '5' )
                    {
                    // InternalXemfs.g:2397:6: ( '5' )
                    // InternalXemfs.g:2398:1: '5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitFiveKeyword_1_1_2_1_5()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitFiveKeyword_1_1_2_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalXemfs.g:2405:6: ( '6' )
                    {
                    // InternalXemfs.g:2405:6: ( '6' )
                    // InternalXemfs.g:2406:1: '6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitSixKeyword_1_1_2_1_6()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitSixKeyword_1_1_2_1_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalXemfs.g:2413:6: ( '7' )
                    {
                    // InternalXemfs.g:2413:6: ( '7' )
                    // InternalXemfs.g:2414:1: '7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitSevenKeyword_1_1_2_1_7()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitSevenKeyword_1_1_2_1_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalXemfs.g:2421:6: ( '8' )
                    {
                    // InternalXemfs.g:2421:6: ( '8' )
                    // InternalXemfs.g:2422:1: '8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitEightKeyword_1_1_2_1_8()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitEightKeyword_1_1_2_1_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalXemfs.g:2429:6: ( '9' )
                    {
                    // InternalXemfs.g:2429:6: ( '9' )
                    // InternalXemfs.g:2430:1: '9'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDigitNineKeyword_1_1_2_1_9()); 
                    }
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDigitNineKeyword_1_1_2_1_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalXemfs.g:2437:6: ( 'a' )
                    {
                    // InternalXemfs.g:2437:6: ( 'a' )
                    // InternalXemfs.g:2438:1: 'a'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getAKeyword_1_1_2_1_10()); 
                    }
                    match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getAKeyword_1_1_2_1_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalXemfs.g:2445:6: ( 'b' )
                    {
                    // InternalXemfs.g:2445:6: ( 'b' )
                    // InternalXemfs.g:2446:1: 'b'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getBKeyword_1_1_2_1_11()); 
                    }
                    match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getBKeyword_1_1_2_1_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalXemfs.g:2453:6: ( 'c' )
                    {
                    // InternalXemfs.g:2453:6: ( 'c' )
                    // InternalXemfs.g:2454:1: 'c'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getCKeyword_1_1_2_1_12()); 
                    }
                    match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getCKeyword_1_1_2_1_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalXemfs.g:2461:6: ( 'd' )
                    {
                    // InternalXemfs.g:2461:6: ( 'd' )
                    // InternalXemfs.g:2462:1: 'd'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getDKeyword_1_1_2_1_13()); 
                    }
                    match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getDKeyword_1_1_2_1_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalXemfs.g:2469:6: ( 'e' )
                    {
                    // InternalXemfs.g:2469:6: ( 'e' )
                    // InternalXemfs.g:2470:1: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getEKeyword_1_1_2_1_14()); 
                    }
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getEKeyword_1_1_2_1_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalXemfs.g:2477:6: ( 'f' )
                    {
                    // InternalXemfs.g:2477:6: ( 'f' )
                    // InternalXemfs.g:2478:1: 'f'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXmlIntAccess().getFKeyword_1_1_2_1_15()); 
                    }
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXmlIntAccess().getFKeyword_1_1_2_1_15()); 
                    }

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
    // $ANTLR end "rule__XmlInt__Alternatives_1_1_2_1"


    // $ANTLR start "rule__ClasspathEntryKind__Alternatives"
    // InternalXemfs.g:2490:1: rule__ClasspathEntryKind__Alternatives : ( ( ( 'source-folder' ) ) | ( ( 'output-folder' ) ) | ( ( 'library-jar' ) ) | ( ( 'class-container' ) ) );
    public final void rule__ClasspathEntryKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2494:1: ( ( ( 'source-folder' ) ) | ( ( 'output-folder' ) ) | ( ( 'library-jar' ) ) | ( ( 'class-container' ) ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt39=1;
                }
                break;
            case 32:
                {
                alt39=2;
                }
                break;
            case 33:
                {
                alt39=3;
                }
                break;
            case 34:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalXemfs.g:2495:1: ( ( 'source-folder' ) )
                    {
                    // InternalXemfs.g:2495:1: ( ( 'source-folder' ) )
                    // InternalXemfs.g:2496:1: ( 'source-folder' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0()); 
                    }
                    // InternalXemfs.g:2497:1: ( 'source-folder' )
                    // InternalXemfs.g:2497:3: 'source-folder'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2502:6: ( ( 'output-folder' ) )
                    {
                    // InternalXemfs.g:2502:6: ( ( 'output-folder' ) )
                    // InternalXemfs.g:2503:1: ( 'output-folder' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1()); 
                    }
                    // InternalXemfs.g:2504:1: ( 'output-folder' )
                    // InternalXemfs.g:2504:3: 'output-folder'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:2509:6: ( ( 'library-jar' ) )
                    {
                    // InternalXemfs.g:2509:6: ( ( 'library-jar' ) )
                    // InternalXemfs.g:2510:1: ( 'library-jar' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2()); 
                    }
                    // InternalXemfs.g:2511:1: ( 'library-jar' )
                    // InternalXemfs.g:2511:3: 'library-jar'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXemfs.g:2516:6: ( ( 'class-container' ) )
                    {
                    // InternalXemfs.g:2516:6: ( ( 'class-container' ) )
                    // InternalXemfs.g:2517:1: ( 'class-container' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getConEnumLiteralDeclaration_3()); 
                    }
                    // InternalXemfs.g:2518:1: ( 'class-container' )
                    // InternalXemfs.g:2518:3: 'class-container'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClasspathEntryKindAccess().getConEnumLiteralDeclaration_3()); 
                    }

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
    // $ANTLR end "rule__ClasspathEntryKind__Alternatives"


    // $ANTLR start "rule__EmfsRoot__Group__0"
    // InternalXemfs.g:2530:1: rule__EmfsRoot__Group__0 : rule__EmfsRoot__Group__0__Impl rule__EmfsRoot__Group__1 ;
    public final void rule__EmfsRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2534:1: ( rule__EmfsRoot__Group__0__Impl rule__EmfsRoot__Group__1 )
            // InternalXemfs.g:2535:2: rule__EmfsRoot__Group__0__Impl rule__EmfsRoot__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__EmfsRoot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group__0"


    // $ANTLR start "rule__EmfsRoot__Group__0__Impl"
    // InternalXemfs.g:2542:1: rule__EmfsRoot__Group__0__Impl : ( () ) ;
    public final void rule__EmfsRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2546:1: ( ( () ) )
            // InternalXemfs.g:2547:1: ( () )
            {
            // InternalXemfs.g:2547:1: ( () )
            // InternalXemfs.g:2548:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getEmfsContainerAction_0()); 
            }
            // InternalXemfs.g:2549:1: ()
            // InternalXemfs.g:2551:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getEmfsContainerAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group__0__Impl"


    // $ANTLR start "rule__EmfsRoot__Group__1"
    // InternalXemfs.g:2561:1: rule__EmfsRoot__Group__1 : rule__EmfsRoot__Group__1__Impl rule__EmfsRoot__Group__2 ;
    public final void rule__EmfsRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2565:1: ( rule__EmfsRoot__Group__1__Impl rule__EmfsRoot__Group__2 )
            // InternalXemfs.g:2566:2: rule__EmfsRoot__Group__1__Impl rule__EmfsRoot__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__EmfsRoot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group__1"


    // $ANTLR start "rule__EmfsRoot__Group__1__Impl"
    // InternalXemfs.g:2573:1: rule__EmfsRoot__Group__1__Impl : ( ( rule__EmfsRoot__Group_1__0 )? ) ;
    public final void rule__EmfsRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2577:1: ( ( ( rule__EmfsRoot__Group_1__0 )? ) )
            // InternalXemfs.g:2578:1: ( ( rule__EmfsRoot__Group_1__0 )? )
            {
            // InternalXemfs.g:2578:1: ( ( rule__EmfsRoot__Group_1__0 )? )
            // InternalXemfs.g:2579:1: ( rule__EmfsRoot__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup_1()); 
            }
            // InternalXemfs.g:2580:1: ( rule__EmfsRoot__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXemfs.g:2580:2: rule__EmfsRoot__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EmfsRoot__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getGroup_1()); 
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
    // $ANTLR end "rule__EmfsRoot__Group__1__Impl"


    // $ANTLR start "rule__EmfsRoot__Group__2"
    // InternalXemfs.g:2590:1: rule__EmfsRoot__Group__2 : rule__EmfsRoot__Group__2__Impl rule__EmfsRoot__Group__3 ;
    public final void rule__EmfsRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2594:1: ( rule__EmfsRoot__Group__2__Impl rule__EmfsRoot__Group__3 )
            // InternalXemfs.g:2595:2: rule__EmfsRoot__Group__2__Impl rule__EmfsRoot__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__EmfsRoot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group__2"


    // $ANTLR start "rule__EmfsRoot__Group__2__Impl"
    // InternalXemfs.g:2602:1: rule__EmfsRoot__Group__2__Impl : ( ( rule__EmfsRoot__Group_2__0 )* ) ;
    public final void rule__EmfsRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2606:1: ( ( ( rule__EmfsRoot__Group_2__0 )* ) )
            // InternalXemfs.g:2607:1: ( ( rule__EmfsRoot__Group_2__0 )* )
            {
            // InternalXemfs.g:2607:1: ( ( rule__EmfsRoot__Group_2__0 )* )
            // InternalXemfs.g:2608:1: ( rule__EmfsRoot__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup_2()); 
            }
            // InternalXemfs.g:2609:1: ( rule__EmfsRoot__Group_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==36) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalXemfs.g:2609:2: rule__EmfsRoot__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__EmfsRoot__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getGroup_2()); 
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
    // $ANTLR end "rule__EmfsRoot__Group__2__Impl"


    // $ANTLR start "rule__EmfsRoot__Group__3"
    // InternalXemfs.g:2619:1: rule__EmfsRoot__Group__3 : rule__EmfsRoot__Group__3__Impl rule__EmfsRoot__Group__4 ;
    public final void rule__EmfsRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2623:1: ( rule__EmfsRoot__Group__3__Impl rule__EmfsRoot__Group__4 )
            // InternalXemfs.g:2624:2: rule__EmfsRoot__Group__3__Impl rule__EmfsRoot__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__EmfsRoot__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group__3"


    // $ANTLR start "rule__EmfsRoot__Group__3__Impl"
    // InternalXemfs.g:2631:1: rule__EmfsRoot__Group__3__Impl : ( ( rule__EmfsRoot__PropertiesAssignment_3 )* ) ;
    public final void rule__EmfsRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2635:1: ( ( ( rule__EmfsRoot__PropertiesAssignment_3 )* ) )
            // InternalXemfs.g:2636:1: ( ( rule__EmfsRoot__PropertiesAssignment_3 )* )
            {
            // InternalXemfs.g:2636:1: ( ( rule__EmfsRoot__PropertiesAssignment_3 )* )
            // InternalXemfs.g:2637:1: ( rule__EmfsRoot__PropertiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getPropertiesAssignment_3()); 
            }
            // InternalXemfs.g:2638:1: ( rule__EmfsRoot__PropertiesAssignment_3 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==40) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalXemfs.g:2638:2: rule__EmfsRoot__PropertiesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__EmfsRoot__PropertiesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getPropertiesAssignment_3()); 
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
    // $ANTLR end "rule__EmfsRoot__Group__3__Impl"


    // $ANTLR start "rule__EmfsRoot__Group__4"
    // InternalXemfs.g:2648:1: rule__EmfsRoot__Group__4 : rule__EmfsRoot__Group__4__Impl rule__EmfsRoot__Group__5 ;
    public final void rule__EmfsRoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2652:1: ( rule__EmfsRoot__Group__4__Impl rule__EmfsRoot__Group__5 )
            // InternalXemfs.g:2653:2: rule__EmfsRoot__Group__4__Impl rule__EmfsRoot__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__EmfsRoot__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group__4"


    // $ANTLR start "rule__EmfsRoot__Group__4__Impl"
    // InternalXemfs.g:2660:1: rule__EmfsRoot__Group__4__Impl : ( ( rule__EmfsRoot__Group_4__0 )? ) ;
    public final void rule__EmfsRoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2664:1: ( ( ( rule__EmfsRoot__Group_4__0 )? ) )
            // InternalXemfs.g:2665:1: ( ( rule__EmfsRoot__Group_4__0 )? )
            {
            // InternalXemfs.g:2665:1: ( ( rule__EmfsRoot__Group_4__0 )? )
            // InternalXemfs.g:2666:1: ( rule__EmfsRoot__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup_4()); 
            }
            // InternalXemfs.g:2667:1: ( rule__EmfsRoot__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXemfs.g:2667:2: rule__EmfsRoot__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EmfsRoot__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getGroup_4()); 
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
    // $ANTLR end "rule__EmfsRoot__Group__4__Impl"


    // $ANTLR start "rule__EmfsRoot__Group__5"
    // InternalXemfs.g:2677:1: rule__EmfsRoot__Group__5 : rule__EmfsRoot__Group__5__Impl rule__EmfsRoot__Group__6 ;
    public final void rule__EmfsRoot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2681:1: ( rule__EmfsRoot__Group__5__Impl rule__EmfsRoot__Group__6 )
            // InternalXemfs.g:2682:2: rule__EmfsRoot__Group__5__Impl rule__EmfsRoot__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__EmfsRoot__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group__5"


    // $ANTLR start "rule__EmfsRoot__Group__5__Impl"
    // InternalXemfs.g:2689:1: rule__EmfsRoot__Group__5__Impl : ( '/' ) ;
    public final void rule__EmfsRoot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2693:1: ( ( '/' ) )
            // InternalXemfs.g:2694:1: ( '/' )
            {
            // InternalXemfs.g:2694:1: ( '/' )
            // InternalXemfs.g:2695:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getSolidusKeyword_5()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getSolidusKeyword_5()); 
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
    // $ANTLR end "rule__EmfsRoot__Group__5__Impl"


    // $ANTLR start "rule__EmfsRoot__Group__6"
    // InternalXemfs.g:2708:1: rule__EmfsRoot__Group__6 : rule__EmfsRoot__Group__6__Impl ;
    public final void rule__EmfsRoot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2712:1: ( rule__EmfsRoot__Group__6__Impl )
            // InternalXemfs.g:2713:2: rule__EmfsRoot__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group__6"


    // $ANTLR start "rule__EmfsRoot__Group__6__Impl"
    // InternalXemfs.g:2719:1: rule__EmfsRoot__Group__6__Impl : ( ( rule__EmfsRoot__ResourcesAssignment_6 )* ) ;
    public final void rule__EmfsRoot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2723:1: ( ( ( rule__EmfsRoot__ResourcesAssignment_6 )* ) )
            // InternalXemfs.g:2724:1: ( ( rule__EmfsRoot__ResourcesAssignment_6 )* )
            {
            // InternalXemfs.g:2724:1: ( ( rule__EmfsRoot__ResourcesAssignment_6 )* )
            // InternalXemfs.g:2725:1: ( rule__EmfsRoot__ResourcesAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getResourcesAssignment_6()); 
            }
            // InternalXemfs.g:2726:1: ( rule__EmfsRoot__ResourcesAssignment_6 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==38) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalXemfs.g:2726:2: rule__EmfsRoot__ResourcesAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__EmfsRoot__ResourcesAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getResourcesAssignment_6()); 
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
    // $ANTLR end "rule__EmfsRoot__Group__6__Impl"


    // $ANTLR start "rule__EmfsRoot__Group_1__0"
    // InternalXemfs.g:2750:1: rule__EmfsRoot__Group_1__0 : rule__EmfsRoot__Group_1__0__Impl rule__EmfsRoot__Group_1__1 ;
    public final void rule__EmfsRoot__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2754:1: ( rule__EmfsRoot__Group_1__0__Impl rule__EmfsRoot__Group_1__1 )
            // InternalXemfs.g:2755:2: rule__EmfsRoot__Group_1__0__Impl rule__EmfsRoot__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__EmfsRoot__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_1__0"


    // $ANTLR start "rule__EmfsRoot__Group_1__0__Impl"
    // InternalXemfs.g:2762:1: rule__EmfsRoot__Group_1__0__Impl : ( 'emfs' ) ;
    public final void rule__EmfsRoot__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2766:1: ( ( 'emfs' ) )
            // InternalXemfs.g:2767:1: ( 'emfs' )
            {
            // InternalXemfs.g:2767:1: ( 'emfs' )
            // InternalXemfs.g:2768:1: 'emfs'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getEmfsKeyword_1_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getEmfsKeyword_1_0()); 
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
    // $ANTLR end "rule__EmfsRoot__Group_1__0__Impl"


    // $ANTLR start "rule__EmfsRoot__Group_1__1"
    // InternalXemfs.g:2781:1: rule__EmfsRoot__Group_1__1 : rule__EmfsRoot__Group_1__1__Impl ;
    public final void rule__EmfsRoot__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2785:1: ( rule__EmfsRoot__Group_1__1__Impl )
            // InternalXemfs.g:2786:2: rule__EmfsRoot__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_1__1"


    // $ANTLR start "rule__EmfsRoot__Group_1__1__Impl"
    // InternalXemfs.g:2792:1: rule__EmfsRoot__Group_1__1__Impl : ( ( rule__EmfsRoot__NameAssignment_1_1 )? ) ;
    public final void rule__EmfsRoot__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2796:1: ( ( ( rule__EmfsRoot__NameAssignment_1_1 )? ) )
            // InternalXemfs.g:2797:1: ( ( rule__EmfsRoot__NameAssignment_1_1 )? )
            {
            // InternalXemfs.g:2797:1: ( ( rule__EmfsRoot__NameAssignment_1_1 )? )
            // InternalXemfs.g:2798:1: ( rule__EmfsRoot__NameAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getNameAssignment_1_1()); 
            }
            // InternalXemfs.g:2799:1: ( rule__EmfsRoot__NameAssignment_1_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXemfs.g:2799:2: rule__EmfsRoot__NameAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EmfsRoot__NameAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getNameAssignment_1_1()); 
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
    // $ANTLR end "rule__EmfsRoot__Group_1__1__Impl"


    // $ANTLR start "rule__EmfsRoot__Group_2__0"
    // InternalXemfs.g:2813:1: rule__EmfsRoot__Group_2__0 : rule__EmfsRoot__Group_2__0__Impl rule__EmfsRoot__Group_2__1 ;
    public final void rule__EmfsRoot__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2817:1: ( rule__EmfsRoot__Group_2__0__Impl rule__EmfsRoot__Group_2__1 )
            // InternalXemfs.g:2818:2: rule__EmfsRoot__Group_2__0__Impl rule__EmfsRoot__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__EmfsRoot__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_2__0"


    // $ANTLR start "rule__EmfsRoot__Group_2__0__Impl"
    // InternalXemfs.g:2825:1: rule__EmfsRoot__Group_2__0__Impl : ( '#' ) ;
    public final void rule__EmfsRoot__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2829:1: ( ( '#' ) )
            // InternalXemfs.g:2830:1: ( '#' )
            {
            // InternalXemfs.g:2830:1: ( '#' )
            // InternalXemfs.g:2831:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getNumberSignKeyword_2_0()); 
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
    // $ANTLR end "rule__EmfsRoot__Group_2__0__Impl"


    // $ANTLR start "rule__EmfsRoot__Group_2__1"
    // InternalXemfs.g:2844:1: rule__EmfsRoot__Group_2__1 : rule__EmfsRoot__Group_2__1__Impl ;
    public final void rule__EmfsRoot__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2848:1: ( rule__EmfsRoot__Group_2__1__Impl )
            // InternalXemfs.g:2849:2: rule__EmfsRoot__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_2__1"


    // $ANTLR start "rule__EmfsRoot__Group_2__1__Impl"
    // InternalXemfs.g:2855:1: rule__EmfsRoot__Group_2__1__Impl : ( ( rule__EmfsRoot__TagsAssignment_2_1 ) ) ;
    public final void rule__EmfsRoot__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2859:1: ( ( ( rule__EmfsRoot__TagsAssignment_2_1 ) ) )
            // InternalXemfs.g:2860:1: ( ( rule__EmfsRoot__TagsAssignment_2_1 ) )
            {
            // InternalXemfs.g:2860:1: ( ( rule__EmfsRoot__TagsAssignment_2_1 ) )
            // InternalXemfs.g:2861:1: ( rule__EmfsRoot__TagsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getTagsAssignment_2_1()); 
            }
            // InternalXemfs.g:2862:1: ( rule__EmfsRoot__TagsAssignment_2_1 )
            // InternalXemfs.g:2862:2: rule__EmfsRoot__TagsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__TagsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getTagsAssignment_2_1()); 
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
    // $ANTLR end "rule__EmfsRoot__Group_2__1__Impl"


    // $ANTLR start "rule__EmfsRoot__Group_4__0"
    // InternalXemfs.g:2876:1: rule__EmfsRoot__Group_4__0 : rule__EmfsRoot__Group_4__0__Impl rule__EmfsRoot__Group_4__1 ;
    public final void rule__EmfsRoot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2880:1: ( rule__EmfsRoot__Group_4__0__Impl rule__EmfsRoot__Group_4__1 )
            // InternalXemfs.g:2881:2: rule__EmfsRoot__Group_4__0__Impl rule__EmfsRoot__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__EmfsRoot__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_4__0"


    // $ANTLR start "rule__EmfsRoot__Group_4__0__Impl"
    // InternalXemfs.g:2888:1: rule__EmfsRoot__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__EmfsRoot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2892:1: ( ( 'extends' ) )
            // InternalXemfs.g:2893:1: ( 'extends' )
            {
            // InternalXemfs.g:2893:1: ( 'extends' )
            // InternalXemfs.g:2894:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getExtendsKeyword_4_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getExtendsKeyword_4_0()); 
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
    // $ANTLR end "rule__EmfsRoot__Group_4__0__Impl"


    // $ANTLR start "rule__EmfsRoot__Group_4__1"
    // InternalXemfs.g:2907:1: rule__EmfsRoot__Group_4__1 : rule__EmfsRoot__Group_4__1__Impl rule__EmfsRoot__Group_4__2 ;
    public final void rule__EmfsRoot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2911:1: ( rule__EmfsRoot__Group_4__1__Impl rule__EmfsRoot__Group_4__2 )
            // InternalXemfs.g:2912:2: rule__EmfsRoot__Group_4__1__Impl rule__EmfsRoot__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__EmfsRoot__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_4__1"


    // $ANTLR start "rule__EmfsRoot__Group_4__1__Impl"
    // InternalXemfs.g:2919:1: rule__EmfsRoot__Group_4__1__Impl : ( ( rule__EmfsRoot__ContentProviderAssignment_4_1 ) ) ;
    public final void rule__EmfsRoot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2923:1: ( ( ( rule__EmfsRoot__ContentProviderAssignment_4_1 ) ) )
            // InternalXemfs.g:2924:1: ( ( rule__EmfsRoot__ContentProviderAssignment_4_1 ) )
            {
            // InternalXemfs.g:2924:1: ( ( rule__EmfsRoot__ContentProviderAssignment_4_1 ) )
            // InternalXemfs.g:2925:1: ( rule__EmfsRoot__ContentProviderAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getContentProviderAssignment_4_1()); 
            }
            // InternalXemfs.g:2926:1: ( rule__EmfsRoot__ContentProviderAssignment_4_1 )
            // InternalXemfs.g:2926:2: rule__EmfsRoot__ContentProviderAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__ContentProviderAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getContentProviderAssignment_4_1()); 
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
    // $ANTLR end "rule__EmfsRoot__Group_4__1__Impl"


    // $ANTLR start "rule__EmfsRoot__Group_4__2"
    // InternalXemfs.g:2936:1: rule__EmfsRoot__Group_4__2 : rule__EmfsRoot__Group_4__2__Impl ;
    public final void rule__EmfsRoot__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2940:1: ( rule__EmfsRoot__Group_4__2__Impl )
            // InternalXemfs.g:2941:2: rule__EmfsRoot__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_4__2"


    // $ANTLR start "rule__EmfsRoot__Group_4__2__Impl"
    // InternalXemfs.g:2947:1: rule__EmfsRoot__Group_4__2__Impl : ( ';' ) ;
    public final void rule__EmfsRoot__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2951:1: ( ( ';' ) )
            // InternalXemfs.g:2952:1: ( ';' )
            {
            // InternalXemfs.g:2952:1: ( ';' )
            // InternalXemfs.g:2953:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getSemicolonKeyword_4_2()); 
            }
            match(input,9,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getSemicolonKeyword_4_2()); 
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
    // $ANTLR end "rule__EmfsRoot__Group_4__2__Impl"


    // $ANTLR start "rule__EmfsName__Group__0"
    // InternalXemfs.g:2972:1: rule__EmfsName__Group__0 : rule__EmfsName__Group__0__Impl rule__EmfsName__Group__1 ;
    public final void rule__EmfsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2976:1: ( rule__EmfsName__Group__0__Impl rule__EmfsName__Group__1 )
            // InternalXemfs.g:2977:2: rule__EmfsName__Group__0__Impl rule__EmfsName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__EmfsName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsName__Group__0"


    // $ANTLR start "rule__EmfsName__Group__0__Impl"
    // InternalXemfs.g:2984:1: rule__EmfsName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__EmfsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:2988:1: ( ( RULE_ID ) )
            // InternalXemfs.g:2989:1: ( RULE_ID )
            {
            // InternalXemfs.g:2989:1: ( RULE_ID )
            // InternalXemfs.g:2990:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__EmfsName__Group__0__Impl"


    // $ANTLR start "rule__EmfsName__Group__1"
    // InternalXemfs.g:3001:1: rule__EmfsName__Group__1 : rule__EmfsName__Group__1__Impl ;
    public final void rule__EmfsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3005:1: ( rule__EmfsName__Group__1__Impl )
            // InternalXemfs.g:3006:2: rule__EmfsName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsName__Group__1"


    // $ANTLR start "rule__EmfsName__Group__1__Impl"
    // InternalXemfs.g:3012:1: rule__EmfsName__Group__1__Impl : ( ( rule__EmfsName__Group_1__0 )* ) ;
    public final void rule__EmfsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3016:1: ( ( ( rule__EmfsName__Group_1__0 )* ) )
            // InternalXemfs.g:3017:1: ( ( rule__EmfsName__Group_1__0 )* )
            {
            // InternalXemfs.g:3017:1: ( ( rule__EmfsName__Group_1__0 )* )
            // InternalXemfs.g:3018:1: ( rule__EmfsName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getGroup_1()); 
            }
            // InternalXemfs.g:3019:1: ( rule__EmfsName__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==38) ) {
                    int LA46_2 = input.LA(2);

                    if ( (LA46_2==RULE_ID) ) {
                        int LA46_3 = input.LA(3);

                        if ( (synpred105_InternalXemfs()) ) {
                            alt46=1;
                        }


                    }


                }


                switch (alt46) {
            	case 1 :
            	    // InternalXemfs.g:3019:2: rule__EmfsName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__EmfsName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__EmfsName__Group__1__Impl"


    // $ANTLR start "rule__EmfsName__Group_1__0"
    // InternalXemfs.g:3033:1: rule__EmfsName__Group_1__0 : rule__EmfsName__Group_1__0__Impl rule__EmfsName__Group_1__1 ;
    public final void rule__EmfsName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3037:1: ( rule__EmfsName__Group_1__0__Impl rule__EmfsName__Group_1__1 )
            // InternalXemfs.g:3038:2: rule__EmfsName__Group_1__0__Impl rule__EmfsName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__EmfsName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsName__Group_1__0"


    // $ANTLR start "rule__EmfsName__Group_1__0__Impl"
    // InternalXemfs.g:3045:1: rule__EmfsName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EmfsName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3049:1: ( ( '.' ) )
            // InternalXemfs.g:3050:1: ( '.' )
            {
            // InternalXemfs.g:3050:1: ( '.' )
            // InternalXemfs.g:3051:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__EmfsName__Group_1__0__Impl"


    // $ANTLR start "rule__EmfsName__Group_1__1"
    // InternalXemfs.g:3064:1: rule__EmfsName__Group_1__1 : rule__EmfsName__Group_1__1__Impl ;
    public final void rule__EmfsName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3068:1: ( rule__EmfsName__Group_1__1__Impl )
            // InternalXemfs.g:3069:2: rule__EmfsName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsName__Group_1__1"


    // $ANTLR start "rule__EmfsName__Group_1__1__Impl"
    // InternalXemfs.g:3075:1: rule__EmfsName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__EmfsName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3079:1: ( ( RULE_ID ) )
            // InternalXemfs.g:3080:1: ( RULE_ID )
            {
            // InternalXemfs.g:3080:1: ( RULE_ID )
            // InternalXemfs.g:3081:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__EmfsName__Group_1__1__Impl"


    // $ANTLR start "rule__EmfsResourcesRef__Group__0"
    // InternalXemfs.g:3096:1: rule__EmfsResourcesRef__Group__0 : rule__EmfsResourcesRef__Group__0__Impl rule__EmfsResourcesRef__Group__1 ;
    public final void rule__EmfsResourcesRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3100:1: ( rule__EmfsResourcesRef__Group__0__Impl rule__EmfsResourcesRef__Group__1 )
            // InternalXemfs.g:3101:2: rule__EmfsResourcesRef__Group__0__Impl rule__EmfsResourcesRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EmfsResourcesRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsResourcesRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsResourcesRef__Group__0"


    // $ANTLR start "rule__EmfsResourcesRef__Group__0__Impl"
    // InternalXemfs.g:3108:1: rule__EmfsResourcesRef__Group__0__Impl : ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) ) ;
    public final void rule__EmfsResourcesRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3112:1: ( ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) ) )
            // InternalXemfs.g:3113:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) )
            {
            // InternalXemfs.g:3113:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) )
            // InternalXemfs.g:3114:1: ( rule__EmfsResourcesRef__ResourcesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesAssignment_0()); 
            }
            // InternalXemfs.g:3115:1: ( rule__EmfsResourcesRef__ResourcesAssignment_0 )
            // InternalXemfs.g:3115:2: rule__EmfsResourcesRef__ResourcesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsResourcesRef__ResourcesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefAccess().getResourcesAssignment_0()); 
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
    // $ANTLR end "rule__EmfsResourcesRef__Group__0__Impl"


    // $ANTLR start "rule__EmfsResourcesRef__Group__1"
    // InternalXemfs.g:3125:1: rule__EmfsResourcesRef__Group__1 : rule__EmfsResourcesRef__Group__1__Impl ;
    public final void rule__EmfsResourcesRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3129:1: ( rule__EmfsResourcesRef__Group__1__Impl )
            // InternalXemfs.g:3130:2: rule__EmfsResourcesRef__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsResourcesRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsResourcesRef__Group__1"


    // $ANTLR start "rule__EmfsResourcesRef__Group__1__Impl"
    // InternalXemfs.g:3136:1: rule__EmfsResourcesRef__Group__1__Impl : ( ( rule__EmfsResourcesRef__Group_1__0 )* ) ;
    public final void rule__EmfsResourcesRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3140:1: ( ( ( rule__EmfsResourcesRef__Group_1__0 )* ) )
            // InternalXemfs.g:3141:1: ( ( rule__EmfsResourcesRef__Group_1__0 )* )
            {
            // InternalXemfs.g:3141:1: ( ( rule__EmfsResourcesRef__Group_1__0 )* )
            // InternalXemfs.g:3142:1: ( rule__EmfsResourcesRef__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getGroup_1()); 
            }
            // InternalXemfs.g:3143:1: ( rule__EmfsResourcesRef__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==39) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalXemfs.g:3143:2: rule__EmfsResourcesRef__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__EmfsResourcesRef__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefAccess().getGroup_1()); 
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
    // $ANTLR end "rule__EmfsResourcesRef__Group__1__Impl"


    // $ANTLR start "rule__EmfsResourcesRef__Group_1__0"
    // InternalXemfs.g:3157:1: rule__EmfsResourcesRef__Group_1__0 : rule__EmfsResourcesRef__Group_1__0__Impl rule__EmfsResourcesRef__Group_1__1 ;
    public final void rule__EmfsResourcesRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3161:1: ( rule__EmfsResourcesRef__Group_1__0__Impl rule__EmfsResourcesRef__Group_1__1 )
            // InternalXemfs.g:3162:2: rule__EmfsResourcesRef__Group_1__0__Impl rule__EmfsResourcesRef__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__EmfsResourcesRef__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsResourcesRef__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsResourcesRef__Group_1__0"


    // $ANTLR start "rule__EmfsResourcesRef__Group_1__0__Impl"
    // InternalXemfs.g:3169:1: rule__EmfsResourcesRef__Group_1__0__Impl : ( ',' ) ;
    public final void rule__EmfsResourcesRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3173:1: ( ( ',' ) )
            // InternalXemfs.g:3174:1: ( ',' )
            {
            // InternalXemfs.g:3174:1: ( ',' )
            // InternalXemfs.g:3175:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getCommaKeyword_1_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__EmfsResourcesRef__Group_1__0__Impl"


    // $ANTLR start "rule__EmfsResourcesRef__Group_1__1"
    // InternalXemfs.g:3188:1: rule__EmfsResourcesRef__Group_1__1 : rule__EmfsResourcesRef__Group_1__1__Impl ;
    public final void rule__EmfsResourcesRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3192:1: ( rule__EmfsResourcesRef__Group_1__1__Impl )
            // InternalXemfs.g:3193:2: rule__EmfsResourcesRef__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsResourcesRef__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsResourcesRef__Group_1__1"


    // $ANTLR start "rule__EmfsResourcesRef__Group_1__1__Impl"
    // InternalXemfs.g:3199:1: rule__EmfsResourcesRef__Group_1__1__Impl : ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) ) ;
    public final void rule__EmfsResourcesRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3203:1: ( ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) ) )
            // InternalXemfs.g:3204:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) )
            {
            // InternalXemfs.g:3204:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) )
            // InternalXemfs.g:3205:1: ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesAssignment_1_1()); 
            }
            // InternalXemfs.g:3206:1: ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 )
            // InternalXemfs.g:3206:2: rule__EmfsResourcesRef__ResourcesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsResourcesRef__ResourcesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefAccess().getResourcesAssignment_1_1()); 
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
    // $ANTLR end "rule__EmfsResourcesRef__Group_1__1__Impl"


    // $ANTLR start "rule__ResourceName__Group__0"
    // InternalXemfs.g:3220:1: rule__ResourceName__Group__0 : rule__ResourceName__Group__0__Impl rule__ResourceName__Group__1 ;
    public final void rule__ResourceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3224:1: ( rule__ResourceName__Group__0__Impl rule__ResourceName__Group__1 )
            // InternalXemfs.g:3225:2: rule__ResourceName__Group__0__Impl rule__ResourceName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ResourceName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ResourceName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceName__Group__0"


    // $ANTLR start "rule__ResourceName__Group__0__Impl"
    // InternalXemfs.g:3232:1: rule__ResourceName__Group__0__Impl : ( ( '.' )? ) ;
    public final void rule__ResourceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3236:1: ( ( ( '.' )? ) )
            // InternalXemfs.g:3237:1: ( ( '.' )? )
            {
            // InternalXemfs.g:3237:1: ( ( '.' )? )
            // InternalXemfs.g:3238:1: ( '.' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getFullStopKeyword_0()); 
            }
            // InternalXemfs.g:3239:1: ( '.' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXemfs.g:3240:2: '.'
                    {
                    match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResourceNameAccess().getFullStopKeyword_0()); 
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
    // $ANTLR end "rule__ResourceName__Group__0__Impl"


    // $ANTLR start "rule__ResourceName__Group__1"
    // InternalXemfs.g:3251:1: rule__ResourceName__Group__1 : rule__ResourceName__Group__1__Impl rule__ResourceName__Group__2 ;
    public final void rule__ResourceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3255:1: ( rule__ResourceName__Group__1__Impl rule__ResourceName__Group__2 )
            // InternalXemfs.g:3256:2: rule__ResourceName__Group__1__Impl rule__ResourceName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__ResourceName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ResourceName__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceName__Group__1"


    // $ANTLR start "rule__ResourceName__Group__1__Impl"
    // InternalXemfs.g:3263:1: rule__ResourceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__ResourceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3267:1: ( ( RULE_ID ) )
            // InternalXemfs.g:3268:1: ( RULE_ID )
            {
            // InternalXemfs.g:3268:1: ( RULE_ID )
            // InternalXemfs.g:3269:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResourceNameAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__ResourceName__Group__1__Impl"


    // $ANTLR start "rule__ResourceName__Group__2"
    // InternalXemfs.g:3280:1: rule__ResourceName__Group__2 : rule__ResourceName__Group__2__Impl ;
    public final void rule__ResourceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3284:1: ( rule__ResourceName__Group__2__Impl )
            // InternalXemfs.g:3285:2: rule__ResourceName__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ResourceName__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceName__Group__2"


    // $ANTLR start "rule__ResourceName__Group__2__Impl"
    // InternalXemfs.g:3291:1: rule__ResourceName__Group__2__Impl : ( ( rule__ResourceName__Group_2__0 )* ) ;
    public final void rule__ResourceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3295:1: ( ( ( rule__ResourceName__Group_2__0 )* ) )
            // InternalXemfs.g:3296:1: ( ( rule__ResourceName__Group_2__0 )* )
            {
            // InternalXemfs.g:3296:1: ( ( rule__ResourceName__Group_2__0 )* )
            // InternalXemfs.g:3297:1: ( rule__ResourceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getGroup_2()); 
            }
            // InternalXemfs.g:3298:1: ( rule__ResourceName__Group_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==38) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalXemfs.g:3298:2: rule__ResourceName__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__ResourceName__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResourceNameAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ResourceName__Group__2__Impl"


    // $ANTLR start "rule__ResourceName__Group_2__0"
    // InternalXemfs.g:3314:1: rule__ResourceName__Group_2__0 : rule__ResourceName__Group_2__0__Impl rule__ResourceName__Group_2__1 ;
    public final void rule__ResourceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3318:1: ( rule__ResourceName__Group_2__0__Impl rule__ResourceName__Group_2__1 )
            // InternalXemfs.g:3319:2: rule__ResourceName__Group_2__0__Impl rule__ResourceName__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__ResourceName__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ResourceName__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceName__Group_2__0"


    // $ANTLR start "rule__ResourceName__Group_2__0__Impl"
    // InternalXemfs.g:3326:1: rule__ResourceName__Group_2__0__Impl : ( '.' ) ;
    public final void rule__ResourceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3330:1: ( ( '.' ) )
            // InternalXemfs.g:3331:1: ( '.' )
            {
            // InternalXemfs.g:3331:1: ( '.' )
            // InternalXemfs.g:3332:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getFullStopKeyword_2_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResourceNameAccess().getFullStopKeyword_2_0()); 
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
    // $ANTLR end "rule__ResourceName__Group_2__0__Impl"


    // $ANTLR start "rule__ResourceName__Group_2__1"
    // InternalXemfs.g:3345:1: rule__ResourceName__Group_2__1 : rule__ResourceName__Group_2__1__Impl ;
    public final void rule__ResourceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3349:1: ( rule__ResourceName__Group_2__1__Impl )
            // InternalXemfs.g:3350:2: rule__ResourceName__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ResourceName__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceName__Group_2__1"


    // $ANTLR start "rule__ResourceName__Group_2__1__Impl"
    // InternalXemfs.g:3356:1: rule__ResourceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__ResourceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3360:1: ( ( RULE_ID ) )
            // InternalXemfs.g:3361:1: ( RULE_ID )
            {
            // InternalXemfs.g:3361:1: ( RULE_ID )
            // InternalXemfs.g:3362:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResourceNameAccess().getIDTerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__ResourceName__Group_2__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalXemfs.g:3377:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3381:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalXemfs.g:3382:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalXemfs.g:3389:1: rule__Property__Group__0__Impl : ( '$' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3393:1: ( ( '$' ) )
            // InternalXemfs.g:3394:1: ( '$' )
            {
            // InternalXemfs.g:3394:1: ( '$' )
            // InternalXemfs.g:3395:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getDollarSignKeyword_0()); 
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
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalXemfs.g:3408:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3412:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalXemfs.g:3413:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalXemfs.g:3420:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3424:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalXemfs.g:3425:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalXemfs.g:3425:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalXemfs.g:3426:1: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // InternalXemfs.g:3427:1: ( rule__Property__NameAssignment_1 )
            // InternalXemfs.g:3427:2: rule__Property__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalXemfs.g:3437:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3441:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalXemfs.g:3442:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalXemfs.g:3449:1: rule__Property__Group__2__Impl : ( '=' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3453:1: ( ( '=' ) )
            // InternalXemfs.g:3454:1: ( '=' )
            {
            // InternalXemfs.g:3454:1: ( '=' )
            // InternalXemfs.g:3455:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalXemfs.g:3468:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3472:1: ( rule__Property__Group__3__Impl )
            // InternalXemfs.g:3473:2: rule__Property__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalXemfs.g:3479:1: rule__Property__Group__3__Impl : ( ( rule__Property__ValueAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3483:1: ( ( ( rule__Property__ValueAssignment_3 ) ) )
            // InternalXemfs.g:3484:1: ( ( rule__Property__ValueAssignment_3 ) )
            {
            // InternalXemfs.g:3484:1: ( ( rule__Property__ValueAssignment_3 ) )
            // InternalXemfs.g:3485:1: ( rule__Property__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAssignment_3()); 
            }
            // InternalXemfs.g:3486:1: ( rule__Property__ValueAssignment_3 )
            // InternalXemfs.g:3486:2: rule__Property__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueAssignment_3()); 
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
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__FolderName__Group__0"
    // InternalXemfs.g:3504:1: rule__FolderName__Group__0 : rule__FolderName__Group__0__Impl rule__FolderName__Group__1 ;
    public final void rule__FolderName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3508:1: ( rule__FolderName__Group__0__Impl rule__FolderName__Group__1 )
            // InternalXemfs.g:3509:2: rule__FolderName__Group__0__Impl rule__FolderName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__FolderName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FolderName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FolderName__Group__0"


    // $ANTLR start "rule__FolderName__Group__0__Impl"
    // InternalXemfs.g:3516:1: rule__FolderName__Group__0__Impl : ( ruleResourceName ) ;
    public final void rule__FolderName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3520:1: ( ( ruleResourceName ) )
            // InternalXemfs.g:3521:1: ( ruleResourceName )
            {
            // InternalXemfs.g:3521:1: ( ruleResourceName )
            // InternalXemfs.g:3522:1: ruleResourceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFolderNameAccess().getResourceNameParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleResourceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFolderNameAccess().getResourceNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__FolderName__Group__0__Impl"


    // $ANTLR start "rule__FolderName__Group__1"
    // InternalXemfs.g:3533:1: rule__FolderName__Group__1 : rule__FolderName__Group__1__Impl ;
    public final void rule__FolderName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3537:1: ( rule__FolderName__Group__1__Impl )
            // InternalXemfs.g:3538:2: rule__FolderName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FolderName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FolderName__Group__1"


    // $ANTLR start "rule__FolderName__Group__1__Impl"
    // InternalXemfs.g:3544:1: rule__FolderName__Group__1__Impl : ( '/' ) ;
    public final void rule__FolderName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3548:1: ( ( '/' ) )
            // InternalXemfs.g:3549:1: ( '/' )
            {
            // InternalXemfs.g:3549:1: ( '/' )
            // InternalXemfs.g:3550:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFolderNameAccess().getSolidusKeyword_1()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFolderNameAccess().getSolidusKeyword_1()); 
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
    // $ANTLR end "rule__FolderName__Group__1__Impl"


    // $ANTLR start "rule__EmfsContainer__Group__0"
    // InternalXemfs.g:3567:1: rule__EmfsContainer__Group__0 : rule__EmfsContainer__Group__0__Impl rule__EmfsContainer__Group__1 ;
    public final void rule__EmfsContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3571:1: ( rule__EmfsContainer__Group__0__Impl rule__EmfsContainer__Group__1 )
            // InternalXemfs.g:3572:2: rule__EmfsContainer__Group__0__Impl rule__EmfsContainer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__EmfsContainer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group__0"


    // $ANTLR start "rule__EmfsContainer__Group__0__Impl"
    // InternalXemfs.g:3579:1: rule__EmfsContainer__Group__0__Impl : ( ( rule__EmfsContainer__NameAssignment_0 ) ) ;
    public final void rule__EmfsContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3583:1: ( ( ( rule__EmfsContainer__NameAssignment_0 ) ) )
            // InternalXemfs.g:3584:1: ( ( rule__EmfsContainer__NameAssignment_0 ) )
            {
            // InternalXemfs.g:3584:1: ( ( rule__EmfsContainer__NameAssignment_0 ) )
            // InternalXemfs.g:3585:1: ( rule__EmfsContainer__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getNameAssignment_0()); 
            }
            // InternalXemfs.g:3586:1: ( rule__EmfsContainer__NameAssignment_0 )
            // InternalXemfs.g:3586:2: rule__EmfsContainer__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__EmfsContainer__Group__0__Impl"


    // $ANTLR start "rule__EmfsContainer__Group__1"
    // InternalXemfs.g:3596:1: rule__EmfsContainer__Group__1 : rule__EmfsContainer__Group__1__Impl rule__EmfsContainer__Group__2 ;
    public final void rule__EmfsContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3600:1: ( rule__EmfsContainer__Group__1__Impl rule__EmfsContainer__Group__2 )
            // InternalXemfs.g:3601:2: rule__EmfsContainer__Group__1__Impl rule__EmfsContainer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__EmfsContainer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group__1"


    // $ANTLR start "rule__EmfsContainer__Group__1__Impl"
    // InternalXemfs.g:3608:1: rule__EmfsContainer__Group__1__Impl : ( ( rule__EmfsContainer__Group_1__0 )* ) ;
    public final void rule__EmfsContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3612:1: ( ( ( rule__EmfsContainer__Group_1__0 )* ) )
            // InternalXemfs.g:3613:1: ( ( rule__EmfsContainer__Group_1__0 )* )
            {
            // InternalXemfs.g:3613:1: ( ( rule__EmfsContainer__Group_1__0 )* )
            // InternalXemfs.g:3614:1: ( rule__EmfsContainer__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getGroup_1()); 
            }
            // InternalXemfs.g:3615:1: ( rule__EmfsContainer__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==36) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalXemfs.g:3615:2: rule__EmfsContainer__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__EmfsContainer__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getGroup_1()); 
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
    // $ANTLR end "rule__EmfsContainer__Group__1__Impl"


    // $ANTLR start "rule__EmfsContainer__Group__2"
    // InternalXemfs.g:3625:1: rule__EmfsContainer__Group__2 : rule__EmfsContainer__Group__2__Impl rule__EmfsContainer__Group__3 ;
    public final void rule__EmfsContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3629:1: ( rule__EmfsContainer__Group__2__Impl rule__EmfsContainer__Group__3 )
            // InternalXemfs.g:3630:2: rule__EmfsContainer__Group__2__Impl rule__EmfsContainer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__EmfsContainer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group__2"


    // $ANTLR start "rule__EmfsContainer__Group__2__Impl"
    // InternalXemfs.g:3637:1: rule__EmfsContainer__Group__2__Impl : ( ( rule__EmfsContainer__PropertiesAssignment_2 )* ) ;
    public final void rule__EmfsContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3641:1: ( ( ( rule__EmfsContainer__PropertiesAssignment_2 )* ) )
            // InternalXemfs.g:3642:1: ( ( rule__EmfsContainer__PropertiesAssignment_2 )* )
            {
            // InternalXemfs.g:3642:1: ( ( rule__EmfsContainer__PropertiesAssignment_2 )* )
            // InternalXemfs.g:3643:1: ( rule__EmfsContainer__PropertiesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getPropertiesAssignment_2()); 
            }
            // InternalXemfs.g:3644:1: ( rule__EmfsContainer__PropertiesAssignment_2 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==40) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalXemfs.g:3644:2: rule__EmfsContainer__PropertiesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__EmfsContainer__PropertiesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getPropertiesAssignment_2()); 
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
    // $ANTLR end "rule__EmfsContainer__Group__2__Impl"


    // $ANTLR start "rule__EmfsContainer__Group__3"
    // InternalXemfs.g:3654:1: rule__EmfsContainer__Group__3 : rule__EmfsContainer__Group__3__Impl rule__EmfsContainer__Group__4 ;
    public final void rule__EmfsContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3658:1: ( rule__EmfsContainer__Group__3__Impl rule__EmfsContainer__Group__4 )
            // InternalXemfs.g:3659:2: rule__EmfsContainer__Group__3__Impl rule__EmfsContainer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__EmfsContainer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group__3"


    // $ANTLR start "rule__EmfsContainer__Group__3__Impl"
    // InternalXemfs.g:3666:1: rule__EmfsContainer__Group__3__Impl : ( ( rule__EmfsContainer__Group_3__0 )? ) ;
    public final void rule__EmfsContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3670:1: ( ( ( rule__EmfsContainer__Group_3__0 )? ) )
            // InternalXemfs.g:3671:1: ( ( rule__EmfsContainer__Group_3__0 )? )
            {
            // InternalXemfs.g:3671:1: ( ( rule__EmfsContainer__Group_3__0 )? )
            // InternalXemfs.g:3672:1: ( rule__EmfsContainer__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getGroup_3()); 
            }
            // InternalXemfs.g:3673:1: ( rule__EmfsContainer__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==37) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalXemfs.g:3673:2: rule__EmfsContainer__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EmfsContainer__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getGroup_3()); 
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
    // $ANTLR end "rule__EmfsContainer__Group__3__Impl"


    // $ANTLR start "rule__EmfsContainer__Group__4"
    // InternalXemfs.g:3683:1: rule__EmfsContainer__Group__4 : rule__EmfsContainer__Group__4__Impl rule__EmfsContainer__Group__5 ;
    public final void rule__EmfsContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3687:1: ( rule__EmfsContainer__Group__4__Impl rule__EmfsContainer__Group__5 )
            // InternalXemfs.g:3688:2: rule__EmfsContainer__Group__4__Impl rule__EmfsContainer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__EmfsContainer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group__4"


    // $ANTLR start "rule__EmfsContainer__Group__4__Impl"
    // InternalXemfs.g:3695:1: rule__EmfsContainer__Group__4__Impl : ( ( rule__EmfsContainer__ResourcesAssignment_4 )* ) ;
    public final void rule__EmfsContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3699:1: ( ( ( rule__EmfsContainer__ResourcesAssignment_4 )* ) )
            // InternalXemfs.g:3700:1: ( ( rule__EmfsContainer__ResourcesAssignment_4 )* )
            {
            // InternalXemfs.g:3700:1: ( ( rule__EmfsContainer__ResourcesAssignment_4 )* )
            // InternalXemfs.g:3701:1: ( rule__EmfsContainer__ResourcesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getResourcesAssignment_4()); 
            }
            // InternalXemfs.g:3702:1: ( rule__EmfsContainer__ResourcesAssignment_4 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==38) ) {
                    int LA53_2 = input.LA(2);

                    if ( (synpred112_InternalXemfs()) ) {
                        alt53=1;
                    }


                }
                else if ( (LA53_0==RULE_ID) ) {
                    int LA53_3 = input.LA(2);

                    if ( (synpred112_InternalXemfs()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // InternalXemfs.g:3702:2: rule__EmfsContainer__ResourcesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__EmfsContainer__ResourcesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getResourcesAssignment_4()); 
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
    // $ANTLR end "rule__EmfsContainer__Group__4__Impl"


    // $ANTLR start "rule__EmfsContainer__Group__5"
    // InternalXemfs.g:3712:1: rule__EmfsContainer__Group__5 : rule__EmfsContainer__Group__5__Impl ;
    public final void rule__EmfsContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3716:1: ( rule__EmfsContainer__Group__5__Impl )
            // InternalXemfs.g:3717:2: rule__EmfsContainer__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group__5"


    // $ANTLR start "rule__EmfsContainer__Group__5__Impl"
    // InternalXemfs.g:3723:1: rule__EmfsContainer__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__EmfsContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3727:1: ( ( ( ';' )? ) )
            // InternalXemfs.g:3728:1: ( ( ';' )? )
            {
            // InternalXemfs.g:3728:1: ( ( ';' )? )
            // InternalXemfs.g:3729:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_5()); 
            }
            // InternalXemfs.g:3730:1: ( ';' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==9) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred113_InternalXemfs()) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // InternalXemfs.g:3731:2: ';'
                    {
                    match(input,9,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__EmfsContainer__Group__5__Impl"


    // $ANTLR start "rule__EmfsContainer__Group_1__0"
    // InternalXemfs.g:3754:1: rule__EmfsContainer__Group_1__0 : rule__EmfsContainer__Group_1__0__Impl rule__EmfsContainer__Group_1__1 ;
    public final void rule__EmfsContainer__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3758:1: ( rule__EmfsContainer__Group_1__0__Impl rule__EmfsContainer__Group_1__1 )
            // InternalXemfs.g:3759:2: rule__EmfsContainer__Group_1__0__Impl rule__EmfsContainer__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__EmfsContainer__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group_1__0"


    // $ANTLR start "rule__EmfsContainer__Group_1__0__Impl"
    // InternalXemfs.g:3766:1: rule__EmfsContainer__Group_1__0__Impl : ( '#' ) ;
    public final void rule__EmfsContainer__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3770:1: ( ( '#' ) )
            // InternalXemfs.g:3771:1: ( '#' )
            {
            // InternalXemfs.g:3771:1: ( '#' )
            // InternalXemfs.g:3772:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getNumberSignKeyword_1_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getNumberSignKeyword_1_0()); 
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
    // $ANTLR end "rule__EmfsContainer__Group_1__0__Impl"


    // $ANTLR start "rule__EmfsContainer__Group_1__1"
    // InternalXemfs.g:3785:1: rule__EmfsContainer__Group_1__1 : rule__EmfsContainer__Group_1__1__Impl ;
    public final void rule__EmfsContainer__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3789:1: ( rule__EmfsContainer__Group_1__1__Impl )
            // InternalXemfs.g:3790:2: rule__EmfsContainer__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group_1__1"


    // $ANTLR start "rule__EmfsContainer__Group_1__1__Impl"
    // InternalXemfs.g:3796:1: rule__EmfsContainer__Group_1__1__Impl : ( ( rule__EmfsContainer__TagsAssignment_1_1 ) ) ;
    public final void rule__EmfsContainer__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3800:1: ( ( ( rule__EmfsContainer__TagsAssignment_1_1 ) ) )
            // InternalXemfs.g:3801:1: ( ( rule__EmfsContainer__TagsAssignment_1_1 ) )
            {
            // InternalXemfs.g:3801:1: ( ( rule__EmfsContainer__TagsAssignment_1_1 ) )
            // InternalXemfs.g:3802:1: ( rule__EmfsContainer__TagsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getTagsAssignment_1_1()); 
            }
            // InternalXemfs.g:3803:1: ( rule__EmfsContainer__TagsAssignment_1_1 )
            // InternalXemfs.g:3803:2: rule__EmfsContainer__TagsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__TagsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getTagsAssignment_1_1()); 
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
    // $ANTLR end "rule__EmfsContainer__Group_1__1__Impl"


    // $ANTLR start "rule__EmfsContainer__Group_3__0"
    // InternalXemfs.g:3817:1: rule__EmfsContainer__Group_3__0 : rule__EmfsContainer__Group_3__0__Impl rule__EmfsContainer__Group_3__1 ;
    public final void rule__EmfsContainer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3821:1: ( rule__EmfsContainer__Group_3__0__Impl rule__EmfsContainer__Group_3__1 )
            // InternalXemfs.g:3822:2: rule__EmfsContainer__Group_3__0__Impl rule__EmfsContainer__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__EmfsContainer__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group_3__0"


    // $ANTLR start "rule__EmfsContainer__Group_3__0__Impl"
    // InternalXemfs.g:3829:1: rule__EmfsContainer__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EmfsContainer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3833:1: ( ( 'extends' ) )
            // InternalXemfs.g:3834:1: ( 'extends' )
            {
            // InternalXemfs.g:3834:1: ( 'extends' )
            // InternalXemfs.g:3835:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getExtendsKeyword_3_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getExtendsKeyword_3_0()); 
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
    // $ANTLR end "rule__EmfsContainer__Group_3__0__Impl"


    // $ANTLR start "rule__EmfsContainer__Group_3__1"
    // InternalXemfs.g:3848:1: rule__EmfsContainer__Group_3__1 : rule__EmfsContainer__Group_3__1__Impl rule__EmfsContainer__Group_3__2 ;
    public final void rule__EmfsContainer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3852:1: ( rule__EmfsContainer__Group_3__1__Impl rule__EmfsContainer__Group_3__2 )
            // InternalXemfs.g:3853:2: rule__EmfsContainer__Group_3__1__Impl rule__EmfsContainer__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__EmfsContainer__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group_3__1"


    // $ANTLR start "rule__EmfsContainer__Group_3__1__Impl"
    // InternalXemfs.g:3860:1: rule__EmfsContainer__Group_3__1__Impl : ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) ) ;
    public final void rule__EmfsContainer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3864:1: ( ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) ) )
            // InternalXemfs.g:3865:1: ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) )
            {
            // InternalXemfs.g:3865:1: ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) )
            // InternalXemfs.g:3866:1: ( rule__EmfsContainer__ContentProviderAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getContentProviderAssignment_3_1()); 
            }
            // InternalXemfs.g:3867:1: ( rule__EmfsContainer__ContentProviderAssignment_3_1 )
            // InternalXemfs.g:3867:2: rule__EmfsContainer__ContentProviderAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__ContentProviderAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getContentProviderAssignment_3_1()); 
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
    // $ANTLR end "rule__EmfsContainer__Group_3__1__Impl"


    // $ANTLR start "rule__EmfsContainer__Group_3__2"
    // InternalXemfs.g:3877:1: rule__EmfsContainer__Group_3__2 : rule__EmfsContainer__Group_3__2__Impl ;
    public final void rule__EmfsContainer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3881:1: ( rule__EmfsContainer__Group_3__2__Impl )
            // InternalXemfs.g:3882:2: rule__EmfsContainer__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsContainer__Group_3__2"


    // $ANTLR start "rule__EmfsContainer__Group_3__2__Impl"
    // InternalXemfs.g:3888:1: rule__EmfsContainer__Group_3__2__Impl : ( ';' ) ;
    public final void rule__EmfsContainer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3892:1: ( ( ';' ) )
            // InternalXemfs.g:3893:1: ( ';' )
            {
            // InternalXemfs.g:3893:1: ( ';' )
            // InternalXemfs.g:3894:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,9,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_3_2()); 
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
    // $ANTLR end "rule__EmfsContainer__Group_3__2__Impl"


    // $ANTLR start "rule__EmfsFile__Group__0"
    // InternalXemfs.g:3913:1: rule__EmfsFile__Group__0 : rule__EmfsFile__Group__0__Impl rule__EmfsFile__Group__1 ;
    public final void rule__EmfsFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3917:1: ( rule__EmfsFile__Group__0__Impl rule__EmfsFile__Group__1 )
            // InternalXemfs.g:3918:2: rule__EmfsFile__Group__0__Impl rule__EmfsFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__EmfsFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group__0"


    // $ANTLR start "rule__EmfsFile__Group__0__Impl"
    // InternalXemfs.g:3925:1: rule__EmfsFile__Group__0__Impl : ( ( rule__EmfsFile__NameAssignment_0 ) ) ;
    public final void rule__EmfsFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3929:1: ( ( ( rule__EmfsFile__NameAssignment_0 ) ) )
            // InternalXemfs.g:3930:1: ( ( rule__EmfsFile__NameAssignment_0 ) )
            {
            // InternalXemfs.g:3930:1: ( ( rule__EmfsFile__NameAssignment_0 ) )
            // InternalXemfs.g:3931:1: ( rule__EmfsFile__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getNameAssignment_0()); 
            }
            // InternalXemfs.g:3932:1: ( rule__EmfsFile__NameAssignment_0 )
            // InternalXemfs.g:3932:2: rule__EmfsFile__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__EmfsFile__Group__0__Impl"


    // $ANTLR start "rule__EmfsFile__Group__1"
    // InternalXemfs.g:3942:1: rule__EmfsFile__Group__1 : rule__EmfsFile__Group__1__Impl rule__EmfsFile__Group__2 ;
    public final void rule__EmfsFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3946:1: ( rule__EmfsFile__Group__1__Impl rule__EmfsFile__Group__2 )
            // InternalXemfs.g:3947:2: rule__EmfsFile__Group__1__Impl rule__EmfsFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__EmfsFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group__1"


    // $ANTLR start "rule__EmfsFile__Group__1__Impl"
    // InternalXemfs.g:3954:1: rule__EmfsFile__Group__1__Impl : ( ( rule__EmfsFile__WriteableAssignment_1 )? ) ;
    public final void rule__EmfsFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3958:1: ( ( ( rule__EmfsFile__WriteableAssignment_1 )? ) )
            // InternalXemfs.g:3959:1: ( ( rule__EmfsFile__WriteableAssignment_1 )? )
            {
            // InternalXemfs.g:3959:1: ( ( rule__EmfsFile__WriteableAssignment_1 )? )
            // InternalXemfs.g:3960:1: ( rule__EmfsFile__WriteableAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getWriteableAssignment_1()); 
            }
            // InternalXemfs.g:3961:1: ( rule__EmfsFile__WriteableAssignment_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==60) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalXemfs.g:3961:2: rule__EmfsFile__WriteableAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EmfsFile__WriteableAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getWriteableAssignment_1()); 
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
    // $ANTLR end "rule__EmfsFile__Group__1__Impl"


    // $ANTLR start "rule__EmfsFile__Group__2"
    // InternalXemfs.g:3971:1: rule__EmfsFile__Group__2 : rule__EmfsFile__Group__2__Impl rule__EmfsFile__Group__3 ;
    public final void rule__EmfsFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3975:1: ( rule__EmfsFile__Group__2__Impl rule__EmfsFile__Group__3 )
            // InternalXemfs.g:3976:2: rule__EmfsFile__Group__2__Impl rule__EmfsFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__EmfsFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group__2"


    // $ANTLR start "rule__EmfsFile__Group__2__Impl"
    // InternalXemfs.g:3983:1: rule__EmfsFile__Group__2__Impl : ( ( rule__EmfsFile__Group_2__0 )* ) ;
    public final void rule__EmfsFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:3987:1: ( ( ( rule__EmfsFile__Group_2__0 )* ) )
            // InternalXemfs.g:3988:1: ( ( rule__EmfsFile__Group_2__0 )* )
            {
            // InternalXemfs.g:3988:1: ( ( rule__EmfsFile__Group_2__0 )* )
            // InternalXemfs.g:3989:1: ( rule__EmfsFile__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getGroup_2()); 
            }
            // InternalXemfs.g:3990:1: ( rule__EmfsFile__Group_2__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==36) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalXemfs.g:3990:2: rule__EmfsFile__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__EmfsFile__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getGroup_2()); 
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
    // $ANTLR end "rule__EmfsFile__Group__2__Impl"


    // $ANTLR start "rule__EmfsFile__Group__3"
    // InternalXemfs.g:4000:1: rule__EmfsFile__Group__3 : rule__EmfsFile__Group__3__Impl rule__EmfsFile__Group__4 ;
    public final void rule__EmfsFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4004:1: ( rule__EmfsFile__Group__3__Impl rule__EmfsFile__Group__4 )
            // InternalXemfs.g:4005:2: rule__EmfsFile__Group__3__Impl rule__EmfsFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__EmfsFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group__3"


    // $ANTLR start "rule__EmfsFile__Group__3__Impl"
    // InternalXemfs.g:4012:1: rule__EmfsFile__Group__3__Impl : ( ( rule__EmfsFile__PropertiesAssignment_3 )* ) ;
    public final void rule__EmfsFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4016:1: ( ( ( rule__EmfsFile__PropertiesAssignment_3 )* ) )
            // InternalXemfs.g:4017:1: ( ( rule__EmfsFile__PropertiesAssignment_3 )* )
            {
            // InternalXemfs.g:4017:1: ( ( rule__EmfsFile__PropertiesAssignment_3 )* )
            // InternalXemfs.g:4018:1: ( rule__EmfsFile__PropertiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getPropertiesAssignment_3()); 
            }
            // InternalXemfs.g:4019:1: ( rule__EmfsFile__PropertiesAssignment_3 )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // InternalXemfs.g:4019:2: rule__EmfsFile__PropertiesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__EmfsFile__PropertiesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getPropertiesAssignment_3()); 
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
    // $ANTLR end "rule__EmfsFile__Group__3__Impl"


    // $ANTLR start "rule__EmfsFile__Group__4"
    // InternalXemfs.g:4029:1: rule__EmfsFile__Group__4 : rule__EmfsFile__Group__4__Impl ;
    public final void rule__EmfsFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4033:1: ( rule__EmfsFile__Group__4__Impl )
            // InternalXemfs.g:4034:2: rule__EmfsFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group__4"


    // $ANTLR start "rule__EmfsFile__Group__4__Impl"
    // InternalXemfs.g:4040:1: rule__EmfsFile__Group__4__Impl : ( ( rule__EmfsFile__Alternatives_4 ) ) ;
    public final void rule__EmfsFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4044:1: ( ( ( rule__EmfsFile__Alternatives_4 ) ) )
            // InternalXemfs.g:4045:1: ( ( rule__EmfsFile__Alternatives_4 ) )
            {
            // InternalXemfs.g:4045:1: ( ( rule__EmfsFile__Alternatives_4 ) )
            // InternalXemfs.g:4046:1: ( rule__EmfsFile__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getAlternatives_4()); 
            }
            // InternalXemfs.g:4047:1: ( rule__EmfsFile__Alternatives_4 )
            // InternalXemfs.g:4047:2: rule__EmfsFile__Alternatives_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getAlternatives_4()); 
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
    // $ANTLR end "rule__EmfsFile__Group__4__Impl"


    // $ANTLR start "rule__EmfsFile__Group_2__0"
    // InternalXemfs.g:4067:1: rule__EmfsFile__Group_2__0 : rule__EmfsFile__Group_2__0__Impl rule__EmfsFile__Group_2__1 ;
    public final void rule__EmfsFile__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4071:1: ( rule__EmfsFile__Group_2__0__Impl rule__EmfsFile__Group_2__1 )
            // InternalXemfs.g:4072:2: rule__EmfsFile__Group_2__0__Impl rule__EmfsFile__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__EmfsFile__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group_2__0"


    // $ANTLR start "rule__EmfsFile__Group_2__0__Impl"
    // InternalXemfs.g:4079:1: rule__EmfsFile__Group_2__0__Impl : ( '#' ) ;
    public final void rule__EmfsFile__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4083:1: ( ( '#' ) )
            // InternalXemfs.g:4084:1: ( '#' )
            {
            // InternalXemfs.g:4084:1: ( '#' )
            // InternalXemfs.g:4085:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getNumberSignKeyword_2_0()); 
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
    // $ANTLR end "rule__EmfsFile__Group_2__0__Impl"


    // $ANTLR start "rule__EmfsFile__Group_2__1"
    // InternalXemfs.g:4098:1: rule__EmfsFile__Group_2__1 : rule__EmfsFile__Group_2__1__Impl ;
    public final void rule__EmfsFile__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4102:1: ( rule__EmfsFile__Group_2__1__Impl )
            // InternalXemfs.g:4103:2: rule__EmfsFile__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group_2__1"


    // $ANTLR start "rule__EmfsFile__Group_2__1__Impl"
    // InternalXemfs.g:4109:1: rule__EmfsFile__Group_2__1__Impl : ( ( rule__EmfsFile__TagsAssignment_2_1 ) ) ;
    public final void rule__EmfsFile__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4113:1: ( ( ( rule__EmfsFile__TagsAssignment_2_1 ) ) )
            // InternalXemfs.g:4114:1: ( ( rule__EmfsFile__TagsAssignment_2_1 ) )
            {
            // InternalXemfs.g:4114:1: ( ( rule__EmfsFile__TagsAssignment_2_1 ) )
            // InternalXemfs.g:4115:1: ( rule__EmfsFile__TagsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getTagsAssignment_2_1()); 
            }
            // InternalXemfs.g:4116:1: ( rule__EmfsFile__TagsAssignment_2_1 )
            // InternalXemfs.g:4116:2: rule__EmfsFile__TagsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__TagsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getTagsAssignment_2_1()); 
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
    // $ANTLR end "rule__EmfsFile__Group_2__1__Impl"


    // $ANTLR start "rule__EmfsFile__Group_4_0__0"
    // InternalXemfs.g:4130:1: rule__EmfsFile__Group_4_0__0 : rule__EmfsFile__Group_4_0__0__Impl rule__EmfsFile__Group_4_0__1 ;
    public final void rule__EmfsFile__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4134:1: ( rule__EmfsFile__Group_4_0__0__Impl rule__EmfsFile__Group_4_0__1 )
            // InternalXemfs.g:4135:2: rule__EmfsFile__Group_4_0__0__Impl rule__EmfsFile__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__EmfsFile__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group_4_0__0"


    // $ANTLR start "rule__EmfsFile__Group_4_0__0__Impl"
    // InternalXemfs.g:4142:1: rule__EmfsFile__Group_4_0__0__Impl : ( '@' ) ;
    public final void rule__EmfsFile__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4146:1: ( ( '@' ) )
            // InternalXemfs.g:4147:1: ( '@' )
            {
            // InternalXemfs.g:4147:1: ( '@' )
            // InternalXemfs.g:4148:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getCommercialAtKeyword_4_0_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getCommercialAtKeyword_4_0_0()); 
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
    // $ANTLR end "rule__EmfsFile__Group_4_0__0__Impl"


    // $ANTLR start "rule__EmfsFile__Group_4_0__1"
    // InternalXemfs.g:4161:1: rule__EmfsFile__Group_4_0__1 : rule__EmfsFile__Group_4_0__1__Impl rule__EmfsFile__Group_4_0__2 ;
    public final void rule__EmfsFile__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4165:1: ( rule__EmfsFile__Group_4_0__1__Impl rule__EmfsFile__Group_4_0__2 )
            // InternalXemfs.g:4166:2: rule__EmfsFile__Group_4_0__1__Impl rule__EmfsFile__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__EmfsFile__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group_4_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group_4_0__1"


    // $ANTLR start "rule__EmfsFile__Group_4_0__1__Impl"
    // InternalXemfs.g:4173:1: rule__EmfsFile__Group_4_0__1__Impl : ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) ) ;
    public final void rule__EmfsFile__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4177:1: ( ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) ) )
            // InternalXemfs.g:4178:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) )
            {
            // InternalXemfs.g:4178:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) )
            // InternalXemfs.g:4179:1: ( rule__EmfsFile__ContentProviderAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_0_1()); 
            }
            // InternalXemfs.g:4180:1: ( rule__EmfsFile__ContentProviderAssignment_4_0_1 )
            // InternalXemfs.g:4180:2: rule__EmfsFile__ContentProviderAssignment_4_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__ContentProviderAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_0_1()); 
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
    // $ANTLR end "rule__EmfsFile__Group_4_0__1__Impl"


    // $ANTLR start "rule__EmfsFile__Group_4_0__2"
    // InternalXemfs.g:4190:1: rule__EmfsFile__Group_4_0__2 : rule__EmfsFile__Group_4_0__2__Impl ;
    public final void rule__EmfsFile__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4194:1: ( rule__EmfsFile__Group_4_0__2__Impl )
            // InternalXemfs.g:4195:2: rule__EmfsFile__Group_4_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group_4_0__2"


    // $ANTLR start "rule__EmfsFile__Group_4_0__2__Impl"
    // InternalXemfs.g:4201:1: rule__EmfsFile__Group_4_0__2__Impl : ( ';' ) ;
    public final void rule__EmfsFile__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4205:1: ( ( ';' ) )
            // InternalXemfs.g:4206:1: ( ';' )
            {
            // InternalXemfs.g:4206:1: ( ';' )
            // InternalXemfs.g:4207:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_0_2()); 
            }
            match(input,9,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_0_2()); 
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
    // $ANTLR end "rule__EmfsFile__Group_4_0__2__Impl"


    // $ANTLR start "rule__EmfsFile__Group_4_2__0"
    // InternalXemfs.g:4226:1: rule__EmfsFile__Group_4_2__0 : rule__EmfsFile__Group_4_2__0__Impl rule__EmfsFile__Group_4_2__1 ;
    public final void rule__EmfsFile__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4230:1: ( rule__EmfsFile__Group_4_2__0__Impl rule__EmfsFile__Group_4_2__1 )
            // InternalXemfs.g:4231:2: rule__EmfsFile__Group_4_2__0__Impl rule__EmfsFile__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__EmfsFile__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group_4_2__0"


    // $ANTLR start "rule__EmfsFile__Group_4_2__0__Impl"
    // InternalXemfs.g:4238:1: rule__EmfsFile__Group_4_2__0__Impl : ( ':' ) ;
    public final void rule__EmfsFile__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4242:1: ( ( ':' ) )
            // InternalXemfs.g:4243:1: ( ':' )
            {
            // InternalXemfs.g:4243:1: ( ':' )
            // InternalXemfs.g:4244:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getColonKeyword_4_2_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getColonKeyword_4_2_0()); 
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
    // $ANTLR end "rule__EmfsFile__Group_4_2__0__Impl"


    // $ANTLR start "rule__EmfsFile__Group_4_2__1"
    // InternalXemfs.g:4257:1: rule__EmfsFile__Group_4_2__1 : rule__EmfsFile__Group_4_2__1__Impl ;
    public final void rule__EmfsFile__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4261:1: ( rule__EmfsFile__Group_4_2__1__Impl )
            // InternalXemfs.g:4262:2: rule__EmfsFile__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsFile__Group_4_2__1"


    // $ANTLR start "rule__EmfsFile__Group_4_2__1__Impl"
    // InternalXemfs.g:4268:1: rule__EmfsFile__Group_4_2__1__Impl : ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) ) ;
    public final void rule__EmfsFile__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4272:1: ( ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) ) )
            // InternalXemfs.g:4273:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) )
            {
            // InternalXemfs.g:4273:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) )
            // InternalXemfs.g:4274:1: ( rule__EmfsFile__ContentProviderAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_2_1()); 
            }
            // InternalXemfs.g:4275:1: ( rule__EmfsFile__ContentProviderAssignment_4_2_1 )
            // InternalXemfs.g:4275:2: rule__EmfsFile__ContentProviderAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__ContentProviderAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_2_1()); 
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
    // $ANTLR end "rule__EmfsFile__Group_4_2__1__Impl"


    // $ANTLR start "rule__VerbatimStringContents__Group__0"
    // InternalXemfs.g:4289:1: rule__VerbatimStringContents__Group__0 : rule__VerbatimStringContents__Group__0__Impl rule__VerbatimStringContents__Group__1 ;
    public final void rule__VerbatimStringContents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4293:1: ( rule__VerbatimStringContents__Group__0__Impl rule__VerbatimStringContents__Group__1 )
            // InternalXemfs.g:4294:2: rule__VerbatimStringContents__Group__0__Impl rule__VerbatimStringContents__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__VerbatimStringContents__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerbatimStringContents__Group__0"


    // $ANTLR start "rule__VerbatimStringContents__Group__0__Impl"
    // InternalXemfs.g:4301:1: rule__VerbatimStringContents__Group__0__Impl : ( ( rule__VerbatimStringContents__Group_0__0 )? ) ;
    public final void rule__VerbatimStringContents__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4305:1: ( ( ( rule__VerbatimStringContents__Group_0__0 )? ) )
            // InternalXemfs.g:4306:1: ( ( rule__VerbatimStringContents__Group_0__0 )? )
            {
            // InternalXemfs.g:4306:1: ( ( rule__VerbatimStringContents__Group_0__0 )? )
            // InternalXemfs.g:4307:1: ( rule__VerbatimStringContents__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getGroup_0()); 
            }
            // InternalXemfs.g:4308:1: ( rule__VerbatimStringContents__Group_0__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==44) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalXemfs.g:4308:2: rule__VerbatimStringContents__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VerbatimStringContents__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getGroup_0()); 
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
    // $ANTLR end "rule__VerbatimStringContents__Group__0__Impl"


    // $ANTLR start "rule__VerbatimStringContents__Group__1"
    // InternalXemfs.g:4318:1: rule__VerbatimStringContents__Group__1 : rule__VerbatimStringContents__Group__1__Impl ;
    public final void rule__VerbatimStringContents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4322:1: ( rule__VerbatimStringContents__Group__1__Impl )
            // InternalXemfs.g:4323:2: rule__VerbatimStringContents__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerbatimStringContents__Group__1"


    // $ANTLR start "rule__VerbatimStringContents__Group__1__Impl"
    // InternalXemfs.g:4329:1: rule__VerbatimStringContents__Group__1__Impl : ( ( rule__VerbatimStringContents__StringContentAssignment_1 ) ) ;
    public final void rule__VerbatimStringContents__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4333:1: ( ( ( rule__VerbatimStringContents__StringContentAssignment_1 ) ) )
            // InternalXemfs.g:4334:1: ( ( rule__VerbatimStringContents__StringContentAssignment_1 ) )
            {
            // InternalXemfs.g:4334:1: ( ( rule__VerbatimStringContents__StringContentAssignment_1 ) )
            // InternalXemfs.g:4335:1: ( rule__VerbatimStringContents__StringContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getStringContentAssignment_1()); 
            }
            // InternalXemfs.g:4336:1: ( rule__VerbatimStringContents__StringContentAssignment_1 )
            // InternalXemfs.g:4336:2: rule__VerbatimStringContents__StringContentAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__StringContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getStringContentAssignment_1()); 
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
    // $ANTLR end "rule__VerbatimStringContents__Group__1__Impl"


    // $ANTLR start "rule__VerbatimStringContents__Group_0__0"
    // InternalXemfs.g:4350:1: rule__VerbatimStringContents__Group_0__0 : rule__VerbatimStringContents__Group_0__0__Impl rule__VerbatimStringContents__Group_0__1 ;
    public final void rule__VerbatimStringContents__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4354:1: ( rule__VerbatimStringContents__Group_0__0__Impl rule__VerbatimStringContents__Group_0__1 )
            // InternalXemfs.g:4355:2: rule__VerbatimStringContents__Group_0__0__Impl rule__VerbatimStringContents__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__VerbatimStringContents__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerbatimStringContents__Group_0__0"


    // $ANTLR start "rule__VerbatimStringContents__Group_0__0__Impl"
    // InternalXemfs.g:4362:1: rule__VerbatimStringContents__Group_0__0__Impl : ( '---' ) ;
    public final void rule__VerbatimStringContents__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4366:1: ( ( '---' ) )
            // InternalXemfs.g:4367:1: ( '---' )
            {
            // InternalXemfs.g:4367:1: ( '---' )
            // InternalXemfs.g:4368:1: '---'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0_0()); 
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
    // $ANTLR end "rule__VerbatimStringContents__Group_0__0__Impl"


    // $ANTLR start "rule__VerbatimStringContents__Group_0__1"
    // InternalXemfs.g:4381:1: rule__VerbatimStringContents__Group_0__1 : rule__VerbatimStringContents__Group_0__1__Impl rule__VerbatimStringContents__Group_0__2 ;
    public final void rule__VerbatimStringContents__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4385:1: ( rule__VerbatimStringContents__Group_0__1__Impl rule__VerbatimStringContents__Group_0__2 )
            // InternalXemfs.g:4386:2: rule__VerbatimStringContents__Group_0__1__Impl rule__VerbatimStringContents__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__VerbatimStringContents__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerbatimStringContents__Group_0__1"


    // $ANTLR start "rule__VerbatimStringContents__Group_0__1__Impl"
    // InternalXemfs.g:4393:1: rule__VerbatimStringContents__Group_0__1__Impl : ( ( rule__VerbatimStringContents__WriteableAssignment_0_1 )? ) ;
    public final void rule__VerbatimStringContents__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4397:1: ( ( ( rule__VerbatimStringContents__WriteableAssignment_0_1 )? ) )
            // InternalXemfs.g:4398:1: ( ( rule__VerbatimStringContents__WriteableAssignment_0_1 )? )
            {
            // InternalXemfs.g:4398:1: ( ( rule__VerbatimStringContents__WriteableAssignment_0_1 )? )
            // InternalXemfs.g:4399:1: ( rule__VerbatimStringContents__WriteableAssignment_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getWriteableAssignment_0_1()); 
            }
            // InternalXemfs.g:4400:1: ( rule__VerbatimStringContents__WriteableAssignment_0_1 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==60) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalXemfs.g:4400:2: rule__VerbatimStringContents__WriteableAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VerbatimStringContents__WriteableAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getWriteableAssignment_0_1()); 
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
    // $ANTLR end "rule__VerbatimStringContents__Group_0__1__Impl"


    // $ANTLR start "rule__VerbatimStringContents__Group_0__2"
    // InternalXemfs.g:4410:1: rule__VerbatimStringContents__Group_0__2 : rule__VerbatimStringContents__Group_0__2__Impl rule__VerbatimStringContents__Group_0__3 ;
    public final void rule__VerbatimStringContents__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4414:1: ( rule__VerbatimStringContents__Group_0__2__Impl rule__VerbatimStringContents__Group_0__3 )
            // InternalXemfs.g:4415:2: rule__VerbatimStringContents__Group_0__2__Impl rule__VerbatimStringContents__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__VerbatimStringContents__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerbatimStringContents__Group_0__2"


    // $ANTLR start "rule__VerbatimStringContents__Group_0__2__Impl"
    // InternalXemfs.g:4422:1: rule__VerbatimStringContents__Group_0__2__Impl : ( ( rule__VerbatimStringContents__Group_0_2__0 )* ) ;
    public final void rule__VerbatimStringContents__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4426:1: ( ( ( rule__VerbatimStringContents__Group_0_2__0 )* ) )
            // InternalXemfs.g:4427:1: ( ( rule__VerbatimStringContents__Group_0_2__0 )* )
            {
            // InternalXemfs.g:4427:1: ( ( rule__VerbatimStringContents__Group_0_2__0 )* )
            // InternalXemfs.g:4428:1: ( rule__VerbatimStringContents__Group_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getGroup_0_2()); 
            }
            // InternalXemfs.g:4429:1: ( rule__VerbatimStringContents__Group_0_2__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==36) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalXemfs.g:4429:2: rule__VerbatimStringContents__Group_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__VerbatimStringContents__Group_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getGroup_0_2()); 
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
    // $ANTLR end "rule__VerbatimStringContents__Group_0__2__Impl"


    // $ANTLR start "rule__VerbatimStringContents__Group_0__3"
    // InternalXemfs.g:4439:1: rule__VerbatimStringContents__Group_0__3 : rule__VerbatimStringContents__Group_0__3__Impl ;
    public final void rule__VerbatimStringContents__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4443:1: ( rule__VerbatimStringContents__Group_0__3__Impl )
            // InternalXemfs.g:4444:2: rule__VerbatimStringContents__Group_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerbatimStringContents__Group_0__3"


    // $ANTLR start "rule__VerbatimStringContents__Group_0__3__Impl"
    // InternalXemfs.g:4450:1: rule__VerbatimStringContents__Group_0__3__Impl : ( ( rule__VerbatimStringContents__PropertiesAssignment_0_3 )* ) ;
    public final void rule__VerbatimStringContents__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4454:1: ( ( ( rule__VerbatimStringContents__PropertiesAssignment_0_3 )* ) )
            // InternalXemfs.g:4455:1: ( ( rule__VerbatimStringContents__PropertiesAssignment_0_3 )* )
            {
            // InternalXemfs.g:4455:1: ( ( rule__VerbatimStringContents__PropertiesAssignment_0_3 )* )
            // InternalXemfs.g:4456:1: ( rule__VerbatimStringContents__PropertiesAssignment_0_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getPropertiesAssignment_0_3()); 
            }
            // InternalXemfs.g:4457:1: ( rule__VerbatimStringContents__PropertiesAssignment_0_3 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==40) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalXemfs.g:4457:2: rule__VerbatimStringContents__PropertiesAssignment_0_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__VerbatimStringContents__PropertiesAssignment_0_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getPropertiesAssignment_0_3()); 
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
    // $ANTLR end "rule__VerbatimStringContents__Group_0__3__Impl"


    // $ANTLR start "rule__VerbatimStringContents__Group_0_2__0"
    // InternalXemfs.g:4475:1: rule__VerbatimStringContents__Group_0_2__0 : rule__VerbatimStringContents__Group_0_2__0__Impl rule__VerbatimStringContents__Group_0_2__1 ;
    public final void rule__VerbatimStringContents__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4479:1: ( rule__VerbatimStringContents__Group_0_2__0__Impl rule__VerbatimStringContents__Group_0_2__1 )
            // InternalXemfs.g:4480:2: rule__VerbatimStringContents__Group_0_2__0__Impl rule__VerbatimStringContents__Group_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__VerbatimStringContents__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerbatimStringContents__Group_0_2__0"


    // $ANTLR start "rule__VerbatimStringContents__Group_0_2__0__Impl"
    // InternalXemfs.g:4487:1: rule__VerbatimStringContents__Group_0_2__0__Impl : ( '#' ) ;
    public final void rule__VerbatimStringContents__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4491:1: ( ( '#' ) )
            // InternalXemfs.g:4492:1: ( '#' )
            {
            // InternalXemfs.g:4492:1: ( '#' )
            // InternalXemfs.g:4493:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getNumberSignKeyword_0_2_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getNumberSignKeyword_0_2_0()); 
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
    // $ANTLR end "rule__VerbatimStringContents__Group_0_2__0__Impl"


    // $ANTLR start "rule__VerbatimStringContents__Group_0_2__1"
    // InternalXemfs.g:4506:1: rule__VerbatimStringContents__Group_0_2__1 : rule__VerbatimStringContents__Group_0_2__1__Impl ;
    public final void rule__VerbatimStringContents__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4510:1: ( rule__VerbatimStringContents__Group_0_2__1__Impl )
            // InternalXemfs.g:4511:2: rule__VerbatimStringContents__Group_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerbatimStringContents__Group_0_2__1"


    // $ANTLR start "rule__VerbatimStringContents__Group_0_2__1__Impl"
    // InternalXemfs.g:4517:1: rule__VerbatimStringContents__Group_0_2__1__Impl : ( ( rule__VerbatimStringContents__TagsAssignment_0_2_1 ) ) ;
    public final void rule__VerbatimStringContents__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4521:1: ( ( ( rule__VerbatimStringContents__TagsAssignment_0_2_1 ) ) )
            // InternalXemfs.g:4522:1: ( ( rule__VerbatimStringContents__TagsAssignment_0_2_1 ) )
            {
            // InternalXemfs.g:4522:1: ( ( rule__VerbatimStringContents__TagsAssignment_0_2_1 ) )
            // InternalXemfs.g:4523:1: ( rule__VerbatimStringContents__TagsAssignment_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getTagsAssignment_0_2_1()); 
            }
            // InternalXemfs.g:4524:1: ( rule__VerbatimStringContents__TagsAssignment_0_2_1 )
            // InternalXemfs.g:4524:2: rule__VerbatimStringContents__TagsAssignment_0_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__TagsAssignment_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getTagsAssignment_0_2_1()); 
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
    // $ANTLR end "rule__VerbatimStringContents__Group_0_2__1__Impl"


    // $ANTLR start "rule__PropertyValueString__Group__0"
    // InternalXemfs.g:4538:1: rule__PropertyValueString__Group__0 : rule__PropertyValueString__Group__0__Impl rule__PropertyValueString__Group__1 ;
    public final void rule__PropertyValueString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4542:1: ( rule__PropertyValueString__Group__0__Impl rule__PropertyValueString__Group__1 )
            // InternalXemfs.g:4543:2: rule__PropertyValueString__Group__0__Impl rule__PropertyValueString__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__PropertyValueString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group__0"


    // $ANTLR start "rule__PropertyValueString__Group__0__Impl"
    // InternalXemfs.g:4550:1: rule__PropertyValueString__Group__0__Impl : ( '$' ) ;
    public final void rule__PropertyValueString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4554:1: ( ( '$' ) )
            // InternalXemfs.g:4555:1: ( '$' )
            {
            // InternalXemfs.g:4555:1: ( '$' )
            // InternalXemfs.g:4556:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getDollarSignKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getDollarSignKeyword_0()); 
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
    // $ANTLR end "rule__PropertyValueString__Group__0__Impl"


    // $ANTLR start "rule__PropertyValueString__Group__1"
    // InternalXemfs.g:4569:1: rule__PropertyValueString__Group__1 : rule__PropertyValueString__Group__1__Impl rule__PropertyValueString__Group__2 ;
    public final void rule__PropertyValueString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4573:1: ( rule__PropertyValueString__Group__1__Impl rule__PropertyValueString__Group__2 )
            // InternalXemfs.g:4574:2: rule__PropertyValueString__Group__1__Impl rule__PropertyValueString__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__PropertyValueString__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group__1"


    // $ANTLR start "rule__PropertyValueString__Group__1__Impl"
    // InternalXemfs.g:4581:1: rule__PropertyValueString__Group__1__Impl : ( ( rule__PropertyValueString__WriteableAssignment_1 )? ) ;
    public final void rule__PropertyValueString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4585:1: ( ( ( rule__PropertyValueString__WriteableAssignment_1 )? ) )
            // InternalXemfs.g:4586:1: ( ( rule__PropertyValueString__WriteableAssignment_1 )? )
            {
            // InternalXemfs.g:4586:1: ( ( rule__PropertyValueString__WriteableAssignment_1 )? )
            // InternalXemfs.g:4587:1: ( rule__PropertyValueString__WriteableAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getWriteableAssignment_1()); 
            }
            // InternalXemfs.g:4588:1: ( rule__PropertyValueString__WriteableAssignment_1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==60) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXemfs.g:4588:2: rule__PropertyValueString__WriteableAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PropertyValueString__WriteableAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getWriteableAssignment_1()); 
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
    // $ANTLR end "rule__PropertyValueString__Group__1__Impl"


    // $ANTLR start "rule__PropertyValueString__Group__2"
    // InternalXemfs.g:4598:1: rule__PropertyValueString__Group__2 : rule__PropertyValueString__Group__2__Impl rule__PropertyValueString__Group__3 ;
    public final void rule__PropertyValueString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4602:1: ( rule__PropertyValueString__Group__2__Impl rule__PropertyValueString__Group__3 )
            // InternalXemfs.g:4603:2: rule__PropertyValueString__Group__2__Impl rule__PropertyValueString__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__PropertyValueString__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group__2"


    // $ANTLR start "rule__PropertyValueString__Group__2__Impl"
    // InternalXemfs.g:4610:1: rule__PropertyValueString__Group__2__Impl : ( ( rule__PropertyValueString__Alternatives_2 ) ) ;
    public final void rule__PropertyValueString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4614:1: ( ( ( rule__PropertyValueString__Alternatives_2 ) ) )
            // InternalXemfs.g:4615:1: ( ( rule__PropertyValueString__Alternatives_2 ) )
            {
            // InternalXemfs.g:4615:1: ( ( rule__PropertyValueString__Alternatives_2 ) )
            // InternalXemfs.g:4616:1: ( rule__PropertyValueString__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getAlternatives_2()); 
            }
            // InternalXemfs.g:4617:1: ( rule__PropertyValueString__Alternatives_2 )
            // InternalXemfs.g:4617:2: rule__PropertyValueString__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__PropertyValueString__Group__2__Impl"


    // $ANTLR start "rule__PropertyValueString__Group__3"
    // InternalXemfs.g:4627:1: rule__PropertyValueString__Group__3 : rule__PropertyValueString__Group__3__Impl ;
    public final void rule__PropertyValueString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4631:1: ( rule__PropertyValueString__Group__3__Impl )
            // InternalXemfs.g:4632:2: rule__PropertyValueString__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group__3"


    // $ANTLR start "rule__PropertyValueString__Group__3__Impl"
    // InternalXemfs.g:4638:1: rule__PropertyValueString__Group__3__Impl : ( ( rule__PropertyValueString__Group_3__0 )? ) ;
    public final void rule__PropertyValueString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4642:1: ( ( ( rule__PropertyValueString__Group_3__0 )? ) )
            // InternalXemfs.g:4643:1: ( ( rule__PropertyValueString__Group_3__0 )? )
            {
            // InternalXemfs.g:4643:1: ( ( rule__PropertyValueString__Group_3__0 )? )
            // InternalXemfs.g:4644:1: ( rule__PropertyValueString__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getGroup_3()); 
            }
            // InternalXemfs.g:4645:1: ( rule__PropertyValueString__Group_3__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==43) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalXemfs.g:4645:2: rule__PropertyValueString__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PropertyValueString__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getGroup_3()); 
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
    // $ANTLR end "rule__PropertyValueString__Group__3__Impl"


    // $ANTLR start "rule__PropertyValueString__Group_2_1__0"
    // InternalXemfs.g:4663:1: rule__PropertyValueString__Group_2_1__0 : rule__PropertyValueString__Group_2_1__0__Impl rule__PropertyValueString__Group_2_1__1 ;
    public final void rule__PropertyValueString__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4667:1: ( rule__PropertyValueString__Group_2_1__0__Impl rule__PropertyValueString__Group_2_1__1 )
            // InternalXemfs.g:4668:2: rule__PropertyValueString__Group_2_1__0__Impl rule__PropertyValueString__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__PropertyValueString__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group_2_1__0"


    // $ANTLR start "rule__PropertyValueString__Group_2_1__0__Impl"
    // InternalXemfs.g:4675:1: rule__PropertyValueString__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__PropertyValueString__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4679:1: ( ( '{' ) )
            // InternalXemfs.g:4680:1: ( '{' )
            {
            // InternalXemfs.g:4680:1: ( '{' )
            // InternalXemfs.g:4681:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getLeftCurlyBracketKeyword_2_1_0()); 
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
    // $ANTLR end "rule__PropertyValueString__Group_2_1__0__Impl"


    // $ANTLR start "rule__PropertyValueString__Group_2_1__1"
    // InternalXemfs.g:4694:1: rule__PropertyValueString__Group_2_1__1 : rule__PropertyValueString__Group_2_1__1__Impl rule__PropertyValueString__Group_2_1__2 ;
    public final void rule__PropertyValueString__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4698:1: ( rule__PropertyValueString__Group_2_1__1__Impl rule__PropertyValueString__Group_2_1__2 )
            // InternalXemfs.g:4699:2: rule__PropertyValueString__Group_2_1__1__Impl rule__PropertyValueString__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__PropertyValueString__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group_2_1__1"


    // $ANTLR start "rule__PropertyValueString__Group_2_1__1__Impl"
    // InternalXemfs.g:4706:1: rule__PropertyValueString__Group_2_1__1__Impl : ( ( rule__PropertyValueString__PropertyNameAssignment_2_1_1 ) ) ;
    public final void rule__PropertyValueString__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4710:1: ( ( ( rule__PropertyValueString__PropertyNameAssignment_2_1_1 ) ) )
            // InternalXemfs.g:4711:1: ( ( rule__PropertyValueString__PropertyNameAssignment_2_1_1 ) )
            {
            // InternalXemfs.g:4711:1: ( ( rule__PropertyValueString__PropertyNameAssignment_2_1_1 ) )
            // InternalXemfs.g:4712:1: ( rule__PropertyValueString__PropertyNameAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getPropertyNameAssignment_2_1_1()); 
            }
            // InternalXemfs.g:4713:1: ( rule__PropertyValueString__PropertyNameAssignment_2_1_1 )
            // InternalXemfs.g:4713:2: rule__PropertyValueString__PropertyNameAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__PropertyNameAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getPropertyNameAssignment_2_1_1()); 
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
    // $ANTLR end "rule__PropertyValueString__Group_2_1__1__Impl"


    // $ANTLR start "rule__PropertyValueString__Group_2_1__2"
    // InternalXemfs.g:4723:1: rule__PropertyValueString__Group_2_1__2 : rule__PropertyValueString__Group_2_1__2__Impl ;
    public final void rule__PropertyValueString__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4727:1: ( rule__PropertyValueString__Group_2_1__2__Impl )
            // InternalXemfs.g:4728:2: rule__PropertyValueString__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group_2_1__2"


    // $ANTLR start "rule__PropertyValueString__Group_2_1__2__Impl"
    // InternalXemfs.g:4734:1: rule__PropertyValueString__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__PropertyValueString__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4738:1: ( ( '}' ) )
            // InternalXemfs.g:4739:1: ( '}' )
            {
            // InternalXemfs.g:4739:1: ( '}' )
            // InternalXemfs.g:4740:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getRightCurlyBracketKeyword_2_1_2()); 
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
    // $ANTLR end "rule__PropertyValueString__Group_2_1__2__Impl"


    // $ANTLR start "rule__PropertyValueString__Group_3__0"
    // InternalXemfs.g:4759:1: rule__PropertyValueString__Group_3__0 : rule__PropertyValueString__Group_3__0__Impl rule__PropertyValueString__Group_3__1 ;
    public final void rule__PropertyValueString__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4763:1: ( rule__PropertyValueString__Group_3__0__Impl rule__PropertyValueString__Group_3__1 )
            // InternalXemfs.g:4764:2: rule__PropertyValueString__Group_3__0__Impl rule__PropertyValueString__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__PropertyValueString__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group_3__0"


    // $ANTLR start "rule__PropertyValueString__Group_3__0__Impl"
    // InternalXemfs.g:4771:1: rule__PropertyValueString__Group_3__0__Impl : ( ':' ) ;
    public final void rule__PropertyValueString__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4775:1: ( ( ':' ) )
            // InternalXemfs.g:4776:1: ( ':' )
            {
            // InternalXemfs.g:4776:1: ( ':' )
            // InternalXemfs.g:4777:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getColonKeyword_3_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getColonKeyword_3_0()); 
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
    // $ANTLR end "rule__PropertyValueString__Group_3__0__Impl"


    // $ANTLR start "rule__PropertyValueString__Group_3__1"
    // InternalXemfs.g:4790:1: rule__PropertyValueString__Group_3__1 : rule__PropertyValueString__Group_3__1__Impl ;
    public final void rule__PropertyValueString__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4794:1: ( rule__PropertyValueString__Group_3__1__Impl )
            // InternalXemfs.g:4795:2: rule__PropertyValueString__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group_3__1"


    // $ANTLR start "rule__PropertyValueString__Group_3__1__Impl"
    // InternalXemfs.g:4801:1: rule__PropertyValueString__Group_3__1__Impl : ( ( rule__PropertyValueString__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__PropertyValueString__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4805:1: ( ( ( rule__PropertyValueString__DefaultValueAssignment_3_1 ) ) )
            // InternalXemfs.g:4806:1: ( ( rule__PropertyValueString__DefaultValueAssignment_3_1 ) )
            {
            // InternalXemfs.g:4806:1: ( ( rule__PropertyValueString__DefaultValueAssignment_3_1 ) )
            // InternalXemfs.g:4807:1: ( rule__PropertyValueString__DefaultValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getDefaultValueAssignment_3_1()); 
            }
            // InternalXemfs.g:4808:1: ( rule__PropertyValueString__DefaultValueAssignment_3_1 )
            // InternalXemfs.g:4808:2: rule__PropertyValueString__DefaultValueAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__DefaultValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getDefaultValueAssignment_3_1()); 
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
    // $ANTLR end "rule__PropertyValueString__Group_3__1__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group__0"
    // InternalXemfs.g:4822:1: rule__WrappingStringContentProvider__Group__0 : rule__WrappingStringContentProvider__Group__0__Impl rule__WrappingStringContentProvider__Group__1 ;
    public final void rule__WrappingStringContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4826:1: ( rule__WrappingStringContentProvider__Group__0__Impl rule__WrappingStringContentProvider__Group__1 )
            // InternalXemfs.g:4827:2: rule__WrappingStringContentProvider__Group__0__Impl rule__WrappingStringContentProvider__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__WrappingStringContentProvider__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group__0"


    // $ANTLR start "rule__WrappingStringContentProvider__Group__0__Impl"
    // InternalXemfs.g:4834:1: rule__WrappingStringContentProvider__Group__0__Impl : ( ( rule__WrappingStringContentProvider__Group_0__0 ) ) ;
    public final void rule__WrappingStringContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4838:1: ( ( ( rule__WrappingStringContentProvider__Group_0__0 ) ) )
            // InternalXemfs.g:4839:1: ( ( rule__WrappingStringContentProvider__Group_0__0 ) )
            {
            // InternalXemfs.g:4839:1: ( ( rule__WrappingStringContentProvider__Group_0__0 ) )
            // InternalXemfs.g:4840:1: ( rule__WrappingStringContentProvider__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getGroup_0()); 
            }
            // InternalXemfs.g:4841:1: ( rule__WrappingStringContentProvider__Group_0__0 )
            // InternalXemfs.g:4841:2: rule__WrappingStringContentProvider__Group_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getGroup_0()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group__0__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group__1"
    // InternalXemfs.g:4851:1: rule__WrappingStringContentProvider__Group__1 : rule__WrappingStringContentProvider__Group__1__Impl rule__WrappingStringContentProvider__Group__2 ;
    public final void rule__WrappingStringContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4855:1: ( rule__WrappingStringContentProvider__Group__1__Impl rule__WrappingStringContentProvider__Group__2 )
            // InternalXemfs.g:4856:2: rule__WrappingStringContentProvider__Group__1__Impl rule__WrappingStringContentProvider__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__WrappingStringContentProvider__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group__1"


    // $ANTLR start "rule__WrappingStringContentProvider__Group__1__Impl"
    // InternalXemfs.g:4863:1: rule__WrappingStringContentProvider__Group__1__Impl : ( ( rule__WrappingStringContentProvider__Group_1__0 ) ) ;
    public final void rule__WrappingStringContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4867:1: ( ( ( rule__WrappingStringContentProvider__Group_1__0 ) ) )
            // InternalXemfs.g:4868:1: ( ( rule__WrappingStringContentProvider__Group_1__0 ) )
            {
            // InternalXemfs.g:4868:1: ( ( rule__WrappingStringContentProvider__Group_1__0 ) )
            // InternalXemfs.g:4869:1: ( rule__WrappingStringContentProvider__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getGroup_1()); 
            }
            // InternalXemfs.g:4870:1: ( rule__WrappingStringContentProvider__Group_1__0 )
            // InternalXemfs.g:4870:2: rule__WrappingStringContentProvider__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getGroup_1()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group__1__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group__2"
    // InternalXemfs.g:4880:1: rule__WrappingStringContentProvider__Group__2 : rule__WrappingStringContentProvider__Group__2__Impl ;
    public final void rule__WrappingStringContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4884:1: ( rule__WrappingStringContentProvider__Group__2__Impl )
            // InternalXemfs.g:4885:2: rule__WrappingStringContentProvider__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group__2"


    // $ANTLR start "rule__WrappingStringContentProvider__Group__2__Impl"
    // InternalXemfs.g:4891:1: rule__WrappingStringContentProvider__Group__2__Impl : ( ( rule__WrappingStringContentProvider__Group_2__0 ) ) ;
    public final void rule__WrappingStringContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4895:1: ( ( ( rule__WrappingStringContentProvider__Group_2__0 ) ) )
            // InternalXemfs.g:4896:1: ( ( rule__WrappingStringContentProvider__Group_2__0 ) )
            {
            // InternalXemfs.g:4896:1: ( ( rule__WrappingStringContentProvider__Group_2__0 ) )
            // InternalXemfs.g:4897:1: ( rule__WrappingStringContentProvider__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getGroup_2()); 
            }
            // InternalXemfs.g:4898:1: ( rule__WrappingStringContentProvider__Group_2__0 )
            // InternalXemfs.g:4898:2: rule__WrappingStringContentProvider__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getGroup_2()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group__2__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_0__0"
    // InternalXemfs.g:4914:1: rule__WrappingStringContentProvider__Group_0__0 : rule__WrappingStringContentProvider__Group_0__0__Impl rule__WrappingStringContentProvider__Group_0__1 ;
    public final void rule__WrappingStringContentProvider__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4918:1: ( rule__WrappingStringContentProvider__Group_0__0__Impl rule__WrappingStringContentProvider__Group_0__1 )
            // InternalXemfs.g:4919:2: rule__WrappingStringContentProvider__Group_0__0__Impl rule__WrappingStringContentProvider__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__WrappingStringContentProvider__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group_0__0"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_0__0__Impl"
    // InternalXemfs.g:4926:1: rule__WrappingStringContentProvider__Group_0__0__Impl : ( '[' ) ;
    public final void rule__WrappingStringContentProvider__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4930:1: ( ( '[' ) )
            // InternalXemfs.g:4931:1: ( '[' )
            {
            // InternalXemfs.g:4931:1: ( '[' )
            // InternalXemfs.g:4932:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getLeftSquareBracketKeyword_0_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getLeftSquareBracketKeyword_0_0()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group_0__0__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_0__1"
    // InternalXemfs.g:4945:1: rule__WrappingStringContentProvider__Group_0__1 : rule__WrappingStringContentProvider__Group_0__1__Impl rule__WrappingStringContentProvider__Group_0__2 ;
    public final void rule__WrappingStringContentProvider__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4949:1: ( rule__WrappingStringContentProvider__Group_0__1__Impl rule__WrappingStringContentProvider__Group_0__2 )
            // InternalXemfs.g:4950:2: rule__WrappingStringContentProvider__Group_0__1__Impl rule__WrappingStringContentProvider__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__WrappingStringContentProvider__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group_0__1"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_0__1__Impl"
    // InternalXemfs.g:4957:1: rule__WrappingStringContentProvider__Group_0__1__Impl : ( ( rule__WrappingStringContentProvider__PrefixAssignment_0_1 ) ) ;
    public final void rule__WrappingStringContentProvider__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4961:1: ( ( ( rule__WrappingStringContentProvider__PrefixAssignment_0_1 ) ) )
            // InternalXemfs.g:4962:1: ( ( rule__WrappingStringContentProvider__PrefixAssignment_0_1 ) )
            {
            // InternalXemfs.g:4962:1: ( ( rule__WrappingStringContentProvider__PrefixAssignment_0_1 ) )
            // InternalXemfs.g:4963:1: ( rule__WrappingStringContentProvider__PrefixAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAssignment_0_1()); 
            }
            // InternalXemfs.g:4964:1: ( rule__WrappingStringContentProvider__PrefixAssignment_0_1 )
            // InternalXemfs.g:4964:2: rule__WrappingStringContentProvider__PrefixAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__PrefixAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAssignment_0_1()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group_0__1__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_0__2"
    // InternalXemfs.g:4974:1: rule__WrappingStringContentProvider__Group_0__2 : rule__WrappingStringContentProvider__Group_0__2__Impl ;
    public final void rule__WrappingStringContentProvider__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4978:1: ( rule__WrappingStringContentProvider__Group_0__2__Impl )
            // InternalXemfs.g:4979:2: rule__WrappingStringContentProvider__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group_0__2"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_0__2__Impl"
    // InternalXemfs.g:4985:1: rule__WrappingStringContentProvider__Group_0__2__Impl : ( ']' ) ;
    public final void rule__WrappingStringContentProvider__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:4989:1: ( ( ']' ) )
            // InternalXemfs.g:4990:1: ( ']' )
            {
            // InternalXemfs.g:4990:1: ( ']' )
            // InternalXemfs.g:4991:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getRightSquareBracketKeyword_0_2()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getRightSquareBracketKeyword_0_2()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group_0__2__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_1__0"
    // InternalXemfs.g:5010:1: rule__WrappingStringContentProvider__Group_1__0 : rule__WrappingStringContentProvider__Group_1__0__Impl rule__WrappingStringContentProvider__Group_1__1 ;
    public final void rule__WrappingStringContentProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5014:1: ( rule__WrappingStringContentProvider__Group_1__0__Impl rule__WrappingStringContentProvider__Group_1__1 )
            // InternalXemfs.g:5015:2: rule__WrappingStringContentProvider__Group_1__0__Impl rule__WrappingStringContentProvider__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__WrappingStringContentProvider__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group_1__0"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_1__0__Impl"
    // InternalXemfs.g:5022:1: rule__WrappingStringContentProvider__Group_1__0__Impl : ( '@' ) ;
    public final void rule__WrappingStringContentProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5026:1: ( ( '@' ) )
            // InternalXemfs.g:5027:1: ( '@' )
            {
            // InternalXemfs.g:5027:1: ( '@' )
            // InternalXemfs.g:5028:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getCommercialAtKeyword_1_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getCommercialAtKeyword_1_0()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group_1__0__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_1__1"
    // InternalXemfs.g:5041:1: rule__WrappingStringContentProvider__Group_1__1 : rule__WrappingStringContentProvider__Group_1__1__Impl ;
    public final void rule__WrappingStringContentProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5045:1: ( rule__WrappingStringContentProvider__Group_1__1__Impl )
            // InternalXemfs.g:5046:2: rule__WrappingStringContentProvider__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group_1__1"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_1__1__Impl"
    // InternalXemfs.g:5052:1: rule__WrappingStringContentProvider__Group_1__1__Impl : ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) ) ;
    public final void rule__WrappingStringContentProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5056:1: ( ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) ) )
            // InternalXemfs.g:5057:1: ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) )
            {
            // InternalXemfs.g:5057:1: ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) )
            // InternalXemfs.g:5058:1: ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderAssignment_1_1()); 
            }
            // InternalXemfs.g:5059:1: ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 )
            // InternalXemfs.g:5059:2: rule__WrappingStringContentProvider__ContentProviderAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__ContentProviderAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderAssignment_1_1()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group_1__1__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_2__0"
    // InternalXemfs.g:5073:1: rule__WrappingStringContentProvider__Group_2__0 : rule__WrappingStringContentProvider__Group_2__0__Impl rule__WrappingStringContentProvider__Group_2__1 ;
    public final void rule__WrappingStringContentProvider__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5077:1: ( rule__WrappingStringContentProvider__Group_2__0__Impl rule__WrappingStringContentProvider__Group_2__1 )
            // InternalXemfs.g:5078:2: rule__WrappingStringContentProvider__Group_2__0__Impl rule__WrappingStringContentProvider__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__WrappingStringContentProvider__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group_2__0"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_2__0__Impl"
    // InternalXemfs.g:5085:1: rule__WrappingStringContentProvider__Group_2__0__Impl : ( '[' ) ;
    public final void rule__WrappingStringContentProvider__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5089:1: ( ( '[' ) )
            // InternalXemfs.g:5090:1: ( '[' )
            {
            // InternalXemfs.g:5090:1: ( '[' )
            // InternalXemfs.g:5091:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getLeftSquareBracketKeyword_2_0()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group_2__0__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_2__1"
    // InternalXemfs.g:5104:1: rule__WrappingStringContentProvider__Group_2__1 : rule__WrappingStringContentProvider__Group_2__1__Impl rule__WrappingStringContentProvider__Group_2__2 ;
    public final void rule__WrappingStringContentProvider__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5108:1: ( rule__WrappingStringContentProvider__Group_2__1__Impl rule__WrappingStringContentProvider__Group_2__2 )
            // InternalXemfs.g:5109:2: rule__WrappingStringContentProvider__Group_2__1__Impl rule__WrappingStringContentProvider__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__WrappingStringContentProvider__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group_2__1"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_2__1__Impl"
    // InternalXemfs.g:5116:1: rule__WrappingStringContentProvider__Group_2__1__Impl : ( ( rule__WrappingStringContentProvider__SuffixAssignment_2_1 ) ) ;
    public final void rule__WrappingStringContentProvider__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5120:1: ( ( ( rule__WrappingStringContentProvider__SuffixAssignment_2_1 ) ) )
            // InternalXemfs.g:5121:1: ( ( rule__WrappingStringContentProvider__SuffixAssignment_2_1 ) )
            {
            // InternalXemfs.g:5121:1: ( ( rule__WrappingStringContentProvider__SuffixAssignment_2_1 ) )
            // InternalXemfs.g:5122:1: ( rule__WrappingStringContentProvider__SuffixAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAssignment_2_1()); 
            }
            // InternalXemfs.g:5123:1: ( rule__WrappingStringContentProvider__SuffixAssignment_2_1 )
            // InternalXemfs.g:5123:2: rule__WrappingStringContentProvider__SuffixAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__SuffixAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAssignment_2_1()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group_2__1__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_2__2"
    // InternalXemfs.g:5133:1: rule__WrappingStringContentProvider__Group_2__2 : rule__WrappingStringContentProvider__Group_2__2__Impl ;
    public final void rule__WrappingStringContentProvider__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5137:1: ( rule__WrappingStringContentProvider__Group_2__2__Impl )
            // InternalXemfs.g:5138:2: rule__WrappingStringContentProvider__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__Group_2__2"


    // $ANTLR start "rule__WrappingStringContentProvider__Group_2__2__Impl"
    // InternalXemfs.g:5144:1: rule__WrappingStringContentProvider__Group_2__2__Impl : ( ']' ) ;
    public final void rule__WrappingStringContentProvider__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5148:1: ( ( ']' ) )
            // InternalXemfs.g:5149:1: ( ']' )
            {
            // InternalXemfs.g:5149:1: ( ']' )
            // InternalXemfs.g:5150:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getRightSquareBracketKeyword_2_2()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__Group_2__2__Impl"


    // $ANTLR start "rule__PROPERTY_REF__Group__0"
    // InternalXemfs.g:5169:1: rule__PROPERTY_REF__Group__0 : rule__PROPERTY_REF__Group__0__Impl rule__PROPERTY_REF__Group__1 ;
    public final void rule__PROPERTY_REF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5173:1: ( rule__PROPERTY_REF__Group__0__Impl rule__PROPERTY_REF__Group__1 )
            // InternalXemfs.g:5174:2: rule__PROPERTY_REF__Group__0__Impl rule__PROPERTY_REF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__PROPERTY_REF__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PROPERTY_REF__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROPERTY_REF__Group__0"


    // $ANTLR start "rule__PROPERTY_REF__Group__0__Impl"
    // InternalXemfs.g:5181:1: rule__PROPERTY_REF__Group__0__Impl : ( '$' ) ;
    public final void rule__PROPERTY_REF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5185:1: ( ( '$' ) )
            // InternalXemfs.g:5186:1: ( '$' )
            {
            // InternalXemfs.g:5186:1: ( '$' )
            // InternalXemfs.g:5187:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getDollarSignKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPROPERTY_REFAccess().getDollarSignKeyword_0()); 
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
    // $ANTLR end "rule__PROPERTY_REF__Group__0__Impl"


    // $ANTLR start "rule__PROPERTY_REF__Group__1"
    // InternalXemfs.g:5200:1: rule__PROPERTY_REF__Group__1 : rule__PROPERTY_REF__Group__1__Impl ;
    public final void rule__PROPERTY_REF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5204:1: ( rule__PROPERTY_REF__Group__1__Impl )
            // InternalXemfs.g:5205:2: rule__PROPERTY_REF__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PROPERTY_REF__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROPERTY_REF__Group__1"


    // $ANTLR start "rule__PROPERTY_REF__Group__1__Impl"
    // InternalXemfs.g:5211:1: rule__PROPERTY_REF__Group__1__Impl : ( ( rule__PROPERTY_REF__Alternatives_1 ) ) ;
    public final void rule__PROPERTY_REF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5215:1: ( ( ( rule__PROPERTY_REF__Alternatives_1 ) ) )
            // InternalXemfs.g:5216:1: ( ( rule__PROPERTY_REF__Alternatives_1 ) )
            {
            // InternalXemfs.g:5216:1: ( ( rule__PROPERTY_REF__Alternatives_1 ) )
            // InternalXemfs.g:5217:1: ( rule__PROPERTY_REF__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getAlternatives_1()); 
            }
            // InternalXemfs.g:5218:1: ( rule__PROPERTY_REF__Alternatives_1 )
            // InternalXemfs.g:5218:2: rule__PROPERTY_REF__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PROPERTY_REF__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPROPERTY_REFAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__PROPERTY_REF__Group__1__Impl"


    // $ANTLR start "rule__PROPERTY_REF__Group_1_0__0"
    // InternalXemfs.g:5232:1: rule__PROPERTY_REF__Group_1_0__0 : rule__PROPERTY_REF__Group_1_0__0__Impl rule__PROPERTY_REF__Group_1_0__1 ;
    public final void rule__PROPERTY_REF__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5236:1: ( rule__PROPERTY_REF__Group_1_0__0__Impl rule__PROPERTY_REF__Group_1_0__1 )
            // InternalXemfs.g:5237:2: rule__PROPERTY_REF__Group_1_0__0__Impl rule__PROPERTY_REF__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__PROPERTY_REF__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PROPERTY_REF__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROPERTY_REF__Group_1_0__0"


    // $ANTLR start "rule__PROPERTY_REF__Group_1_0__0__Impl"
    // InternalXemfs.g:5244:1: rule__PROPERTY_REF__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__PROPERTY_REF__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5248:1: ( ( '{' ) )
            // InternalXemfs.g:5249:1: ( '{' )
            {
            // InternalXemfs.g:5249:1: ( '{' )
            // InternalXemfs.g:5250:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getLeftCurlyBracketKeyword_1_0_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPROPERTY_REFAccess().getLeftCurlyBracketKeyword_1_0_0()); 
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
    // $ANTLR end "rule__PROPERTY_REF__Group_1_0__0__Impl"


    // $ANTLR start "rule__PROPERTY_REF__Group_1_0__1"
    // InternalXemfs.g:5263:1: rule__PROPERTY_REF__Group_1_0__1 : rule__PROPERTY_REF__Group_1_0__1__Impl rule__PROPERTY_REF__Group_1_0__2 ;
    public final void rule__PROPERTY_REF__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5267:1: ( rule__PROPERTY_REF__Group_1_0__1__Impl rule__PROPERTY_REF__Group_1_0__2 )
            // InternalXemfs.g:5268:2: rule__PROPERTY_REF__Group_1_0__1__Impl rule__PROPERTY_REF__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__PROPERTY_REF__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PROPERTY_REF__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROPERTY_REF__Group_1_0__1"


    // $ANTLR start "rule__PROPERTY_REF__Group_1_0__1__Impl"
    // InternalXemfs.g:5275:1: rule__PROPERTY_REF__Group_1_0__1__Impl : ( ruleEmfsName ) ;
    public final void rule__PROPERTY_REF__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5279:1: ( ( ruleEmfsName ) )
            // InternalXemfs.g:5280:1: ( ruleEmfsName )
            {
            // InternalXemfs.g:5280:1: ( ruleEmfsName )
            // InternalXemfs.g:5281:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getEmfsNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPROPERTY_REFAccess().getEmfsNameParserRuleCall_1_0_1()); 
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
    // $ANTLR end "rule__PROPERTY_REF__Group_1_0__1__Impl"


    // $ANTLR start "rule__PROPERTY_REF__Group_1_0__2"
    // InternalXemfs.g:5292:1: rule__PROPERTY_REF__Group_1_0__2 : rule__PROPERTY_REF__Group_1_0__2__Impl ;
    public final void rule__PROPERTY_REF__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5296:1: ( rule__PROPERTY_REF__Group_1_0__2__Impl )
            // InternalXemfs.g:5297:2: rule__PROPERTY_REF__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PROPERTY_REF__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROPERTY_REF__Group_1_0__2"


    // $ANTLR start "rule__PROPERTY_REF__Group_1_0__2__Impl"
    // InternalXemfs.g:5303:1: rule__PROPERTY_REF__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__PROPERTY_REF__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5307:1: ( ( '}' ) )
            // InternalXemfs.g:5308:1: ( '}' )
            {
            // InternalXemfs.g:5308:1: ( '}' )
            // InternalXemfs.g:5309:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getRightCurlyBracketKeyword_1_0_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPROPERTY_REFAccess().getRightCurlyBracketKeyword_1_0_2()); 
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
    // $ANTLR end "rule__PROPERTY_REF__Group_1_0__2__Impl"


    // $ANTLR start "rule__URL_HOST_NAME__Group__0"
    // InternalXemfs.g:5328:1: rule__URL_HOST_NAME__Group__0 : rule__URL_HOST_NAME__Group__0__Impl rule__URL_HOST_NAME__Group__1 ;
    public final void rule__URL_HOST_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5332:1: ( rule__URL_HOST_NAME__Group__0__Impl rule__URL_HOST_NAME__Group__1 )
            // InternalXemfs.g:5333:2: rule__URL_HOST_NAME__Group__0__Impl rule__URL_HOST_NAME__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__URL_HOST_NAME__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST_NAME__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST_NAME__Group__0"


    // $ANTLR start "rule__URL_HOST_NAME__Group__0__Impl"
    // InternalXemfs.g:5340:1: rule__URL_HOST_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__URL_HOST_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5344:1: ( ( RULE_ID ) )
            // InternalXemfs.g:5345:1: ( RULE_ID )
            {
            // InternalXemfs.g:5345:1: ( RULE_ID )
            // InternalXemfs.g:5346:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOST_NAMEAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__URL_HOST_NAME__Group__0__Impl"


    // $ANTLR start "rule__URL_HOST_NAME__Group__1"
    // InternalXemfs.g:5357:1: rule__URL_HOST_NAME__Group__1 : rule__URL_HOST_NAME__Group__1__Impl ;
    public final void rule__URL_HOST_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5361:1: ( rule__URL_HOST_NAME__Group__1__Impl )
            // InternalXemfs.g:5362:2: rule__URL_HOST_NAME__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST_NAME__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST_NAME__Group__1"


    // $ANTLR start "rule__URL_HOST_NAME__Group__1__Impl"
    // InternalXemfs.g:5368:1: rule__URL_HOST_NAME__Group__1__Impl : ( ( ( rule__URL_HOST_NAME__Group_1__0 ) ) ( ( rule__URL_HOST_NAME__Group_1__0 )* ) ) ;
    public final void rule__URL_HOST_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5372:1: ( ( ( ( rule__URL_HOST_NAME__Group_1__0 ) ) ( ( rule__URL_HOST_NAME__Group_1__0 )* ) ) )
            // InternalXemfs.g:5373:1: ( ( ( rule__URL_HOST_NAME__Group_1__0 ) ) ( ( rule__URL_HOST_NAME__Group_1__0 )* ) )
            {
            // InternalXemfs.g:5373:1: ( ( ( rule__URL_HOST_NAME__Group_1__0 ) ) ( ( rule__URL_HOST_NAME__Group_1__0 )* ) )
            // InternalXemfs.g:5374:1: ( ( rule__URL_HOST_NAME__Group_1__0 ) ) ( ( rule__URL_HOST_NAME__Group_1__0 )* )
            {
            // InternalXemfs.g:5374:1: ( ( rule__URL_HOST_NAME__Group_1__0 ) )
            // InternalXemfs.g:5375:1: ( rule__URL_HOST_NAME__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getGroup_1()); 
            }
            // InternalXemfs.g:5376:1: ( rule__URL_HOST_NAME__Group_1__0 )
            // InternalXemfs.g:5376:2: rule__URL_HOST_NAME__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__URL_HOST_NAME__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOST_NAMEAccess().getGroup_1()); 
            }

            }

            // InternalXemfs.g:5379:1: ( ( rule__URL_HOST_NAME__Group_1__0 )* )
            // InternalXemfs.g:5380:1: ( rule__URL_HOST_NAME__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getGroup_1()); 
            }
            // InternalXemfs.g:5381:1: ( rule__URL_HOST_NAME__Group_1__0 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==38) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalXemfs.g:5381:2: rule__URL_HOST_NAME__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__URL_HOST_NAME__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOST_NAMEAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__URL_HOST_NAME__Group__1__Impl"


    // $ANTLR start "rule__URL_HOST_NAME__Group_1__0"
    // InternalXemfs.g:5396:1: rule__URL_HOST_NAME__Group_1__0 : rule__URL_HOST_NAME__Group_1__0__Impl rule__URL_HOST_NAME__Group_1__1 ;
    public final void rule__URL_HOST_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5400:1: ( rule__URL_HOST_NAME__Group_1__0__Impl rule__URL_HOST_NAME__Group_1__1 )
            // InternalXemfs.g:5401:2: rule__URL_HOST_NAME__Group_1__0__Impl rule__URL_HOST_NAME__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__URL_HOST_NAME__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST_NAME__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST_NAME__Group_1__0"


    // $ANTLR start "rule__URL_HOST_NAME__Group_1__0__Impl"
    // InternalXemfs.g:5408:1: rule__URL_HOST_NAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__URL_HOST_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5412:1: ( ( '.' ) )
            // InternalXemfs.g:5413:1: ( '.' )
            {
            // InternalXemfs.g:5413:1: ( '.' )
            // InternalXemfs.g:5414:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getFullStopKeyword_1_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOST_NAMEAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__URL_HOST_NAME__Group_1__0__Impl"


    // $ANTLR start "rule__URL_HOST_NAME__Group_1__1"
    // InternalXemfs.g:5427:1: rule__URL_HOST_NAME__Group_1__1 : rule__URL_HOST_NAME__Group_1__1__Impl ;
    public final void rule__URL_HOST_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5431:1: ( rule__URL_HOST_NAME__Group_1__1__Impl )
            // InternalXemfs.g:5432:2: rule__URL_HOST_NAME__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST_NAME__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST_NAME__Group_1__1"


    // $ANTLR start "rule__URL_HOST_NAME__Group_1__1__Impl"
    // InternalXemfs.g:5438:1: rule__URL_HOST_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__URL_HOST_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5442:1: ( ( RULE_ID ) )
            // InternalXemfs.g:5443:1: ( RULE_ID )
            {
            // InternalXemfs.g:5443:1: ( RULE_ID )
            // InternalXemfs.g:5444:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOST_NAMEAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__URL_HOST_NAME__Group_1__1__Impl"


    // $ANTLR start "rule__URL_HOST__Group__0"
    // InternalXemfs.g:5459:1: rule__URL_HOST__Group__0 : rule__URL_HOST__Group__0__Impl rule__URL_HOST__Group__1 ;
    public final void rule__URL_HOST__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5463:1: ( rule__URL_HOST__Group__0__Impl rule__URL_HOST__Group__1 )
            // InternalXemfs.g:5464:2: rule__URL_HOST__Group__0__Impl rule__URL_HOST__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__URL_HOST__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group__0"


    // $ANTLR start "rule__URL_HOST__Group__0__Impl"
    // InternalXemfs.g:5471:1: rule__URL_HOST__Group__0__Impl : ( '//' ) ;
    public final void rule__URL_HOST__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5475:1: ( ( '//' ) )
            // InternalXemfs.g:5476:1: ( '//' )
            {
            // InternalXemfs.g:5476:1: ( '//' )
            // InternalXemfs.g:5477:1: '//'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getSolidusSolidusKeyword_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getSolidusSolidusKeyword_0()); 
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
    // $ANTLR end "rule__URL_HOST__Group__0__Impl"


    // $ANTLR start "rule__URL_HOST__Group__1"
    // InternalXemfs.g:5490:1: rule__URL_HOST__Group__1 : rule__URL_HOST__Group__1__Impl ;
    public final void rule__URL_HOST__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5494:1: ( rule__URL_HOST__Group__1__Impl )
            // InternalXemfs.g:5495:2: rule__URL_HOST__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group__1"


    // $ANTLR start "rule__URL_HOST__Group__1__Impl"
    // InternalXemfs.g:5501:1: rule__URL_HOST__Group__1__Impl : ( ( rule__URL_HOST__Alternatives_1 ) ) ;
    public final void rule__URL_HOST__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5505:1: ( ( ( rule__URL_HOST__Alternatives_1 ) ) )
            // InternalXemfs.g:5506:1: ( ( rule__URL_HOST__Alternatives_1 ) )
            {
            // InternalXemfs.g:5506:1: ( ( rule__URL_HOST__Alternatives_1 ) )
            // InternalXemfs.g:5507:1: ( rule__URL_HOST__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getAlternatives_1()); 
            }
            // InternalXemfs.g:5508:1: ( rule__URL_HOST__Alternatives_1 )
            // InternalXemfs.g:5508:2: rule__URL_HOST__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__URL_HOST__Group__1__Impl"


    // $ANTLR start "rule__URL_HOST__Group_1_0__0"
    // InternalXemfs.g:5522:1: rule__URL_HOST__Group_1_0__0 : rule__URL_HOST__Group_1_0__0__Impl rule__URL_HOST__Group_1_0__1 ;
    public final void rule__URL_HOST__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5526:1: ( rule__URL_HOST__Group_1_0__0__Impl rule__URL_HOST__Group_1_0__1 )
            // InternalXemfs.g:5527:2: rule__URL_HOST__Group_1_0__0__Impl rule__URL_HOST__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__URL_HOST__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_1_0__0"


    // $ANTLR start "rule__URL_HOST__Group_1_0__0__Impl"
    // InternalXemfs.g:5534:1: rule__URL_HOST__Group_1_0__0__Impl : ( ruleURL_HOST_NAME ) ;
    public final void rule__URL_HOST__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5538:1: ( ( ruleURL_HOST_NAME ) )
            // InternalXemfs.g:5539:1: ( ruleURL_HOST_NAME )
            {
            // InternalXemfs.g:5539:1: ( ruleURL_HOST_NAME )
            // InternalXemfs.g:5540:1: ruleURL_HOST_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getURL_HOST_NAMEParserRuleCall_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleURL_HOST_NAME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getURL_HOST_NAMEParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__URL_HOST__Group_1_0__0__Impl"


    // $ANTLR start "rule__URL_HOST__Group_1_0__1"
    // InternalXemfs.g:5551:1: rule__URL_HOST__Group_1_0__1 : rule__URL_HOST__Group_1_0__1__Impl ;
    public final void rule__URL_HOST__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5555:1: ( rule__URL_HOST__Group_1_0__1__Impl )
            // InternalXemfs.g:5556:2: rule__URL_HOST__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_1_0__1"


    // $ANTLR start "rule__URL_HOST__Group_1_0__1__Impl"
    // InternalXemfs.g:5562:1: rule__URL_HOST__Group_1_0__1__Impl : ( ( rule__URL_HOST__Group_1_0_1__0 )? ) ;
    public final void rule__URL_HOST__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5566:1: ( ( ( rule__URL_HOST__Group_1_0_1__0 )? ) )
            // InternalXemfs.g:5567:1: ( ( rule__URL_HOST__Group_1_0_1__0 )? )
            {
            // InternalXemfs.g:5567:1: ( ( rule__URL_HOST__Group_1_0_1__0 )? )
            // InternalXemfs.g:5568:1: ( rule__URL_HOST__Group_1_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getGroup_1_0_1()); 
            }
            // InternalXemfs.g:5569:1: ( rule__URL_HOST__Group_1_0_1__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==43) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalXemfs.g:5569:2: rule__URL_HOST__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__URL_HOST__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getGroup_1_0_1()); 
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
    // $ANTLR end "rule__URL_HOST__Group_1_0__1__Impl"


    // $ANTLR start "rule__URL_HOST__Group_1_0_1__0"
    // InternalXemfs.g:5583:1: rule__URL_HOST__Group_1_0_1__0 : rule__URL_HOST__Group_1_0_1__0__Impl rule__URL_HOST__Group_1_0_1__1 ;
    public final void rule__URL_HOST__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5587:1: ( rule__URL_HOST__Group_1_0_1__0__Impl rule__URL_HOST__Group_1_0_1__1 )
            // InternalXemfs.g:5588:2: rule__URL_HOST__Group_1_0_1__0__Impl rule__URL_HOST__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__URL_HOST__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_1_0_1__0"


    // $ANTLR start "rule__URL_HOST__Group_1_0_1__0__Impl"
    // InternalXemfs.g:5595:1: rule__URL_HOST__Group_1_0_1__0__Impl : ( ':' ) ;
    public final void rule__URL_HOST__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5599:1: ( ( ':' ) )
            // InternalXemfs.g:5600:1: ( ':' )
            {
            // InternalXemfs.g:5600:1: ( ':' )
            // InternalXemfs.g:5601:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getColonKeyword_1_0_1_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getColonKeyword_1_0_1_0()); 
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
    // $ANTLR end "rule__URL_HOST__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__URL_HOST__Group_1_0_1__1"
    // InternalXemfs.g:5614:1: rule__URL_HOST__Group_1_0_1__1 : rule__URL_HOST__Group_1_0_1__1__Impl ;
    public final void rule__URL_HOST__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5618:1: ( rule__URL_HOST__Group_1_0_1__1__Impl )
            // InternalXemfs.g:5619:2: rule__URL_HOST__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_HOST__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_1_0_1__1"


    // $ANTLR start "rule__URL_HOST__Group_1_0_1__1__Impl"
    // InternalXemfs.g:5625:1: rule__URL_HOST__Group_1_0_1__1__Impl : ( ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) ) ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* ) ) ;
    public final void rule__URL_HOST__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5629:1: ( ( ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) ) ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* ) ) )
            // InternalXemfs.g:5630:1: ( ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) ) ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* ) )
            {
            // InternalXemfs.g:5630:1: ( ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) ) ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* ) )
            // InternalXemfs.g:5631:1: ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) ) ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* )
            {
            // InternalXemfs.g:5631:1: ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) )
            // InternalXemfs.g:5632:1: ( rule__URL_HOST__Alternatives_1_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getAlternatives_1_0_1_1()); 
            }
            // InternalXemfs.g:5633:1: ( rule__URL_HOST__Alternatives_1_0_1_1 )
            // InternalXemfs.g:5633:2: rule__URL_HOST__Alternatives_1_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__URL_HOST__Alternatives_1_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getAlternatives_1_0_1_1()); 
            }

            }

            // InternalXemfs.g:5636:1: ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* )
            // InternalXemfs.g:5637:1: ( rule__URL_HOST__Alternatives_1_0_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getAlternatives_1_0_1_1()); 
            }
            // InternalXemfs.g:5638:1: ( rule__URL_HOST__Alternatives_1_0_1_1 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=14 && LA66_0<=23)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalXemfs.g:5638:2: rule__URL_HOST__Alternatives_1_0_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__URL_HOST__Alternatives_1_0_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getAlternatives_1_0_1_1()); 
            }

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
    // $ANTLR end "rule__URL_HOST__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__URL_PATH__Group__0"
    // InternalXemfs.g:5653:1: rule__URL_PATH__Group__0 : rule__URL_PATH__Group__0__Impl rule__URL_PATH__Group__1 ;
    public final void rule__URL_PATH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5657:1: ( rule__URL_PATH__Group__0__Impl rule__URL_PATH__Group__1 )
            // InternalXemfs.g:5658:2: rule__URL_PATH__Group__0__Impl rule__URL_PATH__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__URL_PATH__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_PATH__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_PATH__Group__0"


    // $ANTLR start "rule__URL_PATH__Group__0__Impl"
    // InternalXemfs.g:5665:1: rule__URL_PATH__Group__0__Impl : ( '/' ) ;
    public final void rule__URL_PATH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5669:1: ( ( '/' ) )
            // InternalXemfs.g:5670:1: ( '/' )
            {
            // InternalXemfs.g:5670:1: ( '/' )
            // InternalXemfs.g:5671:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getSolidusKeyword_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHAccess().getSolidusKeyword_0()); 
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
    // $ANTLR end "rule__URL_PATH__Group__0__Impl"


    // $ANTLR start "rule__URL_PATH__Group__1"
    // InternalXemfs.g:5684:1: rule__URL_PATH__Group__1 : rule__URL_PATH__Group__1__Impl rule__URL_PATH__Group__2 ;
    public final void rule__URL_PATH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5688:1: ( rule__URL_PATH__Group__1__Impl rule__URL_PATH__Group__2 )
            // InternalXemfs.g:5689:2: rule__URL_PATH__Group__1__Impl rule__URL_PATH__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__URL_PATH__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_PATH__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_PATH__Group__1"


    // $ANTLR start "rule__URL_PATH__Group__1__Impl"
    // InternalXemfs.g:5696:1: rule__URL_PATH__Group__1__Impl : ( ( rule__URL_PATH__Alternatives_1 )* ) ;
    public final void rule__URL_PATH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5700:1: ( ( ( rule__URL_PATH__Alternatives_1 )* ) )
            // InternalXemfs.g:5701:1: ( ( rule__URL_PATH__Alternatives_1 )* )
            {
            // InternalXemfs.g:5701:1: ( ( rule__URL_PATH__Alternatives_1 )* )
            // InternalXemfs.g:5702:1: ( rule__URL_PATH__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getAlternatives_1()); 
            }
            // InternalXemfs.g:5703:1: ( rule__URL_PATH__Alternatives_1 )*
            loop67:
            do {
                int alt67=2;
                alt67 = dfa67.predict(input);
                switch (alt67) {
            	case 1 :
            	    // InternalXemfs.g:5703:2: rule__URL_PATH__Alternatives_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_37);
            	    rule__URL_PATH__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__URL_PATH__Group__1__Impl"


    // $ANTLR start "rule__URL_PATH__Group__2"
    // InternalXemfs.g:5713:1: rule__URL_PATH__Group__2 : rule__URL_PATH__Group__2__Impl ;
    public final void rule__URL_PATH__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5717:1: ( rule__URL_PATH__Group__2__Impl )
            // InternalXemfs.g:5718:2: rule__URL_PATH__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_PATH__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_PATH__Group__2"


    // $ANTLR start "rule__URL_PATH__Group__2__Impl"
    // InternalXemfs.g:5724:1: rule__URL_PATH__Group__2__Impl : ( ( rule__URL_PATH__Alternatives_2 ) ) ;
    public final void rule__URL_PATH__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5728:1: ( ( ( rule__URL_PATH__Alternatives_2 ) ) )
            // InternalXemfs.g:5729:1: ( ( rule__URL_PATH__Alternatives_2 ) )
            {
            // InternalXemfs.g:5729:1: ( ( rule__URL_PATH__Alternatives_2 ) )
            // InternalXemfs.g:5730:1: ( rule__URL_PATH__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getAlternatives_2()); 
            }
            // InternalXemfs.g:5731:1: ( rule__URL_PATH__Alternatives_2 )
            // InternalXemfs.g:5731:2: rule__URL_PATH__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_PATH__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__URL_PATH__Group__2__Impl"


    // $ANTLR start "rule__URL_PATH__Group_1_1__0"
    // InternalXemfs.g:5747:1: rule__URL_PATH__Group_1_1__0 : rule__URL_PATH__Group_1_1__0__Impl rule__URL_PATH__Group_1_1__1 ;
    public final void rule__URL_PATH__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5751:1: ( rule__URL_PATH__Group_1_1__0__Impl rule__URL_PATH__Group_1_1__1 )
            // InternalXemfs.g:5752:2: rule__URL_PATH__Group_1_1__0__Impl rule__URL_PATH__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__URL_PATH__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_PATH__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_PATH__Group_1_1__0"


    // $ANTLR start "rule__URL_PATH__Group_1_1__0__Impl"
    // InternalXemfs.g:5759:1: rule__URL_PATH__Group_1_1__0__Impl : ( rulePROPERTY_REF ) ;
    public final void rule__URL_PATH__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5763:1: ( ( rulePROPERTY_REF ) )
            // InternalXemfs.g:5764:1: ( rulePROPERTY_REF )
            {
            // InternalXemfs.g:5764:1: ( rulePROPERTY_REF )
            // InternalXemfs.g:5765:1: rulePROPERTY_REF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getPROPERTY_REFParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePROPERTY_REF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHAccess().getPROPERTY_REFParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__URL_PATH__Group_1_1__0__Impl"


    // $ANTLR start "rule__URL_PATH__Group_1_1__1"
    // InternalXemfs.g:5776:1: rule__URL_PATH__Group_1_1__1 : rule__URL_PATH__Group_1_1__1__Impl ;
    public final void rule__URL_PATH__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5780:1: ( rule__URL_PATH__Group_1_1__1__Impl )
            // InternalXemfs.g:5781:2: rule__URL_PATH__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL_PATH__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_PATH__Group_1_1__1"


    // $ANTLR start "rule__URL_PATH__Group_1_1__1__Impl"
    // InternalXemfs.g:5787:1: rule__URL_PATH__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__URL_PATH__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5791:1: ( ( '/' ) )
            // InternalXemfs.g:5792:1: ( '/' )
            {
            // InternalXemfs.g:5792:1: ( '/' )
            // InternalXemfs.g:5793:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getSolidusKeyword_1_1_1()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHAccess().getSolidusKeyword_1_1_1()); 
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
    // $ANTLR end "rule__URL_PATH__Group_1_1__1__Impl"


    // $ANTLR start "rule__URL__Group__0"
    // InternalXemfs.g:5810:1: rule__URL__Group__0 : rule__URL__Group__0__Impl rule__URL__Group__1 ;
    public final void rule__URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5814:1: ( rule__URL__Group__0__Impl rule__URL__Group__1 )
            // InternalXemfs.g:5815:2: rule__URL__Group__0__Impl rule__URL__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__URL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__0"


    // $ANTLR start "rule__URL__Group__0__Impl"
    // InternalXemfs.g:5822:1: rule__URL__Group__0__Impl : ( ruleURL_SCHEME ) ;
    public final void rule__URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5826:1: ( ( ruleURL_SCHEME ) )
            // InternalXemfs.g:5827:1: ( ruleURL_SCHEME )
            {
            // InternalXemfs.g:5827:1: ( ruleURL_SCHEME )
            // InternalXemfs.g:5828:1: ruleURL_SCHEME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getURL_SCHEMEParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleURL_SCHEME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLAccess().getURL_SCHEMEParserRuleCall_0()); 
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
    // $ANTLR end "rule__URL__Group__0__Impl"


    // $ANTLR start "rule__URL__Group__1"
    // InternalXemfs.g:5839:1: rule__URL__Group__1 : rule__URL__Group__1__Impl rule__URL__Group__2 ;
    public final void rule__URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5843:1: ( rule__URL__Group__1__Impl rule__URL__Group__2 )
            // InternalXemfs.g:5844:2: rule__URL__Group__1__Impl rule__URL__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__URL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__1"


    // $ANTLR start "rule__URL__Group__1__Impl"
    // InternalXemfs.g:5851:1: rule__URL__Group__1__Impl : ( ':' ) ;
    public final void rule__URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5855:1: ( ( ':' ) )
            // InternalXemfs.g:5856:1: ( ':' )
            {
            // InternalXemfs.g:5856:1: ( ':' )
            // InternalXemfs.g:5857:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getColonKeyword_1()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__URL__Group__1__Impl"


    // $ANTLR start "rule__URL__Group__2"
    // InternalXemfs.g:5870:1: rule__URL__Group__2 : rule__URL__Group__2__Impl rule__URL__Group__3 ;
    public final void rule__URL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5874:1: ( rule__URL__Group__2__Impl rule__URL__Group__3 )
            // InternalXemfs.g:5875:2: rule__URL__Group__2__Impl rule__URL__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__URL__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__2"


    // $ANTLR start "rule__URL__Group__2__Impl"
    // InternalXemfs.g:5882:1: rule__URL__Group__2__Impl : ( ( ruleURL_HOST )? ) ;
    public final void rule__URL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5886:1: ( ( ( ruleURL_HOST )? ) )
            // InternalXemfs.g:5887:1: ( ( ruleURL_HOST )? )
            {
            // InternalXemfs.g:5887:1: ( ( ruleURL_HOST )? )
            // InternalXemfs.g:5888:1: ( ruleURL_HOST )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getURL_HOSTParserRuleCall_2()); 
            }
            // InternalXemfs.g:5889:1: ( ruleURL_HOST )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==49) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXemfs.g:5889:3: ruleURL_HOST
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleURL_HOST();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLAccess().getURL_HOSTParserRuleCall_2()); 
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
    // $ANTLR end "rule__URL__Group__2__Impl"


    // $ANTLR start "rule__URL__Group__3"
    // InternalXemfs.g:5899:1: rule__URL__Group__3 : rule__URL__Group__3__Impl ;
    public final void rule__URL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5903:1: ( rule__URL__Group__3__Impl )
            // InternalXemfs.g:5904:2: rule__URL__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URL__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__3"


    // $ANTLR start "rule__URL__Group__3__Impl"
    // InternalXemfs.g:5910:1: rule__URL__Group__3__Impl : ( ruleURL_PATH ) ;
    public final void rule__URL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5914:1: ( ( ruleURL_PATH ) )
            // InternalXemfs.g:5915:1: ( ruleURL_PATH )
            {
            // InternalXemfs.g:5915:1: ( ruleURL_PATH )
            // InternalXemfs.g:5916:1: ruleURL_PATH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getURL_PATHParserRuleCall_3()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleURL_PATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLAccess().getURL_PATHParserRuleCall_3()); 
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
    // $ANTLR end "rule__URL__Group__3__Impl"


    // $ANTLR start "rule__GitContentRef__Group__0"
    // InternalXemfs.g:5935:1: rule__GitContentRef__Group__0 : rule__GitContentRef__Group__0__Impl rule__GitContentRef__Group__1 ;
    public final void rule__GitContentRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5939:1: ( rule__GitContentRef__Group__0__Impl rule__GitContentRef__Group__1 )
            // InternalXemfs.g:5940:2: rule__GitContentRef__Group__0__Impl rule__GitContentRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__GitContentRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitContentRef__Group__0"


    // $ANTLR start "rule__GitContentRef__Group__0__Impl"
    // InternalXemfs.g:5947:1: rule__GitContentRef__Group__0__Impl : ( 'git' ) ;
    public final void rule__GitContentRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5951:1: ( ( 'git' ) )
            // InternalXemfs.g:5952:1: ( 'git' )
            {
            // InternalXemfs.g:5952:1: ( 'git' )
            // InternalXemfs.g:5953:1: 'git'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getGitKeyword_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getGitKeyword_0()); 
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
    // $ANTLR end "rule__GitContentRef__Group__0__Impl"


    // $ANTLR start "rule__GitContentRef__Group__1"
    // InternalXemfs.g:5966:1: rule__GitContentRef__Group__1 : rule__GitContentRef__Group__1__Impl rule__GitContentRef__Group__2 ;
    public final void rule__GitContentRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5970:1: ( rule__GitContentRef__Group__1__Impl rule__GitContentRef__Group__2 )
            // InternalXemfs.g:5971:2: rule__GitContentRef__Group__1__Impl rule__GitContentRef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__GitContentRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitContentRef__Group__1"


    // $ANTLR start "rule__GitContentRef__Group__1__Impl"
    // InternalXemfs.g:5978:1: rule__GitContentRef__Group__1__Impl : ( '@' ) ;
    public final void rule__GitContentRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:5982:1: ( ( '@' ) )
            // InternalXemfs.g:5983:1: ( '@' )
            {
            // InternalXemfs.g:5983:1: ( '@' )
            // InternalXemfs.g:5984:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getCommercialAtKeyword_1()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getCommercialAtKeyword_1()); 
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
    // $ANTLR end "rule__GitContentRef__Group__1__Impl"


    // $ANTLR start "rule__GitContentRef__Group__2"
    // InternalXemfs.g:5997:1: rule__GitContentRef__Group__2 : rule__GitContentRef__Group__2__Impl rule__GitContentRef__Group__3 ;
    public final void rule__GitContentRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6001:1: ( rule__GitContentRef__Group__2__Impl rule__GitContentRef__Group__3 )
            // InternalXemfs.g:6002:2: rule__GitContentRef__Group__2__Impl rule__GitContentRef__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__GitContentRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitContentRef__Group__2"


    // $ANTLR start "rule__GitContentRef__Group__2__Impl"
    // InternalXemfs.g:6009:1: rule__GitContentRef__Group__2__Impl : ( ( rule__GitContentRef__Alternatives_2 ) ) ;
    public final void rule__GitContentRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6013:1: ( ( ( rule__GitContentRef__Alternatives_2 ) ) )
            // InternalXemfs.g:6014:1: ( ( rule__GitContentRef__Alternatives_2 ) )
            {
            // InternalXemfs.g:6014:1: ( ( rule__GitContentRef__Alternatives_2 ) )
            // InternalXemfs.g:6015:1: ( rule__GitContentRef__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getAlternatives_2()); 
            }
            // InternalXemfs.g:6016:1: ( rule__GitContentRef__Alternatives_2 )
            // InternalXemfs.g:6016:2: rule__GitContentRef__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__GitContentRef__Group__2__Impl"


    // $ANTLR start "rule__GitContentRef__Group__3"
    // InternalXemfs.g:6026:1: rule__GitContentRef__Group__3 : rule__GitContentRef__Group__3__Impl rule__GitContentRef__Group__4 ;
    public final void rule__GitContentRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6030:1: ( rule__GitContentRef__Group__3__Impl rule__GitContentRef__Group__4 )
            // InternalXemfs.g:6031:2: rule__GitContentRef__Group__3__Impl rule__GitContentRef__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GitContentRef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitContentRef__Group__3"


    // $ANTLR start "rule__GitContentRef__Group__3__Impl"
    // InternalXemfs.g:6038:1: rule__GitContentRef__Group__3__Impl : ( '/' ) ;
    public final void rule__GitContentRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6042:1: ( ( '/' ) )
            // InternalXemfs.g:6043:1: ( '/' )
            {
            // InternalXemfs.g:6043:1: ( '/' )
            // InternalXemfs.g:6044:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getSolidusKeyword_3()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getSolidusKeyword_3()); 
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
    // $ANTLR end "rule__GitContentRef__Group__3__Impl"


    // $ANTLR start "rule__GitContentRef__Group__4"
    // InternalXemfs.g:6057:1: rule__GitContentRef__Group__4 : rule__GitContentRef__Group__4__Impl rule__GitContentRef__Group__5 ;
    public final void rule__GitContentRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6061:1: ( rule__GitContentRef__Group__4__Impl rule__GitContentRef__Group__5 )
            // InternalXemfs.g:6062:2: rule__GitContentRef__Group__4__Impl rule__GitContentRef__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__GitContentRef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitContentRef__Group__4"


    // $ANTLR start "rule__GitContentRef__Group__4__Impl"
    // InternalXemfs.g:6069:1: rule__GitContentRef__Group__4__Impl : ( ( rule__GitContentRef__RepoAssignment_4 ) ) ;
    public final void rule__GitContentRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6073:1: ( ( ( rule__GitContentRef__RepoAssignment_4 ) ) )
            // InternalXemfs.g:6074:1: ( ( rule__GitContentRef__RepoAssignment_4 ) )
            {
            // InternalXemfs.g:6074:1: ( ( rule__GitContentRef__RepoAssignment_4 ) )
            // InternalXemfs.g:6075:1: ( rule__GitContentRef__RepoAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getRepoAssignment_4()); 
            }
            // InternalXemfs.g:6076:1: ( rule__GitContentRef__RepoAssignment_4 )
            // InternalXemfs.g:6076:2: rule__GitContentRef__RepoAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__RepoAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getRepoAssignment_4()); 
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
    // $ANTLR end "rule__GitContentRef__Group__4__Impl"


    // $ANTLR start "rule__GitContentRef__Group__5"
    // InternalXemfs.g:6086:1: rule__GitContentRef__Group__5 : rule__GitContentRef__Group__5__Impl ;
    public final void rule__GitContentRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6090:1: ( rule__GitContentRef__Group__5__Impl )
            // InternalXemfs.g:6091:2: rule__GitContentRef__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitContentRef__Group__5"


    // $ANTLR start "rule__GitContentRef__Group__5__Impl"
    // InternalXemfs.g:6097:1: rule__GitContentRef__Group__5__Impl : ( ( rule__GitContentRef__PathAssignment_5 )? ) ;
    public final void rule__GitContentRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6101:1: ( ( ( rule__GitContentRef__PathAssignment_5 )? ) )
            // InternalXemfs.g:6102:1: ( ( rule__GitContentRef__PathAssignment_5 )? )
            {
            // InternalXemfs.g:6102:1: ( ( rule__GitContentRef__PathAssignment_5 )? )
            // InternalXemfs.g:6103:1: ( rule__GitContentRef__PathAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getPathAssignment_5()); 
            }
            // InternalXemfs.g:6104:1: ( rule__GitContentRef__PathAssignment_5 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==24) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalXemfs.g:6104:2: rule__GitContentRef__PathAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GitContentRef__PathAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getPathAssignment_5()); 
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
    // $ANTLR end "rule__GitContentRef__Group__5__Impl"


    // $ANTLR start "rule__GitContentRef__Group_2_0__0"
    // InternalXemfs.g:6126:1: rule__GitContentRef__Group_2_0__0 : rule__GitContentRef__Group_2_0__0__Impl rule__GitContentRef__Group_2_0__1 ;
    public final void rule__GitContentRef__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6130:1: ( rule__GitContentRef__Group_2_0__0__Impl rule__GitContentRef__Group_2_0__1 )
            // InternalXemfs.g:6131:2: rule__GitContentRef__Group_2_0__0__Impl rule__GitContentRef__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__GitContentRef__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitContentRef__Group_2_0__0"


    // $ANTLR start "rule__GitContentRef__Group_2_0__0__Impl"
    // InternalXemfs.g:6138:1: rule__GitContentRef__Group_2_0__0__Impl : ( ( rule__GitContentRef__HostAssignment_2_0_0 ) ) ;
    public final void rule__GitContentRef__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6142:1: ( ( ( rule__GitContentRef__HostAssignment_2_0_0 ) ) )
            // InternalXemfs.g:6143:1: ( ( rule__GitContentRef__HostAssignment_2_0_0 ) )
            {
            // InternalXemfs.g:6143:1: ( ( rule__GitContentRef__HostAssignment_2_0_0 ) )
            // InternalXemfs.g:6144:1: ( rule__GitContentRef__HostAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getHostAssignment_2_0_0()); 
            }
            // InternalXemfs.g:6145:1: ( rule__GitContentRef__HostAssignment_2_0_0 )
            // InternalXemfs.g:6145:2: rule__GitContentRef__HostAssignment_2_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__HostAssignment_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getHostAssignment_2_0_0()); 
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
    // $ANTLR end "rule__GitContentRef__Group_2_0__0__Impl"


    // $ANTLR start "rule__GitContentRef__Group_2_0__1"
    // InternalXemfs.g:6155:1: rule__GitContentRef__Group_2_0__1 : rule__GitContentRef__Group_2_0__1__Impl ;
    public final void rule__GitContentRef__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6159:1: ( rule__GitContentRef__Group_2_0__1__Impl )
            // InternalXemfs.g:6160:2: rule__GitContentRef__Group_2_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitContentRef__Group_2_0__1"


    // $ANTLR start "rule__GitContentRef__Group_2_0__1__Impl"
    // InternalXemfs.g:6166:1: rule__GitContentRef__Group_2_0__1__Impl : ( ( rule__GitContentRef__Group_2_0_1__0 )? ) ;
    public final void rule__GitContentRef__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6170:1: ( ( ( rule__GitContentRef__Group_2_0_1__0 )? ) )
            // InternalXemfs.g:6171:1: ( ( rule__GitContentRef__Group_2_0_1__0 )? )
            {
            // InternalXemfs.g:6171:1: ( ( rule__GitContentRef__Group_2_0_1__0 )? )
            // InternalXemfs.g:6172:1: ( rule__GitContentRef__Group_2_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getGroup_2_0_1()); 
            }
            // InternalXemfs.g:6173:1: ( rule__GitContentRef__Group_2_0_1__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==43) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXemfs.g:6173:2: rule__GitContentRef__Group_2_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GitContentRef__Group_2_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getGroup_2_0_1()); 
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
    // $ANTLR end "rule__GitContentRef__Group_2_0__1__Impl"


    // $ANTLR start "rule__GitContentRef__Group_2_0_1__0"
    // InternalXemfs.g:6187:1: rule__GitContentRef__Group_2_0_1__0 : rule__GitContentRef__Group_2_0_1__0__Impl rule__GitContentRef__Group_2_0_1__1 ;
    public final void rule__GitContentRef__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6191:1: ( rule__GitContentRef__Group_2_0_1__0__Impl rule__GitContentRef__Group_2_0_1__1 )
            // InternalXemfs.g:6192:2: rule__GitContentRef__Group_2_0_1__0__Impl rule__GitContentRef__Group_2_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__GitContentRef__Group_2_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group_2_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitContentRef__Group_2_0_1__0"


    // $ANTLR start "rule__GitContentRef__Group_2_0_1__0__Impl"
    // InternalXemfs.g:6199:1: rule__GitContentRef__Group_2_0_1__0__Impl : ( ':' ) ;
    public final void rule__GitContentRef__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6203:1: ( ( ':' ) )
            // InternalXemfs.g:6204:1: ( ':' )
            {
            // InternalXemfs.g:6204:1: ( ':' )
            // InternalXemfs.g:6205:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getColonKeyword_2_0_1_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getColonKeyword_2_0_1_0()); 
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
    // $ANTLR end "rule__GitContentRef__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__GitContentRef__Group_2_0_1__1"
    // InternalXemfs.g:6218:1: rule__GitContentRef__Group_2_0_1__1 : rule__GitContentRef__Group_2_0_1__1__Impl ;
    public final void rule__GitContentRef__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6222:1: ( rule__GitContentRef__Group_2_0_1__1__Impl )
            // InternalXemfs.g:6223:2: rule__GitContentRef__Group_2_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__Group_2_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GitContentRef__Group_2_0_1__1"


    // $ANTLR start "rule__GitContentRef__Group_2_0_1__1__Impl"
    // InternalXemfs.g:6229:1: rule__GitContentRef__Group_2_0_1__1__Impl : ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) ) ;
    public final void rule__GitContentRef__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6233:1: ( ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) ) )
            // InternalXemfs.g:6234:1: ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) )
            {
            // InternalXemfs.g:6234:1: ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) )
            // InternalXemfs.g:6235:1: ( rule__GitContentRef__OwnerAssignment_2_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getOwnerAssignment_2_0_1_1()); 
            }
            // InternalXemfs.g:6236:1: ( rule__GitContentRef__OwnerAssignment_2_0_1_1 )
            // InternalXemfs.g:6236:2: rule__GitContentRef__OwnerAssignment_2_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__OwnerAssignment_2_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getOwnerAssignment_2_0_1_1()); 
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
    // $ANTLR end "rule__GitContentRef__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__DotClasspathFileContentProvider__Group__0"
    // InternalXemfs.g:6250:1: rule__DotClasspathFileContentProvider__Group__0 : rule__DotClasspathFileContentProvider__Group__0__Impl rule__DotClasspathFileContentProvider__Group__1 ;
    public final void rule__DotClasspathFileContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6254:1: ( rule__DotClasspathFileContentProvider__Group__0__Impl rule__DotClasspathFileContentProvider__Group__1 )
            // InternalXemfs.g:6255:2: rule__DotClasspathFileContentProvider__Group__0__Impl rule__DotClasspathFileContentProvider__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__DotClasspathFileContentProvider__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotClasspathFileContentProvider__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotClasspathFileContentProvider__Group__0"


    // $ANTLR start "rule__DotClasspathFileContentProvider__Group__0__Impl"
    // InternalXemfs.g:6262:1: rule__DotClasspathFileContentProvider__Group__0__Impl : ( 'dot.classpath' ) ;
    public final void rule__DotClasspathFileContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6266:1: ( ( 'dot.classpath' ) )
            // InternalXemfs.g:6267:1: ( 'dot.classpath' )
            {
            // InternalXemfs.g:6267:1: ( 'dot.classpath' )
            // InternalXemfs.g:6268:1: 'dot.classpath'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getDotClasspathKeyword_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderAccess().getDotClasspathKeyword_0()); 
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
    // $ANTLR end "rule__DotClasspathFileContentProvider__Group__0__Impl"


    // $ANTLR start "rule__DotClasspathFileContentProvider__Group__1"
    // InternalXemfs.g:6281:1: rule__DotClasspathFileContentProvider__Group__1 : rule__DotClasspathFileContentProvider__Group__1__Impl rule__DotClasspathFileContentProvider__Group__2 ;
    public final void rule__DotClasspathFileContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6285:1: ( rule__DotClasspathFileContentProvider__Group__1__Impl rule__DotClasspathFileContentProvider__Group__2 )
            // InternalXemfs.g:6286:2: rule__DotClasspathFileContentProvider__Group__1__Impl rule__DotClasspathFileContentProvider__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__DotClasspathFileContentProvider__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotClasspathFileContentProvider__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotClasspathFileContentProvider__Group__1"


    // $ANTLR start "rule__DotClasspathFileContentProvider__Group__1__Impl"
    // InternalXemfs.g:6293:1: rule__DotClasspathFileContentProvider__Group__1__Impl : ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) ) ;
    public final void rule__DotClasspathFileContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6297:1: ( ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) ) )
            // InternalXemfs.g:6298:1: ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) )
            {
            // InternalXemfs.g:6298:1: ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) )
            // InternalXemfs.g:6299:1: ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* )
            {
            // InternalXemfs.g:6299:1: ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) )
            // InternalXemfs.g:6300:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAssignment_1()); 
            }
            // InternalXemfs.g:6301:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )
            // InternalXemfs.g:6301:2: rule__DotClasspathFileContentProvider__EntriesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__DotClasspathFileContentProvider__EntriesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAssignment_1()); 
            }

            }

            // InternalXemfs.g:6304:1: ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* )
            // InternalXemfs.g:6305:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAssignment_1()); 
            }
            // InternalXemfs.g:6306:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=31 && LA71_0<=34)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalXemfs.g:6306:2: rule__DotClasspathFileContentProvider__EntriesAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    rule__DotClasspathFileContentProvider__EntriesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAssignment_1()); 
            }

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
    // $ANTLR end "rule__DotClasspathFileContentProvider__Group__1__Impl"


    // $ANTLR start "rule__DotClasspathFileContentProvider__Group__2"
    // InternalXemfs.g:6317:1: rule__DotClasspathFileContentProvider__Group__2 : rule__DotClasspathFileContentProvider__Group__2__Impl ;
    public final void rule__DotClasspathFileContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6321:1: ( rule__DotClasspathFileContentProvider__Group__2__Impl )
            // InternalXemfs.g:6322:2: rule__DotClasspathFileContentProvider__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotClasspathFileContentProvider__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotClasspathFileContentProvider__Group__2"


    // $ANTLR start "rule__DotClasspathFileContentProvider__Group__2__Impl"
    // InternalXemfs.g:6328:1: rule__DotClasspathFileContentProvider__Group__2__Impl : ( ';' ) ;
    public final void rule__DotClasspathFileContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6332:1: ( ( ';' ) )
            // InternalXemfs.g:6333:1: ( ';' )
            {
            // InternalXemfs.g:6333:1: ( ';' )
            // InternalXemfs.g:6334:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getSemicolonKeyword_2()); 
            }
            match(input,9,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__DotClasspathFileContentProvider__Group__2__Impl"


    // $ANTLR start "rule__CLASSPATH_ENTRY_PATH__Group__0"
    // InternalXemfs.g:6353:1: rule__CLASSPATH_ENTRY_PATH__Group__0 : rule__CLASSPATH_ENTRY_PATH__Group__0__Impl rule__CLASSPATH_ENTRY_PATH__Group__1 ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6357:1: ( rule__CLASSPATH_ENTRY_PATH__Group__0__Impl rule__CLASSPATH_ENTRY_PATH__Group__1 )
            // InternalXemfs.g:6358:2: rule__CLASSPATH_ENTRY_PATH__Group__0__Impl rule__CLASSPATH_ENTRY_PATH__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__CLASSPATH_ENTRY_PATH__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CLASSPATH_ENTRY_PATH__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASSPATH_ENTRY_PATH__Group__0"


    // $ANTLR start "rule__CLASSPATH_ENTRY_PATH__Group__0__Impl"
    // InternalXemfs.g:6365:1: rule__CLASSPATH_ENTRY_PATH__Group__0__Impl : ( ( ruleFolderName )* ) ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6369:1: ( ( ( ruleFolderName )* ) )
            // InternalXemfs.g:6370:1: ( ( ruleFolderName )* )
            {
            // InternalXemfs.g:6370:1: ( ( ruleFolderName )* )
            // InternalXemfs.g:6371:1: ( ruleFolderName )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFolderNameParserRuleCall_0()); 
            }
            // InternalXemfs.g:6372:1: ( ruleFolderName )*
            loop72:
            do {
                int alt72=2;
                alt72 = dfa72.predict(input);
                switch (alt72) {
            	case 1 :
            	    // InternalXemfs.g:6372:3: ruleFolderName
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    ruleFolderName();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFolderNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__CLASSPATH_ENTRY_PATH__Group__0__Impl"


    // $ANTLR start "rule__CLASSPATH_ENTRY_PATH__Group__1"
    // InternalXemfs.g:6382:1: rule__CLASSPATH_ENTRY_PATH__Group__1 : rule__CLASSPATH_ENTRY_PATH__Group__1__Impl ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6386:1: ( rule__CLASSPATH_ENTRY_PATH__Group__1__Impl )
            // InternalXemfs.g:6387:2: rule__CLASSPATH_ENTRY_PATH__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CLASSPATH_ENTRY_PATH__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLASSPATH_ENTRY_PATH__Group__1"


    // $ANTLR start "rule__CLASSPATH_ENTRY_PATH__Group__1__Impl"
    // InternalXemfs.g:6393:1: rule__CLASSPATH_ENTRY_PATH__Group__1__Impl : ( ruleFileName ) ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6397:1: ( ( ruleFileName ) )
            // InternalXemfs.g:6398:1: ( ruleFileName )
            {
            // InternalXemfs.g:6398:1: ( ruleFileName )
            // InternalXemfs.g:6399:1: ruleFileName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFileNameParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFileName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFileNameParserRuleCall_1()); 
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
    // $ANTLR end "rule__CLASSPATH_ENTRY_PATH__Group__1__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group__0"
    // InternalXemfs.g:6414:1: rule__ClasspathEntry__Group__0 : rule__ClasspathEntry__Group__0__Impl rule__ClasspathEntry__Group__1 ;
    public final void rule__ClasspathEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6418:1: ( rule__ClasspathEntry__Group__0__Impl rule__ClasspathEntry__Group__1 )
            // InternalXemfs.g:6419:2: rule__ClasspathEntry__Group__0__Impl rule__ClasspathEntry__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__ClasspathEntry__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group__0"


    // $ANTLR start "rule__ClasspathEntry__Group__0__Impl"
    // InternalXemfs.g:6426:1: rule__ClasspathEntry__Group__0__Impl : ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) ) ;
    public final void rule__ClasspathEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6430:1: ( ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) ) )
            // InternalXemfs.g:6431:1: ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) )
            {
            // InternalXemfs.g:6431:1: ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) )
            // InternalXemfs.g:6432:1: ( rule__ClasspathEntry__ExplicitKindAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitKindAssignment_0()); 
            }
            // InternalXemfs.g:6433:1: ( rule__ClasspathEntry__ExplicitKindAssignment_0 )
            // InternalXemfs.g:6433:2: rule__ClasspathEntry__ExplicitKindAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__ExplicitKindAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getExplicitKindAssignment_0()); 
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
    // $ANTLR end "rule__ClasspathEntry__Group__0__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group__1"
    // InternalXemfs.g:6443:1: rule__ClasspathEntry__Group__1 : rule__ClasspathEntry__Group__1__Impl rule__ClasspathEntry__Group__2 ;
    public final void rule__ClasspathEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6447:1: ( rule__ClasspathEntry__Group__1__Impl rule__ClasspathEntry__Group__2 )
            // InternalXemfs.g:6448:2: rule__ClasspathEntry__Group__1__Impl rule__ClasspathEntry__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__ClasspathEntry__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group__1"


    // $ANTLR start "rule__ClasspathEntry__Group__1__Impl"
    // InternalXemfs.g:6455:1: rule__ClasspathEntry__Group__1__Impl : ( ( rule__ClasspathEntry__AbsoluteAssignment_1 )? ) ;
    public final void rule__ClasspathEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6459:1: ( ( ( rule__ClasspathEntry__AbsoluteAssignment_1 )? ) )
            // InternalXemfs.g:6460:1: ( ( rule__ClasspathEntry__AbsoluteAssignment_1 )? )
            {
            // InternalXemfs.g:6460:1: ( ( rule__ClasspathEntry__AbsoluteAssignment_1 )? )
            // InternalXemfs.g:6461:1: ( rule__ClasspathEntry__AbsoluteAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getAbsoluteAssignment_1()); 
            }
            // InternalXemfs.g:6462:1: ( rule__ClasspathEntry__AbsoluteAssignment_1 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==24) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalXemfs.g:6462:2: rule__ClasspathEntry__AbsoluteAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ClasspathEntry__AbsoluteAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getAbsoluteAssignment_1()); 
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
    // $ANTLR end "rule__ClasspathEntry__Group__1__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group__2"
    // InternalXemfs.g:6472:1: rule__ClasspathEntry__Group__2 : rule__ClasspathEntry__Group__2__Impl rule__ClasspathEntry__Group__3 ;
    public final void rule__ClasspathEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6476:1: ( rule__ClasspathEntry__Group__2__Impl rule__ClasspathEntry__Group__3 )
            // InternalXemfs.g:6477:2: rule__ClasspathEntry__Group__2__Impl rule__ClasspathEntry__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ClasspathEntry__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group__2"


    // $ANTLR start "rule__ClasspathEntry__Group__2__Impl"
    // InternalXemfs.g:6484:1: rule__ClasspathEntry__Group__2__Impl : ( ( rule__ClasspathEntry__ExplicitPathAssignment_2 ) ) ;
    public final void rule__ClasspathEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6488:1: ( ( ( rule__ClasspathEntry__ExplicitPathAssignment_2 ) ) )
            // InternalXemfs.g:6489:1: ( ( rule__ClasspathEntry__ExplicitPathAssignment_2 ) )
            {
            // InternalXemfs.g:6489:1: ( ( rule__ClasspathEntry__ExplicitPathAssignment_2 ) )
            // InternalXemfs.g:6490:1: ( rule__ClasspathEntry__ExplicitPathAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitPathAssignment_2()); 
            }
            // InternalXemfs.g:6491:1: ( rule__ClasspathEntry__ExplicitPathAssignment_2 )
            // InternalXemfs.g:6491:2: rule__ClasspathEntry__ExplicitPathAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__ExplicitPathAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getExplicitPathAssignment_2()); 
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
    // $ANTLR end "rule__ClasspathEntry__Group__2__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group__3"
    // InternalXemfs.g:6501:1: rule__ClasspathEntry__Group__3 : rule__ClasspathEntry__Group__3__Impl ;
    public final void rule__ClasspathEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6505:1: ( rule__ClasspathEntry__Group__3__Impl )
            // InternalXemfs.g:6506:2: rule__ClasspathEntry__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group__3"


    // $ANTLR start "rule__ClasspathEntry__Group__3__Impl"
    // InternalXemfs.g:6512:1: rule__ClasspathEntry__Group__3__Impl : ( ( rule__ClasspathEntry__Group_3__0 )? ) ;
    public final void rule__ClasspathEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6516:1: ( ( ( rule__ClasspathEntry__Group_3__0 )? ) )
            // InternalXemfs.g:6517:1: ( ( rule__ClasspathEntry__Group_3__0 )? )
            {
            // InternalXemfs.g:6517:1: ( ( rule__ClasspathEntry__Group_3__0 )? )
            // InternalXemfs.g:6518:1: ( rule__ClasspathEntry__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getGroup_3()); 
            }
            // InternalXemfs.g:6519:1: ( rule__ClasspathEntry__Group_3__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==52) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalXemfs.g:6519:2: rule__ClasspathEntry__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ClasspathEntry__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getGroup_3()); 
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
    // $ANTLR end "rule__ClasspathEntry__Group__3__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_3__0"
    // InternalXemfs.g:6537:1: rule__ClasspathEntry__Group_3__0 : rule__ClasspathEntry__Group_3__0__Impl rule__ClasspathEntry__Group_3__1 ;
    public final void rule__ClasspathEntry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6541:1: ( rule__ClasspathEntry__Group_3__0__Impl rule__ClasspathEntry__Group_3__1 )
            // InternalXemfs.g:6542:2: rule__ClasspathEntry__Group_3__0__Impl rule__ClasspathEntry__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__ClasspathEntry__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_3__0"


    // $ANTLR start "rule__ClasspathEntry__Group_3__0__Impl"
    // InternalXemfs.g:6549:1: rule__ClasspathEntry__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ClasspathEntry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6553:1: ( ( '(' ) )
            // InternalXemfs.g:6554:1: ( '(' )
            {
            // InternalXemfs.g:6554:1: ( '(' )
            // InternalXemfs.g:6555:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getLeftParenthesisKeyword_3_0()); 
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
    // $ANTLR end "rule__ClasspathEntry__Group_3__0__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_3__1"
    // InternalXemfs.g:6568:1: rule__ClasspathEntry__Group_3__1 : rule__ClasspathEntry__Group_3__1__Impl rule__ClasspathEntry__Group_3__2 ;
    public final void rule__ClasspathEntry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6572:1: ( rule__ClasspathEntry__Group_3__1__Impl rule__ClasspathEntry__Group_3__2 )
            // InternalXemfs.g:6573:2: rule__ClasspathEntry__Group_3__1__Impl rule__ClasspathEntry__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__ClasspathEntry__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_3__1"


    // $ANTLR start "rule__ClasspathEntry__Group_3__1__Impl"
    // InternalXemfs.g:6580:1: rule__ClasspathEntry__Group_3__1__Impl : ( ( rule__ClasspathEntry__MajorAssignment_3_1 ) ) ;
    public final void rule__ClasspathEntry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6584:1: ( ( ( rule__ClasspathEntry__MajorAssignment_3_1 ) ) )
            // InternalXemfs.g:6585:1: ( ( rule__ClasspathEntry__MajorAssignment_3_1 ) )
            {
            // InternalXemfs.g:6585:1: ( ( rule__ClasspathEntry__MajorAssignment_3_1 ) )
            // InternalXemfs.g:6586:1: ( rule__ClasspathEntry__MajorAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMajorAssignment_3_1()); 
            }
            // InternalXemfs.g:6587:1: ( rule__ClasspathEntry__MajorAssignment_3_1 )
            // InternalXemfs.g:6587:2: rule__ClasspathEntry__MajorAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__MajorAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getMajorAssignment_3_1()); 
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
    // $ANTLR end "rule__ClasspathEntry__Group_3__1__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_3__2"
    // InternalXemfs.g:6597:1: rule__ClasspathEntry__Group_3__2 : rule__ClasspathEntry__Group_3__2__Impl rule__ClasspathEntry__Group_3__3 ;
    public final void rule__ClasspathEntry__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6601:1: ( rule__ClasspathEntry__Group_3__2__Impl rule__ClasspathEntry__Group_3__3 )
            // InternalXemfs.g:6602:2: rule__ClasspathEntry__Group_3__2__Impl rule__ClasspathEntry__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__ClasspathEntry__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_3__2"


    // $ANTLR start "rule__ClasspathEntry__Group_3__2__Impl"
    // InternalXemfs.g:6609:1: rule__ClasspathEntry__Group_3__2__Impl : ( ( rule__ClasspathEntry__Group_3_2__0 )? ) ;
    public final void rule__ClasspathEntry__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6613:1: ( ( ( rule__ClasspathEntry__Group_3_2__0 )? ) )
            // InternalXemfs.g:6614:1: ( ( rule__ClasspathEntry__Group_3_2__0 )? )
            {
            // InternalXemfs.g:6614:1: ( ( rule__ClasspathEntry__Group_3_2__0 )? )
            // InternalXemfs.g:6615:1: ( rule__ClasspathEntry__Group_3_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getGroup_3_2()); 
            }
            // InternalXemfs.g:6616:1: ( rule__ClasspathEntry__Group_3_2__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==38) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalXemfs.g:6616:2: rule__ClasspathEntry__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ClasspathEntry__Group_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__ClasspathEntry__Group_3__2__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_3__3"
    // InternalXemfs.g:6626:1: rule__ClasspathEntry__Group_3__3 : rule__ClasspathEntry__Group_3__3__Impl ;
    public final void rule__ClasspathEntry__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6630:1: ( rule__ClasspathEntry__Group_3__3__Impl )
            // InternalXemfs.g:6631:2: rule__ClasspathEntry__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_3__3"


    // $ANTLR start "rule__ClasspathEntry__Group_3__3__Impl"
    // InternalXemfs.g:6637:1: rule__ClasspathEntry__Group_3__3__Impl : ( ')' ) ;
    public final void rule__ClasspathEntry__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6641:1: ( ( ')' ) )
            // InternalXemfs.g:6642:1: ( ')' )
            {
            // InternalXemfs.g:6642:1: ( ')' )
            // InternalXemfs.g:6643:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getRightParenthesisKeyword_3_3()); 
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
    // $ANTLR end "rule__ClasspathEntry__Group_3__3__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_3_2__0"
    // InternalXemfs.g:6664:1: rule__ClasspathEntry__Group_3_2__0 : rule__ClasspathEntry__Group_3_2__0__Impl rule__ClasspathEntry__Group_3_2__1 ;
    public final void rule__ClasspathEntry__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6668:1: ( rule__ClasspathEntry__Group_3_2__0__Impl rule__ClasspathEntry__Group_3_2__1 )
            // InternalXemfs.g:6669:2: rule__ClasspathEntry__Group_3_2__0__Impl rule__ClasspathEntry__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__ClasspathEntry__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_3_2__0"


    // $ANTLR start "rule__ClasspathEntry__Group_3_2__0__Impl"
    // InternalXemfs.g:6676:1: rule__ClasspathEntry__Group_3_2__0__Impl : ( '.' ) ;
    public final void rule__ClasspathEntry__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6680:1: ( ( '.' ) )
            // InternalXemfs.g:6681:1: ( '.' )
            {
            // InternalXemfs.g:6681:1: ( '.' )
            // InternalXemfs.g:6682:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getFullStopKeyword_3_2_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getFullStopKeyword_3_2_0()); 
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
    // $ANTLR end "rule__ClasspathEntry__Group_3_2__0__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_3_2__1"
    // InternalXemfs.g:6695:1: rule__ClasspathEntry__Group_3_2__1 : rule__ClasspathEntry__Group_3_2__1__Impl ;
    public final void rule__ClasspathEntry__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6699:1: ( rule__ClasspathEntry__Group_3_2__1__Impl )
            // InternalXemfs.g:6700:2: rule__ClasspathEntry__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_3_2__1"


    // $ANTLR start "rule__ClasspathEntry__Group_3_2__1__Impl"
    // InternalXemfs.g:6706:1: rule__ClasspathEntry__Group_3_2__1__Impl : ( ( rule__ClasspathEntry__MinorAssignment_3_2_1 ) ) ;
    public final void rule__ClasspathEntry__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6710:1: ( ( ( rule__ClasspathEntry__MinorAssignment_3_2_1 ) ) )
            // InternalXemfs.g:6711:1: ( ( rule__ClasspathEntry__MinorAssignment_3_2_1 ) )
            {
            // InternalXemfs.g:6711:1: ( ( rule__ClasspathEntry__MinorAssignment_3_2_1 ) )
            // InternalXemfs.g:6712:1: ( rule__ClasspathEntry__MinorAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMinorAssignment_3_2_1()); 
            }
            // InternalXemfs.g:6713:1: ( rule__ClasspathEntry__MinorAssignment_3_2_1 )
            // InternalXemfs.g:6713:2: rule__ClasspathEntry__MinorAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ClasspathEntry__MinorAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getMinorAssignment_3_2_1()); 
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
    // $ANTLR end "rule__ClasspathEntry__Group_3_2__1__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group__0"
    // InternalXemfs.g:6727:1: rule__DotProjectFileContentProvider__Group__0 : rule__DotProjectFileContentProvider__Group__0__Impl rule__DotProjectFileContentProvider__Group__1 ;
    public final void rule__DotProjectFileContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6731:1: ( rule__DotProjectFileContentProvider__Group__0__Impl rule__DotProjectFileContentProvider__Group__1 )
            // InternalXemfs.g:6732:2: rule__DotProjectFileContentProvider__Group__0__Impl rule__DotProjectFileContentProvider__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__DotProjectFileContentProvider__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group__0"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group__0__Impl"
    // InternalXemfs.g:6739:1: rule__DotProjectFileContentProvider__Group__0__Impl : ( 'dot.project' ) ;
    public final void rule__DotProjectFileContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6743:1: ( ( 'dot.project' ) )
            // InternalXemfs.g:6744:1: ( 'dot.project' )
            {
            // InternalXemfs.g:6744:1: ( 'dot.project' )
            // InternalXemfs.g:6745:1: 'dot.project'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getDotProjectKeyword_0()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getDotProjectKeyword_0()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group__0__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group__1"
    // InternalXemfs.g:6758:1: rule__DotProjectFileContentProvider__Group__1 : rule__DotProjectFileContentProvider__Group__1__Impl rule__DotProjectFileContentProvider__Group__2 ;
    public final void rule__DotProjectFileContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6762:1: ( rule__DotProjectFileContentProvider__Group__1__Impl rule__DotProjectFileContentProvider__Group__2 )
            // InternalXemfs.g:6763:2: rule__DotProjectFileContentProvider__Group__1__Impl rule__DotProjectFileContentProvider__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__DotProjectFileContentProvider__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group__1"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group__1__Impl"
    // InternalXemfs.g:6770:1: rule__DotProjectFileContentProvider__Group__1__Impl : ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) ) ;
    public final void rule__DotProjectFileContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6774:1: ( ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) ) )
            // InternalXemfs.g:6775:1: ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) )
            {
            // InternalXemfs.g:6775:1: ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) )
            // InternalXemfs.g:6776:1: ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* )
            {
            // InternalXemfs.g:6776:1: ( ( rule__DotProjectFileContentProvider__Group_1__0 ) )
            // InternalXemfs.g:6777:1: ( rule__DotProjectFileContentProvider__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_1()); 
            }
            // InternalXemfs.g:6778:1: ( rule__DotProjectFileContentProvider__Group_1__0 )
            // InternalXemfs.g:6778:2: rule__DotProjectFileContentProvider__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DotProjectFileContentProvider__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_1()); 
            }

            }

            // InternalXemfs.g:6781:1: ( ( rule__DotProjectFileContentProvider__Group_1__0 )* )
            // InternalXemfs.g:6782:1: ( rule__DotProjectFileContentProvider__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_1()); 
            }
            // InternalXemfs.g:6783:1: ( rule__DotProjectFileContentProvider__Group_1__0 )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==36) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalXemfs.g:6783:2: rule__DotProjectFileContentProvider__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__DotProjectFileContentProvider__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group__1__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group__2"
    // InternalXemfs.g:6794:1: rule__DotProjectFileContentProvider__Group__2 : rule__DotProjectFileContentProvider__Group__2__Impl rule__DotProjectFileContentProvider__Group__3 ;
    public final void rule__DotProjectFileContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6798:1: ( rule__DotProjectFileContentProvider__Group__2__Impl rule__DotProjectFileContentProvider__Group__3 )
            // InternalXemfs.g:6799:2: rule__DotProjectFileContentProvider__Group__2__Impl rule__DotProjectFileContentProvider__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__DotProjectFileContentProvider__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group__2"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group__2__Impl"
    // InternalXemfs.g:6806:1: rule__DotProjectFileContentProvider__Group__2__Impl : ( ( rule__DotProjectFileContentProvider__Group_2__0 )* ) ;
    public final void rule__DotProjectFileContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6810:1: ( ( ( rule__DotProjectFileContentProvider__Group_2__0 )* ) )
            // InternalXemfs.g:6811:1: ( ( rule__DotProjectFileContentProvider__Group_2__0 )* )
            {
            // InternalXemfs.g:6811:1: ( ( rule__DotProjectFileContentProvider__Group_2__0 )* )
            // InternalXemfs.g:6812:1: ( rule__DotProjectFileContentProvider__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_2()); 
            }
            // InternalXemfs.g:6813:1: ( rule__DotProjectFileContentProvider__Group_2__0 )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==42) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalXemfs.g:6813:2: rule__DotProjectFileContentProvider__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    rule__DotProjectFileContentProvider__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_2()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group__2__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group__3"
    // InternalXemfs.g:6823:1: rule__DotProjectFileContentProvider__Group__3 : rule__DotProjectFileContentProvider__Group__3__Impl ;
    public final void rule__DotProjectFileContentProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6827:1: ( rule__DotProjectFileContentProvider__Group__3__Impl )
            // InternalXemfs.g:6828:2: rule__DotProjectFileContentProvider__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group__3"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group__3__Impl"
    // InternalXemfs.g:6834:1: rule__DotProjectFileContentProvider__Group__3__Impl : ( ';' ) ;
    public final void rule__DotProjectFileContentProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6838:1: ( ( ';' ) )
            // InternalXemfs.g:6839:1: ( ';' )
            {
            // InternalXemfs.g:6839:1: ( ';' )
            // InternalXemfs.g:6840:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getSemicolonKeyword_3()); 
            }
            match(input,9,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group__3__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_1__0"
    // InternalXemfs.g:6861:1: rule__DotProjectFileContentProvider__Group_1__0 : rule__DotProjectFileContentProvider__Group_1__0__Impl rule__DotProjectFileContentProvider__Group_1__1 ;
    public final void rule__DotProjectFileContentProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6865:1: ( rule__DotProjectFileContentProvider__Group_1__0__Impl rule__DotProjectFileContentProvider__Group_1__1 )
            // InternalXemfs.g:6866:2: rule__DotProjectFileContentProvider__Group_1__0__Impl rule__DotProjectFileContentProvider__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__DotProjectFileContentProvider__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_1__0"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_1__0__Impl"
    // InternalXemfs.g:6873:1: rule__DotProjectFileContentProvider__Group_1__0__Impl : ( '#' ) ;
    public final void rule__DotProjectFileContentProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6877:1: ( ( '#' ) )
            // InternalXemfs.g:6878:1: ( '#' )
            {
            // InternalXemfs.g:6878:1: ( '#' )
            // InternalXemfs.g:6879:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getNumberSignKeyword_1_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getNumberSignKeyword_1_0()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_1__0__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_1__1"
    // InternalXemfs.g:6892:1: rule__DotProjectFileContentProvider__Group_1__1 : rule__DotProjectFileContentProvider__Group_1__1__Impl ;
    public final void rule__DotProjectFileContentProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6896:1: ( rule__DotProjectFileContentProvider__Group_1__1__Impl )
            // InternalXemfs.g:6897:2: rule__DotProjectFileContentProvider__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_1__1"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_1__1__Impl"
    // InternalXemfs.g:6903:1: rule__DotProjectFileContentProvider__Group_1__1__Impl : ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) ) ;
    public final void rule__DotProjectFileContentProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6907:1: ( ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) ) )
            // InternalXemfs.g:6908:1: ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) )
            {
            // InternalXemfs.g:6908:1: ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) )
            // InternalXemfs.g:6909:1: ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysAssignment_1_1()); 
            }
            // InternalXemfs.g:6910:1: ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 )
            // InternalXemfs.g:6910:2: rule__DotProjectFileContentProvider__KeysAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__KeysAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getKeysAssignment_1_1()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_1__1__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_2__0"
    // InternalXemfs.g:6924:1: rule__DotProjectFileContentProvider__Group_2__0 : rule__DotProjectFileContentProvider__Group_2__0__Impl rule__DotProjectFileContentProvider__Group_2__1 ;
    public final void rule__DotProjectFileContentProvider__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6928:1: ( rule__DotProjectFileContentProvider__Group_2__0__Impl rule__DotProjectFileContentProvider__Group_2__1 )
            // InternalXemfs.g:6929:2: rule__DotProjectFileContentProvider__Group_2__0__Impl rule__DotProjectFileContentProvider__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__DotProjectFileContentProvider__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_2__0"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_2__0__Impl"
    // InternalXemfs.g:6936:1: rule__DotProjectFileContentProvider__Group_2__0__Impl : ( '@' ) ;
    public final void rule__DotProjectFileContentProvider__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6940:1: ( ( '@' ) )
            // InternalXemfs.g:6941:1: ( '@' )
            {
            // InternalXemfs.g:6941:1: ( '@' )
            // InternalXemfs.g:6942:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getCommercialAtKeyword_2_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getCommercialAtKeyword_2_0()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_2__0__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_2__1"
    // InternalXemfs.g:6955:1: rule__DotProjectFileContentProvider__Group_2__1 : rule__DotProjectFileContentProvider__Group_2__1__Impl rule__DotProjectFileContentProvider__Group_2__2 ;
    public final void rule__DotProjectFileContentProvider__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6959:1: ( rule__DotProjectFileContentProvider__Group_2__1__Impl rule__DotProjectFileContentProvider__Group_2__2 )
            // InternalXemfs.g:6960:2: rule__DotProjectFileContentProvider__Group_2__1__Impl rule__DotProjectFileContentProvider__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__DotProjectFileContentProvider__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_2__1"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_2__1__Impl"
    // InternalXemfs.g:6967:1: rule__DotProjectFileContentProvider__Group_2__1__Impl : ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) ) ;
    public final void rule__DotProjectFileContentProvider__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6971:1: ( ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) ) )
            // InternalXemfs.g:6972:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) )
            {
            // InternalXemfs.g:6972:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) )
            // InternalXemfs.g:6973:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesAssignment_2_1()); 
            }
            // InternalXemfs.g:6974:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 )
            // InternalXemfs.g:6974:2: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesAssignment_2_1()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_2__1__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_2__2"
    // InternalXemfs.g:6984:1: rule__DotProjectFileContentProvider__Group_2__2 : rule__DotProjectFileContentProvider__Group_2__2__Impl ;
    public final void rule__DotProjectFileContentProvider__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6988:1: ( rule__DotProjectFileContentProvider__Group_2__2__Impl )
            // InternalXemfs.g:6989:2: rule__DotProjectFileContentProvider__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_2__2"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_2__2__Impl"
    // InternalXemfs.g:6995:1: rule__DotProjectFileContentProvider__Group_2__2__Impl : ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* ) ;
    public final void rule__DotProjectFileContentProvider__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:6999:1: ( ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* ) )
            // InternalXemfs.g:7000:1: ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* )
            {
            // InternalXemfs.g:7000:1: ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* )
            // InternalXemfs.g:7001:1: ( rule__DotProjectFileContentProvider__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_2_2()); 
            }
            // InternalXemfs.g:7002:1: ( rule__DotProjectFileContentProvider__Group_2_2__0 )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==39) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalXemfs.g:7002:2: rule__DotProjectFileContentProvider__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__DotProjectFileContentProvider__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_2_2()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_2__2__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_2_2__0"
    // InternalXemfs.g:7018:1: rule__DotProjectFileContentProvider__Group_2_2__0 : rule__DotProjectFileContentProvider__Group_2_2__0__Impl rule__DotProjectFileContentProvider__Group_2_2__1 ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7022:1: ( rule__DotProjectFileContentProvider__Group_2_2__0__Impl rule__DotProjectFileContentProvider__Group_2_2__1 )
            // InternalXemfs.g:7023:2: rule__DotProjectFileContentProvider__Group_2_2__0__Impl rule__DotProjectFileContentProvider__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__DotProjectFileContentProvider__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_2_2__0"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_2_2__0__Impl"
    // InternalXemfs.g:7030:1: rule__DotProjectFileContentProvider__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7034:1: ( ( ',' ) )
            // InternalXemfs.g:7035:1: ( ',' )
            {
            // InternalXemfs.g:7035:1: ( ',' )
            // InternalXemfs.g:7036:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getCommaKeyword_2_2_0()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_2_2__0__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_2_2__1"
    // InternalXemfs.g:7049:1: rule__DotProjectFileContentProvider__Group_2_2__1 : rule__DotProjectFileContentProvider__Group_2_2__1__Impl ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7053:1: ( rule__DotProjectFileContentProvider__Group_2_2__1__Impl )
            // InternalXemfs.g:7054:2: rule__DotProjectFileContentProvider__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_2_2__1"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group_2_2__1__Impl"
    // InternalXemfs.g:7060:1: rule__DotProjectFileContentProvider__Group_2_2__1__Impl : ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) ) ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7064:1: ( ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) ) )
            // InternalXemfs.g:7065:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) )
            {
            // InternalXemfs.g:7065:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) )
            // InternalXemfs.g:7066:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesAssignment_2_2_1()); 
            }
            // InternalXemfs.g:7067:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 )
            // InternalXemfs.g:7067:2: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesAssignment_2_2_1()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__Group_2_2__1__Impl"


    // $ANTLR start "rule__XmlStringContents__Group__0"
    // InternalXemfs.g:7081:1: rule__XmlStringContents__Group__0 : rule__XmlStringContents__Group__0__Impl rule__XmlStringContents__Group__1 ;
    public final void rule__XmlStringContents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7085:1: ( rule__XmlStringContents__Group__0__Impl rule__XmlStringContents__Group__1 )
            // InternalXemfs.g:7086:2: rule__XmlStringContents__Group__0__Impl rule__XmlStringContents__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
            rule__XmlStringContents__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlStringContents__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlStringContents__Group__0"


    // $ANTLR start "rule__XmlStringContents__Group__0__Impl"
    // InternalXemfs.g:7093:1: rule__XmlStringContents__Group__0__Impl : ( '<<' ) ;
    public final void rule__XmlStringContents__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7097:1: ( ( '<<' ) )
            // InternalXemfs.g:7098:1: ( '<<' )
            {
            // InternalXemfs.g:7098:1: ( '<<' )
            // InternalXemfs.g:7099:1: '<<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlStringContentsAccess().getLessThanSignLessThanSignKeyword_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlStringContentsAccess().getLessThanSignLessThanSignKeyword_0()); 
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
    // $ANTLR end "rule__XmlStringContents__Group__0__Impl"


    // $ANTLR start "rule__XmlStringContents__Group__1"
    // InternalXemfs.g:7112:1: rule__XmlStringContents__Group__1 : rule__XmlStringContents__Group__1__Impl rule__XmlStringContents__Group__2 ;
    public final void rule__XmlStringContents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7116:1: ( rule__XmlStringContents__Group__1__Impl rule__XmlStringContents__Group__2 )
            // InternalXemfs.g:7117:2: rule__XmlStringContents__Group__1__Impl rule__XmlStringContents__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__XmlStringContents__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlStringContents__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlStringContents__Group__1"


    // $ANTLR start "rule__XmlStringContents__Group__1__Impl"
    // InternalXemfs.g:7124:1: rule__XmlStringContents__Group__1__Impl : ( ( rule__XmlStringContents__ElementAssignment_1 ) ) ;
    public final void rule__XmlStringContents__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7128:1: ( ( ( rule__XmlStringContents__ElementAssignment_1 ) ) )
            // InternalXemfs.g:7129:1: ( ( rule__XmlStringContents__ElementAssignment_1 ) )
            {
            // InternalXemfs.g:7129:1: ( ( rule__XmlStringContents__ElementAssignment_1 ) )
            // InternalXemfs.g:7130:1: ( rule__XmlStringContents__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlStringContentsAccess().getElementAssignment_1()); 
            }
            // InternalXemfs.g:7131:1: ( rule__XmlStringContents__ElementAssignment_1 )
            // InternalXemfs.g:7131:2: rule__XmlStringContents__ElementAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlStringContents__ElementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlStringContentsAccess().getElementAssignment_1()); 
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
    // $ANTLR end "rule__XmlStringContents__Group__1__Impl"


    // $ANTLR start "rule__XmlStringContents__Group__2"
    // InternalXemfs.g:7141:1: rule__XmlStringContents__Group__2 : rule__XmlStringContents__Group__2__Impl ;
    public final void rule__XmlStringContents__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7145:1: ( rule__XmlStringContents__Group__2__Impl )
            // InternalXemfs.g:7146:2: rule__XmlStringContents__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlStringContents__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlStringContents__Group__2"


    // $ANTLR start "rule__XmlStringContents__Group__2__Impl"
    // InternalXemfs.g:7152:1: rule__XmlStringContents__Group__2__Impl : ( '>>' ) ;
    public final void rule__XmlStringContents__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7156:1: ( ( '>>' ) )
            // InternalXemfs.g:7157:1: ( '>>' )
            {
            // InternalXemfs.g:7157:1: ( '>>' )
            // InternalXemfs.g:7158:1: '>>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlStringContentsAccess().getGreaterThanSignGreaterThanSignKeyword_2()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlStringContentsAccess().getGreaterThanSignGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__XmlStringContents__Group__2__Impl"


    // $ANTLR start "rule__XmlPIElement__Group__0"
    // InternalXemfs.g:7177:1: rule__XmlPIElement__Group__0 : rule__XmlPIElement__Group__0__Impl rule__XmlPIElement__Group__1 ;
    public final void rule__XmlPIElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7181:1: ( rule__XmlPIElement__Group__0__Impl rule__XmlPIElement__Group__1 )
            // InternalXemfs.g:7182:2: rule__XmlPIElement__Group__0__Impl rule__XmlPIElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__XmlPIElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlPIElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlPIElement__Group__0"


    // $ANTLR start "rule__XmlPIElement__Group__0__Impl"
    // InternalXemfs.g:7189:1: rule__XmlPIElement__Group__0__Impl : ( '?' ) ;
    public final void rule__XmlPIElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7193:1: ( ( '?' ) )
            // InternalXemfs.g:7194:1: ( '?' )
            {
            // InternalXemfs.g:7194:1: ( '?' )
            // InternalXemfs.g:7195:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlPIElementAccess().getQuestionMarkKeyword_0()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlPIElementAccess().getQuestionMarkKeyword_0()); 
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
    // $ANTLR end "rule__XmlPIElement__Group__0__Impl"


    // $ANTLR start "rule__XmlPIElement__Group__1"
    // InternalXemfs.g:7208:1: rule__XmlPIElement__Group__1 : rule__XmlPIElement__Group__1__Impl rule__XmlPIElement__Group__2 ;
    public final void rule__XmlPIElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7212:1: ( rule__XmlPIElement__Group__1__Impl rule__XmlPIElement__Group__2 )
            // InternalXemfs.g:7213:2: rule__XmlPIElement__Group__1__Impl rule__XmlPIElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_48);
            rule__XmlPIElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlPIElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlPIElement__Group__1"


    // $ANTLR start "rule__XmlPIElement__Group__1__Impl"
    // InternalXemfs.g:7220:1: rule__XmlPIElement__Group__1__Impl : ( ( rule__XmlPIElement__NameAssignment_1 ) ) ;
    public final void rule__XmlPIElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7224:1: ( ( ( rule__XmlPIElement__NameAssignment_1 ) ) )
            // InternalXemfs.g:7225:1: ( ( rule__XmlPIElement__NameAssignment_1 ) )
            {
            // InternalXemfs.g:7225:1: ( ( rule__XmlPIElement__NameAssignment_1 ) )
            // InternalXemfs.g:7226:1: ( rule__XmlPIElement__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlPIElementAccess().getNameAssignment_1()); 
            }
            // InternalXemfs.g:7227:1: ( rule__XmlPIElement__NameAssignment_1 )
            // InternalXemfs.g:7227:2: rule__XmlPIElement__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlPIElement__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlPIElementAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__XmlPIElement__Group__1__Impl"


    // $ANTLR start "rule__XmlPIElement__Group__2"
    // InternalXemfs.g:7237:1: rule__XmlPIElement__Group__2 : rule__XmlPIElement__Group__2__Impl rule__XmlPIElement__Group__3 ;
    public final void rule__XmlPIElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7241:1: ( rule__XmlPIElement__Group__2__Impl rule__XmlPIElement__Group__3 )
            // InternalXemfs.g:7242:2: rule__XmlPIElement__Group__2__Impl rule__XmlPIElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_48);
            rule__XmlPIElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlPIElement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlPIElement__Group__2"


    // $ANTLR start "rule__XmlPIElement__Group__2__Impl"
    // InternalXemfs.g:7249:1: rule__XmlPIElement__Group__2__Impl : ( ( rule__XmlPIElement__AttributesAssignment_2 )* ) ;
    public final void rule__XmlPIElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7253:1: ( ( ( rule__XmlPIElement__AttributesAssignment_2 )* ) )
            // InternalXemfs.g:7254:1: ( ( rule__XmlPIElement__AttributesAssignment_2 )* )
            {
            // InternalXemfs.g:7254:1: ( ( rule__XmlPIElement__AttributesAssignment_2 )* )
            // InternalXemfs.g:7255:1: ( rule__XmlPIElement__AttributesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlPIElementAccess().getAttributesAssignment_2()); 
            }
            // InternalXemfs.g:7256:1: ( rule__XmlPIElement__AttributesAssignment_2 )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_ID) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalXemfs.g:7256:2: rule__XmlPIElement__AttributesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    rule__XmlPIElement__AttributesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlPIElementAccess().getAttributesAssignment_2()); 
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
    // $ANTLR end "rule__XmlPIElement__Group__2__Impl"


    // $ANTLR start "rule__XmlPIElement__Group__3"
    // InternalXemfs.g:7266:1: rule__XmlPIElement__Group__3 : rule__XmlPIElement__Group__3__Impl ;
    public final void rule__XmlPIElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7270:1: ( rule__XmlPIElement__Group__3__Impl )
            // InternalXemfs.g:7271:2: rule__XmlPIElement__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlPIElement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlPIElement__Group__3"


    // $ANTLR start "rule__XmlPIElement__Group__3__Impl"
    // InternalXemfs.g:7277:1: rule__XmlPIElement__Group__3__Impl : ( '?' ) ;
    public final void rule__XmlPIElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7281:1: ( ( '?' ) )
            // InternalXemfs.g:7282:1: ( '?' )
            {
            // InternalXemfs.g:7282:1: ( '?' )
            // InternalXemfs.g:7283:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlPIElementAccess().getQuestionMarkKeyword_3()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlPIElementAccess().getQuestionMarkKeyword_3()); 
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
    // $ANTLR end "rule__XmlPIElement__Group__3__Impl"


    // $ANTLR start "rule__XmlTagElement__Group__0"
    // InternalXemfs.g:7304:1: rule__XmlTagElement__Group__0 : rule__XmlTagElement__Group__0__Impl rule__XmlTagElement__Group__1 ;
    public final void rule__XmlTagElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7308:1: ( rule__XmlTagElement__Group__0__Impl rule__XmlTagElement__Group__1 )
            // InternalXemfs.g:7309:2: rule__XmlTagElement__Group__0__Impl rule__XmlTagElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
            rule__XmlTagElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagElement__Group__0"


    // $ANTLR start "rule__XmlTagElement__Group__0__Impl"
    // InternalXemfs.g:7316:1: rule__XmlTagElement__Group__0__Impl : ( ( rule__XmlTagElement__StartTagAssignment_0 ) ) ;
    public final void rule__XmlTagElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7320:1: ( ( ( rule__XmlTagElement__StartTagAssignment_0 ) ) )
            // InternalXemfs.g:7321:1: ( ( rule__XmlTagElement__StartTagAssignment_0 ) )
            {
            // InternalXemfs.g:7321:1: ( ( rule__XmlTagElement__StartTagAssignment_0 ) )
            // InternalXemfs.g:7322:1: ( rule__XmlTagElement__StartTagAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getStartTagAssignment_0()); 
            }
            // InternalXemfs.g:7323:1: ( rule__XmlTagElement__StartTagAssignment_0 )
            // InternalXemfs.g:7323:2: rule__XmlTagElement__StartTagAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__StartTagAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getStartTagAssignment_0()); 
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
    // $ANTLR end "rule__XmlTagElement__Group__0__Impl"


    // $ANTLR start "rule__XmlTagElement__Group__1"
    // InternalXemfs.g:7333:1: rule__XmlTagElement__Group__1 : rule__XmlTagElement__Group__1__Impl ;
    public final void rule__XmlTagElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7337:1: ( rule__XmlTagElement__Group__1__Impl )
            // InternalXemfs.g:7338:2: rule__XmlTagElement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagElement__Group__1"


    // $ANTLR start "rule__XmlTagElement__Group__1__Impl"
    // InternalXemfs.g:7344:1: rule__XmlTagElement__Group__1__Impl : ( ( rule__XmlTagElement__Alternatives_1 ) ) ;
    public final void rule__XmlTagElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7348:1: ( ( ( rule__XmlTagElement__Alternatives_1 ) ) )
            // InternalXemfs.g:7349:1: ( ( rule__XmlTagElement__Alternatives_1 ) )
            {
            // InternalXemfs.g:7349:1: ( ( rule__XmlTagElement__Alternatives_1 ) )
            // InternalXemfs.g:7350:1: ( rule__XmlTagElement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getAlternatives_1()); 
            }
            // InternalXemfs.g:7351:1: ( rule__XmlTagElement__Alternatives_1 )
            // InternalXemfs.g:7351:2: rule__XmlTagElement__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__XmlTagElement__Group__1__Impl"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__0"
    // InternalXemfs.g:7365:1: rule__XmlTagElement__Group_1_1__0 : rule__XmlTagElement__Group_1_1__0__Impl rule__XmlTagElement__Group_1_1__1 ;
    public final void rule__XmlTagElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7369:1: ( rule__XmlTagElement__Group_1_1__0__Impl rule__XmlTagElement__Group_1_1__1 )
            // InternalXemfs.g:7370:2: rule__XmlTagElement__Group_1_1__0__Impl rule__XmlTagElement__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__XmlTagElement__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagElement__Group_1_1__0"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__0__Impl"
    // InternalXemfs.g:7377:1: rule__XmlTagElement__Group_1_1__0__Impl : ( ( rule__XmlTagElement__PreAssignment_1_1_0 ) ) ;
    public final void rule__XmlTagElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7381:1: ( ( ( rule__XmlTagElement__PreAssignment_1_1_0 ) ) )
            // InternalXemfs.g:7382:1: ( ( rule__XmlTagElement__PreAssignment_1_1_0 ) )
            {
            // InternalXemfs.g:7382:1: ( ( rule__XmlTagElement__PreAssignment_1_1_0 ) )
            // InternalXemfs.g:7383:1: ( rule__XmlTagElement__PreAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getPreAssignment_1_1_0()); 
            }
            // InternalXemfs.g:7384:1: ( rule__XmlTagElement__PreAssignment_1_1_0 )
            // InternalXemfs.g:7384:2: rule__XmlTagElement__PreAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__PreAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getPreAssignment_1_1_0()); 
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
    // $ANTLR end "rule__XmlTagElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__1"
    // InternalXemfs.g:7394:1: rule__XmlTagElement__Group_1_1__1 : rule__XmlTagElement__Group_1_1__1__Impl rule__XmlTagElement__Group_1_1__2 ;
    public final void rule__XmlTagElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7398:1: ( rule__XmlTagElement__Group_1_1__1__Impl rule__XmlTagElement__Group_1_1__2 )
            // InternalXemfs.g:7399:2: rule__XmlTagElement__Group_1_1__1__Impl rule__XmlTagElement__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__XmlTagElement__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagElement__Group_1_1__1"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__1__Impl"
    // InternalXemfs.g:7406:1: rule__XmlTagElement__Group_1_1__1__Impl : ( ( rule__XmlTagElement__ContentsAssignment_1_1_1 )* ) ;
    public final void rule__XmlTagElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7410:1: ( ( ( rule__XmlTagElement__ContentsAssignment_1_1_1 )* ) )
            // InternalXemfs.g:7411:1: ( ( rule__XmlTagElement__ContentsAssignment_1_1_1 )* )
            {
            // InternalXemfs.g:7411:1: ( ( rule__XmlTagElement__ContentsAssignment_1_1_1 )* )
            // InternalXemfs.g:7412:1: ( rule__XmlTagElement__ContentsAssignment_1_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getContentsAssignment_1_1_1()); 
            }
            // InternalXemfs.g:7413:1: ( rule__XmlTagElement__ContentsAssignment_1_1_1 )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_ID||LA80_0==57) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalXemfs.g:7413:2: rule__XmlTagElement__ContentsAssignment_1_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_53);
            	    rule__XmlTagElement__ContentsAssignment_1_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getContentsAssignment_1_1_1()); 
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
    // $ANTLR end "rule__XmlTagElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__2"
    // InternalXemfs.g:7423:1: rule__XmlTagElement__Group_1_1__2 : rule__XmlTagElement__Group_1_1__2__Impl ;
    public final void rule__XmlTagElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7427:1: ( rule__XmlTagElement__Group_1_1__2__Impl )
            // InternalXemfs.g:7428:2: rule__XmlTagElement__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagElement__Group_1_1__2"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__2__Impl"
    // InternalXemfs.g:7434:1: rule__XmlTagElement__Group_1_1__2__Impl : ( ( rule__XmlTagElement__Group_1_1_2__0 ) ) ;
    public final void rule__XmlTagElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7438:1: ( ( ( rule__XmlTagElement__Group_1_1_2__0 ) ) )
            // InternalXemfs.g:7439:1: ( ( rule__XmlTagElement__Group_1_1_2__0 ) )
            {
            // InternalXemfs.g:7439:1: ( ( rule__XmlTagElement__Group_1_1_2__0 ) )
            // InternalXemfs.g:7440:1: ( rule__XmlTagElement__Group_1_1_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getGroup_1_1_2()); 
            }
            // InternalXemfs.g:7441:1: ( rule__XmlTagElement__Group_1_1_2__0 )
            // InternalXemfs.g:7441:2: rule__XmlTagElement__Group_1_1_2__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__Group_1_1_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getGroup_1_1_2()); 
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
    // $ANTLR end "rule__XmlTagElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__XmlTagElement__Group_1_1_2__0"
    // InternalXemfs.g:7457:1: rule__XmlTagElement__Group_1_1_2__0 : rule__XmlTagElement__Group_1_1_2__0__Impl rule__XmlTagElement__Group_1_1_2__1 ;
    public final void rule__XmlTagElement__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7461:1: ( rule__XmlTagElement__Group_1_1_2__0__Impl rule__XmlTagElement__Group_1_1_2__1 )
            // InternalXemfs.g:7462:2: rule__XmlTagElement__Group_1_1_2__0__Impl rule__XmlTagElement__Group_1_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
            rule__XmlTagElement__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__Group_1_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagElement__Group_1_1_2__0"


    // $ANTLR start "rule__XmlTagElement__Group_1_1_2__0__Impl"
    // InternalXemfs.g:7469:1: rule__XmlTagElement__Group_1_1_2__0__Impl : ( '/' ) ;
    public final void rule__XmlTagElement__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7473:1: ( ( '/' ) )
            // InternalXemfs.g:7474:1: ( '/' )
            {
            // InternalXemfs.g:7474:1: ( '/' )
            // InternalXemfs.g:7475:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_1_2_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_1_2_0()); 
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
    // $ANTLR end "rule__XmlTagElement__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__XmlTagElement__Group_1_1_2__1"
    // InternalXemfs.g:7488:1: rule__XmlTagElement__Group_1_1_2__1 : rule__XmlTagElement__Group_1_1_2__1__Impl ;
    public final void rule__XmlTagElement__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7492:1: ( rule__XmlTagElement__Group_1_1_2__1__Impl )
            // InternalXemfs.g:7493:2: rule__XmlTagElement__Group_1_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagElement__Group_1_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagElement__Group_1_1_2__1"


    // $ANTLR start "rule__XmlTagElement__Group_1_1_2__1__Impl"
    // InternalXemfs.g:7499:1: rule__XmlTagElement__Group_1_1_2__1__Impl : ( ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )? ) ;
    public final void rule__XmlTagElement__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7503:1: ( ( ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )? ) )
            // InternalXemfs.g:7504:1: ( ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )? )
            {
            // InternalXemfs.g:7504:1: ( ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )? )
            // InternalXemfs.g:7505:1: ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getEndTagAssignment_1_1_2_1()); 
            }
            // InternalXemfs.g:7506:1: ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalXemfs.g:7506:2: rule__XmlTagElement__EndTagAssignment_1_1_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XmlTagElement__EndTagAssignment_1_1_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getEndTagAssignment_1_1_2_1()); 
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
    // $ANTLR end "rule__XmlTagElement__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__XmlTagName__Group__0"
    // InternalXemfs.g:7520:1: rule__XmlTagName__Group__0 : rule__XmlTagName__Group__0__Impl rule__XmlTagName__Group__1 ;
    public final void rule__XmlTagName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7524:1: ( rule__XmlTagName__Group__0__Impl rule__XmlTagName__Group__1 )
            // InternalXemfs.g:7525:2: rule__XmlTagName__Group__0__Impl rule__XmlTagName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__XmlTagName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagName__Group__0"


    // $ANTLR start "rule__XmlTagName__Group__0__Impl"
    // InternalXemfs.g:7532:1: rule__XmlTagName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__XmlTagName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7536:1: ( ( RULE_ID ) )
            // InternalXemfs.g:7537:1: ( RULE_ID )
            {
            // InternalXemfs.g:7537:1: ( RULE_ID )
            // InternalXemfs.g:7538:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__XmlTagName__Group__0__Impl"


    // $ANTLR start "rule__XmlTagName__Group__1"
    // InternalXemfs.g:7549:1: rule__XmlTagName__Group__1 : rule__XmlTagName__Group__1__Impl ;
    public final void rule__XmlTagName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7553:1: ( rule__XmlTagName__Group__1__Impl )
            // InternalXemfs.g:7554:2: rule__XmlTagName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagName__Group__1"


    // $ANTLR start "rule__XmlTagName__Group__1__Impl"
    // InternalXemfs.g:7560:1: rule__XmlTagName__Group__1__Impl : ( ( rule__XmlTagName__Group_1__0 )? ) ;
    public final void rule__XmlTagName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7564:1: ( ( ( rule__XmlTagName__Group_1__0 )? ) )
            // InternalXemfs.g:7565:1: ( ( rule__XmlTagName__Group_1__0 )? )
            {
            // InternalXemfs.g:7565:1: ( ( rule__XmlTagName__Group_1__0 )? )
            // InternalXemfs.g:7566:1: ( rule__XmlTagName__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagNameAccess().getGroup_1()); 
            }
            // InternalXemfs.g:7567:1: ( rule__XmlTagName__Group_1__0 )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==43) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalXemfs.g:7567:2: rule__XmlTagName__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XmlTagName__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__XmlTagName__Group__1__Impl"


    // $ANTLR start "rule__XmlTagName__Group_1__0"
    // InternalXemfs.g:7581:1: rule__XmlTagName__Group_1__0 : rule__XmlTagName__Group_1__0__Impl rule__XmlTagName__Group_1__1 ;
    public final void rule__XmlTagName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7585:1: ( rule__XmlTagName__Group_1__0__Impl rule__XmlTagName__Group_1__1 )
            // InternalXemfs.g:7586:2: rule__XmlTagName__Group_1__0__Impl rule__XmlTagName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__XmlTagName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagName__Group_1__0"


    // $ANTLR start "rule__XmlTagName__Group_1__0__Impl"
    // InternalXemfs.g:7593:1: rule__XmlTagName__Group_1__0__Impl : ( ':' ) ;
    public final void rule__XmlTagName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7597:1: ( ( ':' ) )
            // InternalXemfs.g:7598:1: ( ':' )
            {
            // InternalXemfs.g:7598:1: ( ':' )
            // InternalXemfs.g:7599:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagNameAccess().getColonKeyword_1_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagNameAccess().getColonKeyword_1_0()); 
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
    // $ANTLR end "rule__XmlTagName__Group_1__0__Impl"


    // $ANTLR start "rule__XmlTagName__Group_1__1"
    // InternalXemfs.g:7612:1: rule__XmlTagName__Group_1__1 : rule__XmlTagName__Group_1__1__Impl ;
    public final void rule__XmlTagName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7616:1: ( rule__XmlTagName__Group_1__1__Impl )
            // InternalXemfs.g:7617:2: rule__XmlTagName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTagName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTagName__Group_1__1"


    // $ANTLR start "rule__XmlTagName__Group_1__1__Impl"
    // InternalXemfs.g:7623:1: rule__XmlTagName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__XmlTagName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7627:1: ( ( RULE_ID ) )
            // InternalXemfs.g:7628:1: ( RULE_ID )
            {
            // InternalXemfs.g:7628:1: ( RULE_ID )
            // InternalXemfs.g:7629:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__XmlTagName__Group_1__1__Impl"


    // $ANTLR start "rule__XmlContents__Group__0"
    // InternalXemfs.g:7644:1: rule__XmlContents__Group__0 : rule__XmlContents__Group__0__Impl rule__XmlContents__Group__1 ;
    public final void rule__XmlContents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7648:1: ( rule__XmlContents__Group__0__Impl rule__XmlContents__Group__1 )
            // InternalXemfs.g:7649:2: rule__XmlContents__Group__0__Impl rule__XmlContents__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_54);
            rule__XmlContents__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlContents__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlContents__Group__0"


    // $ANTLR start "rule__XmlContents__Group__0__Impl"
    // InternalXemfs.g:7656:1: rule__XmlContents__Group__0__Impl : ( ( rule__XmlContents__ElementAssignment_0 ) ) ;
    public final void rule__XmlContents__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7660:1: ( ( ( rule__XmlContents__ElementAssignment_0 ) ) )
            // InternalXemfs.g:7661:1: ( ( rule__XmlContents__ElementAssignment_0 ) )
            {
            // InternalXemfs.g:7661:1: ( ( rule__XmlContents__ElementAssignment_0 ) )
            // InternalXemfs.g:7662:1: ( rule__XmlContents__ElementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlContentsAccess().getElementAssignment_0()); 
            }
            // InternalXemfs.g:7663:1: ( rule__XmlContents__ElementAssignment_0 )
            // InternalXemfs.g:7663:2: rule__XmlContents__ElementAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlContents__ElementAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlContentsAccess().getElementAssignment_0()); 
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
    // $ANTLR end "rule__XmlContents__Group__0__Impl"


    // $ANTLR start "rule__XmlContents__Group__1"
    // InternalXemfs.g:7673:1: rule__XmlContents__Group__1 : rule__XmlContents__Group__1__Impl ;
    public final void rule__XmlContents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7677:1: ( rule__XmlContents__Group__1__Impl )
            // InternalXemfs.g:7678:2: rule__XmlContents__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlContents__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlContents__Group__1"


    // $ANTLR start "rule__XmlContents__Group__1__Impl"
    // InternalXemfs.g:7684:1: rule__XmlContents__Group__1__Impl : ( ( rule__XmlContents__PostAssignment_1 ) ) ;
    public final void rule__XmlContents__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7688:1: ( ( ( rule__XmlContents__PostAssignment_1 ) ) )
            // InternalXemfs.g:7689:1: ( ( rule__XmlContents__PostAssignment_1 ) )
            {
            // InternalXemfs.g:7689:1: ( ( rule__XmlContents__PostAssignment_1 ) )
            // InternalXemfs.g:7690:1: ( rule__XmlContents__PostAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlContentsAccess().getPostAssignment_1()); 
            }
            // InternalXemfs.g:7691:1: ( rule__XmlContents__PostAssignment_1 )
            // InternalXemfs.g:7691:2: rule__XmlContents__PostAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlContents__PostAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlContentsAccess().getPostAssignment_1()); 
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
    // $ANTLR end "rule__XmlContents__Group__1__Impl"


    // $ANTLR start "rule__XmlTag__Group__0"
    // InternalXemfs.g:7705:1: rule__XmlTag__Group__0 : rule__XmlTag__Group__0__Impl rule__XmlTag__Group__1 ;
    public final void rule__XmlTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7709:1: ( rule__XmlTag__Group__0__Impl rule__XmlTag__Group__1 )
            // InternalXemfs.g:7710:2: rule__XmlTag__Group__0__Impl rule__XmlTag__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__XmlTag__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTag__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTag__Group__0"


    // $ANTLR start "rule__XmlTag__Group__0__Impl"
    // InternalXemfs.g:7717:1: rule__XmlTag__Group__0__Impl : ( ( rule__XmlTag__NameAssignment_0 ) ) ;
    public final void rule__XmlTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7721:1: ( ( ( rule__XmlTag__NameAssignment_0 ) ) )
            // InternalXemfs.g:7722:1: ( ( rule__XmlTag__NameAssignment_0 ) )
            {
            // InternalXemfs.g:7722:1: ( ( rule__XmlTag__NameAssignment_0 ) )
            // InternalXemfs.g:7723:1: ( rule__XmlTag__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagAccess().getNameAssignment_0()); 
            }
            // InternalXemfs.g:7724:1: ( rule__XmlTag__NameAssignment_0 )
            // InternalXemfs.g:7724:2: rule__XmlTag__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTag__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__XmlTag__Group__0__Impl"


    // $ANTLR start "rule__XmlTag__Group__1"
    // InternalXemfs.g:7734:1: rule__XmlTag__Group__1 : rule__XmlTag__Group__1__Impl ;
    public final void rule__XmlTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7738:1: ( rule__XmlTag__Group__1__Impl )
            // InternalXemfs.g:7739:2: rule__XmlTag__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlTag__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlTag__Group__1"


    // $ANTLR start "rule__XmlTag__Group__1__Impl"
    // InternalXemfs.g:7745:1: rule__XmlTag__Group__1__Impl : ( ( rule__XmlTag__AttributesAssignment_1 )* ) ;
    public final void rule__XmlTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7749:1: ( ( ( rule__XmlTag__AttributesAssignment_1 )* ) )
            // InternalXemfs.g:7750:1: ( ( rule__XmlTag__AttributesAssignment_1 )* )
            {
            // InternalXemfs.g:7750:1: ( ( rule__XmlTag__AttributesAssignment_1 )* )
            // InternalXemfs.g:7751:1: ( rule__XmlTag__AttributesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagAccess().getAttributesAssignment_1()); 
            }
            // InternalXemfs.g:7752:1: ( rule__XmlTag__AttributesAssignment_1 )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_ID) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalXemfs.g:7752:2: rule__XmlTag__AttributesAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    rule__XmlTag__AttributesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagAccess().getAttributesAssignment_1()); 
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
    // $ANTLR end "rule__XmlTag__Group__1__Impl"


    // $ANTLR start "rule__XmlAttribute__Group__0"
    // InternalXemfs.g:7766:1: rule__XmlAttribute__Group__0 : rule__XmlAttribute__Group__0__Impl rule__XmlAttribute__Group__1 ;
    public final void rule__XmlAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7770:1: ( rule__XmlAttribute__Group__0__Impl rule__XmlAttribute__Group__1 )
            // InternalXemfs.g:7771:2: rule__XmlAttribute__Group__0__Impl rule__XmlAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__XmlAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlAttribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlAttribute__Group__0"


    // $ANTLR start "rule__XmlAttribute__Group__0__Impl"
    // InternalXemfs.g:7778:1: rule__XmlAttribute__Group__0__Impl : ( ( rule__XmlAttribute__NameAssignment_0 ) ) ;
    public final void rule__XmlAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7782:1: ( ( ( rule__XmlAttribute__NameAssignment_0 ) ) )
            // InternalXemfs.g:7783:1: ( ( rule__XmlAttribute__NameAssignment_0 ) )
            {
            // InternalXemfs.g:7783:1: ( ( rule__XmlAttribute__NameAssignment_0 ) )
            // InternalXemfs.g:7784:1: ( rule__XmlAttribute__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlAttributeAccess().getNameAssignment_0()); 
            }
            // InternalXemfs.g:7785:1: ( rule__XmlAttribute__NameAssignment_0 )
            // InternalXemfs.g:7785:2: rule__XmlAttribute__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlAttribute__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlAttributeAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__XmlAttribute__Group__0__Impl"


    // $ANTLR start "rule__XmlAttribute__Group__1"
    // InternalXemfs.g:7795:1: rule__XmlAttribute__Group__1 : rule__XmlAttribute__Group__1__Impl ;
    public final void rule__XmlAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7799:1: ( rule__XmlAttribute__Group__1__Impl )
            // InternalXemfs.g:7800:2: rule__XmlAttribute__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlAttribute__Group__1"


    // $ANTLR start "rule__XmlAttribute__Group__1__Impl"
    // InternalXemfs.g:7806:1: rule__XmlAttribute__Group__1__Impl : ( ( rule__XmlAttribute__Group_1__0 )? ) ;
    public final void rule__XmlAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7810:1: ( ( ( rule__XmlAttribute__Group_1__0 )? ) )
            // InternalXemfs.g:7811:1: ( ( rule__XmlAttribute__Group_1__0 )? )
            {
            // InternalXemfs.g:7811:1: ( ( rule__XmlAttribute__Group_1__0 )? )
            // InternalXemfs.g:7812:1: ( rule__XmlAttribute__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlAttributeAccess().getGroup_1()); 
            }
            // InternalXemfs.g:7813:1: ( rule__XmlAttribute__Group_1__0 )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==41) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalXemfs.g:7813:2: rule__XmlAttribute__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__XmlAttribute__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlAttributeAccess().getGroup_1()); 
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
    // $ANTLR end "rule__XmlAttribute__Group__1__Impl"


    // $ANTLR start "rule__XmlAttribute__Group_1__0"
    // InternalXemfs.g:7827:1: rule__XmlAttribute__Group_1__0 : rule__XmlAttribute__Group_1__0__Impl rule__XmlAttribute__Group_1__1 ;
    public final void rule__XmlAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7831:1: ( rule__XmlAttribute__Group_1__0__Impl rule__XmlAttribute__Group_1__1 )
            // InternalXemfs.g:7832:2: rule__XmlAttribute__Group_1__0__Impl rule__XmlAttribute__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_55);
            rule__XmlAttribute__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlAttribute__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlAttribute__Group_1__0"


    // $ANTLR start "rule__XmlAttribute__Group_1__0__Impl"
    // InternalXemfs.g:7839:1: rule__XmlAttribute__Group_1__0__Impl : ( '=' ) ;
    public final void rule__XmlAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7843:1: ( ( '=' ) )
            // InternalXemfs.g:7844:1: ( '=' )
            {
            // InternalXemfs.g:7844:1: ( '=' )
            // InternalXemfs.g:7845:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlAttributeAccess().getEqualsSignKeyword_1_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlAttributeAccess().getEqualsSignKeyword_1_0()); 
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
    // $ANTLR end "rule__XmlAttribute__Group_1__0__Impl"


    // $ANTLR start "rule__XmlAttribute__Group_1__1"
    // InternalXemfs.g:7858:1: rule__XmlAttribute__Group_1__1 : rule__XmlAttribute__Group_1__1__Impl ;
    public final void rule__XmlAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7862:1: ( rule__XmlAttribute__Group_1__1__Impl )
            // InternalXemfs.g:7863:2: rule__XmlAttribute__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlAttribute__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlAttribute__Group_1__1"


    // $ANTLR start "rule__XmlAttribute__Group_1__1__Impl"
    // InternalXemfs.g:7869:1: rule__XmlAttribute__Group_1__1__Impl : ( ( rule__XmlAttribute__ValueAssignment_1_1 ) ) ;
    public final void rule__XmlAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7873:1: ( ( ( rule__XmlAttribute__ValueAssignment_1_1 ) ) )
            // InternalXemfs.g:7874:1: ( ( rule__XmlAttribute__ValueAssignment_1_1 ) )
            {
            // InternalXemfs.g:7874:1: ( ( rule__XmlAttribute__ValueAssignment_1_1 ) )
            // InternalXemfs.g:7875:1: ( rule__XmlAttribute__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlAttributeAccess().getValueAssignment_1_1()); 
            }
            // InternalXemfs.g:7876:1: ( rule__XmlAttribute__ValueAssignment_1_1 )
            // InternalXemfs.g:7876:2: rule__XmlAttribute__ValueAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlAttribute__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlAttributeAccess().getValueAssignment_1_1()); 
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
    // $ANTLR end "rule__XmlAttribute__Group_1__1__Impl"


    // $ANTLR start "rule__XmlInt__Group_0__0"
    // InternalXemfs.g:7890:1: rule__XmlInt__Group_0__0 : rule__XmlInt__Group_0__0__Impl rule__XmlInt__Group_0__1 ;
    public final void rule__XmlInt__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7894:1: ( rule__XmlInt__Group_0__0__Impl rule__XmlInt__Group_0__1 )
            // InternalXemfs.g:7895:2: rule__XmlInt__Group_0__0__Impl rule__XmlInt__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__XmlInt__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlInt__Group_0__0"


    // $ANTLR start "rule__XmlInt__Group_0__0__Impl"
    // InternalXemfs.g:7902:1: rule__XmlInt__Group_0__0__Impl : ( ( rule__XmlInt__Alternatives_0_0 ) ) ;
    public final void rule__XmlInt__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7906:1: ( ( ( rule__XmlInt__Alternatives_0_0 ) ) )
            // InternalXemfs.g:7907:1: ( ( rule__XmlInt__Alternatives_0_0 ) )
            {
            // InternalXemfs.g:7907:1: ( ( rule__XmlInt__Alternatives_0_0 ) )
            // InternalXemfs.g:7908:1: ( rule__XmlInt__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getAlternatives_0_0()); 
            }
            // InternalXemfs.g:7909:1: ( rule__XmlInt__Alternatives_0_0 )
            // InternalXemfs.g:7909:2: rule__XmlInt__Alternatives_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getAlternatives_0_0()); 
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
    // $ANTLR end "rule__XmlInt__Group_0__0__Impl"


    // $ANTLR start "rule__XmlInt__Group_0__1"
    // InternalXemfs.g:7919:1: rule__XmlInt__Group_0__1 : rule__XmlInt__Group_0__1__Impl ;
    public final void rule__XmlInt__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7923:1: ( rule__XmlInt__Group_0__1__Impl )
            // InternalXemfs.g:7924:2: rule__XmlInt__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlInt__Group_0__1"


    // $ANTLR start "rule__XmlInt__Group_0__1__Impl"
    // InternalXemfs.g:7930:1: rule__XmlInt__Group_0__1__Impl : ( ( rule__XmlInt__Alternatives_0_1 )* ) ;
    public final void rule__XmlInt__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7934:1: ( ( ( rule__XmlInt__Alternatives_0_1 )* ) )
            // InternalXemfs.g:7935:1: ( ( rule__XmlInt__Alternatives_0_1 )* )
            {
            // InternalXemfs.g:7935:1: ( ( rule__XmlInt__Alternatives_0_1 )* )
            // InternalXemfs.g:7936:1: ( rule__XmlInt__Alternatives_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getAlternatives_0_1()); 
            }
            // InternalXemfs.g:7937:1: ( rule__XmlInt__Alternatives_0_1 )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=14 && LA85_0<=23)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalXemfs.g:7937:2: rule__XmlInt__Alternatives_0_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__XmlInt__Alternatives_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getAlternatives_0_1()); 
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
    // $ANTLR end "rule__XmlInt__Group_0__1__Impl"


    // $ANTLR start "rule__XmlInt__Group_1__0"
    // InternalXemfs.g:7951:1: rule__XmlInt__Group_1__0 : rule__XmlInt__Group_1__0__Impl rule__XmlInt__Group_1__1 ;
    public final void rule__XmlInt__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7955:1: ( rule__XmlInt__Group_1__0__Impl rule__XmlInt__Group_1__1 )
            // InternalXemfs.g:7956:2: rule__XmlInt__Group_1__0__Impl rule__XmlInt__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_56);
            rule__XmlInt__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlInt__Group_1__0"


    // $ANTLR start "rule__XmlInt__Group_1__0__Impl"
    // InternalXemfs.g:7963:1: rule__XmlInt__Group_1__0__Impl : ( '0' ) ;
    public final void rule__XmlInt__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7967:1: ( ( '0' ) )
            // InternalXemfs.g:7968:1: ( '0' )
            {
            // InternalXemfs.g:7968:1: ( '0' )
            // InternalXemfs.g:7969:1: '0'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_0()); 
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
    // $ANTLR end "rule__XmlInt__Group_1__0__Impl"


    // $ANTLR start "rule__XmlInt__Group_1__1"
    // InternalXemfs.g:7982:1: rule__XmlInt__Group_1__1 : rule__XmlInt__Group_1__1__Impl ;
    public final void rule__XmlInt__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7986:1: ( rule__XmlInt__Group_1__1__Impl )
            // InternalXemfs.g:7987:2: rule__XmlInt__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlInt__Group_1__1"


    // $ANTLR start "rule__XmlInt__Group_1__1__Impl"
    // InternalXemfs.g:7993:1: rule__XmlInt__Group_1__1__Impl : ( ( rule__XmlInt__Alternatives_1_1 ) ) ;
    public final void rule__XmlInt__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:7997:1: ( ( ( rule__XmlInt__Alternatives_1_1 ) ) )
            // InternalXemfs.g:7998:1: ( ( rule__XmlInt__Alternatives_1_1 ) )
            {
            // InternalXemfs.g:7998:1: ( ( rule__XmlInt__Alternatives_1_1 ) )
            // InternalXemfs.g:7999:1: ( rule__XmlInt__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getAlternatives_1_1()); 
            }
            // InternalXemfs.g:8000:1: ( rule__XmlInt__Alternatives_1_1 )
            // InternalXemfs.g:8000:2: rule__XmlInt__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getAlternatives_1_1()); 
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
    // $ANTLR end "rule__XmlInt__Group_1__1__Impl"


    // $ANTLR start "rule__XmlInt__Group_1_1_0__0"
    // InternalXemfs.g:8014:1: rule__XmlInt__Group_1_1_0__0 : rule__XmlInt__Group_1_1_0__0__Impl rule__XmlInt__Group_1_1_0__1 ;
    public final void rule__XmlInt__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8018:1: ( rule__XmlInt__Group_1_1_0__0__Impl rule__XmlInt__Group_1_1_0__1 )
            // InternalXemfs.g:8019:2: rule__XmlInt__Group_1_1_0__0__Impl rule__XmlInt__Group_1_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_57);
            rule__XmlInt__Group_1_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Group_1_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlInt__Group_1_1_0__0"


    // $ANTLR start "rule__XmlInt__Group_1_1_0__0__Impl"
    // InternalXemfs.g:8026:1: rule__XmlInt__Group_1_1_0__0__Impl : ( 'b' ) ;
    public final void rule__XmlInt__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8030:1: ( ( 'b' ) )
            // InternalXemfs.g:8031:1: ( 'b' )
            {
            // InternalXemfs.g:8031:1: ( 'b' )
            // InternalXemfs.g:8032:1: 'b'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getBKeyword_1_1_0_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getBKeyword_1_1_0_0()); 
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
    // $ANTLR end "rule__XmlInt__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__XmlInt__Group_1_1_0__1"
    // InternalXemfs.g:8045:1: rule__XmlInt__Group_1_1_0__1 : rule__XmlInt__Group_1_1_0__1__Impl ;
    public final void rule__XmlInt__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8049:1: ( rule__XmlInt__Group_1_1_0__1__Impl )
            // InternalXemfs.g:8050:2: rule__XmlInt__Group_1_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Group_1_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlInt__Group_1_1_0__1"


    // $ANTLR start "rule__XmlInt__Group_1_1_0__1__Impl"
    // InternalXemfs.g:8056:1: rule__XmlInt__Group_1_1_0__1__Impl : ( ( ( rule__XmlInt__Alternatives_1_1_0_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_0_1 )* ) ) ;
    public final void rule__XmlInt__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8060:1: ( ( ( ( rule__XmlInt__Alternatives_1_1_0_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_0_1 )* ) ) )
            // InternalXemfs.g:8061:1: ( ( ( rule__XmlInt__Alternatives_1_1_0_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_0_1 )* ) )
            {
            // InternalXemfs.g:8061:1: ( ( ( rule__XmlInt__Alternatives_1_1_0_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_0_1 )* ) )
            // InternalXemfs.g:8062:1: ( ( rule__XmlInt__Alternatives_1_1_0_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_0_1 )* )
            {
            // InternalXemfs.g:8062:1: ( ( rule__XmlInt__Alternatives_1_1_0_1 ) )
            // InternalXemfs.g:8063:1: ( rule__XmlInt__Alternatives_1_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getAlternatives_1_1_0_1()); 
            }
            // InternalXemfs.g:8064:1: ( rule__XmlInt__Alternatives_1_1_0_1 )
            // InternalXemfs.g:8064:2: rule__XmlInt__Alternatives_1_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_58);
            rule__XmlInt__Alternatives_1_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getAlternatives_1_1_0_1()); 
            }

            }

            // InternalXemfs.g:8067:1: ( ( rule__XmlInt__Alternatives_1_1_0_1 )* )
            // InternalXemfs.g:8068:1: ( rule__XmlInt__Alternatives_1_1_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getAlternatives_1_1_0_1()); 
            }
            // InternalXemfs.g:8069:1: ( rule__XmlInt__Alternatives_1_1_0_1 )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=14 && LA86_0<=15)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalXemfs.g:8069:2: rule__XmlInt__Alternatives_1_1_0_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_58);
            	    rule__XmlInt__Alternatives_1_1_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getAlternatives_1_1_0_1()); 
            }

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
    // $ANTLR end "rule__XmlInt__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__XmlInt__Group_1_1_1__0"
    // InternalXemfs.g:8084:1: rule__XmlInt__Group_1_1_1__0 : rule__XmlInt__Group_1_1_1__0__Impl rule__XmlInt__Group_1_1_1__1 ;
    public final void rule__XmlInt__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8088:1: ( rule__XmlInt__Group_1_1_1__0__Impl rule__XmlInt__Group_1_1_1__1 )
            // InternalXemfs.g:8089:2: rule__XmlInt__Group_1_1_1__0__Impl rule__XmlInt__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_59);
            rule__XmlInt__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlInt__Group_1_1_1__0"


    // $ANTLR start "rule__XmlInt__Group_1_1_1__0__Impl"
    // InternalXemfs.g:8096:1: rule__XmlInt__Group_1_1_1__0__Impl : ( 'o' ) ;
    public final void rule__XmlInt__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8100:1: ( ( 'o' ) )
            // InternalXemfs.g:8101:1: ( 'o' )
            {
            // InternalXemfs.g:8101:1: ( 'o' )
            // InternalXemfs.g:8102:1: 'o'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getOKeyword_1_1_1_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getOKeyword_1_1_1_0()); 
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
    // $ANTLR end "rule__XmlInt__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__XmlInt__Group_1_1_1__1"
    // InternalXemfs.g:8115:1: rule__XmlInt__Group_1_1_1__1 : rule__XmlInt__Group_1_1_1__1__Impl ;
    public final void rule__XmlInt__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8119:1: ( rule__XmlInt__Group_1_1_1__1__Impl )
            // InternalXemfs.g:8120:2: rule__XmlInt__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlInt__Group_1_1_1__1"


    // $ANTLR start "rule__XmlInt__Group_1_1_1__1__Impl"
    // InternalXemfs.g:8126:1: rule__XmlInt__Group_1_1_1__1__Impl : ( ( ( rule__XmlInt__Alternatives_1_1_1_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_1_1 )* ) ) ;
    public final void rule__XmlInt__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8130:1: ( ( ( ( rule__XmlInt__Alternatives_1_1_1_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_1_1 )* ) ) )
            // InternalXemfs.g:8131:1: ( ( ( rule__XmlInt__Alternatives_1_1_1_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_1_1 )* ) )
            {
            // InternalXemfs.g:8131:1: ( ( ( rule__XmlInt__Alternatives_1_1_1_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_1_1 )* ) )
            // InternalXemfs.g:8132:1: ( ( rule__XmlInt__Alternatives_1_1_1_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_1_1 )* )
            {
            // InternalXemfs.g:8132:1: ( ( rule__XmlInt__Alternatives_1_1_1_1 ) )
            // InternalXemfs.g:8133:1: ( rule__XmlInt__Alternatives_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getAlternatives_1_1_1_1()); 
            }
            // InternalXemfs.g:8134:1: ( rule__XmlInt__Alternatives_1_1_1_1 )
            // InternalXemfs.g:8134:2: rule__XmlInt__Alternatives_1_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_60);
            rule__XmlInt__Alternatives_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getAlternatives_1_1_1_1()); 
            }

            }

            // InternalXemfs.g:8137:1: ( ( rule__XmlInt__Alternatives_1_1_1_1 )* )
            // InternalXemfs.g:8138:1: ( rule__XmlInt__Alternatives_1_1_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getAlternatives_1_1_1_1()); 
            }
            // InternalXemfs.g:8139:1: ( rule__XmlInt__Alternatives_1_1_1_1 )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( ((LA87_0>=14 && LA87_0<=21)) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalXemfs.g:8139:2: rule__XmlInt__Alternatives_1_1_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_60);
            	    rule__XmlInt__Alternatives_1_1_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getAlternatives_1_1_1_1()); 
            }

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
    // $ANTLR end "rule__XmlInt__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__XmlInt__Group_1_1_2__0"
    // InternalXemfs.g:8154:1: rule__XmlInt__Group_1_1_2__0 : rule__XmlInt__Group_1_1_2__0__Impl rule__XmlInt__Group_1_1_2__1 ;
    public final void rule__XmlInt__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8158:1: ( rule__XmlInt__Group_1_1_2__0__Impl rule__XmlInt__Group_1_1_2__1 )
            // InternalXemfs.g:8159:2: rule__XmlInt__Group_1_1_2__0__Impl rule__XmlInt__Group_1_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_61);
            rule__XmlInt__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Group_1_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlInt__Group_1_1_2__0"


    // $ANTLR start "rule__XmlInt__Group_1_1_2__0__Impl"
    // InternalXemfs.g:8166:1: rule__XmlInt__Group_1_1_2__0__Impl : ( 'x' ) ;
    public final void rule__XmlInt__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8170:1: ( ( 'x' ) )
            // InternalXemfs.g:8171:1: ( 'x' )
            {
            // InternalXemfs.g:8171:1: ( 'x' )
            // InternalXemfs.g:8172:1: 'x'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getXKeyword_1_1_2_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getXKeyword_1_1_2_0()); 
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
    // $ANTLR end "rule__XmlInt__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__XmlInt__Group_1_1_2__1"
    // InternalXemfs.g:8185:1: rule__XmlInt__Group_1_1_2__1 : rule__XmlInt__Group_1_1_2__1__Impl ;
    public final void rule__XmlInt__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8189:1: ( rule__XmlInt__Group_1_1_2__1__Impl )
            // InternalXemfs.g:8190:2: rule__XmlInt__Group_1_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlInt__Group_1_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlInt__Group_1_1_2__1"


    // $ANTLR start "rule__XmlInt__Group_1_1_2__1__Impl"
    // InternalXemfs.g:8196:1: rule__XmlInt__Group_1_1_2__1__Impl : ( ( ( rule__XmlInt__Alternatives_1_1_2_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_2_1 )* ) ) ;
    public final void rule__XmlInt__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8200:1: ( ( ( ( rule__XmlInt__Alternatives_1_1_2_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_2_1 )* ) ) )
            // InternalXemfs.g:8201:1: ( ( ( rule__XmlInt__Alternatives_1_1_2_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_2_1 )* ) )
            {
            // InternalXemfs.g:8201:1: ( ( ( rule__XmlInt__Alternatives_1_1_2_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_2_1 )* ) )
            // InternalXemfs.g:8202:1: ( ( rule__XmlInt__Alternatives_1_1_2_1 ) ) ( ( rule__XmlInt__Alternatives_1_1_2_1 )* )
            {
            // InternalXemfs.g:8202:1: ( ( rule__XmlInt__Alternatives_1_1_2_1 ) )
            // InternalXemfs.g:8203:1: ( rule__XmlInt__Alternatives_1_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getAlternatives_1_1_2_1()); 
            }
            // InternalXemfs.g:8204:1: ( rule__XmlInt__Alternatives_1_1_2_1 )
            // InternalXemfs.g:8204:2: rule__XmlInt__Alternatives_1_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_62);
            rule__XmlInt__Alternatives_1_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getAlternatives_1_1_2_1()); 
            }

            }

            // InternalXemfs.g:8207:1: ( ( rule__XmlInt__Alternatives_1_1_2_1 )* )
            // InternalXemfs.g:8208:1: ( rule__XmlInt__Alternatives_1_1_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlIntAccess().getAlternatives_1_1_2_1()); 
            }
            // InternalXemfs.g:8209:1: ( rule__XmlInt__Alternatives_1_1_2_1 )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( ((LA88_0>=14 && LA88_0<=23)||(LA88_0>=25 && LA88_0<=30)) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalXemfs.g:8209:2: rule__XmlInt__Alternatives_1_1_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    rule__XmlInt__Alternatives_1_1_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlIntAccess().getAlternatives_1_1_2_1()); 
            }

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
    // $ANTLR end "rule__XmlInt__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__EmfsRoot__NameAssignment_1_1"
    // InternalXemfs.g:8225:1: rule__EmfsRoot__NameAssignment_1_1 : ( ruleEmfsName ) ;
    public final void rule__EmfsRoot__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8229:1: ( ( ruleEmfsName ) )
            // InternalXemfs.g:8230:1: ( ruleEmfsName )
            {
            // InternalXemfs.g:8230:1: ( ruleEmfsName )
            // InternalXemfs.g:8231:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getNameEmfsNameParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getNameEmfsNameParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__EmfsRoot__NameAssignment_1_1"


    // $ANTLR start "rule__EmfsRoot__TagsAssignment_2_1"
    // InternalXemfs.g:8240:1: rule__EmfsRoot__TagsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__EmfsRoot__TagsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8244:1: ( ( RULE_ID ) )
            // InternalXemfs.g:8245:1: ( RULE_ID )
            {
            // InternalXemfs.g:8245:1: ( RULE_ID )
            // InternalXemfs.g:8246:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getTagsIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getTagsIDTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__EmfsRoot__TagsAssignment_2_1"


    // $ANTLR start "rule__EmfsRoot__PropertiesAssignment_3"
    // InternalXemfs.g:8255:1: rule__EmfsRoot__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__EmfsRoot__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8259:1: ( ( ruleProperty ) )
            // InternalXemfs.g:8260:1: ( ruleProperty )
            {
            // InternalXemfs.g:8260:1: ( ruleProperty )
            // InternalXemfs.g:8261:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getPropertiesPropertyParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__EmfsRoot__PropertiesAssignment_3"


    // $ANTLR start "rule__EmfsRoot__ContentProviderAssignment_4_1"
    // InternalXemfs.g:8270:1: rule__EmfsRoot__ContentProviderAssignment_4_1 : ( ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 ) ) ;
    public final void rule__EmfsRoot__ContentProviderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8274:1: ( ( ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 ) ) )
            // InternalXemfs.g:8275:1: ( ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 ) )
            {
            // InternalXemfs.g:8275:1: ( ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 ) )
            // InternalXemfs.g:8276:1: ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getContentProviderAlternatives_4_1_0()); 
            }
            // InternalXemfs.g:8277:1: ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 )
            // InternalXemfs.g:8277:2: rule__EmfsRoot__ContentProviderAlternatives_4_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsRoot__ContentProviderAlternatives_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getContentProviderAlternatives_4_1_0()); 
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
    // $ANTLR end "rule__EmfsRoot__ContentProviderAssignment_4_1"


    // $ANTLR start "rule__EmfsRoot__ResourcesAssignment_6"
    // InternalXemfs.g:8286:1: rule__EmfsRoot__ResourcesAssignment_6 : ( ruleEmfsResource ) ;
    public final void rule__EmfsRoot__ResourcesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8290:1: ( ( ruleEmfsResource ) )
            // InternalXemfs.g:8291:1: ( ruleEmfsResource )
            {
            // InternalXemfs.g:8291:1: ( ruleEmfsResource )
            // InternalXemfs.g:8292:1: ruleEmfsResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getResourcesEmfsResourceParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getResourcesEmfsResourceParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__EmfsRoot__ResourcesAssignment_6"


    // $ANTLR start "rule__EmfsResourcesRef__ResourcesAssignment_0"
    // InternalXemfs.g:8301:1: rule__EmfsResourcesRef__ResourcesAssignment_0 : ( ( ruleEmfsName ) ) ;
    public final void rule__EmfsResourcesRef__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8305:1: ( ( ( ruleEmfsName ) ) )
            // InternalXemfs.g:8306:1: ( ( ruleEmfsName ) )
            {
            // InternalXemfs.g:8306:1: ( ( ruleEmfsName ) )
            // InternalXemfs.g:8307:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_0_0()); 
            }
            // InternalXemfs.g:8308:1: ( ruleEmfsName )
            // InternalXemfs.g:8309:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceEmfsNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceEmfsNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_0_0()); 
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
    // $ANTLR end "rule__EmfsResourcesRef__ResourcesAssignment_0"


    // $ANTLR start "rule__EmfsResourcesRef__ResourcesAssignment_1_1"
    // InternalXemfs.g:8320:1: rule__EmfsResourcesRef__ResourcesAssignment_1_1 : ( ( ruleEmfsName ) ) ;
    public final void rule__EmfsResourcesRef__ResourcesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8324:1: ( ( ( ruleEmfsName ) ) )
            // InternalXemfs.g:8325:1: ( ( ruleEmfsName ) )
            {
            // InternalXemfs.g:8325:1: ( ( ruleEmfsName ) )
            // InternalXemfs.g:8326:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_1_1_0()); 
            }
            // InternalXemfs.g:8327:1: ( ruleEmfsName )
            // InternalXemfs.g:8328:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceEmfsNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceEmfsNameParserRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_1_1_0()); 
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
    // $ANTLR end "rule__EmfsResourcesRef__ResourcesAssignment_1_1"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // InternalXemfs.g:8339:1: rule__Property__NameAssignment_1 : ( ruleEmfsName ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8343:1: ( ( ruleEmfsName ) )
            // InternalXemfs.g:8344:1: ( ruleEmfsName )
            {
            // InternalXemfs.g:8344:1: ( ruleEmfsName )
            // InternalXemfs.g:8345:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameEmfsNameParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameEmfsNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__Property__ValueAssignment_3"
    // InternalXemfs.g:8354:1: rule__Property__ValueAssignment_3 : ( ( rule__Property__ValueAlternatives_3_0 ) ) ;
    public final void rule__Property__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8358:1: ( ( ( rule__Property__ValueAlternatives_3_0 ) ) )
            // InternalXemfs.g:8359:1: ( ( rule__Property__ValueAlternatives_3_0 ) )
            {
            // InternalXemfs.g:8359:1: ( ( rule__Property__ValueAlternatives_3_0 ) )
            // InternalXemfs.g:8360:1: ( rule__Property__ValueAlternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAlternatives_3_0()); 
            }
            // InternalXemfs.g:8361:1: ( rule__Property__ValueAlternatives_3_0 )
            // InternalXemfs.g:8361:2: rule__Property__ValueAlternatives_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__ValueAlternatives_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueAlternatives_3_0()); 
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
    // $ANTLR end "rule__Property__ValueAssignment_3"


    // $ANTLR start "rule__EmfsContainer__NameAssignment_0"
    // InternalXemfs.g:8370:1: rule__EmfsContainer__NameAssignment_0 : ( ruleFolderName ) ;
    public final void rule__EmfsContainer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8374:1: ( ( ruleFolderName ) )
            // InternalXemfs.g:8375:1: ( ruleFolderName )
            {
            // InternalXemfs.g:8375:1: ( ruleFolderName )
            // InternalXemfs.g:8376:1: ruleFolderName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getNameFolderNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFolderName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getNameFolderNameParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__EmfsContainer__NameAssignment_0"


    // $ANTLR start "rule__EmfsContainer__TagsAssignment_1_1"
    // InternalXemfs.g:8385:1: rule__EmfsContainer__TagsAssignment_1_1 : ( ruleEmfsName ) ;
    public final void rule__EmfsContainer__TagsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8389:1: ( ( ruleEmfsName ) )
            // InternalXemfs.g:8390:1: ( ruleEmfsName )
            {
            // InternalXemfs.g:8390:1: ( ruleEmfsName )
            // InternalXemfs.g:8391:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getTagsEmfsNameParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getTagsEmfsNameParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__EmfsContainer__TagsAssignment_1_1"


    // $ANTLR start "rule__EmfsContainer__PropertiesAssignment_2"
    // InternalXemfs.g:8400:1: rule__EmfsContainer__PropertiesAssignment_2 : ( ruleProperty ) ;
    public final void rule__EmfsContainer__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8404:1: ( ( ruleProperty ) )
            // InternalXemfs.g:8405:1: ( ruleProperty )
            {
            // InternalXemfs.g:8405:1: ( ruleProperty )
            // InternalXemfs.g:8406:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getPropertiesPropertyParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__EmfsContainer__PropertiesAssignment_2"


    // $ANTLR start "rule__EmfsContainer__ContentProviderAssignment_3_1"
    // InternalXemfs.g:8415:1: rule__EmfsContainer__ContentProviderAssignment_3_1 : ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) ) ;
    public final void rule__EmfsContainer__ContentProviderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8419:1: ( ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) ) )
            // InternalXemfs.g:8420:1: ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) )
            {
            // InternalXemfs.g:8420:1: ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) )
            // InternalXemfs.g:8421:1: ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getContentProviderAlternatives_3_1_0()); 
            }
            // InternalXemfs.g:8422:1: ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 )
            // InternalXemfs.g:8422:2: rule__EmfsContainer__ContentProviderAlternatives_3_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsContainer__ContentProviderAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getContentProviderAlternatives_3_1_0()); 
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
    // $ANTLR end "rule__EmfsContainer__ContentProviderAssignment_3_1"


    // $ANTLR start "rule__EmfsContainer__ResourcesAssignment_4"
    // InternalXemfs.g:8431:1: rule__EmfsContainer__ResourcesAssignment_4 : ( ruleEmfsResource ) ;
    public final void rule__EmfsContainer__ResourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8435:1: ( ( ruleEmfsResource ) )
            // InternalXemfs.g:8436:1: ( ruleEmfsResource )
            {
            // InternalXemfs.g:8436:1: ( ruleEmfsResource )
            // InternalXemfs.g:8437:1: ruleEmfsResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getResourcesEmfsResourceParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerAccess().getResourcesEmfsResourceParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__EmfsContainer__ResourcesAssignment_4"


    // $ANTLR start "rule__GitContentProvider__GitRefAssignment"
    // InternalXemfs.g:8446:1: rule__GitContentProvider__GitRefAssignment : ( ruleGitContentRef ) ;
    public final void rule__GitContentProvider__GitRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8450:1: ( ( ruleGitContentRef ) )
            // InternalXemfs.g:8451:1: ( ruleGitContentRef )
            {
            // InternalXemfs.g:8451:1: ( ruleGitContentRef )
            // InternalXemfs.g:8452:1: ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGitContentRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
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
    // $ANTLR end "rule__GitContentProvider__GitRefAssignment"


    // $ANTLR start "rule__EmfsFile__NameAssignment_0"
    // InternalXemfs.g:8461:1: rule__EmfsFile__NameAssignment_0 : ( ruleFileName ) ;
    public final void rule__EmfsFile__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8465:1: ( ( ruleFileName ) )
            // InternalXemfs.g:8466:1: ( ruleFileName )
            {
            // InternalXemfs.g:8466:1: ( ruleFileName )
            // InternalXemfs.g:8467:1: ruleFileName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getNameFileNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFileName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getNameFileNameParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__EmfsFile__NameAssignment_0"


    // $ANTLR start "rule__EmfsFile__WriteableAssignment_1"
    // InternalXemfs.g:8476:1: rule__EmfsFile__WriteableAssignment_1 : ( ( '*' ) ) ;
    public final void rule__EmfsFile__WriteableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8480:1: ( ( ( '*' ) ) )
            // InternalXemfs.g:8481:1: ( ( '*' ) )
            {
            // InternalXemfs.g:8481:1: ( ( '*' ) )
            // InternalXemfs.g:8482:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getWriteableAsteriskKeyword_1_0()); 
            }
            // InternalXemfs.g:8483:1: ( '*' )
            // InternalXemfs.g:8484:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getWriteableAsteriskKeyword_1_0()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getWriteableAsteriskKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getWriteableAsteriskKeyword_1_0()); 
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
    // $ANTLR end "rule__EmfsFile__WriteableAssignment_1"


    // $ANTLR start "rule__EmfsFile__TagsAssignment_2_1"
    // InternalXemfs.g:8499:1: rule__EmfsFile__TagsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__EmfsFile__TagsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8503:1: ( ( RULE_ID ) )
            // InternalXemfs.g:8504:1: ( RULE_ID )
            {
            // InternalXemfs.g:8504:1: ( RULE_ID )
            // InternalXemfs.g:8505:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getTagsIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getTagsIDTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__EmfsFile__TagsAssignment_2_1"


    // $ANTLR start "rule__EmfsFile__PropertiesAssignment_3"
    // InternalXemfs.g:8514:1: rule__EmfsFile__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__EmfsFile__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8518:1: ( ( ruleProperty ) )
            // InternalXemfs.g:8519:1: ( ruleProperty )
            {
            // InternalXemfs.g:8519:1: ( ruleProperty )
            // InternalXemfs.g:8520:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getPropertiesPropertyParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__EmfsFile__PropertiesAssignment_3"


    // $ANTLR start "rule__EmfsFile__ContentProviderAssignment_4_0_1"
    // InternalXemfs.g:8529:1: rule__EmfsFile__ContentProviderAssignment_4_0_1 : ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) ) ;
    public final void rule__EmfsFile__ContentProviderAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8533:1: ( ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) ) )
            // InternalXemfs.g:8534:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) )
            {
            // InternalXemfs.g:8534:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) )
            // InternalXemfs.g:8535:1: ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_0_1_0()); 
            }
            // InternalXemfs.g:8536:1: ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 )
            // InternalXemfs.g:8536:2: rule__EmfsFile__ContentProviderAlternatives_4_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__ContentProviderAlternatives_4_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_0_1_0()); 
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
    // $ANTLR end "rule__EmfsFile__ContentProviderAssignment_4_0_1"


    // $ANTLR start "rule__EmfsFile__ContentProviderAssignment_4_1"
    // InternalXemfs.g:8545:1: rule__EmfsFile__ContentProviderAssignment_4_1 : ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) ) ;
    public final void rule__EmfsFile__ContentProviderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8549:1: ( ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) ) )
            // InternalXemfs.g:8550:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) )
            {
            // InternalXemfs.g:8550:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) )
            // InternalXemfs.g:8551:1: ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_1_0()); 
            }
            // InternalXemfs.g:8552:1: ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 )
            // InternalXemfs.g:8552:2: rule__EmfsFile__ContentProviderAlternatives_4_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__ContentProviderAlternatives_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_1_0()); 
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
    // $ANTLR end "rule__EmfsFile__ContentProviderAssignment_4_1"


    // $ANTLR start "rule__EmfsFile__ContentProviderAssignment_4_2_1"
    // InternalXemfs.g:8561:1: rule__EmfsFile__ContentProviderAssignment_4_2_1 : ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) ) ;
    public final void rule__EmfsFile__ContentProviderAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8565:1: ( ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) ) )
            // InternalXemfs.g:8566:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) )
            {
            // InternalXemfs.g:8566:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) )
            // InternalXemfs.g:8567:1: ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_2_1_0()); 
            }
            // InternalXemfs.g:8568:1: ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 )
            // InternalXemfs.g:8568:2: rule__EmfsFile__ContentProviderAlternatives_4_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EmfsFile__ContentProviderAlternatives_4_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_2_1_0()); 
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
    // $ANTLR end "rule__EmfsFile__ContentProviderAssignment_4_2_1"


    // $ANTLR start "rule__StringContentProvider__StringContentsAssignment"
    // InternalXemfs.g:8577:1: rule__StringContentProvider__StringContentsAssignment : ( ruleAbstractStringContents ) ;
    public final void rule__StringContentProvider__StringContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8581:1: ( ( ruleAbstractStringContents ) )
            // InternalXemfs.g:8582:1: ( ruleAbstractStringContents )
            {
            // InternalXemfs.g:8582:1: ( ruleAbstractStringContents )
            // InternalXemfs.g:8583:1: ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringContentProviderAccess().getStringContentsAbstractStringContentsParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringContentProviderAccess().getStringContentsAbstractStringContentsParserRuleCall_0()); 
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
    // $ANTLR end "rule__StringContentProvider__StringContentsAssignment"


    // $ANTLR start "rule__VerbatimStringContents__WriteableAssignment_0_1"
    // InternalXemfs.g:8592:1: rule__VerbatimStringContents__WriteableAssignment_0_1 : ( ( '*' ) ) ;
    public final void rule__VerbatimStringContents__WriteableAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8596:1: ( ( ( '*' ) ) )
            // InternalXemfs.g:8597:1: ( ( '*' ) )
            {
            // InternalXemfs.g:8597:1: ( ( '*' ) )
            // InternalXemfs.g:8598:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getWriteableAsteriskKeyword_0_1_0()); 
            }
            // InternalXemfs.g:8599:1: ( '*' )
            // InternalXemfs.g:8600:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getWriteableAsteriskKeyword_0_1_0()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getWriteableAsteriskKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getWriteableAsteriskKeyword_0_1_0()); 
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
    // $ANTLR end "rule__VerbatimStringContents__WriteableAssignment_0_1"


    // $ANTLR start "rule__VerbatimStringContents__TagsAssignment_0_2_1"
    // InternalXemfs.g:8615:1: rule__VerbatimStringContents__TagsAssignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__VerbatimStringContents__TagsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8619:1: ( ( RULE_ID ) )
            // InternalXemfs.g:8620:1: ( RULE_ID )
            {
            // InternalXemfs.g:8620:1: ( RULE_ID )
            // InternalXemfs.g:8621:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getTagsIDTerminalRuleCall_0_2_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getTagsIDTerminalRuleCall_0_2_1_0()); 
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
    // $ANTLR end "rule__VerbatimStringContents__TagsAssignment_0_2_1"


    // $ANTLR start "rule__VerbatimStringContents__PropertiesAssignment_0_3"
    // InternalXemfs.g:8630:1: rule__VerbatimStringContents__PropertiesAssignment_0_3 : ( ruleProperty ) ;
    public final void rule__VerbatimStringContents__PropertiesAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8634:1: ( ( ruleProperty ) )
            // InternalXemfs.g:8635:1: ( ruleProperty )
            {
            // InternalXemfs.g:8635:1: ( ruleProperty )
            // InternalXemfs.g:8636:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getPropertiesPropertyParserRuleCall_0_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getPropertiesPropertyParserRuleCall_0_3_0()); 
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
    // $ANTLR end "rule__VerbatimStringContents__PropertiesAssignment_0_3"


    // $ANTLR start "rule__VerbatimStringContents__StringContentAssignment_1"
    // InternalXemfs.g:8645:1: rule__VerbatimStringContents__StringContentAssignment_1 : ( ( rule__VerbatimStringContents__StringContentAlternatives_1_0 ) ) ;
    public final void rule__VerbatimStringContents__StringContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8649:1: ( ( ( rule__VerbatimStringContents__StringContentAlternatives_1_0 ) ) )
            // InternalXemfs.g:8650:1: ( ( rule__VerbatimStringContents__StringContentAlternatives_1_0 ) )
            {
            // InternalXemfs.g:8650:1: ( ( rule__VerbatimStringContents__StringContentAlternatives_1_0 ) )
            // InternalXemfs.g:8651:1: ( rule__VerbatimStringContents__StringContentAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getStringContentAlternatives_1_0()); 
            }
            // InternalXemfs.g:8652:1: ( rule__VerbatimStringContents__StringContentAlternatives_1_0 )
            // InternalXemfs.g:8652:2: rule__VerbatimStringContents__StringContentAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VerbatimStringContents__StringContentAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getStringContentAlternatives_1_0()); 
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
    // $ANTLR end "rule__VerbatimStringContents__StringContentAssignment_1"


    // $ANTLR start "rule__PropertyValueString__WriteableAssignment_1"
    // InternalXemfs.g:8661:1: rule__PropertyValueString__WriteableAssignment_1 : ( ( '*' ) ) ;
    public final void rule__PropertyValueString__WriteableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8665:1: ( ( ( '*' ) ) )
            // InternalXemfs.g:8666:1: ( ( '*' ) )
            {
            // InternalXemfs.g:8666:1: ( ( '*' ) )
            // InternalXemfs.g:8667:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getWriteableAsteriskKeyword_1_0()); 
            }
            // InternalXemfs.g:8668:1: ( '*' )
            // InternalXemfs.g:8669:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getWriteableAsteriskKeyword_1_0()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getWriteableAsteriskKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getWriteableAsteriskKeyword_1_0()); 
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
    // $ANTLR end "rule__PropertyValueString__WriteableAssignment_1"


    // $ANTLR start "rule__PropertyValueString__PropertyNameAssignment_2_0"
    // InternalXemfs.g:8684:1: rule__PropertyValueString__PropertyNameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__PropertyValueString__PropertyNameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8688:1: ( ( RULE_ID ) )
            // InternalXemfs.g:8689:1: ( RULE_ID )
            {
            // InternalXemfs.g:8689:1: ( RULE_ID )
            // InternalXemfs.g:8690:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getPropertyNameIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getPropertyNameIDTerminalRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__PropertyValueString__PropertyNameAssignment_2_0"


    // $ANTLR start "rule__PropertyValueString__PropertyNameAssignment_2_1_1"
    // InternalXemfs.g:8699:1: rule__PropertyValueString__PropertyNameAssignment_2_1_1 : ( ruleEmfsName ) ;
    public final void rule__PropertyValueString__PropertyNameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8703:1: ( ( ruleEmfsName ) )
            // InternalXemfs.g:8704:1: ( ruleEmfsName )
            {
            // InternalXemfs.g:8704:1: ( ruleEmfsName )
            // InternalXemfs.g:8705:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getPropertyNameEmfsNameParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getPropertyNameEmfsNameParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__PropertyValueString__PropertyNameAssignment_2_1_1"


    // $ANTLR start "rule__PropertyValueString__DefaultValueAssignment_3_1"
    // InternalXemfs.g:8714:1: rule__PropertyValueString__DefaultValueAssignment_3_1 : ( ( rule__PropertyValueString__DefaultValueAlternatives_3_1_0 ) ) ;
    public final void rule__PropertyValueString__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8718:1: ( ( ( rule__PropertyValueString__DefaultValueAlternatives_3_1_0 ) ) )
            // InternalXemfs.g:8719:1: ( ( rule__PropertyValueString__DefaultValueAlternatives_3_1_0 ) )
            {
            // InternalXemfs.g:8719:1: ( ( rule__PropertyValueString__DefaultValueAlternatives_3_1_0 ) )
            // InternalXemfs.g:8720:1: ( rule__PropertyValueString__DefaultValueAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getDefaultValueAlternatives_3_1_0()); 
            }
            // InternalXemfs.g:8721:1: ( rule__PropertyValueString__DefaultValueAlternatives_3_1_0 )
            // InternalXemfs.g:8721:2: rule__PropertyValueString__DefaultValueAlternatives_3_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PropertyValueString__DefaultValueAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getDefaultValueAlternatives_3_1_0()); 
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
    // $ANTLR end "rule__PropertyValueString__DefaultValueAssignment_3_1"


    // $ANTLR start "rule__WrappingStringContentProvider__PrefixAssignment_0_1"
    // InternalXemfs.g:8730:1: rule__WrappingStringContentProvider__PrefixAssignment_0_1 : ( ruleAbstractStringContents ) ;
    public final void rule__WrappingStringContentProvider__PrefixAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8734:1: ( ( ruleAbstractStringContents ) )
            // InternalXemfs.g:8735:1: ( ruleAbstractStringContents )
            {
            // InternalXemfs.g:8735:1: ( ruleAbstractStringContents )
            // InternalXemfs.g:8736:1: ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAbstractStringContentsParserRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAbstractStringContentsParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__PrefixAssignment_0_1"


    // $ANTLR start "rule__WrappingStringContentProvider__ContentProviderAssignment_1_1"
    // InternalXemfs.g:8745:1: rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 : ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) ) ;
    public final void rule__WrappingStringContentProvider__ContentProviderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8749:1: ( ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) ) )
            // InternalXemfs.g:8750:1: ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) )
            {
            // InternalXemfs.g:8750:1: ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) )
            // InternalXemfs.g:8751:1: ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderAlternatives_1_1_0()); 
            }
            // InternalXemfs.g:8752:1: ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 )
            // InternalXemfs.g:8752:2: rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__ContentProviderAssignment_1_1"


    // $ANTLR start "rule__WrappingStringContentProvider__SuffixAssignment_2_1"
    // InternalXemfs.g:8761:1: rule__WrappingStringContentProvider__SuffixAssignment_2_1 : ( ruleAbstractStringContents ) ;
    public final void rule__WrappingStringContentProvider__SuffixAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8765:1: ( ( ruleAbstractStringContents ) )
            // InternalXemfs.g:8766:1: ( ruleAbstractStringContents )
            {
            // InternalXemfs.g:8766:1: ( ruleAbstractStringContents )
            // InternalXemfs.g:8767:1: ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAbstractStringContentsParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAbstractStringContentsParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__WrappingStringContentProvider__SuffixAssignment_2_1"


    // $ANTLR start "rule__URLContentProvider__UrlStringAssignment"
    // InternalXemfs.g:8776:1: rule__URLContentProvider__UrlStringAssignment : ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) ) ;
    public final void rule__URLContentProvider__UrlStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8780:1: ( ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) ) )
            // InternalXemfs.g:8781:1: ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) )
            {
            // InternalXemfs.g:8781:1: ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) )
            // InternalXemfs.g:8782:1: ( rule__URLContentProvider__UrlStringAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLContentProviderAccess().getUrlStringAlternatives_0()); 
            }
            // InternalXemfs.g:8783:1: ( rule__URLContentProvider__UrlStringAlternatives_0 )
            // InternalXemfs.g:8783:2: rule__URLContentProvider__UrlStringAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__URLContentProvider__UrlStringAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLContentProviderAccess().getUrlStringAlternatives_0()); 
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
    // $ANTLR end "rule__URLContentProvider__UrlStringAssignment"


    // $ANTLR start "rule__GitURLContentProvider__GitRefAssignment"
    // InternalXemfs.g:8792:1: rule__GitURLContentProvider__GitRefAssignment : ( ruleGitContentRef ) ;
    public final void rule__GitURLContentProvider__GitRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8796:1: ( ( ruleGitContentRef ) )
            // InternalXemfs.g:8797:1: ( ruleGitContentRef )
            {
            // InternalXemfs.g:8797:1: ( ruleGitContentRef )
            // InternalXemfs.g:8798:1: ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitURLContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGitContentRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitURLContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
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
    // $ANTLR end "rule__GitURLContentProvider__GitRefAssignment"


    // $ANTLR start "rule__GitContentRef__HostAssignment_2_0_0"
    // InternalXemfs.g:8807:1: rule__GitContentRef__HostAssignment_2_0_0 : ( ( rule__GitContentRef__HostAlternatives_2_0_0_0 ) ) ;
    public final void rule__GitContentRef__HostAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8811:1: ( ( ( rule__GitContentRef__HostAlternatives_2_0_0_0 ) ) )
            // InternalXemfs.g:8812:1: ( ( rule__GitContentRef__HostAlternatives_2_0_0_0 ) )
            {
            // InternalXemfs.g:8812:1: ( ( rule__GitContentRef__HostAlternatives_2_0_0_0 ) )
            // InternalXemfs.g:8813:1: ( rule__GitContentRef__HostAlternatives_2_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getHostAlternatives_2_0_0_0()); 
            }
            // InternalXemfs.g:8814:1: ( rule__GitContentRef__HostAlternatives_2_0_0_0 )
            // InternalXemfs.g:8814:2: rule__GitContentRef__HostAlternatives_2_0_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__HostAlternatives_2_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getHostAlternatives_2_0_0_0()); 
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
    // $ANTLR end "rule__GitContentRef__HostAssignment_2_0_0"


    // $ANTLR start "rule__GitContentRef__OwnerAssignment_2_0_1_1"
    // InternalXemfs.g:8823:1: rule__GitContentRef__OwnerAssignment_2_0_1_1 : ( ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 ) ) ;
    public final void rule__GitContentRef__OwnerAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8827:1: ( ( ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 ) ) )
            // InternalXemfs.g:8828:1: ( ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 ) )
            {
            // InternalXemfs.g:8828:1: ( ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 ) )
            // InternalXemfs.g:8829:1: ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getOwnerAlternatives_2_0_1_1_0()); 
            }
            // InternalXemfs.g:8830:1: ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 )
            // InternalXemfs.g:8830:2: rule__GitContentRef__OwnerAlternatives_2_0_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__OwnerAlternatives_2_0_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getOwnerAlternatives_2_0_1_1_0()); 
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
    // $ANTLR end "rule__GitContentRef__OwnerAssignment_2_0_1_1"


    // $ANTLR start "rule__GitContentRef__OwnerAssignment_2_1"
    // InternalXemfs.g:8839:1: rule__GitContentRef__OwnerAssignment_2_1 : ( ( rule__GitContentRef__OwnerAlternatives_2_1_0 ) ) ;
    public final void rule__GitContentRef__OwnerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8843:1: ( ( ( rule__GitContentRef__OwnerAlternatives_2_1_0 ) ) )
            // InternalXemfs.g:8844:1: ( ( rule__GitContentRef__OwnerAlternatives_2_1_0 ) )
            {
            // InternalXemfs.g:8844:1: ( ( rule__GitContentRef__OwnerAlternatives_2_1_0 ) )
            // InternalXemfs.g:8845:1: ( rule__GitContentRef__OwnerAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getOwnerAlternatives_2_1_0()); 
            }
            // InternalXemfs.g:8846:1: ( rule__GitContentRef__OwnerAlternatives_2_1_0 )
            // InternalXemfs.g:8846:2: rule__GitContentRef__OwnerAlternatives_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GitContentRef__OwnerAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getOwnerAlternatives_2_1_0()); 
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
    // $ANTLR end "rule__GitContentRef__OwnerAssignment_2_1"


    // $ANTLR start "rule__GitContentRef__RepoAssignment_4"
    // InternalXemfs.g:8855:1: rule__GitContentRef__RepoAssignment_4 : ( RULE_ID ) ;
    public final void rule__GitContentRef__RepoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8859:1: ( ( RULE_ID ) )
            // InternalXemfs.g:8860:1: ( RULE_ID )
            {
            // InternalXemfs.g:8860:1: ( RULE_ID )
            // InternalXemfs.g:8861:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getRepoIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getRepoIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__GitContentRef__RepoAssignment_4"


    // $ANTLR start "rule__GitContentRef__PathAssignment_5"
    // InternalXemfs.g:8870:1: rule__GitContentRef__PathAssignment_5 : ( ruleURL_PATH ) ;
    public final void rule__GitContentRef__PathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8874:1: ( ( ruleURL_PATH ) )
            // InternalXemfs.g:8875:1: ( ruleURL_PATH )
            {
            // InternalXemfs.g:8875:1: ( ruleURL_PATH )
            // InternalXemfs.g:8876:1: ruleURL_PATH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getPathURL_PATHParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleURL_PATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getPathURL_PATHParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__GitContentRef__PathAssignment_5"


    // $ANTLR start "rule__DotClasspathFileContentProvider__EntriesAssignment_1"
    // InternalXemfs.g:8885:1: rule__DotClasspathFileContentProvider__EntriesAssignment_1 : ( ruleAbstractClasspathEntry ) ;
    public final void rule__DotClasspathFileContentProvider__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8889:1: ( ( ruleAbstractClasspathEntry ) )
            // InternalXemfs.g:8890:1: ( ruleAbstractClasspathEntry )
            {
            // InternalXemfs.g:8890:1: ( ruleAbstractClasspathEntry )
            // InternalXemfs.g:8891:1: ruleAbstractClasspathEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAbstractClasspathEntryParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAbstractClasspathEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAbstractClasspathEntryParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__DotClasspathFileContentProvider__EntriesAssignment_1"


    // $ANTLR start "rule__ClasspathEntry__ExplicitKindAssignment_0"
    // InternalXemfs.g:8900:1: rule__ClasspathEntry__ExplicitKindAssignment_0 : ( ruleClasspathEntryKind ) ;
    public final void rule__ClasspathEntry__ExplicitKindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8904:1: ( ( ruleClasspathEntryKind ) )
            // InternalXemfs.g:8905:1: ( ruleClasspathEntryKind )
            {
            // InternalXemfs.g:8905:1: ( ruleClasspathEntryKind )
            // InternalXemfs.g:8906:1: ruleClasspathEntryKind
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitKindClasspathEntryKindEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleClasspathEntryKind();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getExplicitKindClasspathEntryKindEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__ClasspathEntry__ExplicitKindAssignment_0"


    // $ANTLR start "rule__ClasspathEntry__AbsoluteAssignment_1"
    // InternalXemfs.g:8915:1: rule__ClasspathEntry__AbsoluteAssignment_1 : ( ( '/' ) ) ;
    public final void rule__ClasspathEntry__AbsoluteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8919:1: ( ( ( '/' ) ) )
            // InternalXemfs.g:8920:1: ( ( '/' ) )
            {
            // InternalXemfs.g:8920:1: ( ( '/' ) )
            // InternalXemfs.g:8921:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getAbsoluteSolidusKeyword_1_0()); 
            }
            // InternalXemfs.g:8922:1: ( '/' )
            // InternalXemfs.g:8923:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getAbsoluteSolidusKeyword_1_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getAbsoluteSolidusKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getAbsoluteSolidusKeyword_1_0()); 
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
    // $ANTLR end "rule__ClasspathEntry__AbsoluteAssignment_1"


    // $ANTLR start "rule__ClasspathEntry__ExplicitPathAssignment_2"
    // InternalXemfs.g:8938:1: rule__ClasspathEntry__ExplicitPathAssignment_2 : ( ruleCLASSPATH_ENTRY_PATH ) ;
    public final void rule__ClasspathEntry__ExplicitPathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8942:1: ( ( ruleCLASSPATH_ENTRY_PATH ) )
            // InternalXemfs.g:8943:1: ( ruleCLASSPATH_ENTRY_PATH )
            {
            // InternalXemfs.g:8943:1: ( ruleCLASSPATH_ENTRY_PATH )
            // InternalXemfs.g:8944:1: ruleCLASSPATH_ENTRY_PATH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitPathCLASSPATH_ENTRY_PATHParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCLASSPATH_ENTRY_PATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getExplicitPathCLASSPATH_ENTRY_PATHParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ClasspathEntry__ExplicitPathAssignment_2"


    // $ANTLR start "rule__ClasspathEntry__MajorAssignment_3_1"
    // InternalXemfs.g:8953:1: rule__ClasspathEntry__MajorAssignment_3_1 : ( ruleVERSION ) ;
    public final void rule__ClasspathEntry__MajorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8957:1: ( ( ruleVERSION ) )
            // InternalXemfs.g:8958:1: ( ruleVERSION )
            {
            // InternalXemfs.g:8958:1: ( ruleVERSION )
            // InternalXemfs.g:8959:1: ruleVERSION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMajorVERSIONParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVERSION();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getMajorVERSIONParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__ClasspathEntry__MajorAssignment_3_1"


    // $ANTLR start "rule__ClasspathEntry__MinorAssignment_3_2_1"
    // InternalXemfs.g:8968:1: rule__ClasspathEntry__MinorAssignment_3_2_1 : ( ruleVERSION ) ;
    public final void rule__ClasspathEntry__MinorAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8972:1: ( ( ruleVERSION ) )
            // InternalXemfs.g:8973:1: ( ruleVERSION )
            {
            // InternalXemfs.g:8973:1: ( ruleVERSION )
            // InternalXemfs.g:8974:1: ruleVERSION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMinorVERSIONParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVERSION();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getMinorVERSIONParserRuleCall_3_2_1_0()); 
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
    // $ANTLR end "rule__ClasspathEntry__MinorAssignment_3_2_1"


    // $ANTLR start "rule__DotProjectFileContentProvider__KeysAssignment_1_1"
    // InternalXemfs.g:8983:1: rule__DotProjectFileContentProvider__KeysAssignment_1_1 : ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) ) ;
    public final void rule__DotProjectFileContentProvider__KeysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:8987:1: ( ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) ) )
            // InternalXemfs.g:8988:1: ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) )
            {
            // InternalXemfs.g:8988:1: ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) )
            // InternalXemfs.g:8989:1: ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysAlternatives_1_1_0()); 
            }
            // InternalXemfs.g:8990:1: ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 )
            // InternalXemfs.g:8990:2: rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getKeysAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__KeysAssignment_1_1"


    // $ANTLR start "rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1"
    // InternalXemfs.g:8999:1: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 : ( ( ruleEmfsName ) ) ;
    public final void rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9003:1: ( ( ( ruleEmfsName ) ) )
            // InternalXemfs.g:9004:1: ( ( ruleEmfsName ) )
            {
            // InternalXemfs.g:9004:1: ( ( ruleEmfsName ) )
            // InternalXemfs.g:9005:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_1_0()); 
            }
            // InternalXemfs.g:9006:1: ( ruleEmfsName )
            // InternalXemfs.g:9007:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceEmfsNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceEmfsNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1"


    // $ANTLR start "rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1"
    // InternalXemfs.g:9018:1: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 : ( ( ruleEmfsName ) ) ;
    public final void rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9022:1: ( ( ( ruleEmfsName ) ) )
            // InternalXemfs.g:9023:1: ( ( ruleEmfsName ) )
            {
            // InternalXemfs.g:9023:1: ( ( ruleEmfsName ) )
            // InternalXemfs.g:9024:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_2_1_0()); 
            }
            // InternalXemfs.g:9025:1: ( ruleEmfsName )
            // InternalXemfs.g:9026:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceEmfsNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceEmfsNameParserRuleCall_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_2_1_0()); 
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
    // $ANTLR end "rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1"


    // $ANTLR start "rule__XmlStringContents__ElementAssignment_1"
    // InternalXemfs.g:9037:1: rule__XmlStringContents__ElementAssignment_1 : ( ruleXmlElement ) ;
    public final void rule__XmlStringContents__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9041:1: ( ( ruleXmlElement ) )
            // InternalXemfs.g:9042:1: ( ruleXmlElement )
            {
            // InternalXemfs.g:9042:1: ( ruleXmlElement )
            // InternalXemfs.g:9043:1: ruleXmlElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlStringContentsAccess().getElementXmlElementParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXmlElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlStringContentsAccess().getElementXmlElementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__XmlStringContents__ElementAssignment_1"


    // $ANTLR start "rule__XmlPIElement__NameAssignment_1"
    // InternalXemfs.g:9052:1: rule__XmlPIElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XmlPIElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9056:1: ( ( RULE_ID ) )
            // InternalXemfs.g:9057:1: ( RULE_ID )
            {
            // InternalXemfs.g:9057:1: ( RULE_ID )
            // InternalXemfs.g:9058:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlPIElementAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlPIElementAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__XmlPIElement__NameAssignment_1"


    // $ANTLR start "rule__XmlPIElement__AttributesAssignment_2"
    // InternalXemfs.g:9067:1: rule__XmlPIElement__AttributesAssignment_2 : ( ruleXmlAttribute ) ;
    public final void rule__XmlPIElement__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9071:1: ( ( ruleXmlAttribute ) )
            // InternalXemfs.g:9072:1: ( ruleXmlAttribute )
            {
            // InternalXemfs.g:9072:1: ( ruleXmlAttribute )
            // InternalXemfs.g:9073:1: ruleXmlAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlPIElementAccess().getAttributesXmlAttributeParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXmlAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlPIElementAccess().getAttributesXmlAttributeParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__XmlPIElement__AttributesAssignment_2"


    // $ANTLR start "rule__XmlTagElement__StartTagAssignment_0"
    // InternalXemfs.g:9082:1: rule__XmlTagElement__StartTagAssignment_0 : ( ruleXmlTag ) ;
    public final void rule__XmlTagElement__StartTagAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9086:1: ( ( ruleXmlTag ) )
            // InternalXemfs.g:9087:1: ( ruleXmlTag )
            {
            // InternalXemfs.g:9087:1: ( ruleXmlTag )
            // InternalXemfs.g:9088:1: ruleXmlTag
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getStartTagXmlTagParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXmlTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getStartTagXmlTagParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__XmlTagElement__StartTagAssignment_0"


    // $ANTLR start "rule__XmlTagElement__PreAssignment_1_1_0"
    // InternalXemfs.g:9097:1: rule__XmlTagElement__PreAssignment_1_1_0 : ( RULE_XML_TEXT ) ;
    public final void rule__XmlTagElement__PreAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9101:1: ( ( RULE_XML_TEXT ) )
            // InternalXemfs.g:9102:1: ( RULE_XML_TEXT )
            {
            // InternalXemfs.g:9102:1: ( RULE_XML_TEXT )
            // InternalXemfs.g:9103:1: RULE_XML_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getPreXML_TEXTTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_XML_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getPreXML_TEXTTerminalRuleCall_1_1_0_0()); 
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
    // $ANTLR end "rule__XmlTagElement__PreAssignment_1_1_0"


    // $ANTLR start "rule__XmlTagElement__ContentsAssignment_1_1_1"
    // InternalXemfs.g:9112:1: rule__XmlTagElement__ContentsAssignment_1_1_1 : ( ruleXmlContents ) ;
    public final void rule__XmlTagElement__ContentsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9116:1: ( ( ruleXmlContents ) )
            // InternalXemfs.g:9117:1: ( ruleXmlContents )
            {
            // InternalXemfs.g:9117:1: ( ruleXmlContents )
            // InternalXemfs.g:9118:1: ruleXmlContents
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getContentsXmlContentsParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXmlContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getContentsXmlContentsParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__XmlTagElement__ContentsAssignment_1_1_1"


    // $ANTLR start "rule__XmlTagElement__EndTagAssignment_1_1_2_1"
    // InternalXemfs.g:9127:1: rule__XmlTagElement__EndTagAssignment_1_1_2_1 : ( ruleXmlTagName ) ;
    public final void rule__XmlTagElement__EndTagAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9131:1: ( ( ruleXmlTagName ) )
            // InternalXemfs.g:9132:1: ( ruleXmlTagName )
            {
            // InternalXemfs.g:9132:1: ( ruleXmlTagName )
            // InternalXemfs.g:9133:1: ruleXmlTagName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagElementAccess().getEndTagXmlTagNameParserRuleCall_1_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXmlTagName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagElementAccess().getEndTagXmlTagNameParserRuleCall_1_1_2_1_0()); 
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
    // $ANTLR end "rule__XmlTagElement__EndTagAssignment_1_1_2_1"


    // $ANTLR start "rule__XmlContents__ElementAssignment_0"
    // InternalXemfs.g:9142:1: rule__XmlContents__ElementAssignment_0 : ( ruleXmlElement ) ;
    public final void rule__XmlContents__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9146:1: ( ( ruleXmlElement ) )
            // InternalXemfs.g:9147:1: ( ruleXmlElement )
            {
            // InternalXemfs.g:9147:1: ( ruleXmlElement )
            // InternalXemfs.g:9148:1: ruleXmlElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlContentsAccess().getElementXmlElementParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXmlElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlContentsAccess().getElementXmlElementParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__XmlContents__ElementAssignment_0"


    // $ANTLR start "rule__XmlContents__PostAssignment_1"
    // InternalXemfs.g:9157:1: rule__XmlContents__PostAssignment_1 : ( RULE_XML_TEXT ) ;
    public final void rule__XmlContents__PostAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9161:1: ( ( RULE_XML_TEXT ) )
            // InternalXemfs.g:9162:1: ( RULE_XML_TEXT )
            {
            // InternalXemfs.g:9162:1: ( RULE_XML_TEXT )
            // InternalXemfs.g:9163:1: RULE_XML_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlContentsAccess().getPostXML_TEXTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_XML_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlContentsAccess().getPostXML_TEXTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__XmlContents__PostAssignment_1"


    // $ANTLR start "rule__XmlTag__NameAssignment_0"
    // InternalXemfs.g:9172:1: rule__XmlTag__NameAssignment_0 : ( ruleXmlTagName ) ;
    public final void rule__XmlTag__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9176:1: ( ( ruleXmlTagName ) )
            // InternalXemfs.g:9177:1: ( ruleXmlTagName )
            {
            // InternalXemfs.g:9177:1: ( ruleXmlTagName )
            // InternalXemfs.g:9178:1: ruleXmlTagName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagAccess().getNameXmlTagNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXmlTagName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagAccess().getNameXmlTagNameParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__XmlTag__NameAssignment_0"


    // $ANTLR start "rule__XmlTag__AttributesAssignment_1"
    // InternalXemfs.g:9187:1: rule__XmlTag__AttributesAssignment_1 : ( ruleXmlAttribute ) ;
    public final void rule__XmlTag__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9191:1: ( ( ruleXmlAttribute ) )
            // InternalXemfs.g:9192:1: ( ruleXmlAttribute )
            {
            // InternalXemfs.g:9192:1: ( ruleXmlAttribute )
            // InternalXemfs.g:9193:1: ruleXmlAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlTagAccess().getAttributesXmlAttributeParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXmlAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlTagAccess().getAttributesXmlAttributeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__XmlTag__AttributesAssignment_1"


    // $ANTLR start "rule__XmlAttribute__NameAssignment_0"
    // InternalXemfs.g:9202:1: rule__XmlAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__XmlAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9206:1: ( ( RULE_ID ) )
            // InternalXemfs.g:9207:1: ( RULE_ID )
            {
            // InternalXemfs.g:9207:1: ( RULE_ID )
            // InternalXemfs.g:9208:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__XmlAttribute__NameAssignment_0"


    // $ANTLR start "rule__XmlAttribute__ValueAssignment_1_1"
    // InternalXemfs.g:9217:1: rule__XmlAttribute__ValueAssignment_1_1 : ( ( rule__XmlAttribute__ValueAlternatives_1_1_0 ) ) ;
    public final void rule__XmlAttribute__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXemfs.g:9221:1: ( ( ( rule__XmlAttribute__ValueAlternatives_1_1_0 ) ) )
            // InternalXemfs.g:9222:1: ( ( rule__XmlAttribute__ValueAlternatives_1_1_0 ) )
            {
            // InternalXemfs.g:9222:1: ( ( rule__XmlAttribute__ValueAlternatives_1_1_0 ) )
            // InternalXemfs.g:9223:1: ( rule__XmlAttribute__ValueAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXmlAttributeAccess().getValueAlternatives_1_1_0()); 
            }
            // InternalXemfs.g:9224:1: ( rule__XmlAttribute__ValueAlternatives_1_1_0 )
            // InternalXemfs.g:9224:2: rule__XmlAttribute__ValueAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XmlAttribute__ValueAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXmlAttributeAccess().getValueAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__XmlAttribute__ValueAssignment_1_1"

    // $ANTLR start synpred36_InternalXemfs
    public final void synpred36_InternalXemfs_fragment() throws RecognitionException {   
        // InternalXemfs.g:1767:1: ( ( ( rule__GitContentRef__Group_2_0__0 ) ) )
        // InternalXemfs.g:1767:1: ( ( rule__GitContentRef__Group_2_0__0 ) )
        {
        // InternalXemfs.g:1767:1: ( ( rule__GitContentRef__Group_2_0__0 ) )
        // InternalXemfs.g:1768:1: ( rule__GitContentRef__Group_2_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGitContentRefAccess().getGroup_2_0()); 
        }
        // InternalXemfs.g:1769:1: ( rule__GitContentRef__Group_2_0__0 )
        // InternalXemfs.g:1769:2: rule__GitContentRef__Group_2_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GitContentRef__Group_2_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalXemfs

    // $ANTLR start synpred105_InternalXemfs
    public final void synpred105_InternalXemfs_fragment() throws RecognitionException {   
        // InternalXemfs.g:3019:2: ( rule__EmfsName__Group_1__0 )
        // InternalXemfs.g:3019:2: rule__EmfsName__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__EmfsName__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_InternalXemfs

    // $ANTLR start synpred112_InternalXemfs
    public final void synpred112_InternalXemfs_fragment() throws RecognitionException {   
        // InternalXemfs.g:3702:2: ( rule__EmfsContainer__ResourcesAssignment_4 )
        // InternalXemfs.g:3702:2: rule__EmfsContainer__ResourcesAssignment_4
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__EmfsContainer__ResourcesAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_InternalXemfs

    // $ANTLR start synpred113_InternalXemfs
    public final void synpred113_InternalXemfs_fragment() throws RecognitionException {   
        // InternalXemfs.g:3731:2: ( ';' )
        // InternalXemfs.g:3731:2: ';'
        {
        match(input,9,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_InternalXemfs

    // Delegated rules

    public final boolean synpred112_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalXemfs_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalXemfs_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_InternalXemfs_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_InternalXemfs_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\6\1\4\1\6\2\uffff\1\4";
    static final String dfa_3s = "\1\46\1\6\1\74\1\6\2\uffff\1\74";
    static final String dfa_4s = "\4\uffff\1\2\1\1\1\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\37\uffff\1\1",
            "\1\2",
            "\2\4\3\uffff\1\4\16\uffff\1\5\13\uffff\1\4\1\uffff\1\3\1\uffff\1\4\1\uffff\3\4\2\uffff\1\4\7\uffff\1\4\4\uffff\1\4",
            "\1\6",
            "",
            "",
            "\2\4\3\uffff\1\4\16\uffff\1\5\13\uffff\1\4\1\uffff\1\3\1\uffff\1\4\1\uffff\3\4\2\uffff\1\4\7\uffff\1\4\4\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1236:1: rule__EmfsResource__Alternatives : ( ( ruleEmfsContainer ) | ( ruleEmfsFile ) );";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\6\1\30\1\6\2\uffff\1\6\1\0\1\46\1\6\1\0\1\46";
    static final String dfa_9s = "\1\50\1\46\1\55\2\uffff\1\6\1\0\1\56\1\6\1\0\1\56";
    static final String dfa_10s = "\3\uffff\1\1\1\2\6\uffff";
    static final String dfa_11s = "\6\uffff\1\1\2\uffff\1\0\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\41\uffff\1\2",
            "\1\4\15\uffff\1\3",
            "\1\6\46\uffff\1\5",
            "",
            "",
            "\1\7",
            "\1\uffff",
            "\1\10\7\uffff\1\11",
            "\1\12",
            "\1\uffff",
            "\1\10\7\uffff\1\11"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1762:1: rule__GitContentRef__Alternatives_2 : ( ( ( rule__GitContentRef__Group_2_0__0 ) ) | ( ( rule__GitContentRef__OwnerAssignment_2_1 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_9 = input.LA(1);

                         
                        int index23_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalXemfs()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index23_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalXemfs()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index23_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\11\uffff";
    static final String dfa_14s = "\3\uffff\1\1\5\uffff";
    static final String dfa_15s = "\1\4\1\uffff\1\6\1\4\1\6\1\uffff\1\4\1\6\1\4";
    static final String dfa_16s = "\1\67\1\uffff\1\74\1\67\1\6\1\uffff\1\74\1\6\1\74";
    static final String dfa_17s = "\1\uffff\1\2\3\uffff\1\1\3\uffff";
    static final String dfa_18s = "\11\uffff}>";
    static final String[] dfa_19s = {
            "\2\1\3\uffff\1\1\36\uffff\1\2\1\uffff\3\1\2\uffff\1\1\7\uffff\1\1",
            "",
            "\1\3\46\uffff\1\1\16\uffff\1\1",
            "\3\1\2\uffff\1\1\34\uffff\1\4\1\uffff\1\1\1\5\1\uffff\2\1\12\uffff\1\1",
            "\1\6",
            "",
            "\2\1\3\uffff\1\1\16\uffff\1\1\13\uffff\1\1\1\uffff\1\7\1\uffff\1\1\1\5\3\1\2\uffff\1\1\7\uffff\1\1\4\uffff\1\1",
            "\1\10",
            "\2\1\3\uffff\1\1\16\uffff\1\1\13\uffff\1\1\1\uffff\1\7\1\uffff\1\1\1\5\3\1\2\uffff\1\1\7\uffff\1\1\4\uffff\1\1"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 4019:1: ( rule__EmfsFile__PropertiesAssignment_3 )*";
        }
    }
    static final String dfa_20s = "\16\uffff";
    static final String dfa_21s = "\2\uffff\1\5\5\uffff\2\5\2\uffff\1\5\1\uffff";
    static final String dfa_22s = "\2\6\1\11\2\6\2\uffff\1\6\2\11\1\46\1\6\1\11\1\46";
    static final String dfa_23s = "\1\50\1\6\1\57\1\55\1\6\2\uffff\1\6\2\57\1\56\1\6\1\57\1\56";
    static final String dfa_24s = "\5\uffff\1\2\1\1\7\uffff";
    static final String dfa_25s = "\16\uffff}>";
    static final String[] dfa_26s = {
            "\1\2\37\uffff\1\1\1\uffff\1\3",
            "\1\2",
            "\1\5\16\uffff\1\6\15\uffff\1\4\10\uffff\1\5",
            "\1\10\46\uffff\1\7",
            "\1\11",
            "",
            "",
            "\1\12",
            "\1\5\16\uffff\1\6\26\uffff\1\5",
            "\1\5\16\uffff\1\6\15\uffff\1\4\10\uffff\1\5",
            "\1\13\7\uffff\1\14",
            "\1\15",
            "\1\5\16\uffff\1\6\26\uffff\1\5",
            "\1\13\7\uffff\1\14"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 5703:1: ( rule__URL_PATH__Alternatives_1 )*";
        }
    }
    static final String dfa_27s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_28s = "\2\6\1\11\1\6\2\uffff\1\11";
    static final String dfa_29s = "\1\46\1\6\1\64\1\6\2\uffff\1\64";
    static final String dfa_30s = "\4\uffff\1\1\1\2\1\uffff";
    static final String[] dfa_31s = {
            "\1\2\37\uffff\1\1",
            "\1\2",
            "\1\5\16\uffff\1\4\6\uffff\4\5\3\uffff\1\3\15\uffff\1\5",
            "\1\6",
            "",
            "",
            "\1\5\16\uffff\1\4\6\uffff\4\5\3\uffff\1\3\15\uffff\1\5"
    };
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_1;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_5;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "()* loopback of 6372:1: ( ruleFolderName )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0080110000000032L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000FFC002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000013801000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004000000042L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000017000000240L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x10809D1000000230L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004000000003C10L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0048000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000030L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1000011000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1000200000000040L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080110000000030L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000040L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000040L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000FFC000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000014000000040L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000014000000042L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000001000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000780000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000780000002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004001000040L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020004000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000200L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000004000000050L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000040L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000001000080L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000001000040L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000042L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000FFC010L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0C00000004000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000000000000C002L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00000000003FC000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00000000003FC002L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x000000007EFFC000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x000000007EFFC002L});
    }


}