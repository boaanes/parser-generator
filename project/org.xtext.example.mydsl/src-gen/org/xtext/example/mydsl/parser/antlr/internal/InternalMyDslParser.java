package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':='", "'|'", "'terminal'", "'non-terminal'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Syntax";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSyntax"
    // InternalMyDsl.g:64:1: entryRuleSyntax returns [EObject current=null] : iv_ruleSyntax= ruleSyntax EOF ;
    public final EObject entryRuleSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntax = null;


        try {
            // InternalMyDsl.g:64:47: (iv_ruleSyntax= ruleSyntax EOF )
            // InternalMyDsl.g:65:2: iv_ruleSyntax= ruleSyntax EOF
            {
             newCompositeNode(grammarAccess.getSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSyntax=ruleSyntax();

            state._fsp--;

             current =iv_ruleSyntax; 
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
    // $ANTLR end "entryRuleSyntax"


    // $ANTLR start "ruleSyntax"
    // InternalMyDsl.g:71:1: ruleSyntax returns [EObject current=null] : ( (lv_elements_0_0= ruleRule ) )* ;
    public final EObject ruleSyntax() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_elements_0_0= ruleRule ) )* )
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleRule ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleRule )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleRule )
            	    // InternalMyDsl.g:80:4: lv_elements_0_0= ruleRule
            	    {

            	    				newCompositeNode(grammarAccess.getSyntaxAccess().getElementsRuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleRule();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSyntaxRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Rule");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleSyntax"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:100:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // InternalMyDsl.g:100:44: (iv_ruleRule= ruleRule EOF )
            // InternalMyDsl.g:101:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule.getText(); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:107:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Left_0= ruleLeft kw= ':=' this_Right_2= ruleRight ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Left_0 = null;

        AntlrDatatypeRuleToken this_Right_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Left_0= ruleLeft kw= ':=' this_Right_2= ruleRight ) )
            // InternalMyDsl.g:114:2: (this_Left_0= ruleLeft kw= ':=' this_Right_2= ruleRight )
            {
            // InternalMyDsl.g:114:2: (this_Left_0= ruleLeft kw= ':=' this_Right_2= ruleRight )
            // InternalMyDsl.g:115:3: this_Left_0= ruleLeft kw= ':=' this_Right_2= ruleRight
            {

            			newCompositeNode(grammarAccess.getRuleAccess().getLeftParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_Left_0=ruleLeft();

            state._fsp--;


            			current.merge(this_Left_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,11,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRuleAccess().getColonEqualsSignKeyword_1());
            		

            			newCompositeNode(grammarAccess.getRuleAccess().getRightParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_Right_2=ruleRight();

            state._fsp--;


            			current.merge(this_Right_2);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleLeft"
    // InternalMyDsl.g:144:1: entryRuleLeft returns [String current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final String entryRuleLeft() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeft = null;


        try {
            // InternalMyDsl.g:144:44: (iv_ruleLeft= ruleLeft EOF )
            // InternalMyDsl.g:145:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft.getText(); 
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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalMyDsl.g:151:1: ruleLeft returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NonTerminal_0= ruleNonTerminal ;
    public final AntlrDatatypeRuleToken ruleLeft() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NonTerminal_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:157:2: (this_NonTerminal_0= ruleNonTerminal )
            // InternalMyDsl.g:158:2: this_NonTerminal_0= ruleNonTerminal
            {

            		newCompositeNode(grammarAccess.getLeftAccess().getNonTerminalParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_NonTerminal_0=ruleNonTerminal();

            state._fsp--;


            		current.merge(this_NonTerminal_0);
            	

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // InternalMyDsl.g:171:1: entryRuleRight returns [String current=null] : iv_ruleRight= ruleRight EOF ;
    public final String entryRuleRight() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRight = null;


        try {
            // InternalMyDsl.g:171:45: (iv_ruleRight= ruleRight EOF )
            // InternalMyDsl.g:172:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight.getText(); 
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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalMyDsl.g:178:1: ruleRight returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Alternative_0= ruleAlternative (this_RAlternative_1= ruleRAlternative )* ) ;
    public final AntlrDatatypeRuleToken ruleRight() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Alternative_0 = null;

        AntlrDatatypeRuleToken this_RAlternative_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:184:2: ( (this_Alternative_0= ruleAlternative (this_RAlternative_1= ruleRAlternative )* ) )
            // InternalMyDsl.g:185:2: (this_Alternative_0= ruleAlternative (this_RAlternative_1= ruleRAlternative )* )
            {
            // InternalMyDsl.g:185:2: (this_Alternative_0= ruleAlternative (this_RAlternative_1= ruleRAlternative )* )
            // InternalMyDsl.g:186:3: this_Alternative_0= ruleAlternative (this_RAlternative_1= ruleRAlternative )*
            {

            			newCompositeNode(grammarAccess.getRightAccess().getAlternativeParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Alternative_0=ruleAlternative();

            state._fsp--;


            			current.merge(this_Alternative_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:196:3: (this_RAlternative_1= ruleRAlternative )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:197:4: this_RAlternative_1= ruleRAlternative
            	    {

            	    				newCompositeNode(grammarAccess.getRightAccess().getRAlternativeParserRuleCall_1());
            	    			
            	    pushFollow(FOLLOW_6);
            	    this_RAlternative_1=ruleRAlternative();

            	    state._fsp--;


            	    				current.merge(this_RAlternative_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleRAlternative"
    // InternalMyDsl.g:212:1: entryRuleRAlternative returns [String current=null] : iv_ruleRAlternative= ruleRAlternative EOF ;
    public final String entryRuleRAlternative() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRAlternative = null;


        try {
            // InternalMyDsl.g:212:52: (iv_ruleRAlternative= ruleRAlternative EOF )
            // InternalMyDsl.g:213:2: iv_ruleRAlternative= ruleRAlternative EOF
            {
             newCompositeNode(grammarAccess.getRAlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRAlternative=ruleRAlternative();

            state._fsp--;

             current =iv_ruleRAlternative.getText(); 
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
    // $ANTLR end "entryRuleRAlternative"


    // $ANTLR start "ruleRAlternative"
    // InternalMyDsl.g:219:1: ruleRAlternative returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '|' this_Alternative_1= ruleAlternative ) ;
    public final AntlrDatatypeRuleToken ruleRAlternative() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Alternative_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:225:2: ( (kw= '|' this_Alternative_1= ruleAlternative ) )
            // InternalMyDsl.g:226:2: (kw= '|' this_Alternative_1= ruleAlternative )
            {
            // InternalMyDsl.g:226:2: (kw= '|' this_Alternative_1= ruleAlternative )
            // InternalMyDsl.g:227:3: kw= '|' this_Alternative_1= ruleAlternative
            {
            kw=(Token)match(input,12,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRAlternativeAccess().getVerticalLineKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRAlternativeAccess().getAlternativeParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Alternative_1=ruleAlternative();

            state._fsp--;


            			current.merge(this_Alternative_1);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleRAlternative"


    // $ANTLR start "entryRuleAlternative"
    // InternalMyDsl.g:246:1: entryRuleAlternative returns [String current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final String entryRuleAlternative() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlternative = null;


        try {
            // InternalMyDsl.g:246:51: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalMyDsl.g:247:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative.getText(); 
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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalMyDsl.g:253:1: ruleAlternative returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonTerminal_0= ruleNonTerminal | this_Terminal_1= ruleTerminal )+ ;
    public final AntlrDatatypeRuleToken ruleAlternative() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NonTerminal_0 = null;

        AntlrDatatypeRuleToken this_Terminal_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:259:2: ( (this_NonTerminal_0= ruleNonTerminal | this_Terminal_1= ruleTerminal )+ )
            // InternalMyDsl.g:260:2: (this_NonTerminal_0= ruleNonTerminal | this_Terminal_1= ruleTerminal )+
            {
            // InternalMyDsl.g:260:2: (this_NonTerminal_0= ruleNonTerminal | this_Terminal_1= ruleTerminal )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) ) {
                        int LA3_4 = input.LA(3);

                        if ( (LA3_4==EOF||(LA3_4>=12 && LA3_4<=14)) ) {
                            alt3=1;
                        }


                    }


                }
                else if ( (LA3_0==13) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:261:3: this_NonTerminal_0= ruleNonTerminal
            	    {

            	    			newCompositeNode(grammarAccess.getAlternativeAccess().getNonTerminalParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_7);
            	    this_NonTerminal_0=ruleNonTerminal();

            	    state._fsp--;


            	    			current.merge(this_NonTerminal_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:272:3: this_Terminal_1= ruleTerminal
            	    {

            	    			newCompositeNode(grammarAccess.getAlternativeAccess().getTerminalParserRuleCall_1());
            	    		
            	    pushFollow(FOLLOW_7);
            	    this_Terminal_1=ruleTerminal();

            	    state._fsp--;


            	    			current.merge(this_Terminal_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleTerminal"
    // InternalMyDsl.g:286:1: entryRuleTerminal returns [String current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final String entryRuleTerminal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTerminal = null;


        try {
            // InternalMyDsl.g:286:48: (iv_ruleTerminal= ruleTerminal EOF )
            // InternalMyDsl.g:287:2: iv_ruleTerminal= ruleTerminal EOF
            {
             newCompositeNode(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminal=ruleTerminal();

            state._fsp--;

             current =iv_ruleTerminal.getText(); 
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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalMyDsl.g:293:1: ruleTerminal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'terminal' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleTerminal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:299:2: ( (kw= 'terminal' this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:300:2: (kw= 'terminal' this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:300:2: (kw= 'terminal' this_ID_1= RULE_ID )
            // InternalMyDsl.g:301:3: kw= 'terminal' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,13,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTerminalAccess().getTerminalKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getTerminalAccess().getIDTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalMyDsl.g:317:1: entryRuleNonTerminal returns [String current=null] : iv_ruleNonTerminal= ruleNonTerminal EOF ;
    public final String entryRuleNonTerminal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonTerminal = null;


        try {
            // InternalMyDsl.g:317:51: (iv_ruleNonTerminal= ruleNonTerminal EOF )
            // InternalMyDsl.g:318:2: iv_ruleNonTerminal= ruleNonTerminal EOF
            {
             newCompositeNode(grammarAccess.getNonTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonTerminal=ruleNonTerminal();

            state._fsp--;

             current =iv_ruleNonTerminal.getText(); 
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
    // $ANTLR end "entryRuleNonTerminal"


    // $ANTLR start "ruleNonTerminal"
    // InternalMyDsl.g:324:1: ruleNonTerminal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'non-terminal' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleNonTerminal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:330:2: ( (kw= 'non-terminal' this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:331:2: (kw= 'non-terminal' this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:331:2: (kw= 'non-terminal' this_ID_1= RULE_ID )
            // InternalMyDsl.g:332:3: kw= 'non-terminal' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,14,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNonTerminalAccess().getNonTerminalKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getNonTerminalAccess().getIDTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleNonTerminal"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});

}