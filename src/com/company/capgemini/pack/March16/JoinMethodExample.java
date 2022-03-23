package com.company.capgemini.pack.March16;

public class JoinMethodExample extends Thread{
    JoinMethodExample(String name){
        super(name);
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(i+""+Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        JoinMethodExample t1= new JoinMethodExample("t1");
        JoinMethodExample t2= new JoinMethodExample("t2");
        JoinMethodExample t3= new JoinMethodExample("t3");
        t1.start();
        try
        {
            t1.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
