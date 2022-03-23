package com.company.capgemini.pack.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Main {
    static void StudentList(){
        List<Student1> li = new ArrayList<Student1>();
        li.add(new Student1(3,23,"harshada"));
        li.add(new Student1(2,34,"Teju"));
        li.add(new Student1(1,20,"Daksh"));
        Collections.sort(li);
        for(Student1 st : li){
            System.out.println(st);
        }
    }

    static void StudentSortList(){
        List<Student2> li = new ArrayList<Student2>();
        li.add(new Student2(3,23,"Harshada"));
        li.add(new Student2(2,17,"Teju"));
        li.add(new Student2(1,20,"Daksh"));
        System.out.println("===============sort on Name ===============");
        Collections.sort(li,new NameComparator());
        for(Student2 st : li){
            System.out.println(st);
        }
        System.out.println("===============sort on Age ===============");
        Collections.sort(li,new AgeComparator());
        for(Student2 st : li){
            System.out.println(st);
        }
    }
    static void TreeMap(){
        TreeMap<Student2, String> map = new TreeMap<Student2, String>(new NameComparator());
        map.put(new Student2(3,23,"Harshada"),"abc");
        map.put(new Student2(2,34,"Daksh"),"pqr");
        map.put(new Student2(1,3,"Teju"),"dfgf");
        System.out.println("================By using for each===============");
        map.forEach((k,v)-> System.out.println(k +" "+v));
    }
    static void TreeAgeMap(){
        TreeMap<Student2, String> map = new TreeMap<Student2, String>(new AgeComparator());
        map.put(new Student2(3,23,"Harshada"),"abc");
        map.put(new Student2(2,34,"Daksh"),"pqr");
        map.put(new Student2(1,3,"Teju"),"dfgf");
        System.out.println("================By using for each===============");
        map.forEach((k,v)-> System.out.println(k +" "+v));
    }
    public static void main(String[] args) {
//        MapMethod();
        StudentList();
        StudentSortList();
        TreeMap();
        TreeAgeMap();
    }
}
