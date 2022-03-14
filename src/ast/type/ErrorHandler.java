package ast.type;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private static ErrorHandler instance;
    private List<ErrorType> errors;

    private ErrorHandler(){
        errors = new ArrayList<>();
    }

    public static ErrorHandler getInstance(){
        if(instance == null){
            instance = new ErrorHandler();
        }
        return instance;
    }

    public boolean anyError(){
        return !errors.isEmpty();
    }

    public void showErrors(PrintStream printStream){
        for (ErrorType e: errors) {
            printStream.println(e);
        }
    }

    public void addError(ErrorType e){
        errors.add(e);
    }

}
