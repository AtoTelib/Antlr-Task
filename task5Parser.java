// Generated from C:/Users/Admin/IdeaProjects/P17_40_1564_Abdelrahman_Sabri/src\task5.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class task5Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Output1=1, Output2=2, Output_1=3, Output_2=4, Output_3=5, Output_4=6, 
		Output_5=7, Output_6=8, Output_7=9;
	public static final int
		RULE_start = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Output1", "Output2", "Output_1", "Output_2", "Output_3", "Output_4", 
			"Output_5", "Output_6", "Output_7"
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
	public String getGrammarFileName() { return "task5.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public task5Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(task5Parser.EOF, 0); }
		public List<TerminalNode> Output1() { return getTokens(task5Parser.Output1); }
		public TerminalNode Output1(int i) {
			return getToken(task5Parser.Output1, i);
		}
		public List<TerminalNode> Output2() { return getTokens(task5Parser.Output2); }
		public TerminalNode Output2(int i) {
			return getToken(task5Parser.Output2, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof task5Listener ) ((task5Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof task5Listener ) ((task5Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof task5Visitor ) return ((task5Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(4);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Output1:
					{
					{
					{
					setState(2);
					match(Output1);
					}
					}
					}
					break;
				case Output2:
					{
					{
					{
					setState(3);
					match(Output2);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(6); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Output1 || _la==Output2 );
			setState(8);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\r\4\2\t\2\3\2"+
		"\3\2\6\2\7\n\2\r\2\16\2\b\3\2\3\2\3\2\2\2\3\2\2\2\2\r\2\6\3\2\2\2\4\7"+
		"\7\3\2\2\5\7\7\4\2\2\6\4\3\2\2\2\6\5\3\2\2\2\7\b\3\2\2\2\b\6\3\2\2\2\b"+
		"\t\3\2\2\2\t\n\3\2\2\2\n\13\7\2\2\3\13\3\3\2\2\2\4\6\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}