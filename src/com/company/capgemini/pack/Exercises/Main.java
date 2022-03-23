package com.company.capgemini.pack.Exercises;

import java.util.Scanner;

class Event
{
    protected String name,type;
    protected double costPerDay;
    protected int noOfDays;
    public Event(String name,String type,double costPerDay,int noOfDays)
    {
        this.name=name;
        this.type=type;
        this.costPerDay=costPerDay;
        this.noOfDays=noOfDays;
    }

}
class Exhibition extends Event
{
    private static int gst=5;
    private int noOfStalls;
    double res=0;

    public int getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(int noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public Exhibition(String name, String type, double costPerDay, int noOfDays, int noOfStalls)
    {
        super(name,type,costPerDay,noOfDays);
        this.noOfStalls=noOfStalls;
    }
    public double totalCost()
    {
        double res=((costPerDay*noOfDays)*5)/100;
        return (res+(noOfDays*costPerDay));
    }
}

class StageEvent extends Event
{
    private static int gst=15;
    private int noOfSeats;
    double res=0;
    public StageEvent(String name,String type,double costPerDay,int noOfDays,int noOfSeats)
    {
        super(name,type,costPerDay,noOfDays);
        this.noOfSeats=noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    public double totalCost()
    {
        res=((costPerDay*noOfDays)*15)/100;
        return (res+(costPerDay*noOfDays));
    }
}

public class Main {
    public static void main(String[] args) {
        String name,type;
        int days,seats,stalls,input;
        double cost;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter event name : ");
        name=sc.nextLine();
        System.out.println("Enter the cost perday : ");
        cost=sc.nextDouble();
        System.out.println("Enter number of Days : ");
        days=sc.nextInt();
        System.out.println("Enter type of event\n1.Exhibition\n2.Stage Event");
        input=sc.nextInt();
        if(input==1)
        {
            System.out.println("Enter the number of stalls : ");
            stalls=sc.nextInt();
            Exhibition ex = new Exhibition(name,"Exhibition",cost,days,stalls);
            ex.setNoOfStalls(stalls);
            System.out.println("Event Details");
            System.out.println("Name : "+ex.name);
            System.out.println("Type : "+ex.type);
            System.out.println("Number of stalls : "+ex.getNoOfStalls());
            System.out.println("Total amount : "+ex.totalCost());
        }
        if (input==2)
        {
            System.out.println("Enter the number of seats : ");
            seats = sc.nextInt();
            StageEvent se = new StageEvent(name,"Stage Event",cost,days,seats);
            se.setNoOfSeats(seats);
            System.out.println("Event Details");
            System.out.println("Name : "+se.name);
            System.out.println("Type : "+se.type);
            System.out.println("Number of seats : "+se.getNoOfSeats());
            System.out.println("Total amount : "+se.totalCost());
        }
    }
}
