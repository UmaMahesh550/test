package com.company.capgemini.pack.March10;

public class Person {
    private int age;
    int id;
    private String name;
    static String city;
    public Person(int id)
    {
        this.id=id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        city="Visakhapatnam";
        Person p1 = new Person(3);
        Person p2 = new Person(5);
        Person p3 = new Person(7);
        Person p4 = new Person(9);
        Person p5 = new Person(1);
        p1.setName("Arav");
        p1.setAge(24);
        p2.setName("Raghu");
        p2.setAge(28);
        p3.setName("Mahesh");
        p3.setAge(30);
        p4.setName("Swanath");
        p4.setAge(26);
        p5.setName("Latha");
        p5.setAge(22);
        System.out.println("Person1:\nName : "+p1.getName()+"\nAge : "+p1.getAge()+"\nCity : "+Person.city);
        System.out.println("Person2:\nName : "+p2.getName()+"\nAge : "+p2.getAge()+"\nCity : "+Person.city);
        System.out.println("Person3:\nName : "+p3.getName()+"\nAge : "+p3.getAge()+"\nCity : "+Person.city);
        System.out.println("Person4:\nName : "+p4.getName()+"\nAge : "+p4.getAge()+"\nCity : "+Person.city);
        System.out.println("Person5:\nName : "+p5.getName()+"\nAge : "+p5.getAge()+"\nCity : "+Person.city);
        System.out.println(p5.name+"'s 2nd Character in Name : "+p5.name.charAt(1));
    }
}