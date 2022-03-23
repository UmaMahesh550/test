package com.company.capgemini.pack.March15;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("from run method");
    }

    public static void main(String[] args) {
        RunnableThread r1 = new RunnableThread();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(new RunnableThread());

        t1.start();
        t2.start();

    }
}
class TH{
    public static void main(String[] args) {
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("from anonymous class");
            }
        });
        t3.start();

        Thread t4 = new Thread(()->{
            System.out.println("from lambda");
        });
        t4.start();
    }
}

