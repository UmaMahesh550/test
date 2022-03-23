package com.company.capgemini.pack.March15;

public class ThreadExample extends Thread{
    ThreadExample(String name){
        super(name);
    }
    public void run(){
        System.out.println("this is from run method"+Thread.currentThread());
    }


    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample("t1");
        ThreadExample t2 = new ThreadExample("t2");
//     t1.setName("t1");
//     t2.setName("t2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }

}
