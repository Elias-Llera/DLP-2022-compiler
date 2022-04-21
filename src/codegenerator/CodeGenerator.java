package codegenerator;

import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {

    private FileWriter out;

    public CodeGenerator(String outputFileName, String inputFileName) {
        try {
            out = new FileWriter(outputFileName);
        } catch (IOException exception){

        }
    }
}
