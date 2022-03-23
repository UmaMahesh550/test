package com.company.capgemini.pack.March04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemType it=new ItemType();
        System.out.println("Enter the item type Name");
        it.setName(sc.nextLine());
        System.out.println("Enter the cost per day");
        it.setCostPerDay(sc.nextDouble());
        System.out.println("Enter the deposit");
        it.setDeposit(sc.nextDouble());
        it.display();
    }
}
