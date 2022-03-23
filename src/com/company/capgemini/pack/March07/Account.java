package com.company.capgemini.pack.March07;

public class Account
{
    private String conName,transType,accNumber;

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public static void main(String[] args)
    {
        Account ac1 = new Account();
        ac1.setConName("Yogesh");
        ac1.setTransType("Credit = 1000 INR");
        ac1.setAccNumber("000767123");

        Account ac2 = new Account();
        ac2.setConName("Daswanth");
        ac2.setTransType("Debit = 500 INR");
        ac2.setAccNumber("000767123");

        System.out.println("Consumer 1 Name : "+ac1.getConName());
        System.out.println("Consumer 1 Transaction Type : "+ac1.getTransType());
        System.out.println("Consumer 1 AccountNumber : "+ac1.getAccNumber());
        System.out.println("Consumer 2 Name : "+ac2.getConName());
        System.out.println("Consumer 2 Transaction Type : "+ac2.getTransType());
        System.out.println("Consumer 2 AccountNumber : "+ac2.getAccNumber());
    }
}