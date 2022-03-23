package com.company.capgemini.pack.March10;

import java.io.IOException;

public class ExceptionExample1{
    void m2(){
        m1(3,0);
        System.out.println("in m2 method");
    }
    void m1(int a, int b)  {
        try {
            int f = a / b;
            System.out.println(f);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("in m1 method");
//        throw new RuntimeException();
    }

    void m3() throws IOException {
        throw new IOException();
    }
    public static void main(String[] args){
        ExceptionExample1 obj = new ExceptionExample1();
        obj.m2();
        try {
            obj.m3();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("after try block");
    }

}
