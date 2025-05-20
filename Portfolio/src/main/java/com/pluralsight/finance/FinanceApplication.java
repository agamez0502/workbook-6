package com.pluralsight.finance;

public class FinanceApplication {

    public static void main(String[] args) {

        //create bank accounts

        //int cannot be converted to a string
        BankAccount account1 = new BankAccount(123, "Pam", 12500);

        //int cannot be converted to a string
        Valuable account2 = new BankAccount(456, "Gary", 1500);

        //try to deposit money into both accounts
        account1.deposit(100);

        //cannot find symbol method deposit(int)
        account2.deposit(100);
    }
}