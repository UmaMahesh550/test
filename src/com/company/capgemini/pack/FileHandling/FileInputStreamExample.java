package com.company.capgemini.pack.FileHandling;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("C:\\CapSpace\\src\\com\\company\\capgemini\\pack\\FileHandling\\testout.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }

}
