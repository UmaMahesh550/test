package com.company.capgemini.pack.March07;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ControlStatements {
    public void ifElse(int a)
    {
        System.out.println("==============If Else===============");
        if(a%2==0) {
            System.out.println("Even Number");
        }
        else
            System.out.println("Odd Number");
    }
    void forLoop(int a)
    {
        System.out.println("================For================");
        for(int i = 0;i<=a;i++) {
            System.out.println(i);
        }
    }
    void whileLoop(int a)
    {
        System.out.println("==============while===============");
        int i = 0;
        while(i<=a){
            System.out.println(i);
            i++;
        }
        System.out.println("come out of while = " +i);
    }
    void doWhileLoop1(int a)
    {
        System.out.println("=================do while example1 ==================");
        int i = 0;
        do{
            System.out.println(i);
            i++;
        } while(i<=a);
        System.out.println("come out of do while = " +i);

    }
    void doWhileLoop2(int a)
    {
        System.out.println("=================do while example2 ==================");
        int i=11;
        do{
            System.out.println(i);
            i++;
        } while(i<=a);
        System.out.println("come out of do while = " +i);
    }
    void pattern1()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    void ternaryOp(int a,int b)
    {
        System.out.println(a>b?a+" is greater than "+b:b+" is greater than "+a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ControlStatements cs = new ControlStatements();
//        int n=sc.nextInt();
//        cs.ifElse(n);
//        cs.forLoop(n);
//        cs.whileLoop(n);
//        cs.doWhileLoop1(n);
//        cs.doWhileLoop2(n);
//        cs.pattern1();
        cs.ternaryOp(5,7);

    }
}
