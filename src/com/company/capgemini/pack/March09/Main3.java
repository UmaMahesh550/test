package com.company.capgemini.pack.March09;

import java.util.Scanner;

abstract class Event
{
    protected String name,detail,type,organiser;
    public Event(String name,String detail,String type,String organiser)
    {
       this.name=name;
       this.detail=detail;
       this.type=type;
       this.organiser=organiser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    abstract double calculateAmount();
}

class Exhibition extends Event
{
    private int noOfStalls;
    private double rentPerStall;

    public int getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(int noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public double getRentPerStall() {
        return rentPerStall;
    }

    public void setRentPerStall(double rentPerStall) {
        this.rentPerStall = rentPerStall;
    }

    public Exhibition(String name, String detail, String type, String organiser, int noOfStalls, double rentPerStall)
    {
        super(name,detail,type,organiser);
        this.noOfStalls=noOfStalls;
        this.rentPerStall=rentPerStall;
    }
    @Override
    double calculateAmount()
    {
        return (noOfStalls*rentPerStall);
    }
}

class StageEvent extends Event
{
    private int noOfShows;
    private double costPerShow;

    public int getNoOfShows() {
        return noOfShows;
    }

    public void setNoOfShows(int noOfShows) {
        this.noOfShows = noOfShows;
    }

    public double getCostPerShow() {
        return costPerShow;
    }

    public void setCostPerShow(double costPerShow) {
        this.costPerShow = costPerShow;
    }

    public StageEvent(String name, String detail, String type, String organiser, int noOfShows, double costPerShow)
    {
        super(name,detail,type,organiser);
        this.noOfShows=noOfShows;
        this.costPerShow=costPerShow;
    }

    @Override
    double calculateAmount() {
        return (noOfShows*costPerShow);
    }
}


public class Main3 {
    public static void main(String[] args) {
        String name,detail,type,organiser;
        int noOfStalls,noOfShows;
        double rentPerStall,costPerShow;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice :");
        System.out.println("1.Exhibition\n2.StageEvent");
        int key=sc.nextInt();
        String k=sc.nextLine();
        if(key==1)
        {
            System.out.println("Enter the details :");
            name=sc.nextLine();
            detail=sc.nextLine();
            type=sc.nextLine();
            organiser=sc.nextLine();
            noOfStalls=sc.nextInt();
            rentPerStall=sc.nextDouble();
            Exhibition ex = new Exhibition(name,detail,type,organiser,noOfStalls,rentPerStall);
            ex.setName(name);
            ex.setDetail(detail);
            ex.setType(type);
            ex.setOrganiser(organiser);
            ex.setNoOfStalls(noOfStalls);
            ex.setRentPerStall(rentPerStall);
            System.out.println("Exhibition Details");
            System.out.println("Event Name : "+ex.getName());
            System.out.println("Detail : "+ex.getDetail());
            System.out.println("Type : "+ex.getType());
            System.out.println("Organiser : "+ex.getOrganiser());
            System.out.printf("Total Cost : %.2f",ex.calculateAmount());
        }
        else if(key==2)
        {
            System.out.println("Enter the details :");
            name=sc.nextLine();
            detail=sc.nextLine();
            type=sc.nextLine();
            organiser=sc.nextLine();
            noOfShows=sc.nextInt();
            costPerShow=sc.nextDouble();
            StageEvent se = new StageEvent(name,detail,type,organiser,noOfShows,costPerShow);
            se.setName(name);
            se.setDetail(detail);
            se.setType(type);
            se.setOrganiser(organiser);
            se.setNoOfShows(noOfShows);
            se.setCostPerShow(costPerShow);
            System.out.println("Stage Event Details");
            System.out.println("Event Name : "+se.getName());
            System.out.println("Detail : "+se.getDetail());
            System.out.println("Type : "+se.getType());
            System.out.println("Organiser : "+se.getOrganiser());
            System.out.printf("Total Cost : %.2f",se.calculateAmount());
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}