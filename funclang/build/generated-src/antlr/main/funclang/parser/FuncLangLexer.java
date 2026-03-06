// Generated from funclang/parser/FuncLang.g4 by ANTLR 4.13.2
package funclang.parser; import static funclang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FuncLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Lambda=7, If=8, Car=9, 
		Cdr=10, Cons=11, List=12, Null=13, Less=14, Equal=15, Greater=16, TrueLiteral=17, 
		FalseLiteral=18, Define=19, Let=20, Dot=21, Number=22, Identifier=23, 
		Letter=24, LetterOrDigit=25, StrLiteral=26, AT=27, ELLIPSIS=28, WS=29, 
		Comment=30, Line_Comment=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Lambda", "If", "Car", 
			"Cdr", "Cons", "List", "Null", "Less", "Equal", "Greater", "TrueLiteral", 
			"FalseLiteral", "Define", "Let", "Dot", "Number", "Identifier", "Letter", 
			"LetterOrDigit", "DIGIT", "ESCQUOTE", "StrLiteral", "AT", "ELLIPSIS", 
			"WS", "Comment", "Line_Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'lambda'", "'if'", "'car'", 
			"'cdr'", "'cons'", "'list'", "'null?'", "'<'", "'='", "'>'", "'#t'", 
			"'#f'", "'define'", "'let'", "'.'", null, null, null, null, null, "'@'", 
			"'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Lambda", "If", "Car", "Cdr", 
			"Cons", "List", "Null", "Less", "Equal", "Greater", "TrueLiteral", "FalseLiteral", 
			"Define", "Let", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
			"StrLiteral", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
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


	public FuncLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FuncLang.g4"; }

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
		case 23:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 24:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u00db\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u008c\b\u0015"+
		"\u000b\u0015\f\u0015\u008d\u0001\u0016\u0001\u0016\u0005\u0016\u0092\b"+
		"\u0016\n\u0016\f\u0016\u0095\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u009d\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00a5\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u00af\b\u001b\n\u001b"+
		"\f\u001b\u00b2\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0004\u001e"+
		"\u00bd\b\u001e\u000b\u001e\f\u001e\u00be\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u00c7\b\u001f\n"+
		"\u001f\f\u001f\u00ca\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u00d5\b \n \f \u00d8"+
		"\t \u0001 \u0001 \u0002\u00b0\u00c8\u0000!\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u00005\u0000"+
		"7\u001a9\u001b;\u001c=\u001d?\u001eA\u001f\u0001\u0000\u0007\u0004\u0000"+
		"$$AZ__az\u0002\u0000\u0000\u00ff\u8000\ud800\u8000\udbff\u0001\u0000\u8000"+
		"\ud800\u8000\udbff\u0001\u0000\u8000\udc00\u8000\udfff\u0005\u0000$$0"+
		"9AZ__az\u0002\u0000\n\n\r\r\u0003\u0000\t\n\f\r  \u00e3\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009"+
		"\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000"+
		"\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000"+
		"\u0001C\u0001\u0000\u0000\u0000\u0003E\u0001\u0000\u0000\u0000\u0005G"+
		"\u0001\u0000\u0000\u0000\u0007I\u0001\u0000\u0000\u0000\tK\u0001\u0000"+
		"\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\rO\u0001\u0000\u0000\u0000"+
		"\u000fV\u0001\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013]"+
		"\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017f\u0001\u0000"+
		"\u0000\u0000\u0019k\u0001\u0000\u0000\u0000\u001bq\u0001\u0000\u0000\u0000"+
		"\u001ds\u0001\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000!w\u0001"+
		"\u0000\u0000\u0000#z\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000\u0000"+
		"\'\u0084\u0001\u0000\u0000\u0000)\u0088\u0001\u0000\u0000\u0000+\u008b"+
		"\u0001\u0000\u0000\u0000-\u008f\u0001\u0000\u0000\u0000/\u009c\u0001\u0000"+
		"\u0000\u00001\u00a4\u0001\u0000\u0000\u00003\u00a6\u0001\u0000\u0000\u0000"+
		"5\u00a8\u0001\u0000\u0000\u00007\u00ab\u0001\u0000\u0000\u00009\u00b5"+
		"\u0001\u0000\u0000\u0000;\u00b7\u0001\u0000\u0000\u0000=\u00bc\u0001\u0000"+
		"\u0000\u0000?\u00c2\u0001\u0000\u0000\u0000A\u00d0\u0001\u0000\u0000\u0000"+
		"CD\u0005(\u0000\u0000D\u0002\u0001\u0000\u0000\u0000EF\u0005)\u0000\u0000"+
		"F\u0004\u0001\u0000\u0000\u0000GH\u0005-\u0000\u0000H\u0006\u0001\u0000"+
		"\u0000\u0000IJ\u0005+\u0000\u0000J\b\u0001\u0000\u0000\u0000KL\u0005*"+
		"\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u0005/\u0000\u0000N\f\u0001"+
		"\u0000\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005m"+
		"\u0000\u0000RS\u0005b\u0000\u0000ST\u0005d\u0000\u0000TU\u0005a\u0000"+
		"\u0000U\u000e\u0001\u0000\u0000\u0000VW\u0005i\u0000\u0000WX\u0005f\u0000"+
		"\u0000X\u0010\u0001\u0000\u0000\u0000YZ\u0005c\u0000\u0000Z[\u0005a\u0000"+
		"\u0000[\\\u0005r\u0000\u0000\\\u0012\u0001\u0000\u0000\u0000]^\u0005c"+
		"\u0000\u0000^_\u0005d\u0000\u0000_`\u0005r\u0000\u0000`\u0014\u0001\u0000"+
		"\u0000\u0000ab\u0005c\u0000\u0000bc\u0005o\u0000\u0000cd\u0005n\u0000"+
		"\u0000de\u0005s\u0000\u0000e\u0016\u0001\u0000\u0000\u0000fg\u0005l\u0000"+
		"\u0000gh\u0005i\u0000\u0000hi\u0005s\u0000\u0000ij\u0005t\u0000\u0000"+
		"j\u0018\u0001\u0000\u0000\u0000kl\u0005n\u0000\u0000lm\u0005u\u0000\u0000"+
		"mn\u0005l\u0000\u0000no\u0005l\u0000\u0000op\u0005?\u0000\u0000p\u001a"+
		"\u0001\u0000\u0000\u0000qr\u0005<\u0000\u0000r\u001c\u0001\u0000\u0000"+
		"\u0000st\u0005=\u0000\u0000t\u001e\u0001\u0000\u0000\u0000uv\u0005>\u0000"+
		"\u0000v \u0001\u0000\u0000\u0000wx\u0005#\u0000\u0000xy\u0005t\u0000\u0000"+
		"y\"\u0001\u0000\u0000\u0000z{\u0005#\u0000\u0000{|\u0005f\u0000\u0000"+
		"|$\u0001\u0000\u0000\u0000}~\u0005d\u0000\u0000~\u007f\u0005e\u0000\u0000"+
		"\u007f\u0080\u0005f\u0000\u0000\u0080\u0081\u0005i\u0000\u0000\u0081\u0082"+
		"\u0005n\u0000\u0000\u0082\u0083\u0005e\u0000\u0000\u0083&\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005l\u0000\u0000\u0085\u0086\u0005e\u0000\u0000"+
		"\u0086\u0087\u0005t\u0000\u0000\u0087(\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005.\u0000\u0000\u0089*\u0001\u0000\u0000\u0000\u008a\u008c\u00033"+
		"\u0019\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e,\u0001\u0000\u0000\u0000\u008f\u0093\u0003/\u0017\u0000"+
		"\u0090\u0092\u00031\u0018\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094.\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u009d\u0007\u0000\u0000\u0000\u0097\u0098"+
		"\b\u0001\u0000\u0000\u0098\u009d\u0004\u0017\u0000\u0000\u0099\u009a\u0007"+
		"\u0002\u0000\u0000\u009a\u009b\u0007\u0003\u0000\u0000\u009b\u009d\u0004"+
		"\u0017\u0001\u0000\u009c\u0096\u0001\u0000\u0000\u0000\u009c\u0097\u0001"+
		"\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009d0\u0001\u0000"+
		"\u0000\u0000\u009e\u00a5\u0007\u0004\u0000\u0000\u009f\u00a0\b\u0001\u0000"+
		"\u0000\u00a0\u00a5\u0004\u0018\u0002\u0000\u00a1\u00a2\u0007\u0002\u0000"+
		"\u0000\u00a2\u00a3\u0007\u0003\u0000\u0000\u00a3\u00a5\u0004\u0018\u0003"+
		"\u0000\u00a4\u009e\u0001\u0000\u0000\u0000\u00a4\u009f\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a52\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u000209\u0000\u00a74\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005\\\u0000\u0000\u00a9\u00aa\u0005\"\u0000\u0000\u00aa6\u0001\u0000"+
		"\u0000\u0000\u00ab\u00b0\u0005\"\u0000\u0000\u00ac\u00af\u00035\u001a"+
		"\u0000\u00ad\u00af\b\u0005\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005\"\u0000\u0000\u00b48\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005@\u0000\u0000\u00b6:\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		".\u0000\u0000\u00b8\u00b9\u0005.\u0000\u0000\u00b9\u00ba\u0005.\u0000"+
		"\u0000\u00ba<\u0001\u0000\u0000\u0000\u00bb\u00bd\u0007\u0006\u0000\u0000"+
		"\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0006\u001e\u0000\u0000"+
		"\u00c1>\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005/\u0000\u0000\u00c3\u00c4"+
		"\u0005*\u0000\u0000\u00c4\u00c8\u0001\u0000\u0000\u0000\u00c5\u00c7\t"+
		"\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005*\u0000\u0000\u00cc\u00cd\u0005/\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0006\u001f\u0000"+
		"\u0000\u00cf@\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005/\u0000\u0000\u00d1"+
		"\u00d2\u0005/\u0000\u0000\u00d2\u00d6\u0001\u0000\u0000\u0000\u00d3\u00d5"+
		"\b\u0005\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0006 \u0000\u0000\u00daB\u0001\u0000\u0000"+
		"\u0000\n\u0000\u008d\u0093\u009c\u00a4\u00ae\u00b0\u00be\u00c8\u00d6\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}