// Generated from c:\Src\TestAmsConfig\Parsers\Grammar\JsonPathLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CURRENT_VALUE=1, RECURSIVE_DESCENT=2, ROOT_VALUE=3, SUBSCRIPT=4, WILDCARD_SUBSCRIPT=5, 
		OR=6, AND=7, EQ=8, GE=9, GT=10, LE=11, LT=12, NE=13, NOT=14, IN=15, NIN=16, 
		SUBSETOF=17, CONTAINS=18, SIZE=19, EMPTY=20, TRUE=21, FALSE=22, NULL=23, 
		BRACE_LEFT=24, BRACE_RIGHT=25, BRACKET_LEFT=26, BRACKET_RIGHT=27, COLON=28, 
		COMMA=29, PAREN_LEFT=30, PAREN_RIGHT=31, QUESTION=32, ID=33, IDQUOTED=34, 
		STRING=35, NUMBER=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CURRENT_VALUE", "RECURSIVE_DESCENT", "ROOT_VALUE", "SUBSCRIPT", "WILDCARD_SUBSCRIPT", 
			"OR", "AND", "EQ", "GE", "GT", "LE", "LT", "NE", "NOT", "IN", "NIN", 
			"SUBSETOF", "CONTAINS", "SIZE", "EMPTY", "TRUE", "FALSE", "NULL", "BRACE_LEFT", 
			"BRACE_RIGHT", "BRACKET_LEFT", "BRACKET_RIGHT", "COLON", "COMMA", "PAREN_LEFT", 
			"PAREN_RIGHT", "QUESTION", "ID", "IDQUOTED", "STRING", "ESC", "UNICODE", 
			"HEX", "SAFECODEPOINT", "NUMBER", "INT", "EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'..'", "'$'", "'.'", "'*'", "'||'", "'&&'", "'=='", "'>='", 
			"'>'", "'<='", "'<'", "'!='", "'!'", "'in'", "'nin'", "'subsetof'", "'contains'", 
			"'size'", "'empty'", "'true'", "'false'", "'null'", "'{'", "'}'", "'['", 
			"']'", "':'", "','", "'('", "')'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CURRENT_VALUE", "RECURSIVE_DESCENT", "ROOT_VALUE", "SUBSCRIPT", 
			"WILDCARD_SUBSCRIPT", "OR", "AND", "EQ", "GE", "GT", "LE", "LT", "NE", 
			"NOT", "IN", "NIN", "SUBSETOF", "CONTAINS", "SIZE", "EMPTY", "TRUE", 
			"FALSE", "NULL", "BRACE_LEFT", "BRACE_RIGHT", "BRACKET_LEFT", "BRACKET_RIGHT", 
			"COLON", "COMMA", "PAREN_LEFT", "PAREN_RIGHT", "QUESTION", "ID", "IDQUOTED", 
			"STRING", "NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public JsonPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonPathLexer.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\7\"\u00c5\n\"\f\"\16\"\u00c8\13\"\3#\3#\3#\3#\3$\3$\3$\7$"+
		"\u00d1\n$\f$\16$\u00d4\13$\3$\3$\3%\3%\3%\5%\u00db\n%\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3(\3(\3)\5)\u00e8\n)\3)\3)\3)\6)\u00ed\n)\r)\16)\u00ee\5)\u00f1"+
		"\n)\3)\5)\u00f4\n)\3*\3*\3*\7*\u00f9\n*\f*\16*\u00fc\13*\5*\u00fe\n*\3"+
		"+\3+\5+\u0102\n+\3+\3+\3,\6,\u0107\n,\r,\16,\u0108\3,\3,\2\2-\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I\2K\2M\2O\2Q&S\2U\2W\'\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\n\2$$\61"+
		"\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\3\2\62;\3\2\63;\4\2GGgg\4\2--/"+
		"/\5\2\13\f\17\17\"\"\2\u0111\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2Q\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2"+
		"\2\2\7^\3\2\2\2\t`\3\2\2\2\13b\3\2\2\2\rd\3\2\2\2\17g\3\2\2\2\21j\3\2"+
		"\2\2\23m\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2\35z\3"+
		"\2\2\2\37|\3\2\2\2!\177\3\2\2\2#\u0083\3\2\2\2%\u008c\3\2\2\2\'\u0095"+
		"\3\2\2\2)\u009a\3\2\2\2+\u00a0\3\2\2\2-\u00a5\3\2\2\2/\u00ab\3\2\2\2\61"+
		"\u00b0\3\2\2\2\63\u00b2\3\2\2\2\65\u00b4\3\2\2\2\67\u00b6\3\2\2\29\u00b8"+
		"\3\2\2\2;\u00ba\3\2\2\2=\u00bc\3\2\2\2?\u00be\3\2\2\2A\u00c0\3\2\2\2C"+
		"\u00c2\3\2\2\2E\u00c9\3\2\2\2G\u00cd\3\2\2\2I\u00d7\3\2\2\2K\u00dc\3\2"+
		"\2\2M\u00e2\3\2\2\2O\u00e4\3\2\2\2Q\u00e7\3\2\2\2S\u00fd\3\2\2\2U\u00ff"+
		"\3\2\2\2W\u0106\3\2\2\2YZ\7B\2\2Z\4\3\2\2\2[\\\7\60\2\2\\]\7\60\2\2]\6"+
		"\3\2\2\2^_\7&\2\2_\b\3\2\2\2`a\7\60\2\2a\n\3\2\2\2bc\7,\2\2c\f\3\2\2\2"+
		"de\7~\2\2ef\7~\2\2f\16\3\2\2\2gh\7(\2\2hi\7(\2\2i\20\3\2\2\2jk\7?\2\2"+
		"kl\7?\2\2l\22\3\2\2\2mn\7@\2\2no\7?\2\2o\24\3\2\2\2pq\7@\2\2q\26\3\2\2"+
		"\2rs\7>\2\2st\7?\2\2t\30\3\2\2\2uv\7>\2\2v\32\3\2\2\2wx\7#\2\2xy\7?\2"+
		"\2y\34\3\2\2\2z{\7#\2\2{\36\3\2\2\2|}\7k\2\2}~\7p\2\2~ \3\2\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\"\3\2\2\2\u0083\u0084"+
		"\7u\2\2\u0084\u0085\7w\2\2\u0085\u0086\7d\2\2\u0086\u0087\7u\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7v\2\2\u0089\u008a\7q\2\2\u008a\u008b\7h\2\2"+
		"\u008b$\3\2\2\2\u008c\u008d\7e\2\2\u008d\u008e\7q\2\2\u008e\u008f\7p\2"+
		"\2\u008f\u0090\7v\2\2\u0090\u0091\7c\2\2\u0091\u0092\7k\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7u\2\2\u0094&\3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097"+
		"\7k\2\2\u0097\u0098\7|\2\2\u0098\u0099\7g\2\2\u0099(\3\2\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7o\2\2\u009c\u009d\7r\2\2\u009d\u009e\7v\2\2\u009e"+
		"\u009f\7{\2\2\u009f*\3\2\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7t\2\2\u00a2"+
		"\u00a3\7w\2\2\u00a3\u00a4\7g\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7h\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa.\3\2\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7n\2"+
		"\2\u00ae\u00af\7n\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7}\2\2\u00b1\62\3\2"+
		"\2\2\u00b2\u00b3\7\177\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7]\2\2\u00b5\66"+
		"\3\2\2\2\u00b6\u00b7\7_\2\2\u00b78\3\2\2\2\u00b8\u00b9\7<\2\2\u00b9:\3"+
		"\2\2\2\u00ba\u00bb\7.\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd>\3\2"+
		"\2\2\u00be\u00bf\7+\2\2\u00bf@\3\2\2\2\u00c0\u00c1\7A\2\2\u00c1B\3\2\2"+
		"\2\u00c2\u00c6\t\2\2\2\u00c3\u00c5\t\3\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7D\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7)\2\2\u00ca\u00cb\5C\"\2\u00cb\u00cc\7)\2"+
		"\2\u00ccF\3\2\2\2\u00cd\u00d2\7$\2\2\u00ce\u00d1\5I%\2\u00cf\u00d1\5O"+
		"(\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d6\7$\2\2\u00d6H\3\2\2\2\u00d7\u00da\7^\2\2\u00d8\u00db"+
		"\t\4\2\2\u00d9\u00db\5K&\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"J\3\2\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\5M\'\2\u00de\u00df\5M\'\2\u00df"+
		"\u00e0\5M\'\2\u00e0\u00e1\5M\'\2\u00e1L\3\2\2\2\u00e2\u00e3\t\5\2\2\u00e3"+
		"N\3\2\2\2\u00e4\u00e5\n\6\2\2\u00e5P\3\2\2\2\u00e6\u00e8\7/\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f0\5S"+
		"*\2\u00ea\u00ec\7\60\2\2\u00eb\u00ed\t\7\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2"+
		"\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f4\5U+\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4R\3\2\2\2\u00f5"+
		"\u00fe\7\62\2\2\u00f6\u00fa\t\b\2\2\u00f7\u00f9\t\7\2\2\u00f8\u00f7\3"+
		"\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f6\3\2"+
		"\2\2\u00feT\3\2\2\2\u00ff\u0101\t\t\2\2\u0100\u0102\t\n\2\2\u0101\u0100"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5S*\2\u0104"+
		"V\3\2\2\2\u0105\u0107\t\13\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\b,\2\2\u010bX\3\2\2\2\17\2\u00c6\u00d0\u00d2\u00da\u00e7\u00ee\u00f0"+
		"\u00f3\u00fa\u00fd\u0101\u0108\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}