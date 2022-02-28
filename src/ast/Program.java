package ast;

import ast.definition.Definition;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractAstNode{

    private List<Definition> program;

    public Program(List<Definition> program, int line, int column) {
        super(line, column);
        this.program = program;
    }

    public List<Definition> getProgram(){
        return new ArrayList<>(program);
    }

    public void addDefinitionToProgram(Definition definition){
        this.program.add(definition);
    }

}
