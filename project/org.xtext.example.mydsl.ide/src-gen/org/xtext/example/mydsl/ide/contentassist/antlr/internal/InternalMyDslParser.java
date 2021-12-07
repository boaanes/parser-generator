package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSyntax"
    // InternalMyDsl.g:53:1: entryRuleSyntax : ruleSyntax EOF ;
    public final void entryRuleSyntax() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleSyntax EOF )
            // InternalMyDsl.g:55:1: ruleSyntax EOF
            {
             before(grammarAccess.getSyntaxRule()); 
            pushFollow(FOLLOW_1);
            ruleSyntax();

            state._fsp--;

             after(grammarAccess.getSyntaxRule()); 
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
    // $ANTLR end "entryRuleSyntax"


    // $ANTLR start "ruleSyntax"
    // InternalMyDsl.g:62:1: ruleSyntax : ( ( rule__Syntax__ElementsAssignment )* ) ;
    public final void ruleSyntax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Syntax__ElementsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Syntax__ElementsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Syntax__ElementsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Syntax__ElementsAssignment )*
            {
             before(grammarAccess.getSyntaxAccess().getElementsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Syntax__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Syntax__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Syntax__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSyntaxAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSyntax"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:78:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleRule EOF )
            // InternalMyDsl.g:80:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:87:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Rule__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Rule__Group__0 )
            // InternalMyDsl.g:94:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleLeft"
    // InternalMyDsl.g:103:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleLeft EOF )
            // InternalMyDsl.g:105:1: ruleLeft EOF
            {
             before(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getLeftRule()); 
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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalMyDsl.g:112:1: ruleLeft : ( ruleNonTerminal ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ruleNonTerminal ) )
            // InternalMyDsl.g:117:2: ( ruleNonTerminal )
            {
            // InternalMyDsl.g:117:2: ( ruleNonTerminal )
            // InternalMyDsl.g:118:3: ruleNonTerminal
            {
             before(grammarAccess.getLeftAccess().getNonTerminalParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getLeftAccess().getNonTerminalParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // InternalMyDsl.g:128:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRight EOF )
            // InternalMyDsl.g:130:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalMyDsl.g:137:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Right__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Right__Group__0 )
            // InternalMyDsl.g:144:4: rule__Right__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleRAlternative"
    // InternalMyDsl.g:153:1: entryRuleRAlternative : ruleRAlternative EOF ;
    public final void entryRuleRAlternative() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleRAlternative EOF )
            // InternalMyDsl.g:155:1: ruleRAlternative EOF
            {
             before(grammarAccess.getRAlternativeRule()); 
            pushFollow(FOLLOW_1);
            ruleRAlternative();

            state._fsp--;

             after(grammarAccess.getRAlternativeRule()); 
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
    // $ANTLR end "entryRuleRAlternative"


    // $ANTLR start "ruleRAlternative"
    // InternalMyDsl.g:162:1: ruleRAlternative : ( ( rule__RAlternative__Group__0 ) ) ;
    public final void ruleRAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__RAlternative__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__RAlternative__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__RAlternative__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__RAlternative__Group__0 )
            {
             before(grammarAccess.getRAlternativeAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__RAlternative__Group__0 )
            // InternalMyDsl.g:169:4: rule__RAlternative__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RAlternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRAlternativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRAlternative"


    // $ANTLR start "entryRuleAlternative"
    // InternalMyDsl.g:178:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAlternative EOF )
            // InternalMyDsl.g:180:1: ruleAlternative EOF
            {
             before(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getAlternativeRule()); 
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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalMyDsl.g:187:1: ruleAlternative : ( ( ( rule__Alternative__Alternatives ) ) ( ( rule__Alternative__Alternatives )* ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( ( rule__Alternative__Alternatives ) ) ( ( rule__Alternative__Alternatives )* ) ) )
            // InternalMyDsl.g:192:2: ( ( ( rule__Alternative__Alternatives ) ) ( ( rule__Alternative__Alternatives )* ) )
            {
            // InternalMyDsl.g:192:2: ( ( ( rule__Alternative__Alternatives ) ) ( ( rule__Alternative__Alternatives )* ) )
            // InternalMyDsl.g:193:3: ( ( rule__Alternative__Alternatives ) ) ( ( rule__Alternative__Alternatives )* )
            {
            // InternalMyDsl.g:193:3: ( ( rule__Alternative__Alternatives ) )
            // InternalMyDsl.g:194:4: ( rule__Alternative__Alternatives )
            {
             before(grammarAccess.getAlternativeAccess().getAlternatives()); 
            // InternalMyDsl.g:195:4: ( rule__Alternative__Alternatives )
            // InternalMyDsl.g:195:5: rule__Alternative__Alternatives
            {
            pushFollow(FOLLOW_4);
            rule__Alternative__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getAlternatives()); 

            }

            // InternalMyDsl.g:198:3: ( ( rule__Alternative__Alternatives )* )
            // InternalMyDsl.g:199:4: ( rule__Alternative__Alternatives )*
            {
             before(grammarAccess.getAlternativeAccess().getAlternatives()); 
            // InternalMyDsl.g:200:4: ( rule__Alternative__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_ID) ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==EOF||(LA2_4>=12 && LA2_4<=14)) ) {
                            alt2=1;
                        }


                    }


                }
                else if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:200:5: rule__Alternative__Alternatives
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Alternative__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAlternativeAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleTerminal"
    // InternalMyDsl.g:210:1: entryRuleTerminal : ruleTerminal EOF ;
    public final void entryRuleTerminal() throws RecognitionException {
        try {
            // InternalMyDsl.g:211:1: ( ruleTerminal EOF )
            // InternalMyDsl.g:212:1: ruleTerminal EOF
            {
             before(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminal();

            state._fsp--;

             after(grammarAccess.getTerminalRule()); 
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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalMyDsl.g:219:1: ruleTerminal : ( ( rule__Terminal__Group__0 ) ) ;
    public final void ruleTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:2: ( ( ( rule__Terminal__Group__0 ) ) )
            // InternalMyDsl.g:224:2: ( ( rule__Terminal__Group__0 ) )
            {
            // InternalMyDsl.g:224:2: ( ( rule__Terminal__Group__0 ) )
            // InternalMyDsl.g:225:3: ( rule__Terminal__Group__0 )
            {
             before(grammarAccess.getTerminalAccess().getGroup()); 
            // InternalMyDsl.g:226:3: ( rule__Terminal__Group__0 )
            // InternalMyDsl.g:226:4: rule__Terminal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleNonTerminal"
    // InternalMyDsl.g:235:1: entryRuleNonTerminal : ruleNonTerminal EOF ;
    public final void entryRuleNonTerminal() throws RecognitionException {
        try {
            // InternalMyDsl.g:236:1: ( ruleNonTerminal EOF )
            // InternalMyDsl.g:237:1: ruleNonTerminal EOF
            {
             before(grammarAccess.getNonTerminalRule()); 
            pushFollow(FOLLOW_1);
            ruleNonTerminal();

            state._fsp--;

             after(grammarAccess.getNonTerminalRule()); 
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
    // $ANTLR end "entryRuleNonTerminal"


    // $ANTLR start "ruleNonTerminal"
    // InternalMyDsl.g:244:1: ruleNonTerminal : ( ( rule__NonTerminal__Group__0 ) ) ;
    public final void ruleNonTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:2: ( ( ( rule__NonTerminal__Group__0 ) ) )
            // InternalMyDsl.g:249:2: ( ( rule__NonTerminal__Group__0 ) )
            {
            // InternalMyDsl.g:249:2: ( ( rule__NonTerminal__Group__0 ) )
            // InternalMyDsl.g:250:3: ( rule__NonTerminal__Group__0 )
            {
             before(grammarAccess.getNonTerminalAccess().getGroup()); 
            // InternalMyDsl.g:251:3: ( rule__NonTerminal__Group__0 )
            // InternalMyDsl.g:251:4: rule__NonTerminal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonTerminalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonTerminal"


    // $ANTLR start "rule__Alternative__Alternatives"
    // InternalMyDsl.g:259:1: rule__Alternative__Alternatives : ( ( ruleNonTerminal ) | ( ruleTerminal ) );
    public final void rule__Alternative__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:263:1: ( ( ruleNonTerminal ) | ( ruleTerminal ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:264:2: ( ruleNonTerminal )
                    {
                    // InternalMyDsl.g:264:2: ( ruleNonTerminal )
                    // InternalMyDsl.g:265:3: ruleNonTerminal
                    {
                     before(grammarAccess.getAlternativeAccess().getNonTerminalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNonTerminal();

                    state._fsp--;

                     after(grammarAccess.getAlternativeAccess().getNonTerminalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:270:2: ( ruleTerminal )
                    {
                    // InternalMyDsl.g:270:2: ( ruleTerminal )
                    // InternalMyDsl.g:271:3: ruleTerminal
                    {
                     before(grammarAccess.getAlternativeAccess().getTerminalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTerminal();

                    state._fsp--;

                     after(grammarAccess.getAlternativeAccess().getTerminalParserRuleCall_1()); 

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
    // $ANTLR end "rule__Alternative__Alternatives"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMyDsl.g:280:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:284:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMyDsl.g:285:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalMyDsl.g:292:1: rule__Rule__Group__0__Impl : ( ruleLeft ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:296:1: ( ( ruleLeft ) )
            // InternalMyDsl.g:297:1: ( ruleLeft )
            {
            // InternalMyDsl.g:297:1: ( ruleLeft )
            // InternalMyDsl.g:298:2: ruleLeft
            {
             before(grammarAccess.getRuleAccess().getLeftParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getLeftParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalMyDsl.g:307:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:311:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMyDsl.g:312:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalMyDsl.g:319:1: rule__Rule__Group__1__Impl : ( ':=' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:1: ( ( ':=' ) )
            // InternalMyDsl.g:324:1: ( ':=' )
            {
            // InternalMyDsl.g:324:1: ( ':=' )
            // InternalMyDsl.g:325:2: ':='
            {
             before(grammarAccess.getRuleAccess().getColonEqualsSignKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalMyDsl.g:334:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:338:1: ( rule__Rule__Group__2__Impl )
            // InternalMyDsl.g:339:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalMyDsl.g:345:1: rule__Rule__Group__2__Impl : ( ruleRight ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:349:1: ( ( ruleRight ) )
            // InternalMyDsl.g:350:1: ( ruleRight )
            {
            // InternalMyDsl.g:350:1: ( ruleRight )
            // InternalMyDsl.g:351:2: ruleRight
            {
             before(grammarAccess.getRuleAccess().getRightParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRightParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Right__Group__0"
    // InternalMyDsl.g:361:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:365:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalMyDsl.g:366:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Right__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__1();

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
    // $ANTLR end "rule__Right__Group__0"


    // $ANTLR start "rule__Right__Group__0__Impl"
    // InternalMyDsl.g:373:1: rule__Right__Group__0__Impl : ( ruleAlternative ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:377:1: ( ( ruleAlternative ) )
            // InternalMyDsl.g:378:1: ( ruleAlternative )
            {
            // InternalMyDsl.g:378:1: ( ruleAlternative )
            // InternalMyDsl.g:379:2: ruleAlternative
            {
             before(grammarAccess.getRightAccess().getAlternativeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getRightAccess().getAlternativeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__0__Impl"


    // $ANTLR start "rule__Right__Group__1"
    // InternalMyDsl.g:388:1: rule__Right__Group__1 : rule__Right__Group__1__Impl ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:392:1: ( rule__Right__Group__1__Impl )
            // InternalMyDsl.g:393:2: rule__Right__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__1__Impl();

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
    // $ANTLR end "rule__Right__Group__1"


    // $ANTLR start "rule__Right__Group__1__Impl"
    // InternalMyDsl.g:399:1: rule__Right__Group__1__Impl : ( ( ruleRAlternative )* ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:403:1: ( ( ( ruleRAlternative )* ) )
            // InternalMyDsl.g:404:1: ( ( ruleRAlternative )* )
            {
            // InternalMyDsl.g:404:1: ( ( ruleRAlternative )* )
            // InternalMyDsl.g:405:2: ( ruleRAlternative )*
            {
             before(grammarAccess.getRightAccess().getRAlternativeParserRuleCall_1()); 
            // InternalMyDsl.g:406:2: ( ruleRAlternative )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:406:3: ruleRAlternative
            	    {
            	    pushFollow(FOLLOW_8);
            	    ruleRAlternative();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRightAccess().getRAlternativeParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__1__Impl"


    // $ANTLR start "rule__RAlternative__Group__0"
    // InternalMyDsl.g:415:1: rule__RAlternative__Group__0 : rule__RAlternative__Group__0__Impl rule__RAlternative__Group__1 ;
    public final void rule__RAlternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:419:1: ( rule__RAlternative__Group__0__Impl rule__RAlternative__Group__1 )
            // InternalMyDsl.g:420:2: rule__RAlternative__Group__0__Impl rule__RAlternative__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RAlternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RAlternative__Group__1();

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
    // $ANTLR end "rule__RAlternative__Group__0"


    // $ANTLR start "rule__RAlternative__Group__0__Impl"
    // InternalMyDsl.g:427:1: rule__RAlternative__Group__0__Impl : ( '|' ) ;
    public final void rule__RAlternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( '|' ) )
            // InternalMyDsl.g:432:1: ( '|' )
            {
            // InternalMyDsl.g:432:1: ( '|' )
            // InternalMyDsl.g:433:2: '|'
            {
             before(grammarAccess.getRAlternativeAccess().getVerticalLineKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRAlternativeAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAlternative__Group__0__Impl"


    // $ANTLR start "rule__RAlternative__Group__1"
    // InternalMyDsl.g:442:1: rule__RAlternative__Group__1 : rule__RAlternative__Group__1__Impl ;
    public final void rule__RAlternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:446:1: ( rule__RAlternative__Group__1__Impl )
            // InternalMyDsl.g:447:2: rule__RAlternative__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RAlternative__Group__1__Impl();

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
    // $ANTLR end "rule__RAlternative__Group__1"


    // $ANTLR start "rule__RAlternative__Group__1__Impl"
    // InternalMyDsl.g:453:1: rule__RAlternative__Group__1__Impl : ( ruleAlternative ) ;
    public final void rule__RAlternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:1: ( ( ruleAlternative ) )
            // InternalMyDsl.g:458:1: ( ruleAlternative )
            {
            // InternalMyDsl.g:458:1: ( ruleAlternative )
            // InternalMyDsl.g:459:2: ruleAlternative
            {
             before(grammarAccess.getRAlternativeAccess().getAlternativeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getRAlternativeAccess().getAlternativeParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAlternative__Group__1__Impl"


    // $ANTLR start "rule__Terminal__Group__0"
    // InternalMyDsl.g:469:1: rule__Terminal__Group__0 : rule__Terminal__Group__0__Impl rule__Terminal__Group__1 ;
    public final void rule__Terminal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( rule__Terminal__Group__0__Impl rule__Terminal__Group__1 )
            // InternalMyDsl.g:474:2: rule__Terminal__Group__0__Impl rule__Terminal__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Terminal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminal__Group__1();

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
    // $ANTLR end "rule__Terminal__Group__0"


    // $ANTLR start "rule__Terminal__Group__0__Impl"
    // InternalMyDsl.g:481:1: rule__Terminal__Group__0__Impl : ( 'terminal' ) ;
    public final void rule__Terminal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:485:1: ( ( 'terminal' ) )
            // InternalMyDsl.g:486:1: ( 'terminal' )
            {
            // InternalMyDsl.g:486:1: ( 'terminal' )
            // InternalMyDsl.g:487:2: 'terminal'
            {
             before(grammarAccess.getTerminalAccess().getTerminalKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTerminalAccess().getTerminalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group__0__Impl"


    // $ANTLR start "rule__Terminal__Group__1"
    // InternalMyDsl.g:496:1: rule__Terminal__Group__1 : rule__Terminal__Group__1__Impl ;
    public final void rule__Terminal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:500:1: ( rule__Terminal__Group__1__Impl )
            // InternalMyDsl.g:501:2: rule__Terminal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group__1__Impl();

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
    // $ANTLR end "rule__Terminal__Group__1"


    // $ANTLR start "rule__Terminal__Group__1__Impl"
    // InternalMyDsl.g:507:1: rule__Terminal__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Terminal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:512:1: ( RULE_ID )
            {
            // InternalMyDsl.g:512:1: ( RULE_ID )
            // InternalMyDsl.g:513:2: RULE_ID
            {
             before(grammarAccess.getTerminalAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group__1__Impl"


    // $ANTLR start "rule__NonTerminal__Group__0"
    // InternalMyDsl.g:523:1: rule__NonTerminal__Group__0 : rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1 ;
    public final void rule__NonTerminal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:527:1: ( rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1 )
            // InternalMyDsl.g:528:2: rule__NonTerminal__Group__0__Impl rule__NonTerminal__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NonTerminal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__1();

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
    // $ANTLR end "rule__NonTerminal__Group__0"


    // $ANTLR start "rule__NonTerminal__Group__0__Impl"
    // InternalMyDsl.g:535:1: rule__NonTerminal__Group__0__Impl : ( 'non-terminal' ) ;
    public final void rule__NonTerminal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( ( 'non-terminal' ) )
            // InternalMyDsl.g:540:1: ( 'non-terminal' )
            {
            // InternalMyDsl.g:540:1: ( 'non-terminal' )
            // InternalMyDsl.g:541:2: 'non-terminal'
            {
             before(grammarAccess.getNonTerminalAccess().getNonTerminalKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNonTerminalAccess().getNonTerminalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__0__Impl"


    // $ANTLR start "rule__NonTerminal__Group__1"
    // InternalMyDsl.g:550:1: rule__NonTerminal__Group__1 : rule__NonTerminal__Group__1__Impl ;
    public final void rule__NonTerminal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:554:1: ( rule__NonTerminal__Group__1__Impl )
            // InternalMyDsl.g:555:2: rule__NonTerminal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonTerminal__Group__1__Impl();

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
    // $ANTLR end "rule__NonTerminal__Group__1"


    // $ANTLR start "rule__NonTerminal__Group__1__Impl"
    // InternalMyDsl.g:561:1: rule__NonTerminal__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__NonTerminal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:565:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:566:1: ( RULE_ID )
            {
            // InternalMyDsl.g:566:1: ( RULE_ID )
            // InternalMyDsl.g:567:2: RULE_ID
            {
             before(grammarAccess.getNonTerminalAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNonTerminalAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonTerminal__Group__1__Impl"


    // $ANTLR start "rule__Syntax__ElementsAssignment"
    // InternalMyDsl.g:577:1: rule__Syntax__ElementsAssignment : ( ruleRule ) ;
    public final void rule__Syntax__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( ruleRule ) )
            // InternalMyDsl.g:582:2: ( ruleRule )
            {
            // InternalMyDsl.g:582:2: ( ruleRule )
            // InternalMyDsl.g:583:3: ruleRule
            {
             before(grammarAccess.getSyntaxAccess().getElementsRuleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getSyntaxAccess().getElementsRuleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__ElementsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});

}