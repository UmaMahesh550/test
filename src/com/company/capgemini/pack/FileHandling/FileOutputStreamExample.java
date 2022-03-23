package com.company.capgemini.pack.FileHandling;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try{

            FileOutputStream fout=new FileOutputStream("C:\\CapSpace\\src\\com\\company\\capgemini\\pack\\FileHandling\\testout.txt", true);
//            fout.write(65);
            String s=" This is new ";
            byte[] b=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }

}
