package com.company.capgemini.pack.March07;

public class Operators {
    public static void main(String[] args)
    {
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

        int sum = 0;
        sum -= 10;  //sum = sum-10;
        System.out.println("Sum is "+sum);

//        &->AND  &&
//        |->OR  ||
        int age = 10;
        char gender = 'F';
        if(age >=18 & gender == 'F'){
            System.out.println("you are in with bitwise & operator");
        } else {
            System.out.println("you are out with bitwise & operator");
        }
        if(age >=18 | gender == 'F'){
            System.out.println("you are in with bitwise | operator");
        } else {
            System.out.println("you are out with bitwise | operator");
        }

    }
}
