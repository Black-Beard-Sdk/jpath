// Generated from c:\Src\TestAmsConfig\Parsers\Grammar\JsonPathParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonPathParser extends Parser {
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
	public static final int
		RULE_jsonpath = 0, RULE_jsonpath_ = 1, RULE_jsonpath__ = 2, RULE_jsonpath_subscript = 3, 
		RULE_subscriptables = 4, RULE_subscriptableArguments = 5, RULE_subscriptableBareword = 6, 
		RULE_jsonPath_identifier = 7, RULE_subscriptable = 8, RULE_sliceable = 9, 
		RULE_sliceableLeft = 10, RULE_sliceableRight = 11, RULE_sliceableBinary = 12, 
		RULE_expression = 13, RULE_binaryOperator = 14, RULE_json = 15, RULE_obj = 16, 
		RULE_pair = 17, RULE_array = 18, RULE_value = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"jsonpath", "jsonpath_", "jsonpath__", "jsonpath_subscript", "subscriptables", 
			"subscriptableArguments", "subscriptableBareword", "jsonPath_identifier", 
			"subscriptable", "sliceable", "sliceableLeft", "sliceableRight", "sliceableBinary", 
			"expression", "binaryOperator", "json", "obj", "pair", "array", "value"
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

	@Override
	public String getGrammarFileName() { return "JsonPathParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JsonpathContext extends ParserRuleContext {
		public TerminalNode ROOT_VALUE() { return getToken(JsonPathParser.ROOT_VALUE, 0); }
		public TerminalNode EOF() { return getToken(JsonPathParser.EOF, 0); }
		public Jsonpath_subscriptContext jsonpath_subscript() {
			return getRuleContext(Jsonpath_subscriptContext.class,0);
		}
		public JsonpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonpath; }
	}

	public final JsonpathContext jsonpath() throws RecognitionException {
		JsonpathContext _localctx = new JsonpathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jsonpath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ROOT_VALUE);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RECURSIVE_DESCENT) | (1L << SUBSCRIPT) | (1L << BRACKET_LEFT))) != 0)) {
				{
				setState(41);
				jsonpath_subscript();
				}
			}

			setState(44);
			match(EOF);
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

	public static class Jsonpath_Context extends ParserRuleContext {
		public TerminalNode ROOT_VALUE() { return getToken(JsonPathParser.ROOT_VALUE, 0); }
		public TerminalNode CURRENT_VALUE() { return getToken(JsonPathParser.CURRENT_VALUE, 0); }
		public Jsonpath_subscriptContext jsonpath_subscript() {
			return getRuleContext(Jsonpath_subscriptContext.class,0);
		}
		public Jsonpath_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonpath_; }
	}

	public final Jsonpath_Context jsonpath_() throws RecognitionException {
		Jsonpath_Context _localctx = new Jsonpath_Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_jsonpath_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==CURRENT_VALUE || _la==ROOT_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(47);
				jsonpath_subscript();
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

	public static class Jsonpath__Context extends ParserRuleContext {
		public Jsonpath_Context jsonpath_() {
			return getRuleContext(Jsonpath_Context.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Jsonpath__Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonpath__; }
	}

	public final Jsonpath__Context jsonpath__() throws RecognitionException {
		Jsonpath__Context _localctx = new Jsonpath__Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_jsonpath__);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT_VALUE:
			case ROOT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				jsonpath_();
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case BRACE_LEFT:
			case BRACKET_LEFT:
			case IDQUOTED:
			case STRING:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				value();
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

	public static class Jsonpath_subscriptContext extends ParserRuleContext {
		public TerminalNode RECURSIVE_DESCENT() { return getToken(JsonPathParser.RECURSIVE_DESCENT, 0); }
		public SubscriptableBarewordContext subscriptableBareword() {
			return getRuleContext(SubscriptableBarewordContext.class,0);
		}
		public SubscriptablesContext subscriptables() {
			return getRuleContext(SubscriptablesContext.class,0);
		}
		public Jsonpath_subscriptContext jsonpath_subscript() {
			return getRuleContext(Jsonpath_subscriptContext.class,0);
		}
		public TerminalNode SUBSCRIPT() { return getToken(JsonPathParser.SUBSCRIPT, 0); }
		public Jsonpath_subscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonpath_subscript; }
	}

	public final Jsonpath_subscriptContext jsonpath_subscript() throws RecognitionException {
		Jsonpath_subscriptContext _localctx = new Jsonpath_subscriptContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jsonpath_subscript);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECURSIVE_DESCENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(RECURSIVE_DESCENT);
				setState(57);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WILDCARD_SUBSCRIPT:
				case IN:
				case NIN:
				case SUBSETOF:
				case CONTAINS:
				case SIZE:
				case EMPTY:
				case TRUE:
				case FALSE:
				case ID:
					{
					setState(55);
					subscriptableBareword();
					}
					break;
				case BRACKET_LEFT:
					{
					setState(56);
					subscriptables();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(59);
					jsonpath_subscript();
					}
					break;
				}
				}
				break;
			case SUBSCRIPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(SUBSCRIPT);
				setState(63);
				subscriptableBareword();
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(64);
					jsonpath_subscript();
					}
					break;
				}
				}
				break;
			case BRACKET_LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				subscriptables();
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(68);
					jsonpath_subscript();
					}
					break;
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

	public static class SubscriptablesContext extends ParserRuleContext {
		public TerminalNode BRACKET_LEFT() { return getToken(JsonPathParser.BRACKET_LEFT, 0); }
		public List<SubscriptableContext> subscriptable() {
			return getRuleContexts(SubscriptableContext.class);
		}
		public SubscriptableContext subscriptable(int i) {
			return getRuleContext(SubscriptableContext.class,i);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(JsonPathParser.BRACKET_RIGHT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JsonPathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JsonPathParser.COMMA, i);
		}
		public SubscriptablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptables; }
	}

	public final SubscriptablesContext subscriptables() throws RecognitionException {
		SubscriptablesContext _localctx = new SubscriptablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subscriptables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(BRACKET_LEFT);
			setState(74);
			subscriptable();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				subscriptable();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(BRACKET_RIGHT);
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

	public static class SubscriptableArgumentsContext extends ParserRuleContext {
		public TerminalNode PAREN_LEFT() { return getToken(JsonPathParser.PAREN_LEFT, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(JsonPathParser.PAREN_RIGHT, 0); }
		public List<Jsonpath__Context> jsonpath__() {
			return getRuleContexts(Jsonpath__Context.class);
		}
		public Jsonpath__Context jsonpath__(int i) {
			return getRuleContext(Jsonpath__Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JsonPathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JsonPathParser.COMMA, i);
		}
		public SubscriptableArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptableArguments; }
	}

	public final SubscriptableArgumentsContext subscriptableArguments() throws RecognitionException {
		SubscriptableArgumentsContext _localctx = new SubscriptableArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subscriptableArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(PAREN_LEFT);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURRENT_VALUE) | (1L << ROOT_VALUE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << BRACE_LEFT) | (1L << BRACKET_LEFT) | (1L << IDQUOTED) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(85);
				jsonpath__();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(86);
					match(COMMA);
					setState(87);
					jsonpath__();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(95);
			match(PAREN_RIGHT);
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

	public static class SubscriptableBarewordContext extends ParserRuleContext {
		public JsonPath_identifierContext jsonPath_identifier() {
			return getRuleContext(JsonPath_identifierContext.class,0);
		}
		public SubscriptableArgumentsContext subscriptableArguments() {
			return getRuleContext(SubscriptableArgumentsContext.class,0);
		}
		public TerminalNode WILDCARD_SUBSCRIPT() { return getToken(JsonPathParser.WILDCARD_SUBSCRIPT, 0); }
		public SubscriptableBarewordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptableBareword; }
	}

	public final SubscriptableBarewordContext subscriptableBareword() throws RecognitionException {
		SubscriptableBarewordContext _localctx = new SubscriptableBarewordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subscriptableBareword);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
			case NIN:
			case SUBSETOF:
			case CONTAINS:
			case SIZE:
			case EMPTY:
			case TRUE:
			case FALSE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				jsonPath_identifier();
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(98);
					subscriptableArguments();
					}
					break;
				}
				}
				break;
			case WILDCARD_SUBSCRIPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(WILDCARD_SUBSCRIPT);
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

	public static class JsonPath_identifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JsonPathParser.ID, 0); }
		public TerminalNode IN() { return getToken(JsonPathParser.IN, 0); }
		public TerminalNode NIN() { return getToken(JsonPathParser.NIN, 0); }
		public TerminalNode SUBSETOF() { return getToken(JsonPathParser.SUBSETOF, 0); }
		public TerminalNode CONTAINS() { return getToken(JsonPathParser.CONTAINS, 0); }
		public TerminalNode SIZE() { return getToken(JsonPathParser.SIZE, 0); }
		public TerminalNode EMPTY() { return getToken(JsonPathParser.EMPTY, 0); }
		public TerminalNode TRUE() { return getToken(JsonPathParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JsonPathParser.FALSE, 0); }
		public JsonPath_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonPath_identifier; }
	}

	public final JsonPath_identifierContext jsonPath_identifier() throws RecognitionException {
		JsonPath_identifierContext _localctx = new JsonPath_identifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jsonPath_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NIN) | (1L << SUBSETOF) | (1L << CONTAINS) | (1L << SIZE) | (1L << EMPTY) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SubscriptableContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JsonPathParser.STRING, 0); }
		public SliceableContext sliceable() {
			return getRuleContext(SliceableContext.class,0);
		}
		public TerminalNode WILDCARD_SUBSCRIPT() { return getToken(JsonPathParser.WILDCARD_SUBSCRIPT, 0); }
		public TerminalNode QUESTION() { return getToken(JsonPathParser.QUESTION, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(JsonPathParser.PAREN_LEFT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(JsonPathParser.PAREN_RIGHT, 0); }
		public Jsonpath_Context jsonpath_() {
			return getRuleContext(Jsonpath_Context.class,0);
		}
		public TerminalNode IDQUOTED() { return getToken(JsonPathParser.IDQUOTED, 0); }
		public SubscriptableArgumentsContext subscriptableArguments() {
			return getRuleContext(SubscriptableArgumentsContext.class,0);
		}
		public SubscriptableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptable; }
	}

	public final SubscriptableContext subscriptable() throws RecognitionException {
		SubscriptableContext _localctx = new SubscriptableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subscriptable);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(STRING);
				}
				break;
			case COLON:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				sliceable();
				}
				break;
			case WILDCARD_SUBSCRIPT:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(WILDCARD_SUBSCRIPT);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(QUESTION);
				setState(110);
				match(PAREN_LEFT);
				setState(111);
				expression(0);
				setState(112);
				match(PAREN_RIGHT);
				}
				break;
			case CURRENT_VALUE:
			case ROOT_VALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				jsonpath_();
				}
				break;
			case IDQUOTED:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(IDQUOTED);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAREN_LEFT) {
					{
					setState(116);
					subscriptableArguments();
					}
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

	public static class SliceableContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JsonPathParser.NUMBER, 0); }
		public SliceableLeftContext sliceableLeft() {
			return getRuleContext(SliceableLeftContext.class,0);
		}
		public SliceableRightContext sliceableRight() {
			return getRuleContext(SliceableRightContext.class,0);
		}
		public SliceableBinaryContext sliceableBinary() {
			return getRuleContext(SliceableBinaryContext.class,0);
		}
		public SliceableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceable; }
	}

	public final SliceableContext sliceable() throws RecognitionException {
		SliceableContext _localctx = new SliceableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sliceable);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				sliceableLeft();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				sliceableRight();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				sliceableBinary();
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

	public static class SliceableLeftContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JsonPathParser.NUMBER, 0); }
		public TerminalNode COLON() { return getToken(JsonPathParser.COLON, 0); }
		public SliceableLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceableLeft; }
	}

	public final SliceableLeftContext sliceableLeft() throws RecognitionException {
		SliceableLeftContext _localctx = new SliceableLeftContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sliceableLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NUMBER);
			setState(128);
			match(COLON);
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

	public static class SliceableRightContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(JsonPathParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(JsonPathParser.NUMBER, 0); }
		public SliceableRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceableRight; }
	}

	public final SliceableRightContext sliceableRight() throws RecognitionException {
		SliceableRightContext _localctx = new SliceableRightContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sliceableRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(COLON);
			setState(131);
			match(NUMBER);
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

	public static class SliceableBinaryContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(JsonPathParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JsonPathParser.NUMBER, i);
		}
		public TerminalNode COLON() { return getToken(JsonPathParser.COLON, 0); }
		public SliceableBinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceableBinary; }
	}

	public final SliceableBinaryContext sliceableBinary() throws RecognitionException {
		SliceableBinaryContext _localctx = new SliceableBinaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sliceableBinary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(NUMBER);
			setState(134);
			match(COLON);
			setState(135);
			match(NUMBER);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Jsonpath__Context jsonpath__() {
			return getRuleContext(Jsonpath__Context.class,0);
		}
		public TerminalNode NOT() { return getToken(JsonPathParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAREN_LEFT() { return getToken(JsonPathParser.PAREN_LEFT, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(JsonPathParser.PAREN_RIGHT, 0); }
		public List<BinaryOperatorContext> binaryOperator() {
			return getRuleContexts(BinaryOperatorContext.class);
		}
		public BinaryOperatorContext binaryOperator(int i) {
			return getRuleContext(BinaryOperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT_VALUE:
			case ROOT_VALUE:
			case TRUE:
			case FALSE:
			case NULL:
			case BRACE_LEFT:
			case BRACKET_LEFT:
			case IDQUOTED:
			case STRING:
			case NUMBER:
				{
				setState(138);
				jsonpath__();
				}
				break;
			case NOT:
				{
				setState(139);
				match(NOT);
				setState(140);
				expression(3);
				}
				break;
			case PAREN_LEFT:
				{
				setState(141);
				match(PAREN_LEFT);
				setState(142);
				expression(0);
				setState(143);
				match(PAREN_RIGHT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(151); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(148);
							binaryOperator();
							setState(149);
							expression(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(153); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(JsonPathParser.AND, 0); }
		public TerminalNode OR() { return getToken(JsonPathParser.OR, 0); }
		public TerminalNode EQ() { return getToken(JsonPathParser.EQ, 0); }
		public TerminalNode NE() { return getToken(JsonPathParser.NE, 0); }
		public TerminalNode LT() { return getToken(JsonPathParser.LT, 0); }
		public TerminalNode LE() { return getToken(JsonPathParser.LE, 0); }
		public TerminalNode GT() { return getToken(JsonPathParser.GT, 0); }
		public TerminalNode GE() { return getToken(JsonPathParser.GE, 0); }
		public TerminalNode IN() { return getToken(JsonPathParser.IN, 0); }
		public TerminalNode NIN() { return getToken(JsonPathParser.NIN, 0); }
		public TerminalNode SUBSETOF() { return getToken(JsonPathParser.SUBSETOF, 0); }
		public TerminalNode CONTAINS() { return getToken(JsonPathParser.CONTAINS, 0); }
		public TerminalNode SIZE() { return getToken(JsonPathParser.SIZE, 0); }
		public TerminalNode EMPTY() { return getToken(JsonPathParser.EMPTY, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << EQ) | (1L << GE) | (1L << GT) | (1L << LE) | (1L << LT) | (1L << NE) | (1L << IN) | (1L << NIN) | (1L << SUBSETOF) | (1L << CONTAINS) | (1L << SIZE) | (1L << EMPTY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			value();
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

	public static class ObjContext extends ParserRuleContext {
		public TerminalNode BRACE_LEFT() { return getToken(JsonPathParser.BRACE_LEFT, 0); }
		public TerminalNode BRACE_RIGHT() { return getToken(JsonPathParser.BRACE_RIGHT, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JsonPathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JsonPathParser.COMMA, i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(BRACE_LEFT);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(165);
				pair();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(166);
					match(COMMA);
					setState(167);
					pair();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(175);
			match(BRACE_RIGHT);
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

	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JsonPathParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(JsonPathParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(STRING);
			setState(178);
			match(COLON);
			setState(179);
			value();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode BRACKET_LEFT() { return getToken(JsonPathParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(JsonPathParser.BRACKET_RIGHT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JsonPathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JsonPathParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(BRACKET_LEFT);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << BRACE_LEFT) | (1L << BRACKET_LEFT) | (1L << IDQUOTED) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(182);
				value();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(183);
					match(COMMA);
					setState(184);
					value();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(192);
			match(BRACKET_RIGHT);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JsonPathParser.STRING, 0); }
		public TerminalNode IDQUOTED() { return getToken(JsonPathParser.IDQUOTED, 0); }
		public TerminalNode NUMBER() { return getToken(JsonPathParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(JsonPathParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JsonPathParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JsonPathParser.NULL, 0); }
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(STRING);
				}
				break;
			case IDQUOTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(IDQUOTED);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(NUMBER);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				match(NULL);
				}
				break;
			case BRACE_LEFT:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				obj();
				}
				break;
			case BRACKET_LEFT:
				enterOuterAlt(_localctx, 8);
				{
				setState(201);
				array();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2-\n\2\3\2\3\2\3\3\3\3\5\3\63"+
		"\n\3\3\4\3\4\5\4\67\n\4\3\5\3\5\3\5\5\5<\n\5\3\5\5\5?\n\5\3\5\3\5\3\5"+
		"\5\5D\n\5\3\5\3\5\5\5H\n\5\5\5J\n\5\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6"+
		"S\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\5\7`\n\7\3\7\3"+
		"\7\3\b\3\b\5\bf\n\b\3\b\5\bi\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\nx\n\n\5\nz\n\n\3\13\3\13\3\13\3\13\5\13\u0080\n\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0094\n\17\3\17\3\17\3\17\3\17\6\17\u009a\n\17\r\17"+
		"\16\17\u009b\7\17\u009e\n\17\f\17\16\17\u00a1\13\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\7\22\u00ab\n\22\f\22\16\22\u00ae\13\22\5\22\u00b0"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00bc\n\24"+
		"\f\24\16\24\u00bf\13\24\5\24\u00c1\n\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00cd\n\25\3\25\2\3\34\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\5\4\2\3\3\5\5\4\2\21\30##\4\2\b\17\21\26"+
		"\2\u00e0\2*\3\2\2\2\4\60\3\2\2\2\6\66\3\2\2\2\bI\3\2\2\2\nK\3\2\2\2\f"+
		"V\3\2\2\2\16h\3\2\2\2\20j\3\2\2\2\22y\3\2\2\2\24\177\3\2\2\2\26\u0081"+
		"\3\2\2\2\30\u0084\3\2\2\2\32\u0087\3\2\2\2\34\u0093\3\2\2\2\36\u00a2\3"+
		"\2\2\2 \u00a4\3\2\2\2\"\u00a6\3\2\2\2$\u00b3\3\2\2\2&\u00b7\3\2\2\2(\u00cc"+
		"\3\2\2\2*,\7\5\2\2+-\5\b\5\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\2\2\3/"+
		"\3\3\2\2\2\60\62\t\2\2\2\61\63\5\b\5\2\62\61\3\2\2\2\62\63\3\2\2\2\63"+
		"\5\3\2\2\2\64\67\5\4\3\2\65\67\5(\25\2\66\64\3\2\2\2\66\65\3\2\2\2\67"+
		"\7\3\2\2\28;\7\4\2\29<\5\16\b\2:<\5\n\6\2;9\3\2\2\2;:\3\2\2\2<>\3\2\2"+
		"\2=?\5\b\5\2>=\3\2\2\2>?\3\2\2\2?J\3\2\2\2@A\7\6\2\2AC\5\16\b\2BD\5\b"+
		"\5\2CB\3\2\2\2CD\3\2\2\2DJ\3\2\2\2EG\5\n\6\2FH\5\b\5\2GF\3\2\2\2GH\3\2"+
		"\2\2HJ\3\2\2\2I8\3\2\2\2I@\3\2\2\2IE\3\2\2\2J\t\3\2\2\2KL\7\34\2\2LQ\5"+
		"\22\n\2MN\7\37\2\2NP\5\22\n\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2"+
		"RT\3\2\2\2SQ\3\2\2\2TU\7\35\2\2U\13\3\2\2\2V_\7 \2\2W\\\5\6\4\2XY\7\37"+
		"\2\2Y[\5\6\4\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\"+
		"\3\2\2\2_W\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7!\2\2b\r\3\2\2\2ce\5\20\t\2"+
		"df\5\f\7\2ed\3\2\2\2ef\3\2\2\2fi\3\2\2\2gi\7\7\2\2hc\3\2\2\2hg\3\2\2\2"+
		"i\17\3\2\2\2jk\t\3\2\2k\21\3\2\2\2lz\7%\2\2mz\5\24\13\2nz\7\7\2\2op\7"+
		"\"\2\2pq\7 \2\2qr\5\34\17\2rs\7!\2\2sz\3\2\2\2tz\5\4\3\2uw\7$\2\2vx\5"+
		"\f\7\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2yl\3\2\2\2ym\3\2\2\2yn\3\2\2\2yo\3"+
		"\2\2\2yt\3\2\2\2yu\3\2\2\2z\23\3\2\2\2{\u0080\7&\2\2|\u0080\5\26\f\2}"+
		"\u0080\5\30\r\2~\u0080\5\32\16\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2"+
		"\2\177~\3\2\2\2\u0080\25\3\2\2\2\u0081\u0082\7&\2\2\u0082\u0083\7\36\2"+
		"\2\u0083\27\3\2\2\2\u0084\u0085\7\36\2\2\u0085\u0086\7&\2\2\u0086\31\3"+
		"\2\2\2\u0087\u0088\7&\2\2\u0088\u0089\7\36\2\2\u0089\u008a\7&\2\2\u008a"+
		"\33\3\2\2\2\u008b\u008c\b\17\1\2\u008c\u0094\5\6\4\2\u008d\u008e\7\20"+
		"\2\2\u008e\u0094\5\34\17\5\u008f\u0090\7 \2\2\u0090\u0091\5\34\17\2\u0091"+
		"\u0092\7!\2\2\u0092\u0094\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008d\3\2"+
		"\2\2\u0093\u008f\3\2\2\2\u0094\u009f\3\2\2\2\u0095\u0099\f\3\2\2\u0096"+
		"\u0097\5\36\20\2\u0097\u0098\5\34\17\2\u0098\u009a\3\2\2\2\u0099\u0096"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u0095\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3"+
		"\t\4\2\2\u00a3\37\3\2\2\2\u00a4\u00a5\5(\25\2\u00a5!\3\2\2\2\u00a6\u00af"+
		"\7\32\2\2\u00a7\u00ac\5$\23\2\u00a8\u00a9\7\37\2\2\u00a9\u00ab\5$\23\2"+
		"\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00a7\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\33\2\2\u00b2#\3\2\2\2"+
		"\u00b3\u00b4\7%\2\2\u00b4\u00b5\7\36\2\2\u00b5\u00b6\5(\25\2\u00b6%\3"+
		"\2\2\2\u00b7\u00c0\7\34\2\2\u00b8\u00bd\5(\25\2\u00b9\u00ba\7\37\2\2\u00ba"+
		"\u00bc\5(\25\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00b8\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\35"+
		"\2\2\u00c3\'\3\2\2\2\u00c4\u00cd\7%\2\2\u00c5\u00cd\7$\2\2\u00c6\u00cd"+
		"\7&\2\2\u00c7\u00cd\7\27\2\2\u00c8\u00cd\7\30\2\2\u00c9\u00cd\7\31\2\2"+
		"\u00ca\u00cd\5\"\22\2\u00cb\u00cd\5&\24\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5"+
		"\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc"+
		"\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd)\3\2\2\2"+
		"\32,\62\66;>CGIQ\\_ehwy\177\u0093\u009b\u009f\u00ac\u00af\u00bd\u00c0"+
		"\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}