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
import parser.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_CONSTANT=38, 
		REAL_CONSTANT=39, CHAR_CONSTANT=40, ID=41, TRASH=42;
	public static final int
		RULE_program = 0, RULE_main_definition = 1, RULE_definition = 2, RULE_variable_definition = 3, 
		RULE_function_definition = 4, RULE_statement = 5, RULE_body = 6, RULE_expression = 7, 
		RULE_built_in_type = 8, RULE_type = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main_definition", "definition", "variable_definition", "function_definition", 
			"statement", "body", "expression", "built_in_type", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "','", "';'", 
			"'print'", "'input'", "'='", "'if'", "'else'", "'while'", "'return'", 
			"'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>='", 
			"'>'", "'<='", "'<'", "'!='", "'=='", "'&&'", "'||'", "'char'", "'int'", 
			"'double'", "'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID", "TRASH"
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> definitions = new ArrayList<>();
		public DefinitionContext definition;
		public Main_definitionContext main_definition;
		public Main_definitionContext main_definition() {
			return getRuleContext(Main_definitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					((ProgramContext)_localctx).definition = definition();
					 _localctx.definitions.addAll(((ProgramContext)_localctx).definition.ast); 
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(28);
			((ProgramContext)_localctx).main_definition = main_definition();
			 _localctx.definitions.add(((ProgramContext)_localctx).main_definition.ast); 
			setState(30);
			match(EOF);

			        ((ProgramContext)_localctx).ast =  new Program(_localctx.definitions, 0, 0);
			    
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

	public static class Main_definitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token idFunction;
		public Variable_definitionContext variable_definition;
		public StatementContext statement;
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Main_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_definitionContext main_definition() throws RecognitionException {
		Main_definitionContext _localctx = new Main_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			((Main_definitionContext)_localctx).idFunction = match(T__1);
			setState(35);
			match(T__2);
			setState(36);
			match(T__3);
			setState(37);
			match(T__4);

			        FunctionType funcType = new FunctionType(VoidType.getInstance(), ((Main_definitionContext)_localctx).idFunction.getLine(), ((Main_definitionContext)_localctx).idFunction.getCharPositionInLine()+1);
			        ((Main_definitionContext)_localctx).ast =  new FunctionDefinition((((Main_definitionContext)_localctx).idFunction!=null?((Main_definitionContext)_localctx).idFunction.getText():null), funcType, ((Main_definitionContext)_localctx).idFunction.getLine(), ((Main_definitionContext)_localctx).idFunction.getCharPositionInLine()+1);
			    
			setState(39);
			match(T__5);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					((Main_definitionContext)_localctx).variable_definition = variable_definition();
					_localctx.ast.addVariableDefinitions(((Main_definitionContext)_localctx).variable_definition.ast);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(48);
				((Main_definitionContext)_localctx).statement = statement();
				_localctx.ast.addStatements(((Main_definitionContext)_localctx).statement.ast);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__6);
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

	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();
		public Variable_definitionContext variable_definition;
		public Function_definitionContext function_definition;
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				((DefinitionContext)_localctx).variable_definition = variable_definition();

				        _localctx.ast.addAll(((DefinitionContext)_localctx).variable_definition.ast);
				       
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((DefinitionContext)_localctx).function_definition = function_definition();

				        _localctx.ast.add(((DefinitionContext)_localctx).function_definition.ast);
				     
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

	public static class Variable_definitionContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<>();
		public List<String> names = new ArrayList<>();
		public Token id1;
		public Token id2;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVariable_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((Variable_definitionContext)_localctx).id1 = match(ID);
			 _localctx.names.add((((Variable_definitionContext)_localctx).id1!=null?((Variable_definitionContext)_localctx).id1.getText():null)); 
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(68);
				match(T__7);
				setState(69);
				((Variable_definitionContext)_localctx).id2 = match(ID);
				 _localctx.names.add((((Variable_definitionContext)_localctx).id2!=null?((Variable_definitionContext)_localctx).id2.getText():null)); 
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__4);
			setState(77);
			((Variable_definitionContext)_localctx).type = type();
			setState(78);
			match(T__8);
			 _localctx.names.forEach( name-> _localctx.ast.add(new VariableDefinition(name, ((Variable_definitionContext)_localctx).type.ast, ((Variable_definitionContext)_localctx).id1.getLine(), ((Variable_definitionContext)_localctx).id1.getCharPositionInLine()+1))); 
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

	public static class Function_definitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public List<VariableDefinition> paramDefinitions = new ArrayList<>();
		public Type returnType = VoidType.getInstance();
		public Token idFunction;
		public Token id1;
		public Built_in_typeContext t1;
		public Token id2;
		public Built_in_typeContext t2;
		public TypeContext type;
		public Variable_definitionContext variable_definition;
		public StatementContext statement;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Built_in_typeContext> built_in_type() {
			return getRuleContexts(Built_in_typeContext.class);
		}
		public Built_in_typeContext built_in_type(int i) {
			return getRuleContext(Built_in_typeContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			((Function_definitionContext)_localctx).idFunction = match(ID);
			setState(83);
			match(T__2);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(84);
				((Function_definitionContext)_localctx).id1 = match(ID);
				setState(85);
				match(T__4);
				setState(86);
				((Function_definitionContext)_localctx).t1 = built_in_type();
				 _localctx.paramDefinitions.add(new VariableDefinition((((Function_definitionContext)_localctx).id1!=null?((Function_definitionContext)_localctx).id1.getText():null), ((Function_definitionContext)_localctx).t1.ast, ((Function_definitionContext)_localctx).id1.getLine(), ((Function_definitionContext)_localctx).id1.getCharPositionInLine()+1)); 
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(88);
					match(T__7);
					setState(89);
					((Function_definitionContext)_localctx).id2 = match(ID);
					setState(90);
					match(T__4);
					setState(91);
					((Function_definitionContext)_localctx).t2 = built_in_type();
					 _localctx.paramDefinitions.add(new VariableDefinition((((Function_definitionContext)_localctx).id2!=null?((Function_definitionContext)_localctx).id2.getText():null), ((Function_definitionContext)_localctx).t2.ast, ((Function_definitionContext)_localctx).id2.getLine(), ((Function_definitionContext)_localctx).id2.getCharPositionInLine()+1)); 
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(101);
			match(T__3);
			setState(102);
			match(T__4);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(103);
				((Function_definitionContext)_localctx).type = type();
				 ((Function_definitionContext)_localctx).returnType =  ((Function_definitionContext)_localctx).type.ast; 
				}
			}


			        FunctionType funcType = new FunctionType(_localctx.returnType, ((Function_definitionContext)_localctx).idFunction.getLine(), ((Function_definitionContext)_localctx).idFunction.getCharPositionInLine()+1);
			        ((Function_definitionContext)_localctx).ast =  new FunctionDefinition((((Function_definitionContext)_localctx).idFunction!=null?((Function_definitionContext)_localctx).idFunction.getText():null), funcType, ((Function_definitionContext)_localctx).idFunction.getLine(), ((Function_definitionContext)_localctx).idFunction.getCharPositionInLine()+1);
			    
			setState(109);
			match(T__5);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					((Function_definitionContext)_localctx).variable_definition = variable_definition();
					_localctx.ast.addVariableDefinitions(((Function_definitionContext)_localctx).variable_definition.ast);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(118);
				((Function_definitionContext)_localctx).statement = statement();
				_localctx.ast.addStatements(((Function_definitionContext)_localctx).statement.ast);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(T__6);

			        _localctx.paramDefinitions.forEach(varDef->funcType.addParameter(varDef));
			    
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

	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public List<Statement> elseBody = new ArrayList<>();
		public ExpressionContext ex1;
		public ExpressionContext ex2;
		public ExpressionContext expression;
		public BodyContext b1;
		public BodyContext b2;
		public BodyContext body;
		public Token ID;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__9);
				setState(130);
				((StatementContext)_localctx).ex1 = expression(0);
				 _localctx.ast.add(new Print(((StatementContext)_localctx).ex1.ast, ((StatementContext)_localctx).ex1.ast.getLine(), ((StatementContext)_localctx).ex1.ast.getColumn())); 
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(132);
					match(T__7);
					setState(133);
					((StatementContext)_localctx).ex2 = expression(0);
					 _localctx.ast.add(new Print(((StatementContext)_localctx).ex2.ast, ((StatementContext)_localctx).ex2.ast.getLine(), ((StatementContext)_localctx).ex2.ast.getColumn())); 
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__10);
				setState(144);
				((StatementContext)_localctx).expression = expression(0);
				setState(145);
				match(T__8);

				            _localctx.ast.add(new Input(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn()));
				         
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				((StatementContext)_localctx).ex1 = expression(0);
				setState(149);
				match(T__11);
				setState(150);
				((StatementContext)_localctx).ex2 = expression(0);
				setState(151);
				match(T__8);

				            _localctx.ast.add(new Assignment(((StatementContext)_localctx).ex1.ast, ((StatementContext)_localctx).ex2.ast, ((StatementContext)_localctx).ex1.ast.getLine(), ((StatementContext)_localctx).ex1.ast.getColumn()));
				         
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(T__12);
				setState(155);
				((StatementContext)_localctx).expression = expression(0);
				setState(156);
				match(T__4);
				setState(157);
				((StatementContext)_localctx).b1 = body();
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(158);
					match(T__13);
					setState(159);
					((StatementContext)_localctx).b2 = body();
					((StatementContext)_localctx).elseBody = ((StatementContext)_localctx).b2.ast;
					}
					break;
				}

				            IfElse ifElse = new IfElse(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).b1.ast, _localctx.elseBody, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn());
				            _localctx.ast.add(ifElse);
				         
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(T__14);
				setState(167);
				((StatementContext)_localctx).expression = expression(0);
				setState(168);
				match(T__4);
				setState(169);
				((StatementContext)_localctx).body = body();

				            _localctx.ast.add(new While(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).body.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn()));
				         
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				match(T__15);
				setState(173);
				((StatementContext)_localctx).expression = expression(0);
				setState(174);
				match(T__8);

				            _localctx.ast.add(new Return(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn()));
				         
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				((StatementContext)_localctx).ID = match(ID);

				                                    int line, column;
				                                    line = ((StatementContext)_localctx).ID.getLine();
				                                    column = ((StatementContext)_localctx).ID.getCharPositionInLine()+1;
				                                    FunctionInvocation functionInvocation = new FunctionInvocation(
				                                                                                new Variable((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), line, column),
				                                                                                line, column);
				                               
				setState(179);
				match(T__2);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(180);
					((StatementContext)_localctx).ex1 = expression(0);
					 functionInvocation.addParameter(((StatementContext)_localctx).ex1.ast); 
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(182);
						match(T__7);
						setState(183);
						((StatementContext)_localctx).ex2 = expression(0);
						 functionInvocation.addParameter(((StatementContext)_localctx).ex2.ast); 
						}
						}
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(193);
				match(T__3);
				setState(194);
				match(T__8);

				                _localctx.ast.add(functionInvocation);
				            
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

	public static class BodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__5);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(199);
					((BodyContext)_localctx).statement = statement();
					 _localctx.ast.addAll(((BodyContext)_localctx).statement.ast); 
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(T__6);
				}
				break;
			case T__2:
			case T__9:
			case T__10:
			case T__12:
			case T__14:
			case T__15:
			case T__19:
			case T__20:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((BodyContext)_localctx).statement = statement();
				 _localctx.ast.addAll(((BodyContext)_localctx).statement.ast); 
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext ex1;
		public ExpressionContext ex;
		public Token INT_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token REAL_CONSTANT;
		public Token ID;
		public ExpressionContext expression;
		public ExpressionContext ex2;
		public Built_in_typeContext built_in_type;
		public Token OP;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Built_in_typeContext built_in_type() {
			return getRuleContext(Built_in_typeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(214);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new IntLiteral(LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)),
				                    ((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1);
				            
				}
				break;
			case 2:
				{
				setState(216);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new CharLiteral(LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)),
				                    ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1);
				            
				}
				break;
			case 3:
				{
				setState(218);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new DoubleLiteral(LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)),
				                    ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1);
				            
				}
				break;
			case 4:
				{
				setState(220);
				((ExpressionContext)_localctx).ID = match(ID);

				                ((ExpressionContext)_localctx).ast =  new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
				                   ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1);
				            
				}
				break;
			case 5:
				{
				setState(222);
				((ExpressionContext)_localctx).ID = match(ID);

				                                    int line, column;
				                                    line = ((ExpressionContext)_localctx).ID.getLine();
				                                    column = ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1;
				                                    FunctionInvocation functionInvocation = new FunctionInvocation(
				                                                                                new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), line, column),
				                                                                                line, column);
				                               
				setState(224);
				match(T__2);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(225);
					((ExpressionContext)_localctx).ex1 = ((ExpressionContext)_localctx).expression = expression(0);
					 functionInvocation.addParameter(((ExpressionContext)_localctx).ex1.ast); 
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(227);
						match(T__7);
						setState(228);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(0);
						 functionInvocation.addParameter(((ExpressionContext)_localctx).ex2.ast); 
						}
						}
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(238);
				match(T__3);

				                ((ExpressionContext)_localctx).ast =  functionInvocation;
				            
				}
				break;
			case 6:
				{
				setState(240);
				match(T__2);
				setState(241);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(242);
				match(T__3);

				                ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				            
				}
				break;
			case 7:
				{
				setState(245);
				match(T__2);
				setState(246);
				((ExpressionContext)_localctx).built_in_type = built_in_type();
				setState(247);
				match(T__3);
				setState(248);
				((ExpressionContext)_localctx).expression = expression(7);

				                ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).built_in_type.ast, ((ExpressionContext)_localctx).expression.ast,
				                    ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				            
				}
				break;
			case 8:
				{
				setState(251);
				match(T__19);
				setState(252);
				((ExpressionContext)_localctx).expression = expression(6);

				                ((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).expression.ast,
				                    ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				            
				}
				break;
			case 9:
				{
				setState(255);
				match(T__20);
				setState(256);
				((ExpressionContext)_localctx).expression = expression(5);

				                ((ExpressionContext)_localctx).ast =  new Negation(((ExpressionContext)_localctx).expression.ast,
				                    ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				            
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(262);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(5);

						                          ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).ex1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).ex2.ast,
						                              ((ExpressionContext)_localctx).ex1.ast.getLine(), ((ExpressionContext)_localctx).ex1.ast.getColumn());
						                      
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(268);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(4);

						                          ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).ex1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).ex2.ast,
						                              ((ExpressionContext)_localctx).ex1.ast.getLine(), ((ExpressionContext)_localctx).ex1.ast.getColumn());
						                      
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(272);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(3);

						                          ((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).ex1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).ex2.ast,
						                              ((ExpressionContext)_localctx).ex1.ast.getLine(), ((ExpressionContext)_localctx).ex1.ast.getColumn());
						                      
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(277);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(278);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(2);

						                          ((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).ex1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).ex2.ast,
						                              ((ExpressionContext)_localctx).ex1.ast.getLine(), ((ExpressionContext)_localctx).ex1.ast.getColumn());
						                      
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(282);
						match(T__16);
						setState(283);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(284);
						match(T__17);

						                          ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).ex1.ast, ((ExpressionContext)_localctx).ex2.ast,
						                              ((ExpressionContext)_localctx).ex1.ast.getLine(), ((ExpressionContext)_localctx).ex1.ast.getColumn());
						                      
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex = _prevctx;
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(288);
						match(T__18);
						setState(289);
						((ExpressionContext)_localctx).ID = match(ID);

						                          ((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).ex.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
						                              ((ExpressionContext)_localctx).ex.ast.getLine(), ((ExpressionContext)_localctx).ex.ast.getColumn());
						                      
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Built_in_typeContext extends ParserRuleContext {
		public Type ast;
		public Built_in_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBuilt_in_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_in_typeContext built_in_type() throws RecognitionException {
		Built_in_typeContext _localctx = new Built_in_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_built_in_type);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(T__33);

				                    ((Built_in_typeContext)_localctx).ast =  CharType.getInstance();
				                
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(T__34);

				                    ((Built_in_typeContext)_localctx).ast =  IntegerType.getInstance();
				                
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(T__35);

				                    ((Built_in_typeContext)_localctx).ast =  DoubleType.getInstance();
				                
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public List<String> fieldIds = new ArrayList<>();
		public Built_in_typeContext built_in_type;
		public Token lineMarker;
		public Token INT_CONSTANT;
		public TypeContext type;
		public Token struct_keyword;
		public Token id1;
		public Token id2;
		public Built_in_typeContext built_in_type() {
			return getRuleContext(Built_in_typeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				((TypeContext)_localctx).built_in_type = built_in_type();

				        ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).built_in_type.ast;
				    
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				((TypeContext)_localctx).lineMarker = match(T__16);
				setState(308);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(309);
				match(T__17);
				setState(310);
				((TypeContext)_localctx).type = type();

				        ((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)), ((TypeContext)_localctx).type.ast,
				            ((TypeContext)_localctx).lineMarker.getLine(), ((TypeContext)_localctx).lineMarker.getCharPositionInLine()+1);
				    
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				((TypeContext)_localctx).struct_keyword = match(T__36);
				 RecordType record = new RecordType(((TypeContext)_localctx).struct_keyword.getLine(), ((TypeContext)_localctx).struct_keyword.getCharPositionInLine()+1); 
				setState(315);
				match(T__5);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(316);
					((TypeContext)_localctx).id1 = match(ID);
					_localctx.fieldIds.add((((TypeContext)_localctx).id1!=null?((TypeContext)_localctx).id1.getText():null));
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(318);
						match(T__7);
						setState(319);
						((TypeContext)_localctx).id2 = match(ID);
						_localctx.fieldIds.add((((TypeContext)_localctx).id2!=null?((TypeContext)_localctx).id2.getText():null));
						}
						}
						setState(325);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(326);
					match(T__4);
					setState(327);
					((TypeContext)_localctx).type = type();
					setState(328);
					match(T__8);
					 _localctx.fieldIds.forEach(id -> record.addField(new RecordField(((TypeContext)_localctx).type.ast, id))); ((TypeContext)_localctx).fieldIds =  new ArrayList<>(); 
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(T__6);

				        ((TypeContext)_localctx).ast =  record;
				      
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
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0157\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\3"+
		"\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6d\13\6"+
		"\5\6f\n\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\6\3\6\3\6\7\6t\n\6\f"+
		"\6\16\6w\13\6\3\6\3\6\3\6\7\6|\n\6\f\6\16\6\177\13\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e\13\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00a5\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00bd\n\7\f\7\16\7\u00c0\13\7\5\7"+
		"\u00c2\n\7\3\7\3\7\3\7\5\7\u00c7\n\7\3\b\3\b\3\b\3\b\7\b\u00cd\n\b\f\b"+
		"\16\b\u00d0\13\b\3\b\3\b\3\b\3\b\5\b\u00d6\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ea\n\t\f\t\16"+
		"\t\u00ed\13\t\5\t\u00ef\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0106\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0126\n\t\f\t\16\t\u0129\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0131\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0144\n\13"+
		"\f\13\16\13\u0147\13\13\3\13\3\13\3\13\3\13\3\13\7\13\u014e\n\13\f\13"+
		"\16\13\u0151\13\13\3\13\3\13\5\13\u0155\n\13\3\13\2\3\20\f\2\4\6\b\n\f"+
		"\16\20\22\24\2\6\3\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\2\u0178\2\33"+
		"\3\2\2\2\4#\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nS\3\2\2\2\f\u00c6\3\2\2\2\16"+
		"\u00d5\3\2\2\2\20\u0105\3\2\2\2\22\u0130\3\2\2\2\24\u0154\3\2\2\2\26\27"+
		"\5\6\4\2\27\30\b\2\1\2\30\32\3\2\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\5\4\3\2\37 \b"+
		"\2\1\2 !\7\2\2\3!\"\b\2\1\2\"\3\3\2\2\2#$\7\3\2\2$%\7\4\2\2%&\7\5\2\2"+
		"&\'\7\6\2\2\'(\7\7\2\2()\b\3\1\2)/\7\b\2\2*+\5\b\5\2+,\b\3\1\2,.\3\2\2"+
		"\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\67\3\2\2\2\61/\3\2\2"+
		"\2\62\63\5\f\7\2\63\64\b\3\1\2\64\66\3\2\2\2\65\62\3\2\2\2\669\3\2\2\2"+
		"\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\t\2\2;\5\3\2\2\2"+
		"<=\5\b\5\2=>\b\4\1\2>C\3\2\2\2?@\5\n\6\2@A\b\4\1\2AC\3\2\2\2B<\3\2\2\2"+
		"B?\3\2\2\2C\7\3\2\2\2DE\7+\2\2EK\b\5\1\2FG\7\n\2\2GH\7+\2\2HJ\b\5\1\2"+
		"IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\7\2\2"+
		"OP\5\24\13\2PQ\7\13\2\2QR\b\5\1\2R\t\3\2\2\2ST\7\3\2\2TU\7+\2\2Ue\7\5"+
		"\2\2VW\7+\2\2WX\7\7\2\2XY\5\22\n\2Yb\b\6\1\2Z[\7\n\2\2[\\\7+\2\2\\]\7"+
		"\7\2\2]^\5\22\n\2^_\b\6\1\2_a\3\2\2\2`Z\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc"+
		"\3\2\2\2cf\3\2\2\2db\3\2\2\2eV\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\6\2\2h"+
		"l\7\7\2\2ij\5\24\13\2jk\b\6\1\2km\3\2\2\2li\3\2\2\2lm\3\2\2\2mn\3\2\2"+
		"\2no\b\6\1\2ou\7\b\2\2pq\5\b\5\2qr\b\6\1\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2v}\3\2\2\2wu\3\2\2\2xy\5\f\7\2yz\b\6\1\2z|\3\2\2"+
		"\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0081\7\t\2\2\u0081\u0082\b\6\1\2\u0082\13\3\2\2\2\u0083\u0084"+
		"\7\f\2\2\u0084\u0085\5\20\t\2\u0085\u008c\b\7\1\2\u0086\u0087\7\n\2\2"+
		"\u0087\u0088\5\20\t\2\u0088\u0089\b\7\1\2\u0089\u008b\3\2\2\2\u008a\u0086"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u00c7\3"+
		"\2\2\2\u0091\u0092\7\r\2\2\u0092\u0093\5\20\t\2\u0093\u0094\7\13\2\2\u0094"+
		"\u0095\b\7\1\2\u0095\u00c7\3\2\2\2\u0096\u0097\5\20\t\2\u0097\u0098\7"+
		"\16\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7\13\2\2\u009a\u009b\b\7\1\2"+
		"\u009b\u00c7\3\2\2\2\u009c\u009d\7\17\2\2\u009d\u009e\5\20\t\2\u009e\u009f"+
		"\7\7\2\2\u009f\u00a4\5\16\b\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\5\16\b"+
		"\2\u00a2\u00a3\b\7\1\2\u00a3\u00a5\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\7\1\2\u00a7\u00c7\3\2\2\2\u00a8"+
		"\u00a9\7\21\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac\5"+
		"\16\b\2\u00ac\u00ad\b\7\1\2\u00ad\u00c7\3\2\2\2\u00ae\u00af\7\22\2\2\u00af"+
		"\u00b0\5\20\t\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\b\7\1\2\u00b2\u00c7\3"+
		"\2\2\2\u00b3\u00b4\7+\2\2\u00b4\u00b5\b\7\1\2\u00b5\u00c1\7\5\2\2\u00b6"+
		"\u00b7\5\20\t\2\u00b7\u00be\b\7\1\2\u00b8\u00b9\7\n\2\2\u00b9\u00ba\5"+
		"\20\t\2\u00ba\u00bb\b\7\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b6\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\7\13\2\2\u00c5\u00c7\b"+
		"\7\1\2\u00c6\u0083\3\2\2\2\u00c6\u0091\3\2\2\2\u00c6\u0096\3\2\2\2\u00c6"+
		"\u009c\3\2\2\2\u00c6\u00a8\3\2\2\2\u00c6\u00ae\3\2\2\2\u00c6\u00b3\3\2"+
		"\2\2\u00c7\r\3\2\2\2\u00c8\u00ce\7\b\2\2\u00c9\u00ca\5\f\7\2\u00ca\u00cb"+
		"\b\b\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d6\7\t\2\2\u00d2\u00d3\5\f\7\2\u00d3\u00d4\b\b\1\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00c8\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\17\3\2\2"+
		"\2\u00d7\u00d8\b\t\1\2\u00d8\u00d9\7(\2\2\u00d9\u0106\b\t\1\2\u00da\u00db"+
		"\7*\2\2\u00db\u0106\b\t\1\2\u00dc\u00dd\7)\2\2\u00dd\u0106\b\t\1\2\u00de"+
		"\u00df\7+\2\2\u00df\u0106\b\t\1\2\u00e0\u00e1\7+\2\2\u00e1\u00e2\b\t\1"+
		"\2\u00e2\u00ee\7\5\2\2\u00e3\u00e4\5\20\t\2\u00e4\u00eb\b\t\1\2\u00e5"+
		"\u00e6\7\n\2\2\u00e6\u00e7\5\20\t\2\u00e7\u00e8\b\t\1\2\u00e8\u00ea\3"+
		"\2\2\2\u00e9\u00e5\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00e3\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\6\2\2\u00f1"+
		"\u0106\b\t\1\2\u00f2\u00f3\7\5\2\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\7"+
		"\6\2\2\u00f5\u00f6\b\t\1\2\u00f6\u0106\3\2\2\2\u00f7\u00f8\7\5\2\2\u00f8"+
		"\u00f9\5\22\n\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb\5\20\t\t\u00fb\u00fc\b"+
		"\t\1\2\u00fc\u0106\3\2\2\2\u00fd\u00fe\7\26\2\2\u00fe\u00ff\5\20\t\b\u00ff"+
		"\u0100\b\t\1\2\u0100\u0106\3\2\2\2\u0101\u0102\7\27\2\2\u0102\u0103\5"+
		"\20\t\7\u0103\u0104\b\t\1\2\u0104\u0106\3\2\2\2\u0105\u00d7\3\2\2\2\u0105"+
		"\u00da\3\2\2\2\u0105\u00dc\3\2\2\2\u0105\u00de\3\2\2\2\u0105\u00e0\3\2"+
		"\2\2\u0105\u00f2\3\2\2\2\u0105\u00f7\3\2\2\2\u0105\u00fd\3\2\2\2\u0105"+
		"\u0101\3\2\2\2\u0106\u0127\3\2\2\2\u0107\u0108\f\6\2\2\u0108\u0109\t\2"+
		"\2\2\u0109\u010a\5\20\t\7\u010a\u010b\b\t\1\2\u010b\u0126\3\2\2\2\u010c"+
		"\u010d\f\5\2\2\u010d\u010e\t\3\2\2\u010e\u010f\5\20\t\6\u010f\u0110\b"+
		"\t\1\2\u0110\u0126\3\2\2\2\u0111\u0112\f\4\2\2\u0112\u0113\t\4\2\2\u0113"+
		"\u0114\5\20\t\5\u0114\u0115\b\t\1\2\u0115\u0126\3\2\2\2\u0116\u0117\f"+
		"\3\2\2\u0117\u0118\t\5\2\2\u0118\u0119\5\20\t\4\u0119\u011a\b\t\1\2\u011a"+
		"\u0126\3\2\2\2\u011b\u011c\f\13\2\2\u011c\u011d\7\23\2\2\u011d\u011e\5"+
		"\20\t\2\u011e\u011f\7\24\2\2\u011f\u0120\b\t\1\2\u0120\u0126\3\2\2\2\u0121"+
		"\u0122\f\n\2\2\u0122\u0123\7\25\2\2\u0123\u0124\7+\2\2\u0124\u0126\b\t"+
		"\1\2\u0125\u0107\3\2\2\2\u0125\u010c\3\2\2\2\u0125\u0111\3\2\2\2\u0125"+
		"\u0116\3\2\2\2\u0125\u011b\3\2\2\2\u0125\u0121\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\21\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012a\u012b\7$\2\2\u012b\u0131\b\n\1\2\u012c\u012d\7%\2\2\u012d"+
		"\u0131\b\n\1\2\u012e\u012f\7&\2\2\u012f\u0131\b\n\1\2\u0130\u012a\3\2"+
		"\2\2\u0130\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0131\23\3\2\2\2\u0132\u0133"+
		"\5\22\n\2\u0133\u0134\b\13\1\2\u0134\u0155\3\2\2\2\u0135\u0136\7\23\2"+
		"\2\u0136\u0137\7(\2\2\u0137\u0138\7\24\2\2\u0138\u0139\5\24\13\2\u0139"+
		"\u013a\b\13\1\2\u013a\u0155\3\2\2\2\u013b\u013c\7\'\2\2\u013c\u013d\b"+
		"\13\1\2\u013d\u014f\7\b\2\2\u013e\u013f\7+\2\2\u013f\u0145\b\13\1\2\u0140"+
		"\u0141\7\n\2\2\u0141\u0142\7+\2\2\u0142\u0144\b\13\1\2\u0143\u0140\3\2"+
		"\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\7\2\2\u0149\u014a\5\24"+
		"\13\2\u014a\u014b\7\13\2\2\u014b\u014c\b\13\1\2\u014c\u014e\3\2\2\2\u014d"+
		"\u013e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\t\2\2\u0153"+
		"\u0155\b\13\1\2\u0154\u0132\3\2\2\2\u0154\u0135\3\2\2\2\u0154\u013b\3"+
		"\2\2\2\u0155\25\3\2\2\2\34\33/\67BKbelu}\u008c\u00a4\u00be\u00c1\u00c6"+
		"\u00ce\u00d5\u00eb\u00ee\u0105\u0125\u0127\u0130\u0145\u014f\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}