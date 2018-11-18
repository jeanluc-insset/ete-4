// Generated from fr/upjv/mis/GelParser.g4 by ANTLR 4.7.1
package fr.upjv.mis;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, FloatingPointLiteral=2, BooleanLiteral=3, DateLiteral=4, 
		RegexLiteral=5, CharacterLiteral=6, StringLiteral=7, NullLiteral=8, LPAREN=9, 
		RPAREN=10, START_EXP=11, LBRACE=12, RBRACE=13, LBRACK=14, RBRACK=15, SEMI=16, 
		COMMA=17, DOT=18, ARROW=19, LEFT_ARROW=20, PIPE=21, GT=22, LT=23, NOT=24, 
		TILDE=25, QUESTION=26, COLON=27, DOUBLE_COLON=28, EQUAL=29, LE=30, GE=31, 
		NOTEQUAL=32, AND=33, OR=34, XOR=35, ADD=36, SUB=37, MUL=38, DIV=39, MOD_PERCENT=40, 
		CARET=41, MOD=42, FEATURE=43, BACKGROUND=44, SCENARIO=45, OUTLINE=46, 
		GIVEN=47, WHEN=48, THEN=49, BUT=50, OF=51, Identifier=52, ATPRE=53, ELLIPSIS=54, 
		INITIAL=55, IS=56, NEW=57, THE=58, THIS=59, A=60, WITH=61, TYPE=62, KIND=63, 
		AS=64, ORDERED=65, UNORDERED=66, SEQUENCE=67, BAG=68, SET=69, WS=70, COMMENT=71, 
		LINE_COMMENT=72;
	public static final int
		RULE_gelExpression = 0, RULE_basicExpression = 1, RULE_xorExpression = 2, 
		RULE_orExpression = 3, RULE_andExpression = 4, RULE_notOrNotNotExpression = 5, 
		RULE_notExpression = 6, RULE_affirmativeExpression = 7, RULE_greaterThanExpression = 8, 
		RULE_greaterOrEqualExpression = 9, RULE_lessThanExpression = 10, RULE_lessOrEqualExpression = 11, 
		RULE_compareExpression = 12, RULE_equalExpression = 13, RULE_differentExpression = 14, 
		RULE_addOrSubExpression = 15, RULE_addOrSubHalfExpression = 16, RULE_addExpression = 17, 
		RULE_subExpression = 18, RULE_multOrDivExpression = 19, RULE_multOrDivHalfExpression = 20, 
		RULE_multExpression = 21, RULE_divExpression = 22, RULE_modExpression = 23, 
		RULE_operand = 24, RULE_parenthesisExpression = 25, RULE_navExpression = 26, 
		RULE_rightToLeft = 27, RULE_leftToRight = 28, RULE_ofRightToLeft = 29, 
		RULE_ofLeftToRight = 30, RULE_step = 31, RULE_finalStep = 32, RULE_oclIsNew = 33, 
		RULE_oclIsTypeOf = 34, RULE_oclIsKindOf = 35, RULE_start = 36, RULE_attributeNavExpression = 37, 
		RULE_atPreExpression = 38, RULE_prefixedAtPreExpression = 39, RULE_postfixedAtPreExpression = 40, 
		RULE_asTypeExpression = 41, RULE_methodNavExpression = 42, RULE_collOpExpression = 43, 
		RULE_variableRefExpression = 44, RULE_variableOrMemberAtPre = 45, RULE_functionCall = 46, 
		RULE_variableDeclarationExpression = 47, RULE_typeExpression = 48, RULE_atomicTypeExpression = 49, 
		RULE_sequenceTypeExpression = 50, RULE_bagTypeExpression = 51, RULE_setTypeExpression = 52, 
		RULE_orderedSetTypeExpression = 53, RULE_oppExpression = 54, RULE_selfExpression = 55, 
		RULE_variableReference = 56, RULE_parameterList = 57, RULE_literal = 58, 
		RULE_identifier = 59, RULE_integerLiteral = 60, RULE_floatingPointLiteral = 61, 
		RULE_booleanLiteral = 62, RULE_dateLiteral = 63, RULE_characterLiteral = 64, 
		RULE_stringLiteral = 65, RULE_nullLiteral = 66, RULE_regexLiteral = 67;
	public static final String[] ruleNames = {
		"gelExpression", "basicExpression", "xorExpression", "orExpression", "andExpression", 
		"notOrNotNotExpression", "notExpression", "affirmativeExpression", "greaterThanExpression", 
		"greaterOrEqualExpression", "lessThanExpression", "lessOrEqualExpression", 
		"compareExpression", "equalExpression", "differentExpression", "addOrSubExpression", 
		"addOrSubHalfExpression", "addExpression", "subExpression", "multOrDivExpression", 
		"multOrDivHalfExpression", "multExpression", "divExpression", "modExpression", 
		"operand", "parenthesisExpression", "navExpression", "rightToLeft", "leftToRight", 
		"ofRightToLeft", "ofLeftToRight", "step", "finalStep", "oclIsNew", "oclIsTypeOf", 
		"oclIsKindOf", "start", "attributeNavExpression", "atPreExpression", "prefixedAtPreExpression", 
		"postfixedAtPreExpression", "asTypeExpression", "methodNavExpression", 
		"collOpExpression", "variableRefExpression", "variableOrMemberAtPre", 
		"functionCall", "variableDeclarationExpression", "typeExpression", "atomicTypeExpression", 
		"sequenceTypeExpression", "bagTypeExpression", "setTypeExpression", "orderedSetTypeExpression", 
		"oppExpression", "selfExpression", "variableReference", "parameterList", 
		"literal", "identifier", "integerLiteral", "floatingPointLiteral", "booleanLiteral", 
		"dateLiteral", "characterLiteral", "stringLiteral", "nullLiteral", "regexLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'null'", "'('", "')'", 
		"'#{'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'<-'", 
		"'|'", "'>'", "'<'", "'not'", "'~'", "'?'", "':'", "'::'", "'='", "'<='", 
		"'>='", "'<>'", "'and'", "'or'", "'xor'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'mod'", null, null, null, null, null, null, null, null, 
		null, null, "'@pre'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "DateLiteral", 
		"RegexLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", 
		"RPAREN", "START_EXP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "ARROW", "LEFT_ARROW", "PIPE", "GT", "LT", "NOT", "TILDE", 
		"QUESTION", "COLON", "DOUBLE_COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "XOR", "ADD", "SUB", "MUL", "DIV", "MOD_PERCENT", "CARET", 
		"MOD", "FEATURE", "BACKGROUND", "SCENARIO", "OUTLINE", "GIVEN", "WHEN", 
		"THEN", "BUT", "OF", "Identifier", "ATPRE", "ELLIPSIS", "INITIAL", "IS", 
		"NEW", "THE", "THIS", "A", "WITH", "TYPE", "KIND", "AS", "ORDERED", "UNORDERED", 
		"SEQUENCE", "BAG", "SET", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GelParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GelExpressionContext extends ParserRuleContext {
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public GelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterGelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitGelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitGelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GelExpressionContext gelExpression() throws RecognitionException {
		GelExpressionContext _localctx = new GelExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gelExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			basicExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicExpressionContext extends ParserRuleContext {
		public XorExpressionContext xorExpression() {
			return getRuleContext(XorExpressionContext.class,0);
		}
		public BasicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterBasicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitBasicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitBasicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicExpressionContext basicExpression() throws RecognitionException {
		BasicExpressionContext _localctx = new BasicExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_basicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			xorExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorExpressionContext extends ParserRuleContext {
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(GelParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(GelParser.XOR, i);
		}
		public XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorExpressionContext xorExpression() throws RecognitionException {
		XorExpressionContext _localctx = new XorExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_xorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					orExpression();
					setState(141);
					match(XOR);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(148);
			orExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GelParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GelParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_orExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					andExpression();
					setState(151);
					match(OR);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(158);
			andExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<NotOrNotNotExpressionContext> notOrNotNotExpression() {
			return getRuleContexts(NotOrNotNotExpressionContext.class);
		}
		public NotOrNotNotExpressionContext notOrNotNotExpression(int i) {
			return getRuleContext(NotOrNotNotExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(GelParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GelParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					notOrNotNotExpression();
					setState(161);
					match(AND);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(168);
			notOrNotNotExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotOrNotNotExpressionContext extends ParserRuleContext {
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public AffirmativeExpressionContext affirmativeExpression() {
			return getRuleContext(AffirmativeExpressionContext.class,0);
		}
		public NotOrNotNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOrNotNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterNotOrNotNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitNotOrNotNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitNotOrNotNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOrNotNotExpressionContext notOrNotNotExpression() throws RecognitionException {
		NotOrNotNotExpressionContext _localctx = new NotOrNotNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_notOrNotNotExpression);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				notExpression();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case DateLiteral:
			case RegexLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case SUB:
			case Identifier:
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				affirmativeExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GelParser.NOT, 0); }
		public AffirmativeExpressionContext affirmativeExpression() {
			return getRuleContext(AffirmativeExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(NOT);
			setState(175);
			affirmativeExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffirmativeExpressionContext extends ParserRuleContext {
		public GreaterThanExpressionContext greaterThanExpression() {
			return getRuleContext(GreaterThanExpressionContext.class,0);
		}
		public GreaterOrEqualExpressionContext greaterOrEqualExpression() {
			return getRuleContext(GreaterOrEqualExpressionContext.class,0);
		}
		public LessThanExpressionContext lessThanExpression() {
			return getRuleContext(LessThanExpressionContext.class,0);
		}
		public LessOrEqualExpressionContext lessOrEqualExpression() {
			return getRuleContext(LessOrEqualExpressionContext.class,0);
		}
		public CompareExpressionContext compareExpression() {
			return getRuleContext(CompareExpressionContext.class,0);
		}
		public AffirmativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affirmativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAffirmativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAffirmativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAffirmativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffirmativeExpressionContext affirmativeExpression() throws RecognitionException {
		AffirmativeExpressionContext _localctx = new AffirmativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_affirmativeExpression);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				greaterThanExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				greaterOrEqualExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				lessThanExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				lessOrEqualExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				compareExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreaterThanExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(GelParser.GT, 0); }
		public GreaterThanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitGreaterThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitGreaterThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanExpressionContext greaterThanExpression() throws RecognitionException {
		GreaterThanExpressionContext _localctx = new GreaterThanExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_greaterThanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			compareExpression();
			setState(185);
			match(GT);
			setState(186);
			compareExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreaterOrEqualExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public TerminalNode GE() { return getToken(GelParser.GE, 0); }
		public GreaterOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterGreaterOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitGreaterOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitGreaterOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterOrEqualExpressionContext greaterOrEqualExpression() throws RecognitionException {
		GreaterOrEqualExpressionContext _localctx = new GreaterOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_greaterOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			compareExpression();
			setState(189);
			match(GE);
			setState(190);
			compareExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessThanExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(GelParser.LT, 0); }
		public LessThanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitLessThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitLessThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanExpressionContext lessThanExpression() throws RecognitionException {
		LessThanExpressionContext _localctx = new LessThanExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lessThanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			compareExpression();
			setState(193);
			match(LT);
			setState(194);
			compareExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessOrEqualExpressionContext extends ParserRuleContext {
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(GelParser.LE, 0); }
		public LessOrEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessOrEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterLessOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitLessOrEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitLessOrEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessOrEqualExpressionContext lessOrEqualExpression() throws RecognitionException {
		LessOrEqualExpressionContext _localctx = new LessOrEqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lessOrEqualExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			compareExpression();
			setState(197);
			match(LE);
			setState(198);
			compareExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareExpressionContext extends ParserRuleContext {
		public EqualExpressionContext equalExpression() {
			return getRuleContext(EqualExpressionContext.class,0);
		}
		public DifferentExpressionContext differentExpression() {
			return getRuleContext(DifferentExpressionContext.class,0);
		}
		public AddOrSubExpressionContext addOrSubExpression() {
			return getRuleContext(AddOrSubExpressionContext.class,0);
		}
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compareExpression);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				equalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				differentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				addOrSubExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualExpressionContext extends ParserRuleContext {
		public List<AddOrSubExpressionContext> addOrSubExpression() {
			return getRuleContexts(AddOrSubExpressionContext.class);
		}
		public AddOrSubExpressionContext addOrSubExpression(int i) {
			return getRuleContext(AddOrSubExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(GelParser.EQUAL, 0); }
		public EqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpressionContext equalExpression() throws RecognitionException {
		EqualExpressionContext _localctx = new EqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			addOrSubExpression();
			setState(206);
			match(EQUAL);
			setState(207);
			addOrSubExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DifferentExpressionContext extends ParserRuleContext {
		public List<AddOrSubExpressionContext> addOrSubExpression() {
			return getRuleContexts(AddOrSubExpressionContext.class);
		}
		public AddOrSubExpressionContext addOrSubExpression(int i) {
			return getRuleContext(AddOrSubExpressionContext.class,i);
		}
		public TerminalNode NOTEQUAL() { return getToken(GelParser.NOTEQUAL, 0); }
		public DifferentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterDifferentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitDifferentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitDifferentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DifferentExpressionContext differentExpression() throws RecognitionException {
		DifferentExpressionContext _localctx = new DifferentExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_differentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			addOrSubExpression();
			setState(210);
			match(NOTEQUAL);
			setState(211);
			addOrSubExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOrSubExpressionContext extends ParserRuleContext {
		public MultOrDivExpressionContext multOrDivExpression() {
			return getRuleContext(MultOrDivExpressionContext.class,0);
		}
		public List<AddOrSubHalfExpressionContext> addOrSubHalfExpression() {
			return getRuleContexts(AddOrSubHalfExpressionContext.class);
		}
		public AddOrSubHalfExpressionContext addOrSubHalfExpression(int i) {
			return getRuleContext(AddOrSubHalfExpressionContext.class,i);
		}
		public AddOrSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOrSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAddOrSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAddOrSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAddOrSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOrSubExpressionContext addOrSubExpression() throws RecognitionException {
		AddOrSubExpressionContext _localctx = new AddOrSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_addOrSubExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			multOrDivExpression();
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					addOrSubHalfExpression();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOrSubHalfExpressionContext extends ParserRuleContext {
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public AddOrSubHalfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOrSubHalfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAddOrSubHalfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAddOrSubHalfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAddOrSubHalfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOrSubHalfExpressionContext addOrSubHalfExpression() throws RecognitionException {
		AddOrSubHalfExpressionContext _localctx = new AddOrSubHalfExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addOrSubHalfExpression);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				addExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				subExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExpressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(GelParser.ADD, 0); }
		public MultOrDivExpressionContext multOrDivExpression() {
			return getRuleContext(MultOrDivExpressionContext.class,0);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ADD);
			setState(225);
			multOrDivExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubExpressionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(GelParser.SUB, 0); }
		public MultOrDivExpressionContext multOrDivExpression() {
			return getRuleContext(MultOrDivExpressionContext.class,0);
		}
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_subExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(SUB);
			setState(228);
			multOrDivExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultOrDivExpressionContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<MultOrDivHalfExpressionContext> multOrDivHalfExpression() {
			return getRuleContexts(MultOrDivHalfExpressionContext.class);
		}
		public MultOrDivHalfExpressionContext multOrDivHalfExpression(int i) {
			return getRuleContext(MultOrDivHalfExpressionContext.class,i);
		}
		public MultOrDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOrDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterMultOrDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitMultOrDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitMultOrDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOrDivExpressionContext multOrDivExpression() throws RecognitionException {
		MultOrDivExpressionContext _localctx = new MultOrDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multOrDivExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			operand();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					multOrDivHalfExpression();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultOrDivHalfExpressionContext extends ParserRuleContext {
		public MultExpressionContext multExpression() {
			return getRuleContext(MultExpressionContext.class,0);
		}
		public DivExpressionContext divExpression() {
			return getRuleContext(DivExpressionContext.class,0);
		}
		public ModExpressionContext modExpression() {
			return getRuleContext(ModExpressionContext.class,0);
		}
		public MultOrDivHalfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOrDivHalfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterMultOrDivHalfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitMultOrDivHalfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitMultOrDivHalfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOrDivHalfExpressionContext multOrDivHalfExpression() throws RecognitionException {
		MultOrDivHalfExpressionContext _localctx = new MultOrDivHalfExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multOrDivHalfExpression);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				multExpression();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				divExpression();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				modExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExpressionContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(GelParser.MUL, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(MUL);
			setState(243);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivExpressionContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(GelParser.DIV, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public DivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivExpressionContext divExpression() throws RecognitionException {
		DivExpressionContext _localctx = new DivExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_divExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(DIV);
			setState(246);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModExpressionContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(GelParser.MOD, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ModExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModExpressionContext modExpression() throws RecognitionException {
		ModExpressionContext _localctx = new ModExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(MOD);
			setState(249);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public OppExpressionContext oppExpression() {
			return getRuleContext(OppExpressionContext.class,0);
		}
		public NavExpressionContext navExpression() {
			return getRuleContext(NavExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParenthesisExpressionContext parenthesisExpression() {
			return getRuleContext(ParenthesisExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operand);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				oppExpression();
				}
				break;
			case Identifier:
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				navExpression();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case DateLiteral:
			case RegexLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				parenthesisExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesisExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public ParenthesisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesisExpressionContext parenthesisExpression() throws RecognitionException {
		ParenthesisExpressionContext _localctx = new ParenthesisExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parenthesisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(LPAREN);
			setState(258);
			basicExpression();
			setState(259);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavExpressionContext extends ParserRuleContext {
		public LeftToRightContext leftToRight() {
			return getRuleContext(LeftToRightContext.class,0);
		}
		public NavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavExpressionContext navExpression() throws RecognitionException {
		NavExpressionContext _localctx = new NavExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_navExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			leftToRight();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightToLeftContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public List<OfRightToLeftContext> ofRightToLeft() {
			return getRuleContexts(OfRightToLeftContext.class);
		}
		public OfRightToLeftContext ofRightToLeft(int i) {
			return getRuleContext(OfRightToLeftContext.class,i);
		}
		public FinalStepContext finalStep() {
			return getRuleContext(FinalStepContext.class,0);
		}
		public RightToLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightToLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterRightToLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitRightToLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitRightToLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightToLeftContext rightToLeft() throws RecognitionException {
		RightToLeftContext _localctx = new RightToLeftContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rightToLeft);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					step();
					setState(264);
					ofRightToLeft();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(271);
			start();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(272);
				finalStep();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftToRightContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public List<OfLeftToRightContext> ofLeftToRight() {
			return getRuleContexts(OfLeftToRightContext.class);
		}
		public OfLeftToRightContext ofLeftToRight(int i) {
			return getRuleContext(OfLeftToRightContext.class,i);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public FinalStepContext finalStep() {
			return getRuleContext(FinalStepContext.class,0);
		}
		public LeftToRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftToRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterLeftToRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitLeftToRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitLeftToRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftToRightContext leftToRight() throws RecognitionException {
		LeftToRightContext _localctx = new LeftToRightContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_leftToRight);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			start();
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					ofLeftToRight();
					setState(277);
					step();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(284);
				finalStep();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OfRightToLeftContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(GelParser.OF, 0); }
		public OfRightToLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ofRightToLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOfRightToLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOfRightToLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOfRightToLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OfRightToLeftContext ofRightToLeft() throws RecognitionException {
		OfRightToLeftContext _localctx = new OfRightToLeftContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ofRightToLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(OF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OfLeftToRightContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(GelParser.DOT, 0); }
		public OfLeftToRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ofLeftToRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOfLeftToRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOfLeftToRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOfLeftToRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OfLeftToRightContext ofLeftToRight() throws RecognitionException {
		OfLeftToRightContext _localctx = new OfLeftToRightContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ofLeftToRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepContext extends ParserRuleContext {
		public AttributeNavExpressionContext attributeNavExpression() {
			return getRuleContext(AttributeNavExpressionContext.class,0);
		}
		public AtPreExpressionContext atPreExpression() {
			return getRuleContext(AtPreExpressionContext.class,0);
		}
		public AsTypeExpressionContext asTypeExpression() {
			return getRuleContext(AsTypeExpressionContext.class,0);
		}
		public MethodNavExpressionContext methodNavExpression() {
			return getRuleContext(MethodNavExpressionContext.class,0);
		}
		public CollOpExpressionContext collOpExpression() {
			return getRuleContext(CollOpExpressionContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_step);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				attributeNavExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				atPreExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				asTypeExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				methodNavExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				collOpExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalStepContext extends ParserRuleContext {
		public OclIsNewContext oclIsNew() {
			return getRuleContext(OclIsNewContext.class,0);
		}
		public OclIsTypeOfContext oclIsTypeOf() {
			return getRuleContext(OclIsTypeOfContext.class,0);
		}
		public OclIsKindOfContext oclIsKindOf() {
			return getRuleContext(OclIsKindOfContext.class,0);
		}
		public FinalStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterFinalStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitFinalStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitFinalStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalStepContext finalStep() throws RecognitionException {
		FinalStepContext _localctx = new FinalStepContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_finalStep);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				oclIsNew();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				oclIsTypeOf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				oclIsKindOf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclIsNewContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(GelParser.IS, 0); }
		public TerminalNode NEW() { return getToken(GelParser.NEW, 0); }
		public OclIsNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclIsNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOclIsNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOclIsNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOclIsNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclIsNewContext oclIsNew() throws RecognitionException {
		OclIsNewContext _localctx = new OclIsNewContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_oclIsNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IS);
			setState(304);
			match(NEW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclIsTypeOfContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(GelParser.IS, 0); }
		public TerminalNode OF() { return getToken(GelParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(GelParser.TYPE, 0); }
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public OclIsTypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclIsTypeOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOclIsTypeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOclIsTypeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOclIsTypeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclIsTypeOfContext oclIsTypeOf() throws RecognitionException {
		OclIsTypeOfContext _localctx = new OclIsTypeOfContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_oclIsTypeOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IS);
			setState(307);
			match(OF);
			setState(308);
			match(TYPE);
			setState(309);
			basicExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclIsKindOfContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(GelParser.IS, 0); }
		public TerminalNode OF() { return getToken(GelParser.OF, 0); }
		public TerminalNode KIND() { return getToken(GelParser.KIND, 0); }
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public OclIsKindOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclIsKindOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOclIsKindOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOclIsKindOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOclIsKindOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclIsKindOfContext oclIsKindOf() throws RecognitionException {
		OclIsKindOfContext _localctx = new OclIsKindOfContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_oclIsKindOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IS);
			setState(312);
			match(OF);
			setState(313);
			match(KIND);
			setState(314);
			basicExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public SelfExpressionContext selfExpression() {
			return getRuleContext(SelfExpressionContext.class,0);
		}
		public VariableRefExpressionContext variableRefExpression() {
			return getRuleContext(VariableRefExpressionContext.class,0);
		}
		public VariableOrMemberAtPreContext variableOrMemberAtPre() {
			return getRuleContext(VariableOrMemberAtPreContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_start);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				selfExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				variableRefExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				variableOrMemberAtPre();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNavExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAttributeNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAttributeNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAttributeNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNavExpressionContext attributeNavExpression() throws RecognitionException {
		AttributeNavExpressionContext _localctx = new AttributeNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_attributeNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtPreExpressionContext extends ParserRuleContext {
		public PrefixedAtPreExpressionContext prefixedAtPreExpression() {
			return getRuleContext(PrefixedAtPreExpressionContext.class,0);
		}
		public PostfixedAtPreExpressionContext postfixedAtPreExpression() {
			return getRuleContext(PostfixedAtPreExpressionContext.class,0);
		}
		public AtPreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atPreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAtPreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAtPreExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAtPreExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtPreExpressionContext atPreExpression() throws RecognitionException {
		AtPreExpressionContext _localctx = new AtPreExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_atPreExpression);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				prefixedAtPreExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				postfixedAtPreExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixedAtPreExpressionContext extends ParserRuleContext {
		public TerminalNode INITIAL() { return getToken(GelParser.INITIAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THE() { return getToken(GelParser.THE, 0); }
		public TerminalNode A() { return getToken(GelParser.A, 0); }
		public PrefixedAtPreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedAtPreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterPrefixedAtPreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitPrefixedAtPreExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitPrefixedAtPreExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixedAtPreExpressionContext prefixedAtPreExpression() throws RecognitionException {
		PrefixedAtPreExpressionContext _localctx = new PrefixedAtPreExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_prefixedAtPreExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==THE || _la==A) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(328);
			match(INITIAL);
			setState(329);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixedAtPreExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INITIAL() { return getToken(GelParser.INITIAL, 0); }
		public TerminalNode THE() { return getToken(GelParser.THE, 0); }
		public TerminalNode A() { return getToken(GelParser.A, 0); }
		public PostfixedAtPreExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixedAtPreExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterPostfixedAtPreExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitPostfixedAtPreExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitPostfixedAtPreExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixedAtPreExpressionContext postfixedAtPreExpression() throws RecognitionException {
		PostfixedAtPreExpressionContext _localctx = new PostfixedAtPreExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_postfixedAtPreExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if ( !(_la==THE || _la==A) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(332);
			identifier();
			setState(333);
			match(INITIAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsTypeExpressionContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(GelParser.AS, 0); }
		public TerminalNode TYPE() { return getToken(GelParser.TYPE, 0); }
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public AsTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAsTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAsTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAsTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsTypeExpressionContext asTypeExpression() throws RecognitionException {
		AsTypeExpressionContext _localctx = new AsTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_asTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(AS);
			setState(336);
			match(TYPE);
			setState(337);
			basicExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNavExpressionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OF() { return getToken(GelParser.OF, 0); }
		public MethodNavExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodNavExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterMethodNavExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitMethodNavExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitMethodNavExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNavExpressionContext methodNavExpression() throws RecognitionException {
		MethodNavExpressionContext _localctx = new MethodNavExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_methodNavExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			functionCall();
			setState(340);
			match(OF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollOpExpressionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OF() { return getToken(GelParser.OF, 0); }
		public CollOpExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collOpExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterCollOpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitCollOpExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitCollOpExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollOpExpressionContext collOpExpression() throws RecognitionException {
		CollOpExpressionContext _localctx = new CollOpExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_collOpExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			functionCall();
			setState(343);
			match(OF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableRefExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableRefExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableRefExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterVariableRefExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitVariableRefExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitVariableRefExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableRefExpressionContext variableRefExpression() throws RecognitionException {
		VariableRefExpressionContext _localctx = new VariableRefExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableRefExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableOrMemberAtPreContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ATPRE() { return getToken(GelParser.ATPRE, 0); }
		public VariableOrMemberAtPreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrMemberAtPre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterVariableOrMemberAtPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitVariableOrMemberAtPre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitVariableOrMemberAtPre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrMemberAtPreContext variableOrMemberAtPre() throws RecognitionException {
		VariableOrMemberAtPreContext _localctx = new VariableOrMemberAtPreContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableOrMemberAtPre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			identifier();
			setState(348);
			match(ATPRE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			identifier();
			setState(351);
			match(LPAREN);
			setState(352);
			parameterList();
			setState(353);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GelParser.COLON, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public VariableDeclarationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterVariableDeclarationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitVariableDeclarationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitVariableDeclarationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationExpressionContext variableDeclarationExpression() throws RecognitionException {
		VariableDeclarationExpressionContext _localctx = new VariableDeclarationExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variableDeclarationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			identifier();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(356);
				match(COLON);
				setState(357);
				typeExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeExpressionContext extends ParserRuleContext {
		public AtomicTypeExpressionContext atomicTypeExpression() {
			return getRuleContext(AtomicTypeExpressionContext.class,0);
		}
		public SequenceTypeExpressionContext sequenceTypeExpression() {
			return getRuleContext(SequenceTypeExpressionContext.class,0);
		}
		public BagTypeExpressionContext bagTypeExpression() {
			return getRuleContext(BagTypeExpressionContext.class,0);
		}
		public SetTypeExpressionContext setTypeExpression() {
			return getRuleContext(SetTypeExpressionContext.class,0);
		}
		public OrderedSetTypeExpressionContext orderedSetTypeExpression() {
			return getRuleContext(OrderedSetTypeExpressionContext.class,0);
		}
		public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeExpression);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				atomicTypeExpression();
				}
				break;
			case SEQUENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				sequenceTypeExpression();
				}
				break;
			case BAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				bagTypeExpression();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				setTypeExpression();
				}
				break;
			case ORDERED:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				orderedSetTypeExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicTypeExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GelParser.Identifier, 0); }
		public AtomicTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterAtomicTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitAtomicTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitAtomicTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeExpressionContext atomicTypeExpression() throws RecognitionException {
		AtomicTypeExpressionContext _localctx = new AtomicTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_atomicTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceTypeExpressionContext extends ParserRuleContext {
		public TerminalNode SEQUENCE() { return getToken(GelParser.SEQUENCE, 0); }
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public SequenceTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterSequenceTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitSequenceTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitSequenceTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceTypeExpressionContext sequenceTypeExpression() throws RecognitionException {
		SequenceTypeExpressionContext _localctx = new SequenceTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_sequenceTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(SEQUENCE);
			setState(370);
			match(LPAREN);
			setState(371);
			typeExpression();
			setState(372);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BagTypeExpressionContext extends ParserRuleContext {
		public TerminalNode BAG() { return getToken(GelParser.BAG, 0); }
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public BagTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bagTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterBagTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitBagTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitBagTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BagTypeExpressionContext bagTypeExpression() throws RecognitionException {
		BagTypeExpressionContext _localctx = new BagTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_bagTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(BAG);
			setState(375);
			match(LPAREN);
			setState(376);
			typeExpression();
			setState(377);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTypeExpressionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(GelParser.SET, 0); }
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public SetTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterSetTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitSetTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitSetTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeExpressionContext setTypeExpression() throws RecognitionException {
		SetTypeExpressionContext _localctx = new SetTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_setTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(SET);
			setState(380);
			match(LPAREN);
			setState(381);
			typeExpression();
			setState(382);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedSetTypeExpressionContext extends ParserRuleContext {
		public TerminalNode ORDERED() { return getToken(GelParser.ORDERED, 0); }
		public TerminalNode SET() { return getToken(GelParser.SET, 0); }
		public TerminalNode LPAREN() { return getToken(GelParser.LPAREN, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GelParser.RPAREN, 0); }
		public OrderedSetTypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedSetTypeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOrderedSetTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOrderedSetTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOrderedSetTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedSetTypeExpressionContext orderedSetTypeExpression() throws RecognitionException {
		OrderedSetTypeExpressionContext _localctx = new OrderedSetTypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_orderedSetTypeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(ORDERED);
			setState(385);
			match(SET);
			setState(386);
			match(LPAREN);
			setState(387);
			typeExpression();
			setState(388);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OppExpressionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(GelParser.SUB, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OppExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oppExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterOppExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitOppExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitOppExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OppExpressionContext oppExpression() throws RecognitionException {
		OppExpressionContext _localctx = new OppExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_oppExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(SUB);
			setState(391);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(GelParser.THIS, 0); }
		public TerminalNode Identifier() { return getToken(GelParser.Identifier, 0); }
		public SelfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitSelfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitSelfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfExpressionContext selfExpression() throws RecognitionException {
		SelfExpressionContext _localctx = new SelfExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_selfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(THIS);
			setState(394);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode THE() { return getToken(GelParser.THE, 0); }
		public TerminalNode Identifier() { return getToken(GelParser.Identifier, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(THE);
			setState(397);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<BasicExpressionContext> basicExpression() {
			return getRuleContexts(BasicExpressionContext.class);
		}
		public BasicExpressionContext basicExpression(int i) {
			return getRuleContext(BasicExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GelParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameterList);
		try {
			int _alt;
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case DateLiteral:
			case RegexLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case NOT:
			case SUB:
			case Identifier:
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(399);
						basicExpression();
						setState(400);
						match(COMMA);
						}
						} 
					}
					setState(406);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(407);
				basicExpression();
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				{
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatingPointLiteralContext floatingPointLiteral() {
			return getRuleContext(FloatingPointLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public DateLiteralContext dateLiteral() {
			return getRuleContext(DateLiteralContext.class,0);
		}
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public RegexLiteralContext regexLiteral() {
			return getRuleContext(RegexLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_literal);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				floatingPointLiteral();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				booleanLiteral();
				}
				break;
			case DateLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				dateLiteral();
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				characterLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				stringLiteral();
				}
				break;
			case RegexLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(417);
				regexLiteral();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(418);
				nullLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GelParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(GelParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointLiteralContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(GelParser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterFloatingPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitFloatingPointLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitFloatingPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(FloatingPointLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(GelParser.BooleanLiteral, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(BooleanLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateLiteralContext extends ParserRuleContext {
		public TerminalNode DateLiteral() { return getToken(GelParser.DateLiteral, 0); }
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitDateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitDateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_dateLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(DateLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterLiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(GelParser.CharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitCharacterLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(CharacterLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(GelParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(GelParser.NullLiteral, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(NullLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegexLiteralContext extends ParserRuleContext {
		public TerminalNode RegexLiteral() { return getToken(GelParser.RegexLiteral, 0); }
		public RegexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).enterRegexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GelParserListener ) ((GelParserListener)listener).exitRegexLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GelParserVisitor ) return ((GelParserVisitor<? extends T>)visitor).visitRegexLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexLiteralContext regexLiteral() throws RecognitionException {
		RegexLiteralContext _localctx = new RegexLiteralContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_regexLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(RegexLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u01ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\7\4\u0092\n\4\f\4\16\4\u0095\13\4\3\4\3\4\3\5\3\5\3\5\7\5\u009c"+
		"\n\5\f\5\16\5\u009f\13\5\3\5\3\5\3\6\3\6\3\6\7\6\u00a6\n\6\f\6\16\6\u00a9"+
		"\13\6\3\6\3\6\3\7\3\7\5\7\u00af\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00b9\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\5\16\u00ce\n\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\7\21\u00da\n\21\f\21\16\21\u00dd\13\21\3\22\3\22"+
		"\5\22\u00e1\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\7\25\u00eb\n"+
		"\25\f\25\16\25\u00ee\13\25\3\26\3\26\3\26\5\26\u00f3\n\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0102\n\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35\u010d\n\35\f\35\16"+
		"\35\u0110\13\35\3\35\3\35\5\35\u0114\n\35\3\36\3\36\3\36\3\36\7\36\u011a"+
		"\n\36\f\36\16\36\u011d\13\36\3\36\5\36\u0120\n\36\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3!\3!\5!\u012b\n!\3\"\3\"\3\"\5\"\u0130\n\"\3#\3#\3#\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3&\3&\3&\5&\u0142\n&\3\'\3\'\3(\3(\5(\u0148\n(\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\5\61\u0169\n\61\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0170\n\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\3:\3:\3:\3;\3;\3;\7;\u0195\n;\f;\16;\u0198\13;\3;\3;\5;"+
		"\u019c\n;\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01a6\n<\3=\3=\3>\3>\3?\3?\3@\3@"+
		"\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\2\2F\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\2\3\4\2<<>>\2\u01a2\2\u008a\3\2\2\2\4\u008c\3"+
		"\2\2\2\6\u0093\3\2\2\2\b\u009d\3\2\2\2\n\u00a7\3\2\2\2\f\u00ae\3\2\2\2"+
		"\16\u00b0\3\2\2\2\20\u00b8\3\2\2\2\22\u00ba\3\2\2\2\24\u00be\3\2\2\2\26"+
		"\u00c2\3\2\2\2\30\u00c6\3\2\2\2\32\u00cd\3\2\2\2\34\u00cf\3\2\2\2\36\u00d3"+
		"\3\2\2\2 \u00d7\3\2\2\2\"\u00e0\3\2\2\2$\u00e2\3\2\2\2&\u00e5\3\2\2\2"+
		"(\u00e8\3\2\2\2*\u00f2\3\2\2\2,\u00f4\3\2\2\2.\u00f7\3\2\2\2\60\u00fa"+
		"\3\2\2\2\62\u0101\3\2\2\2\64\u0103\3\2\2\2\66\u0107\3\2\2\28\u010e\3\2"+
		"\2\2:\u0115\3\2\2\2<\u0121\3\2\2\2>\u0123\3\2\2\2@\u012a\3\2\2\2B\u012f"+
		"\3\2\2\2D\u0131\3\2\2\2F\u0134\3\2\2\2H\u0139\3\2\2\2J\u0141\3\2\2\2L"+
		"\u0143\3\2\2\2N\u0147\3\2\2\2P\u0149\3\2\2\2R\u014d\3\2\2\2T\u0151\3\2"+
		"\2\2V\u0155\3\2\2\2X\u0158\3\2\2\2Z\u015b\3\2\2\2\\\u015d\3\2\2\2^\u0160"+
		"\3\2\2\2`\u0165\3\2\2\2b\u016f\3\2\2\2d\u0171\3\2\2\2f\u0173\3\2\2\2h"+
		"\u0178\3\2\2\2j\u017d\3\2\2\2l\u0182\3\2\2\2n\u0188\3\2\2\2p\u018b\3\2"+
		"\2\2r\u018e\3\2\2\2t\u019b\3\2\2\2v\u01a5\3\2\2\2x\u01a7\3\2\2\2z\u01a9"+
		"\3\2\2\2|\u01ab\3\2\2\2~\u01ad\3\2\2\2\u0080\u01af\3\2\2\2\u0082\u01b1"+
		"\3\2\2\2\u0084\u01b3\3\2\2\2\u0086\u01b5\3\2\2\2\u0088\u01b7\3\2\2\2\u008a"+
		"\u008b\5\4\3\2\u008b\3\3\2\2\2\u008c\u008d\5\6\4\2\u008d\5\3\2\2\2\u008e"+
		"\u008f\5\b\5\2\u008f\u0090\7%\2\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2"+
		"\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\b\5\2\u0097\7\3\2\2\2"+
		"\u0098\u0099\5\n\6\2\u0099\u009a\7$\2\2\u009a\u009c\3\2\2\2\u009b\u0098"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5\n\6\2\u00a1\t\3\2\2\2"+
		"\u00a2\u00a3\5\f\7\2\u00a3\u00a4\7#\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2"+
		"\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\5\f\7\2\u00ab\13\3\2\2"+
		"\2\u00ac\u00af\5\16\b\2\u00ad\u00af\5\20\t\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\r\3\2\2\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2\5\20\t"+
		"\2\u00b2\17\3\2\2\2\u00b3\u00b9\5\22\n\2\u00b4\u00b9\5\24\13\2\u00b5\u00b9"+
		"\5\26\f\2\u00b6\u00b9\5\30\r\2\u00b7\u00b9\5\32\16\2\u00b8\u00b3\3\2\2"+
		"\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\7\30\2\2\u00bc"+
		"\u00bd\5\32\16\2\u00bd\23\3\2\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\7"+
		"!\2\2\u00c0\u00c1\5\32\16\2\u00c1\25\3\2\2\2\u00c2\u00c3\5\32\16\2\u00c3"+
		"\u00c4\7\31\2\2\u00c4\u00c5\5\32\16\2\u00c5\27\3\2\2\2\u00c6\u00c7\5\32"+
		"\16\2\u00c7\u00c8\7 \2\2\u00c8\u00c9\5\32\16\2\u00c9\31\3\2\2\2\u00ca"+
		"\u00ce\5\34\17\2\u00cb\u00ce\5\36\20\2\u00cc\u00ce\5 \21\2\u00cd\u00ca"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\33\3\2\2\2\u00cf"+
		"\u00d0\5 \21\2\u00d0\u00d1\7\37\2\2\u00d1\u00d2\5 \21\2\u00d2\35\3\2\2"+
		"\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\7\"\2\2\u00d5\u00d6\5 \21\2\u00d6\37"+
		"\3\2\2\2\u00d7\u00db\5(\25\2\u00d8\u00da\5\"\22\2\u00d9\u00d8\3\2\2\2"+
		"\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc!\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\5$\23\2\u00df\u00e1\5&\24\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1#\3\2\2\2\u00e2\u00e3\7&\2\2\u00e3"+
		"\u00e4\5(\25\2\u00e4%\3\2\2\2\u00e5\u00e6\7\'\2\2\u00e6\u00e7\5(\25\2"+
		"\u00e7\'\3\2\2\2\u00e8\u00ec\5\62\32\2\u00e9\u00eb\5*\26\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		")\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f3\5,\27\2\u00f0\u00f3\5.\30\2"+
		"\u00f1\u00f3\5\60\31\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3+\3\2\2\2\u00f4\u00f5\7(\2\2\u00f5\u00f6\5\62\32\2\u00f6"+
		"-\3\2\2\2\u00f7\u00f8\7)\2\2\u00f8\u00f9\5\62\32\2\u00f9/\3\2\2\2\u00fa"+
		"\u00fb\7,\2\2\u00fb\u00fc\5\62\32\2\u00fc\61\3\2\2\2\u00fd\u0102\5n8\2"+
		"\u00fe\u0102\5\66\34\2\u00ff\u0102\5v<\2\u0100\u0102\5\64\33\2\u0101\u00fd"+
		"\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\63\3\2\2\2\u0103\u0104\7\13\2\2\u0104\u0105\5\4\3\2\u0105\u0106\7\f\2"+
		"\2\u0106\65\3\2\2\2\u0107\u0108\5:\36\2\u0108\67\3\2\2\2\u0109\u010a\5"+
		"@!\2\u010a\u010b\5<\37\2\u010b\u010d\3\2\2\2\u010c\u0109\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0113\5J&\2\u0112\u0114\5B\"\2\u0113\u0112"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u01149\3\2\2\2\u0115\u011b\5J&\2\u0116\u0117"+
		"\5> \2\u0117\u0118\5@!\2\u0118\u011a\3\2\2\2\u0119\u0116\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u0120\5B\"\2\u011f\u011e\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120;\3\2\2\2\u0121\u0122\7\65\2\2\u0122=\3\2\2\2\u0123"+
		"\u0124\7\24\2\2\u0124?\3\2\2\2\u0125\u012b\5L\'\2\u0126\u012b\5N(\2\u0127"+
		"\u012b\5T+\2\u0128\u012b\5V,\2\u0129\u012b\5X-\2\u012a\u0125\3\2\2\2\u012a"+
		"\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2"+
		"\2\2\u012bA\3\2\2\2\u012c\u0130\5D#\2\u012d\u0130\5F$\2\u012e\u0130\5"+
		"H%\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"C\3\2\2\2\u0131\u0132\7:\2\2\u0132\u0133\7;\2\2\u0133E\3\2\2\2\u0134\u0135"+
		"\7:\2\2\u0135\u0136\7\65\2\2\u0136\u0137\7@\2\2\u0137\u0138\5\4\3\2\u0138"+
		"G\3\2\2\2\u0139\u013a\7:\2\2\u013a\u013b\7\65\2\2\u013b\u013c\7A\2\2\u013c"+
		"\u013d\5\4\3\2\u013dI\3\2\2\2\u013e\u0142\5p9\2\u013f\u0142\5Z.\2\u0140"+
		"\u0142\5\\/\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2"+
		"\2\2\u0142K\3\2\2\2\u0143\u0144\5x=\2\u0144M\3\2\2\2\u0145\u0148\5P)\2"+
		"\u0146\u0148\5R*\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148O\3\2"+
		"\2\2\u0149\u014a\t\2\2\2\u014a\u014b\79\2\2\u014b\u014c\5x=\2\u014cQ\3"+
		"\2\2\2\u014d\u014e\t\2\2\2\u014e\u014f\5x=\2\u014f\u0150\79\2\2\u0150"+
		"S\3\2\2\2\u0151\u0152\7B\2\2\u0152\u0153\7@\2\2\u0153\u0154\5\4\3\2\u0154"+
		"U\3\2\2\2\u0155\u0156\5^\60\2\u0156\u0157\7\65\2\2\u0157W\3\2\2\2\u0158"+
		"\u0159\5^\60\2\u0159\u015a\7\65\2\2\u015aY\3\2\2\2\u015b\u015c\5x=\2\u015c"+
		"[\3\2\2\2\u015d\u015e\5x=\2\u015e\u015f\7\67\2\2\u015f]\3\2\2\2\u0160"+
		"\u0161\5x=\2\u0161\u0162\7\13\2\2\u0162\u0163\5t;\2\u0163\u0164\7\f\2"+
		"\2\u0164_\3\2\2\2\u0165\u0168\5x=\2\u0166\u0167\7\35\2\2\u0167\u0169\5"+
		"b\62\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169a\3\2\2\2\u016a\u0170"+
		"\5d\63\2\u016b\u0170\5f\64\2\u016c\u0170\5h\65\2\u016d\u0170\5j\66\2\u016e"+
		"\u0170\5l\67\2\u016f\u016a\3\2\2\2\u016f\u016b\3\2\2\2\u016f\u016c\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170c\3\2\2\2\u0171\u0172"+
		"\7\66\2\2\u0172e\3\2\2\2\u0173\u0174\7E\2\2\u0174\u0175\7\13\2\2\u0175"+
		"\u0176\5b\62\2\u0176\u0177\7\f\2\2\u0177g\3\2\2\2\u0178\u0179\7F\2\2\u0179"+
		"\u017a\7\13\2\2\u017a\u017b\5b\62\2\u017b\u017c\7\f\2\2\u017ci\3\2\2\2"+
		"\u017d\u017e\7G\2\2\u017e\u017f\7\13\2\2\u017f\u0180\5b\62\2\u0180\u0181"+
		"\7\f\2\2\u0181k\3\2\2\2\u0182\u0183\7C\2\2\u0183\u0184\7G\2\2\u0184\u0185"+
		"\7\13\2\2\u0185\u0186\5b\62\2\u0186\u0187\7\f\2\2\u0187m\3\2\2\2\u0188"+
		"\u0189\7\'\2\2\u0189\u018a\5\62\32\2\u018ao\3\2\2\2\u018b\u018c\7=\2\2"+
		"\u018c\u018d\7\66\2\2\u018dq\3\2\2\2\u018e\u018f\7<\2\2\u018f\u0190\7"+
		"\66\2\2\u0190s\3\2\2\2\u0191\u0192\5\4\3\2\u0192\u0193\7\23\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0191\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019c\5\4\3\2\u019a\u019c\3\2\2\2\u019b\u0196\3\2\2\2\u019b\u019a\3\2"+
		"\2\2\u019cu\3\2\2\2\u019d\u01a6\5z>\2\u019e\u01a6\5|?\2\u019f\u01a6\5"+
		"~@\2\u01a0\u01a6\5\u0080A\2\u01a1\u01a6\5\u0082B\2\u01a2\u01a6\5\u0084"+
		"C\2\u01a3\u01a6\5\u0088E\2\u01a4\u01a6\5\u0086D\2\u01a5\u019d\3\2\2\2"+
		"\u01a5\u019e\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a1"+
		"\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6"+
		"w\3\2\2\2\u01a7\u01a8\7\66\2\2\u01a8y\3\2\2\2\u01a9\u01aa\7\3\2\2\u01aa"+
		"{\3\2\2\2\u01ab\u01ac\7\4\2\2\u01ac}\3\2\2\2\u01ad\u01ae\7\5\2\2\u01ae"+
		"\177\3\2\2\2\u01af\u01b0\7\6\2\2\u01b0\u0081\3\2\2\2\u01b1\u01b2\7\b\2"+
		"\2\u01b2\u0083\3\2\2\2\u01b3\u01b4\7\t\2\2\u01b4\u0085\3\2\2\2\u01b5\u01b6"+
		"\7\n\2\2\u01b6\u0087\3\2\2\2\u01b7\u01b8\7\7\2\2\u01b8\u0089\3\2\2\2\32"+
		"\u0093\u009d\u00a7\u00ae\u00b8\u00cd\u00db\u00e0\u00ec\u00f2\u0101\u010e"+
		"\u0113\u011b\u011f\u012a\u012f\u0141\u0147\u0168\u016f\u0196\u019b\u01a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}