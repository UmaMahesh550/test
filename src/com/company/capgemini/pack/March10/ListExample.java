package com.company.capgemini.pack.March10;

import java.util.*;

public class ListExample {
    static void ListMethod(){
        List<String> li = new ArrayList<String>();
        li.add("kori");
        li.add("daksh");
        li.add("harshada");
        System.out.println("====================Array list===================");
        for(String s:li){
            System.out.println(s);
        }
    }
    static void LinkedListMethod(){
        List<String> li = new LinkedList<String>();
        li.add("kori");
        li.add("daksh");
        li.add("harshada");
        System.out.println("====================linked list===================");
        for(String s:li){
            System.out.println(s);
        }
    }
    static void PersonListMethod(){
        List<Person> li = new LinkedList<Person>();
        li.add(new Person(2));
        li.add(new Person(3));
        li.add(new Person(4));
        li.add(3,new Person(5));
        System.out.println("====================Person linked list===================");
        System.out.println("from index = "+li.get(3).id);
        System.out.println("==============Direct index access============");
        for(int i = 0; i < li.size();i++){
            System.out.println(li.get(i).id);
        }
        System.out.println("==========Enhanced for loop accessing===========");
        for(Person p:li){
            System.out.println(p.id);
        }
    }
    static void PersonVectorMethod(){
        List<Person> li = new Vector<Person>();
        li.add(new Person(2));
        li.add(new Person(3));
        li.add(new Person(4));
        li.add(3,new Person(5));
        System.out.println("====================Person Vector list===================");
        System.out.println("from index = "+li.get(3).id);
        System.out.println("==============Direct index access============");
        for(int i = 0; i < li.size();i++){
            System.out.println(li.get(i).id);
        }
        System.out.println("==========Enhanced for loop accessing===========");
        for(Person p:li){
            System.out.println(p.id);
        }
    }
    static void deQueueMethod()
    {
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("Hello");
        dq.add("World");
        dq.addFirst("Hai");
        dq.addLast("Welcome");
        dq.add("To");
        dq.add("The World");
        System.out.println("===================ArrayDeQueueMethod==================");
        for(String s:dq) {
            System.out.println(s);
        }
        System.out.println("========Peek First Element========");
        System.out.println(dq.peekFirst());
        System.out.println("========Peek Last Element========");
        System.out.println(dq.peekLast());
        System.out.println("========DeQueue List========= ");
        for(String s:dq) {
            System.out.println(s);
        }
        System.out.println("=======Poll Last Element========");
        System.out.println(dq.pollLast());
        System.out.println("========DeQueue List========= ");
        for(String s:dq) {
            System.out.println(s);
        }
        System.out.println("========Poll First Element========");
        System.out.println(dq.pollFirst());
        System.out.println("========DeQueue List========= ");
        for(String s:dq) {
            System.out.println(s);
        }
        System.out.println("======Remove Method======");
        System.out.println(dq.remove());
        System.out.println("======DeQueue List======");
        for(String s:dq) {
            System.out.println(s);
        }
        System.out.println("=======Remove Last Method========");
        System.out.println(dq.removeLast());
        System.out.println("========Dequeue List========");
        for(String s:dq) {
            System.out.println(s);
        }
        System.out.println("======Element Method======");
        System.out.println(dq.element());
    }
    static void setMethod()
    {
        Set<String> s=new HashSet<String>();
        s.add("Palaniar");
        s.add("Swami");
        s.add("Devadas");
        s.add("Khiladi");
        s.add("Swami");
        s.add("swami");
        System.out.println("=========Set Method========");
        for(String st:s)
            System.out.println(s);
        Iterator<String> it = s.iterator();
        System.out.println("=====Iterating Elements through Iterator=====");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    static void treeSetMethod()
    {
        Set<String> s=new TreeSet<String>();
        s.add("Palaniar");
        s.add("Swami");
        s.add("Devadas");
        s.add("Khiladi");
        s.add("Swami");
        s.add("swami");
        System.out.println("=========Tree Set Method========");
        for(String st:s)
            System.out.println(s);
    }
    static void linkedSetMethod()
    {
        Set<String> s=new LinkedHashSet<String>();
        s.add("Palaniar");
        s.add("Swami");
        s.add("Devadas");
        s.add("Khiladi");
        s.add("Swami");
        s.add("swami");
        System.out.println("=========Linked Set Method========");
        for(String st:s)
            System.out.println(s);
    }


    public static void main(String[] args) {
//        ListMethod();
//        LinkedListMethod();
//        PersonListMethod();
//        PersonVectorMethod();
//        deQueueMethod();
        setMethod();
//        treeSetMethod();
        //linkedSetMethod();
    }

}