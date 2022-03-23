package com.company.capgemini.pack.March15;

public class ASExample {
    protected int i;
    public static void main(String[] args) {
        ASExample ase = new ASExample();
        ase.i=15;
    }
}
class A extends ASExample
{
    ASExample as = new ASExample();
    A obj= new A();
}