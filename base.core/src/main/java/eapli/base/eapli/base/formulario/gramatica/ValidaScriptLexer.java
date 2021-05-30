// Generated from C:/Users/luism/Desktop/lei20_21_s4_2dl_4/base.core/src/main/java/eapli/base/formulario/gramatica\ValidaScript.g4 by ANTLR 4.9.1
package eapli.base.formulario.gramatica;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValidaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NEWLINE=2, INT=3, ID=4, MUL=5, DIV=6, ADD=7, SUB=8, ATR=9, LPR=10, 
		RPR=11, DEFINE=12, SE=13, ENTAO=14, NAOVAZIO=15, VAZIO=16, MAIOR=17, MENOR=18, 
		NOMEATRIBUTO=19, ESPACO=20, EXPREGULAR=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NEWLINE", "INT", "ID", "MUL", "DIV", "ADD", "SUB", "ATR", "LPR", 
			"RPR", "DEFINE", "SE", "ENTAO", "NAOVAZIO", "VAZIO", "MAIOR", "MENOR", 
			"NOMEATRIBUTO", "ESPACO", "EXPREGULAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", null, null, null, "'*'", "'/'", "'+'", "'-'", "'='", "'('", 
			"')'", "'DEFINE'", "'SE'", "'ENTAO'", "'NAOVAZIO'", "'VAZIO'", "'>'", 
			"'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NEWLINE", "INT", "ID", "MUL", "DIV", "ADD", "SUB", "ATR", 
			"LPR", "RPR", "DEFINE", "SE", "ENTAO", "NAOVAZIO", "VAZIO", "MAIOR", 
			"MENOR", "NOMEATRIBUTO", "ESPACO", "EXPREGULAR"
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


	public ValidaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ValidaScript.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\6\3\61\n\3\r"+
		"\3\16\3\62\3\4\6\4\66\n\4\r\4\16\4\67\3\5\6\5;\n\5\r\5\16\5<\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\6\24q\n\24\r\24\16\24r\3\25\3\25\3\25\3\25\3\26\3\26\6\26{"+
		"\n\26\r\26\16\26|\3\26\3\26\3|\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2"+
		"\7\4\2\f\f\17\17\3\2\62;\3\2c|\4\2C\\c|\3\2\"\"\2\u0084\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7\65\3\2\2"+
		"\2\t:\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23F\3\2\2"+
		"\2\25H\3\2\2\2\27J\3\2\2\2\31L\3\2\2\2\33S\3\2\2\2\35V\3\2\2\2\37\\\3"+
		"\2\2\2!e\3\2\2\2#k\3\2\2\2%m\3\2\2\2\'p\3\2\2\2)t\3\2\2\2+x\3\2\2\2-."+
		"\7\"\2\2.\4\3\2\2\2/\61\t\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2"+
		"\2\62\63\3\2\2\2\63\6\3\2\2\2\64\66\t\3\2\2\65\64\3\2\2\2\66\67\3\2\2"+
		"\2\67\65\3\2\2\2\678\3\2\2\28\b\3\2\2\29;\t\4\2\2:9\3\2\2\2;<\3\2\2\2"+
		"<:\3\2\2\2<=\3\2\2\2=\n\3\2\2\2>?\7,\2\2?\f\3\2\2\2@A\7\61\2\2A\16\3\2"+
		"\2\2BC\7-\2\2C\20\3\2\2\2DE\7/\2\2E\22\3\2\2\2FG\7?\2\2G\24\3\2\2\2HI"+
		"\7*\2\2I\26\3\2\2\2JK\7+\2\2K\30\3\2\2\2LM\7F\2\2MN\7G\2\2NO\7H\2\2OP"+
		"\7K\2\2PQ\7P\2\2QR\7G\2\2R\32\3\2\2\2ST\7U\2\2TU\7G\2\2U\34\3\2\2\2VW"+
		"\7G\2\2WX\7P\2\2XY\7V\2\2YZ\7C\2\2Z[\7Q\2\2[\36\3\2\2\2\\]\7P\2\2]^\7"+
		"C\2\2^_\7Q\2\2_`\7X\2\2`a\7C\2\2ab\7\\\2\2bc\7K\2\2cd\7Q\2\2d \3\2\2\2"+
		"ef\7X\2\2fg\7C\2\2gh\7\\\2\2hi\7K\2\2ij\7Q\2\2j\"\3\2\2\2kl\7@\2\2l$\3"+
		"\2\2\2mn\7>\2\2n&\3\2\2\2oq\t\5\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3"+
		"\2\2\2s(\3\2\2\2tu\t\6\2\2uv\3\2\2\2vw\b\25\2\2w*\3\2\2\2xz\7B\2\2y{\13"+
		"\2\2\2zy\3\2\2\2{|\3\2\2\2|}\3\2\2\2|z\3\2\2\2}~\3\2\2\2~\177\7B\2\2\177"+
		",\3\2\2\2\b\2\62\67<r|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}