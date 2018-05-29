package com.company;

public class Functions {
    //john John joHN==John
    //Musa musa MuSA== Musa
    public  static String formatName(String name)
    {
        name= name.toLowerCase();
        String firstletter=name.substring(0,1);
        String theRest = name.substring(1);
        String correctname= firstletter.toUpperCase()+theRest;
        return correctname;
    }
    public static  int getAge(int year)
    {
        int age= 2018-year;
        return  age;
    }
    public  static  double vol_sphere(double r)//void means it doesn't give results but only prints
    {
        double result =4/3 * Math.PI* Math.pow(r,3);
        //no print
        return result;

    }
    public  static  void  vol_cylinder(double r,double h)
    {
        double result = 3.142 * r*r*h;
        System.out.println("cylinder volume is "+result);
    }
    public static  void vol_cube(double length)
    {
        double result= Math.pow(length,3);
        System.out.println("cube volume is "+result);
    }
}
