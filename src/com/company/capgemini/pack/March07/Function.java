package com.company.capgemini.pack.March07;

public class Function {
    /*static int a;
    public static void method() {
        System.out.println("Hello World called from function.");
        a = 10;
    }
    public void subtract()
    {
        a=a-5;
        System.out.println("Subtracted value : "+a);
    }*/
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void add(){
        System.out.println("from function without arguments.");
    }
    public void add(int a){
        System.out.println("from function with 1 argument = "+a);
    }
    public void add(int a, int b){
        System.out.println("from function with 2 arguments = "+(a+b));
    }
    public void add(float a, float b){
        System.out.println("from function with 3 arguments = " +(a+b) );
    }
    public int add(int a, int b,int c){
        int result = a+b+c;
        return result;
    }

    public static void main(String[] args) {
        /*System.out.println(args[0]);
        Function ob = new Function();
        ob.method();
        method();
        ob.subtract();
        */
        Function obj = new Function();
        obj.add();
        obj.add(3);
        obj.add(7,4);
        obj.add(3.14f, 6.7f);
        System.out.println("result without assigning return value in variable = "+obj.add(3,4,5));
        int r = obj.add(7,6,5);
        System.out.println("result with assigning return value in variable = "+ r);
        obj.setSalary(10000.00f);
        System.out.println("Salary : "+obj.getSalary());
    }
}
