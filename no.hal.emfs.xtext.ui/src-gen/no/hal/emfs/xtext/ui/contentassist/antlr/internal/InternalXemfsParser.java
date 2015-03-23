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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_STRING_CONTENT", "RULE_ID", "RULE_WS", "';'", "'http'", "'https'", "'ftp'", "'file'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'source-folder'", "'output-folder'", "'library-jar'", "'class-container'", "'/'", "'emfs'", "'#'", "'extends'", "'.'", "','", "'$'", "'='", "'@'", "':'", "'{'", "'}'", "'//'", "'git'", "'dot.classpath'", "'('", "')'", "'dot.project'", "'*'"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING_CONTENT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
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


        public InternalXemfsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXemfsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXemfsParser.tokenNames; }
    public String getGrammarFileName() { return "../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g"; }


     
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:61:1: entryRuleEmfsRoot : ruleEmfsRoot EOF ;
    public final void entryRuleEmfsRoot() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:62:1: ( ruleEmfsRoot EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:63:1: ruleEmfsRoot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsRoot_in_entryRuleEmfsRoot67);
            ruleEmfsRoot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsRoot74); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:70:1: ruleEmfsRoot : ( ( rule__EmfsRoot__Group__0 ) ) ;
    public final void ruleEmfsRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:74:2: ( ( ( rule__EmfsRoot__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:75:1: ( ( rule__EmfsRoot__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:75:1: ( ( rule__EmfsRoot__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:76:1: ( rule__EmfsRoot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:77:1: ( rule__EmfsRoot__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:77:2: rule__EmfsRoot__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__0_in_ruleEmfsRoot100);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:89:1: entryRuleEmfsName : ruleEmfsName EOF ;
    public final void entryRuleEmfsName() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:90:1: ( ruleEmfsName EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:91:1: ruleEmfsName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_entryRuleEmfsName127);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsName134); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:98:1: ruleEmfsName : ( ( rule__EmfsName__Group__0 ) ) ;
    public final void ruleEmfsName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:102:2: ( ( ( rule__EmfsName__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:103:1: ( ( rule__EmfsName__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:103:1: ( ( rule__EmfsName__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:104:1: ( rule__EmfsName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:105:1: ( rule__EmfsName__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:105:2: rule__EmfsName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group__0_in_ruleEmfsName160);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:117:1: entryRuleEmfsResourcesRef : ruleEmfsResourcesRef EOF ;
    public final void entryRuleEmfsResourcesRef() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:118:1: ( ruleEmfsResourcesRef EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:119:1: ruleEmfsResourcesRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_entryRuleEmfsResourcesRef187);
            ruleEmfsResourcesRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourcesRefRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsResourcesRef194); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:126:1: ruleEmfsResourcesRef : ( ( rule__EmfsResourcesRef__Group__0 ) ) ;
    public final void ruleEmfsResourcesRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:130:2: ( ( ( rule__EmfsResourcesRef__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:131:1: ( ( rule__EmfsResourcesRef__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:131:1: ( ( rule__EmfsResourcesRef__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:132:1: ( rule__EmfsResourcesRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:133:1: ( rule__EmfsResourcesRef__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:133:2: rule__EmfsResourcesRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group__0_in_ruleEmfsResourcesRef220);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:145:1: entryRuleResourceName : ruleResourceName EOF ;
    public final void entryRuleResourceName() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:146:1: ( ruleResourceName EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:147:1: ruleResourceName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleResourceName_in_entryRuleResourceName247);
            ruleResourceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResourceNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceName254); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:154:1: ruleResourceName : ( ( rule__ResourceName__Group__0 ) ) ;
    public final void ruleResourceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:158:2: ( ( ( rule__ResourceName__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:159:1: ( ( rule__ResourceName__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:159:1: ( ( rule__ResourceName__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:160:1: ( rule__ResourceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:161:1: ( rule__ResourceName__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:161:2: rule__ResourceName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceName__Group__0_in_ruleResourceName280);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:173:1: entryRuleEmfsResource : ruleEmfsResource EOF ;
    public final void entryRuleEmfsResource() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:174:1: ( ruleEmfsResource EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:175:1: ruleEmfsResource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_entryRuleEmfsResource307);
            ruleEmfsResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsResourceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsResource314); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:182:1: ruleEmfsResource : ( ( rule__EmfsResource__Alternatives ) ) ;
    public final void ruleEmfsResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:186:2: ( ( ( rule__EmfsResource__Alternatives ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:187:1: ( ( rule__EmfsResource__Alternatives ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:187:1: ( ( rule__EmfsResource__Alternatives ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:188:1: ( rule__EmfsResource__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourceAccess().getAlternatives()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:189:1: ( rule__EmfsResource__Alternatives )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:189:2: rule__EmfsResource__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResource__Alternatives_in_ruleEmfsResource340);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:201:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:202:1: ( ruleProperty EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:203:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty367);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty374); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:210:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:214:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:215:1: ( ( rule__Property__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:215:1: ( ( rule__Property__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:216:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:217:1: ( rule__Property__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:217:2: rule__Property__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0_in_ruleProperty400);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:229:1: entryRuleFolderName : ruleFolderName EOF ;
    public final void entryRuleFolderName() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:230:1: ( ruleFolderName EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:231:1: ruleFolderName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFolderNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_entryRuleFolderName427);
            ruleFolderName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFolderNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFolderName434); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:238:1: ruleFolderName : ( ( rule__FolderName__Group__0 ) ) ;
    public final void ruleFolderName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:242:2: ( ( ( rule__FolderName__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:243:1: ( ( rule__FolderName__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:243:1: ( ( rule__FolderName__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:244:1: ( rule__FolderName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFolderNameAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:245:1: ( rule__FolderName__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:245:2: rule__FolderName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FolderName__Group__0_in_ruleFolderName460);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:257:1: entryRuleEmfsContainer : ruleEmfsContainer EOF ;
    public final void entryRuleEmfsContainer() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:258:1: ( ruleEmfsContainer EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:259:1: ruleEmfsContainer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsContainer_in_entryRuleEmfsContainer487);
            ruleEmfsContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsContainerRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsContainer494); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:266:1: ruleEmfsContainer : ( ( rule__EmfsContainer__Group__0 ) ) ;
    public final void ruleEmfsContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:270:2: ( ( ( rule__EmfsContainer__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:271:1: ( ( rule__EmfsContainer__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:271:1: ( ( rule__EmfsContainer__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:272:1: ( rule__EmfsContainer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:273:1: ( rule__EmfsContainer__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:273:2: rule__EmfsContainer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__0_in_ruleEmfsContainer520);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:285:1: entryRuleGitContentProvider : ruleGitContentProvider EOF ;
    public final void entryRuleGitContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:286:1: ( ruleGitContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:287:1: ruleGitContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_entryRuleGitContentProvider547);
            ruleGitContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitContentProvider554); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:294:1: ruleGitContentProvider : ( ( rule__GitContentProvider__GitRefAssignment ) ) ;
    public final void ruleGitContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:298:2: ( ( ( rule__GitContentProvider__GitRefAssignment ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:299:1: ( ( rule__GitContentProvider__GitRefAssignment ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:299:1: ( ( rule__GitContentProvider__GitRefAssignment ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:300:1: ( rule__GitContentProvider__GitRefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentProviderAccess().getGitRefAssignment()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:301:1: ( rule__GitContentProvider__GitRefAssignment )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:301:2: rule__GitContentProvider__GitRefAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentProvider__GitRefAssignment_in_ruleGitContentProvider580);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:313:1: entryRuleFileName : ruleFileName EOF ;
    public final void entryRuleFileName() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:314:1: ( ruleFileName EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:315:1: ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_entryRuleFileName607);
            ruleFileName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFileName614); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:322:1: ruleFileName : ( ruleResourceName ) ;
    public final void ruleFileName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:326:2: ( ( ruleResourceName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:327:1: ( ruleResourceName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:327:1: ( ruleResourceName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:328:1: ruleResourceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileNameAccess().getResourceNameParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleResourceName_in_ruleFileName640);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:341:1: entryRuleEmfsFile : ruleEmfsFile EOF ;
    public final void entryRuleEmfsFile() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:342:1: ( ruleEmfsFile EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:343:1: ruleEmfsFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsFile_in_entryRuleEmfsFile666);
            ruleEmfsFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsFileRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsFile673); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:350:1: ruleEmfsFile : ( ( rule__EmfsFile__Group__0 ) ) ;
    public final void ruleEmfsFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:354:2: ( ( ( rule__EmfsFile__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:355:1: ( ( rule__EmfsFile__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:355:1: ( ( rule__EmfsFile__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:356:1: ( rule__EmfsFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:357:1: ( rule__EmfsFile__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:357:2: rule__EmfsFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__0_in_ruleEmfsFile699);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:369:1: entryRuleStringContentProvider : ruleStringContentProvider EOF ;
    public final void entryRuleStringContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:370:1: ( ruleStringContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:371:1: ruleStringContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringContentProvider_in_entryRuleStringContentProvider726);
            ruleStringContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringContentProvider733); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:378:1: ruleStringContentProvider : ( ( ( rule__StringContentProvider__StringContentsAssignment ) ) ( ( rule__StringContentProvider__StringContentsAssignment )* ) ) ;
    public final void ruleStringContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:382:2: ( ( ( ( rule__StringContentProvider__StringContentsAssignment ) ) ( ( rule__StringContentProvider__StringContentsAssignment )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:383:1: ( ( ( rule__StringContentProvider__StringContentsAssignment ) ) ( ( rule__StringContentProvider__StringContentsAssignment )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:383:1: ( ( ( rule__StringContentProvider__StringContentsAssignment ) ) ( ( rule__StringContentProvider__StringContentsAssignment )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:384:1: ( ( rule__StringContentProvider__StringContentsAssignment ) ) ( ( rule__StringContentProvider__StringContentsAssignment )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:384:1: ( ( rule__StringContentProvider__StringContentsAssignment ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:385:1: ( rule__StringContentProvider__StringContentsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringContentProviderAccess().getStringContentsAssignment()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:386:1: ( rule__StringContentProvider__StringContentsAssignment )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:386:2: rule__StringContentProvider__StringContentsAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringContentProvider__StringContentsAssignment_in_ruleStringContentProvider761);
            rule__StringContentProvider__StringContentsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringContentProviderAccess().getStringContentsAssignment()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:389:1: ( ( rule__StringContentProvider__StringContentsAssignment )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:390:1: ( rule__StringContentProvider__StringContentsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringContentProviderAccess().getStringContentsAssignment()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:391:1: ( rule__StringContentProvider__StringContentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_STRING_CONTENT)||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:391:2: rule__StringContentProvider__StringContentsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StringContentProvider__StringContentsAssignment_in_ruleStringContentProvider773);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:404:1: entryRuleAbstractStringContents : ruleAbstractStringContents EOF ;
    public final void entryRuleAbstractStringContents() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:405:1: ( ruleAbstractStringContents EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:406:1: ruleAbstractStringContents EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_entryRuleAbstractStringContents803);
            ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractStringContentsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractStringContents810); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:413:1: ruleAbstractStringContents : ( ( rule__AbstractStringContents__Alternatives ) ) ;
    public final void ruleAbstractStringContents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:417:2: ( ( ( rule__AbstractStringContents__Alternatives ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:418:1: ( ( rule__AbstractStringContents__Alternatives ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:418:1: ( ( rule__AbstractStringContents__Alternatives ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:419:1: ( rule__AbstractStringContents__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractStringContentsAccess().getAlternatives()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:420:1: ( rule__AbstractStringContents__Alternatives )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:420:2: rule__AbstractStringContents__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AbstractStringContents__Alternatives_in_ruleAbstractStringContents836);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:432:1: entryRuleVerbatimStringContents : ruleVerbatimStringContents EOF ;
    public final void entryRuleVerbatimStringContents() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:433:1: ( ruleVerbatimStringContents EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:434:1: ruleVerbatimStringContents EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVerbatimStringContents_in_entryRuleVerbatimStringContents863);
            ruleVerbatimStringContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVerbatimStringContents870); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:441:1: ruleVerbatimStringContents : ( ( rule__VerbatimStringContents__StringContentAssignment ) ) ;
    public final void ruleVerbatimStringContents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:445:2: ( ( ( rule__VerbatimStringContents__StringContentAssignment ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:446:1: ( ( rule__VerbatimStringContents__StringContentAssignment ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:446:1: ( ( rule__VerbatimStringContents__StringContentAssignment ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:447:1: ( rule__VerbatimStringContents__StringContentAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getStringContentAssignment()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:448:1: ( rule__VerbatimStringContents__StringContentAssignment )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:448:2: rule__VerbatimStringContents__StringContentAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VerbatimStringContents__StringContentAssignment_in_ruleVerbatimStringContents896);
            rule__VerbatimStringContents__StringContentAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getStringContentAssignment()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:460:1: entryRulePropertyValueString : rulePropertyValueString EOF ;
    public final void entryRulePropertyValueString() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:461:1: ( rulePropertyValueString EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:462:1: rulePropertyValueString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyValueString_in_entryRulePropertyValueString923);
            rulePropertyValueString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyValueString930); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:469:1: rulePropertyValueString : ( ( rule__PropertyValueString__Group__0 ) ) ;
    public final void rulePropertyValueString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:473:2: ( ( ( rule__PropertyValueString__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:474:1: ( ( rule__PropertyValueString__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:474:1: ( ( rule__PropertyValueString__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:475:1: ( rule__PropertyValueString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:476:1: ( rule__PropertyValueString__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:476:2: rule__PropertyValueString__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__0_in_rulePropertyValueString956);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:488:1: entryRuleWrappingStringContentProvider : ruleWrappingStringContentProvider EOF ;
    public final void entryRuleWrappingStringContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:489:1: ( ruleWrappingStringContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:490:1: ruleWrappingStringContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWrappingStringContentProvider_in_entryRuleWrappingStringContentProvider983);
            ruleWrappingStringContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWrappingStringContentProvider990); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:497:1: ruleWrappingStringContentProvider : ( ( rule__WrappingStringContentProvider__Group__0 ) ) ;
    public final void ruleWrappingStringContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:501:2: ( ( ( rule__WrappingStringContentProvider__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:502:1: ( ( rule__WrappingStringContentProvider__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:502:1: ( ( rule__WrappingStringContentProvider__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:503:1: ( rule__WrappingStringContentProvider__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:504:1: ( rule__WrappingStringContentProvider__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:504:2: rule__WrappingStringContentProvider__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__0_in_ruleWrappingStringContentProvider1016);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:516:1: entryRulePROPERTY_REF : rulePROPERTY_REF EOF ;
    public final void entryRulePROPERTY_REF() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:517:1: ( rulePROPERTY_REF EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:518:1: rulePROPERTY_REF EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_entryRulePROPERTY_REF1043);
            rulePROPERTY_REF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPROPERTY_REFRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePROPERTY_REF1050); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:525:1: rulePROPERTY_REF : ( ( rule__PROPERTY_REF__Group__0 ) ) ;
    public final void rulePROPERTY_REF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:529:2: ( ( ( rule__PROPERTY_REF__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:530:1: ( ( rule__PROPERTY_REF__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:530:1: ( ( rule__PROPERTY_REF__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:531:1: ( rule__PROPERTY_REF__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:532:1: ( rule__PROPERTY_REF__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:532:2: rule__PROPERTY_REF__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Group__0_in_rulePROPERTY_REF1076);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:544:1: entryRuleURL_SCHEME : ruleURL_SCHEME EOF ;
    public final void entryRuleURL_SCHEME() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:545:1: ( ruleURL_SCHEME EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:546:1: ruleURL_SCHEME EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_SCHEMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_SCHEME_in_entryRuleURL_SCHEME1103);
            ruleURL_SCHEME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_SCHEMERule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_SCHEME1110); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:553:1: ruleURL_SCHEME : ( ( rule__URL_SCHEME__Alternatives ) ) ;
    public final void ruleURL_SCHEME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:557:2: ( ( ( rule__URL_SCHEME__Alternatives ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:558:1: ( ( rule__URL_SCHEME__Alternatives ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:558:1: ( ( rule__URL_SCHEME__Alternatives ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:559:1: ( rule__URL_SCHEME__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_SCHEMEAccess().getAlternatives()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:560:1: ( rule__URL_SCHEME__Alternatives )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:560:2: rule__URL_SCHEME__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_SCHEME__Alternatives_in_ruleURL_SCHEME1136);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:572:1: entryRuleURL_HOST_NAME : ruleURL_HOST_NAME EOF ;
    public final void entryRuleURL_HOST_NAME() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:573:1: ( ruleURL_HOST_NAME EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:574:1: ruleURL_HOST_NAME EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_NAME_in_entryRuleURL_HOST_NAME1163);
            ruleURL_HOST_NAME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOST_NAMERule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_HOST_NAME1170); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:581:1: ruleURL_HOST_NAME : ( ( rule__URL_HOST_NAME__Group__0 ) ) ;
    public final void ruleURL_HOST_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:585:2: ( ( ( rule__URL_HOST_NAME__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:586:1: ( ( rule__URL_HOST_NAME__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:586:1: ( ( rule__URL_HOST_NAME__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:587:1: ( rule__URL_HOST_NAME__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:588:1: ( rule__URL_HOST_NAME__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:588:2: rule__URL_HOST_NAME__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST_NAME__Group__0_in_ruleURL_HOST_NAME1196);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:600:1: entryRuleURL_HOST : ruleURL_HOST EOF ;
    public final void entryRuleURL_HOST() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:601:1: ( ruleURL_HOST EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:602:1: ruleURL_HOST EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_in_entryRuleURL_HOST1223);
            ruleURL_HOST();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_HOST1230); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:609:1: ruleURL_HOST : ( ( rule__URL_HOST__Group__0 ) ) ;
    public final void ruleURL_HOST() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:613:2: ( ( ( rule__URL_HOST__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:614:1: ( ( rule__URL_HOST__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:614:1: ( ( rule__URL_HOST__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:615:1: ( rule__URL_HOST__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:616:1: ( rule__URL_HOST__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:616:2: rule__URL_HOST__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__0_in_ruleURL_HOST1256);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:628:1: entryRuleURL_PATH : ruleURL_PATH EOF ;
    public final void entryRuleURL_PATH() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:629:1: ( ruleURL_PATH EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:630:1: ruleURL_PATH EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_entryRuleURL_PATH1283);
            ruleURL_PATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_PATH1290); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:637:1: ruleURL_PATH : ( ( rule__URL_PATH__Group__0 ) ) ;
    public final void ruleURL_PATH() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:641:2: ( ( ( rule__URL_PATH__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:642:1: ( ( rule__URL_PATH__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:642:1: ( ( rule__URL_PATH__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:643:1: ( rule__URL_PATH__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:644:1: ( rule__URL_PATH__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:644:2: rule__URL_PATH__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__0_in_ruleURL_PATH1316);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:656:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:657:1: ( ruleURL EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:658:1: ruleURL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_in_entryRuleURL1343);
            ruleURL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL1350); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:665:1: ruleURL : ( ( rule__URL__Group__0 ) ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:669:2: ( ( ( rule__URL__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:670:1: ( ( rule__URL__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:670:1: ( ( rule__URL__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:671:1: ( rule__URL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:672:1: ( rule__URL__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:672:2: rule__URL__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__0_in_ruleURL1376);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:684:1: entryRuleURLContentProvider : ruleURLContentProvider EOF ;
    public final void entryRuleURLContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:685:1: ( ruleURLContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:686:1: ruleURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_entryRuleURLContentProvider1403);
            ruleURLContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURLContentProvider1410); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:693:1: ruleURLContentProvider : ( ( rule__URLContentProvider__UrlStringAssignment ) ) ;
    public final void ruleURLContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:697:2: ( ( ( rule__URLContentProvider__UrlStringAssignment ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:698:1: ( ( rule__URLContentProvider__UrlStringAssignment ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:698:1: ( ( rule__URLContentProvider__UrlStringAssignment ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:699:1: ( rule__URLContentProvider__UrlStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLContentProviderAccess().getUrlStringAssignment()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:700:1: ( rule__URLContentProvider__UrlStringAssignment )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:700:2: rule__URLContentProvider__UrlStringAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__URLContentProvider__UrlStringAssignment_in_ruleURLContentProvider1436);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:712:1: entryRuleGitURLContentProvider : ruleGitURLContentProvider EOF ;
    public final void entryRuleGitURLContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:713:1: ( ruleGitURLContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:714:1: ruleGitURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_entryRuleGitURLContentProvider1463);
            ruleGitURLContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitURLContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitURLContentProvider1470); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:721:1: ruleGitURLContentProvider : ( ( rule__GitURLContentProvider__GitRefAssignment ) ) ;
    public final void ruleGitURLContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:725:2: ( ( ( rule__GitURLContentProvider__GitRefAssignment ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:726:1: ( ( rule__GitURLContentProvider__GitRefAssignment ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:726:1: ( ( rule__GitURLContentProvider__GitRefAssignment ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:727:1: ( rule__GitURLContentProvider__GitRefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitURLContentProviderAccess().getGitRefAssignment()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:728:1: ( rule__GitURLContentProvider__GitRefAssignment )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:728:2: rule__GitURLContentProvider__GitRefAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitURLContentProvider__GitRefAssignment_in_ruleGitURLContentProvider1496);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:740:1: entryRuleGitContentRef : ruleGitContentRef EOF ;
    public final void entryRuleGitContentRef() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:741:1: ( ruleGitContentRef EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:742:1: ruleGitContentRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_entryRuleGitContentRef1523);
            ruleGitContentRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitContentRef1530); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:749:1: ruleGitContentRef : ( ( rule__GitContentRef__Group__0 ) ) ;
    public final void ruleGitContentRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:753:2: ( ( ( rule__GitContentRef__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:754:1: ( ( rule__GitContentRef__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:754:1: ( ( rule__GitContentRef__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:755:1: ( rule__GitContentRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:756:1: ( rule__GitContentRef__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:756:2: rule__GitContentRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__0_in_ruleGitContentRef1556);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:768:1: entryRuleDotClasspathFileContentProvider : ruleDotClasspathFileContentProvider EOF ;
    public final void entryRuleDotClasspathFileContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:769:1: ( ruleDotClasspathFileContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:770:1: ruleDotClasspathFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDotClasspathFileContentProvider_in_entryRuleDotClasspathFileContentProvider1583);
            ruleDotClasspathFileContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotClasspathFileContentProvider1590); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:777:1: ruleDotClasspathFileContentProvider : ( ( rule__DotClasspathFileContentProvider__Group__0 ) ) ;
    public final void ruleDotClasspathFileContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:781:2: ( ( ( rule__DotClasspathFileContentProvider__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:782:1: ( ( rule__DotClasspathFileContentProvider__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:782:1: ( ( rule__DotClasspathFileContentProvider__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:783:1: ( rule__DotClasspathFileContentProvider__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:784:1: ( rule__DotClasspathFileContentProvider__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:784:2: rule__DotClasspathFileContentProvider__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__0_in_ruleDotClasspathFileContentProvider1616);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:796:1: entryRuleAbstractClasspathEntry : ruleAbstractClasspathEntry EOF ;
    public final void entryRuleAbstractClasspathEntry() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:797:1: ( ruleAbstractClasspathEntry EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:798:1: ruleAbstractClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractClasspathEntry_in_entryRuleAbstractClasspathEntry1643);
            ruleAbstractClasspathEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractClasspathEntryRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractClasspathEntry1650); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:805:1: ruleAbstractClasspathEntry : ( ruleClasspathEntry ) ;
    public final void ruleAbstractClasspathEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:809:2: ( ( ruleClasspathEntry ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:810:1: ( ruleClasspathEntry )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:810:1: ( ruleClasspathEntry )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:811:1: ruleClasspathEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractClasspathEntryAccess().getClasspathEntryParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntry_in_ruleAbstractClasspathEntry1676);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:824:1: entryRuleCLASSPATH_ENTRY_PATH : ruleCLASSPATH_ENTRY_PATH EOF ;
    public final void entryRuleCLASSPATH_ENTRY_PATH() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:825:1: ( ruleCLASSPATH_ENTRY_PATH EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:826:1: ruleCLASSPATH_ENTRY_PATH EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_entryRuleCLASSPATH_ENTRY_PATH1702);
            ruleCLASSPATH_ENTRY_PATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLASSPATH_ENTRY_PATHRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCLASSPATH_ENTRY_PATH1709); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:833:1: ruleCLASSPATH_ENTRY_PATH : ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) ) ;
    public final void ruleCLASSPATH_ENTRY_PATH() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:837:2: ( ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:838:1: ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:838:1: ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:839:1: ( rule__CLASSPATH_ENTRY_PATH__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:840:1: ( rule__CLASSPATH_ENTRY_PATH__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:840:2: rule__CLASSPATH_ENTRY_PATH__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__0_in_ruleCLASSPATH_ENTRY_PATH1735);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:852:1: entryRuleClasspathEntry : ruleClasspathEntry EOF ;
    public final void entryRuleClasspathEntry() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:853:1: ( ruleClasspathEntry EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:854:1: ruleClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntry_in_entryRuleClasspathEntry1762);
            ruleClasspathEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClasspathEntry1769); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:861:1: ruleClasspathEntry : ( ( rule__ClasspathEntry__Group__0 ) ) ;
    public final void ruleClasspathEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:865:2: ( ( ( rule__ClasspathEntry__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:866:1: ( ( rule__ClasspathEntry__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:866:1: ( ( rule__ClasspathEntry__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:867:1: ( rule__ClasspathEntry__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:868:1: ( rule__ClasspathEntry__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:868:2: rule__ClasspathEntry__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__0_in_ruleClasspathEntry1795);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:880:1: entryRuleVERSION : ruleVERSION EOF ;
    public final void entryRuleVERSION() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:881:1: ( ruleVERSION EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:882:1: ruleVERSION EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVERSIONRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_entryRuleVERSION1822);
            ruleVERSION();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVERSIONRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVERSION1829); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:889:1: ruleVERSION : ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) ) ;
    public final void ruleVERSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:893:2: ( ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:894:1: ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:894:1: ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:895:1: ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:895:1: ( ( rule__VERSION__Alternatives ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:896:1: ( rule__VERSION__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVERSIONAccess().getAlternatives()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:897:1: ( rule__VERSION__Alternatives )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:897:2: rule__VERSION__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__VERSION__Alternatives_in_ruleVERSION1857);
            rule__VERSION__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVERSIONAccess().getAlternatives()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:900:1: ( ( rule__VERSION__Alternatives )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:901:1: ( rule__VERSION__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVERSIONAccess().getAlternatives()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:902:1: ( rule__VERSION__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:902:2: rule__VERSION__Alternatives
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VERSION__Alternatives_in_ruleVERSION1869);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:915:1: entryRuleDotProjectFileContentProvider : ruleDotProjectFileContentProvider EOF ;
    public final void entryRuleDotProjectFileContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:916:1: ( ruleDotProjectFileContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:917:1: ruleDotProjectFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDotProjectFileContentProvider_in_entryRuleDotProjectFileContentProvider1899);
            ruleDotProjectFileContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotProjectFileContentProvider1906); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:924:1: ruleDotProjectFileContentProvider : ( ( rule__DotProjectFileContentProvider__Group__0 ) ) ;
    public final void ruleDotProjectFileContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:928:2: ( ( ( rule__DotProjectFileContentProvider__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:929:1: ( ( rule__DotProjectFileContentProvider__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:929:1: ( ( rule__DotProjectFileContentProvider__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:930:1: ( rule__DotProjectFileContentProvider__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:931:1: ( rule__DotProjectFileContentProvider__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:931:2: rule__DotProjectFileContentProvider__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__0_in_ruleDotProjectFileContentProvider1932);
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


    // $ANTLR start "ruleClasspathEntryKind"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:944:1: ruleClasspathEntryKind : ( ( rule__ClasspathEntryKind__Alternatives ) ) ;
    public final void ruleClasspathEntryKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:948:1: ( ( ( rule__ClasspathEntryKind__Alternatives ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:949:1: ( ( rule__ClasspathEntryKind__Alternatives ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:949:1: ( ( rule__ClasspathEntryKind__Alternatives ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:950:1: ( rule__ClasspathEntryKind__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryKindAccess().getAlternatives()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:951:1: ( rule__ClasspathEntryKind__Alternatives )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:951:2: rule__ClasspathEntryKind__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntryKind__Alternatives_in_ruleClasspathEntryKind1969);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:962:1: rule__EmfsRoot__ContentProviderAlternatives_4_1_0 : ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) );
    public final void rule__EmfsRoot__ContentProviderAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:966:1: ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:967:1: ( ruleGitContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:967:1: ( ruleGitContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:968:1: ruleGitContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsRootAccess().getContentProviderGitContentProviderParserRuleCall_4_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_rule__EmfsRoot__ContentProviderAlternatives_4_1_02004);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:973:6: ( ruleEmfsResourcesRef )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:973:6: ( ruleEmfsResourcesRef )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:974:1: ruleEmfsResourcesRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsRootAccess().getContentProviderEmfsResourcesRefParserRuleCall_4_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_rule__EmfsRoot__ContentProviderAlternatives_4_1_02021);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:984:1: rule__EmfsResource__Alternatives : ( ( ruleEmfsContainer ) | ( ruleEmfsFile ) );
    public final void rule__EmfsResource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:988:1: ( ( ruleEmfsContainer ) | ( ruleEmfsFile ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:989:1: ( ruleEmfsContainer )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:989:1: ( ruleEmfsContainer )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:990:1: ruleEmfsContainer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsResourceAccess().getEmfsContainerParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsContainer_in_rule__EmfsResource__Alternatives2053);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:995:6: ( ruleEmfsFile )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:995:6: ( ruleEmfsFile )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:996:1: ruleEmfsFile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsResourceAccess().getEmfsFileParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsFile_in_rule__EmfsResource__Alternatives2070);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1006:1: rule__Property__ValueAlternatives_3_0 : ( ( RULE_STRING ) | ( ruleEmfsName ) );
    public final void rule__Property__ValueAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1010:1: ( ( RULE_STRING ) | ( ruleEmfsName ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1011:1: ( RULE_STRING )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1011:1: ( RULE_STRING )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1012:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Property__ValueAlternatives_3_02102); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1017:6: ( ruleEmfsName )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1017:6: ( ruleEmfsName )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1018:1: ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getValueEmfsNameParserRuleCall_3_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__Property__ValueAlternatives_3_02119);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1028:1: rule__EmfsContainer__ContentProviderAlternatives_3_1_0 : ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) );
    public final void rule__EmfsContainer__ContentProviderAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1032:1: ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==40) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1033:1: ( ruleGitContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1033:1: ( ruleGitContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1034:1: ruleGitContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsContainerAccess().getContentProviderGitContentProviderParserRuleCall_3_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_rule__EmfsContainer__ContentProviderAlternatives_3_1_02151);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1039:6: ( ruleEmfsResourcesRef )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1039:6: ( ruleEmfsResourcesRef )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1040:1: ruleEmfsResourcesRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsContainerAccess().getContentProviderEmfsResourcesRefParserRuleCall_3_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_rule__EmfsContainer__ContentProviderAlternatives_3_1_02168);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1050:1: rule__EmfsFile__Alternatives_4 : ( ( ( rule__EmfsFile__Group_4_0__0 ) ) | ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) ) | ( ( rule__EmfsFile__Group_4_2__0 ) ) | ( ';' ) );
    public final void rule__EmfsFile__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1054:1: ( ( ( rule__EmfsFile__Group_4_0__0 ) ) | ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) ) | ( ( rule__EmfsFile__Group_4_2__0 ) ) | ( ';' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
            case RULE_STRING_CONTENT:
            case 33:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            case 8:
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1055:1: ( ( rule__EmfsFile__Group_4_0__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1055:1: ( ( rule__EmfsFile__Group_4_0__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1056:1: ( rule__EmfsFile__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getGroup_4_0()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1057:1: ( rule__EmfsFile__Group_4_0__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1057:2: rule__EmfsFile__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__0_in_rule__EmfsFile__Alternatives_42200);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1061:6: ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1061:6: ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1062:1: ( rule__EmfsFile__ContentProviderAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_1()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1063:1: ( rule__EmfsFile__ContentProviderAssignment_4_1 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1063:2: rule__EmfsFile__ContentProviderAssignment_4_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_1_in_rule__EmfsFile__Alternatives_42218);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1067:6: ( ( rule__EmfsFile__Group_4_2__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1067:6: ( ( rule__EmfsFile__Group_4_2__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1068:1: ( rule__EmfsFile__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getGroup_4_2()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1069:1: ( rule__EmfsFile__Group_4_2__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1069:2: rule__EmfsFile__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_2__0_in_rule__EmfsFile__Alternatives_42236);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1073:6: ( ';' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1073:6: ( ';' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1074:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_3()); 
                    }
                    match(input,8,FollowSets000.FOLLOW_8_in_rule__EmfsFile__Alternatives_42255); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1086:1: rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 : ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) );
    public final void rule__EmfsFile__ContentProviderAlternatives_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1090:1: ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING||(LA8_0>=9 && LA8_0<=12)) ) {
                alt8=1;
            }
            else if ( (LA8_0==40) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1091:1: ( ruleURLContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1091:1: ( ruleURLContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1092:1: ruleURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderURLContentProviderParserRuleCall_4_0_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_0_1_02289);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1097:6: ( ruleGitURLContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1097:6: ( ruleGitURLContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1098:1: ruleGitURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderGitURLContentProviderParserRuleCall_4_0_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_0_1_02306);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1108:1: rule__EmfsFile__ContentProviderAlternatives_4_1_0 : ( ( ruleStringContentProvider ) | ( ruleWrappingStringContentProvider ) );
    public final void rule__EmfsFile__ContentProviderAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1112:1: ( ( ruleStringContentProvider ) | ( ruleWrappingStringContentProvider ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1113:1: ( ruleStringContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1113:1: ( ruleStringContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1114:1: ruleStringContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderStringContentProviderParserRuleCall_4_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_1_02338);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1119:6: ( ruleWrappingStringContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1119:6: ( ruleWrappingStringContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1120:1: ruleWrappingStringContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderWrappingStringContentProviderParserRuleCall_4_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleWrappingStringContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_1_02355);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1130:1: rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 : ( ( ruleDotClasspathFileContentProvider ) | ( ruleDotProjectFileContentProvider ) );
    public final void rule__EmfsFile__ContentProviderAlternatives_4_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1134:1: ( ( ruleDotClasspathFileContentProvider ) | ( ruleDotProjectFileContentProvider ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            else if ( (LA10_0==44) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1135:1: ( ruleDotClasspathFileContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1135:1: ( ruleDotClasspathFileContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1136:1: ruleDotClasspathFileContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderDotClasspathFileContentProviderParserRuleCall_4_2_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDotClasspathFileContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_2_1_02387);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1141:6: ( ruleDotProjectFileContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1141:6: ( ruleDotProjectFileContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1142:1: ruleDotProjectFileContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderDotProjectFileContentProviderParserRuleCall_4_2_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDotProjectFileContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_2_1_02404);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1152:1: rule__AbstractStringContents__Alternatives : ( ( rulePropertyValueString ) | ( ruleVerbatimStringContents ) );
    public final void rule__AbstractStringContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1156:1: ( ( rulePropertyValueString ) | ( ruleVerbatimStringContents ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_STRING_CONTENT)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1157:1: ( rulePropertyValueString )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1157:1: ( rulePropertyValueString )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1158:1: rulePropertyValueString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractStringContentsAccess().getPropertyValueStringParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyValueString_in_rule__AbstractStringContents__Alternatives2436);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1163:6: ( ruleVerbatimStringContents )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1163:6: ( ruleVerbatimStringContents )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1164:1: ruleVerbatimStringContents
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractStringContentsAccess().getVerbatimStringContentsParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVerbatimStringContents_in_rule__AbstractStringContents__Alternatives2453);
                    ruleVerbatimStringContents();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractStringContentsAccess().getVerbatimStringContentsParserRuleCall_1()); 
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


    // $ANTLR start "rule__VerbatimStringContents__StringContentAlternatives_0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1174:1: rule__VerbatimStringContents__StringContentAlternatives_0 : ( ( RULE_STRING ) | ( RULE_STRING_CONTENT ) );
    public final void rule__VerbatimStringContents__StringContentAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1178:1: ( ( RULE_STRING ) | ( RULE_STRING_CONTENT ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1179:1: ( RULE_STRING )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1179:1: ( RULE_STRING )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1180:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRINGTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__VerbatimStringContents__StringContentAlternatives_02485); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRINGTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1185:6: ( RULE_STRING_CONTENT )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1185:6: ( RULE_STRING_CONTENT )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1186:1: RULE_STRING_CONTENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRING_CONTENTTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_STRING_CONTENT,FollowSets000.FOLLOW_RULE_STRING_CONTENT_in_rule__VerbatimStringContents__StringContentAlternatives_02502); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRING_CONTENTTerminalRuleCall_0_1()); 
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
    // $ANTLR end "rule__VerbatimStringContents__StringContentAlternatives_0"


    // $ANTLR start "rule__PropertyValueString__Alternatives_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1196:1: rule__PropertyValueString__Alternatives_1 : ( ( ( rule__PropertyValueString__PropertyNameAssignment_1_0 ) ) | ( ( rule__PropertyValueString__Group_1_1__0 ) ) );
    public final void rule__PropertyValueString__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1200:1: ( ( ( rule__PropertyValueString__PropertyNameAssignment_1_0 ) ) | ( ( rule__PropertyValueString__Group_1_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==37) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1201:1: ( ( rule__PropertyValueString__PropertyNameAssignment_1_0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1201:1: ( ( rule__PropertyValueString__PropertyNameAssignment_1_0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1202:1: ( rule__PropertyValueString__PropertyNameAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getPropertyNameAssignment_1_0()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1203:1: ( rule__PropertyValueString__PropertyNameAssignment_1_0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1203:2: rule__PropertyValueString__PropertyNameAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__PropertyNameAssignment_1_0_in_rule__PropertyValueString__Alternatives_12534);
                    rule__PropertyValueString__PropertyNameAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueStringAccess().getPropertyNameAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1207:6: ( ( rule__PropertyValueString__Group_1_1__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1207:6: ( ( rule__PropertyValueString__Group_1_1__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1208:1: ( rule__PropertyValueString__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getGroup_1_1()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1209:1: ( rule__PropertyValueString__Group_1_1__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1209:2: rule__PropertyValueString__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__0_in_rule__PropertyValueString__Alternatives_12552);
                    rule__PropertyValueString__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueStringAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__PropertyValueString__Alternatives_1"


    // $ANTLR start "rule__PropertyValueString__DefaultValueAlternatives_2_1_0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1218:1: rule__PropertyValueString__DefaultValueAlternatives_2_1_0 : ( ( RULE_STRING ) | ( ruleEmfsName ) );
    public final void rule__PropertyValueString__DefaultValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1222:1: ( ( RULE_STRING ) | ( ruleEmfsName ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1223:1: ( RULE_STRING )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1223:1: ( RULE_STRING )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1224:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__PropertyValueString__DefaultValueAlternatives_2_1_02585); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueStringAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1229:6: ( ruleEmfsName )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1229:6: ( ruleEmfsName )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1230:1: ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getDefaultValueEmfsNameParserRuleCall_2_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__PropertyValueString__DefaultValueAlternatives_2_1_02602);
                    ruleEmfsName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueStringAccess().getDefaultValueEmfsNameParserRuleCall_2_1_0_1()); 
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
    // $ANTLR end "rule__PropertyValueString__DefaultValueAlternatives_2_1_0"


    // $ANTLR start "rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1240:1: rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 : ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) );
    public final void rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1244:1: ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING||(LA15_0>=9 && LA15_0<=12)) ) {
                alt15=1;
            }
            else if ( (LA15_0==40) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1245:1: ( ruleURLContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1245:1: ( ruleURLContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1246:1: ruleURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderURLContentProviderParserRuleCall_1_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_02634);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1251:6: ( ruleGitURLContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1251:6: ( ruleGitURLContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1252:1: ruleGitURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderGitURLContentProviderParserRuleCall_1_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_02651);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1262:1: rule__PROPERTY_REF__Alternatives_1 : ( ( ( rule__PROPERTY_REF__Group_1_0__0 ) ) | ( RULE_ID ) );
    public final void rule__PROPERTY_REF__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1266:1: ( ( ( rule__PROPERTY_REF__Group_1_0__0 ) ) | ( RULE_ID ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1267:1: ( ( rule__PROPERTY_REF__Group_1_0__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1267:1: ( ( rule__PROPERTY_REF__Group_1_0__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1268:1: ( rule__PROPERTY_REF__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPROPERTY_REFAccess().getGroup_1_0()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1269:1: ( rule__PROPERTY_REF__Group_1_0__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1269:2: rule__PROPERTY_REF__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Group_1_0__0_in_rule__PROPERTY_REF__Alternatives_12683);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1273:6: ( RULE_ID )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1273:6: ( RULE_ID )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1274:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPROPERTY_REFAccess().getIDTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PROPERTY_REF__Alternatives_12701); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1284:1: rule__URL_SCHEME__Alternatives : ( ( 'http' ) | ( 'https' ) | ( 'ftp' ) | ( 'file' ) );
    public final void rule__URL_SCHEME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1288:1: ( ( 'http' ) | ( 'https' ) | ( 'ftp' ) | ( 'file' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt17=1;
                }
                break;
            case 10:
                {
                alt17=2;
                }
                break;
            case 11:
                {
                alt17=3;
                }
                break;
            case 12:
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1289:1: ( 'http' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1289:1: ( 'http' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1290:1: 'http'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getHttpKeyword_0()); 
                    }
                    match(input,9,FollowSets000.FOLLOW_9_in_rule__URL_SCHEME__Alternatives2734); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_SCHEMEAccess().getHttpKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1297:6: ( 'https' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1297:6: ( 'https' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1298:1: 'https'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getHttpsKeyword_1()); 
                    }
                    match(input,10,FollowSets000.FOLLOW_10_in_rule__URL_SCHEME__Alternatives2754); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_SCHEMEAccess().getHttpsKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1305:6: ( 'ftp' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1305:6: ( 'ftp' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1306:1: 'ftp'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getFtpKeyword_2()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__URL_SCHEME__Alternatives2774); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_SCHEMEAccess().getFtpKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1313:6: ( 'file' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1313:6: ( 'file' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1314:1: 'file'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getFileKeyword_3()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__URL_SCHEME__Alternatives2794); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1326:1: rule__URL_HOST__Alternatives_1 : ( ( ( rule__URL_HOST__Group_1_0__0 ) ) | ( rulePROPERTY_REF ) );
    public final void rule__URL_HOST__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1330:1: ( ( ( rule__URL_HOST__Group_1_0__0 ) ) | ( rulePROPERTY_REF ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1331:1: ( ( rule__URL_HOST__Group_1_0__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1331:1: ( ( rule__URL_HOST__Group_1_0__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1332:1: ( rule__URL_HOST__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getGroup_1_0()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1333:1: ( rule__URL_HOST__Group_1_0__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1333:2: rule__URL_HOST__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_1_0__0_in_rule__URL_HOST__Alternatives_12828);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1337:6: ( rulePROPERTY_REF )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1337:6: ( rulePROPERTY_REF )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1338:1: rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getPROPERTY_REFParserRuleCall_1_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_rule__URL_HOST__Alternatives_12846);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1348:1: rule__URL_HOST__Alternatives_1_0_1_1 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__URL_HOST__Alternatives_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1352:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt19=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt19=1;
                }
                break;
            case 14:
                {
                alt19=2;
                }
                break;
            case 15:
                {
                alt19=3;
                }
                break;
            case 16:
                {
                alt19=4;
                }
                break;
            case 17:
                {
                alt19=5;
                }
                break;
            case 18:
                {
                alt19=6;
                }
                break;
            case 19:
                {
                alt19=7;
                }
                break;
            case 20:
                {
                alt19=8;
                }
                break;
            case 21:
                {
                alt19=9;
                }
                break;
            case 22:
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1353:1: ( '0' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1353:1: ( '0' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1354:1: '0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitZeroKeyword_1_0_1_1_0()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__URL_HOST__Alternatives_1_0_1_12879); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitZeroKeyword_1_0_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1361:6: ( '1' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1361:6: ( '1' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1362:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitOneKeyword_1_0_1_1_1()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__URL_HOST__Alternatives_1_0_1_12899); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitOneKeyword_1_0_1_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1369:6: ( '2' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1369:6: ( '2' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1370:1: '2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitTwoKeyword_1_0_1_1_2()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__URL_HOST__Alternatives_1_0_1_12919); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitTwoKeyword_1_0_1_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1377:6: ( '3' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1377:6: ( '3' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1378:1: '3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitThreeKeyword_1_0_1_1_3()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__URL_HOST__Alternatives_1_0_1_12939); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitThreeKeyword_1_0_1_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1385:6: ( '4' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1385:6: ( '4' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1386:1: '4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitFourKeyword_1_0_1_1_4()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__URL_HOST__Alternatives_1_0_1_12959); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitFourKeyword_1_0_1_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1393:6: ( '5' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1393:6: ( '5' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1394:1: '5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitFiveKeyword_1_0_1_1_5()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__URL_HOST__Alternatives_1_0_1_12979); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitFiveKeyword_1_0_1_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1401:6: ( '6' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1401:6: ( '6' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1402:1: '6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitSixKeyword_1_0_1_1_6()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__URL_HOST__Alternatives_1_0_1_12999); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitSixKeyword_1_0_1_1_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1409:6: ( '7' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1409:6: ( '7' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1410:1: '7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitSevenKeyword_1_0_1_1_7()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__URL_HOST__Alternatives_1_0_1_13019); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitSevenKeyword_1_0_1_1_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1417:6: ( '8' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1417:6: ( '8' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1418:1: '8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitEightKeyword_1_0_1_1_8()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__URL_HOST__Alternatives_1_0_1_13039); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitEightKeyword_1_0_1_1_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1425:6: ( '9' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1425:6: ( '9' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1426:1: '9'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitNineKeyword_1_0_1_1_9()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__URL_HOST__Alternatives_1_0_1_13059); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1438:1: rule__URL_PATH__Alternatives_1 : ( ( ruleFolderName ) | ( ( rule__URL_PATH__Group_1_1__0 ) ) );
    public final void rule__URL_PATH__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1442:1: ( ( ruleFolderName ) | ( ( rule__URL_PATH__Group_1_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==31) ) {
                alt20=1;
            }
            else if ( (LA20_0==33) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1443:1: ( ruleFolderName )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1443:1: ( ruleFolderName )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1444:1: ruleFolderName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_PATHAccess().getFolderNameParserRuleCall_1_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_rule__URL_PATH__Alternatives_13093);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1449:6: ( ( rule__URL_PATH__Group_1_1__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1449:6: ( ( rule__URL_PATH__Group_1_1__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1450:1: ( rule__URL_PATH__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_PATHAccess().getGroup_1_1()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1451:1: ( rule__URL_PATH__Group_1_1__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1451:2: rule__URL_PATH__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group_1_1__0_in_rule__URL_PATH__Alternatives_13110);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1460:1: rule__URL_PATH__Alternatives_2 : ( ( ruleFileName ) | ( rulePROPERTY_REF ) );
    public final void rule__URL_PATH__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1464:1: ( ( ruleFileName ) | ( rulePROPERTY_REF ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==33) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1465:1: ( ruleFileName )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1465:1: ( ruleFileName )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1466:1: ruleFileName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_PATHAccess().getFileNameParserRuleCall_2_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFileName_in_rule__URL_PATH__Alternatives_23143);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1471:6: ( rulePROPERTY_REF )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1471:6: ( rulePROPERTY_REF )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1472:1: rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_PATHAccess().getPROPERTY_REFParserRuleCall_2_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_rule__URL_PATH__Alternatives_23160);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1482:1: rule__URLContentProvider__UrlStringAlternatives_0 : ( ( RULE_STRING ) | ( ruleURL ) );
    public final void rule__URLContentProvider__UrlStringAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1486:1: ( ( RULE_STRING ) | ( ruleURL ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=9 && LA22_0<=12)) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1487:1: ( RULE_STRING )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1487:1: ( RULE_STRING )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1488:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURLContentProviderAccess().getUrlStringSTRINGTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__URLContentProvider__UrlStringAlternatives_03192); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURLContentProviderAccess().getUrlStringSTRINGTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1493:6: ( ruleURL )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1493:6: ( ruleURL )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1494:1: ruleURL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURLContentProviderAccess().getUrlStringURLParserRuleCall_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURL_in_rule__URLContentProvider__UrlStringAlternatives_03209);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1504:1: rule__GitContentRef__Alternatives_2 : ( ( ( rule__GitContentRef__Group_2_0__0 ) ) | ( ( rule__GitContentRef__OwnerAssignment_2_1 ) ) );
    public final void rule__GitContentRef__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1508:1: ( ( ( rule__GitContentRef__Group_2_0__0 ) ) | ( ( rule__GitContentRef__OwnerAssignment_2_1 ) ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1509:1: ( ( rule__GitContentRef__Group_2_0__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1509:1: ( ( rule__GitContentRef__Group_2_0__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1510:1: ( rule__GitContentRef__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getGroup_2_0()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1511:1: ( rule__GitContentRef__Group_2_0__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1511:2: rule__GitContentRef__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0__0_in_rule__GitContentRef__Alternatives_23241);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1515:6: ( ( rule__GitContentRef__OwnerAssignment_2_1 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1515:6: ( ( rule__GitContentRef__OwnerAssignment_2_1 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1516:1: ( rule__GitContentRef__OwnerAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerAssignment_2_1()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1517:1: ( rule__GitContentRef__OwnerAssignment_2_1 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1517:2: rule__GitContentRef__OwnerAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__OwnerAssignment_2_1_in_rule__GitContentRef__Alternatives_23259);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1526:1: rule__GitContentRef__HostAlternatives_2_0_0_0 : ( ( ruleURL_HOST_NAME ) | ( rulePROPERTY_REF ) );
    public final void rule__GitContentRef__HostAlternatives_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1530:1: ( ( ruleURL_HOST_NAME ) | ( rulePROPERTY_REF ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==33) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1531:1: ( ruleURL_HOST_NAME )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1531:1: ( ruleURL_HOST_NAME )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1532:1: ruleURL_HOST_NAME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getHostURL_HOST_NAMEParserRuleCall_2_0_0_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_NAME_in_rule__GitContentRef__HostAlternatives_2_0_0_03292);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1537:6: ( rulePROPERTY_REF )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1537:6: ( rulePROPERTY_REF )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1538:1: rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getHostPROPERTY_REFParserRuleCall_2_0_0_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_rule__GitContentRef__HostAlternatives_2_0_0_03309);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1548:1: rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 : ( ( RULE_ID ) | ( rulePROPERTY_REF ) );
    public final void rule__GitContentRef__OwnerAlternatives_2_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1552:1: ( ( RULE_ID ) | ( rulePROPERTY_REF ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==33) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1553:1: ( RULE_ID )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1553:1: ( RULE_ID )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1554:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_0_1_1_0_0()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GitContentRef__OwnerAlternatives_2_0_1_1_03341); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_0_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1559:6: ( rulePROPERTY_REF )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1559:6: ( rulePROPERTY_REF )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1560:1: rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerPROPERTY_REFParserRuleCall_2_0_1_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_rule__GitContentRef__OwnerAlternatives_2_0_1_1_03358);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1570:1: rule__GitContentRef__OwnerAlternatives_2_1_0 : ( ( RULE_ID ) | ( rulePROPERTY_REF ) );
    public final void rule__GitContentRef__OwnerAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1574:1: ( ( RULE_ID ) | ( rulePROPERTY_REF ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==33) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1575:1: ( RULE_ID )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1575:1: ( RULE_ID )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1576:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_1_0_0()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GitContentRef__OwnerAlternatives_2_1_03390); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1581:6: ( rulePROPERTY_REF )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1581:6: ( rulePROPERTY_REF )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1582:1: rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerPROPERTY_REFParserRuleCall_2_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_rule__GitContentRef__OwnerAlternatives_2_1_03407);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1592:1: rule__VERSION__Alternatives : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__VERSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1596:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt27=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt27=1;
                }
                break;
            case 14:
                {
                alt27=2;
                }
                break;
            case 15:
                {
                alt27=3;
                }
                break;
            case 16:
                {
                alt27=4;
                }
                break;
            case 17:
                {
                alt27=5;
                }
                break;
            case 18:
                {
                alt27=6;
                }
                break;
            case 19:
                {
                alt27=7;
                }
                break;
            case 20:
                {
                alt27=8;
                }
                break;
            case 21:
                {
                alt27=9;
                }
                break;
            case 22:
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1597:1: ( '0' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1597:1: ( '0' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1598:1: '0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitZeroKeyword_0()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__VERSION__Alternatives3440); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitZeroKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1605:6: ( '1' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1605:6: ( '1' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1606:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitOneKeyword_1()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__VERSION__Alternatives3460); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitOneKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1613:6: ( '2' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1613:6: ( '2' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1614:1: '2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitTwoKeyword_2()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__VERSION__Alternatives3480); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitTwoKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1621:6: ( '3' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1621:6: ( '3' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1622:1: '3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitThreeKeyword_3()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__VERSION__Alternatives3500); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitThreeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1629:6: ( '4' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1629:6: ( '4' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1630:1: '4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitFourKeyword_4()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__VERSION__Alternatives3520); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitFourKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1637:6: ( '5' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1637:6: ( '5' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1638:1: '5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitFiveKeyword_5()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__VERSION__Alternatives3540); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitFiveKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1645:6: ( '6' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1645:6: ( '6' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1646:1: '6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitSixKeyword_6()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__VERSION__Alternatives3560); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitSixKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1653:6: ( '7' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1653:6: ( '7' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1654:1: '7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitSevenKeyword_7()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__VERSION__Alternatives3580); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitSevenKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1661:6: ( '8' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1661:6: ( '8' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1662:1: '8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitEightKeyword_8()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__VERSION__Alternatives3600); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitEightKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1669:6: ( '9' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1669:6: ( '9' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1670:1: '9'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitNineKeyword_9()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__VERSION__Alternatives3620); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1682:1: rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 : ( ( RULE_STRING ) | ( ruleFileName ) );
    public final void rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1686:1: ( ( RULE_STRING ) | ( ruleFileName ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID||LA28_0==31) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1687:1: ( RULE_STRING )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1687:1: ( RULE_STRING )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1688:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysSTRINGTerminalRuleCall_1_1_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_03654); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDotProjectFileContentProviderAccess().getKeysSTRINGTerminalRuleCall_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1693:6: ( ruleFileName )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1693:6: ( ruleFileName )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1694:1: ruleFileName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysFileNameParserRuleCall_1_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFileName_in_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_03671);
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


    // $ANTLR start "rule__ClasspathEntryKind__Alternatives"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1704:1: rule__ClasspathEntryKind__Alternatives : ( ( ( 'source-folder' ) ) | ( ( 'output-folder' ) ) | ( ( 'library-jar' ) ) | ( ( 'class-container' ) ) );
    public final void rule__ClasspathEntryKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1708:1: ( ( ( 'source-folder' ) ) | ( ( 'output-folder' ) ) | ( ( 'library-jar' ) ) | ( ( 'class-container' ) ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt29=1;
                }
                break;
            case 24:
                {
                alt29=2;
                }
                break;
            case 25:
                {
                alt29=3;
                }
                break;
            case 26:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1709:1: ( ( 'source-folder' ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1709:1: ( ( 'source-folder' ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1710:1: ( 'source-folder' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1711:1: ( 'source-folder' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1711:3: 'source-folder'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__ClasspathEntryKind__Alternatives3704); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1716:6: ( ( 'output-folder' ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1716:6: ( ( 'output-folder' ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1717:1: ( 'output-folder' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1718:1: ( 'output-folder' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1718:3: 'output-folder'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__ClasspathEntryKind__Alternatives3725); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1723:6: ( ( 'library-jar' ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1723:6: ( ( 'library-jar' ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1724:1: ( 'library-jar' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1725:1: ( 'library-jar' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1725:3: 'library-jar'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__ClasspathEntryKind__Alternatives3746); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1730:6: ( ( 'class-container' ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1730:6: ( ( 'class-container' ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1731:1: ( 'class-container' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getConEnumLiteralDeclaration_3()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1732:1: ( 'class-container' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1732:3: 'class-container'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__ClasspathEntryKind__Alternatives3767); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1744:1: rule__EmfsRoot__Group__0 : rule__EmfsRoot__Group__0__Impl rule__EmfsRoot__Group__1 ;
    public final void rule__EmfsRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1748:1: ( rule__EmfsRoot__Group__0__Impl rule__EmfsRoot__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1749:2: rule__EmfsRoot__Group__0__Impl rule__EmfsRoot__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__0__Impl_in_rule__EmfsRoot__Group__03800);
            rule__EmfsRoot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__1_in_rule__EmfsRoot__Group__03803);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1756:1: rule__EmfsRoot__Group__0__Impl : ( () ) ;
    public final void rule__EmfsRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1760:1: ( ( () ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1761:1: ( () )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1761:1: ( () )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1762:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getEmfsContainerAction_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1763:1: ()
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1765:1: 
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1775:1: rule__EmfsRoot__Group__1 : rule__EmfsRoot__Group__1__Impl rule__EmfsRoot__Group__2 ;
    public final void rule__EmfsRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1779:1: ( rule__EmfsRoot__Group__1__Impl rule__EmfsRoot__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1780:2: rule__EmfsRoot__Group__1__Impl rule__EmfsRoot__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__1__Impl_in_rule__EmfsRoot__Group__13861);
            rule__EmfsRoot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__2_in_rule__EmfsRoot__Group__13864);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1787:1: rule__EmfsRoot__Group__1__Impl : ( ( rule__EmfsRoot__Group_1__0 )? ) ;
    public final void rule__EmfsRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1791:1: ( ( ( rule__EmfsRoot__Group_1__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1792:1: ( ( rule__EmfsRoot__Group_1__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1792:1: ( ( rule__EmfsRoot__Group_1__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1793:1: ( rule__EmfsRoot__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1794:1: ( rule__EmfsRoot__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1794:2: rule__EmfsRoot__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_1__0_in_rule__EmfsRoot__Group__1__Impl3891);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1804:1: rule__EmfsRoot__Group__2 : rule__EmfsRoot__Group__2__Impl rule__EmfsRoot__Group__3 ;
    public final void rule__EmfsRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1808:1: ( rule__EmfsRoot__Group__2__Impl rule__EmfsRoot__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1809:2: rule__EmfsRoot__Group__2__Impl rule__EmfsRoot__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__2__Impl_in_rule__EmfsRoot__Group__23922);
            rule__EmfsRoot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__3_in_rule__EmfsRoot__Group__23925);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1816:1: rule__EmfsRoot__Group__2__Impl : ( ( rule__EmfsRoot__Group_2__0 )* ) ;
    public final void rule__EmfsRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1820:1: ( ( ( rule__EmfsRoot__Group_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1821:1: ( ( rule__EmfsRoot__Group_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1821:1: ( ( rule__EmfsRoot__Group_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1822:1: ( rule__EmfsRoot__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1823:1: ( rule__EmfsRoot__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1823:2: rule__EmfsRoot__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_2__0_in_rule__EmfsRoot__Group__2__Impl3952);
            	    rule__EmfsRoot__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1833:1: rule__EmfsRoot__Group__3 : rule__EmfsRoot__Group__3__Impl rule__EmfsRoot__Group__4 ;
    public final void rule__EmfsRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1837:1: ( rule__EmfsRoot__Group__3__Impl rule__EmfsRoot__Group__4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1838:2: rule__EmfsRoot__Group__3__Impl rule__EmfsRoot__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__3__Impl_in_rule__EmfsRoot__Group__33983);
            rule__EmfsRoot__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__4_in_rule__EmfsRoot__Group__33986);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1845:1: rule__EmfsRoot__Group__3__Impl : ( ( rule__EmfsRoot__PropertiesAssignment_3 )* ) ;
    public final void rule__EmfsRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1849:1: ( ( ( rule__EmfsRoot__PropertiesAssignment_3 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1850:1: ( ( rule__EmfsRoot__PropertiesAssignment_3 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1850:1: ( ( rule__EmfsRoot__PropertiesAssignment_3 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1851:1: ( rule__EmfsRoot__PropertiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getPropertiesAssignment_3()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1852:1: ( rule__EmfsRoot__PropertiesAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==33) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1852:2: rule__EmfsRoot__PropertiesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__PropertiesAssignment_3_in_rule__EmfsRoot__Group__3__Impl4013);
            	    rule__EmfsRoot__PropertiesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1862:1: rule__EmfsRoot__Group__4 : rule__EmfsRoot__Group__4__Impl rule__EmfsRoot__Group__5 ;
    public final void rule__EmfsRoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1866:1: ( rule__EmfsRoot__Group__4__Impl rule__EmfsRoot__Group__5 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1867:2: rule__EmfsRoot__Group__4__Impl rule__EmfsRoot__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__4__Impl_in_rule__EmfsRoot__Group__44044);
            rule__EmfsRoot__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__5_in_rule__EmfsRoot__Group__44047);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1874:1: rule__EmfsRoot__Group__4__Impl : ( ( rule__EmfsRoot__Group_4__0 )? ) ;
    public final void rule__EmfsRoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1878:1: ( ( ( rule__EmfsRoot__Group_4__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1879:1: ( ( rule__EmfsRoot__Group_4__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1879:1: ( ( rule__EmfsRoot__Group_4__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1880:1: ( rule__EmfsRoot__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup_4()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1881:1: ( rule__EmfsRoot__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1881:2: rule__EmfsRoot__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_4__0_in_rule__EmfsRoot__Group__4__Impl4074);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1891:1: rule__EmfsRoot__Group__5 : rule__EmfsRoot__Group__5__Impl rule__EmfsRoot__Group__6 ;
    public final void rule__EmfsRoot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1895:1: ( rule__EmfsRoot__Group__5__Impl rule__EmfsRoot__Group__6 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1896:2: rule__EmfsRoot__Group__5__Impl rule__EmfsRoot__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__5__Impl_in_rule__EmfsRoot__Group__54105);
            rule__EmfsRoot__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__6_in_rule__EmfsRoot__Group__54108);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1903:1: rule__EmfsRoot__Group__5__Impl : ( '/' ) ;
    public final void rule__EmfsRoot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1907:1: ( ( '/' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1908:1: ( '/' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1908:1: ( '/' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1909:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getSolidusKeyword_5()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__EmfsRoot__Group__5__Impl4136); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1922:1: rule__EmfsRoot__Group__6 : rule__EmfsRoot__Group__6__Impl ;
    public final void rule__EmfsRoot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1926:1: ( rule__EmfsRoot__Group__6__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1927:2: rule__EmfsRoot__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__6__Impl_in_rule__EmfsRoot__Group__64167);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1933:1: rule__EmfsRoot__Group__6__Impl : ( ( rule__EmfsRoot__ResourcesAssignment_6 )* ) ;
    public final void rule__EmfsRoot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1937:1: ( ( ( rule__EmfsRoot__ResourcesAssignment_6 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1938:1: ( ( rule__EmfsRoot__ResourcesAssignment_6 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1938:1: ( ( rule__EmfsRoot__ResourcesAssignment_6 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1939:1: ( rule__EmfsRoot__ResourcesAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getResourcesAssignment_6()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1940:1: ( rule__EmfsRoot__ResourcesAssignment_6 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==31) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1940:2: rule__EmfsRoot__ResourcesAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__ResourcesAssignment_6_in_rule__EmfsRoot__Group__6__Impl4194);
            	    rule__EmfsRoot__ResourcesAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1964:1: rule__EmfsRoot__Group_1__0 : rule__EmfsRoot__Group_1__0__Impl rule__EmfsRoot__Group_1__1 ;
    public final void rule__EmfsRoot__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1968:1: ( rule__EmfsRoot__Group_1__0__Impl rule__EmfsRoot__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1969:2: rule__EmfsRoot__Group_1__0__Impl rule__EmfsRoot__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_1__0__Impl_in_rule__EmfsRoot__Group_1__04239);
            rule__EmfsRoot__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_1__1_in_rule__EmfsRoot__Group_1__04242);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1976:1: rule__EmfsRoot__Group_1__0__Impl : ( 'emfs' ) ;
    public final void rule__EmfsRoot__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1980:1: ( ( 'emfs' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1981:1: ( 'emfs' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1981:1: ( 'emfs' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1982:1: 'emfs'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getEmfsKeyword_1_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__EmfsRoot__Group_1__0__Impl4270); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1995:1: rule__EmfsRoot__Group_1__1 : rule__EmfsRoot__Group_1__1__Impl ;
    public final void rule__EmfsRoot__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1999:1: ( rule__EmfsRoot__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2000:2: rule__EmfsRoot__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_1__1__Impl_in_rule__EmfsRoot__Group_1__14301);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2006:1: rule__EmfsRoot__Group_1__1__Impl : ( ( rule__EmfsRoot__NameAssignment_1_1 )? ) ;
    public final void rule__EmfsRoot__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2010:1: ( ( ( rule__EmfsRoot__NameAssignment_1_1 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2011:1: ( ( rule__EmfsRoot__NameAssignment_1_1 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2011:1: ( ( rule__EmfsRoot__NameAssignment_1_1 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2012:1: ( rule__EmfsRoot__NameAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getNameAssignment_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2013:1: ( rule__EmfsRoot__NameAssignment_1_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2013:2: rule__EmfsRoot__NameAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__NameAssignment_1_1_in_rule__EmfsRoot__Group_1__1__Impl4328);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2027:1: rule__EmfsRoot__Group_2__0 : rule__EmfsRoot__Group_2__0__Impl rule__EmfsRoot__Group_2__1 ;
    public final void rule__EmfsRoot__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2031:1: ( rule__EmfsRoot__Group_2__0__Impl rule__EmfsRoot__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2032:2: rule__EmfsRoot__Group_2__0__Impl rule__EmfsRoot__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_2__0__Impl_in_rule__EmfsRoot__Group_2__04363);
            rule__EmfsRoot__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_2__1_in_rule__EmfsRoot__Group_2__04366);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2039:1: rule__EmfsRoot__Group_2__0__Impl : ( '#' ) ;
    public final void rule__EmfsRoot__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2043:1: ( ( '#' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2044:1: ( '#' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2044:1: ( '#' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2045:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__EmfsRoot__Group_2__0__Impl4394); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2058:1: rule__EmfsRoot__Group_2__1 : rule__EmfsRoot__Group_2__1__Impl ;
    public final void rule__EmfsRoot__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2062:1: ( rule__EmfsRoot__Group_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2063:2: rule__EmfsRoot__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_2__1__Impl_in_rule__EmfsRoot__Group_2__14425);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2069:1: rule__EmfsRoot__Group_2__1__Impl : ( ( rule__EmfsRoot__TagsAssignment_2_1 ) ) ;
    public final void rule__EmfsRoot__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2073:1: ( ( ( rule__EmfsRoot__TagsAssignment_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2074:1: ( ( rule__EmfsRoot__TagsAssignment_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2074:1: ( ( rule__EmfsRoot__TagsAssignment_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2075:1: ( rule__EmfsRoot__TagsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getTagsAssignment_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2076:1: ( rule__EmfsRoot__TagsAssignment_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2076:2: rule__EmfsRoot__TagsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__TagsAssignment_2_1_in_rule__EmfsRoot__Group_2__1__Impl4452);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2090:1: rule__EmfsRoot__Group_4__0 : rule__EmfsRoot__Group_4__0__Impl rule__EmfsRoot__Group_4__1 ;
    public final void rule__EmfsRoot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2094:1: ( rule__EmfsRoot__Group_4__0__Impl rule__EmfsRoot__Group_4__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2095:2: rule__EmfsRoot__Group_4__0__Impl rule__EmfsRoot__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_4__0__Impl_in_rule__EmfsRoot__Group_4__04486);
            rule__EmfsRoot__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_4__1_in_rule__EmfsRoot__Group_4__04489);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2102:1: rule__EmfsRoot__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__EmfsRoot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2106:1: ( ( 'extends' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2107:1: ( 'extends' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2107:1: ( 'extends' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2108:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getExtendsKeyword_4_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EmfsRoot__Group_4__0__Impl4517); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2121:1: rule__EmfsRoot__Group_4__1 : rule__EmfsRoot__Group_4__1__Impl rule__EmfsRoot__Group_4__2 ;
    public final void rule__EmfsRoot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2125:1: ( rule__EmfsRoot__Group_4__1__Impl rule__EmfsRoot__Group_4__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2126:2: rule__EmfsRoot__Group_4__1__Impl rule__EmfsRoot__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_4__1__Impl_in_rule__EmfsRoot__Group_4__14548);
            rule__EmfsRoot__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_4__2_in_rule__EmfsRoot__Group_4__14551);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2133:1: rule__EmfsRoot__Group_4__1__Impl : ( ( rule__EmfsRoot__ContentProviderAssignment_4_1 ) ) ;
    public final void rule__EmfsRoot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2137:1: ( ( ( rule__EmfsRoot__ContentProviderAssignment_4_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2138:1: ( ( rule__EmfsRoot__ContentProviderAssignment_4_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2138:1: ( ( rule__EmfsRoot__ContentProviderAssignment_4_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2139:1: ( rule__EmfsRoot__ContentProviderAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getContentProviderAssignment_4_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2140:1: ( rule__EmfsRoot__ContentProviderAssignment_4_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2140:2: rule__EmfsRoot__ContentProviderAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__ContentProviderAssignment_4_1_in_rule__EmfsRoot__Group_4__1__Impl4578);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2150:1: rule__EmfsRoot__Group_4__2 : rule__EmfsRoot__Group_4__2__Impl ;
    public final void rule__EmfsRoot__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2154:1: ( rule__EmfsRoot__Group_4__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2155:2: rule__EmfsRoot__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_4__2__Impl_in_rule__EmfsRoot__Group_4__24608);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2161:1: rule__EmfsRoot__Group_4__2__Impl : ( ';' ) ;
    public final void rule__EmfsRoot__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2165:1: ( ( ';' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2166:1: ( ';' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2166:1: ( ';' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2167:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getSemicolonKeyword_4_2()); 
            }
            match(input,8,FollowSets000.FOLLOW_8_in_rule__EmfsRoot__Group_4__2__Impl4636); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2186:1: rule__EmfsName__Group__0 : rule__EmfsName__Group__0__Impl rule__EmfsName__Group__1 ;
    public final void rule__EmfsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2190:1: ( rule__EmfsName__Group__0__Impl rule__EmfsName__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2191:2: rule__EmfsName__Group__0__Impl rule__EmfsName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group__0__Impl_in_rule__EmfsName__Group__04673);
            rule__EmfsName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group__1_in_rule__EmfsName__Group__04676);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2198:1: rule__EmfsName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__EmfsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2202:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2203:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2203:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2204:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmfsName__Group__0__Impl4703); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2215:1: rule__EmfsName__Group__1 : rule__EmfsName__Group__1__Impl ;
    public final void rule__EmfsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2219:1: ( rule__EmfsName__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2220:2: rule__EmfsName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group__1__Impl_in_rule__EmfsName__Group__14732);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2226:1: rule__EmfsName__Group__1__Impl : ( ( rule__EmfsName__Group_1__0 )* ) ;
    public final void rule__EmfsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2230:1: ( ( ( rule__EmfsName__Group_1__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2231:1: ( ( rule__EmfsName__Group_1__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2231:1: ( ( rule__EmfsName__Group_1__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2232:1: ( rule__EmfsName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2233:1: ( rule__EmfsName__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==31) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==RULE_ID) ) {
                        int LA36_3 = input.LA(3);

                        if ( (synpred58_InternalXemfs()) ) {
                            alt36=1;
                        }


                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2233:2: rule__EmfsName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group_1__0_in_rule__EmfsName__Group__1__Impl4759);
            	    rule__EmfsName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2247:1: rule__EmfsName__Group_1__0 : rule__EmfsName__Group_1__0__Impl rule__EmfsName__Group_1__1 ;
    public final void rule__EmfsName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2251:1: ( rule__EmfsName__Group_1__0__Impl rule__EmfsName__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2252:2: rule__EmfsName__Group_1__0__Impl rule__EmfsName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group_1__0__Impl_in_rule__EmfsName__Group_1__04794);
            rule__EmfsName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group_1__1_in_rule__EmfsName__Group_1__04797);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2259:1: rule__EmfsName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EmfsName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2263:1: ( ( '.' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2264:1: ( '.' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2264:1: ( '.' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2265:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__EmfsName__Group_1__0__Impl4825); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2278:1: rule__EmfsName__Group_1__1 : rule__EmfsName__Group_1__1__Impl ;
    public final void rule__EmfsName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2282:1: ( rule__EmfsName__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2283:2: rule__EmfsName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group_1__1__Impl_in_rule__EmfsName__Group_1__14856);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2289:1: rule__EmfsName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__EmfsName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2293:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2294:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2294:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2295:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmfsName__Group_1__1__Impl4883); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2310:1: rule__EmfsResourcesRef__Group__0 : rule__EmfsResourcesRef__Group__0__Impl rule__EmfsResourcesRef__Group__1 ;
    public final void rule__EmfsResourcesRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2314:1: ( rule__EmfsResourcesRef__Group__0__Impl rule__EmfsResourcesRef__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2315:2: rule__EmfsResourcesRef__Group__0__Impl rule__EmfsResourcesRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group__0__Impl_in_rule__EmfsResourcesRef__Group__04916);
            rule__EmfsResourcesRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group__1_in_rule__EmfsResourcesRef__Group__04919);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2322:1: rule__EmfsResourcesRef__Group__0__Impl : ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) ) ;
    public final void rule__EmfsResourcesRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2326:1: ( ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2327:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2327:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2328:1: ( rule__EmfsResourcesRef__ResourcesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesAssignment_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2329:1: ( rule__EmfsResourcesRef__ResourcesAssignment_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2329:2: rule__EmfsResourcesRef__ResourcesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__ResourcesAssignment_0_in_rule__EmfsResourcesRef__Group__0__Impl4946);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2339:1: rule__EmfsResourcesRef__Group__1 : rule__EmfsResourcesRef__Group__1__Impl ;
    public final void rule__EmfsResourcesRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2343:1: ( rule__EmfsResourcesRef__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2344:2: rule__EmfsResourcesRef__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group__1__Impl_in_rule__EmfsResourcesRef__Group__14976);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2350:1: rule__EmfsResourcesRef__Group__1__Impl : ( ( rule__EmfsResourcesRef__Group_1__0 )* ) ;
    public final void rule__EmfsResourcesRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2354:1: ( ( ( rule__EmfsResourcesRef__Group_1__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2355:1: ( ( rule__EmfsResourcesRef__Group_1__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2355:1: ( ( rule__EmfsResourcesRef__Group_1__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2356:1: ( rule__EmfsResourcesRef__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2357:1: ( rule__EmfsResourcesRef__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==32) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2357:2: rule__EmfsResourcesRef__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group_1__0_in_rule__EmfsResourcesRef__Group__1__Impl5003);
            	    rule__EmfsResourcesRef__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2371:1: rule__EmfsResourcesRef__Group_1__0 : rule__EmfsResourcesRef__Group_1__0__Impl rule__EmfsResourcesRef__Group_1__1 ;
    public final void rule__EmfsResourcesRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2375:1: ( rule__EmfsResourcesRef__Group_1__0__Impl rule__EmfsResourcesRef__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2376:2: rule__EmfsResourcesRef__Group_1__0__Impl rule__EmfsResourcesRef__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group_1__0__Impl_in_rule__EmfsResourcesRef__Group_1__05038);
            rule__EmfsResourcesRef__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group_1__1_in_rule__EmfsResourcesRef__Group_1__05041);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2383:1: rule__EmfsResourcesRef__Group_1__0__Impl : ( ',' ) ;
    public final void rule__EmfsResourcesRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2387:1: ( ( ',' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2388:1: ( ',' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2388:1: ( ',' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2389:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getCommaKeyword_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__EmfsResourcesRef__Group_1__0__Impl5069); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2402:1: rule__EmfsResourcesRef__Group_1__1 : rule__EmfsResourcesRef__Group_1__1__Impl ;
    public final void rule__EmfsResourcesRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2406:1: ( rule__EmfsResourcesRef__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2407:2: rule__EmfsResourcesRef__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group_1__1__Impl_in_rule__EmfsResourcesRef__Group_1__15100);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2413:1: rule__EmfsResourcesRef__Group_1__1__Impl : ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) ) ;
    public final void rule__EmfsResourcesRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2417:1: ( ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2418:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2418:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2419:1: ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesAssignment_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2420:1: ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2420:2: rule__EmfsResourcesRef__ResourcesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__ResourcesAssignment_1_1_in_rule__EmfsResourcesRef__Group_1__1__Impl5127);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2434:1: rule__ResourceName__Group__0 : rule__ResourceName__Group__0__Impl rule__ResourceName__Group__1 ;
    public final void rule__ResourceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2438:1: ( rule__ResourceName__Group__0__Impl rule__ResourceName__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2439:2: rule__ResourceName__Group__0__Impl rule__ResourceName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceName__Group__0__Impl_in_rule__ResourceName__Group__05161);
            rule__ResourceName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ResourceName__Group__1_in_rule__ResourceName__Group__05164);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2446:1: rule__ResourceName__Group__0__Impl : ( ( '.' )? ) ;
    public final void rule__ResourceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2450:1: ( ( ( '.' )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2451:1: ( ( '.' )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2451:1: ( ( '.' )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2452:1: ( '.' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getFullStopKeyword_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2453:1: ( '.' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2454:2: '.'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__ResourceName__Group__0__Impl5193); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2465:1: rule__ResourceName__Group__1 : rule__ResourceName__Group__1__Impl rule__ResourceName__Group__2 ;
    public final void rule__ResourceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2469:1: ( rule__ResourceName__Group__1__Impl rule__ResourceName__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2470:2: rule__ResourceName__Group__1__Impl rule__ResourceName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceName__Group__1__Impl_in_rule__ResourceName__Group__15226);
            rule__ResourceName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ResourceName__Group__2_in_rule__ResourceName__Group__15229);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2477:1: rule__ResourceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__ResourceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2481:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2482:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2482:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2483:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ResourceName__Group__1__Impl5256); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2494:1: rule__ResourceName__Group__2 : rule__ResourceName__Group__2__Impl ;
    public final void rule__ResourceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2498:1: ( rule__ResourceName__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2499:2: rule__ResourceName__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceName__Group__2__Impl_in_rule__ResourceName__Group__25285);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2505:1: rule__ResourceName__Group__2__Impl : ( ( rule__ResourceName__Group_2__0 )* ) ;
    public final void rule__ResourceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2509:1: ( ( ( rule__ResourceName__Group_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2510:1: ( ( rule__ResourceName__Group_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2510:1: ( ( rule__ResourceName__Group_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2511:1: ( rule__ResourceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2512:1: ( rule__ResourceName__Group_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==31) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2512:2: rule__ResourceName__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ResourceName__Group_2__0_in_rule__ResourceName__Group__2__Impl5312);
            	    rule__ResourceName__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2528:1: rule__ResourceName__Group_2__0 : rule__ResourceName__Group_2__0__Impl rule__ResourceName__Group_2__1 ;
    public final void rule__ResourceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2532:1: ( rule__ResourceName__Group_2__0__Impl rule__ResourceName__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2533:2: rule__ResourceName__Group_2__0__Impl rule__ResourceName__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceName__Group_2__0__Impl_in_rule__ResourceName__Group_2__05349);
            rule__ResourceName__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ResourceName__Group_2__1_in_rule__ResourceName__Group_2__05352);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2540:1: rule__ResourceName__Group_2__0__Impl : ( '.' ) ;
    public final void rule__ResourceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2544:1: ( ( '.' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2545:1: ( '.' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2545:1: ( '.' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2546:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getFullStopKeyword_2_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ResourceName__Group_2__0__Impl5380); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2559:1: rule__ResourceName__Group_2__1 : rule__ResourceName__Group_2__1__Impl ;
    public final void rule__ResourceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2563:1: ( rule__ResourceName__Group_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2564:2: rule__ResourceName__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResourceName__Group_2__1__Impl_in_rule__ResourceName__Group_2__15411);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2570:1: rule__ResourceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__ResourceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2574:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2575:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2575:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2576:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResourceNameAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ResourceName__Group_2__1__Impl5438); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2591:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2595:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2596:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05471);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05474);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2603:1: rule__Property__Group__0__Impl : ( '$' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2607:1: ( ( '$' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2608:1: ( '$' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2608:1: ( '$' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2609:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Property__Group__0__Impl5502); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2622:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2626:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2627:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15533);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2_in_rule__Property__Group__15536);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2634:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2638:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2639:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2639:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2640:1: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2641:1: ( rule__Property__NameAssignment_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2641:2: rule__Property__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl5563);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2651:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2655:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2656:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__25593);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3_in_rule__Property__Group__25596);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2663:1: rule__Property__Group__2__Impl : ( '=' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2667:1: ( ( '=' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2668:1: ( '=' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2668:1: ( '=' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2669:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Property__Group__2__Impl5624); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2682:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2686:1: ( rule__Property__Group__3__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2687:2: rule__Property__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__35655);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2693:1: rule__Property__Group__3__Impl : ( ( rule__Property__ValueAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2697:1: ( ( ( rule__Property__ValueAssignment_3 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2698:1: ( ( rule__Property__ValueAssignment_3 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2698:1: ( ( rule__Property__ValueAssignment_3 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2699:1: ( rule__Property__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAssignment_3()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2700:1: ( rule__Property__ValueAssignment_3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2700:2: rule__Property__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__ValueAssignment_3_in_rule__Property__Group__3__Impl5682);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2718:1: rule__FolderName__Group__0 : rule__FolderName__Group__0__Impl rule__FolderName__Group__1 ;
    public final void rule__FolderName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2722:1: ( rule__FolderName__Group__0__Impl rule__FolderName__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2723:2: rule__FolderName__Group__0__Impl rule__FolderName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FolderName__Group__0__Impl_in_rule__FolderName__Group__05720);
            rule__FolderName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FolderName__Group__1_in_rule__FolderName__Group__05723);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2730:1: rule__FolderName__Group__0__Impl : ( ruleResourceName ) ;
    public final void rule__FolderName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2734:1: ( ( ruleResourceName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2735:1: ( ruleResourceName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2735:1: ( ruleResourceName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2736:1: ruleResourceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFolderNameAccess().getResourceNameParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleResourceName_in_rule__FolderName__Group__0__Impl5750);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2747:1: rule__FolderName__Group__1 : rule__FolderName__Group__1__Impl ;
    public final void rule__FolderName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2751:1: ( rule__FolderName__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2752:2: rule__FolderName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FolderName__Group__1__Impl_in_rule__FolderName__Group__15779);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2758:1: rule__FolderName__Group__1__Impl : ( '/' ) ;
    public final void rule__FolderName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2762:1: ( ( '/' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2763:1: ( '/' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2763:1: ( '/' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2764:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFolderNameAccess().getSolidusKeyword_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__FolderName__Group__1__Impl5807); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2781:1: rule__EmfsContainer__Group__0 : rule__EmfsContainer__Group__0__Impl rule__EmfsContainer__Group__1 ;
    public final void rule__EmfsContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2785:1: ( rule__EmfsContainer__Group__0__Impl rule__EmfsContainer__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2786:2: rule__EmfsContainer__Group__0__Impl rule__EmfsContainer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__0__Impl_in_rule__EmfsContainer__Group__05842);
            rule__EmfsContainer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__1_in_rule__EmfsContainer__Group__05845);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2793:1: rule__EmfsContainer__Group__0__Impl : ( ( rule__EmfsContainer__NameAssignment_0 ) ) ;
    public final void rule__EmfsContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2797:1: ( ( ( rule__EmfsContainer__NameAssignment_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2798:1: ( ( rule__EmfsContainer__NameAssignment_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2798:1: ( ( rule__EmfsContainer__NameAssignment_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2799:1: ( rule__EmfsContainer__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getNameAssignment_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2800:1: ( rule__EmfsContainer__NameAssignment_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2800:2: rule__EmfsContainer__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__NameAssignment_0_in_rule__EmfsContainer__Group__0__Impl5872);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2810:1: rule__EmfsContainer__Group__1 : rule__EmfsContainer__Group__1__Impl rule__EmfsContainer__Group__2 ;
    public final void rule__EmfsContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2814:1: ( rule__EmfsContainer__Group__1__Impl rule__EmfsContainer__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2815:2: rule__EmfsContainer__Group__1__Impl rule__EmfsContainer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__1__Impl_in_rule__EmfsContainer__Group__15902);
            rule__EmfsContainer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__2_in_rule__EmfsContainer__Group__15905);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2822:1: rule__EmfsContainer__Group__1__Impl : ( ( rule__EmfsContainer__Group_1__0 )* ) ;
    public final void rule__EmfsContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2826:1: ( ( ( rule__EmfsContainer__Group_1__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2827:1: ( ( rule__EmfsContainer__Group_1__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2827:1: ( ( rule__EmfsContainer__Group_1__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2828:1: ( rule__EmfsContainer__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2829:1: ( rule__EmfsContainer__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==29) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2829:2: rule__EmfsContainer__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_1__0_in_rule__EmfsContainer__Group__1__Impl5932);
            	    rule__EmfsContainer__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2839:1: rule__EmfsContainer__Group__2 : rule__EmfsContainer__Group__2__Impl rule__EmfsContainer__Group__3 ;
    public final void rule__EmfsContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2843:1: ( rule__EmfsContainer__Group__2__Impl rule__EmfsContainer__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2844:2: rule__EmfsContainer__Group__2__Impl rule__EmfsContainer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__2__Impl_in_rule__EmfsContainer__Group__25963);
            rule__EmfsContainer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__3_in_rule__EmfsContainer__Group__25966);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2851:1: rule__EmfsContainer__Group__2__Impl : ( ( rule__EmfsContainer__PropertiesAssignment_2 )* ) ;
    public final void rule__EmfsContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2855:1: ( ( ( rule__EmfsContainer__PropertiesAssignment_2 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2856:1: ( ( rule__EmfsContainer__PropertiesAssignment_2 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2856:1: ( ( rule__EmfsContainer__PropertiesAssignment_2 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2857:1: ( rule__EmfsContainer__PropertiesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getPropertiesAssignment_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2858:1: ( rule__EmfsContainer__PropertiesAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==33) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2858:2: rule__EmfsContainer__PropertiesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__PropertiesAssignment_2_in_rule__EmfsContainer__Group__2__Impl5993);
            	    rule__EmfsContainer__PropertiesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2868:1: rule__EmfsContainer__Group__3 : rule__EmfsContainer__Group__3__Impl rule__EmfsContainer__Group__4 ;
    public final void rule__EmfsContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2872:1: ( rule__EmfsContainer__Group__3__Impl rule__EmfsContainer__Group__4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2873:2: rule__EmfsContainer__Group__3__Impl rule__EmfsContainer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__3__Impl_in_rule__EmfsContainer__Group__36024);
            rule__EmfsContainer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__4_in_rule__EmfsContainer__Group__36027);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2880:1: rule__EmfsContainer__Group__3__Impl : ( ( rule__EmfsContainer__Group_3__0 )? ) ;
    public final void rule__EmfsContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2884:1: ( ( ( rule__EmfsContainer__Group_3__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2885:1: ( ( rule__EmfsContainer__Group_3__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2885:1: ( ( rule__EmfsContainer__Group_3__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2886:1: ( rule__EmfsContainer__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getGroup_3()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2887:1: ( rule__EmfsContainer__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2887:2: rule__EmfsContainer__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__0_in_rule__EmfsContainer__Group__3__Impl6054);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2897:1: rule__EmfsContainer__Group__4 : rule__EmfsContainer__Group__4__Impl rule__EmfsContainer__Group__5 ;
    public final void rule__EmfsContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2901:1: ( rule__EmfsContainer__Group__4__Impl rule__EmfsContainer__Group__5 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2902:2: rule__EmfsContainer__Group__4__Impl rule__EmfsContainer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__4__Impl_in_rule__EmfsContainer__Group__46085);
            rule__EmfsContainer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__5_in_rule__EmfsContainer__Group__46088);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2909:1: rule__EmfsContainer__Group__4__Impl : ( ( rule__EmfsContainer__ResourcesAssignment_4 )* ) ;
    public final void rule__EmfsContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2913:1: ( ( ( rule__EmfsContainer__ResourcesAssignment_4 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2914:1: ( ( rule__EmfsContainer__ResourcesAssignment_4 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2914:1: ( ( rule__EmfsContainer__ResourcesAssignment_4 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2915:1: ( rule__EmfsContainer__ResourcesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getResourcesAssignment_4()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2916:1: ( rule__EmfsContainer__ResourcesAssignment_4 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==31) ) {
                    int LA43_2 = input.LA(2);

                    if ( (synpred65_InternalXemfs()) ) {
                        alt43=1;
                    }


                }
                else if ( (LA43_0==RULE_ID) ) {
                    int LA43_3 = input.LA(2);

                    if ( (synpred65_InternalXemfs()) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2916:2: rule__EmfsContainer__ResourcesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__ResourcesAssignment_4_in_rule__EmfsContainer__Group__4__Impl6115);
            	    rule__EmfsContainer__ResourcesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2926:1: rule__EmfsContainer__Group__5 : rule__EmfsContainer__Group__5__Impl ;
    public final void rule__EmfsContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2930:1: ( rule__EmfsContainer__Group__5__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2931:2: rule__EmfsContainer__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__5__Impl_in_rule__EmfsContainer__Group__56146);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2937:1: rule__EmfsContainer__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__EmfsContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2941:1: ( ( ( ';' )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2942:1: ( ( ';' )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2942:1: ( ( ';' )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2943:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_5()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2944:1: ( ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==8) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred66_InternalXemfs()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2945:2: ';'
                    {
                    match(input,8,FollowSets000.FOLLOW_8_in_rule__EmfsContainer__Group__5__Impl6175); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2968:1: rule__EmfsContainer__Group_1__0 : rule__EmfsContainer__Group_1__0__Impl rule__EmfsContainer__Group_1__1 ;
    public final void rule__EmfsContainer__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2972:1: ( rule__EmfsContainer__Group_1__0__Impl rule__EmfsContainer__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2973:2: rule__EmfsContainer__Group_1__0__Impl rule__EmfsContainer__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_1__0__Impl_in_rule__EmfsContainer__Group_1__06220);
            rule__EmfsContainer__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_1__1_in_rule__EmfsContainer__Group_1__06223);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2980:1: rule__EmfsContainer__Group_1__0__Impl : ( '#' ) ;
    public final void rule__EmfsContainer__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2984:1: ( ( '#' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2985:1: ( '#' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2985:1: ( '#' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2986:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getNumberSignKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__EmfsContainer__Group_1__0__Impl6251); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2999:1: rule__EmfsContainer__Group_1__1 : rule__EmfsContainer__Group_1__1__Impl ;
    public final void rule__EmfsContainer__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3003:1: ( rule__EmfsContainer__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3004:2: rule__EmfsContainer__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_1__1__Impl_in_rule__EmfsContainer__Group_1__16282);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3010:1: rule__EmfsContainer__Group_1__1__Impl : ( ( rule__EmfsContainer__TagsAssignment_1_1 ) ) ;
    public final void rule__EmfsContainer__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3014:1: ( ( ( rule__EmfsContainer__TagsAssignment_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3015:1: ( ( rule__EmfsContainer__TagsAssignment_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3015:1: ( ( rule__EmfsContainer__TagsAssignment_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3016:1: ( rule__EmfsContainer__TagsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getTagsAssignment_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3017:1: ( rule__EmfsContainer__TagsAssignment_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3017:2: rule__EmfsContainer__TagsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__TagsAssignment_1_1_in_rule__EmfsContainer__Group_1__1__Impl6309);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3031:1: rule__EmfsContainer__Group_3__0 : rule__EmfsContainer__Group_3__0__Impl rule__EmfsContainer__Group_3__1 ;
    public final void rule__EmfsContainer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3035:1: ( rule__EmfsContainer__Group_3__0__Impl rule__EmfsContainer__Group_3__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3036:2: rule__EmfsContainer__Group_3__0__Impl rule__EmfsContainer__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__0__Impl_in_rule__EmfsContainer__Group_3__06343);
            rule__EmfsContainer__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__1_in_rule__EmfsContainer__Group_3__06346);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3043:1: rule__EmfsContainer__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EmfsContainer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3047:1: ( ( 'extends' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3048:1: ( 'extends' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3048:1: ( 'extends' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3049:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getExtendsKeyword_3_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EmfsContainer__Group_3__0__Impl6374); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3062:1: rule__EmfsContainer__Group_3__1 : rule__EmfsContainer__Group_3__1__Impl rule__EmfsContainer__Group_3__2 ;
    public final void rule__EmfsContainer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3066:1: ( rule__EmfsContainer__Group_3__1__Impl rule__EmfsContainer__Group_3__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3067:2: rule__EmfsContainer__Group_3__1__Impl rule__EmfsContainer__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__1__Impl_in_rule__EmfsContainer__Group_3__16405);
            rule__EmfsContainer__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__2_in_rule__EmfsContainer__Group_3__16408);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3074:1: rule__EmfsContainer__Group_3__1__Impl : ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) ) ;
    public final void rule__EmfsContainer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3078:1: ( ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3079:1: ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3079:1: ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3080:1: ( rule__EmfsContainer__ContentProviderAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getContentProviderAssignment_3_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3081:1: ( rule__EmfsContainer__ContentProviderAssignment_3_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3081:2: rule__EmfsContainer__ContentProviderAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__ContentProviderAssignment_3_1_in_rule__EmfsContainer__Group_3__1__Impl6435);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3091:1: rule__EmfsContainer__Group_3__2 : rule__EmfsContainer__Group_3__2__Impl ;
    public final void rule__EmfsContainer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3095:1: ( rule__EmfsContainer__Group_3__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3096:2: rule__EmfsContainer__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__2__Impl_in_rule__EmfsContainer__Group_3__26465);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3102:1: rule__EmfsContainer__Group_3__2__Impl : ( ';' ) ;
    public final void rule__EmfsContainer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3106:1: ( ( ';' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3107:1: ( ';' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3107:1: ( ';' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3108:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,8,FollowSets000.FOLLOW_8_in_rule__EmfsContainer__Group_3__2__Impl6493); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3127:1: rule__EmfsFile__Group__0 : rule__EmfsFile__Group__0__Impl rule__EmfsFile__Group__1 ;
    public final void rule__EmfsFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3131:1: ( rule__EmfsFile__Group__0__Impl rule__EmfsFile__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3132:2: rule__EmfsFile__Group__0__Impl rule__EmfsFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__0__Impl_in_rule__EmfsFile__Group__06530);
            rule__EmfsFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__1_in_rule__EmfsFile__Group__06533);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3139:1: rule__EmfsFile__Group__0__Impl : ( ( rule__EmfsFile__NameAssignment_0 ) ) ;
    public final void rule__EmfsFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3143:1: ( ( ( rule__EmfsFile__NameAssignment_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3144:1: ( ( rule__EmfsFile__NameAssignment_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3144:1: ( ( rule__EmfsFile__NameAssignment_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3145:1: ( rule__EmfsFile__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getNameAssignment_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3146:1: ( rule__EmfsFile__NameAssignment_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3146:2: rule__EmfsFile__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__NameAssignment_0_in_rule__EmfsFile__Group__0__Impl6560);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3156:1: rule__EmfsFile__Group__1 : rule__EmfsFile__Group__1__Impl rule__EmfsFile__Group__2 ;
    public final void rule__EmfsFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3160:1: ( rule__EmfsFile__Group__1__Impl rule__EmfsFile__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3161:2: rule__EmfsFile__Group__1__Impl rule__EmfsFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__1__Impl_in_rule__EmfsFile__Group__16590);
            rule__EmfsFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__2_in_rule__EmfsFile__Group__16593);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3168:1: rule__EmfsFile__Group__1__Impl : ( ( rule__EmfsFile__WriteableAssignment_1 )? ) ;
    public final void rule__EmfsFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3172:1: ( ( ( rule__EmfsFile__WriteableAssignment_1 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3173:1: ( ( rule__EmfsFile__WriteableAssignment_1 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3173:1: ( ( rule__EmfsFile__WriteableAssignment_1 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3174:1: ( rule__EmfsFile__WriteableAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getWriteableAssignment_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3175:1: ( rule__EmfsFile__WriteableAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3175:2: rule__EmfsFile__WriteableAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__WriteableAssignment_1_in_rule__EmfsFile__Group__1__Impl6620);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3185:1: rule__EmfsFile__Group__2 : rule__EmfsFile__Group__2__Impl rule__EmfsFile__Group__3 ;
    public final void rule__EmfsFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3189:1: ( rule__EmfsFile__Group__2__Impl rule__EmfsFile__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3190:2: rule__EmfsFile__Group__2__Impl rule__EmfsFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__2__Impl_in_rule__EmfsFile__Group__26651);
            rule__EmfsFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__3_in_rule__EmfsFile__Group__26654);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3197:1: rule__EmfsFile__Group__2__Impl : ( ( rule__EmfsFile__Group_2__0 )* ) ;
    public final void rule__EmfsFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3201:1: ( ( ( rule__EmfsFile__Group_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3202:1: ( ( rule__EmfsFile__Group_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3202:1: ( ( rule__EmfsFile__Group_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3203:1: ( rule__EmfsFile__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3204:1: ( rule__EmfsFile__Group_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==29) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3204:2: rule__EmfsFile__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_2__0_in_rule__EmfsFile__Group__2__Impl6681);
            	    rule__EmfsFile__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3214:1: rule__EmfsFile__Group__3 : rule__EmfsFile__Group__3__Impl rule__EmfsFile__Group__4 ;
    public final void rule__EmfsFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3218:1: ( rule__EmfsFile__Group__3__Impl rule__EmfsFile__Group__4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3219:2: rule__EmfsFile__Group__3__Impl rule__EmfsFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__3__Impl_in_rule__EmfsFile__Group__36712);
            rule__EmfsFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__4_in_rule__EmfsFile__Group__36715);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3226:1: rule__EmfsFile__Group__3__Impl : ( ( rule__EmfsFile__PropertiesAssignment_3 )* ) ;
    public final void rule__EmfsFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3230:1: ( ( ( rule__EmfsFile__PropertiesAssignment_3 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3231:1: ( ( rule__EmfsFile__PropertiesAssignment_3 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3231:1: ( ( rule__EmfsFile__PropertiesAssignment_3 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3232:1: ( rule__EmfsFile__PropertiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getPropertiesAssignment_3()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3233:1: ( rule__EmfsFile__PropertiesAssignment_3 )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3233:2: rule__EmfsFile__PropertiesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__PropertiesAssignment_3_in_rule__EmfsFile__Group__3__Impl6742);
            	    rule__EmfsFile__PropertiesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3243:1: rule__EmfsFile__Group__4 : rule__EmfsFile__Group__4__Impl ;
    public final void rule__EmfsFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3247:1: ( rule__EmfsFile__Group__4__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3248:2: rule__EmfsFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__4__Impl_in_rule__EmfsFile__Group__46773);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3254:1: rule__EmfsFile__Group__4__Impl : ( ( rule__EmfsFile__Alternatives_4 ) ) ;
    public final void rule__EmfsFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3258:1: ( ( ( rule__EmfsFile__Alternatives_4 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3259:1: ( ( rule__EmfsFile__Alternatives_4 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3259:1: ( ( rule__EmfsFile__Alternatives_4 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3260:1: ( rule__EmfsFile__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getAlternatives_4()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3261:1: ( rule__EmfsFile__Alternatives_4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3261:2: rule__EmfsFile__Alternatives_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Alternatives_4_in_rule__EmfsFile__Group__4__Impl6800);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3281:1: rule__EmfsFile__Group_2__0 : rule__EmfsFile__Group_2__0__Impl rule__EmfsFile__Group_2__1 ;
    public final void rule__EmfsFile__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3285:1: ( rule__EmfsFile__Group_2__0__Impl rule__EmfsFile__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3286:2: rule__EmfsFile__Group_2__0__Impl rule__EmfsFile__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_2__0__Impl_in_rule__EmfsFile__Group_2__06840);
            rule__EmfsFile__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_2__1_in_rule__EmfsFile__Group_2__06843);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3293:1: rule__EmfsFile__Group_2__0__Impl : ( '#' ) ;
    public final void rule__EmfsFile__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3297:1: ( ( '#' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3298:1: ( '#' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3298:1: ( '#' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3299:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__EmfsFile__Group_2__0__Impl6871); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3312:1: rule__EmfsFile__Group_2__1 : rule__EmfsFile__Group_2__1__Impl ;
    public final void rule__EmfsFile__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3316:1: ( rule__EmfsFile__Group_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3317:2: rule__EmfsFile__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_2__1__Impl_in_rule__EmfsFile__Group_2__16902);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3323:1: rule__EmfsFile__Group_2__1__Impl : ( ( rule__EmfsFile__TagsAssignment_2_1 ) ) ;
    public final void rule__EmfsFile__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3327:1: ( ( ( rule__EmfsFile__TagsAssignment_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3328:1: ( ( rule__EmfsFile__TagsAssignment_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3328:1: ( ( rule__EmfsFile__TagsAssignment_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3329:1: ( rule__EmfsFile__TagsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getTagsAssignment_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3330:1: ( rule__EmfsFile__TagsAssignment_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3330:2: rule__EmfsFile__TagsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__TagsAssignment_2_1_in_rule__EmfsFile__Group_2__1__Impl6929);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3344:1: rule__EmfsFile__Group_4_0__0 : rule__EmfsFile__Group_4_0__0__Impl rule__EmfsFile__Group_4_0__1 ;
    public final void rule__EmfsFile__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3348:1: ( rule__EmfsFile__Group_4_0__0__Impl rule__EmfsFile__Group_4_0__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3349:2: rule__EmfsFile__Group_4_0__0__Impl rule__EmfsFile__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__0__Impl_in_rule__EmfsFile__Group_4_0__06963);
            rule__EmfsFile__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__1_in_rule__EmfsFile__Group_4_0__06966);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3356:1: rule__EmfsFile__Group_4_0__0__Impl : ( '@' ) ;
    public final void rule__EmfsFile__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3360:1: ( ( '@' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3361:1: ( '@' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3361:1: ( '@' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3362:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getCommercialAtKeyword_4_0_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__EmfsFile__Group_4_0__0__Impl6994); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3375:1: rule__EmfsFile__Group_4_0__1 : rule__EmfsFile__Group_4_0__1__Impl rule__EmfsFile__Group_4_0__2 ;
    public final void rule__EmfsFile__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3379:1: ( rule__EmfsFile__Group_4_0__1__Impl rule__EmfsFile__Group_4_0__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3380:2: rule__EmfsFile__Group_4_0__1__Impl rule__EmfsFile__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__1__Impl_in_rule__EmfsFile__Group_4_0__17025);
            rule__EmfsFile__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__2_in_rule__EmfsFile__Group_4_0__17028);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3387:1: rule__EmfsFile__Group_4_0__1__Impl : ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) ) ;
    public final void rule__EmfsFile__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3391:1: ( ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3392:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3392:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3393:1: ( rule__EmfsFile__ContentProviderAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_0_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3394:1: ( rule__EmfsFile__ContentProviderAssignment_4_0_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3394:2: rule__EmfsFile__ContentProviderAssignment_4_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_0_1_in_rule__EmfsFile__Group_4_0__1__Impl7055);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3404:1: rule__EmfsFile__Group_4_0__2 : rule__EmfsFile__Group_4_0__2__Impl ;
    public final void rule__EmfsFile__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3408:1: ( rule__EmfsFile__Group_4_0__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3409:2: rule__EmfsFile__Group_4_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__2__Impl_in_rule__EmfsFile__Group_4_0__27085);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3415:1: rule__EmfsFile__Group_4_0__2__Impl : ( ';' ) ;
    public final void rule__EmfsFile__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3419:1: ( ( ';' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3420:1: ( ';' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3420:1: ( ';' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3421:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_0_2()); 
            }
            match(input,8,FollowSets000.FOLLOW_8_in_rule__EmfsFile__Group_4_0__2__Impl7113); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3440:1: rule__EmfsFile__Group_4_2__0 : rule__EmfsFile__Group_4_2__0__Impl rule__EmfsFile__Group_4_2__1 ;
    public final void rule__EmfsFile__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3444:1: ( rule__EmfsFile__Group_4_2__0__Impl rule__EmfsFile__Group_4_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3445:2: rule__EmfsFile__Group_4_2__0__Impl rule__EmfsFile__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_2__0__Impl_in_rule__EmfsFile__Group_4_2__07150);
            rule__EmfsFile__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_2__1_in_rule__EmfsFile__Group_4_2__07153);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3452:1: rule__EmfsFile__Group_4_2__0__Impl : ( ':' ) ;
    public final void rule__EmfsFile__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3456:1: ( ( ':' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3457:1: ( ':' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3457:1: ( ':' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3458:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getColonKeyword_4_2_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__EmfsFile__Group_4_2__0__Impl7181); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3471:1: rule__EmfsFile__Group_4_2__1 : rule__EmfsFile__Group_4_2__1__Impl ;
    public final void rule__EmfsFile__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3475:1: ( rule__EmfsFile__Group_4_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3476:2: rule__EmfsFile__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_2__1__Impl_in_rule__EmfsFile__Group_4_2__17212);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3482:1: rule__EmfsFile__Group_4_2__1__Impl : ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) ) ;
    public final void rule__EmfsFile__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3486:1: ( ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3487:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3487:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3488:1: ( rule__EmfsFile__ContentProviderAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3489:1: ( rule__EmfsFile__ContentProviderAssignment_4_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3489:2: rule__EmfsFile__ContentProviderAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_2_1_in_rule__EmfsFile__Group_4_2__1__Impl7239);
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


    // $ANTLR start "rule__PropertyValueString__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3503:1: rule__PropertyValueString__Group__0 : rule__PropertyValueString__Group__0__Impl rule__PropertyValueString__Group__1 ;
    public final void rule__PropertyValueString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3507:1: ( rule__PropertyValueString__Group__0__Impl rule__PropertyValueString__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3508:2: rule__PropertyValueString__Group__0__Impl rule__PropertyValueString__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__0__Impl_in_rule__PropertyValueString__Group__07273);
            rule__PropertyValueString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__1_in_rule__PropertyValueString__Group__07276);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3515:1: rule__PropertyValueString__Group__0__Impl : ( '$' ) ;
    public final void rule__PropertyValueString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3519:1: ( ( '$' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3520:1: ( '$' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3520:1: ( '$' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3521:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getDollarSignKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__PropertyValueString__Group__0__Impl7304); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3534:1: rule__PropertyValueString__Group__1 : rule__PropertyValueString__Group__1__Impl rule__PropertyValueString__Group__2 ;
    public final void rule__PropertyValueString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3538:1: ( rule__PropertyValueString__Group__1__Impl rule__PropertyValueString__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3539:2: rule__PropertyValueString__Group__1__Impl rule__PropertyValueString__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__1__Impl_in_rule__PropertyValueString__Group__17335);
            rule__PropertyValueString__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__2_in_rule__PropertyValueString__Group__17338);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3546:1: rule__PropertyValueString__Group__1__Impl : ( ( rule__PropertyValueString__Alternatives_1 ) ) ;
    public final void rule__PropertyValueString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3550:1: ( ( ( rule__PropertyValueString__Alternatives_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3551:1: ( ( rule__PropertyValueString__Alternatives_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3551:1: ( ( rule__PropertyValueString__Alternatives_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3552:1: ( rule__PropertyValueString__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getAlternatives_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3553:1: ( rule__PropertyValueString__Alternatives_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3553:2: rule__PropertyValueString__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Alternatives_1_in_rule__PropertyValueString__Group__1__Impl7365);
            rule__PropertyValueString__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getAlternatives_1()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3563:1: rule__PropertyValueString__Group__2 : rule__PropertyValueString__Group__2__Impl ;
    public final void rule__PropertyValueString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3567:1: ( rule__PropertyValueString__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3568:2: rule__PropertyValueString__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__2__Impl_in_rule__PropertyValueString__Group__27395);
            rule__PropertyValueString__Group__2__Impl();

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3574:1: rule__PropertyValueString__Group__2__Impl : ( ( rule__PropertyValueString__Group_2__0 )? ) ;
    public final void rule__PropertyValueString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3578:1: ( ( ( rule__PropertyValueString__Group_2__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3579:1: ( ( rule__PropertyValueString__Group_2__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3579:1: ( ( rule__PropertyValueString__Group_2__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3580:1: ( rule__PropertyValueString__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3581:1: ( rule__PropertyValueString__Group_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==36) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3581:2: rule__PropertyValueString__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_2__0_in_rule__PropertyValueString__Group__2__Impl7422);
                    rule__PropertyValueString__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getGroup_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__PropertyValueString__Group_1_1__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3597:1: rule__PropertyValueString__Group_1_1__0 : rule__PropertyValueString__Group_1_1__0__Impl rule__PropertyValueString__Group_1_1__1 ;
    public final void rule__PropertyValueString__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3601:1: ( rule__PropertyValueString__Group_1_1__0__Impl rule__PropertyValueString__Group_1_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3602:2: rule__PropertyValueString__Group_1_1__0__Impl rule__PropertyValueString__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__0__Impl_in_rule__PropertyValueString__Group_1_1__07459);
            rule__PropertyValueString__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__1_in_rule__PropertyValueString__Group_1_1__07462);
            rule__PropertyValueString__Group_1_1__1();

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
    // $ANTLR end "rule__PropertyValueString__Group_1_1__0"


    // $ANTLR start "rule__PropertyValueString__Group_1_1__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3609:1: rule__PropertyValueString__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__PropertyValueString__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3613:1: ( ( '{' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3614:1: ( '{' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3614:1: ( '{' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3615:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__PropertyValueString__Group_1_1__0__Impl7490); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group_1_1__0__Impl"


    // $ANTLR start "rule__PropertyValueString__Group_1_1__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3628:1: rule__PropertyValueString__Group_1_1__1 : rule__PropertyValueString__Group_1_1__1__Impl rule__PropertyValueString__Group_1_1__2 ;
    public final void rule__PropertyValueString__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3632:1: ( rule__PropertyValueString__Group_1_1__1__Impl rule__PropertyValueString__Group_1_1__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3633:2: rule__PropertyValueString__Group_1_1__1__Impl rule__PropertyValueString__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__1__Impl_in_rule__PropertyValueString__Group_1_1__17521);
            rule__PropertyValueString__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__2_in_rule__PropertyValueString__Group_1_1__17524);
            rule__PropertyValueString__Group_1_1__2();

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
    // $ANTLR end "rule__PropertyValueString__Group_1_1__1"


    // $ANTLR start "rule__PropertyValueString__Group_1_1__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3640:1: rule__PropertyValueString__Group_1_1__1__Impl : ( ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 ) ) ;
    public final void rule__PropertyValueString__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3644:1: ( ( ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3645:1: ( ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3645:1: ( ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3646:1: ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getPropertyNameAssignment_1_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3647:1: ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3647:2: rule__PropertyValueString__PropertyNameAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__PropertyNameAssignment_1_1_1_in_rule__PropertyValueString__Group_1_1__1__Impl7551);
            rule__PropertyValueString__PropertyNameAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getPropertyNameAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group_1_1__1__Impl"


    // $ANTLR start "rule__PropertyValueString__Group_1_1__2"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3657:1: rule__PropertyValueString__Group_1_1__2 : rule__PropertyValueString__Group_1_1__2__Impl ;
    public final void rule__PropertyValueString__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3661:1: ( rule__PropertyValueString__Group_1_1__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3662:2: rule__PropertyValueString__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__2__Impl_in_rule__PropertyValueString__Group_1_1__27581);
            rule__PropertyValueString__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__PropertyValueString__Group_1_1__2"


    // $ANTLR start "rule__PropertyValueString__Group_1_1__2__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3668:1: rule__PropertyValueString__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__PropertyValueString__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3672:1: ( ( '}' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3673:1: ( '}' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3673:1: ( '}' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3674:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getRightCurlyBracketKeyword_1_1_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__PropertyValueString__Group_1_1__2__Impl7609); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getRightCurlyBracketKeyword_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group_1_1__2__Impl"


    // $ANTLR start "rule__PropertyValueString__Group_2__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3693:1: rule__PropertyValueString__Group_2__0 : rule__PropertyValueString__Group_2__0__Impl rule__PropertyValueString__Group_2__1 ;
    public final void rule__PropertyValueString__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3697:1: ( rule__PropertyValueString__Group_2__0__Impl rule__PropertyValueString__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3698:2: rule__PropertyValueString__Group_2__0__Impl rule__PropertyValueString__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_2__0__Impl_in_rule__PropertyValueString__Group_2__07646);
            rule__PropertyValueString__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_2__1_in_rule__PropertyValueString__Group_2__07649);
            rule__PropertyValueString__Group_2__1();

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
    // $ANTLR end "rule__PropertyValueString__Group_2__0"


    // $ANTLR start "rule__PropertyValueString__Group_2__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3705:1: rule__PropertyValueString__Group_2__0__Impl : ( ':' ) ;
    public final void rule__PropertyValueString__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3709:1: ( ( ':' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3710:1: ( ':' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3710:1: ( ':' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3711:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getColonKeyword_2_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__PropertyValueString__Group_2__0__Impl7677); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getColonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group_2__0__Impl"


    // $ANTLR start "rule__PropertyValueString__Group_2__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3724:1: rule__PropertyValueString__Group_2__1 : rule__PropertyValueString__Group_2__1__Impl ;
    public final void rule__PropertyValueString__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3728:1: ( rule__PropertyValueString__Group_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3729:2: rule__PropertyValueString__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_2__1__Impl_in_rule__PropertyValueString__Group_2__17708);
            rule__PropertyValueString__Group_2__1__Impl();

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
    // $ANTLR end "rule__PropertyValueString__Group_2__1"


    // $ANTLR start "rule__PropertyValueString__Group_2__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3735:1: rule__PropertyValueString__Group_2__1__Impl : ( ( rule__PropertyValueString__DefaultValueAssignment_2_1 ) ) ;
    public final void rule__PropertyValueString__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3739:1: ( ( ( rule__PropertyValueString__DefaultValueAssignment_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3740:1: ( ( rule__PropertyValueString__DefaultValueAssignment_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3740:1: ( ( rule__PropertyValueString__DefaultValueAssignment_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3741:1: ( rule__PropertyValueString__DefaultValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getDefaultValueAssignment_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3742:1: ( rule__PropertyValueString__DefaultValueAssignment_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3742:2: rule__PropertyValueString__DefaultValueAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__DefaultValueAssignment_2_1_in_rule__PropertyValueString__Group_2__1__Impl7735);
            rule__PropertyValueString__DefaultValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getDefaultValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__Group_2__1__Impl"


    // $ANTLR start "rule__WrappingStringContentProvider__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3756:1: rule__WrappingStringContentProvider__Group__0 : rule__WrappingStringContentProvider__Group__0__Impl rule__WrappingStringContentProvider__Group__1 ;
    public final void rule__WrappingStringContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3760:1: ( rule__WrappingStringContentProvider__Group__0__Impl rule__WrappingStringContentProvider__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3761:2: rule__WrappingStringContentProvider__Group__0__Impl rule__WrappingStringContentProvider__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__0__Impl_in_rule__WrappingStringContentProvider__Group__07769);
            rule__WrappingStringContentProvider__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__1_in_rule__WrappingStringContentProvider__Group__07772);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3768:1: rule__WrappingStringContentProvider__Group__0__Impl : ( ( rule__WrappingStringContentProvider__PrefixAssignment_0 ) ) ;
    public final void rule__WrappingStringContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3772:1: ( ( ( rule__WrappingStringContentProvider__PrefixAssignment_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3773:1: ( ( rule__WrappingStringContentProvider__PrefixAssignment_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3773:1: ( ( rule__WrappingStringContentProvider__PrefixAssignment_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3774:1: ( rule__WrappingStringContentProvider__PrefixAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAssignment_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3775:1: ( rule__WrappingStringContentProvider__PrefixAssignment_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3775:2: rule__WrappingStringContentProvider__PrefixAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__PrefixAssignment_0_in_rule__WrappingStringContentProvider__Group__0__Impl7799);
            rule__WrappingStringContentProvider__PrefixAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAssignment_0()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3785:1: rule__WrappingStringContentProvider__Group__1 : rule__WrappingStringContentProvider__Group__1__Impl rule__WrappingStringContentProvider__Group__2 ;
    public final void rule__WrappingStringContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3789:1: ( rule__WrappingStringContentProvider__Group__1__Impl rule__WrappingStringContentProvider__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3790:2: rule__WrappingStringContentProvider__Group__1__Impl rule__WrappingStringContentProvider__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__1__Impl_in_rule__WrappingStringContentProvider__Group__17829);
            rule__WrappingStringContentProvider__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__2_in_rule__WrappingStringContentProvider__Group__17832);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3797:1: rule__WrappingStringContentProvider__Group__1__Impl : ( ( rule__WrappingStringContentProvider__Group_1__0 ) ) ;
    public final void rule__WrappingStringContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3801:1: ( ( ( rule__WrappingStringContentProvider__Group_1__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3802:1: ( ( rule__WrappingStringContentProvider__Group_1__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3802:1: ( ( rule__WrappingStringContentProvider__Group_1__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3803:1: ( rule__WrappingStringContentProvider__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3804:1: ( rule__WrappingStringContentProvider__Group_1__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3804:2: rule__WrappingStringContentProvider__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group_1__0_in_rule__WrappingStringContentProvider__Group__1__Impl7859);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3814:1: rule__WrappingStringContentProvider__Group__2 : rule__WrappingStringContentProvider__Group__2__Impl ;
    public final void rule__WrappingStringContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3818:1: ( rule__WrappingStringContentProvider__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3819:2: rule__WrappingStringContentProvider__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__2__Impl_in_rule__WrappingStringContentProvider__Group__27889);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3825:1: rule__WrappingStringContentProvider__Group__2__Impl : ( ( rule__WrappingStringContentProvider__SuffixAssignment_2 ) ) ;
    public final void rule__WrappingStringContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3829:1: ( ( ( rule__WrappingStringContentProvider__SuffixAssignment_2 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3830:1: ( ( rule__WrappingStringContentProvider__SuffixAssignment_2 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3830:1: ( ( rule__WrappingStringContentProvider__SuffixAssignment_2 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3831:1: ( rule__WrappingStringContentProvider__SuffixAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAssignment_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3832:1: ( rule__WrappingStringContentProvider__SuffixAssignment_2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3832:2: rule__WrappingStringContentProvider__SuffixAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__SuffixAssignment_2_in_rule__WrappingStringContentProvider__Group__2__Impl7916);
            rule__WrappingStringContentProvider__SuffixAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__WrappingStringContentProvider__Group_1__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3848:1: rule__WrappingStringContentProvider__Group_1__0 : rule__WrappingStringContentProvider__Group_1__0__Impl rule__WrappingStringContentProvider__Group_1__1 ;
    public final void rule__WrappingStringContentProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3852:1: ( rule__WrappingStringContentProvider__Group_1__0__Impl rule__WrappingStringContentProvider__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3853:2: rule__WrappingStringContentProvider__Group_1__0__Impl rule__WrappingStringContentProvider__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group_1__0__Impl_in_rule__WrappingStringContentProvider__Group_1__07952);
            rule__WrappingStringContentProvider__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group_1__1_in_rule__WrappingStringContentProvider__Group_1__07955);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3860:1: rule__WrappingStringContentProvider__Group_1__0__Impl : ( '@' ) ;
    public final void rule__WrappingStringContentProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3864:1: ( ( '@' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3865:1: ( '@' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3865:1: ( '@' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3866:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getCommercialAtKeyword_1_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__WrappingStringContentProvider__Group_1__0__Impl7983); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3879:1: rule__WrappingStringContentProvider__Group_1__1 : rule__WrappingStringContentProvider__Group_1__1__Impl ;
    public final void rule__WrappingStringContentProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3883:1: ( rule__WrappingStringContentProvider__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3884:2: rule__WrappingStringContentProvider__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group_1__1__Impl_in_rule__WrappingStringContentProvider__Group_1__18014);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3890:1: rule__WrappingStringContentProvider__Group_1__1__Impl : ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) ) ;
    public final void rule__WrappingStringContentProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3894:1: ( ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3895:1: ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3895:1: ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3896:1: ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderAssignment_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3897:1: ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3897:2: rule__WrappingStringContentProvider__ContentProviderAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__ContentProviderAssignment_1_1_in_rule__WrappingStringContentProvider__Group_1__1__Impl8041);
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


    // $ANTLR start "rule__PROPERTY_REF__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3911:1: rule__PROPERTY_REF__Group__0 : rule__PROPERTY_REF__Group__0__Impl rule__PROPERTY_REF__Group__1 ;
    public final void rule__PROPERTY_REF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3915:1: ( rule__PROPERTY_REF__Group__0__Impl rule__PROPERTY_REF__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3916:2: rule__PROPERTY_REF__Group__0__Impl rule__PROPERTY_REF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Group__0__Impl_in_rule__PROPERTY_REF__Group__08075);
            rule__PROPERTY_REF__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Group__1_in_rule__PROPERTY_REF__Group__08078);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3923:1: rule__PROPERTY_REF__Group__0__Impl : ( '$' ) ;
    public final void rule__PROPERTY_REF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3927:1: ( ( '$' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3928:1: ( '$' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3928:1: ( '$' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3929:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getDollarSignKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__PROPERTY_REF__Group__0__Impl8106); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3942:1: rule__PROPERTY_REF__Group__1 : rule__PROPERTY_REF__Group__1__Impl ;
    public final void rule__PROPERTY_REF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3946:1: ( rule__PROPERTY_REF__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3947:2: rule__PROPERTY_REF__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Group__1__Impl_in_rule__PROPERTY_REF__Group__18137);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3953:1: rule__PROPERTY_REF__Group__1__Impl : ( ( rule__PROPERTY_REF__Alternatives_1 ) ) ;
    public final void rule__PROPERTY_REF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3957:1: ( ( ( rule__PROPERTY_REF__Alternatives_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3958:1: ( ( rule__PROPERTY_REF__Alternatives_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3958:1: ( ( rule__PROPERTY_REF__Alternatives_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3959:1: ( rule__PROPERTY_REF__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getAlternatives_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3960:1: ( rule__PROPERTY_REF__Alternatives_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3960:2: rule__PROPERTY_REF__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Alternatives_1_in_rule__PROPERTY_REF__Group__1__Impl8164);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3974:1: rule__PROPERTY_REF__Group_1_0__0 : rule__PROPERTY_REF__Group_1_0__0__Impl rule__PROPERTY_REF__Group_1_0__1 ;
    public final void rule__PROPERTY_REF__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3978:1: ( rule__PROPERTY_REF__Group_1_0__0__Impl rule__PROPERTY_REF__Group_1_0__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3979:2: rule__PROPERTY_REF__Group_1_0__0__Impl rule__PROPERTY_REF__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Group_1_0__0__Impl_in_rule__PROPERTY_REF__Group_1_0__08198);
            rule__PROPERTY_REF__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Group_1_0__1_in_rule__PROPERTY_REF__Group_1_0__08201);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3986:1: rule__PROPERTY_REF__Group_1_0__0__Impl : ( '{' ) ;
    public final void rule__PROPERTY_REF__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3990:1: ( ( '{' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3991:1: ( '{' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3991:1: ( '{' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3992:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getLeftCurlyBracketKeyword_1_0_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__PROPERTY_REF__Group_1_0__0__Impl8229); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4005:1: rule__PROPERTY_REF__Group_1_0__1 : rule__PROPERTY_REF__Group_1_0__1__Impl rule__PROPERTY_REF__Group_1_0__2 ;
    public final void rule__PROPERTY_REF__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4009:1: ( rule__PROPERTY_REF__Group_1_0__1__Impl rule__PROPERTY_REF__Group_1_0__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4010:2: rule__PROPERTY_REF__Group_1_0__1__Impl rule__PROPERTY_REF__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Group_1_0__1__Impl_in_rule__PROPERTY_REF__Group_1_0__18260);
            rule__PROPERTY_REF__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Group_1_0__2_in_rule__PROPERTY_REF__Group_1_0__18263);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4017:1: rule__PROPERTY_REF__Group_1_0__1__Impl : ( ruleEmfsName ) ;
    public final void rule__PROPERTY_REF__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4021:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4022:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4022:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4023:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getEmfsNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__PROPERTY_REF__Group_1_0__1__Impl8290);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4034:1: rule__PROPERTY_REF__Group_1_0__2 : rule__PROPERTY_REF__Group_1_0__2__Impl ;
    public final void rule__PROPERTY_REF__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4038:1: ( rule__PROPERTY_REF__Group_1_0__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4039:2: rule__PROPERTY_REF__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PROPERTY_REF__Group_1_0__2__Impl_in_rule__PROPERTY_REF__Group_1_0__28319);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4045:1: rule__PROPERTY_REF__Group_1_0__2__Impl : ( '}' ) ;
    public final void rule__PROPERTY_REF__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4049:1: ( ( '}' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4050:1: ( '}' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4050:1: ( '}' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4051:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPROPERTY_REFAccess().getRightCurlyBracketKeyword_1_0_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__PROPERTY_REF__Group_1_0__2__Impl8347); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4070:1: rule__URL_HOST_NAME__Group__0 : rule__URL_HOST_NAME__Group__0__Impl rule__URL_HOST_NAME__Group__1 ;
    public final void rule__URL_HOST_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4074:1: ( rule__URL_HOST_NAME__Group__0__Impl rule__URL_HOST_NAME__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4075:2: rule__URL_HOST_NAME__Group__0__Impl rule__URL_HOST_NAME__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST_NAME__Group__0__Impl_in_rule__URL_HOST_NAME__Group__08384);
            rule__URL_HOST_NAME__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST_NAME__Group__1_in_rule__URL_HOST_NAME__Group__08387);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4082:1: rule__URL_HOST_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__URL_HOST_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4086:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4087:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4087:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4088:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__URL_HOST_NAME__Group__0__Impl8414); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4099:1: rule__URL_HOST_NAME__Group__1 : rule__URL_HOST_NAME__Group__1__Impl ;
    public final void rule__URL_HOST_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4103:1: ( rule__URL_HOST_NAME__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4104:2: rule__URL_HOST_NAME__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST_NAME__Group__1__Impl_in_rule__URL_HOST_NAME__Group__18443);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4110:1: rule__URL_HOST_NAME__Group__1__Impl : ( ( ( rule__URL_HOST_NAME__Group_1__0 ) ) ( ( rule__URL_HOST_NAME__Group_1__0 )* ) ) ;
    public final void rule__URL_HOST_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4114:1: ( ( ( ( rule__URL_HOST_NAME__Group_1__0 ) ) ( ( rule__URL_HOST_NAME__Group_1__0 )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4115:1: ( ( ( rule__URL_HOST_NAME__Group_1__0 ) ) ( ( rule__URL_HOST_NAME__Group_1__0 )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4115:1: ( ( ( rule__URL_HOST_NAME__Group_1__0 ) ) ( ( rule__URL_HOST_NAME__Group_1__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4116:1: ( ( rule__URL_HOST_NAME__Group_1__0 ) ) ( ( rule__URL_HOST_NAME__Group_1__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4116:1: ( ( rule__URL_HOST_NAME__Group_1__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4117:1: ( rule__URL_HOST_NAME__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4118:1: ( rule__URL_HOST_NAME__Group_1__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4118:2: rule__URL_HOST_NAME__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST_NAME__Group_1__0_in_rule__URL_HOST_NAME__Group__1__Impl8472);
            rule__URL_HOST_NAME__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOST_NAMEAccess().getGroup_1()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4121:1: ( ( rule__URL_HOST_NAME__Group_1__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4122:1: ( rule__URL_HOST_NAME__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4123:1: ( rule__URL_HOST_NAME__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==31) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4123:2: rule__URL_HOST_NAME__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__URL_HOST_NAME__Group_1__0_in_rule__URL_HOST_NAME__Group__1__Impl8484);
            	    rule__URL_HOST_NAME__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4138:1: rule__URL_HOST_NAME__Group_1__0 : rule__URL_HOST_NAME__Group_1__0__Impl rule__URL_HOST_NAME__Group_1__1 ;
    public final void rule__URL_HOST_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4142:1: ( rule__URL_HOST_NAME__Group_1__0__Impl rule__URL_HOST_NAME__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4143:2: rule__URL_HOST_NAME__Group_1__0__Impl rule__URL_HOST_NAME__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST_NAME__Group_1__0__Impl_in_rule__URL_HOST_NAME__Group_1__08521);
            rule__URL_HOST_NAME__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST_NAME__Group_1__1_in_rule__URL_HOST_NAME__Group_1__08524);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4150:1: rule__URL_HOST_NAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__URL_HOST_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4154:1: ( ( '.' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4155:1: ( '.' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4155:1: ( '.' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4156:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__URL_HOST_NAME__Group_1__0__Impl8552); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4169:1: rule__URL_HOST_NAME__Group_1__1 : rule__URL_HOST_NAME__Group_1__1__Impl ;
    public final void rule__URL_HOST_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4173:1: ( rule__URL_HOST_NAME__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4174:2: rule__URL_HOST_NAME__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST_NAME__Group_1__1__Impl_in_rule__URL_HOST_NAME__Group_1__18583);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4180:1: rule__URL_HOST_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__URL_HOST_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4184:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4185:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4185:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4186:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOST_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__URL_HOST_NAME__Group_1__1__Impl8610); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4201:1: rule__URL_HOST__Group__0 : rule__URL_HOST__Group__0__Impl rule__URL_HOST__Group__1 ;
    public final void rule__URL_HOST__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4205:1: ( rule__URL_HOST__Group__0__Impl rule__URL_HOST__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4206:2: rule__URL_HOST__Group__0__Impl rule__URL_HOST__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__0__Impl_in_rule__URL_HOST__Group__08643);
            rule__URL_HOST__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__1_in_rule__URL_HOST__Group__08646);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4213:1: rule__URL_HOST__Group__0__Impl : ( '//' ) ;
    public final void rule__URL_HOST__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4217:1: ( ( '//' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4218:1: ( '//' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4218:1: ( '//' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4219:1: '//'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getSolidusSolidusKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__URL_HOST__Group__0__Impl8674); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4232:1: rule__URL_HOST__Group__1 : rule__URL_HOST__Group__1__Impl ;
    public final void rule__URL_HOST__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4236:1: ( rule__URL_HOST__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4237:2: rule__URL_HOST__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__1__Impl_in_rule__URL_HOST__Group__18705);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4243:1: rule__URL_HOST__Group__1__Impl : ( ( rule__URL_HOST__Alternatives_1 ) ) ;
    public final void rule__URL_HOST__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4247:1: ( ( ( rule__URL_HOST__Alternatives_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4248:1: ( ( rule__URL_HOST__Alternatives_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4248:1: ( ( rule__URL_HOST__Alternatives_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4249:1: ( rule__URL_HOST__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getAlternatives_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4250:1: ( rule__URL_HOST__Alternatives_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4250:2: rule__URL_HOST__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Alternatives_1_in_rule__URL_HOST__Group__1__Impl8732);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4264:1: rule__URL_HOST__Group_1_0__0 : rule__URL_HOST__Group_1_0__0__Impl rule__URL_HOST__Group_1_0__1 ;
    public final void rule__URL_HOST__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4268:1: ( rule__URL_HOST__Group_1_0__0__Impl rule__URL_HOST__Group_1_0__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4269:2: rule__URL_HOST__Group_1_0__0__Impl rule__URL_HOST__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_1_0__0__Impl_in_rule__URL_HOST__Group_1_0__08766);
            rule__URL_HOST__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_1_0__1_in_rule__URL_HOST__Group_1_0__08769);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4276:1: rule__URL_HOST__Group_1_0__0__Impl : ( ruleURL_HOST_NAME ) ;
    public final void rule__URL_HOST__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4280:1: ( ( ruleURL_HOST_NAME ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4281:1: ( ruleURL_HOST_NAME )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4281:1: ( ruleURL_HOST_NAME )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4282:1: ruleURL_HOST_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getURL_HOST_NAMEParserRuleCall_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_NAME_in_rule__URL_HOST__Group_1_0__0__Impl8796);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4293:1: rule__URL_HOST__Group_1_0__1 : rule__URL_HOST__Group_1_0__1__Impl ;
    public final void rule__URL_HOST__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4297:1: ( rule__URL_HOST__Group_1_0__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4298:2: rule__URL_HOST__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_1_0__1__Impl_in_rule__URL_HOST__Group_1_0__18825);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4304:1: rule__URL_HOST__Group_1_0__1__Impl : ( ( rule__URL_HOST__Group_1_0_1__0 )? ) ;
    public final void rule__URL_HOST__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4308:1: ( ( ( rule__URL_HOST__Group_1_0_1__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4309:1: ( ( rule__URL_HOST__Group_1_0_1__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4309:1: ( ( rule__URL_HOST__Group_1_0_1__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4310:1: ( rule__URL_HOST__Group_1_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getGroup_1_0_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4311:1: ( rule__URL_HOST__Group_1_0_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4311:2: rule__URL_HOST__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_1_0_1__0_in_rule__URL_HOST__Group_1_0__1__Impl8852);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4325:1: rule__URL_HOST__Group_1_0_1__0 : rule__URL_HOST__Group_1_0_1__0__Impl rule__URL_HOST__Group_1_0_1__1 ;
    public final void rule__URL_HOST__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4329:1: ( rule__URL_HOST__Group_1_0_1__0__Impl rule__URL_HOST__Group_1_0_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4330:2: rule__URL_HOST__Group_1_0_1__0__Impl rule__URL_HOST__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_1_0_1__0__Impl_in_rule__URL_HOST__Group_1_0_1__08887);
            rule__URL_HOST__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_1_0_1__1_in_rule__URL_HOST__Group_1_0_1__08890);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4337:1: rule__URL_HOST__Group_1_0_1__0__Impl : ( ':' ) ;
    public final void rule__URL_HOST__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4341:1: ( ( ':' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4342:1: ( ':' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4342:1: ( ':' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4343:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getColonKeyword_1_0_1_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__URL_HOST__Group_1_0_1__0__Impl8918); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4356:1: rule__URL_HOST__Group_1_0_1__1 : rule__URL_HOST__Group_1_0_1__1__Impl ;
    public final void rule__URL_HOST__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4360:1: ( rule__URL_HOST__Group_1_0_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4361:2: rule__URL_HOST__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_1_0_1__1__Impl_in_rule__URL_HOST__Group_1_0_1__18949);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4367:1: rule__URL_HOST__Group_1_0_1__1__Impl : ( ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) ) ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* ) ) ;
    public final void rule__URL_HOST__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4371:1: ( ( ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) ) ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4372:1: ( ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) ) ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4372:1: ( ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) ) ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4373:1: ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) ) ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4373:1: ( ( rule__URL_HOST__Alternatives_1_0_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4374:1: ( rule__URL_HOST__Alternatives_1_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getAlternatives_1_0_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4375:1: ( rule__URL_HOST__Alternatives_1_0_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4375:2: rule__URL_HOST__Alternatives_1_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Alternatives_1_0_1_1_in_rule__URL_HOST__Group_1_0_1__1__Impl8978);
            rule__URL_HOST__Alternatives_1_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getAlternatives_1_0_1_1()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4378:1: ( ( rule__URL_HOST__Alternatives_1_0_1_1 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4379:1: ( rule__URL_HOST__Alternatives_1_0_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getAlternatives_1_0_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4380:1: ( rule__URL_HOST__Alternatives_1_0_1_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=13 && LA51_0<=22)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4380:2: rule__URL_HOST__Alternatives_1_0_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Alternatives_1_0_1_1_in_rule__URL_HOST__Group_1_0_1__1__Impl8990);
            	    rule__URL_HOST__Alternatives_1_0_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4395:1: rule__URL_PATH__Group__0 : rule__URL_PATH__Group__0__Impl rule__URL_PATH__Group__1 ;
    public final void rule__URL_PATH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4399:1: ( rule__URL_PATH__Group__0__Impl rule__URL_PATH__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4400:2: rule__URL_PATH__Group__0__Impl rule__URL_PATH__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__0__Impl_in_rule__URL_PATH__Group__09027);
            rule__URL_PATH__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__1_in_rule__URL_PATH__Group__09030);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4407:1: rule__URL_PATH__Group__0__Impl : ( '/' ) ;
    public final void rule__URL_PATH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4411:1: ( ( '/' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4412:1: ( '/' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4412:1: ( '/' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4413:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getSolidusKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__URL_PATH__Group__0__Impl9058); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4426:1: rule__URL_PATH__Group__1 : rule__URL_PATH__Group__1__Impl rule__URL_PATH__Group__2 ;
    public final void rule__URL_PATH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4430:1: ( rule__URL_PATH__Group__1__Impl rule__URL_PATH__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4431:2: rule__URL_PATH__Group__1__Impl rule__URL_PATH__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__1__Impl_in_rule__URL_PATH__Group__19089);
            rule__URL_PATH__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__2_in_rule__URL_PATH__Group__19092);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4438:1: rule__URL_PATH__Group__1__Impl : ( ( rule__URL_PATH__Alternatives_1 )* ) ;
    public final void rule__URL_PATH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4442:1: ( ( ( rule__URL_PATH__Alternatives_1 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4443:1: ( ( rule__URL_PATH__Alternatives_1 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4443:1: ( ( rule__URL_PATH__Alternatives_1 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4444:1: ( rule__URL_PATH__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getAlternatives_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4445:1: ( rule__URL_PATH__Alternatives_1 )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4445:2: rule__URL_PATH__Alternatives_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Alternatives_1_in_rule__URL_PATH__Group__1__Impl9119);
            	    rule__URL_PATH__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4455:1: rule__URL_PATH__Group__2 : rule__URL_PATH__Group__2__Impl ;
    public final void rule__URL_PATH__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4459:1: ( rule__URL_PATH__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4460:2: rule__URL_PATH__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__2__Impl_in_rule__URL_PATH__Group__29150);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4466:1: rule__URL_PATH__Group__2__Impl : ( ( rule__URL_PATH__Alternatives_2 ) ) ;
    public final void rule__URL_PATH__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4470:1: ( ( ( rule__URL_PATH__Alternatives_2 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4471:1: ( ( rule__URL_PATH__Alternatives_2 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4471:1: ( ( rule__URL_PATH__Alternatives_2 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4472:1: ( rule__URL_PATH__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getAlternatives_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4473:1: ( rule__URL_PATH__Alternatives_2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4473:2: rule__URL_PATH__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Alternatives_2_in_rule__URL_PATH__Group__2__Impl9177);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4489:1: rule__URL_PATH__Group_1_1__0 : rule__URL_PATH__Group_1_1__0__Impl rule__URL_PATH__Group_1_1__1 ;
    public final void rule__URL_PATH__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4493:1: ( rule__URL_PATH__Group_1_1__0__Impl rule__URL_PATH__Group_1_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4494:2: rule__URL_PATH__Group_1_1__0__Impl rule__URL_PATH__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group_1_1__0__Impl_in_rule__URL_PATH__Group_1_1__09213);
            rule__URL_PATH__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group_1_1__1_in_rule__URL_PATH__Group_1_1__09216);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4501:1: rule__URL_PATH__Group_1_1__0__Impl : ( rulePROPERTY_REF ) ;
    public final void rule__URL_PATH__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4505:1: ( ( rulePROPERTY_REF ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4506:1: ( rulePROPERTY_REF )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4506:1: ( rulePROPERTY_REF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4507:1: rulePROPERTY_REF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getPROPERTY_REFParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_rule__URL_PATH__Group_1_1__0__Impl9243);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4518:1: rule__URL_PATH__Group_1_1__1 : rule__URL_PATH__Group_1_1__1__Impl ;
    public final void rule__URL_PATH__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4522:1: ( rule__URL_PATH__Group_1_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4523:2: rule__URL_PATH__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group_1_1__1__Impl_in_rule__URL_PATH__Group_1_1__19272);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4529:1: rule__URL_PATH__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__URL_PATH__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4533:1: ( ( '/' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4534:1: ( '/' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4534:1: ( '/' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4535:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getSolidusKeyword_1_1_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__URL_PATH__Group_1_1__1__Impl9300); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4552:1: rule__URL__Group__0 : rule__URL__Group__0__Impl rule__URL__Group__1 ;
    public final void rule__URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4556:1: ( rule__URL__Group__0__Impl rule__URL__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4557:2: rule__URL__Group__0__Impl rule__URL__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__0__Impl_in_rule__URL__Group__09335);
            rule__URL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__1_in_rule__URL__Group__09338);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4564:1: rule__URL__Group__0__Impl : ( ruleURL_SCHEME ) ;
    public final void rule__URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4568:1: ( ( ruleURL_SCHEME ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4569:1: ( ruleURL_SCHEME )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4569:1: ( ruleURL_SCHEME )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4570:1: ruleURL_SCHEME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getURL_SCHEMEParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_SCHEME_in_rule__URL__Group__0__Impl9365);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4581:1: rule__URL__Group__1 : rule__URL__Group__1__Impl rule__URL__Group__2 ;
    public final void rule__URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4585:1: ( rule__URL__Group__1__Impl rule__URL__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4586:2: rule__URL__Group__1__Impl rule__URL__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__1__Impl_in_rule__URL__Group__19394);
            rule__URL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__2_in_rule__URL__Group__19397);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4593:1: rule__URL__Group__1__Impl : ( ':' ) ;
    public final void rule__URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4597:1: ( ( ':' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4598:1: ( ':' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4598:1: ( ':' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4599:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getColonKeyword_1()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__URL__Group__1__Impl9425); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4612:1: rule__URL__Group__2 : rule__URL__Group__2__Impl rule__URL__Group__3 ;
    public final void rule__URL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4616:1: ( rule__URL__Group__2__Impl rule__URL__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4617:2: rule__URL__Group__2__Impl rule__URL__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__2__Impl_in_rule__URL__Group__29456);
            rule__URL__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__3_in_rule__URL__Group__29459);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4624:1: rule__URL__Group__2__Impl : ( ( ruleURL_HOST )? ) ;
    public final void rule__URL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4628:1: ( ( ( ruleURL_HOST )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4629:1: ( ( ruleURL_HOST )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4629:1: ( ( ruleURL_HOST )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4630:1: ( ruleURL_HOST )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getURL_HOSTParserRuleCall_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4631:1: ( ruleURL_HOST )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==39) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4631:3: ruleURL_HOST
                    {
                    pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_in_rule__URL__Group__2__Impl9487);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4641:1: rule__URL__Group__3 : rule__URL__Group__3__Impl ;
    public final void rule__URL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4645:1: ( rule__URL__Group__3__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4646:2: rule__URL__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__3__Impl_in_rule__URL__Group__39518);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4652:1: rule__URL__Group__3__Impl : ( ruleURL_PATH ) ;
    public final void rule__URL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4656:1: ( ( ruleURL_PATH ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4657:1: ( ruleURL_PATH )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4657:1: ( ruleURL_PATH )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4658:1: ruleURL_PATH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getURL_PATHParserRuleCall_3()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_rule__URL__Group__3__Impl9545);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4677:1: rule__GitContentRef__Group__0 : rule__GitContentRef__Group__0__Impl rule__GitContentRef__Group__1 ;
    public final void rule__GitContentRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4681:1: ( rule__GitContentRef__Group__0__Impl rule__GitContentRef__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4682:2: rule__GitContentRef__Group__0__Impl rule__GitContentRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__0__Impl_in_rule__GitContentRef__Group__09582);
            rule__GitContentRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__1_in_rule__GitContentRef__Group__09585);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4689:1: rule__GitContentRef__Group__0__Impl : ( 'git' ) ;
    public final void rule__GitContentRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4693:1: ( ( 'git' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4694:1: ( 'git' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4694:1: ( 'git' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4695:1: 'git'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getGitKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__GitContentRef__Group__0__Impl9613); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4708:1: rule__GitContentRef__Group__1 : rule__GitContentRef__Group__1__Impl rule__GitContentRef__Group__2 ;
    public final void rule__GitContentRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4712:1: ( rule__GitContentRef__Group__1__Impl rule__GitContentRef__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4713:2: rule__GitContentRef__Group__1__Impl rule__GitContentRef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__1__Impl_in_rule__GitContentRef__Group__19644);
            rule__GitContentRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__2_in_rule__GitContentRef__Group__19647);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4720:1: rule__GitContentRef__Group__1__Impl : ( '@' ) ;
    public final void rule__GitContentRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4724:1: ( ( '@' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4725:1: ( '@' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4725:1: ( '@' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4726:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getCommercialAtKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__GitContentRef__Group__1__Impl9675); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4739:1: rule__GitContentRef__Group__2 : rule__GitContentRef__Group__2__Impl rule__GitContentRef__Group__3 ;
    public final void rule__GitContentRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4743:1: ( rule__GitContentRef__Group__2__Impl rule__GitContentRef__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4744:2: rule__GitContentRef__Group__2__Impl rule__GitContentRef__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__2__Impl_in_rule__GitContentRef__Group__29706);
            rule__GitContentRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__3_in_rule__GitContentRef__Group__29709);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4751:1: rule__GitContentRef__Group__2__Impl : ( ( rule__GitContentRef__Alternatives_2 ) ) ;
    public final void rule__GitContentRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4755:1: ( ( ( rule__GitContentRef__Alternatives_2 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4756:1: ( ( rule__GitContentRef__Alternatives_2 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4756:1: ( ( rule__GitContentRef__Alternatives_2 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4757:1: ( rule__GitContentRef__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getAlternatives_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4758:1: ( rule__GitContentRef__Alternatives_2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4758:2: rule__GitContentRef__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Alternatives_2_in_rule__GitContentRef__Group__2__Impl9736);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4768:1: rule__GitContentRef__Group__3 : rule__GitContentRef__Group__3__Impl rule__GitContentRef__Group__4 ;
    public final void rule__GitContentRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4772:1: ( rule__GitContentRef__Group__3__Impl rule__GitContentRef__Group__4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4773:2: rule__GitContentRef__Group__3__Impl rule__GitContentRef__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__3__Impl_in_rule__GitContentRef__Group__39766);
            rule__GitContentRef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__4_in_rule__GitContentRef__Group__39769);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4780:1: rule__GitContentRef__Group__3__Impl : ( '/' ) ;
    public final void rule__GitContentRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4784:1: ( ( '/' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4785:1: ( '/' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4785:1: ( '/' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4786:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getSolidusKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__GitContentRef__Group__3__Impl9797); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4799:1: rule__GitContentRef__Group__4 : rule__GitContentRef__Group__4__Impl rule__GitContentRef__Group__5 ;
    public final void rule__GitContentRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4803:1: ( rule__GitContentRef__Group__4__Impl rule__GitContentRef__Group__5 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4804:2: rule__GitContentRef__Group__4__Impl rule__GitContentRef__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__4__Impl_in_rule__GitContentRef__Group__49828);
            rule__GitContentRef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__5_in_rule__GitContentRef__Group__49831);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4811:1: rule__GitContentRef__Group__4__Impl : ( ( rule__GitContentRef__RepoAssignment_4 ) ) ;
    public final void rule__GitContentRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4815:1: ( ( ( rule__GitContentRef__RepoAssignment_4 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4816:1: ( ( rule__GitContentRef__RepoAssignment_4 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4816:1: ( ( rule__GitContentRef__RepoAssignment_4 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4817:1: ( rule__GitContentRef__RepoAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getRepoAssignment_4()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4818:1: ( rule__GitContentRef__RepoAssignment_4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4818:2: rule__GitContentRef__RepoAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__RepoAssignment_4_in_rule__GitContentRef__Group__4__Impl9858);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4828:1: rule__GitContentRef__Group__5 : rule__GitContentRef__Group__5__Impl ;
    public final void rule__GitContentRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4832:1: ( rule__GitContentRef__Group__5__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4833:2: rule__GitContentRef__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__5__Impl_in_rule__GitContentRef__Group__59888);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4839:1: rule__GitContentRef__Group__5__Impl : ( ( rule__GitContentRef__PathAssignment_5 )? ) ;
    public final void rule__GitContentRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4843:1: ( ( ( rule__GitContentRef__PathAssignment_5 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4844:1: ( ( rule__GitContentRef__PathAssignment_5 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4844:1: ( ( rule__GitContentRef__PathAssignment_5 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4845:1: ( rule__GitContentRef__PathAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getPathAssignment_5()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4846:1: ( rule__GitContentRef__PathAssignment_5 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==27) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4846:2: rule__GitContentRef__PathAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__PathAssignment_5_in_rule__GitContentRef__Group__5__Impl9915);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4868:1: rule__GitContentRef__Group_2_0__0 : rule__GitContentRef__Group_2_0__0__Impl rule__GitContentRef__Group_2_0__1 ;
    public final void rule__GitContentRef__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4872:1: ( rule__GitContentRef__Group_2_0__0__Impl rule__GitContentRef__Group_2_0__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4873:2: rule__GitContentRef__Group_2_0__0__Impl rule__GitContentRef__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0__0__Impl_in_rule__GitContentRef__Group_2_0__09958);
            rule__GitContentRef__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0__1_in_rule__GitContentRef__Group_2_0__09961);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4880:1: rule__GitContentRef__Group_2_0__0__Impl : ( ( rule__GitContentRef__HostAssignment_2_0_0 ) ) ;
    public final void rule__GitContentRef__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4884:1: ( ( ( rule__GitContentRef__HostAssignment_2_0_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4885:1: ( ( rule__GitContentRef__HostAssignment_2_0_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4885:1: ( ( rule__GitContentRef__HostAssignment_2_0_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4886:1: ( rule__GitContentRef__HostAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getHostAssignment_2_0_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4887:1: ( rule__GitContentRef__HostAssignment_2_0_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4887:2: rule__GitContentRef__HostAssignment_2_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__HostAssignment_2_0_0_in_rule__GitContentRef__Group_2_0__0__Impl9988);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4897:1: rule__GitContentRef__Group_2_0__1 : rule__GitContentRef__Group_2_0__1__Impl ;
    public final void rule__GitContentRef__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4901:1: ( rule__GitContentRef__Group_2_0__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4902:2: rule__GitContentRef__Group_2_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0__1__Impl_in_rule__GitContentRef__Group_2_0__110018);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4908:1: rule__GitContentRef__Group_2_0__1__Impl : ( ( rule__GitContentRef__Group_2_0_1__0 )? ) ;
    public final void rule__GitContentRef__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4912:1: ( ( ( rule__GitContentRef__Group_2_0_1__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4913:1: ( ( rule__GitContentRef__Group_2_0_1__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4913:1: ( ( rule__GitContentRef__Group_2_0_1__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4914:1: ( rule__GitContentRef__Group_2_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getGroup_2_0_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4915:1: ( rule__GitContentRef__Group_2_0_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==36) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4915:2: rule__GitContentRef__Group_2_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0_1__0_in_rule__GitContentRef__Group_2_0__1__Impl10045);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4929:1: rule__GitContentRef__Group_2_0_1__0 : rule__GitContentRef__Group_2_0_1__0__Impl rule__GitContentRef__Group_2_0_1__1 ;
    public final void rule__GitContentRef__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4933:1: ( rule__GitContentRef__Group_2_0_1__0__Impl rule__GitContentRef__Group_2_0_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4934:2: rule__GitContentRef__Group_2_0_1__0__Impl rule__GitContentRef__Group_2_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0_1__0__Impl_in_rule__GitContentRef__Group_2_0_1__010080);
            rule__GitContentRef__Group_2_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0_1__1_in_rule__GitContentRef__Group_2_0_1__010083);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4941:1: rule__GitContentRef__Group_2_0_1__0__Impl : ( ':' ) ;
    public final void rule__GitContentRef__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4945:1: ( ( ':' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4946:1: ( ':' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4946:1: ( ':' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4947:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getColonKeyword_2_0_1_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__GitContentRef__Group_2_0_1__0__Impl10111); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4960:1: rule__GitContentRef__Group_2_0_1__1 : rule__GitContentRef__Group_2_0_1__1__Impl ;
    public final void rule__GitContentRef__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4964:1: ( rule__GitContentRef__Group_2_0_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4965:2: rule__GitContentRef__Group_2_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0_1__1__Impl_in_rule__GitContentRef__Group_2_0_1__110142);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4971:1: rule__GitContentRef__Group_2_0_1__1__Impl : ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) ) ;
    public final void rule__GitContentRef__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4975:1: ( ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4976:1: ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4976:1: ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4977:1: ( rule__GitContentRef__OwnerAssignment_2_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getOwnerAssignment_2_0_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4978:1: ( rule__GitContentRef__OwnerAssignment_2_0_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4978:2: rule__GitContentRef__OwnerAssignment_2_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__OwnerAssignment_2_0_1_1_in_rule__GitContentRef__Group_2_0_1__1__Impl10169);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4992:1: rule__DotClasspathFileContentProvider__Group__0 : rule__DotClasspathFileContentProvider__Group__0__Impl rule__DotClasspathFileContentProvider__Group__1 ;
    public final void rule__DotClasspathFileContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4996:1: ( rule__DotClasspathFileContentProvider__Group__0__Impl rule__DotClasspathFileContentProvider__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4997:2: rule__DotClasspathFileContentProvider__Group__0__Impl rule__DotClasspathFileContentProvider__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__0__Impl_in_rule__DotClasspathFileContentProvider__Group__010203);
            rule__DotClasspathFileContentProvider__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__1_in_rule__DotClasspathFileContentProvider__Group__010206);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5004:1: rule__DotClasspathFileContentProvider__Group__0__Impl : ( 'dot.classpath' ) ;
    public final void rule__DotClasspathFileContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5008:1: ( ( 'dot.classpath' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5009:1: ( 'dot.classpath' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5009:1: ( 'dot.classpath' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5010:1: 'dot.classpath'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getDotClasspathKeyword_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__DotClasspathFileContentProvider__Group__0__Impl10234); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5023:1: rule__DotClasspathFileContentProvider__Group__1 : rule__DotClasspathFileContentProvider__Group__1__Impl rule__DotClasspathFileContentProvider__Group__2 ;
    public final void rule__DotClasspathFileContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5027:1: ( rule__DotClasspathFileContentProvider__Group__1__Impl rule__DotClasspathFileContentProvider__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5028:2: rule__DotClasspathFileContentProvider__Group__1__Impl rule__DotClasspathFileContentProvider__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__1__Impl_in_rule__DotClasspathFileContentProvider__Group__110265);
            rule__DotClasspathFileContentProvider__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__2_in_rule__DotClasspathFileContentProvider__Group__110268);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5035:1: rule__DotClasspathFileContentProvider__Group__1__Impl : ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) ) ;
    public final void rule__DotClasspathFileContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5039:1: ( ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5040:1: ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5040:1: ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5041:1: ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5041:1: ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5042:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAssignment_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5043:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5043:2: rule__DotClasspathFileContentProvider__EntriesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__EntriesAssignment_1_in_rule__DotClasspathFileContentProvider__Group__1__Impl10297);
            rule__DotClasspathFileContentProvider__EntriesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAssignment_1()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5046:1: ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5047:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAssignment_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5048:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=23 && LA56_0<=26)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5048:2: rule__DotClasspathFileContentProvider__EntriesAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__EntriesAssignment_1_in_rule__DotClasspathFileContentProvider__Group__1__Impl10309);
            	    rule__DotClasspathFileContentProvider__EntriesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5059:1: rule__DotClasspathFileContentProvider__Group__2 : rule__DotClasspathFileContentProvider__Group__2__Impl ;
    public final void rule__DotClasspathFileContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5063:1: ( rule__DotClasspathFileContentProvider__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5064:2: rule__DotClasspathFileContentProvider__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__2__Impl_in_rule__DotClasspathFileContentProvider__Group__210342);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5070:1: rule__DotClasspathFileContentProvider__Group__2__Impl : ( ';' ) ;
    public final void rule__DotClasspathFileContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5074:1: ( ( ';' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5075:1: ( ';' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5075:1: ( ';' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5076:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getSemicolonKeyword_2()); 
            }
            match(input,8,FollowSets000.FOLLOW_8_in_rule__DotClasspathFileContentProvider__Group__2__Impl10370); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5095:1: rule__CLASSPATH_ENTRY_PATH__Group__0 : rule__CLASSPATH_ENTRY_PATH__Group__0__Impl rule__CLASSPATH_ENTRY_PATH__Group__1 ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5099:1: ( rule__CLASSPATH_ENTRY_PATH__Group__0__Impl rule__CLASSPATH_ENTRY_PATH__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5100:2: rule__CLASSPATH_ENTRY_PATH__Group__0__Impl rule__CLASSPATH_ENTRY_PATH__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__0__Impl_in_rule__CLASSPATH_ENTRY_PATH__Group__010407);
            rule__CLASSPATH_ENTRY_PATH__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__1_in_rule__CLASSPATH_ENTRY_PATH__Group__010410);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5107:1: rule__CLASSPATH_ENTRY_PATH__Group__0__Impl : ( ( ruleFolderName )* ) ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5111:1: ( ( ( ruleFolderName )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5112:1: ( ( ruleFolderName )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5112:1: ( ( ruleFolderName )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5113:1: ( ruleFolderName )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFolderNameParserRuleCall_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5114:1: ( ruleFolderName )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5114:3: ruleFolderName
            	    {
            	    pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_rule__CLASSPATH_ENTRY_PATH__Group__0__Impl10438);
            	    ruleFolderName();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5124:1: rule__CLASSPATH_ENTRY_PATH__Group__1 : rule__CLASSPATH_ENTRY_PATH__Group__1__Impl ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5128:1: ( rule__CLASSPATH_ENTRY_PATH__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5129:2: rule__CLASSPATH_ENTRY_PATH__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__1__Impl_in_rule__CLASSPATH_ENTRY_PATH__Group__110469);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5135:1: rule__CLASSPATH_ENTRY_PATH__Group__1__Impl : ( ruleFileName ) ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5139:1: ( ( ruleFileName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5140:1: ( ruleFileName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5140:1: ( ruleFileName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5141:1: ruleFileName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFileNameParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_rule__CLASSPATH_ENTRY_PATH__Group__1__Impl10496);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5156:1: rule__ClasspathEntry__Group__0 : rule__ClasspathEntry__Group__0__Impl rule__ClasspathEntry__Group__1 ;
    public final void rule__ClasspathEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5160:1: ( rule__ClasspathEntry__Group__0__Impl rule__ClasspathEntry__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5161:2: rule__ClasspathEntry__Group__0__Impl rule__ClasspathEntry__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__0__Impl_in_rule__ClasspathEntry__Group__010529);
            rule__ClasspathEntry__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__1_in_rule__ClasspathEntry__Group__010532);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5168:1: rule__ClasspathEntry__Group__0__Impl : ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) ) ;
    public final void rule__ClasspathEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5172:1: ( ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5173:1: ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5173:1: ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5174:1: ( rule__ClasspathEntry__ExplicitKindAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitKindAssignment_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5175:1: ( rule__ClasspathEntry__ExplicitKindAssignment_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5175:2: rule__ClasspathEntry__ExplicitKindAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__ExplicitKindAssignment_0_in_rule__ClasspathEntry__Group__0__Impl10559);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5185:1: rule__ClasspathEntry__Group__1 : rule__ClasspathEntry__Group__1__Impl rule__ClasspathEntry__Group__2 ;
    public final void rule__ClasspathEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5189:1: ( rule__ClasspathEntry__Group__1__Impl rule__ClasspathEntry__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5190:2: rule__ClasspathEntry__Group__1__Impl rule__ClasspathEntry__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__1__Impl_in_rule__ClasspathEntry__Group__110589);
            rule__ClasspathEntry__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__2_in_rule__ClasspathEntry__Group__110592);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5197:1: rule__ClasspathEntry__Group__1__Impl : ( ( rule__ClasspathEntry__AbsoluteAssignment_1 )? ) ;
    public final void rule__ClasspathEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5201:1: ( ( ( rule__ClasspathEntry__AbsoluteAssignment_1 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5202:1: ( ( rule__ClasspathEntry__AbsoluteAssignment_1 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5202:1: ( ( rule__ClasspathEntry__AbsoluteAssignment_1 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5203:1: ( rule__ClasspathEntry__AbsoluteAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getAbsoluteAssignment_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5204:1: ( rule__ClasspathEntry__AbsoluteAssignment_1 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==27) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5204:2: rule__ClasspathEntry__AbsoluteAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__AbsoluteAssignment_1_in_rule__ClasspathEntry__Group__1__Impl10619);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5214:1: rule__ClasspathEntry__Group__2 : rule__ClasspathEntry__Group__2__Impl rule__ClasspathEntry__Group__3 ;
    public final void rule__ClasspathEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5218:1: ( rule__ClasspathEntry__Group__2__Impl rule__ClasspathEntry__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5219:2: rule__ClasspathEntry__Group__2__Impl rule__ClasspathEntry__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__2__Impl_in_rule__ClasspathEntry__Group__210650);
            rule__ClasspathEntry__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__3_in_rule__ClasspathEntry__Group__210653);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5226:1: rule__ClasspathEntry__Group__2__Impl : ( ( rule__ClasspathEntry__ExplicitPathAssignment_2 ) ) ;
    public final void rule__ClasspathEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5230:1: ( ( ( rule__ClasspathEntry__ExplicitPathAssignment_2 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5231:1: ( ( rule__ClasspathEntry__ExplicitPathAssignment_2 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5231:1: ( ( rule__ClasspathEntry__ExplicitPathAssignment_2 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5232:1: ( rule__ClasspathEntry__ExplicitPathAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitPathAssignment_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5233:1: ( rule__ClasspathEntry__ExplicitPathAssignment_2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5233:2: rule__ClasspathEntry__ExplicitPathAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__ExplicitPathAssignment_2_in_rule__ClasspathEntry__Group__2__Impl10680);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5243:1: rule__ClasspathEntry__Group__3 : rule__ClasspathEntry__Group__3__Impl ;
    public final void rule__ClasspathEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5247:1: ( rule__ClasspathEntry__Group__3__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5248:2: rule__ClasspathEntry__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__3__Impl_in_rule__ClasspathEntry__Group__310710);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5254:1: rule__ClasspathEntry__Group__3__Impl : ( ( rule__ClasspathEntry__Group_3__0 )? ) ;
    public final void rule__ClasspathEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5258:1: ( ( ( rule__ClasspathEntry__Group_3__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5259:1: ( ( rule__ClasspathEntry__Group_3__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5259:1: ( ( rule__ClasspathEntry__Group_3__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5260:1: ( rule__ClasspathEntry__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getGroup_3()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5261:1: ( rule__ClasspathEntry__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==42) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5261:2: rule__ClasspathEntry__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3__0_in_rule__ClasspathEntry__Group__3__Impl10737);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5279:1: rule__ClasspathEntry__Group_3__0 : rule__ClasspathEntry__Group_3__0__Impl rule__ClasspathEntry__Group_3__1 ;
    public final void rule__ClasspathEntry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5283:1: ( rule__ClasspathEntry__Group_3__0__Impl rule__ClasspathEntry__Group_3__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5284:2: rule__ClasspathEntry__Group_3__0__Impl rule__ClasspathEntry__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3__0__Impl_in_rule__ClasspathEntry__Group_3__010776);
            rule__ClasspathEntry__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3__1_in_rule__ClasspathEntry__Group_3__010779);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5291:1: rule__ClasspathEntry__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ClasspathEntry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5295:1: ( ( '(' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5296:1: ( '(' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5296:1: ( '(' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5297:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ClasspathEntry__Group_3__0__Impl10807); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5310:1: rule__ClasspathEntry__Group_3__1 : rule__ClasspathEntry__Group_3__1__Impl rule__ClasspathEntry__Group_3__2 ;
    public final void rule__ClasspathEntry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5314:1: ( rule__ClasspathEntry__Group_3__1__Impl rule__ClasspathEntry__Group_3__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5315:2: rule__ClasspathEntry__Group_3__1__Impl rule__ClasspathEntry__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3__1__Impl_in_rule__ClasspathEntry__Group_3__110838);
            rule__ClasspathEntry__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3__2_in_rule__ClasspathEntry__Group_3__110841);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5322:1: rule__ClasspathEntry__Group_3__1__Impl : ( ( rule__ClasspathEntry__MajorAssignment_3_1 ) ) ;
    public final void rule__ClasspathEntry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5326:1: ( ( ( rule__ClasspathEntry__MajorAssignment_3_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5327:1: ( ( rule__ClasspathEntry__MajorAssignment_3_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5327:1: ( ( rule__ClasspathEntry__MajorAssignment_3_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5328:1: ( rule__ClasspathEntry__MajorAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMajorAssignment_3_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5329:1: ( rule__ClasspathEntry__MajorAssignment_3_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5329:2: rule__ClasspathEntry__MajorAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__MajorAssignment_3_1_in_rule__ClasspathEntry__Group_3__1__Impl10868);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5339:1: rule__ClasspathEntry__Group_3__2 : rule__ClasspathEntry__Group_3__2__Impl rule__ClasspathEntry__Group_3__3 ;
    public final void rule__ClasspathEntry__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5343:1: ( rule__ClasspathEntry__Group_3__2__Impl rule__ClasspathEntry__Group_3__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5344:2: rule__ClasspathEntry__Group_3__2__Impl rule__ClasspathEntry__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3__2__Impl_in_rule__ClasspathEntry__Group_3__210898);
            rule__ClasspathEntry__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3__3_in_rule__ClasspathEntry__Group_3__210901);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5351:1: rule__ClasspathEntry__Group_3__2__Impl : ( ( rule__ClasspathEntry__Group_3_2__0 )? ) ;
    public final void rule__ClasspathEntry__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5355:1: ( ( ( rule__ClasspathEntry__Group_3_2__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5356:1: ( ( rule__ClasspathEntry__Group_3_2__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5356:1: ( ( rule__ClasspathEntry__Group_3_2__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5357:1: ( rule__ClasspathEntry__Group_3_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getGroup_3_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5358:1: ( rule__ClasspathEntry__Group_3_2__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==31) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5358:2: rule__ClasspathEntry__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3_2__0_in_rule__ClasspathEntry__Group_3__2__Impl10928);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5368:1: rule__ClasspathEntry__Group_3__3 : rule__ClasspathEntry__Group_3__3__Impl ;
    public final void rule__ClasspathEntry__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5372:1: ( rule__ClasspathEntry__Group_3__3__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5373:2: rule__ClasspathEntry__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3__3__Impl_in_rule__ClasspathEntry__Group_3__310959);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5379:1: rule__ClasspathEntry__Group_3__3__Impl : ( ')' ) ;
    public final void rule__ClasspathEntry__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5383:1: ( ( ')' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5384:1: ( ')' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5384:1: ( ')' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5385:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,43,FollowSets000.FOLLOW_43_in_rule__ClasspathEntry__Group_3__3__Impl10987); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5406:1: rule__ClasspathEntry__Group_3_2__0 : rule__ClasspathEntry__Group_3_2__0__Impl rule__ClasspathEntry__Group_3_2__1 ;
    public final void rule__ClasspathEntry__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5410:1: ( rule__ClasspathEntry__Group_3_2__0__Impl rule__ClasspathEntry__Group_3_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5411:2: rule__ClasspathEntry__Group_3_2__0__Impl rule__ClasspathEntry__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3_2__0__Impl_in_rule__ClasspathEntry__Group_3_2__011026);
            rule__ClasspathEntry__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3_2__1_in_rule__ClasspathEntry__Group_3_2__011029);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5418:1: rule__ClasspathEntry__Group_3_2__0__Impl : ( '.' ) ;
    public final void rule__ClasspathEntry__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5422:1: ( ( '.' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5423:1: ( '.' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5423:1: ( '.' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5424:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getFullStopKeyword_3_2_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ClasspathEntry__Group_3_2__0__Impl11057); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5437:1: rule__ClasspathEntry__Group_3_2__1 : rule__ClasspathEntry__Group_3_2__1__Impl ;
    public final void rule__ClasspathEntry__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5441:1: ( rule__ClasspathEntry__Group_3_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5442:2: rule__ClasspathEntry__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_3_2__1__Impl_in_rule__ClasspathEntry__Group_3_2__111088);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5448:1: rule__ClasspathEntry__Group_3_2__1__Impl : ( ( rule__ClasspathEntry__MinorAssignment_3_2_1 ) ) ;
    public final void rule__ClasspathEntry__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5452:1: ( ( ( rule__ClasspathEntry__MinorAssignment_3_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5453:1: ( ( rule__ClasspathEntry__MinorAssignment_3_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5453:1: ( ( rule__ClasspathEntry__MinorAssignment_3_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5454:1: ( rule__ClasspathEntry__MinorAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMinorAssignment_3_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5455:1: ( rule__ClasspathEntry__MinorAssignment_3_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5455:2: rule__ClasspathEntry__MinorAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__MinorAssignment_3_2_1_in_rule__ClasspathEntry__Group_3_2__1__Impl11115);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5469:1: rule__DotProjectFileContentProvider__Group__0 : rule__DotProjectFileContentProvider__Group__0__Impl rule__DotProjectFileContentProvider__Group__1 ;
    public final void rule__DotProjectFileContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5473:1: ( rule__DotProjectFileContentProvider__Group__0__Impl rule__DotProjectFileContentProvider__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5474:2: rule__DotProjectFileContentProvider__Group__0__Impl rule__DotProjectFileContentProvider__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__0__Impl_in_rule__DotProjectFileContentProvider__Group__011149);
            rule__DotProjectFileContentProvider__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__1_in_rule__DotProjectFileContentProvider__Group__011152);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5481:1: rule__DotProjectFileContentProvider__Group__0__Impl : ( 'dot.project' ) ;
    public final void rule__DotProjectFileContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5485:1: ( ( 'dot.project' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5486:1: ( 'dot.project' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5486:1: ( 'dot.project' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5487:1: 'dot.project'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getDotProjectKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_44_in_rule__DotProjectFileContentProvider__Group__0__Impl11180); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5500:1: rule__DotProjectFileContentProvider__Group__1 : rule__DotProjectFileContentProvider__Group__1__Impl rule__DotProjectFileContentProvider__Group__2 ;
    public final void rule__DotProjectFileContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5504:1: ( rule__DotProjectFileContentProvider__Group__1__Impl rule__DotProjectFileContentProvider__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5505:2: rule__DotProjectFileContentProvider__Group__1__Impl rule__DotProjectFileContentProvider__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__1__Impl_in_rule__DotProjectFileContentProvider__Group__111211);
            rule__DotProjectFileContentProvider__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__2_in_rule__DotProjectFileContentProvider__Group__111214);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5512:1: rule__DotProjectFileContentProvider__Group__1__Impl : ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) ) ;
    public final void rule__DotProjectFileContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5516:1: ( ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5517:1: ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5517:1: ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5518:1: ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5518:1: ( ( rule__DotProjectFileContentProvider__Group_1__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5519:1: ( rule__DotProjectFileContentProvider__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5520:1: ( rule__DotProjectFileContentProvider__Group_1__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5520:2: rule__DotProjectFileContentProvider__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_1__0_in_rule__DotProjectFileContentProvider__Group__1__Impl11243);
            rule__DotProjectFileContentProvider__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_1()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5523:1: ( ( rule__DotProjectFileContentProvider__Group_1__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5524:1: ( rule__DotProjectFileContentProvider__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5525:1: ( rule__DotProjectFileContentProvider__Group_1__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==29) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5525:2: rule__DotProjectFileContentProvider__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_1__0_in_rule__DotProjectFileContentProvider__Group__1__Impl11255);
            	    rule__DotProjectFileContentProvider__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5536:1: rule__DotProjectFileContentProvider__Group__2 : rule__DotProjectFileContentProvider__Group__2__Impl rule__DotProjectFileContentProvider__Group__3 ;
    public final void rule__DotProjectFileContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5540:1: ( rule__DotProjectFileContentProvider__Group__2__Impl rule__DotProjectFileContentProvider__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5541:2: rule__DotProjectFileContentProvider__Group__2__Impl rule__DotProjectFileContentProvider__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__2__Impl_in_rule__DotProjectFileContentProvider__Group__211288);
            rule__DotProjectFileContentProvider__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__3_in_rule__DotProjectFileContentProvider__Group__211291);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5548:1: rule__DotProjectFileContentProvider__Group__2__Impl : ( ( rule__DotProjectFileContentProvider__Group_2__0 )* ) ;
    public final void rule__DotProjectFileContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5552:1: ( ( ( rule__DotProjectFileContentProvider__Group_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5553:1: ( ( rule__DotProjectFileContentProvider__Group_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5553:1: ( ( rule__DotProjectFileContentProvider__Group_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5554:1: ( rule__DotProjectFileContentProvider__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5555:1: ( rule__DotProjectFileContentProvider__Group_2__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==35) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5555:2: rule__DotProjectFileContentProvider__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__0_in_rule__DotProjectFileContentProvider__Group__2__Impl11318);
            	    rule__DotProjectFileContentProvider__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5565:1: rule__DotProjectFileContentProvider__Group__3 : rule__DotProjectFileContentProvider__Group__3__Impl ;
    public final void rule__DotProjectFileContentProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5569:1: ( rule__DotProjectFileContentProvider__Group__3__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5570:2: rule__DotProjectFileContentProvider__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__3__Impl_in_rule__DotProjectFileContentProvider__Group__311349);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5576:1: rule__DotProjectFileContentProvider__Group__3__Impl : ( ';' ) ;
    public final void rule__DotProjectFileContentProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5580:1: ( ( ';' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5581:1: ( ';' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5581:1: ( ';' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5582:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getSemicolonKeyword_3()); 
            }
            match(input,8,FollowSets000.FOLLOW_8_in_rule__DotProjectFileContentProvider__Group__3__Impl11377); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5603:1: rule__DotProjectFileContentProvider__Group_1__0 : rule__DotProjectFileContentProvider__Group_1__0__Impl rule__DotProjectFileContentProvider__Group_1__1 ;
    public final void rule__DotProjectFileContentProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5607:1: ( rule__DotProjectFileContentProvider__Group_1__0__Impl rule__DotProjectFileContentProvider__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5608:2: rule__DotProjectFileContentProvider__Group_1__0__Impl rule__DotProjectFileContentProvider__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_1__0__Impl_in_rule__DotProjectFileContentProvider__Group_1__011416);
            rule__DotProjectFileContentProvider__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_1__1_in_rule__DotProjectFileContentProvider__Group_1__011419);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5615:1: rule__DotProjectFileContentProvider__Group_1__0__Impl : ( '#' ) ;
    public final void rule__DotProjectFileContentProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5619:1: ( ( '#' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5620:1: ( '#' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5620:1: ( '#' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5621:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getNumberSignKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__DotProjectFileContentProvider__Group_1__0__Impl11447); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5634:1: rule__DotProjectFileContentProvider__Group_1__1 : rule__DotProjectFileContentProvider__Group_1__1__Impl ;
    public final void rule__DotProjectFileContentProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5638:1: ( rule__DotProjectFileContentProvider__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5639:2: rule__DotProjectFileContentProvider__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_1__1__Impl_in_rule__DotProjectFileContentProvider__Group_1__111478);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5645:1: rule__DotProjectFileContentProvider__Group_1__1__Impl : ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) ) ;
    public final void rule__DotProjectFileContentProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5649:1: ( ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5650:1: ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5650:1: ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5651:1: ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysAssignment_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5652:1: ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5652:2: rule__DotProjectFileContentProvider__KeysAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__KeysAssignment_1_1_in_rule__DotProjectFileContentProvider__Group_1__1__Impl11505);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5666:1: rule__DotProjectFileContentProvider__Group_2__0 : rule__DotProjectFileContentProvider__Group_2__0__Impl rule__DotProjectFileContentProvider__Group_2__1 ;
    public final void rule__DotProjectFileContentProvider__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5670:1: ( rule__DotProjectFileContentProvider__Group_2__0__Impl rule__DotProjectFileContentProvider__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5671:2: rule__DotProjectFileContentProvider__Group_2__0__Impl rule__DotProjectFileContentProvider__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__0__Impl_in_rule__DotProjectFileContentProvider__Group_2__011539);
            rule__DotProjectFileContentProvider__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__1_in_rule__DotProjectFileContentProvider__Group_2__011542);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5678:1: rule__DotProjectFileContentProvider__Group_2__0__Impl : ( '@' ) ;
    public final void rule__DotProjectFileContentProvider__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5682:1: ( ( '@' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5683:1: ( '@' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5683:1: ( '@' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5684:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getCommercialAtKeyword_2_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__DotProjectFileContentProvider__Group_2__0__Impl11570); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5697:1: rule__DotProjectFileContentProvider__Group_2__1 : rule__DotProjectFileContentProvider__Group_2__1__Impl rule__DotProjectFileContentProvider__Group_2__2 ;
    public final void rule__DotProjectFileContentProvider__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5701:1: ( rule__DotProjectFileContentProvider__Group_2__1__Impl rule__DotProjectFileContentProvider__Group_2__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5702:2: rule__DotProjectFileContentProvider__Group_2__1__Impl rule__DotProjectFileContentProvider__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__1__Impl_in_rule__DotProjectFileContentProvider__Group_2__111601);
            rule__DotProjectFileContentProvider__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__2_in_rule__DotProjectFileContentProvider__Group_2__111604);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5709:1: rule__DotProjectFileContentProvider__Group_2__1__Impl : ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) ) ;
    public final void rule__DotProjectFileContentProvider__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5713:1: ( ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5714:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5714:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5715:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesAssignment_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5716:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5716:2: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1_in_rule__DotProjectFileContentProvider__Group_2__1__Impl11631);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5726:1: rule__DotProjectFileContentProvider__Group_2__2 : rule__DotProjectFileContentProvider__Group_2__2__Impl ;
    public final void rule__DotProjectFileContentProvider__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5730:1: ( rule__DotProjectFileContentProvider__Group_2__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5731:2: rule__DotProjectFileContentProvider__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__2__Impl_in_rule__DotProjectFileContentProvider__Group_2__211661);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5737:1: rule__DotProjectFileContentProvider__Group_2__2__Impl : ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* ) ;
    public final void rule__DotProjectFileContentProvider__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5741:1: ( ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5742:1: ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5742:1: ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5743:1: ( rule__DotProjectFileContentProvider__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_2_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5744:1: ( rule__DotProjectFileContentProvider__Group_2_2__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==32) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5744:2: rule__DotProjectFileContentProvider__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__0_in_rule__DotProjectFileContentProvider__Group_2__2__Impl11688);
            	    rule__DotProjectFileContentProvider__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5760:1: rule__DotProjectFileContentProvider__Group_2_2__0 : rule__DotProjectFileContentProvider__Group_2_2__0__Impl rule__DotProjectFileContentProvider__Group_2_2__1 ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5764:1: ( rule__DotProjectFileContentProvider__Group_2_2__0__Impl rule__DotProjectFileContentProvider__Group_2_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5765:2: rule__DotProjectFileContentProvider__Group_2_2__0__Impl rule__DotProjectFileContentProvider__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__0__Impl_in_rule__DotProjectFileContentProvider__Group_2_2__011725);
            rule__DotProjectFileContentProvider__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__1_in_rule__DotProjectFileContentProvider__Group_2_2__011728);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5772:1: rule__DotProjectFileContentProvider__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5776:1: ( ( ',' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5777:1: ( ',' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5777:1: ( ',' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5778:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__DotProjectFileContentProvider__Group_2_2__0__Impl11756); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5791:1: rule__DotProjectFileContentProvider__Group_2_2__1 : rule__DotProjectFileContentProvider__Group_2_2__1__Impl ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5795:1: ( rule__DotProjectFileContentProvider__Group_2_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5796:2: rule__DotProjectFileContentProvider__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__1__Impl_in_rule__DotProjectFileContentProvider__Group_2_2__111787);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5802:1: rule__DotProjectFileContentProvider__Group_2_2__1__Impl : ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) ) ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5806:1: ( ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5807:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5807:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5808:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesAssignment_2_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5809:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5809:2: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1_in_rule__DotProjectFileContentProvider__Group_2_2__1__Impl11814);
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


    // $ANTLR start "rule__EmfsRoot__NameAssignment_1_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5824:1: rule__EmfsRoot__NameAssignment_1_1 : ( ruleEmfsName ) ;
    public final void rule__EmfsRoot__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5828:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5829:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5829:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5830:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getNameEmfsNameParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__EmfsRoot__NameAssignment_1_111853);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5839:1: rule__EmfsRoot__TagsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__EmfsRoot__TagsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5843:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5844:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5844:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5845:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getTagsIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmfsRoot__TagsAssignment_2_111884); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5854:1: rule__EmfsRoot__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__EmfsRoot__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5858:1: ( ( ruleProperty ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5859:1: ( ruleProperty )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5859:1: ( ruleProperty )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5860:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__EmfsRoot__PropertiesAssignment_311915);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5869:1: rule__EmfsRoot__ContentProviderAssignment_4_1 : ( ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 ) ) ;
    public final void rule__EmfsRoot__ContentProviderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5873:1: ( ( ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5874:1: ( ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5874:1: ( ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5875:1: ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getContentProviderAlternatives_4_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5876:1: ( rule__EmfsRoot__ContentProviderAlternatives_4_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5876:2: rule__EmfsRoot__ContentProviderAlternatives_4_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__ContentProviderAlternatives_4_1_0_in_rule__EmfsRoot__ContentProviderAssignment_4_111946);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5885:1: rule__EmfsRoot__ResourcesAssignment_6 : ( ruleEmfsResource ) ;
    public final void rule__EmfsRoot__ResourcesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5889:1: ( ( ruleEmfsResource ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5890:1: ( ruleEmfsResource )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5890:1: ( ruleEmfsResource )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5891:1: ruleEmfsResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getResourcesEmfsResourceParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_rule__EmfsRoot__ResourcesAssignment_611979);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5900:1: rule__EmfsResourcesRef__ResourcesAssignment_0 : ( ( ruleEmfsName ) ) ;
    public final void rule__EmfsResourcesRef__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5904:1: ( ( ( ruleEmfsName ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5905:1: ( ( ruleEmfsName ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5905:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5906:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_0_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5907:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5908:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceEmfsNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__EmfsResourcesRef__ResourcesAssignment_012014);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5919:1: rule__EmfsResourcesRef__ResourcesAssignment_1_1 : ( ( ruleEmfsName ) ) ;
    public final void rule__EmfsResourcesRef__ResourcesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5923:1: ( ( ( ruleEmfsName ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5924:1: ( ( ruleEmfsName ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5924:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5925:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_1_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5926:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5927:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceEmfsNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__EmfsResourcesRef__ResourcesAssignment_1_112053);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5938:1: rule__Property__NameAssignment_1 : ( ruleEmfsName ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5942:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5943:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5943:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5944:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameEmfsNameParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__Property__NameAssignment_112088);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5953:1: rule__Property__ValueAssignment_3 : ( ( rule__Property__ValueAlternatives_3_0 ) ) ;
    public final void rule__Property__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5957:1: ( ( ( rule__Property__ValueAlternatives_3_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5958:1: ( ( rule__Property__ValueAlternatives_3_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5958:1: ( ( rule__Property__ValueAlternatives_3_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5959:1: ( rule__Property__ValueAlternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAlternatives_3_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5960:1: ( rule__Property__ValueAlternatives_3_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5960:2: rule__Property__ValueAlternatives_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__ValueAlternatives_3_0_in_rule__Property__ValueAssignment_312119);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5969:1: rule__EmfsContainer__NameAssignment_0 : ( ruleFolderName ) ;
    public final void rule__EmfsContainer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5973:1: ( ( ruleFolderName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5974:1: ( ruleFolderName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5974:1: ( ruleFolderName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5975:1: ruleFolderName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getNameFolderNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_rule__EmfsContainer__NameAssignment_012152);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5984:1: rule__EmfsContainer__TagsAssignment_1_1 : ( ruleEmfsName ) ;
    public final void rule__EmfsContainer__TagsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5988:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5989:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5989:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5990:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getTagsEmfsNameParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__EmfsContainer__TagsAssignment_1_112183);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5999:1: rule__EmfsContainer__PropertiesAssignment_2 : ( ruleProperty ) ;
    public final void rule__EmfsContainer__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6003:1: ( ( ruleProperty ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6004:1: ( ruleProperty )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6004:1: ( ruleProperty )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6005:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__EmfsContainer__PropertiesAssignment_212214);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6014:1: rule__EmfsContainer__ContentProviderAssignment_3_1 : ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) ) ;
    public final void rule__EmfsContainer__ContentProviderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6018:1: ( ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6019:1: ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6019:1: ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6020:1: ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getContentProviderAlternatives_3_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6021:1: ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6021:2: rule__EmfsContainer__ContentProviderAlternatives_3_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__ContentProviderAlternatives_3_1_0_in_rule__EmfsContainer__ContentProviderAssignment_3_112245);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6030:1: rule__EmfsContainer__ResourcesAssignment_4 : ( ruleEmfsResource ) ;
    public final void rule__EmfsContainer__ResourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6034:1: ( ( ruleEmfsResource ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6035:1: ( ruleEmfsResource )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6035:1: ( ruleEmfsResource )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6036:1: ruleEmfsResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getResourcesEmfsResourceParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_rule__EmfsContainer__ResourcesAssignment_412278);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6045:1: rule__GitContentProvider__GitRefAssignment : ( ruleGitContentRef ) ;
    public final void rule__GitContentProvider__GitRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6049:1: ( ( ruleGitContentRef ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6050:1: ( ruleGitContentRef )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6050:1: ( ruleGitContentRef )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6051:1: ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_rule__GitContentProvider__GitRefAssignment12309);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6060:1: rule__EmfsFile__NameAssignment_0 : ( ruleFileName ) ;
    public final void rule__EmfsFile__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6064:1: ( ( ruleFileName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6065:1: ( ruleFileName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6065:1: ( ruleFileName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6066:1: ruleFileName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getNameFileNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_rule__EmfsFile__NameAssignment_012340);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6075:1: rule__EmfsFile__WriteableAssignment_1 : ( ( '*' ) ) ;
    public final void rule__EmfsFile__WriteableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6079:1: ( ( ( '*' ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6080:1: ( ( '*' ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6080:1: ( ( '*' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6081:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getWriteableAsteriskKeyword_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6082:1: ( '*' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6083:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getWriteableAsteriskKeyword_1_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_45_in_rule__EmfsFile__WriteableAssignment_112376); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6098:1: rule__EmfsFile__TagsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__EmfsFile__TagsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6102:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6103:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6103:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6104:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getTagsIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmfsFile__TagsAssignment_2_112415); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6113:1: rule__EmfsFile__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__EmfsFile__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6117:1: ( ( ruleProperty ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6118:1: ( ruleProperty )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6118:1: ( ruleProperty )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6119:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__EmfsFile__PropertiesAssignment_312446);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6128:1: rule__EmfsFile__ContentProviderAssignment_4_0_1 : ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) ) ;
    public final void rule__EmfsFile__ContentProviderAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6132:1: ( ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6133:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6133:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6134:1: ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_0_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6135:1: ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6135:2: rule__EmfsFile__ContentProviderAlternatives_4_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_0_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_0_112477);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6144:1: rule__EmfsFile__ContentProviderAssignment_4_1 : ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) ) ;
    public final void rule__EmfsFile__ContentProviderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6148:1: ( ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6149:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6149:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6150:1: ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6151:1: ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6151:2: rule__EmfsFile__ContentProviderAlternatives_4_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_112510);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6160:1: rule__EmfsFile__ContentProviderAssignment_4_2_1 : ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) ) ;
    public final void rule__EmfsFile__ContentProviderAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6164:1: ( ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6165:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6165:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6166:1: ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_2_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6167:1: ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6167:2: rule__EmfsFile__ContentProviderAlternatives_4_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_2_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_2_112543);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6176:1: rule__StringContentProvider__StringContentsAssignment : ( ruleAbstractStringContents ) ;
    public final void rule__StringContentProvider__StringContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6180:1: ( ( ruleAbstractStringContents ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6181:1: ( ruleAbstractStringContents )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6181:1: ( ruleAbstractStringContents )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6182:1: ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringContentProviderAccess().getStringContentsAbstractStringContentsParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_rule__StringContentProvider__StringContentsAssignment12576);
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


    // $ANTLR start "rule__VerbatimStringContents__StringContentAssignment"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6191:1: rule__VerbatimStringContents__StringContentAssignment : ( ( rule__VerbatimStringContents__StringContentAlternatives_0 ) ) ;
    public final void rule__VerbatimStringContents__StringContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6195:1: ( ( ( rule__VerbatimStringContents__StringContentAlternatives_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6196:1: ( ( rule__VerbatimStringContents__StringContentAlternatives_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6196:1: ( ( rule__VerbatimStringContents__StringContentAlternatives_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6197:1: ( rule__VerbatimStringContents__StringContentAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getStringContentAlternatives_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6198:1: ( rule__VerbatimStringContents__StringContentAlternatives_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6198:2: rule__VerbatimStringContents__StringContentAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VerbatimStringContents__StringContentAlternatives_0_in_rule__VerbatimStringContents__StringContentAssignment12607);
            rule__VerbatimStringContents__StringContentAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVerbatimStringContentsAccess().getStringContentAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerbatimStringContents__StringContentAssignment"


    // $ANTLR start "rule__PropertyValueString__PropertyNameAssignment_1_0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6207:1: rule__PropertyValueString__PropertyNameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__PropertyValueString__PropertyNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6211:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6212:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6212:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6213:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getPropertyNameIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PropertyValueString__PropertyNameAssignment_1_012640); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getPropertyNameIDTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__PropertyNameAssignment_1_0"


    // $ANTLR start "rule__PropertyValueString__PropertyNameAssignment_1_1_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6222:1: rule__PropertyValueString__PropertyNameAssignment_1_1_1 : ( ruleEmfsName ) ;
    public final void rule__PropertyValueString__PropertyNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6226:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6227:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6227:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6228:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getPropertyNameEmfsNameParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__PropertyValueString__PropertyNameAssignment_1_1_112671);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getPropertyNameEmfsNameParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__PropertyNameAssignment_1_1_1"


    // $ANTLR start "rule__PropertyValueString__DefaultValueAssignment_2_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6237:1: rule__PropertyValueString__DefaultValueAssignment_2_1 : ( ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 ) ) ;
    public final void rule__PropertyValueString__DefaultValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6241:1: ( ( ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6242:1: ( ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6242:1: ( ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6243:1: ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getDefaultValueAlternatives_2_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6244:1: ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6244:2: rule__PropertyValueString__DefaultValueAlternatives_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__DefaultValueAlternatives_2_1_0_in_rule__PropertyValueString__DefaultValueAssignment_2_112702);
            rule__PropertyValueString__DefaultValueAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueStringAccess().getDefaultValueAlternatives_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__DefaultValueAssignment_2_1"


    // $ANTLR start "rule__WrappingStringContentProvider__PrefixAssignment_0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6253:1: rule__WrappingStringContentProvider__PrefixAssignment_0 : ( ruleAbstractStringContents ) ;
    public final void rule__WrappingStringContentProvider__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6257:1: ( ( ruleAbstractStringContents ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6258:1: ( ruleAbstractStringContents )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6258:1: ( ruleAbstractStringContents )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6259:1: ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAbstractStringContentsParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_rule__WrappingStringContentProvider__PrefixAssignment_012735);
            ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAbstractStringContentsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__PrefixAssignment_0"


    // $ANTLR start "rule__WrappingStringContentProvider__ContentProviderAssignment_1_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6268:1: rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 : ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) ) ;
    public final void rule__WrappingStringContentProvider__ContentProviderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6272:1: ( ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6273:1: ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6273:1: ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6274:1: ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderAlternatives_1_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6275:1: ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6275:2: rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0_in_rule__WrappingStringContentProvider__ContentProviderAssignment_1_112766);
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


    // $ANTLR start "rule__WrappingStringContentProvider__SuffixAssignment_2"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6284:1: rule__WrappingStringContentProvider__SuffixAssignment_2 : ( ruleAbstractStringContents ) ;
    public final void rule__WrappingStringContentProvider__SuffixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6288:1: ( ( ruleAbstractStringContents ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6289:1: ( ruleAbstractStringContents )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6289:1: ( ruleAbstractStringContents )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6290:1: ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAbstractStringContentsParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_rule__WrappingStringContentProvider__SuffixAssignment_212799);
            ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAbstractStringContentsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WrappingStringContentProvider__SuffixAssignment_2"


    // $ANTLR start "rule__URLContentProvider__UrlStringAssignment"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6299:1: rule__URLContentProvider__UrlStringAssignment : ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) ) ;
    public final void rule__URLContentProvider__UrlStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6303:1: ( ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6304:1: ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6304:1: ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6305:1: ( rule__URLContentProvider__UrlStringAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLContentProviderAccess().getUrlStringAlternatives_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6306:1: ( rule__URLContentProvider__UrlStringAlternatives_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6306:2: rule__URLContentProvider__UrlStringAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__URLContentProvider__UrlStringAlternatives_0_in_rule__URLContentProvider__UrlStringAssignment12830);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6315:1: rule__GitURLContentProvider__GitRefAssignment : ( ruleGitContentRef ) ;
    public final void rule__GitURLContentProvider__GitRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6319:1: ( ( ruleGitContentRef ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6320:1: ( ruleGitContentRef )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6320:1: ( ruleGitContentRef )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6321:1: ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitURLContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_rule__GitURLContentProvider__GitRefAssignment12863);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6330:1: rule__GitContentRef__HostAssignment_2_0_0 : ( ( rule__GitContentRef__HostAlternatives_2_0_0_0 ) ) ;
    public final void rule__GitContentRef__HostAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6334:1: ( ( ( rule__GitContentRef__HostAlternatives_2_0_0_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6335:1: ( ( rule__GitContentRef__HostAlternatives_2_0_0_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6335:1: ( ( rule__GitContentRef__HostAlternatives_2_0_0_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6336:1: ( rule__GitContentRef__HostAlternatives_2_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getHostAlternatives_2_0_0_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6337:1: ( rule__GitContentRef__HostAlternatives_2_0_0_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6337:2: rule__GitContentRef__HostAlternatives_2_0_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__HostAlternatives_2_0_0_0_in_rule__GitContentRef__HostAssignment_2_0_012894);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6346:1: rule__GitContentRef__OwnerAssignment_2_0_1_1 : ( ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 ) ) ;
    public final void rule__GitContentRef__OwnerAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6350:1: ( ( ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6351:1: ( ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6351:1: ( ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6352:1: ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getOwnerAlternatives_2_0_1_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6353:1: ( rule__GitContentRef__OwnerAlternatives_2_0_1_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6353:2: rule__GitContentRef__OwnerAlternatives_2_0_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__OwnerAlternatives_2_0_1_1_0_in_rule__GitContentRef__OwnerAssignment_2_0_1_112927);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6362:1: rule__GitContentRef__OwnerAssignment_2_1 : ( ( rule__GitContentRef__OwnerAlternatives_2_1_0 ) ) ;
    public final void rule__GitContentRef__OwnerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6366:1: ( ( ( rule__GitContentRef__OwnerAlternatives_2_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6367:1: ( ( rule__GitContentRef__OwnerAlternatives_2_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6367:1: ( ( rule__GitContentRef__OwnerAlternatives_2_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6368:1: ( rule__GitContentRef__OwnerAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getOwnerAlternatives_2_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6369:1: ( rule__GitContentRef__OwnerAlternatives_2_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6369:2: rule__GitContentRef__OwnerAlternatives_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__OwnerAlternatives_2_1_0_in_rule__GitContentRef__OwnerAssignment_2_112960);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6378:1: rule__GitContentRef__RepoAssignment_4 : ( RULE_ID ) ;
    public final void rule__GitContentRef__RepoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6382:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6383:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6383:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6384:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getRepoIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GitContentRef__RepoAssignment_412993); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6393:1: rule__GitContentRef__PathAssignment_5 : ( ruleURL_PATH ) ;
    public final void rule__GitContentRef__PathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6397:1: ( ( ruleURL_PATH ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6398:1: ( ruleURL_PATH )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6398:1: ( ruleURL_PATH )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6399:1: ruleURL_PATH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getPathURL_PATHParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_rule__GitContentRef__PathAssignment_513024);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6408:1: rule__DotClasspathFileContentProvider__EntriesAssignment_1 : ( ruleAbstractClasspathEntry ) ;
    public final void rule__DotClasspathFileContentProvider__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6412:1: ( ( ruleAbstractClasspathEntry ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6413:1: ( ruleAbstractClasspathEntry )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6413:1: ( ruleAbstractClasspathEntry )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6414:1: ruleAbstractClasspathEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAbstractClasspathEntryParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractClasspathEntry_in_rule__DotClasspathFileContentProvider__EntriesAssignment_113055);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6423:1: rule__ClasspathEntry__ExplicitKindAssignment_0 : ( ruleClasspathEntryKind ) ;
    public final void rule__ClasspathEntry__ExplicitKindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6427:1: ( ( ruleClasspathEntryKind ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6428:1: ( ruleClasspathEntryKind )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6428:1: ( ruleClasspathEntryKind )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6429:1: ruleClasspathEntryKind
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitKindClasspathEntryKindEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntryKind_in_rule__ClasspathEntry__ExplicitKindAssignment_013086);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6438:1: rule__ClasspathEntry__AbsoluteAssignment_1 : ( ( '/' ) ) ;
    public final void rule__ClasspathEntry__AbsoluteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6442:1: ( ( ( '/' ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6443:1: ( ( '/' ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6443:1: ( ( '/' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6444:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getAbsoluteSolidusKeyword_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6445:1: ( '/' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6446:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getAbsoluteSolidusKeyword_1_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ClasspathEntry__AbsoluteAssignment_113122); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6461:1: rule__ClasspathEntry__ExplicitPathAssignment_2 : ( ruleCLASSPATH_ENTRY_PATH ) ;
    public final void rule__ClasspathEntry__ExplicitPathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6465:1: ( ( ruleCLASSPATH_ENTRY_PATH ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6466:1: ( ruleCLASSPATH_ENTRY_PATH )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6466:1: ( ruleCLASSPATH_ENTRY_PATH )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6467:1: ruleCLASSPATH_ENTRY_PATH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitPathCLASSPATH_ENTRY_PATHParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_rule__ClasspathEntry__ExplicitPathAssignment_213161);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6476:1: rule__ClasspathEntry__MajorAssignment_3_1 : ( ruleVERSION ) ;
    public final void rule__ClasspathEntry__MajorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6480:1: ( ( ruleVERSION ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6481:1: ( ruleVERSION )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6481:1: ( ruleVERSION )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6482:1: ruleVERSION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMajorVERSIONParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_rule__ClasspathEntry__MajorAssignment_3_113192);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6491:1: rule__ClasspathEntry__MinorAssignment_3_2_1 : ( ruleVERSION ) ;
    public final void rule__ClasspathEntry__MinorAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6495:1: ( ( ruleVERSION ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6496:1: ( ruleVERSION )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6496:1: ( ruleVERSION )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6497:1: ruleVERSION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMinorVERSIONParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_rule__ClasspathEntry__MinorAssignment_3_2_113223);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6506:1: rule__DotProjectFileContentProvider__KeysAssignment_1_1 : ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) ) ;
    public final void rule__DotProjectFileContentProvider__KeysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6510:1: ( ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6511:1: ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6511:1: ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6512:1: ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysAlternatives_1_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6513:1: ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6513:2: rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0_in_rule__DotProjectFileContentProvider__KeysAssignment_1_113254);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6522:1: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 : ( ( ruleEmfsName ) ) ;
    public final void rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6526:1: ( ( ( ruleEmfsName ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6527:1: ( ( ruleEmfsName ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6527:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6528:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6529:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6530:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceEmfsNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_113291);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6541:1: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 : ( ( ruleEmfsName ) ) ;
    public final void rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6545:1: ( ( ( ruleEmfsName ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6546:1: ( ( ruleEmfsName ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6546:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6547:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_2_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6548:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6549:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceEmfsNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_113330);
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

    // $ANTLR start synpred35_InternalXemfs
    public final void synpred35_InternalXemfs_fragment() throws RecognitionException {   
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1509:1: ( ( ( rule__GitContentRef__Group_2_0__0 ) ) )
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1509:1: ( ( rule__GitContentRef__Group_2_0__0 ) )
        {
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1509:1: ( ( rule__GitContentRef__Group_2_0__0 ) )
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1510:1: ( rule__GitContentRef__Group_2_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGitContentRefAccess().getGroup_2_0()); 
        }
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1511:1: ( rule__GitContentRef__Group_2_0__0 )
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1511:2: rule__GitContentRef__Group_2_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0__0_in_synpred35_InternalXemfs3241);
        rule__GitContentRef__Group_2_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35_InternalXemfs

    // $ANTLR start synpred58_InternalXemfs
    public final void synpred58_InternalXemfs_fragment() throws RecognitionException {   
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2233:2: ( rule__EmfsName__Group_1__0 )
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2233:2: rule__EmfsName__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group_1__0_in_synpred58_InternalXemfs4759);
        rule__EmfsName__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalXemfs

    // $ANTLR start synpred65_InternalXemfs
    public final void synpred65_InternalXemfs_fragment() throws RecognitionException {   
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2916:2: ( rule__EmfsContainer__ResourcesAssignment_4 )
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2916:2: rule__EmfsContainer__ResourcesAssignment_4
        {
        pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__ResourcesAssignment_4_in_synpred65_InternalXemfs6115);
        rule__EmfsContainer__ResourcesAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalXemfs

    // $ANTLR start synpred66_InternalXemfs
    public final void synpred66_InternalXemfs_fragment() throws RecognitionException {   
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2945:2: ( ';' )
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2945:2: ';'
        {
        match(input,8,FollowSets000.FOLLOW_8_in_synpred66_InternalXemfs6175); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalXemfs

    // Delegated rules

    public final boolean synpred66_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalXemfs_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalXemfs_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalXemfs_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalXemfs_fragment(); // can never throw exception
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
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA4_eotS =
        "\7\uffff";
    static final String DFA4_eofS =
        "\7\uffff";
    static final String DFA4_minS =
        "\2\6\1\4\1\6\2\uffff\1\4";
    static final String DFA4_maxS =
        "\1\37\1\6\1\55\1\6\2\uffff\1\55";
    static final String DFA4_acceptS =
        "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA4_specialS =
        "\7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\30\uffff\1\1",
            "\1\2",
            "\2\4\2\uffff\1\4\22\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\uffff\1\4\1\uffff\2\4\10\uffff\1\4",
            "\1\6",
            "",
            "",
            "\2\4\2\uffff\1\4\22\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\uffff\1\4\1\uffff\2\4\10\uffff\1\4"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "984:1: rule__EmfsResource__Alternatives : ( ( ruleEmfsContainer ) | ( ruleEmfsFile ) );";
        }
    }
    static final String DFA9_eotS =
        "\161\uffff";
    static final String DFA9_eofS =
        "\2\uffff\3\6\5\uffff\2\6\1\uffff\1\6\2\uffff\1\6\2\uffff\1\6\135\uffff";
    static final String DFA9_minS =
        "\1\4\1\6\3\4\1\6\2\uffff\1\4\1\37\2\4\1\6\1\4\1\6\1\37\1\4\1\6\3\4\4\44\1\43\1\33\3\6\1\33\1\6\1\37\2\6\1\4\4\6\1\33\2\6\1\33\3\6\2\4\1\33\1\37\1\6\1\33\1\37\1\4\1\37\4\6\2\33\2\6\1\15\1\6\1\33\1\6\1\4\1\6\1\4\1\6\1\33\1\37\1\6\2\33\12\15\2\37\3\6\1\4\1\37\12\15\1\4\1\37\2\6\1\33\1\6\1\4\2\37";
    static final String DFA9_maxS =
        "\1\41\1\45\2\43\1\44\1\6\2\uffff\1\6\1\46\2\43\1\6\1\44\1\6\1\46\1\55\1\6\1\50\1\55\1\41\4\44\1\43\1\47\3\41\1\37\1\45\1\37\1\45\1\6\1\41\1\45\3\6\1\44\2\6\1\33\1\6\1\41\1\6\2\41\1\44\1\46\1\41\1\44\1\46\1\41\1\46\2\41\2\6\1\44\1\33\1\45\1\6\1\26\1\6\1\33\1\6\1\41\1\6\1\41\1\45\1\44\1\46\1\6\1\33\1\44\12\33\2\46\1\6\1\41\1\6\1\41\1\46\12\33\1\41\1\46\1\41\1\6\1\33\1\6\1\41\2\46";
    static final String DFA9_acceptS =
        "\6\uffff\1\1\1\2\151\uffff";
    static final String DFA9_specialS =
        "\161\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\3\33\uffff\1\1",
            "\1\4\36\uffff\1\5",
            "\3\6\1\uffff\1\6\26\uffff\1\6\1\uffff\1\6\1\uffff\1\7",
            "\3\6\1\uffff\1\6\26\uffff\1\6\1\uffff\1\6\1\uffff\1\7",
            "\3\6\1\uffff\1\6\26\uffff\1\6\1\uffff\1\6\1\uffff\1\7\1\10",
            "\1\11",
            "",
            "",
            "\1\12\1\uffff\1\13",
            "\1\14\6\uffff\1\15",
            "\3\6\1\uffff\1\6\26\uffff\1\6\1\uffff\1\6\1\uffff\1\7",
            "\3\6\1\uffff\1\6\26\uffff\1\16\1\uffff\1\6\1\uffff\1\7",
            "\1\17",
            "\3\6\1\uffff\1\6\26\uffff\1\6\1\uffff\1\6\1\uffff\1\7\1\10",
            "\1\20",
            "\1\14\6\uffff\1\15",
            "\3\6\1\uffff\1\6\22\uffff\1\6\1\uffff\1\6\1\uffff\1\21\1\uffff\1\6\1\uffff\1\22\1\6\10\uffff\1\6",
            "\1\23",
            "\1\24\4\uffff\1\25\1\26\1\27\1\30\33\uffff\1\31",
            "\3\6\1\uffff\1\6\22\uffff\1\6\1\uffff\1\6\1\uffff\1\21\1\uffff\1\6\1\uffff\1\22\1\6\10\uffff\1\6",
            "\2\7\2\uffff\1\6\30\uffff\1\7",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\35\13\uffff\1\34",
            "\1\36\32\uffff\1\37",
            "\1\40\32\uffff\1\41",
            "\1\43\30\uffff\1\42\1\uffff\1\44",
            "\1\45\3\uffff\1\46",
            "\1\50\36\uffff\1\47",
            "\1\51",
            "\1\53\36\uffff\1\52",
            "\1\43",
            "\2\7\2\uffff\1\6\22\uffff\1\55\3\uffff\1\54\1\uffff\1\7",
            "\1\57\36\uffff\1\56",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\45\10\uffff\1\63",
            "\1\64",
            "\1\65",
            "\1\35",
            "\1\66",
            "\1\43\30\uffff\1\42\1\uffff\1\44",
            "\1\67",
            "\2\7\2\uffff\1\6\22\uffff\1\70\5\uffff\1\7",
            "\2\7\2\uffff\1\6\22\uffff\1\71\5\uffff\1\7",
            "\1\45\3\uffff\1\72\4\uffff\1\63",
            "\1\73\6\uffff\1\74",
            "\1\75\32\uffff\1\76",
            "\1\35\3\uffff\1\77\4\uffff\1\100",
            "\1\101\6\uffff\1\102",
            "\2\7\2\uffff\1\6\22\uffff\1\55\3\uffff\1\54\1\uffff\1\7",
            "\1\103\6\uffff\1\104",
            "\1\43\30\uffff\1\42\1\uffff\1\44",
            "\1\106\30\uffff\1\105\1\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\45\10\uffff\1\63",
            "\1\45",
            "\1\113\36\uffff\1\112",
            "\1\114",
            "\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126",
            "\1\127",
            "\1\35",
            "\1\130",
            "\2\7\2\uffff\1\6\22\uffff\1\70\5\uffff\1\7",
            "\1\106",
            "\2\7\2\uffff\1\6\22\uffff\1\132\3\uffff\1\131\1\uffff\1\7",
            "\1\134\36\uffff\1\133",
            "\1\45\3\uffff\1\72\4\uffff\1\63",
            "\1\73\6\uffff\1\74",
            "\1\135",
            "\1\45",
            "\1\35\3\uffff\1\77\4\uffff\1\100",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\101\6\uffff\1\102",
            "\1\103\6\uffff\1\104",
            "\1\150",
            "\1\106\30\uffff\1\105\1\uffff\1\107",
            "\1\151",
            "\2\7\2\uffff\1\6\22\uffff\1\152\5\uffff\1\7",
            "\1\153\6\uffff\1\154",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\4\uffff\1\35",
            "\2\7\2\uffff\1\6\22\uffff\1\132\3\uffff\1\131\1\uffff\1\7",
            "\1\155\6\uffff\1\156",
            "\1\106\30\uffff\1\105\1\uffff\1\107",
            "\1\157",
            "\1\45",
            "\1\160",
            "\2\7\2\uffff\1\6\22\uffff\1\152\5\uffff\1\7",
            "\1\153\6\uffff\1\154",
            "\1\155\6\uffff\1\156"
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
            return "1108:1: rule__EmfsFile__ContentProviderAlternatives_4_1_0 : ( ( ruleStringContentProvider ) | ( ruleWrappingStringContentProvider ) );";
        }
    }
    static final String DFA23_eotS =
        "\13\uffff";
    static final String DFA23_eofS =
        "\13\uffff";
    static final String DFA23_minS =
        "\1\6\1\33\1\6\2\uffff\1\6\1\0\1\37\1\6\1\0\1\37";
    static final String DFA23_maxS =
        "\1\41\1\37\1\45\2\uffff\1\6\1\0\1\46\1\6\1\0\1\46";
    static final String DFA23_acceptS =
        "\3\uffff\1\2\1\1\6\uffff";
    static final String DFA23_specialS =
        "\6\uffff\1\1\2\uffff\1\0\1\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\32\uffff\1\2",
            "\1\3\3\uffff\1\4",
            "\1\6\36\uffff\1\5",
            "",
            "",
            "\1\7",
            "\1\uffff",
            "\1\10\6\uffff\1\11",
            "\1\12",
            "\1\uffff",
            "\1\10\6\uffff\1\11"
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
            return "1504:1: rule__GitContentRef__Alternatives_2 : ( ( ( rule__GitContentRef__Group_2_0__0 ) ) | ( ( rule__GitContentRef__OwnerAssignment_2_1 ) ) );";
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
                        if ( (synpred35_InternalXemfs()) ) {s = 4;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_6 = input.LA(1);

                         
                        int index23_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalXemfs()) ) {s = 4;}

                        else if ( (true) ) {s = 3;}

                         
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
    static final String DFA47_eotS =
        "\11\uffff";
    static final String DFA47_eofS =
        "\3\uffff\1\1\5\uffff";
    static final String DFA47_minS =
        "\1\4\1\uffff\1\6\1\4\1\6\1\uffff\1\4\1\6\1\4";
    static final String DFA47_maxS =
        "\1\44\1\uffff\1\45\1\44\1\6\1\uffff\1\55\1\6\1\55";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\3\uffff\1\1\3\uffff";
    static final String DFA47_specialS =
        "\11\uffff}>";
    static final String[] DFA47_transitionS = {
            "\2\1\2\uffff\1\1\30\uffff\1\2\1\uffff\2\1",
            "",
            "\1\3\36\uffff\1\1",
            "\3\1\1\uffff\1\1\26\uffff\1\4\1\uffff\1\1\1\5\2\1",
            "\1\6",
            "",
            "\2\1\2\uffff\1\1\22\uffff\1\1\1\uffff\1\1\1\uffff\1\7\1\uffff\1\1\1\5\2\1\10\uffff\1\1",
            "\1\10",
            "\2\1\2\uffff\1\1\22\uffff\1\1\1\uffff\1\1\1\uffff\1\7\1\uffff\1\1\1\5\2\1\10\uffff\1\1"
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "()* loopback of 3233:1: ( rule__EmfsFile__PropertiesAssignment_3 )*";
        }
    }
    static final String DFA52_eotS =
        "\16\uffff";
    static final String DFA52_eofS =
        "\2\uffff\1\6\5\uffff\2\6\2\uffff\1\6\1\uffff";
    static final String DFA52_minS =
        "\2\6\1\4\2\6\2\uffff\1\6\2\4\1\37\1\6\1\4\1\37";
    static final String DFA52_maxS =
        "\1\41\1\6\1\41\1\45\1\6\2\uffff\1\6\2\41\1\46\1\6\1\41\1\46";
    static final String DFA52_acceptS =
        "\5\uffff\1\1\1\2\7\uffff";
    static final String DFA52_specialS =
        "\16\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\2\30\uffff\1\1\1\uffff\1\3",
            "\1\2",
            "\2\6\2\uffff\1\6\22\uffff\1\5\3\uffff\1\4\1\uffff\1\6",
            "\1\10\36\uffff\1\7",
            "\1\11",
            "",
            "",
            "\1\12",
            "\2\6\2\uffff\1\6\22\uffff\1\5\5\uffff\1\6",
            "\2\6\2\uffff\1\6\22\uffff\1\5\3\uffff\1\4\1\uffff\1\6",
            "\1\13\6\uffff\1\14",
            "\1\15",
            "\2\6\2\uffff\1\6\22\uffff\1\5\5\uffff\1\6",
            "\1\13\6\uffff\1\14"
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "()* loopback of 4445:1: ( rule__URL_PATH__Alternatives_1 )*";
        }
    }
    static final String DFA57_eotS =
        "\7\uffff";
    static final String DFA57_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA57_minS =
        "\2\6\1\10\1\6\2\uffff\1\10";
    static final String DFA57_maxS =
        "\1\37\1\6\1\52\1\6\2\uffff\1\52";
    static final String DFA57_acceptS =
        "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA57_specialS =
        "\7\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\2\30\uffff\1\1",
            "\1\2",
            "\1\4\16\uffff\4\4\1\5\3\uffff\1\3\12\uffff\1\4",
            "\1\6",
            "",
            "",
            "\1\4\16\uffff\4\4\1\5\3\uffff\1\3\12\uffff\1\4"
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "()* loopback of 5114:1: ( ruleFolderName )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEmfsRoot_in_entryRuleEmfsRoot67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsRoot74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__0_in_ruleEmfsRoot100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_entryRuleEmfsName127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsName134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group__0_in_ruleEmfsName160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_entryRuleEmfsResourcesRef187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsResourcesRef194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group__0_in_ruleEmfsResourcesRef220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceName_in_entryRuleResourceName247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceName254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceName__Group__0_in_ruleResourceName280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_entryRuleEmfsResource307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsResource314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResource__Alternatives_in_ruleEmfsResource340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_entryRuleFolderName427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFolderName434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FolderName__Group__0_in_ruleFolderName460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsContainer_in_entryRuleEmfsContainer487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsContainer494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__0_in_ruleEmfsContainer520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_entryRuleGitContentProvider547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitContentProvider554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentProvider__GitRefAssignment_in_ruleGitContentProvider580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFileName614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceName_in_ruleFileName640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsFile_in_entryRuleEmfsFile666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsFile673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__0_in_ruleEmfsFile699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringContentProvider_in_entryRuleStringContentProvider726 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringContentProvider733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringContentProvider__StringContentsAssignment_in_ruleStringContentProvider761 = new BitSet(new long[]{0x0000000200000032L});
        public static final BitSet FOLLOW_rule__StringContentProvider__StringContentsAssignment_in_ruleStringContentProvider773 = new BitSet(new long[]{0x0000000200000032L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_entryRuleAbstractStringContents803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractStringContents810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AbstractStringContents__Alternatives_in_ruleAbstractStringContents836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVerbatimStringContents_in_entryRuleVerbatimStringContents863 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVerbatimStringContents870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VerbatimStringContents__StringContentAssignment_in_ruleVerbatimStringContents896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValueString_in_entryRulePropertyValueString923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyValueString930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__0_in_rulePropertyValueString956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWrappingStringContentProvider_in_entryRuleWrappingStringContentProvider983 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWrappingStringContentProvider990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__0_in_ruleWrappingStringContentProvider1016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_entryRulePROPERTY_REF1043 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePROPERTY_REF1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Group__0_in_rulePROPERTY_REF1076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_SCHEME_in_entryRuleURL_SCHEME1103 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_SCHEME1110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_SCHEME__Alternatives_in_ruleURL_SCHEME1136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_HOST_NAME_in_entryRuleURL_HOST_NAME1163 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_HOST_NAME1170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST_NAME__Group__0_in_ruleURL_HOST_NAME1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_HOST_in_entryRuleURL_HOST1223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_HOST1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__0_in_ruleURL_HOST1256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_entryRuleURL_PATH1283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_PATH1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__0_in_ruleURL_PATH1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_in_entryRuleURL1343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL__Group__0_in_ruleURL1376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_entryRuleURLContentProvider1403 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURLContentProvider1410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URLContentProvider__UrlStringAssignment_in_ruleURLContentProvider1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_entryRuleGitURLContentProvider1463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitURLContentProvider1470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitURLContentProvider__GitRefAssignment_in_ruleGitURLContentProvider1496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_entryRuleGitContentRef1523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitContentRef1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__0_in_ruleGitContentRef1556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotClasspathFileContentProvider_in_entryRuleDotClasspathFileContentProvider1583 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotClasspathFileContentProvider1590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__0_in_ruleDotClasspathFileContentProvider1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractClasspathEntry_in_entryRuleAbstractClasspathEntry1643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractClasspathEntry1650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntry_in_ruleAbstractClasspathEntry1676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_entryRuleCLASSPATH_ENTRY_PATH1702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCLASSPATH_ENTRY_PATH1709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__0_in_ruleCLASSPATH_ENTRY_PATH1735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntry_in_entryRuleClasspathEntry1762 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClasspathEntry1769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__0_in_ruleClasspathEntry1795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVERSION_in_entryRuleVERSION1822 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVERSION1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VERSION__Alternatives_in_ruleVERSION1857 = new BitSet(new long[]{0x00000000007FE002L});
        public static final BitSet FOLLOW_rule__VERSION__Alternatives_in_ruleVERSION1869 = new BitSet(new long[]{0x00000000007FE002L});
        public static final BitSet FOLLOW_ruleDotProjectFileContentProvider_in_entryRuleDotProjectFileContentProvider1899 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotProjectFileContentProvider1906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__0_in_ruleDotProjectFileContentProvider1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntryKind__Alternatives_in_ruleClasspathEntryKind1969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_rule__EmfsRoot__ContentProviderAlternatives_4_1_02004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_rule__EmfsRoot__ContentProviderAlternatives_4_1_02021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsContainer_in_rule__EmfsResource__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsFile_in_rule__EmfsResource__Alternatives2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__ValueAlternatives_3_02102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__Property__ValueAlternatives_3_02119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_rule__EmfsContainer__ContentProviderAlternatives_3_1_02151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_rule__EmfsContainer__ContentProviderAlternatives_3_1_02168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__0_in_rule__EmfsFile__Alternatives_42200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_1_in_rule__EmfsFile__Alternatives_42218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_2__0_in_rule__EmfsFile__Alternatives_42236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__EmfsFile__Alternatives_42255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_0_1_02289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_0_1_02306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_1_02338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWrappingStringContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_1_02355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotClasspathFileContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_2_1_02387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotProjectFileContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_2_1_02404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValueString_in_rule__AbstractStringContents__Alternatives2436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVerbatimStringContents_in_rule__AbstractStringContents__Alternatives2453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__VerbatimStringContents__StringContentAlternatives_02485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_CONTENT_in_rule__VerbatimStringContents__StringContentAlternatives_02502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__PropertyNameAssignment_1_0_in_rule__PropertyValueString__Alternatives_12534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__0_in_rule__PropertyValueString__Alternatives_12552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyValueString__DefaultValueAlternatives_2_1_02585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__PropertyValueString__DefaultValueAlternatives_2_1_02602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_02634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_02651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Group_1_0__0_in_rule__PROPERTY_REF__Alternatives_12683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PROPERTY_REF__Alternatives_12701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_9_in_rule__URL_SCHEME__Alternatives2734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_10_in_rule__URL_SCHEME__Alternatives2754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__URL_SCHEME__Alternatives2774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__URL_SCHEME__Alternatives2794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_1_0__0_in_rule__URL_HOST__Alternatives_12828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_rule__URL_HOST__Alternatives_12846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__URL_HOST__Alternatives_1_0_1_12879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__URL_HOST__Alternatives_1_0_1_12899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__URL_HOST__Alternatives_1_0_1_12919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__URL_HOST__Alternatives_1_0_1_12939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__URL_HOST__Alternatives_1_0_1_12959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__URL_HOST__Alternatives_1_0_1_12979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__URL_HOST__Alternatives_1_0_1_12999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__URL_HOST__Alternatives_1_0_1_13019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__URL_HOST__Alternatives_1_0_1_13039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__URL_HOST__Alternatives_1_0_1_13059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_rule__URL_PATH__Alternatives_13093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group_1_1__0_in_rule__URL_PATH__Alternatives_13110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_rule__URL_PATH__Alternatives_23143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_rule__URL_PATH__Alternatives_23160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__URLContentProvider__UrlStringAlternatives_03192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_in_rule__URLContentProvider__UrlStringAlternatives_03209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0__0_in_rule__GitContentRef__Alternatives_23241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__OwnerAssignment_2_1_in_rule__GitContentRef__Alternatives_23259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_HOST_NAME_in_rule__GitContentRef__HostAlternatives_2_0_0_03292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_rule__GitContentRef__HostAlternatives_2_0_0_03309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GitContentRef__OwnerAlternatives_2_0_1_1_03341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_rule__GitContentRef__OwnerAlternatives_2_0_1_1_03358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GitContentRef__OwnerAlternatives_2_1_03390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_rule__GitContentRef__OwnerAlternatives_2_1_03407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__VERSION__Alternatives3440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__VERSION__Alternatives3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__VERSION__Alternatives3480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__VERSION__Alternatives3500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__VERSION__Alternatives3520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__VERSION__Alternatives3540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__VERSION__Alternatives3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__VERSION__Alternatives3580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__VERSION__Alternatives3600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__VERSION__Alternatives3620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_03654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_03671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ClasspathEntryKind__Alternatives3704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ClasspathEntryKind__Alternatives3725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ClasspathEntryKind__Alternatives3746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ClasspathEntryKind__Alternatives3767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__0__Impl_in_rule__EmfsRoot__Group__03800 = new BitSet(new long[]{0x0000000278000000L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__1_in_rule__EmfsRoot__Group__03803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__1__Impl_in_rule__EmfsRoot__Group__13861 = new BitSet(new long[]{0x0000000278000000L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__2_in_rule__EmfsRoot__Group__13864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_1__0_in_rule__EmfsRoot__Group__1__Impl3891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__2__Impl_in_rule__EmfsRoot__Group__23922 = new BitSet(new long[]{0x0000000278000000L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__3_in_rule__EmfsRoot__Group__23925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_2__0_in_rule__EmfsRoot__Group__2__Impl3952 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__3__Impl_in_rule__EmfsRoot__Group__33983 = new BitSet(new long[]{0x0000000278000000L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__4_in_rule__EmfsRoot__Group__33986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__PropertiesAssignment_3_in_rule__EmfsRoot__Group__3__Impl4013 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__4__Impl_in_rule__EmfsRoot__Group__44044 = new BitSet(new long[]{0x0000000278000000L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__5_in_rule__EmfsRoot__Group__44047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_4__0_in_rule__EmfsRoot__Group__4__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__5__Impl_in_rule__EmfsRoot__Group__54105 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__6_in_rule__EmfsRoot__Group__54108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__EmfsRoot__Group__5__Impl4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__6__Impl_in_rule__EmfsRoot__Group__64167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__ResourcesAssignment_6_in_rule__EmfsRoot__Group__6__Impl4194 = new BitSet(new long[]{0x0000000080000042L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_1__0__Impl_in_rule__EmfsRoot__Group_1__04239 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_1__1_in_rule__EmfsRoot__Group_1__04242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__EmfsRoot__Group_1__0__Impl4270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_1__1__Impl_in_rule__EmfsRoot__Group_1__14301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__NameAssignment_1_1_in_rule__EmfsRoot__Group_1__1__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_2__0__Impl_in_rule__EmfsRoot__Group_2__04363 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_2__1_in_rule__EmfsRoot__Group_2__04366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EmfsRoot__Group_2__0__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_2__1__Impl_in_rule__EmfsRoot__Group_2__14425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__TagsAssignment_2_1_in_rule__EmfsRoot__Group_2__1__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_4__0__Impl_in_rule__EmfsRoot__Group_4__04486 = new BitSet(new long[]{0x0000010000000040L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_4__1_in_rule__EmfsRoot__Group_4__04489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EmfsRoot__Group_4__0__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_4__1__Impl_in_rule__EmfsRoot__Group_4__14548 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_4__2_in_rule__EmfsRoot__Group_4__14551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__ContentProviderAssignment_4_1_in_rule__EmfsRoot__Group_4__1__Impl4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_4__2__Impl_in_rule__EmfsRoot__Group_4__24608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__EmfsRoot__Group_4__2__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group__0__Impl_in_rule__EmfsName__Group__04673 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__EmfsName__Group__1_in_rule__EmfsName__Group__04676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmfsName__Group__0__Impl4703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group__1__Impl_in_rule__EmfsName__Group__14732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group_1__0_in_rule__EmfsName__Group__1__Impl4759 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group_1__0__Impl_in_rule__EmfsName__Group_1__04794 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsName__Group_1__1_in_rule__EmfsName__Group_1__04797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EmfsName__Group_1__0__Impl4825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group_1__1__Impl_in_rule__EmfsName__Group_1__14856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmfsName__Group_1__1__Impl4883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group__0__Impl_in_rule__EmfsResourcesRef__Group__04916 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group__1_in_rule__EmfsResourcesRef__Group__04919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__ResourcesAssignment_0_in_rule__EmfsResourcesRef__Group__0__Impl4946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group__1__Impl_in_rule__EmfsResourcesRef__Group__14976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group_1__0_in_rule__EmfsResourcesRef__Group__1__Impl5003 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group_1__0__Impl_in_rule__EmfsResourcesRef__Group_1__05038 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group_1__1_in_rule__EmfsResourcesRef__Group_1__05041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__EmfsResourcesRef__Group_1__0__Impl5069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group_1__1__Impl_in_rule__EmfsResourcesRef__Group_1__15100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__ResourcesAssignment_1_1_in_rule__EmfsResourcesRef__Group_1__1__Impl5127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceName__Group__0__Impl_in_rule__ResourceName__Group__05161 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__ResourceName__Group__1_in_rule__ResourceName__Group__05164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ResourceName__Group__0__Impl5193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceName__Group__1__Impl_in_rule__ResourceName__Group__15226 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ResourceName__Group__2_in_rule__ResourceName__Group__15229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceName__Group__1__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceName__Group__2__Impl_in_rule__ResourceName__Group__25285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceName__Group_2__0_in_rule__ResourceName__Group__2__Impl5312 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ResourceName__Group_2__0__Impl_in_rule__ResourceName__Group_2__05349 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__ResourceName__Group_2__1_in_rule__ResourceName__Group_2__05352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ResourceName__Group_2__0__Impl5380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResourceName__Group_2__1__Impl_in_rule__ResourceName__Group_2__15411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceName__Group_2__1__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05471 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Property__Group__0__Impl5502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15533 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__15536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl5563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__25593 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__25596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Property__Group__2__Impl5624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__35655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__ValueAssignment_3_in_rule__Property__Group__3__Impl5682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FolderName__Group__0__Impl_in_rule__FolderName__Group__05720 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__FolderName__Group__1_in_rule__FolderName__Group__05723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceName_in_rule__FolderName__Group__0__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FolderName__Group__1__Impl_in_rule__FolderName__Group__15779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__FolderName__Group__1__Impl5807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__0__Impl_in_rule__EmfsContainer__Group__05842 = new BitSet(new long[]{0x00000002E0000140L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__1_in_rule__EmfsContainer__Group__05845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__NameAssignment_0_in_rule__EmfsContainer__Group__0__Impl5872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__1__Impl_in_rule__EmfsContainer__Group__15902 = new BitSet(new long[]{0x00000002E0000140L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__2_in_rule__EmfsContainer__Group__15905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_1__0_in_rule__EmfsContainer__Group__1__Impl5932 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__2__Impl_in_rule__EmfsContainer__Group__25963 = new BitSet(new long[]{0x00000002E0000140L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__3_in_rule__EmfsContainer__Group__25966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__PropertiesAssignment_2_in_rule__EmfsContainer__Group__2__Impl5993 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__3__Impl_in_rule__EmfsContainer__Group__36024 = new BitSet(new long[]{0x00000002E0000140L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__4_in_rule__EmfsContainer__Group__36027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__0_in_rule__EmfsContainer__Group__3__Impl6054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__4__Impl_in_rule__EmfsContainer__Group__46085 = new BitSet(new long[]{0x00000002E0000140L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__5_in_rule__EmfsContainer__Group__46088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__ResourcesAssignment_4_in_rule__EmfsContainer__Group__4__Impl6115 = new BitSet(new long[]{0x0000000080000042L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__5__Impl_in_rule__EmfsContainer__Group__56146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__EmfsContainer__Group__5__Impl6175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_1__0__Impl_in_rule__EmfsContainer__Group_1__06220 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_1__1_in_rule__EmfsContainer__Group_1__06223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EmfsContainer__Group_1__0__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_1__1__Impl_in_rule__EmfsContainer__Group_1__16282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__TagsAssignment_1_1_in_rule__EmfsContainer__Group_1__1__Impl6309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__0__Impl_in_rule__EmfsContainer__Group_3__06343 = new BitSet(new long[]{0x0000010000000040L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__1_in_rule__EmfsContainer__Group_3__06346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EmfsContainer__Group_3__0__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__1__Impl_in_rule__EmfsContainer__Group_3__16405 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__2_in_rule__EmfsContainer__Group_3__16408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__ContentProviderAssignment_3_1_in_rule__EmfsContainer__Group_3__1__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__2__Impl_in_rule__EmfsContainer__Group_3__26465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__EmfsContainer__Group_3__2__Impl6493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__0__Impl_in_rule__EmfsFile__Group__06530 = new BitSet(new long[]{0x0000201A20000130L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__1_in_rule__EmfsFile__Group__06533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__NameAssignment_0_in_rule__EmfsFile__Group__0__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__1__Impl_in_rule__EmfsFile__Group__16590 = new BitSet(new long[]{0x0000201A20000130L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__2_in_rule__EmfsFile__Group__16593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__WriteableAssignment_1_in_rule__EmfsFile__Group__1__Impl6620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__2__Impl_in_rule__EmfsFile__Group__26651 = new BitSet(new long[]{0x0000201A20000130L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__3_in_rule__EmfsFile__Group__26654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_2__0_in_rule__EmfsFile__Group__2__Impl6681 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__3__Impl_in_rule__EmfsFile__Group__36712 = new BitSet(new long[]{0x0000201A20000130L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__4_in_rule__EmfsFile__Group__36715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__PropertiesAssignment_3_in_rule__EmfsFile__Group__3__Impl6742 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__4__Impl_in_rule__EmfsFile__Group__46773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Alternatives_4_in_rule__EmfsFile__Group__4__Impl6800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_2__0__Impl_in_rule__EmfsFile__Group_2__06840 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_2__1_in_rule__EmfsFile__Group_2__06843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EmfsFile__Group_2__0__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_2__1__Impl_in_rule__EmfsFile__Group_2__16902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__TagsAssignment_2_1_in_rule__EmfsFile__Group_2__1__Impl6929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__0__Impl_in_rule__EmfsFile__Group_4_0__06963 = new BitSet(new long[]{0x0000010000001E10L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__1_in_rule__EmfsFile__Group_4_0__06966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__EmfsFile__Group_4_0__0__Impl6994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__1__Impl_in_rule__EmfsFile__Group_4_0__17025 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__2_in_rule__EmfsFile__Group_4_0__17028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_0_1_in_rule__EmfsFile__Group_4_0__1__Impl7055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__2__Impl_in_rule__EmfsFile__Group_4_0__27085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__EmfsFile__Group_4_0__2__Impl7113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_2__0__Impl_in_rule__EmfsFile__Group_4_2__07150 = new BitSet(new long[]{0x0000120000000000L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_2__1_in_rule__EmfsFile__Group_4_2__07153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__EmfsFile__Group_4_2__0__Impl7181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_2__1__Impl_in_rule__EmfsFile__Group_4_2__17212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_2_1_in_rule__EmfsFile__Group_4_2__1__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__0__Impl_in_rule__PropertyValueString__Group__07273 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__1_in_rule__PropertyValueString__Group__07276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__PropertyValueString__Group__0__Impl7304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__1__Impl_in_rule__PropertyValueString__Group__17335 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__2_in_rule__PropertyValueString__Group__17338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Alternatives_1_in_rule__PropertyValueString__Group__1__Impl7365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__2__Impl_in_rule__PropertyValueString__Group__27395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_2__0_in_rule__PropertyValueString__Group__2__Impl7422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__0__Impl_in_rule__PropertyValueString__Group_1_1__07459 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__1_in_rule__PropertyValueString__Group_1_1__07462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__PropertyValueString__Group_1_1__0__Impl7490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__1__Impl_in_rule__PropertyValueString__Group_1_1__17521 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__2_in_rule__PropertyValueString__Group_1_1__17524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__PropertyNameAssignment_1_1_1_in_rule__PropertyValueString__Group_1_1__1__Impl7551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__2__Impl_in_rule__PropertyValueString__Group_1_1__27581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__PropertyValueString__Group_1_1__2__Impl7609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_2__0__Impl_in_rule__PropertyValueString__Group_2__07646 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_2__1_in_rule__PropertyValueString__Group_2__07649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__PropertyValueString__Group_2__0__Impl7677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_2__1__Impl_in_rule__PropertyValueString__Group_2__17708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__DefaultValueAssignment_2_1_in_rule__PropertyValueString__Group_2__1__Impl7735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__0__Impl_in_rule__WrappingStringContentProvider__Group__07769 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__1_in_rule__WrappingStringContentProvider__Group__07772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__PrefixAssignment_0_in_rule__WrappingStringContentProvider__Group__0__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__1__Impl_in_rule__WrappingStringContentProvider__Group__17829 = new BitSet(new long[]{0x0000000200000030L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__2_in_rule__WrappingStringContentProvider__Group__17832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group_1__0_in_rule__WrappingStringContentProvider__Group__1__Impl7859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__2__Impl_in_rule__WrappingStringContentProvider__Group__27889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__SuffixAssignment_2_in_rule__WrappingStringContentProvider__Group__2__Impl7916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group_1__0__Impl_in_rule__WrappingStringContentProvider__Group_1__07952 = new BitSet(new long[]{0x0000010000001E10L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group_1__1_in_rule__WrappingStringContentProvider__Group_1__07955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__WrappingStringContentProvider__Group_1__0__Impl7983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group_1__1__Impl_in_rule__WrappingStringContentProvider__Group_1__18014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__ContentProviderAssignment_1_1_in_rule__WrappingStringContentProvider__Group_1__1__Impl8041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Group__0__Impl_in_rule__PROPERTY_REF__Group__08075 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Group__1_in_rule__PROPERTY_REF__Group__08078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__PROPERTY_REF__Group__0__Impl8106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Group__1__Impl_in_rule__PROPERTY_REF__Group__18137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Alternatives_1_in_rule__PROPERTY_REF__Group__1__Impl8164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Group_1_0__0__Impl_in_rule__PROPERTY_REF__Group_1_0__08198 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Group_1_0__1_in_rule__PROPERTY_REF__Group_1_0__08201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__PROPERTY_REF__Group_1_0__0__Impl8229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Group_1_0__1__Impl_in_rule__PROPERTY_REF__Group_1_0__18260 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Group_1_0__2_in_rule__PROPERTY_REF__Group_1_0__18263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__PROPERTY_REF__Group_1_0__1__Impl8290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PROPERTY_REF__Group_1_0__2__Impl_in_rule__PROPERTY_REF__Group_1_0__28319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__PROPERTY_REF__Group_1_0__2__Impl8347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST_NAME__Group__0__Impl_in_rule__URL_HOST_NAME__Group__08384 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__URL_HOST_NAME__Group__1_in_rule__URL_HOST_NAME__Group__08387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__URL_HOST_NAME__Group__0__Impl8414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST_NAME__Group__1__Impl_in_rule__URL_HOST_NAME__Group__18443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST_NAME__Group_1__0_in_rule__URL_HOST_NAME__Group__1__Impl8472 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__URL_HOST_NAME__Group_1__0_in_rule__URL_HOST_NAME__Group__1__Impl8484 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__URL_HOST_NAME__Group_1__0__Impl_in_rule__URL_HOST_NAME__Group_1__08521 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__URL_HOST_NAME__Group_1__1_in_rule__URL_HOST_NAME__Group_1__08524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__URL_HOST_NAME__Group_1__0__Impl8552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST_NAME__Group_1__1__Impl_in_rule__URL_HOST_NAME__Group_1__18583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__URL_HOST_NAME__Group_1__1__Impl8610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__0__Impl_in_rule__URL_HOST__Group__08643 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__1_in_rule__URL_HOST__Group__08646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__URL_HOST__Group__0__Impl8674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__1__Impl_in_rule__URL_HOST__Group__18705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Alternatives_1_in_rule__URL_HOST__Group__1__Impl8732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_1_0__0__Impl_in_rule__URL_HOST__Group_1_0__08766 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_1_0__1_in_rule__URL_HOST__Group_1_0__08769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_HOST_NAME_in_rule__URL_HOST__Group_1_0__0__Impl8796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_1_0__1__Impl_in_rule__URL_HOST__Group_1_0__18825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_1_0_1__0_in_rule__URL_HOST__Group_1_0__1__Impl8852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_1_0_1__0__Impl_in_rule__URL_HOST__Group_1_0_1__08887 = new BitSet(new long[]{0x00000000007FE000L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_1_0_1__1_in_rule__URL_HOST__Group_1_0_1__08890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__URL_HOST__Group_1_0_1__0__Impl8918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_1_0_1__1__Impl_in_rule__URL_HOST__Group_1_0_1__18949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Alternatives_1_0_1_1_in_rule__URL_HOST__Group_1_0_1__1__Impl8978 = new BitSet(new long[]{0x00000000007FE002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Alternatives_1_0_1_1_in_rule__URL_HOST__Group_1_0_1__1__Impl8990 = new BitSet(new long[]{0x00000000007FE002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__0__Impl_in_rule__URL_PATH__Group__09027 = new BitSet(new long[]{0x0000000280000040L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__1_in_rule__URL_PATH__Group__09030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__URL_PATH__Group__0__Impl9058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__1__Impl_in_rule__URL_PATH__Group__19089 = new BitSet(new long[]{0x0000000280000040L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__2_in_rule__URL_PATH__Group__19092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Alternatives_1_in_rule__URL_PATH__Group__1__Impl9119 = new BitSet(new long[]{0x0000000280000042L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__2__Impl_in_rule__URL_PATH__Group__29150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Alternatives_2_in_rule__URL_PATH__Group__2__Impl9177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group_1_1__0__Impl_in_rule__URL_PATH__Group_1_1__09213 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group_1_1__1_in_rule__URL_PATH__Group_1_1__09216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_rule__URL_PATH__Group_1_1__0__Impl9243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group_1_1__1__Impl_in_rule__URL_PATH__Group_1_1__19272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__URL_PATH__Group_1_1__1__Impl9300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL__Group__0__Impl_in_rule__URL__Group__09335 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__URL__Group__1_in_rule__URL__Group__09338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_SCHEME_in_rule__URL__Group__0__Impl9365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL__Group__1__Impl_in_rule__URL__Group__19394 = new BitSet(new long[]{0x0000008008000000L});
        public static final BitSet FOLLOW_rule__URL__Group__2_in_rule__URL__Group__19397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__URL__Group__1__Impl9425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL__Group__2__Impl_in_rule__URL__Group__29456 = new BitSet(new long[]{0x0000008008000000L});
        public static final BitSet FOLLOW_rule__URL__Group__3_in_rule__URL__Group__29459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_HOST_in_rule__URL__Group__2__Impl9487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL__Group__3__Impl_in_rule__URL__Group__39518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_rule__URL__Group__3__Impl9545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__0__Impl_in_rule__GitContentRef__Group__09582 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__1_in_rule__GitContentRef__Group__09585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__GitContentRef__Group__0__Impl9613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__1__Impl_in_rule__GitContentRef__Group__19644 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__2_in_rule__GitContentRef__Group__19647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__GitContentRef__Group__1__Impl9675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__2__Impl_in_rule__GitContentRef__Group__29706 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__3_in_rule__GitContentRef__Group__29709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Alternatives_2_in_rule__GitContentRef__Group__2__Impl9736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__3__Impl_in_rule__GitContentRef__Group__39766 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__4_in_rule__GitContentRef__Group__39769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__GitContentRef__Group__3__Impl9797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__4__Impl_in_rule__GitContentRef__Group__49828 = new BitSet(new long[]{0x0000008008000000L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__5_in_rule__GitContentRef__Group__49831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__RepoAssignment_4_in_rule__GitContentRef__Group__4__Impl9858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__5__Impl_in_rule__GitContentRef__Group__59888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__PathAssignment_5_in_rule__GitContentRef__Group__5__Impl9915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0__0__Impl_in_rule__GitContentRef__Group_2_0__09958 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0__1_in_rule__GitContentRef__Group_2_0__09961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__HostAssignment_2_0_0_in_rule__GitContentRef__Group_2_0__0__Impl9988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0__1__Impl_in_rule__GitContentRef__Group_2_0__110018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0_1__0_in_rule__GitContentRef__Group_2_0__1__Impl10045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0_1__0__Impl_in_rule__GitContentRef__Group_2_0_1__010080 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0_1__1_in_rule__GitContentRef__Group_2_0_1__010083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__GitContentRef__Group_2_0_1__0__Impl10111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0_1__1__Impl_in_rule__GitContentRef__Group_2_0_1__110142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__OwnerAssignment_2_0_1_1_in_rule__GitContentRef__Group_2_0_1__1__Impl10169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__0__Impl_in_rule__DotClasspathFileContentProvider__Group__010203 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__1_in_rule__DotClasspathFileContentProvider__Group__010206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__DotClasspathFileContentProvider__Group__0__Impl10234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__1__Impl_in_rule__DotClasspathFileContentProvider__Group__110265 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__2_in_rule__DotClasspathFileContentProvider__Group__110268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__EntriesAssignment_1_in_rule__DotClasspathFileContentProvider__Group__1__Impl10297 = new BitSet(new long[]{0x0000000007800002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__EntriesAssignment_1_in_rule__DotClasspathFileContentProvider__Group__1__Impl10309 = new BitSet(new long[]{0x0000000007800002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__2__Impl_in_rule__DotClasspathFileContentProvider__Group__210342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__DotClasspathFileContentProvider__Group__2__Impl10370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__0__Impl_in_rule__CLASSPATH_ENTRY_PATH__Group__010407 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__1_in_rule__CLASSPATH_ENTRY_PATH__Group__010410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_rule__CLASSPATH_ENTRY_PATH__Group__0__Impl10438 = new BitSet(new long[]{0x0000000080000042L});
        public static final BitSet FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__1__Impl_in_rule__CLASSPATH_ENTRY_PATH__Group__110469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_rule__CLASSPATH_ENTRY_PATH__Group__1__Impl10496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__0__Impl_in_rule__ClasspathEntry__Group__010529 = new BitSet(new long[]{0x0000000088000040L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__1_in_rule__ClasspathEntry__Group__010532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__ExplicitKindAssignment_0_in_rule__ClasspathEntry__Group__0__Impl10559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__1__Impl_in_rule__ClasspathEntry__Group__110589 = new BitSet(new long[]{0x0000000088000040L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__2_in_rule__ClasspathEntry__Group__110592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__AbsoluteAssignment_1_in_rule__ClasspathEntry__Group__1__Impl10619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__2__Impl_in_rule__ClasspathEntry__Group__210650 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__3_in_rule__ClasspathEntry__Group__210653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__ExplicitPathAssignment_2_in_rule__ClasspathEntry__Group__2__Impl10680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__3__Impl_in_rule__ClasspathEntry__Group__310710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3__0_in_rule__ClasspathEntry__Group__3__Impl10737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3__0__Impl_in_rule__ClasspathEntry__Group_3__010776 = new BitSet(new long[]{0x00000000007FE000L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3__1_in_rule__ClasspathEntry__Group_3__010779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ClasspathEntry__Group_3__0__Impl10807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3__1__Impl_in_rule__ClasspathEntry__Group_3__110838 = new BitSet(new long[]{0x0000080080000000L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3__2_in_rule__ClasspathEntry__Group_3__110841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__MajorAssignment_3_1_in_rule__ClasspathEntry__Group_3__1__Impl10868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3__2__Impl_in_rule__ClasspathEntry__Group_3__210898 = new BitSet(new long[]{0x0000080080000000L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3__3_in_rule__ClasspathEntry__Group_3__210901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3_2__0_in_rule__ClasspathEntry__Group_3__2__Impl10928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3__3__Impl_in_rule__ClasspathEntry__Group_3__310959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__ClasspathEntry__Group_3__3__Impl10987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3_2__0__Impl_in_rule__ClasspathEntry__Group_3_2__011026 = new BitSet(new long[]{0x00000000007FE000L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3_2__1_in_rule__ClasspathEntry__Group_3_2__011029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ClasspathEntry__Group_3_2__0__Impl11057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_3_2__1__Impl_in_rule__ClasspathEntry__Group_3_2__111088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__MinorAssignment_3_2_1_in_rule__ClasspathEntry__Group_3_2__1__Impl11115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__0__Impl_in_rule__DotProjectFileContentProvider__Group__011149 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__1_in_rule__DotProjectFileContentProvider__Group__011152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__DotProjectFileContentProvider__Group__0__Impl11180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__1__Impl_in_rule__DotProjectFileContentProvider__Group__111211 = new BitSet(new long[]{0x0000000800000100L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__2_in_rule__DotProjectFileContentProvider__Group__111214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_1__0_in_rule__DotProjectFileContentProvider__Group__1__Impl11243 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_1__0_in_rule__DotProjectFileContentProvider__Group__1__Impl11255 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__2__Impl_in_rule__DotProjectFileContentProvider__Group__211288 = new BitSet(new long[]{0x0000000800000100L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__3_in_rule__DotProjectFileContentProvider__Group__211291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__0_in_rule__DotProjectFileContentProvider__Group__2__Impl11318 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__3__Impl_in_rule__DotProjectFileContentProvider__Group__311349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__DotProjectFileContentProvider__Group__3__Impl11377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_1__0__Impl_in_rule__DotProjectFileContentProvider__Group_1__011416 = new BitSet(new long[]{0x0000000080000050L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_1__1_in_rule__DotProjectFileContentProvider__Group_1__011419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__DotProjectFileContentProvider__Group_1__0__Impl11447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_1__1__Impl_in_rule__DotProjectFileContentProvider__Group_1__111478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__KeysAssignment_1_1_in_rule__DotProjectFileContentProvider__Group_1__1__Impl11505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__0__Impl_in_rule__DotProjectFileContentProvider__Group_2__011539 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__1_in_rule__DotProjectFileContentProvider__Group_2__011542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__DotProjectFileContentProvider__Group_2__0__Impl11570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__1__Impl_in_rule__DotProjectFileContentProvider__Group_2__111601 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__2_in_rule__DotProjectFileContentProvider__Group_2__111604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1_in_rule__DotProjectFileContentProvider__Group_2__1__Impl11631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__2__Impl_in_rule__DotProjectFileContentProvider__Group_2__211661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__0_in_rule__DotProjectFileContentProvider__Group_2__2__Impl11688 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__0__Impl_in_rule__DotProjectFileContentProvider__Group_2_2__011725 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__1_in_rule__DotProjectFileContentProvider__Group_2_2__011728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__DotProjectFileContentProvider__Group_2_2__0__Impl11756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__1__Impl_in_rule__DotProjectFileContentProvider__Group_2_2__111787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1_in_rule__DotProjectFileContentProvider__Group_2_2__1__Impl11814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__EmfsRoot__NameAssignment_1_111853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmfsRoot__TagsAssignment_2_111884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__EmfsRoot__PropertiesAssignment_311915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__ContentProviderAlternatives_4_1_0_in_rule__EmfsRoot__ContentProviderAssignment_4_111946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_rule__EmfsRoot__ResourcesAssignment_611979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__EmfsResourcesRef__ResourcesAssignment_012014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__EmfsResourcesRef__ResourcesAssignment_1_112053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__Property__NameAssignment_112088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__ValueAlternatives_3_0_in_rule__Property__ValueAssignment_312119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_rule__EmfsContainer__NameAssignment_012152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__EmfsContainer__TagsAssignment_1_112183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__EmfsContainer__PropertiesAssignment_212214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__ContentProviderAlternatives_3_1_0_in_rule__EmfsContainer__ContentProviderAssignment_3_112245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_rule__EmfsContainer__ResourcesAssignment_412278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_rule__GitContentProvider__GitRefAssignment12309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_rule__EmfsFile__NameAssignment_012340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__EmfsFile__WriteableAssignment_112376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmfsFile__TagsAssignment_2_112415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__EmfsFile__PropertiesAssignment_312446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_0_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_0_112477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_112510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_2_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_2_112543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_rule__StringContentProvider__StringContentsAssignment12576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VerbatimStringContents__StringContentAlternatives_0_in_rule__VerbatimStringContents__StringContentAssignment12607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyValueString__PropertyNameAssignment_1_012640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__PropertyValueString__PropertyNameAssignment_1_1_112671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__DefaultValueAlternatives_2_1_0_in_rule__PropertyValueString__DefaultValueAssignment_2_112702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_rule__WrappingStringContentProvider__PrefixAssignment_012735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0_in_rule__WrappingStringContentProvider__ContentProviderAssignment_1_112766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_rule__WrappingStringContentProvider__SuffixAssignment_212799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URLContentProvider__UrlStringAlternatives_0_in_rule__URLContentProvider__UrlStringAssignment12830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_rule__GitURLContentProvider__GitRefAssignment12863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__HostAlternatives_2_0_0_0_in_rule__GitContentRef__HostAssignment_2_0_012894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__OwnerAlternatives_2_0_1_1_0_in_rule__GitContentRef__OwnerAssignment_2_0_1_112927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__OwnerAlternatives_2_1_0_in_rule__GitContentRef__OwnerAssignment_2_112960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GitContentRef__RepoAssignment_412993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_rule__GitContentRef__PathAssignment_513024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractClasspathEntry_in_rule__DotClasspathFileContentProvider__EntriesAssignment_113055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntryKind_in_rule__ClasspathEntry__ExplicitKindAssignment_013086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ClasspathEntry__AbsoluteAssignment_113122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_rule__ClasspathEntry__ExplicitPathAssignment_213161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVERSION_in_rule__ClasspathEntry__MajorAssignment_3_113192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVERSION_in_rule__ClasspathEntry__MinorAssignment_3_2_113223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0_in_rule__DotProjectFileContentProvider__KeysAssignment_1_113254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_113291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_113330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0__0_in_synpred35_InternalXemfs3241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group_1__0_in_synpred58_InternalXemfs4759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__ResourcesAssignment_4_in_synpred65_InternalXemfs6115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_synpred66_InternalXemfs6175 = new BitSet(new long[]{0x0000000000000002L});
    }


}