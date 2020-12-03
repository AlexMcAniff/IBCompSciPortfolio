package Project4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

    private File file;
    public Writer(File file){
        this.file = file;
    }
    public void addText(String text) throws IOException {
        FileWriter addTextToFile = new FileWriter(file);
        addTextToFile.append(text);
        addTextToFile.close();
    }
}
