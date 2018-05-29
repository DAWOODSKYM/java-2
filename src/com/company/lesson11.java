package com.company;

public class lesson11 {
    public static void main(String[] args) {
        Account acc1 = new Account("Mary","AC001",6000.0);
        Account acc2 = new Account("Juma","AC002",1000.0);


        acc1.deposit(1000);
        acc1.getDetails();
        acc1.withdraw(10000);
        acc1.getDetails();
    }
}
