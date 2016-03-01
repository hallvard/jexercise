package no.hal.learning.exercise.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.hal.learning.exercise.xtext.services.XerciseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXerciseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exercise'", "'.'", "'part'", "'ref'", "'~'", "'/'", "'+-'", "'yes'", "'true'", "'no'", "'false'", "'('", "'x'", "')'", "'-'", "'v'", "'['", "']'", "'junit'", "'{'", "','", "'}'", "'java'", "'edit'", "'launch'", "'perspective'", "'#'", "'activated'", "'changed'", "'broughtToTop'", "'closed'", "'deactivated'", "'opened'", "'command'", "'executeSuccess'", "'executeFailure'", "'debug'", "'create'", "'terminate'", "'resume'", "'suspend'", "'stepInto'", "'stepOver'", "'stepReturn'", "'stepEnd'", "'breakpoint'", "'evaluation'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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

        public InternalXerciseParser(TokenStream input, XerciseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Exercise";
       	}

       	@Override
       	protected XerciseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExercise"
    // InternalXercise.g:64:1: entryRuleExercise returns [EObject current=null] : iv_ruleExercise= ruleExercise EOF ;
    public final EObject entryRuleExercise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExercise = null;


        try {
            // InternalXercise.g:64:49: (iv_ruleExercise= ruleExercise EOF )
            // InternalXercise.g:65:2: iv_ruleExercise= ruleExercise EOF
            {
             newCompositeNode(grammarAccess.getExerciseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExercise=ruleExercise();

            state._fsp--;

             current =iv_ruleExercise; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExercise"


    // $ANTLR start "ruleExercise"
    // InternalXercise.g:71:1: ruleExercise returns [EObject current=null] : ( () otherlv_1= 'exercise' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractExercisePart ) )* ) | ( (lv_parts_5_0= ruleAnonymousExercisePart ) ) ) ) ;
    public final EObject ruleExercise() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_3_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parts_4_0 = null;

        EObject lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:77:2: ( ( () otherlv_1= 'exercise' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractExercisePart ) )* ) | ( (lv_parts_5_0= ruleAnonymousExercisePart ) ) ) ) )
            // InternalXercise.g:78:2: ( () otherlv_1= 'exercise' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractExercisePart ) )* ) | ( (lv_parts_5_0= ruleAnonymousExercisePart ) ) ) )
            {
            // InternalXercise.g:78:2: ( () otherlv_1= 'exercise' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractExercisePart ) )* ) | ( (lv_parts_5_0= ruleAnonymousExercisePart ) ) ) )
            // InternalXercise.g:79:3: () otherlv_1= 'exercise' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractExercisePart ) )* ) | ( (lv_parts_5_0= ruleAnonymousExercisePart ) ) )
            {
            // InternalXercise.g:79:3: ()
            // InternalXercise.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExerciseAccess().getExerciseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExerciseAccess().getExerciseKeyword_1());
            		
            // InternalXercise.g:90:3: ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractExercisePart ) )* ) | ( (lv_parts_5_0= ruleAnonymousExercisePart ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalXercise.g:91:4: ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractExercisePart ) )* )
                    {
                    // InternalXercise.g:91:4: ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractExercisePart ) )* )
                    // InternalXercise.g:92:5: ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractExercisePart ) )*
                    {
                    // InternalXercise.g:92:5: ( (lv_name_2_0= ruleQName ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ID) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalXercise.g:93:6: (lv_name_2_0= ruleQName )
                            {
                            // InternalXercise.g:93:6: (lv_name_2_0= ruleQName )
                            // InternalXercise.g:94:7: lv_name_2_0= ruleQName
                            {

                            							newCompositeNode(grammarAccess.getExerciseAccess().getNameQNameParserRuleCall_2_0_0_0());
                            						
                            pushFollow(FOLLOW_4);
                            lv_name_2_0=ruleQName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getExerciseRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_2_0,
                            								"no.hal.learning.exercise.xtext.Xercise.QName");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalXercise.g:111:5: ( (lv_title_3_0= RULE_STRING ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_STRING) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalXercise.g:112:6: (lv_title_3_0= RULE_STRING )
                            {
                            // InternalXercise.g:112:6: (lv_title_3_0= RULE_STRING )
                            // InternalXercise.g:113:7: lv_title_3_0= RULE_STRING
                            {
                            lv_title_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                            							newLeafNode(lv_title_3_0, grammarAccess.getExerciseAccess().getTitleSTRINGTerminalRuleCall_2_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExerciseRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"title",
                            								lv_title_3_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }
                            break;

                    }

                    // InternalXercise.g:129:5: ( (lv_parts_4_0= ruleAbstractExercisePart ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalXercise.g:130:6: (lv_parts_4_0= ruleAbstractExercisePart )
                    	    {
                    	    // InternalXercise.g:130:6: (lv_parts_4_0= ruleAbstractExercisePart )
                    	    // InternalXercise.g:131:7: lv_parts_4_0= ruleAbstractExercisePart
                    	    {

                    	    							newCompositeNode(grammarAccess.getExerciseAccess().getPartsAbstractExercisePartParserRuleCall_2_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_parts_4_0=ruleAbstractExercisePart();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExerciseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_4_0,
                    	    								"no.hal.learning.exercise.xtext.Xercise.AbstractExercisePart");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:150:4: ( (lv_parts_5_0= ruleAnonymousExercisePart ) )
                    {
                    // InternalXercise.g:150:4: ( (lv_parts_5_0= ruleAnonymousExercisePart ) )
                    // InternalXercise.g:151:5: (lv_parts_5_0= ruleAnonymousExercisePart )
                    {
                    // InternalXercise.g:151:5: (lv_parts_5_0= ruleAnonymousExercisePart )
                    // InternalXercise.g:152:6: lv_parts_5_0= ruleAnonymousExercisePart
                    {

                    						newCompositeNode(grammarAccess.getExerciseAccess().getPartsAnonymousExercisePartParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parts_5_0=ruleAnonymousExercisePart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExerciseRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"no.hal.learning.exercise.xtext.Xercise.AnonymousExercisePart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExercise"


    // $ANTLR start "entryRuleQName"
    // InternalXercise.g:174:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // InternalXercise.g:174:45: (iv_ruleQName= ruleQName EOF )
            // InternalXercise.g:175:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // InternalXercise.g:181:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXercise.g:187:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalXercise.g:188:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalXercise.g:188:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalXercise.g:189:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXercise.g:196:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXercise.g:197:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleAbstractExercisePart"
    // InternalXercise.g:214:1: entryRuleAbstractExercisePart returns [EObject current=null] : iv_ruleAbstractExercisePart= ruleAbstractExercisePart EOF ;
    public final EObject entryRuleAbstractExercisePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExercisePart = null;


        try {
            // InternalXercise.g:214:61: (iv_ruleAbstractExercisePart= ruleAbstractExercisePart EOF )
            // InternalXercise.g:215:2: iv_ruleAbstractExercisePart= ruleAbstractExercisePart EOF
            {
             newCompositeNode(grammarAccess.getAbstractExercisePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractExercisePart=ruleAbstractExercisePart();

            state._fsp--;

             current =iv_ruleAbstractExercisePart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractExercisePart"


    // $ANTLR start "ruleAbstractExercisePart"
    // InternalXercise.g:221:1: ruleAbstractExercisePart returns [EObject current=null] : (this_ExercisePart_0= ruleExercisePart | this_ExercisePartRef_1= ruleExercisePartRef ) ;
    public final EObject ruleAbstractExercisePart() throws RecognitionException {
        EObject current = null;

        EObject this_ExercisePart_0 = null;

        EObject this_ExercisePartRef_1 = null;



        	enterRule();

        try {
            // InternalXercise.g:227:2: ( (this_ExercisePart_0= ruleExercisePart | this_ExercisePartRef_1= ruleExercisePartRef ) )
            // InternalXercise.g:228:2: (this_ExercisePart_0= ruleExercisePart | this_ExercisePartRef_1= ruleExercisePartRef )
            {
            // InternalXercise.g:228:2: (this_ExercisePart_0= ruleExercisePart | this_ExercisePartRef_1= ruleExercisePartRef )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_1==14) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXercise.g:229:3: this_ExercisePart_0= ruleExercisePart
                    {

                    			newCompositeNode(grammarAccess.getAbstractExercisePartAccess().getExercisePartParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExercisePart_0=ruleExercisePart();

                    state._fsp--;


                    			current = this_ExercisePart_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXercise.g:238:3: this_ExercisePartRef_1= ruleExercisePartRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractExercisePartAccess().getExercisePartRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExercisePartRef_1=ruleExercisePartRef();

                    state._fsp--;


                    			current = this_ExercisePartRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractExercisePart"


    // $ANTLR start "entryRuleExercisePart"
    // InternalXercise.g:250:1: entryRuleExercisePart returns [EObject current=null] : iv_ruleExercisePart= ruleExercisePart EOF ;
    public final EObject entryRuleExercisePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExercisePart = null;


        try {
            // InternalXercise.g:250:53: (iv_ruleExercisePart= ruleExercisePart EOF )
            // InternalXercise.g:251:2: iv_ruleExercisePart= ruleExercisePart EOF
            {
             newCompositeNode(grammarAccess.getExercisePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExercisePart=ruleExercisePart();

            state._fsp--;

             current =iv_ruleExercisePart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExercisePart"


    // $ANTLR start "ruleExercisePart"
    // InternalXercise.g:257:1: ruleExercisePart returns [EObject current=null] : (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_tasks_3_0= ruleAbstractTask ) )* ) ;
    public final EObject ruleExercisePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        EObject lv_tasks_3_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:263:2: ( (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_tasks_3_0= ruleAbstractTask ) )* ) )
            // InternalXercise.g:264:2: (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_tasks_3_0= ruleAbstractTask ) )* )
            {
            // InternalXercise.g:264:2: (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_tasks_3_0= ruleAbstractTask ) )* )
            // InternalXercise.g:265:3: otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_tasks_3_0= ruleAbstractTask ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExercisePartAccess().getPartKeyword_0());
            		
            // InternalXercise.g:269:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXercise.g:270:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXercise.g:270:4: (lv_name_1_0= RULE_ID )
            // InternalXercise.g:271:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExercisePartAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExercisePartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXercise.g:287:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalXercise.g:288:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalXercise.g:288:4: (lv_title_2_0= RULE_STRING )
            // InternalXercise.g:289:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_title_2_0, grammarAccess.getExercisePartAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExercisePartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXercise.g:305:3: ( (lv_tasks_3_0= ruleAbstractTask ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXercise.g:306:4: (lv_tasks_3_0= ruleAbstractTask )
            	    {
            	    // InternalXercise.g:306:4: (lv_tasks_3_0= ruleAbstractTask )
            	    // InternalXercise.g:307:5: lv_tasks_3_0= ruleAbstractTask
            	    {

            	    					newCompositeNode(grammarAccess.getExercisePartAccess().getTasksAbstractTaskParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tasks_3_0=ruleAbstractTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExercisePartRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_3_0,
            	    						"no.hal.learning.exercise.xtext.Xercise.AbstractTask");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExercisePart"


    // $ANTLR start "entryRuleExercisePartRef"
    // InternalXercise.g:328:1: entryRuleExercisePartRef returns [EObject current=null] : iv_ruleExercisePartRef= ruleExercisePartRef EOF ;
    public final EObject entryRuleExercisePartRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExercisePartRef = null;


        try {
            // InternalXercise.g:328:56: (iv_ruleExercisePartRef= ruleExercisePartRef EOF )
            // InternalXercise.g:329:2: iv_ruleExercisePartRef= ruleExercisePartRef EOF
            {
             newCompositeNode(grammarAccess.getExercisePartRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExercisePartRef=ruleExercisePartRef();

            state._fsp--;

             current =iv_ruleExercisePartRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExercisePartRef"


    // $ANTLR start "ruleExercisePartRef"
    // InternalXercise.g:335:1: ruleExercisePartRef returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) ) ;
    public final EObject ruleExercisePartRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalXercise.g:341:2: ( (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) ) )
            // InternalXercise.g:342:2: (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) )
            {
            // InternalXercise.g:342:2: (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) )
            // InternalXercise.g:343:3: otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExercisePartRefAccess().getPartKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExercisePartRefAccess().getRefKeyword_1());
            		
            // InternalXercise.g:351:3: ( ( ruleQName ) )
            // InternalXercise.g:352:4: ( ruleQName )
            {
            // InternalXercise.g:352:4: ( ruleQName )
            // InternalXercise.g:353:5: ruleQName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExercisePartRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExercisePartRefAccess().getPartRefExercisePartCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExercisePartRef"


    // $ANTLR start "entryRuleAnonymousExercisePart"
    // InternalXercise.g:371:1: entryRuleAnonymousExercisePart returns [EObject current=null] : iv_ruleAnonymousExercisePart= ruleAnonymousExercisePart EOF ;
    public final EObject entryRuleAnonymousExercisePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousExercisePart = null;


        try {
            // InternalXercise.g:371:62: (iv_ruleAnonymousExercisePart= ruleAnonymousExercisePart EOF )
            // InternalXercise.g:372:2: iv_ruleAnonymousExercisePart= ruleAnonymousExercisePart EOF
            {
             newCompositeNode(grammarAccess.getAnonymousExercisePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnonymousExercisePart=ruleAnonymousExercisePart();

            state._fsp--;

             current =iv_ruleAnonymousExercisePart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnonymousExercisePart"


    // $ANTLR start "ruleAnonymousExercisePart"
    // InternalXercise.g:378:1: ruleAnonymousExercisePart returns [EObject current=null] : ( () ( (lv_tasks_1_0= ruleAbstractTask ) )* ) ;
    public final EObject ruleAnonymousExercisePart() throws RecognitionException {
        EObject current = null;

        EObject lv_tasks_1_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:384:2: ( ( () ( (lv_tasks_1_0= ruleAbstractTask ) )* ) )
            // InternalXercise.g:385:2: ( () ( (lv_tasks_1_0= ruleAbstractTask ) )* )
            {
            // InternalXercise.g:385:2: ( () ( (lv_tasks_1_0= ruleAbstractTask ) )* )
            // InternalXercise.g:386:3: () ( (lv_tasks_1_0= ruleAbstractTask ) )*
            {
            // InternalXercise.g:386:3: ()
            // InternalXercise.g:387:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnonymousExercisePartAccess().getExercisePartAction_0(),
            					current);
            			

            }

            // InternalXercise.g:393:3: ( (lv_tasks_1_0= ruleAbstractTask ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXercise.g:394:4: (lv_tasks_1_0= ruleAbstractTask )
            	    {
            	    // InternalXercise.g:394:4: (lv_tasks_1_0= ruleAbstractTask )
            	    // InternalXercise.g:395:5: lv_tasks_1_0= ruleAbstractTask
            	    {

            	    					newCompositeNode(grammarAccess.getAnonymousExercisePartAccess().getTasksAbstractTaskParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tasks_1_0=ruleAbstractTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnonymousExercisePartRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_1_0,
            	    						"no.hal.learning.exercise.xtext.Xercise.AbstractTask");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnonymousExercisePart"


    // $ANTLR start "entryRuleAbstractTask"
    // InternalXercise.g:416:1: entryRuleAbstractTask returns [EObject current=null] : iv_ruleAbstractTask= ruleAbstractTask EOF ;
    public final EObject entryRuleAbstractTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTask = null;


        try {
            // InternalXercise.g:416:53: (iv_ruleAbstractTask= ruleAbstractTask EOF )
            // InternalXercise.g:417:2: iv_ruleAbstractTask= ruleAbstractTask EOF
            {
             newCompositeNode(grammarAccess.getAbstractTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractTask=ruleAbstractTask();

            state._fsp--;

             current =iv_ruleAbstractTask; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractTask"


    // $ANTLR start "ruleAbstractTask"
    // InternalXercise.g:423:1: ruleAbstractTask returns [EObject current=null] : (this_Task_0= ruleTask | this_TaskRef_1= ruleTaskRef ) ;
    public final EObject ruleAbstractTask() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_TaskRef_1 = null;



        	enterRule();

        try {
            // InternalXercise.g:429:2: ( (this_Task_0= ruleTask | this_TaskRef_1= ruleTaskRef ) )
            // InternalXercise.g:430:2: (this_Task_0= ruleTask | this_TaskRef_1= ruleTaskRef )
            {
            // InternalXercise.g:430:2: (this_Task_0= ruleTask | this_TaskRef_1= ruleTaskRef )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXercise.g:431:3: this_Task_0= ruleTask
                    {

                    			newCompositeNode(grammarAccess.getAbstractTaskAccess().getTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Task_0=ruleTask();

                    state._fsp--;


                    			current = this_Task_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXercise.g:440:3: this_TaskRef_1= ruleTaskRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractTaskAccess().getTaskRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskRef_1=ruleTaskRef();

                    state._fsp--;


                    			current = this_TaskRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractTask"


    // $ANTLR start "entryRuleTaskRef"
    // InternalXercise.g:452:1: entryRuleTaskRef returns [EObject current=null] : iv_ruleTaskRef= ruleTaskRef EOF ;
    public final EObject entryRuleTaskRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRef = null;


        try {
            // InternalXercise.g:452:48: (iv_ruleTaskRef= ruleTaskRef EOF )
            // InternalXercise.g:453:2: iv_ruleTaskRef= ruleTaskRef EOF
            {
             newCompositeNode(grammarAccess.getTaskRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskRef=ruleTaskRef();

            state._fsp--;

             current =iv_ruleTaskRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTaskRef"


    // $ANTLR start "ruleTaskRef"
    // InternalXercise.g:459:1: ruleTaskRef returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQName ) ) ) ;
    public final EObject ruleTaskRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalXercise.g:465:2: ( (otherlv_0= 'ref' ( ( ruleQName ) ) ) )
            // InternalXercise.g:466:2: (otherlv_0= 'ref' ( ( ruleQName ) ) )
            {
            // InternalXercise.g:466:2: (otherlv_0= 'ref' ( ( ruleQName ) ) )
            // InternalXercise.g:467:3: otherlv_0= 'ref' ( ( ruleQName ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRefAccess().getRefKeyword_0());
            		
            // InternalXercise.g:471:3: ( ( ruleQName ) )
            // InternalXercise.g:472:4: ( ruleQName )
            {
            // InternalXercise.g:472:4: ( ruleQName )
            // InternalXercise.g:473:5: ruleQName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTaskRefAccess().getTaskRefTaskCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskRef"


    // $ANTLR start "entryRuleTask"
    // InternalXercise.g:491:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalXercise.g:491:45: (iv_ruleTask= ruleTask EOF )
            // InternalXercise.g:492:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalXercise.g:498:1: ruleTask returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_q_1_0 = null;

        EObject lv_a_2_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:504:2: ( ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) ) )
            // InternalXercise.g:505:2: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) )
            {
            // InternalXercise.g:505:2: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) )
            // InternalXercise.g:506:3: ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) )
            {
            // InternalXercise.g:506:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXercise.g:507:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalXercise.g:507:4: (lv_name_0_0= RULE_ID )
                    // InternalXercise.g:508:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalXercise.g:524:3: ( (lv_q_1_0= ruleQuestion ) )
            // InternalXercise.g:525:4: (lv_q_1_0= ruleQuestion )
            {
            // InternalXercise.g:525:4: (lv_q_1_0= ruleQuestion )
            // InternalXercise.g:526:5: lv_q_1_0= ruleQuestion
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getQQuestionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_q_1_0=ruleQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"q",
            						lv_q_1_0,
            						"no.hal.learning.exercise.xtext.Xercise.Question");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXercise.g:543:3: ( (lv_a_2_0= ruleAnswer ) )
            // InternalXercise.g:544:4: (lv_a_2_0= ruleAnswer )
            {
            // InternalXercise.g:544:4: (lv_a_2_0= ruleAnswer )
            // InternalXercise.g:545:5: lv_a_2_0= ruleAnswer
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getAAnswerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_a_2_0=ruleAnswer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_2_0,
            						"no.hal.learning.exercise.xtext.Xercise.Answer");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleQuestion"
    // InternalXercise.g:566:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalXercise.g:566:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalXercise.g:567:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalXercise.g:573:1: ruleQuestion returns [EObject current=null] : this_StringQuestion_0= ruleStringQuestion ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_StringQuestion_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:579:2: (this_StringQuestion_0= ruleStringQuestion )
            // InternalXercise.g:580:2: this_StringQuestion_0= ruleStringQuestion
            {

            		newCompositeNode(grammarAccess.getQuestionAccess().getStringQuestionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_StringQuestion_0=ruleStringQuestion();

            state._fsp--;


            		current = this_StringQuestion_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleStringQuestion"
    // InternalXercise.g:591:1: entryRuleStringQuestion returns [EObject current=null] : iv_ruleStringQuestion= ruleStringQuestion EOF ;
    public final EObject entryRuleStringQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringQuestion = null;


        try {
            // InternalXercise.g:591:55: (iv_ruleStringQuestion= ruleStringQuestion EOF )
            // InternalXercise.g:592:2: iv_ruleStringQuestion= ruleStringQuestion EOF
            {
             newCompositeNode(grammarAccess.getStringQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringQuestion=ruleStringQuestion();

            state._fsp--;

             current =iv_ruleStringQuestion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringQuestion"


    // $ANTLR start "ruleStringQuestion"
    // InternalXercise.g:598:1: ruleStringQuestion returns [EObject current=null] : ( (lv_question_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_question_0_0=null;


        	enterRule();

        try {
            // InternalXercise.g:604:2: ( ( (lv_question_0_0= RULE_STRING ) ) )
            // InternalXercise.g:605:2: ( (lv_question_0_0= RULE_STRING ) )
            {
            // InternalXercise.g:605:2: ( (lv_question_0_0= RULE_STRING ) )
            // InternalXercise.g:606:3: (lv_question_0_0= RULE_STRING )
            {
            // InternalXercise.g:606:3: (lv_question_0_0= RULE_STRING )
            // InternalXercise.g:607:4: lv_question_0_0= RULE_STRING
            {
            lv_question_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_question_0_0, grammarAccess.getStringQuestionAccess().getQuestionSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringQuestionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"question",
            					lv_question_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringQuestion"


    // $ANTLR start "entryRuleAnswer"
    // InternalXercise.g:626:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // InternalXercise.g:626:47: (iv_ruleAnswer= ruleAnswer EOF )
            // InternalXercise.g:627:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // InternalXercise.g:633:1: ruleAnswer returns [EObject current=null] : (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer | this_TaskAnswer_2= ruleTaskAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_OptionAnswer_0 = null;

        EObject this_OptionsAnswer_1 = null;

        EObject this_TaskAnswer_2 = null;



        	enterRule();

        try {
            // InternalXercise.g:639:2: ( (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer | this_TaskAnswer_2= ruleTaskAnswer ) )
            // InternalXercise.g:640:2: (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer | this_TaskAnswer_2= ruleTaskAnswer )
            {
            // InternalXercise.g:640:2: (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer | this_TaskAnswer_2= ruleTaskAnswer )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
            case 23:
            case 25:
            case 26:
            case 27:
                {
                alt11=2;
                }
                break;
            case 13:
            case 29:
            case 33:
            case 36:
            case 44:
            case 47:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXercise.g:641:3: this_OptionAnswer_0= ruleOptionAnswer
                    {

                    			newCompositeNode(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionAnswer_0=ruleOptionAnswer();

                    state._fsp--;


                    			current = this_OptionAnswer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXercise.g:650:3: this_OptionsAnswer_1= ruleOptionsAnswer
                    {

                    			newCompositeNode(grammarAccess.getAnswerAccess().getOptionsAnswerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionsAnswer_1=ruleOptionsAnswer();

                    state._fsp--;


                    			current = this_OptionsAnswer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXercise.g:659:3: this_TaskAnswer_2= ruleTaskAnswer
                    {

                    			newCompositeNode(grammarAccess.getAnswerAccess().getTaskAnswerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskAnswer_2=ruleTaskAnswer();

                    state._fsp--;


                    			current = this_TaskAnswer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleOptionAnswer"
    // InternalXercise.g:671:1: entryRuleOptionAnswer returns [EObject current=null] : iv_ruleOptionAnswer= ruleOptionAnswer EOF ;
    public final EObject entryRuleOptionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionAnswer = null;


        try {
            // InternalXercise.g:671:53: (iv_ruleOptionAnswer= ruleOptionAnswer EOF )
            // InternalXercise.g:672:2: iv_ruleOptionAnswer= ruleOptionAnswer EOF
            {
             newCompositeNode(grammarAccess.getOptionAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionAnswer=ruleOptionAnswer();

            state._fsp--;

             current =iv_ruleOptionAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOptionAnswer"


    // $ANTLR start "ruleOptionAnswer"
    // InternalXercise.g:678:1: ruleOptionAnswer returns [EObject current=null] : this_SimpleAnswer_0= ruleSimpleAnswer ;
    public final EObject ruleOptionAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAnswer_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:684:2: (this_SimpleAnswer_0= ruleSimpleAnswer )
            // InternalXercise.g:685:2: this_SimpleAnswer_0= ruleSimpleAnswer
            {

            		newCompositeNode(grammarAccess.getOptionAnswerAccess().getSimpleAnswerParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SimpleAnswer_0=ruleSimpleAnswer();

            state._fsp--;


            		current = this_SimpleAnswer_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionAnswer"


    // $ANTLR start "entryRuleSimpleAnswer"
    // InternalXercise.g:696:1: entryRuleSimpleAnswer returns [EObject current=null] : iv_ruleSimpleAnswer= ruleSimpleAnswer EOF ;
    public final EObject entryRuleSimpleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAnswer = null;


        try {
            // InternalXercise.g:696:53: (iv_ruleSimpleAnswer= ruleSimpleAnswer EOF )
            // InternalXercise.g:697:2: iv_ruleSimpleAnswer= ruleSimpleAnswer EOF
            {
             newCompositeNode(grammarAccess.getSimpleAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleAnswer=ruleSimpleAnswer();

            state._fsp--;

             current =iv_ruleSimpleAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleAnswer"


    // $ANTLR start "ruleSimpleAnswer"
    // InternalXercise.g:703:1: ruleSimpleAnswer returns [EObject current=null] : (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer ) ;
    public final EObject ruleSimpleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_StringAnswer_0 = null;

        EObject this_RegexAnswer_1 = null;

        EObject this_NumberAnswer_2 = null;

        EObject this_BooleanAnswer_3 = null;



        	enterRule();

        try {
            // InternalXercise.g:709:2: ( (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer ) )
            // InternalXercise.g:710:2: (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer )
            {
            // InternalXercise.g:710:2: (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case 16:
                {
                alt12=2;
                }
                break;
            case RULE_INT:
                {
                alt12=3;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalXercise.g:711:3: this_StringAnswer_0= ruleStringAnswer
                    {

                    			newCompositeNode(grammarAccess.getSimpleAnswerAccess().getStringAnswerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringAnswer_0=ruleStringAnswer();

                    state._fsp--;


                    			current = this_StringAnswer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXercise.g:720:3: this_RegexAnswer_1= ruleRegexAnswer
                    {

                    			newCompositeNode(grammarAccess.getSimpleAnswerAccess().getRegexAnswerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegexAnswer_1=ruleRegexAnswer();

                    state._fsp--;


                    			current = this_RegexAnswer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXercise.g:729:3: this_NumberAnswer_2= ruleNumberAnswer
                    {

                    			newCompositeNode(grammarAccess.getSimpleAnswerAccess().getNumberAnswerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberAnswer_2=ruleNumberAnswer();

                    state._fsp--;


                    			current = this_NumberAnswer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXercise.g:738:3: this_BooleanAnswer_3= ruleBooleanAnswer
                    {

                    			newCompositeNode(grammarAccess.getSimpleAnswerAccess().getBooleanAnswerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanAnswer_3=ruleBooleanAnswer();

                    state._fsp--;


                    			current = this_BooleanAnswer_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleAnswer"


    // $ANTLR start "entryRuleStringAnswer"
    // InternalXercise.g:750:1: entryRuleStringAnswer returns [EObject current=null] : iv_ruleStringAnswer= ruleStringAnswer EOF ;
    public final EObject entryRuleStringAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAnswer = null;


        try {
            // InternalXercise.g:750:53: (iv_ruleStringAnswer= ruleStringAnswer EOF )
            // InternalXercise.g:751:2: iv_ruleStringAnswer= ruleStringAnswer EOF
            {
             newCompositeNode(grammarAccess.getStringAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringAnswer=ruleStringAnswer();

            state._fsp--;

             current =iv_ruleStringAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringAnswer"


    // $ANTLR start "ruleStringAnswer"
    // InternalXercise.g:757:1: ruleStringAnswer returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? ) ;
    public final EObject ruleStringAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_ignoreCase_1_0=null;


        	enterRule();

        try {
            // InternalXercise.g:763:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? ) )
            // InternalXercise.g:764:2: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? )
            {
            // InternalXercise.g:764:2: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? )
            // InternalXercise.g:765:3: ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )?
            {
            // InternalXercise.g:765:3: ( (lv_value_0_0= RULE_STRING ) )
            // InternalXercise.g:766:4: (lv_value_0_0= RULE_STRING )
            {
            // InternalXercise.g:766:4: (lv_value_0_0= RULE_STRING )
            // InternalXercise.g:767:5: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_value_0_0, grammarAccess.getStringAnswerAccess().getValueSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringAnswerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXercise.g:783:3: ( (lv_ignoreCase_1_0= '~' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXercise.g:784:4: (lv_ignoreCase_1_0= '~' )
                    {
                    // InternalXercise.g:784:4: (lv_ignoreCase_1_0= '~' )
                    // InternalXercise.g:785:5: lv_ignoreCase_1_0= '~'
                    {
                    lv_ignoreCase_1_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_ignoreCase_1_0, grammarAccess.getStringAnswerAccess().getIgnoreCaseTildeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringAnswerRule());
                    					}
                    					setWithLastConsumed(current, "ignoreCase", true, "~");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringAnswer"


    // $ANTLR start "entryRuleRegexAnswer"
    // InternalXercise.g:801:1: entryRuleRegexAnswer returns [EObject current=null] : iv_ruleRegexAnswer= ruleRegexAnswer EOF ;
    public final EObject entryRuleRegexAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexAnswer = null;


        try {
            // InternalXercise.g:801:52: (iv_ruleRegexAnswer= ruleRegexAnswer EOF )
            // InternalXercise.g:802:2: iv_ruleRegexAnswer= ruleRegexAnswer EOF
            {
             newCompositeNode(grammarAccess.getRegexAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegexAnswer=ruleRegexAnswer();

            state._fsp--;

             current =iv_ruleRegexAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRegexAnswer"


    // $ANTLR start "ruleRegexAnswer"
    // InternalXercise.g:808:1: ruleRegexAnswer returns [EObject current=null] : ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? ) ;
    public final EObject ruleRegexAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_regexp_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_ignoreCase_3_0=null;


        	enterRule();

        try {
            // InternalXercise.g:814:2: ( ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? ) )
            // InternalXercise.g:815:2: ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? )
            {
            // InternalXercise.g:815:2: ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? )
            // InternalXercise.g:816:3: ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )?
            {
            // InternalXercise.g:816:3: ( (lv_regexp_0_0= '/' ) )
            // InternalXercise.g:817:4: (lv_regexp_0_0= '/' )
            {
            // InternalXercise.g:817:4: (lv_regexp_0_0= '/' )
            // InternalXercise.g:818:5: lv_regexp_0_0= '/'
            {
            lv_regexp_0_0=(Token)match(input,16,FOLLOW_8); 

            					newLeafNode(lv_regexp_0_0, grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegexAnswerRule());
            					}
            					setWithLastConsumed(current, "regexp", true, "/");
            				

            }


            }

            // InternalXercise.g:830:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalXercise.g:831:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalXercise.g:831:4: (lv_value_1_0= RULE_STRING )
            // InternalXercise.g:832:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRegexAnswerAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegexAnswerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRegexAnswerAccess().getSolidusKeyword_2());
            		
            // InternalXercise.g:852:3: ( (lv_ignoreCase_3_0= '~' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXercise.g:853:4: (lv_ignoreCase_3_0= '~' )
                    {
                    // InternalXercise.g:853:4: (lv_ignoreCase_3_0= '~' )
                    // InternalXercise.g:854:5: lv_ignoreCase_3_0= '~'
                    {
                    lv_ignoreCase_3_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_ignoreCase_3_0, grammarAccess.getRegexAnswerAccess().getIgnoreCaseTildeKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegexAnswerRule());
                    					}
                    					setWithLastConsumed(current, "ignoreCase", true, "~");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegexAnswer"


    // $ANTLR start "entryRuleNumberAnswer"
    // InternalXercise.g:870:1: entryRuleNumberAnswer returns [EObject current=null] : iv_ruleNumberAnswer= ruleNumberAnswer EOF ;
    public final EObject entryRuleNumberAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAnswer = null;


        try {
            // InternalXercise.g:870:53: (iv_ruleNumberAnswer= ruleNumberAnswer EOF )
            // InternalXercise.g:871:2: iv_ruleNumberAnswer= ruleNumberAnswer EOF
            {
             newCompositeNode(grammarAccess.getNumberAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberAnswer=ruleNumberAnswer();

            state._fsp--;

             current =iv_ruleNumberAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberAnswer"


    // $ANTLR start "ruleNumberAnswer"
    // InternalXercise.g:877:1: ruleNumberAnswer returns [EObject current=null] : ( ( (lv_value_0_0= ruleEDoubleObject ) ) (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )? ) ;
    public final EObject ruleNumberAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_errorMargin_2_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:883:2: ( ( ( (lv_value_0_0= ruleEDoubleObject ) ) (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )? ) )
            // InternalXercise.g:884:2: ( ( (lv_value_0_0= ruleEDoubleObject ) ) (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )? )
            {
            // InternalXercise.g:884:2: ( ( (lv_value_0_0= ruleEDoubleObject ) ) (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )? )
            // InternalXercise.g:885:3: ( (lv_value_0_0= ruleEDoubleObject ) ) (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )?
            {
            // InternalXercise.g:885:3: ( (lv_value_0_0= ruleEDoubleObject ) )
            // InternalXercise.g:886:4: (lv_value_0_0= ruleEDoubleObject )
            {
            // InternalXercise.g:886:4: (lv_value_0_0= ruleEDoubleObject )
            // InternalXercise.g:887:5: lv_value_0_0= ruleEDoubleObject
            {

            					newCompositeNode(grammarAccess.getNumberAnswerAccess().getValueEDoubleObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_0_0=ruleEDoubleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberAnswerRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"no.hal.learning.exercise.xtext.Xercise.EDoubleObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXercise.g:904:3: (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXercise.g:905:4: otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberAnswerAccess().getPlusSignHyphenMinusKeyword_1_0());
                    			
                    // InternalXercise.g:909:4: ( (lv_errorMargin_2_0= ruleEDoubleObject ) )
                    // InternalXercise.g:910:5: (lv_errorMargin_2_0= ruleEDoubleObject )
                    {
                    // InternalXercise.g:910:5: (lv_errorMargin_2_0= ruleEDoubleObject )
                    // InternalXercise.g:911:6: lv_errorMargin_2_0= ruleEDoubleObject
                    {

                    						newCompositeNode(grammarAccess.getNumberAnswerAccess().getErrorMarginEDoubleObjectParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_errorMargin_2_0=ruleEDoubleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumberAnswerRule());
                    						}
                    						set(
                    							current,
                    							"errorMargin",
                    							lv_errorMargin_2_0,
                    							"no.hal.learning.exercise.xtext.Xercise.EDoubleObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberAnswer"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalXercise.g:933:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalXercise.g:933:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalXercise.g:934:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
            {
             newCompositeNode(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDoubleObject=ruleEDoubleObject();

            state._fsp--;

             current =iv_ruleEDoubleObject.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalXercise.g:940:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalXercise.g:946:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalXercise.g:947:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalXercise.g:947:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalXercise.g:948:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_0());
            		
            // InternalXercise.g:955:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXercise.g:956:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,12,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleBooleanAnswer"
    // InternalXercise.g:973:1: entryRuleBooleanAnswer returns [EObject current=null] : iv_ruleBooleanAnswer= ruleBooleanAnswer EOF ;
    public final EObject entryRuleBooleanAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAnswer = null;


        try {
            // InternalXercise.g:973:54: (iv_ruleBooleanAnswer= ruleBooleanAnswer EOF )
            // InternalXercise.g:974:2: iv_ruleBooleanAnswer= ruleBooleanAnswer EOF
            {
             newCompositeNode(grammarAccess.getBooleanAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanAnswer=ruleBooleanAnswer();

            state._fsp--;

             current =iv_ruleBooleanAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanAnswer"


    // $ANTLR start "ruleBooleanAnswer"
    // InternalXercise.g:980:1: ruleBooleanAnswer returns [EObject current=null] : ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) ) ;
    public final EObject ruleBooleanAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXercise.g:986:2: ( ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) ) )
            // InternalXercise.g:987:2: ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) )
            {
            // InternalXercise.g:987:2: ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) )
            // InternalXercise.g:988:3: () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) )
            {
            // InternalXercise.g:988:3: ()
            // InternalXercise.g:989:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAnswerAccess().getBooleanAnswerAction_0(),
            					current);
            			

            }

            // InternalXercise.g:995:3: ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=18 && LA19_0<=19)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=20 && LA19_0<=21)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalXercise.g:996:4: ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) )
                    {
                    // InternalXercise.g:996:4: ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) )
                    // InternalXercise.g:997:5: ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) )
                    {
                    // InternalXercise.g:997:5: ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) )
                    // InternalXercise.g:998:6: (lv_value_1_1= 'yes' | lv_value_1_2= 'true' )
                    {
                    // InternalXercise.g:998:6: (lv_value_1_1= 'yes' | lv_value_1_2= 'true' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==18) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==19) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalXercise.g:999:7: lv_value_1_1= 'yes'
                            {
                            lv_value_1_1=(Token)match(input,18,FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getBooleanAnswerAccess().getValueYesKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBooleanAnswerRule());
                            							}
                            							setWithLastConsumed(current, "value", true, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalXercise.g:1010:7: lv_value_1_2= 'true'
                            {
                            lv_value_1_2=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(lv_value_1_2, grammarAccess.getBooleanAnswerAccess().getValueTrueKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBooleanAnswerRule());
                            							}
                            							setWithLastConsumed(current, "value", true, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1024:4: (otherlv_2= 'no' | otherlv_3= 'false' )
                    {
                    // InternalXercise.g:1024:4: (otherlv_2= 'no' | otherlv_3= 'false' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==20) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==21) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalXercise.g:1025:5: otherlv_2= 'no'
                            {
                            otherlv_2=(Token)match(input,20,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getBooleanAnswerAccess().getNoKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXercise.g:1030:5: otherlv_3= 'false'
                            {
                            otherlv_3=(Token)match(input,21,FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getBooleanAnswerAccess().getFalseKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanAnswer"


    // $ANTLR start "entryRuleOptionsAnswer"
    // InternalXercise.g:1040:1: entryRuleOptionsAnswer returns [EObject current=null] : iv_ruleOptionsAnswer= ruleOptionsAnswer EOF ;
    public final EObject entryRuleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionsAnswer = null;


        try {
            // InternalXercise.g:1040:54: (iv_ruleOptionsAnswer= ruleOptionsAnswer EOF )
            // InternalXercise.g:1041:2: iv_ruleOptionsAnswer= ruleOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getOptionsAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionsAnswer=ruleOptionsAnswer();

            state._fsp--;

             current =iv_ruleOptionsAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOptionsAnswer"


    // $ANTLR start "ruleOptionsAnswer"
    // InternalXercise.g:1047:1: ruleOptionsAnswer returns [EObject current=null] : (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer ) ;
    public final EObject ruleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_SingleOptionsAnswer_0 = null;

        EObject this_ManyOptionsAnswer_1 = null;



        	enterRule();

        try {
            // InternalXercise.g:1053:2: ( (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer ) )
            // InternalXercise.g:1054:2: (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer )
            {
            // InternalXercise.g:1054:2: (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=22 && LA20_0<=23)||(LA20_0>=25 && LA20_0<=26)) ) {
                alt20=1;
            }
            else if ( (LA20_0==27) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalXercise.g:1055:3: this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer
                    {

                    			newCompositeNode(grammarAccess.getOptionsAnswerAccess().getSingleOptionsAnswerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleOptionsAnswer_0=ruleSingleOptionsAnswer();

                    state._fsp--;


                    			current = this_SingleOptionsAnswer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXercise.g:1064:3: this_ManyOptionsAnswer_1= ruleManyOptionsAnswer
                    {

                    			newCompositeNode(grammarAccess.getOptionsAnswerAccess().getManyOptionsAnswerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManyOptionsAnswer_1=ruleManyOptionsAnswer();

                    state._fsp--;


                    			current = this_ManyOptionsAnswer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionsAnswer"


    // $ANTLR start "entryRuleSingleOptionsAnswer"
    // InternalXercise.g:1076:1: entryRuleSingleOptionsAnswer returns [EObject current=null] : iv_ruleSingleOptionsAnswer= ruleSingleOptionsAnswer EOF ;
    public final EObject entryRuleSingleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleOptionsAnswer = null;


        try {
            // InternalXercise.g:1076:60: (iv_ruleSingleOptionsAnswer= ruleSingleOptionsAnswer EOF )
            // InternalXercise.g:1077:2: iv_ruleSingleOptionsAnswer= ruleSingleOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getSingleOptionsAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleOptionsAnswer=ruleSingleOptionsAnswer();

            state._fsp--;

             current =iv_ruleSingleOptionsAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleOptionsAnswer"


    // $ANTLR start "ruleSingleOptionsAnswer"
    // InternalXercise.g:1083:1: ruleSingleOptionsAnswer returns [EObject current=null] : (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer ) ;
    public final EObject ruleSingleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_SingleBoxOptionsAnswer_0 = null;

        EObject this_SingleListOptionsAnswer_1 = null;



        	enterRule();

        try {
            // InternalXercise.g:1089:2: ( (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer ) )
            // InternalXercise.g:1090:2: (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer )
            {
            // InternalXercise.g:1090:2: (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            else if ( (LA21_0==23||(LA21_0>=25 && LA21_0<=26)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalXercise.g:1091:3: this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer
                    {

                    			newCompositeNode(grammarAccess.getSingleOptionsAnswerAccess().getSingleBoxOptionsAnswerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleBoxOptionsAnswer_0=ruleSingleBoxOptionsAnswer();

                    state._fsp--;


                    			current = this_SingleBoxOptionsAnswer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXercise.g:1100:3: this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer
                    {

                    			newCompositeNode(grammarAccess.getSingleOptionsAnswerAccess().getSingleListOptionsAnswerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleListOptionsAnswer_1=ruleSingleListOptionsAnswer();

                    state._fsp--;


                    			current = this_SingleListOptionsAnswer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleOptionsAnswer"


    // $ANTLR start "entryRuleSingleBoxOptionsAnswer"
    // InternalXercise.g:1112:1: entryRuleSingleBoxOptionsAnswer returns [EObject current=null] : iv_ruleSingleBoxOptionsAnswer= ruleSingleBoxOptionsAnswer EOF ;
    public final EObject entryRuleSingleBoxOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleBoxOptionsAnswer = null;


        try {
            // InternalXercise.g:1112:63: (iv_ruleSingleBoxOptionsAnswer= ruleSingleBoxOptionsAnswer EOF )
            // InternalXercise.g:1113:2: iv_ruleSingleBoxOptionsAnswer= ruleSingleBoxOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getSingleBoxOptionsAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleBoxOptionsAnswer=ruleSingleBoxOptionsAnswer();

            state._fsp--;

             current =iv_ruleSingleBoxOptionsAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleBoxOptionsAnswer"


    // $ANTLR start "ruleSingleBoxOptionsAnswer"
    // InternalXercise.g:1119:1: ruleSingleBoxOptionsAnswer returns [EObject current=null] : ( (lv_options_0_0= ruleSingleBoxOption ) )+ ;
    public final EObject ruleSingleBoxOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_options_0_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1125:2: ( ( (lv_options_0_0= ruleSingleBoxOption ) )+ )
            // InternalXercise.g:1126:2: ( (lv_options_0_0= ruleSingleBoxOption ) )+
            {
            // InternalXercise.g:1126:2: ( (lv_options_0_0= ruleSingleBoxOption ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXercise.g:1127:3: (lv_options_0_0= ruleSingleBoxOption )
            	    {
            	    // InternalXercise.g:1127:3: (lv_options_0_0= ruleSingleBoxOption )
            	    // InternalXercise.g:1128:4: lv_options_0_0= ruleSingleBoxOption
            	    {

            	    				newCompositeNode(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsSingleBoxOptionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    lv_options_0_0=ruleSingleBoxOption();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSingleBoxOptionsAnswerRule());
            	    				}
            	    				add(
            	    					current,
            	    					"options",
            	    					lv_options_0_0,
            	    					"no.hal.learning.exercise.xtext.Xercise.SingleBoxOption");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleBoxOptionsAnswer"


    // $ANTLR start "entryRuleSingleBoxOption"
    // InternalXercise.g:1148:1: entryRuleSingleBoxOption returns [EObject current=null] : iv_ruleSingleBoxOption= ruleSingleBoxOption EOF ;
    public final EObject entryRuleSingleBoxOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleBoxOption = null;


        try {
            // InternalXercise.g:1148:56: (iv_ruleSingleBoxOption= ruleSingleBoxOption EOF )
            // InternalXercise.g:1149:2: iv_ruleSingleBoxOption= ruleSingleBoxOption EOF
            {
             newCompositeNode(grammarAccess.getSingleBoxOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleBoxOption=ruleSingleBoxOption();

            state._fsp--;

             current =iv_ruleSingleBoxOption; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleBoxOption"


    // $ANTLR start "ruleSingleBoxOption"
    // InternalXercise.g:1155:1: ruleSingleBoxOption returns [EObject current=null] : (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) ) ;
    public final EObject ruleSingleBoxOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_correct_1_0=null;
        Token otherlv_2=null;
        EObject lv_option_3_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1161:2: ( (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) ) )
            // InternalXercise.g:1162:2: (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            {
            // InternalXercise.g:1162:2: (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            // InternalXercise.g:1163:3: otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleBoxOptionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalXercise.g:1167:3: ( (lv_correct_1_0= 'x' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXercise.g:1168:4: (lv_correct_1_0= 'x' )
                    {
                    // InternalXercise.g:1168:4: (lv_correct_1_0= 'x' )
                    // InternalXercise.g:1169:5: lv_correct_1_0= 'x'
                    {
                    lv_correct_1_0=(Token)match(input,23,FOLLOW_19); 

                    					newLeafNode(lv_correct_1_0, grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleBoxOptionRule());
                    					}
                    					setWithLastConsumed(current, "correct", true, "x");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleBoxOptionAccess().getRightParenthesisKeyword_2());
            		
            // InternalXercise.g:1185:3: ( (lv_option_3_0= ruleOptionAnswer ) )
            // InternalXercise.g:1186:4: (lv_option_3_0= ruleOptionAnswer )
            {
            // InternalXercise.g:1186:4: (lv_option_3_0= ruleOptionAnswer )
            // InternalXercise.g:1187:5: lv_option_3_0= ruleOptionAnswer
            {

            					newCompositeNode(grammarAccess.getSingleBoxOptionAccess().getOptionOptionAnswerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_option_3_0=ruleOptionAnswer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleBoxOptionRule());
            					}
            					set(
            						current,
            						"option",
            						lv_option_3_0,
            						"no.hal.learning.exercise.xtext.Xercise.OptionAnswer");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleBoxOption"


    // $ANTLR start "entryRuleSingleListOptionsAnswer"
    // InternalXercise.g:1208:1: entryRuleSingleListOptionsAnswer returns [EObject current=null] : iv_ruleSingleListOptionsAnswer= ruleSingleListOptionsAnswer EOF ;
    public final EObject entryRuleSingleListOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleListOptionsAnswer = null;


        try {
            // InternalXercise.g:1208:64: (iv_ruleSingleListOptionsAnswer= ruleSingleListOptionsAnswer EOF )
            // InternalXercise.g:1209:2: iv_ruleSingleListOptionsAnswer= ruleSingleListOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getSingleListOptionsAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleListOptionsAnswer=ruleSingleListOptionsAnswer();

            state._fsp--;

             current =iv_ruleSingleListOptionsAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleListOptionsAnswer"


    // $ANTLR start "ruleSingleListOptionsAnswer"
    // InternalXercise.g:1215:1: ruleSingleListOptionsAnswer returns [EObject current=null] : ( (lv_options_0_0= ruleSingleListOption ) )+ ;
    public final EObject ruleSingleListOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_options_0_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1221:2: ( ( (lv_options_0_0= ruleSingleListOption ) )+ )
            // InternalXercise.g:1222:2: ( (lv_options_0_0= ruleSingleListOption ) )+
            {
            // InternalXercise.g:1222:2: ( (lv_options_0_0= ruleSingleListOption ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23||(LA24_0>=25 && LA24_0<=26)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXercise.g:1223:3: (lv_options_0_0= ruleSingleListOption )
            	    {
            	    // InternalXercise.g:1223:3: (lv_options_0_0= ruleSingleListOption )
            	    // InternalXercise.g:1224:4: lv_options_0_0= ruleSingleListOption
            	    {

            	    				newCompositeNode(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsSingleListOptionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_21);
            	    lv_options_0_0=ruleSingleListOption();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSingleListOptionsAnswerRule());
            	    				}
            	    				add(
            	    					current,
            	    					"options",
            	    					lv_options_0_0,
            	    					"no.hal.learning.exercise.xtext.Xercise.SingleListOption");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleListOptionsAnswer"


    // $ANTLR start "entryRuleSingleListOption"
    // InternalXercise.g:1244:1: entryRuleSingleListOption returns [EObject current=null] : iv_ruleSingleListOption= ruleSingleListOption EOF ;
    public final EObject entryRuleSingleListOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleListOption = null;


        try {
            // InternalXercise.g:1244:57: (iv_ruleSingleListOption= ruleSingleListOption EOF )
            // InternalXercise.g:1245:2: iv_ruleSingleListOption= ruleSingleListOption EOF
            {
             newCompositeNode(grammarAccess.getSingleListOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleListOption=ruleSingleListOption();

            state._fsp--;

             current =iv_ruleSingleListOption; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleListOption"


    // $ANTLR start "ruleSingleListOption"
    // InternalXercise.g:1251:1: ruleSingleListOption returns [EObject current=null] : ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) ) ;
    public final EObject ruleSingleListOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_correct_2_0=null;
        EObject lv_option_3_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1257:2: ( ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) ) )
            // InternalXercise.g:1258:2: ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) )
            {
            // InternalXercise.g:1258:2: ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) )
            // InternalXercise.g:1259:3: ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) )
            {
            // InternalXercise.g:1259:3: ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23||LA26_0==25) ) {
                alt26=1;
            }
            else if ( (LA26_0==26) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalXercise.g:1260:4: (otherlv_0= '-' | otherlv_1= 'x' )
                    {
                    // InternalXercise.g:1260:4: (otherlv_0= '-' | otherlv_1= 'x' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==25) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==23) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalXercise.g:1261:5: otherlv_0= '-'
                            {
                            otherlv_0=(Token)match(input,25,FOLLOW_20); 

                            					newLeafNode(otherlv_0, grammarAccess.getSingleListOptionAccess().getHyphenMinusKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalXercise.g:1266:5: otherlv_1= 'x'
                            {
                            otherlv_1=(Token)match(input,23,FOLLOW_20); 

                            					newLeafNode(otherlv_1, grammarAccess.getSingleListOptionAccess().getXKeyword_0_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalXercise.g:1272:4: ( (lv_correct_2_0= 'v' ) )
                    {
                    // InternalXercise.g:1272:4: ( (lv_correct_2_0= 'v' ) )
                    // InternalXercise.g:1273:5: (lv_correct_2_0= 'v' )
                    {
                    // InternalXercise.g:1273:5: (lv_correct_2_0= 'v' )
                    // InternalXercise.g:1274:6: lv_correct_2_0= 'v'
                    {
                    lv_correct_2_0=(Token)match(input,26,FOLLOW_20); 

                    						newLeafNode(lv_correct_2_0, grammarAccess.getSingleListOptionAccess().getCorrectVKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleListOptionRule());
                    						}
                    						setWithLastConsumed(current, "correct", true, "v");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXercise.g:1287:3: ( (lv_option_3_0= ruleOptionAnswer ) )
            // InternalXercise.g:1288:4: (lv_option_3_0= ruleOptionAnswer )
            {
            // InternalXercise.g:1288:4: (lv_option_3_0= ruleOptionAnswer )
            // InternalXercise.g:1289:5: lv_option_3_0= ruleOptionAnswer
            {

            					newCompositeNode(grammarAccess.getSingleListOptionAccess().getOptionOptionAnswerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_option_3_0=ruleOptionAnswer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleListOptionRule());
            					}
            					set(
            						current,
            						"option",
            						lv_option_3_0,
            						"no.hal.learning.exercise.xtext.Xercise.OptionAnswer");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleListOption"


    // $ANTLR start "entryRuleManyOptionsAnswer"
    // InternalXercise.g:1310:1: entryRuleManyOptionsAnswer returns [EObject current=null] : iv_ruleManyOptionsAnswer= ruleManyOptionsAnswer EOF ;
    public final EObject entryRuleManyOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyOptionsAnswer = null;


        try {
            // InternalXercise.g:1310:58: (iv_ruleManyOptionsAnswer= ruleManyOptionsAnswer EOF )
            // InternalXercise.g:1311:2: iv_ruleManyOptionsAnswer= ruleManyOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getManyOptionsAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManyOptionsAnswer=ruleManyOptionsAnswer();

            state._fsp--;

             current =iv_ruleManyOptionsAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManyOptionsAnswer"


    // $ANTLR start "ruleManyOptionsAnswer"
    // InternalXercise.g:1317:1: ruleManyOptionsAnswer returns [EObject current=null] : ( (lv_options_0_0= ruleManyOption ) )+ ;
    public final EObject ruleManyOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_options_0_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1323:2: ( ( (lv_options_0_0= ruleManyOption ) )+ )
            // InternalXercise.g:1324:2: ( (lv_options_0_0= ruleManyOption ) )+
            {
            // InternalXercise.g:1324:2: ( (lv_options_0_0= ruleManyOption ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==27) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalXercise.g:1325:3: (lv_options_0_0= ruleManyOption )
            	    {
            	    // InternalXercise.g:1325:3: (lv_options_0_0= ruleManyOption )
            	    // InternalXercise.g:1326:4: lv_options_0_0= ruleManyOption
            	    {

            	    				newCompositeNode(grammarAccess.getManyOptionsAnswerAccess().getOptionsManyOptionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_22);
            	    lv_options_0_0=ruleManyOption();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getManyOptionsAnswerRule());
            	    				}
            	    				add(
            	    					current,
            	    					"options",
            	    					lv_options_0_0,
            	    					"no.hal.learning.exercise.xtext.Xercise.ManyOption");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManyOptionsAnswer"


    // $ANTLR start "entryRuleManyOption"
    // InternalXercise.g:1346:1: entryRuleManyOption returns [EObject current=null] : iv_ruleManyOption= ruleManyOption EOF ;
    public final EObject entryRuleManyOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyOption = null;


        try {
            // InternalXercise.g:1346:51: (iv_ruleManyOption= ruleManyOption EOF )
            // InternalXercise.g:1347:2: iv_ruleManyOption= ruleManyOption EOF
            {
             newCompositeNode(grammarAccess.getManyOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManyOption=ruleManyOption();

            state._fsp--;

             current =iv_ruleManyOption; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleManyOption"


    // $ANTLR start "ruleManyOption"
    // InternalXercise.g:1353:1: ruleManyOption returns [EObject current=null] : (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) ) ;
    public final EObject ruleManyOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_correct_1_0=null;
        Token otherlv_2=null;
        EObject lv_option_3_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1359:2: ( (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) ) )
            // InternalXercise.g:1360:2: (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            {
            // InternalXercise.g:1360:2: (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            // InternalXercise.g:1361:3: otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getManyOptionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalXercise.g:1365:3: ( (lv_correct_1_0= 'x' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXercise.g:1366:4: (lv_correct_1_0= 'x' )
                    {
                    // InternalXercise.g:1366:4: (lv_correct_1_0= 'x' )
                    // InternalXercise.g:1367:5: lv_correct_1_0= 'x'
                    {
                    lv_correct_1_0=(Token)match(input,23,FOLLOW_24); 

                    					newLeafNode(lv_correct_1_0, grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getManyOptionRule());
                    					}
                    					setWithLastConsumed(current, "correct", true, "x");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getManyOptionAccess().getRightSquareBracketKeyword_2());
            		
            // InternalXercise.g:1383:3: ( (lv_option_3_0= ruleOptionAnswer ) )
            // InternalXercise.g:1384:4: (lv_option_3_0= ruleOptionAnswer )
            {
            // InternalXercise.g:1384:4: (lv_option_3_0= ruleOptionAnswer )
            // InternalXercise.g:1385:5: lv_option_3_0= ruleOptionAnswer
            {

            					newCompositeNode(grammarAccess.getManyOptionAccess().getOptionOptionAnswerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_option_3_0=ruleOptionAnswer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManyOptionRule());
            					}
            					set(
            						current,
            						"option",
            						lv_option_3_0,
            						"no.hal.learning.exercise.xtext.Xercise.OptionAnswer");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManyOption"


    // $ANTLR start "entryRuleJunitTestAnswer"
    // InternalXercise.g:1406:1: entryRuleJunitTestAnswer returns [EObject current=null] : iv_ruleJunitTestAnswer= ruleJunitTestAnswer EOF ;
    public final EObject entryRuleJunitTestAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunitTestAnswer = null;


        try {
            // InternalXercise.g:1406:56: (iv_ruleJunitTestAnswer= ruleJunitTestAnswer EOF )
            // InternalXercise.g:1407:2: iv_ruleJunitTestAnswer= ruleJunitTestAnswer EOF
            {
             newCompositeNode(grammarAccess.getJunitTestAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJunitTestAnswer=ruleJunitTestAnswer();

            state._fsp--;

             current =iv_ruleJunitTestAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJunitTestAnswer"


    // $ANTLR start "ruleJunitTestAnswer"
    // InternalXercise.g:1413:1: ruleJunitTestAnswer returns [EObject current=null] : (otherlv_0= 'junit' ( (lv_testRunName_1_0= ruleQName ) ) (otherlv_2= '{' ( (lv_methodNames_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_methodNames_5_0= RULE_ID ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleJunitTestAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_methodNames_3_0=null;
        Token otherlv_4=null;
        Token lv_methodNames_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_testRunName_1_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1419:2: ( (otherlv_0= 'junit' ( (lv_testRunName_1_0= ruleQName ) ) (otherlv_2= '{' ( (lv_methodNames_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_methodNames_5_0= RULE_ID ) ) )* otherlv_6= '}' )? ) )
            // InternalXercise.g:1420:2: (otherlv_0= 'junit' ( (lv_testRunName_1_0= ruleQName ) ) (otherlv_2= '{' ( (lv_methodNames_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_methodNames_5_0= RULE_ID ) ) )* otherlv_6= '}' )? )
            {
            // InternalXercise.g:1420:2: (otherlv_0= 'junit' ( (lv_testRunName_1_0= ruleQName ) ) (otherlv_2= '{' ( (lv_methodNames_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_methodNames_5_0= RULE_ID ) ) )* otherlv_6= '}' )? )
            // InternalXercise.g:1421:3: otherlv_0= 'junit' ( (lv_testRunName_1_0= ruleQName ) ) (otherlv_2= '{' ( (lv_methodNames_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_methodNames_5_0= RULE_ID ) ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getJunitTestAnswerAccess().getJunitKeyword_0());
            		
            // InternalXercise.g:1425:3: ( (lv_testRunName_1_0= ruleQName ) )
            // InternalXercise.g:1426:4: (lv_testRunName_1_0= ruleQName )
            {
            // InternalXercise.g:1426:4: (lv_testRunName_1_0= ruleQName )
            // InternalXercise.g:1427:5: lv_testRunName_1_0= ruleQName
            {

            					newCompositeNode(grammarAccess.getJunitTestAnswerAccess().getTestRunNameQNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_testRunName_1_0=ruleQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJunitTestAnswerRule());
            					}
            					set(
            						current,
            						"testRunName",
            						lv_testRunName_1_0,
            						"no.hal.learning.exercise.xtext.Xercise.QName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXercise.g:1444:3: (otherlv_2= '{' ( (lv_methodNames_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_methodNames_5_0= RULE_ID ) ) )* otherlv_6= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalXercise.g:1445:4: otherlv_2= '{' ( (lv_methodNames_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_methodNames_5_0= RULE_ID ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getJunitTestAnswerAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalXercise.g:1449:4: ( (lv_methodNames_3_0= RULE_ID ) )
                    // InternalXercise.g:1450:5: (lv_methodNames_3_0= RULE_ID )
                    {
                    // InternalXercise.g:1450:5: (lv_methodNames_3_0= RULE_ID )
                    // InternalXercise.g:1451:6: lv_methodNames_3_0= RULE_ID
                    {
                    lv_methodNames_3_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(lv_methodNames_3_0, grammarAccess.getJunitTestAnswerAccess().getMethodNamesIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJunitTestAnswerRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"methodNames",
                    							lv_methodNames_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalXercise.g:1467:4: (otherlv_4= ',' ( (lv_methodNames_5_0= RULE_ID ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==31) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalXercise.g:1468:5: otherlv_4= ',' ( (lv_methodNames_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FOLLOW_7); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getJunitTestAnswerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalXercise.g:1472:5: ( (lv_methodNames_5_0= RULE_ID ) )
                    	    // InternalXercise.g:1473:6: (lv_methodNames_5_0= RULE_ID )
                    	    {
                    	    // InternalXercise.g:1473:6: (lv_methodNames_5_0= RULE_ID )
                    	    // InternalXercise.g:1474:7: lv_methodNames_5_0= RULE_ID
                    	    {
                    	    lv_methodNames_5_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    							newLeafNode(lv_methodNames_5_0, grammarAccess.getJunitTestAnswerAccess().getMethodNamesIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJunitTestAnswerRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"methodNames",
                    	    								lv_methodNames_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getJunitTestAnswerAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJunitTestAnswer"


    // $ANTLR start "entryRuleJdtSourceEditAnswer"
    // InternalXercise.g:1500:1: entryRuleJdtSourceEditAnswer returns [EObject current=null] : iv_ruleJdtSourceEditAnswer= ruleJdtSourceEditAnswer EOF ;
    public final EObject entryRuleJdtSourceEditAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJdtSourceEditAnswer = null;


        try {
            // InternalXercise.g:1500:60: (iv_ruleJdtSourceEditAnswer= ruleJdtSourceEditAnswer EOF )
            // InternalXercise.g:1501:2: iv_ruleJdtSourceEditAnswer= ruleJdtSourceEditAnswer EOF
            {
             newCompositeNode(grammarAccess.getJdtSourceEditAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJdtSourceEditAnswer=ruleJdtSourceEditAnswer();

            state._fsp--;

             current =iv_ruleJdtSourceEditAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJdtSourceEditAnswer"


    // $ANTLR start "ruleJdtSourceEditAnswer"
    // InternalXercise.g:1507:1: ruleJdtSourceEditAnswer returns [EObject current=null] : (otherlv_0= 'java' otherlv_1= 'edit' ( (lv_className_2_0= ruleQName ) ) (otherlv_3= '{' ( (lv_methodNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_methodNames_6_0= RULE_ID ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleJdtSourceEditAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_methodNames_4_0=null;
        Token otherlv_5=null;
        Token lv_methodNames_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1513:2: ( (otherlv_0= 'java' otherlv_1= 'edit' ( (lv_className_2_0= ruleQName ) ) (otherlv_3= '{' ( (lv_methodNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_methodNames_6_0= RULE_ID ) ) )* otherlv_7= '}' )? ) )
            // InternalXercise.g:1514:2: (otherlv_0= 'java' otherlv_1= 'edit' ( (lv_className_2_0= ruleQName ) ) (otherlv_3= '{' ( (lv_methodNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_methodNames_6_0= RULE_ID ) ) )* otherlv_7= '}' )? )
            {
            // InternalXercise.g:1514:2: (otherlv_0= 'java' otherlv_1= 'edit' ( (lv_className_2_0= ruleQName ) ) (otherlv_3= '{' ( (lv_methodNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_methodNames_6_0= RULE_ID ) ) )* otherlv_7= '}' )? )
            // InternalXercise.g:1515:3: otherlv_0= 'java' otherlv_1= 'edit' ( (lv_className_2_0= ruleQName ) ) (otherlv_3= '{' ( (lv_methodNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_methodNames_6_0= RULE_ID ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getJdtSourceEditAnswerAccess().getJavaKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getJdtSourceEditAnswerAccess().getEditKeyword_1());
            		
            // InternalXercise.g:1523:3: ( (lv_className_2_0= ruleQName ) )
            // InternalXercise.g:1524:4: (lv_className_2_0= ruleQName )
            {
            // InternalXercise.g:1524:4: (lv_className_2_0= ruleQName )
            // InternalXercise.g:1525:5: lv_className_2_0= ruleQName
            {

            					newCompositeNode(grammarAccess.getJdtSourceEditAnswerAccess().getClassNameQNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_className_2_0=ruleQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJdtSourceEditAnswerRule());
            					}
            					set(
            						current,
            						"className",
            						lv_className_2_0,
            						"no.hal.learning.exercise.xtext.Xercise.QName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXercise.g:1542:3: (otherlv_3= '{' ( (lv_methodNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_methodNames_6_0= RULE_ID ) ) )* otherlv_7= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXercise.g:1543:4: otherlv_3= '{' ( (lv_methodNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_methodNames_6_0= RULE_ID ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getJdtSourceEditAnswerAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalXercise.g:1547:4: ( (lv_methodNames_4_0= RULE_ID ) )
                    // InternalXercise.g:1548:5: (lv_methodNames_4_0= RULE_ID )
                    {
                    // InternalXercise.g:1548:5: (lv_methodNames_4_0= RULE_ID )
                    // InternalXercise.g:1549:6: lv_methodNames_4_0= RULE_ID
                    {
                    lv_methodNames_4_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(lv_methodNames_4_0, grammarAccess.getJdtSourceEditAnswerAccess().getMethodNamesIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJdtSourceEditAnswerRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"methodNames",
                    							lv_methodNames_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalXercise.g:1565:4: (otherlv_5= ',' ( (lv_methodNames_6_0= RULE_ID ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==31) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalXercise.g:1566:5: otherlv_5= ',' ( (lv_methodNames_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getJdtSourceEditAnswerAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalXercise.g:1570:5: ( (lv_methodNames_6_0= RULE_ID ) )
                    	    // InternalXercise.g:1571:6: (lv_methodNames_6_0= RULE_ID )
                    	    {
                    	    // InternalXercise.g:1571:6: (lv_methodNames_6_0= RULE_ID )
                    	    // InternalXercise.g:1572:7: lv_methodNames_6_0= RULE_ID
                    	    {
                    	    lv_methodNames_6_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    	    							newLeafNode(lv_methodNames_6_0, grammarAccess.getJdtSourceEditAnswerAccess().getMethodNamesIDTerminalRuleCall_3_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJdtSourceEditAnswerRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"methodNames",
                    	    								lv_methodNames_6_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getJdtSourceEditAnswerAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJdtSourceEditAnswer"


    // $ANTLR start "entryRuleJdtLaunchAnswer"
    // InternalXercise.g:1598:1: entryRuleJdtLaunchAnswer returns [EObject current=null] : iv_ruleJdtLaunchAnswer= ruleJdtLaunchAnswer EOF ;
    public final EObject entryRuleJdtLaunchAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJdtLaunchAnswer = null;


        try {
            // InternalXercise.g:1598:56: (iv_ruleJdtLaunchAnswer= ruleJdtLaunchAnswer EOF )
            // InternalXercise.g:1599:2: iv_ruleJdtLaunchAnswer= ruleJdtLaunchAnswer EOF
            {
             newCompositeNode(grammarAccess.getJdtLaunchAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJdtLaunchAnswer=ruleJdtLaunchAnswer();

            state._fsp--;

             current =iv_ruleJdtLaunchAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJdtLaunchAnswer"


    // $ANTLR start "ruleJdtLaunchAnswer"
    // InternalXercise.g:1605:1: ruleJdtLaunchAnswer returns [EObject current=null] : (otherlv_0= 'java' otherlv_1= 'launch' ( (lv_className_2_0= ruleQName ) ) ) ;
    public final EObject ruleJdtLaunchAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1611:2: ( (otherlv_0= 'java' otherlv_1= 'launch' ( (lv_className_2_0= ruleQName ) ) ) )
            // InternalXercise.g:1612:2: (otherlv_0= 'java' otherlv_1= 'launch' ( (lv_className_2_0= ruleQName ) ) )
            {
            // InternalXercise.g:1612:2: (otherlv_0= 'java' otherlv_1= 'launch' ( (lv_className_2_0= ruleQName ) ) )
            // InternalXercise.g:1613:3: otherlv_0= 'java' otherlv_1= 'launch' ( (lv_className_2_0= ruleQName ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getJdtLaunchAnswerAccess().getJavaKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getJdtLaunchAnswerAccess().getLaunchKeyword_1());
            		
            // InternalXercise.g:1621:3: ( (lv_className_2_0= ruleQName ) )
            // InternalXercise.g:1622:4: (lv_className_2_0= ruleQName )
            {
            // InternalXercise.g:1622:4: (lv_className_2_0= ruleQName )
            // InternalXercise.g:1623:5: lv_className_2_0= ruleQName
            {

            					newCompositeNode(grammarAccess.getJdtLaunchAnswerAccess().getClassNameQNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_className_2_0=ruleQName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJdtLaunchAnswerRule());
            					}
            					set(
            						current,
            						"className",
            						lv_className_2_0,
            						"no.hal.learning.exercise.xtext.Xercise.QName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJdtLaunchAnswer"


    // $ANTLR start "entryRuleTaskAnswer"
    // InternalXercise.g:1644:1: entryRuleTaskAnswer returns [EObject current=null] : iv_ruleTaskAnswer= ruleTaskAnswer EOF ;
    public final EObject entryRuleTaskAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAnswer = null;


        try {
            // InternalXercise.g:1644:51: (iv_ruleTaskAnswer= ruleTaskAnswer EOF )
            // InternalXercise.g:1645:2: iv_ruleTaskAnswer= ruleTaskAnswer EOF
            {
             newCompositeNode(grammarAccess.getTaskAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskAnswer=ruleTaskAnswer();

            state._fsp--;

             current =iv_ruleTaskAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTaskAnswer"


    // $ANTLR start "ruleTaskAnswer"
    // InternalXercise.g:1651:1: ruleTaskAnswer returns [EObject current=null] : (this_PerspectiveTaskAnswer_0= rulePerspectiveTaskAnswer | this_PartTaskAnswer_1= rulePartTaskAnswer | this_CommandExecutionAnswer_2= ruleCommandExecutionAnswer | this_DebugEventAnswer_3= ruleDebugEventAnswer | this_JunitTestAnswer_4= ruleJunitTestAnswer | this_JdtSourceEditAnswer_5= ruleJdtSourceEditAnswer | this_JdtLaunchAnswer_6= ruleJdtLaunchAnswer ) ;
    public final EObject ruleTaskAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_PerspectiveTaskAnswer_0 = null;

        EObject this_PartTaskAnswer_1 = null;

        EObject this_CommandExecutionAnswer_2 = null;

        EObject this_DebugEventAnswer_3 = null;

        EObject this_JunitTestAnswer_4 = null;

        EObject this_JdtSourceEditAnswer_5 = null;

        EObject this_JdtLaunchAnswer_6 = null;



        	enterRule();

        try {
            // InternalXercise.g:1657:2: ( (this_PerspectiveTaskAnswer_0= rulePerspectiveTaskAnswer | this_PartTaskAnswer_1= rulePartTaskAnswer | this_CommandExecutionAnswer_2= ruleCommandExecutionAnswer | this_DebugEventAnswer_3= ruleDebugEventAnswer | this_JunitTestAnswer_4= ruleJunitTestAnswer | this_JdtSourceEditAnswer_5= ruleJdtSourceEditAnswer | this_JdtLaunchAnswer_6= ruleJdtLaunchAnswer ) )
            // InternalXercise.g:1658:2: (this_PerspectiveTaskAnswer_0= rulePerspectiveTaskAnswer | this_PartTaskAnswer_1= rulePartTaskAnswer | this_CommandExecutionAnswer_2= ruleCommandExecutionAnswer | this_DebugEventAnswer_3= ruleDebugEventAnswer | this_JunitTestAnswer_4= ruleJunitTestAnswer | this_JdtSourceEditAnswer_5= ruleJdtSourceEditAnswer | this_JdtLaunchAnswer_6= ruleJdtLaunchAnswer )
            {
            // InternalXercise.g:1658:2: (this_PerspectiveTaskAnswer_0= rulePerspectiveTaskAnswer | this_PartTaskAnswer_1= rulePartTaskAnswer | this_CommandExecutionAnswer_2= ruleCommandExecutionAnswer | this_DebugEventAnswer_3= ruleDebugEventAnswer | this_JunitTestAnswer_4= ruleJunitTestAnswer | this_JdtSourceEditAnswer_5= ruleJdtSourceEditAnswer | this_JdtLaunchAnswer_6= ruleJdtLaunchAnswer )
            int alt33=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt33=1;
                }
                break;
            case 13:
                {
                alt33=2;
                }
                break;
            case 44:
                {
                alt33=3;
                }
                break;
            case 47:
                {
                alt33=4;
                }
                break;
            case 29:
                {
                alt33=5;
                }
                break;
            case 33:
                {
                int LA33_6 = input.LA(2);

                if ( (LA33_6==34) ) {
                    alt33=6;
                }
                else if ( (LA33_6==35) ) {
                    alt33=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalXercise.g:1659:3: this_PerspectiveTaskAnswer_0= rulePerspectiveTaskAnswer
                    {

                    			newCompositeNode(grammarAccess.getTaskAnswerAccess().getPerspectiveTaskAnswerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PerspectiveTaskAnswer_0=rulePerspectiveTaskAnswer();

                    state._fsp--;


                    			current = this_PerspectiveTaskAnswer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXercise.g:1668:3: this_PartTaskAnswer_1= rulePartTaskAnswer
                    {

                    			newCompositeNode(grammarAccess.getTaskAnswerAccess().getPartTaskAnswerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PartTaskAnswer_1=rulePartTaskAnswer();

                    state._fsp--;


                    			current = this_PartTaskAnswer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXercise.g:1677:3: this_CommandExecutionAnswer_2= ruleCommandExecutionAnswer
                    {

                    			newCompositeNode(grammarAccess.getTaskAnswerAccess().getCommandExecutionAnswerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandExecutionAnswer_2=ruleCommandExecutionAnswer();

                    state._fsp--;


                    			current = this_CommandExecutionAnswer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXercise.g:1686:3: this_DebugEventAnswer_3= ruleDebugEventAnswer
                    {

                    			newCompositeNode(grammarAccess.getTaskAnswerAccess().getDebugEventAnswerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DebugEventAnswer_3=ruleDebugEventAnswer();

                    state._fsp--;


                    			current = this_DebugEventAnswer_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXercise.g:1695:3: this_JunitTestAnswer_4= ruleJunitTestAnswer
                    {

                    			newCompositeNode(grammarAccess.getTaskAnswerAccess().getJunitTestAnswerParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_JunitTestAnswer_4=ruleJunitTestAnswer();

                    state._fsp--;


                    			current = this_JunitTestAnswer_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXercise.g:1704:3: this_JdtSourceEditAnswer_5= ruleJdtSourceEditAnswer
                    {

                    			newCompositeNode(grammarAccess.getTaskAnswerAccess().getJdtSourceEditAnswerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_JdtSourceEditAnswer_5=ruleJdtSourceEditAnswer();

                    state._fsp--;


                    			current = this_JdtSourceEditAnswer_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXercise.g:1713:3: this_JdtLaunchAnswer_6= ruleJdtLaunchAnswer
                    {

                    			newCompositeNode(grammarAccess.getTaskAnswerAccess().getJdtLaunchAnswerParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_JdtLaunchAnswer_6=ruleJdtLaunchAnswer();

                    state._fsp--;


                    			current = this_JdtLaunchAnswer_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskAnswer"


    // $ANTLR start "entryRulePerspectiveTaskAnswer"
    // InternalXercise.g:1725:1: entryRulePerspectiveTaskAnswer returns [EObject current=null] : iv_rulePerspectiveTaskAnswer= rulePerspectiveTaskAnswer EOF ;
    public final EObject entryRulePerspectiveTaskAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerspectiveTaskAnswer = null;


        try {
            // InternalXercise.g:1725:62: (iv_rulePerspectiveTaskAnswer= rulePerspectiveTaskAnswer EOF )
            // InternalXercise.g:1726:2: iv_rulePerspectiveTaskAnswer= rulePerspectiveTaskAnswer EOF
            {
             newCompositeNode(grammarAccess.getPerspectiveTaskAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerspectiveTaskAnswer=rulePerspectiveTaskAnswer();

            state._fsp--;

             current =iv_rulePerspectiveTaskAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerspectiveTaskAnswer"


    // $ANTLR start "rulePerspectiveTaskAnswer"
    // InternalXercise.g:1732:1: rulePerspectiveTaskAnswer returns [EObject current=null] : ( () otherlv_1= 'perspective' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) ) ) )? ) ) ;
    public final EObject rulePerspectiveTaskAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_action_4_1=null;
        Token lv_action_4_2=null;
        AntlrDatatypeRuleToken lv_elementId_2_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1738:2: ( ( () otherlv_1= 'perspective' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) ) ) )? ) ) )
            // InternalXercise.g:1739:2: ( () otherlv_1= 'perspective' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) ) ) )? ) )
            {
            // InternalXercise.g:1739:2: ( () otherlv_1= 'perspective' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) ) ) )? ) )
            // InternalXercise.g:1740:3: () otherlv_1= 'perspective' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) ) ) )? )
            {
            // InternalXercise.g:1740:3: ()
            // InternalXercise.g:1741:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPerspectiveTaskAnswerAccess().getPerspectiveTaskAnswerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPerspectiveTaskAnswerAccess().getPerspectiveKeyword_1());
            		
            // InternalXercise.g:1751:3: ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) ) ) )? )
            // InternalXercise.g:1752:4: ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) ) ) )?
            {
            // InternalXercise.g:1752:4: ( (lv_elementId_2_0= ruleQName ) )
            // InternalXercise.g:1753:5: (lv_elementId_2_0= ruleQName )
            {
            // InternalXercise.g:1753:5: (lv_elementId_2_0= ruleQName )
            // InternalXercise.g:1754:6: lv_elementId_2_0= ruleQName
            {

            						newCompositeNode(grammarAccess.getPerspectiveTaskAnswerAccess().getElementIdQNameParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_29);
            lv_elementId_2_0=ruleQName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPerspectiveTaskAnswerRule());
            						}
            						set(
            							current,
            							"elementId",
            							lv_elementId_2_0,
            							"no.hal.learning.exercise.xtext.Xercise.QName");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalXercise.g:1771:4: (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXercise.g:1772:5: otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_30); 

                    					newLeafNode(otherlv_3, grammarAccess.getPerspectiveTaskAnswerAccess().getNumberSignKeyword_2_1_0());
                    				
                    // InternalXercise.g:1776:5: ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) ) )
                    // InternalXercise.g:1777:6: ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) )
                    {
                    // InternalXercise.g:1777:6: ( (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' ) )
                    // InternalXercise.g:1778:7: (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' )
                    {
                    // InternalXercise.g:1778:7: (lv_action_4_1= 'activated' | lv_action_4_2= 'changed' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==38) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==39) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalXercise.g:1779:8: lv_action_4_1= 'activated'
                            {
                            lv_action_4_1=(Token)match(input,38,FOLLOW_2); 

                            								newLeafNode(lv_action_4_1, grammarAccess.getPerspectiveTaskAnswerAccess().getActionActivatedKeyword_2_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getPerspectiveTaskAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalXercise.g:1790:8: lv_action_4_2= 'changed'
                            {
                            lv_action_4_2=(Token)match(input,39,FOLLOW_2); 

                            								newLeafNode(lv_action_4_2, grammarAccess.getPerspectiveTaskAnswerAccess().getActionChangedKeyword_2_1_1_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getPerspectiveTaskAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_2, null);
                            							

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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerspectiveTaskAnswer"


    // $ANTLR start "entryRulePartTaskAnswer"
    // InternalXercise.g:1809:1: entryRulePartTaskAnswer returns [EObject current=null] : iv_rulePartTaskAnswer= rulePartTaskAnswer EOF ;
    public final EObject entryRulePartTaskAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartTaskAnswer = null;


        try {
            // InternalXercise.g:1809:55: (iv_rulePartTaskAnswer= rulePartTaskAnswer EOF )
            // InternalXercise.g:1810:2: iv_rulePartTaskAnswer= rulePartTaskAnswer EOF
            {
             newCompositeNode(grammarAccess.getPartTaskAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartTaskAnswer=rulePartTaskAnswer();

            state._fsp--;

             current =iv_rulePartTaskAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePartTaskAnswer"


    // $ANTLR start "rulePartTaskAnswer"
    // InternalXercise.g:1816:1: rulePartTaskAnswer returns [EObject current=null] : ( () otherlv_1= 'part' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) ) ) )? ) ) ;
    public final EObject rulePartTaskAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_action_4_1=null;
        Token lv_action_4_2=null;
        Token lv_action_4_3=null;
        Token lv_action_4_4=null;
        Token lv_action_4_5=null;
        AntlrDatatypeRuleToken lv_elementId_2_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1822:2: ( ( () otherlv_1= 'part' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) ) ) )? ) ) )
            // InternalXercise.g:1823:2: ( () otherlv_1= 'part' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) ) ) )? ) )
            {
            // InternalXercise.g:1823:2: ( () otherlv_1= 'part' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) ) ) )? ) )
            // InternalXercise.g:1824:3: () otherlv_1= 'part' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) ) ) )? )
            {
            // InternalXercise.g:1824:3: ()
            // InternalXercise.g:1825:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPartTaskAnswerAccess().getPartTaskAnswerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPartTaskAnswerAccess().getPartKeyword_1());
            		
            // InternalXercise.g:1835:3: ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) ) ) )? )
            // InternalXercise.g:1836:4: ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) ) ) )?
            {
            // InternalXercise.g:1836:4: ( (lv_elementId_2_0= ruleQName ) )
            // InternalXercise.g:1837:5: (lv_elementId_2_0= ruleQName )
            {
            // InternalXercise.g:1837:5: (lv_elementId_2_0= ruleQName )
            // InternalXercise.g:1838:6: lv_elementId_2_0= ruleQName
            {

            						newCompositeNode(grammarAccess.getPartTaskAnswerAccess().getElementIdQNameParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_29);
            lv_elementId_2_0=ruleQName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPartTaskAnswerRule());
            						}
            						set(
            							current,
            							"elementId",
            							lv_elementId_2_0,
            							"no.hal.learning.exercise.xtext.Xercise.QName");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalXercise.g:1855:4: (otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXercise.g:1856:5: otherlv_3= '#' ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_31); 

                    					newLeafNode(otherlv_3, grammarAccess.getPartTaskAnswerAccess().getNumberSignKeyword_2_1_0());
                    				
                    // InternalXercise.g:1860:5: ( ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) ) )
                    // InternalXercise.g:1861:6: ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) )
                    {
                    // InternalXercise.g:1861:6: ( (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' ) )
                    // InternalXercise.g:1862:7: (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' )
                    {
                    // InternalXercise.g:1862:7: (lv_action_4_1= 'activated' | lv_action_4_2= 'broughtToTop' | lv_action_4_3= 'closed' | lv_action_4_4= 'deactivated' | lv_action_4_5= 'opened' )
                    int alt36=5;
                    switch ( input.LA(1) ) {
                    case 38:
                        {
                        alt36=1;
                        }
                        break;
                    case 40:
                        {
                        alt36=2;
                        }
                        break;
                    case 41:
                        {
                        alt36=3;
                        }
                        break;
                    case 42:
                        {
                        alt36=4;
                        }
                        break;
                    case 43:
                        {
                        alt36=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // InternalXercise.g:1863:8: lv_action_4_1= 'activated'
                            {
                            lv_action_4_1=(Token)match(input,38,FOLLOW_2); 

                            								newLeafNode(lv_action_4_1, grammarAccess.getPartTaskAnswerAccess().getActionActivatedKeyword_2_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getPartTaskAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalXercise.g:1874:8: lv_action_4_2= 'broughtToTop'
                            {
                            lv_action_4_2=(Token)match(input,40,FOLLOW_2); 

                            								newLeafNode(lv_action_4_2, grammarAccess.getPartTaskAnswerAccess().getActionBroughtToTopKeyword_2_1_1_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getPartTaskAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_2, null);
                            							

                            }
                            break;
                        case 3 :
                            // InternalXercise.g:1885:8: lv_action_4_3= 'closed'
                            {
                            lv_action_4_3=(Token)match(input,41,FOLLOW_2); 

                            								newLeafNode(lv_action_4_3, grammarAccess.getPartTaskAnswerAccess().getActionClosedKeyword_2_1_1_0_2());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getPartTaskAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_3, null);
                            							

                            }
                            break;
                        case 4 :
                            // InternalXercise.g:1896:8: lv_action_4_4= 'deactivated'
                            {
                            lv_action_4_4=(Token)match(input,42,FOLLOW_2); 

                            								newLeafNode(lv_action_4_4, grammarAccess.getPartTaskAnswerAccess().getActionDeactivatedKeyword_2_1_1_0_3());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getPartTaskAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_4, null);
                            							

                            }
                            break;
                        case 5 :
                            // InternalXercise.g:1907:8: lv_action_4_5= 'opened'
                            {
                            lv_action_4_5=(Token)match(input,43,FOLLOW_2); 

                            								newLeafNode(lv_action_4_5, grammarAccess.getPartTaskAnswerAccess().getActionOpenedKeyword_2_1_1_0_4());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getPartTaskAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_5, null);
                            							

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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartTaskAnswer"


    // $ANTLR start "entryRuleCommandExecutionAnswer"
    // InternalXercise.g:1926:1: entryRuleCommandExecutionAnswer returns [EObject current=null] : iv_ruleCommandExecutionAnswer= ruleCommandExecutionAnswer EOF ;
    public final EObject entryRuleCommandExecutionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandExecutionAnswer = null;


        try {
            // InternalXercise.g:1926:63: (iv_ruleCommandExecutionAnswer= ruleCommandExecutionAnswer EOF )
            // InternalXercise.g:1927:2: iv_ruleCommandExecutionAnswer= ruleCommandExecutionAnswer EOF
            {
             newCompositeNode(grammarAccess.getCommandExecutionAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandExecutionAnswer=ruleCommandExecutionAnswer();

            state._fsp--;

             current =iv_ruleCommandExecutionAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommandExecutionAnswer"


    // $ANTLR start "ruleCommandExecutionAnswer"
    // InternalXercise.g:1933:1: ruleCommandExecutionAnswer returns [EObject current=null] : ( () otherlv_1= 'command' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) ) ) )? ) ) ;
    public final EObject ruleCommandExecutionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_action_4_1=null;
        Token lv_action_4_2=null;
        AntlrDatatypeRuleToken lv_elementId_2_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:1939:2: ( ( () otherlv_1= 'command' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) ) ) )? ) ) )
            // InternalXercise.g:1940:2: ( () otherlv_1= 'command' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) ) ) )? ) )
            {
            // InternalXercise.g:1940:2: ( () otherlv_1= 'command' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) ) ) )? ) )
            // InternalXercise.g:1941:3: () otherlv_1= 'command' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) ) ) )? )
            {
            // InternalXercise.g:1941:3: ()
            // InternalXercise.g:1942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandExecutionAnswerAccess().getCommandExecutionAnswerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandExecutionAnswerAccess().getCommandKeyword_1());
            		
            // InternalXercise.g:1952:3: ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) ) ) )? )
            // InternalXercise.g:1953:4: ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) ) ) )?
            {
            // InternalXercise.g:1953:4: ( (lv_elementId_2_0= ruleQName ) )
            // InternalXercise.g:1954:5: (lv_elementId_2_0= ruleQName )
            {
            // InternalXercise.g:1954:5: (lv_elementId_2_0= ruleQName )
            // InternalXercise.g:1955:6: lv_elementId_2_0= ruleQName
            {

            						newCompositeNode(grammarAccess.getCommandExecutionAnswerAccess().getElementIdQNameParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_29);
            lv_elementId_2_0=ruleQName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCommandExecutionAnswerRule());
            						}
            						set(
            							current,
            							"elementId",
            							lv_elementId_2_0,
            							"no.hal.learning.exercise.xtext.Xercise.QName");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalXercise.g:1972:4: (otherlv_3= '#' ( ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXercise.g:1973:5: otherlv_3= '#' ( ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_32); 

                    					newLeafNode(otherlv_3, grammarAccess.getCommandExecutionAnswerAccess().getNumberSignKeyword_2_1_0());
                    				
                    // InternalXercise.g:1977:5: ( ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) ) )
                    // InternalXercise.g:1978:6: ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) )
                    {
                    // InternalXercise.g:1978:6: ( (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' ) )
                    // InternalXercise.g:1979:7: (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' )
                    {
                    // InternalXercise.g:1979:7: (lv_action_4_1= 'executeSuccess' | lv_action_4_2= 'executeFailure' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==45) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==46) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalXercise.g:1980:8: lv_action_4_1= 'executeSuccess'
                            {
                            lv_action_4_1=(Token)match(input,45,FOLLOW_2); 

                            								newLeafNode(lv_action_4_1, grammarAccess.getCommandExecutionAnswerAccess().getActionExecuteSuccessKeyword_2_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCommandExecutionAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalXercise.g:1991:8: lv_action_4_2= 'executeFailure'
                            {
                            lv_action_4_2=(Token)match(input,46,FOLLOW_2); 

                            								newLeafNode(lv_action_4_2, grammarAccess.getCommandExecutionAnswerAccess().getActionExecuteFailureKeyword_2_1_1_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCommandExecutionAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_2, null);
                            							

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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandExecutionAnswer"


    // $ANTLR start "entryRuleDebugEventAnswer"
    // InternalXercise.g:2010:1: entryRuleDebugEventAnswer returns [EObject current=null] : iv_ruleDebugEventAnswer= ruleDebugEventAnswer EOF ;
    public final EObject entryRuleDebugEventAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDebugEventAnswer = null;


        try {
            // InternalXercise.g:2010:57: (iv_ruleDebugEventAnswer= ruleDebugEventAnswer EOF )
            // InternalXercise.g:2011:2: iv_ruleDebugEventAnswer= ruleDebugEventAnswer EOF
            {
             newCompositeNode(grammarAccess.getDebugEventAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDebugEventAnswer=ruleDebugEventAnswer();

            state._fsp--;

             current =iv_ruleDebugEventAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDebugEventAnswer"


    // $ANTLR start "ruleDebugEventAnswer"
    // InternalXercise.g:2017:1: ruleDebugEventAnswer returns [EObject current=null] : ( () otherlv_1= 'debug' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) ) ) )? ) ) ;
    public final EObject ruleDebugEventAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_action_4_1=null;
        Token lv_action_4_2=null;
        Token lv_action_4_3=null;
        Token lv_action_4_4=null;
        Token lv_action_4_5=null;
        Token lv_action_4_6=null;
        Token lv_action_4_7=null;
        Token lv_action_4_8=null;
        Token lv_action_4_9=null;
        Token lv_action_4_10=null;
        AntlrDatatypeRuleToken lv_elementId_2_0 = null;



        	enterRule();

        try {
            // InternalXercise.g:2023:2: ( ( () otherlv_1= 'debug' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) ) ) )? ) ) )
            // InternalXercise.g:2024:2: ( () otherlv_1= 'debug' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) ) ) )? ) )
            {
            // InternalXercise.g:2024:2: ( () otherlv_1= 'debug' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) ) ) )? ) )
            // InternalXercise.g:2025:3: () otherlv_1= 'debug' ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) ) ) )? )
            {
            // InternalXercise.g:2025:3: ()
            // InternalXercise.g:2026:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDebugEventAnswerAccess().getDebugEventAnswerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDebugEventAnswerAccess().getDebugKeyword_1());
            		
            // InternalXercise.g:2036:3: ( ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) ) ) )? )
            // InternalXercise.g:2037:4: ( (lv_elementId_2_0= ruleQName ) ) (otherlv_3= '#' ( ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) ) ) )?
            {
            // InternalXercise.g:2037:4: ( (lv_elementId_2_0= ruleQName ) )
            // InternalXercise.g:2038:5: (lv_elementId_2_0= ruleQName )
            {
            // InternalXercise.g:2038:5: (lv_elementId_2_0= ruleQName )
            // InternalXercise.g:2039:6: lv_elementId_2_0= ruleQName
            {

            						newCompositeNode(grammarAccess.getDebugEventAnswerAccess().getElementIdQNameParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_29);
            lv_elementId_2_0=ruleQName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDebugEventAnswerRule());
            						}
            						set(
            							current,
            							"elementId",
            							lv_elementId_2_0,
            							"no.hal.learning.exercise.xtext.Xercise.QName");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalXercise.g:2056:4: (otherlv_3= '#' ( ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXercise.g:2057:5: otherlv_3= '#' ( ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_33); 

                    					newLeafNode(otherlv_3, grammarAccess.getDebugEventAnswerAccess().getNumberSignKeyword_2_1_0());
                    				
                    // InternalXercise.g:2061:5: ( ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) ) )
                    // InternalXercise.g:2062:6: ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) )
                    {
                    // InternalXercise.g:2062:6: ( (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' ) )
                    // InternalXercise.g:2063:7: (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' )
                    {
                    // InternalXercise.g:2063:7: (lv_action_4_1= 'create' | lv_action_4_2= 'terminate' | lv_action_4_3= 'resume' | lv_action_4_4= 'suspend' | lv_action_4_5= 'stepInto' | lv_action_4_6= 'stepOver' | lv_action_4_7= 'stepReturn' | lv_action_4_8= 'stepEnd' | lv_action_4_9= 'breakpoint' | lv_action_4_10= 'evaluation' )
                    int alt40=10;
                    switch ( input.LA(1) ) {
                    case 48:
                        {
                        alt40=1;
                        }
                        break;
                    case 49:
                        {
                        alt40=2;
                        }
                        break;
                    case 50:
                        {
                        alt40=3;
                        }
                        break;
                    case 51:
                        {
                        alt40=4;
                        }
                        break;
                    case 52:
                        {
                        alt40=5;
                        }
                        break;
                    case 53:
                        {
                        alt40=6;
                        }
                        break;
                    case 54:
                        {
                        alt40=7;
                        }
                        break;
                    case 55:
                        {
                        alt40=8;
                        }
                        break;
                    case 56:
                        {
                        alt40=9;
                        }
                        break;
                    case 57:
                        {
                        alt40=10;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // InternalXercise.g:2064:8: lv_action_4_1= 'create'
                            {
                            lv_action_4_1=(Token)match(input,48,FOLLOW_2); 

                            								newLeafNode(lv_action_4_1, grammarAccess.getDebugEventAnswerAccess().getActionCreateKeyword_2_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDebugEventAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalXercise.g:2075:8: lv_action_4_2= 'terminate'
                            {
                            lv_action_4_2=(Token)match(input,49,FOLLOW_2); 

                            								newLeafNode(lv_action_4_2, grammarAccess.getDebugEventAnswerAccess().getActionTerminateKeyword_2_1_1_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDebugEventAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_2, null);
                            							

                            }
                            break;
                        case 3 :
                            // InternalXercise.g:2086:8: lv_action_4_3= 'resume'
                            {
                            lv_action_4_3=(Token)match(input,50,FOLLOW_2); 

                            								newLeafNode(lv_action_4_3, grammarAccess.getDebugEventAnswerAccess().getActionResumeKeyword_2_1_1_0_2());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDebugEventAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_3, null);
                            							

                            }
                            break;
                        case 4 :
                            // InternalXercise.g:2097:8: lv_action_4_4= 'suspend'
                            {
                            lv_action_4_4=(Token)match(input,51,FOLLOW_2); 

                            								newLeafNode(lv_action_4_4, grammarAccess.getDebugEventAnswerAccess().getActionSuspendKeyword_2_1_1_0_3());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDebugEventAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_4, null);
                            							

                            }
                            break;
                        case 5 :
                            // InternalXercise.g:2108:8: lv_action_4_5= 'stepInto'
                            {
                            lv_action_4_5=(Token)match(input,52,FOLLOW_2); 

                            								newLeafNode(lv_action_4_5, grammarAccess.getDebugEventAnswerAccess().getActionStepIntoKeyword_2_1_1_0_4());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDebugEventAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_5, null);
                            							

                            }
                            break;
                        case 6 :
                            // InternalXercise.g:2119:8: lv_action_4_6= 'stepOver'
                            {
                            lv_action_4_6=(Token)match(input,53,FOLLOW_2); 

                            								newLeafNode(lv_action_4_6, grammarAccess.getDebugEventAnswerAccess().getActionStepOverKeyword_2_1_1_0_5());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDebugEventAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_6, null);
                            							

                            }
                            break;
                        case 7 :
                            // InternalXercise.g:2130:8: lv_action_4_7= 'stepReturn'
                            {
                            lv_action_4_7=(Token)match(input,54,FOLLOW_2); 

                            								newLeafNode(lv_action_4_7, grammarAccess.getDebugEventAnswerAccess().getActionStepReturnKeyword_2_1_1_0_6());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDebugEventAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_7, null);
                            							

                            }
                            break;
                        case 8 :
                            // InternalXercise.g:2141:8: lv_action_4_8= 'stepEnd'
                            {
                            lv_action_4_8=(Token)match(input,55,FOLLOW_2); 

                            								newLeafNode(lv_action_4_8, grammarAccess.getDebugEventAnswerAccess().getActionStepEndKeyword_2_1_1_0_7());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDebugEventAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_8, null);
                            							

                            }
                            break;
                        case 9 :
                            // InternalXercise.g:2152:8: lv_action_4_9= 'breakpoint'
                            {
                            lv_action_4_9=(Token)match(input,56,FOLLOW_2); 

                            								newLeafNode(lv_action_4_9, grammarAccess.getDebugEventAnswerAccess().getActionBreakpointKeyword_2_1_1_0_8());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDebugEventAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_9, null);
                            							

                            }
                            break;
                        case 10 :
                            // InternalXercise.g:2163:8: lv_action_4_10= 'evaluation'
                            {
                            lv_action_4_10=(Token)match(input,57,FOLLOW_2); 

                            								newLeafNode(lv_action_4_10, grammarAccess.getDebugEventAnswerAccess().getActionEvaluationKeyword_2_1_1_0_9());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getDebugEventAnswerRule());
                            								}
                            								setWithLastConsumed(current, "action", lv_action_4_10, null);
                            							

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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDebugEventAnswer"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\4\4\uffff\1\5\1\4\1\5\1\4";
    static final String dfa_3s = "\3\4\3\uffff\1\5\4\4";
    static final String dfa_4s = "\1\16\1\15\1\57\3\uffff\1\16\1\45\3\57";
    static final String dfa_5s = "\3\uffff\2\1\1\2\5\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1\7\uffff\1\3\1\5",
            "\1\2\7\uffff\1\4\1\3",
            "\1\5\1\uffff\1\5\6\uffff\1\6\2\uffff\1\5\1\uffff\6\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5\7\uffff\1\5\2\uffff\1\5",
            "",
            "",
            "",
            "\1\7\10\uffff\1\4",
            "\1\10\1\5\6\uffff\1\5\1\uffff\1\5\26\uffff\1\5",
            "\1\11\1\4\1\5\6\uffff\1\6\1\4\1\uffff\1\5\1\uffff\6\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5\7\uffff\1\5\2\uffff\1\5",
            "\1\12\1\5\1\4\6\uffff\1\4\2\5\1\4\1\uffff\6\4\1\uffff\3\4\1\uffff\1\4\3\uffff\1\4\2\uffff\1\4\7\uffff\1\4\2\uffff\1\4",
            "\1\11\1\4\1\5\6\uffff\1\6\2\4\1\5\1\uffff\6\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5\7\uffff\1\5\2\uffff\1\5"
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
            return "90:3: ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractExercisePart ) )* ) | ( (lv_parts_5_0= ruleAnonymousExercisePart ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000090122EFD2050L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000003D0050L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006C00002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000EC00002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000F4000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x03FF000000000000L});

}