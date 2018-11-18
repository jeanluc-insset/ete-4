// Generated from fr/upjv/mis/GelLexer.g4 by ANTLR 4.7.1
package fr.upjv.mis;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GelLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
		"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
		"Digit", "NonZeroDigit", "DigitOrUnderscore", "Underscores", "HexNumeral", 
		"HexDigits", "HexDigit", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
		"OctalDigit", "OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", 
		"BinaryDigit", "BinaryDigitOrUnderscore", "FloatingPointLiteral", "DecimalFloatingPointLiteral", 
		"ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", 
		"HexadecimalFloatingPointLiteral", "HexSignificand", "BinaryExponent", 
		"BinaryExponentIndicator", "BooleanLiteral", "DateLiteral", "RegexLiteral", 
		"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", 
		"NullLiteral", "LPAREN", "RPAREN", "START_EXP", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "SEMI", "COMMA", "DOT", "ARROW", "LEFT_ARROW", "PIPE", "GT", 
		"LT", "NOT", "TILDE", "QUESTION", "COLON", "DOUBLE_COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "XOR", "ADD", "SUB", "MUL", "DIV", "MOD_PERCENT", 
		"CARET", "MOD", "FEATURE", "BACKGROUND", "SCENARIO", "OUTLINE", "GIVEN", 
		"WHEN", "THEN", "BUT", "OF", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
		"ATPRE", "ELLIPSIS", "INITIAL", "IS", "NEW", "THE", "THIS", "A", "WITH", 
		"TYPE", "KIND", "AS", "ORDERED", "UNORDERED", "SEQUENCE", "BAG", "SET", 
		"WS", "COMMENT", "LINE_COMMENT"
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


	public GelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GelLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 92:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 93:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u0429\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\3\2\3\2\3\2\5\2"+
		"\u00ec\n\2\3\3\3\3\5\3\u00f0\n\3\3\4\3\4\5\4\u00f4\n\4\3\5\3\5\5\5\u00f8"+
		"\n\5\3\6\3\6\5\6\u00fc\n\6\3\7\3\7\3\b\3\b\3\b\5\b\u0103\n\b\3\b\3\b\3"+
		"\b\5\b\u0108\n\b\5\b\u010a\n\b\3\t\3\t\7\t\u010e\n\t\f\t\16\t\u0111\13"+
		"\t\3\t\5\t\u0114\n\t\3\n\3\n\5\n\u0118\n\n\3\13\3\13\3\f\3\f\5\f\u011e"+
		"\n\f\3\r\6\r\u0121\n\r\r\r\16\r\u0122\3\16\3\16\3\16\3\16\3\17\3\17\7"+
		"\17\u012b\n\17\f\17\16\17\u012e\13\17\3\17\5\17\u0131\n\17\3\20\3\20\3"+
		"\21\3\21\5\21\u0137\n\21\3\22\3\22\5\22\u013b\n\22\3\22\3\22\3\23\3\23"+
		"\7\23\u0141\n\23\f\23\16\23\u0144\13\23\3\23\5\23\u0147\n\23\3\24\3\24"+
		"\3\25\3\25\5\25\u014d\n\25\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u0155\n"+
		"\27\f\27\16\27\u0158\13\27\3\27\5\27\u015b\n\27\3\30\3\30\3\31\3\31\5"+
		"\31\u0161\n\31\3\32\3\32\5\32\u0165\n\32\3\33\3\33\3\33\5\33\u016a\n\33"+
		"\3\33\5\33\u016d\n\33\3\33\5\33\u0170\n\33\3\33\3\33\3\33\5\33\u0175\n"+
		"\33\3\33\5\33\u0178\n\33\3\33\3\33\3\33\5\33\u017d\n\33\3\33\3\33\3\33"+
		"\5\33\u0182\n\33\3\34\3\34\3\34\3\35\3\35\3\36\5\36\u018a\n\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3!\5!\u0195\n!\3\"\3\"\5\"\u0199\n\"\3\"\3\""+
		"\3\"\5\"\u019e\n\"\3\"\3\"\5\"\u01a2\n\"\3#\3#\3#\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\5%\u01b2\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01c9\n\'\f\'\16\'\u01cc\13\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u01d8\n(\3)\3)\3*\3*\5*\u01de\n*\3*\3*\3+\6"+
		"+\u01e3\n+\r+\16+\u01e4\3,\3,\5,\u01e9\n,\3-\3-\3-\3-\5-\u01ef\n-\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01fc\n.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3G\3G\3G\3H\3"+
		"H\3H\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3L\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3"+
		"P\3Q\3Q\3R\3R\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\5T\u0275\nT\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0295\nU\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5"+
		"V\u02af\nV\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\5W\u02c6\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u02d7"+
		"\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u02e5\nY\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u02f3\nZ\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u02fe\n["+
		"\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0306\n\\\3]\3]\7]\u030a\n]\f]\16]\u030d"+
		"\13]\3^\3^\3^\3^\3^\3^\5^\u0315\n^\3_\3_\3_\3_\3_\3_\5_\u031d\n_\3`\3"+
		"`\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\5b\u033d\nb\3c\3c\3c\3c\3c\3c\5c\u0345\nc\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\5d\u0350\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u035b\ne\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0369\nf\3g\3g\3g\3g\3g\3g\3g\5"+
		"g\u0372\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u0380\nh\3i\3i\3i\3"+
		"i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u038e\ni\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\5j\u039c\nj\3k\3k\3k\3k\3k\3k\5k\u03a4\nk\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u03bb\nl\3m\3m\3m\3m\3m\3"+
		"m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u03d8"+
		"\nm\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n"+
		"\3n\3n\5n\u03f2\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u03fd\no\3p\3p\3p\3p"+
		"\3p\3p\3p\3p\3p\5p\u0408\np\3q\6q\u040b\nq\rq\16q\u040c\3q\3q\3r\3r\3"+
		"r\3r\7r\u0415\nr\fr\16r\u0418\13r\3r\3r\3r\3r\3r\3s\3s\3s\3s\7s\u0423"+
		"\ns\fs\16s\u0426\13s\3s\3s\3\u0416\2t\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21"+
		"\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63"+
		"\4\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\5K\6M\7O\bQ\2S\tU\2W\2Y\2[\2]\2"+
		"_\2a\nc\13e\fg\ri\16k\17m\20o\21q\22s\23u\24w\25y\26{\27}\30\177\31\u0081"+
		"\32\u0083\33\u0085\34\u0087\35\u0089\36\u008b\37\u008d \u008f!\u0091\""+
		"\u0093#\u0095$\u0097%\u0099&\u009b\'\u009d(\u009f)\u00a1*\u00a3+\u00a5"+
		",\u00a7-\u00a9.\u00ab/\u00ad\60\u00af\61\u00b1\62\u00b3\63\u00b5\64\u00b7"+
		"\65\u00b9\66\u00bb\2\u00bd\2\u00bf\67\u00c18\u00c39\u00c5:\u00c7;\u00c9"+
		"<\u00cb=\u00cd>\u00cf?\u00d1@\u00d3A\u00d5B\u00d7C\u00d9D\u00dbE\u00dd"+
		"F\u00dfG\u00e1H\u00e3I\u00e5J\3\2\31\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;C"+
		"Hch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2"+
		"))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\4\2CCcc\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\2\u046f\2\3\3\2\2\2\2\63\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e"+
		"\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2"+
		"\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2"+
		"\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1"+
		"\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2"+
		"\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3"+
		"\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2"+
		"\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5"+
		"\3\2\2\2\3\u00eb\3\2\2\2\5\u00ed\3\2\2\2\7\u00f1\3\2\2\2\t\u00f5\3\2\2"+
		"\2\13\u00f9\3\2\2\2\r\u00fd\3\2\2\2\17\u0109\3\2\2\2\21\u010b\3\2\2\2"+
		"\23\u0117\3\2\2\2\25\u0119\3\2\2\2\27\u011d\3\2\2\2\31\u0120\3\2\2\2\33"+
		"\u0124\3\2\2\2\35\u0128\3\2\2\2\37\u0132\3\2\2\2!\u0136\3\2\2\2#\u0138"+
		"\3\2\2\2%\u013e\3\2\2\2\'\u0148\3\2\2\2)\u014c\3\2\2\2+\u014e\3\2\2\2"+
		"-\u0152\3\2\2\2/\u015c\3\2\2\2\61\u0160\3\2\2\2\63\u0164\3\2\2\2\65\u0181"+
		"\3\2\2\2\67\u0183\3\2\2\29\u0186\3\2\2\2;\u0189\3\2\2\2=\u018d\3\2\2\2"+
		"?\u018f\3\2\2\2A\u0191\3\2\2\2C\u01a1\3\2\2\2E\u01a3\3\2\2\2G\u01a6\3"+
		"\2\2\2I\u01b1\3\2\2\2K\u01b3\3\2\2\2M\u01c0\3\2\2\2O\u01d7\3\2\2\2Q\u01d9"+
		"\3\2\2\2S\u01db\3\2\2\2U\u01e2\3\2\2\2W\u01e8\3\2\2\2Y\u01ee\3\2\2\2["+
		"\u01fb\3\2\2\2]\u01fd\3\2\2\2_\u0204\3\2\2\2a\u0206\3\2\2\2c\u020b\3\2"+
		"\2\2e\u020d\3\2\2\2g\u020f\3\2\2\2i\u0212\3\2\2\2k\u0214\3\2\2\2m\u0216"+
		"\3\2\2\2o\u0218\3\2\2\2q\u021a\3\2\2\2s\u021c\3\2\2\2u\u021e\3\2\2\2w"+
		"\u0220\3\2\2\2y\u0223\3\2\2\2{\u0226\3\2\2\2}\u0228\3\2\2\2\177\u022a"+
		"\3\2\2\2\u0081\u022c\3\2\2\2\u0083\u0230\3\2\2\2\u0085\u0232\3\2\2\2\u0087"+
		"\u0234\3\2\2\2\u0089\u0236\3\2\2\2\u008b\u0239\3\2\2\2\u008d\u023b\3\2"+
		"\2\2\u008f\u023e\3\2\2\2\u0091\u0241\3\2\2\2\u0093\u0244\3\2\2\2\u0095"+
		"\u0248\3\2\2\2\u0097\u024b\3\2\2\2\u0099\u024f\3\2\2\2\u009b\u0251\3\2"+
		"\2\2\u009d\u0253\3\2\2\2\u009f\u0255\3\2\2\2\u00a1\u0257\3\2\2\2\u00a3"+
		"\u0259\3\2\2\2\u00a5\u025b\3\2\2\2\u00a7\u0274\3\2\2\2\u00a9\u0294\3\2"+
		"\2\2\u00ab\u02ae\3\2\2\2\u00ad\u02c5\3\2\2\2\u00af\u02d6\3\2\2\2\u00b1"+
		"\u02e4\3\2\2\2\u00b3\u02f2\3\2\2\2\u00b5\u02fd\3\2\2\2\u00b7\u0305\3\2"+
		"\2\2\u00b9\u0307\3\2\2\2\u00bb\u0314\3\2\2\2\u00bd\u031c\3\2\2\2\u00bf"+
		"\u031e\3\2\2\2\u00c1\u0323\3\2\2\2\u00c3\u033c\3\2\2\2\u00c5\u0344\3\2"+
		"\2\2\u00c7\u034f\3\2\2\2\u00c9\u035a\3\2\2\2\u00cb\u0368\3\2\2\2\u00cd"+
		"\u0371\3\2\2\2\u00cf\u037f\3\2\2\2\u00d1\u038d\3\2\2\2\u00d3\u039b\3\2"+
		"\2\2\u00d5\u03a3\3\2\2\2\u00d7\u03ba\3\2\2\2\u00d9\u03d7\3\2\2\2\u00db"+
		"\u03f1\3\2\2\2\u00dd\u03fc\3\2\2\2\u00df\u0407\3\2\2\2\u00e1\u040a\3\2"+
		"\2\2\u00e3\u0410\3\2\2\2\u00e5\u041e\3\2\2\2\u00e7\u00ec\5\5\3\2\u00e8"+
		"\u00ec\5\7\4\2\u00e9\u00ec\5\t\5\2\u00ea\u00ec\5\13\6\2\u00eb\u00e7\3"+
		"\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\4\3\2\2\2\u00ed\u00ef\5\17\b\2\u00ee\u00f0\5\r\7\2\u00ef\u00ee\3\2\2"+
		"\2\u00ef\u00f0\3\2\2\2\u00f0\6\3\2\2\2\u00f1\u00f3\5\33\16\2\u00f2\u00f4"+
		"\5\r\7\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\b\3\2\2\2\u00f5"+
		"\u00f7\5#\22\2\u00f6\u00f8\5\r\7\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\n\3\2\2\2\u00f9\u00fb\5+\26\2\u00fa\u00fc\5\r\7\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\f\3\2\2\2\u00fd\u00fe\t\2\2\2\u00fe"+
		"\16\3\2\2\2\u00ff\u010a\7\62\2\2\u0100\u0107\5\25\13\2\u0101\u0103\5\21"+
		"\t\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0108\3\2\2\2\u0104"+
		"\u0105\5\31\r\2\u0105\u0106\5\21\t\2\u0106\u0108\3\2\2\2\u0107\u0102\3"+
		"\2\2\2\u0107\u0104\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u00ff\3\2\2\2\u0109"+
		"\u0100\3\2\2\2\u010a\20\3\2\2\2\u010b\u0113\5\23\n\2\u010c\u010e\5\27"+
		"\f\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\5\23"+
		"\n\2\u0113\u010f\3\2\2\2\u0113\u0114\3\2\2\2\u0114\22\3\2\2\2\u0115\u0118"+
		"\7\62\2\2\u0116\u0118\5\25\13\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2"+
		"\2\u0118\24\3\2\2\2\u0119\u011a\t\3\2\2\u011a\26\3\2\2\2\u011b\u011e\5"+
		"\23\n\2\u011c\u011e\7a\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\30\3\2\2\2\u011f\u0121\7a\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\32\3\2\2\2\u0124\u0125"+
		"\7\62\2\2\u0125\u0126\t\4\2\2\u0126\u0127\5\35\17\2\u0127\34\3\2\2\2\u0128"+
		"\u0130\5\37\20\2\u0129\u012b\5!\21\2\u012a\u0129\3\2\2\2\u012b\u012e\3"+
		"\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0131\5\37\20\2\u0130\u012c\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\36\3\2\2\2\u0132\u0133\t\5\2\2\u0133 \3\2\2\2\u0134\u0137"+
		"\5\37\20\2\u0135\u0137\7a\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2"+
		"\u0137\"\3\2\2\2\u0138\u013a\7\62\2\2\u0139\u013b\5\31\r\2\u013a\u0139"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\5%\23\2\u013d"+
		"$\3\2\2\2\u013e\u0146\5\'\24\2\u013f\u0141\5)\25\2\u0140\u013f\3\2\2\2"+
		"\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\5\'\24\2\u0146\u0142\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147&\3\2\2\2\u0148\u0149\t\6\2\2\u0149(\3\2\2\2"+
		"\u014a\u014d\5\'\24\2\u014b\u014d\7a\2\2\u014c\u014a\3\2\2\2\u014c\u014b"+
		"\3\2\2\2\u014d*\3\2\2\2\u014e\u014f\7\62\2\2\u014f\u0150\t\7\2\2\u0150"+
		"\u0151\5-\27\2\u0151,\3\2\2\2\u0152\u015a\5/\30\2\u0153\u0155\5\61\31"+
		"\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\5/\30\2\u015a"+
		"\u0156\3\2\2\2\u015a\u015b\3\2\2\2\u015b.\3\2\2\2\u015c\u015d\t\b\2\2"+
		"\u015d\60\3\2\2\2\u015e\u0161\5/\30\2\u015f\u0161\7a\2\2\u0160\u015e\3"+
		"\2\2\2\u0160\u015f\3\2\2\2\u0161\62\3\2\2\2\u0162\u0165\5\65\33\2\u0163"+
		"\u0165\5A!\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\64\3\2\2\2"+
		"\u0166\u0167\5\21\t\2\u0167\u0169\7\60\2\2\u0168\u016a\5\21\t\2\u0169"+
		"\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u016d\5\67"+
		"\34\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e"+
		"\u0170\5? \2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0182\3\2\2"+
		"\2\u0171\u0172\7\60\2\2\u0172\u0174\5\21\t\2\u0173\u0175\5\67\34\2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\5?"+
		" \2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0182\3\2\2\2\u0179"+
		"\u017a\5\21\t\2\u017a\u017c\5\67\34\2\u017b\u017d\5? \2\u017c\u017b\3"+
		"\2\2\2\u017c\u017d\3\2\2\2\u017d\u0182\3\2\2\2\u017e\u017f\5\21\t\2\u017f"+
		"\u0180\5? \2\u0180\u0182\3\2\2\2\u0181\u0166\3\2\2\2\u0181\u0171\3\2\2"+
		"\2\u0181\u0179\3\2\2\2\u0181\u017e\3\2\2\2\u0182\66\3\2\2\2\u0183\u0184"+
		"\59\35\2\u0184\u0185\5;\36\2\u01858\3\2\2\2\u0186\u0187\t\t\2\2\u0187"+
		":\3\2\2\2\u0188\u018a\5=\37\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2"+
		"\u018a\u018b\3\2\2\2\u018b\u018c\5\21\t\2\u018c<\3\2\2\2\u018d\u018e\t"+
		"\n\2\2\u018e>\3\2\2\2\u018f\u0190\t\13\2\2\u0190@\3\2\2\2\u0191\u0192"+
		"\5C\"\2\u0192\u0194\5E#\2\u0193\u0195\5? \2\u0194\u0193\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195B\3\2\2\2\u0196\u0198\5\33\16\2\u0197\u0199\7\60\2"+
		"\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01a2\3\2\2\2\u019a\u019b"+
		"\7\62\2\2\u019b\u019d\t\4\2\2\u019c\u019e\5\35\17\2\u019d\u019c\3\2\2"+
		"\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\60\2\2\u01a0"+
		"\u01a2\5\35\17\2\u01a1\u0196\3\2\2\2\u01a1\u019a\3\2\2\2\u01a2D\3\2\2"+
		"\2\u01a3\u01a4\5G$\2\u01a4\u01a5\5;\36\2\u01a5F\3\2\2\2\u01a6\u01a7\t"+
		"\f\2\2\u01a7H\3\2\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa\7t\2\2\u01aa\u01ab"+
		"\7w\2\2\u01ab\u01b2\7g\2\2\u01ac\u01ad\7h\2\2\u01ad\u01ae\7c\2\2\u01ae"+
		"\u01af\7n\2\2\u01af\u01b0\7u\2\2\u01b0\u01b2\7g\2\2\u01b1\u01a8\3\2\2"+
		"\2\u01b1\u01ac\3\2\2\2\u01b2J\3\2\2\2\u01b3\u01b4\7$\2\2\u01b4\u01b5\5"+
		"\23\n\2\u01b5\u01b6\5\23\n\2\u01b6\u01b7\5\23\n\2\u01b7\u01b8\5\23\n\2"+
		"\u01b8\u01b9\5\u009bN\2\u01b9\u01ba\5\23\n\2\u01ba\u01bb\5\23\n\2\u01bb"+
		"\u01bc\5\u009bN\2\u01bc\u01bd\5\23\n\2\u01bd\u01be\5\23\n\2\u01be\u01bf"+
		"\7$\2\2\u01bfL\3\2\2\2\u01c0\u01ca\5\u009fP\2\u01c1\u01c9\5O(\2\u01c2"+
		"\u01c9\5c\62\2\u01c3\u01c9\5e\63\2\u01c4\u01c9\5m\67\2\u01c5\u01c9\5o"+
		"8\2\u01c6\u01c9\5i\65\2\u01c7\u01c9\5k\66\2\u01c8\u01c1\3\2\2\2\u01c8"+
		"\u01c2\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cd\u01ce\5\u009fP\2\u01ceN\3\2\2\2\u01cf\u01d0\7)\2\2\u01d0\u01d1"+
		"\5Q)\2\u01d1\u01d2\7)\2\2\u01d2\u01d8\3\2\2\2\u01d3\u01d4\7)\2\2\u01d4"+
		"\u01d5\5Y-\2\u01d5\u01d6\7)\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01cf\3\2\2"+
		"\2\u01d7\u01d3\3\2\2\2\u01d8P\3\2\2\2\u01d9\u01da\n\r\2\2\u01daR\3\2\2"+
		"\2\u01db\u01dd\7$\2\2\u01dc\u01de\5U+\2\u01dd\u01dc\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\7$\2\2\u01e0T\3\2\2\2\u01e1\u01e3"+
		"\5W,\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5V\3\2\2\2\u01e6\u01e9\n\16\2\2\u01e7\u01e9\5Y-\2\u01e8"+
		"\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9X\3\2\2\2\u01ea\u01eb\7^\2\2\u01eb"+
		"\u01ef\t\17\2\2\u01ec\u01ef\5[.\2\u01ed\u01ef\5]/\2\u01ee\u01ea\3\2\2"+
		"\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01efZ\3\2\2\2\u01f0\u01f1"+
		"\7^\2\2\u01f1\u01fc\5\'\24\2\u01f2\u01f3\7^\2\2\u01f3\u01f4\5\'\24\2\u01f4"+
		"\u01f5\5\'\24\2\u01f5\u01fc\3\2\2\2\u01f6\u01f7\7^\2\2\u01f7\u01f8\5_"+
		"\60\2\u01f8\u01f9\5\'\24\2\u01f9\u01fa\5\'\24\2\u01fa\u01fc\3\2\2\2\u01fb"+
		"\u01f0\3\2\2\2\u01fb\u01f2\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fc\\\3\2\2\2"+
		"\u01fd\u01fe\7^\2\2\u01fe\u01ff\7w\2\2\u01ff\u0200\5\37\20\2\u0200\u0201"+
		"\5\37\20\2\u0201\u0202\5\37\20\2\u0202\u0203\5\37\20\2\u0203^\3\2\2\2"+
		"\u0204\u0205\t\20\2\2\u0205`\3\2\2\2\u0206\u0207\7p\2\2\u0207\u0208\7"+
		"w\2\2\u0208\u0209\7n\2\2\u0209\u020a\7n\2\2\u020ab\3\2\2\2\u020b\u020c"+
		"\7*\2\2\u020cd\3\2\2\2\u020d\u020e\7+\2\2\u020ef\3\2\2\2\u020f\u0210\7"+
		"%\2\2\u0210\u0211\7}\2\2\u0211h\3\2\2\2\u0212\u0213\7}\2\2\u0213j\3\2"+
		"\2\2\u0214\u0215\7\177\2\2\u0215l\3\2\2\2\u0216\u0217\7]\2\2\u0217n\3"+
		"\2\2\2\u0218\u0219\7_\2\2\u0219p\3\2\2\2\u021a\u021b\7=\2\2\u021br\3\2"+
		"\2\2\u021c\u021d\7.\2\2\u021dt\3\2\2\2\u021e\u021f\7\60\2\2\u021fv\3\2"+
		"\2\2\u0220\u0221\7/\2\2\u0221\u0222\7@\2\2\u0222x\3\2\2\2\u0223\u0224"+
		"\7>\2\2\u0224\u0225\7/\2\2\u0225z\3\2\2\2\u0226\u0227\7~\2\2\u0227|\3"+
		"\2\2\2\u0228\u0229\7@\2\2\u0229~\3\2\2\2\u022a\u022b\7>\2\2\u022b\u0080"+
		"\3\2\2\2\u022c\u022d\7p\2\2\u022d\u022e\7q\2\2\u022e\u022f\7v\2\2\u022f"+
		"\u0082\3\2\2\2\u0230\u0231\7\u0080\2\2\u0231\u0084\3\2\2\2\u0232\u0233"+
		"\7A\2\2\u0233\u0086\3\2\2\2\u0234\u0235\7<\2\2\u0235\u0088\3\2\2\2\u0236"+
		"\u0237\7<\2\2\u0237\u0238\7<\2\2\u0238\u008a\3\2\2\2\u0239\u023a\7?\2"+
		"\2\u023a\u008c\3\2\2\2\u023b\u023c\7>\2\2\u023c\u023d\7?\2\2\u023d\u008e"+
		"\3\2\2\2\u023e\u023f\7@\2\2\u023f\u0240\7?\2\2\u0240\u0090\3\2\2\2\u0241"+
		"\u0242\7>\2\2\u0242\u0243\7@\2\2\u0243\u0092\3\2\2\2\u0244\u0245\7c\2"+
		"\2\u0245\u0246\7p\2\2\u0246\u0247\7f\2\2\u0247\u0094\3\2\2\2\u0248\u0249"+
		"\7q\2\2\u0249\u024a\7t\2\2\u024a\u0096\3\2\2\2\u024b\u024c\7z\2\2\u024c"+
		"\u024d\7q\2\2\u024d\u024e\7t\2\2\u024e\u0098\3\2\2\2\u024f\u0250\7-\2"+
		"\2\u0250\u009a\3\2\2\2\u0251\u0252\7/\2\2\u0252\u009c\3\2\2\2\u0253\u0254"+
		"\7,\2\2\u0254\u009e\3\2\2\2\u0255\u0256\7\61\2\2\u0256\u00a0\3\2\2\2\u0257"+
		"\u0258\7\'\2\2\u0258\u00a2\3\2\2\2\u0259\u025a\7`\2\2\u025a\u00a4\3\2"+
		"\2\2\u025b\u025c\7o\2\2\u025c\u025d\7q\2\2\u025d\u025e\7f\2\2\u025e\u00a6"+
		"\3\2\2\2\u025f\u0260\7H\2\2\u0260\u0261\7G\2\2\u0261\u0262\7C\2\2\u0262"+
		"\u0263\7V\2\2\u0263\u0264\7W\2\2\u0264\u0265\7T\2\2\u0265\u0275\7G\2\2"+
		"\u0266\u0267\7H\2\2\u0267\u0268\7g\2\2\u0268\u0269\7c\2\2\u0269\u026a"+
		"\7v\2\2\u026a\u026b\7w\2\2\u026b\u026c\7t\2\2\u026c\u0275\7g\2\2\u026d"+
		"\u026e\7h\2\2\u026e\u026f\7g\2\2\u026f\u0270\7c\2\2\u0270\u0271\7v\2\2"+
		"\u0271\u0272\7w\2\2\u0272\u0273\7t\2\2\u0273\u0275\7g\2\2\u0274\u025f"+
		"\3\2\2\2\u0274\u0266\3\2\2\2\u0274\u026d\3\2\2\2\u0275\u00a8\3\2\2\2\u0276"+
		"\u0277\7D\2\2\u0277\u0278\7C\2\2\u0278\u0279\7E\2\2\u0279\u027a\7M\2\2"+
		"\u027a\u027b\7I\2\2\u027b\u027c\7T\2\2\u027c\u027d\7Q\2\2\u027d\u027e"+
		"\7W\2\2\u027e\u027f\7P\2\2\u027f\u0295\7F\2\2\u0280\u0281\7D\2\2\u0281"+
		"\u0282\7c\2\2\u0282\u0283\7e\2\2\u0283\u0284\7m\2\2\u0284\u0285\7i\2\2"+
		"\u0285\u0286\7t\2\2\u0286\u0287\7q\2\2\u0287\u0288\7w\2\2\u0288\u0289"+
		"\7p\2\2\u0289\u0295\7f\2\2\u028a\u028b\7d\2\2\u028b\u028c\7c\2\2\u028c"+
		"\u028d\7e\2\2\u028d\u028e\7m\2\2\u028e\u028f\7i\2\2\u028f\u0290\7t\2\2"+
		"\u0290\u0291\7q\2\2\u0291\u0292\7w\2\2\u0292\u0293\7p\2\2\u0293\u0295"+
		"\7f\2\2\u0294\u0276\3\2\2\2\u0294\u0280\3\2\2\2\u0294\u028a\3\2\2\2\u0295"+
		"\u00aa\3\2\2\2\u0296\u0297\7U\2\2\u0297\u0298\7E\2\2\u0298\u0299\7G\2"+
		"\2\u0299\u029a\7P\2\2\u029a\u029b\7C\2\2\u029b\u029c\7T\2\2\u029c\u029d"+
		"\7K\2\2\u029d\u02af\7Q\2\2\u029e\u029f\7U\2\2\u029f\u02a0\7e\2\2\u02a0"+
		"\u02a1\7g\2\2\u02a1\u02a2\7p\2\2\u02a2\u02a3\7c\2\2\u02a3\u02a4\7t\2\2"+
		"\u02a4\u02a5\7k\2\2\u02a5\u02af\7q\2\2\u02a6\u02a7\7u\2\2\u02a7\u02a8"+
		"\7e\2\2\u02a8\u02a9\7g\2\2\u02a9\u02aa\7p\2\2\u02aa\u02ab\7c\2\2\u02ab"+
		"\u02ac\7t\2\2\u02ac\u02ad\7k\2\2\u02ad\u02af\7q\2\2\u02ae\u0296\3\2\2"+
		"\2\u02ae\u029e\3\2\2\2\u02ae\u02a6\3\2\2\2\u02af\u00ac\3\2\2\2\u02b0\u02b1"+
		"\7Q\2\2\u02b1\u02b2\7W\2\2\u02b2\u02b3\7V\2\2\u02b3\u02b4\7N\2\2\u02b4"+
		"\u02b5\7K\2\2\u02b5\u02b6\7P\2\2\u02b6\u02c6\7G\2\2\u02b7\u02b8\7Q\2\2"+
		"\u02b8\u02b9\7w\2\2\u02b9\u02ba\7v\2\2\u02ba\u02bb\7n\2\2\u02bb\u02bc"+
		"\7k\2\2\u02bc\u02bd\7p\2\2\u02bd\u02c6\7g\2\2\u02be\u02bf\7q\2\2\u02bf"+
		"\u02c0\7w\2\2\u02c0\u02c1\7v\2\2\u02c1\u02c2\7n\2\2\u02c2\u02c3\7k\2\2"+
		"\u02c3\u02c4\7p\2\2\u02c4\u02c6\7g\2\2\u02c5\u02b0\3\2\2\2\u02c5\u02b7"+
		"\3\2\2\2\u02c5\u02be\3\2\2\2\u02c6\u00ae\3\2\2\2\u02c7\u02c8\7I\2\2\u02c8"+
		"\u02c9\7K\2\2\u02c9\u02ca\7X\2\2\u02ca\u02cb\7G\2\2\u02cb\u02d7\7P\2\2"+
		"\u02cc\u02cd\7I\2\2\u02cd\u02ce\7k\2\2\u02ce\u02cf\7x\2\2\u02cf\u02d0"+
		"\7g\2\2\u02d0\u02d7\7p\2\2\u02d1\u02d2\7i\2\2\u02d2\u02d3\7k\2\2\u02d3"+
		"\u02d4\7x\2\2\u02d4\u02d5\7g\2\2\u02d5\u02d7\7p\2\2\u02d6\u02c7\3\2\2"+
		"\2\u02d6\u02cc\3\2\2\2\u02d6\u02d1\3\2\2\2\u02d7\u00b0\3\2\2\2\u02d8\u02d9"+
		"\7Y\2\2\u02d9\u02da\7J\2\2\u02da\u02db\7G\2\2\u02db\u02e5\7P\2\2\u02dc"+
		"\u02dd\7Y\2\2\u02dd\u02de\7j\2\2\u02de\u02df\7g\2\2\u02df\u02e5\7p\2\2"+
		"\u02e0\u02e1\7y\2\2\u02e1\u02e2\7j\2\2\u02e2\u02e3\7g\2\2\u02e3\u02e5"+
		"\7p\2\2\u02e4\u02d8\3\2\2\2\u02e4\u02dc\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e5"+
		"\u00b2\3\2\2\2\u02e6\u02e7\7V\2\2\u02e7\u02e8\7J\2\2\u02e8\u02e9\7G\2"+
		"\2\u02e9\u02f3\7P\2\2\u02ea\u02eb\7V\2\2\u02eb\u02ec\7j\2\2\u02ec\u02ed"+
		"\7g\2\2\u02ed\u02f3\7p\2\2\u02ee\u02ef\7v\2\2\u02ef\u02f0\7j\2\2\u02f0"+
		"\u02f1\7g\2\2\u02f1\u02f3\7p\2\2\u02f2\u02e6\3\2\2\2\u02f2\u02ea\3\2\2"+
		"\2\u02f2\u02ee\3\2\2\2\u02f3\u00b4\3\2\2\2\u02f4\u02f5\7D\2\2\u02f5\u02f6"+
		"\7W\2\2\u02f6\u02fe\7V\2\2\u02f7\u02f8\7D\2\2\u02f8\u02f9\7w\2\2\u02f9"+
		"\u02fe\7v\2\2\u02fa\u02fb\7d\2\2\u02fb\u02fc\7w\2\2\u02fc\u02fe\7v\2\2"+
		"\u02fd\u02f4\3\2\2\2\u02fd\u02f7\3\2\2\2\u02fd\u02fa\3\2\2\2\u02fe\u00b6"+
		"\3\2\2\2\u02ff\u0300\7Q\2\2\u0300\u0306\7H\2\2\u0301\u0302\7Q\2\2\u0302"+
		"\u0306\7h\2\2\u0303\u0304\7q\2\2\u0304\u0306\7h\2\2\u0305\u02ff\3\2\2"+
		"\2\u0305\u0301\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u00b8\3\2\2\2\u0307\u030b"+
		"\5\u00bb^\2\u0308\u030a\5\u00bd_\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2"+
		"\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u00ba\3\2\2\2\u030d"+
		"\u030b\3\2\2\2\u030e\u0315\t\21\2\2\u030f\u0310\n\22\2\2\u0310\u0315\6"+
		"^\2\2\u0311\u0312\t\23\2\2\u0312\u0313\t\24\2\2\u0313\u0315\6^\3\2\u0314"+
		"\u030e\3\2\2\2\u0314\u030f\3\2\2\2\u0314\u0311\3\2\2\2\u0315\u00bc\3\2"+
		"\2\2\u0316\u031d\t\25\2\2\u0317\u0318\n\22\2\2\u0318\u031d\6_\4\2\u0319"+
		"\u031a\t\23\2\2\u031a\u031b\t\24\2\2\u031b\u031d\6_\5\2\u031c\u0316\3"+
		"\2\2\2\u031c\u0317\3\2\2\2\u031c\u0319\3\2\2\2\u031d\u00be\3\2\2\2\u031e"+
		"\u031f\7B\2\2\u031f\u0320\7r\2\2\u0320\u0321\7t\2\2\u0321\u0322\7g\2\2"+
		"\u0322\u00c0\3\2\2\2\u0323\u0324\7\60\2\2\u0324\u0325\7\60\2\2\u0325\u0326"+
		"\7\60\2\2\u0326\u00c2\3\2\2\2\u0327\u0328\7K\2\2\u0328\u0329\7P\2\2\u0329"+
		"\u032a\7K\2\2\u032a\u032b\7V\2\2\u032b\u032c\7K\2\2\u032c\u032d\7C\2\2"+
		"\u032d\u033d\7N\2\2\u032e\u032f\7K\2\2\u032f\u0330\7p\2\2\u0330\u0331"+
		"\7k\2\2\u0331\u0332\7v\2\2\u0332\u0333\7k\2\2\u0333\u0334\7c\2\2\u0334"+
		"\u033d\7n\2\2\u0335\u0336\7k\2\2\u0336\u0337\7p\2\2\u0337\u0338\7k\2\2"+
		"\u0338\u0339\7v\2\2\u0339\u033a\7k\2\2\u033a\u033b\7c\2\2\u033b\u033d"+
		"\7n\2\2\u033c\u0327\3\2\2\2\u033c\u032e\3\2\2\2\u033c\u0335\3\2\2\2\u033d"+
		"\u00c4\3\2\2\2\u033e\u033f\7K\2\2\u033f\u0345\7U\2\2\u0340\u0341\7K\2"+
		"\2\u0341\u0345\7u\2\2\u0342\u0343\7k\2\2\u0343\u0345\7u\2\2\u0344\u033e"+
		"\3\2\2\2\u0344\u0340\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u00c6\3\2\2\2\u0346"+
		"\u0347\7P\2\2\u0347\u0348\7G\2\2\u0348\u0350\7Y\2\2\u0349\u034a\7P\2\2"+
		"\u034a\u034b\7g\2\2\u034b\u0350\7y\2\2\u034c\u034d\7p\2\2\u034d\u034e"+
		"\7g\2\2\u034e\u0350\7y\2\2\u034f\u0346\3\2\2\2\u034f\u0349\3\2\2\2\u034f"+
		"\u034c\3\2\2\2\u0350\u00c8\3\2\2\2\u0351\u0352\7V\2\2\u0352\u0353\7J\2"+
		"\2\u0353\u035b\7G\2\2\u0354\u0355\7V\2\2\u0355\u0356\7j\2\2\u0356\u035b"+
		"\7g\2\2\u0357\u0358\7v\2\2\u0358\u0359\7j\2\2\u0359\u035b\7g\2\2\u035a"+
		"\u0351\3\2\2\2\u035a\u0354\3\2\2\2\u035a\u0357\3\2\2\2\u035b\u00ca\3\2"+
		"\2\2\u035c\u035d\7V\2\2\u035d\u035e\7J\2\2\u035e\u035f\7K\2\2\u035f\u0369"+
		"\7U\2\2\u0360\u0361\7V\2\2\u0361\u0362\7j\2\2\u0362\u0363\7k\2\2\u0363"+
		"\u0369\7u\2\2\u0364\u0365\7v\2\2\u0365\u0366\7j\2\2\u0366\u0367\7k\2\2"+
		"\u0367\u0369\7u\2\2\u0368\u035c\3\2\2\2\u0368\u0360\3\2\2\2\u0368\u0364"+
		"\3\2\2\2\u0369\u00cc\3\2\2\2\u036a\u0372\t\26\2\2\u036b\u036c\7C\2\2\u036c"+
		"\u0372\7P\2\2\u036d\u036e\7C\2\2\u036e\u0372\7p\2\2\u036f\u0370\7c\2\2"+
		"\u0370\u0372\7p\2\2\u0371\u036a\3\2\2\2\u0371\u036b\3\2\2\2\u0371\u036d"+
		"\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u00ce\3\2\2\2\u0373\u0374\7Y\2\2\u0374"+
		"\u0375\7K\2\2\u0375\u0376\7V\2\2\u0376\u0380\7J\2\2\u0377\u0378\7Y\2\2"+
		"\u0378\u0379\7k\2\2\u0379\u037a\7v\2\2\u037a\u0380\7j\2\2\u037b\u037c"+
		"\7y\2\2\u037c\u037d\7k\2\2\u037d\u037e\7v\2\2\u037e\u0380\7j\2\2\u037f"+
		"\u0373\3\2\2\2\u037f\u0377\3\2\2\2\u037f\u037b\3\2\2\2\u0380\u00d0\3\2"+
		"\2\2\u0381\u0382\7V\2\2\u0382\u0383\7[\2\2\u0383\u0384\7R\2\2\u0384\u038e"+
		"\7G\2\2\u0385\u0386\7V\2\2\u0386\u0387\7{\2\2\u0387\u0388\7r\2\2\u0388"+
		"\u038e\7g\2\2\u0389\u038a\7v\2\2\u038a\u038b\7{\2\2\u038b\u038c\7r\2\2"+
		"\u038c\u038e\7g\2\2\u038d\u0381\3\2\2\2\u038d\u0385\3\2\2\2\u038d\u0389"+
		"\3\2\2\2\u038e\u00d2\3\2\2\2\u038f\u0390\7M\2\2\u0390\u0391\7K\2\2\u0391"+
		"\u0392\7P\2\2\u0392\u039c\7F\2\2\u0393\u0394\7M\2\2\u0394\u0395\7k\2\2"+
		"\u0395\u0396\7p\2\2\u0396\u039c\7f\2\2\u0397\u0398\7m\2\2\u0398\u0399"+
		"\7k\2\2\u0399\u039a\7p\2\2\u039a\u039c\7f\2\2\u039b\u038f\3\2\2\2\u039b"+
		"\u0393\3\2\2\2\u039b\u0397\3\2\2\2\u039c\u00d4\3\2\2\2\u039d\u039e\7C"+
		"\2\2\u039e\u03a4\7U\2\2\u039f\u03a0\7C\2\2\u03a0\u03a4\7u\2\2\u03a1\u03a2"+
		"\7c\2\2\u03a2\u03a4\7u\2\2\u03a3\u039d\3\2\2\2\u03a3\u039f\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a4\u00d6\3\2\2\2\u03a5\u03a6\7Q\2\2\u03a6\u03a7\7T\2"+
		"\2\u03a7\u03a8\7F\2\2\u03a8\u03a9\7G\2\2\u03a9\u03aa\7T\2\2\u03aa\u03ab"+
		"\7G\2\2\u03ab\u03bb\7F\2\2\u03ac\u03ad\7Q\2\2\u03ad\u03ae\7t\2\2\u03ae"+
		"\u03af\7f\2\2\u03af\u03b0\7g\2\2\u03b0\u03b1\7t\2\2\u03b1\u03b2\7g\2\2"+
		"\u03b2\u03bb\7f\2\2\u03b3\u03b4\7q\2\2\u03b4\u03b5\7t\2\2\u03b5\u03b6"+
		"\7f\2\2\u03b6\u03b7\7g\2\2\u03b7\u03b8\7t\2\2\u03b8\u03b9\7g\2\2\u03b9"+
		"\u03bb\7f\2\2\u03ba\u03a5\3\2\2\2\u03ba\u03ac\3\2\2\2\u03ba\u03b3\3\2"+
		"\2\2\u03bb\u00d8\3\2\2\2\u03bc\u03bd\7W\2\2\u03bd\u03be\7P\2\2\u03be\u03bf"+
		"\7Q\2\2\u03bf\u03c0\7T\2\2\u03c0\u03c1\7F\2\2\u03c1\u03c2\7G\2\2\u03c2"+
		"\u03c3\7T\2\2\u03c3\u03c4\7G\2\2\u03c4\u03d8\7F\2\2\u03c5\u03c6\7W\2\2"+
		"\u03c6\u03c7\7p\2\2\u03c7\u03c8\7q\2\2\u03c8\u03c9\7t\2\2\u03c9\u03ca"+
		"\7f\2\2\u03ca\u03cb\7g\2\2\u03cb\u03cc\7t\2\2\u03cc\u03cd\7g\2\2\u03cd"+
		"\u03d8\7f\2\2\u03ce\u03cf\7w\2\2\u03cf\u03d0\7p\2\2\u03d0\u03d1\7q\2\2"+
		"\u03d1\u03d2\7t\2\2\u03d2\u03d3\7f\2\2\u03d3\u03d4\7g\2\2\u03d4\u03d5"+
		"\7t\2\2\u03d5\u03d6\7g\2\2\u03d6\u03d8\7f\2\2\u03d7\u03bc\3\2\2\2\u03d7"+
		"\u03c5\3\2\2\2\u03d7\u03ce\3\2\2\2\u03d8\u00da\3\2\2\2\u03d9\u03da\7U"+
		"\2\2\u03da\u03db\7G\2\2\u03db\u03dc\7S\2\2\u03dc\u03dd\7W\2\2\u03dd\u03de"+
		"\7G\2\2\u03de\u03df\7P\2\2\u03df\u03e0\7E\2\2\u03e0\u03f2\7G\2\2\u03e1"+
		"\u03e2\7U\2\2\u03e2\u03e3\7g\2\2\u03e3\u03e4\7s\2\2\u03e4\u03e5\7w\2\2"+
		"\u03e5\u03e6\7g\2\2\u03e6\u03e7\7p\2\2\u03e7\u03e8\7e\2\2\u03e8\u03f2"+
		"\7g\2\2\u03e9\u03ea\7u\2\2\u03ea\u03eb\7g\2\2\u03eb\u03ec\7s\2\2\u03ec"+
		"\u03ed\7w\2\2\u03ed\u03ee\7g\2\2\u03ee\u03ef\7p\2\2\u03ef\u03f0\7e\2\2"+
		"\u03f0\u03f2\7g\2\2\u03f1\u03d9\3\2\2\2\u03f1\u03e1\3\2\2\2\u03f1\u03e9"+
		"\3\2\2\2\u03f2\u00dc\3\2\2\2\u03f3\u03f4\7D\2\2\u03f4\u03f5\7C\2\2\u03f5"+
		"\u03fd\7I\2\2\u03f6\u03f7\7D\2\2\u03f7\u03f8\7c\2\2\u03f8\u03fd\7i\2\2"+
		"\u03f9\u03fa\7d\2\2\u03fa\u03fb\7c\2\2\u03fb\u03fd\7i\2\2\u03fc\u03f3"+
		"\3\2\2\2\u03fc\u03f6\3\2\2\2\u03fc\u03f9\3\2\2\2\u03fd\u00de\3\2\2\2\u03fe"+
		"\u03ff\7U\2\2\u03ff\u0400\7G\2\2\u0400\u0408\7V\2\2\u0401\u0402\7U\2\2"+
		"\u0402\u0403\7g\2\2\u0403\u0408\7v\2\2\u0404\u0405\7u\2\2\u0405\u0406"+
		"\7g\2\2\u0406\u0408\7v\2\2\u0407\u03fe\3\2\2\2\u0407\u0401\3\2\2\2\u0407"+
		"\u0404\3\2\2\2\u0408\u00e0\3\2\2\2\u0409\u040b\t\27\2\2\u040a\u0409\3"+
		"\2\2\2\u040b\u040c\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d"+
		"\u040e\3\2\2\2\u040e\u040f\bq\2\2\u040f\u00e2\3\2\2\2\u0410\u0411\7\61"+
		"\2\2\u0411\u0412\7,\2\2\u0412\u0416\3\2\2\2\u0413\u0415\13\2\2\2\u0414"+
		"\u0413\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0417\3\2\2\2\u0416\u0414\3\2"+
		"\2\2\u0417\u0419\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041a\7,\2\2\u041a"+
		"\u041b\7\61\2\2\u041b\u041c\3\2\2\2\u041c\u041d\br\2\2\u041d\u00e4\3\2"+
		"\2\2\u041e\u041f\7/\2\2\u041f\u0420\7/\2\2\u0420\u0424\3\2\2\2\u0421\u0423"+
		"\n\30\2\2\u0422\u0421\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2\2"+
		"\u0424\u0425\3\2\2\2\u0425\u0427\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u0428"+
		"\bs\2\2\u0428\u00e6\3\2\2\2N\2\u00eb\u00ef\u00f3\u00f7\u00fb\u0102\u0107"+
		"\u0109\u010f\u0113\u0117\u011d\u0122\u012c\u0130\u0136\u013a\u0142\u0146"+
		"\u014c\u0156\u015a\u0160\u0164\u0169\u016c\u016f\u0174\u0177\u017c\u0181"+
		"\u0189\u0194\u0198\u019d\u01a1\u01b1\u01c8\u01ca\u01d7\u01dd\u01e4\u01e8"+
		"\u01ee\u01fb\u0274\u0294\u02ae\u02c5\u02d6\u02e4\u02f2\u02fd\u0305\u030b"+
		"\u0314\u031c\u033c\u0344\u034f\u035a\u0368\u0371\u037f\u038d\u039b\u03a3"+
		"\u03ba\u03d7\u03f1\u03fc\u0407\u040c\u0416\u0424\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}