// Generated from C:/Users/Elías Llera/IdeaProjects/DLP-compiler/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_CONSTANT=1, REAL_CONSTANT=2, CHAR_CONSTANT=3, ID=4, TRASH=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "NUMBER", "LETTER", "INT_CONSTANT", 
			"DECIMAL_PART", "NORMAL_DOUBLE", "EXPONENT_DOUBLE", "REAL_CONSTANT", 
			"ASCII_CODE", "CHAR_CONSTANT", "ID", "TRASH"
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
			null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID", "TRASH"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7\u008b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\5"+
		"\2&\n\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\6\5\6D\n\6"+
		"\3\7\7\7G\n\7\f\7\16\7J\13\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\5\t]\n\t\3\t\3\t\5\ta\n\t\3\t\3\t\3\n\3"+
		"\n\5\ng\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fu"+
		"\n\f\3\f\3\f\3\r\3\r\5\r{\n\r\3\r\3\r\3\r\7\r\u0080\n\r\f\r\16\r\u0083"+
		"\13\r\3\16\3\16\3\16\5\16\u0088\n\16\3\16\3\16\4!\60\2\17\3\2\5\2\7\2"+
		"\t\2\13\3\r\2\17\2\21\2\23\4\25\2\27\5\31\6\33\7\3\2\t\3\3\f\f\3\2\62"+
		";\4\2C\\c|\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\2\u0097\2\13\3\2"+
		"\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2"+
		"\5*\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13C\3\2\2\2\rM\3\2\2\2\17X\3\2\2\2"+
		"\21\\\3\2\2\2\23f\3\2\2\2\25h\3\2\2\2\27m\3\2\2\2\31z\3\2\2\2\33\u0087"+
		"\3\2\2\2\35!\7%\2\2\36 \13\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\"\3\2\2\2!\37"+
		"\3\2\2\2\"%\3\2\2\2#!\3\2\2\2$&\7\17\2\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2"+
		"\')\t\2\2\2(\'\3\2\2\2)\4\3\2\2\2*+\7$\2\2+,\7$\2\2,\60\7$\2\2-/\13\2"+
		"\2\2.-\3\2\2\2/\62\3\2\2\2\60\61\3\2\2\2\60.\3\2\2\2\61\63\3\2\2\2\62"+
		"\60\3\2\2\2\63\64\7$\2\2\64\65\7$\2\2\65\66\7$\2\2\66\6\3\2\2\2\678\t"+
		"\3\2\28\b\3\2\2\29:\t\4\2\2:\n\3\2\2\2;?\t\5\2\2<>\5\7\4\2=<\3\2\2\2>"+
		"A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@D\3\2\2\2A?\3\2\2\2BD\7\62\2\2C;\3\2\2\2"+
		"CB\3\2\2\2D\f\3\2\2\2EG\5\7\4\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2"+
		"\2IK\3\2\2\2JH\3\2\2\2KN\t\5\2\2LN\7\62\2\2MH\3\2\2\2ML\3\2\2\2N\16\3"+
		"\2\2\2OP\5\13\6\2PQ\7\60\2\2QR\5\r\7\2RY\3\2\2\2ST\7\60\2\2TY\5\r\7\2"+
		"UV\5\13\6\2VW\7\60\2\2WY\3\2\2\2XO\3\2\2\2XS\3\2\2\2XU\3\2\2\2Y\20\3\2"+
		"\2\2Z]\5\17\b\2[]\5\13\6\2\\Z\3\2\2\2\\[\3\2\2\2]^\3\2\2\2^`\t\6\2\2_"+
		"a\t\7\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5\13\6\2c\22\3\2\2\2dg\5\17"+
		"\b\2eg\5\21\t\2fd\3\2\2\2fe\3\2\2\2g\24\3\2\2\2hi\7^\2\2ij\5\7\4\2jk\5"+
		"\7\4\2kl\5\7\4\2l\26\3\2\2\2mt\7)\2\2nu\13\2\2\2op\7^\2\2pu\7p\2\2qr\7"+
		"^\2\2ru\7v\2\2su\5\25\13\2tn\3\2\2\2to\3\2\2\2tq\3\2\2\2ts\3\2\2\2uv\3"+
		"\2\2\2vw\7)\2\2w\30\3\2\2\2x{\7a\2\2y{\5\t\5\2zx\3\2\2\2zy\3\2\2\2{\u0081"+
		"\3\2\2\2|\u0080\7a\2\2}\u0080\5\t\5\2~\u0080\5\7\4\2\177|\3\2\2\2\177"+
		"}\3\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\32\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088\t\b\2\2\u0085"+
		"\u0088\5\3\2\2\u0086\u0088\5\5\3\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\16\2\2\u008a"+
		"\34\3\2\2\2\24\2!%(\60?CHMX\\`ftz\177\u0081\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}