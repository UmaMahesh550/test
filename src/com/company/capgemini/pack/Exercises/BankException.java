package com.company.capgemini.pack.Exercises;

public class BankException extends Exception{
    public BankException()
    {
        System.out.println("Insufficient Balance in account.");
    }
}
