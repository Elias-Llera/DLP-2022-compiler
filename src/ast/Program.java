package ast;

import ast.definition.Definition;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractAstNode{

    private List<Definition> program;

    public Program(List<Definition> program, int line, int column) {
        super(line, column);
        this.program = program;
    }

    public Program(int line, int column) {
        super(line, column);
        this.program = new ArrayList<>();
    }

    public List<Definition> getProgram(){
        return new ArrayList<>(program);
    }

    public void addDefinitionToProgram(Definition definition){
        this.program.add(definition);
    }

    @Override
    public String toString() {
        return "Program{" +
                "program=" + program +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
