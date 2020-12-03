package Project4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static  void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Alex  McAniff\\Documents\\IBComputerScienceProblemSets\\IBCompSciPortfolio\\src\\Project4\\File");
        Writer writer = new Writer(file);
        Parser parser = new Parser(file);
        parser.average();

    }
}
