package com.company;

public class Lesson7 {
    public static void main(String[] args) {
        String mpesa="MDK4XQTTOT Confirmed. ksh2027.00 sent to Thomas Pata number +254723456789 on 20/4/18 at 2.56pm.New mpesa balance is Ksh 75000.00.Transaction cost,11.00.";
        int ksh= mpesa.indexOf("ksh");
        int sent=mpesa.indexOf("sent");

        String  amount= mpesa.substring(ksh,sent);
        System.out.println(amount);

        //names
        //date
        //balance

        int on=mpesa.indexOf(" on ");
        int at=mpesa.indexOf(" at ");

        String date = mpesa.substring(on,at );
        System.out.println(date);

        int is=mpesa.indexOf(" is ");
        int Transaction=mpesa.indexOf("Transaction");

        String name=mpesa.substring(is,Transaction);
        System.out.println(name);

        int to=mpesa.indexOf(" to ");
        int  number=mpesa.indexOf("number");

        String names=mpesa.substring(to,number);
        System.out.println(names);

    }
}
