package com.company.capgemini.pack.Exercises;

import java.util.Scanner;

public class Account {
    double balance;
    public Account(double balance)
    {
        this.balance=balance;
    }
    void withDraw(double withDraw) throws BankException
    {
        if(withDraw>balance)
            throw new BankException();
        else
            balance=balance-withDraw;
    }
    void display()
    {
        System.out.println("Balance Remaining : "+balance);
    }
    public static void main(String[] args) {
        double withDraw;
        Scanner sc = new Scanner(System.in);
        Account ac = new Account(10000);
        System.out.println("Initial balance in account is 10000INR");
        System.out.println("Enter amount to withdraw : ");
        withDraw=sc.nextDouble();
        try
        {
            ac.withDraw(withDraw);
            ac.display();
        }
        catch (BankException be)
        {
            be.printStackTrace();
//            System.out.println("Bank Exception Occured.");
        }
    }
}
