package com.company.capgemini.pack.March08;

public class Student {
    private final String id;
    private final String name;
    public Student(String id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public void display()
    {
        System.out.println("Name : "+name+"\nId : "+id);
    }

    public static void main(String[] args) {
        Student st1=new Student("81284","Rajesh");
        Student st2=new Student("93923","Ramesh");
        Student st3=new Student("81974","Rahul");
        Student st4=new Student("89334","Mahesh");
        Student st5=new Student("18864","Prasad");
        st1.display();
        st2.display();
        st3.display();
        st4.display();
        st5.display();
    }
    enum Color{
        RED("red"),
        GREEN,
        BLUE("blue");
        String name;
        private Color(){

        }
        private Color(String name){
            this.name = name;
            System.out.println("this is constructor");
        }

        void m1(){
            System.out.println("from m1 function");
        }
    }

}
