package com.company;

public class Account {
    String name;
    String accNo;
    double balance;
    //constructor


    public Account(String name, String accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        balance+=amount;
    }
    public void  withdraw(double amount)
    {
        if (balance>amount)
            balance-=amount;
        else
            System.out.println("Insufficient Balance");
    }

    public void getDetails()
    {
        System.out.println(name+ ""+ accNo +""+balance);
    }

}
