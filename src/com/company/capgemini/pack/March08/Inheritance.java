package com.company.capgemini.pack.March08;

class Parent
{
    int id;
    public Parent()
    {
        System.out.println("From Parent constructor");
    }
    int getId(){
        return id;
    }
    void m1(){
        System.out.println("from m1 method parent class");
    }
}

public class Inheritance extends Parent {
    public Inheritance()
    {
        System.out.println("From Child Constructor");
    }
    void m1(){
        System.out.println("from m1 method child class");
    }
    void m2(){
        System.out.println("only from child class");
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        Inheritance obj = new Inheritance();
        Parent p1 = new Inheritance();
//        Inheritance o = new Parent(); --- this is illegal
        obj.id=30;
        obj.getId();
        p.id = 20;
        p.getId();
        p.m1();
        obj.m1();
        p1.m1();
//        p.m2();
        obj.m2();
//       p1.m2();
    }

}
