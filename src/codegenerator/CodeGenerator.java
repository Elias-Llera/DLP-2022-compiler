package codegenerator;

import ast.AstNode;
import ast.definition.FunctionDefinition;
import ast.type.CharType;
import ast.type.IntegerType;
import ast.type.Type;
import introspector.test.ast.ASTNode;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;
    private int label;

    public CodeGenerator(String outputFileName, String inputFileName) {
        try {
            this.out = new PrintWriter(outputFileName);
        } catch(IOException e){
            System.err.println("Error opening the file"+outputFileName);
            System.exit(-1);
        }
        this.writeSource(inputFileName);
    }

    public int generateLabel(){
        return label++;
    }

    public void writeLabel(int labelNumber){
        out.println("LABEL_" + labelNumber + ":");
        out.flush();
    }

    public void writeSource(String inputFileName){
        out.println("#source \"" + inputFileName + "\"\n");
        out.flush();
    }

    public void mainCall(){
        out.println("' Invocation to the main function");
        out.println("call main");
        out.println("halt");
        out.println();
        out.flush();
    }

    public void writeComment(String comment) {
        out.println("\t' * "+comment);
        out.flush();
    }

    public void writeLine(AstNode astNode) {
        out.println();
        out.println("#line\t"+ astNode.getLine());
        out.flush();
    }

    public void enter(int number){
        out.println("\tenter\t"+number);
        out.flush();
    }

    public void ret(int returnSize, int bytesForLocals, int bytesForParams){
        out.println("\tret\t" + returnSize+", " + bytesForLocals+", " + bytesForParams);
        out.flush();
    }

    public void generateLabel(String labelName){
        out.println(labelName + ":");
        out.flush();
    }
    
    public void in(Type type){
        out.println("\tin" + type.suffix());
        out.flush();
    }

    public void store(Type type){
        out.println("\tstore" + type.suffix());
        out.flush();
    }

    public void out(Type type) {
        out.println("\tout" + type.suffix());
        out.flush();
    }

    public void pusha(int address) {
        out.println("\tpusha\t" + address);
        out.flush();
    }

    public void pushBP() {
        out.println("\tpush\tbp");
        out.flush();
    }

    public void push(int value) {
        out.println("\tpushi\t" + value);
        out.flush();
    }

    public void push(double value) {
        out.println("\tpushf\t" + value);
        out.flush();
    }

    public void push(char value) {
        out.println("\tpushb\t" + (int)value);
        out.flush();
    }

    public void add(Type type) {
        if(type.equals(CharType.getInstance())) throw new IllegalStateException("Cannot do this operation for chars");
        out.println("\tadd" + type.suffix());
        out.flush();
    }

    public void mul(Type type) {
        if(type.equals(CharType.getInstance())) throw new IllegalStateException("Cannot do this operation for chars");
        out.println("\tmul" + type.suffix());
        out.flush();
    }

    public void sub(Type type) {
        if(type.equals(CharType.getInstance())) throw new IllegalStateException("Cannot do this operation for chars");
        out.println("\tsub" + type.suffix());
        out.flush();
    }

    public void div(Type type) {
        if(type.equals(CharType.getInstance())) throw new IllegalStateException("Cannot do this operation for chars");
        out.println("\tdiv" + type.suffix());
        out.flush();
    }

    public void mod(Type type) {
        if(type.equals(CharType.getInstance())) throw new IllegalStateException("Cannot do this operation for chars");
        out.println("\tmod" + type.suffix());
        out.flush();
    }

    public void and() {
        out.println("\tand");
        out.flush();
    }

    public void or() {
        out.println("\tor");
        out.flush();
    }

    public void not() {
        out.println("\tnot");
        out.flush();
    }

    public void load(Type type) {
        out.println("\tload" + type.suffix());
        out.flush();
    }

    public void gt(Type type) {
        out.println("\tgt" + type.suffix());
        out.flush();
    }

    public void lt(Type type) {
        out.println("\tlt" + type.suffix());
        out.flush();
    }

    public void ge(Type type) {
        out.println("\tge" + type.suffix());
        out.flush();
    }

    public void le(Type type) {
        out.println("\tle" + type.suffix());
        out.flush();
    }

    public void eq(Type type) {
        if(type.equals(CharType.getInstance())){
            out.println("\teqi");
        }else{
            out.println("\teq" + type.suffix());
        }
        out.flush();
    }

    public void ne(Type type) {
        out.println("\tne" + type.suffix());
        out.flush();
    }

    public void i2f() {
        out.println("\ti2f");
        out.flush();
    }

    public void b2i() {
        out.println("\tb2i");
        out.flush();
    }

    public void f2i() {
        out.println("\tf2i");
        out.flush();
    }

    public void i2b() {
        out.println("\ti2b");
        out.flush();
    }

    public void callFunction(String name) {
        out.println("\tcall " + name);
        out.flush();
    }

    public void jz(int labelNumber) {
        out.println("\tjz LABEL_" + labelNumber);
        out.flush();
    }

    public void jmp(int labelNumber) {
        out.println("\tjmp LABEL_" + labelNumber);
        out.flush();
    }

    public void pop(Type type) {
        out.println("\tpop" + type.suffix());
    }
}
