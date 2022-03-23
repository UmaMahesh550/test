package com.company.capgemini.pack.March09;

@FunctionalInterface
interface Lambda{
    void m1(int a);

}

public class LambdaExample {
    public static void main(String[] args) {
        Lambda l1 = new Lambda() {
            @Override
            public void m1(int a) {
                System.out.println("from m1 method");
            }
        };

        Lambda l2=  new Lambda() {
            @Override
            public void m1(int a) {
                System.out.println("from m1 method dfsdsfd");
            }
            void m4(){
                System.out.println("m4");
            }
        };

        Lambda l3 = (y)-> {
            System.out.println("from m1 method from lambda"+y);
        };

        new Lambda() {
            @Override
            public void m1(int a) {
                System.out.println("from m1 method dfsdsfd");
            }
            void m4(){
                System.out.println("m4");
            }
        }.m4();

        l1.m1(4);
        l2.m1(8);
        l3.m1(3);

    }

}