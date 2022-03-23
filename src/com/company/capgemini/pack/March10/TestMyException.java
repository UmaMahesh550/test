package com.company.capgemini.pack.March10;

public class TestMyException {
    void m1() throws MyException{
        throw new MyException();
    }
    public static void main(String[] args) {
        TestMyException obj = new TestMyException();
        try {
            obj.m1();
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("after handling MyException");
    }

}
