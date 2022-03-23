package com.company.capgemini.pack.March17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) throws InterruptedException,ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for(int i=0;i<10;i++)
//        {
//            executorService.execute(new Task());
//        }
        List<Future<Integer>> lst= new ArrayList<>();
        for(int i=0;i<5;i++) {
//            Future<Integer> future = executorService.submit(new Task());
            lst.add(executorService.submit(new Task()));
            System.out.println("hello");
        }
        for(Future<Integer> f:lst) {
//            System.out.println(f);
            int a=f.get();
            System.out.println(a);
        }
        executorService.shutdown();
    }
}
//class Task implements Runnable
//{
//    @Override
//    public void run() {
//        System.out.println("Executor Service : "+Thread.currentThread());
//    }
//}
class Task implements Callable<Integer>
{
    public Integer call() throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Executor service : "+Thread.currentThread());
        return 5;
    }
}