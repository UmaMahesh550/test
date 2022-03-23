package com.company.capgemini.pack.March17;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static void main(String[] args) throws InterruptedException{
        ProcessingThread pt=new ProcessingThread();
        Thread t1=new Thread(pt,"t1");
        t1.start();
        Thread t2=new Thread(pt,"t2");
        t2.start();
//        t1.join();
//        t2.join();
        System.out.println("Processing count = "+pt.getCount());
    }
}
class ProcessingThread implements Runnable
{
    private final AtomicInteger count=new AtomicInteger();

    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            processSomething(i);
        }
    }

    public AtomicInteger getCount() {
        return count;
    }
    public void processSomething(int i)
    {
        System.out.println(i);
        count.getAndIncrement();
    }
}