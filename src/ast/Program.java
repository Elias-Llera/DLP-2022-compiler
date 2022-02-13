package ast;

import ast.definition.Definition;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractAstNode{

    private List<Definition> program;

    public Program(int line, int column) {
        super(line, column);
    }

    public List<Definition> getProgram(){
        return new ArrayList<>(program);
    }

    public void addDefinitionToProgram(Definition definition){
        this.program.add(definition);
    }

}
