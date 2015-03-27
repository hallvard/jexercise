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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_STRING_CONTENT", "RULE_WS", "'emfs'", "'#'", "'extends'", "';'", "'/'", "'.'", "','", "'$'", "'='", "'*'", "'@'", "':'", "'---'", "'{'", "'}'", "'http'", "'https'", "'ftp'", "'file'", "'//'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'git'", "'dot.classpath'", "'('", "')'", "'dot.project'", "'source-folder'", "'output-folder'", "'library-jar'", "'class-container'"
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
    public static final int T__46=46;
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
    public String getGrammarFileName() { return "../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g"; }



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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:68:1: entryRuleEmfsRoot returns [EObject current=null] : iv_ruleEmfsRoot= ruleEmfsRoot EOF ;
    public final EObject entryRuleEmfsRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsRoot = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:69:2: (iv_ruleEmfsRoot= ruleEmfsRoot EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:70:2: iv_ruleEmfsRoot= ruleEmfsRoot EOF
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:77:1: ruleEmfsRoot returns [EObject current=null] : ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* ( (lv_properties_5_0= ruleProperty ) )* (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )? otherlv_9= '/' ( (lv_resources_10_0= ruleEmfsResource ) )* ) ;
    public final EObject ruleEmfsRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_tags_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_contentProvider_7_1 = null;

        EObject lv_contentProvider_7_2 = null;

        EObject lv_resources_10_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:80:28: ( ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* ( (lv_properties_5_0= ruleProperty ) )* (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )? otherlv_9= '/' ( (lv_resources_10_0= ruleEmfsResource ) )* ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:81:1: ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* ( (lv_properties_5_0= ruleProperty ) )* (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )? otherlv_9= '/' ( (lv_resources_10_0= ruleEmfsResource ) )* )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:81:1: ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* ( (lv_properties_5_0= ruleProperty ) )* (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )? otherlv_9= '/' ( (lv_resources_10_0= ruleEmfsResource ) )* )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:81:2: () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* ( (lv_properties_5_0= ruleProperty ) )* (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )? otherlv_9= '/' ( (lv_resources_10_0= ruleEmfsResource ) )*
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:81:2: ()
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEmfsRootAccess().getEmfsContainerAction_0(),
                          current);
                  
            }

            }

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:87:2: (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==8) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:87:4: otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )?
                    {
                    otherlv_1=(Token)match(input,8,FollowSets000.FOLLOW_8_in_ruleEmfsRoot132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmfsRootAccess().getEmfsKeyword_1_0());
                          
                    }
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:91:1: ( (lv_name_2_0= ruleEmfsName ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ID) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:92:1: (lv_name_2_0= ruleEmfsName )
                            {
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:92:1: (lv_name_2_0= ruleEmfsName )
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:93:3: lv_name_2_0= ruleEmfsName
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

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:109:5: (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==9) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:109:7: otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleEmfsRoot169); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEmfsRootAccess().getNumberSignKeyword_2_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:113:1: ( (lv_tags_4_0= RULE_ID ) )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:114:1: (lv_tags_4_0= RULE_ID )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:114:1: (lv_tags_4_0= RULE_ID )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:115:3: lv_tags_4_0= RULE_ID
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

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:131:4: ( (lv_properties_5_0= ruleProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:132:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:132:1: (lv_properties_5_0= ruleProperty )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:133:3: lv_properties_5_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsRootAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleEmfsRoot214);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmfsRootRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_5_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:149:3: (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==10) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:149:5: otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,10,FollowSets000.FOLLOW_10_in_ruleEmfsRoot228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEmfsRootAccess().getExtendsKeyword_4_0());
                          
                    }
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:153:1: ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:154:1: ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:154:1: ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:155:1: (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:155:1: (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==38) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==RULE_ID) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:156:3: lv_contentProvider_7_1= ruleGitContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsRootAccess().getContentProviderGitContentProviderParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_ruleEmfsRoot251);
                            lv_contentProvider_7_1=ruleGitContentProvider();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsRootRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_7_1, 
                                      		"GitContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:171:8: lv_contentProvider_7_2= ruleEmfsResourcesRef
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsRootAccess().getContentProviderEmfsResourcesRefParserRuleCall_4_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_ruleEmfsRoot270);
                            lv_contentProvider_7_2=ruleEmfsResourcesRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEmfsRootRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contentProvider",
                                      		lv_contentProvider_7_2, 
                                      		"EmfsResourcesRef");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_8=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmfsRoot285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEmfsRootAccess().getSemicolonKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEmfsRoot299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getEmfsRootAccess().getSolidusKeyword_5());
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:197:1: ( (lv_resources_10_0= ruleEmfsResource ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:198:1: (lv_resources_10_0= ruleEmfsResource )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:198:1: (lv_resources_10_0= ruleEmfsResource )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:199:3: lv_resources_10_0= ruleEmfsResource
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsRootAccess().getResourcesEmfsResourceParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_ruleEmfsRoot320);
            	    lv_resources_10_0=ruleEmfsResource();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmfsRootRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"resources",
            	              		lv_resources_10_0, 
            	              		"EmfsResource");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleEmfsRoot"


    // $ANTLR start "entryRuleEmfsName"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:223:1: entryRuleEmfsName returns [String current=null] : iv_ruleEmfsName= ruleEmfsName EOF ;
    public final String entryRuleEmfsName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmfsName = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:224:2: (iv_ruleEmfsName= ruleEmfsName EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:225:2: iv_ruleEmfsName= ruleEmfsName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_entryRuleEmfsName358);
            iv_ruleEmfsName=ruleEmfsName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsName369); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:232:1: ruleEmfsName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleEmfsName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:235:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:236:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:236:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:236:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmfsName409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:243:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_ID) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:244:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEmfsName428); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getEmfsNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmfsName443); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleEmfsName"


    // $ANTLR start "entryRuleEmfsResourcesRef"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:264:1: entryRuleEmfsResourcesRef returns [EObject current=null] : iv_ruleEmfsResourcesRef= ruleEmfsResourcesRef EOF ;
    public final EObject entryRuleEmfsResourcesRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsResourcesRef = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:265:2: (iv_ruleEmfsResourcesRef= ruleEmfsResourcesRef EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:266:2: iv_ruleEmfsResourcesRef= ruleEmfsResourcesRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsResourcesRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_entryRuleEmfsResourcesRef490);
            iv_ruleEmfsResourcesRef=ruleEmfsResourcesRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsResourcesRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsResourcesRef500); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:273:1: ruleEmfsResourcesRef returns [EObject current=null] : ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* ) ;
    public final EObject ruleEmfsResourcesRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:276:28: ( ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:277:1: ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:277:1: ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:277:2: ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )*
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:277:2: ( ( ruleEmfsName ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:278:1: ( ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:278:1: ( ruleEmfsName )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:279:3: ruleEmfsName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmfsResourcesRefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleEmfsResourcesRef548);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:292:2: (otherlv_1= ',' ( ( ruleEmfsName ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:292:4: otherlv_1= ',' ( ( ruleEmfsName ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEmfsResourcesRef561); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEmfsResourcesRefAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:296:1: ( ( ruleEmfsName ) )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:297:1: ( ruleEmfsName )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:297:1: ( ruleEmfsName )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:298:3: ruleEmfsName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEmfsResourcesRefRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleEmfsResourcesRef584);
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
            	    break loop9;
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


    // $ANTLR start "entryRuleResourceName"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:319:1: entryRuleResourceName returns [String current=null] : iv_ruleResourceName= ruleResourceName EOF ;
    public final String entryRuleResourceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResourceName = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:320:2: (iv_ruleResourceName= ruleResourceName EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:321:2: iv_ruleResourceName= ruleResourceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleResourceName_in_entryRuleResourceName623);
            iv_ruleResourceName=ruleResourceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResourceName634); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResourceName"


    // $ANTLR start "ruleResourceName"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:328:1: ruleResourceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleResourceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:331:28: ( ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:332:1: ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:332:1: ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:332:2: (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )*
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:332:2: (kw= '.' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:333:2: kw= '.'
                    {
                    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleResourceName673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getResourceNameAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleResourceName690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getResourceNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:345:1: (kw= '.' this_ID_3= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:346:2: kw= '.' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleResourceName709); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getResourceNameAccess().getFullStopKeyword_2_0()); 
            	          
            	    }
            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleResourceName724); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getResourceNameAccess().getIDTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleResourceName"


    // $ANTLR start "entryRuleEmfsResource"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:366:1: entryRuleEmfsResource returns [EObject current=null] : iv_ruleEmfsResource= ruleEmfsResource EOF ;
    public final EObject entryRuleEmfsResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsResource = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:367:2: (iv_ruleEmfsResource= ruleEmfsResource EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:368:2: iv_ruleEmfsResource= ruleEmfsResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_entryRuleEmfsResource771);
            iv_ruleEmfsResource=ruleEmfsResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsResource; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsResource781); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:375:1: ruleEmfsResource returns [EObject current=null] : (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile ) ;
    public final EObject ruleEmfsResource() throws RecognitionException {
        EObject current = null;

        EObject this_EmfsContainer_0 = null;

        EObject this_EmfsFile_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:378:28: ( (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:379:1: (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:379:1: (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:380:5: this_EmfsContainer_0= ruleEmfsContainer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEmfsResourceAccess().getEmfsContainerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsContainer_in_ruleEmfsResource828);
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:390:5: this_EmfsFile_1= ruleEmfsFile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEmfsResourceAccess().getEmfsFileParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsFile_in_ruleEmfsResource855);
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:406:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:407:2: (iv_ruleProperty= ruleProperty EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:408:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty890);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty900); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:415:1: ruleProperty returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_1=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_2 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:418:28: ( (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:419:1: (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:419:1: (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:419:3: otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProperty937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getDollarSignKeyword_0());
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:423:1: ( (lv_name_1_0= ruleEmfsName ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:424:1: (lv_name_1_0= ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:424:1: (lv_name_1_0= ruleEmfsName )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:425:3: lv_name_1_0= ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEmfsNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleProperty958);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProperty970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:445:1: ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:446:1: ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:446:1: ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:447:1: (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:447:1: (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:448:3: lv_value_3_1= RULE_STRING
                    {
                    lv_value_3_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProperty989); if (state.failed) return current;
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:463:8: lv_value_3_2= ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getValueEmfsNameParserRuleCall_3_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleProperty1013);
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:489:1: entryRuleFolderName returns [String current=null] : iv_ruleFolderName= ruleFolderName EOF ;
    public final String entryRuleFolderName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFolderName = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:490:2: (iv_ruleFolderName= ruleFolderName EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:491:2: iv_ruleFolderName= ruleFolderName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFolderNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_entryRuleFolderName1053);
            iv_ruleFolderName=ruleFolderName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFolderName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFolderName1064); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:498:1: ruleFolderName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ResourceName_0= ruleResourceName kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleFolderName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ResourceName_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:501:28: ( (this_ResourceName_0= ruleResourceName kw= '/' ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:502:1: (this_ResourceName_0= ruleResourceName kw= '/' )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:502:1: (this_ResourceName_0= ruleResourceName kw= '/' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:503:5: this_ResourceName_0= ruleResourceName kw= '/'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFolderNameAccess().getResourceNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleResourceName_in_ruleFolderName1111);
            this_ResourceName_0=ruleResourceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ResourceName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFolderName1129); if (state.failed) return current;
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:527:1: entryRuleEmfsContainer returns [EObject current=null] : iv_ruleEmfsContainer= ruleEmfsContainer EOF ;
    public final EObject entryRuleEmfsContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsContainer = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:528:2: (iv_ruleEmfsContainer= ruleEmfsContainer EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:529:2: iv_ruleEmfsContainer= ruleEmfsContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsContainerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsContainer_in_entryRuleEmfsContainer1169);
            iv_ruleEmfsContainer=ruleEmfsContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsContainer; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsContainer1179); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:536:1: ruleEmfsContainer returns [EObject current=null] : ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? ) ;
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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:539:28: ( ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:540:1: ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:540:1: ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:540:2: ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )?
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:540:2: ( (lv_name_0_0= ruleFolderName ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:541:1: (lv_name_0_0= ruleFolderName )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:541:1: (lv_name_0_0= ruleFolderName )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:542:3: lv_name_0_0= ruleFolderName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getNameFolderNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_ruleEmfsContainer1225);
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

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:558:2: (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==9) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:558:4: otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) )
            	    {
            	    otherlv_1=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleEmfsContainer1238); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEmfsContainerAccess().getNumberSignKeyword_1_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:562:1: ( (lv_tags_2_0= ruleEmfsName ) )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:563:1: (lv_tags_2_0= ruleEmfsName )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:563:1: (lv_tags_2_0= ruleEmfsName )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:564:3: lv_tags_2_0= ruleEmfsName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getTagsEmfsNameParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleEmfsContainer1259);
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
            	    break loop14;
                }
            } while (true);

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:580:4: ( (lv_properties_3_0= ruleProperty ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:581:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:581:1: (lv_properties_3_0= ruleProperty )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:582:3: lv_properties_3_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleEmfsContainer1282);
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
            	    break loop15;
                }
            } while (true);

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:598:3: (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==10) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:598:5: otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,10,FollowSets000.FOLLOW_10_in_ruleEmfsContainer1296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEmfsContainerAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:602:1: ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:603:1: ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:603:1: ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:604:1: (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:604:1: (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==38) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_ID) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:605:3: lv_contentProvider_5_1= ruleGitContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getContentProviderGitContentProviderParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_ruleEmfsContainer1319);
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
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:620:8: lv_contentProvider_5_2= ruleEmfsResourcesRef
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getContentProviderEmfsResourcesRefParserRuleCall_3_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEmfsResourcesRef_in_ruleEmfsContainer1338);
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

                    otherlv_6=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmfsContainer1353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:642:3: ( (lv_resources_7_0= ruleEmfsResource ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }
                else if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:643:1: (lv_resources_7_0= ruleEmfsResource )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:643:1: (lv_resources_7_0= ruleEmfsResource )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:644:3: lv_resources_7_0= ruleEmfsResource
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getResourcesEmfsResourceParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEmfsResource_in_ruleEmfsContainer1376);
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
            	    break loop18;
                }
            } while (true);

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:660:3: ( ( ';' )=>otherlv_8= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred1_InternalXemfs()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:660:4: ( ';' )=>otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmfsContainer1397); if (state.failed) return current;
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:673:1: entryRuleGitContentProvider returns [EObject current=null] : iv_ruleGitContentProvider= ruleGitContentProvider EOF ;
    public final EObject entryRuleGitContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitContentProvider = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:674:2: (iv_ruleGitContentProvider= ruleGitContentProvider EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:675:2: iv_ruleGitContentProvider= ruleGitContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGitContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentProvider_in_entryRuleGitContentProvider1435);
            iv_ruleGitContentProvider=ruleGitContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGitContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitContentProvider1445); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:682:1: ruleGitContentProvider returns [EObject current=null] : ( (lv_gitRef_0_0= ruleGitContentRef ) ) ;
    public final EObject ruleGitContentProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_gitRef_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:685:28: ( ( (lv_gitRef_0_0= ruleGitContentRef ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:686:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:686:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:687:1: (lv_gitRef_0_0= ruleGitContentRef )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:687:1: (lv_gitRef_0_0= ruleGitContentRef )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:688:3: lv_gitRef_0_0= ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGitContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_ruleGitContentProvider1490);
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:712:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:713:2: (iv_ruleFileName= ruleFileName EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:714:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_entryRuleFileName1526);
            iv_ruleFileName=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFileName1537); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:721:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ResourceName_0= ruleResourceName ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ResourceName_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:724:28: (this_ResourceName_0= ruleResourceName )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:726:5: this_ResourceName_0= ruleResourceName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFileNameAccess().getResourceNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleResourceName_in_ruleFileName1583);
            this_ResourceName_0=ruleResourceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ResourceName_0);
                  
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:744:1: entryRuleEmfsFile returns [EObject current=null] : iv_ruleEmfsFile= ruleEmfsFile EOF ;
    public final EObject entryRuleEmfsFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsFile = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:745:2: (iv_ruleEmfsFile= ruleEmfsFile EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:746:2: iv_ruleEmfsFile= ruleEmfsFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmfsFile_in_entryRuleEmfsFile1627);
            iv_ruleEmfsFile=ruleEmfsFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmfsFile1637); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:753:1: ruleEmfsFile returns [EObject current=null] : ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) ) ;
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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:756:28: ( ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:757:1: ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:757:1: ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:757:2: ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:757:2: ( (lv_name_0_0= ruleFileName ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:758:1: (lv_name_0_0= ruleFileName )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:758:1: (lv_name_0_0= ruleFileName )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:759:3: lv_name_0_0= ruleFileName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getNameFileNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleEmfsFile1683);
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

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:775:2: ( (lv_writeable_1_0= '*' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:776:1: (lv_writeable_1_0= '*' )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:776:1: (lv_writeable_1_0= '*' )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:777:3: lv_writeable_1_0= '*'
                    {
                    lv_writeable_1_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEmfsFile1701); if (state.failed) return current;
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

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:790:3: (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==9) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:790:5: otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleEmfsFile1728); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getEmfsFileAccess().getNumberSignKeyword_2_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:794:1: ( (lv_tags_3_0= RULE_ID ) )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:795:1: (lv_tags_3_0= RULE_ID )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:795:1: (lv_tags_3_0= RULE_ID )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:796:3: lv_tags_3_0= RULE_ID
            	    {
            	    lv_tags_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmfsFile1745); if (state.failed) return current;
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
            	    break loop21;
                }
            } while (true);

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:812:4: ( (lv_properties_4_0= ruleProperty ) )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:813:1: (lv_properties_4_0= ruleProperty )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:813:1: (lv_properties_4_0= ruleProperty )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:814:3: lv_properties_4_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsFileAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleEmfsFile1773);
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
            	    break loop22;
                }
            } while (true);

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:830:3: ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt26=1;
                }
                break;
            case RULE_STRING:
            case RULE_STRING_CONTENT:
            case 15:
            case 20:
                {
                alt26=2;
                }
                break;
            case 19:
                {
                alt26=3;
                }
                break;
            case 11:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:830:4: (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:830:4: (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:830:6: otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEmfsFile1788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmfsFileAccess().getCommercialAtKeyword_4_0_0());
                          
                    }
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:834:1: ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:835:1: ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:835:1: ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:836:1: (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:836:1: (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_STRING||(LA23_0>=23 && LA23_0<=26)) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==38) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:837:3: lv_contentProvider_6_1= ruleURLContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderURLContentProviderParserRuleCall_4_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_ruleEmfsFile1811);
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
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:852:8: lv_contentProvider_6_2= ruleGitURLContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderGitURLContentProviderParserRuleCall_4_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_ruleEmfsFile1830);
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

                    otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmfsFile1845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:875:6: ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:875:6: ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:876:1: ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:876:1: ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:877:1: (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:877:1: (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider )
                    int alt24=2;
                    alt24 = dfa24.predict(input);
                    switch (alt24) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:878:3: lv_contentProvider_8_1= ruleStringContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderStringContentProviderParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleStringContentProvider_in_ruleEmfsFile1875);
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
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:893:8: lv_contentProvider_8_2= ruleWrappingStringContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderWrappingStringContentProviderParserRuleCall_4_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleWrappingStringContentProvider_in_ruleEmfsFile1894);
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:912:6: (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:912:6: (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:912:8: otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) )
                    {
                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEmfsFile1916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getEmfsFileAccess().getColonKeyword_4_2_0());
                          
                    }
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:916:1: ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:917:1: ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:917:1: ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:918:1: (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:918:1: (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==39) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==42) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:919:3: lv_contentProvider_10_1= ruleDotClasspathFileContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderDotClasspathFileContentProviderParserRuleCall_4_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleDotClasspathFileContentProvider_in_ruleEmfsFile1939);
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
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:934:8: lv_contentProvider_10_2= ruleDotProjectFileContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderDotProjectFileContentProviderParserRuleCall_4_2_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleDotProjectFileContentProvider_in_ruleEmfsFile1958);
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:953:7: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEmfsFile1980); if (state.failed) return current;
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:965:1: entryRuleStringContentProvider returns [EObject current=null] : iv_ruleStringContentProvider= ruleStringContentProvider EOF ;
    public final EObject entryRuleStringContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringContentProvider = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:966:2: (iv_ruleStringContentProvider= ruleStringContentProvider EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:967:2: iv_ruleStringContentProvider= ruleStringContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringContentProvider_in_entryRuleStringContentProvider2017);
            iv_ruleStringContentProvider=ruleStringContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringContentProvider2027); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:974:1: ruleStringContentProvider returns [EObject current=null] : ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+ ;
    public final EObject ruleStringContentProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_stringContents_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:977:28: ( ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+ )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:978:1: ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:978:1: ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_STRING_CONTENT)||LA27_0==15||LA27_0==20) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:979:1: (lv_stringContents_0_0= ruleAbstractStringContents )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:979:1: (lv_stringContents_0_0= ruleAbstractStringContents )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:980:3: lv_stringContents_0_0= ruleAbstractStringContents
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringContentProviderAccess().getStringContentsAbstractStringContentsParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_ruleStringContentProvider2072);
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
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1004:1: entryRuleAbstractStringContents returns [EObject current=null] : iv_ruleAbstractStringContents= ruleAbstractStringContents EOF ;
    public final EObject entryRuleAbstractStringContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractStringContents = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1005:2: (iv_ruleAbstractStringContents= ruleAbstractStringContents EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1006:2: iv_ruleAbstractStringContents= ruleAbstractStringContents EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_entryRuleAbstractStringContents2108);
            iv_ruleAbstractStringContents=ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractStringContents; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractStringContents2118); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1013:1: ruleAbstractStringContents returns [EObject current=null] : (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents ) ;
    public final EObject ruleAbstractStringContents() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueString_0 = null;

        EObject this_VerbatimStringContents_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1016:28: ( (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1017:1: (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1017:1: (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_STRING_CONTENT)||LA28_0==20) ) {
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1018:5: this_PropertyValueString_0= rulePropertyValueString
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractStringContentsAccess().getPropertyValueStringParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePropertyValueString_in_ruleAbstractStringContents2165);
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1028:5: this_VerbatimStringContents_1= ruleVerbatimStringContents
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractStringContentsAccess().getVerbatimStringContentsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVerbatimStringContents_in_ruleAbstractStringContents2192);
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1044:1: entryRuleVerbatimStringContents returns [EObject current=null] : iv_ruleVerbatimStringContents= ruleVerbatimStringContents EOF ;
    public final EObject entryRuleVerbatimStringContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbatimStringContents = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1045:2: (iv_ruleVerbatimStringContents= ruleVerbatimStringContents EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1046:2: iv_ruleVerbatimStringContents= ruleVerbatimStringContents EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVerbatimStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVerbatimStringContents_in_entryRuleVerbatimStringContents2227);
            iv_ruleVerbatimStringContents=ruleVerbatimStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVerbatimStringContents; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVerbatimStringContents2237); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1053:1: ruleVerbatimStringContents returns [EObject current=null] : ( (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )? ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) ) ) ;
    public final EObject ruleVerbatimStringContents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token lv_tags_3_0=null;
        Token lv_stringContent_5_1=null;
        Token lv_stringContent_5_2=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1056:28: ( ( (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )? ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1057:1: ( (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )? ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1057:1: ( (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )? ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1057:2: (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )? ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1057:2: (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1057:4: otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )*
                    {
                    otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleVerbatimStringContents2275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVerbatimStringContentsAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0_0());
                          
                    }
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1061:1: ( (lv_writeable_1_0= '*' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==17) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1062:1: (lv_writeable_1_0= '*' )
                            {
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1062:1: (lv_writeable_1_0= '*' )
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1063:3: lv_writeable_1_0= '*'
                            {
                            lv_writeable_1_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVerbatimStringContents2293); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_writeable_1_0, grammarAccess.getVerbatimStringContentsAccess().getWriteableAsteriskKeyword_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVerbatimStringContentsRule());
                              	        }
                                     		setWithLastConsumed(current, "writeable", true, "*");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1076:3: (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==9) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1076:5: otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleVerbatimStringContents2320); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getVerbatimStringContentsAccess().getNumberSignKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1080:1: ( (lv_tags_3_0= RULE_ID ) )
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1081:1: (lv_tags_3_0= RULE_ID )
                    	    {
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1081:1: (lv_tags_3_0= RULE_ID )
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1082:3: lv_tags_3_0= RULE_ID
                    	    {
                    	    lv_tags_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVerbatimStringContents2337); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_tags_3_0, grammarAccess.getVerbatimStringContentsAccess().getTagsIDTerminalRuleCall_0_2_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getVerbatimStringContentsRule());
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
                    	    break loop30;
                        }
                    } while (true);

                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1098:4: ( (lv_properties_4_0= ruleProperty ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1099:1: (lv_properties_4_0= ruleProperty )
                    	    {
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1099:1: (lv_properties_4_0= ruleProperty )
                    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1100:3: lv_properties_4_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getVerbatimStringContentsAccess().getPropertiesPropertyParserRuleCall_0_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleVerbatimStringContents2365);
                    	    lv_properties_4_0=ruleProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getVerbatimStringContentsRule());
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1116:5: ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1117:1: ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1117:1: ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1118:1: (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1118:1: (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_STRING_CONTENT) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1119:3: lv_stringContent_5_1= RULE_STRING
                    {
                    lv_stringContent_5_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleVerbatimStringContents2387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_stringContent_5_1, grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRINGTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVerbatimStringContentsRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"stringContent",
                              		lv_stringContent_5_1, 
                              		"STRING");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1134:8: lv_stringContent_5_2= RULE_STRING_CONTENT
                    {
                    lv_stringContent_5_2=(Token)match(input,RULE_STRING_CONTENT,FollowSets000.FOLLOW_RULE_STRING_CONTENT_in_ruleVerbatimStringContents2407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_stringContent_5_2, grammarAccess.getVerbatimStringContentsAccess().getStringContentSTRING_CONTENTTerminalRuleCall_1_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVerbatimStringContentsRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"stringContent",
                              		lv_stringContent_5_2, 
                              		"STRING_CONTENT");
                      	    
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
    // $ANTLR end "ruleVerbatimStringContents"


    // $ANTLR start "entryRulePropertyValueString"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1160:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1161:2: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1162:2: iv_rulePropertyValueString= rulePropertyValueString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyValueString_in_entryRulePropertyValueString2451);
            iv_rulePropertyValueString=rulePropertyValueString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValueString; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyValueString2461); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1169:1: rulePropertyValueString returns [EObject current=null] : (otherlv_0= '$' ( (lv_writeable_1_0= '*' ) )? ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) ) (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )? ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_writeable_1_0=null;
        Token lv_propertyName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_defaultValue_7_1=null;
        AntlrDatatypeRuleToken lv_propertyName_4_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_7_2 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1172:28: ( (otherlv_0= '$' ( (lv_writeable_1_0= '*' ) )? ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) ) (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )? ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1173:1: (otherlv_0= '$' ( (lv_writeable_1_0= '*' ) )? ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) ) (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )? )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1173:1: (otherlv_0= '$' ( (lv_writeable_1_0= '*' ) )? ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) ) (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )? )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1173:3: otherlv_0= '$' ( (lv_writeable_1_0= '*' ) )? ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) ) (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )?
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePropertyValueString2498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyValueStringAccess().getDollarSignKeyword_0());
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1177:1: ( (lv_writeable_1_0= '*' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1178:1: (lv_writeable_1_0= '*' )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1178:1: (lv_writeable_1_0= '*' )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1179:3: lv_writeable_1_0= '*'
                    {
                    lv_writeable_1_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePropertyValueString2516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getPropertyValueStringAccess().getWriteableAsteriskKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyValueStringRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "*");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1192:3: ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==21) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1192:4: ( (lv_propertyName_2_0= RULE_ID ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1192:4: ( (lv_propertyName_2_0= RULE_ID ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1193:1: (lv_propertyName_2_0= RULE_ID )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1193:1: (lv_propertyName_2_0= RULE_ID )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1194:3: lv_propertyName_2_0= RULE_ID
                    {
                    lv_propertyName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyValueString2548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_propertyName_2_0, grammarAccess.getPropertyValueStringAccess().getPropertyNameIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyValueStringRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"propertyName",
                              		lv_propertyName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1211:6: (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1211:6: (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1211:8: otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePropertyValueString2572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyValueStringAccess().getLeftCurlyBracketKeyword_2_1_0());
                          
                    }
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1215:1: ( (lv_propertyName_4_0= ruleEmfsName ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1216:1: (lv_propertyName_4_0= ruleEmfsName )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1216:1: (lv_propertyName_4_0= ruleEmfsName )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1217:3: lv_propertyName_4_0= ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyValueStringAccess().getPropertyNameEmfsNameParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rulePropertyValueString2593);
                    lv_propertyName_4_0=ruleEmfsName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyValueStringRule());
                      	        }
                             		set(
                             			current, 
                             			"propertyName",
                              		lv_propertyName_4_0, 
                              		"EmfsName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePropertyValueString2605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyValueStringAccess().getRightCurlyBracketKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1237:3: (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1237:5: otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePropertyValueString2620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPropertyValueStringAccess().getColonKeyword_3_0());
                          
                    }
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1241:1: ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1242:1: ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1242:1: ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1243:1: (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1243:1: (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_STRING) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==RULE_ID) ) {
                        alt36=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1244:3: lv_defaultValue_7_1= RULE_STRING
                            {
                            lv_defaultValue_7_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePropertyValueString2639); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_defaultValue_7_1, grammarAccess.getPropertyValueStringAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPropertyValueStringRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"defaultValue",
                                      		lv_defaultValue_7_1, 
                                      		"STRING");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1259:8: lv_defaultValue_7_2= ruleEmfsName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPropertyValueStringAccess().getDefaultValueEmfsNameParserRuleCall_3_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rulePropertyValueString2663);
                            lv_defaultValue_7_2=ruleEmfsName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPropertyValueStringRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"defaultValue",
                                      		lv_defaultValue_7_2, 
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1285:1: entryRuleWrappingStringContentProvider returns [EObject current=null] : iv_ruleWrappingStringContentProvider= ruleWrappingStringContentProvider EOF ;
    public final EObject entryRuleWrappingStringContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrappingStringContentProvider = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1286:2: (iv_ruleWrappingStringContentProvider= ruleWrappingStringContentProvider EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1287:2: iv_ruleWrappingStringContentProvider= ruleWrappingStringContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWrappingStringContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWrappingStringContentProvider_in_entryRuleWrappingStringContentProvider2704);
            iv_ruleWrappingStringContentProvider=ruleWrappingStringContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWrappingStringContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWrappingStringContentProvider2714); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1294:1: ruleWrappingStringContentProvider returns [EObject current=null] : ( ( (lv_prefix_0_0= ruleAbstractStringContents ) ) (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) ) ( (lv_suffix_3_0= ruleAbstractStringContents ) ) ) ;
    public final EObject ruleWrappingStringContentProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_prefix_0_0 = null;

        EObject lv_contentProvider_2_1 = null;

        EObject lv_contentProvider_2_2 = null;

        EObject lv_suffix_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1297:28: ( ( ( (lv_prefix_0_0= ruleAbstractStringContents ) ) (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) ) ( (lv_suffix_3_0= ruleAbstractStringContents ) ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1298:1: ( ( (lv_prefix_0_0= ruleAbstractStringContents ) ) (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) ) ( (lv_suffix_3_0= ruleAbstractStringContents ) ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1298:1: ( ( (lv_prefix_0_0= ruleAbstractStringContents ) ) (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) ) ( (lv_suffix_3_0= ruleAbstractStringContents ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1298:2: ( (lv_prefix_0_0= ruleAbstractStringContents ) ) (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) ) ( (lv_suffix_3_0= ruleAbstractStringContents ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1298:2: ( (lv_prefix_0_0= ruleAbstractStringContents ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1299:1: (lv_prefix_0_0= ruleAbstractStringContents )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1299:1: (lv_prefix_0_0= ruleAbstractStringContents )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1300:3: lv_prefix_0_0= ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAbstractStringContentsParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_ruleWrappingStringContentProvider2760);
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

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1316:2: (otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1316:4: otherlv_1= '@' ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) )
            {
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWrappingStringContentProvider2773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWrappingStringContentProviderAccess().getCommercialAtKeyword_1_0());
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1320:1: ( ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1321:1: ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1321:1: ( (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1322:1: (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1322:1: (lv_contentProvider_2_1= ruleURLContentProvider | lv_contentProvider_2_2= ruleGitURLContentProvider )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING||(LA38_0>=23 && LA38_0<=26)) ) {
                alt38=1;
            }
            else if ( (LA38_0==38) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1323:3: lv_contentProvider_2_1= ruleURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderURLContentProviderParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_ruleWrappingStringContentProvider2796);
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1338:8: lv_contentProvider_2_2= ruleGitURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderGitURLContentProviderParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_ruleWrappingStringContentProvider2815);
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

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1356:3: ( (lv_suffix_3_0= ruleAbstractStringContents ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1357:1: (lv_suffix_3_0= ruleAbstractStringContents )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1357:1: (lv_suffix_3_0= ruleAbstractStringContents )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1358:3: lv_suffix_3_0= ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAbstractStringContentsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStringContents_in_ruleWrappingStringContentProvider2840);
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


    // $ANTLR start "entryRulePROPERTY_REF"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1382:1: entryRulePROPERTY_REF returns [String current=null] : iv_rulePROPERTY_REF= rulePROPERTY_REF EOF ;
    public final String entryRulePROPERTY_REF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePROPERTY_REF = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1383:2: (iv_rulePROPERTY_REF= rulePROPERTY_REF EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1384:2: iv_rulePROPERTY_REF= rulePROPERTY_REF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPROPERTY_REFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_entryRulePROPERTY_REF2877);
            iv_rulePROPERTY_REF=rulePROPERTY_REF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePROPERTY_REF.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePROPERTY_REF2888); if (state.failed) return current;

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
    // $ANTLR end "entryRulePROPERTY_REF"


    // $ANTLR start "rulePROPERTY_REF"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1391:1: rulePROPERTY_REF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken rulePROPERTY_REF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_EmfsName_2 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1394:28: ( (kw= '$' ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1395:1: (kw= '$' ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1395:1: (kw= '$' ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1396:2: kw= '$' ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID )
            {
            kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePROPERTY_REF2926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPROPERTY_REFAccess().getDollarSignKeyword_0()); 
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1401:1: ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1401:2: (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1401:2: (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1402:2: kw= '{' this_EmfsName_2= ruleEmfsName kw= '}'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePROPERTY_REF2941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPROPERTY_REFAccess().getLeftCurlyBracketKeyword_1_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPROPERTY_REFAccess().getEmfsNameParserRuleCall_1_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_rulePROPERTY_REF2963);
                    this_EmfsName_2=ruleEmfsName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EmfsName_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePROPERTY_REF2981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPROPERTY_REFAccess().getRightCurlyBracketKeyword_1_0_2()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1425:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePROPERTY_REF3003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_4, grammarAccess.getPROPERTY_REFAccess().getIDTerminalRuleCall_1_1()); 
                          
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
    // $ANTLR end "rulePROPERTY_REF"


    // $ANTLR start "entryRuleURL_SCHEME"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1440:1: entryRuleURL_SCHEME returns [String current=null] : iv_ruleURL_SCHEME= ruleURL_SCHEME EOF ;
    public final String entryRuleURL_SCHEME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_SCHEME = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1441:2: (iv_ruleURL_SCHEME= ruleURL_SCHEME EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1442:2: iv_ruleURL_SCHEME= ruleURL_SCHEME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_SCHEMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_SCHEME_in_entryRuleURL_SCHEME3050);
            iv_ruleURL_SCHEME=ruleURL_SCHEME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_SCHEME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_SCHEME3061); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1449:1: ruleURL_SCHEME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' ) ;
    public final AntlrDatatypeRuleToken ruleURL_SCHEME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1452:28: ( (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1453:1: (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1453:1: (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt40=1;
                }
                break;
            case 24:
                {
                alt40=2;
                }
                break;
            case 25:
                {
                alt40=3;
                }
                break;
            case 26:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1454:2: kw= 'http'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleURL_SCHEME3099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_SCHEMEAccess().getHttpKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1461:2: kw= 'https'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleURL_SCHEME3118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_SCHEMEAccess().getHttpsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1468:2: kw= 'ftp'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleURL_SCHEME3137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_SCHEMEAccess().getFtpKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1475:2: kw= 'file'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleURL_SCHEME3156); if (state.failed) return current;
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


    // $ANTLR start "entryRuleURL_HOST_NAME"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1488:1: entryRuleURL_HOST_NAME returns [String current=null] : iv_ruleURL_HOST_NAME= ruleURL_HOST_NAME EOF ;
    public final String entryRuleURL_HOST_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_HOST_NAME = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1489:2: (iv_ruleURL_HOST_NAME= ruleURL_HOST_NAME EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1490:2: iv_ruleURL_HOST_NAME= ruleURL_HOST_NAME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_HOST_NAMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_NAME_in_entryRuleURL_HOST_NAME3197);
            iv_ruleURL_HOST_NAME=ruleURL_HOST_NAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_HOST_NAME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_HOST_NAME3208); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURL_HOST_NAME"


    // $ANTLR start "ruleURL_HOST_NAME"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1497:1: ruleURL_HOST_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleURL_HOST_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1500:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1501:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1501:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1501:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleURL_HOST_NAME3248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getURL_HOST_NAMEAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1508:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==13) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1509:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleURL_HOST_NAME3267); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getURL_HOST_NAMEAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleURL_HOST_NAME3282); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getURL_HOST_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
    // $ANTLR end "ruleURL_HOST_NAME"


    // $ANTLR start "entryRuleURL_HOST"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1529:1: entryRuleURL_HOST returns [String current=null] : iv_ruleURL_HOST= ruleURL_HOST EOF ;
    public final String entryRuleURL_HOST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_HOST = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1530:2: (iv_ruleURL_HOST= ruleURL_HOST EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1531:2: iv_ruleURL_HOST= ruleURL_HOST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_HOSTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_in_entryRuleURL_HOST3330);
            iv_ruleURL_HOST=ruleURL_HOST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_HOST.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_HOST3341); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1538:1: ruleURL_HOST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '//' ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF ) ) ;
    public final AntlrDatatypeRuleToken ruleURL_HOST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_URL_HOST_NAME_1 = null;

        AntlrDatatypeRuleToken this_PROPERTY_REF_13 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1541:28: ( (kw= '//' ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1542:1: (kw= '//' ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1542:1: (kw= '//' ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1543:2: kw= '//' ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF )
            {
            kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleURL_HOST3379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getSolidusSolidusKeyword_0()); 
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1548:1: ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==15) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1548:2: (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1548:2: (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1549:5: this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURL_HOSTAccess().getURL_HOST_NAMEParserRuleCall_1_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_NAME_in_ruleURL_HOST3403);
                    this_URL_HOST_NAME_1=ruleURL_HOST_NAME();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_URL_HOST_NAME_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1559:1: (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==19) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1560:2: kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
                            {
                            kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleURL_HOST3422); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getColonKeyword_1_0_1_0()); 
                                  
                            }
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1565:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
                            int cnt42=0;
                            loop42:
                            do {
                                int alt42=11;
                                switch ( input.LA(1) ) {
                                case 28:
                                    {
                                    alt42=1;
                                    }
                                    break;
                                case 29:
                                    {
                                    alt42=2;
                                    }
                                    break;
                                case 30:
                                    {
                                    alt42=3;
                                    }
                                    break;
                                case 31:
                                    {
                                    alt42=4;
                                    }
                                    break;
                                case 32:
                                    {
                                    alt42=5;
                                    }
                                    break;
                                case 33:
                                    {
                                    alt42=6;
                                    }
                                    break;
                                case 34:
                                    {
                                    alt42=7;
                                    }
                                    break;
                                case 35:
                                    {
                                    alt42=8;
                                    }
                                    break;
                                case 36:
                                    {
                                    alt42=9;
                                    }
                                    break;
                                case 37:
                                    {
                                    alt42=10;
                                    }
                                    break;

                                }

                                switch (alt42) {
                            	case 1 :
                            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1566:2: kw= '0'
                            	    {
                            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleURL_HOST3436); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitZeroKeyword_1_0_1_1_0()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 2 :
                            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1573:2: kw= '1'
                            	    {
                            	    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleURL_HOST3455); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitOneKeyword_1_0_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 3 :
                            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1580:2: kw= '2'
                            	    {
                            	    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleURL_HOST3474); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitTwoKeyword_1_0_1_1_2()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 4 :
                            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1587:2: kw= '3'
                            	    {
                            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleURL_HOST3493); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitThreeKeyword_1_0_1_1_3()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 5 :
                            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1594:2: kw= '4'
                            	    {
                            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleURL_HOST3512); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitFourKeyword_1_0_1_1_4()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 6 :
                            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1601:2: kw= '5'
                            	    {
                            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleURL_HOST3531); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitFiveKeyword_1_0_1_1_5()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 7 :
                            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1608:2: kw= '6'
                            	    {
                            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleURL_HOST3550); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitSixKeyword_1_0_1_1_6()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 8 :
                            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1615:2: kw= '7'
                            	    {
                            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleURL_HOST3569); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitSevenKeyword_1_0_1_1_7()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 9 :
                            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1622:2: kw= '8'
                            	    {
                            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleURL_HOST3588); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitEightKeyword_1_0_1_1_8()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 10 :
                            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1629:2: kw= '9'
                            	    {
                            	    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleURL_HOST3607); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitNineKeyword_1_0_1_1_9()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt42 >= 1 ) break loop42;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(42, input);
                                        throw eee;
                                }
                                cnt42++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1636:5: this_PROPERTY_REF_13= rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURL_HOSTAccess().getPROPERTY_REFParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_ruleURL_HOST3640);
                    this_PROPERTY_REF_13=rulePROPERTY_REF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PROPERTY_REF_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleURL_HOST"


    // $ANTLR start "entryRuleURL_PATH"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1654:1: entryRuleURL_PATH returns [String current=null] : iv_ruleURL_PATH= ruleURL_PATH EOF ;
    public final String entryRuleURL_PATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_PATH = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1655:2: (iv_ruleURL_PATH= ruleURL_PATH EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1656:2: iv_ruleURL_PATH= ruleURL_PATH EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_entryRuleURL_PATH3687);
            iv_ruleURL_PATH=ruleURL_PATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_PATH.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL_PATH3698); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1663:1: ruleURL_PATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )* (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF ) ) ;
    public final AntlrDatatypeRuleToken ruleURL_PATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FolderName_1 = null;

        AntlrDatatypeRuleToken this_PROPERTY_REF_2 = null;

        AntlrDatatypeRuleToken this_FileName_4 = null;

        AntlrDatatypeRuleToken this_PROPERTY_REF_5 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1666:28: ( (kw= '/' (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )* (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1667:1: (kw= '/' (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )* (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1667:1: (kw= '/' (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )* (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1668:2: kw= '/' (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )* (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF )
            {
            kw=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleURL_PATH3736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getURL_PATHAccess().getSolidusKeyword_0()); 
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1673:1: (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )*
            loop45:
            do {
                int alt45=3;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1674:5: this_FolderName_1= ruleFolderName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getURL_PATHAccess().getFolderNameParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_ruleURL_PATH3759);
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
            	case 2 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1685:6: (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1685:6: (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1686:5: this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getURL_PATHAccess().getPROPERTY_REFParserRuleCall_1_1_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_ruleURL_PATH3793);
            	    this_PROPERTY_REF_2=rulePROPERTY_REF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PROPERTY_REF_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleURL_PATH3811); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getURL_PATHAccess().getSolidusKeyword_1_1_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1702:4: (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==13) ) {
                alt46=1;
            }
            else if ( (LA46_0==15) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1703:5: this_FileName_4= ruleFileName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURL_PATHAccess().getFileNameParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleURL_PATH3837);
                    this_FileName_4=ruleFileName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FileName_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1715:5: this_PROPERTY_REF_5= rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURL_PATHAccess().getPROPERTY_REFParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_ruleURL_PATH3870);
                    this_PROPERTY_REF_5=rulePROPERTY_REF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PROPERTY_REF_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleURL_PATH"


    // $ANTLR start "entryRuleURL"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1733:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1734:2: (iv_ruleURL= ruleURL EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1735:2: iv_ruleURL= ruleURL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_in_entryRuleURL3917);
            iv_ruleURL=ruleURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURL3928); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1742:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_URL_SCHEME_0 = null;

        AntlrDatatypeRuleToken this_URL_HOST_2 = null;

        AntlrDatatypeRuleToken this_URL_PATH_3 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1745:28: ( (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1746:1: (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1746:1: (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1747:5: this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getURLAccess().getURL_SCHEMEParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleURL_SCHEME_in_ruleURL3975);
            this_URL_SCHEME_0=ruleURL_SCHEME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_URL_SCHEME_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleURL3993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getURLAccess().getColonKeyword_1()); 
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1763:1: (this_URL_HOST_2= ruleURL_HOST )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==27) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1764:5: this_URL_HOST_2= ruleURL_HOST
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURLAccess().getURL_HOSTParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_in_ruleURL4016);
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
            pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_ruleURL4045);
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1793:1: entryRuleURLContentProvider returns [EObject current=null] : iv_ruleURLContentProvider= ruleURLContentProvider EOF ;
    public final EObject entryRuleURLContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLContentProvider = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1794:2: (iv_ruleURLContentProvider= ruleURLContentProvider EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1795:2: iv_ruleURLContentProvider= ruleURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURLContentProvider_in_entryRuleURLContentProvider4090);
            iv_ruleURLContentProvider=ruleURLContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURLContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURLContentProvider4100); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1802:1: ruleURLContentProvider returns [EObject current=null] : ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) ) ;
    public final EObject ruleURLContentProvider() throws RecognitionException {
        EObject current = null;

        Token lv_urlString_0_1=null;
        AntlrDatatypeRuleToken lv_urlString_0_2 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1805:28: ( ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1806:1: ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1806:1: ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1807:1: ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1807:1: ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1808:1: (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1808:1: (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=23 && LA48_0<=26)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1809:3: lv_urlString_0_1= RULE_STRING
                    {
                    lv_urlString_0_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleURLContentProvider4143); if (state.failed) return current;
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
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1824:8: lv_urlString_0_2= ruleURL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURLContentProviderAccess().getUrlStringURLParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURL_in_ruleURLContentProvider4167);
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1850:1: entryRuleGitURLContentProvider returns [EObject current=null] : iv_ruleGitURLContentProvider= ruleGitURLContentProvider EOF ;
    public final EObject entryRuleGitURLContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitURLContentProvider = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1851:2: (iv_ruleGitURLContentProvider= ruleGitURLContentProvider EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1852:2: iv_ruleGitURLContentProvider= ruleGitURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGitURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitURLContentProvider_in_entryRuleGitURLContentProvider4205);
            iv_ruleGitURLContentProvider=ruleGitURLContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGitURLContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitURLContentProvider4215); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1859:1: ruleGitURLContentProvider returns [EObject current=null] : ( (lv_gitRef_0_0= ruleGitContentRef ) ) ;
    public final EObject ruleGitURLContentProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_gitRef_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1862:28: ( ( (lv_gitRef_0_0= ruleGitContentRef ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1863:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1863:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1864:1: (lv_gitRef_0_0= ruleGitContentRef )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1864:1: (lv_gitRef_0_0= ruleGitContentRef )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1865:3: lv_gitRef_0_0= ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGitURLContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_ruleGitURLContentProvider4260);
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


    // $ANTLR start "entryRuleGitContentRef"
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1889:1: entryRuleGitContentRef returns [EObject current=null] : iv_ruleGitContentRef= ruleGitContentRef EOF ;
    public final EObject entryRuleGitContentRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitContentRef = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1890:2: (iv_ruleGitContentRef= ruleGitContentRef EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1891:2: iv_ruleGitContentRef= ruleGitContentRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGitContentRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGitContentRef_in_entryRuleGitContentRef4295);
            iv_ruleGitContentRef=ruleGitContentRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGitContentRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGitContentRef4305); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1898:1: ruleGitContentRef returns [EObject current=null] : (otherlv_0= 'git' otherlv_1= '@' ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? ) ;
    public final EObject ruleGitContentRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_owner_4_1=null;
        Token lv_owner_5_1=null;
        Token otherlv_6=null;
        Token lv_repo_7_0=null;
        AntlrDatatypeRuleToken lv_host_2_1 = null;

        AntlrDatatypeRuleToken lv_host_2_2 = null;

        AntlrDatatypeRuleToken lv_owner_4_2 = null;

        AntlrDatatypeRuleToken lv_owner_5_2 = null;

        AntlrDatatypeRuleToken lv_path_8_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1901:28: ( (otherlv_0= 'git' otherlv_1= '@' ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1902:1: (otherlv_0= 'git' otherlv_1= '@' ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1902:1: (otherlv_0= 'git' otherlv_1= '@' ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1902:3: otherlv_0= 'git' otherlv_1= '@' ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )?
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleGitContentRef4342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGitContentRefAccess().getGitKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGitContentRef4354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGitContentRefAccess().getCommercialAtKeyword_1());
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1910:1: ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1910:2: ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1910:2: ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1910:3: ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )?
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1910:3: ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1911:1: ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1911:1: ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1912:1: (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1912:1: (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==15) ) {
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
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1913:3: lv_host_2_1= ruleURL_HOST_NAME
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getGitContentRefAccess().getHostURL_HOST_NAMEParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleURL_HOST_NAME_in_ruleGitContentRef4379);
                            lv_host_2_1=ruleURL_HOST_NAME();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getGitContentRefRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"host",
                                      		lv_host_2_1, 
                                      		"URL_HOST_NAME");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1928:8: lv_host_2_2= rulePROPERTY_REF
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getGitContentRefAccess().getHostPROPERTY_REFParserRuleCall_2_0_0_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_ruleGitContentRef4398);
                            lv_host_2_2=rulePROPERTY_REF();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getGitContentRefRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"host",
                                      		lv_host_2_2, 
                                      		"PROPERTY_REF");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1946:2: (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==19) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1946:4: otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) )
                            {
                            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGitContentRef4414); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getGitContentRefAccess().getColonKeyword_2_0_1_0());
                                  
                            }
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1950:1: ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) )
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1951:1: ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) )
                            {
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1951:1: ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) )
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1952:1: (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF )
                            {
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1952:1: (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF )
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==RULE_ID) ) {
                                alt50=1;
                            }
                            else if ( (LA50_0==15) ) {
                                alt50=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 0, input);

                                throw nvae;
                            }
                            switch (alt50) {
                                case 1 :
                                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1953:3: lv_owner_4_1= RULE_ID
                                    {
                                    lv_owner_4_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGitContentRef4433); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_owner_4_1, grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_0_1_1_0_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getGitContentRefRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"owner",
                                              		lv_owner_4_1, 
                                              		"ID");
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1968:8: lv_owner_4_2= rulePROPERTY_REF
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getGitContentRefAccess().getOwnerPROPERTY_REFParserRuleCall_2_0_1_1_0_1()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_ruleGitContentRef4457);
                                    lv_owner_4_2=rulePROPERTY_REF();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getGitContentRefRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"owner",
                                              		lv_owner_4_2, 
                                              		"PROPERTY_REF");
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
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1987:6: ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1987:6: ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1988:1: ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1988:1: ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1989:1: (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1989:1: (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_ID) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==15) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:1990:3: lv_owner_5_1= RULE_ID
                            {
                            lv_owner_5_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGitContentRef4488); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_owner_5_1, grammarAccess.getGitContentRefAccess().getOwnerIDTerminalRuleCall_2_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGitContentRefRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"owner",
                                      		lv_owner_5_1, 
                                      		"ID");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2005:8: lv_owner_5_2= rulePROPERTY_REF
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getGitContentRefAccess().getOwnerPROPERTY_REFParserRuleCall_2_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePROPERTY_REF_in_ruleGitContentRef4512);
                            lv_owner_5_2=rulePROPERTY_REF();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getGitContentRefRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"owner",
                                      		lv_owner_5_2, 
                                      		"PROPERTY_REF");
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

            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGitContentRef4528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getGitContentRefAccess().getSolidusKeyword_3());
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2027:1: ( (lv_repo_7_0= RULE_ID ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2028:1: (lv_repo_7_0= RULE_ID )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2028:1: (lv_repo_7_0= RULE_ID )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2029:3: lv_repo_7_0= RULE_ID
            {
            lv_repo_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGitContentRef4545); if (state.failed) return current;
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

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2045:2: ( (lv_path_8_0= ruleURL_PATH ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==12) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2046:1: (lv_path_8_0= ruleURL_PATH )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2046:1: (lv_path_8_0= ruleURL_PATH )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2047:3: lv_path_8_0= ruleURL_PATH
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGitContentRefAccess().getPathURL_PATHParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURL_PATH_in_ruleGitContentRef4571);
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2071:1: entryRuleDotClasspathFileContentProvider returns [EObject current=null] : iv_ruleDotClasspathFileContentProvider= ruleDotClasspathFileContentProvider EOF ;
    public final EObject entryRuleDotClasspathFileContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotClasspathFileContentProvider = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2072:2: (iv_ruleDotClasspathFileContentProvider= ruleDotClasspathFileContentProvider EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2073:2: iv_ruleDotClasspathFileContentProvider= ruleDotClasspathFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotClasspathFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDotClasspathFileContentProvider_in_entryRuleDotClasspathFileContentProvider4608);
            iv_ruleDotClasspathFileContentProvider=ruleDotClasspathFileContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotClasspathFileContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotClasspathFileContentProvider4618); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2080:1: ruleDotClasspathFileContentProvider returns [EObject current=null] : (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' ) ;
    public final EObject ruleDotClasspathFileContentProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2083:28: ( (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2084:1: (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2084:1: (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2084:3: otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDotClasspathFileContentProvider4655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDotClasspathFileContentProviderAccess().getDotClasspathKeyword_0());
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2088:1: ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=43 && LA55_0<=46)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2089:1: (lv_entries_1_0= ruleAbstractClasspathEntry )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2089:1: (lv_entries_1_0= ruleAbstractClasspathEntry )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2090:3: lv_entries_1_0= ruleAbstractClasspathEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAbstractClasspathEntryParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractClasspathEntry_in_ruleDotClasspathFileContentProvider4676);
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
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDotClasspathFileContentProvider4689); if (state.failed) return current;
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2118:1: entryRuleAbstractClasspathEntry returns [EObject current=null] : iv_ruleAbstractClasspathEntry= ruleAbstractClasspathEntry EOF ;
    public final EObject entryRuleAbstractClasspathEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClasspathEntry = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2119:2: (iv_ruleAbstractClasspathEntry= ruleAbstractClasspathEntry EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2120:2: iv_ruleAbstractClasspathEntry= ruleAbstractClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAbstractClasspathEntry_in_entryRuleAbstractClasspathEntry4725);
            iv_ruleAbstractClasspathEntry=ruleAbstractClasspathEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractClasspathEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractClasspathEntry4735); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2127:1: ruleAbstractClasspathEntry returns [EObject current=null] : this_ClasspathEntry_0= ruleClasspathEntry ;
    public final EObject ruleAbstractClasspathEntry() throws RecognitionException {
        EObject current = null;

        EObject this_ClasspathEntry_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2130:28: (this_ClasspathEntry_0= ruleClasspathEntry )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2132:5: this_ClasspathEntry_0= ruleClasspathEntry
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAbstractClasspathEntryAccess().getClasspathEntryParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntry_in_ruleAbstractClasspathEntry4781);
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2148:1: entryRuleCLASSPATH_ENTRY_PATH returns [String current=null] : iv_ruleCLASSPATH_ENTRY_PATH= ruleCLASSPATH_ENTRY_PATH EOF ;
    public final String entryRuleCLASSPATH_ENTRY_PATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCLASSPATH_ENTRY_PATH = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2149:2: (iv_ruleCLASSPATH_ENTRY_PATH= ruleCLASSPATH_ENTRY_PATH EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2150:2: iv_ruleCLASSPATH_ENTRY_PATH= ruleCLASSPATH_ENTRY_PATH EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCLASSPATH_ENTRY_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_entryRuleCLASSPATH_ENTRY_PATH4816);
            iv_ruleCLASSPATH_ENTRY_PATH=ruleCLASSPATH_ENTRY_PATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCLASSPATH_ENTRY_PATH.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCLASSPATH_ENTRY_PATH4827); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2157:1: ruleCLASSPATH_ENTRY_PATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName ) ;
    public final AntlrDatatypeRuleToken ruleCLASSPATH_ENTRY_PATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FolderName_0 = null;

        AntlrDatatypeRuleToken this_FileName_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2160:28: ( ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2161:1: ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2161:1: ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2161:2: (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2161:2: (this_FolderName_0= ruleFolderName )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2162:5: this_FolderName_0= ruleFolderName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFolderNameParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFolderName_in_ruleCLASSPATH_ENTRY_PATH4875);
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
            	    break loop56;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFileNameParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleCLASSPATH_ENTRY_PATH4904);
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2191:1: entryRuleClasspathEntry returns [EObject current=null] : iv_ruleClasspathEntry= ruleClasspathEntry EOF ;
    public final EObject entryRuleClasspathEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasspathEntry = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2192:2: (iv_ruleClasspathEntry= ruleClasspathEntry EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2193:2: iv_ruleClasspathEntry= ruleClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntry_in_entryRuleClasspathEntry4949);
            iv_ruleClasspathEntry=ruleClasspathEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClasspathEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClasspathEntry4959); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2200:1: ruleClasspathEntry returns [EObject current=null] : ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_absolute_1_0= '/' ) )? ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )? ) ;
    public final EObject ruleClasspathEntry() throws RecognitionException {
        EObject current = null;

        Token lv_absolute_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_explicitKind_0_0 = null;

        AntlrDatatypeRuleToken lv_explicitPath_2_0 = null;

        AntlrDatatypeRuleToken lv_major_4_0 = null;

        AntlrDatatypeRuleToken lv_minor_6_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2203:28: ( ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_absolute_1_0= '/' ) )? ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )? ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2204:1: ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_absolute_1_0= '/' ) )? ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )? )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2204:1: ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_absolute_1_0= '/' ) )? ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )? )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2204:2: ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_absolute_1_0= '/' ) )? ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )?
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2204:2: ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2205:1: (lv_explicitKind_0_0= ruleClasspathEntryKind )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2205:1: (lv_explicitKind_0_0= ruleClasspathEntryKind )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2206:3: lv_explicitKind_0_0= ruleClasspathEntryKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getExplicitKindClasspathEntryKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleClasspathEntryKind_in_ruleClasspathEntry5005);
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

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2222:2: ( (lv_absolute_1_0= '/' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==12) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2223:1: (lv_absolute_1_0= '/' )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2223:1: (lv_absolute_1_0= '/' )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2224:3: lv_absolute_1_0= '/'
                    {
                    lv_absolute_1_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClasspathEntry5023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_absolute_1_0, grammarAccess.getClasspathEntryAccess().getAbsoluteSolidusKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClasspathEntryRule());
                      	        }
                             		setWithLastConsumed(current, "absolute", true, "/");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2237:3: ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2238:1: (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2238:1: (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2239:3: lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getExplicitPathCLASSPATH_ENTRY_PATHParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_ruleClasspathEntry5058);
            lv_explicitPath_2_0=ruleCLASSPATH_ENTRY_PATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClasspathEntryRule());
              	        }
                     		set(
                     			current, 
                     			"explicitPath",
                      		lv_explicitPath_2_0, 
                      		"CLASSPATH_ENTRY_PATH");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2255:2: (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==40) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2255:4: otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleClasspathEntry5071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClasspathEntryAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2259:1: ( (lv_major_4_0= ruleVERSION ) )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2260:1: (lv_major_4_0= ruleVERSION )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2260:1: (lv_major_4_0= ruleVERSION )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2261:3: lv_major_4_0= ruleVERSION
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getMajorVERSIONParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_ruleClasspathEntry5092);
                    lv_major_4_0=ruleVERSION();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClasspathEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"major",
                              		lv_major_4_0, 
                              		"VERSION");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2277:2: (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==13) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2277:4: otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) )
                            {
                            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClasspathEntry5105); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getClasspathEntryAccess().getFullStopKeyword_3_2_0());
                                  
                            }
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2281:1: ( (lv_minor_6_0= ruleVERSION ) )
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2282:1: (lv_minor_6_0= ruleVERSION )
                            {
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2282:1: (lv_minor_6_0= ruleVERSION )
                            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2283:3: lv_minor_6_0= ruleVERSION
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getMinorVERSIONParserRuleCall_3_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_ruleClasspathEntry5126);
                            lv_minor_6_0=ruleVERSION();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getClasspathEntryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minor",
                                      		lv_minor_6_0, 
                                      		"VERSION");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleClasspathEntry5140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getClasspathEntryAccess().getRightParenthesisKeyword_3_3());
                          
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2311:1: entryRuleVERSION returns [String current=null] : iv_ruleVERSION= ruleVERSION EOF ;
    public final String entryRuleVERSION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVERSION = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2312:2: (iv_ruleVERSION= ruleVERSION EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2313:2: iv_ruleVERSION= ruleVERSION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVERSIONRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVERSION_in_entryRuleVERSION5179);
            iv_ruleVERSION=ruleVERSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVERSION.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVERSION5190); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2320:1: ruleVERSION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ ;
    public final AntlrDatatypeRuleToken ruleVERSION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2323:28: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2324:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2324:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=11;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    alt60=1;
                    }
                    break;
                case 29:
                    {
                    alt60=2;
                    }
                    break;
                case 30:
                    {
                    alt60=3;
                    }
                    break;
                case 31:
                    {
                    alt60=4;
                    }
                    break;
                case 32:
                    {
                    alt60=5;
                    }
                    break;
                case 33:
                    {
                    alt60=6;
                    }
                    break;
                case 34:
                    {
                    alt60=7;
                    }
                    break;
                case 35:
                    {
                    alt60=8;
                    }
                    break;
                case 36:
                    {
                    alt60=9;
                    }
                    break;
                case 37:
                    {
                    alt60=10;
                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2325:2: kw= '0'
            	    {
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleVERSION5228); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitZeroKeyword_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2332:2: kw= '1'
            	    {
            	    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleVERSION5247); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitOneKeyword_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2339:2: kw= '2'
            	    {
            	    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleVERSION5266); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitTwoKeyword_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2346:2: kw= '3'
            	    {
            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleVERSION5285); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitThreeKeyword_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2353:2: kw= '4'
            	    {
            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleVERSION5304); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitFourKeyword_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2360:2: kw= '5'
            	    {
            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleVERSION5323); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitFiveKeyword_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2367:2: kw= '6'
            	    {
            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleVERSION5342); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitSixKeyword_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2374:2: kw= '7'
            	    {
            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleVERSION5361); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitSevenKeyword_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2381:2: kw= '8'
            	    {
            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleVERSION5380); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitEightKeyword_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2388:2: kw= '9'
            	    {
            	    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleVERSION5399); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitNineKeyword_9()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2401:1: entryRuleDotProjectFileContentProvider returns [EObject current=null] : iv_ruleDotProjectFileContentProvider= ruleDotProjectFileContentProvider EOF ;
    public final EObject entryRuleDotProjectFileContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotProjectFileContentProvider = null;


        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2402:2: (iv_ruleDotProjectFileContentProvider= ruleDotProjectFileContentProvider EOF )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2403:2: iv_ruleDotProjectFileContentProvider= ruleDotProjectFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotProjectFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDotProjectFileContentProvider_in_entryRuleDotProjectFileContentProvider5440);
            iv_ruleDotProjectFileContentProvider=ruleDotProjectFileContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotProjectFileContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotProjectFileContentProvider5450); if (state.failed) return current;

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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2410:1: ruleDotProjectFileContentProvider returns [EObject current=null] : (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' ) ;
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
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2413:28: ( (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2414:1: (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2414:1: (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2414:3: otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDotProjectFileContentProvider5487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDotProjectFileContentProviderAccess().getDotProjectKeyword_0());
                  
            }
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2418:1: (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==9) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2418:3: otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) )
            	    {
            	    otherlv_1=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleDotProjectFileContentProvider5500); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDotProjectFileContentProviderAccess().getNumberSignKeyword_1_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2422:1: ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2423:1: ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2423:1: ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2424:1: (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2424:1: (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName )
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==RULE_STRING) ) {
            	        alt61=1;
            	    }
            	    else if ( (LA61_0==RULE_ID||LA61_0==13) ) {
            	        alt61=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 61, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2425:3: lv_keys_2_1= RULE_STRING
            	            {
            	            lv_keys_2_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDotProjectFileContentProvider5519); if (state.failed) return current;
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
            	            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2440:8: lv_keys_2_2= ruleFileName
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDotProjectFileContentProviderAccess().getKeysFileNameParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FollowSets000.FOLLOW_ruleFileName_in_ruleDotProjectFileContentProvider5543);
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
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2458:4: (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==18) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2458:6: otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )*
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDotProjectFileContentProvider5561); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getDotProjectFileContentProviderAccess().getCommercialAtKeyword_2_0());
            	          
            	    }
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2462:1: ( ( ruleEmfsName ) )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2463:1: ( ruleEmfsName )
            	    {
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2463:1: ( ruleEmfsName )
            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2464:3: ruleEmfsName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDotProjectFileContentProviderRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleDotProjectFileContentProvider5584);
            	    ruleEmfsName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2477:2: (otherlv_5= ',' ( ( ruleEmfsName ) ) )*
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==14) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2477:4: otherlv_5= ',' ( ( ruleEmfsName ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDotProjectFileContentProvider5597); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_5, grammarAccess.getDotProjectFileContentProviderAccess().getCommaKeyword_2_2_0());
            	    	          
            	    	    }
            	    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2481:1: ( ( ruleEmfsName ) )
            	    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2482:1: ( ruleEmfsName )
            	    	    {
            	    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2482:1: ( ruleEmfsName )
            	    	    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2483:3: ruleEmfsName
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getDotProjectFileContentProviderRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleEmfsName_in_ruleDotProjectFileContentProvider5620);
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
            	    	    break loop63;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_7=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDotProjectFileContentProvider5636); if (state.failed) return current;
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
    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2508:1: ruleClasspathEntryKind returns [Enumerator current=null] : ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) ) ;
    public final Enumerator ruleClasspathEntryKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2510:28: ( ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) ) )
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2511:1: ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) )
            {
            // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2511:1: ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt65=1;
                }
                break;
            case 44:
                {
                alt65=2;
                }
                break;
            case 45:
                {
                alt65=3;
                }
                break;
            case 46:
                {
                alt65=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2511:2: (enumLiteral_0= 'source-folder' )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2511:2: (enumLiteral_0= 'source-folder' )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2511:4: enumLiteral_0= 'source-folder'
                    {
                    enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleClasspathEntryKind5686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2517:6: (enumLiteral_1= 'output-folder' )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2517:6: (enumLiteral_1= 'output-folder' )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2517:8: enumLiteral_1= 'output-folder'
                    {
                    enumLiteral_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleClasspathEntryKind5703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2523:6: (enumLiteral_2= 'library-jar' )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2523:6: (enumLiteral_2= 'library-jar' )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2523:8: enumLiteral_2= 'library-jar'
                    {
                    enumLiteral_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleClasspathEntryKind5720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2529:6: (enumLiteral_3= 'class-container' )
                    {
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2529:6: (enumLiteral_3= 'class-container' )
                    // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:2529:8: enumLiteral_3= 'class-container'
                    {
                    enumLiteral_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleClasspathEntryKind5737); if (state.failed) return current;
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
        // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:660:4: ( ';' )
        // ../no.hal.emfs.xtext.runtime/src-gen/no/hal/emfs/xtext/parser/antlr/internal/InternalXemfs.g:660:6: ';'
        {
        match(input,11,FollowSets000.FOLLOW_11_in_synpred1_InternalXemfs1389); if (state.failed) return ;

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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String DFA12_eotS =
        "\7\uffff";
    static final String DFA12_eofS =
        "\7\uffff";
    static final String DFA12_minS =
        "\2\4\1\5\1\4\2\uffff\1\5";
    static final String DFA12_maxS =
        "\1\15\1\4\1\24\1\4\2\uffff\1\24";
    static final String DFA12_acceptS =
        "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA12_specialS =
        "\7\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\10\uffff\1\1",
            "\1\2",
            "\2\4\2\uffff\1\4\1\uffff\1\4\1\5\1\3\1\uffff\1\4\1\uffff\4\4",
            "\1\6",
            "",
            "",
            "\2\4\2\uffff\1\4\1\uffff\1\4\1\5\1\3\1\uffff\1\4\1\uffff\4\4"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "379:1: (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile )";
        }
    }
    static final String DFA22_eotS =
        "\11\uffff";
    static final String DFA22_eofS =
        "\3\uffff\1\1\5\uffff";
    static final String DFA22_minS =
        "\1\5\1\uffff\3\4\1\uffff\1\5\1\4\1\5";
    static final String DFA22_maxS =
        "\1\24\1\uffff\1\25\1\24\1\4\1\uffff\1\24\1\4\1\24";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\3\uffff\1\1\3\uffff";
    static final String DFA22_specialS =
        "\11\uffff}>";
    static final String[] DFA22_transitionS = {
            "\2\1\4\uffff\1\1\3\uffff\1\2\2\uffff\3\1",
            "",
            "\1\3\14\uffff\1\1\3\uffff\1\1",
            "\3\1\4\uffff\1\1\1\uffff\1\4\1\uffff\1\1\1\5\1\uffff\3\1",
            "\1\6",
            "",
            "\2\1\2\uffff\1\1\1\uffff\2\1\1\7\1\uffff\1\1\1\5\4\1",
            "\1\10",
            "\2\1\2\uffff\1\1\1\uffff\2\1\1\7\1\uffff\1\1\1\5\4\1"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()* loopback of 812:4: ( (lv_properties_4_0= ruleProperty ) )*";
        }
    }
    static final String DFA24_eotS =
        "\161\uffff";
    static final String DFA24_eofS =
        "\3\uffff\2\14\1\uffff\1\14\12\uffff\2\14\1\uffff\1\14\7\uffff\1\14\4\uffff\1\14\117\uffff";
    static final String DFA24_minS =
        "\1\5\1\4\1\5\5\4\1\5\2\4\2\uffff\1\4\1\15\1\5\1\15\7\4\2\15\2\5\3\4\2\5\1\4\1\5\4\23\1\22\1\14\3\4\1\14\1\4\1\15\2\4\1\5\4\4\1\14\2\4\1\14\3\4\1\5\1\14\1\5\1\15\1\4\1\14\1\15\1\5\1\15\3\4\2\14\1\4\1\34\1\4\1\14\1\4\1\5\1\4\1\5\1\4\1\15\1\4\13\14\2\15\3\4\1\5\1\15\1\5\1\15\2\4\1\14\1\4\1\5\2\15";
    static final String DFA24_maxS =
        "\1\24\1\25\1\21\2\24\1\25\1\24\1\4\1\17\2\4\2\uffff\1\5\1\26\1\17\1\20\2\24\1\4\1\24\1\4\1\5\1\4\1\26\1\20\2\17\1\24\2\4\1\46\1\17\2\24\4\23\1\22\1\33\3\17\1\15\1\25\1\15\1\25\1\4\1\24\1\25\3\4\1\23\2\4\1\14\1\4\1\17\1\4\1\24\1\23\1\24\1\26\1\17\1\23\1\26\1\24\1\26\2\17\1\4\1\23\1\14\1\25\1\45\1\4\1\14\1\4\1\24\1\4\1\24\1\25\1\26\1\4\1\14\12\45\2\26\1\4\1\17\1\4\1\24\1\26\1\24\1\26\1\17\1\4\1\14\1\4\1\24\2\26";
    static final String DFA24_acceptS =
        "\13\uffff\1\2\1\1\144\uffff";
    static final String DFA24_specialS =
        "\161\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\3\1\4\10\uffff\1\1\4\uffff\1\2",
            "\1\6\14\uffff\1\5\3\uffff\1\7",
            "\1\3\1\4\2\uffff\1\11\5\uffff\1\12\1\uffff\1\10",
            "\3\14\4\uffff\1\14\1\uffff\1\14\1\uffff\1\14\2\uffff\1\13\1\uffff\1\14",
            "\3\14\4\uffff\1\14\1\uffff\1\14\1\uffff\1\14\2\uffff\1\13\1\uffff\1\14",
            "\1\6\20\uffff\1\7",
            "\3\14\4\uffff\1\14\1\uffff\1\14\1\uffff\1\14\2\uffff\1\13\1\15\1\14",
            "\1\16",
            "\1\3\1\4\2\uffff\1\11\5\uffff\1\12",
            "\1\17",
            "\1\20",
            "",
            "",
            "\1\22\1\21",
            "\1\23\10\uffff\1\24",
            "\1\3\1\4\2\uffff\1\11\5\uffff\1\12",
            "\1\25\2\uffff\1\26",
            "\3\14\4\uffff\1\14\1\uffff\1\14\1\uffff\1\14\2\uffff\1\13\1\uffff\1\14",
            "\3\14\4\uffff\1\14\1\uffff\1\27\1\uffff\1\14\2\uffff\1\13\1\uffff\1\14",
            "\1\30",
            "\3\14\4\uffff\1\14\1\uffff\1\14\1\uffff\1\14\2\uffff\1\13\1\15\1\14",
            "\1\31",
            "\1\33\1\32",
            "\1\34",
            "\1\23\10\uffff\1\24",
            "\1\25\2\uffff\1\26",
            "\1\3\1\4\10\uffff\1\12",
            "\1\3\1\4\6\uffff\1\35\1\uffff\1\12",
            "\3\14\2\uffff\1\14\1\uffff\2\14\1\36\1\uffff\1\14\1\uffff\1\14\1\37\2\14",
            "\1\40",
            "\1\41",
            "\1\42\21\uffff\1\43\1\44\1\45\1\46\13\uffff\1\47",
            "\1\3\1\4\6\uffff\1\35\1\uffff\1\12",
            "\3\14\2\uffff\1\14\1\uffff\2\14\1\36\1\uffff\1\14\1\uffff\1\14\1\37\2\14",
            "\2\13\4\uffff\1\14\3\uffff\1\13\4\uffff\1\13",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\50",
            "\1\51",
            "\1\53\16\uffff\1\52",
            "\1\54\12\uffff\1\55",
            "\1\56\12\uffff\1\57",
            "\1\61\10\uffff\1\60\1\uffff\1\62",
            "\1\64\1\63",
            "\1\66\20\uffff\1\65",
            "\1\67",
            "\1\71\20\uffff\1\70",
            "\1\61",
            "\2\13\4\uffff\1\14\1\73\1\72\1\uffff\1\13\4\uffff\1\13",
            "\1\75\20\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\64\6\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\53",
            "\1\104",
            "\1\61\10\uffff\1\60\1\uffff\1\62",
            "\1\105",
            "\2\13\4\uffff\1\14\1\106\2\uffff\1\13\4\uffff\1\13",
            "\1\64\1\63\5\uffff\1\101",
            "\2\13\4\uffff\1\14\1\107\2\uffff\1\13\4\uffff\1\13",
            "\1\110\10\uffff\1\111",
            "\1\112\12\uffff\1\113",
            "\1\53\1\67\5\uffff\1\114",
            "\1\115\10\uffff\1\116",
            "\2\13\4\uffff\1\14\1\73\1\72\1\uffff\1\13\4\uffff\1\13",
            "\1\117\10\uffff\1\120",
            "\1\61\10\uffff\1\60\1\uffff\1\62",
            "\1\122\10\uffff\1\121\1\uffff\1\123",
            "\1\124",
            "\1\64\6\uffff\1\101",
            "\1\64",
            "\1\126\20\uffff\1\125",
            "\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\141",
            "\1\53",
            "\1\142",
            "\2\13\4\uffff\1\14\1\106\2\uffff\1\13\4\uffff\1\13",
            "\1\122",
            "\2\13\4\uffff\1\14\1\144\1\143\1\uffff\1\13\4\uffff\1\13",
            "\1\146\20\uffff\1\145",
            "\1\110\10\uffff\1\111",
            "\1\147",
            "\1\64",
            "\1\53\17\uffff\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\53\17\uffff\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\53\17\uffff\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\53\17\uffff\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\53\17\uffff\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\53\17\uffff\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\53\17\uffff\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\53\17\uffff\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\53\17\uffff\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\53\17\uffff\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\115\10\uffff\1\116",
            "\1\117\10\uffff\1\120",
            "\1\150",
            "\1\122\10\uffff\1\121\1\uffff\1\123",
            "\1\151",
            "\2\13\4\uffff\1\14\1\152\2\uffff\1\13\4\uffff\1\13",
            "\1\153\10\uffff\1\154",
            "\2\13\4\uffff\1\14\1\144\1\143\1\uffff\1\13\4\uffff\1\13",
            "\1\155\10\uffff\1\156",
            "\1\122\10\uffff\1\121\1\uffff\1\123",
            "\1\157",
            "\1\64",
            "\1\160",
            "\2\13\4\uffff\1\14\1\152\2\uffff\1\13\4\uffff\1\13",
            "\1\153\10\uffff\1\154",
            "\1\155\10\uffff\1\156"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "877:1: (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider )";
        }
    }
    static final String DFA45_eotS =
        "\17\uffff";
    static final String DFA45_eofS =
        "\2\uffff\1\5\5\uffff\2\5\3\uffff\1\5\1\uffff";
    static final String DFA45_minS =
        "\2\4\1\5\2\4\2\uffff\1\4\2\5\1\15\1\uffff\1\4\1\5\1\15";
    static final String DFA45_maxS =
        "\1\17\1\4\1\24\1\25\1\4\2\uffff\1\4\2\24\1\26\1\uffff\1\4\1\24\1\26";
    static final String DFA45_acceptS =
        "\5\uffff\1\3\1\1\4\uffff\1\2\3\uffff";
    static final String DFA45_specialS =
        "\17\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\2\10\uffff\1\1\1\uffff\1\3",
            "\1\2",
            "\2\5\4\uffff\1\5\1\6\1\4\1\uffff\1\5\4\uffff\1\5",
            "\1\10\20\uffff\1\7",
            "\1\11",
            "",
            "",
            "\1\12",
            "\2\5\4\uffff\1\5\1\13\2\uffff\1\5\4\uffff\1\5",
            "\2\5\4\uffff\1\5\1\6\1\4\1\uffff\1\5\4\uffff\1\5",
            "\1\14\10\uffff\1\15",
            "",
            "\1\16",
            "\2\5\4\uffff\1\5\1\13\2\uffff\1\5\4\uffff\1\5",
            "\1\14\10\uffff\1\15"
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
            return "()* loopback of 1673:1: (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )*";
        }
    }
    static final String DFA53_eotS =
        "\13\uffff";
    static final String DFA53_eofS =
        "\13\uffff";
    static final String DFA53_minS =
        "\1\4\1\14\1\4\2\uffff\1\4\1\uffff\1\15\1\4\1\uffff\1\15";
    static final String DFA53_maxS =
        "\1\17\1\15\1\25\2\uffff\1\4\1\uffff\1\26\1\4\1\uffff\1\26";
    static final String DFA53_acceptS =
        "\3\uffff\1\2\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff";
    static final String DFA53_specialS =
        "\13\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\12\uffff\1\2",
            "\1\3\1\4",
            "\1\6\20\uffff\1\5",
            "",
            "",
            "\1\7",
            "",
            "\1\10\10\uffff\1\11",
            "\1\12",
            "",
            "\1\10\10\uffff\1\11"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "1910:1: ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) )";
        }
    }
    static final String DFA56_eotS =
        "\7\uffff";
    static final String DFA56_eofS =
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA56_minS =
        "\2\4\1\13\1\4\2\uffff\1\13";
    static final String DFA56_maxS =
        "\1\15\1\4\1\56\1\4\2\uffff\1\56";
    static final String DFA56_acceptS =
        "\4\uffff\1\1\1\2\1\uffff";
    static final String DFA56_specialS =
        "\7\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\2\10\uffff\1\1",
            "\1\2",
            "\1\5\1\4\1\3\32\uffff\1\5\2\uffff\4\5",
            "\1\6",
            "",
            "",
            "\1\5\1\4\1\3\32\uffff\1\5\2\uffff\4\5"
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "()* loopback of 2161:2: (this_FolderName_0= ruleFolderName )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEmfsRoot_in_entryRuleEmfsRoot75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsRoot85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_ruleEmfsRoot132 = new BitSet(new long[]{0x0000000000009610L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleEmfsRoot153 = new BitSet(new long[]{0x0000000000009600L});
        public static final BitSet FOLLOW_9_in_ruleEmfsRoot169 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmfsRoot186 = new BitSet(new long[]{0x0000000000009600L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleEmfsRoot214 = new BitSet(new long[]{0x0000000000009400L});
        public static final BitSet FOLLOW_10_in_ruleEmfsRoot228 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_ruleEmfsRoot251 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_ruleEmfsRoot270 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleEmfsRoot285 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEmfsRoot299 = new BitSet(new long[]{0x0000000000002012L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_ruleEmfsRoot320 = new BitSet(new long[]{0x0000000000002012L});
        public static final BitSet FOLLOW_ruleEmfsName_in_entryRuleEmfsName358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsName369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmfsName409 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleEmfsName428 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmfsName443 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_entryRuleEmfsResourcesRef490 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsResourcesRef500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleEmfsResourcesRef548 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleEmfsResourcesRef561 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleEmfsResourcesRef584 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleResourceName_in_entryRuleResourceName623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResourceName634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleResourceName673 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleResourceName690 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleResourceName709 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleResourceName724 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_entryRuleEmfsResource771 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsResource781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsContainer_in_ruleEmfsResource828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsFile_in_ruleEmfsResource855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty890 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleProperty937 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleProperty958 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProperty970 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleProperty1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_entryRuleFolderName1053 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFolderName1064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceName_in_ruleFolderName1111 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFolderName1129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsContainer_in_entryRuleEmfsContainer1169 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsContainer1179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_ruleEmfsContainer1225 = new BitSet(new long[]{0x000000000000AE12L});
        public static final BitSet FOLLOW_9_in_ruleEmfsContainer1238 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleEmfsContainer1259 = new BitSet(new long[]{0x000000000000AE12L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleEmfsContainer1282 = new BitSet(new long[]{0x000000000000AC12L});
        public static final BitSet FOLLOW_10_in_ruleEmfsContainer1296 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_ruleEmfsContainer1319 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleEmfsResourcesRef_in_ruleEmfsContainer1338 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleEmfsContainer1353 = new BitSet(new long[]{0x0000000000002812L});
        public static final BitSet FOLLOW_ruleEmfsResource_in_ruleEmfsContainer1376 = new BitSet(new long[]{0x0000000000002812L});
        public static final BitSet FOLLOW_11_in_ruleEmfsContainer1397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentProvider_in_entryRuleGitContentProvider1435 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitContentProvider1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_ruleGitContentProvider1490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName1526 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFileName1537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResourceName_in_ruleFileName1583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsFile_in_entryRuleEmfsFile1627 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmfsFile1637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleEmfsFile1683 = new BitSet(new long[]{0x00000000001E8A60L});
        public static final BitSet FOLLOW_17_in_ruleEmfsFile1701 = new BitSet(new long[]{0x00000000001C8A60L});
        public static final BitSet FOLLOW_9_in_ruleEmfsFile1728 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmfsFile1745 = new BitSet(new long[]{0x00000000001C8A60L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleEmfsFile1773 = new BitSet(new long[]{0x00000000001C8860L});
        public static final BitSet FOLLOW_18_in_ruleEmfsFile1788 = new BitSet(new long[]{0x0000004007800020L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_ruleEmfsFile1811 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_ruleEmfsFile1830 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleEmfsFile1845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringContentProvider_in_ruleEmfsFile1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWrappingStringContentProvider_in_ruleEmfsFile1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEmfsFile1916 = new BitSet(new long[]{0x0000048000000000L});
        public static final BitSet FOLLOW_ruleDotClasspathFileContentProvider_in_ruleEmfsFile1939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotProjectFileContentProvider_in_ruleEmfsFile1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEmfsFile1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringContentProvider_in_entryRuleStringContentProvider2017 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringContentProvider2027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_ruleStringContentProvider2072 = new BitSet(new long[]{0x0000000000108062L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_entryRuleAbstractStringContents2108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractStringContents2118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValueString_in_ruleAbstractStringContents2165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVerbatimStringContents_in_ruleAbstractStringContents2192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVerbatimStringContents_in_entryRuleVerbatimStringContents2227 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVerbatimStringContents2237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleVerbatimStringContents2275 = new BitSet(new long[]{0x0000000000028260L});
        public static final BitSet FOLLOW_17_in_ruleVerbatimStringContents2293 = new BitSet(new long[]{0x0000000000008260L});
        public static final BitSet FOLLOW_9_in_ruleVerbatimStringContents2320 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVerbatimStringContents2337 = new BitSet(new long[]{0x0000000000008260L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleVerbatimStringContents2365 = new BitSet(new long[]{0x0000000000008060L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleVerbatimStringContents2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_CONTENT_in_ruleVerbatimStringContents2407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValueString_in_entryRulePropertyValueString2451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyValueString2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rulePropertyValueString2498 = new BitSet(new long[]{0x0000000000220010L});
        public static final BitSet FOLLOW_17_in_rulePropertyValueString2516 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyValueString2548 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_21_in_rulePropertyValueString2572 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rulePropertyValueString2593 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePropertyValueString2605 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_rulePropertyValueString2620 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValueString2639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rulePropertyValueString2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWrappingStringContentProvider_in_entryRuleWrappingStringContentProvider2704 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWrappingStringContentProvider2714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_ruleWrappingStringContentProvider2760 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWrappingStringContentProvider2773 = new BitSet(new long[]{0x0000004007800020L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_ruleWrappingStringContentProvider2796 = new BitSet(new long[]{0x0000000000108060L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_ruleWrappingStringContentProvider2815 = new BitSet(new long[]{0x0000000000108060L});
        public static final BitSet FOLLOW_ruleAbstractStringContents_in_ruleWrappingStringContentProvider2840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_entryRulePROPERTY_REF2877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePROPERTY_REF2888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rulePROPERTY_REF2926 = new BitSet(new long[]{0x0000000000200010L});
        public static final BitSet FOLLOW_21_in_rulePROPERTY_REF2941 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_rulePROPERTY_REF2963 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePROPERTY_REF2981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePROPERTY_REF3003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_SCHEME_in_entryRuleURL_SCHEME3050 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_SCHEME3061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleURL_SCHEME3099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleURL_SCHEME3118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleURL_SCHEME3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleURL_SCHEME3156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_HOST_NAME_in_entryRuleURL_HOST_NAME3197 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_HOST_NAME3208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleURL_HOST_NAME3248 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleURL_HOST_NAME3267 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleURL_HOST_NAME3282 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleURL_HOST_in_entryRuleURL_HOST3330 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_HOST3341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleURL_HOST3379 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleURL_HOST_NAME_in_ruleURL_HOST3403 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleURL_HOST3422 = new BitSet(new long[]{0x0000003FF0000000L});
        public static final BitSet FOLLOW_28_in_ruleURL_HOST3436 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_29_in_ruleURL_HOST3455 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_30_in_ruleURL_HOST3474 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_31_in_ruleURL_HOST3493 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_32_in_ruleURL_HOST3512 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_33_in_ruleURL_HOST3531 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_34_in_ruleURL_HOST3550 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_35_in_ruleURL_HOST3569 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_36_in_ruleURL_HOST3588 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_37_in_ruleURL_HOST3607 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_ruleURL_HOST3640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_entryRuleURL_PATH3687 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL_PATH3698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleURL_PATH3736 = new BitSet(new long[]{0x000000000000A010L});
        public static final BitSet FOLLOW_ruleFolderName_in_ruleURL_PATH3759 = new BitSet(new long[]{0x000000000000A010L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_ruleURL_PATH3793 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleURL_PATH3811 = new BitSet(new long[]{0x000000000000A010L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleURL_PATH3837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_ruleURL_PATH3870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_in_entryRuleURL3917 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURL3928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_SCHEME_in_ruleURL3975 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleURL3993 = new BitSet(new long[]{0x0000000008001000L});
        public static final BitSet FOLLOW_ruleURL_HOST_in_ruleURL4016 = new BitSet(new long[]{0x0000000008001000L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_ruleURL4045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLContentProvider_in_entryRuleURLContentProvider4090 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURLContentProvider4100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleURLContentProvider4143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURL_in_ruleURLContentProvider4167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitURLContentProvider_in_entryRuleGitURLContentProvider4205 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitURLContentProvider4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_ruleGitURLContentProvider4260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGitContentRef_in_entryRuleGitContentRef4295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGitContentRef4305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleGitContentRef4342 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleGitContentRef4354 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleURL_HOST_NAME_in_ruleGitContentRef4379 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_ruleGitContentRef4398 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_19_in_ruleGitContentRef4414 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGitContentRef4433 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_ruleGitContentRef4457 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGitContentRef4488 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rulePROPERTY_REF_in_ruleGitContentRef4512 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGitContentRef4528 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGitContentRef4545 = new BitSet(new long[]{0x0000000008001002L});
        public static final BitSet FOLLOW_ruleURL_PATH_in_ruleGitContentRef4571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotClasspathFileContentProvider_in_entryRuleDotClasspathFileContentProvider4608 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotClasspathFileContentProvider4618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDotClasspathFileContentProvider4655 = new BitSet(new long[]{0x0000780000000000L});
        public static final BitSet FOLLOW_ruleAbstractClasspathEntry_in_ruleDotClasspathFileContentProvider4676 = new BitSet(new long[]{0x0000780000000800L});
        public static final BitSet FOLLOW_11_in_ruleDotClasspathFileContentProvider4689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractClasspathEntry_in_entryRuleAbstractClasspathEntry4725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractClasspathEntry4735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntry_in_ruleAbstractClasspathEntry4781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_entryRuleCLASSPATH_ENTRY_PATH4816 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCLASSPATH_ENTRY_PATH4827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolderName_in_ruleCLASSPATH_ENTRY_PATH4875 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleCLASSPATH_ENTRY_PATH4904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntry_in_entryRuleClasspathEntry4949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClasspathEntry4959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClasspathEntryKind_in_ruleClasspathEntry5005 = new BitSet(new long[]{0x0000000000003010L});
        public static final BitSet FOLLOW_12_in_ruleClasspathEntry5023 = new BitSet(new long[]{0x0000000000003010L});
        public static final BitSet FOLLOW_ruleCLASSPATH_ENTRY_PATH_in_ruleClasspathEntry5058 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_40_in_ruleClasspathEntry5071 = new BitSet(new long[]{0x0000003FF0000000L});
        public static final BitSet FOLLOW_ruleVERSION_in_ruleClasspathEntry5092 = new BitSet(new long[]{0x0000020000002000L});
        public static final BitSet FOLLOW_13_in_ruleClasspathEntry5105 = new BitSet(new long[]{0x0000003FF0000000L});
        public static final BitSet FOLLOW_ruleVERSION_in_ruleClasspathEntry5126 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleClasspathEntry5140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVERSION_in_entryRuleVERSION5179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVERSION5190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleVERSION5228 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_29_in_ruleVERSION5247 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_30_in_ruleVERSION5266 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_31_in_ruleVERSION5285 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_32_in_ruleVERSION5304 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_33_in_ruleVERSION5323 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_34_in_ruleVERSION5342 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_35_in_ruleVERSION5361 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_36_in_ruleVERSION5380 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_37_in_ruleVERSION5399 = new BitSet(new long[]{0x0000003FF0000002L});
        public static final BitSet FOLLOW_ruleDotProjectFileContentProvider_in_entryRuleDotProjectFileContentProvider5440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotProjectFileContentProvider5450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleDotProjectFileContentProvider5487 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_9_in_ruleDotProjectFileContentProvider5500 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDotProjectFileContentProvider5519 = new BitSet(new long[]{0x0000000000040A00L});
        public static final BitSet FOLLOW_ruleFileName_in_ruleDotProjectFileContentProvider5543 = new BitSet(new long[]{0x0000000000040A00L});
        public static final BitSet FOLLOW_18_in_ruleDotProjectFileContentProvider5561 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleDotProjectFileContentProvider5584 = new BitSet(new long[]{0x0000000000044800L});
        public static final BitSet FOLLOW_14_in_ruleDotProjectFileContentProvider5597 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEmfsName_in_ruleDotProjectFileContentProvider5620 = new BitSet(new long[]{0x0000000000044800L});
        public static final BitSet FOLLOW_11_in_ruleDotProjectFileContentProvider5636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleClasspathEntryKind5686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleClasspathEntryKind5703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleClasspathEntryKind5720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleClasspathEntryKind5737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_synpred1_InternalXemfs1389 = new BitSet(new long[]{0x0000000000000002L});
    }


}