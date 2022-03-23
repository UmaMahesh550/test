package com.company.capgemini.pack.March15;

public class AccessSpecifierExample {
    protected int i;
}
class ASE
{
    public static void main(String[] args) {
        AccessSpecifierExample as= new AccessSpecifierExample();
        as.i=10;
        System.out.println(as.i);
    }
}
