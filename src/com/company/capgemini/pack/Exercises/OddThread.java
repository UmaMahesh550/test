package com.company.capgemini.pack.Exercises;

class MultiThread implements Runnable {
    Thread t;

    public MultiThread() {
        // Create a new, second thread
        t = new Thread(this, "EVEN THREAD");
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread
    }

    // This is the entry point for the second thread.
    public void run() {
//        try {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i+" is Even");
//                    Thread.sleep(1000);
                }
            }
//        }
//        catch (InterruptedException e) {
//            System.out.println("Even Thread interrupted.");
//        }
//        System.out.println("Exiting even thread.");
    }
}
public class OddThread
{
    public static void main(String args[])
    {
        new MultiThread(); // create a new thread
//        try
//        {
            for(int i = 0; i <= 10; i++)
            {
                if(i%2!=0)
                {
                    System.out.println(i+" is Odd.");
//                    Thread.sleep(1000);
                }
            }
//        }
//        catch (InterruptedException e)
//        {
//            System.out.println("Odd thread interrupted.");
//        }
//        System.out.println("Odd thread exiting.");
    }
}
