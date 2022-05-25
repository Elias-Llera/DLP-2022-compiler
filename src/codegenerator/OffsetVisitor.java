package codegenerator;

import ast.AstNode;
import ast.definition.FunctionDefinition;
import ast.definition.VarDefinition;
import ast.type.FunctionType;
import ast.type.RecordField;
import ast.type.RecordType;
import semantic.AbstractVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OffsetVisitor extends AbstractVisitor<Void, Void> {

    private int globalOffset = 0;
    private int localOffset = 0;
    private int paramOffset = 0;
    private int recordFieldOffset = 0;

    @Override
    public Void visit(VarDefinition varDefinition, Void param){
        super.visit(varDefinition, param);

        if(varDefinition.getScope() == 0){
            varDefinition.setOffset(globalOffset);
            globalOffset += varDefinition.getType().numberOfBytes();
        } else if(varDefinition.getScope()== 0){
            localOffset += varDefinition.getType().numberOfBytes();
            varDefinition.setOffset(-localOffset);
        }

        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param){
        localOffset = 0;

        super.visit(functionDefinition, param);

        for (VarDefinition localVariable : functionDefinition.getFunctionVariables()) {
            localOffset += localVariable.getType().numberOfBytes();
            localVariable.setOffset(- localOffset);
        }

        functionDefinition.setBytesForLocals(localOffset);

        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param){
        paramOffset = 0;
        functionType.setBytesForParams(0);

        List<VarDefinition> inverseParams = new ArrayList(functionType.getParameters());
        Collections.reverse(inverseParams);

        for(VarDefinition funcParam : inverseParams){
            funcParam.setOffset(4+paramOffset); // -4 por BP
            paramOffset += funcParam.getType().numberOfBytes();
            functionType.setBytesForParams(functionType.getBytesForParams() + funcParam.getType().numberOfBytes());
        }

        return null;
    }

    @Override
    public Void visit(RecordType recordType, Void param){
        recordFieldOffset = 0;

        for(RecordField recordField : recordType.getFields()){
            recordField.accept(this, param);
        }

        return null;
    }

    @Override
    public Void visit(RecordField recordField, Void param){

        recordField.setOffset(recordFieldOffset);
        recordFieldOffset += recordField.getType().numberOfBytes();

        return null;
    }

}
