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
		INT_CONSTANT=1, DOUBLE_CONSTANT=2, TRASH=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "NUMBER", "LETTER", "INT_CONSTANT", 
			"DECIMAL_PART", "NORMAL_DOUBLE", "DOUBLE_CONSTANT", "TRASH"
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
			null, "INT_CONSTANT", "DOUBLE_CONSTANT", "TRASH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\3\2\5\2\36\n\2\3\2\5\2!\n\2\3\3\3\3\3\3\3"+
		"\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7"+
		"\6\66\n\6\f\6\16\69\13\6\3\6\5\6<\n\6\3\7\6\7?\n\7\r\7\16\7@\3\7\3\7\3"+
		"\7\5\7F\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\n\3"+
		"\n\3\n\5\nX\n\n\3\n\3\n\4\31(\2\13\3\2\5\2\7\2\t\2\13\3\r\2\17\2\21\4"+
		"\23\5\3\2\7\3\3\f\f\3\2\62;\4\2C\\c|\3\2\63;\5\2\13\f\17\17\"\"\2_\2\13"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\"\3\2\2\2\7/\3\2\2\2"+
		"\t\61\3\2\2\2\13;\3\2\2\2\rE\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23W\3\2\2"+
		"\2\25\31\7%\2\2\26\30\13\2\2\2\27\26\3\2\2\2\30\33\3\2\2\2\31\32\3\2\2"+
		"\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\34\36\7\17\2\2\35\34\3\2"+
		"\2\2\35\36\3\2\2\2\36 \3\2\2\2\37!\t\2\2\2 \37\3\2\2\2!\4\3\2\2\2\"#\7"+
		"$\2\2#$\7$\2\2$(\7$\2\2%\'\13\2\2\2&%\3\2\2\2\'*\3\2\2\2()\3\2\2\2(&\3"+
		"\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7$\2\2,-\7$\2\2-.\7$\2\2.\6\3\2\2\2/\60\t"+
		"\3\2\2\60\b\3\2\2\2\61\62\t\4\2\2\62\n\3\2\2\2\63\67\t\5\2\2\64\66\5\7"+
		"\4\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28<\3\2\2\29\67"+
		"\3\2\2\2:<\7\62\2\2;\63\3\2\2\2;:\3\2\2\2<\f\3\2\2\2=?\5\7\4\2>=\3\2\2"+
		"\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\t\5\2\2CF\3\2\2\2DF\7\62"+
		"\2\2E>\3\2\2\2ED\3\2\2\2F\16\3\2\2\2GH\7\60\2\2HQ\5\13\6\2IJ\5\13\6\2"+
		"JK\7\60\2\2KQ\3\2\2\2LM\5\13\6\2MN\7\60\2\2NO\5\13\6\2OQ\3\2\2\2PG\3\2"+
		"\2\2PI\3\2\2\2PL\3\2\2\2Q\20\3\2\2\2RS\5\17\b\2S\22\3\2\2\2TX\t\6\2\2"+
		"UX\5\3\2\2VX\5\5\3\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\b\n\2\2"+
		"Z\24\3\2\2\2\r\2\31\35 (\67;@EPW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}