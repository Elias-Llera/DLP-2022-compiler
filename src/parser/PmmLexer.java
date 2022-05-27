// Generated from C:/Users/Elías Llera/IdeaProjects/DLP-compiler/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.*;
import ast.definition.*;
import ast.expression.*;
import ast.expression.binary.*;
import ast.expression.unary.*;
import ast.expression.value.*;
import ast.statement.*;
import ast.type.*;
import errorhandler.*;
import parser.*;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT_CONSTANT=39, BOOL_CONSTANT=40, REAL_CONSTANT=41, CHAR_CONSTANT=42, 
		ID=43, TRASH=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"NUMBER", "LETTER", "INT_CONSTANT", "BOOL_CONSTANT", "DECIMAL_PART", 
			"NORMAL_DOUBLE", "EXPONENT_DOUBLE", "REAL_CONSTANT", "ASCII_CODE", "CHAR_CONSTANT", 
			"ID", "TRASH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "','", "';'", 
			"'print'", "'input'", "'='", "'if'", "'else'", "'while'", "'return'", 
			"'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>='", 
			"'>'", "'<='", "'<'", "'!='", "'=='", "'&&'", "'||'", "'char'", "'int'", 
			"'double'", "'boolean'", "'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT_CONSTANT", "BOOL_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"ID", "TRASH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0165\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\7(\u00ef\n(\f(\16(\u00f2\13(\3(\5(\u00f5\n(\3(\5(\u00f8\n(\3)\3)"+
		"\3)\3)\7)\u00fe\n)\f)\16)\u0101\13)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\7,\u010d"+
		"\n,\f,\16,\u0110\13,\3,\5,\u0113\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u011e"+
		"\n-\3.\7.\u0121\n.\f.\16.\u0124\13.\3.\3.\5.\u0128\n.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\5/\u0133\n/\3\60\3\60\5\60\u0137\n\60\3\60\3\60\5\60\u013b"+
		"\n\60\3\60\3\60\3\61\3\61\5\61\u0141\n\61\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u014f\n\63\3\63\3\63\3\64\3\64\5\64"+
		"\u0155\n\64\3\64\3\64\3\64\7\64\u015a\n\64\f\64\16\64\u015d\13\64\3\65"+
		"\3\65\3\65\5\65\u0162\n\65\3\65\3\65\4\u00f0\u00ff\2\66\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O\2Q\2S\2U\2W)Y*[\2]\2_\2a+c\2e,g-i.\3\2\t\3\3\f\f\3\2\62;\4\2"+
		"C\\c|\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\2\u0172\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2a\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5o\3\2\2\2\7t\3\2\2\2\tv\3\2\2\2\13x\3\2"+
		"\2\2\rz\3\2\2\2\17|\3\2\2\2\21~\3\2\2\2\23\u0080\3\2\2\2\25\u0082\3\2"+
		"\2\2\27\u0088\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0093\3\2\2"+
		"\2\37\u0098\3\2\2\2!\u009e\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00a9"+
		"\3\2\2\2)\u00ab\3\2\2\2+\u00ad\3\2\2\2-\u00af\3\2\2\2/\u00b1\3\2\2\2\61"+
		"\u00b3\3\2\2\2\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00ba\3\2\2\29\u00bc"+
		"\3\2\2\2;\u00bf\3\2\2\2=\u00c1\3\2\2\2?\u00c4\3\2\2\2A\u00c7\3\2\2\2C"+
		"\u00ca\3\2\2\2E\u00cd\3\2\2\2G\u00d2\3\2\2\2I\u00d6\3\2\2\2K\u00dd\3\2"+
		"\2\2M\u00e5\3\2\2\2O\u00ec\3\2\2\2Q\u00f9\3\2\2\2S\u0106\3\2\2\2U\u0108"+
		"\3\2\2\2W\u0112\3\2\2\2Y\u011d\3\2\2\2[\u0127\3\2\2\2]\u0132\3\2\2\2_"+
		"\u0136\3\2\2\2a\u0140\3\2\2\2c\u0142\3\2\2\2e\u0147\3\2\2\2g\u0154\3\2"+
		"\2\2i\u0161\3\2\2\2kl\7f\2\2lm\7g\2\2mn\7h\2\2n\4\3\2\2\2op\7o\2\2pq\7"+
		"c\2\2qr\7k\2\2rs\7p\2\2s\6\3\2\2\2tu\7*\2\2u\b\3\2\2\2vw\7+\2\2w\n\3\2"+
		"\2\2xy\7<\2\2y\f\3\2\2\2z{\7}\2\2{\16\3\2\2\2|}\7\177\2\2}\20\3\2\2\2"+
		"~\177\7.\2\2\177\22\3\2\2\2\u0080\u0081\7=\2\2\u0081\24\3\2\2\2\u0082"+
		"\u0083\7r\2\2\u0083\u0084\7t\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2"+
		"\u0086\u0087\7v\2\2\u0087\26\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7"+
		"p\2\2\u008a\u008b\7r\2\2\u008b\u008c\7w\2\2\u008c\u008d\7v\2\2\u008d\30"+
		"\3\2\2\2\u008e\u008f\7?\2\2\u008f\32\3\2\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7h\2\2\u0092\34\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\36\3\2\2\2\u0098\u0099\7y\2\2\u0099"+
		"\u009a\7j\2\2\u009a\u009b\7k\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2"+
		"\u009d \3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7v\2"+
		"\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7p\2\2\u00a4\"\3"+
		"\2\2\2\u00a5\u00a6\7]\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7_\2\2\u00a8&\3\2"+
		"\2\2\u00a9\u00aa\7\60\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac*\3\2"+
		"\2\2\u00ad\u00ae\7#\2\2\u00ae,\3\2\2\2\u00af\u00b0\7,\2\2\u00b0.\3\2\2"+
		"\2\u00b1\u00b2\7\61\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7\'\2\2\u00b4\62"+
		"\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb8\3\2\2\2\u00bc"+
		"\u00bd\7>\2\2\u00bd\u00be\7?\2\2\u00be:\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0"+
		"<\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c3\7?\2\2\u00c3>\3\2\2\2\u00c4\u00c5"+
		"\7?\2\2\u00c5\u00c6\7?\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8\u00c9"+
		"\7(\2\2\u00c9B\3\2\2\2\u00ca\u00cb\7~\2\2\u00cb\u00cc\7~\2\2\u00ccD\3"+
		"\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7c\2\2\u00d0"+
		"\u00d1\7t\2\2\u00d1F\3\2\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		"\u00d5\7v\2\2\u00d5H\3\2\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\7q\2\2\u00d8"+
		"\u00d9\7w\2\2\u00d9\u00da\7d\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2"+
		"\u00dcJ\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7q\2"+
		"\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4"+
		"\7p\2\2\u00e4L\3\2\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8"+
		"\7t\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7v\2\2\u00eb"+
		"N\3\2\2\2\u00ec\u00f0\7%\2\2\u00ed\u00ef\13\2\2\2\u00ee\u00ed\3\2\2\2"+
		"\u00ef\u00f2\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\7\17\2\2\u00f4\u00f3\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8\t\2\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8P\3\2\2\2\u00f9\u00fa\7$\2\2\u00fa\u00fb\7$\2\2\u00fb\u00ff"+
		"\7$\2\2\u00fc\u00fe\13\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0103\7$\2\2\u0103\u0104\7$\2\2\u0104\u0105\7$\2\2\u0105R\3"+
		"\2\2\2\u0106\u0107\t\3\2\2\u0107T\3\2\2\2\u0108\u0109\t\4\2\2\u0109V\3"+
		"\2\2\2\u010a\u010e\t\5\2\2\u010b\u010d\5S*\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0113\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0113\7\62\2\2\u0112\u010a\3\2\2\2\u0112"+
		"\u0111\3\2\2\2\u0113X\3\2\2\2\u0114\u0115\7v\2\2\u0115\u0116\7t\2\2\u0116"+
		"\u0117\7w\2\2\u0117\u011e\7g\2\2\u0118\u0119\7h\2\2\u0119\u011a\7c\2\2"+
		"\u011a\u011b\7n\2\2\u011b\u011c\7u\2\2\u011c\u011e\7g\2\2\u011d\u0114"+
		"\3\2\2\2\u011d\u0118\3\2\2\2\u011eZ\3\2\2\2\u011f\u0121\5S*\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0128\t\5\2\2\u0126\u0128\7\62"+
		"\2\2\u0127\u0122\3\2\2\2\u0127\u0126\3\2\2\2\u0128\\\3\2\2\2\u0129\u012a"+
		"\5W,\2\u012a\u012b\7\60\2\2\u012b\u012c\5[.\2\u012c\u0133\3\2\2\2\u012d"+
		"\u012e\7\60\2\2\u012e\u0133\5[.\2\u012f\u0130\5W,\2\u0130\u0131\7\60\2"+
		"\2\u0131\u0133\3\2\2\2\u0132\u0129\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012f"+
		"\3\2\2\2\u0133^\3\2\2\2\u0134\u0137\5]/\2\u0135\u0137\5W,\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\t\6\2\2\u0139"+
		"\u013b\t\7\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\5W,\2\u013d`\3\2\2\2\u013e\u0141\5]/\2\u013f\u0141\5"+
		"_\60\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141b\3\2\2\2\u0142\u0143"+
		"\7^\2\2\u0143\u0144\5S*\2\u0144\u0145\5S*\2\u0145\u0146\5S*\2\u0146d\3"+
		"\2\2\2\u0147\u014e\7)\2\2\u0148\u014f\13\2\2\2\u0149\u014a\7^\2\2\u014a"+
		"\u014f\7p\2\2\u014b\u014c\7^\2\2\u014c\u014f\7v\2\2\u014d\u014f\5c\62"+
		"\2\u014e\u0148\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014b\3\2\2\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7)\2\2\u0151f\3\2\2\2\u0152\u0155"+
		"\7a\2\2\u0153\u0155\5U+\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155"+
		"\u015b\3\2\2\2\u0156\u015a\7a\2\2\u0157\u015a\5U+\2\u0158\u015a\5S*\2"+
		"\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015ch\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0162\t\b\2\2\u015f\u0162\5O(\2\u0160\u0162\5Q)\2"+
		"\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\b\65\2\2\u0164j\3\2\2\2\25\2\u00f0\u00f4\u00f7\u00ff"+
		"\u010e\u0112\u011d\u0122\u0127\u0132\u0136\u013a\u0140\u014e\u0154\u0159"+
		"\u015b\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}