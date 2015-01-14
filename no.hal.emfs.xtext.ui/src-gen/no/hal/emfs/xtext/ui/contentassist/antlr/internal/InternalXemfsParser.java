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


    // $ANTLR start "entryRuleName"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:145:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:146:1: ( ruleName EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:147:1: ruleName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleName_in_entryRuleName247);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleName254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:154:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:158:2: ( ( ( rule__Name__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:159:1: ( ( rule__Name__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:159:1: ( ( rule__Name__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:160:1: ( rule__Name__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:161:1: ( rule__Name__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:161:2: rule__Name__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__0_in_ruleName280);
            rule__Name__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:322:1: ruleFileName : ( ruleName ) ;
    public final void ruleFileName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:326:2: ( ( ruleName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:327:1: ( ruleName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:327:1: ( ruleName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:328:1: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileNameAccess().getNameParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleName_in_ruleFileName640);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileNameAccess().getNameParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleURL_SCHEME"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:516:1: entryRuleURL_SCHEME : ruleURL_SCHEME EOF ;
    public final void entryRuleURL_SCHEME() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:517:1: ( ruleURL_SCHEME EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:518:1: ruleURL_SCHEME EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_SCHEMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_SCHEME_in_entryRuleURL_SCHEME1043);
            ruleURL_SCHEME();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_SCHEMERule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_SCHEME1050); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:525:1: ruleURL_SCHEME : ( ( rule__URL_SCHEME__Alternatives ) ) ;
    public final void ruleURL_SCHEME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:529:2: ( ( ( rule__URL_SCHEME__Alternatives ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:530:1: ( ( rule__URL_SCHEME__Alternatives ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:530:1: ( ( rule__URL_SCHEME__Alternatives ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:531:1: ( rule__URL_SCHEME__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_SCHEMEAccess().getAlternatives()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:532:1: ( rule__URL_SCHEME__Alternatives )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:532:2: rule__URL_SCHEME__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_SCHEME__Alternatives_in_ruleURL_SCHEME1076);
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


    // $ANTLR start "entryRuleURL_HOST"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:544:1: entryRuleURL_HOST : ruleURL_HOST EOF ;
    public final void entryRuleURL_HOST() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:545:1: ( ruleURL_HOST EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:546:1: ruleURL_HOST EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_in_entryRuleURL_HOST1103);
            ruleURL_HOST();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_HOST1110); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:553:1: ruleURL_HOST : ( ( rule__URL_HOST__Group__0 ) ) ;
    public final void ruleURL_HOST() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:557:2: ( ( ( rule__URL_HOST__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:558:1: ( ( rule__URL_HOST__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:558:1: ( ( rule__URL_HOST__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:559:1: ( rule__URL_HOST__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:560:1: ( rule__URL_HOST__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:560:2: rule__URL_HOST__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__0_in_ruleURL_HOST1136);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:572:1: entryRuleURL_PATH : ruleURL_PATH EOF ;
    public final void entryRuleURL_PATH() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:573:1: ( ruleURL_PATH EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:574:1: ruleURL_PATH EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_entryRuleURL_PATH1163);
            ruleURL_PATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_PATH1170); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:581:1: ruleURL_PATH : ( ( rule__URL_PATH__Group__0 ) ) ;
    public final void ruleURL_PATH() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:585:2: ( ( ( rule__URL_PATH__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:586:1: ( ( rule__URL_PATH__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:586:1: ( ( rule__URL_PATH__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:587:1: ( rule__URL_PATH__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:588:1: ( rule__URL_PATH__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:588:2: rule__URL_PATH__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__0_in_ruleURL_PATH1196);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:600:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:601:1: ( ruleURL EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:602:1: ruleURL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_in_entryRuleURL1223);
            ruleURL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL1230); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:609:1: ruleURL : ( ( rule__URL__Group__0 ) ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:613:2: ( ( ( rule__URL__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:614:1: ( ( rule__URL__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:614:1: ( ( rule__URL__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:615:1: ( rule__URL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:616:1: ( rule__URL__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:616:2: rule__URL__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__0_in_ruleURL1256);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:628:1: entryRuleURLContentProvider : ruleURLContentProvider EOF ;
    public final void entryRuleURLContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:629:1: ( ruleURLContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:630:1: ruleURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_entryRuleURLContentProvider1283);
            ruleURLContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURLContentProvider1290); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:637:1: ruleURLContentProvider : ( ( rule__URLContentProvider__UrlStringAssignment ) ) ;
    public final void ruleURLContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:641:2: ( ( ( rule__URLContentProvider__UrlStringAssignment ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:642:1: ( ( rule__URLContentProvider__UrlStringAssignment ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:642:1: ( ( rule__URLContentProvider__UrlStringAssignment ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:643:1: ( rule__URLContentProvider__UrlStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLContentProviderAccess().getUrlStringAssignment()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:644:1: ( rule__URLContentProvider__UrlStringAssignment )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:644:2: rule__URLContentProvider__UrlStringAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__URLContentProvider__UrlStringAssignment_in_ruleURLContentProvider1316);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:656:1: entryRuleGitURLContentProvider : ruleGitURLContentProvider EOF ;
    public final void entryRuleGitURLContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:657:1: ( ruleGitURLContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:658:1: ruleGitURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_entryRuleGitURLContentProvider1343);
            ruleGitURLContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitURLContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitURLContentProvider1350); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:665:1: ruleGitURLContentProvider : ( ( rule__GitURLContentProvider__GitRefAssignment ) ) ;
    public final void ruleGitURLContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:669:2: ( ( ( rule__GitURLContentProvider__GitRefAssignment ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:670:1: ( ( rule__GitURLContentProvider__GitRefAssignment ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:670:1: ( ( rule__GitURLContentProvider__GitRefAssignment ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:671:1: ( rule__GitURLContentProvider__GitRefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitURLContentProviderAccess().getGitRefAssignment()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:672:1: ( rule__GitURLContentProvider__GitRefAssignment )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:672:2: rule__GitURLContentProvider__GitRefAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitURLContentProvider__GitRefAssignment_in_ruleGitURLContentProvider1376);
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


    // $ANTLR start "entryRuleGIT_HOST"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:684:1: entryRuleGIT_HOST : ruleGIT_HOST EOF ;
    public final void entryRuleGIT_HOST() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:685:1: ( ruleGIT_HOST EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:686:1: ruleGIT_HOST EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIT_HOSTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGIT_HOST_in_entryRuleGIT_HOST1403);
            ruleGIT_HOST();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIT_HOSTRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGIT_HOST1410); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGIT_HOST"


    // $ANTLR start "ruleGIT_HOST"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:693:1: ruleGIT_HOST : ( ( rule__GIT_HOST__Group__0 ) ) ;
    public final void ruleGIT_HOST() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:697:2: ( ( ( rule__GIT_HOST__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:698:1: ( ( rule__GIT_HOST__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:698:1: ( ( rule__GIT_HOST__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:699:1: ( rule__GIT_HOST__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIT_HOSTAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:700:1: ( rule__GIT_HOST__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:700:2: rule__GIT_HOST__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GIT_HOST__Group__0_in_ruleGIT_HOST1436);
            rule__GIT_HOST__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIT_HOSTAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGIT_HOST"


    // $ANTLR start "entryRuleGitContentRef"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:712:1: entryRuleGitContentRef : ruleGitContentRef EOF ;
    public final void entryRuleGitContentRef() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:713:1: ( ruleGitContentRef EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:714:1: ruleGitContentRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_entryRuleGitContentRef1463);
            ruleGitContentRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitContentRef1470); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:721:1: ruleGitContentRef : ( ( rule__GitContentRef__Group__0 ) ) ;
    public final void ruleGitContentRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:725:2: ( ( ( rule__GitContentRef__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:726:1: ( ( rule__GitContentRef__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:726:1: ( ( rule__GitContentRef__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:727:1: ( rule__GitContentRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:728:1: ( rule__GitContentRef__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:728:2: rule__GitContentRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__0_in_ruleGitContentRef1496);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:740:1: entryRuleDotClasspathFileContentProvider : ruleDotClasspathFileContentProvider EOF ;
    public final void entryRuleDotClasspathFileContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:741:1: ( ruleDotClasspathFileContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:742:1: ruleDotClasspathFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDotClasspathFileContentProvider_in_entryRuleDotClasspathFileContentProvider1523);
            ruleDotClasspathFileContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotClasspathFileContentProvider1530); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:749:1: ruleDotClasspathFileContentProvider : ( ( rule__DotClasspathFileContentProvider__Group__0 ) ) ;
    public final void ruleDotClasspathFileContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:753:2: ( ( ( rule__DotClasspathFileContentProvider__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:754:1: ( ( rule__DotClasspathFileContentProvider__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:754:1: ( ( rule__DotClasspathFileContentProvider__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:755:1: ( rule__DotClasspathFileContentProvider__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:756:1: ( rule__DotClasspathFileContentProvider__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:756:2: rule__DotClasspathFileContentProvider__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__0_in_ruleDotClasspathFileContentProvider1556);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:768:1: entryRuleAbstractClasspathEntry : ruleAbstractClasspathEntry EOF ;
    public final void entryRuleAbstractClasspathEntry() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:769:1: ( ruleAbstractClasspathEntry EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:770:1: ruleAbstractClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractClasspathEntry_in_entryRuleAbstractClasspathEntry1583);
            ruleAbstractClasspathEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractClasspathEntryRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractClasspathEntry1590); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:777:1: ruleAbstractClasspathEntry : ( ruleClasspathEntry ) ;
    public final void ruleAbstractClasspathEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:781:2: ( ( ruleClasspathEntry ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:782:1: ( ruleClasspathEntry )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:782:1: ( ruleClasspathEntry )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:783:1: ruleClasspathEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractClasspathEntryAccess().getClasspathEntryParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntry_in_ruleAbstractClasspathEntry1616);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:796:1: entryRuleCLASSPATH_ENTRY_PATH : ruleCLASSPATH_ENTRY_PATH EOF ;
    public final void entryRuleCLASSPATH_ENTRY_PATH() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:797:1: ( ruleCLASSPATH_ENTRY_PATH EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:798:1: ruleCLASSPATH_ENTRY_PATH EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_entryRuleCLASSPATH_ENTRY_PATH1642);
            ruleCLASSPATH_ENTRY_PATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLASSPATH_ENTRY_PATHRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCLASSPATH_ENTRY_PATH1649); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:805:1: ruleCLASSPATH_ENTRY_PATH : ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) ) ;
    public final void ruleCLASSPATH_ENTRY_PATH() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:809:2: ( ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:810:1: ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:810:1: ( ( rule__CLASSPATH_ENTRY_PATH__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:811:1: ( rule__CLASSPATH_ENTRY_PATH__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:812:1: ( rule__CLASSPATH_ENTRY_PATH__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:812:2: rule__CLASSPATH_ENTRY_PATH__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__0_in_ruleCLASSPATH_ENTRY_PATH1675);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:824:1: entryRuleClasspathEntry : ruleClasspathEntry EOF ;
    public final void entryRuleClasspathEntry() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:825:1: ( ruleClasspathEntry EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:826:1: ruleClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntry_in_entryRuleClasspathEntry1702);
            ruleClasspathEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClasspathEntry1709); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:833:1: ruleClasspathEntry : ( ( rule__ClasspathEntry__Group__0 ) ) ;
    public final void ruleClasspathEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:837:2: ( ( ( rule__ClasspathEntry__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:838:1: ( ( rule__ClasspathEntry__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:838:1: ( ( rule__ClasspathEntry__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:839:1: ( rule__ClasspathEntry__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:840:1: ( rule__ClasspathEntry__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:840:2: rule__ClasspathEntry__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__0_in_ruleClasspathEntry1735);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:852:1: entryRuleVERSION : ruleVERSION EOF ;
    public final void entryRuleVERSION() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:853:1: ( ruleVERSION EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:854:1: ruleVERSION EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVERSIONRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_entryRuleVERSION1762);
            ruleVERSION();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVERSIONRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVERSION1769); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:861:1: ruleVERSION : ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) ) ;
    public final void ruleVERSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:865:2: ( ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:866:1: ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:866:1: ( ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:867:1: ( ( rule__VERSION__Alternatives ) ) ( ( rule__VERSION__Alternatives )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:867:1: ( ( rule__VERSION__Alternatives ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:868:1: ( rule__VERSION__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVERSIONAccess().getAlternatives()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:869:1: ( rule__VERSION__Alternatives )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:869:2: rule__VERSION__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__VERSION__Alternatives_in_ruleVERSION1797);
            rule__VERSION__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVERSIONAccess().getAlternatives()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:872:1: ( ( rule__VERSION__Alternatives )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:873:1: ( rule__VERSION__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVERSIONAccess().getAlternatives()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:874:1: ( rule__VERSION__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:874:2: rule__VERSION__Alternatives
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__VERSION__Alternatives_in_ruleVERSION1809);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:887:1: entryRuleDotProjectFileContentProvider : ruleDotProjectFileContentProvider EOF ;
    public final void entryRuleDotProjectFileContentProvider() throws RecognitionException {
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:888:1: ( ruleDotProjectFileContentProvider EOF )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:889:1: ruleDotProjectFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDotProjectFileContentProvider_in_entryRuleDotProjectFileContentProvider1839);
            ruleDotProjectFileContentProvider();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotProjectFileContentProvider1846); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:896:1: ruleDotProjectFileContentProvider : ( ( rule__DotProjectFileContentProvider__Group__0 ) ) ;
    public final void ruleDotProjectFileContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:900:2: ( ( ( rule__DotProjectFileContentProvider__Group__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:901:1: ( ( rule__DotProjectFileContentProvider__Group__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:901:1: ( ( rule__DotProjectFileContentProvider__Group__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:902:1: ( rule__DotProjectFileContentProvider__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:903:1: ( rule__DotProjectFileContentProvider__Group__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:903:2: rule__DotProjectFileContentProvider__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__0_in_ruleDotProjectFileContentProvider1872);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:916:1: ruleClasspathEntryKind : ( ( rule__ClasspathEntryKind__Alternatives ) ) ;
    public final void ruleClasspathEntryKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:920:1: ( ( ( rule__ClasspathEntryKind__Alternatives ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:921:1: ( ( rule__ClasspathEntryKind__Alternatives ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:921:1: ( ( rule__ClasspathEntryKind__Alternatives ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:922:1: ( rule__ClasspathEntryKind__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryKindAccess().getAlternatives()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:923:1: ( rule__ClasspathEntryKind__Alternatives )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:923:2: rule__ClasspathEntryKind__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntryKind__Alternatives_in_ruleClasspathEntryKind1909);
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


    // $ANTLR start "rule__EmfsRoot__ContentProviderAlternatives_3_1_0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:934:1: rule__EmfsRoot__ContentProviderAlternatives_3_1_0 : ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) );
    public final void rule__EmfsRoot__ContentProviderAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:938:1: ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:939:1: ( ruleGitContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:939:1: ( ruleGitContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:940:1: ruleGitContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsRootAccess().getContentProviderGitContentProviderParserRuleCall_3_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_rule__EmfsRoot__ContentProviderAlternatives_3_1_01944);
                    ruleGitContentProvider();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsRootAccess().getContentProviderGitContentProviderParserRuleCall_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:945:6: ( ruleEmfsResourcesRef )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:945:6: ( ruleEmfsResourcesRef )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:946:1: ruleEmfsResourcesRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsRootAccess().getContentProviderEmfsResourcesRefParserRuleCall_3_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_rule__EmfsRoot__ContentProviderAlternatives_3_1_01961);
                    ruleEmfsResourcesRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmfsRootAccess().getContentProviderEmfsResourcesRefParserRuleCall_3_1_0_1()); 
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
    // $ANTLR end "rule__EmfsRoot__ContentProviderAlternatives_3_1_0"


    // $ANTLR start "rule__EmfsResource__Alternatives"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:956:1: rule__EmfsResource__Alternatives : ( ( ruleEmfsContainer ) | ( ruleEmfsFile ) );
    public final void rule__EmfsResource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:960:1: ( ( ruleEmfsContainer ) | ( ruleEmfsFile ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:961:1: ( ruleEmfsContainer )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:961:1: ( ruleEmfsContainer )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:962:1: ruleEmfsContainer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsResourceAccess().getEmfsContainerParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsContainer_in_rule__EmfsResource__Alternatives1993);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:967:6: ( ruleEmfsFile )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:967:6: ( ruleEmfsFile )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:968:1: ruleEmfsFile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsResourceAccess().getEmfsFileParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsFile_in_rule__EmfsResource__Alternatives2010);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:978:1: rule__Property__ValueAlternatives_3_0 : ( ( RULE_STRING ) | ( ruleEmfsName ) );
    public final void rule__Property__ValueAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:982:1: ( ( RULE_STRING ) | ( ruleEmfsName ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:983:1: ( RULE_STRING )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:983:1: ( RULE_STRING )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:984:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Property__ValueAlternatives_3_02042); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:989:6: ( ruleEmfsName )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:989:6: ( ruleEmfsName )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:990:1: ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getValueEmfsNameParserRuleCall_3_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__Property__ValueAlternatives_3_02059);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1000:1: rule__EmfsContainer__ContentProviderAlternatives_3_1_0 : ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) );
    public final void rule__EmfsContainer__ContentProviderAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1004:1: ( ( ruleGitContentProvider ) | ( ruleEmfsResourcesRef ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1005:1: ( ruleGitContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1005:1: ( ruleGitContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1006:1: ruleGitContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsContainerAccess().getContentProviderGitContentProviderParserRuleCall_3_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_rule__EmfsContainer__ContentProviderAlternatives_3_1_02091);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1011:6: ( ruleEmfsResourcesRef )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1011:6: ( ruleEmfsResourcesRef )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1012:1: ruleEmfsResourcesRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsContainerAccess().getContentProviderEmfsResourcesRefParserRuleCall_3_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_rule__EmfsContainer__ContentProviderAlternatives_3_1_02108);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1022:1: rule__EmfsFile__Alternatives_4 : ( ( ( rule__EmfsFile__Group_4_0__0 ) ) | ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) ) | ( ( rule__EmfsFile__Group_4_2__0 ) ) | ( ';' ) );
    public final void rule__EmfsFile__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1026:1: ( ( ( rule__EmfsFile__Group_4_0__0 ) ) | ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) ) | ( ( rule__EmfsFile__Group_4_2__0 ) ) | ( ';' ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1027:1: ( ( rule__EmfsFile__Group_4_0__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1027:1: ( ( rule__EmfsFile__Group_4_0__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1028:1: ( rule__EmfsFile__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getGroup_4_0()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1029:1: ( rule__EmfsFile__Group_4_0__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1029:2: rule__EmfsFile__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__0_in_rule__EmfsFile__Alternatives_42140);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1033:6: ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1033:6: ( ( rule__EmfsFile__ContentProviderAssignment_4_1 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1034:1: ( rule__EmfsFile__ContentProviderAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_1()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1035:1: ( rule__EmfsFile__ContentProviderAssignment_4_1 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1035:2: rule__EmfsFile__ContentProviderAssignment_4_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_1_in_rule__EmfsFile__Alternatives_42158);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1039:6: ( ( rule__EmfsFile__Group_4_2__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1039:6: ( ( rule__EmfsFile__Group_4_2__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1040:1: ( rule__EmfsFile__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getGroup_4_2()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1041:1: ( rule__EmfsFile__Group_4_2__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1041:2: rule__EmfsFile__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_2__0_in_rule__EmfsFile__Alternatives_42176);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1045:6: ( ';' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1045:6: ( ';' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1046:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_3()); 
                    }
                    match(input,8,FollowSets000.FOLLOW_8_in_rule__EmfsFile__Alternatives_42195); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1058:1: rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 : ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) );
    public final void rule__EmfsFile__ContentProviderAlternatives_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1062:1: ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1063:1: ( ruleURLContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1063:1: ( ruleURLContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1064:1: ruleURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderURLContentProviderParserRuleCall_4_0_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_0_1_02229);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1069:6: ( ruleGitURLContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1069:6: ( ruleGitURLContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1070:1: ruleGitURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderGitURLContentProviderParserRuleCall_4_0_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_0_1_02246);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1080:1: rule__EmfsFile__ContentProviderAlternatives_4_1_0 : ( ( ruleStringContentProvider ) | ( ruleWrappingStringContentProvider ) );
    public final void rule__EmfsFile__ContentProviderAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1084:1: ( ( ruleStringContentProvider ) | ( ruleWrappingStringContentProvider ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1085:1: ( ruleStringContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1085:1: ( ruleStringContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1086:1: ruleStringContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderStringContentProviderParserRuleCall_4_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_1_02278);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1091:6: ( ruleWrappingStringContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1091:6: ( ruleWrappingStringContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1092:1: ruleWrappingStringContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderWrappingStringContentProviderParserRuleCall_4_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleWrappingStringContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_1_02295);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1102:1: rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 : ( ( ruleDotClasspathFileContentProvider ) | ( ruleDotProjectFileContentProvider ) );
    public final void rule__EmfsFile__ContentProviderAlternatives_4_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1106:1: ( ( ruleDotClasspathFileContentProvider ) | ( ruleDotProjectFileContentProvider ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1107:1: ( ruleDotClasspathFileContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1107:1: ( ruleDotClasspathFileContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1108:1: ruleDotClasspathFileContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderDotClasspathFileContentProviderParserRuleCall_4_2_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDotClasspathFileContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_2_1_02327);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1113:6: ( ruleDotProjectFileContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1113:6: ( ruleDotProjectFileContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1114:1: ruleDotProjectFileContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmfsFileAccess().getContentProviderDotProjectFileContentProviderParserRuleCall_4_2_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDotProjectFileContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_2_1_02344);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1124:1: rule__AbstractStringContents__Alternatives : ( ( rulePropertyValueString ) | ( ruleVerbatimStringContents ) );
    public final void rule__AbstractStringContents__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1128:1: ( ( rulePropertyValueString ) | ( ruleVerbatimStringContents ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1129:1: ( rulePropertyValueString )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1129:1: ( rulePropertyValueString )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1130:1: rulePropertyValueString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractStringContentsAccess().getPropertyValueStringParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyValueString_in_rule__AbstractStringContents__Alternatives2376);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1135:6: ( ruleVerbatimStringContents )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1135:6: ( ruleVerbatimStringContents )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1136:1: ruleVerbatimStringContents
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractStringContentsAccess().getVerbatimStringContentsParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVerbatimStringContents_in_rule__AbstractStringContents__Alternatives2393);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1146:1: rule__VerbatimStringContents__StringContentAlternatives_0 : ( ( RULE_STRING ) | ( RULE_STRING_CONTENT ) );
    public final void rule__VerbatimStringContents__StringContentAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1150:1: ( ( RULE_STRING ) | ( RULE_STRING_CONTENT ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1151:1: ( RULE_STRING )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1151:1: ( RULE_STRING )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1152:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRINGTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__VerbatimStringContents__StringContentAlternatives_02425); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRINGTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1157:6: ( RULE_STRING_CONTENT )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1157:6: ( RULE_STRING_CONTENT )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1158:1: RULE_STRING_CONTENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRING_CONTENTTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_STRING_CONTENT,FollowSets000.FOLLOW_RULE_STRING_CONTENT_in_rule__VerbatimStringContents__StringContentAlternatives_02442); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1168:1: rule__PropertyValueString__Alternatives_1 : ( ( ( rule__PropertyValueString__PropertyNameAssignment_1_0 ) ) | ( ( rule__PropertyValueString__Group_1_1__0 ) ) );
    public final void rule__PropertyValueString__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1172:1: ( ( ( rule__PropertyValueString__PropertyNameAssignment_1_0 ) ) | ( ( rule__PropertyValueString__Group_1_1__0 ) ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1173:1: ( ( rule__PropertyValueString__PropertyNameAssignment_1_0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1173:1: ( ( rule__PropertyValueString__PropertyNameAssignment_1_0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1174:1: ( rule__PropertyValueString__PropertyNameAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getPropertyNameAssignment_1_0()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1175:1: ( rule__PropertyValueString__PropertyNameAssignment_1_0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1175:2: rule__PropertyValueString__PropertyNameAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__PropertyNameAssignment_1_0_in_rule__PropertyValueString__Alternatives_12474);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1179:6: ( ( rule__PropertyValueString__Group_1_1__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1179:6: ( ( rule__PropertyValueString__Group_1_1__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1180:1: ( rule__PropertyValueString__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getGroup_1_1()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1181:1: ( rule__PropertyValueString__Group_1_1__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1181:2: rule__PropertyValueString__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__0_in_rule__PropertyValueString__Alternatives_12492);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1190:1: rule__PropertyValueString__DefaultValueAlternatives_2_1_0 : ( ( RULE_STRING ) | ( ruleEmfsName ) );
    public final void rule__PropertyValueString__DefaultValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1194:1: ( ( RULE_STRING ) | ( ruleEmfsName ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1195:1: ( RULE_STRING )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1195:1: ( RULE_STRING )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1196:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__PropertyValueString__DefaultValueAlternatives_2_1_02525); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueStringAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1201:6: ( ruleEmfsName )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1201:6: ( ruleEmfsName )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1202:1: ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueStringAccess().getDefaultValueEmfsNameParserRuleCall_2_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__PropertyValueString__DefaultValueAlternatives_2_1_02542);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1212:1: rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 : ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) );
    public final void rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1216:1: ( ( ruleURLContentProvider ) | ( ruleGitURLContentProvider ) )
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1217:1: ( ruleURLContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1217:1: ( ruleURLContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1218:1: ruleURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderURLContentProviderParserRuleCall_1_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_02574);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1223:6: ( ruleGitURLContentProvider )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1223:6: ( ruleGitURLContentProvider )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1224:1: ruleGitURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderGitURLContentProviderParserRuleCall_1_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_02591);
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


    // $ANTLR start "rule__URL_SCHEME__Alternatives"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1234:1: rule__URL_SCHEME__Alternatives : ( ( 'http' ) | ( 'https' ) | ( 'ftp' ) | ( 'file' ) );
    public final void rule__URL_SCHEME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1238:1: ( ( 'http' ) | ( 'https' ) | ( 'ftp' ) | ( 'file' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt16=1;
                }
                break;
            case 10:
                {
                alt16=2;
                }
                break;
            case 11:
                {
                alt16=3;
                }
                break;
            case 12:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1239:1: ( 'http' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1239:1: ( 'http' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1240:1: 'http'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getHttpKeyword_0()); 
                    }
                    match(input,9,FollowSets000.FOLLOW_9_in_rule__URL_SCHEME__Alternatives2624); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_SCHEMEAccess().getHttpKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1247:6: ( 'https' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1247:6: ( 'https' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1248:1: 'https'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getHttpsKeyword_1()); 
                    }
                    match(input,10,FollowSets000.FOLLOW_10_in_rule__URL_SCHEME__Alternatives2644); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_SCHEMEAccess().getHttpsKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1255:6: ( 'ftp' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1255:6: ( 'ftp' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1256:1: 'ftp'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getFtpKeyword_2()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__URL_SCHEME__Alternatives2664); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_SCHEMEAccess().getFtpKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1263:6: ( 'file' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1263:6: ( 'file' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1264:1: 'file'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_SCHEMEAccess().getFileKeyword_3()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__URL_SCHEME__Alternatives2684); if (state.failed) return ;
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


    // $ANTLR start "rule__URL_HOST__Alternatives_3_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1276:1: rule__URL_HOST__Alternatives_3_1 : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__URL_HOST__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1280:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt17=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt17=1;
                }
                break;
            case 14:
                {
                alt17=2;
                }
                break;
            case 15:
                {
                alt17=3;
                }
                break;
            case 16:
                {
                alt17=4;
                }
                break;
            case 17:
                {
                alt17=5;
                }
                break;
            case 18:
                {
                alt17=6;
                }
                break;
            case 19:
                {
                alt17=7;
                }
                break;
            case 20:
                {
                alt17=8;
                }
                break;
            case 21:
                {
                alt17=9;
                }
                break;
            case 22:
                {
                alt17=10;
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1281:1: ( '0' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1281:1: ( '0' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1282:1: '0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitZeroKeyword_3_1_0()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__URL_HOST__Alternatives_3_12719); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitZeroKeyword_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1289:6: ( '1' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1289:6: ( '1' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1290:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitOneKeyword_3_1_1()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__URL_HOST__Alternatives_3_12739); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitOneKeyword_3_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1297:6: ( '2' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1297:6: ( '2' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1298:1: '2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitTwoKeyword_3_1_2()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__URL_HOST__Alternatives_3_12759); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitTwoKeyword_3_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1305:6: ( '3' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1305:6: ( '3' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1306:1: '3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitThreeKeyword_3_1_3()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__URL_HOST__Alternatives_3_12779); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitThreeKeyword_3_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1313:6: ( '4' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1313:6: ( '4' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1314:1: '4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitFourKeyword_3_1_4()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__URL_HOST__Alternatives_3_12799); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitFourKeyword_3_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1321:6: ( '5' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1321:6: ( '5' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1322:1: '5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitFiveKeyword_3_1_5()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__URL_HOST__Alternatives_3_12819); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitFiveKeyword_3_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1329:6: ( '6' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1329:6: ( '6' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1330:1: '6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitSixKeyword_3_1_6()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__URL_HOST__Alternatives_3_12839); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitSixKeyword_3_1_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1337:6: ( '7' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1337:6: ( '7' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1338:1: '7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitSevenKeyword_3_1_7()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__URL_HOST__Alternatives_3_12859); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitSevenKeyword_3_1_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1345:6: ( '8' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1345:6: ( '8' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1346:1: '8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitEightKeyword_3_1_8()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__URL_HOST__Alternatives_3_12879); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitEightKeyword_3_1_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1353:6: ( '9' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1353:6: ( '9' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1354:1: '9'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURL_HOSTAccess().getDigitNineKeyword_3_1_9()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__URL_HOST__Alternatives_3_12899); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURL_HOSTAccess().getDigitNineKeyword_3_1_9()); 
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
    // $ANTLR end "rule__URL_HOST__Alternatives_3_1"


    // $ANTLR start "rule__URLContentProvider__UrlStringAlternatives_0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1366:1: rule__URLContentProvider__UrlStringAlternatives_0 : ( ( RULE_STRING ) | ( ruleURL ) );
    public final void rule__URLContentProvider__UrlStringAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1370:1: ( ( RULE_STRING ) | ( ruleURL ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=9 && LA18_0<=12)) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1371:1: ( RULE_STRING )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1371:1: ( RULE_STRING )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1372:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURLContentProviderAccess().getUrlStringSTRINGTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__URLContentProvider__UrlStringAlternatives_02933); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getURLContentProviderAccess().getUrlStringSTRINGTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1377:6: ( ruleURL )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1377:6: ( ruleURL )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1378:1: ruleURL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getURLContentProviderAccess().getUrlStringURLParserRuleCall_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURL_in_rule__URLContentProvider__UrlStringAlternatives_02950);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1388:1: rule__GitContentRef__Alternatives_2 : ( ( ( rule__GitContentRef__Group_2_0__0 ) ) | ( ( rule__GitContentRef__OwnerAssignment_2_1 ) ) );
    public final void rule__GitContentRef__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1392:1: ( ( ( rule__GitContentRef__Group_2_0__0 ) ) | ( ( rule__GitContentRef__OwnerAssignment_2_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==31) ) {
                    alt19=1;
                }
                else if ( (LA19_1==27) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1393:1: ( ( rule__GitContentRef__Group_2_0__0 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1393:1: ( ( rule__GitContentRef__Group_2_0__0 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1394:1: ( rule__GitContentRef__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getGroup_2_0()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1395:1: ( rule__GitContentRef__Group_2_0__0 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1395:2: rule__GitContentRef__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0__0_in_rule__GitContentRef__Alternatives_22982);
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1399:6: ( ( rule__GitContentRef__OwnerAssignment_2_1 ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1399:6: ( ( rule__GitContentRef__OwnerAssignment_2_1 ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1400:1: ( rule__GitContentRef__OwnerAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGitContentRefAccess().getOwnerAssignment_2_1()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1401:1: ( rule__GitContentRef__OwnerAssignment_2_1 )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1401:2: rule__GitContentRef__OwnerAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__OwnerAssignment_2_1_in_rule__GitContentRef__Alternatives_23000);
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


    // $ANTLR start "rule__VERSION__Alternatives"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1410:1: rule__VERSION__Alternatives : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__VERSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1414:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt20=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt20=1;
                }
                break;
            case 14:
                {
                alt20=2;
                }
                break;
            case 15:
                {
                alt20=3;
                }
                break;
            case 16:
                {
                alt20=4;
                }
                break;
            case 17:
                {
                alt20=5;
                }
                break;
            case 18:
                {
                alt20=6;
                }
                break;
            case 19:
                {
                alt20=7;
                }
                break;
            case 20:
                {
                alt20=8;
                }
                break;
            case 21:
                {
                alt20=9;
                }
                break;
            case 22:
                {
                alt20=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1415:1: ( '0' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1415:1: ( '0' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1416:1: '0'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitZeroKeyword_0()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__VERSION__Alternatives3034); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitZeroKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1423:6: ( '1' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1423:6: ( '1' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1424:1: '1'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitOneKeyword_1()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__VERSION__Alternatives3054); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitOneKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1431:6: ( '2' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1431:6: ( '2' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1432:1: '2'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitTwoKeyword_2()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__VERSION__Alternatives3074); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitTwoKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1439:6: ( '3' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1439:6: ( '3' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1440:1: '3'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitThreeKeyword_3()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__VERSION__Alternatives3094); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitThreeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1447:6: ( '4' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1447:6: ( '4' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1448:1: '4'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitFourKeyword_4()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__VERSION__Alternatives3114); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitFourKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1455:6: ( '5' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1455:6: ( '5' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1456:1: '5'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitFiveKeyword_5()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__VERSION__Alternatives3134); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitFiveKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1463:6: ( '6' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1463:6: ( '6' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1464:1: '6'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitSixKeyword_6()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__VERSION__Alternatives3154); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitSixKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1471:6: ( '7' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1471:6: ( '7' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1472:1: '7'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitSevenKeyword_7()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__VERSION__Alternatives3174); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitSevenKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1479:6: ( '8' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1479:6: ( '8' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1480:1: '8'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitEightKeyword_8()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__VERSION__Alternatives3194); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVERSIONAccess().getDigitEightKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1487:6: ( '9' )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1487:6: ( '9' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1488:1: '9'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVERSIONAccess().getDigitNineKeyword_9()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__VERSION__Alternatives3214); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1500:1: rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 : ( ( RULE_STRING ) | ( ruleFileName ) );
    public final void rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1504:1: ( ( RULE_STRING ) | ( ruleFileName ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID||LA21_0==31) ) {
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
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1505:1: ( RULE_STRING )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1505:1: ( RULE_STRING )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1506:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysSTRINGTerminalRuleCall_1_1_0_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_03248); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDotProjectFileContentProviderAccess().getKeysSTRINGTerminalRuleCall_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1511:6: ( ruleFileName )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1511:6: ( ruleFileName )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1512:1: ruleFileName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysFileNameParserRuleCall_1_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFileName_in_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_03265);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1522:1: rule__ClasspathEntryKind__Alternatives : ( ( ( 'source-folder' ) ) | ( ( 'output-folder' ) ) | ( ( 'library-jar' ) ) | ( ( 'class-container' ) ) );
    public final void rule__ClasspathEntryKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1526:1: ( ( ( 'source-folder' ) ) | ( ( 'output-folder' ) ) | ( ( 'library-jar' ) ) | ( ( 'class-container' ) ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt22=1;
                }
                break;
            case 24:
                {
                alt22=2;
                }
                break;
            case 25:
                {
                alt22=3;
                }
                break;
            case 26:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1527:1: ( ( 'source-folder' ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1527:1: ( ( 'source-folder' ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1528:1: ( 'source-folder' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1529:1: ( 'source-folder' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1529:3: 'source-folder'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__ClasspathEntryKind__Alternatives3298); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1534:6: ( ( 'output-folder' ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1534:6: ( ( 'output-folder' ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1535:1: ( 'output-folder' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1536:1: ( 'output-folder' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1536:3: 'output-folder'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__ClasspathEntryKind__Alternatives3319); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1541:6: ( ( 'library-jar' ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1541:6: ( ( 'library-jar' ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1542:1: ( 'library-jar' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1543:1: ( 'library-jar' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1543:3: 'library-jar'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__ClasspathEntryKind__Alternatives3340); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1548:6: ( ( 'class-container' ) )
                    {
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1548:6: ( ( 'class-container' ) )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1549:1: ( 'class-container' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClasspathEntryKindAccess().getConEnumLiteralDeclaration_3()); 
                    }
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1550:1: ( 'class-container' )
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1550:3: 'class-container'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__ClasspathEntryKind__Alternatives3361); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1562:1: rule__EmfsRoot__Group__0 : rule__EmfsRoot__Group__0__Impl rule__EmfsRoot__Group__1 ;
    public final void rule__EmfsRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1566:1: ( rule__EmfsRoot__Group__0__Impl rule__EmfsRoot__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1567:2: rule__EmfsRoot__Group__0__Impl rule__EmfsRoot__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__0__Impl_in_rule__EmfsRoot__Group__03394);
            rule__EmfsRoot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__1_in_rule__EmfsRoot__Group__03397);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1574:1: rule__EmfsRoot__Group__0__Impl : ( () ) ;
    public final void rule__EmfsRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1578:1: ( ( () ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1579:1: ( () )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1579:1: ( () )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1580:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getEmfsContainerAction_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1581:1: ()
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1583:1: 
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1593:1: rule__EmfsRoot__Group__1 : rule__EmfsRoot__Group__1__Impl rule__EmfsRoot__Group__2 ;
    public final void rule__EmfsRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1597:1: ( rule__EmfsRoot__Group__1__Impl rule__EmfsRoot__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1598:2: rule__EmfsRoot__Group__1__Impl rule__EmfsRoot__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__1__Impl_in_rule__EmfsRoot__Group__13455);
            rule__EmfsRoot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__2_in_rule__EmfsRoot__Group__13458);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1605:1: rule__EmfsRoot__Group__1__Impl : ( ( rule__EmfsRoot__Group_1__0 )? ) ;
    public final void rule__EmfsRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1609:1: ( ( ( rule__EmfsRoot__Group_1__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1610:1: ( ( rule__EmfsRoot__Group_1__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1610:1: ( ( rule__EmfsRoot__Group_1__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1611:1: ( rule__EmfsRoot__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1612:1: ( rule__EmfsRoot__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1612:2: rule__EmfsRoot__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_1__0_in_rule__EmfsRoot__Group__1__Impl3485);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1622:1: rule__EmfsRoot__Group__2 : rule__EmfsRoot__Group__2__Impl rule__EmfsRoot__Group__3 ;
    public final void rule__EmfsRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1626:1: ( rule__EmfsRoot__Group__2__Impl rule__EmfsRoot__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1627:2: rule__EmfsRoot__Group__2__Impl rule__EmfsRoot__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__2__Impl_in_rule__EmfsRoot__Group__23516);
            rule__EmfsRoot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__3_in_rule__EmfsRoot__Group__23519);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1634:1: rule__EmfsRoot__Group__2__Impl : ( ( rule__EmfsRoot__Group_2__0 )* ) ;
    public final void rule__EmfsRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1638:1: ( ( ( rule__EmfsRoot__Group_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1639:1: ( ( rule__EmfsRoot__Group_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1639:1: ( ( rule__EmfsRoot__Group_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1640:1: ( rule__EmfsRoot__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1641:1: ( rule__EmfsRoot__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1641:2: rule__EmfsRoot__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_2__0_in_rule__EmfsRoot__Group__2__Impl3546);
            	    rule__EmfsRoot__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1651:1: rule__EmfsRoot__Group__3 : rule__EmfsRoot__Group__3__Impl rule__EmfsRoot__Group__4 ;
    public final void rule__EmfsRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1655:1: ( rule__EmfsRoot__Group__3__Impl rule__EmfsRoot__Group__4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1656:2: rule__EmfsRoot__Group__3__Impl rule__EmfsRoot__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__3__Impl_in_rule__EmfsRoot__Group__33577);
            rule__EmfsRoot__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__4_in_rule__EmfsRoot__Group__33580);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1663:1: rule__EmfsRoot__Group__3__Impl : ( ( rule__EmfsRoot__Group_3__0 )? ) ;
    public final void rule__EmfsRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1667:1: ( ( ( rule__EmfsRoot__Group_3__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1668:1: ( ( rule__EmfsRoot__Group_3__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1668:1: ( ( rule__EmfsRoot__Group_3__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1669:1: ( rule__EmfsRoot__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getGroup_3()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1670:1: ( rule__EmfsRoot__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1670:2: rule__EmfsRoot__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_3__0_in_rule__EmfsRoot__Group__3__Impl3607);
                    rule__EmfsRoot__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getGroup_3()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1680:1: rule__EmfsRoot__Group__4 : rule__EmfsRoot__Group__4__Impl rule__EmfsRoot__Group__5 ;
    public final void rule__EmfsRoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1684:1: ( rule__EmfsRoot__Group__4__Impl rule__EmfsRoot__Group__5 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1685:2: rule__EmfsRoot__Group__4__Impl rule__EmfsRoot__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__4__Impl_in_rule__EmfsRoot__Group__43638);
            rule__EmfsRoot__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__5_in_rule__EmfsRoot__Group__43641);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1692:1: rule__EmfsRoot__Group__4__Impl : ( '/' ) ;
    public final void rule__EmfsRoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1696:1: ( ( '/' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1697:1: ( '/' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1697:1: ( '/' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1698:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getSolidusKeyword_4()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__EmfsRoot__Group__4__Impl3669); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getSolidusKeyword_4()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1711:1: rule__EmfsRoot__Group__5 : rule__EmfsRoot__Group__5__Impl ;
    public final void rule__EmfsRoot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1715:1: ( rule__EmfsRoot__Group__5__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1716:2: rule__EmfsRoot__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group__5__Impl_in_rule__EmfsRoot__Group__53700);
            rule__EmfsRoot__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1722:1: rule__EmfsRoot__Group__5__Impl : ( ( rule__EmfsRoot__ResourcesAssignment_5 )* ) ;
    public final void rule__EmfsRoot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1726:1: ( ( ( rule__EmfsRoot__ResourcesAssignment_5 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1727:1: ( ( rule__EmfsRoot__ResourcesAssignment_5 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1727:1: ( ( rule__EmfsRoot__ResourcesAssignment_5 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1728:1: ( rule__EmfsRoot__ResourcesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getResourcesAssignment_5()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1729:1: ( rule__EmfsRoot__ResourcesAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1729:2: rule__EmfsRoot__ResourcesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__ResourcesAssignment_5_in_rule__EmfsRoot__Group__5__Impl3727);
            	    rule__EmfsRoot__ResourcesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getResourcesAssignment_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EmfsRoot__Group_1__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1751:1: rule__EmfsRoot__Group_1__0 : rule__EmfsRoot__Group_1__0__Impl rule__EmfsRoot__Group_1__1 ;
    public final void rule__EmfsRoot__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1755:1: ( rule__EmfsRoot__Group_1__0__Impl rule__EmfsRoot__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1756:2: rule__EmfsRoot__Group_1__0__Impl rule__EmfsRoot__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_1__0__Impl_in_rule__EmfsRoot__Group_1__03770);
            rule__EmfsRoot__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_1__1_in_rule__EmfsRoot__Group_1__03773);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1763:1: rule__EmfsRoot__Group_1__0__Impl : ( 'emfs' ) ;
    public final void rule__EmfsRoot__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1767:1: ( ( 'emfs' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1768:1: ( 'emfs' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1768:1: ( 'emfs' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1769:1: 'emfs'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getEmfsKeyword_1_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__EmfsRoot__Group_1__0__Impl3801); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1782:1: rule__EmfsRoot__Group_1__1 : rule__EmfsRoot__Group_1__1__Impl ;
    public final void rule__EmfsRoot__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1786:1: ( rule__EmfsRoot__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1787:2: rule__EmfsRoot__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_1__1__Impl_in_rule__EmfsRoot__Group_1__13832);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1793:1: rule__EmfsRoot__Group_1__1__Impl : ( ( rule__EmfsRoot__NameAssignment_1_1 )? ) ;
    public final void rule__EmfsRoot__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1797:1: ( ( ( rule__EmfsRoot__NameAssignment_1_1 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1798:1: ( ( rule__EmfsRoot__NameAssignment_1_1 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1798:1: ( ( rule__EmfsRoot__NameAssignment_1_1 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1799:1: ( rule__EmfsRoot__NameAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getNameAssignment_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1800:1: ( rule__EmfsRoot__NameAssignment_1_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1800:2: rule__EmfsRoot__NameAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__NameAssignment_1_1_in_rule__EmfsRoot__Group_1__1__Impl3859);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1814:1: rule__EmfsRoot__Group_2__0 : rule__EmfsRoot__Group_2__0__Impl rule__EmfsRoot__Group_2__1 ;
    public final void rule__EmfsRoot__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1818:1: ( rule__EmfsRoot__Group_2__0__Impl rule__EmfsRoot__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1819:2: rule__EmfsRoot__Group_2__0__Impl rule__EmfsRoot__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_2__0__Impl_in_rule__EmfsRoot__Group_2__03894);
            rule__EmfsRoot__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_2__1_in_rule__EmfsRoot__Group_2__03897);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1826:1: rule__EmfsRoot__Group_2__0__Impl : ( '#' ) ;
    public final void rule__EmfsRoot__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1830:1: ( ( '#' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1831:1: ( '#' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1831:1: ( '#' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1832:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__EmfsRoot__Group_2__0__Impl3925); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1845:1: rule__EmfsRoot__Group_2__1 : rule__EmfsRoot__Group_2__1__Impl ;
    public final void rule__EmfsRoot__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1849:1: ( rule__EmfsRoot__Group_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1850:2: rule__EmfsRoot__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_2__1__Impl_in_rule__EmfsRoot__Group_2__13956);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1856:1: rule__EmfsRoot__Group_2__1__Impl : ( ( rule__EmfsRoot__TagsAssignment_2_1 ) ) ;
    public final void rule__EmfsRoot__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1860:1: ( ( ( rule__EmfsRoot__TagsAssignment_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1861:1: ( ( rule__EmfsRoot__TagsAssignment_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1861:1: ( ( rule__EmfsRoot__TagsAssignment_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1862:1: ( rule__EmfsRoot__TagsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getTagsAssignment_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1863:1: ( rule__EmfsRoot__TagsAssignment_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1863:2: rule__EmfsRoot__TagsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__TagsAssignment_2_1_in_rule__EmfsRoot__Group_2__1__Impl3983);
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


    // $ANTLR start "rule__EmfsRoot__Group_3__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1877:1: rule__EmfsRoot__Group_3__0 : rule__EmfsRoot__Group_3__0__Impl rule__EmfsRoot__Group_3__1 ;
    public final void rule__EmfsRoot__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1881:1: ( rule__EmfsRoot__Group_3__0__Impl rule__EmfsRoot__Group_3__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1882:2: rule__EmfsRoot__Group_3__0__Impl rule__EmfsRoot__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_3__0__Impl_in_rule__EmfsRoot__Group_3__04017);
            rule__EmfsRoot__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_3__1_in_rule__EmfsRoot__Group_3__04020);
            rule__EmfsRoot__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_3__0"


    // $ANTLR start "rule__EmfsRoot__Group_3__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1889:1: rule__EmfsRoot__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EmfsRoot__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1893:1: ( ( 'extends' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1894:1: ( 'extends' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1894:1: ( 'extends' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1895:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getExtendsKeyword_3_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EmfsRoot__Group_3__0__Impl4048); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getExtendsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_3__0__Impl"


    // $ANTLR start "rule__EmfsRoot__Group_3__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1908:1: rule__EmfsRoot__Group_3__1 : rule__EmfsRoot__Group_3__1__Impl rule__EmfsRoot__Group_3__2 ;
    public final void rule__EmfsRoot__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1912:1: ( rule__EmfsRoot__Group_3__1__Impl rule__EmfsRoot__Group_3__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1913:2: rule__EmfsRoot__Group_3__1__Impl rule__EmfsRoot__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_3__1__Impl_in_rule__EmfsRoot__Group_3__14079);
            rule__EmfsRoot__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_3__2_in_rule__EmfsRoot__Group_3__14082);
            rule__EmfsRoot__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_3__1"


    // $ANTLR start "rule__EmfsRoot__Group_3__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1920:1: rule__EmfsRoot__Group_3__1__Impl : ( ( rule__EmfsRoot__ContentProviderAssignment_3_1 ) ) ;
    public final void rule__EmfsRoot__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1924:1: ( ( ( rule__EmfsRoot__ContentProviderAssignment_3_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1925:1: ( ( rule__EmfsRoot__ContentProviderAssignment_3_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1925:1: ( ( rule__EmfsRoot__ContentProviderAssignment_3_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1926:1: ( rule__EmfsRoot__ContentProviderAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getContentProviderAssignment_3_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1927:1: ( rule__EmfsRoot__ContentProviderAssignment_3_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1927:2: rule__EmfsRoot__ContentProviderAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__ContentProviderAssignment_3_1_in_rule__EmfsRoot__Group_3__1__Impl4109);
            rule__EmfsRoot__ContentProviderAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getContentProviderAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_3__1__Impl"


    // $ANTLR start "rule__EmfsRoot__Group_3__2"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1937:1: rule__EmfsRoot__Group_3__2 : rule__EmfsRoot__Group_3__2__Impl ;
    public final void rule__EmfsRoot__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1941:1: ( rule__EmfsRoot__Group_3__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1942:2: rule__EmfsRoot__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__Group_3__2__Impl_in_rule__EmfsRoot__Group_3__24139);
            rule__EmfsRoot__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_3__2"


    // $ANTLR start "rule__EmfsRoot__Group_3__2__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1948:1: rule__EmfsRoot__Group_3__2__Impl : ( ';' ) ;
    public final void rule__EmfsRoot__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1952:1: ( ( ';' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1953:1: ( ';' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1953:1: ( ';' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1954:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,8,FollowSets000.FOLLOW_8_in_rule__EmfsRoot__Group_3__2__Impl4167); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getSemicolonKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__Group_3__2__Impl"


    // $ANTLR start "rule__EmfsName__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1973:1: rule__EmfsName__Group__0 : rule__EmfsName__Group__0__Impl rule__EmfsName__Group__1 ;
    public final void rule__EmfsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1977:1: ( rule__EmfsName__Group__0__Impl rule__EmfsName__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1978:2: rule__EmfsName__Group__0__Impl rule__EmfsName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group__0__Impl_in_rule__EmfsName__Group__04204);
            rule__EmfsName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group__1_in_rule__EmfsName__Group__04207);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1985:1: rule__EmfsName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__EmfsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1989:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1990:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1990:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:1991:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmfsName__Group__0__Impl4234); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2002:1: rule__EmfsName__Group__1 : rule__EmfsName__Group__1__Impl ;
    public final void rule__EmfsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2006:1: ( rule__EmfsName__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2007:2: rule__EmfsName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group__1__Impl_in_rule__EmfsName__Group__14263);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2013:1: rule__EmfsName__Group__1__Impl : ( ( rule__EmfsName__Group_1__0 )* ) ;
    public final void rule__EmfsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2017:1: ( ( ( rule__EmfsName__Group_1__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2018:1: ( ( rule__EmfsName__Group_1__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2018:1: ( ( rule__EmfsName__Group_1__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2019:1: ( rule__EmfsName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2020:1: ( rule__EmfsName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==31) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_ID) ) {
                        int LA28_3 = input.LA(3);

                        if ( (synpred50_InternalXemfs()) ) {
                            alt28=1;
                        }


                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2020:2: rule__EmfsName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group_1__0_in_rule__EmfsName__Group__1__Impl4290);
            	    rule__EmfsName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2034:1: rule__EmfsName__Group_1__0 : rule__EmfsName__Group_1__0__Impl rule__EmfsName__Group_1__1 ;
    public final void rule__EmfsName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2038:1: ( rule__EmfsName__Group_1__0__Impl rule__EmfsName__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2039:2: rule__EmfsName__Group_1__0__Impl rule__EmfsName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group_1__0__Impl_in_rule__EmfsName__Group_1__04325);
            rule__EmfsName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group_1__1_in_rule__EmfsName__Group_1__04328);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2046:1: rule__EmfsName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EmfsName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2050:1: ( ( '.' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2051:1: ( '.' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2051:1: ( '.' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2052:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__EmfsName__Group_1__0__Impl4356); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2065:1: rule__EmfsName__Group_1__1 : rule__EmfsName__Group_1__1__Impl ;
    public final void rule__EmfsName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2069:1: ( rule__EmfsName__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2070:2: rule__EmfsName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group_1__1__Impl_in_rule__EmfsName__Group_1__14387);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2076:1: rule__EmfsName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__EmfsName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2080:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2081:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2081:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2082:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmfsName__Group_1__1__Impl4414); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2097:1: rule__EmfsResourcesRef__Group__0 : rule__EmfsResourcesRef__Group__0__Impl rule__EmfsResourcesRef__Group__1 ;
    public final void rule__EmfsResourcesRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2101:1: ( rule__EmfsResourcesRef__Group__0__Impl rule__EmfsResourcesRef__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2102:2: rule__EmfsResourcesRef__Group__0__Impl rule__EmfsResourcesRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group__0__Impl_in_rule__EmfsResourcesRef__Group__04447);
            rule__EmfsResourcesRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group__1_in_rule__EmfsResourcesRef__Group__04450);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2109:1: rule__EmfsResourcesRef__Group__0__Impl : ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) ) ;
    public final void rule__EmfsResourcesRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2113:1: ( ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2114:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2114:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2115:1: ( rule__EmfsResourcesRef__ResourcesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesAssignment_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2116:1: ( rule__EmfsResourcesRef__ResourcesAssignment_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2116:2: rule__EmfsResourcesRef__ResourcesAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__ResourcesAssignment_0_in_rule__EmfsResourcesRef__Group__0__Impl4477);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2126:1: rule__EmfsResourcesRef__Group__1 : rule__EmfsResourcesRef__Group__1__Impl ;
    public final void rule__EmfsResourcesRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2130:1: ( rule__EmfsResourcesRef__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2131:2: rule__EmfsResourcesRef__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group__1__Impl_in_rule__EmfsResourcesRef__Group__14507);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2137:1: rule__EmfsResourcesRef__Group__1__Impl : ( ( rule__EmfsResourcesRef__Group_1__0 )* ) ;
    public final void rule__EmfsResourcesRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2141:1: ( ( ( rule__EmfsResourcesRef__Group_1__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2142:1: ( ( rule__EmfsResourcesRef__Group_1__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2142:1: ( ( rule__EmfsResourcesRef__Group_1__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2143:1: ( rule__EmfsResourcesRef__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2144:1: ( rule__EmfsResourcesRef__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2144:2: rule__EmfsResourcesRef__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group_1__0_in_rule__EmfsResourcesRef__Group__1__Impl4534);
            	    rule__EmfsResourcesRef__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2158:1: rule__EmfsResourcesRef__Group_1__0 : rule__EmfsResourcesRef__Group_1__0__Impl rule__EmfsResourcesRef__Group_1__1 ;
    public final void rule__EmfsResourcesRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2162:1: ( rule__EmfsResourcesRef__Group_1__0__Impl rule__EmfsResourcesRef__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2163:2: rule__EmfsResourcesRef__Group_1__0__Impl rule__EmfsResourcesRef__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group_1__0__Impl_in_rule__EmfsResourcesRef__Group_1__04569);
            rule__EmfsResourcesRef__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group_1__1_in_rule__EmfsResourcesRef__Group_1__04572);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2170:1: rule__EmfsResourcesRef__Group_1__0__Impl : ( ',' ) ;
    public final void rule__EmfsResourcesRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2174:1: ( ( ',' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2175:1: ( ',' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2175:1: ( ',' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2176:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getCommaKeyword_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__EmfsResourcesRef__Group_1__0__Impl4600); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2189:1: rule__EmfsResourcesRef__Group_1__1 : rule__EmfsResourcesRef__Group_1__1__Impl ;
    public final void rule__EmfsResourcesRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2193:1: ( rule__EmfsResourcesRef__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2194:2: rule__EmfsResourcesRef__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__Group_1__1__Impl_in_rule__EmfsResourcesRef__Group_1__14631);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2200:1: rule__EmfsResourcesRef__Group_1__1__Impl : ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) ) ;
    public final void rule__EmfsResourcesRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2204:1: ( ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2205:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2205:1: ( ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2206:1: ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesAssignment_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2207:1: ( rule__EmfsResourcesRef__ResourcesAssignment_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2207:2: rule__EmfsResourcesRef__ResourcesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsResourcesRef__ResourcesAssignment_1_1_in_rule__EmfsResourcesRef__Group_1__1__Impl4658);
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


    // $ANTLR start "rule__Name__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2221:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2225:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2226:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__04692);
            rule__Name__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__1_in_rule__Name__Group__04695);
            rule__Name__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2233:1: rule__Name__Group__0__Impl : ( ( '.' )? ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2237:1: ( ( ( '.' )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2238:1: ( ( '.' )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2238:1: ( ( '.' )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2239:1: ( '.' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getFullStopKeyword_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2240:1: ( '.' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2241:2: '.'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__Name__Group__0__Impl4724); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getFullStopKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2252:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2256:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2257:2: rule__Name__Group__1__Impl rule__Name__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__14757);
            rule__Name__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__2_in_rule__Name__Group__14760);
            rule__Name__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2264:1: rule__Name__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2268:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2269:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2269:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2270:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Name__Group__1__Impl4787); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__Name__Group__2"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2281:1: rule__Name__Group__2 : rule__Name__Group__2__Impl ;
    public final void rule__Name__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2285:1: ( rule__Name__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2286:2: rule__Name__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__2__Impl_in_rule__Name__Group__24816);
            rule__Name__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__2"


    // $ANTLR start "rule__Name__Group__2__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2292:1: rule__Name__Group__2__Impl : ( ( rule__Name__Group_2__0 )* ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2296:1: ( ( ( rule__Name__Group_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2297:1: ( ( rule__Name__Group_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2297:1: ( ( rule__Name__Group_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2298:1: ( rule__Name__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2299:1: ( rule__Name__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==31) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2299:2: rule__Name__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Name__Group_2__0_in_rule__Name__Group__2__Impl4843);
            	    rule__Name__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__2__Impl"


    // $ANTLR start "rule__Name__Group_2__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2315:1: rule__Name__Group_2__0 : rule__Name__Group_2__0__Impl rule__Name__Group_2__1 ;
    public final void rule__Name__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2319:1: ( rule__Name__Group_2__0__Impl rule__Name__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2320:2: rule__Name__Group_2__0__Impl rule__Name__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group_2__0__Impl_in_rule__Name__Group_2__04880);
            rule__Name__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group_2__1_in_rule__Name__Group_2__04883);
            rule__Name__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_2__0"


    // $ANTLR start "rule__Name__Group_2__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2327:1: rule__Name__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Name__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2331:1: ( ( '.' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2332:1: ( '.' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2332:1: ( '.' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2333:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getFullStopKeyword_2_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Name__Group_2__0__Impl4911); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getFullStopKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_2__0__Impl"


    // $ANTLR start "rule__Name__Group_2__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2346:1: rule__Name__Group_2__1 : rule__Name__Group_2__1__Impl ;
    public final void rule__Name__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2350:1: ( rule__Name__Group_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2351:2: rule__Name__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group_2__1__Impl_in_rule__Name__Group_2__14942);
            rule__Name__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_2__1"


    // $ANTLR start "rule__Name__Group_2__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2357:1: rule__Name__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2361:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2362:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2362:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2363:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Name__Group_2__1__Impl4969); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getIDTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_2__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2378:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2382:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2383:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05002);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05005);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2390:1: rule__Property__Group__0__Impl : ( '$' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2394:1: ( ( '$' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2395:1: ( '$' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2395:1: ( '$' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2396:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Property__Group__0__Impl5033); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2409:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2413:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2414:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15064);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2_in_rule__Property__Group__15067);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2421:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2425:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2426:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2426:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2427:1: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2428:1: ( rule__Property__NameAssignment_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2428:2: rule__Property__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl5094);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2438:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2442:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2443:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__25124);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3_in_rule__Property__Group__25127);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2450:1: rule__Property__Group__2__Impl : ( '=' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2454:1: ( ( '=' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2455:1: ( '=' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2455:1: ( '=' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2456:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Property__Group__2__Impl5155); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2469:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2473:1: ( rule__Property__Group__3__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2474:2: rule__Property__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__35186);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2480:1: rule__Property__Group__3__Impl : ( ( rule__Property__ValueAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2484:1: ( ( ( rule__Property__ValueAssignment_3 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2485:1: ( ( rule__Property__ValueAssignment_3 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2485:1: ( ( rule__Property__ValueAssignment_3 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2486:1: ( rule__Property__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAssignment_3()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2487:1: ( rule__Property__ValueAssignment_3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2487:2: rule__Property__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__ValueAssignment_3_in_rule__Property__Group__3__Impl5213);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2505:1: rule__FolderName__Group__0 : rule__FolderName__Group__0__Impl rule__FolderName__Group__1 ;
    public final void rule__FolderName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2509:1: ( rule__FolderName__Group__0__Impl rule__FolderName__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2510:2: rule__FolderName__Group__0__Impl rule__FolderName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FolderName__Group__0__Impl_in_rule__FolderName__Group__05251);
            rule__FolderName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FolderName__Group__1_in_rule__FolderName__Group__05254);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2517:1: rule__FolderName__Group__0__Impl : ( ruleName ) ;
    public final void rule__FolderName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2521:1: ( ( ruleName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2522:1: ( ruleName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2522:1: ( ruleName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2523:1: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFolderNameAccess().getNameParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleName_in_rule__FolderName__Group__0__Impl5281);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFolderNameAccess().getNameParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2534:1: rule__FolderName__Group__1 : rule__FolderName__Group__1__Impl ;
    public final void rule__FolderName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2538:1: ( rule__FolderName__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2539:2: rule__FolderName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FolderName__Group__1__Impl_in_rule__FolderName__Group__15310);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2545:1: rule__FolderName__Group__1__Impl : ( '/' ) ;
    public final void rule__FolderName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2549:1: ( ( '/' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2550:1: ( '/' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2550:1: ( '/' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2551:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFolderNameAccess().getSolidusKeyword_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__FolderName__Group__1__Impl5338); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2568:1: rule__EmfsContainer__Group__0 : rule__EmfsContainer__Group__0__Impl rule__EmfsContainer__Group__1 ;
    public final void rule__EmfsContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2572:1: ( rule__EmfsContainer__Group__0__Impl rule__EmfsContainer__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2573:2: rule__EmfsContainer__Group__0__Impl rule__EmfsContainer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__0__Impl_in_rule__EmfsContainer__Group__05373);
            rule__EmfsContainer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__1_in_rule__EmfsContainer__Group__05376);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2580:1: rule__EmfsContainer__Group__0__Impl : ( ( rule__EmfsContainer__NameAssignment_0 ) ) ;
    public final void rule__EmfsContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2584:1: ( ( ( rule__EmfsContainer__NameAssignment_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2585:1: ( ( rule__EmfsContainer__NameAssignment_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2585:1: ( ( rule__EmfsContainer__NameAssignment_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2586:1: ( rule__EmfsContainer__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getNameAssignment_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2587:1: ( rule__EmfsContainer__NameAssignment_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2587:2: rule__EmfsContainer__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__NameAssignment_0_in_rule__EmfsContainer__Group__0__Impl5403);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2597:1: rule__EmfsContainer__Group__1 : rule__EmfsContainer__Group__1__Impl rule__EmfsContainer__Group__2 ;
    public final void rule__EmfsContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2601:1: ( rule__EmfsContainer__Group__1__Impl rule__EmfsContainer__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2602:2: rule__EmfsContainer__Group__1__Impl rule__EmfsContainer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__1__Impl_in_rule__EmfsContainer__Group__15433);
            rule__EmfsContainer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__2_in_rule__EmfsContainer__Group__15436);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2609:1: rule__EmfsContainer__Group__1__Impl : ( ( rule__EmfsContainer__Group_1__0 )* ) ;
    public final void rule__EmfsContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2613:1: ( ( ( rule__EmfsContainer__Group_1__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2614:1: ( ( rule__EmfsContainer__Group_1__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2614:1: ( ( rule__EmfsContainer__Group_1__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2615:1: ( rule__EmfsContainer__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2616:1: ( rule__EmfsContainer__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2616:2: rule__EmfsContainer__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_1__0_in_rule__EmfsContainer__Group__1__Impl5463);
            	    rule__EmfsContainer__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2626:1: rule__EmfsContainer__Group__2 : rule__EmfsContainer__Group__2__Impl rule__EmfsContainer__Group__3 ;
    public final void rule__EmfsContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2630:1: ( rule__EmfsContainer__Group__2__Impl rule__EmfsContainer__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2631:2: rule__EmfsContainer__Group__2__Impl rule__EmfsContainer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__2__Impl_in_rule__EmfsContainer__Group__25494);
            rule__EmfsContainer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__3_in_rule__EmfsContainer__Group__25497);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2638:1: rule__EmfsContainer__Group__2__Impl : ( ( rule__EmfsContainer__PropertiesAssignment_2 )* ) ;
    public final void rule__EmfsContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2642:1: ( ( ( rule__EmfsContainer__PropertiesAssignment_2 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2643:1: ( ( rule__EmfsContainer__PropertiesAssignment_2 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2643:1: ( ( rule__EmfsContainer__PropertiesAssignment_2 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2644:1: ( rule__EmfsContainer__PropertiesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getPropertiesAssignment_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2645:1: ( rule__EmfsContainer__PropertiesAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==33) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2645:2: rule__EmfsContainer__PropertiesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__PropertiesAssignment_2_in_rule__EmfsContainer__Group__2__Impl5524);
            	    rule__EmfsContainer__PropertiesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2655:1: rule__EmfsContainer__Group__3 : rule__EmfsContainer__Group__3__Impl rule__EmfsContainer__Group__4 ;
    public final void rule__EmfsContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2659:1: ( rule__EmfsContainer__Group__3__Impl rule__EmfsContainer__Group__4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2660:2: rule__EmfsContainer__Group__3__Impl rule__EmfsContainer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__3__Impl_in_rule__EmfsContainer__Group__35555);
            rule__EmfsContainer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__4_in_rule__EmfsContainer__Group__35558);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2667:1: rule__EmfsContainer__Group__3__Impl : ( ( rule__EmfsContainer__Group_3__0 )? ) ;
    public final void rule__EmfsContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2671:1: ( ( ( rule__EmfsContainer__Group_3__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2672:1: ( ( rule__EmfsContainer__Group_3__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2672:1: ( ( rule__EmfsContainer__Group_3__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2673:1: ( rule__EmfsContainer__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getGroup_3()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2674:1: ( rule__EmfsContainer__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2674:2: rule__EmfsContainer__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__0_in_rule__EmfsContainer__Group__3__Impl5585);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2684:1: rule__EmfsContainer__Group__4 : rule__EmfsContainer__Group__4__Impl rule__EmfsContainer__Group__5 ;
    public final void rule__EmfsContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2688:1: ( rule__EmfsContainer__Group__4__Impl rule__EmfsContainer__Group__5 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2689:2: rule__EmfsContainer__Group__4__Impl rule__EmfsContainer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__4__Impl_in_rule__EmfsContainer__Group__45616);
            rule__EmfsContainer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__5_in_rule__EmfsContainer__Group__45619);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2696:1: rule__EmfsContainer__Group__4__Impl : ( ( rule__EmfsContainer__ResourcesAssignment_4 )* ) ;
    public final void rule__EmfsContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2700:1: ( ( ( rule__EmfsContainer__ResourcesAssignment_4 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2701:1: ( ( rule__EmfsContainer__ResourcesAssignment_4 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2701:1: ( ( rule__EmfsContainer__ResourcesAssignment_4 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2702:1: ( rule__EmfsContainer__ResourcesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getResourcesAssignment_4()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2703:1: ( rule__EmfsContainer__ResourcesAssignment_4 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==31) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred57_InternalXemfs()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==RULE_ID) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred57_InternalXemfs()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2703:2: rule__EmfsContainer__ResourcesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__ResourcesAssignment_4_in_rule__EmfsContainer__Group__4__Impl5646);
            	    rule__EmfsContainer__ResourcesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2713:1: rule__EmfsContainer__Group__5 : rule__EmfsContainer__Group__5__Impl ;
    public final void rule__EmfsContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2717:1: ( rule__EmfsContainer__Group__5__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2718:2: rule__EmfsContainer__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group__5__Impl_in_rule__EmfsContainer__Group__55677);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2724:1: rule__EmfsContainer__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__EmfsContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2728:1: ( ( ( ';' )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2729:1: ( ( ';' )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2729:1: ( ( ';' )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2730:1: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_5()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2731:1: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==8) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred58_InternalXemfs()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2732:2: ';'
                    {
                    match(input,8,FollowSets000.FOLLOW_8_in_rule__EmfsContainer__Group__5__Impl5706); if (state.failed) return ;

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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2755:1: rule__EmfsContainer__Group_1__0 : rule__EmfsContainer__Group_1__0__Impl rule__EmfsContainer__Group_1__1 ;
    public final void rule__EmfsContainer__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2759:1: ( rule__EmfsContainer__Group_1__0__Impl rule__EmfsContainer__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2760:2: rule__EmfsContainer__Group_1__0__Impl rule__EmfsContainer__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_1__0__Impl_in_rule__EmfsContainer__Group_1__05751);
            rule__EmfsContainer__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_1__1_in_rule__EmfsContainer__Group_1__05754);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2767:1: rule__EmfsContainer__Group_1__0__Impl : ( '#' ) ;
    public final void rule__EmfsContainer__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2771:1: ( ( '#' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2772:1: ( '#' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2772:1: ( '#' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2773:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getNumberSignKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__EmfsContainer__Group_1__0__Impl5782); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2786:1: rule__EmfsContainer__Group_1__1 : rule__EmfsContainer__Group_1__1__Impl ;
    public final void rule__EmfsContainer__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2790:1: ( rule__EmfsContainer__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2791:2: rule__EmfsContainer__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_1__1__Impl_in_rule__EmfsContainer__Group_1__15813);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2797:1: rule__EmfsContainer__Group_1__1__Impl : ( ( rule__EmfsContainer__TagsAssignment_1_1 ) ) ;
    public final void rule__EmfsContainer__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2801:1: ( ( ( rule__EmfsContainer__TagsAssignment_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2802:1: ( ( rule__EmfsContainer__TagsAssignment_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2802:1: ( ( rule__EmfsContainer__TagsAssignment_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2803:1: ( rule__EmfsContainer__TagsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getTagsAssignment_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2804:1: ( rule__EmfsContainer__TagsAssignment_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2804:2: rule__EmfsContainer__TagsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__TagsAssignment_1_1_in_rule__EmfsContainer__Group_1__1__Impl5840);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2818:1: rule__EmfsContainer__Group_3__0 : rule__EmfsContainer__Group_3__0__Impl rule__EmfsContainer__Group_3__1 ;
    public final void rule__EmfsContainer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2822:1: ( rule__EmfsContainer__Group_3__0__Impl rule__EmfsContainer__Group_3__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2823:2: rule__EmfsContainer__Group_3__0__Impl rule__EmfsContainer__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__0__Impl_in_rule__EmfsContainer__Group_3__05874);
            rule__EmfsContainer__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__1_in_rule__EmfsContainer__Group_3__05877);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2830:1: rule__EmfsContainer__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EmfsContainer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2834:1: ( ( 'extends' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2835:1: ( 'extends' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2835:1: ( 'extends' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2836:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getExtendsKeyword_3_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EmfsContainer__Group_3__0__Impl5905); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2849:1: rule__EmfsContainer__Group_3__1 : rule__EmfsContainer__Group_3__1__Impl rule__EmfsContainer__Group_3__2 ;
    public final void rule__EmfsContainer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2853:1: ( rule__EmfsContainer__Group_3__1__Impl rule__EmfsContainer__Group_3__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2854:2: rule__EmfsContainer__Group_3__1__Impl rule__EmfsContainer__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__1__Impl_in_rule__EmfsContainer__Group_3__15936);
            rule__EmfsContainer__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__2_in_rule__EmfsContainer__Group_3__15939);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2861:1: rule__EmfsContainer__Group_3__1__Impl : ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) ) ;
    public final void rule__EmfsContainer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2865:1: ( ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2866:1: ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2866:1: ( ( rule__EmfsContainer__ContentProviderAssignment_3_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2867:1: ( rule__EmfsContainer__ContentProviderAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getContentProviderAssignment_3_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2868:1: ( rule__EmfsContainer__ContentProviderAssignment_3_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2868:2: rule__EmfsContainer__ContentProviderAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__ContentProviderAssignment_3_1_in_rule__EmfsContainer__Group_3__1__Impl5966);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2878:1: rule__EmfsContainer__Group_3__2 : rule__EmfsContainer__Group_3__2__Impl ;
    public final void rule__EmfsContainer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2882:1: ( rule__EmfsContainer__Group_3__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2883:2: rule__EmfsContainer__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__Group_3__2__Impl_in_rule__EmfsContainer__Group_3__25996);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2889:1: rule__EmfsContainer__Group_3__2__Impl : ( ';' ) ;
    public final void rule__EmfsContainer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2893:1: ( ( ';' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2894:1: ( ';' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2894:1: ( ';' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2895:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_3_2()); 
            }
            match(input,8,FollowSets000.FOLLOW_8_in_rule__EmfsContainer__Group_3__2__Impl6024); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2914:1: rule__EmfsFile__Group__0 : rule__EmfsFile__Group__0__Impl rule__EmfsFile__Group__1 ;
    public final void rule__EmfsFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2918:1: ( rule__EmfsFile__Group__0__Impl rule__EmfsFile__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2919:2: rule__EmfsFile__Group__0__Impl rule__EmfsFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__0__Impl_in_rule__EmfsFile__Group__06061);
            rule__EmfsFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__1_in_rule__EmfsFile__Group__06064);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2926:1: rule__EmfsFile__Group__0__Impl : ( ( rule__EmfsFile__NameAssignment_0 ) ) ;
    public final void rule__EmfsFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2930:1: ( ( ( rule__EmfsFile__NameAssignment_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2931:1: ( ( rule__EmfsFile__NameAssignment_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2931:1: ( ( rule__EmfsFile__NameAssignment_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2932:1: ( rule__EmfsFile__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getNameAssignment_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2933:1: ( rule__EmfsFile__NameAssignment_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2933:2: rule__EmfsFile__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__NameAssignment_0_in_rule__EmfsFile__Group__0__Impl6091);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2943:1: rule__EmfsFile__Group__1 : rule__EmfsFile__Group__1__Impl rule__EmfsFile__Group__2 ;
    public final void rule__EmfsFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2947:1: ( rule__EmfsFile__Group__1__Impl rule__EmfsFile__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2948:2: rule__EmfsFile__Group__1__Impl rule__EmfsFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__1__Impl_in_rule__EmfsFile__Group__16121);
            rule__EmfsFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__2_in_rule__EmfsFile__Group__16124);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2955:1: rule__EmfsFile__Group__1__Impl : ( ( rule__EmfsFile__WriteableAssignment_1 )? ) ;
    public final void rule__EmfsFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2959:1: ( ( ( rule__EmfsFile__WriteableAssignment_1 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2960:1: ( ( rule__EmfsFile__WriteableAssignment_1 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2960:1: ( ( rule__EmfsFile__WriteableAssignment_1 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2961:1: ( rule__EmfsFile__WriteableAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getWriteableAssignment_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2962:1: ( rule__EmfsFile__WriteableAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2962:2: rule__EmfsFile__WriteableAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__WriteableAssignment_1_in_rule__EmfsFile__Group__1__Impl6151);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2972:1: rule__EmfsFile__Group__2 : rule__EmfsFile__Group__2__Impl rule__EmfsFile__Group__3 ;
    public final void rule__EmfsFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2976:1: ( rule__EmfsFile__Group__2__Impl rule__EmfsFile__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2977:2: rule__EmfsFile__Group__2__Impl rule__EmfsFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__2__Impl_in_rule__EmfsFile__Group__26182);
            rule__EmfsFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__3_in_rule__EmfsFile__Group__26185);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2984:1: rule__EmfsFile__Group__2__Impl : ( ( rule__EmfsFile__Group_2__0 )* ) ;
    public final void rule__EmfsFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2988:1: ( ( ( rule__EmfsFile__Group_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2989:1: ( ( rule__EmfsFile__Group_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2989:1: ( ( rule__EmfsFile__Group_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2990:1: ( rule__EmfsFile__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2991:1: ( rule__EmfsFile__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==29) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2991:2: rule__EmfsFile__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_2__0_in_rule__EmfsFile__Group__2__Impl6212);
            	    rule__EmfsFile__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3001:1: rule__EmfsFile__Group__3 : rule__EmfsFile__Group__3__Impl rule__EmfsFile__Group__4 ;
    public final void rule__EmfsFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3005:1: ( rule__EmfsFile__Group__3__Impl rule__EmfsFile__Group__4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3006:2: rule__EmfsFile__Group__3__Impl rule__EmfsFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__3__Impl_in_rule__EmfsFile__Group__36243);
            rule__EmfsFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__4_in_rule__EmfsFile__Group__36246);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3013:1: rule__EmfsFile__Group__3__Impl : ( ( rule__EmfsFile__PropertiesAssignment_3 )* ) ;
    public final void rule__EmfsFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3017:1: ( ( ( rule__EmfsFile__PropertiesAssignment_3 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3018:1: ( ( rule__EmfsFile__PropertiesAssignment_3 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3018:1: ( ( rule__EmfsFile__PropertiesAssignment_3 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3019:1: ( rule__EmfsFile__PropertiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getPropertiesAssignment_3()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3020:1: ( rule__EmfsFile__PropertiesAssignment_3 )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3020:2: rule__EmfsFile__PropertiesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__PropertiesAssignment_3_in_rule__EmfsFile__Group__3__Impl6273);
            	    rule__EmfsFile__PropertiesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3030:1: rule__EmfsFile__Group__4 : rule__EmfsFile__Group__4__Impl ;
    public final void rule__EmfsFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3034:1: ( rule__EmfsFile__Group__4__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3035:2: rule__EmfsFile__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group__4__Impl_in_rule__EmfsFile__Group__46304);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3041:1: rule__EmfsFile__Group__4__Impl : ( ( rule__EmfsFile__Alternatives_4 ) ) ;
    public final void rule__EmfsFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3045:1: ( ( ( rule__EmfsFile__Alternatives_4 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3046:1: ( ( rule__EmfsFile__Alternatives_4 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3046:1: ( ( rule__EmfsFile__Alternatives_4 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3047:1: ( rule__EmfsFile__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getAlternatives_4()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3048:1: ( rule__EmfsFile__Alternatives_4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3048:2: rule__EmfsFile__Alternatives_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Alternatives_4_in_rule__EmfsFile__Group__4__Impl6331);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3068:1: rule__EmfsFile__Group_2__0 : rule__EmfsFile__Group_2__0__Impl rule__EmfsFile__Group_2__1 ;
    public final void rule__EmfsFile__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3072:1: ( rule__EmfsFile__Group_2__0__Impl rule__EmfsFile__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3073:2: rule__EmfsFile__Group_2__0__Impl rule__EmfsFile__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_2__0__Impl_in_rule__EmfsFile__Group_2__06371);
            rule__EmfsFile__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_2__1_in_rule__EmfsFile__Group_2__06374);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3080:1: rule__EmfsFile__Group_2__0__Impl : ( '#' ) ;
    public final void rule__EmfsFile__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3084:1: ( ( '#' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3085:1: ( '#' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3085:1: ( '#' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3086:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__EmfsFile__Group_2__0__Impl6402); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3099:1: rule__EmfsFile__Group_2__1 : rule__EmfsFile__Group_2__1__Impl ;
    public final void rule__EmfsFile__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3103:1: ( rule__EmfsFile__Group_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3104:2: rule__EmfsFile__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_2__1__Impl_in_rule__EmfsFile__Group_2__16433);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3110:1: rule__EmfsFile__Group_2__1__Impl : ( ( rule__EmfsFile__TagsAssignment_2_1 ) ) ;
    public final void rule__EmfsFile__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3114:1: ( ( ( rule__EmfsFile__TagsAssignment_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3115:1: ( ( rule__EmfsFile__TagsAssignment_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3115:1: ( ( rule__EmfsFile__TagsAssignment_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3116:1: ( rule__EmfsFile__TagsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getTagsAssignment_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3117:1: ( rule__EmfsFile__TagsAssignment_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3117:2: rule__EmfsFile__TagsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__TagsAssignment_2_1_in_rule__EmfsFile__Group_2__1__Impl6460);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3131:1: rule__EmfsFile__Group_4_0__0 : rule__EmfsFile__Group_4_0__0__Impl rule__EmfsFile__Group_4_0__1 ;
    public final void rule__EmfsFile__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3135:1: ( rule__EmfsFile__Group_4_0__0__Impl rule__EmfsFile__Group_4_0__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3136:2: rule__EmfsFile__Group_4_0__0__Impl rule__EmfsFile__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__0__Impl_in_rule__EmfsFile__Group_4_0__06494);
            rule__EmfsFile__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__1_in_rule__EmfsFile__Group_4_0__06497);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3143:1: rule__EmfsFile__Group_4_0__0__Impl : ( '@' ) ;
    public final void rule__EmfsFile__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3147:1: ( ( '@' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3148:1: ( '@' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3148:1: ( '@' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3149:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getCommercialAtKeyword_4_0_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__EmfsFile__Group_4_0__0__Impl6525); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3162:1: rule__EmfsFile__Group_4_0__1 : rule__EmfsFile__Group_4_0__1__Impl rule__EmfsFile__Group_4_0__2 ;
    public final void rule__EmfsFile__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3166:1: ( rule__EmfsFile__Group_4_0__1__Impl rule__EmfsFile__Group_4_0__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3167:2: rule__EmfsFile__Group_4_0__1__Impl rule__EmfsFile__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__1__Impl_in_rule__EmfsFile__Group_4_0__16556);
            rule__EmfsFile__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__2_in_rule__EmfsFile__Group_4_0__16559);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3174:1: rule__EmfsFile__Group_4_0__1__Impl : ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) ) ;
    public final void rule__EmfsFile__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3178:1: ( ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3179:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3179:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_0_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3180:1: ( rule__EmfsFile__ContentProviderAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_0_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3181:1: ( rule__EmfsFile__ContentProviderAssignment_4_0_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3181:2: rule__EmfsFile__ContentProviderAssignment_4_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_0_1_in_rule__EmfsFile__Group_4_0__1__Impl6586);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3191:1: rule__EmfsFile__Group_4_0__2 : rule__EmfsFile__Group_4_0__2__Impl ;
    public final void rule__EmfsFile__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3195:1: ( rule__EmfsFile__Group_4_0__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3196:2: rule__EmfsFile__Group_4_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_0__2__Impl_in_rule__EmfsFile__Group_4_0__26616);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3202:1: rule__EmfsFile__Group_4_0__2__Impl : ( ';' ) ;
    public final void rule__EmfsFile__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3206:1: ( ( ';' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3207:1: ( ';' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3207:1: ( ';' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3208:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_0_2()); 
            }
            match(input,8,FollowSets000.FOLLOW_8_in_rule__EmfsFile__Group_4_0__2__Impl6644); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3227:1: rule__EmfsFile__Group_4_2__0 : rule__EmfsFile__Group_4_2__0__Impl rule__EmfsFile__Group_4_2__1 ;
    public final void rule__EmfsFile__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3231:1: ( rule__EmfsFile__Group_4_2__0__Impl rule__EmfsFile__Group_4_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3232:2: rule__EmfsFile__Group_4_2__0__Impl rule__EmfsFile__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_2__0__Impl_in_rule__EmfsFile__Group_4_2__06681);
            rule__EmfsFile__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_2__1_in_rule__EmfsFile__Group_4_2__06684);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3239:1: rule__EmfsFile__Group_4_2__0__Impl : ( ':' ) ;
    public final void rule__EmfsFile__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3243:1: ( ( ':' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3244:1: ( ':' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3244:1: ( ':' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3245:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getColonKeyword_4_2_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__EmfsFile__Group_4_2__0__Impl6712); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3258:1: rule__EmfsFile__Group_4_2__1 : rule__EmfsFile__Group_4_2__1__Impl ;
    public final void rule__EmfsFile__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3262:1: ( rule__EmfsFile__Group_4_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3263:2: rule__EmfsFile__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__Group_4_2__1__Impl_in_rule__EmfsFile__Group_4_2__16743);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3269:1: rule__EmfsFile__Group_4_2__1__Impl : ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) ) ;
    public final void rule__EmfsFile__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3273:1: ( ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3274:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3274:1: ( ( rule__EmfsFile__ContentProviderAssignment_4_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3275:1: ( rule__EmfsFile__ContentProviderAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAssignment_4_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3276:1: ( rule__EmfsFile__ContentProviderAssignment_4_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3276:2: rule__EmfsFile__ContentProviderAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_2_1_in_rule__EmfsFile__Group_4_2__1__Impl6770);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3290:1: rule__PropertyValueString__Group__0 : rule__PropertyValueString__Group__0__Impl rule__PropertyValueString__Group__1 ;
    public final void rule__PropertyValueString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3294:1: ( rule__PropertyValueString__Group__0__Impl rule__PropertyValueString__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3295:2: rule__PropertyValueString__Group__0__Impl rule__PropertyValueString__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__0__Impl_in_rule__PropertyValueString__Group__06804);
            rule__PropertyValueString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__1_in_rule__PropertyValueString__Group__06807);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3302:1: rule__PropertyValueString__Group__0__Impl : ( '$' ) ;
    public final void rule__PropertyValueString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3306:1: ( ( '$' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3307:1: ( '$' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3307:1: ( '$' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3308:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getDollarSignKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__PropertyValueString__Group__0__Impl6835); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3321:1: rule__PropertyValueString__Group__1 : rule__PropertyValueString__Group__1__Impl rule__PropertyValueString__Group__2 ;
    public final void rule__PropertyValueString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3325:1: ( rule__PropertyValueString__Group__1__Impl rule__PropertyValueString__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3326:2: rule__PropertyValueString__Group__1__Impl rule__PropertyValueString__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__1__Impl_in_rule__PropertyValueString__Group__16866);
            rule__PropertyValueString__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__2_in_rule__PropertyValueString__Group__16869);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3333:1: rule__PropertyValueString__Group__1__Impl : ( ( rule__PropertyValueString__Alternatives_1 ) ) ;
    public final void rule__PropertyValueString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3337:1: ( ( ( rule__PropertyValueString__Alternatives_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3338:1: ( ( rule__PropertyValueString__Alternatives_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3338:1: ( ( rule__PropertyValueString__Alternatives_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3339:1: ( rule__PropertyValueString__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getAlternatives_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3340:1: ( rule__PropertyValueString__Alternatives_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3340:2: rule__PropertyValueString__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Alternatives_1_in_rule__PropertyValueString__Group__1__Impl6896);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3350:1: rule__PropertyValueString__Group__2 : rule__PropertyValueString__Group__2__Impl ;
    public final void rule__PropertyValueString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3354:1: ( rule__PropertyValueString__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3355:2: rule__PropertyValueString__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group__2__Impl_in_rule__PropertyValueString__Group__26926);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3361:1: rule__PropertyValueString__Group__2__Impl : ( ( rule__PropertyValueString__Group_2__0 )? ) ;
    public final void rule__PropertyValueString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3365:1: ( ( ( rule__PropertyValueString__Group_2__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3366:1: ( ( rule__PropertyValueString__Group_2__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3366:1: ( ( rule__PropertyValueString__Group_2__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3367:1: ( rule__PropertyValueString__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3368:1: ( rule__PropertyValueString__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3368:2: rule__PropertyValueString__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_2__0_in_rule__PropertyValueString__Group__2__Impl6953);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3384:1: rule__PropertyValueString__Group_1_1__0 : rule__PropertyValueString__Group_1_1__0__Impl rule__PropertyValueString__Group_1_1__1 ;
    public final void rule__PropertyValueString__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3388:1: ( rule__PropertyValueString__Group_1_1__0__Impl rule__PropertyValueString__Group_1_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3389:2: rule__PropertyValueString__Group_1_1__0__Impl rule__PropertyValueString__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__0__Impl_in_rule__PropertyValueString__Group_1_1__06990);
            rule__PropertyValueString__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__1_in_rule__PropertyValueString__Group_1_1__06993);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3396:1: rule__PropertyValueString__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__PropertyValueString__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3400:1: ( ( '{' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3401:1: ( '{' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3401:1: ( '{' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3402:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__PropertyValueString__Group_1_1__0__Impl7021); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3415:1: rule__PropertyValueString__Group_1_1__1 : rule__PropertyValueString__Group_1_1__1__Impl rule__PropertyValueString__Group_1_1__2 ;
    public final void rule__PropertyValueString__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3419:1: ( rule__PropertyValueString__Group_1_1__1__Impl rule__PropertyValueString__Group_1_1__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3420:2: rule__PropertyValueString__Group_1_1__1__Impl rule__PropertyValueString__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__1__Impl_in_rule__PropertyValueString__Group_1_1__17052);
            rule__PropertyValueString__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__2_in_rule__PropertyValueString__Group_1_1__17055);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3427:1: rule__PropertyValueString__Group_1_1__1__Impl : ( ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 ) ) ;
    public final void rule__PropertyValueString__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3431:1: ( ( ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3432:1: ( ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3432:1: ( ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3433:1: ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getPropertyNameAssignment_1_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3434:1: ( rule__PropertyValueString__PropertyNameAssignment_1_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3434:2: rule__PropertyValueString__PropertyNameAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__PropertyNameAssignment_1_1_1_in_rule__PropertyValueString__Group_1_1__1__Impl7082);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3444:1: rule__PropertyValueString__Group_1_1__2 : rule__PropertyValueString__Group_1_1__2__Impl ;
    public final void rule__PropertyValueString__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3448:1: ( rule__PropertyValueString__Group_1_1__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3449:2: rule__PropertyValueString__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_1_1__2__Impl_in_rule__PropertyValueString__Group_1_1__27112);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3455:1: rule__PropertyValueString__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__PropertyValueString__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3459:1: ( ( '}' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3460:1: ( '}' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3460:1: ( '}' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3461:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getRightCurlyBracketKeyword_1_1_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__PropertyValueString__Group_1_1__2__Impl7140); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3480:1: rule__PropertyValueString__Group_2__0 : rule__PropertyValueString__Group_2__0__Impl rule__PropertyValueString__Group_2__1 ;
    public final void rule__PropertyValueString__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3484:1: ( rule__PropertyValueString__Group_2__0__Impl rule__PropertyValueString__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3485:2: rule__PropertyValueString__Group_2__0__Impl rule__PropertyValueString__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_2__0__Impl_in_rule__PropertyValueString__Group_2__07177);
            rule__PropertyValueString__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_2__1_in_rule__PropertyValueString__Group_2__07180);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3492:1: rule__PropertyValueString__Group_2__0__Impl : ( ':' ) ;
    public final void rule__PropertyValueString__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3496:1: ( ( ':' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3497:1: ( ':' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3497:1: ( ':' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3498:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getColonKeyword_2_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__PropertyValueString__Group_2__0__Impl7208); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3511:1: rule__PropertyValueString__Group_2__1 : rule__PropertyValueString__Group_2__1__Impl ;
    public final void rule__PropertyValueString__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3515:1: ( rule__PropertyValueString__Group_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3516:2: rule__PropertyValueString__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__Group_2__1__Impl_in_rule__PropertyValueString__Group_2__17239);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3522:1: rule__PropertyValueString__Group_2__1__Impl : ( ( rule__PropertyValueString__DefaultValueAssignment_2_1 ) ) ;
    public final void rule__PropertyValueString__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3526:1: ( ( ( rule__PropertyValueString__DefaultValueAssignment_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3527:1: ( ( rule__PropertyValueString__DefaultValueAssignment_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3527:1: ( ( rule__PropertyValueString__DefaultValueAssignment_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3528:1: ( rule__PropertyValueString__DefaultValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getDefaultValueAssignment_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3529:1: ( rule__PropertyValueString__DefaultValueAssignment_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3529:2: rule__PropertyValueString__DefaultValueAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__DefaultValueAssignment_2_1_in_rule__PropertyValueString__Group_2__1__Impl7266);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3543:1: rule__WrappingStringContentProvider__Group__0 : rule__WrappingStringContentProvider__Group__0__Impl rule__WrappingStringContentProvider__Group__1 ;
    public final void rule__WrappingStringContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3547:1: ( rule__WrappingStringContentProvider__Group__0__Impl rule__WrappingStringContentProvider__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3548:2: rule__WrappingStringContentProvider__Group__0__Impl rule__WrappingStringContentProvider__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__0__Impl_in_rule__WrappingStringContentProvider__Group__07300);
            rule__WrappingStringContentProvider__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__1_in_rule__WrappingStringContentProvider__Group__07303);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3555:1: rule__WrappingStringContentProvider__Group__0__Impl : ( ( rule__WrappingStringContentProvider__PrefixAssignment_0 ) ) ;
    public final void rule__WrappingStringContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3559:1: ( ( ( rule__WrappingStringContentProvider__PrefixAssignment_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3560:1: ( ( rule__WrappingStringContentProvider__PrefixAssignment_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3560:1: ( ( rule__WrappingStringContentProvider__PrefixAssignment_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3561:1: ( rule__WrappingStringContentProvider__PrefixAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAssignment_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3562:1: ( rule__WrappingStringContentProvider__PrefixAssignment_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3562:2: rule__WrappingStringContentProvider__PrefixAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__PrefixAssignment_0_in_rule__WrappingStringContentProvider__Group__0__Impl7330);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3572:1: rule__WrappingStringContentProvider__Group__1 : rule__WrappingStringContentProvider__Group__1__Impl rule__WrappingStringContentProvider__Group__2 ;
    public final void rule__WrappingStringContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3576:1: ( rule__WrappingStringContentProvider__Group__1__Impl rule__WrappingStringContentProvider__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3577:2: rule__WrappingStringContentProvider__Group__1__Impl rule__WrappingStringContentProvider__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__1__Impl_in_rule__WrappingStringContentProvider__Group__17360);
            rule__WrappingStringContentProvider__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__2_in_rule__WrappingStringContentProvider__Group__17363);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3584:1: rule__WrappingStringContentProvider__Group__1__Impl : ( ( rule__WrappingStringContentProvider__Group_1__0 ) ) ;
    public final void rule__WrappingStringContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3588:1: ( ( ( rule__WrappingStringContentProvider__Group_1__0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3589:1: ( ( rule__WrappingStringContentProvider__Group_1__0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3589:1: ( ( rule__WrappingStringContentProvider__Group_1__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3590:1: ( rule__WrappingStringContentProvider__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3591:1: ( rule__WrappingStringContentProvider__Group_1__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3591:2: rule__WrappingStringContentProvider__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group_1__0_in_rule__WrappingStringContentProvider__Group__1__Impl7390);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3601:1: rule__WrappingStringContentProvider__Group__2 : rule__WrappingStringContentProvider__Group__2__Impl ;
    public final void rule__WrappingStringContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3605:1: ( rule__WrappingStringContentProvider__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3606:2: rule__WrappingStringContentProvider__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group__2__Impl_in_rule__WrappingStringContentProvider__Group__27420);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3612:1: rule__WrappingStringContentProvider__Group__2__Impl : ( ( rule__WrappingStringContentProvider__SuffixAssignment_2 ) ) ;
    public final void rule__WrappingStringContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3616:1: ( ( ( rule__WrappingStringContentProvider__SuffixAssignment_2 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3617:1: ( ( rule__WrappingStringContentProvider__SuffixAssignment_2 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3617:1: ( ( rule__WrappingStringContentProvider__SuffixAssignment_2 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3618:1: ( rule__WrappingStringContentProvider__SuffixAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAssignment_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3619:1: ( rule__WrappingStringContentProvider__SuffixAssignment_2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3619:2: rule__WrappingStringContentProvider__SuffixAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__SuffixAssignment_2_in_rule__WrappingStringContentProvider__Group__2__Impl7447);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3635:1: rule__WrappingStringContentProvider__Group_1__0 : rule__WrappingStringContentProvider__Group_1__0__Impl rule__WrappingStringContentProvider__Group_1__1 ;
    public final void rule__WrappingStringContentProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3639:1: ( rule__WrappingStringContentProvider__Group_1__0__Impl rule__WrappingStringContentProvider__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3640:2: rule__WrappingStringContentProvider__Group_1__0__Impl rule__WrappingStringContentProvider__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group_1__0__Impl_in_rule__WrappingStringContentProvider__Group_1__07483);
            rule__WrappingStringContentProvider__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group_1__1_in_rule__WrappingStringContentProvider__Group_1__07486);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3647:1: rule__WrappingStringContentProvider__Group_1__0__Impl : ( '@' ) ;
    public final void rule__WrappingStringContentProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3651:1: ( ( '@' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3652:1: ( '@' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3652:1: ( '@' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3653:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getCommercialAtKeyword_1_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__WrappingStringContentProvider__Group_1__0__Impl7514); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3666:1: rule__WrappingStringContentProvider__Group_1__1 : rule__WrappingStringContentProvider__Group_1__1__Impl ;
    public final void rule__WrappingStringContentProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3670:1: ( rule__WrappingStringContentProvider__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3671:2: rule__WrappingStringContentProvider__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__Group_1__1__Impl_in_rule__WrappingStringContentProvider__Group_1__17545);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3677:1: rule__WrappingStringContentProvider__Group_1__1__Impl : ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) ) ;
    public final void rule__WrappingStringContentProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3681:1: ( ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3682:1: ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3682:1: ( ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3683:1: ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderAssignment_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3684:1: ( rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3684:2: rule__WrappingStringContentProvider__ContentProviderAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__ContentProviderAssignment_1_1_in_rule__WrappingStringContentProvider__Group_1__1__Impl7572);
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


    // $ANTLR start "rule__URL_HOST__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3698:1: rule__URL_HOST__Group__0 : rule__URL_HOST__Group__0__Impl rule__URL_HOST__Group__1 ;
    public final void rule__URL_HOST__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3702:1: ( rule__URL_HOST__Group__0__Impl rule__URL_HOST__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3703:2: rule__URL_HOST__Group__0__Impl rule__URL_HOST__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__0__Impl_in_rule__URL_HOST__Group__07606);
            rule__URL_HOST__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__1_in_rule__URL_HOST__Group__07609);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3710:1: rule__URL_HOST__Group__0__Impl : ( '//' ) ;
    public final void rule__URL_HOST__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3714:1: ( ( '//' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3715:1: ( '//' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3715:1: ( '//' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3716:1: '//'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getSolidusSolidusKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__URL_HOST__Group__0__Impl7637); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3729:1: rule__URL_HOST__Group__1 : rule__URL_HOST__Group__1__Impl rule__URL_HOST__Group__2 ;
    public final void rule__URL_HOST__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3733:1: ( rule__URL_HOST__Group__1__Impl rule__URL_HOST__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3734:2: rule__URL_HOST__Group__1__Impl rule__URL_HOST__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__1__Impl_in_rule__URL_HOST__Group__17668);
            rule__URL_HOST__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__2_in_rule__URL_HOST__Group__17671);
            rule__URL_HOST__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3741:1: rule__URL_HOST__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__URL_HOST__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3745:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3746:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3746:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3747:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__URL_HOST__Group__1__Impl7698); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getIDTerminalRuleCall_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__URL_HOST__Group__2"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3758:1: rule__URL_HOST__Group__2 : rule__URL_HOST__Group__2__Impl rule__URL_HOST__Group__3 ;
    public final void rule__URL_HOST__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3762:1: ( rule__URL_HOST__Group__2__Impl rule__URL_HOST__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3763:2: rule__URL_HOST__Group__2__Impl rule__URL_HOST__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__2__Impl_in_rule__URL_HOST__Group__27727);
            rule__URL_HOST__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__3_in_rule__URL_HOST__Group__27730);
            rule__URL_HOST__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group__2"


    // $ANTLR start "rule__URL_HOST__Group__2__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3770:1: rule__URL_HOST__Group__2__Impl : ( ( rule__URL_HOST__Group_2__0 )* ) ;
    public final void rule__URL_HOST__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3774:1: ( ( ( rule__URL_HOST__Group_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3775:1: ( ( rule__URL_HOST__Group_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3775:1: ( ( rule__URL_HOST__Group_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3776:1: ( rule__URL_HOST__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3777:1: ( rule__URL_HOST__Group_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==31) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3777:2: rule__URL_HOST__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_2__0_in_rule__URL_HOST__Group__2__Impl7757);
            	    rule__URL_HOST__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group__2__Impl"


    // $ANTLR start "rule__URL_HOST__Group__3"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3787:1: rule__URL_HOST__Group__3 : rule__URL_HOST__Group__3__Impl ;
    public final void rule__URL_HOST__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3791:1: ( rule__URL_HOST__Group__3__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3792:2: rule__URL_HOST__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group__3__Impl_in_rule__URL_HOST__Group__37788);
            rule__URL_HOST__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group__3"


    // $ANTLR start "rule__URL_HOST__Group__3__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3798:1: rule__URL_HOST__Group__3__Impl : ( ( rule__URL_HOST__Group_3__0 )? ) ;
    public final void rule__URL_HOST__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3802:1: ( ( ( rule__URL_HOST__Group_3__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3803:1: ( ( rule__URL_HOST__Group_3__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3803:1: ( ( rule__URL_HOST__Group_3__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3804:1: ( rule__URL_HOST__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getGroup_3()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3805:1: ( rule__URL_HOST__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3805:2: rule__URL_HOST__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_3__0_in_rule__URL_HOST__Group__3__Impl7815);
                    rule__URL_HOST__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group__3__Impl"


    // $ANTLR start "rule__URL_HOST__Group_2__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3823:1: rule__URL_HOST__Group_2__0 : rule__URL_HOST__Group_2__0__Impl rule__URL_HOST__Group_2__1 ;
    public final void rule__URL_HOST__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3827:1: ( rule__URL_HOST__Group_2__0__Impl rule__URL_HOST__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3828:2: rule__URL_HOST__Group_2__0__Impl rule__URL_HOST__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_2__0__Impl_in_rule__URL_HOST__Group_2__07854);
            rule__URL_HOST__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_2__1_in_rule__URL_HOST__Group_2__07857);
            rule__URL_HOST__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_2__0"


    // $ANTLR start "rule__URL_HOST__Group_2__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3835:1: rule__URL_HOST__Group_2__0__Impl : ( '.' ) ;
    public final void rule__URL_HOST__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3839:1: ( ( '.' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3840:1: ( '.' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3840:1: ( '.' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3841:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getFullStopKeyword_2_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__URL_HOST__Group_2__0__Impl7885); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getFullStopKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_2__0__Impl"


    // $ANTLR start "rule__URL_HOST__Group_2__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3854:1: rule__URL_HOST__Group_2__1 : rule__URL_HOST__Group_2__1__Impl ;
    public final void rule__URL_HOST__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3858:1: ( rule__URL_HOST__Group_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3859:2: rule__URL_HOST__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_2__1__Impl_in_rule__URL_HOST__Group_2__17916);
            rule__URL_HOST__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_2__1"


    // $ANTLR start "rule__URL_HOST__Group_2__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3865:1: rule__URL_HOST__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__URL_HOST__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3869:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3870:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3870:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3871:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__URL_HOST__Group_2__1__Impl7943); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getIDTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_2__1__Impl"


    // $ANTLR start "rule__URL_HOST__Group_3__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3886:1: rule__URL_HOST__Group_3__0 : rule__URL_HOST__Group_3__0__Impl rule__URL_HOST__Group_3__1 ;
    public final void rule__URL_HOST__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3890:1: ( rule__URL_HOST__Group_3__0__Impl rule__URL_HOST__Group_3__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3891:2: rule__URL_HOST__Group_3__0__Impl rule__URL_HOST__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_3__0__Impl_in_rule__URL_HOST__Group_3__07976);
            rule__URL_HOST__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_3__1_in_rule__URL_HOST__Group_3__07979);
            rule__URL_HOST__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_3__0"


    // $ANTLR start "rule__URL_HOST__Group_3__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3898:1: rule__URL_HOST__Group_3__0__Impl : ( ':' ) ;
    public final void rule__URL_HOST__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3902:1: ( ( ':' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3903:1: ( ':' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3903:1: ( ':' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3904:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getColonKeyword_3_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__URL_HOST__Group_3__0__Impl8007); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getColonKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_3__0__Impl"


    // $ANTLR start "rule__URL_HOST__Group_3__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3917:1: rule__URL_HOST__Group_3__1 : rule__URL_HOST__Group_3__1__Impl ;
    public final void rule__URL_HOST__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3921:1: ( rule__URL_HOST__Group_3__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3922:2: rule__URL_HOST__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Group_3__1__Impl_in_rule__URL_HOST__Group_3__18038);
            rule__URL_HOST__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL_HOST__Group_3__1"


    // $ANTLR start "rule__URL_HOST__Group_3__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3928:1: rule__URL_HOST__Group_3__1__Impl : ( ( ( rule__URL_HOST__Alternatives_3_1 ) ) ( ( rule__URL_HOST__Alternatives_3_1 )* ) ) ;
    public final void rule__URL_HOST__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3932:1: ( ( ( ( rule__URL_HOST__Alternatives_3_1 ) ) ( ( rule__URL_HOST__Alternatives_3_1 )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3933:1: ( ( ( rule__URL_HOST__Alternatives_3_1 ) ) ( ( rule__URL_HOST__Alternatives_3_1 )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3933:1: ( ( ( rule__URL_HOST__Alternatives_3_1 ) ) ( ( rule__URL_HOST__Alternatives_3_1 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3934:1: ( ( rule__URL_HOST__Alternatives_3_1 ) ) ( ( rule__URL_HOST__Alternatives_3_1 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3934:1: ( ( rule__URL_HOST__Alternatives_3_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3935:1: ( rule__URL_HOST__Alternatives_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getAlternatives_3_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3936:1: ( rule__URL_HOST__Alternatives_3_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3936:2: rule__URL_HOST__Alternatives_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Alternatives_3_1_in_rule__URL_HOST__Group_3__1__Impl8067);
            rule__URL_HOST__Alternatives_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getAlternatives_3_1()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3939:1: ( ( rule__URL_HOST__Alternatives_3_1 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3940:1: ( rule__URL_HOST__Alternatives_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_HOSTAccess().getAlternatives_3_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3941:1: ( rule__URL_HOST__Alternatives_3_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=13 && LA43_0<=22)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3941:2: rule__URL_HOST__Alternatives_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__URL_HOST__Alternatives_3_1_in_rule__URL_HOST__Group_3__1__Impl8079);
            	    rule__URL_HOST__Alternatives_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_HOSTAccess().getAlternatives_3_1()); 
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
    // $ANTLR end "rule__URL_HOST__Group_3__1__Impl"


    // $ANTLR start "rule__URL_PATH__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3956:1: rule__URL_PATH__Group__0 : rule__URL_PATH__Group__0__Impl rule__URL_PATH__Group__1 ;
    public final void rule__URL_PATH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3960:1: ( rule__URL_PATH__Group__0__Impl rule__URL_PATH__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3961:2: rule__URL_PATH__Group__0__Impl rule__URL_PATH__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__0__Impl_in_rule__URL_PATH__Group__08116);
            rule__URL_PATH__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__1_in_rule__URL_PATH__Group__08119);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3968:1: rule__URL_PATH__Group__0__Impl : ( '/' ) ;
    public final void rule__URL_PATH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3972:1: ( ( '/' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3973:1: ( '/' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3973:1: ( '/' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3974:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getSolidusKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__URL_PATH__Group__0__Impl8147); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3987:1: rule__URL_PATH__Group__1 : rule__URL_PATH__Group__1__Impl rule__URL_PATH__Group__2 ;
    public final void rule__URL_PATH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3991:1: ( rule__URL_PATH__Group__1__Impl rule__URL_PATH__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3992:2: rule__URL_PATH__Group__1__Impl rule__URL_PATH__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__1__Impl_in_rule__URL_PATH__Group__18178);
            rule__URL_PATH__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__2_in_rule__URL_PATH__Group__18181);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:3999:1: rule__URL_PATH__Group__1__Impl : ( ( ruleFolderName )* ) ;
    public final void rule__URL_PATH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4003:1: ( ( ( ruleFolderName )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4004:1: ( ( ruleFolderName )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4004:1: ( ( ruleFolderName )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4005:1: ( ruleFolderName )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getFolderNameParserRuleCall_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4006:1: ( ruleFolderName )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4006:3: ruleFolderName
            	    {
            	    pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_rule__URL_PATH__Group__1__Impl8209);
            	    ruleFolderName();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHAccess().getFolderNameParserRuleCall_1()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4016:1: rule__URL_PATH__Group__2 : rule__URL_PATH__Group__2__Impl ;
    public final void rule__URL_PATH__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4020:1: ( rule__URL_PATH__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4021:2: rule__URL_PATH__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL_PATH__Group__2__Impl_in_rule__URL_PATH__Group__28240);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4027:1: rule__URL_PATH__Group__2__Impl : ( ruleFileName ) ;
    public final void rule__URL_PATH__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4031:1: ( ( ruleFileName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4032:1: ( ruleFileName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4032:1: ( ruleFileName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4033:1: ruleFileName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURL_PATHAccess().getFileNameParserRuleCall_2()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_rule__URL_PATH__Group__2__Impl8267);
            ruleFileName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURL_PATHAccess().getFileNameParserRuleCall_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__URL__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4050:1: rule__URL__Group__0 : rule__URL__Group__0__Impl rule__URL__Group__1 ;
    public final void rule__URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4054:1: ( rule__URL__Group__0__Impl rule__URL__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4055:2: rule__URL__Group__0__Impl rule__URL__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__0__Impl_in_rule__URL__Group__08302);
            rule__URL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__1_in_rule__URL__Group__08305);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4062:1: rule__URL__Group__0__Impl : ( ruleURL_SCHEME ) ;
    public final void rule__URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4066:1: ( ( ruleURL_SCHEME ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4067:1: ( ruleURL_SCHEME )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4067:1: ( ruleURL_SCHEME )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4068:1: ruleURL_SCHEME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getURL_SCHEMEParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_SCHEME_in_rule__URL__Group__0__Impl8332);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4079:1: rule__URL__Group__1 : rule__URL__Group__1__Impl rule__URL__Group__2 ;
    public final void rule__URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4083:1: ( rule__URL__Group__1__Impl rule__URL__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4084:2: rule__URL__Group__1__Impl rule__URL__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__1__Impl_in_rule__URL__Group__18361);
            rule__URL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__2_in_rule__URL__Group__18364);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4091:1: rule__URL__Group__1__Impl : ( ':' ) ;
    public final void rule__URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4095:1: ( ( ':' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4096:1: ( ':' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4096:1: ( ':' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4097:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getColonKeyword_1()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__URL__Group__1__Impl8392); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4110:1: rule__URL__Group__2 : rule__URL__Group__2__Impl rule__URL__Group__3 ;
    public final void rule__URL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4114:1: ( rule__URL__Group__2__Impl rule__URL__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4115:2: rule__URL__Group__2__Impl rule__URL__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__2__Impl_in_rule__URL__Group__28423);
            rule__URL__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__3_in_rule__URL__Group__28426);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4122:1: rule__URL__Group__2__Impl : ( ( ruleURL_HOST )? ) ;
    public final void rule__URL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4126:1: ( ( ( ruleURL_HOST )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4127:1: ( ( ruleURL_HOST )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4127:1: ( ( ruleURL_HOST )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4128:1: ( ruleURL_HOST )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getURL_HOSTParserRuleCall_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4129:1: ( ruleURL_HOST )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4129:3: ruleURL_HOST
                    {
                    pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_in_rule__URL__Group__2__Impl8454);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4139:1: rule__URL__Group__3 : rule__URL__Group__3__Impl ;
    public final void rule__URL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4143:1: ( rule__URL__Group__3__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4144:2: rule__URL__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__URL__Group__3__Impl_in_rule__URL__Group__38485);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4150:1: rule__URL__Group__3__Impl : ( ruleURL_PATH ) ;
    public final void rule__URL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4154:1: ( ( ruleURL_PATH ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4155:1: ( ruleURL_PATH )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4155:1: ( ruleURL_PATH )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4156:1: ruleURL_PATH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLAccess().getURL_PATHParserRuleCall_3()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_rule__URL__Group__3__Impl8512);
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


    // $ANTLR start "rule__GIT_HOST__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4175:1: rule__GIT_HOST__Group__0 : rule__GIT_HOST__Group__0__Impl rule__GIT_HOST__Group__1 ;
    public final void rule__GIT_HOST__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4179:1: ( rule__GIT_HOST__Group__0__Impl rule__GIT_HOST__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4180:2: rule__GIT_HOST__Group__0__Impl rule__GIT_HOST__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GIT_HOST__Group__0__Impl_in_rule__GIT_HOST__Group__08549);
            rule__GIT_HOST__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GIT_HOST__Group__1_in_rule__GIT_HOST__Group__08552);
            rule__GIT_HOST__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIT_HOST__Group__0"


    // $ANTLR start "rule__GIT_HOST__Group__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4187:1: rule__GIT_HOST__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__GIT_HOST__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4191:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4192:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4192:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4193:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIT_HOSTAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GIT_HOST__Group__0__Impl8579); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIT_HOSTAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIT_HOST__Group__0__Impl"


    // $ANTLR start "rule__GIT_HOST__Group__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4204:1: rule__GIT_HOST__Group__1 : rule__GIT_HOST__Group__1__Impl ;
    public final void rule__GIT_HOST__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4208:1: ( rule__GIT_HOST__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4209:2: rule__GIT_HOST__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GIT_HOST__Group__1__Impl_in_rule__GIT_HOST__Group__18608);
            rule__GIT_HOST__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIT_HOST__Group__1"


    // $ANTLR start "rule__GIT_HOST__Group__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4215:1: rule__GIT_HOST__Group__1__Impl : ( ( ( rule__GIT_HOST__Group_1__0 ) ) ( ( rule__GIT_HOST__Group_1__0 )* ) ) ;
    public final void rule__GIT_HOST__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4219:1: ( ( ( ( rule__GIT_HOST__Group_1__0 ) ) ( ( rule__GIT_HOST__Group_1__0 )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4220:1: ( ( ( rule__GIT_HOST__Group_1__0 ) ) ( ( rule__GIT_HOST__Group_1__0 )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4220:1: ( ( ( rule__GIT_HOST__Group_1__0 ) ) ( ( rule__GIT_HOST__Group_1__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4221:1: ( ( rule__GIT_HOST__Group_1__0 ) ) ( ( rule__GIT_HOST__Group_1__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4221:1: ( ( rule__GIT_HOST__Group_1__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4222:1: ( rule__GIT_HOST__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIT_HOSTAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4223:1: ( rule__GIT_HOST__Group_1__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4223:2: rule__GIT_HOST__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GIT_HOST__Group_1__0_in_rule__GIT_HOST__Group__1__Impl8637);
            rule__GIT_HOST__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIT_HOSTAccess().getGroup_1()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4226:1: ( ( rule__GIT_HOST__Group_1__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4227:1: ( rule__GIT_HOST__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIT_HOSTAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4228:1: ( rule__GIT_HOST__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==31) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4228:2: rule__GIT_HOST__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GIT_HOST__Group_1__0_in_rule__GIT_HOST__Group__1__Impl8649);
            	    rule__GIT_HOST__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIT_HOSTAccess().getGroup_1()); 
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
    // $ANTLR end "rule__GIT_HOST__Group__1__Impl"


    // $ANTLR start "rule__GIT_HOST__Group_1__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4243:1: rule__GIT_HOST__Group_1__0 : rule__GIT_HOST__Group_1__0__Impl rule__GIT_HOST__Group_1__1 ;
    public final void rule__GIT_HOST__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4247:1: ( rule__GIT_HOST__Group_1__0__Impl rule__GIT_HOST__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4248:2: rule__GIT_HOST__Group_1__0__Impl rule__GIT_HOST__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GIT_HOST__Group_1__0__Impl_in_rule__GIT_HOST__Group_1__08686);
            rule__GIT_HOST__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GIT_HOST__Group_1__1_in_rule__GIT_HOST__Group_1__08689);
            rule__GIT_HOST__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIT_HOST__Group_1__0"


    // $ANTLR start "rule__GIT_HOST__Group_1__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4255:1: rule__GIT_HOST__Group_1__0__Impl : ( '.' ) ;
    public final void rule__GIT_HOST__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4259:1: ( ( '.' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4260:1: ( '.' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4260:1: ( '.' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4261:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIT_HOSTAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__GIT_HOST__Group_1__0__Impl8717); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIT_HOSTAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIT_HOST__Group_1__0__Impl"


    // $ANTLR start "rule__GIT_HOST__Group_1__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4274:1: rule__GIT_HOST__Group_1__1 : rule__GIT_HOST__Group_1__1__Impl ;
    public final void rule__GIT_HOST__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4278:1: ( rule__GIT_HOST__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4279:2: rule__GIT_HOST__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GIT_HOST__Group_1__1__Impl_in_rule__GIT_HOST__Group_1__18748);
            rule__GIT_HOST__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIT_HOST__Group_1__1"


    // $ANTLR start "rule__GIT_HOST__Group_1__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4285:1: rule__GIT_HOST__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__GIT_HOST__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4289:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4290:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4290:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4291:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIT_HOSTAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GIT_HOST__Group_1__1__Impl8775); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIT_HOSTAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIT_HOST__Group_1__1__Impl"


    // $ANTLR start "rule__GitContentRef__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4306:1: rule__GitContentRef__Group__0 : rule__GitContentRef__Group__0__Impl rule__GitContentRef__Group__1 ;
    public final void rule__GitContentRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4310:1: ( rule__GitContentRef__Group__0__Impl rule__GitContentRef__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4311:2: rule__GitContentRef__Group__0__Impl rule__GitContentRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__0__Impl_in_rule__GitContentRef__Group__08808);
            rule__GitContentRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__1_in_rule__GitContentRef__Group__08811);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4318:1: rule__GitContentRef__Group__0__Impl : ( 'git' ) ;
    public final void rule__GitContentRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4322:1: ( ( 'git' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4323:1: ( 'git' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4323:1: ( 'git' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4324:1: 'git'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getGitKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__GitContentRef__Group__0__Impl8839); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4337:1: rule__GitContentRef__Group__1 : rule__GitContentRef__Group__1__Impl rule__GitContentRef__Group__2 ;
    public final void rule__GitContentRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4341:1: ( rule__GitContentRef__Group__1__Impl rule__GitContentRef__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4342:2: rule__GitContentRef__Group__1__Impl rule__GitContentRef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__1__Impl_in_rule__GitContentRef__Group__18870);
            rule__GitContentRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__2_in_rule__GitContentRef__Group__18873);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4349:1: rule__GitContentRef__Group__1__Impl : ( '@' ) ;
    public final void rule__GitContentRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4353:1: ( ( '@' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4354:1: ( '@' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4354:1: ( '@' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4355:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getCommercialAtKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__GitContentRef__Group__1__Impl8901); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4368:1: rule__GitContentRef__Group__2 : rule__GitContentRef__Group__2__Impl rule__GitContentRef__Group__3 ;
    public final void rule__GitContentRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4372:1: ( rule__GitContentRef__Group__2__Impl rule__GitContentRef__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4373:2: rule__GitContentRef__Group__2__Impl rule__GitContentRef__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__2__Impl_in_rule__GitContentRef__Group__28932);
            rule__GitContentRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__3_in_rule__GitContentRef__Group__28935);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4380:1: rule__GitContentRef__Group__2__Impl : ( ( rule__GitContentRef__Alternatives_2 ) ) ;
    public final void rule__GitContentRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4384:1: ( ( ( rule__GitContentRef__Alternatives_2 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4385:1: ( ( rule__GitContentRef__Alternatives_2 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4385:1: ( ( rule__GitContentRef__Alternatives_2 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4386:1: ( rule__GitContentRef__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getAlternatives_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4387:1: ( rule__GitContentRef__Alternatives_2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4387:2: rule__GitContentRef__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Alternatives_2_in_rule__GitContentRef__Group__2__Impl8962);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4397:1: rule__GitContentRef__Group__3 : rule__GitContentRef__Group__3__Impl rule__GitContentRef__Group__4 ;
    public final void rule__GitContentRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4401:1: ( rule__GitContentRef__Group__3__Impl rule__GitContentRef__Group__4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4402:2: rule__GitContentRef__Group__3__Impl rule__GitContentRef__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__3__Impl_in_rule__GitContentRef__Group__38992);
            rule__GitContentRef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__4_in_rule__GitContentRef__Group__38995);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4409:1: rule__GitContentRef__Group__3__Impl : ( '/' ) ;
    public final void rule__GitContentRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4413:1: ( ( '/' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4414:1: ( '/' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4414:1: ( '/' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4415:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getSolidusKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__GitContentRef__Group__3__Impl9023); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4428:1: rule__GitContentRef__Group__4 : rule__GitContentRef__Group__4__Impl rule__GitContentRef__Group__5 ;
    public final void rule__GitContentRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4432:1: ( rule__GitContentRef__Group__4__Impl rule__GitContentRef__Group__5 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4433:2: rule__GitContentRef__Group__4__Impl rule__GitContentRef__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__4__Impl_in_rule__GitContentRef__Group__49054);
            rule__GitContentRef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__5_in_rule__GitContentRef__Group__49057);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4440:1: rule__GitContentRef__Group__4__Impl : ( ( rule__GitContentRef__RepoAssignment_4 ) ) ;
    public final void rule__GitContentRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4444:1: ( ( ( rule__GitContentRef__RepoAssignment_4 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4445:1: ( ( rule__GitContentRef__RepoAssignment_4 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4445:1: ( ( rule__GitContentRef__RepoAssignment_4 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4446:1: ( rule__GitContentRef__RepoAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getRepoAssignment_4()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4447:1: ( rule__GitContentRef__RepoAssignment_4 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4447:2: rule__GitContentRef__RepoAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__RepoAssignment_4_in_rule__GitContentRef__Group__4__Impl9084);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4457:1: rule__GitContentRef__Group__5 : rule__GitContentRef__Group__5__Impl ;
    public final void rule__GitContentRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4461:1: ( rule__GitContentRef__Group__5__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4462:2: rule__GitContentRef__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group__5__Impl_in_rule__GitContentRef__Group__59114);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4468:1: rule__GitContentRef__Group__5__Impl : ( ( rule__GitContentRef__PathAssignment_5 )? ) ;
    public final void rule__GitContentRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4472:1: ( ( ( rule__GitContentRef__PathAssignment_5 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4473:1: ( ( rule__GitContentRef__PathAssignment_5 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4473:1: ( ( rule__GitContentRef__PathAssignment_5 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4474:1: ( rule__GitContentRef__PathAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getPathAssignment_5()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4475:1: ( rule__GitContentRef__PathAssignment_5 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==27) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4475:2: rule__GitContentRef__PathAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__PathAssignment_5_in_rule__GitContentRef__Group__5__Impl9141);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4497:1: rule__GitContentRef__Group_2_0__0 : rule__GitContentRef__Group_2_0__0__Impl rule__GitContentRef__Group_2_0__1 ;
    public final void rule__GitContentRef__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4501:1: ( rule__GitContentRef__Group_2_0__0__Impl rule__GitContentRef__Group_2_0__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4502:2: rule__GitContentRef__Group_2_0__0__Impl rule__GitContentRef__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0__0__Impl_in_rule__GitContentRef__Group_2_0__09184);
            rule__GitContentRef__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0__1_in_rule__GitContentRef__Group_2_0__09187);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4509:1: rule__GitContentRef__Group_2_0__0__Impl : ( ( rule__GitContentRef__HostAssignment_2_0_0 ) ) ;
    public final void rule__GitContentRef__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4513:1: ( ( ( rule__GitContentRef__HostAssignment_2_0_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4514:1: ( ( rule__GitContentRef__HostAssignment_2_0_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4514:1: ( ( rule__GitContentRef__HostAssignment_2_0_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4515:1: ( rule__GitContentRef__HostAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getHostAssignment_2_0_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4516:1: ( rule__GitContentRef__HostAssignment_2_0_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4516:2: rule__GitContentRef__HostAssignment_2_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__HostAssignment_2_0_0_in_rule__GitContentRef__Group_2_0__0__Impl9214);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4526:1: rule__GitContentRef__Group_2_0__1 : rule__GitContentRef__Group_2_0__1__Impl ;
    public final void rule__GitContentRef__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4530:1: ( rule__GitContentRef__Group_2_0__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4531:2: rule__GitContentRef__Group_2_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0__1__Impl_in_rule__GitContentRef__Group_2_0__19244);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4537:1: rule__GitContentRef__Group_2_0__1__Impl : ( ( rule__GitContentRef__Group_2_0_1__0 )? ) ;
    public final void rule__GitContentRef__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4541:1: ( ( ( rule__GitContentRef__Group_2_0_1__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4542:1: ( ( rule__GitContentRef__Group_2_0_1__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4542:1: ( ( rule__GitContentRef__Group_2_0_1__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4543:1: ( rule__GitContentRef__Group_2_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getGroup_2_0_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4544:1: ( rule__GitContentRef__Group_2_0_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==36) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4544:2: rule__GitContentRef__Group_2_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0_1__0_in_rule__GitContentRef__Group_2_0__1__Impl9271);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4558:1: rule__GitContentRef__Group_2_0_1__0 : rule__GitContentRef__Group_2_0_1__0__Impl rule__GitContentRef__Group_2_0_1__1 ;
    public final void rule__GitContentRef__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4562:1: ( rule__GitContentRef__Group_2_0_1__0__Impl rule__GitContentRef__Group_2_0_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4563:2: rule__GitContentRef__Group_2_0_1__0__Impl rule__GitContentRef__Group_2_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0_1__0__Impl_in_rule__GitContentRef__Group_2_0_1__09306);
            rule__GitContentRef__Group_2_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0_1__1_in_rule__GitContentRef__Group_2_0_1__09309);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4570:1: rule__GitContentRef__Group_2_0_1__0__Impl : ( ':' ) ;
    public final void rule__GitContentRef__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4574:1: ( ( ':' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4575:1: ( ':' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4575:1: ( ':' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4576:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getColonKeyword_2_0_1_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__GitContentRef__Group_2_0_1__0__Impl9337); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4589:1: rule__GitContentRef__Group_2_0_1__1 : rule__GitContentRef__Group_2_0_1__1__Impl ;
    public final void rule__GitContentRef__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4593:1: ( rule__GitContentRef__Group_2_0_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4594:2: rule__GitContentRef__Group_2_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__Group_2_0_1__1__Impl_in_rule__GitContentRef__Group_2_0_1__19368);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4600:1: rule__GitContentRef__Group_2_0_1__1__Impl : ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) ) ;
    public final void rule__GitContentRef__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4604:1: ( ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4605:1: ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4605:1: ( ( rule__GitContentRef__OwnerAssignment_2_0_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4606:1: ( rule__GitContentRef__OwnerAssignment_2_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getOwnerAssignment_2_0_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4607:1: ( rule__GitContentRef__OwnerAssignment_2_0_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4607:2: rule__GitContentRef__OwnerAssignment_2_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GitContentRef__OwnerAssignment_2_0_1_1_in_rule__GitContentRef__Group_2_0_1__1__Impl9395);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4621:1: rule__DotClasspathFileContentProvider__Group__0 : rule__DotClasspathFileContentProvider__Group__0__Impl rule__DotClasspathFileContentProvider__Group__1 ;
    public final void rule__DotClasspathFileContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4625:1: ( rule__DotClasspathFileContentProvider__Group__0__Impl rule__DotClasspathFileContentProvider__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4626:2: rule__DotClasspathFileContentProvider__Group__0__Impl rule__DotClasspathFileContentProvider__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__0__Impl_in_rule__DotClasspathFileContentProvider__Group__09429);
            rule__DotClasspathFileContentProvider__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__1_in_rule__DotClasspathFileContentProvider__Group__09432);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4633:1: rule__DotClasspathFileContentProvider__Group__0__Impl : ( 'dot.classpath' ) ;
    public final void rule__DotClasspathFileContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4637:1: ( ( 'dot.classpath' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4638:1: ( 'dot.classpath' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4638:1: ( 'dot.classpath' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4639:1: 'dot.classpath'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getDotClasspathKeyword_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__DotClasspathFileContentProvider__Group__0__Impl9460); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4652:1: rule__DotClasspathFileContentProvider__Group__1 : rule__DotClasspathFileContentProvider__Group__1__Impl rule__DotClasspathFileContentProvider__Group__2 ;
    public final void rule__DotClasspathFileContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4656:1: ( rule__DotClasspathFileContentProvider__Group__1__Impl rule__DotClasspathFileContentProvider__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4657:2: rule__DotClasspathFileContentProvider__Group__1__Impl rule__DotClasspathFileContentProvider__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__1__Impl_in_rule__DotClasspathFileContentProvider__Group__19491);
            rule__DotClasspathFileContentProvider__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__2_in_rule__DotClasspathFileContentProvider__Group__19494);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4664:1: rule__DotClasspathFileContentProvider__Group__1__Impl : ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) ) ;
    public final void rule__DotClasspathFileContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4668:1: ( ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4669:1: ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4669:1: ( ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4670:1: ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) ) ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4670:1: ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4671:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAssignment_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4672:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4672:2: rule__DotClasspathFileContentProvider__EntriesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__EntriesAssignment_1_in_rule__DotClasspathFileContentProvider__Group__1__Impl9523);
            rule__DotClasspathFileContentProvider__EntriesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAssignment_1()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4675:1: ( ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4676:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAssignment_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4677:1: ( rule__DotClasspathFileContentProvider__EntriesAssignment_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=23 && LA49_0<=26)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4677:2: rule__DotClasspathFileContentProvider__EntriesAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__EntriesAssignment_1_in_rule__DotClasspathFileContentProvider__Group__1__Impl9535);
            	    rule__DotClasspathFileContentProvider__EntriesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4688:1: rule__DotClasspathFileContentProvider__Group__2 : rule__DotClasspathFileContentProvider__Group__2__Impl ;
    public final void rule__DotClasspathFileContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4692:1: ( rule__DotClasspathFileContentProvider__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4693:2: rule__DotClasspathFileContentProvider__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotClasspathFileContentProvider__Group__2__Impl_in_rule__DotClasspathFileContentProvider__Group__29568);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4699:1: rule__DotClasspathFileContentProvider__Group__2__Impl : ( ';' ) ;
    public final void rule__DotClasspathFileContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4703:1: ( ( ';' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4704:1: ( ';' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4704:1: ( ';' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4705:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getSemicolonKeyword_2()); 
            }
            match(input,8,FollowSets000.FOLLOW_8_in_rule__DotClasspathFileContentProvider__Group__2__Impl9596); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4724:1: rule__CLASSPATH_ENTRY_PATH__Group__0 : rule__CLASSPATH_ENTRY_PATH__Group__0__Impl rule__CLASSPATH_ENTRY_PATH__Group__1 ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4728:1: ( rule__CLASSPATH_ENTRY_PATH__Group__0__Impl rule__CLASSPATH_ENTRY_PATH__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4729:2: rule__CLASSPATH_ENTRY_PATH__Group__0__Impl rule__CLASSPATH_ENTRY_PATH__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__0__Impl_in_rule__CLASSPATH_ENTRY_PATH__Group__09633);
            rule__CLASSPATH_ENTRY_PATH__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__1_in_rule__CLASSPATH_ENTRY_PATH__Group__09636);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4736:1: rule__CLASSPATH_ENTRY_PATH__Group__0__Impl : ( ( ruleFolderName )* ) ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4740:1: ( ( ( ruleFolderName )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4741:1: ( ( ruleFolderName )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4741:1: ( ( ruleFolderName )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4742:1: ( ruleFolderName )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFolderNameParserRuleCall_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4743:1: ( ruleFolderName )*
            loop50:
            do {
                int alt50=2;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4743:3: ruleFolderName
            	    {
            	    pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_rule__CLASSPATH_ENTRY_PATH__Group__0__Impl9664);
            	    ruleFolderName();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4753:1: rule__CLASSPATH_ENTRY_PATH__Group__1 : rule__CLASSPATH_ENTRY_PATH__Group__1__Impl ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4757:1: ( rule__CLASSPATH_ENTRY_PATH__Group__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4758:2: rule__CLASSPATH_ENTRY_PATH__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__1__Impl_in_rule__CLASSPATH_ENTRY_PATH__Group__19695);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4764:1: rule__CLASSPATH_ENTRY_PATH__Group__1__Impl : ( ruleFileName ) ;
    public final void rule__CLASSPATH_ENTRY_PATH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4768:1: ( ( ruleFileName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4769:1: ( ruleFileName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4769:1: ( ruleFileName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4770:1: ruleFileName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFileNameParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_rule__CLASSPATH_ENTRY_PATH__Group__1__Impl9722);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4785:1: rule__ClasspathEntry__Group__0 : rule__ClasspathEntry__Group__0__Impl rule__ClasspathEntry__Group__1 ;
    public final void rule__ClasspathEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4789:1: ( rule__ClasspathEntry__Group__0__Impl rule__ClasspathEntry__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4790:2: rule__ClasspathEntry__Group__0__Impl rule__ClasspathEntry__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__0__Impl_in_rule__ClasspathEntry__Group__09755);
            rule__ClasspathEntry__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__1_in_rule__ClasspathEntry__Group__09758);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4797:1: rule__ClasspathEntry__Group__0__Impl : ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) ) ;
    public final void rule__ClasspathEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4801:1: ( ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4802:1: ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4802:1: ( ( rule__ClasspathEntry__ExplicitKindAssignment_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4803:1: ( rule__ClasspathEntry__ExplicitKindAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitKindAssignment_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4804:1: ( rule__ClasspathEntry__ExplicitKindAssignment_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4804:2: rule__ClasspathEntry__ExplicitKindAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__ExplicitKindAssignment_0_in_rule__ClasspathEntry__Group__0__Impl9785);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4814:1: rule__ClasspathEntry__Group__1 : rule__ClasspathEntry__Group__1__Impl rule__ClasspathEntry__Group__2 ;
    public final void rule__ClasspathEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4818:1: ( rule__ClasspathEntry__Group__1__Impl rule__ClasspathEntry__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4819:2: rule__ClasspathEntry__Group__1__Impl rule__ClasspathEntry__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__1__Impl_in_rule__ClasspathEntry__Group__19815);
            rule__ClasspathEntry__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__2_in_rule__ClasspathEntry__Group__19818);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4826:1: rule__ClasspathEntry__Group__1__Impl : ( ( rule__ClasspathEntry__ExplicitPathAssignment_1 ) ) ;
    public final void rule__ClasspathEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4830:1: ( ( ( rule__ClasspathEntry__ExplicitPathAssignment_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4831:1: ( ( rule__ClasspathEntry__ExplicitPathAssignment_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4831:1: ( ( rule__ClasspathEntry__ExplicitPathAssignment_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4832:1: ( rule__ClasspathEntry__ExplicitPathAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitPathAssignment_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4833:1: ( rule__ClasspathEntry__ExplicitPathAssignment_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4833:2: rule__ClasspathEntry__ExplicitPathAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__ExplicitPathAssignment_1_in_rule__ClasspathEntry__Group__1__Impl9845);
            rule__ClasspathEntry__ExplicitPathAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getExplicitPathAssignment_1()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4843:1: rule__ClasspathEntry__Group__2 : rule__ClasspathEntry__Group__2__Impl ;
    public final void rule__ClasspathEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4847:1: ( rule__ClasspathEntry__Group__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4848:2: rule__ClasspathEntry__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group__2__Impl_in_rule__ClasspathEntry__Group__29875);
            rule__ClasspathEntry__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4854:1: rule__ClasspathEntry__Group__2__Impl : ( ( rule__ClasspathEntry__Group_2__0 )? ) ;
    public final void rule__ClasspathEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4858:1: ( ( ( rule__ClasspathEntry__Group_2__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4859:1: ( ( rule__ClasspathEntry__Group_2__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4859:1: ( ( rule__ClasspathEntry__Group_2__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4860:1: ( rule__ClasspathEntry__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4861:1: ( rule__ClasspathEntry__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==42) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4861:2: rule__ClasspathEntry__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2__0_in_rule__ClasspathEntry__Group__2__Impl9902);
                    rule__ClasspathEntry__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getGroup_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ClasspathEntry__Group_2__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4877:1: rule__ClasspathEntry__Group_2__0 : rule__ClasspathEntry__Group_2__0__Impl rule__ClasspathEntry__Group_2__1 ;
    public final void rule__ClasspathEntry__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4881:1: ( rule__ClasspathEntry__Group_2__0__Impl rule__ClasspathEntry__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4882:2: rule__ClasspathEntry__Group_2__0__Impl rule__ClasspathEntry__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2__0__Impl_in_rule__ClasspathEntry__Group_2__09939);
            rule__ClasspathEntry__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2__1_in_rule__ClasspathEntry__Group_2__09942);
            rule__ClasspathEntry__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2__0"


    // $ANTLR start "rule__ClasspathEntry__Group_2__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4889:1: rule__ClasspathEntry__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ClasspathEntry__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4893:1: ( ( '(' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4894:1: ( '(' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4894:1: ( '(' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4895:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ClasspathEntry__Group_2__0__Impl9970); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2__0__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_2__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4908:1: rule__ClasspathEntry__Group_2__1 : rule__ClasspathEntry__Group_2__1__Impl rule__ClasspathEntry__Group_2__2 ;
    public final void rule__ClasspathEntry__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4912:1: ( rule__ClasspathEntry__Group_2__1__Impl rule__ClasspathEntry__Group_2__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4913:2: rule__ClasspathEntry__Group_2__1__Impl rule__ClasspathEntry__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2__1__Impl_in_rule__ClasspathEntry__Group_2__110001);
            rule__ClasspathEntry__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2__2_in_rule__ClasspathEntry__Group_2__110004);
            rule__ClasspathEntry__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2__1"


    // $ANTLR start "rule__ClasspathEntry__Group_2__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4920:1: rule__ClasspathEntry__Group_2__1__Impl : ( ( rule__ClasspathEntry__MajorAssignment_2_1 ) ) ;
    public final void rule__ClasspathEntry__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4924:1: ( ( ( rule__ClasspathEntry__MajorAssignment_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4925:1: ( ( rule__ClasspathEntry__MajorAssignment_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4925:1: ( ( rule__ClasspathEntry__MajorAssignment_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4926:1: ( rule__ClasspathEntry__MajorAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMajorAssignment_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4927:1: ( rule__ClasspathEntry__MajorAssignment_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4927:2: rule__ClasspathEntry__MajorAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__MajorAssignment_2_1_in_rule__ClasspathEntry__Group_2__1__Impl10031);
            rule__ClasspathEntry__MajorAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getMajorAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2__1__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_2__2"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4937:1: rule__ClasspathEntry__Group_2__2 : rule__ClasspathEntry__Group_2__2__Impl rule__ClasspathEntry__Group_2__3 ;
    public final void rule__ClasspathEntry__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4941:1: ( rule__ClasspathEntry__Group_2__2__Impl rule__ClasspathEntry__Group_2__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4942:2: rule__ClasspathEntry__Group_2__2__Impl rule__ClasspathEntry__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2__2__Impl_in_rule__ClasspathEntry__Group_2__210061);
            rule__ClasspathEntry__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2__3_in_rule__ClasspathEntry__Group_2__210064);
            rule__ClasspathEntry__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2__2"


    // $ANTLR start "rule__ClasspathEntry__Group_2__2__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4949:1: rule__ClasspathEntry__Group_2__2__Impl : ( ( rule__ClasspathEntry__Group_2_2__0 )? ) ;
    public final void rule__ClasspathEntry__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4953:1: ( ( ( rule__ClasspathEntry__Group_2_2__0 )? ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4954:1: ( ( rule__ClasspathEntry__Group_2_2__0 )? )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4954:1: ( ( rule__ClasspathEntry__Group_2_2__0 )? )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4955:1: ( rule__ClasspathEntry__Group_2_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getGroup_2_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4956:1: ( rule__ClasspathEntry__Group_2_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==31) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4956:2: rule__ClasspathEntry__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2_2__0_in_rule__ClasspathEntry__Group_2__2__Impl10091);
                    rule__ClasspathEntry__Group_2_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2__2__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_2__3"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4966:1: rule__ClasspathEntry__Group_2__3 : rule__ClasspathEntry__Group_2__3__Impl ;
    public final void rule__ClasspathEntry__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4970:1: ( rule__ClasspathEntry__Group_2__3__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4971:2: rule__ClasspathEntry__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2__3__Impl_in_rule__ClasspathEntry__Group_2__310122);
            rule__ClasspathEntry__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2__3"


    // $ANTLR start "rule__ClasspathEntry__Group_2__3__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4977:1: rule__ClasspathEntry__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ClasspathEntry__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4981:1: ( ( ')' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4982:1: ( ')' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4982:1: ( ')' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:4983:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,43,FollowSets000.FOLLOW_43_in_rule__ClasspathEntry__Group_2__3__Impl10150); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2__3__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_2_2__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5004:1: rule__ClasspathEntry__Group_2_2__0 : rule__ClasspathEntry__Group_2_2__0__Impl rule__ClasspathEntry__Group_2_2__1 ;
    public final void rule__ClasspathEntry__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5008:1: ( rule__ClasspathEntry__Group_2_2__0__Impl rule__ClasspathEntry__Group_2_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5009:2: rule__ClasspathEntry__Group_2_2__0__Impl rule__ClasspathEntry__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2_2__0__Impl_in_rule__ClasspathEntry__Group_2_2__010189);
            rule__ClasspathEntry__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2_2__1_in_rule__ClasspathEntry__Group_2_2__010192);
            rule__ClasspathEntry__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2_2__0"


    // $ANTLR start "rule__ClasspathEntry__Group_2_2__0__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5016:1: rule__ClasspathEntry__Group_2_2__0__Impl : ( '.' ) ;
    public final void rule__ClasspathEntry__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5020:1: ( ( '.' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5021:1: ( '.' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5021:1: ( '.' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5022:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getFullStopKeyword_2_2_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ClasspathEntry__Group_2_2__0__Impl10220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getFullStopKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2_2__0__Impl"


    // $ANTLR start "rule__ClasspathEntry__Group_2_2__1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5035:1: rule__ClasspathEntry__Group_2_2__1 : rule__ClasspathEntry__Group_2_2__1__Impl ;
    public final void rule__ClasspathEntry__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5039:1: ( rule__ClasspathEntry__Group_2_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5040:2: rule__ClasspathEntry__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__Group_2_2__1__Impl_in_rule__ClasspathEntry__Group_2_2__110251);
            rule__ClasspathEntry__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2_2__1"


    // $ANTLR start "rule__ClasspathEntry__Group_2_2__1__Impl"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5046:1: rule__ClasspathEntry__Group_2_2__1__Impl : ( ( rule__ClasspathEntry__MinorAssignment_2_2_1 ) ) ;
    public final void rule__ClasspathEntry__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5050:1: ( ( ( rule__ClasspathEntry__MinorAssignment_2_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5051:1: ( ( rule__ClasspathEntry__MinorAssignment_2_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5051:1: ( ( rule__ClasspathEntry__MinorAssignment_2_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5052:1: ( rule__ClasspathEntry__MinorAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMinorAssignment_2_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5053:1: ( rule__ClasspathEntry__MinorAssignment_2_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5053:2: rule__ClasspathEntry__MinorAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ClasspathEntry__MinorAssignment_2_2_1_in_rule__ClasspathEntry__Group_2_2__1__Impl10278);
            rule__ClasspathEntry__MinorAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getMinorAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__Group_2_2__1__Impl"


    // $ANTLR start "rule__DotProjectFileContentProvider__Group__0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5067:1: rule__DotProjectFileContentProvider__Group__0 : rule__DotProjectFileContentProvider__Group__0__Impl rule__DotProjectFileContentProvider__Group__1 ;
    public final void rule__DotProjectFileContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5071:1: ( rule__DotProjectFileContentProvider__Group__0__Impl rule__DotProjectFileContentProvider__Group__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5072:2: rule__DotProjectFileContentProvider__Group__0__Impl rule__DotProjectFileContentProvider__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__0__Impl_in_rule__DotProjectFileContentProvider__Group__010312);
            rule__DotProjectFileContentProvider__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__1_in_rule__DotProjectFileContentProvider__Group__010315);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5079:1: rule__DotProjectFileContentProvider__Group__0__Impl : ( 'dot.project' ) ;
    public final void rule__DotProjectFileContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5083:1: ( ( 'dot.project' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5084:1: ( 'dot.project' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5084:1: ( 'dot.project' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5085:1: 'dot.project'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getDotProjectKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_44_in_rule__DotProjectFileContentProvider__Group__0__Impl10343); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5098:1: rule__DotProjectFileContentProvider__Group__1 : rule__DotProjectFileContentProvider__Group__1__Impl rule__DotProjectFileContentProvider__Group__2 ;
    public final void rule__DotProjectFileContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5102:1: ( rule__DotProjectFileContentProvider__Group__1__Impl rule__DotProjectFileContentProvider__Group__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5103:2: rule__DotProjectFileContentProvider__Group__1__Impl rule__DotProjectFileContentProvider__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__1__Impl_in_rule__DotProjectFileContentProvider__Group__110374);
            rule__DotProjectFileContentProvider__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__2_in_rule__DotProjectFileContentProvider__Group__110377);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5110:1: rule__DotProjectFileContentProvider__Group__1__Impl : ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) ) ;
    public final void rule__DotProjectFileContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5114:1: ( ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5115:1: ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5115:1: ( ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5116:1: ( ( rule__DotProjectFileContentProvider__Group_1__0 ) ) ( ( rule__DotProjectFileContentProvider__Group_1__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5116:1: ( ( rule__DotProjectFileContentProvider__Group_1__0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5117:1: ( rule__DotProjectFileContentProvider__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5118:1: ( rule__DotProjectFileContentProvider__Group_1__0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5118:2: rule__DotProjectFileContentProvider__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_1__0_in_rule__DotProjectFileContentProvider__Group__1__Impl10406);
            rule__DotProjectFileContentProvider__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_1()); 
            }

            }

            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5121:1: ( ( rule__DotProjectFileContentProvider__Group_1__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5122:1: ( rule__DotProjectFileContentProvider__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5123:1: ( rule__DotProjectFileContentProvider__Group_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==29) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5123:2: rule__DotProjectFileContentProvider__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_1__0_in_rule__DotProjectFileContentProvider__Group__1__Impl10418);
            	    rule__DotProjectFileContentProvider__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5134:1: rule__DotProjectFileContentProvider__Group__2 : rule__DotProjectFileContentProvider__Group__2__Impl rule__DotProjectFileContentProvider__Group__3 ;
    public final void rule__DotProjectFileContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5138:1: ( rule__DotProjectFileContentProvider__Group__2__Impl rule__DotProjectFileContentProvider__Group__3 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5139:2: rule__DotProjectFileContentProvider__Group__2__Impl rule__DotProjectFileContentProvider__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__2__Impl_in_rule__DotProjectFileContentProvider__Group__210451);
            rule__DotProjectFileContentProvider__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__3_in_rule__DotProjectFileContentProvider__Group__210454);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5146:1: rule__DotProjectFileContentProvider__Group__2__Impl : ( ( rule__DotProjectFileContentProvider__Group_2__0 )* ) ;
    public final void rule__DotProjectFileContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5150:1: ( ( ( rule__DotProjectFileContentProvider__Group_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5151:1: ( ( rule__DotProjectFileContentProvider__Group_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5151:1: ( ( rule__DotProjectFileContentProvider__Group_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5152:1: ( rule__DotProjectFileContentProvider__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5153:1: ( rule__DotProjectFileContentProvider__Group_2__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==35) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5153:2: rule__DotProjectFileContentProvider__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__0_in_rule__DotProjectFileContentProvider__Group__2__Impl10481);
            	    rule__DotProjectFileContentProvider__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5163:1: rule__DotProjectFileContentProvider__Group__3 : rule__DotProjectFileContentProvider__Group__3__Impl ;
    public final void rule__DotProjectFileContentProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5167:1: ( rule__DotProjectFileContentProvider__Group__3__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5168:2: rule__DotProjectFileContentProvider__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group__3__Impl_in_rule__DotProjectFileContentProvider__Group__310512);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5174:1: rule__DotProjectFileContentProvider__Group__3__Impl : ( ';' ) ;
    public final void rule__DotProjectFileContentProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5178:1: ( ( ';' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5179:1: ( ';' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5179:1: ( ';' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5180:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getSemicolonKeyword_3()); 
            }
            match(input,8,FollowSets000.FOLLOW_8_in_rule__DotProjectFileContentProvider__Group__3__Impl10540); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5201:1: rule__DotProjectFileContentProvider__Group_1__0 : rule__DotProjectFileContentProvider__Group_1__0__Impl rule__DotProjectFileContentProvider__Group_1__1 ;
    public final void rule__DotProjectFileContentProvider__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5205:1: ( rule__DotProjectFileContentProvider__Group_1__0__Impl rule__DotProjectFileContentProvider__Group_1__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5206:2: rule__DotProjectFileContentProvider__Group_1__0__Impl rule__DotProjectFileContentProvider__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_1__0__Impl_in_rule__DotProjectFileContentProvider__Group_1__010579);
            rule__DotProjectFileContentProvider__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_1__1_in_rule__DotProjectFileContentProvider__Group_1__010582);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5213:1: rule__DotProjectFileContentProvider__Group_1__0__Impl : ( '#' ) ;
    public final void rule__DotProjectFileContentProvider__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5217:1: ( ( '#' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5218:1: ( '#' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5218:1: ( '#' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5219:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getNumberSignKeyword_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__DotProjectFileContentProvider__Group_1__0__Impl10610); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5232:1: rule__DotProjectFileContentProvider__Group_1__1 : rule__DotProjectFileContentProvider__Group_1__1__Impl ;
    public final void rule__DotProjectFileContentProvider__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5236:1: ( rule__DotProjectFileContentProvider__Group_1__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5237:2: rule__DotProjectFileContentProvider__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_1__1__Impl_in_rule__DotProjectFileContentProvider__Group_1__110641);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5243:1: rule__DotProjectFileContentProvider__Group_1__1__Impl : ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) ) ;
    public final void rule__DotProjectFileContentProvider__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5247:1: ( ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5248:1: ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5248:1: ( ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5249:1: ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysAssignment_1_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5250:1: ( rule__DotProjectFileContentProvider__KeysAssignment_1_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5250:2: rule__DotProjectFileContentProvider__KeysAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__KeysAssignment_1_1_in_rule__DotProjectFileContentProvider__Group_1__1__Impl10668);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5264:1: rule__DotProjectFileContentProvider__Group_2__0 : rule__DotProjectFileContentProvider__Group_2__0__Impl rule__DotProjectFileContentProvider__Group_2__1 ;
    public final void rule__DotProjectFileContentProvider__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5268:1: ( rule__DotProjectFileContentProvider__Group_2__0__Impl rule__DotProjectFileContentProvider__Group_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5269:2: rule__DotProjectFileContentProvider__Group_2__0__Impl rule__DotProjectFileContentProvider__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__0__Impl_in_rule__DotProjectFileContentProvider__Group_2__010702);
            rule__DotProjectFileContentProvider__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__1_in_rule__DotProjectFileContentProvider__Group_2__010705);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5276:1: rule__DotProjectFileContentProvider__Group_2__0__Impl : ( '@' ) ;
    public final void rule__DotProjectFileContentProvider__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5280:1: ( ( '@' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5281:1: ( '@' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5281:1: ( '@' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5282:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getCommercialAtKeyword_2_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__DotProjectFileContentProvider__Group_2__0__Impl10733); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5295:1: rule__DotProjectFileContentProvider__Group_2__1 : rule__DotProjectFileContentProvider__Group_2__1__Impl rule__DotProjectFileContentProvider__Group_2__2 ;
    public final void rule__DotProjectFileContentProvider__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5299:1: ( rule__DotProjectFileContentProvider__Group_2__1__Impl rule__DotProjectFileContentProvider__Group_2__2 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5300:2: rule__DotProjectFileContentProvider__Group_2__1__Impl rule__DotProjectFileContentProvider__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__1__Impl_in_rule__DotProjectFileContentProvider__Group_2__110764);
            rule__DotProjectFileContentProvider__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__2_in_rule__DotProjectFileContentProvider__Group_2__110767);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5307:1: rule__DotProjectFileContentProvider__Group_2__1__Impl : ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) ) ;
    public final void rule__DotProjectFileContentProvider__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5311:1: ( ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5312:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5312:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5313:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesAssignment_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5314:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5314:2: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1_in_rule__DotProjectFileContentProvider__Group_2__1__Impl10794);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5324:1: rule__DotProjectFileContentProvider__Group_2__2 : rule__DotProjectFileContentProvider__Group_2__2__Impl ;
    public final void rule__DotProjectFileContentProvider__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5328:1: ( rule__DotProjectFileContentProvider__Group_2__2__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5329:2: rule__DotProjectFileContentProvider__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2__2__Impl_in_rule__DotProjectFileContentProvider__Group_2__210824);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5335:1: rule__DotProjectFileContentProvider__Group_2__2__Impl : ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* ) ;
    public final void rule__DotProjectFileContentProvider__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5339:1: ( ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5340:1: ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5340:1: ( ( rule__DotProjectFileContentProvider__Group_2_2__0 )* )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5341:1: ( rule__DotProjectFileContentProvider__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getGroup_2_2()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5342:1: ( rule__DotProjectFileContentProvider__Group_2_2__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==32) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5342:2: rule__DotProjectFileContentProvider__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__0_in_rule__DotProjectFileContentProvider__Group_2__2__Impl10851);
            	    rule__DotProjectFileContentProvider__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5358:1: rule__DotProjectFileContentProvider__Group_2_2__0 : rule__DotProjectFileContentProvider__Group_2_2__0__Impl rule__DotProjectFileContentProvider__Group_2_2__1 ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5362:1: ( rule__DotProjectFileContentProvider__Group_2_2__0__Impl rule__DotProjectFileContentProvider__Group_2_2__1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5363:2: rule__DotProjectFileContentProvider__Group_2_2__0__Impl rule__DotProjectFileContentProvider__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__0__Impl_in_rule__DotProjectFileContentProvider__Group_2_2__010888);
            rule__DotProjectFileContentProvider__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__1_in_rule__DotProjectFileContentProvider__Group_2_2__010891);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5370:1: rule__DotProjectFileContentProvider__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5374:1: ( ( ',' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5375:1: ( ',' )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5375:1: ( ',' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5376:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__DotProjectFileContentProvider__Group_2_2__0__Impl10919); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5389:1: rule__DotProjectFileContentProvider__Group_2_2__1 : rule__DotProjectFileContentProvider__Group_2_2__1__Impl ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5393:1: ( rule__DotProjectFileContentProvider__Group_2_2__1__Impl )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5394:2: rule__DotProjectFileContentProvider__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__1__Impl_in_rule__DotProjectFileContentProvider__Group_2_2__110950);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5400:1: rule__DotProjectFileContentProvider__Group_2_2__1__Impl : ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) ) ;
    public final void rule__DotProjectFileContentProvider__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5404:1: ( ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5405:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5405:1: ( ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5406:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesAssignment_2_2_1()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5407:1: ( rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5407:2: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1_in_rule__DotProjectFileContentProvider__Group_2_2__1__Impl10977);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5422:1: rule__EmfsRoot__NameAssignment_1_1 : ( ruleEmfsName ) ;
    public final void rule__EmfsRoot__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5426:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5427:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5427:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5428:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getNameEmfsNameParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__EmfsRoot__NameAssignment_1_111016);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5437:1: rule__EmfsRoot__TagsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__EmfsRoot__TagsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5441:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5442:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5442:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5443:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getTagsIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmfsRoot__TagsAssignment_2_111047); if (state.failed) return ;
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


    // $ANTLR start "rule__EmfsRoot__ContentProviderAssignment_3_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5452:1: rule__EmfsRoot__ContentProviderAssignment_3_1 : ( ( rule__EmfsRoot__ContentProviderAlternatives_3_1_0 ) ) ;
    public final void rule__EmfsRoot__ContentProviderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5456:1: ( ( ( rule__EmfsRoot__ContentProviderAlternatives_3_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5457:1: ( ( rule__EmfsRoot__ContentProviderAlternatives_3_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5457:1: ( ( rule__EmfsRoot__ContentProviderAlternatives_3_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5458:1: ( rule__EmfsRoot__ContentProviderAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getContentProviderAlternatives_3_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5459:1: ( rule__EmfsRoot__ContentProviderAlternatives_3_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5459:2: rule__EmfsRoot__ContentProviderAlternatives_3_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsRoot__ContentProviderAlternatives_3_1_0_in_rule__EmfsRoot__ContentProviderAssignment_3_111078);
            rule__EmfsRoot__ContentProviderAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getContentProviderAlternatives_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__ContentProviderAssignment_3_1"


    // $ANTLR start "rule__EmfsRoot__ResourcesAssignment_5"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5468:1: rule__EmfsRoot__ResourcesAssignment_5 : ( ruleEmfsResource ) ;
    public final void rule__EmfsRoot__ResourcesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5472:1: ( ( ruleEmfsResource ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5473:1: ( ruleEmfsResource )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5473:1: ( ruleEmfsResource )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5474:1: ruleEmfsResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsRootAccess().getResourcesEmfsResourceParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_rule__EmfsRoot__ResourcesAssignment_511111);
            ruleEmfsResource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmfsRootAccess().getResourcesEmfsResourceParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmfsRoot__ResourcesAssignment_5"


    // $ANTLR start "rule__EmfsResourcesRef__ResourcesAssignment_0"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5483:1: rule__EmfsResourcesRef__ResourcesAssignment_0 : ( ( ruleEmfsName ) ) ;
    public final void rule__EmfsResourcesRef__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5487:1: ( ( ( ruleEmfsName ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5488:1: ( ( ruleEmfsName ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5488:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5489:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_0_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5490:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5491:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceEmfsNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__EmfsResourcesRef__ResourcesAssignment_011146);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5502:1: rule__EmfsResourcesRef__ResourcesAssignment_1_1 : ( ( ruleEmfsName ) ) ;
    public final void rule__EmfsResourcesRef__ResourcesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5506:1: ( ( ( ruleEmfsName ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5507:1: ( ( ruleEmfsName ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5507:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5508:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_1_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5509:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5510:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceEmfsNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__EmfsResourcesRef__ResourcesAssignment_1_111185);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5521:1: rule__Property__NameAssignment_1 : ( ruleEmfsName ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5525:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5526:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5526:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5527:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameEmfsNameParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__Property__NameAssignment_111220);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5536:1: rule__Property__ValueAssignment_3 : ( ( rule__Property__ValueAlternatives_3_0 ) ) ;
    public final void rule__Property__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5540:1: ( ( ( rule__Property__ValueAlternatives_3_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5541:1: ( ( rule__Property__ValueAlternatives_3_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5541:1: ( ( rule__Property__ValueAlternatives_3_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5542:1: ( rule__Property__ValueAlternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAlternatives_3_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5543:1: ( rule__Property__ValueAlternatives_3_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5543:2: rule__Property__ValueAlternatives_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__ValueAlternatives_3_0_in_rule__Property__ValueAssignment_311251);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5552:1: rule__EmfsContainer__NameAssignment_0 : ( ruleFolderName ) ;
    public final void rule__EmfsContainer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5556:1: ( ( ruleFolderName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5557:1: ( ruleFolderName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5557:1: ( ruleFolderName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5558:1: ruleFolderName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getNameFolderNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_rule__EmfsContainer__NameAssignment_011284);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5567:1: rule__EmfsContainer__TagsAssignment_1_1 : ( ruleEmfsName ) ;
    public final void rule__EmfsContainer__TagsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5571:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5572:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5572:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5573:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getTagsEmfsNameParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__EmfsContainer__TagsAssignment_1_111315);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5582:1: rule__EmfsContainer__PropertiesAssignment_2 : ( ruleProperty ) ;
    public final void rule__EmfsContainer__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5586:1: ( ( ruleProperty ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5587:1: ( ruleProperty )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5587:1: ( ruleProperty )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5588:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__EmfsContainer__PropertiesAssignment_211346);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5597:1: rule__EmfsContainer__ContentProviderAssignment_3_1 : ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) ) ;
    public final void rule__EmfsContainer__ContentProviderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5601:1: ( ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5602:1: ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5602:1: ( ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5603:1: ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getContentProviderAlternatives_3_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5604:1: ( rule__EmfsContainer__ContentProviderAlternatives_3_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5604:2: rule__EmfsContainer__ContentProviderAlternatives_3_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__ContentProviderAlternatives_3_1_0_in_rule__EmfsContainer__ContentProviderAssignment_3_111377);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5613:1: rule__EmfsContainer__ResourcesAssignment_4 : ( ruleEmfsResource ) ;
    public final void rule__EmfsContainer__ResourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5617:1: ( ( ruleEmfsResource ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5618:1: ( ruleEmfsResource )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5618:1: ( ruleEmfsResource )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5619:1: ruleEmfsResource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsContainerAccess().getResourcesEmfsResourceParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_rule__EmfsContainer__ResourcesAssignment_411410);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5628:1: rule__GitContentProvider__GitRefAssignment : ( ruleGitContentRef ) ;
    public final void rule__GitContentProvider__GitRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5632:1: ( ( ruleGitContentRef ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5633:1: ( ruleGitContentRef )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5633:1: ( ruleGitContentRef )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5634:1: ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_rule__GitContentProvider__GitRefAssignment11441);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5643:1: rule__EmfsFile__NameAssignment_0 : ( ruleFileName ) ;
    public final void rule__EmfsFile__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5647:1: ( ( ruleFileName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5648:1: ( ruleFileName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5648:1: ( ruleFileName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5649:1: ruleFileName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getNameFileNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_rule__EmfsFile__NameAssignment_011472);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5658:1: rule__EmfsFile__WriteableAssignment_1 : ( ( '*' ) ) ;
    public final void rule__EmfsFile__WriteableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5662:1: ( ( ( '*' ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5663:1: ( ( '*' ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5663:1: ( ( '*' ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5664:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getWriteableAsteriskKeyword_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5665:1: ( '*' )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5666:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getWriteableAsteriskKeyword_1_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_45_in_rule__EmfsFile__WriteableAssignment_111508); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5681:1: rule__EmfsFile__TagsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__EmfsFile__TagsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5685:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5686:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5686:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5687:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getTagsIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmfsFile__TagsAssignment_2_111547); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5696:1: rule__EmfsFile__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__EmfsFile__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5700:1: ( ( ruleProperty ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5701:1: ( ruleProperty )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5701:1: ( ruleProperty )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5702:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__EmfsFile__PropertiesAssignment_311578);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5711:1: rule__EmfsFile__ContentProviderAssignment_4_0_1 : ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) ) ;
    public final void rule__EmfsFile__ContentProviderAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5715:1: ( ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5716:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5716:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5717:1: ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_0_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5718:1: ( rule__EmfsFile__ContentProviderAlternatives_4_0_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5718:2: rule__EmfsFile__ContentProviderAlternatives_4_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_0_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_0_111609);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5727:1: rule__EmfsFile__ContentProviderAssignment_4_1 : ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) ) ;
    public final void rule__EmfsFile__ContentProviderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5731:1: ( ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5732:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5732:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5733:1: ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5734:1: ( rule__EmfsFile__ContentProviderAlternatives_4_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5734:2: rule__EmfsFile__ContentProviderAlternatives_4_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_111642);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5743:1: rule__EmfsFile__ContentProviderAssignment_4_2_1 : ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) ) ;
    public final void rule__EmfsFile__ContentProviderAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5747:1: ( ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5748:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5748:1: ( ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5749:1: ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmfsFileAccess().getContentProviderAlternatives_4_2_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5750:1: ( rule__EmfsFile__ContentProviderAlternatives_4_2_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5750:2: rule__EmfsFile__ContentProviderAlternatives_4_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_2_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_2_111675);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5759:1: rule__StringContentProvider__StringContentsAssignment : ( ruleAbstractStringContents ) ;
    public final void rule__StringContentProvider__StringContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5763:1: ( ( ruleAbstractStringContents ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5764:1: ( ruleAbstractStringContents )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5764:1: ( ruleAbstractStringContents )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5765:1: ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringContentProviderAccess().getStringContentsAbstractStringContentsParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_rule__StringContentProvider__StringContentsAssignment11708);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5774:1: rule__VerbatimStringContents__StringContentAssignment : ( ( rule__VerbatimStringContents__StringContentAlternatives_0 ) ) ;
    public final void rule__VerbatimStringContents__StringContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5778:1: ( ( ( rule__VerbatimStringContents__StringContentAlternatives_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5779:1: ( ( rule__VerbatimStringContents__StringContentAlternatives_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5779:1: ( ( rule__VerbatimStringContents__StringContentAlternatives_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5780:1: ( rule__VerbatimStringContents__StringContentAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVerbatimStringContentsAccess().getStringContentAlternatives_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5781:1: ( rule__VerbatimStringContents__StringContentAlternatives_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5781:2: rule__VerbatimStringContents__StringContentAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VerbatimStringContents__StringContentAlternatives_0_in_rule__VerbatimStringContents__StringContentAssignment11739);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5790:1: rule__PropertyValueString__PropertyNameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__PropertyValueString__PropertyNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5794:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5795:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5795:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5796:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getPropertyNameIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PropertyValueString__PropertyNameAssignment_1_011772); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5805:1: rule__PropertyValueString__PropertyNameAssignment_1_1_1 : ( ruleEmfsName ) ;
    public final void rule__PropertyValueString__PropertyNameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5809:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5810:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5810:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5811:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getPropertyNameEmfsNameParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__PropertyValueString__PropertyNameAssignment_1_1_111803);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5820:1: rule__PropertyValueString__DefaultValueAssignment_2_1 : ( ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 ) ) ;
    public final void rule__PropertyValueString__DefaultValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5824:1: ( ( ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5825:1: ( ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5825:1: ( ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5826:1: ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueStringAccess().getDefaultValueAlternatives_2_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5827:1: ( rule__PropertyValueString__DefaultValueAlternatives_2_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5827:2: rule__PropertyValueString__DefaultValueAlternatives_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyValueString__DefaultValueAlternatives_2_1_0_in_rule__PropertyValueString__DefaultValueAssignment_2_111834);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5836:1: rule__WrappingStringContentProvider__PrefixAssignment_0 : ( ruleAbstractStringContents ) ;
    public final void rule__WrappingStringContentProvider__PrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5840:1: ( ( ruleAbstractStringContents ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5841:1: ( ruleAbstractStringContents )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5841:1: ( ruleAbstractStringContents )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5842:1: ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAbstractStringContentsParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_rule__WrappingStringContentProvider__PrefixAssignment_011867);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5851:1: rule__WrappingStringContentProvider__ContentProviderAssignment_1_1 : ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) ) ;
    public final void rule__WrappingStringContentProvider__ContentProviderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5855:1: ( ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5856:1: ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5856:1: ( ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5857:1: ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderAlternatives_1_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5858:1: ( rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5858:2: rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0_in_rule__WrappingStringContentProvider__ContentProviderAssignment_1_111898);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5867:1: rule__WrappingStringContentProvider__SuffixAssignment_2 : ( ruleAbstractStringContents ) ;
    public final void rule__WrappingStringContentProvider__SuffixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5871:1: ( ( ruleAbstractStringContents ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5872:1: ( ruleAbstractStringContents )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5872:1: ( ruleAbstractStringContents )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5873:1: ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAbstractStringContentsParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_rule__WrappingStringContentProvider__SuffixAssignment_211931);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5882:1: rule__URLContentProvider__UrlStringAssignment : ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) ) ;
    public final void rule__URLContentProvider__UrlStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5886:1: ( ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5887:1: ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5887:1: ( ( rule__URLContentProvider__UrlStringAlternatives_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5888:1: ( rule__URLContentProvider__UrlStringAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLContentProviderAccess().getUrlStringAlternatives_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5889:1: ( rule__URLContentProvider__UrlStringAlternatives_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5889:2: rule__URLContentProvider__UrlStringAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__URLContentProvider__UrlStringAlternatives_0_in_rule__URLContentProvider__UrlStringAssignment11962);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5898:1: rule__GitURLContentProvider__GitRefAssignment : ( ruleGitContentRef ) ;
    public final void rule__GitURLContentProvider__GitRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5902:1: ( ( ruleGitContentRef ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5903:1: ( ruleGitContentRef )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5903:1: ( ruleGitContentRef )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5904:1: ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitURLContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_rule__GitURLContentProvider__GitRefAssignment11995);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5913:1: rule__GitContentRef__HostAssignment_2_0_0 : ( ruleGIT_HOST ) ;
    public final void rule__GitContentRef__HostAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5917:1: ( ( ruleGIT_HOST ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5918:1: ( ruleGIT_HOST )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5918:1: ( ruleGIT_HOST )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5919:1: ruleGIT_HOST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getHostGIT_HOSTParserRuleCall_2_0_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGIT_HOST_in_rule__GitContentRef__HostAssignment_2_0_012026);
            ruleGIT_HOST();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getHostGIT_HOSTParserRuleCall_2_0_0_0()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5928:1: rule__GitContentRef__OwnerAssignment_2_0_1_1 : ( RULE_ID ) ;
    public final void rule__GitContentRef__OwnerAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5932:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5933:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5933:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5934:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_0_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GitContentRef__OwnerAssignment_2_0_1_112057); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_0_1_1_0()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5943:1: rule__GitContentRef__OwnerAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__GitContentRef__OwnerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5947:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5948:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5948:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5949:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GitContentRef__OwnerAssignment_2_112088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5958:1: rule__GitContentRef__RepoAssignment_4 : ( RULE_ID ) ;
    public final void rule__GitContentRef__RepoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5962:1: ( ( RULE_ID ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5963:1: ( RULE_ID )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5963:1: ( RULE_ID )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5964:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getRepoIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__GitContentRef__RepoAssignment_412119); if (state.failed) return ;
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5973:1: rule__GitContentRef__PathAssignment_5 : ( ruleURL_PATH ) ;
    public final void rule__GitContentRef__PathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5977:1: ( ( ruleURL_PATH ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5978:1: ( ruleURL_PATH )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5978:1: ( ruleURL_PATH )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5979:1: ruleURL_PATH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGitContentRefAccess().getPathURL_PATHParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_rule__GitContentRef__PathAssignment_512150);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5988:1: rule__DotClasspathFileContentProvider__EntriesAssignment_1 : ( ruleAbstractClasspathEntry ) ;
    public final void rule__DotClasspathFileContentProvider__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5992:1: ( ( ruleAbstractClasspathEntry ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5993:1: ( ruleAbstractClasspathEntry )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5993:1: ( ruleAbstractClasspathEntry )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:5994:1: ruleAbstractClasspathEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAbstractClasspathEntryParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractClasspathEntry_in_rule__DotClasspathFileContentProvider__EntriesAssignment_112181);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6003:1: rule__ClasspathEntry__ExplicitKindAssignment_0 : ( ruleClasspathEntryKind ) ;
    public final void rule__ClasspathEntry__ExplicitKindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6007:1: ( ( ruleClasspathEntryKind ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6008:1: ( ruleClasspathEntryKind )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6008:1: ( ruleClasspathEntryKind )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6009:1: ruleClasspathEntryKind
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitKindClasspathEntryKindEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntryKind_in_rule__ClasspathEntry__ExplicitKindAssignment_012212);
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


    // $ANTLR start "rule__ClasspathEntry__ExplicitPathAssignment_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6018:1: rule__ClasspathEntry__ExplicitPathAssignment_1 : ( ruleCLASSPATH_ENTRY_PATH ) ;
    public final void rule__ClasspathEntry__ExplicitPathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6022:1: ( ( ruleCLASSPATH_ENTRY_PATH ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6023:1: ( ruleCLASSPATH_ENTRY_PATH )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6023:1: ( ruleCLASSPATH_ENTRY_PATH )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6024:1: ruleCLASSPATH_ENTRY_PATH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getExplicitPathCLASSPATH_ENTRY_PATHParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_rule__ClasspathEntry__ExplicitPathAssignment_112243);
            ruleCLASSPATH_ENTRY_PATH();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getExplicitPathCLASSPATH_ENTRY_PATHParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__ExplicitPathAssignment_1"


    // $ANTLR start "rule__ClasspathEntry__MajorAssignment_2_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6033:1: rule__ClasspathEntry__MajorAssignment_2_1 : ( ruleVERSION ) ;
    public final void rule__ClasspathEntry__MajorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6037:1: ( ( ruleVERSION ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6038:1: ( ruleVERSION )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6038:1: ( ruleVERSION )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6039:1: ruleVERSION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMajorVERSIONParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_rule__ClasspathEntry__MajorAssignment_2_112274);
            ruleVERSION();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getMajorVERSIONParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__MajorAssignment_2_1"


    // $ANTLR start "rule__ClasspathEntry__MinorAssignment_2_2_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6048:1: rule__ClasspathEntry__MinorAssignment_2_2_1 : ( ruleVERSION ) ;
    public final void rule__ClasspathEntry__MinorAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6052:1: ( ( ruleVERSION ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6053:1: ( ruleVERSION )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6053:1: ( ruleVERSION )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6054:1: ruleVERSION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClasspathEntryAccess().getMinorVERSIONParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_rule__ClasspathEntry__MinorAssignment_2_2_112305);
            ruleVERSION();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClasspathEntryAccess().getMinorVERSIONParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClasspathEntry__MinorAssignment_2_2_1"


    // $ANTLR start "rule__DotProjectFileContentProvider__KeysAssignment_1_1"
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6063:1: rule__DotProjectFileContentProvider__KeysAssignment_1_1 : ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) ) ;
    public final void rule__DotProjectFileContentProvider__KeysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6067:1: ( ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6068:1: ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6068:1: ( ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6069:1: ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getKeysAlternatives_1_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6070:1: ( rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0 )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6070:2: rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0_in_rule__DotProjectFileContentProvider__KeysAssignment_1_112336);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6079:1: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1 : ( ( ruleEmfsName ) ) ;
    public final void rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6083:1: ( ( ( ruleEmfsName ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6084:1: ( ( ruleEmfsName ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6084:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6085:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6086:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6087:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceEmfsNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_112373);
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
    // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6098:1: rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1 : ( ( ruleEmfsName ) ) ;
    public final void rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6102:1: ( ( ( ruleEmfsName ) ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6103:1: ( ( ruleEmfsName ) )
            {
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6103:1: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6104:1: ( ruleEmfsName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_2_1_0()); 
            }
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6105:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:6106:1: ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceEmfsNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_112412);
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

    // $ANTLR start synpred50_InternalXemfs
    public final void synpred50_InternalXemfs_fragment() throws RecognitionException {   
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2020:2: ( rule__EmfsName__Group_1__0 )
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2020:2: rule__EmfsName__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__EmfsName__Group_1__0_in_synpred50_InternalXemfs4290);
        rule__EmfsName__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalXemfs

    // $ANTLR start synpred57_InternalXemfs
    public final void synpred57_InternalXemfs_fragment() throws RecognitionException {   
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2703:2: ( rule__EmfsContainer__ResourcesAssignment_4 )
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2703:2: rule__EmfsContainer__ResourcesAssignment_4
        {
        pushFollow(FollowSets000.FOLLOW_rule__EmfsContainer__ResourcesAssignment_4_in_synpred57_InternalXemfs5646);
        rule__EmfsContainer__ResourcesAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalXemfs

    // $ANTLR start synpred58_InternalXemfs
    public final void synpred58_InternalXemfs_fragment() throws RecognitionException {   
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2732:2: ( ';' )
        // ../no.hal.emfs.xtext.ui/src-gen/no/hal/emfs/xtext/ui/contentassist/antlr/internal/InternalXemfs.g:2732:2: ';'
        {
        match(input,8,FollowSets000.FOLLOW_8_in_synpred58_InternalXemfs5706); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalXemfs

    // Delegated rules

    public final boolean synpred57_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalXemfs_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalXemfs_fragment(); // can never throw exception
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String DFA4_eotS =
        "\7\uffff";
    static final String DFA4_eofS =
        "\7\uffff";
    static final String DFA4_minS =
        "\2\6\1\4\1\6\2\uffff\1\4";
    static final String DFA4_maxS =
        "\1\37\1\6\1\55\1\6\2\uffff\1\55";
    static final String DFA4_acceptS =
        "\4\uffff\1\1\1\2\1\uffff";
    static final String DFA4_specialS =
        "\7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\30\uffff\1\1",
            "\1\2",
            "\2\5\2\uffff\1\5\22\uffff\1\4\1\uffff\1\5\1\uffff\1\3\1\uffff\1\5\1\uffff\2\5\10\uffff\1\5",
            "\1\6",
            "",
            "",
            "\2\5\2\uffff\1\5\22\uffff\1\4\1\uffff\1\5\1\uffff\1\3\1\uffff\1\5\1\uffff\2\5\10\uffff\1\5"
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
            return "956:1: rule__EmfsResource__Alternatives : ( ( ruleEmfsContainer ) | ( ruleEmfsFile ) );";
        }
    }
    static final String DFA9_eotS =
        "\112\uffff";
    static final String DFA9_eofS =
        "\2\uffff\3\7\5\uffff\2\7\1\uffff\1\7\2\uffff\1\7\10\uffff\1\7\60\uffff";
    static final String DFA9_minS =
        "\1\4\1\6\3\4\1\6\2\uffff\1\4\1\37\2\4\1\6\1\4\1\6\1\37\2\4\1\6\1\4\4\44\1\43\1\4\1\33\3\6\2\33\1\6\1\4\3\6\1\15\2\6\1\4\2\33\12\15\1\4\3\6\12\15\1\6\1\4\2\33\2\6\1\4";
    static final String DFA9_maxS =
        "\1\41\1\45\2\43\1\44\1\6\2\uffff\1\6\1\46\2\43\1\6\1\44\1\6\1\46\1\55\1\50\1\6\1\41\4\44\1\43\1\55\1\47\2\6\2\37\1\44\1\6\1\41\3\6\1\26\1\6\1\37\1\41\2\44\12\33\1\41\1\37\2\6\12\33\1\6\1\41\1\44\1\33\1\6\1\37\1\41";
    static final String DFA9_acceptS =
        "\6\uffff\1\2\1\1\102\uffff";
    static final String DFA9_specialS =
        "\112\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\3\33\uffff\1\1",
            "\1\4\36\uffff\1\5",
            "\3\7\1\uffff\1\7\26\uffff\1\7\1\uffff\1\7\1\uffff\1\6",
            "\3\7\1\uffff\1\7\26\uffff\1\7\1\uffff\1\7\1\uffff\1\6",
            "\3\7\1\uffff\1\7\26\uffff\1\7\1\uffff\1\7\1\uffff\1\6\1\10",
            "\1\11",
            "",
            "",
            "\1\12\1\uffff\1\13",
            "\1\14\6\uffff\1\15",
            "\3\7\1\uffff\1\7\26\uffff\1\7\1\uffff\1\7\1\uffff\1\6",
            "\3\7\1\uffff\1\7\26\uffff\1\16\1\uffff\1\7\1\uffff\1\6",
            "\1\17",
            "\3\7\1\uffff\1\7\26\uffff\1\7\1\uffff\1\7\1\uffff\1\6\1\10",
            "\1\20",
            "\1\14\6\uffff\1\15",
            "\3\7\1\uffff\1\7\22\uffff\1\7\1\uffff\1\7\1\uffff\1\22\1\uffff\1\7\1\uffff\1\21\1\7\10\uffff\1\7",
            "\1\23\4\uffff\1\24\1\25\1\26\1\27\33\uffff\1\30",
            "\1\31",
            "\2\6\2\uffff\1\7\30\uffff\1\6",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\33",
            "\3\7\1\uffff\1\7\22\uffff\1\7\1\uffff\1\7\1\uffff\1\22\1\uffff\1\7\1\uffff\1\21\1\7\10\uffff\1\7",
            "\1\35\13\uffff\1\34",
            "\1\36",
            "\1\37",
            "\1\41\30\uffff\1\40",
            "\1\42\3\uffff\1\43",
            "\1\35\3\uffff\1\44\4\uffff\1\45",
            "\1\41",
            "\2\6\2\uffff\1\7\22\uffff\1\47\3\uffff\1\46\1\uffff\1\6",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\65",
            "\1\41\30\uffff\1\40",
            "\2\6\2\uffff\1\7\22\uffff\1\66\5\uffff\1\6",
            "\1\42\3\uffff\1\67\4\uffff\1\70",
            "\1\35\3\uffff\1\44\4\uffff\1\45",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\2\6\2\uffff\1\7\22\uffff\1\47\3\uffff\1\46\1\uffff\1\6",
            "\1\104\30\uffff\1\103",
            "\1\105",
            "\1\106",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\4\uffff\1\35",
            "\1\104",
            "\2\6\2\uffff\1\7\22\uffff\1\110\3\uffff\1\107\1\uffff\1\6",
            "\1\42\3\uffff\1\67\4\uffff\1\70",
            "\1\42",
            "\1\111",
            "\1\104\30\uffff\1\103",
            "\2\6\2\uffff\1\7\22\uffff\1\110\3\uffff\1\107\1\uffff\1\6"
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
            return "1080:1: rule__EmfsFile__ContentProviderAlternatives_4_1_0 : ( ( ruleStringContentProvider ) | ( ruleWrappingStringContentProvider ) );";
        }
    }
    static final String DFA39_eotS =
        "\11\uffff";
    static final String DFA39_eofS =
        "\3\uffff\1\1\5\uffff";
    static final String DFA39_minS =
        "\1\4\1\uffff\1\6\1\4\1\6\1\uffff\1\4\1\6\1\4";
    static final String DFA39_maxS =
        "\1\44\1\uffff\1\45\1\44\1\6\1\uffff\1\55\1\6\1\55";
    static final String DFA39_acceptS =
        "\1\uffff\1\2\3\uffff\1\1\3\uffff";
    static final String DFA39_specialS =
        "\11\uffff}>";
    static final String[] DFA39_transitionS = {
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

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "()* loopback of 3020:1: ( rule__EmfsFile__PropertiesAssignment_3 )*";
        }
    }
    static final String DFA44_eotS =
        "\7\uffff";
    static final String DFA44_eofS =
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA44_minS =
        "\2\6\1\4\1\6\2\uffff\1\4";
    static final String DFA44_maxS =
        "\1\37\1\6\1\41\1\6\2\uffff\1\41";
    static final String DFA44_acceptS =
        "\4\uffff\1\1\1\2\1\uffff";
    static final String DFA44_specialS =
        "\7\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\2\30\uffff\1\1",
            "\1\2",
            "\2\5\2\uffff\1\5\22\uffff\1\4\3\uffff\1\3\1\uffff\1\5",
            "\1\6",
            "",
            "",
            "\2\5\2\uffff\1\5\22\uffff\1\4\3\uffff\1\3\1\uffff\1\5"
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "()* loopback of 4006:1: ( ruleFolderName )*";
        }
    }
    static final String DFA50_eotS =
        "\7\uffff";
    static final String DFA50_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA50_minS =
        "\2\6\1\10\1\6\2\uffff\1\10";
    static final String DFA50_maxS =
        "\1\37\1\6\1\52\1\6\2\uffff\1\52";
    static final String DFA50_acceptS =
        "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA50_specialS =
        "\7\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\2\30\uffff\1\1",
            "\1\2",
            "\1\4\16\uffff\4\4\1\5\3\uffff\1\3\12\uffff\1\4",
            "\1\6",
            "",
            "",
            "\1\4\16\uffff\4\4\1\5\3\uffff\1\3\12\uffff\1\4"
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "()* loopback of 4743:1: ( ruleFolderName )*";
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
        public static final BitSet FOLLOW_ruleName_in_entryRuleName247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleName254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Name__Group__0_in_ruleName280 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleName_in_ruleFileName640 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleURL_SCHEME_in_entryRuleURL_SCHEME1043 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_SCHEME1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_SCHEME__Alternatives_in_ruleURL_SCHEME1076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_HOST_in_entryRuleURL_HOST1103 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_HOST1110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__0_in_ruleURL_HOST1136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_entryRuleURL_PATH1163 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_PATH1170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__0_in_ruleURL_PATH1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_in_entryRuleURL1223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL__Group__0_in_ruleURL1256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_entryRuleURLContentProvider1283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURLContentProvider1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URLContentProvider__UrlStringAssignment_in_ruleURLContentProvider1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_entryRuleGitURLContentProvider1343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitURLContentProvider1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitURLContentProvider__GitRefAssignment_in_ruleGitURLContentProvider1376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGIT_HOST_in_entryRuleGIT_HOST1403 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGIT_HOST1410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GIT_HOST__Group__0_in_ruleGIT_HOST1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_entryRuleGitContentRef1463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitContentRef1470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__0_in_ruleGitContentRef1496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotClasspathFileContentProvider_in_entryRuleDotClasspathFileContentProvider1523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotClasspathFileContentProvider1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__0_in_ruleDotClasspathFileContentProvider1556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractClasspathEntry_in_entryRuleAbstractClasspathEntry1583 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractClasspathEntry1590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntry_in_ruleAbstractClasspathEntry1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_entryRuleCLASSPATH_ENTRY_PATH1642 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCLASSPATH_ENTRY_PATH1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__0_in_ruleCLASSPATH_ENTRY_PATH1675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntry_in_entryRuleClasspathEntry1702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClasspathEntry1709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__0_in_ruleClasspathEntry1735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVERSION_in_entryRuleVERSION1762 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVERSION1769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VERSION__Alternatives_in_ruleVERSION1797 = new BitSet(new long[]{0x00000000007FE002L});
        public static final BitSet FOLLOW_rule__VERSION__Alternatives_in_ruleVERSION1809 = new BitSet(new long[]{0x00000000007FE002L});
        public static final BitSet FOLLOW_ruleDotProjectFileContentProvider_in_entryRuleDotProjectFileContentProvider1839 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotProjectFileContentProvider1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__0_in_ruleDotProjectFileContentProvider1872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntryKind__Alternatives_in_ruleClasspathEntryKind1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_rule__EmfsRoot__ContentProviderAlternatives_3_1_01944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_rule__EmfsRoot__ContentProviderAlternatives_3_1_01961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsContainer_in_rule__EmfsResource__Alternatives1993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsFile_in_rule__EmfsResource__Alternatives2010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__ValueAlternatives_3_02042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__Property__ValueAlternatives_3_02059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_rule__EmfsContainer__ContentProviderAlternatives_3_1_02091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_rule__EmfsContainer__ContentProviderAlternatives_3_1_02108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__0_in_rule__EmfsFile__Alternatives_42140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_1_in_rule__EmfsFile__Alternatives_42158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_2__0_in_rule__EmfsFile__Alternatives_42176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__EmfsFile__Alternatives_42195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_0_1_02229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_0_1_02246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_1_02278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWrappingStringContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_1_02295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotClasspathFileContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_2_1_02327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotProjectFileContentProvider_in_rule__EmfsFile__ContentProviderAlternatives_4_2_1_02344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValueString_in_rule__AbstractStringContents__Alternatives2376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVerbatimStringContents_in_rule__AbstractStringContents__Alternatives2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__VerbatimStringContents__StringContentAlternatives_02425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_CONTENT_in_rule__VerbatimStringContents__StringContentAlternatives_02442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__PropertyNameAssignment_1_0_in_rule__PropertyValueString__Alternatives_12474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__0_in_rule__PropertyValueString__Alternatives_12492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyValueString__DefaultValueAlternatives_2_1_02525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__PropertyValueString__DefaultValueAlternatives_2_1_02542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_02574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_02591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_9_in_rule__URL_SCHEME__Alternatives2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_10_in_rule__URL_SCHEME__Alternatives2644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__URL_SCHEME__Alternatives2664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__URL_SCHEME__Alternatives2684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__URL_HOST__Alternatives_3_12719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__URL_HOST__Alternatives_3_12739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__URL_HOST__Alternatives_3_12759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__URL_HOST__Alternatives_3_12779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__URL_HOST__Alternatives_3_12799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__URL_HOST__Alternatives_3_12819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__URL_HOST__Alternatives_3_12839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__URL_HOST__Alternatives_3_12859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__URL_HOST__Alternatives_3_12879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__URL_HOST__Alternatives_3_12899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__URLContentProvider__UrlStringAlternatives_02933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_in_rule__URLContentProvider__UrlStringAlternatives_02950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0__0_in_rule__GitContentRef__Alternatives_22982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__OwnerAssignment_2_1_in_rule__GitContentRef__Alternatives_23000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__VERSION__Alternatives3034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__VERSION__Alternatives3054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__VERSION__Alternatives3074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__VERSION__Alternatives3094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__VERSION__Alternatives3114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__VERSION__Alternatives3134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__VERSION__Alternatives3154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__VERSION__Alternatives3174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__VERSION__Alternatives3194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__VERSION__Alternatives3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_03248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_03265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ClasspathEntryKind__Alternatives3298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ClasspathEntryKind__Alternatives3319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ClasspathEntryKind__Alternatives3340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ClasspathEntryKind__Alternatives3361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__0__Impl_in_rule__EmfsRoot__Group__03394 = new BitSet(new long[]{0x0000000078000000L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__1_in_rule__EmfsRoot__Group__03397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__1__Impl_in_rule__EmfsRoot__Group__13455 = new BitSet(new long[]{0x0000000078000000L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__2_in_rule__EmfsRoot__Group__13458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_1__0_in_rule__EmfsRoot__Group__1__Impl3485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__2__Impl_in_rule__EmfsRoot__Group__23516 = new BitSet(new long[]{0x0000000078000000L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__3_in_rule__EmfsRoot__Group__23519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_2__0_in_rule__EmfsRoot__Group__2__Impl3546 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__3__Impl_in_rule__EmfsRoot__Group__33577 = new BitSet(new long[]{0x0000000078000000L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__4_in_rule__EmfsRoot__Group__33580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_3__0_in_rule__EmfsRoot__Group__3__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__4__Impl_in_rule__EmfsRoot__Group__43638 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__5_in_rule__EmfsRoot__Group__43641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__EmfsRoot__Group__4__Impl3669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group__5__Impl_in_rule__EmfsRoot__Group__53700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__ResourcesAssignment_5_in_rule__EmfsRoot__Group__5__Impl3727 = new BitSet(new long[]{0x0000000080000042L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_1__0__Impl_in_rule__EmfsRoot__Group_1__03770 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_1__1_in_rule__EmfsRoot__Group_1__03773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__EmfsRoot__Group_1__0__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_1__1__Impl_in_rule__EmfsRoot__Group_1__13832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__NameAssignment_1_1_in_rule__EmfsRoot__Group_1__1__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_2__0__Impl_in_rule__EmfsRoot__Group_2__03894 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_2__1_in_rule__EmfsRoot__Group_2__03897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EmfsRoot__Group_2__0__Impl3925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_2__1__Impl_in_rule__EmfsRoot__Group_2__13956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__TagsAssignment_2_1_in_rule__EmfsRoot__Group_2__1__Impl3983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_3__0__Impl_in_rule__EmfsRoot__Group_3__04017 = new BitSet(new long[]{0x0000010000000040L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_3__1_in_rule__EmfsRoot__Group_3__04020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EmfsRoot__Group_3__0__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_3__1__Impl_in_rule__EmfsRoot__Group_3__14079 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_3__2_in_rule__EmfsRoot__Group_3__14082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__ContentProviderAssignment_3_1_in_rule__EmfsRoot__Group_3__1__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__Group_3__2__Impl_in_rule__EmfsRoot__Group_3__24139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__EmfsRoot__Group_3__2__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group__0__Impl_in_rule__EmfsName__Group__04204 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__EmfsName__Group__1_in_rule__EmfsName__Group__04207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmfsName__Group__0__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group__1__Impl_in_rule__EmfsName__Group__14263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group_1__0_in_rule__EmfsName__Group__1__Impl4290 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group_1__0__Impl_in_rule__EmfsName__Group_1__04325 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsName__Group_1__1_in_rule__EmfsName__Group_1__04328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EmfsName__Group_1__0__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group_1__1__Impl_in_rule__EmfsName__Group_1__14387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmfsName__Group_1__1__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group__0__Impl_in_rule__EmfsResourcesRef__Group__04447 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group__1_in_rule__EmfsResourcesRef__Group__04450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__ResourcesAssignment_0_in_rule__EmfsResourcesRef__Group__0__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group__1__Impl_in_rule__EmfsResourcesRef__Group__14507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group_1__0_in_rule__EmfsResourcesRef__Group__1__Impl4534 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group_1__0__Impl_in_rule__EmfsResourcesRef__Group_1__04569 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group_1__1_in_rule__EmfsResourcesRef__Group_1__04572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__EmfsResourcesRef__Group_1__0__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__Group_1__1__Impl_in_rule__EmfsResourcesRef__Group_1__14631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsResourcesRef__ResourcesAssignment_1_1_in_rule__EmfsResourcesRef__Group_1__1__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__04692 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__Name__Group__1_in_rule__Name__Group__04695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Name__Group__0__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__14757 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Name__Group__2_in_rule__Name__Group__14760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Name__Group__1__Impl4787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Name__Group__2__Impl_in_rule__Name__Group__24816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Name__Group_2__0_in_rule__Name__Group__2__Impl4843 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__Name__Group_2__0__Impl_in_rule__Name__Group_2__04880 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Name__Group_2__1_in_rule__Name__Group_2__04883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Name__Group_2__0__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Name__Group_2__1__Impl_in_rule__Name__Group_2__14942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Name__Group_2__1__Impl4969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05002 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Property__Group__0__Impl5033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15064 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__15067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__25124 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__25127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Property__Group__2__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__35186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__ValueAssignment_3_in_rule__Property__Group__3__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FolderName__Group__0__Impl_in_rule__FolderName__Group__05251 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__FolderName__Group__1_in_rule__FolderName__Group__05254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleName_in_rule__FolderName__Group__0__Impl5281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FolderName__Group__1__Impl_in_rule__FolderName__Group__15310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__FolderName__Group__1__Impl5338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__0__Impl_in_rule__EmfsContainer__Group__05373 = new BitSet(new long[]{0x00000002E0000140L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__1_in_rule__EmfsContainer__Group__05376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__NameAssignment_0_in_rule__EmfsContainer__Group__0__Impl5403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__1__Impl_in_rule__EmfsContainer__Group__15433 = new BitSet(new long[]{0x00000002E0000140L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__2_in_rule__EmfsContainer__Group__15436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_1__0_in_rule__EmfsContainer__Group__1__Impl5463 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__2__Impl_in_rule__EmfsContainer__Group__25494 = new BitSet(new long[]{0x00000002E0000140L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__3_in_rule__EmfsContainer__Group__25497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__PropertiesAssignment_2_in_rule__EmfsContainer__Group__2__Impl5524 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__3__Impl_in_rule__EmfsContainer__Group__35555 = new BitSet(new long[]{0x00000002E0000140L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__4_in_rule__EmfsContainer__Group__35558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__0_in_rule__EmfsContainer__Group__3__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__4__Impl_in_rule__EmfsContainer__Group__45616 = new BitSet(new long[]{0x00000002E0000140L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__5_in_rule__EmfsContainer__Group__45619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__ResourcesAssignment_4_in_rule__EmfsContainer__Group__4__Impl5646 = new BitSet(new long[]{0x0000000080000042L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group__5__Impl_in_rule__EmfsContainer__Group__55677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__EmfsContainer__Group__5__Impl5706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_1__0__Impl_in_rule__EmfsContainer__Group_1__05751 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_1__1_in_rule__EmfsContainer__Group_1__05754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EmfsContainer__Group_1__0__Impl5782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_1__1__Impl_in_rule__EmfsContainer__Group_1__15813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__TagsAssignment_1_1_in_rule__EmfsContainer__Group_1__1__Impl5840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__0__Impl_in_rule__EmfsContainer__Group_3__05874 = new BitSet(new long[]{0x0000010000000040L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__1_in_rule__EmfsContainer__Group_3__05877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EmfsContainer__Group_3__0__Impl5905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__1__Impl_in_rule__EmfsContainer__Group_3__15936 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__2_in_rule__EmfsContainer__Group_3__15939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__ContentProviderAssignment_3_1_in_rule__EmfsContainer__Group_3__1__Impl5966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__Group_3__2__Impl_in_rule__EmfsContainer__Group_3__25996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__EmfsContainer__Group_3__2__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__0__Impl_in_rule__EmfsFile__Group__06061 = new BitSet(new long[]{0x0000201A20000130L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__1_in_rule__EmfsFile__Group__06064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__NameAssignment_0_in_rule__EmfsFile__Group__0__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__1__Impl_in_rule__EmfsFile__Group__16121 = new BitSet(new long[]{0x0000201A20000130L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__2_in_rule__EmfsFile__Group__16124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__WriteableAssignment_1_in_rule__EmfsFile__Group__1__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__2__Impl_in_rule__EmfsFile__Group__26182 = new BitSet(new long[]{0x0000201A20000130L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__3_in_rule__EmfsFile__Group__26185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_2__0_in_rule__EmfsFile__Group__2__Impl6212 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__3__Impl_in_rule__EmfsFile__Group__36243 = new BitSet(new long[]{0x0000201A20000130L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__4_in_rule__EmfsFile__Group__36246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__PropertiesAssignment_3_in_rule__EmfsFile__Group__3__Impl6273 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group__4__Impl_in_rule__EmfsFile__Group__46304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Alternatives_4_in_rule__EmfsFile__Group__4__Impl6331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_2__0__Impl_in_rule__EmfsFile__Group_2__06371 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_2__1_in_rule__EmfsFile__Group_2__06374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EmfsFile__Group_2__0__Impl6402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_2__1__Impl_in_rule__EmfsFile__Group_2__16433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__TagsAssignment_2_1_in_rule__EmfsFile__Group_2__1__Impl6460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__0__Impl_in_rule__EmfsFile__Group_4_0__06494 = new BitSet(new long[]{0x0000010000001E10L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__1_in_rule__EmfsFile__Group_4_0__06497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__EmfsFile__Group_4_0__0__Impl6525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__1__Impl_in_rule__EmfsFile__Group_4_0__16556 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__2_in_rule__EmfsFile__Group_4_0__16559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_0_1_in_rule__EmfsFile__Group_4_0__1__Impl6586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_0__2__Impl_in_rule__EmfsFile__Group_4_0__26616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__EmfsFile__Group_4_0__2__Impl6644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_2__0__Impl_in_rule__EmfsFile__Group_4_2__06681 = new BitSet(new long[]{0x0000120000000000L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_2__1_in_rule__EmfsFile__Group_4_2__06684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__EmfsFile__Group_4_2__0__Impl6712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__Group_4_2__1__Impl_in_rule__EmfsFile__Group_4_2__16743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAssignment_4_2_1_in_rule__EmfsFile__Group_4_2__1__Impl6770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__0__Impl_in_rule__PropertyValueString__Group__06804 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__1_in_rule__PropertyValueString__Group__06807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__PropertyValueString__Group__0__Impl6835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__1__Impl_in_rule__PropertyValueString__Group__16866 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__2_in_rule__PropertyValueString__Group__16869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Alternatives_1_in_rule__PropertyValueString__Group__1__Impl6896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group__2__Impl_in_rule__PropertyValueString__Group__26926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_2__0_in_rule__PropertyValueString__Group__2__Impl6953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__0__Impl_in_rule__PropertyValueString__Group_1_1__06990 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__1_in_rule__PropertyValueString__Group_1_1__06993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__PropertyValueString__Group_1_1__0__Impl7021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__1__Impl_in_rule__PropertyValueString__Group_1_1__17052 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__2_in_rule__PropertyValueString__Group_1_1__17055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__PropertyNameAssignment_1_1_1_in_rule__PropertyValueString__Group_1_1__1__Impl7082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_1_1__2__Impl_in_rule__PropertyValueString__Group_1_1__27112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__PropertyValueString__Group_1_1__2__Impl7140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_2__0__Impl_in_rule__PropertyValueString__Group_2__07177 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_2__1_in_rule__PropertyValueString__Group_2__07180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__PropertyValueString__Group_2__0__Impl7208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__Group_2__1__Impl_in_rule__PropertyValueString__Group_2__17239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__DefaultValueAssignment_2_1_in_rule__PropertyValueString__Group_2__1__Impl7266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__0__Impl_in_rule__WrappingStringContentProvider__Group__07300 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__1_in_rule__WrappingStringContentProvider__Group__07303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__PrefixAssignment_0_in_rule__WrappingStringContentProvider__Group__0__Impl7330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__1__Impl_in_rule__WrappingStringContentProvider__Group__17360 = new BitSet(new long[]{0x0000000200000030L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__2_in_rule__WrappingStringContentProvider__Group__17363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group_1__0_in_rule__WrappingStringContentProvider__Group__1__Impl7390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group__2__Impl_in_rule__WrappingStringContentProvider__Group__27420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__SuffixAssignment_2_in_rule__WrappingStringContentProvider__Group__2__Impl7447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group_1__0__Impl_in_rule__WrappingStringContentProvider__Group_1__07483 = new BitSet(new long[]{0x0000010000001E10L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group_1__1_in_rule__WrappingStringContentProvider__Group_1__07486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__WrappingStringContentProvider__Group_1__0__Impl7514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__Group_1__1__Impl_in_rule__WrappingStringContentProvider__Group_1__17545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__ContentProviderAssignment_1_1_in_rule__WrappingStringContentProvider__Group_1__1__Impl7572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__0__Impl_in_rule__URL_HOST__Group__07606 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__1_in_rule__URL_HOST__Group__07609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__URL_HOST__Group__0__Impl7637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__1__Impl_in_rule__URL_HOST__Group__17668 = new BitSet(new long[]{0x0000001080000000L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__2_in_rule__URL_HOST__Group__17671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__URL_HOST__Group__1__Impl7698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__2__Impl_in_rule__URL_HOST__Group__27727 = new BitSet(new long[]{0x0000001080000000L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__3_in_rule__URL_HOST__Group__27730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_2__0_in_rule__URL_HOST__Group__2__Impl7757 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group__3__Impl_in_rule__URL_HOST__Group__37788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_3__0_in_rule__URL_HOST__Group__3__Impl7815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_2__0__Impl_in_rule__URL_HOST__Group_2__07854 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_2__1_in_rule__URL_HOST__Group_2__07857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__URL_HOST__Group_2__0__Impl7885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_2__1__Impl_in_rule__URL_HOST__Group_2__17916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__URL_HOST__Group_2__1__Impl7943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_3__0__Impl_in_rule__URL_HOST__Group_3__07976 = new BitSet(new long[]{0x00000000007FE000L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_3__1_in_rule__URL_HOST__Group_3__07979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__URL_HOST__Group_3__0__Impl8007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Group_3__1__Impl_in_rule__URL_HOST__Group_3__18038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Alternatives_3_1_in_rule__URL_HOST__Group_3__1__Impl8067 = new BitSet(new long[]{0x00000000007FE002L});
        public static final BitSet FOLLOW_rule__URL_HOST__Alternatives_3_1_in_rule__URL_HOST__Group_3__1__Impl8079 = new BitSet(new long[]{0x00000000007FE002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__0__Impl_in_rule__URL_PATH__Group__08116 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__1_in_rule__URL_PATH__Group__08119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__URL_PATH__Group__0__Impl8147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__1__Impl_in_rule__URL_PATH__Group__18178 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__2_in_rule__URL_PATH__Group__18181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_rule__URL_PATH__Group__1__Impl8209 = new BitSet(new long[]{0x0000000080000042L});
        public static final BitSet FOLLOW_rule__URL_PATH__Group__2__Impl_in_rule__URL_PATH__Group__28240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_rule__URL_PATH__Group__2__Impl8267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL__Group__0__Impl_in_rule__URL__Group__08302 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__URL__Group__1_in_rule__URL__Group__08305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_SCHEME_in_rule__URL__Group__0__Impl8332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL__Group__1__Impl_in_rule__URL__Group__18361 = new BitSet(new long[]{0x0000008008000000L});
        public static final BitSet FOLLOW_rule__URL__Group__2_in_rule__URL__Group__18364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__URL__Group__1__Impl8392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL__Group__2__Impl_in_rule__URL__Group__28423 = new BitSet(new long[]{0x0000008008000000L});
        public static final BitSet FOLLOW_rule__URL__Group__3_in_rule__URL__Group__28426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_HOST_in_rule__URL__Group__2__Impl8454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URL__Group__3__Impl_in_rule__URL__Group__38485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_rule__URL__Group__3__Impl8512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GIT_HOST__Group__0__Impl_in_rule__GIT_HOST__Group__08549 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__GIT_HOST__Group__1_in_rule__GIT_HOST__Group__08552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GIT_HOST__Group__0__Impl8579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GIT_HOST__Group__1__Impl_in_rule__GIT_HOST__Group__18608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GIT_HOST__Group_1__0_in_rule__GIT_HOST__Group__1__Impl8637 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__GIT_HOST__Group_1__0_in_rule__GIT_HOST__Group__1__Impl8649 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__GIT_HOST__Group_1__0__Impl_in_rule__GIT_HOST__Group_1__08686 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__GIT_HOST__Group_1__1_in_rule__GIT_HOST__Group_1__08689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__GIT_HOST__Group_1__0__Impl8717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GIT_HOST__Group_1__1__Impl_in_rule__GIT_HOST__Group_1__18748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GIT_HOST__Group_1__1__Impl8775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__0__Impl_in_rule__GitContentRef__Group__08808 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__1_in_rule__GitContentRef__Group__08811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__GitContentRef__Group__0__Impl8839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__1__Impl_in_rule__GitContentRef__Group__18870 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__2_in_rule__GitContentRef__Group__18873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__GitContentRef__Group__1__Impl8901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__2__Impl_in_rule__GitContentRef__Group__28932 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__3_in_rule__GitContentRef__Group__28935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Alternatives_2_in_rule__GitContentRef__Group__2__Impl8962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__3__Impl_in_rule__GitContentRef__Group__38992 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__4_in_rule__GitContentRef__Group__38995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__GitContentRef__Group__3__Impl9023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__4__Impl_in_rule__GitContentRef__Group__49054 = new BitSet(new long[]{0x0000008008000000L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__5_in_rule__GitContentRef__Group__49057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__RepoAssignment_4_in_rule__GitContentRef__Group__4__Impl9084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group__5__Impl_in_rule__GitContentRef__Group__59114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__PathAssignment_5_in_rule__GitContentRef__Group__5__Impl9141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0__0__Impl_in_rule__GitContentRef__Group_2_0__09184 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0__1_in_rule__GitContentRef__Group_2_0__09187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__HostAssignment_2_0_0_in_rule__GitContentRef__Group_2_0__0__Impl9214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0__1__Impl_in_rule__GitContentRef__Group_2_0__19244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0_1__0_in_rule__GitContentRef__Group_2_0__1__Impl9271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0_1__0__Impl_in_rule__GitContentRef__Group_2_0_1__09306 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0_1__1_in_rule__GitContentRef__Group_2_0_1__09309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__GitContentRef__Group_2_0_1__0__Impl9337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__Group_2_0_1__1__Impl_in_rule__GitContentRef__Group_2_0_1__19368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GitContentRef__OwnerAssignment_2_0_1_1_in_rule__GitContentRef__Group_2_0_1__1__Impl9395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__0__Impl_in_rule__DotClasspathFileContentProvider__Group__09429 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__1_in_rule__DotClasspathFileContentProvider__Group__09432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__DotClasspathFileContentProvider__Group__0__Impl9460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__1__Impl_in_rule__DotClasspathFileContentProvider__Group__19491 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__2_in_rule__DotClasspathFileContentProvider__Group__19494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__EntriesAssignment_1_in_rule__DotClasspathFileContentProvider__Group__1__Impl9523 = new BitSet(new long[]{0x0000000007800002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__EntriesAssignment_1_in_rule__DotClasspathFileContentProvider__Group__1__Impl9535 = new BitSet(new long[]{0x0000000007800002L});
        public static final BitSet FOLLOW_rule__DotClasspathFileContentProvider__Group__2__Impl_in_rule__DotClasspathFileContentProvider__Group__29568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__DotClasspathFileContentProvider__Group__2__Impl9596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__0__Impl_in_rule__CLASSPATH_ENTRY_PATH__Group__09633 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__1_in_rule__CLASSPATH_ENTRY_PATH__Group__09636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_rule__CLASSPATH_ENTRY_PATH__Group__0__Impl9664 = new BitSet(new long[]{0x0000000080000042L});
        public static final BitSet FOLLOW_rule__CLASSPATH_ENTRY_PATH__Group__1__Impl_in_rule__CLASSPATH_ENTRY_PATH__Group__19695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_rule__CLASSPATH_ENTRY_PATH__Group__1__Impl9722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__0__Impl_in_rule__ClasspathEntry__Group__09755 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__1_in_rule__ClasspathEntry__Group__09758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__ExplicitKindAssignment_0_in_rule__ClasspathEntry__Group__0__Impl9785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__1__Impl_in_rule__ClasspathEntry__Group__19815 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__2_in_rule__ClasspathEntry__Group__19818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__ExplicitPathAssignment_1_in_rule__ClasspathEntry__Group__1__Impl9845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group__2__Impl_in_rule__ClasspathEntry__Group__29875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2__0_in_rule__ClasspathEntry__Group__2__Impl9902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2__0__Impl_in_rule__ClasspathEntry__Group_2__09939 = new BitSet(new long[]{0x00000000007FE000L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2__1_in_rule__ClasspathEntry__Group_2__09942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ClasspathEntry__Group_2__0__Impl9970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2__1__Impl_in_rule__ClasspathEntry__Group_2__110001 = new BitSet(new long[]{0x0000080080000000L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2__2_in_rule__ClasspathEntry__Group_2__110004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__MajorAssignment_2_1_in_rule__ClasspathEntry__Group_2__1__Impl10031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2__2__Impl_in_rule__ClasspathEntry__Group_2__210061 = new BitSet(new long[]{0x0000080080000000L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2__3_in_rule__ClasspathEntry__Group_2__210064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2_2__0_in_rule__ClasspathEntry__Group_2__2__Impl10091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2__3__Impl_in_rule__ClasspathEntry__Group_2__310122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__ClasspathEntry__Group_2__3__Impl10150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2_2__0__Impl_in_rule__ClasspathEntry__Group_2_2__010189 = new BitSet(new long[]{0x00000000007FE000L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2_2__1_in_rule__ClasspathEntry__Group_2_2__010192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ClasspathEntry__Group_2_2__0__Impl10220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__Group_2_2__1__Impl_in_rule__ClasspathEntry__Group_2_2__110251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ClasspathEntry__MinorAssignment_2_2_1_in_rule__ClasspathEntry__Group_2_2__1__Impl10278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__0__Impl_in_rule__DotProjectFileContentProvider__Group__010312 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__1_in_rule__DotProjectFileContentProvider__Group__010315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__DotProjectFileContentProvider__Group__0__Impl10343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__1__Impl_in_rule__DotProjectFileContentProvider__Group__110374 = new BitSet(new long[]{0x0000000800000100L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__2_in_rule__DotProjectFileContentProvider__Group__110377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_1__0_in_rule__DotProjectFileContentProvider__Group__1__Impl10406 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_1__0_in_rule__DotProjectFileContentProvider__Group__1__Impl10418 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__2__Impl_in_rule__DotProjectFileContentProvider__Group__210451 = new BitSet(new long[]{0x0000000800000100L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__3_in_rule__DotProjectFileContentProvider__Group__210454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__0_in_rule__DotProjectFileContentProvider__Group__2__Impl10481 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group__3__Impl_in_rule__DotProjectFileContentProvider__Group__310512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__DotProjectFileContentProvider__Group__3__Impl10540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_1__0__Impl_in_rule__DotProjectFileContentProvider__Group_1__010579 = new BitSet(new long[]{0x0000000080000050L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_1__1_in_rule__DotProjectFileContentProvider__Group_1__010582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__DotProjectFileContentProvider__Group_1__0__Impl10610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_1__1__Impl_in_rule__DotProjectFileContentProvider__Group_1__110641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__KeysAssignment_1_1_in_rule__DotProjectFileContentProvider__Group_1__1__Impl10668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__0__Impl_in_rule__DotProjectFileContentProvider__Group_2__010702 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__1_in_rule__DotProjectFileContentProvider__Group_2__010705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__DotProjectFileContentProvider__Group_2__0__Impl10733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__1__Impl_in_rule__DotProjectFileContentProvider__Group_2__110764 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__2_in_rule__DotProjectFileContentProvider__Group_2__110767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_1_in_rule__DotProjectFileContentProvider__Group_2__1__Impl10794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2__2__Impl_in_rule__DotProjectFileContentProvider__Group_2__210824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__0_in_rule__DotProjectFileContentProvider__Group_2__2__Impl10851 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__0__Impl_in_rule__DotProjectFileContentProvider__Group_2_2__010888 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__1_in_rule__DotProjectFileContentProvider__Group_2_2__010891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__DotProjectFileContentProvider__Group_2_2__0__Impl10919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__Group_2_2__1__Impl_in_rule__DotProjectFileContentProvider__Group_2_2__110950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_1_in_rule__DotProjectFileContentProvider__Group_2_2__1__Impl10977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__EmfsRoot__NameAssignment_1_111016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmfsRoot__TagsAssignment_2_111047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsRoot__ContentProviderAlternatives_3_1_0_in_rule__EmfsRoot__ContentProviderAssignment_3_111078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_rule__EmfsRoot__ResourcesAssignment_511111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__EmfsResourcesRef__ResourcesAssignment_011146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__EmfsResourcesRef__ResourcesAssignment_1_111185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__Property__NameAssignment_111220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__ValueAlternatives_3_0_in_rule__Property__ValueAssignment_311251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_rule__EmfsContainer__NameAssignment_011284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__EmfsContainer__TagsAssignment_1_111315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__EmfsContainer__PropertiesAssignment_211346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__ContentProviderAlternatives_3_1_0_in_rule__EmfsContainer__ContentProviderAssignment_3_111377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_rule__EmfsContainer__ResourcesAssignment_411410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_rule__GitContentProvider__GitRefAssignment11441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_rule__EmfsFile__NameAssignment_011472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__EmfsFile__WriteableAssignment_111508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmfsFile__TagsAssignment_2_111547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__EmfsFile__PropertiesAssignment_311578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_0_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_0_111609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_111642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsFile__ContentProviderAlternatives_4_2_1_0_in_rule__EmfsFile__ContentProviderAssignment_4_2_111675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_rule__StringContentProvider__StringContentsAssignment11708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VerbatimStringContents__StringContentAlternatives_0_in_rule__VerbatimStringContents__StringContentAssignment11739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyValueString__PropertyNameAssignment_1_011772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__PropertyValueString__PropertyNameAssignment_1_1_111803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyValueString__DefaultValueAlternatives_2_1_0_in_rule__PropertyValueString__DefaultValueAssignment_2_111834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_rule__WrappingStringContentProvider__PrefixAssignment_011867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WrappingStringContentProvider__ContentProviderAlternatives_1_1_0_in_rule__WrappingStringContentProvider__ContentProviderAssignment_1_111898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_rule__WrappingStringContentProvider__SuffixAssignment_211931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__URLContentProvider__UrlStringAlternatives_0_in_rule__URLContentProvider__UrlStringAssignment11962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_rule__GitURLContentProvider__GitRefAssignment11995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGIT_HOST_in_rule__GitContentRef__HostAssignment_2_0_012026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GitContentRef__OwnerAssignment_2_0_1_112057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GitContentRef__OwnerAssignment_2_112088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__GitContentRef__RepoAssignment_412119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_rule__GitContentRef__PathAssignment_512150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractClasspathEntry_in_rule__DotClasspathFileContentProvider__EntriesAssignment_112181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntryKind_in_rule__ClasspathEntry__ExplicitKindAssignment_012212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_rule__ClasspathEntry__ExplicitPathAssignment_112243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVERSION_in_rule__ClasspathEntry__MajorAssignment_2_112274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVERSION_in_rule__ClasspathEntry__MinorAssignment_2_2_112305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotProjectFileContentProvider__KeysAlternatives_1_1_0_in_rule__DotProjectFileContentProvider__KeysAssignment_1_112336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_112373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rule__DotProjectFileContentProvider__LinkedResourcesAssignment_2_2_112412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsName__Group_1__0_in_synpred50_InternalXemfs4290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmfsContainer__ResourcesAssignment_4_in_synpred57_InternalXemfs5646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_synpred58_InternalXemfs5706 = new BitSet(new long[]{0x0000000000000002L});
    }


}