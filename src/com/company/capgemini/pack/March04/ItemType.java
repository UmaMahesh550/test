package com.company.capgemini.pack.March04;
public class ItemType {
    private String name;
    private double costPerDay;
    private double deposit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void display()
    {
        System.out.println("Item type details");
        System.out.println("Name : "+getName());
        System.out.printf("CostPerDay : %.2f",getCostPerDay());
        System.out.printf("\nDeposit : %.2f",getDeposit());
    }

}