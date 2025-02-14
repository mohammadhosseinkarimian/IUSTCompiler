// Generated from E:/New folder/hw4/final/Question3\MJLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MJLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RETURN=1, INT=2, BOOLEAN=3, IF=4, ELSE=5, WHILE=6, SOUT=7, ASSIGN=8, ADD=9, 
		SUB=10, MUL=11, LT=12, ANDAND=13, LEN=14, NOT=15, NEW=16, THIS=17, CLASS=18, 
		LPAREN=19, RPAREN=20, LBRACE=21, RBRACE=22, LBRACK=23, RBRACK=24, SEMI=25, 
		COMMA=26, DOT=27, TRUE=28, FALSE=29, PUBLIC=30, STATIC=31, VOID=32, MAIN=33, 
		STRING=34, EXTENDS=35, IDENTIFIER=36, INTEGER_LITERAL=37, WS=38, COMMENT=39, 
		LINE_COMMENT=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RETURN", "INT", "BOOLEAN", "IF", "ELSE", "WHILE", "SOUT", "ASSIGN", 
			"ADD", "SUB", "MUL", "LT", "ANDAND", "LEN", "NOT", "NEW", "THIS", "CLASS", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "TRUE", "FALSE", "PUBLIC", "STATIC", "VOID", "MAIN", "STRING", 
			"EXTENDS", "Digit", "LetterOrDigit", "IDENTIFIER", "INTEGER_LITERAL", 
			"WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'int'", "'boolean'", "'if'", "'else'", "'while'", 
			"'System.out.println'", "'='", "'+'", "'-'", "'*'", "'<'", "'&&'", "'length'", 
			"'!'", "'new'", "'this'", "'class'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'true'", "'false'", "'public'", "'static'", 
			"'void'", "'main'", "'String'", "'extends'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RETURN", "INT", "BOOLEAN", "IF", "ELSE", "WHILE", "SOUT", "ASSIGN", 
			"ADD", "SUB", "MUL", "LT", "ANDAND", "LEN", "NOT", "NEW", "THIS", "CLASS", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "TRUE", "FALSE", "PUBLIC", "STATIC", "VOID", "MAIN", "STRING", 
			"EXTENDS", "IDENTIFIER", "INTEGER_LITERAL", "WS", "COMMENT", "LINE_COMMENT"
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


	public MJLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MJLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u012b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\5&\u00f9\n&\3\'\3\'\7\'"+
		"\u00fd\n\'\f\'\16\'\u0100\13\'\3(\3(\3(\7(\u0105\n(\f(\16(\u0108\13(\5"+
		"(\u010a\n(\3)\6)\u010d\n)\r)\16)\u010e\3)\3)\3*\3*\3*\3*\7*\u0117\n*\f"+
		"*\16*\u011a\13*\3*\3*\3*\3*\3*\3+\3+\3+\3+\7+\u0125\n+\f+\16+\u0128\13"+
		"+\3+\3+\3\u0118\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M&O\'Q(S)U*\3\2\7\3\2\62;\5\2C"+
		"\\aac|\3\2\63;\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u012f\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5^\3\2\2\2\7b\3"+
		"\2\2\2\tj\3\2\2\2\13m\3\2\2\2\rr\3\2\2\2\17x\3\2\2\2\21\u008b\3\2\2\2"+
		"\23\u008d\3\2\2\2\25\u008f\3\2\2\2\27\u0091\3\2\2\2\31\u0093\3\2\2\2\33"+
		"\u0095\3\2\2\2\35\u0098\3\2\2\2\37\u009f\3\2\2\2!\u00a1\3\2\2\2#\u00a5"+
		"\3\2\2\2%\u00aa\3\2\2\2\'\u00b0\3\2\2\2)\u00b2\3\2\2\2+\u00b4\3\2\2\2"+
		"-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63\u00bc\3\2\2\2\65\u00be"+
		"\3\2\2\2\67\u00c0\3\2\2\29\u00c2\3\2\2\2;\u00c7\3\2\2\2=\u00cd\3\2\2\2"+
		"?\u00d4\3\2\2\2A\u00db\3\2\2\2C\u00e0\3\2\2\2E\u00e5\3\2\2\2G\u00ec\3"+
		"\2\2\2I\u00f4\3\2\2\2K\u00f8\3\2\2\2M\u00fa\3\2\2\2O\u0109\3\2\2\2Q\u010c"+
		"\3\2\2\2S\u0112\3\2\2\2U\u0120\3\2\2\2WX\7t\2\2XY\7g\2\2YZ\7v\2\2Z[\7"+
		"w\2\2[\\\7t\2\2\\]\7p\2\2]\4\3\2\2\2^_\7k\2\2_`\7p\2\2`a\7v\2\2a\6\3\2"+
		"\2\2bc\7d\2\2cd\7q\2\2de\7q\2\2ef\7n\2\2fg\7g\2\2gh\7c\2\2hi\7p\2\2i\b"+
		"\3\2\2\2jk\7k\2\2kl\7h\2\2l\n\3\2\2\2mn\7g\2\2no\7n\2\2op\7u\2\2pq\7g"+
		"\2\2q\f\3\2\2\2rs\7y\2\2st\7j\2\2tu\7k\2\2uv\7n\2\2vw\7g\2\2w\16\3\2\2"+
		"\2xy\7U\2\2yz\7{\2\2z{\7u\2\2{|\7v\2\2|}\7g\2\2}~\7o\2\2~\177\7\60\2\2"+
		"\177\u0080\7q\2\2\u0080\u0081\7w\2\2\u0081\u0082\7v\2\2\u0082\u0083\7"+
		"\60\2\2\u0083\u0084\7r\2\2\u0084\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088\u0089\7n\2\2\u0089\u008a\7p\2\2"+
		"\u008a\20\3\2\2\2\u008b\u008c\7?\2\2\u008c\22\3\2\2\2\u008d\u008e\7-\2"+
		"\2\u008e\24\3\2\2\2\u008f\u0090\7/\2\2\u0090\26\3\2\2\2\u0091\u0092\7"+
		",\2\2\u0092\30\3\2\2\2\u0093\u0094\7>\2\2\u0094\32\3\2\2\2\u0095\u0096"+
		"\7(\2\2\u0096\u0097\7(\2\2\u0097\34\3\2\2\2\u0098\u0099\7n\2\2\u0099\u009a"+
		"\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c\7i\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7j\2\2\u009e\36\3\2\2\2\u009f\u00a0\7#\2\2\u00a0 \3\2\2\2\u00a1"+
		"\u00a2\7p\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7y\2\2\u00a4\"\3\2\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7u\2\2"+
		"\u00a9$\3\2\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7c\2"+
		"\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7u\2\2\u00af&\3\2\2\2\u00b0\u00b1\7"+
		"*\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7+\2\2\u00b3*\3\2\2\2\u00b4\u00b5\7}"+
		"\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7\177\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7"+
		"]\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7_\2\2\u00bb\62\3\2\2\2\u00bc\u00bd"+
		"\7=\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7.\2\2\u00bf\66\3\2\2\2\u00c0\u00c1"+
		"\7\60\2\2\u00c18\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5"+
		"\7w\2\2\u00c5\u00c6\7g\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"<\3\2\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7d\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7e\2\2\u00d3>\3\2\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\u00d9\7k\2\2\u00d9\u00da\7e\2\2\u00da@\3\2\2\2\u00db\u00dc\7x\2"+
		"\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7f\2\2\u00dfB\3\2"+
		"\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4"+
		"\7p\2\2\u00e4D\3\2\2\2\u00e5\u00e6\7U\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8"+
		"\7t\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7i\2\2\u00eb"+
		"F\3\2\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7z\2\2\u00ee\u00ef\7v\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7u\2\2"+
		"\u00f3H\3\2\2\2\u00f4\u00f5\t\2\2\2\u00f5J\3\2\2\2\u00f6\u00f9\t\3\2\2"+
		"\u00f7\u00f9\5I%\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9L\3\2"+
		"\2\2\u00fa\u00fe\t\3\2\2\u00fb\u00fd\5K&\2\u00fc\u00fb\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffN\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u010a\7\62\2\2\u0102\u0106\t\4\2\2\u0103\u0105\5"+
		"I%\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0101\3\2"+
		"\2\2\u0109\u0102\3\2\2\2\u010aP\3\2\2\2\u010b\u010d\t\5\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\b)\2\2\u0111R\3\2\2\2\u0112\u0113\7\61\2\2"+
		"\u0113\u0114\7,\2\2\u0114\u0118\3\2\2\2\u0115\u0117\13\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7,\2\2\u011c\u011d\7\61"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b*\2\2\u011fT\3\2\2\2\u0120\u0121"+
		"\7\61\2\2\u0121\u0122\7\61\2\2\u0122\u0126\3\2\2\2\u0123\u0125\n\6\2\2"+
		"\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\b+\2\2\u012a"+
		"V\3\2\2\2\n\2\u00f8\u00fe\u0106\u0109\u010e\u0118\u0126\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}