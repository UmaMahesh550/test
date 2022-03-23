package com.company.capgemini.pack.March09;

interface Dao{
    void m1();
    void m2();
    default void m4(){
        System.out.println("from m4");
    }
    static  void m5(){
        System.out.println("from m5");
    }
}

public class InterfaceExample implements Dao {
    public void m1(){
        System.out.println("from m1");
    }
    public void m2(){
        System.out.println("from m2");
    }
    public static void m3(){
        System.out.println("from m3");
    }

    public static void main(String[] args) {
        Dao d = new InterfaceExample();
        d.m1();
        d.m2();
        InterfaceExample.m3();
        d.m4();
        Dao.m5();
    }

}
