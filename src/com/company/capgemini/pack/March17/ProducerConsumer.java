package com.company.capgemini.pack.March17;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer> bqueue
                = new ArrayBlockingQueue<Integer>(4);

        Producer p1 = new Producer(bqueue);
        Consumer c1 = new Consumer(bqueue);

        Thread pThread = new Thread(p1);
        Thread cThread = new Thread(c1);

        // Start both threads
        pThread.start();
        cThread.start();
    }
}
class Producer implements Runnable
{
    BlockingQueue<Integer> obj;
    public Producer(BlockingQueue<Integer> obj)
    {
        this.obj=obj;
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            try{
                obj.put(i);
                System.out.println("Produced : "+i);
            }
            catch(InterruptedException e)
            {
                System.out.println("Exception Occured");
            }
        }
    }
}
class Consumer implements Runnable
{
    BlockingQueue<Integer> obj;
    int taken=0;
    public Consumer(BlockingQueue<Integer> obj)
    {
        this.obj=obj;
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            try
            {
                taken=obj.take();
                System.out.println("Consumed : "+taken);
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupt Occured.");
            }
        }
    }
}
