package com.company.capgemini.pack.March14;

public class StringExample {
    static void stringMethod()
    {
        String s1 = "hello";
        String s2 = new String("Hello");
        System.out.println(s1.startsWith("he"));
        String s3 = String.format("Hello %s welcome to room.", "Uma");
        System.out.println(s3);
        String s4 = "Hello Welcome to the organization.";
        String s5[] = s4.split(" ");
        for(String s:s5)
        {
            System.out.println(s);
        }
        System.out.println(s1.concat(" World"));

    }
    static void stringBufferMethod()
    {
        StringBuffer s1=new StringBuffer("Hello World");
        s1.append(" 1");
        System.out.println(s1);
        s1.insert(5," Welcome to Mahesh");
        System.out.println(s1);
        s1.replace(17,23,"Uma");
        System.out.println(s1);
        System.out.println(s1.reverse());
        s1.reverse();
        System.out.println(s1);
        s1.delete(17,21);
        System.out.println(s1);
        s1.delete(22,24);
        System.out.println(s1);
    }
    static void stringBuilderMethod()
    {
        StringBuilder s1=new StringBuilder("Hello World");
        s1.append(" 1");
        System.out.println(s1);
        s1.insert(5," Welcome to Mahesh");
        System.out.println(s1);
        s1.replace(17,23,"Uma");
        System.out.println(s1);
        System.out.println(s1.reverse());
        s1.reverse();
        System.out.println(s1);
        s1.delete(17,21);
        System.out.println(s1);
        s1.delete(22,24);
        System.out.println(s1);
    }

    public static void main(String[] args) {
        stringMethod();
//        stringBufferMethod();
//        stringBuilderMethod();
    }
}
