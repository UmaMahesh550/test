package com.company.capgemini.pack.Exercises;

import java.util.Scanner;

public class NumberAverage {

    static String findAverage(int[] arr)
    {
        int sum=0;
        int avg;
        if(arr.length==0)
            return "Array is Empty.";
        else
        {
            for(int i:arr)
            {
                if(i<0)
                    return"Give proper positive integer values.";
            }
        }
        for(int i:arr)
        {
            sum=sum+i;
        }
        avg=sum/arr.length;
        String res=Integer.toString(avg);
        return res;
    }
    static void getArrayValues()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of values : ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array values : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        String res=findAverage(arr);
        if(res.equals("Array is Empty.")||res.equals("Give proper positive integer values."))
            System.out.println(res);
        else
            System.out.println("Average value is : "+res);
    }

    public static void main(String[] args) {

        getArrayValues();
    }
}
