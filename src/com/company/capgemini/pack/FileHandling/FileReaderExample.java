package com.company.capgemini.pack.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("output1.txt");
            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
            fr.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}