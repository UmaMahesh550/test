package com.company.capgemini.pack.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderFromScanner {
    public static void main(String[] args) throws FileNotFoundException {
        // pass the path of the file as a parameter
        File file = new File("output1.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
