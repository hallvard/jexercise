package no.hal.emfs.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.hal.emfs.xtext.services.XemfsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalXemfsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_STRING_CONTENT", "RULE_WS", "'emfs'", "'#'", "'extends'", "';'", "'/'", "'.'", "','", "'$'", "'='", "'*'", "'@'", "':'", "'{'", "'}'", "'http'", "'https'", "'ftp'", "'file'", "'//'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'git'", "'dot.classpath'", "'('", "')'", "'dot.project'", "'source-folder'", "'output-folder'", "'library-jar'", "'class-container'"
    };
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


        public InternalXemfsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXemfsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXemfsParser.tokenNames; }
    public String getGrammarFileName() { return "../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g"; }



     	private XemfsGrammarAccess grammarAccess;
     	
        public InternalXemfsParser(TokenStream input, XemfsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "EmfsRoot";	
       	}
       	
       	@Override
       	protected XemfsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEmfsRoot"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:68:1: entryRuleEmfsRoot returns [EObject current=null] : iv_ruleEmfsRoot= ruleEmfsRoot EOF ;
    public final EObject entryRuleEmfsRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsRoot = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:69:2: (iv_ruleEmfsRoot= ruleEmfsRoot EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:70:2: iv_ruleEmfsRoot= ruleEmfsRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsRootRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsRoot_in_entryRuleEmfsRoot75);
            iv_ruleEmfsRoot=ruleEmfsRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsRoot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsRoot85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmfsRoot"


    // $ANTLR start "ruleEmfsRoot"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:77:1: ruleEmfsRoot returns [EObject current=null] : ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* (otherlv_5= 'extends' ( ( (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef ) ) ) otherlv_7= ';' )? otherlv_8= '/' ( (lv_resources_9_0= ruleEmfsResource ) )* ) ;
    public final EObject ruleEmfsRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_tags_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_contentProvider_6_1 = null;

        EObject lv_contentProvider_6_2 = null;

        EObject lv_resources_9_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:80:28: ( ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* (otherlv_5= 'extends' ( ( (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef ) ) ) otherlv_7= ';' )? otherlv_8= '/' ( (lv_resources_9_0= ruleEmfsResource ) )* ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:81:1: ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* (otherlv_5= 'extends' ( ( (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef ) ) ) otherlv_7= ';' )? otherlv_8= '/' ( (lv_resources_9_0= ruleEmfsResource ) )* )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:81:1: ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* (otherlv_5= 'extends' ( ( (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef ) ) ) otherlv_7= ';' )? otherlv_8= '/' ( (lv_resources_9_0= ruleEmfsResource ) )* )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:81:2: () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* (otherlv_5= 'extends' ( ( (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef ) ) ) otherlv_7= ';' )? otherlv_8= '/' ( (lv_resources_9_0= ruleEmfsResource ) )*
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:81:2: ()
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEmfsRootAccess().getEmfsContainerAction_0(),
                          current);
                  
            }

            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:87:2: (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==8) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:87:4: otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )?
                    {
                    otherlv_1=(Token)match(input,8,FollowSets000.FOLLOW_8_in_ruleEmfsRoot132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmfsRootAccess().getEmfsKeyword_1_0());
                          
                    }
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:91:1: ( (lv_name_2_0= ruleEmfsName ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ID) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:92:1: (lv_name_2_0= ruleEmfsName )
                            {
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:92:1: (lv_name_2_0= ruleEmfsName )
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:93:3: lv_name_2_0= ruleEmfsName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsRootAccess().getNameEmfsNameParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleEmfsRoot153);
                            lv_name_2_0=ruleEmfsName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsRootRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"name",
                                      		lv_name_2_0, 
                                      		"EmfsName");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:109:5: (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==9) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:109:7: otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleEmfsRoot169); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEmfsRootAccess().getNumberSignKeyword_2_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:113:1: ( (lv_tags_4_0= RULE_ID ) )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:114:1: (lv_tags_4_0= RULE_ID )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:114:1: (lv_tags_4_0= RULE_ID )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:115:3: lv_tags_4_0= RULE_ID
            	    {
            	    lv_tags_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmfsRoot186); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_tags_4_0, grammarAccess.getEmfsRootAccess().getTagsIDTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEmfsRootRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"tags",
            	              		lv_tags_4_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:131:4: (otherlv_5= 'extends' ( ( (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef ) ) ) otherlv_7= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==10) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:131:6: otherlv_5= 'extends' ( ( (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef ) ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,10,FollowSets000.FOLLOW_10_in_ruleEmfsRoot206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmfsRootAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:135:1: ( ( (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef ) ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:136:1: ( (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef ) )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:136:1: ( (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:137:1: (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:137:1: (lv_contentProvider_6_1= ruleGitContentProvider | lv_contentProvider_6_2= ruleEmfsResourcesRef )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==37) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_ID) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:138:3: lv_contentProvider_6_1= ruleGitContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsRootAccess().getContentProviderGitContentProviderParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_ruleEmfsRoot229);
                            lv_contentProvider_6_1=ruleGitContentProvider();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsRootRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_6_1, 
                                      		"GitContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:153:8: lv_contentProvider_6_2= ruleEmfsResourcesRef
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsRootAccess().getContentProviderEmfsResourcesRefParserRuleCall_3_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_ruleEmfsRoot248);
                            lv_contentProvider_6_2=ruleEmfsResourcesRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsRootRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_6_2, 
                                      		"EmfsResourcesRef");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmfsRoot263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEmfsRootAccess().getSemicolonKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEmfsRoot277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEmfsRootAccess().getSolidusKeyword_4());
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:179:1: ( (lv_resources_9_0= ruleEmfsResource ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:180:1: (lv_resources_9_0= ruleEmfsResource )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:180:1: (lv_resources_9_0= ruleEmfsResource )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:181:3: lv_resources_9_0= ruleEmfsResource
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsRootAccess().getResourcesEmfsResourceParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_ruleEmfsRoot298);
            	    lv_resources_9_0=ruleEmfsResource();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmfsRootRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"resources",
            	              		lv_resources_9_0, 
            	              		"EmfsResource");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmfsRoot"


    // $ANTLR start "entryRuleEmfsName"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:205:1: entryRuleEmfsName returns [String current=null] : iv_ruleEmfsName= ruleEmfsName EOF ;
    public final String entryRuleEmfsName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmfsName = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:206:2: (iv_ruleEmfsName= ruleEmfsName EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:207:2: iv_ruleEmfsName= ruleEmfsName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_entryRuleEmfsName336);
            iv_ruleEmfsName=ruleEmfsName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsName347); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmfsName"


    // $ANTLR start "ruleEmfsName"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:214:1: ruleEmfsName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleEmfsName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:217:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:218:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:218:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:218:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmfsName387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:225:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==RULE_ID) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:226:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEmfsName406); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getEmfsNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmfsName421); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmfsName"


    // $ANTLR start "entryRuleEmfsResourcesRef"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:246:1: entryRuleEmfsResourcesRef returns [EObject current=null] : iv_ruleEmfsResourcesRef= ruleEmfsResourcesRef EOF ;
    public final EObject entryRuleEmfsResourcesRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsResourcesRef = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:247:2: (iv_ruleEmfsResourcesRef= ruleEmfsResourcesRef EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:248:2: iv_ruleEmfsResourcesRef= ruleEmfsResourcesRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsResourcesRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_entryRuleEmfsResourcesRef468);
            iv_ruleEmfsResourcesRef=ruleEmfsResourcesRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsResourcesRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsResourcesRef478); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmfsResourcesRef"


    // $ANTLR start "ruleEmfsResourcesRef"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:255:1: ruleEmfsResourcesRef returns [EObject current=null] : ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* ) ;
    public final EObject ruleEmfsResourcesRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:258:28: ( ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:259:1: ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:259:1: ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:259:2: ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )*
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:259:2: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:260:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:260:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:261:3: ruleEmfsName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmfsResourcesRefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleEmfsResourcesRef526);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:274:2: (otherlv_1= ',' ( ( ruleEmfsName ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:274:4: otherlv_1= ',' ( ( ruleEmfsName ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEmfsResourcesRef539); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEmfsResourcesRefAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:278:1: ( ( ruleEmfsName ) )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:279:1: ( ruleEmfsName )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:279:1: ( ruleEmfsName )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:280:3: ruleEmfsName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEmfsResourcesRefRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleEmfsResourcesRef562);
            	    ruleEmfsName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmfsResourcesRef"


    // $ANTLR start "entryRuleName"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:301:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:302:2: (iv_ruleName= ruleName EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:303:2: iv_ruleName= ruleName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleName_in_entryRuleName601);
            iv_ruleName=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleName612); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:310:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:313:28: ( ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:314:1: ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:314:1: ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:314:2: (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )*
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:314:2: (kw= '.' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:315:2: kw= '.'
                    {
                    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleName651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleName668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:327:1: (kw= '.' this_ID_3= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:328:2: kw= '.' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleName687); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_2_0()); 
            	          
            	    }
            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleName702); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getNameAccess().getIDTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleEmfsResource"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:348:1: entryRuleEmfsResource returns [EObject current=null] : iv_ruleEmfsResource= ruleEmfsResource EOF ;
    public final EObject entryRuleEmfsResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsResource = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:349:2: (iv_ruleEmfsResource= ruleEmfsResource EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:350:2: iv_ruleEmfsResource= ruleEmfsResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_entryRuleEmfsResource749);
            iv_ruleEmfsResource=ruleEmfsResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsResource; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsResource759); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmfsResource"


    // $ANTLR start "ruleEmfsResource"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:357:1: ruleEmfsResource returns [EObject current=null] : (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile ) ;
    public final EObject ruleEmfsResource() throws RecognitionException {
        EObject current = null;

        EObject this_EmfsContainer_0 = null;

        EObject this_EmfsFile_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:360:28: ( (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:361:1: (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:361:1: (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:362:5: this_EmfsContainer_0= ruleEmfsContainer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEmfsResourceAccess().getEmfsContainerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsContainer_in_ruleEmfsResource806);
                    this_EmfsContainer_0=ruleEmfsContainer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EmfsContainer_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:372:5: this_EmfsFile_1= ruleEmfsFile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEmfsResourceAccess().getEmfsFileParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsFile_in_ruleEmfsResource833);
                    this_EmfsFile_1=ruleEmfsFile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EmfsFile_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmfsResource"


    // $ANTLR start "entryRuleProperty"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:388:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:389:2: (iv_ruleProperty= ruleProperty EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:390:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty868);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty878); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:397:1: ruleProperty returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_1=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_2 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:400:28: ( (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:401:1: (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:401:1: (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:401:3: otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProperty915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getDollarSignKeyword_0());
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:405:1: ( (lv_name_1_0= ruleEmfsName ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:406:1: (lv_name_1_0= ruleEmfsName )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:406:1: (lv_name_1_0= ruleEmfsName )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:407:3: lv_name_1_0= ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEmfsNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleProperty936);
            lv_name_1_0=ruleEmfsName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"EmfsName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProperty948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:427:1: ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:428:1: ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:428:1: ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:429:1: (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:429:1: (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:430:3: lv_value_3_1= RULE_STRING
                    {
                    lv_value_3_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProperty967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_1, grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_1, 
                              		"STRING");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:445:8: lv_value_3_2= ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getValueEmfsNameParserRuleCall_3_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleProperty991);
                    lv_value_3_2=ruleEmfsName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_2, 
                              		"EmfsName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleFolderName"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:471:1: entryRuleFolderName returns [String current=null] : iv_ruleFolderName= ruleFolderName EOF ;
    public final String entryRuleFolderName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFolderName = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:472:2: (iv_ruleFolderName= ruleFolderName EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:473:2: iv_ruleFolderName= ruleFolderName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFolderNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_entryRuleFolderName1031);
            iv_ruleFolderName=ruleFolderName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFolderName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFolderName1042); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFolderName"


    // $ANTLR start "ruleFolderName"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:480:1: ruleFolderName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleFolderName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:483:28: ( (this_Name_0= ruleName kw= '/' ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:484:1: (this_Name_0= ruleName kw= '/' )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:484:1: (this_Name_0= ruleName kw= '/' )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:485:5: this_Name_0= ruleName kw= '/'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFolderNameAccess().getNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleName_in_ruleFolderName1089);
            this_Name_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Name_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFolderName1107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFolderNameAccess().getSolidusKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFolderName"


    // $ANTLR start "entryRuleEmfsContainer"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:509:1: entryRuleEmfsContainer returns [EObject current=null] : iv_ruleEmfsContainer= ruleEmfsContainer EOF ;
    public final EObject entryRuleEmfsContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsContainer = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:510:2: (iv_ruleEmfsContainer= ruleEmfsContainer EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:511:2: iv_ruleEmfsContainer= ruleEmfsContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsContainerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsContainer_in_entryRuleEmfsContainer1147);
            iv_ruleEmfsContainer=ruleEmfsContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsContainer; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsContainer1157); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmfsContainer"


    // $ANTLR start "ruleEmfsContainer"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:518:1: ruleEmfsContainer returns [EObject current=null] : ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? ) ;
    public final EObject ruleEmfsContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_tags_2_0 = null;

        EObject lv_properties_3_0 = null;

        EObject lv_contentProvider_5_1 = null;

        EObject lv_contentProvider_5_2 = null;

        EObject lv_resources_7_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:521:28: ( ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:522:1: ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:522:1: ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:522:2: ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )?
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:522:2: ( (lv_name_0_0= ruleFolderName ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:523:1: (lv_name_0_0= ruleFolderName )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:523:1: (lv_name_0_0= ruleFolderName )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:524:3: lv_name_0_0= ruleFolderName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getNameFolderNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_ruleEmfsContainer1203);
            lv_name_0_0=ruleFolderName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEmfsContainerRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"FolderName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:540:2: (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==9) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:540:4: otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) )
            	    {
            	    otherlv_1=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleEmfsContainer1216); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEmfsContainerAccess().getNumberSignKeyword_1_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:544:1: ( (lv_tags_2_0= ruleEmfsName ) )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:545:1: (lv_tags_2_0= ruleEmfsName )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:545:1: (lv_tags_2_0= ruleEmfsName )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:546:3: lv_tags_2_0= ruleEmfsName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getTagsEmfsNameParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleEmfsContainer1237);
            	    lv_tags_2_0=ruleEmfsName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmfsContainerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tags",
            	              		lv_tags_2_0, 
            	              		"EmfsName");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:562:4: ( (lv_properties_3_0= ruleProperty ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:563:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:563:1: (lv_properties_3_0= ruleProperty )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:564:3: lv_properties_3_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleEmfsContainer1260);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmfsContainerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_3_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:580:3: (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==10) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:580:5: otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,10,FollowSets000.FOLLOW_10_in_ruleEmfsContainer1274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEmfsContainerAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:584:1: ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:585:1: ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:585:1: ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:586:1: (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:586:1: (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==37) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:587:3: lv_contentProvider_5_1= ruleGitContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getContentProviderGitContentProviderParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_ruleEmfsContainer1297);
                            lv_contentProvider_5_1=ruleGitContentProvider();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsContainerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_5_1, 
                                      		"GitContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:602:8: lv_contentProvider_5_2= ruleEmfsResourcesRef
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getContentProviderEmfsResourcesRefParserRuleCall_3_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_ruleEmfsContainer1316);
                            lv_contentProvider_5_2=ruleEmfsResourcesRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsContainerRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_5_2, 
                                      		"EmfsResourcesRef");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmfsContainer1331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:624:3: ( (lv_resources_7_0= ruleEmfsResource ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }
                else if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:625:1: (lv_resources_7_0= ruleEmfsResource )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:625:1: (lv_resources_7_0= ruleEmfsResource )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:626:3: lv_resources_7_0= ruleEmfsResource
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getResourcesEmfsResourceParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_ruleEmfsContainer1354);
            	    lv_resources_7_0=ruleEmfsResource();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmfsContainerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"resources",
            	              		lv_resources_7_0, 
            	              		"EmfsResource");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:642:3: ( ( ';' )=>otherlv_8= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==11) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred1_InternalXemfs()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:642:4: ( ';' )=>otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmfsContainer1375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_5());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmfsContainer"


    // $ANTLR start "entryRuleGitContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:655:1: entryRuleGitContentProvider returns [EObject current=null] : iv_ruleGitContentProvider= ruleGitContentProvider EOF ;
    public final EObject entryRuleGitContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitContentProvider = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:656:2: (iv_ruleGitContentProvider= ruleGitContentProvider EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:657:2: iv_ruleGitContentProvider= ruleGitContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGitContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_entryRuleGitContentProvider1413);
            iv_ruleGitContentProvider=ruleGitContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGitContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitContentProvider1423); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGitContentProvider"


    // $ANTLR start "ruleGitContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:664:1: ruleGitContentProvider returns [EObject current=null] : ( (lv_gitRef_0_0= ruleGitContentRef ) ) ;
    public final EObject ruleGitContentProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_gitRef_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:667:28: ( ( (lv_gitRef_0_0= ruleGitContentRef ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:668:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:668:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:669:1: (lv_gitRef_0_0= ruleGitContentRef )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:669:1: (lv_gitRef_0_0= ruleGitContentRef )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:670:3: lv_gitRef_0_0= ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGitContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_ruleGitContentProvider1468);
            lv_gitRef_0_0=ruleGitContentRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGitContentProviderRule());
              	        }
                     		set(
                     			current, 
                     			"gitRef",
                      		lv_gitRef_0_0, 
                      		"GitContentRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGitContentProvider"


    // $ANTLR start "entryRuleFileName"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:694:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:695:2: (iv_ruleFileName= ruleFileName EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:696:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_entryRuleFileName1504);
            iv_ruleFileName=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFileName1515); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileName"


    // $ANTLR start "ruleFileName"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:703:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Name_0= ruleName ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:706:28: (this_Name_0= ruleName )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:708:5: this_Name_0= ruleName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFileNameAccess().getNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleName_in_ruleFileName1561);
            this_Name_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Name_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileName"


    // $ANTLR start "entryRuleEmfsFile"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:726:1: entryRuleEmfsFile returns [EObject current=null] : iv_ruleEmfsFile= ruleEmfsFile EOF ;
    public final EObject entryRuleEmfsFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsFile = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:727:2: (iv_ruleEmfsFile= ruleEmfsFile EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:728:2: iv_ruleEmfsFile= ruleEmfsFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsFile_in_entryRuleEmfsFile1605);
            iv_ruleEmfsFile=ruleEmfsFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsFile1615); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmfsFile"


    // $ANTLR start "ruleEmfsFile"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:735:1: ruleEmfsFile returns [EObject current=null] : ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) ) ;
    public final EObject ruleEmfsFile() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token lv_tags_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_properties_4_0 = null;

        EObject lv_contentProvider_6_1 = null;

        EObject lv_contentProvider_6_2 = null;

        EObject lv_contentProvider_8_1 = null;

        EObject lv_contentProvider_8_2 = null;

        EObject lv_contentProvider_10_1 = null;

        EObject lv_contentProvider_10_2 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:738:28: ( ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:739:1: ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:739:1: ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:739:2: ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:739:2: ( (lv_name_0_0= ruleFileName ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:740:1: (lv_name_0_0= ruleFileName )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:740:1: (lv_name_0_0= ruleFileName )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:741:3: lv_name_0_0= ruleFileName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getNameFileNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleEmfsFile1661);
            lv_name_0_0=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEmfsFileRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"FileName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:757:2: ( (lv_writeable_1_0= '*' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:758:1: (lv_writeable_1_0= '*' )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:758:1: (lv_writeable_1_0= '*' )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:759:3: lv_writeable_1_0= '*'
                    {
                    lv_writeable_1_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEmfsFile1679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getEmfsFileAccess().getWriteableAsteriskKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEmfsFileRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "*");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:772:3: (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==9) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:772:5: otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleEmfsFile1706); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getEmfsFileAccess().getNumberSignKeyword_2_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:776:1: ( (lv_tags_3_0= RULE_ID ) )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:777:1: (lv_tags_3_0= RULE_ID )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:777:1: (lv_tags_3_0= RULE_ID )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:778:3: lv_tags_3_0= RULE_ID
            	    {
            	    lv_tags_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmfsFile1723); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_tags_3_0, grammarAccess.getEmfsFileAccess().getTagsIDTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEmfsFileRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"tags",
            	              		lv_tags_3_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:794:4: ( (lv_properties_4_0= ruleProperty ) )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:795:1: (lv_properties_4_0= ruleProperty )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:795:1: (lv_properties_4_0= ruleProperty )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:796:3: lv_properties_4_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsFileAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleEmfsFile1751);
            	    lv_properties_4_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmfsFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_4_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:812:3: ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt25=1;
                }
                break;
            case RULE_STRING:
            case RULE_STRING_CONTENT:
            case 15:
                {
                alt25=2;
                }
                break;
            case 19:
                {
                alt25=3;
                }
                break;
            case 11:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:812:4: (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:812:4: (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:812:6: otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEmfsFile1766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmfsFileAccess().getCommercialAtKeyword_4_0_0());
                          
                    }
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:816:1: ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:817:1: ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:817:1: ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:818:1: (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:818:1: (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_STRING||(LA22_0>=22 && LA22_0<=25)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==37) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:819:3: lv_contentProvider_6_1= ruleURLContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderURLContentProviderParserRuleCall_4_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_ruleEmfsFile1789);
                            lv_contentProvider_6_1=ruleURLContentProvider();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsFileRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_6_1, 
                                      		"URLContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:834:8: lv_contentProvider_6_2= ruleGitURLContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderGitURLContentProviderParserRuleCall_4_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_ruleEmfsFile1808);
                            lv_contentProvider_6_2=ruleGitURLContentProvider();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsFileRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_6_2, 
                                      		"GitURLContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmfsFile1823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:857:6: ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:857:6: ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:858:1: ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:858:1: ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:859:1: (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:859:1: (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider )
                    int alt23=2;
                    alt23 = dfa23.predict(input);
                    switch (alt23) {
                        case 1 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:860:3: lv_contentProvider_8_1= ruleStringContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderStringContentProviderParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleStringContentProvider_in_ruleEmfsFile1853);
                            lv_contentProvider_8_1=ruleStringContentProvider();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsFileRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_8_1, 
                                      		"StringContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:875:8: lv_contentProvider_8_2= ruleWrappingStringContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderWrappingStringContentProviderParserRuleCall_4_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleWrappingStringContentProvider_in_ruleEmfsFile1872);
                            lv_contentProvider_8_2=ruleWrappingStringContentProvider();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsFileRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_8_2, 
                                      		"WrappingStringContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:894:6: (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:894:6: (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:894:8: otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) )
                    {
                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEmfsFile1894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getEmfsFileAccess().getColonKeyword_4_2_0());
                          
                    }
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:898:1: ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:899:1: ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:899:1: ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:900:1: (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:900:1: (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==38) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==41) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:901:3: lv_contentProvider_10_1= ruleDotClasspathFileContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderDotClasspathFileContentProviderParserRuleCall_4_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleDotClasspathFileContentProvider_in_ruleEmfsFile1917);
                            lv_contentProvider_10_1=ruleDotClasspathFileContentProvider();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsFileRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_10_1, 
                                      		"DotClasspathFileContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:916:8: lv_contentProvider_10_2= ruleDotProjectFileContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderDotProjectFileContentProviderParserRuleCall_4_2_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleDotProjectFileContentProvider_in_ruleEmfsFile1936);
                            lv_contentProvider_10_2=ruleDotProjectFileContentProvider();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsFileRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_10_2, 
                                      		"DotProjectFileContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:935:7: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmfsFile1958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmfsFile"


    // $ANTLR start "entryRuleStringContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:947:1: entryRuleStringContentProvider returns [EObject current=null] : iv_ruleStringContentProvider= ruleStringContentProvider EOF ;
    public final EObject entryRuleStringContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringContentProvider = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:948:2: (iv_ruleStringContentProvider= ruleStringContentProvider EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:949:2: iv_ruleStringContentProvider= ruleStringContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringContentProvider_in_entryRuleStringContentProvider1995);
            iv_ruleStringContentProvider=ruleStringContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringContentProvider2005); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringContentProvider"


    // $ANTLR start "ruleStringContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:956:1: ruleStringContentProvider returns [EObject current=null] : ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+ ;
    public final EObject ruleStringContentProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_stringContents_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:959:28: ( ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+ )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:960:1: ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:960:1: ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_STRING_CONTENT)||LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:961:1: (lv_stringContents_0_0= ruleAbstractStringContents )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:961:1: (lv_stringContents_0_0= ruleAbstractStringContents )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:962:3: lv_stringContents_0_0= ruleAbstractStringContents
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringContentProviderAccess().getStringContentsAbstractStringContentsParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_ruleStringContentProvider2050);
            	    lv_stringContents_0_0=ruleAbstractStringContents();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStringContentProviderRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"stringContents",
            	              		lv_stringContents_0_0, 
            	              		"AbstractStringContents");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringContentProvider"


    // $ANTLR start "entryRuleAbstractStringContents"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:986:1: entryRuleAbstractStringContents returns [EObject current=null] : iv_ruleAbstractStringContents= ruleAbstractStringContents EOF ;
    public final EObject entryRuleAbstractStringContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractStringContents = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:987:2: (iv_ruleAbstractStringContents= ruleAbstractStringContents EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:988:2: iv_ruleAbstractStringContents= ruleAbstractStringContents EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_entryRuleAbstractStringContents2086);
            iv_ruleAbstractStringContents=ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractStringContents; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractStringContents2096); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractStringContents"


    // $ANTLR start "ruleAbstractStringContents"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:995:1: ruleAbstractStringContents returns [EObject current=null] : (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents ) ;
    public final EObject ruleAbstractStringContents() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueString_0 = null;

        EObject this_VerbatimStringContents_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:998:28: ( (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:999:1: (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:999:1: (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_STRING_CONTENT)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1000:5: this_PropertyValueString_0= rulePropertyValueString
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractStringContentsAccess().getPropertyValueStringParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyValueString_in_ruleAbstractStringContents2143);
                    this_PropertyValueString_0=rulePropertyValueString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyValueString_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1010:5: this_VerbatimStringContents_1= ruleVerbatimStringContents
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractStringContentsAccess().getVerbatimStringContentsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVerbatimStringContents_in_ruleAbstractStringContents2170);
                    this_VerbatimStringContents_1=ruleVerbatimStringContents();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VerbatimStringContents_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractStringContents"


    // $ANTLR start "entryRuleVerbatimStringContents"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1026:1: entryRuleVerbatimStringContents returns [EObject current=null] : iv_ruleVerbatimStringContents= ruleVerbatimStringContents EOF ;
    public final EObject entryRuleVerbatimStringContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbatimStringContents = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1027:2: (iv_ruleVerbatimStringContents= ruleVerbatimStringContents EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1028:2: iv_ruleVerbatimStringContents= ruleVerbatimStringContents EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVerbatimStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVerbatimStringContents_in_entryRuleVerbatimStringContents2205);
            iv_ruleVerbatimStringContents=ruleVerbatimStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVerbatimStringContents; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVerbatimStringContents2215); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerbatimStringContents"


    // $ANTLR start "ruleVerbatimStringContents"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1035:1: ruleVerbatimStringContents returns [EObject current=null] : ( ( (lv_stringContent_0_1= RULE_STRING | lv_stringContent_0_2= RULE_STRING_CONTENT ) ) ) ;
    public final EObject ruleVerbatimStringContents() throws RecognitionException {
        EObject current = null;

        Token lv_stringContent_0_1=null;
        Token lv_stringContent_0_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1038:28: ( ( ( (lv_stringContent_0_1= RULE_STRING | lv_stringContent_0_2= RULE_STRING_CONTENT ) ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1039:1: ( ( (lv_stringContent_0_1= RULE_STRING | lv_stringContent_0_2= RULE_STRING_CONTENT ) ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1039:1: ( ( (lv_stringContent_0_1= RULE_STRING | lv_stringContent_0_2= RULE_STRING_CONTENT ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1040:1: ( (lv_stringContent_0_1= RULE_STRING | lv_stringContent_0_2= RULE_STRING_CONTENT ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1040:1: ( (lv_stringContent_0_1= RULE_STRING | lv_stringContent_0_2= RULE_STRING_CONTENT ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1041:1: (lv_stringContent_0_1= RULE_STRING | lv_stringContent_0_2= RULE_STRING_CONTENT )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1041:1: (lv_stringContent_0_1= RULE_STRING | lv_stringContent_0_2= RULE_STRING_CONTENT )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_STRING_CONTENT) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1042:3: lv_stringContent_0_1= RULE_STRING
                    {
                    lv_stringContent_0_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleVerbatimStringContents2258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_stringContent_0_1, grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRINGTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVerbatimStringContentsRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"stringContent",
                              		lv_stringContent_0_1, 
                              		"STRING");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1057:8: lv_stringContent_0_2= RULE_STRING_CONTENT
                    {
                    lv_stringContent_0_2=(Token)match(input,RULE_STRING_CONTENT,FollowSets000.FOLLOW_RULE_STRING_CONTENT_in_ruleVerbatimStringContents2278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_stringContent_0_2, grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRING_CONTENTTerminalRuleCall_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVerbatimStringContentsRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"stringContent",
                              		lv_stringContent_0_2, 
                              		"STRING_CONTENT");
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerbatimStringContents"


    // $ANTLR start "entryRulePropertyValueString"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1083:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1084:2: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1085:2: iv_rulePropertyValueString= rulePropertyValueString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyValueString_in_entryRulePropertyValueString2321);
            iv_rulePropertyValueString=rulePropertyValueString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValueString; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyValueString2331); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValueString"


    // $ANTLR start "rulePropertyValueString"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1092:1: rulePropertyValueString returns [EObject current=null] : (otherlv_0= '$' ( ( (lv_propertyName_1_0= RULE_ID ) ) | (otherlv_2= '{' ( (lv_propertyName_3_0= ruleEmfsName ) ) otherlv_4= '}' ) ) (otherlv_5= ':' ( ( (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName ) ) ) )? ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_propertyName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_defaultValue_6_1=null;
        AntlrDatatypeRuleToken lv_propertyName_3_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_6_2 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1095:28: ( (otherlv_0= '$' ( ( (lv_propertyName_1_0= RULE_ID ) ) | (otherlv_2= '{' ( (lv_propertyName_3_0= ruleEmfsName ) ) otherlv_4= '}' ) ) (otherlv_5= ':' ( ( (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName ) ) ) )? ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1096:1: (otherlv_0= '$' ( ( (lv_propertyName_1_0= RULE_ID ) ) | (otherlv_2= '{' ( (lv_propertyName_3_0= ruleEmfsName ) ) otherlv_4= '}' ) ) (otherlv_5= ':' ( ( (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName ) ) ) )? )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1096:1: (otherlv_0= '$' ( ( (lv_propertyName_1_0= RULE_ID ) ) | (otherlv_2= '{' ( (lv_propertyName_3_0= ruleEmfsName ) ) otherlv_4= '}' ) ) (otherlv_5= ':' ( ( (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName ) ) ) )? )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1096:3: otherlv_0= '$' ( ( (lv_propertyName_1_0= RULE_ID ) ) | (otherlv_2= '{' ( (lv_propertyName_3_0= ruleEmfsName ) ) otherlv_4= '}' ) ) (otherlv_5= ':' ( ( (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName ) ) ) )?
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePropertyValueString2368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyValueStringAccess().getDollarSignKeyword_0());
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1100:1: ( ( (lv_propertyName_1_0= RULE_ID ) ) | (otherlv_2= '{' ( (lv_propertyName_3_0= ruleEmfsName ) ) otherlv_4= '}' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==20) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1100:2: ( (lv_propertyName_1_0= RULE_ID ) )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1100:2: ( (lv_propertyName_1_0= RULE_ID ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1101:1: (lv_propertyName_1_0= RULE_ID )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1101:1: (lv_propertyName_1_0= RULE_ID )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1102:3: lv_propertyName_1_0= RULE_ID
                    {
                    lv_propertyName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyValueString2386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_propertyName_1_0, grammarAccess.getPropertyValueStringAccess().getPropertyNameIDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyValueStringRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"propertyName",
                              		lv_propertyName_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1119:6: (otherlv_2= '{' ( (lv_propertyName_3_0= ruleEmfsName ) ) otherlv_4= '}' )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1119:6: (otherlv_2= '{' ( (lv_propertyName_3_0= ruleEmfsName ) ) otherlv_4= '}' )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1119:8: otherlv_2= '{' ( (lv_propertyName_3_0= ruleEmfsName ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePropertyValueString2410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPropertyValueStringAccess().getLeftCurlyBracketKeyword_1_1_0());
                          
                    }
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1123:1: ( (lv_propertyName_3_0= ruleEmfsName ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1124:1: (lv_propertyName_3_0= ruleEmfsName )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1124:1: (lv_propertyName_3_0= ruleEmfsName )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1125:3: lv_propertyName_3_0= ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyValueStringAccess().getPropertyNameEmfsNameParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rulePropertyValueString2431);
                    lv_propertyName_3_0=ruleEmfsName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyValueStringRule());
                      	        }
                             		set(
                             			current, 
                             			"propertyName",
                              		lv_propertyName_3_0, 
                              		"EmfsName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePropertyValueString2443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyValueStringAccess().getRightCurlyBracketKeyword_1_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1145:3: (otherlv_5= ':' ( ( (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName ) ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1145:5: otherlv_5= ':' ( ( (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName ) ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePropertyValueString2458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyValueStringAccess().getColonKeyword_2_0());
                          
                    }
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1149:1: ( ( (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName ) ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1150:1: ( (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName ) )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1150:1: ( (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1151:1: (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1151:1: (lv_defaultValue_6_1= RULE_STRING | lv_defaultValue_6_2= ruleEmfsName )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_STRING) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==RULE_ID) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1152:3: lv_defaultValue_6_1= RULE_STRING
                            {
                            lv_defaultValue_6_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePropertyValueString2477); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_defaultValue_6_1, grammarAccess.getPropertyValueStringAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPropertyValueStringRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"defaultValue",
                                      		lv_defaultValue_6_1, 
                                      		"STRING");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1167:8: lv_defaultValue_6_2= ruleEmfsName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPropertyValueStringAccess().getDefaultValueEmfsNameParserRuleCall_2_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rulePropertyValueString2501);
                            lv_defaultValue_6_2=ruleEmfsName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPropertyValueStringRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"defaultValue",
                                      		lv_defaultValue_6_2, 
                                      		"EmfsName");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValueString"


    // $ANTLR start "entryRuleWrappingStringContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1193:1: entryRuleWrappingStringContentProvider returns [EObject current=null] : iv_ruleWrappingStringContentProvider= ruleWrappingStringContentProvider EOF ;
    public final EObject entryRuleWrappingStringContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrappingStringContentProvider = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1194:2: (iv_ruleWrappingStringContentProvider= ruleWrappingStringContentProvider EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1195:2: iv_ruleWrappingStringContentProvider= ruleWrappingStringContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWrappingStringContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWrappingStringContentProvider_in_entryRuleWrappingStringContentProvider2542);
            iv_ruleWrappingStringContentProvider=ruleWrappingStringContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWrappingStringContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWrappingStringContentProvider2552); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrappingStringContentProvider"


    // $ANTLR start "ruleWrappingStringContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1202:1: ruleWrappingStringContentProvider returns [EObject current=null] : ( ( (lv_prefix_0_0= ruleAbstractStringContents ) ) (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) ) ( (lv_suffix_3_0= ruleAbstractStringContents ) ) ) ;
    public final EObject ruleWrappingStringContentProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_prefix_0_0 = null;

        EObject lv_contentProvider_2_1 = null;

        EObject lv_contentProvider_2_2 = null;

        EObject lv_suffix_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1205:28: ( ( ( (lv_prefix_0_0= ruleAbstractStringContents ) ) (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) ) ( (lv_suffix_3_0= ruleAbstractStringContents ) ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1206:1: ( ( (lv_prefix_0_0= ruleAbstractStringContents ) ) (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) ) ( (lv_suffix_3_0= ruleAbstractStringContents ) ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1206:1: ( ( (lv_prefix_0_0= ruleAbstractStringContents ) ) (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) ) ( (lv_suffix_3_0= ruleAbstractStringContents ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1206:2: ( (lv_prefix_0_0= ruleAbstractStringContents ) ) (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) ) ( (lv_suffix_3_0= ruleAbstractStringContents ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1206:2: ( (lv_prefix_0_0= ruleAbstractStringContents ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1207:1: (lv_prefix_0_0= ruleAbstractStringContents )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1207:1: (lv_prefix_0_0= ruleAbstractStringContents )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1208:3: lv_prefix_0_0= ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAbstractStringContentsParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_ruleWrappingStringContentProvider2598);
            lv_prefix_0_0=ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWrappingStringContentProviderRule());
              	        }
                     		set(
                     			current, 
                     			"prefix",
                      		lv_prefix_0_0, 
                      		"AbstractStringContents");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1224:2: (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1224:4: otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) )
            {
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWrappingStringContentProvider2611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWrappingStringContentProviderAccess().getCommercialAtKeyword_1_0());
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1228:1: ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1229:1: ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1229:1: ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1230:1: (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1230:1: (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING||(LA32_0>=22 && LA32_0<=25)) ) {
                alt32=1;
            }
            else if ( (LA32_0==37) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1231:3: lv_contentProvider_2_1= ruleURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderURLContentProviderParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_ruleWrappingStringContentProvider2634);
                    lv_contentProvider_2_1=ruleURLContentProvider();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWrappingStringContentProviderRule());
                      	        }
                             		set(
                             			current, 
                             			"contentProvider",
                              		lv_contentProvider_2_1, 
                              		"URLContentProvider");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1246:8: lv_contentProvider_2_2= ruleGitURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderGitURLContentProviderParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_ruleWrappingStringContentProvider2653);
                    lv_contentProvider_2_2=ruleGitURLContentProvider();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWrappingStringContentProviderRule());
                      	        }
                             		set(
                             			current, 
                             			"contentProvider",
                              		lv_contentProvider_2_2, 
                              		"GitURLContentProvider");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1264:3: ( (lv_suffix_3_0= ruleAbstractStringContents ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1265:1: (lv_suffix_3_0= ruleAbstractStringContents )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1265:1: (lv_suffix_3_0= ruleAbstractStringContents )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1266:3: lv_suffix_3_0= ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAbstractStringContentsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_ruleWrappingStringContentProvider2678);
            lv_suffix_3_0=ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWrappingStringContentProviderRule());
              	        }
                     		set(
                     			current, 
                     			"suffix",
                      		lv_suffix_3_0, 
                      		"AbstractStringContents");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrappingStringContentProvider"


    // $ANTLR start "entryRuleURL_SCHEME"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1290:1: entryRuleURL_SCHEME returns [String current=null] : iv_ruleURL_SCHEME= ruleURL_SCHEME EOF ;
    public final String entryRuleURL_SCHEME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_SCHEME = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1291:2: (iv_ruleURL_SCHEME= ruleURL_SCHEME EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1292:2: iv_ruleURL_SCHEME= ruleURL_SCHEME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_SCHEMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_SCHEME_in_entryRuleURL_SCHEME2715);
            iv_ruleURL_SCHEME=ruleURL_SCHEME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_SCHEME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_SCHEME2726); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURL_SCHEME"


    // $ANTLR start "ruleURL_SCHEME"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1299:1: ruleURL_SCHEME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' ) ;
    public final AntlrDatatypeRuleToken ruleURL_SCHEME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1302:28: ( (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1303:1: (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1303:1: (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt33=1;
                }
                break;
            case 23:
                {
                alt33=2;
                }
                break;
            case 24:
                {
                alt33=3;
                }
                break;
            case 25:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1304:2: kw= 'http'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleURL_SCHEME2764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_SCHEMEAccess().getHttpKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1311:2: kw= 'https'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleURL_SCHEME2783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_SCHEMEAccess().getHttpsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1318:2: kw= 'ftp'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleURL_SCHEME2802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_SCHEMEAccess().getFtpKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1325:2: kw= 'file'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleURL_SCHEME2821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_SCHEMEAccess().getFileKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURL_SCHEME"


    // $ANTLR start "entryRuleURL_HOST"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1338:1: entryRuleURL_HOST returns [String current=null] : iv_ruleURL_HOST= ruleURL_HOST EOF ;
    public final String entryRuleURL_HOST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_HOST = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1339:2: (iv_ruleURL_HOST= ruleURL_HOST EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1340:2: iv_ruleURL_HOST= ruleURL_HOST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_HOSTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_in_entryRuleURL_HOST2862);
            iv_ruleURL_HOST=ruleURL_HOST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_HOST.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_HOST2873); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURL_HOST"


    // $ANTLR start "ruleURL_HOST"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1347:1: ruleURL_HOST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '//' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) ;
    public final AntlrDatatypeRuleToken ruleURL_HOST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1350:28: ( (kw= '//' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1351:1: (kw= '//' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1351:1: (kw= '//' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1352:2: kw= '//' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )?
            {
            kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleURL_HOST2911); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getSolidusSolidusKeyword_0()); 
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleURL_HOST2926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getURL_HOSTAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1364:1: (kw= '.' this_ID_3= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==13) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1365:2: kw= '.' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleURL_HOST2945); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getFullStopKeyword_2_0()); 
            	          
            	    }
            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleURL_HOST2960); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getURL_HOSTAccess().getIDTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1377:3: (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1378:2: kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleURL_HOST2981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getColonKeyword_3_0()); 
                          
                    }
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1383:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=11;
                        switch ( input.LA(1) ) {
                        case 27:
                            {
                            alt35=1;
                            }
                            break;
                        case 28:
                            {
                            alt35=2;
                            }
                            break;
                        case 29:
                            {
                            alt35=3;
                            }
                            break;
                        case 30:
                            {
                            alt35=4;
                            }
                            break;
                        case 31:
                            {
                            alt35=5;
                            }
                            break;
                        case 32:
                            {
                            alt35=6;
                            }
                            break;
                        case 33:
                            {
                            alt35=7;
                            }
                            break;
                        case 34:
                            {
                            alt35=8;
                            }
                            break;
                        case 35:
                            {
                            alt35=9;
                            }
                            break;
                        case 36:
                            {
                            alt35=10;
                            }
                            break;

                        }

                        switch (alt35) {
                    	case 1 :
                    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1384:2: kw= '0'
                    	    {
                    	    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleURL_HOST2995); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitZeroKeyword_3_1_0()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1391:2: kw= '1'
                    	    {
                    	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleURL_HOST3014); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitOneKeyword_3_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1398:2: kw= '2'
                    	    {
                    	    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleURL_HOST3033); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitTwoKeyword_3_1_2()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1405:2: kw= '3'
                    	    {
                    	    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleURL_HOST3052); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitThreeKeyword_3_1_3()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1412:2: kw= '4'
                    	    {
                    	    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleURL_HOST3071); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitFourKeyword_3_1_4()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1419:2: kw= '5'
                    	    {
                    	    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleURL_HOST3090); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitFiveKeyword_3_1_5()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1426:2: kw= '6'
                    	    {
                    	    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleURL_HOST3109); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitSixKeyword_3_1_6()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 8 :
                    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1433:2: kw= '7'
                    	    {
                    	    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleURL_HOST3128); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitSevenKeyword_3_1_7()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 9 :
                    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1440:2: kw= '8'
                    	    {
                    	    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleURL_HOST3147); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitEightKeyword_3_1_8()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 10 :
                    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1447:2: kw= '9'
                    	    {
                    	    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleURL_HOST3166); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitNineKeyword_3_1_9()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURL_HOST"


    // $ANTLR start "entryRuleURL_PATH"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1460:1: entryRuleURL_PATH returns [String current=null] : iv_ruleURL_PATH= ruleURL_PATH EOF ;
    public final String entryRuleURL_PATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_PATH = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1461:2: (iv_ruleURL_PATH= ruleURL_PATH EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1462:2: iv_ruleURL_PATH= ruleURL_PATH EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_entryRuleURL_PATH3211);
            iv_ruleURL_PATH=ruleURL_PATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_PATH.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_PATH3222); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURL_PATH"


    // $ANTLR start "ruleURL_PATH"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1469:1: ruleURL_PATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' (this_FolderName_1= ruleFolderName )* this_FileName_2= ruleFileName ) ;
    public final AntlrDatatypeRuleToken ruleURL_PATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FolderName_1 = null;

        AntlrDatatypeRuleToken this_FileName_2 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1472:28: ( (kw= '/' (this_FolderName_1= ruleFolderName )* this_FileName_2= ruleFileName ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1473:1: (kw= '/' (this_FolderName_1= ruleFolderName )* this_FileName_2= ruleFileName )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1473:1: (kw= '/' (this_FolderName_1= ruleFolderName )* this_FileName_2= ruleFileName )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1474:2: kw= '/' (this_FolderName_1= ruleFolderName )* this_FileName_2= ruleFileName
            {
            kw=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleURL_PATH3260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getURL_PATHAccess().getSolidusKeyword_0()); 
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1479:1: (this_FolderName_1= ruleFolderName )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1480:5: this_FolderName_1= ruleFolderName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getURL_PATHAccess().getFolderNameParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_ruleURL_PATH3283);
            	    this_FolderName_1=ruleFolderName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_FolderName_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getURL_PATHAccess().getFileNameParserRuleCall_2()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleURL_PATH3312);
            this_FileName_2=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FileName_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURL_PATH"


    // $ANTLR start "entryRuleURL"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1509:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1510:2: (iv_ruleURL= ruleURL EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1511:2: iv_ruleURL= ruleURL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_in_entryRuleURL3358);
            iv_ruleURL=ruleURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL3369); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1518:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_URL_SCHEME_0 = null;

        AntlrDatatypeRuleToken this_URL_HOST_2 = null;

        AntlrDatatypeRuleToken this_URL_PATH_3 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1521:28: ( (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1522:1: (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1522:1: (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1523:5: this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getURLAccess().getURL_SCHEMEParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_SCHEME_in_ruleURL3416);
            this_URL_SCHEME_0=ruleURL_SCHEME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_URL_SCHEME_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleURL3434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getURLAccess().getColonKeyword_1()); 
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1539:1: (this_URL_HOST_2= ruleURL_HOST )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1540:5: this_URL_HOST_2= ruleURL_HOST
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURLAccess().getURL_HOSTParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_in_ruleURL3457);
                    this_URL_HOST_2=ruleURL_HOST();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_URL_HOST_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getURLAccess().getURL_PATHParserRuleCall_3()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_ruleURL3486);
            this_URL_PATH_3=ruleURL_PATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_URL_PATH_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleURLContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1569:1: entryRuleURLContentProvider returns [EObject current=null] : iv_ruleURLContentProvider= ruleURLContentProvider EOF ;
    public final EObject entryRuleURLContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLContentProvider = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1570:2: (iv_ruleURLContentProvider= ruleURLContentProvider EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1571:2: iv_ruleURLContentProvider= ruleURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_entryRuleURLContentProvider3531);
            iv_ruleURLContentProvider=ruleURLContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURLContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURLContentProvider3541); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURLContentProvider"


    // $ANTLR start "ruleURLContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1578:1: ruleURLContentProvider returns [EObject current=null] : ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) ) ;
    public final EObject ruleURLContentProvider() throws RecognitionException {
        EObject current = null;

        Token lv_urlString_0_1=null;
        AntlrDatatypeRuleToken lv_urlString_0_2 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1581:28: ( ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1582:1: ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1582:1: ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1583:1: ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1583:1: ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1584:1: (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1584:1: (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=22 && LA39_0<=25)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1585:3: lv_urlString_0_1= RULE_STRING
                    {
                    lv_urlString_0_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleURLContentProvider3584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_urlString_0_1, grammarAccess.getURLContentProviderAccess().getUrlStringSTRINGTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getURLContentProviderRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"urlString",
                              		lv_urlString_0_1, 
                              		"STRING");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1600:8: lv_urlString_0_2= ruleURL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURLContentProviderAccess().getUrlStringURLParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURL_in_ruleURLContentProvider3608);
                    lv_urlString_0_2=ruleURL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getURLContentProviderRule());
                      	        }
                             		set(
                             			current, 
                             			"urlString",
                              		lv_urlString_0_2, 
                              		"URL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURLContentProvider"


    // $ANTLR start "entryRuleGitURLContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1626:1: entryRuleGitURLContentProvider returns [EObject current=null] : iv_ruleGitURLContentProvider= ruleGitURLContentProvider EOF ;
    public final EObject entryRuleGitURLContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitURLContentProvider = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1627:2: (iv_ruleGitURLContentProvider= ruleGitURLContentProvider EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1628:2: iv_ruleGitURLContentProvider= ruleGitURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGitURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_entryRuleGitURLContentProvider3646);
            iv_ruleGitURLContentProvider=ruleGitURLContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGitURLContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitURLContentProvider3656); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGitURLContentProvider"


    // $ANTLR start "ruleGitURLContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1635:1: ruleGitURLContentProvider returns [EObject current=null] : ( (lv_gitRef_0_0= ruleGitContentRef ) ) ;
    public final EObject ruleGitURLContentProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_gitRef_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1638:28: ( ( (lv_gitRef_0_0= ruleGitContentRef ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1639:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1639:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1640:1: (lv_gitRef_0_0= ruleGitContentRef )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1640:1: (lv_gitRef_0_0= ruleGitContentRef )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1641:3: lv_gitRef_0_0= ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGitURLContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_ruleGitURLContentProvider3701);
            lv_gitRef_0_0=ruleGitContentRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGitURLContentProviderRule());
              	        }
                     		set(
                     			current, 
                     			"gitRef",
                      		lv_gitRef_0_0, 
                      		"GitContentRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGitURLContentProvider"


    // $ANTLR start "entryRuleGIT_HOST"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1665:1: entryRuleGIT_HOST returns [String current=null] : iv_ruleGIT_HOST= ruleGIT_HOST EOF ;
    public final String entryRuleGIT_HOST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGIT_HOST = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1666:2: (iv_ruleGIT_HOST= ruleGIT_HOST EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1667:2: iv_ruleGIT_HOST= ruleGIT_HOST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIT_HOSTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGIT_HOST_in_entryRuleGIT_HOST3737);
            iv_ruleGIT_HOST=ruleGIT_HOST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIT_HOST.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGIT_HOST3748); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGIT_HOST"


    // $ANTLR start "ruleGIT_HOST"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1674:1: ruleGIT_HOST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleGIT_HOST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1677:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1678:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1678:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1678:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGIT_HOST3788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getGIT_HOSTAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1685:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==13) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1686:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGIT_HOST3807); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getGIT_HOSTAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGIT_HOST3822); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getGIT_HOSTAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGIT_HOST"


    // $ANTLR start "entryRuleGitContentRef"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1706:1: entryRuleGitContentRef returns [EObject current=null] : iv_ruleGitContentRef= ruleGitContentRef EOF ;
    public final EObject entryRuleGitContentRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitContentRef = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1707:2: (iv_ruleGitContentRef= ruleGitContentRef EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1708:2: iv_ruleGitContentRef= ruleGitContentRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGitContentRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_entryRuleGitContentRef3869);
            iv_ruleGitContentRef=ruleGitContentRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGitContentRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitContentRef3879); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGitContentRef"


    // $ANTLR start "ruleGitContentRef"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1715:1: ruleGitContentRef returns [EObject current=null] : (otherlv_0= 'git' otherlv_1= '@' ( ( ( (lv_host_2_0= ruleGIT_HOST ) ) (otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) ) )? ) | ( (lv_owner_5_0= RULE_ID ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? ) ;
    public final EObject ruleGitContentRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_owner_4_0=null;
        Token lv_owner_5_0=null;
        Token otherlv_6=null;
        Token lv_repo_7_0=null;
        AntlrDatatypeRuleToken lv_host_2_0 = null;

        AntlrDatatypeRuleToken lv_path_8_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1718:28: ( (otherlv_0= 'git' otherlv_1= '@' ( ( ( (lv_host_2_0= ruleGIT_HOST ) ) (otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) ) )? ) | ( (lv_owner_5_0= RULE_ID ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1719:1: (otherlv_0= 'git' otherlv_1= '@' ( ( ( (lv_host_2_0= ruleGIT_HOST ) ) (otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) ) )? ) | ( (lv_owner_5_0= RULE_ID ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1719:1: (otherlv_0= 'git' otherlv_1= '@' ( ( ( (lv_host_2_0= ruleGIT_HOST ) ) (otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) ) )? ) | ( (lv_owner_5_0= RULE_ID ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1719:3: otherlv_0= 'git' otherlv_1= '@' ( ( ( (lv_host_2_0= ruleGIT_HOST ) ) (otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) ) )? ) | ( (lv_owner_5_0= RULE_ID ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )?
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleGitContentRef3916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGitContentRefAccess().getGitKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGitContentRef3928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGitContentRefAccess().getCommercialAtKeyword_1());
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1727:1: ( ( ( (lv_host_2_0= ruleGIT_HOST ) ) (otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) ) )? ) | ( (lv_owner_5_0= RULE_ID ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==13) ) {
                    alt42=1;
                }
                else if ( (LA42_1==12) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1727:2: ( ( (lv_host_2_0= ruleGIT_HOST ) ) (otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) ) )? )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1727:2: ( ( (lv_host_2_0= ruleGIT_HOST ) ) (otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) ) )? )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1727:3: ( (lv_host_2_0= ruleGIT_HOST ) ) (otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) ) )?
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1727:3: ( (lv_host_2_0= ruleGIT_HOST ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1728:1: (lv_host_2_0= ruleGIT_HOST )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1728:1: (lv_host_2_0= ruleGIT_HOST )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1729:3: lv_host_2_0= ruleGIT_HOST
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGitContentRefAccess().getHostGIT_HOSTParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGIT_HOST_in_ruleGitContentRef3951);
                    lv_host_2_0=ruleGIT_HOST();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGitContentRefRule());
                      	        }
                             		set(
                             			current, 
                             			"host",
                              		lv_host_2_0, 
                              		"GIT_HOST");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1745:2: (otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==19) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1745:4: otherlv_3= ':' ( (lv_owner_4_0= RULE_ID ) )
                            {
                            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGitContentRef3964); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getGitContentRefAccess().getColonKeyword_2_0_1_0());
                                  
                            }
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1749:1: ( (lv_owner_4_0= RULE_ID ) )
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1750:1: (lv_owner_4_0= RULE_ID )
                            {
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1750:1: (lv_owner_4_0= RULE_ID )
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1751:3: lv_owner_4_0= RULE_ID
                            {
                            lv_owner_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGitContentRef3981); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_owner_4_0, grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_0_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGitContentRefRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"owner",
                                      		lv_owner_4_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1768:6: ( (lv_owner_5_0= RULE_ID ) )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1768:6: ( (lv_owner_5_0= RULE_ID ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1769:1: (lv_owner_5_0= RULE_ID )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1769:1: (lv_owner_5_0= RULE_ID )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1770:3: lv_owner_5_0= RULE_ID
                    {
                    lv_owner_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGitContentRef4012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_owner_5_0, grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGitContentRefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"owner",
                              		lv_owner_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGitContentRef4030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getGitContentRefAccess().getSolidusKeyword_3());
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1790:1: ( (lv_repo_7_0= RULE_ID ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1791:1: (lv_repo_7_0= RULE_ID )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1791:1: (lv_repo_7_0= RULE_ID )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1792:3: lv_repo_7_0= RULE_ID
            {
            lv_repo_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGitContentRef4047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_repo_7_0, grammarAccess.getGitContentRefAccess().getRepoIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGitContentRefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"repo",
                      		lv_repo_7_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1808:2: ( (lv_path_8_0= ruleURL_PATH ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==12) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1809:1: (lv_path_8_0= ruleURL_PATH )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1809:1: (lv_path_8_0= ruleURL_PATH )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1810:3: lv_path_8_0= ruleURL_PATH
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGitContentRefAccess().getPathURL_PATHParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_ruleGitContentRef4073);
                    lv_path_8_0=ruleURL_PATH();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGitContentRefRule());
                      	        }
                             		set(
                             			current, 
                             			"path",
                              		lv_path_8_0, 
                              		"URL_PATH");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGitContentRef"


    // $ANTLR start "entryRuleDotClasspathFileContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1834:1: entryRuleDotClasspathFileContentProvider returns [EObject current=null] : iv_ruleDotClasspathFileContentProvider= ruleDotClasspathFileContentProvider EOF ;
    public final EObject entryRuleDotClasspathFileContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotClasspathFileContentProvider = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1835:2: (iv_ruleDotClasspathFileContentProvider= ruleDotClasspathFileContentProvider EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1836:2: iv_ruleDotClasspathFileContentProvider= ruleDotClasspathFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotClasspathFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDotClasspathFileContentProvider_in_entryRuleDotClasspathFileContentProvider4110);
            iv_ruleDotClasspathFileContentProvider=ruleDotClasspathFileContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotClasspathFileContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotClasspathFileContentProvider4120); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotClasspathFileContentProvider"


    // $ANTLR start "ruleDotClasspathFileContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1843:1: ruleDotClasspathFileContentProvider returns [EObject current=null] : (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' ) ;
    public final EObject ruleDotClasspathFileContentProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1846:28: ( (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1847:1: (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1847:1: (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1847:3: otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDotClasspathFileContentProvider4157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDotClasspathFileContentProviderAccess().getDotClasspathKeyword_0());
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1851:1: ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=42 && LA44_0<=45)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1852:1: (lv_entries_1_0= ruleAbstractClasspathEntry )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1852:1: (lv_entries_1_0= ruleAbstractClasspathEntry )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1853:3: lv_entries_1_0= ruleAbstractClasspathEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAbstractClasspathEntryParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractClasspathEntry_in_ruleDotClasspathFileContentProvider4178);
            	    lv_entries_1_0=ruleAbstractClasspathEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDotClasspathFileContentProviderRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entries",
            	              		lv_entries_1_0, 
            	              		"AbstractClasspathEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDotClasspathFileContentProvider4191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDotClasspathFileContentProviderAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotClasspathFileContentProvider"


    // $ANTLR start "entryRuleAbstractClasspathEntry"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1881:1: entryRuleAbstractClasspathEntry returns [EObject current=null] : iv_ruleAbstractClasspathEntry= ruleAbstractClasspathEntry EOF ;
    public final EObject entryRuleAbstractClasspathEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClasspathEntry = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1882:2: (iv_ruleAbstractClasspathEntry= ruleAbstractClasspathEntry EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1883:2: iv_ruleAbstractClasspathEntry= ruleAbstractClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractClasspathEntry_in_entryRuleAbstractClasspathEntry4227);
            iv_ruleAbstractClasspathEntry=ruleAbstractClasspathEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractClasspathEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractClasspathEntry4237); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractClasspathEntry"


    // $ANTLR start "ruleAbstractClasspathEntry"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1890:1: ruleAbstractClasspathEntry returns [EObject current=null] : this_ClasspathEntry_0= ruleClasspathEntry ;
    public final EObject ruleAbstractClasspathEntry() throws RecognitionException {
        EObject current = null;

        EObject this_ClasspathEntry_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1893:28: (this_ClasspathEntry_0= ruleClasspathEntry )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1895:5: this_ClasspathEntry_0= ruleClasspathEntry
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAbstractClasspathEntryAccess().getClasspathEntryParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntry_in_ruleAbstractClasspathEntry4283);
            this_ClasspathEntry_0=ruleClasspathEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ClasspathEntry_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractClasspathEntry"


    // $ANTLR start "entryRuleCLASSPATH_ENTRY_PATH"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1911:1: entryRuleCLASSPATH_ENTRY_PATH returns [String current=null] : iv_ruleCLASSPATH_ENTRY_PATH= ruleCLASSPATH_ENTRY_PATH EOF ;
    public final String entryRuleCLASSPATH_ENTRY_PATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCLASSPATH_ENTRY_PATH = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1912:2: (iv_ruleCLASSPATH_ENTRY_PATH= ruleCLASSPATH_ENTRY_PATH EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1913:2: iv_ruleCLASSPATH_ENTRY_PATH= ruleCLASSPATH_ENTRY_PATH EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCLASSPATH_ENTRY_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_entryRuleCLASSPATH_ENTRY_PATH4318);
            iv_ruleCLASSPATH_ENTRY_PATH=ruleCLASSPATH_ENTRY_PATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCLASSPATH_ENTRY_PATH.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCLASSPATH_ENTRY_PATH4329); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCLASSPATH_ENTRY_PATH"


    // $ANTLR start "ruleCLASSPATH_ENTRY_PATH"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1920:1: ruleCLASSPATH_ENTRY_PATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName ) ;
    public final AntlrDatatypeRuleToken ruleCLASSPATH_ENTRY_PATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FolderName_0 = null;

        AntlrDatatypeRuleToken this_FileName_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1923:28: ( ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1924:1: ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1924:1: ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1924:2: (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1924:2: (this_FolderName_0= ruleFolderName )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1925:5: this_FolderName_0= ruleFolderName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFolderNameParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_ruleCLASSPATH_ENTRY_PATH4377);
            	    this_FolderName_0=ruleFolderName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_FolderName_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFileNameParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleCLASSPATH_ENTRY_PATH4406);
            this_FileName_1=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FileName_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCLASSPATH_ENTRY_PATH"


    // $ANTLR start "entryRuleClasspathEntry"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1954:1: entryRuleClasspathEntry returns [EObject current=null] : iv_ruleClasspathEntry= ruleClasspathEntry EOF ;
    public final EObject entryRuleClasspathEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasspathEntry = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1955:2: (iv_ruleClasspathEntry= ruleClasspathEntry EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1956:2: iv_ruleClasspathEntry= ruleClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntry_in_entryRuleClasspathEntry4451);
            iv_ruleClasspathEntry=ruleClasspathEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClasspathEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClasspathEntry4461); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClasspathEntry"


    // $ANTLR start "ruleClasspathEntry"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1963:1: ruleClasspathEntry returns [EObject current=null] : ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_explicitPath_1_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_2= '(' ( (lv_major_3_0= ruleVERSION ) ) (otherlv_4= '.' ( (lv_minor_5_0= ruleVERSION ) ) )? otherlv_6= ')' )? ) ;
    public final EObject ruleClasspathEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_explicitKind_0_0 = null;

        AntlrDatatypeRuleToken lv_explicitPath_1_0 = null;

        AntlrDatatypeRuleToken lv_major_3_0 = null;

        AntlrDatatypeRuleToken lv_minor_5_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1966:28: ( ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_explicitPath_1_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_2= '(' ( (lv_major_3_0= ruleVERSION ) ) (otherlv_4= '.' ( (lv_minor_5_0= ruleVERSION ) ) )? otherlv_6= ')' )? ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1967:1: ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_explicitPath_1_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_2= '(' ( (lv_major_3_0= ruleVERSION ) ) (otherlv_4= '.' ( (lv_minor_5_0= ruleVERSION ) ) )? otherlv_6= ')' )? )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1967:1: ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_explicitPath_1_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_2= '(' ( (lv_major_3_0= ruleVERSION ) ) (otherlv_4= '.' ( (lv_minor_5_0= ruleVERSION ) ) )? otherlv_6= ')' )? )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1967:2: ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_explicitPath_1_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_2= '(' ( (lv_major_3_0= ruleVERSION ) ) (otherlv_4= '.' ( (lv_minor_5_0= ruleVERSION ) ) )? otherlv_6= ')' )?
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1967:2: ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1968:1: (lv_explicitKind_0_0= ruleClasspathEntryKind )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1968:1: (lv_explicitKind_0_0= ruleClasspathEntryKind )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1969:3: lv_explicitKind_0_0= ruleClasspathEntryKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getExplicitKindClasspathEntryKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntryKind_in_ruleClasspathEntry4507);
            lv_explicitKind_0_0=ruleClasspathEntryKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClasspathEntryRule());
              	        }
                     		set(
                     			current, 
                     			"explicitKind",
                      		lv_explicitKind_0_0, 
                      		"ClasspathEntryKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1985:2: ( (lv_explicitPath_1_0= ruleCLASSPATH_ENTRY_PATH ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1986:1: (lv_explicitPath_1_0= ruleCLASSPATH_ENTRY_PATH )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1986:1: (lv_explicitPath_1_0= ruleCLASSPATH_ENTRY_PATH )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1987:3: lv_explicitPath_1_0= ruleCLASSPATH_ENTRY_PATH
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getExplicitPathCLASSPATH_ENTRY_PATHParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_ruleClasspathEntry4528);
            lv_explicitPath_1_0=ruleCLASSPATH_ENTRY_PATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClasspathEntryRule());
              	        }
                     		set(
                     			current, 
                     			"explicitPath",
                      		lv_explicitPath_1_0, 
                      		"CLASSPATH_ENTRY_PATH");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2003:2: (otherlv_2= '(' ( (lv_major_3_0= ruleVERSION ) ) (otherlv_4= '.' ( (lv_minor_5_0= ruleVERSION ) ) )? otherlv_6= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==39) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2003:4: otherlv_2= '(' ( (lv_major_3_0= ruleVERSION ) ) (otherlv_4= '.' ( (lv_minor_5_0= ruleVERSION ) ) )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleClasspathEntry4541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getClasspathEntryAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2007:1: ( (lv_major_3_0= ruleVERSION ) )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2008:1: (lv_major_3_0= ruleVERSION )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2008:1: (lv_major_3_0= ruleVERSION )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2009:3: lv_major_3_0= ruleVERSION
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getMajorVERSIONParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_ruleClasspathEntry4562);
                    lv_major_3_0=ruleVERSION();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClasspathEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"major",
                              		lv_major_3_0, 
                              		"VERSION");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2025:2: (otherlv_4= '.' ( (lv_minor_5_0= ruleVERSION ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==13) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2025:4: otherlv_4= '.' ( (lv_minor_5_0= ruleVERSION ) )
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClasspathEntry4575); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getClasspathEntryAccess().getFullStopKeyword_2_2_0());
                                  
                            }
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2029:1: ( (lv_minor_5_0= ruleVERSION ) )
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2030:1: (lv_minor_5_0= ruleVERSION )
                            {
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2030:1: (lv_minor_5_0= ruleVERSION )
                            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2031:3: lv_minor_5_0= ruleVERSION
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getMinorVERSIONParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_ruleClasspathEntry4596);
                            lv_minor_5_0=ruleVERSION();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getClasspathEntryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minor",
                                      		lv_minor_5_0, 
                                      		"VERSION");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleClasspathEntry4610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClasspathEntryAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClasspathEntry"


    // $ANTLR start "entryRuleVERSION"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2059:1: entryRuleVERSION returns [String current=null] : iv_ruleVERSION= ruleVERSION EOF ;
    public final String entryRuleVERSION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVERSION = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2060:2: (iv_ruleVERSION= ruleVERSION EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2061:2: iv_ruleVERSION= ruleVERSION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVERSIONRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_entryRuleVERSION4649);
            iv_ruleVERSION=ruleVERSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVERSION.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVERSION4660); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVERSION"


    // $ANTLR start "ruleVERSION"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2068:1: ruleVERSION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ ;
    public final AntlrDatatypeRuleToken ruleVERSION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2071:28: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2072:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2072:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
            int cnt48=0;
            loop48:
            do {
                int alt48=11;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    alt48=1;
                    }
                    break;
                case 28:
                    {
                    alt48=2;
                    }
                    break;
                case 29:
                    {
                    alt48=3;
                    }
                    break;
                case 30:
                    {
                    alt48=4;
                    }
                    break;
                case 31:
                    {
                    alt48=5;
                    }
                    break;
                case 32:
                    {
                    alt48=6;
                    }
                    break;
                case 33:
                    {
                    alt48=7;
                    }
                    break;
                case 34:
                    {
                    alt48=8;
                    }
                    break;
                case 35:
                    {
                    alt48=9;
                    }
                    break;
                case 36:
                    {
                    alt48=10;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2073:2: kw= '0'
            	    {
            	    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleVERSION4698); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitZeroKeyword_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2080:2: kw= '1'
            	    {
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleVERSION4717); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitOneKeyword_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2087:2: kw= '2'
            	    {
            	    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleVERSION4736); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitTwoKeyword_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2094:2: kw= '3'
            	    {
            	    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleVERSION4755); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitThreeKeyword_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2101:2: kw= '4'
            	    {
            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleVERSION4774); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitFourKeyword_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2108:2: kw= '5'
            	    {
            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleVERSION4793); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitFiveKeyword_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2115:2: kw= '6'
            	    {
            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleVERSION4812); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitSixKeyword_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2122:2: kw= '7'
            	    {
            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleVERSION4831); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitSevenKeyword_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2129:2: kw= '8'
            	    {
            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleVERSION4850); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitEightKeyword_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2136:2: kw= '9'
            	    {
            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleVERSION4869); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitNineKeyword_9()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVERSION"


    // $ANTLR start "entryRuleDotProjectFileContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2149:1: entryRuleDotProjectFileContentProvider returns [EObject current=null] : iv_ruleDotProjectFileContentProvider= ruleDotProjectFileContentProvider EOF ;
    public final EObject entryRuleDotProjectFileContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotProjectFileContentProvider = null;


        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2150:2: (iv_ruleDotProjectFileContentProvider= ruleDotProjectFileContentProvider EOF )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2151:2: iv_ruleDotProjectFileContentProvider= ruleDotProjectFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotProjectFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDotProjectFileContentProvider_in_entryRuleDotProjectFileContentProvider4910);
            iv_ruleDotProjectFileContentProvider=ruleDotProjectFileContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotProjectFileContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotProjectFileContentProvider4920); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotProjectFileContentProvider"


    // $ANTLR start "ruleDotProjectFileContentProvider"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2158:1: ruleDotProjectFileContentProvider returns [EObject current=null] : (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' ) ;
    public final EObject ruleDotProjectFileContentProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_keys_2_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_keys_2_2 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2161:28: ( (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2162:1: (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2162:1: (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2162:3: otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDotProjectFileContentProvider4957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDotProjectFileContentProviderAccess().getDotProjectKeyword_0());
                  
            }
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2166:1: (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==9) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2166:3: otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) )
            	    {
            	    otherlv_1=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleDotProjectFileContentProvider4970); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDotProjectFileContentProviderAccess().getNumberSignKeyword_1_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2170:1: ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2171:1: ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2171:1: ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2172:1: (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2172:1: (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName )
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==RULE_STRING) ) {
            	        alt49=1;
            	    }
            	    else if ( (LA49_0==RULE_ID||LA49_0==13) ) {
            	        alt49=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2173:3: lv_keys_2_1= RULE_STRING
            	            {
            	            lv_keys_2_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDotProjectFileContentProvider4989); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_keys_2_1, grammarAccess.getDotProjectFileContentProviderAccess().getKeysSTRINGTerminalRuleCall_1_1_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getDotProjectFileContentProviderRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"keys",
            	                      		lv_keys_2_1, 
            	                      		"STRING");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2188:8: lv_keys_2_2= ruleFileName
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDotProjectFileContentProviderAccess().getKeysFileNameParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleDotProjectFileContentProvider5013);
            	            lv_keys_2_2=ruleFileName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getDotProjectFileContentProviderRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"keys",
            	                      		lv_keys_2_2, 
            	                      		"FileName");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2206:4: (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==18) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2206:6: otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )*
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDotProjectFileContentProvider5031); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getDotProjectFileContentProviderAccess().getCommercialAtKeyword_2_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2210:1: ( ( ruleEmfsName ) )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2211:1: ( ruleEmfsName )
            	    {
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2211:1: ( ruleEmfsName )
            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2212:3: ruleEmfsName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDotProjectFileContentProviderRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleDotProjectFileContentProvider5054);
            	    ruleEmfsName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2225:2: (otherlv_5= ',' ( ( ruleEmfsName ) ) )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==14) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2225:4: otherlv_5= ',' ( ( ruleEmfsName ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDotProjectFileContentProvider5067); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_5, grammarAccess.getDotProjectFileContentProviderAccess().getCommaKeyword_2_2_0());
            	    	          
            	    	    }
            	    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2229:1: ( ( ruleEmfsName ) )
            	    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2230:1: ( ruleEmfsName )
            	    	    {
            	    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2230:1: ( ruleEmfsName )
            	    	    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2231:3: ruleEmfsName
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getDotProjectFileContentProviderRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleDotProjectFileContentProvider5090);
            	    	    ruleEmfsName();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDotProjectFileContentProvider5106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDotProjectFileContentProviderAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotProjectFileContentProvider"


    // $ANTLR start "ruleClasspathEntryKind"
    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2256:1: ruleClasspathEntryKind returns [Enumerator current=null] : ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) ) ;
    public final Enumerator ruleClasspathEntryKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2258:28: ( ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) ) )
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2259:1: ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) )
            {
            // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2259:1: ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt53=1;
                }
                break;
            case 43:
                {
                alt53=2;
                }
                break;
            case 44:
                {
                alt53=3;
                }
                break;
            case 45:
                {
                alt53=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2259:2: (enumLiteral_0= 'source-folder' )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2259:2: (enumLiteral_0= 'source-folder' )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2259:4: enumLiteral_0= 'source-folder'
                    {
                    enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleClasspathEntryKind5156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2265:6: (enumLiteral_1= 'output-folder' )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2265:6: (enumLiteral_1= 'output-folder' )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2265:8: enumLiteral_1= 'output-folder'
                    {
                    enumLiteral_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleClasspathEntryKind5173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2271:6: (enumLiteral_2= 'library-jar' )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2271:6: (enumLiteral_2= 'library-jar' )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2271:8: enumLiteral_2= 'library-jar'
                    {
                    enumLiteral_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleClasspathEntryKind5190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2277:6: (enumLiteral_3= 'class-container' )
                    {
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2277:6: (enumLiteral_3= 'class-container' )
                    // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2277:8: enumLiteral_3= 'class-container'
                    {
                    enumLiteral_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleClasspathEntryKind5207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getClasspathEntryKindAccess().getConEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getClasspathEntryKindAccess().getConEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClasspathEntryKind"

    // $ANTLR start synpred1_InternalXemfs
    public final void synpred1_InternalXemfs_fragment() throws RecognitionException {   
        // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:642:4: ( ';' )
        // ../no.hal.emfs.xtext/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:642:6: ';'
        {
        match(input,11,FollowSets000.FOLLOW_11_in_synpred1_InternalXemfs1367); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalXemfs

    // Delegated rules

    public final boolean synpred1_InternalXemfs() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalXemfs_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA11_eotS =
        "\7\uffff";
    static final String DFA11_eofS =
        "\7\uffff";
    static final String DFA11_minS =
        "\2\4\1\5\1\4\2\uffff\1\5";
    static final String DFA11_maxS =
        "\1\15\1\4\1\23\1\4\2\uffff\1\23";
    static final String DFA11_acceptS =
        "\4\uffff\1\1\1\2\1\uffff";
    static final String DFA11_specialS =
        "\7\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\10\uffff\1\1",
            "\1\2",
            "\2\5\2\uffff\1\5\1\uffff\1\5\1\4\1\3\1\uffff\1\5\1\uffff\3\5",
            "\1\6",
            "",
            "",
            "\2\5\2\uffff\1\5\1\uffff\1\5\1\4\1\3\1\uffff\1\5\1\uffff\3\5"
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

    class DFA11 extends DFA {

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
            return "361:1: (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile )";
        }
    }
    static final String DFA21_eotS =
        "\11\uffff";
    static final String DFA21_eofS =
        "\3\uffff\1\1\5\uffff";
    static final String DFA21_minS =
        "\1\5\1\uffff\3\4\1\uffff\1\5\1\4\1\5";
    static final String DFA21_maxS =
        "\1\23\1\uffff\1\24\1\23\1\4\1\uffff\1\23\1\4\1\23";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\3\uffff\1\1\3\uffff";
    static final String DFA21_specialS =
        "\11\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\1\4\uffff\1\1\3\uffff\1\2\2\uffff\2\1",
            "",
            "\1\3\17\uffff\1\1",
            "\3\1\4\uffff\1\1\1\uffff\1\4\1\uffff\1\1\1\5\1\uffff\2\1",
            "\1\6",
            "",
            "\2\1\2\uffff\1\1\1\uffff\2\1\1\7\1\uffff\1\1\1\5\3\1",
            "\1\10",
            "\2\1\2\uffff\1\1\1\uffff\2\1\1\7\1\uffff\1\1\1\5\3\1"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 794:4: ( (lv_properties_4_0= ruleProperty ) )*";
        }
    }
    static final String DFA23_eotS =
        "\76\uffff";
    static final String DFA23_eofS =
        "\2\uffff\3\6\5\uffff\2\6\1\uffff\1\6\2\uffff\1\6\2\uffff\1\6\52\uffff";
    static final String DFA23_minS =
        "\1\5\5\4\2\uffff\1\4\1\15\5\4\1\15\2\4\1\5\1\4\1\5\4\23\1\22\1\14\3\4\2\14\1\4\1\5\3\4\1\33\2\4\1\14\1\5\13\14\1\5\2\4\1\14\1\4\1\5\2\4\1\5";
    static final String DFA23_maxS =
        "\1\17\1\24\2\22\1\23\1\4\2\uffff\1\5\1\25\2\22\1\4\1\23\1\4\1\25\1\23\1\4\1\45\1\23\1\17\4\23\1\22\1\32\2\4\2\15\1\23\1\4\1\17\3\4\1\44\1\4\1\15\1\23\1\17\1\23\12\44\1\17\1\4\1\15\1\14\1\4\1\17\1\4\1\15\1\17";
    static final String DFA23_acceptS =
        "\6\uffff\1\1\1\2\66\uffff";
    static final String DFA23_specialS =
        "\76\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\1\3\10\uffff\1\1",
            "\1\4\17\uffff\1\5",
            "\3\6\4\uffff\1\6\1\uffff\1\6\1\uffff\1\6\2\uffff\1\7",
            "\3\6\4\uffff\1\6\1\uffff\1\6\1\uffff\1\6\2\uffff\1\7",
            "\3\6\4\uffff\1\6\1\uffff\1\6\1\uffff\1\6\2\uffff\1\7\1\10",
            "\1\11",
            "",
            "",
            "\1\13\1\12",
            "\1\14\7\uffff\1\15",
            "\3\6\4\uffff\1\6\1\uffff\1\6\1\uffff\1\6\2\uffff\1\7",
            "\3\6\4\uffff\1\6\1\uffff\1\16\1\uffff\1\6\2\uffff\1\7",
            "\1\17",
            "\3\6\4\uffff\1\6\1\uffff\1\6\1\uffff\1\6\2\uffff\1\7\1\10",
            "\1\20",
            "\1\14\7\uffff\1\15",
            "\3\6\2\uffff\1\6\1\uffff\2\6\1\21\1\uffff\1\6\1\uffff\1\6\1\22\1\6",
            "\1\23",
            "\1\24\20\uffff\1\25\1\26\1\27\1\30\13\uffff\1\31",
            "\3\6\2\uffff\1\6\1\uffff\2\6\1\21\1\uffff\1\6\1\uffff\1\6\1\22\1\6",
            "\2\7\4\uffff\1\6\3\uffff\1\7",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\35\15\uffff\1\34",
            "\1\36",
            "\1\37",
            "\1\41\10\uffff\1\40",
            "\1\43\1\42",
            "\1\35\1\44\5\uffff\1\45",
            "\1\41",
            "\2\7\4\uffff\1\6\1\47\1\46\1\uffff\1\7",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\65",
            "\1\41\10\uffff\1\40",
            "\1\43\1\42\5\uffff\1\66",
            "\2\7\4\uffff\1\6\1\67\2\uffff\1\7",
            "\1\35\1\44\5\uffff\1\45",
            "\1\35\16\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\35\16\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\35\16\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\35\16\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\35\16\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\35\16\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\35\16\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\35\16\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\35\16\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\35\16\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64",
            "\2\7\4\uffff\1\6\1\47\1\46\1\uffff\1\7",
            "\1\70",
            "\1\72\10\uffff\1\71",
            "\1\43",
            "\1\72",
            "\2\7\4\uffff\1\6\1\74\1\73\1\uffff\1\7",
            "\1\75",
            "\1\72\10\uffff\1\71",
            "\2\7\4\uffff\1\6\1\74\1\73\1\uffff\1\7"
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
            return "859:1: (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider )";
        }
    }
    static final String DFA37_eotS =
        "\7\uffff";
    static final String DFA37_eofS =
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA37_minS =
        "\2\4\1\5\1\4\2\uffff\1\5";
    static final String DFA37_maxS =
        "\1\15\1\4\1\17\1\4\2\uffff\1\17";
    static final String DFA37_acceptS =
        "\4\uffff\1\1\1\2\1\uffff";
    static final String DFA37_specialS =
        "\7\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\2\10\uffff\1\1",
            "\1\2",
            "\2\5\4\uffff\1\5\1\4\1\3\1\uffff\1\5",
            "\1\6",
            "",
            "",
            "\2\5\4\uffff\1\5\1\4\1\3\1\uffff\1\5"
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()* loopback of 1479:1: (this_FolderName_1= ruleFolderName )*";
        }
    }
    static final String DFA45_eotS =
        "\7\uffff";
    static final String DFA45_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA45_minS =
        "\2\4\1\13\1\4\2\uffff\1\13";
    static final String DFA45_maxS =
        "\1\15\1\4\1\55\1\4\2\uffff\1\55";
    static final String DFA45_acceptS =
        "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA45_specialS =
        "\7\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\2\10\uffff\1\1",
            "\1\2",
            "\1\4\1\5\1\3\31\uffff\1\4\2\uffff\4\4",
            "\1\6",
            "",
            "",
            "\1\4\1\5\1\3\31\uffff\1\4\2\uffff\4\4"
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "()* loopback of 1924:2: (this_FolderName_0= ruleFolderName )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEmfsRoot_in_entryRuleEmfsRoot75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsRoot85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_ruleEmfsRoot132 = new BitSet(new long[]{0x0000000000001610L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleEmfsRoot153 = new BitSet(new long[]{0x0000000000001600L});
        public static final BitSet FOLLOW_9_in_ruleEmfsRoot169 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmfsRoot186 = new BitSet(new long[]{0x0000000000001600L});
        public static final BitSet FOLLOW_10_in_ruleEmfsRoot206 = new BitSet(new long[]{0x0000002000000010L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_ruleEmfsRoot229 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_ruleEmfsRoot248 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleEmfsRoot263 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEmfsRoot277 = new BitSet(new long[]{0x0000000000002012L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_ruleEmfsRoot298 = new BitSet(new long[]{0x0000000000002012L});
        public static final BitSet FOLLOW_ruleEmfsName_in_entryRuleEmfsName336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsName347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmfsName387 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleEmfsName406 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmfsName421 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_entryRuleEmfsResourcesRef468 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsResourcesRef478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleEmfsResourcesRef526 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleEmfsResourcesRef539 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleEmfsResourcesRef562 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleName_in_entryRuleName601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleName612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleName651 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleName668 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleName687 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleName702 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_entryRuleEmfsResource749 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsResource759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsContainer_in_ruleEmfsResource806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsFile_in_ruleEmfsResource833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty868 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleProperty915 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleProperty936 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProperty948 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleProperty991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_entryRuleFolderName1031 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFolderName1042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleName_in_ruleFolderName1089 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFolderName1107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsContainer_in_entryRuleEmfsContainer1147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsContainer1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_ruleEmfsContainer1203 = new BitSet(new long[]{0x000000000000AE12L});
        public static final BitSet FOLLOW_9_in_ruleEmfsContainer1216 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleEmfsContainer1237 = new BitSet(new long[]{0x000000000000AE12L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleEmfsContainer1260 = new BitSet(new long[]{0x000000000000AC12L});
        public static final BitSet FOLLOW_10_in_ruleEmfsContainer1274 = new BitSet(new long[]{0x0000002000000010L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_ruleEmfsContainer1297 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_ruleEmfsContainer1316 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleEmfsContainer1331 = new BitSet(new long[]{0x0000000000002812L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_ruleEmfsContainer1354 = new BitSet(new long[]{0x0000000000002812L});
        public static final BitSet FOLLOW_11_in_ruleEmfsContainer1375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_entryRuleGitContentProvider1413 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitContentProvider1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_ruleGitContentProvider1468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName1504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFileName1515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleName_in_ruleFileName1561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsFile_in_entryRuleEmfsFile1605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsFile1615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleEmfsFile1661 = new BitSet(new long[]{0x00000000000E8A60L});
        public static final BitSet FOLLOW_17_in_ruleEmfsFile1679 = new BitSet(new long[]{0x00000000000C8A60L});
        public static final BitSet FOLLOW_9_in_ruleEmfsFile1706 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmfsFile1723 = new BitSet(new long[]{0x00000000000C8A60L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleEmfsFile1751 = new BitSet(new long[]{0x00000000000C8860L});
        public static final BitSet FOLLOW_18_in_ruleEmfsFile1766 = new BitSet(new long[]{0x0000002003C00020L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_ruleEmfsFile1789 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_ruleEmfsFile1808 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleEmfsFile1823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringContentProvider_in_ruleEmfsFile1853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWrappingStringContentProvider_in_ruleEmfsFile1872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEmfsFile1894 = new BitSet(new long[]{0x0000024000000000L});
        public static final BitSet FOLLOW_ruleDotClasspathFileContentProvider_in_ruleEmfsFile1917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotProjectFileContentProvider_in_ruleEmfsFile1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEmfsFile1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringContentProvider_in_entryRuleStringContentProvider1995 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringContentProvider2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_ruleStringContentProvider2050 = new BitSet(new long[]{0x0000000000008062L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_entryRuleAbstractStringContents2086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractStringContents2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValueString_in_ruleAbstractStringContents2143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVerbatimStringContents_in_ruleAbstractStringContents2170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVerbatimStringContents_in_entryRuleVerbatimStringContents2205 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVerbatimStringContents2215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleVerbatimStringContents2258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_CONTENT_in_ruleVerbatimStringContents2278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValueString_in_entryRulePropertyValueString2321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyValueString2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rulePropertyValueString2368 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyValueString2386 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_20_in_rulePropertyValueString2410 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rulePropertyValueString2431 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulePropertyValueString2443 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_rulePropertyValueString2458 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValueString2477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rulePropertyValueString2501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWrappingStringContentProvider_in_entryRuleWrappingStringContentProvider2542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWrappingStringContentProvider2552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_ruleWrappingStringContentProvider2598 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWrappingStringContentProvider2611 = new BitSet(new long[]{0x0000002003C00020L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_ruleWrappingStringContentProvider2634 = new BitSet(new long[]{0x0000000000008060L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_ruleWrappingStringContentProvider2653 = new BitSet(new long[]{0x0000000000008060L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_ruleWrappingStringContentProvider2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_SCHEME_in_entryRuleURL_SCHEME2715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_SCHEME2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleURL_SCHEME2764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleURL_SCHEME2783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleURL_SCHEME2802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleURL_SCHEME2821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_HOST_in_entryRuleURL_HOST2862 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_HOST2873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleURL_HOST2911 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleURL_HOST2926 = new BitSet(new long[]{0x0000000000082002L});
        public static final BitSet FOLLOW_13_in_ruleURL_HOST2945 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleURL_HOST2960 = new BitSet(new long[]{0x0000000000082002L});
        public static final BitSet FOLLOW_19_in_ruleURL_HOST2981 = new BitSet(new long[]{0x0000001FF8000000L});
        public static final BitSet FOLLOW_27_in_ruleURL_HOST2995 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_28_in_ruleURL_HOST3014 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_29_in_ruleURL_HOST3033 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_30_in_ruleURL_HOST3052 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_31_in_ruleURL_HOST3071 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_32_in_ruleURL_HOST3090 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_33_in_ruleURL_HOST3109 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_34_in_ruleURL_HOST3128 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_35_in_ruleURL_HOST3147 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_36_in_ruleURL_HOST3166 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_entryRuleURL_PATH3211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_PATH3222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleURL_PATH3260 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_ruleFolderName_in_ruleURL_PATH3283 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleURL_PATH3312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_in_entryRuleURL3358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL3369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_SCHEME_in_ruleURL3416 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleURL3434 = new BitSet(new long[]{0x0000000004001000L});
        public static final BitSet FOLLOW_ruleURL_HOST_in_ruleURL3457 = new BitSet(new long[]{0x0000000004001000L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_ruleURL3486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_entryRuleURLContentProvider3531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURLContentProvider3541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleURLContentProvider3584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_in_ruleURLContentProvider3608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_entryRuleGitURLContentProvider3646 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitURLContentProvider3656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_ruleGitURLContentProvider3701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGIT_HOST_in_entryRuleGIT_HOST3737 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGIT_HOST3748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGIT_HOST3788 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGIT_HOST3807 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGIT_HOST3822 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_entryRuleGitContentRef3869 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitContentRef3879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleGitContentRef3916 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleGitContentRef3928 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGIT_HOST_in_ruleGitContentRef3951 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_19_in_ruleGitContentRef3964 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGitContentRef3981 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGitContentRef4012 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGitContentRef4030 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGitContentRef4047 = new BitSet(new long[]{0x0000000004001002L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_ruleGitContentRef4073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotClasspathFileContentProvider_in_entryRuleDotClasspathFileContentProvider4110 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotClasspathFileContentProvider4120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDotClasspathFileContentProvider4157 = new BitSet(new long[]{0x00003C0000000000L});
        public static final BitSet FOLLOW_ruleAbstractClasspathEntry_in_ruleDotClasspathFileContentProvider4178 = new BitSet(new long[]{0x00003C0000000800L});
        public static final BitSet FOLLOW_11_in_ruleDotClasspathFileContentProvider4191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractClasspathEntry_in_entryRuleAbstractClasspathEntry4227 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractClasspathEntry4237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntry_in_ruleAbstractClasspathEntry4283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_entryRuleCLASSPATH_ENTRY_PATH4318 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCLASSPATH_ENTRY_PATH4329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_ruleCLASSPATH_ENTRY_PATH4377 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleCLASSPATH_ENTRY_PATH4406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntry_in_entryRuleClasspathEntry4451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClasspathEntry4461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntryKind_in_ruleClasspathEntry4507 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_ruleClasspathEntry4528 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_39_in_ruleClasspathEntry4541 = new BitSet(new long[]{0x0000001FF8000000L});
        public static final BitSet FOLLOW_ruleVERSION_in_ruleClasspathEntry4562 = new BitSet(new long[]{0x0000010000002000L});
        public static final BitSet FOLLOW_13_in_ruleClasspathEntry4575 = new BitSet(new long[]{0x0000001FF8000000L});
        public static final BitSet FOLLOW_ruleVERSION_in_ruleClasspathEntry4596 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleClasspathEntry4610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVERSION_in_entryRuleVERSION4649 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVERSION4660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleVERSION4698 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_28_in_ruleVERSION4717 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_29_in_ruleVERSION4736 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_30_in_ruleVERSION4755 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_31_in_ruleVERSION4774 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_32_in_ruleVERSION4793 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_33_in_ruleVERSION4812 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_34_in_ruleVERSION4831 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_35_in_ruleVERSION4850 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_36_in_ruleVERSION4869 = new BitSet(new long[]{0x0000001FF8000002L});
        public static final BitSet FOLLOW_ruleDotProjectFileContentProvider_in_entryRuleDotProjectFileContentProvider4910 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotProjectFileContentProvider4920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleDotProjectFileContentProvider4957 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_9_in_ruleDotProjectFileContentProvider4970 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDotProjectFileContentProvider4989 = new BitSet(new long[]{0x0000000000040A00L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleDotProjectFileContentProvider5013 = new BitSet(new long[]{0x0000000000040A00L});
        public static final BitSet FOLLOW_18_in_ruleDotProjectFileContentProvider5031 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleDotProjectFileContentProvider5054 = new BitSet(new long[]{0x0000000000044800L});
        public static final BitSet FOLLOW_14_in_ruleDotProjectFileContentProvider5067 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleDotProjectFileContentProvider5090 = new BitSet(new long[]{0x0000000000044800L});
        public static final BitSet FOLLOW_11_in_ruleDotProjectFileContentProvider5106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleClasspathEntryKind5156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleClasspathEntryKind5173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleClasspathEntryKind5190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleClasspathEntryKind5207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_synpred1_InternalXemfs1367 = new BitSet(new long[]{0x0000000000000002L});
    }


}