package Project4;

import java.io.*;
import java.util.Scanner;

public class Parser {
    public Scanner scanner;
    private File file;

    public Parser (File file) {
        try{
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("no file was found");
            e.printStackTrace();
        }
    }
    public void printData(){
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
    public void average(){
        double total = 0;
        int count = 0;
        while (scanner.hasNext()){
            total += Double.parseDouble(scanner.nextLine());
            count += 1;
        }
        int test = 0;
        System.out.println(total = total/count);
    }

}
