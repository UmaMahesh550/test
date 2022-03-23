package com.company.capgemini.pack.March08;

public class EnumExample {
    enum Color {
        RED("red"),
        GREEN,
        BLUE("blue");
        String name;

        Color() {
            System.out.println("From default Constructor");
        }

        Color(String name) {
            this.name = name;
            System.out.println("This is parameterized constructor");
        }

        void m1() {
            System.out.println("from m1 function");
        }
    }

    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1 + "  " + 0 + "  " + c1.name);
        c1.m1();
        Color c2 = Color.GREEN;
        System.out.println(c2 + "  " + c2.ordinal() + " " + c2.name);
        c2.m1();
        Color c3 = Color.BLUE;
        System.out.println(c3 + "  " + c3.ordinal() + " " + c3.name);
    }

}