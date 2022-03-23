package com.company.capgemini.pack;

public class Overloading {

    public int add(int a,int b){
        int result = a+b;
        return result;
    }
    public float add(float a, float b, float c) {
        float sum = a+b+c;
        return sum;
    }
    public float add(float a, int b, float c) {
        float sum = a+b+c;
        return sum;
    }
    public int add(int a){
        int result = a+8;
        return result;
    }

    public float add(float a) {
        float sum = a + 8.7f;
        return sum;
    }

    public static void main(String[] args) {
        Overloading object=new Overloading();
        System.out.println(object.add(5));
        System.out.println(object.add(10,20));
        System.out. println(object. add(3.14f,7.8f,5.3f));
        System.out. println(object. add(3.14f,5,5.3f));
        System.out.println(object.add(5.8f));
    }
}