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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_STRING_CONTENT", "RULE_XML_TEXT", "RULE_WS", "'emfs'", "'#'", "'extends'", "';'", "'/'", "'.'", "','", "'$'", "'='", "'*'", "'@'", "':'", "'---'", "'{'", "'}'", "'['", "']'", "'http'", "'https'", "'ftp'", "'file'", "'//'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'git'", "'dot.classpath'", "'('", "')'", "'dot.project'", "'<<'", "'>>'", "'?'", "'b'", "'o'", "'x'", "'a'", "'c'", "'d'", "'e'", "'f'", "'source-folder'", "'output-folder'", "'library-jar'", "'class-container'"
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


        public InternalXemfsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXemfsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXemfsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXemfs.g"; }



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
    // InternalXemfs.g:68:1: entryRuleEmfsRoot returns [EObject current=null] : iv_ruleEmfsRoot= ruleEmfsRoot EOF ;
    public final EObject entryRuleEmfsRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsRoot = null;


        try {
            // InternalXemfs.g:69:2: (iv_ruleEmfsRoot= ruleEmfsRoot EOF )
            // InternalXemfs.g:70:2: iv_ruleEmfsRoot= ruleEmfsRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsRootRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEmfsRoot=ruleEmfsRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsRoot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:77:1: ruleEmfsRoot returns [EObject current=null] : ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* ( (lv_properties_5_0= ruleProperty ) )* (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )? otherlv_9= '/' ( (lv_resources_10_0= ruleEmfsResource ) )* ) ;
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
            // InternalXemfs.g:80:28: ( ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* ( (lv_properties_5_0= ruleProperty ) )* (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )? otherlv_9= '/' ( (lv_resources_10_0= ruleEmfsResource ) )* ) )
            // InternalXemfs.g:81:1: ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* ( (lv_properties_5_0= ruleProperty ) )* (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )? otherlv_9= '/' ( (lv_resources_10_0= ruleEmfsResource ) )* )
            {
            // InternalXemfs.g:81:1: ( () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* ( (lv_properties_5_0= ruleProperty ) )* (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )? otherlv_9= '/' ( (lv_resources_10_0= ruleEmfsResource ) )* )
            // InternalXemfs.g:81:2: () (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )? (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )* ( (lv_properties_5_0= ruleProperty ) )* (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )? otherlv_9= '/' ( (lv_resources_10_0= ruleEmfsResource ) )*
            {
            // InternalXemfs.g:81:2: ()
            // InternalXemfs.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEmfsRootAccess().getEmfsContainerAction_0(),
                          current);
                  
            }

            }

            // InternalXemfs.g:87:2: (otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXemfs.g:87:4: otherlv_1= 'emfs' ( (lv_name_2_0= ruleEmfsName ) )?
                    {
                    otherlv_1=(Token)match(input,9,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmfsRootAccess().getEmfsKeyword_1_0());
                          
                    }
                    // InternalXemfs.g:91:1: ( (lv_name_2_0= ruleEmfsName ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ID) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalXemfs.g:92:1: (lv_name_2_0= ruleEmfsName )
                            {
                            // InternalXemfs.g:92:1: (lv_name_2_0= ruleEmfsName )
                            // InternalXemfs.g:93:3: lv_name_2_0= ruleEmfsName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsRootAccess().getNameEmfsNameParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_4);
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
                                      		"no.hal.emfs.xtext.Xemfs.EmfsName");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalXemfs.g:109:5: (otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==10) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXemfs.g:109:7: otherlv_3= '#' ( (lv_tags_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,10,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEmfsRootAccess().getNumberSignKeyword_2_0());
            	          
            	    }
            	    // InternalXemfs.g:113:1: ( (lv_tags_4_0= RULE_ID ) )
            	    // InternalXemfs.g:114:1: (lv_tags_4_0= RULE_ID )
            	    {
            	    // InternalXemfs.g:114:1: (lv_tags_4_0= RULE_ID )
            	    // InternalXemfs.g:115:3: lv_tags_4_0= RULE_ID
            	    {
            	    lv_tags_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_4); if (state.failed) return current;
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
            	              		"no.hal.emfs.xtext.Xemfs.ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalXemfs.g:131:4: ( (lv_properties_5_0= ruleProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXemfs.g:132:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // InternalXemfs.g:132:1: (lv_properties_5_0= ruleProperty )
            	    // InternalXemfs.g:133:3: lv_properties_5_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsRootAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
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
            	              		"no.hal.emfs.xtext.Xemfs.Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalXemfs.g:149:3: (otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXemfs.g:149:5: otherlv_6= 'extends' ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,11,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEmfsRootAccess().getExtendsKeyword_4_0());
                          
                    }
                    // InternalXemfs.g:153:1: ( ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) ) )
                    // InternalXemfs.g:154:1: ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) )
                    {
                    // InternalXemfs.g:154:1: ( (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef ) )
                    // InternalXemfs.g:155:1: (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef )
                    {
                    // InternalXemfs.g:155:1: (lv_contentProvider_7_1= ruleGitContentProvider | lv_contentProvider_7_2= ruleEmfsResourcesRef )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==41) ) {
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
                            // InternalXemfs.g:156:3: lv_contentProvider_7_1= ruleGitContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsRootAccess().getContentProviderGitContentProviderParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_8);
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
                                      		"no.hal.emfs.xtext.Xemfs.GitContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:171:8: lv_contentProvider_7_2= ruleEmfsResourcesRef
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsRootAccess().getContentProviderEmfsResourcesRefParserRuleCall_4_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_8);
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
                                      		"no.hal.emfs.xtext.Xemfs.EmfsResourcesRef");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEmfsRootAccess().getSemicolonKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getEmfsRootAccess().getSolidusKeyword_5());
                  
            }
            // InternalXemfs.g:197:1: ( (lv_resources_10_0= ruleEmfsResource ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXemfs.g:198:1: (lv_resources_10_0= ruleEmfsResource )
            	    {
            	    // InternalXemfs.g:198:1: (lv_resources_10_0= ruleEmfsResource )
            	    // InternalXemfs.g:199:3: lv_resources_10_0= ruleEmfsResource
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsRootAccess().getResourcesEmfsResourceParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
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
            	              		"no.hal.emfs.xtext.Xemfs.EmfsResource");
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
    // InternalXemfs.g:223:1: entryRuleEmfsName returns [String current=null] : iv_ruleEmfsName= ruleEmfsName EOF ;
    public final String entryRuleEmfsName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmfsName = null;


        try {
            // InternalXemfs.g:224:2: (iv_ruleEmfsName= ruleEmfsName EOF )
            // InternalXemfs.g:225:2: iv_ruleEmfsName= ruleEmfsName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEmfsName=ruleEmfsName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:232:1: ruleEmfsName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleEmfsName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalXemfs.g:235:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXemfs.g:236:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXemfs.g:236:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXemfs.g:236:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getEmfsNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalXemfs.g:243:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_ID) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalXemfs.g:244:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getEmfsNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
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
    // InternalXemfs.g:264:1: entryRuleEmfsResourcesRef returns [EObject current=null] : iv_ruleEmfsResourcesRef= ruleEmfsResourcesRef EOF ;
    public final EObject entryRuleEmfsResourcesRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsResourcesRef = null;


        try {
            // InternalXemfs.g:265:2: (iv_ruleEmfsResourcesRef= ruleEmfsResourcesRef EOF )
            // InternalXemfs.g:266:2: iv_ruleEmfsResourcesRef= ruleEmfsResourcesRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsResourcesRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEmfsResourcesRef=ruleEmfsResourcesRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsResourcesRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:273:1: ruleEmfsResourcesRef returns [EObject current=null] : ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* ) ;
    public final EObject ruleEmfsResourcesRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXemfs.g:276:28: ( ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* ) )
            // InternalXemfs.g:277:1: ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* )
            {
            // InternalXemfs.g:277:1: ( ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )* )
            // InternalXemfs.g:277:2: ( ( ruleEmfsName ) ) (otherlv_1= ',' ( ( ruleEmfsName ) ) )*
            {
            // InternalXemfs.g:277:2: ( ( ruleEmfsName ) )
            // InternalXemfs.g:278:1: ( ruleEmfsName )
            {
            // InternalXemfs.g:278:1: ( ruleEmfsName )
            // InternalXemfs.g:279:3: ruleEmfsName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmfsResourcesRefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
            ruleEmfsName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXemfs.g:292:2: (otherlv_1= ',' ( ( ruleEmfsName ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXemfs.g:292:4: otherlv_1= ',' ( ( ruleEmfsName ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEmfsResourcesRefAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalXemfs.g:296:1: ( ( ruleEmfsName ) )
            	    // InternalXemfs.g:297:1: ( ruleEmfsName )
            	    {
            	    // InternalXemfs.g:297:1: ( ruleEmfsName )
            	    // InternalXemfs.g:298:3: ruleEmfsName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEmfsResourcesRefRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsResourcesRefAccess().getResourcesEmfsResourceCrossReference_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalXemfs.g:319:1: entryRuleResourceName returns [String current=null] : iv_ruleResourceName= ruleResourceName EOF ;
    public final String entryRuleResourceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResourceName = null;


        try {
            // InternalXemfs.g:320:2: (iv_ruleResourceName= ruleResourceName EOF )
            // InternalXemfs.g:321:2: iv_ruleResourceName= ruleResourceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleResourceName=ruleResourceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:328:1: ruleResourceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleResourceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // InternalXemfs.g:331:28: ( ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* ) )
            // InternalXemfs.g:332:1: ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )
            {
            // InternalXemfs.g:332:1: ( (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )
            // InternalXemfs.g:332:2: (kw= '.' )? this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )*
            {
            // InternalXemfs.g:332:2: (kw= '.' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXemfs.g:333:2: kw= '.'
                    {
                    kw=(Token)match(input,14,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getResourceNameAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getResourceNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // InternalXemfs.g:345:1: (kw= '.' this_ID_3= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXemfs.g:346:2: kw= '.' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getResourceNameAccess().getFullStopKeyword_2_0()); 
            	          
            	    }
            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
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
    // InternalXemfs.g:366:1: entryRuleEmfsResource returns [EObject current=null] : iv_ruleEmfsResource= ruleEmfsResource EOF ;
    public final EObject entryRuleEmfsResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsResource = null;


        try {
            // InternalXemfs.g:367:2: (iv_ruleEmfsResource= ruleEmfsResource EOF )
            // InternalXemfs.g:368:2: iv_ruleEmfsResource= ruleEmfsResource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsResourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEmfsResource=ruleEmfsResource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsResource; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:375:1: ruleEmfsResource returns [EObject current=null] : (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile ) ;
    public final EObject ruleEmfsResource() throws RecognitionException {
        EObject current = null;

        EObject this_EmfsContainer_0 = null;

        EObject this_EmfsFile_1 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:378:28: ( (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile ) )
            // InternalXemfs.g:379:1: (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile )
            {
            // InternalXemfs.g:379:1: (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalXemfs.g:380:5: this_EmfsContainer_0= ruleEmfsContainer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEmfsResourceAccess().getEmfsContainerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalXemfs.g:390:5: this_EmfsFile_1= ruleEmfsFile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEmfsResourceAccess().getEmfsFileParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXemfs.g:406:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalXemfs.g:407:2: (iv_ruleProperty= ruleProperty EOF )
            // InternalXemfs.g:408:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:415:1: ruleProperty returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_1=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_2 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:418:28: ( (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) ) )
            // InternalXemfs.g:419:1: (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) )
            {
            // InternalXemfs.g:419:1: (otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) ) )
            // InternalXemfs.g:419:3: otherlv_0= '$' ( (lv_name_1_0= ruleEmfsName ) ) otherlv_2= '=' ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getDollarSignKeyword_0());
                  
            }
            // InternalXemfs.g:423:1: ( (lv_name_1_0= ruleEmfsName ) )
            // InternalXemfs.g:424:1: (lv_name_1_0= ruleEmfsName )
            {
            // InternalXemfs.g:424:1: (lv_name_1_0= ruleEmfsName )
            // InternalXemfs.g:425:3: lv_name_1_0= ruleEmfsName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEmfsNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_13);
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
                      		"no.hal.emfs.xtext.Xemfs.EmfsName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalXemfs.g:445:1: ( ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) ) )
            // InternalXemfs.g:446:1: ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) )
            {
            // InternalXemfs.g:446:1: ( (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName ) )
            // InternalXemfs.g:447:1: (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName )
            {
            // InternalXemfs.g:447:1: (lv_value_3_1= RULE_STRING | lv_value_3_2= ruleEmfsName )
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
                    // InternalXemfs.g:448:3: lv_value_3_1= RULE_STRING
                    {
                    lv_value_3_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                              		"no.hal.emfs.xtext.Xemfs.STRING");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalXemfs.g:463:8: lv_value_3_2= ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getValueEmfsNameParserRuleCall_3_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"no.hal.emfs.xtext.Xemfs.EmfsName");
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
    // InternalXemfs.g:489:1: entryRuleFolderName returns [String current=null] : iv_ruleFolderName= ruleFolderName EOF ;
    public final String entryRuleFolderName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFolderName = null;


        try {
            // InternalXemfs.g:490:2: (iv_ruleFolderName= ruleFolderName EOF )
            // InternalXemfs.g:491:2: iv_ruleFolderName= ruleFolderName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFolderNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFolderName=ruleFolderName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFolderName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:498:1: ruleFolderName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ResourceName_0= ruleResourceName kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleFolderName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ResourceName_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:501:28: ( (this_ResourceName_0= ruleResourceName kw= '/' ) )
            // InternalXemfs.g:502:1: (this_ResourceName_0= ruleResourceName kw= '/' )
            {
            // InternalXemfs.g:502:1: (this_ResourceName_0= ruleResourceName kw= '/' )
            // InternalXemfs.g:503:5: this_ResourceName_0= ruleResourceName kw= '/'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFolderNameAccess().getResourceNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_9);
            this_ResourceName_0=ruleResourceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ResourceName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalXemfs.g:527:1: entryRuleEmfsContainer returns [EObject current=null] : iv_ruleEmfsContainer= ruleEmfsContainer EOF ;
    public final EObject entryRuleEmfsContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsContainer = null;


        try {
            // InternalXemfs.g:528:2: (iv_ruleEmfsContainer= ruleEmfsContainer EOF )
            // InternalXemfs.g:529:2: iv_ruleEmfsContainer= ruleEmfsContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsContainerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEmfsContainer=ruleEmfsContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsContainer; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:536:1: ruleEmfsContainer returns [EObject current=null] : ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? ) ;
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
            // InternalXemfs.g:539:28: ( ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? ) )
            // InternalXemfs.g:540:1: ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? )
            {
            // InternalXemfs.g:540:1: ( ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )? )
            // InternalXemfs.g:540:2: ( (lv_name_0_0= ruleFolderName ) ) (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )* ( (lv_properties_3_0= ruleProperty ) )* (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )? ( (lv_resources_7_0= ruleEmfsResource ) )* ( ( ';' )=>otherlv_8= ';' )?
            {
            // InternalXemfs.g:540:2: ( (lv_name_0_0= ruleFolderName ) )
            // InternalXemfs.g:541:1: (lv_name_0_0= ruleFolderName )
            {
            // InternalXemfs.g:541:1: (lv_name_0_0= ruleFolderName )
            // InternalXemfs.g:542:3: lv_name_0_0= ruleFolderName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getNameFolderNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_15);
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
                      		"no.hal.emfs.xtext.Xemfs.FolderName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXemfs.g:558:2: (otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==10) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXemfs.g:558:4: otherlv_1= '#' ( (lv_tags_2_0= ruleEmfsName ) )
            	    {
            	    otherlv_1=(Token)match(input,10,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEmfsContainerAccess().getNumberSignKeyword_1_0());
            	          
            	    }
            	    // InternalXemfs.g:562:1: ( (lv_tags_2_0= ruleEmfsName ) )
            	    // InternalXemfs.g:563:1: (lv_tags_2_0= ruleEmfsName )
            	    {
            	    // InternalXemfs.g:563:1: (lv_tags_2_0= ruleEmfsName )
            	    // InternalXemfs.g:564:3: lv_tags_2_0= ruleEmfsName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getTagsEmfsNameParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
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
            	              		"no.hal.emfs.xtext.Xemfs.EmfsName");
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

            // InternalXemfs.g:580:4: ( (lv_properties_3_0= ruleProperty ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXemfs.g:581:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalXemfs.g:581:1: (lv_properties_3_0= ruleProperty )
            	    // InternalXemfs.g:582:3: lv_properties_3_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
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
            	              		"no.hal.emfs.xtext.Xemfs.Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalXemfs.g:598:3: (otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==11) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXemfs.g:598:5: otherlv_4= 'extends' ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) ) otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEmfsContainerAccess().getExtendsKeyword_3_0());
                          
                    }
                    // InternalXemfs.g:602:1: ( ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) ) )
                    // InternalXemfs.g:603:1: ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) )
                    {
                    // InternalXemfs.g:603:1: ( (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef ) )
                    // InternalXemfs.g:604:1: (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef )
                    {
                    // InternalXemfs.g:604:1: (lv_contentProvider_5_1= ruleGitContentProvider | lv_contentProvider_5_2= ruleEmfsResourcesRef )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==41) ) {
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
                            // InternalXemfs.g:605:3: lv_contentProvider_5_1= ruleGitContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getContentProviderGitContentProviderParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_8);
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
                                      		"no.hal.emfs.xtext.Xemfs.GitContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:620:8: lv_contentProvider_5_2= ruleEmfsResourcesRef
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getContentProviderEmfsResourcesRefParserRuleCall_3_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_8);
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
                                      		"no.hal.emfs.xtext.Xemfs.EmfsResourcesRef");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // InternalXemfs.g:642:3: ( (lv_resources_7_0= ruleEmfsResource ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }
                else if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXemfs.g:643:1: (lv_resources_7_0= ruleEmfsResource )
            	    {
            	    // InternalXemfs.g:643:1: (lv_resources_7_0= ruleEmfsResource )
            	    // InternalXemfs.g:644:3: lv_resources_7_0= ruleEmfsResource
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsContainerAccess().getResourcesEmfsResourceParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
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
            	              		"no.hal.emfs.xtext.Xemfs.EmfsResource");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalXemfs.g:660:3: ( ( ';' )=>otherlv_8= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred1_InternalXemfs()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalXemfs.g:660:4: ( ';' )=>otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalXemfs.g:673:1: entryRuleGitContentProvider returns [EObject current=null] : iv_ruleGitContentProvider= ruleGitContentProvider EOF ;
    public final EObject entryRuleGitContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitContentProvider = null;


        try {
            // InternalXemfs.g:674:2: (iv_ruleGitContentProvider= ruleGitContentProvider EOF )
            // InternalXemfs.g:675:2: iv_ruleGitContentProvider= ruleGitContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGitContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGitContentProvider=ruleGitContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGitContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:682:1: ruleGitContentProvider returns [EObject current=null] : ( (lv_gitRef_0_0= ruleGitContentRef ) ) ;
    public final EObject ruleGitContentProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_gitRef_0_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:685:28: ( ( (lv_gitRef_0_0= ruleGitContentRef ) ) )
            // InternalXemfs.g:686:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            {
            // InternalXemfs.g:686:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            // InternalXemfs.g:687:1: (lv_gitRef_0_0= ruleGitContentRef )
            {
            // InternalXemfs.g:687:1: (lv_gitRef_0_0= ruleGitContentRef )
            // InternalXemfs.g:688:3: lv_gitRef_0_0= ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGitContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"no.hal.emfs.xtext.Xemfs.GitContentRef");
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
    // InternalXemfs.g:712:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // InternalXemfs.g:713:2: (iv_ruleFileName= ruleFileName EOF )
            // InternalXemfs.g:714:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFileName=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:721:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ResourceName_0= ruleResourceName ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ResourceName_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:724:28: (this_ResourceName_0= ruleResourceName )
            // InternalXemfs.g:726:5: this_ResourceName_0= ruleResourceName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFileNameAccess().getResourceNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXemfs.g:744:1: entryRuleEmfsFile returns [EObject current=null] : iv_ruleEmfsFile= ruleEmfsFile EOF ;
    public final EObject entryRuleEmfsFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmfsFile = null;


        try {
            // InternalXemfs.g:745:2: (iv_ruleEmfsFile= ruleEmfsFile EOF )
            // InternalXemfs.g:746:2: iv_ruleEmfsFile= ruleEmfsFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmfsFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEmfsFile=ruleEmfsFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmfsFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:753:1: ruleEmfsFile returns [EObject current=null] : ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) ) ;
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
            // InternalXemfs.g:756:28: ( ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) ) )
            // InternalXemfs.g:757:1: ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) )
            {
            // InternalXemfs.g:757:1: ( ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' ) )
            // InternalXemfs.g:757:2: ( (lv_name_0_0= ruleFileName ) ) ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' )
            {
            // InternalXemfs.g:757:2: ( (lv_name_0_0= ruleFileName ) )
            // InternalXemfs.g:758:1: (lv_name_0_0= ruleFileName )
            {
            // InternalXemfs.g:758:1: (lv_name_0_0= ruleFileName )
            // InternalXemfs.g:759:3: lv_name_0_0= ruleFileName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getNameFileNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_18);
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
                      		"no.hal.emfs.xtext.Xemfs.FileName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXemfs.g:775:2: ( (lv_writeable_1_0= '*' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXemfs.g:776:1: (lv_writeable_1_0= '*' )
                    {
                    // InternalXemfs.g:776:1: (lv_writeable_1_0= '*' )
                    // InternalXemfs.g:777:3: lv_writeable_1_0= '*'
                    {
                    lv_writeable_1_0=(Token)match(input,18,FollowSets000.FOLLOW_19); if (state.failed) return current;
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

            // InternalXemfs.g:790:3: (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==10) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXemfs.g:790:5: otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,10,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getEmfsFileAccess().getNumberSignKeyword_2_0());
            	          
            	    }
            	    // InternalXemfs.g:794:1: ( (lv_tags_3_0= RULE_ID ) )
            	    // InternalXemfs.g:795:1: (lv_tags_3_0= RULE_ID )
            	    {
            	    // InternalXemfs.g:795:1: (lv_tags_3_0= RULE_ID )
            	    // InternalXemfs.g:796:3: lv_tags_3_0= RULE_ID
            	    {
            	    lv_tags_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); if (state.failed) return current;
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
            	              		"no.hal.emfs.xtext.Xemfs.ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalXemfs.g:812:4: ( (lv_properties_4_0= ruleProperty ) )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalXemfs.g:813:1: (lv_properties_4_0= ruleProperty )
            	    {
            	    // InternalXemfs.g:813:1: (lv_properties_4_0= ruleProperty )
            	    // InternalXemfs.g:814:3: lv_properties_4_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmfsFileAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
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
            	              		"no.hal.emfs.xtext.Xemfs.Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalXemfs.g:830:3: ( (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' ) | ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) ) | (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) ) | otherlv_11= ';' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt26=1;
                }
                break;
            case RULE_STRING:
            case RULE_STRING_CONTENT:
            case 16:
            case 21:
            case 24:
            case 46:
                {
                alt26=2;
                }
                break;
            case 20:
                {
                alt26=3;
                }
                break;
            case 12:
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
                    // InternalXemfs.g:830:4: (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' )
                    {
                    // InternalXemfs.g:830:4: (otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';' )
                    // InternalXemfs.g:830:6: otherlv_5= '@' ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmfsFileAccess().getCommercialAtKeyword_4_0_0());
                          
                    }
                    // InternalXemfs.g:834:1: ( ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) ) )
                    // InternalXemfs.g:835:1: ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) )
                    {
                    // InternalXemfs.g:835:1: ( (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider ) )
                    // InternalXemfs.g:836:1: (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider )
                    {
                    // InternalXemfs.g:836:1: (lv_contentProvider_6_1= ruleURLContentProvider | lv_contentProvider_6_2= ruleGitURLContentProvider )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_STRING||(LA23_0>=26 && LA23_0<=29)) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==41) ) {
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
                            // InternalXemfs.g:837:3: lv_contentProvider_6_1= ruleURLContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderURLContentProviderParserRuleCall_4_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_8);
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
                                      		"no.hal.emfs.xtext.Xemfs.URLContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:852:8: lv_contentProvider_6_2= ruleGitURLContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderGitURLContentProviderParserRuleCall_4_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_8);
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
                                      		"no.hal.emfs.xtext.Xemfs.GitURLContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEmfsFileAccess().getSemicolonKeyword_4_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:875:6: ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) )
                    {
                    // InternalXemfs.g:875:6: ( ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) ) )
                    // InternalXemfs.g:876:1: ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) )
                    {
                    // InternalXemfs.g:876:1: ( (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider ) )
                    // InternalXemfs.g:877:1: (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider )
                    {
                    // InternalXemfs.g:877:1: (lv_contentProvider_8_1= ruleStringContentProvider | lv_contentProvider_8_2= ruleWrappingStringContentProvider )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_STRING_CONTENT)||LA24_0==16||LA24_0==21||LA24_0==46) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==24) ) {
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
                            // InternalXemfs.g:878:3: lv_contentProvider_8_1= ruleStringContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderStringContentProviderParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"no.hal.emfs.xtext.Xemfs.StringContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:893:8: lv_contentProvider_8_2= ruleWrappingStringContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderWrappingStringContentProviderParserRuleCall_4_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"no.hal.emfs.xtext.Xemfs.WrappingStringContentProvider");
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
                    // InternalXemfs.g:912:6: (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) )
                    {
                    // InternalXemfs.g:912:6: (otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) ) )
                    // InternalXemfs.g:912:8: otherlv_9= ':' ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) )
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getEmfsFileAccess().getColonKeyword_4_2_0());
                          
                    }
                    // InternalXemfs.g:916:1: ( ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) ) )
                    // InternalXemfs.g:917:1: ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) )
                    {
                    // InternalXemfs.g:917:1: ( (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider ) )
                    // InternalXemfs.g:918:1: (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider )
                    {
                    // InternalXemfs.g:918:1: (lv_contentProvider_10_1= ruleDotClasspathFileContentProvider | lv_contentProvider_10_2= ruleDotProjectFileContentProvider )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==42) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==45) ) {
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
                            // InternalXemfs.g:919:3: lv_contentProvider_10_1= ruleDotClasspathFileContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderDotClasspathFileContentProviderParserRuleCall_4_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"no.hal.emfs.xtext.Xemfs.DotClasspathFileContentProvider");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:934:8: lv_contentProvider_10_2= ruleDotProjectFileContentProvider
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEmfsFileAccess().getContentProviderDotProjectFileContentProviderParserRuleCall_4_2_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"no.hal.emfs.xtext.Xemfs.DotProjectFileContentProvider");
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
                    // InternalXemfs.g:953:7: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalXemfs.g:965:1: entryRuleStringContentProvider returns [EObject current=null] : iv_ruleStringContentProvider= ruleStringContentProvider EOF ;
    public final EObject entryRuleStringContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringContentProvider = null;


        try {
            // InternalXemfs.g:966:2: (iv_ruleStringContentProvider= ruleStringContentProvider EOF )
            // InternalXemfs.g:967:2: iv_ruleStringContentProvider= ruleStringContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringContentProvider=ruleStringContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:974:1: ruleStringContentProvider returns [EObject current=null] : ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+ ;
    public final EObject ruleStringContentProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_stringContents_0_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:977:28: ( ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+ )
            // InternalXemfs.g:978:1: ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+
            {
            // InternalXemfs.g:978:1: ( (lv_stringContents_0_0= ruleAbstractStringContents ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_STRING_CONTENT)||LA27_0==16||LA27_0==21||LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalXemfs.g:979:1: (lv_stringContents_0_0= ruleAbstractStringContents )
            	    {
            	    // InternalXemfs.g:979:1: (lv_stringContents_0_0= ruleAbstractStringContents )
            	    // InternalXemfs.g:980:3: lv_stringContents_0_0= ruleAbstractStringContents
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringContentProviderAccess().getStringContentsAbstractStringContentsParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
            	              		"no.hal.emfs.xtext.Xemfs.AbstractStringContents");
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
    // InternalXemfs.g:1004:1: entryRuleAbstractStringContents returns [EObject current=null] : iv_ruleAbstractStringContents= ruleAbstractStringContents EOF ;
    public final EObject entryRuleAbstractStringContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractStringContents = null;


        try {
            // InternalXemfs.g:1005:2: (iv_ruleAbstractStringContents= ruleAbstractStringContents EOF )
            // InternalXemfs.g:1006:2: iv_ruleAbstractStringContents= ruleAbstractStringContents EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractStringContents=ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractStringContents; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1013:1: ruleAbstractStringContents returns [EObject current=null] : (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents | this_XmlStringContents_2= ruleXmlStringContents ) ;
    public final EObject ruleAbstractStringContents() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueString_0 = null;

        EObject this_VerbatimStringContents_1 = null;

        EObject this_XmlStringContents_2 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:1016:28: ( (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents | this_XmlStringContents_2= ruleXmlStringContents ) )
            // InternalXemfs.g:1017:1: (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents | this_XmlStringContents_2= ruleXmlStringContents )
            {
            // InternalXemfs.g:1017:1: (this_PropertyValueString_0= rulePropertyValueString | this_VerbatimStringContents_1= ruleVerbatimStringContents | this_XmlStringContents_2= ruleXmlStringContents )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt28=1;
                }
                break;
            case RULE_STRING:
            case RULE_STRING_CONTENT:
            case 21:
                {
                alt28=2;
                }
                break;
            case 46:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalXemfs.g:1018:5: this_PropertyValueString_0= rulePropertyValueString
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractStringContentsAccess().getPropertyValueStringParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalXemfs.g:1028:5: this_VerbatimStringContents_1= ruleVerbatimStringContents
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractStringContentsAccess().getVerbatimStringContentsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VerbatimStringContents_1=ruleVerbatimStringContents();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VerbatimStringContents_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXemfs.g:1038:5: this_XmlStringContents_2= ruleXmlStringContents
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractStringContentsAccess().getXmlStringContentsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XmlStringContents_2=ruleXmlStringContents();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XmlStringContents_2; 
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
    // InternalXemfs.g:1054:1: entryRuleVerbatimStringContents returns [EObject current=null] : iv_ruleVerbatimStringContents= ruleVerbatimStringContents EOF ;
    public final EObject entryRuleVerbatimStringContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbatimStringContents = null;


        try {
            // InternalXemfs.g:1055:2: (iv_ruleVerbatimStringContents= ruleVerbatimStringContents EOF )
            // InternalXemfs.g:1056:2: iv_ruleVerbatimStringContents= ruleVerbatimStringContents EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVerbatimStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVerbatimStringContents=ruleVerbatimStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVerbatimStringContents; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1063:1: ruleVerbatimStringContents returns [EObject current=null] : ( (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )? ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) ) ) ;
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
            // InternalXemfs.g:1066:28: ( ( (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )? ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) ) ) )
            // InternalXemfs.g:1067:1: ( (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )? ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) ) )
            {
            // InternalXemfs.g:1067:1: ( (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )? ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) ) )
            // InternalXemfs.g:1067:2: (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )? ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) )
            {
            // InternalXemfs.g:1067:2: (otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXemfs.g:1067:4: otherlv_0= '---' ( (lv_writeable_1_0= '*' ) )? (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )* ( (lv_properties_4_0= ruleProperty ) )*
                    {
                    otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVerbatimStringContentsAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0_0());
                          
                    }
                    // InternalXemfs.g:1071:1: ( (lv_writeable_1_0= '*' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==18) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalXemfs.g:1072:1: (lv_writeable_1_0= '*' )
                            {
                            // InternalXemfs.g:1072:1: (lv_writeable_1_0= '*' )
                            // InternalXemfs.g:1073:3: lv_writeable_1_0= '*'
                            {
                            lv_writeable_1_0=(Token)match(input,18,FollowSets000.FOLLOW_25); if (state.failed) return current;
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

                    // InternalXemfs.g:1086:3: (otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==10) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalXemfs.g:1086:5: otherlv_2= '#' ( (lv_tags_3_0= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,10,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getVerbatimStringContentsAccess().getNumberSignKeyword_0_2_0());
                    	          
                    	    }
                    	    // InternalXemfs.g:1090:1: ( (lv_tags_3_0= RULE_ID ) )
                    	    // InternalXemfs.g:1091:1: (lv_tags_3_0= RULE_ID )
                    	    {
                    	    // InternalXemfs.g:1091:1: (lv_tags_3_0= RULE_ID )
                    	    // InternalXemfs.g:1092:3: lv_tags_3_0= RULE_ID
                    	    {
                    	    lv_tags_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
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
                    	              		"no.hal.emfs.xtext.Xemfs.ID");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // InternalXemfs.g:1108:4: ( (lv_properties_4_0= ruleProperty ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==16) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalXemfs.g:1109:1: (lv_properties_4_0= ruleProperty )
                    	    {
                    	    // InternalXemfs.g:1109:1: (lv_properties_4_0= ruleProperty )
                    	    // InternalXemfs.g:1110:3: lv_properties_4_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getVerbatimStringContentsAccess().getPropertiesPropertyParserRuleCall_0_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_26);
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
                    	              		"no.hal.emfs.xtext.Xemfs.Property");
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

            // InternalXemfs.g:1126:5: ( ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) ) )
            // InternalXemfs.g:1127:1: ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) )
            {
            // InternalXemfs.g:1127:1: ( (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT ) )
            // InternalXemfs.g:1128:1: (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT )
            {
            // InternalXemfs.g:1128:1: (lv_stringContent_5_1= RULE_STRING | lv_stringContent_5_2= RULE_STRING_CONTENT )
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
                    // InternalXemfs.g:1129:3: lv_stringContent_5_1= RULE_STRING
                    {
                    lv_stringContent_5_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                              		"no.hal.emfs.xtext.Xemfs.STRING");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1144:8: lv_stringContent_5_2= RULE_STRING_CONTENT
                    {
                    lv_stringContent_5_2=(Token)match(input,RULE_STRING_CONTENT,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                              		"no.hal.emfs.xtext.Xemfs.STRING_CONTENT");
                      	    
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
    // InternalXemfs.g:1170:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalXemfs.g:1171:2: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalXemfs.g:1172:2: iv_rulePropertyValueString= rulePropertyValueString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyValueString=rulePropertyValueString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValueString; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1179:1: rulePropertyValueString returns [EObject current=null] : (otherlv_0= '$' ( (lv_writeable_1_0= '*' ) )? ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) ) (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )? ) ;
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
            // InternalXemfs.g:1182:28: ( (otherlv_0= '$' ( (lv_writeable_1_0= '*' ) )? ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) ) (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )? ) )
            // InternalXemfs.g:1183:1: (otherlv_0= '$' ( (lv_writeable_1_0= '*' ) )? ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) ) (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )? )
            {
            // InternalXemfs.g:1183:1: (otherlv_0= '$' ( (lv_writeable_1_0= '*' ) )? ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) ) (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )? )
            // InternalXemfs.g:1183:3: otherlv_0= '$' ( (lv_writeable_1_0= '*' ) )? ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) ) (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )?
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyValueStringAccess().getDollarSignKeyword_0());
                  
            }
            // InternalXemfs.g:1187:1: ( (lv_writeable_1_0= '*' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXemfs.g:1188:1: (lv_writeable_1_0= '*' )
                    {
                    // InternalXemfs.g:1188:1: (lv_writeable_1_0= '*' )
                    // InternalXemfs.g:1189:3: lv_writeable_1_0= '*'
                    {
                    lv_writeable_1_0=(Token)match(input,18,FollowSets000.FOLLOW_28); if (state.failed) return current;
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

            // InternalXemfs.g:1202:3: ( ( (lv_propertyName_2_0= RULE_ID ) ) | (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==22) ) {
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
                    // InternalXemfs.g:1202:4: ( (lv_propertyName_2_0= RULE_ID ) )
                    {
                    // InternalXemfs.g:1202:4: ( (lv_propertyName_2_0= RULE_ID ) )
                    // InternalXemfs.g:1203:1: (lv_propertyName_2_0= RULE_ID )
                    {
                    // InternalXemfs.g:1203:1: (lv_propertyName_2_0= RULE_ID )
                    // InternalXemfs.g:1204:3: lv_propertyName_2_0= RULE_ID
                    {
                    lv_propertyName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
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
                              		"no.hal.emfs.xtext.Xemfs.ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1221:6: (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' )
                    {
                    // InternalXemfs.g:1221:6: (otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}' )
                    // InternalXemfs.g:1221:8: otherlv_3= '{' ( (lv_propertyName_4_0= ruleEmfsName ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyValueStringAccess().getLeftCurlyBracketKeyword_2_1_0());
                          
                    }
                    // InternalXemfs.g:1225:1: ( (lv_propertyName_4_0= ruleEmfsName ) )
                    // InternalXemfs.g:1226:1: (lv_propertyName_4_0= ruleEmfsName )
                    {
                    // InternalXemfs.g:1226:1: (lv_propertyName_4_0= ruleEmfsName )
                    // InternalXemfs.g:1227:3: lv_propertyName_4_0= ruleEmfsName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyValueStringAccess().getPropertyNameEmfsNameParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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
                              		"no.hal.emfs.xtext.Xemfs.EmfsName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyValueStringAccess().getRightCurlyBracketKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalXemfs.g:1247:3: (otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXemfs.g:1247:5: otherlv_6= ':' ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) )
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPropertyValueStringAccess().getColonKeyword_3_0());
                          
                    }
                    // InternalXemfs.g:1251:1: ( ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) ) )
                    // InternalXemfs.g:1252:1: ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) )
                    {
                    // InternalXemfs.g:1252:1: ( (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName ) )
                    // InternalXemfs.g:1253:1: (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName )
                    {
                    // InternalXemfs.g:1253:1: (lv_defaultValue_7_1= RULE_STRING | lv_defaultValue_7_2= ruleEmfsName )
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
                            // InternalXemfs.g:1254:3: lv_defaultValue_7_1= RULE_STRING
                            {
                            lv_defaultValue_7_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                                      		"no.hal.emfs.xtext.Xemfs.STRING");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:1269:8: lv_defaultValue_7_2= ruleEmfsName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPropertyValueStringAccess().getDefaultValueEmfsNameParserRuleCall_3_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
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
                                      		"no.hal.emfs.xtext.Xemfs.EmfsName");
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
    // InternalXemfs.g:1295:1: entryRuleWrappingStringContentProvider returns [EObject current=null] : iv_ruleWrappingStringContentProvider= ruleWrappingStringContentProvider EOF ;
    public final EObject entryRuleWrappingStringContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrappingStringContentProvider = null;


        try {
            // InternalXemfs.g:1296:2: (iv_ruleWrappingStringContentProvider= ruleWrappingStringContentProvider EOF )
            // InternalXemfs.g:1297:2: iv_ruleWrappingStringContentProvider= ruleWrappingStringContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWrappingStringContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWrappingStringContentProvider=ruleWrappingStringContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWrappingStringContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1304:1: ruleWrappingStringContentProvider returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_prefix_1_0= ruleAbstractStringContents ) ) otherlv_2= ']' ) (otherlv_3= '@' ( ( (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider ) ) ) ) (otherlv_5= '[' ( (lv_suffix_6_0= ruleAbstractStringContents ) ) otherlv_7= ']' ) ) ;
    public final EObject ruleWrappingStringContentProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_prefix_1_0 = null;

        EObject lv_contentProvider_4_1 = null;

        EObject lv_contentProvider_4_2 = null;

        EObject lv_suffix_6_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:1307:28: ( ( (otherlv_0= '[' ( (lv_prefix_1_0= ruleAbstractStringContents ) ) otherlv_2= ']' ) (otherlv_3= '@' ( ( (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider ) ) ) ) (otherlv_5= '[' ( (lv_suffix_6_0= ruleAbstractStringContents ) ) otherlv_7= ']' ) ) )
            // InternalXemfs.g:1308:1: ( (otherlv_0= '[' ( (lv_prefix_1_0= ruleAbstractStringContents ) ) otherlv_2= ']' ) (otherlv_3= '@' ( ( (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider ) ) ) ) (otherlv_5= '[' ( (lv_suffix_6_0= ruleAbstractStringContents ) ) otherlv_7= ']' ) )
            {
            // InternalXemfs.g:1308:1: ( (otherlv_0= '[' ( (lv_prefix_1_0= ruleAbstractStringContents ) ) otherlv_2= ']' ) (otherlv_3= '@' ( ( (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider ) ) ) ) (otherlv_5= '[' ( (lv_suffix_6_0= ruleAbstractStringContents ) ) otherlv_7= ']' ) )
            // InternalXemfs.g:1308:2: (otherlv_0= '[' ( (lv_prefix_1_0= ruleAbstractStringContents ) ) otherlv_2= ']' ) (otherlv_3= '@' ( ( (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider ) ) ) ) (otherlv_5= '[' ( (lv_suffix_6_0= ruleAbstractStringContents ) ) otherlv_7= ']' )
            {
            // InternalXemfs.g:1308:2: (otherlv_0= '[' ( (lv_prefix_1_0= ruleAbstractStringContents ) ) otherlv_2= ']' )
            // InternalXemfs.g:1308:4: otherlv_0= '[' ( (lv_prefix_1_0= ruleAbstractStringContents ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWrappingStringContentProviderAccess().getLeftSquareBracketKeyword_0_0());
                  
            }
            // InternalXemfs.g:1312:1: ( (lv_prefix_1_0= ruleAbstractStringContents ) )
            // InternalXemfs.g:1313:1: (lv_prefix_1_0= ruleAbstractStringContents )
            {
            // InternalXemfs.g:1313:1: (lv_prefix_1_0= ruleAbstractStringContents )
            // InternalXemfs.g:1314:3: lv_prefix_1_0= ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getPrefixAbstractStringContentsParserRuleCall_0_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_32);
            lv_prefix_1_0=ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWrappingStringContentProviderRule());
              	        }
                     		set(
                     			current, 
                     			"prefix",
                      		lv_prefix_1_0, 
                      		"no.hal.emfs.xtext.Xemfs.AbstractStringContents");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWrappingStringContentProviderAccess().getRightSquareBracketKeyword_0_2());
                  
            }

            }

            // InternalXemfs.g:1334:2: (otherlv_3= '@' ( ( (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider ) ) ) )
            // InternalXemfs.g:1334:4: otherlv_3= '@' ( ( (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider ) ) )
            {
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWrappingStringContentProviderAccess().getCommercialAtKeyword_1_0());
                  
            }
            // InternalXemfs.g:1338:1: ( ( (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider ) ) )
            // InternalXemfs.g:1339:1: ( (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider ) )
            {
            // InternalXemfs.g:1339:1: ( (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider ) )
            // InternalXemfs.g:1340:1: (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider )
            {
            // InternalXemfs.g:1340:1: (lv_contentProvider_4_1= ruleURLContentProvider | lv_contentProvider_4_2= ruleGitURLContentProvider )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING||(LA38_0>=26 && LA38_0<=29)) ) {
                alt38=1;
            }
            else if ( (LA38_0==41) ) {
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
                    // InternalXemfs.g:1341:3: lv_contentProvider_4_1= ruleURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderURLContentProviderParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_contentProvider_4_1=ruleURLContentProvider();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWrappingStringContentProviderRule());
                      	        }
                             		set(
                             			current, 
                             			"contentProvider",
                              		lv_contentProvider_4_1, 
                              		"no.hal.emfs.xtext.Xemfs.URLContentProvider");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1356:8: lv_contentProvider_4_2= ruleGitURLContentProvider
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getContentProviderGitURLContentProviderParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_contentProvider_4_2=ruleGitURLContentProvider();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWrappingStringContentProviderRule());
                      	        }
                             		set(
                             			current, 
                             			"contentProvider",
                              		lv_contentProvider_4_2, 
                              		"no.hal.emfs.xtext.Xemfs.GitURLContentProvider");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            // InternalXemfs.g:1374:3: (otherlv_5= '[' ( (lv_suffix_6_0= ruleAbstractStringContents ) ) otherlv_7= ']' )
            // InternalXemfs.g:1374:5: otherlv_5= '[' ( (lv_suffix_6_0= ruleAbstractStringContents ) ) otherlv_7= ']'
            {
            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getWrappingStringContentProviderAccess().getLeftSquareBracketKeyword_2_0());
                  
            }
            // InternalXemfs.g:1378:1: ( (lv_suffix_6_0= ruleAbstractStringContents ) )
            // InternalXemfs.g:1379:1: (lv_suffix_6_0= ruleAbstractStringContents )
            {
            // InternalXemfs.g:1379:1: (lv_suffix_6_0= ruleAbstractStringContents )
            // InternalXemfs.g:1380:3: lv_suffix_6_0= ruleAbstractStringContents
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWrappingStringContentProviderAccess().getSuffixAbstractStringContentsParserRuleCall_2_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_32);
            lv_suffix_6_0=ruleAbstractStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWrappingStringContentProviderRule());
              	        }
                     		set(
                     			current, 
                     			"suffix",
                      		lv_suffix_6_0, 
                      		"no.hal.emfs.xtext.Xemfs.AbstractStringContents");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getWrappingStringContentProviderAccess().getRightSquareBracketKeyword_2_2());
                  
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
    // InternalXemfs.g:1408:1: entryRulePROPERTY_REF returns [String current=null] : iv_rulePROPERTY_REF= rulePROPERTY_REF EOF ;
    public final String entryRulePROPERTY_REF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePROPERTY_REF = null;


        try {
            // InternalXemfs.g:1409:2: (iv_rulePROPERTY_REF= rulePROPERTY_REF EOF )
            // InternalXemfs.g:1410:2: iv_rulePROPERTY_REF= rulePROPERTY_REF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPROPERTY_REFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePROPERTY_REF=rulePROPERTY_REF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePROPERTY_REF.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1417:1: rulePROPERTY_REF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken rulePROPERTY_REF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_EmfsName_2 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:1420:28: ( (kw= '$' ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID ) ) )
            // InternalXemfs.g:1421:1: (kw= '$' ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID ) )
            {
            // InternalXemfs.g:1421:1: (kw= '$' ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID ) )
            // InternalXemfs.g:1422:2: kw= '$' ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID )
            {
            kw=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPROPERTY_REFAccess().getDollarSignKeyword_0()); 
                  
            }
            // InternalXemfs.g:1427:1: ( (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' ) | this_ID_4= RULE_ID )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
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
                    // InternalXemfs.g:1427:2: (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' )
                    {
                    // InternalXemfs.g:1427:2: (kw= '{' this_EmfsName_2= ruleEmfsName kw= '}' )
                    // InternalXemfs.g:1428:2: kw= '{' this_EmfsName_2= ruleEmfsName kw= '}'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPROPERTY_REFAccess().getLeftCurlyBracketKeyword_1_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPROPERTY_REFAccess().getEmfsNameParserRuleCall_1_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
                    this_EmfsName_2=ruleEmfsName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EmfsName_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPROPERTY_REFAccess().getRightCurlyBracketKeyword_1_0_2()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1451:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalXemfs.g:1466:1: entryRuleURL_SCHEME returns [String current=null] : iv_ruleURL_SCHEME= ruleURL_SCHEME EOF ;
    public final String entryRuleURL_SCHEME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_SCHEME = null;


        try {
            // InternalXemfs.g:1467:2: (iv_ruleURL_SCHEME= ruleURL_SCHEME EOF )
            // InternalXemfs.g:1468:2: iv_ruleURL_SCHEME= ruleURL_SCHEME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_SCHEMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURL_SCHEME=ruleURL_SCHEME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_SCHEME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1475:1: ruleURL_SCHEME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' ) ;
    public final AntlrDatatypeRuleToken ruleURL_SCHEME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXemfs.g:1478:28: ( (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' ) )
            // InternalXemfs.g:1479:1: (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' )
            {
            // InternalXemfs.g:1479:1: (kw= 'http' | kw= 'https' | kw= 'ftp' | kw= 'file' )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt40=1;
                }
                break;
            case 27:
                {
                alt40=2;
                }
                break;
            case 28:
                {
                alt40=3;
                }
                break;
            case 29:
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
                    // InternalXemfs.g:1480:2: kw= 'http'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_SCHEMEAccess().getHttpKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1487:2: kw= 'https'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_SCHEMEAccess().getHttpsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXemfs.g:1494:2: kw= 'ftp'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getURL_SCHEMEAccess().getFtpKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalXemfs.g:1501:2: kw= 'file'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalXemfs.g:1514:1: entryRuleURL_HOST_NAME returns [String current=null] : iv_ruleURL_HOST_NAME= ruleURL_HOST_NAME EOF ;
    public final String entryRuleURL_HOST_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_HOST_NAME = null;


        try {
            // InternalXemfs.g:1515:2: (iv_ruleURL_HOST_NAME= ruleURL_HOST_NAME EOF )
            // InternalXemfs.g:1516:2: iv_ruleURL_HOST_NAME= ruleURL_HOST_NAME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_HOST_NAMERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURL_HOST_NAME=ruleURL_HOST_NAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_HOST_NAME.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1523:1: ruleURL_HOST_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleURL_HOST_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalXemfs.g:1526:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalXemfs.g:1527:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalXemfs.g:1527:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalXemfs.g:1527:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getURL_HOST_NAMEAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalXemfs.g:1534:1: (kw= '.' this_ID_2= RULE_ID )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==14) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalXemfs.g:1535:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getURL_HOST_NAMEAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
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
    // InternalXemfs.g:1555:1: entryRuleURL_HOST returns [String current=null] : iv_ruleURL_HOST= ruleURL_HOST EOF ;
    public final String entryRuleURL_HOST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_HOST = null;


        try {
            // InternalXemfs.g:1556:2: (iv_ruleURL_HOST= ruleURL_HOST EOF )
            // InternalXemfs.g:1557:2: iv_ruleURL_HOST= ruleURL_HOST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_HOSTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURL_HOST=ruleURL_HOST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_HOST.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1564:1: ruleURL_HOST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '//' ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF ) ) ;
    public final AntlrDatatypeRuleToken ruleURL_HOST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_URL_HOST_NAME_1 = null;

        AntlrDatatypeRuleToken this_PROPERTY_REF_13 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:1567:28: ( (kw= '//' ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF ) ) )
            // InternalXemfs.g:1568:1: (kw= '//' ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF ) )
            {
            // InternalXemfs.g:1568:1: (kw= '//' ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF ) )
            // InternalXemfs.g:1569:2: kw= '//' ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF )
            {
            kw=(Token)match(input,30,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getSolidusSolidusKeyword_0()); 
                  
            }
            // InternalXemfs.g:1574:1: ( (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? ) | this_PROPERTY_REF_13= rulePROPERTY_REF )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==16) ) {
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
                    // InternalXemfs.g:1574:2: (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? )
                    {
                    // InternalXemfs.g:1574:2: (this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )? )
                    // InternalXemfs.g:1575:5: this_URL_HOST_NAME_1= ruleURL_HOST_NAME (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURL_HOSTAccess().getURL_HOST_NAMEParserRuleCall_1_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    this_URL_HOST_NAME_1=ruleURL_HOST_NAME();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_URL_HOST_NAME_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalXemfs.g:1585:1: (kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==20) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalXemfs.g:1586:2: kw= ':' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
                            {
                            kw=(Token)match(input,20,FollowSets000.FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getColonKeyword_1_0_1_0()); 
                                  
                            }
                            // InternalXemfs.g:1591:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
                            int cnt42=0;
                            loop42:
                            do {
                                int alt42=11;
                                switch ( input.LA(1) ) {
                                case 31:
                                    {
                                    alt42=1;
                                    }
                                    break;
                                case 32:
                                    {
                                    alt42=2;
                                    }
                                    break;
                                case 33:
                                    {
                                    alt42=3;
                                    }
                                    break;
                                case 34:
                                    {
                                    alt42=4;
                                    }
                                    break;
                                case 35:
                                    {
                                    alt42=5;
                                    }
                                    break;
                                case 36:
                                    {
                                    alt42=6;
                                    }
                                    break;
                                case 37:
                                    {
                                    alt42=7;
                                    }
                                    break;
                                case 38:
                                    {
                                    alt42=8;
                                    }
                                    break;
                                case 39:
                                    {
                                    alt42=9;
                                    }
                                    break;
                                case 40:
                                    {
                                    alt42=10;
                                    }
                                    break;

                                }

                                switch (alt42) {
                            	case 1 :
                            	    // InternalXemfs.g:1592:2: kw= '0'
                            	    {
                            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitZeroKeyword_1_0_1_1_0()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalXemfs.g:1599:2: kw= '1'
                            	    {
                            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitOneKeyword_1_0_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 3 :
                            	    // InternalXemfs.g:1606:2: kw= '2'
                            	    {
                            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitTwoKeyword_1_0_1_1_2()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 4 :
                            	    // InternalXemfs.g:1613:2: kw= '3'
                            	    {
                            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitThreeKeyword_1_0_1_1_3()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 5 :
                            	    // InternalXemfs.g:1620:2: kw= '4'
                            	    {
                            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitFourKeyword_1_0_1_1_4()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 6 :
                            	    // InternalXemfs.g:1627:2: kw= '5'
                            	    {
                            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitFiveKeyword_1_0_1_1_5()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 7 :
                            	    // InternalXemfs.g:1634:2: kw= '6'
                            	    {
                            	    kw=(Token)match(input,37,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitSixKeyword_1_0_1_1_6()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 8 :
                            	    // InternalXemfs.g:1641:2: kw= '7'
                            	    {
                            	    kw=(Token)match(input,38,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitSevenKeyword_1_0_1_1_7()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 9 :
                            	    // InternalXemfs.g:1648:2: kw= '8'
                            	    {
                            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getURL_HOSTAccess().getDigitEightKeyword_1_0_1_1_8()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 10 :
                            	    // InternalXemfs.g:1655:2: kw= '9'
                            	    {
                            	    kw=(Token)match(input,40,FollowSets000.FOLLOW_38); if (state.failed) return current;
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
                    // InternalXemfs.g:1662:5: this_PROPERTY_REF_13= rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURL_HOSTAccess().getPROPERTY_REFParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXemfs.g:1680:1: entryRuleURL_PATH returns [String current=null] : iv_ruleURL_PATH= ruleURL_PATH EOF ;
    public final String entryRuleURL_PATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL_PATH = null;


        try {
            // InternalXemfs.g:1681:2: (iv_ruleURL_PATH= ruleURL_PATH EOF )
            // InternalXemfs.g:1682:2: iv_ruleURL_PATH= ruleURL_PATH EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURL_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURL_PATH=ruleURL_PATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL_PATH.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1689:1: ruleURL_PATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )* (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF ) ) ;
    public final AntlrDatatypeRuleToken ruleURL_PATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FolderName_1 = null;

        AntlrDatatypeRuleToken this_PROPERTY_REF_2 = null;

        AntlrDatatypeRuleToken this_FileName_4 = null;

        AntlrDatatypeRuleToken this_PROPERTY_REF_5 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:1692:28: ( (kw= '/' (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )* (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF ) ) )
            // InternalXemfs.g:1693:1: (kw= '/' (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )* (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF ) )
            {
            // InternalXemfs.g:1693:1: (kw= '/' (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )* (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF ) )
            // InternalXemfs.g:1694:2: kw= '/' (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )* (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF )
            {
            kw=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getURL_PATHAccess().getSolidusKeyword_0()); 
                  
            }
            // InternalXemfs.g:1699:1: (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )*
            loop45:
            do {
                int alt45=3;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // InternalXemfs.g:1700:5: this_FolderName_1= ruleFolderName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getURL_PATHAccess().getFolderNameParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
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
            	    // InternalXemfs.g:1711:6: (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' )
            	    {
            	    // InternalXemfs.g:1711:6: (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' )
            	    // InternalXemfs.g:1712:5: this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getURL_PATHAccess().getPROPERTY_REFParserRuleCall_1_1_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    this_PROPERTY_REF_2=rulePROPERTY_REF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PROPERTY_REF_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
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

            // InternalXemfs.g:1728:4: (this_FileName_4= ruleFileName | this_PROPERTY_REF_5= rulePROPERTY_REF )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==14) ) {
                alt46=1;
            }
            else if ( (LA46_0==16) ) {
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
                    // InternalXemfs.g:1729:5: this_FileName_4= ruleFileName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURL_PATHAccess().getFileNameParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalXemfs.g:1741:5: this_PROPERTY_REF_5= rulePROPERTY_REF
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURL_PATHAccess().getPROPERTY_REFParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXemfs.g:1759:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // InternalXemfs.g:1760:2: (iv_ruleURL= ruleURL EOF )
            // InternalXemfs.g:1761:2: iv_ruleURL= ruleURL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1768:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_URL_SCHEME_0 = null;

        AntlrDatatypeRuleToken this_URL_HOST_2 = null;

        AntlrDatatypeRuleToken this_URL_PATH_3 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:1771:28: ( (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH ) )
            // InternalXemfs.g:1772:1: (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH )
            {
            // InternalXemfs.g:1772:1: (this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH )
            // InternalXemfs.g:1773:5: this_URL_SCHEME_0= ruleURL_SCHEME kw= ':' (this_URL_HOST_2= ruleURL_HOST )? this_URL_PATH_3= ruleURL_PATH
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getURLAccess().getURL_SCHEMEParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_40);
            this_URL_SCHEME_0=ruleURL_SCHEME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_URL_SCHEME_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,20,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getURLAccess().getColonKeyword_1()); 
                  
            }
            // InternalXemfs.g:1789:1: (this_URL_HOST_2= ruleURL_HOST )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXemfs.g:1790:5: this_URL_HOST_2= ruleURL_HOST
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getURLAccess().getURL_HOSTParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
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
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXemfs.g:1819:1: entryRuleURLContentProvider returns [EObject current=null] : iv_ruleURLContentProvider= ruleURLContentProvider EOF ;
    public final EObject entryRuleURLContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLContentProvider = null;


        try {
            // InternalXemfs.g:1820:2: (iv_ruleURLContentProvider= ruleURLContentProvider EOF )
            // InternalXemfs.g:1821:2: iv_ruleURLContentProvider= ruleURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURLContentProvider=ruleURLContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURLContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1828:1: ruleURLContentProvider returns [EObject current=null] : ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) ) ;
    public final EObject ruleURLContentProvider() throws RecognitionException {
        EObject current = null;

        Token lv_urlString_0_1=null;
        AntlrDatatypeRuleToken lv_urlString_0_2 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:1831:28: ( ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) ) )
            // InternalXemfs.g:1832:1: ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) )
            {
            // InternalXemfs.g:1832:1: ( ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) ) )
            // InternalXemfs.g:1833:1: ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) )
            {
            // InternalXemfs.g:1833:1: ( (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL ) )
            // InternalXemfs.g:1834:1: (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL )
            {
            // InternalXemfs.g:1834:1: (lv_urlString_0_1= RULE_STRING | lv_urlString_0_2= ruleURL )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=26 && LA48_0<=29)) ) {
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
                    // InternalXemfs.g:1835:3: lv_urlString_0_1= RULE_STRING
                    {
                    lv_urlString_0_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                              		"no.hal.emfs.xtext.Xemfs.STRING");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalXemfs.g:1850:8: lv_urlString_0_2= ruleURL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURLContentProviderAccess().getUrlStringURLParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"no.hal.emfs.xtext.Xemfs.URL");
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
    // InternalXemfs.g:1876:1: entryRuleGitURLContentProvider returns [EObject current=null] : iv_ruleGitURLContentProvider= ruleGitURLContentProvider EOF ;
    public final EObject entryRuleGitURLContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitURLContentProvider = null;


        try {
            // InternalXemfs.g:1877:2: (iv_ruleGitURLContentProvider= ruleGitURLContentProvider EOF )
            // InternalXemfs.g:1878:2: iv_ruleGitURLContentProvider= ruleGitURLContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGitURLContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGitURLContentProvider=ruleGitURLContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGitURLContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1885:1: ruleGitURLContentProvider returns [EObject current=null] : ( (lv_gitRef_0_0= ruleGitContentRef ) ) ;
    public final EObject ruleGitURLContentProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_gitRef_0_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:1888:28: ( ( (lv_gitRef_0_0= ruleGitContentRef ) ) )
            // InternalXemfs.g:1889:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            {
            // InternalXemfs.g:1889:1: ( (lv_gitRef_0_0= ruleGitContentRef ) )
            // InternalXemfs.g:1890:1: (lv_gitRef_0_0= ruleGitContentRef )
            {
            // InternalXemfs.g:1890:1: (lv_gitRef_0_0= ruleGitContentRef )
            // InternalXemfs.g:1891:3: lv_gitRef_0_0= ruleGitContentRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGitURLContentProviderAccess().getGitRefGitContentRefParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"no.hal.emfs.xtext.Xemfs.GitContentRef");
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
    // InternalXemfs.g:1915:1: entryRuleGitContentRef returns [EObject current=null] : iv_ruleGitContentRef= ruleGitContentRef EOF ;
    public final EObject entryRuleGitContentRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitContentRef = null;


        try {
            // InternalXemfs.g:1916:2: (iv_ruleGitContentRef= ruleGitContentRef EOF )
            // InternalXemfs.g:1917:2: iv_ruleGitContentRef= ruleGitContentRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGitContentRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGitContentRef=ruleGitContentRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGitContentRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:1924:1: ruleGitContentRef returns [EObject current=null] : (otherlv_0= 'git' otherlv_1= '@' ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? ) ;
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
            // InternalXemfs.g:1927:28: ( (otherlv_0= 'git' otherlv_1= '@' ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? ) )
            // InternalXemfs.g:1928:1: (otherlv_0= 'git' otherlv_1= '@' ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? )
            {
            // InternalXemfs.g:1928:1: (otherlv_0= 'git' otherlv_1= '@' ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )? )
            // InternalXemfs.g:1928:3: otherlv_0= 'git' otherlv_1= '@' ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) ) otherlv_6= '/' ( (lv_repo_7_0= RULE_ID ) ) ( (lv_path_8_0= ruleURL_PATH ) )?
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGitContentRefAccess().getGitKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGitContentRefAccess().getCommercialAtKeyword_1());
                  
            }
            // InternalXemfs.g:1936:1: ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalXemfs.g:1936:2: ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? )
                    {
                    // InternalXemfs.g:1936:2: ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? )
                    // InternalXemfs.g:1936:3: ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )?
                    {
                    // InternalXemfs.g:1936:3: ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) )
                    // InternalXemfs.g:1937:1: ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) )
                    {
                    // InternalXemfs.g:1937:1: ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) )
                    // InternalXemfs.g:1938:1: (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF )
                    {
                    // InternalXemfs.g:1938:1: (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==16) ) {
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
                            // InternalXemfs.g:1939:3: lv_host_2_1= ruleURL_HOST_NAME
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getGitContentRefAccess().getHostURL_HOST_NAMEParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_42);
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
                                      		"no.hal.emfs.xtext.Xemfs.URL_HOST_NAME");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:1954:8: lv_host_2_2= rulePROPERTY_REF
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getGitContentRefAccess().getHostPROPERTY_REFParserRuleCall_2_0_0_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_42);
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
                                      		"no.hal.emfs.xtext.Xemfs.PROPERTY_REF");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalXemfs.g:1972:2: (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==20) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalXemfs.g:1972:4: otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) )
                            {
                            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getGitContentRefAccess().getColonKeyword_2_0_1_0());
                                  
                            }
                            // InternalXemfs.g:1976:1: ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) )
                            // InternalXemfs.g:1977:1: ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) )
                            {
                            // InternalXemfs.g:1977:1: ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) )
                            // InternalXemfs.g:1978:1: (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF )
                            {
                            // InternalXemfs.g:1978:1: (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF )
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==RULE_ID) ) {
                                alt50=1;
                            }
                            else if ( (LA50_0==16) ) {
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
                                    // InternalXemfs.g:1979:3: lv_owner_4_1= RULE_ID
                                    {
                                    lv_owner_4_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
                                              		"no.hal.emfs.xtext.Xemfs.ID");
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalXemfs.g:1994:8: lv_owner_4_2= rulePROPERTY_REF
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getGitContentRefAccess().getOwnerPROPERTY_REFParserRuleCall_2_0_1_1_0_1()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_9);
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
                                              		"no.hal.emfs.xtext.Xemfs.PROPERTY_REF");
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
                    // InternalXemfs.g:2013:6: ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) )
                    {
                    // InternalXemfs.g:2013:6: ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) )
                    // InternalXemfs.g:2014:1: ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) )
                    {
                    // InternalXemfs.g:2014:1: ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) )
                    // InternalXemfs.g:2015:1: (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF )
                    {
                    // InternalXemfs.g:2015:1: (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_ID) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==16) ) {
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
                            // InternalXemfs.g:2016:3: lv_owner_5_1= RULE_ID
                            {
                            lv_owner_5_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
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
                                      		"no.hal.emfs.xtext.Xemfs.ID");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:2031:8: lv_owner_5_2= rulePROPERTY_REF
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getGitContentRefAccess().getOwnerPROPERTY_REFParserRuleCall_2_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_9);
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
                                      		"no.hal.emfs.xtext.Xemfs.PROPERTY_REF");
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

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getGitContentRefAccess().getSolidusKeyword_3());
                  
            }
            // InternalXemfs.g:2053:1: ( (lv_repo_7_0= RULE_ID ) )
            // InternalXemfs.g:2054:1: (lv_repo_7_0= RULE_ID )
            {
            // InternalXemfs.g:2054:1: (lv_repo_7_0= RULE_ID )
            // InternalXemfs.g:2055:3: lv_repo_7_0= RULE_ID
            {
            lv_repo_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_43); if (state.failed) return current;
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
                      		"no.hal.emfs.xtext.Xemfs.ID");
              	    
            }

            }


            }

            // InternalXemfs.g:2071:2: ( (lv_path_8_0= ruleURL_PATH ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==13) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalXemfs.g:2072:1: (lv_path_8_0= ruleURL_PATH )
                    {
                    // InternalXemfs.g:2072:1: (lv_path_8_0= ruleURL_PATH )
                    // InternalXemfs.g:2073:3: lv_path_8_0= ruleURL_PATH
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGitContentRefAccess().getPathURL_PATHParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"no.hal.emfs.xtext.Xemfs.URL_PATH");
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
    // InternalXemfs.g:2097:1: entryRuleDotClasspathFileContentProvider returns [EObject current=null] : iv_ruleDotClasspathFileContentProvider= ruleDotClasspathFileContentProvider EOF ;
    public final EObject entryRuleDotClasspathFileContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotClasspathFileContentProvider = null;


        try {
            // InternalXemfs.g:2098:2: (iv_ruleDotClasspathFileContentProvider= ruleDotClasspathFileContentProvider EOF )
            // InternalXemfs.g:2099:2: iv_ruleDotClasspathFileContentProvider= ruleDotClasspathFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotClasspathFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDotClasspathFileContentProvider=ruleDotClasspathFileContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotClasspathFileContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:2106:1: ruleDotClasspathFileContentProvider returns [EObject current=null] : (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' ) ;
    public final EObject ruleDotClasspathFileContentProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_entries_1_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:2109:28: ( (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' ) )
            // InternalXemfs.g:2110:1: (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' )
            {
            // InternalXemfs.g:2110:1: (otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';' )
            // InternalXemfs.g:2110:3: otherlv_0= 'dot.classpath' ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+ otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDotClasspathFileContentProviderAccess().getDotClasspathKeyword_0());
                  
            }
            // InternalXemfs.g:2114:1: ( (lv_entries_1_0= ruleAbstractClasspathEntry ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=57 && LA55_0<=60)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalXemfs.g:2115:1: (lv_entries_1_0= ruleAbstractClasspathEntry )
            	    {
            	    // InternalXemfs.g:2115:1: (lv_entries_1_0= ruleAbstractClasspathEntry )
            	    // InternalXemfs.g:2116:3: lv_entries_1_0= ruleAbstractClasspathEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDotClasspathFileContentProviderAccess().getEntriesAbstractClasspathEntryParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_45);
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
            	              		"no.hal.emfs.xtext.Xemfs.AbstractClasspathEntry");
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalXemfs.g:2144:1: entryRuleAbstractClasspathEntry returns [EObject current=null] : iv_ruleAbstractClasspathEntry= ruleAbstractClasspathEntry EOF ;
    public final EObject entryRuleAbstractClasspathEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClasspathEntry = null;


        try {
            // InternalXemfs.g:2145:2: (iv_ruleAbstractClasspathEntry= ruleAbstractClasspathEntry EOF )
            // InternalXemfs.g:2146:2: iv_ruleAbstractClasspathEntry= ruleAbstractClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractClasspathEntry=ruleAbstractClasspathEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractClasspathEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:2153:1: ruleAbstractClasspathEntry returns [EObject current=null] : this_ClasspathEntry_0= ruleClasspathEntry ;
    public final EObject ruleAbstractClasspathEntry() throws RecognitionException {
        EObject current = null;

        EObject this_ClasspathEntry_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:2156:28: (this_ClasspathEntry_0= ruleClasspathEntry )
            // InternalXemfs.g:2158:5: this_ClasspathEntry_0= ruleClasspathEntry
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAbstractClasspathEntryAccess().getClasspathEntryParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXemfs.g:2174:1: entryRuleCLASSPATH_ENTRY_PATH returns [String current=null] : iv_ruleCLASSPATH_ENTRY_PATH= ruleCLASSPATH_ENTRY_PATH EOF ;
    public final String entryRuleCLASSPATH_ENTRY_PATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCLASSPATH_ENTRY_PATH = null;


        try {
            // InternalXemfs.g:2175:2: (iv_ruleCLASSPATH_ENTRY_PATH= ruleCLASSPATH_ENTRY_PATH EOF )
            // InternalXemfs.g:2176:2: iv_ruleCLASSPATH_ENTRY_PATH= ruleCLASSPATH_ENTRY_PATH EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCLASSPATH_ENTRY_PATHRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCLASSPATH_ENTRY_PATH=ruleCLASSPATH_ENTRY_PATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCLASSPATH_ENTRY_PATH.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:2183:1: ruleCLASSPATH_ENTRY_PATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName ) ;
    public final AntlrDatatypeRuleToken ruleCLASSPATH_ENTRY_PATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FolderName_0 = null;

        AntlrDatatypeRuleToken this_FileName_1 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:2186:28: ( ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName ) )
            // InternalXemfs.g:2187:1: ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName )
            {
            // InternalXemfs.g:2187:1: ( (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName )
            // InternalXemfs.g:2187:2: (this_FolderName_0= ruleFolderName )* this_FileName_1= ruleFileName
            {
            // InternalXemfs.g:2187:2: (this_FolderName_0= ruleFolderName )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // InternalXemfs.g:2188:5: this_FolderName_0= ruleFolderName
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getCLASSPATH_ENTRY_PATHAccess().getFolderNameParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_46);
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
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalXemfs.g:2217:1: entryRuleClasspathEntry returns [EObject current=null] : iv_ruleClasspathEntry= ruleClasspathEntry EOF ;
    public final EObject entryRuleClasspathEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasspathEntry = null;


        try {
            // InternalXemfs.g:2218:2: (iv_ruleClasspathEntry= ruleClasspathEntry EOF )
            // InternalXemfs.g:2219:2: iv_ruleClasspathEntry= ruleClasspathEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClasspathEntryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClasspathEntry=ruleClasspathEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClasspathEntry; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:2226:1: ruleClasspathEntry returns [EObject current=null] : ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_absolute_1_0= '/' ) )? ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )? ) ;
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
            // InternalXemfs.g:2229:28: ( ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_absolute_1_0= '/' ) )? ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )? ) )
            // InternalXemfs.g:2230:1: ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_absolute_1_0= '/' ) )? ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )? )
            {
            // InternalXemfs.g:2230:1: ( ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_absolute_1_0= '/' ) )? ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )? )
            // InternalXemfs.g:2230:2: ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) ) ( (lv_absolute_1_0= '/' ) )? ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) ) (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )?
            {
            // InternalXemfs.g:2230:2: ( (lv_explicitKind_0_0= ruleClasspathEntryKind ) )
            // InternalXemfs.g:2231:1: (lv_explicitKind_0_0= ruleClasspathEntryKind )
            {
            // InternalXemfs.g:2231:1: (lv_explicitKind_0_0= ruleClasspathEntryKind )
            // InternalXemfs.g:2232:3: lv_explicitKind_0_0= ruleClasspathEntryKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getExplicitKindClasspathEntryKindEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_47);
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
                      		"no.hal.emfs.xtext.Xemfs.ClasspathEntryKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXemfs.g:2248:2: ( (lv_absolute_1_0= '/' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==13) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalXemfs.g:2249:1: (lv_absolute_1_0= '/' )
                    {
                    // InternalXemfs.g:2249:1: (lv_absolute_1_0= '/' )
                    // InternalXemfs.g:2250:3: lv_absolute_1_0= '/'
                    {
                    lv_absolute_1_0=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
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

            // InternalXemfs.g:2263:3: ( (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH ) )
            // InternalXemfs.g:2264:1: (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH )
            {
            // InternalXemfs.g:2264:1: (lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH )
            // InternalXemfs.g:2265:3: lv_explicitPath_2_0= ruleCLASSPATH_ENTRY_PATH
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getExplicitPathCLASSPATH_ENTRY_PATHParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_48);
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
                      		"no.hal.emfs.xtext.Xemfs.CLASSPATH_ENTRY_PATH");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXemfs.g:2281:2: (otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==43) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalXemfs.g:2281:4: otherlv_3= '(' ( (lv_major_4_0= ruleVERSION ) ) (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClasspathEntryAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // InternalXemfs.g:2285:1: ( (lv_major_4_0= ruleVERSION ) )
                    // InternalXemfs.g:2286:1: (lv_major_4_0= ruleVERSION )
                    {
                    // InternalXemfs.g:2286:1: (lv_major_4_0= ruleVERSION )
                    // InternalXemfs.g:2287:3: lv_major_4_0= ruleVERSION
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getMajorVERSIONParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
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
                              		"no.hal.emfs.xtext.Xemfs.VERSION");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalXemfs.g:2303:2: (otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==14) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalXemfs.g:2303:4: otherlv_5= '.' ( (lv_minor_6_0= ruleVERSION ) )
                            {
                            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getClasspathEntryAccess().getFullStopKeyword_3_2_0());
                                  
                            }
                            // InternalXemfs.g:2307:1: ( (lv_minor_6_0= ruleVERSION ) )
                            // InternalXemfs.g:2308:1: (lv_minor_6_0= ruleVERSION )
                            {
                            // InternalXemfs.g:2308:1: (lv_minor_6_0= ruleVERSION )
                            // InternalXemfs.g:2309:3: lv_minor_6_0= ruleVERSION
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClasspathEntryAccess().getMinorVERSIONParserRuleCall_3_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_50);
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
                                      		"no.hal.emfs.xtext.Xemfs.VERSION");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalXemfs.g:2337:1: entryRuleVERSION returns [String current=null] : iv_ruleVERSION= ruleVERSION EOF ;
    public final String entryRuleVERSION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVERSION = null;


        try {
            // InternalXemfs.g:2338:2: (iv_ruleVERSION= ruleVERSION EOF )
            // InternalXemfs.g:2339:2: iv_ruleVERSION= ruleVERSION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVERSIONRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVERSION=ruleVERSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVERSION.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:2346:1: ruleVERSION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ ;
    public final AntlrDatatypeRuleToken ruleVERSION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXemfs.g:2349:28: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+ )
            // InternalXemfs.g:2350:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
            {
            // InternalXemfs.g:2350:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=11;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt60=1;
                    }
                    break;
                case 32:
                    {
                    alt60=2;
                    }
                    break;
                case 33:
                    {
                    alt60=3;
                    }
                    break;
                case 34:
                    {
                    alt60=4;
                    }
                    break;
                case 35:
                    {
                    alt60=5;
                    }
                    break;
                case 36:
                    {
                    alt60=6;
                    }
                    break;
                case 37:
                    {
                    alt60=7;
                    }
                    break;
                case 38:
                    {
                    alt60=8;
                    }
                    break;
                case 39:
                    {
                    alt60=9;
                    }
                    break;
                case 40:
                    {
                    alt60=10;
                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // InternalXemfs.g:2351:2: kw= '0'
            	    {
            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitZeroKeyword_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalXemfs.g:2358:2: kw= '1'
            	    {
            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitOneKeyword_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalXemfs.g:2365:2: kw= '2'
            	    {
            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitTwoKeyword_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalXemfs.g:2372:2: kw= '3'
            	    {
            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitThreeKeyword_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // InternalXemfs.g:2379:2: kw= '4'
            	    {
            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitFourKeyword_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // InternalXemfs.g:2386:2: kw= '5'
            	    {
            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitFiveKeyword_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // InternalXemfs.g:2393:2: kw= '6'
            	    {
            	    kw=(Token)match(input,37,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitSixKeyword_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // InternalXemfs.g:2400:2: kw= '7'
            	    {
            	    kw=(Token)match(input,38,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitSevenKeyword_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // InternalXemfs.g:2407:2: kw= '8'
            	    {
            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVERSIONAccess().getDigitEightKeyword_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // InternalXemfs.g:2414:2: kw= '9'
            	    {
            	    kw=(Token)match(input,40,FollowSets000.FOLLOW_38); if (state.failed) return current;
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
    // InternalXemfs.g:2427:1: entryRuleDotProjectFileContentProvider returns [EObject current=null] : iv_ruleDotProjectFileContentProvider= ruleDotProjectFileContentProvider EOF ;
    public final EObject entryRuleDotProjectFileContentProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotProjectFileContentProvider = null;


        try {
            // InternalXemfs.g:2428:2: (iv_ruleDotProjectFileContentProvider= ruleDotProjectFileContentProvider EOF )
            // InternalXemfs.g:2429:2: iv_ruleDotProjectFileContentProvider= ruleDotProjectFileContentProvider EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotProjectFileContentProviderRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDotProjectFileContentProvider=ruleDotProjectFileContentProvider();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotProjectFileContentProvider; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalXemfs.g:2436:1: ruleDotProjectFileContentProvider returns [EObject current=null] : (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' ) ;
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
            // InternalXemfs.g:2439:28: ( (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' ) )
            // InternalXemfs.g:2440:1: (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' )
            {
            // InternalXemfs.g:2440:1: (otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';' )
            // InternalXemfs.g:2440:3: otherlv_0= 'dot.project' (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+ (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )* otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDotProjectFileContentProviderAccess().getDotProjectKeyword_0());
                  
            }
            // InternalXemfs.g:2444:1: (otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==10) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalXemfs.g:2444:3: otherlv_1= '#' ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) )
            	    {
            	    otherlv_1=(Token)match(input,10,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDotProjectFileContentProviderAccess().getNumberSignKeyword_1_0());
            	          
            	    }
            	    // InternalXemfs.g:2448:1: ( ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) ) )
            	    // InternalXemfs.g:2449:1: ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) )
            	    {
            	    // InternalXemfs.g:2449:1: ( (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName ) )
            	    // InternalXemfs.g:2450:1: (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName )
            	    {
            	    // InternalXemfs.g:2450:1: (lv_keys_2_1= RULE_STRING | lv_keys_2_2= ruleFileName )
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==RULE_STRING) ) {
            	        alt61=1;
            	    }
            	    else if ( (LA61_0==RULE_ID||LA61_0==14) ) {
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
            	            // InternalXemfs.g:2451:3: lv_keys_2_1= RULE_STRING
            	            {
            	            lv_keys_2_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_53); if (state.failed) return current;
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
            	                      		"no.hal.emfs.xtext.Xemfs.STRING");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalXemfs.g:2466:8: lv_keys_2_2= ruleFileName
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDotProjectFileContentProviderAccess().getKeysFileNameParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FollowSets000.FOLLOW_53);
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
            	                      		"no.hal.emfs.xtext.Xemfs.FileName");
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

            // InternalXemfs.g:2484:4: (otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )* )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==19) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalXemfs.g:2484:6: otherlv_3= '@' ( ( ruleEmfsName ) ) (otherlv_5= ',' ( ( ruleEmfsName ) ) )*
            	    {
            	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getDotProjectFileContentProviderAccess().getCommercialAtKeyword_2_0());
            	          
            	    }
            	    // InternalXemfs.g:2488:1: ( ( ruleEmfsName ) )
            	    // InternalXemfs.g:2489:1: ( ruleEmfsName )
            	    {
            	    // InternalXemfs.g:2489:1: ( ruleEmfsName )
            	    // InternalXemfs.g:2490:3: ruleEmfsName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getDotProjectFileContentProviderRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    ruleEmfsName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalXemfs.g:2503:2: (otherlv_5= ',' ( ( ruleEmfsName ) ) )*
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==15) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // InternalXemfs.g:2503:4: otherlv_5= ',' ( ( ruleEmfsName ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_5, grammarAccess.getDotProjectFileContentProviderAccess().getCommaKeyword_2_2_0());
            	    	          
            	    	    }
            	    	    // InternalXemfs.g:2507:1: ( ( ruleEmfsName ) )
            	    	    // InternalXemfs.g:2508:1: ( ruleEmfsName )
            	    	    {
            	    	    // InternalXemfs.g:2508:1: ( ruleEmfsName )
            	    	    // InternalXemfs.g:2509:3: ruleEmfsName
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getDotProjectFileContentProviderRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getDotProjectFileContentProviderAccess().getLinkedResourcesEmfsResourceCrossReference_2_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_54);
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

            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXmlStringContents"
    // InternalXemfs.g:2534:1: entryRuleXmlStringContents returns [EObject current=null] : iv_ruleXmlStringContents= ruleXmlStringContents EOF ;
    public final EObject entryRuleXmlStringContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlStringContents = null;


        try {
            // InternalXemfs.g:2535:2: (iv_ruleXmlStringContents= ruleXmlStringContents EOF )
            // InternalXemfs.g:2536:2: iv_ruleXmlStringContents= ruleXmlStringContents EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXmlStringContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXmlStringContents=ruleXmlStringContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXmlStringContents; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXmlStringContents"


    // $ANTLR start "ruleXmlStringContents"
    // InternalXemfs.g:2543:1: ruleXmlStringContents returns [EObject current=null] : (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' ) ;
    public final EObject ruleXmlStringContents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:2546:28: ( (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' ) )
            // InternalXemfs.g:2547:1: (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' )
            {
            // InternalXemfs.g:2547:1: (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' )
            // InternalXemfs.g:2547:3: otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXmlStringContentsAccess().getLessThanSignLessThanSignKeyword_0());
                  
            }
            // InternalXemfs.g:2551:1: ( (lv_element_1_0= ruleXmlElement ) )
            // InternalXemfs.g:2552:1: (lv_element_1_0= ruleXmlElement )
            {
            // InternalXemfs.g:2552:1: (lv_element_1_0= ruleXmlElement )
            // InternalXemfs.g:2553:3: lv_element_1_0= ruleXmlElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXmlStringContentsAccess().getElementXmlElementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_56);
            lv_element_1_0=ruleXmlElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXmlStringContentsRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_1_0, 
                      		"no.hal.emfs.xtext.Xemfs.XmlElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXmlStringContentsAccess().getGreaterThanSignGreaterThanSignKeyword_2());
                  
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
    // $ANTLR end "ruleXmlStringContents"


    // $ANTLR start "entryRuleXmlElement"
    // InternalXemfs.g:2581:1: entryRuleXmlElement returns [EObject current=null] : iv_ruleXmlElement= ruleXmlElement EOF ;
    public final EObject entryRuleXmlElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlElement = null;


        try {
            // InternalXemfs.g:2582:2: (iv_ruleXmlElement= ruleXmlElement EOF )
            // InternalXemfs.g:2583:2: iv_ruleXmlElement= ruleXmlElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXmlElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXmlElement=ruleXmlElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXmlElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXmlElement"


    // $ANTLR start "ruleXmlElement"
    // InternalXemfs.g:2590:1: ruleXmlElement returns [EObject current=null] : (this_XmlPIElement_0= ruleXmlPIElement | this_XmlTagElement_1= ruleXmlTagElement ) ;
    public final EObject ruleXmlElement() throws RecognitionException {
        EObject current = null;

        EObject this_XmlPIElement_0 = null;

        EObject this_XmlTagElement_1 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:2593:28: ( (this_XmlPIElement_0= ruleXmlPIElement | this_XmlTagElement_1= ruleXmlTagElement ) )
            // InternalXemfs.g:2594:1: (this_XmlPIElement_0= ruleXmlPIElement | this_XmlTagElement_1= ruleXmlTagElement )
            {
            // InternalXemfs.g:2594:1: (this_XmlPIElement_0= ruleXmlPIElement | this_XmlTagElement_1= ruleXmlTagElement )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==48) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalXemfs.g:2595:5: this_XmlPIElement_0= ruleXmlPIElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXmlElementAccess().getXmlPIElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XmlPIElement_0=ruleXmlPIElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XmlPIElement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2605:5: this_XmlTagElement_1= ruleXmlTagElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXmlElementAccess().getXmlTagElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_XmlTagElement_1=ruleXmlTagElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XmlTagElement_1; 
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
    // $ANTLR end "ruleXmlElement"


    // $ANTLR start "entryRuleXmlPIElement"
    // InternalXemfs.g:2621:1: entryRuleXmlPIElement returns [EObject current=null] : iv_ruleXmlPIElement= ruleXmlPIElement EOF ;
    public final EObject entryRuleXmlPIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlPIElement = null;


        try {
            // InternalXemfs.g:2622:2: (iv_ruleXmlPIElement= ruleXmlPIElement EOF )
            // InternalXemfs.g:2623:2: iv_ruleXmlPIElement= ruleXmlPIElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXmlPIElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXmlPIElement=ruleXmlPIElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXmlPIElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXmlPIElement"


    // $ANTLR start "ruleXmlPIElement"
    // InternalXemfs.g:2630:1: ruleXmlPIElement returns [EObject current=null] : (otherlv_0= '?' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleXmlAttribute ) )* otherlv_3= '?' ) ;
    public final EObject ruleXmlPIElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:2633:28: ( (otherlv_0= '?' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleXmlAttribute ) )* otherlv_3= '?' ) )
            // InternalXemfs.g:2634:1: (otherlv_0= '?' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleXmlAttribute ) )* otherlv_3= '?' )
            {
            // InternalXemfs.g:2634:1: (otherlv_0= '?' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleXmlAttribute ) )* otherlv_3= '?' )
            // InternalXemfs.g:2634:3: otherlv_0= '?' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleXmlAttribute ) )* otherlv_3= '?'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXmlPIElementAccess().getQuestionMarkKeyword_0());
                  
            }
            // InternalXemfs.g:2638:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalXemfs.g:2639:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXemfs.g:2639:1: (lv_name_1_0= RULE_ID )
            // InternalXemfs.g:2640:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getXmlPIElementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXmlPIElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"no.hal.emfs.xtext.Xemfs.ID");
              	    
            }

            }


            }

            // InternalXemfs.g:2656:2: ( (lv_attributes_2_0= ruleXmlAttribute ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalXemfs.g:2657:1: (lv_attributes_2_0= ruleXmlAttribute )
            	    {
            	    // InternalXemfs.g:2657:1: (lv_attributes_2_0= ruleXmlAttribute )
            	    // InternalXemfs.g:2658:3: lv_attributes_2_0= ruleXmlAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXmlPIElementAccess().getAttributesXmlAttributeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_attributes_2_0=ruleXmlAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXmlPIElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_2_0, 
            	              		"no.hal.emfs.xtext.Xemfs.XmlAttribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_3=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXmlPIElementAccess().getQuestionMarkKeyword_3());
                  
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
    // $ANTLR end "ruleXmlPIElement"


    // $ANTLR start "entryRuleXmlTagElement"
    // InternalXemfs.g:2686:1: entryRuleXmlTagElement returns [EObject current=null] : iv_ruleXmlTagElement= ruleXmlTagElement EOF ;
    public final EObject entryRuleXmlTagElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlTagElement = null;


        try {
            // InternalXemfs.g:2687:2: (iv_ruleXmlTagElement= ruleXmlTagElement EOF )
            // InternalXemfs.g:2688:2: iv_ruleXmlTagElement= ruleXmlTagElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXmlTagElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXmlTagElement=ruleXmlTagElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXmlTagElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXmlTagElement"


    // $ANTLR start "ruleXmlTagElement"
    // InternalXemfs.g:2695:1: ruleXmlTagElement returns [EObject current=null] : ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )? ) ) ) ) ;
    public final EObject ruleXmlTagElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pre_2_0=null;
        Token otherlv_4=null;
        EObject lv_startTag_0_0 = null;

        EObject lv_contents_3_0 = null;

        AntlrDatatypeRuleToken lv_endTag_5_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:2698:28: ( ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )? ) ) ) ) )
            // InternalXemfs.g:2699:1: ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )? ) ) ) )
            {
            // InternalXemfs.g:2699:1: ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )? ) ) ) )
            // InternalXemfs.g:2699:2: ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )? ) ) )
            {
            // InternalXemfs.g:2699:2: ( (lv_startTag_0_0= ruleXmlTag ) )
            // InternalXemfs.g:2700:1: (lv_startTag_0_0= ruleXmlTag )
            {
            // InternalXemfs.g:2700:1: (lv_startTag_0_0= ruleXmlTag )
            // InternalXemfs.g:2701:3: lv_startTag_0_0= ruleXmlTag
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXmlTagElementAccess().getStartTagXmlTagParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_57);
            lv_startTag_0_0=ruleXmlTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXmlTagElementRule());
              	        }
                     		set(
                     			current, 
                     			"startTag",
                      		lv_startTag_0_0, 
                      		"no.hal.emfs.xtext.Xemfs.XmlTag");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXemfs.g:2717:2: (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )? ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==13) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_XML_TEXT) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalXemfs.g:2717:4: otherlv_1= '/'
                    {
                    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXemfs.g:2722:6: ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )? ) )
                    {
                    // InternalXemfs.g:2722:6: ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )? ) )
                    // InternalXemfs.g:2722:7: ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )? )
                    {
                    // InternalXemfs.g:2722:7: ( (lv_pre_2_0= RULE_XML_TEXT ) )
                    // InternalXemfs.g:2723:1: (lv_pre_2_0= RULE_XML_TEXT )
                    {
                    // InternalXemfs.g:2723:1: (lv_pre_2_0= RULE_XML_TEXT )
                    // InternalXemfs.g:2724:3: lv_pre_2_0= RULE_XML_TEXT
                    {
                    lv_pre_2_0=(Token)match(input,RULE_XML_TEXT,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_pre_2_0, grammarAccess.getXmlTagElementAccess().getPreXML_TEXTTerminalRuleCall_1_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXmlTagElementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"pre",
                              		lv_pre_2_0, 
                              		"no.hal.emfs.xtext.Xemfs.XML_TEXT");
                      	    
                    }

                    }


                    }

                    // InternalXemfs.g:2740:2: ( (lv_contents_3_0= ruleXmlContents ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_ID||LA67_0==48) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalXemfs.g:2741:1: (lv_contents_3_0= ruleXmlContents )
                    	    {
                    	    // InternalXemfs.g:2741:1: (lv_contents_3_0= ruleXmlContents )
                    	    // InternalXemfs.g:2742:3: lv_contents_3_0= ruleXmlContents
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXmlTagElementAccess().getContentsXmlContentsParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_58);
                    	    lv_contents_3_0=ruleXmlContents();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXmlTagElementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"contents",
                    	              		lv_contents_3_0, 
                    	              		"no.hal.emfs.xtext.Xemfs.XmlContents");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    // InternalXemfs.g:2758:3: (otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )? )
                    // InternalXemfs.g:2758:5: otherlv_4= '/' ( (lv_endTag_5_0= ruleXmlTagName ) )?
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_1_2_0());
                          
                    }
                    // InternalXemfs.g:2762:1: ( (lv_endTag_5_0= ruleXmlTagName ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_ID) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalXemfs.g:2763:1: (lv_endTag_5_0= ruleXmlTagName )
                            {
                            // InternalXemfs.g:2763:1: (lv_endTag_5_0= ruleXmlTagName )
                            // InternalXemfs.g:2764:3: lv_endTag_5_0= ruleXmlTagName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXmlTagElementAccess().getEndTagXmlTagNameParserRuleCall_1_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_endTag_5_0=ruleXmlTagName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXmlTagElementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"endTag",
                                      		lv_endTag_5_0, 
                                      		"no.hal.emfs.xtext.Xemfs.XmlTagName");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

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
    // $ANTLR end "ruleXmlTagElement"


    // $ANTLR start "entryRuleXmlTagName"
    // InternalXemfs.g:2788:1: entryRuleXmlTagName returns [String current=null] : iv_ruleXmlTagName= ruleXmlTagName EOF ;
    public final String entryRuleXmlTagName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXmlTagName = null;


        try {
            // InternalXemfs.g:2789:2: (iv_ruleXmlTagName= ruleXmlTagName EOF )
            // InternalXemfs.g:2790:2: iv_ruleXmlTagName= ruleXmlTagName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXmlTagNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXmlTagName=ruleXmlTagName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXmlTagName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXmlTagName"


    // $ANTLR start "ruleXmlTagName"
    // InternalXemfs.g:2797:1: ruleXmlTagName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleXmlTagName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalXemfs.g:2800:28: ( (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )? ) )
            // InternalXemfs.g:2801:1: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )? )
            {
            // InternalXemfs.g:2801:1: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )? )
            // InternalXemfs.g:2801:6: this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getXmlTagNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalXemfs.g:2808:1: (kw= ':' this_ID_2= RULE_ID )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==20) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXemfs.g:2809:2: kw= ':' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXmlTagNameAccess().getColonKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getXmlTagNameAccess().getIDTerminalRuleCall_1_1()); 
                          
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
    // $ANTLR end "ruleXmlTagName"


    // $ANTLR start "entryRuleXmlContents"
    // InternalXemfs.g:2829:1: entryRuleXmlContents returns [EObject current=null] : iv_ruleXmlContents= ruleXmlContents EOF ;
    public final EObject entryRuleXmlContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlContents = null;


        try {
            // InternalXemfs.g:2830:2: (iv_ruleXmlContents= ruleXmlContents EOF )
            // InternalXemfs.g:2831:2: iv_ruleXmlContents= ruleXmlContents EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXmlContentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXmlContents=ruleXmlContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXmlContents; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXmlContents"


    // $ANTLR start "ruleXmlContents"
    // InternalXemfs.g:2838:1: ruleXmlContents returns [EObject current=null] : ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) ) ;
    public final EObject ruleXmlContents() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        EObject lv_element_0_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:2841:28: ( ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) ) )
            // InternalXemfs.g:2842:1: ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) )
            {
            // InternalXemfs.g:2842:1: ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) )
            // InternalXemfs.g:2842:2: ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) )
            {
            // InternalXemfs.g:2842:2: ( (lv_element_0_0= ruleXmlElement ) )
            // InternalXemfs.g:2843:1: (lv_element_0_0= ruleXmlElement )
            {
            // InternalXemfs.g:2843:1: (lv_element_0_0= ruleXmlElement )
            // InternalXemfs.g:2844:3: lv_element_0_0= ruleXmlElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXmlContentsAccess().getElementXmlElementParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_element_0_0=ruleXmlElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXmlContentsRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_0_0, 
                      		"no.hal.emfs.xtext.Xemfs.XmlElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXemfs.g:2860:2: ( (lv_post_1_0= RULE_XML_TEXT ) )
            // InternalXemfs.g:2861:1: (lv_post_1_0= RULE_XML_TEXT )
            {
            // InternalXemfs.g:2861:1: (lv_post_1_0= RULE_XML_TEXT )
            // InternalXemfs.g:2862:3: lv_post_1_0= RULE_XML_TEXT
            {
            lv_post_1_0=(Token)match(input,RULE_XML_TEXT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_post_1_0, grammarAccess.getXmlContentsAccess().getPostXML_TEXTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXmlContentsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"post",
                      		lv_post_1_0, 
                      		"no.hal.emfs.xtext.Xemfs.XML_TEXT");
              	    
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
    // $ANTLR end "ruleXmlContents"


    // $ANTLR start "entryRuleXmlTag"
    // InternalXemfs.g:2886:1: entryRuleXmlTag returns [EObject current=null] : iv_ruleXmlTag= ruleXmlTag EOF ;
    public final EObject entryRuleXmlTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlTag = null;


        try {
            // InternalXemfs.g:2887:2: (iv_ruleXmlTag= ruleXmlTag EOF )
            // InternalXemfs.g:2888:2: iv_ruleXmlTag= ruleXmlTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXmlTagRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXmlTag=ruleXmlTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXmlTag; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXmlTag"


    // $ANTLR start "ruleXmlTag"
    // InternalXemfs.g:2895:1: ruleXmlTag returns [EObject current=null] : ( ( (lv_name_0_0= ruleXmlTagName ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* ) ;
    public final EObject ruleXmlTag() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_attributes_1_0 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:2898:28: ( ( ( (lv_name_0_0= ruleXmlTagName ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* ) )
            // InternalXemfs.g:2899:1: ( ( (lv_name_0_0= ruleXmlTagName ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* )
            {
            // InternalXemfs.g:2899:1: ( ( (lv_name_0_0= ruleXmlTagName ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* )
            // InternalXemfs.g:2899:2: ( (lv_name_0_0= ruleXmlTagName ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )*
            {
            // InternalXemfs.g:2899:2: ( (lv_name_0_0= ruleXmlTagName ) )
            // InternalXemfs.g:2900:1: (lv_name_0_0= ruleXmlTagName )
            {
            // InternalXemfs.g:2900:1: (lv_name_0_0= ruleXmlTagName )
            // InternalXemfs.g:2901:3: lv_name_0_0= ruleXmlTagName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXmlTagAccess().getNameXmlTagNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_name_0_0=ruleXmlTagName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXmlTagRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"no.hal.emfs.xtext.Xemfs.XmlTagName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXemfs.g:2917:2: ( (lv_attributes_1_0= ruleXmlAttribute ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_ID) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalXemfs.g:2918:1: (lv_attributes_1_0= ruleXmlAttribute )
            	    {
            	    // InternalXemfs.g:2918:1: (lv_attributes_1_0= ruleXmlAttribute )
            	    // InternalXemfs.g:2919:3: lv_attributes_1_0= ruleXmlAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXmlTagAccess().getAttributesXmlAttributeParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_attributes_1_0=ruleXmlAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXmlTagRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_1_0, 
            	              		"no.hal.emfs.xtext.Xemfs.XmlAttribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // $ANTLR end "ruleXmlTag"


    // $ANTLR start "entryRuleXmlAttribute"
    // InternalXemfs.g:2943:1: entryRuleXmlAttribute returns [EObject current=null] : iv_ruleXmlAttribute= ruleXmlAttribute EOF ;
    public final EObject entryRuleXmlAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlAttribute = null;


        try {
            // InternalXemfs.g:2944:2: (iv_ruleXmlAttribute= ruleXmlAttribute EOF )
            // InternalXemfs.g:2945:2: iv_ruleXmlAttribute= ruleXmlAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXmlAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXmlAttribute=ruleXmlAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXmlAttribute; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXmlAttribute"


    // $ANTLR start "ruleXmlAttribute"
    // InternalXemfs.g:2952:1: ruleXmlAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt ) ) ) )? ) ;
    public final EObject ruleXmlAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        AntlrDatatypeRuleToken lv_value_2_2 = null;


         enterRule(); 
            
        try {
            // InternalXemfs.g:2955:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt ) ) ) )? ) )
            // InternalXemfs.g:2956:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt ) ) ) )? )
            {
            // InternalXemfs.g:2956:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt ) ) ) )? )
            // InternalXemfs.g:2956:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt ) ) ) )?
            {
            // InternalXemfs.g:2956:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalXemfs.g:2957:1: (lv_name_0_0= RULE_ID )
            {
            // InternalXemfs.g:2957:1: (lv_name_0_0= RULE_ID )
            // InternalXemfs.g:2958:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getXmlAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXmlAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"no.hal.emfs.xtext.Xemfs.ID");
              	    
            }

            }


            }

            // InternalXemfs.g:2974:2: (otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt ) ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==17) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalXemfs.g:2974:4: otherlv_1= '=' ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt ) ) )
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXmlAttributeAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // InternalXemfs.g:2978:1: ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt ) ) )
                    // InternalXemfs.g:2979:1: ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt ) )
                    {
                    // InternalXemfs.g:2979:1: ( (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt ) )
                    // InternalXemfs.g:2980:1: (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt )
                    {
                    // InternalXemfs.g:2980:1: (lv_value_2_1= RULE_STRING | lv_value_2_2= ruleXmlInt )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==RULE_STRING) ) {
                        alt72=1;
                    }
                    else if ( ((LA72_0>=31 && LA72_0<=40)) ) {
                        alt72=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalXemfs.g:2981:3: lv_value_2_1= RULE_STRING
                            {
                            lv_value_2_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_2_1, grammarAccess.getXmlAttributeAccess().getValueSTRINGTerminalRuleCall_1_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXmlAttributeRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_2_1, 
                                      		"no.hal.emfs.xtext.Xemfs.STRING");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:2996:8: lv_value_2_2= ruleXmlInt
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXmlAttributeAccess().getValueXmlIntParserRuleCall_1_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_value_2_2=ruleXmlInt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXmlAttributeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_2_2, 
                                      		"no.hal.emfs.xtext.Xemfs.XmlInt");
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
    // $ANTLR end "ruleXmlAttribute"


    // $ANTLR start "entryRuleXmlInt"
    // InternalXemfs.g:3022:1: entryRuleXmlInt returns [String current=null] : iv_ruleXmlInt= ruleXmlInt EOF ;
    public final String entryRuleXmlInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXmlInt = null;


        try {
            // InternalXemfs.g:3023:2: (iv_ruleXmlInt= ruleXmlInt EOF )
            // InternalXemfs.g:3024:2: iv_ruleXmlInt= ruleXmlInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXmlIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXmlInt=ruleXmlInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXmlInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXmlInt"


    // $ANTLR start "ruleXmlInt"
    // InternalXemfs.g:3031:1: ruleXmlInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )* ) | (kw= '0' ( (kw= 'b' (kw= '0' | kw= '1' )+ ) | (kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+ ) | (kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+ ) ) ) ) ;
    public final AntlrDatatypeRuleToken ruleXmlInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXemfs.g:3034:28: ( ( ( (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )* ) | (kw= '0' ( (kw= 'b' (kw= '0' | kw= '1' )+ ) | (kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+ ) | (kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+ ) ) ) ) )
            // InternalXemfs.g:3035:1: ( ( (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )* ) | (kw= '0' ( (kw= 'b' (kw= '0' | kw= '1' )+ ) | (kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+ ) | (kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+ ) ) ) )
            {
            // InternalXemfs.g:3035:1: ( ( (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )* ) | (kw= '0' ( (kw= 'b' (kw= '0' | kw= '1' )+ ) | (kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+ ) | (kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+ ) ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=32 && LA80_0<=40)) ) {
                alt80=1;
            }
            else if ( (LA80_0==31) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalXemfs.g:3035:2: ( (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )* )
                    {
                    // InternalXemfs.g:3035:2: ( (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )* )
                    // InternalXemfs.g:3035:3: (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )*
                    {
                    // InternalXemfs.g:3035:3: (kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
                    int alt74=9;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt74=1;
                        }
                        break;
                    case 33:
                        {
                        alt74=2;
                        }
                        break;
                    case 34:
                        {
                        alt74=3;
                        }
                        break;
                    case 35:
                        {
                        alt74=4;
                        }
                        break;
                    case 36:
                        {
                        alt74=5;
                        }
                        break;
                    case 37:
                        {
                        alt74=6;
                        }
                        break;
                    case 38:
                        {
                        alt74=7;
                        }
                        break;
                    case 39:
                        {
                        alt74=8;
                        }
                        break;
                    case 40:
                        {
                        alt74=9;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }

                    switch (alt74) {
                        case 1 :
                            // InternalXemfs.g:3036:2: kw= '1'
                            {
                            kw=(Token)match(input,32,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitOneKeyword_0_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:3043:2: kw= '2'
                            {
                            kw=(Token)match(input,33,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitTwoKeyword_0_0_1()); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // InternalXemfs.g:3050:2: kw= '3'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitThreeKeyword_0_0_2()); 
                                  
                            }

                            }
                            break;
                        case 4 :
                            // InternalXemfs.g:3057:2: kw= '4'
                            {
                            kw=(Token)match(input,35,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitFourKeyword_0_0_3()); 
                                  
                            }

                            }
                            break;
                        case 5 :
                            // InternalXemfs.g:3064:2: kw= '5'
                            {
                            kw=(Token)match(input,36,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitFiveKeyword_0_0_4()); 
                                  
                            }

                            }
                            break;
                        case 6 :
                            // InternalXemfs.g:3071:2: kw= '6'
                            {
                            kw=(Token)match(input,37,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitSixKeyword_0_0_5()); 
                                  
                            }

                            }
                            break;
                        case 7 :
                            // InternalXemfs.g:3078:2: kw= '7'
                            {
                            kw=(Token)match(input,38,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitSevenKeyword_0_0_6()); 
                                  
                            }

                            }
                            break;
                        case 8 :
                            // InternalXemfs.g:3085:2: kw= '8'
                            {
                            kw=(Token)match(input,39,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitEightKeyword_0_0_7()); 
                                  
                            }

                            }
                            break;
                        case 9 :
                            // InternalXemfs.g:3092:2: kw= '9'
                            {
                            kw=(Token)match(input,40,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitNineKeyword_0_0_8()); 
                                  
                            }

                            }
                            break;

                    }

                    // InternalXemfs.g:3097:2: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )*
                    loop75:
                    do {
                        int alt75=11;
                        switch ( input.LA(1) ) {
                        case 31:
                            {
                            alt75=1;
                            }
                            break;
                        case 32:
                            {
                            alt75=2;
                            }
                            break;
                        case 33:
                            {
                            alt75=3;
                            }
                            break;
                        case 34:
                            {
                            alt75=4;
                            }
                            break;
                        case 35:
                            {
                            alt75=5;
                            }
                            break;
                        case 36:
                            {
                            alt75=6;
                            }
                            break;
                        case 37:
                            {
                            alt75=7;
                            }
                            break;
                        case 38:
                            {
                            alt75=8;
                            }
                            break;
                        case 39:
                            {
                            alt75=9;
                            }
                            break;
                        case 40:
                            {
                            alt75=10;
                            }
                            break;

                        }

                        switch (alt75) {
                    	case 1 :
                    	    // InternalXemfs.g:3098:2: kw= '0'
                    	    {
                    	    kw=(Token)match(input,31,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitZeroKeyword_0_1_0()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXemfs.g:3105:2: kw= '1'
                    	    {
                    	    kw=(Token)match(input,32,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitOneKeyword_0_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalXemfs.g:3112:2: kw= '2'
                    	    {
                    	    kw=(Token)match(input,33,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitTwoKeyword_0_1_2()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalXemfs.g:3119:2: kw= '3'
                    	    {
                    	    kw=(Token)match(input,34,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitThreeKeyword_0_1_3()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalXemfs.g:3126:2: kw= '4'
                    	    {
                    	    kw=(Token)match(input,35,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitFourKeyword_0_1_4()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalXemfs.g:3133:2: kw= '5'
                    	    {
                    	    kw=(Token)match(input,36,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitFiveKeyword_0_1_5()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalXemfs.g:3140:2: kw= '6'
                    	    {
                    	    kw=(Token)match(input,37,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitSixKeyword_0_1_6()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalXemfs.g:3147:2: kw= '7'
                    	    {
                    	    kw=(Token)match(input,38,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitSevenKeyword_0_1_7()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 9 :
                    	    // InternalXemfs.g:3154:2: kw= '8'
                    	    {
                    	    kw=(Token)match(input,39,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitEightKeyword_0_1_8()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 10 :
                    	    // InternalXemfs.g:3161:2: kw= '9'
                    	    {
                    	    kw=(Token)match(input,40,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitNineKeyword_0_1_9()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:3167:6: (kw= '0' ( (kw= 'b' (kw= '0' | kw= '1' )+ ) | (kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+ ) | (kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+ ) ) )
                    {
                    // InternalXemfs.g:3167:6: (kw= '0' ( (kw= 'b' (kw= '0' | kw= '1' )+ ) | (kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+ ) | (kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+ ) ) )
                    // InternalXemfs.g:3168:2: kw= '0' ( (kw= 'b' (kw= '0' | kw= '1' )+ ) | (kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+ ) | (kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+ ) )
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_0()); 
                          
                    }
                    // InternalXemfs.g:3173:1: ( (kw= 'b' (kw= '0' | kw= '1' )+ ) | (kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+ ) | (kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+ ) )
                    int alt79=3;
                    switch ( input.LA(1) ) {
                    case 49:
                        {
                        alt79=1;
                        }
                        break;
                    case 50:
                        {
                        alt79=2;
                        }
                        break;
                    case 51:
                        {
                        alt79=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }

                    switch (alt79) {
                        case 1 :
                            // InternalXemfs.g:3173:2: (kw= 'b' (kw= '0' | kw= '1' )+ )
                            {
                            // InternalXemfs.g:3173:2: (kw= 'b' (kw= '0' | kw= '1' )+ )
                            // InternalXemfs.g:3174:2: kw= 'b' (kw= '0' | kw= '1' )+
                            {
                            kw=(Token)match(input,49,FollowSets000.FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getBKeyword_1_1_0_0()); 
                                  
                            }
                            // InternalXemfs.g:3179:1: (kw= '0' | kw= '1' )+
                            int cnt76=0;
                            loop76:
                            do {
                                int alt76=3;
                                int LA76_0 = input.LA(1);

                                if ( (LA76_0==31) ) {
                                    alt76=1;
                                }
                                else if ( (LA76_0==32) ) {
                                    alt76=2;
                                }


                                switch (alt76) {
                            	case 1 :
                            	    // InternalXemfs.g:3180:2: kw= '0'
                            	    {
                            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_66); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_1_0_1_0()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalXemfs.g:3187:2: kw= '1'
                            	    {
                            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_66); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitOneKeyword_1_1_0_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt76 >= 1 ) break loop76;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(76, input);
                                        throw eee;
                                }
                                cnt76++;
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalXemfs.g:3193:6: (kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+ )
                            {
                            // InternalXemfs.g:3193:6: (kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+ )
                            // InternalXemfs.g:3194:2: kw= 'o' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+
                            {
                            kw=(Token)match(input,50,FollowSets000.FOLLOW_67); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getOKeyword_1_1_1_0()); 
                                  
                            }
                            // InternalXemfs.g:3199:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' )+
                            int cnt77=0;
                            loop77:
                            do {
                                int alt77=9;
                                switch ( input.LA(1) ) {
                                case 31:
                                    {
                                    alt77=1;
                                    }
                                    break;
                                case 32:
                                    {
                                    alt77=2;
                                    }
                                    break;
                                case 33:
                                    {
                                    alt77=3;
                                    }
                                    break;
                                case 34:
                                    {
                                    alt77=4;
                                    }
                                    break;
                                case 35:
                                    {
                                    alt77=5;
                                    }
                                    break;
                                case 36:
                                    {
                                    alt77=6;
                                    }
                                    break;
                                case 37:
                                    {
                                    alt77=7;
                                    }
                                    break;
                                case 38:
                                    {
                                    alt77=8;
                                    }
                                    break;

                                }

                                switch (alt77) {
                            	case 1 :
                            	    // InternalXemfs.g:3200:2: kw= '0'
                            	    {
                            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_68); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_1_1_1_0()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalXemfs.g:3207:2: kw= '1'
                            	    {
                            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_68); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitOneKeyword_1_1_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 3 :
                            	    // InternalXemfs.g:3214:2: kw= '2'
                            	    {
                            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_68); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitTwoKeyword_1_1_1_1_2()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 4 :
                            	    // InternalXemfs.g:3221:2: kw= '3'
                            	    {
                            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_68); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitThreeKeyword_1_1_1_1_3()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 5 :
                            	    // InternalXemfs.g:3228:2: kw= '4'
                            	    {
                            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_68); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitFourKeyword_1_1_1_1_4()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 6 :
                            	    // InternalXemfs.g:3235:2: kw= '5'
                            	    {
                            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_68); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitFiveKeyword_1_1_1_1_5()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 7 :
                            	    // InternalXemfs.g:3242:2: kw= '6'
                            	    {
                            	    kw=(Token)match(input,37,FollowSets000.FOLLOW_68); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitSixKeyword_1_1_1_1_6()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 8 :
                            	    // InternalXemfs.g:3249:2: kw= '7'
                            	    {
                            	    kw=(Token)match(input,38,FollowSets000.FOLLOW_68); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitSevenKeyword_1_1_1_1_7()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt77 >= 1 ) break loop77;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(77, input);
                                        throw eee;
                                }
                                cnt77++;
                            } while (true);


                            }


                            }
                            break;
                        case 3 :
                            // InternalXemfs.g:3255:6: (kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+ )
                            {
                            // InternalXemfs.g:3255:6: (kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+ )
                            // InternalXemfs.g:3256:2: kw= 'x' (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+
                            {
                            kw=(Token)match(input,51,FollowSets000.FOLLOW_69); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getXmlIntAccess().getXKeyword_1_1_2_0()); 
                                  
                            }
                            // InternalXemfs.g:3261:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' | kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'f' )+
                            int cnt78=0;
                            loop78:
                            do {
                                int alt78=17;
                                switch ( input.LA(1) ) {
                                case 31:
                                    {
                                    alt78=1;
                                    }
                                    break;
                                case 32:
                                    {
                                    alt78=2;
                                    }
                                    break;
                                case 33:
                                    {
                                    alt78=3;
                                    }
                                    break;
                                case 34:
                                    {
                                    alt78=4;
                                    }
                                    break;
                                case 35:
                                    {
                                    alt78=5;
                                    }
                                    break;
                                case 36:
                                    {
                                    alt78=6;
                                    }
                                    break;
                                case 37:
                                    {
                                    alt78=7;
                                    }
                                    break;
                                case 38:
                                    {
                                    alt78=8;
                                    }
                                    break;
                                case 39:
                                    {
                                    alt78=9;
                                    }
                                    break;
                                case 40:
                                    {
                                    alt78=10;
                                    }
                                    break;
                                case 52:
                                    {
                                    alt78=11;
                                    }
                                    break;
                                case 49:
                                    {
                                    alt78=12;
                                    }
                                    break;
                                case 53:
                                    {
                                    alt78=13;
                                    }
                                    break;
                                case 54:
                                    {
                                    alt78=14;
                                    }
                                    break;
                                case 55:
                                    {
                                    alt78=15;
                                    }
                                    break;
                                case 56:
                                    {
                                    alt78=16;
                                    }
                                    break;

                                }

                                switch (alt78) {
                            	case 1 :
                            	    // InternalXemfs.g:3262:2: kw= '0'
                            	    {
                            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitZeroKeyword_1_1_2_1_0()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalXemfs.g:3269:2: kw= '1'
                            	    {
                            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitOneKeyword_1_1_2_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 3 :
                            	    // InternalXemfs.g:3276:2: kw= '2'
                            	    {
                            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitTwoKeyword_1_1_2_1_2()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 4 :
                            	    // InternalXemfs.g:3283:2: kw= '3'
                            	    {
                            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitThreeKeyword_1_1_2_1_3()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 5 :
                            	    // InternalXemfs.g:3290:2: kw= '4'
                            	    {
                            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitFourKeyword_1_1_2_1_4()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 6 :
                            	    // InternalXemfs.g:3297:2: kw= '5'
                            	    {
                            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitFiveKeyword_1_1_2_1_5()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 7 :
                            	    // InternalXemfs.g:3304:2: kw= '6'
                            	    {
                            	    kw=(Token)match(input,37,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitSixKeyword_1_1_2_1_6()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 8 :
                            	    // InternalXemfs.g:3311:2: kw= '7'
                            	    {
                            	    kw=(Token)match(input,38,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitSevenKeyword_1_1_2_1_7()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 9 :
                            	    // InternalXemfs.g:3318:2: kw= '8'
                            	    {
                            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitEightKeyword_1_1_2_1_8()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 10 :
                            	    // InternalXemfs.g:3325:2: kw= '9'
                            	    {
                            	    kw=(Token)match(input,40,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDigitNineKeyword_1_1_2_1_9()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 11 :
                            	    // InternalXemfs.g:3332:2: kw= 'a'
                            	    {
                            	    kw=(Token)match(input,52,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getAKeyword_1_1_2_1_10()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 12 :
                            	    // InternalXemfs.g:3339:2: kw= 'b'
                            	    {
                            	    kw=(Token)match(input,49,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getBKeyword_1_1_2_1_11()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 13 :
                            	    // InternalXemfs.g:3346:2: kw= 'c'
                            	    {
                            	    kw=(Token)match(input,53,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getCKeyword_1_1_2_1_12()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 14 :
                            	    // InternalXemfs.g:3353:2: kw= 'd'
                            	    {
                            	    kw=(Token)match(input,54,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getDKeyword_1_1_2_1_13()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 15 :
                            	    // InternalXemfs.g:3360:2: kw= 'e'
                            	    {
                            	    kw=(Token)match(input,55,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getEKeyword_1_1_2_1_14()); 
                            	          
                            	    }

                            	    }
                            	    break;
                            	case 16 :
                            	    // InternalXemfs.g:3367:2: kw= 'f'
                            	    {
                            	    kw=(Token)match(input,56,FollowSets000.FOLLOW_70); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	              current.merge(kw);
                            	              newLeafNode(kw, grammarAccess.getXmlIntAccess().getFKeyword_1_1_2_1_15()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt78 >= 1 ) break loop78;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(78, input);
                                        throw eee;
                                }
                                cnt78++;
                            } while (true);


                            }


                            }
                            break;

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
    // $ANTLR end "ruleXmlInt"


    // $ANTLR start "ruleClasspathEntryKind"
    // InternalXemfs.g:3380:1: ruleClasspathEntryKind returns [Enumerator current=null] : ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) ) ;
    public final Enumerator ruleClasspathEntryKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalXemfs.g:3382:28: ( ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) ) )
            // InternalXemfs.g:3383:1: ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) )
            {
            // InternalXemfs.g:3383:1: ( (enumLiteral_0= 'source-folder' ) | (enumLiteral_1= 'output-folder' ) | (enumLiteral_2= 'library-jar' ) | (enumLiteral_3= 'class-container' ) )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt81=1;
                }
                break;
            case 58:
                {
                alt81=2;
                }
                break;
            case 59:
                {
                alt81=3;
                }
                break;
            case 60:
                {
                alt81=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalXemfs.g:3383:2: (enumLiteral_0= 'source-folder' )
                    {
                    // InternalXemfs.g:3383:2: (enumLiteral_0= 'source-folder' )
                    // InternalXemfs.g:3383:4: enumLiteral_0= 'source-folder'
                    {
                    enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getClasspathEntryKindAccess().getSrcEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXemfs.g:3389:6: (enumLiteral_1= 'output-folder' )
                    {
                    // InternalXemfs.g:3389:6: (enumLiteral_1= 'output-folder' )
                    // InternalXemfs.g:3389:8: enumLiteral_1= 'output-folder'
                    {
                    enumLiteral_1=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getClasspathEntryKindAccess().getOutputEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalXemfs.g:3395:6: (enumLiteral_2= 'library-jar' )
                    {
                    // InternalXemfs.g:3395:6: (enumLiteral_2= 'library-jar' )
                    // InternalXemfs.g:3395:8: enumLiteral_2= 'library-jar'
                    {
                    enumLiteral_2=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getClasspathEntryKindAccess().getLibEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalXemfs.g:3401:6: (enumLiteral_3= 'class-container' )
                    {
                    // InternalXemfs.g:3401:6: (enumLiteral_3= 'class-container' )
                    // InternalXemfs.g:3401:8: enumLiteral_3= 'class-container'
                    {
                    enumLiteral_3=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        // InternalXemfs.g:660:4: ( ';' )
        // InternalXemfs.g:660:6: ';'
        {
        match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\4\1\5\1\4\2\uffff\1\5";
    static final String dfa_3s = "\1\16\1\4\1\56\1\4\2\uffff\1\56";
    static final String dfa_4s = "\4\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\11\uffff\1\1",
            "\1\2",
            "\2\5\3\uffff\1\5\1\uffff\1\5\1\4\1\3\1\uffff\1\5\1\uffff\4\5\2\uffff\1\5\25\uffff\1\5",
            "\1\6",
            "",
            "",
            "\2\5\3\uffff\1\5\1\uffff\1\5\1\4\1\3\1\uffff\1\5\1\uffff\4\5\2\uffff\1\5\25\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "379:1: (this_EmfsContainer_0= ruleEmfsContainer | this_EmfsFile_1= ruleEmfsFile )";
        }
    }
    static final String dfa_7s = "\11\uffff";
    static final String dfa_8s = "\3\uffff\1\1\5\uffff";
    static final String dfa_9s = "\1\5\1\uffff\3\4\1\uffff\1\5\1\4\1\5";
    static final String dfa_10s = "\1\56\1\uffff\1\26\1\56\1\4\1\uffff\1\56\1\4\1\56";
    static final String dfa_11s = "\1\uffff\1\2\3\uffff\1\1\3\uffff";
    static final String dfa_12s = "\11\uffff}>";
    static final String[] dfa_13s = {
            "\2\1\5\uffff\1\1\3\uffff\1\2\2\uffff\3\1\2\uffff\1\1\25\uffff\1\1",
            "",
            "\1\3\15\uffff\1\1\3\uffff\1\1",
            "\3\1\5\uffff\1\1\1\uffff\1\4\1\uffff\1\1\1\5\2\uffff\2\1\30\uffff\1\1",
            "\1\6",
            "",
            "\2\1\3\uffff\1\1\1\uffff\2\1\1\7\1\uffff\1\1\1\5\4\1\2\uffff\1\1\25\uffff\1\1",
            "\1\10",
            "\2\1\3\uffff\1\1\1\uffff\2\1\1\7\1\uffff\1\1\1\5\4\1\2\uffff\1\1\25\uffff\1\1"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 812:4: ( (lv_properties_4_0= ruleProperty ) )*";
        }
    }
    static final String dfa_14s = "\17\uffff";
    static final String dfa_15s = "\2\uffff\1\5\5\uffff\2\5\3\uffff\1\5\1\uffff";
    static final String dfa_16s = "\2\4\1\14\2\4\2\uffff\1\4\2\14\1\16\1\uffff\1\4\1\14\1\16";
    static final String dfa_17s = "\1\20\1\4\1\30\1\26\1\4\2\uffff\1\4\2\30\1\27\1\uffff\1\4\1\30\1\27";
    static final String dfa_18s = "\5\uffff\1\3\1\1\4\uffff\1\2\3\uffff";
    static final String dfa_19s = "\17\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\11\uffff\1\1\1\uffff\1\3",
            "\1\2",
            "\1\5\1\6\1\4\11\uffff\1\5",
            "\1\10\21\uffff\1\7",
            "\1\11",
            "",
            "",
            "\1\12",
            "\1\5\1\13\12\uffff\1\5",
            "\1\5\1\6\1\4\11\uffff\1\5",
            "\1\14\10\uffff\1\15",
            "",
            "\1\16",
            "\1\5\1\13\12\uffff\1\5",
            "\1\14\10\uffff\1\15"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 1699:1: (this_FolderName_1= ruleFolderName | (this_PROPERTY_REF_2= rulePROPERTY_REF kw= '/' ) )*";
        }
    }
    static final String dfa_21s = "\13\uffff";
    static final String dfa_22s = "\1\4\1\15\1\4\2\uffff\1\4\1\uffff\1\16\1\4\1\uffff\1\16";
    static final String dfa_23s = "\1\20\1\16\1\26\2\uffff\1\4\1\uffff\1\27\1\4\1\uffff\1\27";
    static final String dfa_24s = "\3\uffff\1\1\1\2\1\uffff\1\1\2\uffff\1\1\1\uffff";
    static final String dfa_25s = "\13\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\13\uffff\1\2",
            "\1\4\1\3",
            "\1\6\21\uffff\1\5",
            "",
            "",
            "\1\7",
            "",
            "\1\10\10\uffff\1\11",
            "\1\12",
            "",
            "\1\10\10\uffff\1\11"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1936:1: ( ( ( ( (lv_host_2_1= ruleURL_HOST_NAME | lv_host_2_2= rulePROPERTY_REF ) ) ) (otherlv_3= ':' ( ( (lv_owner_4_1= RULE_ID | lv_owner_4_2= rulePROPERTY_REF ) ) ) )? ) | ( ( (lv_owner_5_1= RULE_ID | lv_owner_5_2= rulePROPERTY_REF ) ) ) )";
        }
    }
    static final String dfa_27s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_28s = "\2\4\1\14\1\4\2\uffff\1\14";
    static final String dfa_29s = "\1\16\1\4\1\74\1\4\2\uffff\1\74";
    static final String[] dfa_30s = {
            "\1\2\11\uffff\1\1",
            "\1\2",
            "\1\5\1\4\1\3\34\uffff\1\5\15\uffff\4\5",
            "\1\6",
            "",
            "",
            "\1\5\1\4\1\3\34\uffff\1\5\15\uffff\4\5"
    };
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_1;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "()* loopback of 2187:2: (this_FolderName_0= ruleFolderName )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000012C10L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000012C00L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012800L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020000000010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004012L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000015C12L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000015812L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000005012L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00004000013D1460L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400001391460L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400001391060L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000002003C000020L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000240000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000210062L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000050460L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010460L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010060L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000440010L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000210060L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000001FF80000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000001FF80000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000040002000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000040002002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1E00000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1E00000000001000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000006010L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000004000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000081400L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000089000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000010L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000002080L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0001000000002010L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0001000000000012L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x000001FF80000020L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x000E000000000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000007F80000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000007F80000002L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x01F201FF80000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x01F201FF80000002L});
    }


}