// Generated from C:/Users/Elías/IdeaProjects/DLP compiler/src/parser\Pmm.g4 by ANTLR 4.9.2
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT_CONSTANT=37, REAL_CONSTANT=38, 
		CHAR_CONSTANT=39, ID=40, TRASH=41;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_variable_definition = 2, RULE_function_definition = 3, 
		RULE_statement = 4, RULE_body = 5, RULE_expression = 6, RULE_built_in_type = 7, 
		RULE_type = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "variable_definition", "function_definition", 
			"statement", "body", "expression", "built_in_type", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "';'", "'def'", "'('", "')'", "'{'", "'}'", "'print'", 
			"'input'", "'='", "'if'", "'else'", "'while'", "'return'", "'['", "']'", 
			"'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>='", "'>'", "'<='", 
			"'<'", "'!='", "'=='", "'&&'", "'||'", "'char'", "'int'", "'double'", 
			"'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
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
		public Function_definitionContext function_definition;
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
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
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(18);
					((ProgramContext)_localctx).definition = definition();
					 _localctx.definitions.addAll(((ProgramContext)_localctx).definition.ast); 
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(26);
			((ProgramContext)_localctx).function_definition = function_definition();
			 _localctx.definitions.add(((ProgramContext)_localctx).function_definition.ast); 
			setState(28);
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
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				((DefinitionContext)_localctx).variable_definition = variable_definition();

				        _localctx.ast.addAll(((DefinitionContext)_localctx).variable_definition.ast);
				       
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
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
		enterRule(_localctx, 4, RULE_variable_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((Variable_definitionContext)_localctx).id1 = match(ID);
			 _localctx.names.add((((Variable_definitionContext)_localctx).id1!=null?((Variable_definitionContext)_localctx).id1.getText():null)); 
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(41);
				match(T__0);
				setState(42);
				((Variable_definitionContext)_localctx).id2 = match(ID);
				 _localctx.names.add((((Variable_definitionContext)_localctx).id2!=null?((Variable_definitionContext)_localctx).id2.getText():null)); 
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__1);
			setState(50);
			((Variable_definitionContext)_localctx).type = type();
			setState(51);
			match(T__2);
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
		public List<VariableDefinition> variableDefinitions = new ArrayList<>();
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
		enterRule(_localctx, 6, RULE_function_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__3);
			setState(55);
			((Function_definitionContext)_localctx).idFunction = match(ID);
			setState(56);
			match(T__4);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(57);
				((Function_definitionContext)_localctx).id1 = match(ID);
				setState(58);
				match(T__1);
				setState(59);
				((Function_definitionContext)_localctx).t1 = built_in_type();
				 _localctx.variableDefinitions.add(new VariableDefinition((((Function_definitionContext)_localctx).id1!=null?((Function_definitionContext)_localctx).id1.getText():null), ((Function_definitionContext)_localctx).t1.ast, ((Function_definitionContext)_localctx).id1.getLine(), ((Function_definitionContext)_localctx).id1.getCharPositionInLine()+1)); 
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(61);
					match(T__0);
					setState(62);
					((Function_definitionContext)_localctx).id2 = match(ID);
					setState(63);
					match(T__1);
					setState(64);
					((Function_definitionContext)_localctx).t2 = built_in_type();
					 _localctx.variableDefinitions.add(new VariableDefinition((((Function_definitionContext)_localctx).id2!=null?((Function_definitionContext)_localctx).id2.getText():null), ((Function_definitionContext)_localctx).t2.ast, ((Function_definitionContext)_localctx).id2.getLine(), ((Function_definitionContext)_localctx).id2.getCharPositionInLine()+1)); 
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(74);
			match(T__5);
			setState(75);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				setState(76);
				((Function_definitionContext)_localctx).type = type();
				 ((Function_definitionContext)_localctx).returnType =  ((Function_definitionContext)_localctx).type.ast; 
				}
			}


			        FunctionType funcType = new FunctionType(_localctx.returnType, ((Function_definitionContext)_localctx).idFunction.getLine(), ((Function_definitionContext)_localctx).idFunction.getCharPositionInLine()+1);
			        ((Function_definitionContext)_localctx).ast =  new FunctionDefinition((((Function_definitionContext)_localctx).idFunction!=null?((Function_definitionContext)_localctx).idFunction.getText():null), funcType, ((Function_definitionContext)_localctx).idFunction.getLine(), ((Function_definitionContext)_localctx).idFunction.getCharPositionInLine()+1);
			    
			setState(82);
			match(T__6);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					((Function_definitionContext)_localctx).variable_definition = variable_definition();
					_localctx.ast.addVariableDefinitions(((Function_definitionContext)_localctx).variable_definition.ast);
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(91);
				((Function_definitionContext)_localctx).statement = statement();
				_localctx.ast.addStatements(((Function_definitionContext)_localctx).statement.ast);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__7);

			        _localctx.variableDefinitions.forEach(varDef->funcType.addParameter(varDef));
			        _localctx.ast.addVariableDefinitions(_localctx.variableDefinitions);
			    
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
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__8);
				setState(103);
				((StatementContext)_localctx).ex1 = expression(0);
				 _localctx.ast.add(new Print(((StatementContext)_localctx).ex1.ast, ((StatementContext)_localctx).ex1.ast.getLine(), ((StatementContext)_localctx).ex1.ast.getColumn())); 
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(105);
					match(T__0);
					setState(106);
					((StatementContext)_localctx).ex2 = expression(0);
					 _localctx.ast.add(new Print(((StatementContext)_localctx).ex2.ast, ((StatementContext)_localctx).ex2.ast.getLine(), ((StatementContext)_localctx).ex2.ast.getColumn())); 
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__9);
				setState(117);
				((StatementContext)_localctx).expression = expression(0);
				setState(118);
				match(T__2);

				            _localctx.ast.add(new Input(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn()));
				         
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				((StatementContext)_localctx).ex1 = expression(0);
				setState(122);
				match(T__10);
				setState(123);
				((StatementContext)_localctx).ex2 = expression(0);
				setState(124);
				match(T__2);

				            _localctx.ast.add(new Assignment(((StatementContext)_localctx).ex1.ast, ((StatementContext)_localctx).ex2.ast, ((StatementContext)_localctx).ex1.ast.getLine(), ((StatementContext)_localctx).ex1.ast.getColumn()));
				         
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(T__11);
				setState(128);
				((StatementContext)_localctx).expression = expression(0);
				setState(129);
				match(T__1);
				setState(130);
				((StatementContext)_localctx).b1 = body();
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(131);
					match(T__12);
					setState(132);
					((StatementContext)_localctx).b2 = body();
					}
					break;
				}

				            IfElse ifElse;
				            if(((StatementContext)_localctx).b2.ast != null){
				                ifElse = new IfElse(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).b1.ast, ((StatementContext)_localctx).b2.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn());
				            } else {
				                ifElse = new IfElse(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).b1.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn());
				            }
				            _localctx.ast.add(ifElse);
				         
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(T__13);
				setState(138);
				((StatementContext)_localctx).expression = expression(0);
				setState(139);
				match(T__1);
				setState(140);
				((StatementContext)_localctx).body = body();

				            _localctx.ast.add(new While(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).body.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn()));
				         
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				match(T__14);
				setState(144);
				((StatementContext)_localctx).expression = expression(0);
				setState(145);
				match(T__2);

				            _localctx.ast.add(new Return(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn()));
				         
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
				((StatementContext)_localctx).ID = match(ID);

				                                    int line, column;
				                                    line = ((StatementContext)_localctx).ID.getLine();
				                                    column = ((StatementContext)_localctx).ID.getCharPositionInLine()+1;
				                                    FunctionInvocation functionInvocation = new FunctionInvocation(
				                                                                                new Variable((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), line, column),
				                                                                                line, column);
				                               
				setState(150);
				match(T__4);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(151);
					((StatementContext)_localctx).ex1 = expression(0);
					 functionInvocation.addParameter(((StatementContext)_localctx).ex1.ast); 
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(153);
						match(T__0);
						setState(154);
						((StatementContext)_localctx).ex2 = expression(0);
						 functionInvocation.addParameter(((StatementContext)_localctx).ex2.ast); 
						}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(164);
				match(T__5);
				setState(165);
				match(T__2);

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
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__6);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(170);
					((BodyContext)_localctx).statement = statement();
					 _localctx.ast.addAll(((BodyContext)_localctx).statement.ast); 
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(T__7);
				}
				break;
			case T__4:
			case T__8:
			case T__9:
			case T__11:
			case T__13:
			case T__14:
			case T__18:
			case T__19:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(185);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new IntLiteral(LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)),
				                    ((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1);
				            
				}
				break;
			case 2:
				{
				setState(187);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new CharLiteral(LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)),
				                    ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1);
				            
				}
				break;
			case 3:
				{
				setState(189);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);

				                ((ExpressionContext)_localctx).ast =  new DoubleLiteral(LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)),
				                    ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1);
				            
				}
				break;
			case 4:
				{
				setState(191);
				((ExpressionContext)_localctx).ID = match(ID);

				                ((ExpressionContext)_localctx).ast =  new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
				                   ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1);
				            
				}
				break;
			case 5:
				{
				setState(193);
				((ExpressionContext)_localctx).ID = match(ID);

				                                    int line, column;
				                                    line = ((ExpressionContext)_localctx).ID.getLine();
				                                    column = ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1;
				                                    FunctionInvocation functionInvocation = new FunctionInvocation(
				                                                                                new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), line, column),
				                                                                                line, column);
				                               
				setState(195);
				match(T__4);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(196);
					((ExpressionContext)_localctx).ex1 = ((ExpressionContext)_localctx).expression = expression(0);
					 functionInvocation.addParameter(((ExpressionContext)_localctx).ex1.ast); 
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(198);
						match(T__0);
						setState(199);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(0);
						 functionInvocation.addParameter(((ExpressionContext)_localctx).ex2.ast); 
						}
						}
						setState(206);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(209);
				match(T__5);

				                ((ExpressionContext)_localctx).ast =  functionInvocation;
				            
				}
				break;
			case 6:
				{
				setState(211);
				match(T__4);
				setState(212);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(213);
				match(T__5);

				                ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				            
				}
				break;
			case 7:
				{
				setState(216);
				match(T__4);
				setState(217);
				((ExpressionContext)_localctx).built_in_type = built_in_type();
				setState(218);
				match(T__5);
				setState(219);
				((ExpressionContext)_localctx).expression = expression(7);

				                ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).built_in_type.ast, ((ExpressionContext)_localctx).expression.ast,
				                    ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				            
				}
				break;
			case 8:
				{
				setState(222);
				match(T__18);
				setState(223);
				((ExpressionContext)_localctx).expression = expression(6);

				                ((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).expression.ast,
				                    ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				            
				}
				break;
			case 9:
				{
				setState(226);
				match(T__19);
				setState(227);
				((ExpressionContext)_localctx).expression = expression(5);

				                ((ExpressionContext)_localctx).ast =  new Negation(((ExpressionContext)_localctx).expression.ast,
				                    ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				            
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(233);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
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
						setState(237);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(238);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__23) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
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
						setState(242);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(243);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
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
						setState(247);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(248);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(249);
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
						setState(252);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(253);
						match(T__15);
						setState(254);
						((ExpressionContext)_localctx).ex2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(255);
						match(T__16);

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
						setState(258);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(259);
						match(T__17);
						setState(260);
						((ExpressionContext)_localctx).ID = match(ID);

						                          ((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).ex.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
						                              ((ExpressionContext)_localctx).ex.ast.getLine(), ((ExpressionContext)_localctx).ex.ast.getColumn());
						                      
						}
						break;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 14, RULE_built_in_type);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__32);

				                    ((Built_in_typeContext)_localctx).ast =  CharType.getInstance();
				                
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__33);

				                    ((Built_in_typeContext)_localctx).ast =  IntegerType.getInstance();
				                
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(T__34);

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
		public Built_in_typeContext built_in_type;
		public Token lineMarker;
		public Token INT_CONSTANT;
		public TypeContext type;
		public Token struct_keyword;
		public Token ID;
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
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				((TypeContext)_localctx).built_in_type = built_in_type();

				        ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).built_in_type.ast;
				    
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				((TypeContext)_localctx).lineMarker = match(T__15);
				setState(279);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(280);
				match(T__16);
				setState(281);
				((TypeContext)_localctx).type = type();

				        ((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)), ((TypeContext)_localctx).type.ast,
				            ((TypeContext)_localctx).lineMarker.getLine(), ((TypeContext)_localctx).lineMarker.getCharPositionInLine()+1);
				    
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				((TypeContext)_localctx).struct_keyword = match(T__35);
				 RecordType record = new RecordType(((TypeContext)_localctx).struct_keyword.getLine(), ((TypeContext)_localctx).struct_keyword.getCharPositionInLine()+1); 
				setState(286);
				match(T__6);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(287);
					((TypeContext)_localctx).ID = match(ID);
					setState(288);
					match(T__1);
					setState(289);
					((TypeContext)_localctx).type = type();
					setState(290);
					match(T__2);
					 record.addField(new RecordField(((TypeContext)_localctx).type.ast, (((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null))); 
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				match(T__7);

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
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0131\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5F"+
		"\n\5\f\5\16\5I\13\5\5\5K\n\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s\13\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u0088\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\5\6"+
		"\u00a5\n\6\3\6\3\6\3\6\5\6\u00aa\n\6\3\7\3\7\3\7\3\7\7\7\u00b0\n\7\f\7"+
		"\16\7\u00b3\13\7\3\7\3\7\3\7\3\7\5\7\u00b9\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00cd\n\b\f\b\16"+
		"\b\u00d0\13\b\5\b\u00d2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e9\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0109\n\b\f\b\16\b\u010c\13\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0114\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0128\n\n\f\n\16\n\u012b"+
		"\13\n\3\n\3\n\5\n\u012f\n\n\3\n\2\3\16\13\2\4\6\b\n\f\16\20\22\2\6\3\2"+
		"\27\31\4\2\25\25\32\32\3\2\33 \3\2!\"\2\u0150\2\31\3\2\2\2\4\'\3\2\2\2"+
		"\6)\3\2\2\2\b8\3\2\2\2\n\u00a9\3\2\2\2\f\u00b8\3\2\2\2\16\u00e8\3\2\2"+
		"\2\20\u0113\3\2\2\2\22\u012e\3\2\2\2\24\25\5\4\3\2\25\26\b\2\1\2\26\30"+
		"\3\2\2\2\27\24\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34"+
		"\3\2\2\2\33\31\3\2\2\2\34\35\5\b\5\2\35\36\b\2\1\2\36\37\7\2\2\3\37 \b"+
		"\2\1\2 \3\3\2\2\2!\"\5\6\4\2\"#\b\3\1\2#(\3\2\2\2$%\5\b\5\2%&\b\3\1\2"+
		"&(\3\2\2\2\'!\3\2\2\2\'$\3\2\2\2(\5\3\2\2\2)*\7*\2\2*\60\b\4\1\2+,\7\3"+
		"\2\2,-\7*\2\2-/\b\4\1\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2"+
		"\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\4\2\2\64\65\5\22\n\2\65\66\7\5"+
		"\2\2\66\67\b\4\1\2\67\7\3\2\2\289\7\6\2\29:\7*\2\2:J\7\7\2\2;<\7*\2\2"+
		"<=\7\4\2\2=>\5\20\t\2>G\b\5\1\2?@\7\3\2\2@A\7*\2\2AB\7\4\2\2BC\5\20\t"+
		"\2CD\b\5\1\2DF\3\2\2\2E?\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2J;\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\b\2\2MQ\7\4\2\2NO\5\22"+
		"\n\2OP\b\5\1\2PR\3\2\2\2QN\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\b\5\1\2TZ\7\t"+
		"\2\2UV\5\6\4\2VW\b\5\1\2WY\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3"+
		"\2\2\2[b\3\2\2\2\\Z\3\2\2\2]^\5\n\6\2^_\b\5\1\2_a\3\2\2\2`]\3\2\2\2ad"+
		"\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\n\2\2fg\b\5\1\2g"+
		"\t\3\2\2\2hi\7\13\2\2ij\5\16\b\2jq\b\6\1\2kl\7\3\2\2lm\5\16\b\2mn\b\6"+
		"\1\2np\3\2\2\2ok\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2"+
		"\2\2tu\7\5\2\2u\u00aa\3\2\2\2vw\7\f\2\2wx\5\16\b\2xy\7\5\2\2yz\b\6\1\2"+
		"z\u00aa\3\2\2\2{|\5\16\b\2|}\7\r\2\2}~\5\16\b\2~\177\7\5\2\2\177\u0080"+
		"\b\6\1\2\u0080\u00aa\3\2\2\2\u0081\u0082\7\16\2\2\u0082\u0083\5\16\b\2"+
		"\u0083\u0084\7\4\2\2\u0084\u0087\5\f\7\2\u0085\u0086\7\17\2\2\u0086\u0088"+
		"\5\f\7\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\b\6\1\2\u008a\u00aa\3\2\2\2\u008b\u008c\7\20\2\2\u008c\u008d\5"+
		"\16\b\2\u008d\u008e\7\4\2\2\u008e\u008f\5\f\7\2\u008f\u0090\b\6\1\2\u0090"+
		"\u00aa\3\2\2\2\u0091\u0092\7\21\2\2\u0092\u0093\5\16\b\2\u0093\u0094\7"+
		"\5\2\2\u0094\u0095\b\6\1\2\u0095\u00aa\3\2\2\2\u0096\u0097\7*\2\2\u0097"+
		"\u0098\b\6\1\2\u0098\u00a4\7\7\2\2\u0099\u009a\5\16\b\2\u009a\u00a1\b"+
		"\6\1\2\u009b\u009c\7\3\2\2\u009c\u009d\5\16\b\2\u009d\u009e\b\6\1\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u0099\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\b"+
		"\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00aa\b\6\1\2\u00a9h\3\2\2\2\u00a9v\3\2"+
		"\2\2\u00a9{\3\2\2\2\u00a9\u0081\3\2\2\2\u00a9\u008b\3\2\2\2\u00a9\u0091"+
		"\3\2\2\2\u00a9\u0096\3\2\2\2\u00aa\13\3\2\2\2\u00ab\u00b1\7\t\2\2\u00ac"+
		"\u00ad\5\n\6\2\u00ad\u00ae\b\7\1\2\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b9\7\n\2\2\u00b5\u00b6\5\n"+
		"\6\2\u00b6\u00b7\b\7\1\2\u00b7\u00b9\3\2\2\2\u00b8\u00ab\3\2\2\2\u00b8"+
		"\u00b5\3\2\2\2\u00b9\r\3\2\2\2\u00ba\u00bb\b\b\1\2\u00bb\u00bc\7\'\2\2"+
		"\u00bc\u00e9\b\b\1\2\u00bd\u00be\7)\2\2\u00be\u00e9\b\b\1\2\u00bf\u00c0"+
		"\7(\2\2\u00c0\u00e9\b\b\1\2\u00c1\u00c2\7*\2\2\u00c2\u00e9\b\b\1\2\u00c3"+
		"\u00c4\7*\2\2\u00c4\u00c5\b\b\1\2\u00c5\u00d1\7\7\2\2\u00c6\u00c7\5\16"+
		"\b\2\u00c7\u00ce\b\b\1\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\5\16\b\2\u00ca"+
		"\u00cb\b\b\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\7\b\2\2\u00d4\u00e9\b\b\1\2\u00d5\u00d6\7\7\2\2\u00d6"+
		"\u00d7\5\16\b\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9\b\b\1\2\u00d9\u00e9\3"+
		"\2\2\2\u00da\u00db\7\7\2\2\u00db\u00dc\5\20\t\2\u00dc\u00dd\7\b\2\2\u00dd"+
		"\u00de\5\16\b\t\u00de\u00df\b\b\1\2\u00df\u00e9\3\2\2\2\u00e0\u00e1\7"+
		"\25\2\2\u00e1\u00e2\5\16\b\b\u00e2\u00e3\b\b\1\2\u00e3\u00e9\3\2\2\2\u00e4"+
		"\u00e5\7\26\2\2\u00e5\u00e6\5\16\b\7\u00e6\u00e7\b\b\1\2\u00e7\u00e9\3"+
		"\2\2\2\u00e8\u00ba\3\2\2\2\u00e8\u00bd\3\2\2\2\u00e8\u00bf\3\2\2\2\u00e8"+
		"\u00c1\3\2\2\2\u00e8\u00c3\3\2\2\2\u00e8\u00d5\3\2\2\2\u00e8\u00da\3\2"+
		"\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9\u010a\3\2\2\2\u00ea"+
		"\u00eb\f\6\2\2\u00eb\u00ec\t\2\2\2\u00ec\u00ed\5\16\b\7\u00ed\u00ee\b"+
		"\b\1\2\u00ee\u0109\3\2\2\2\u00ef\u00f0\f\5\2\2\u00f0\u00f1\t\3\2\2\u00f1"+
		"\u00f2\5\16\b\6\u00f2\u00f3\b\b\1\2\u00f3\u0109\3\2\2\2\u00f4\u00f5\f"+
		"\4\2\2\u00f5\u00f6\t\4\2\2\u00f6\u00f7\5\16\b\5\u00f7\u00f8\b\b\1\2\u00f8"+
		"\u0109\3\2\2\2\u00f9\u00fa\f\3\2\2\u00fa\u00fb\t\5\2\2\u00fb\u00fc\5\16"+
		"\b\4\u00fc\u00fd\b\b\1\2\u00fd\u0109\3\2\2\2\u00fe\u00ff\f\13\2\2\u00ff"+
		"\u0100\7\22\2\2\u0100\u0101\5\16\b\2\u0101\u0102\7\23\2\2\u0102\u0103"+
		"\b\b\1\2\u0103\u0109\3\2\2\2\u0104\u0105\f\n\2\2\u0105\u0106\7\24\2\2"+
		"\u0106\u0107\7*\2\2\u0107\u0109\b\b\1\2\u0108\u00ea\3\2\2\2\u0108\u00ef"+
		"\3\2\2\2\u0108\u00f4\3\2\2\2\u0108\u00f9\3\2\2\2\u0108\u00fe\3\2\2\2\u0108"+
		"\u0104\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\17\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7#\2\2\u010e\u0114"+
		"\b\t\1\2\u010f\u0110\7$\2\2\u0110\u0114\b\t\1\2\u0111\u0112\7%\2\2\u0112"+
		"\u0114\b\t\1\2\u0113\u010d\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\21\3\2\2\2\u0115\u0116\5\20\t\2\u0116\u0117\b\n\1\2\u0117\u012f"+
		"\3\2\2\2\u0118\u0119\7\22\2\2\u0119\u011a\7\'\2\2\u011a\u011b\7\23\2\2"+
		"\u011b\u011c\5\22\n\2\u011c\u011d\b\n\1\2\u011d\u012f\3\2\2\2\u011e\u011f"+
		"\7&\2\2\u011f\u0120\b\n\1\2\u0120\u0129\7\t\2\2\u0121\u0122\7*\2\2\u0122"+
		"\u0123\7\4\2\2\u0123\u0124\5\22\n\2\u0124\u0125\7\5\2\2\u0125\u0126\b"+
		"\n\1\2\u0126\u0128\3\2\2\2\u0127\u0121\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012c\u012d\7\n\2\2\u012d\u012f\b\n\1\2\u012e\u0115\3\2\2\2\u012e"+
		"\u0118\3\2\2\2\u012e\u011e\3\2\2\2\u012f\23\3\2\2\2\31\31\'\60GJQZbq\u0087"+
		"\u00a1\u00a4\u00a9\u00b1\u00b8\u00ce\u00d1\u00e8\u0108\u010a\u0113\u0129"+
		"\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}