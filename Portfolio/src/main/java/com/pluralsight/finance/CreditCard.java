package com.pluralsight.finance;

public class CreditCard implements Valuable {

    //properties
    private String name;
    private String accountNumber;
    private double balance;

    //constructor
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //methods
    public double charge(double amount) {
        balance = balance + amount;
        return balance;
    }

    public double pay(double amount) {
        balance = balance - amount;
        return balance;
    }

    //getters and setters
    public double getValue() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}