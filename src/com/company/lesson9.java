package com.company;

public class lesson9 {
    public static void area_of_equilateral_triangle(double s)
    {
        double x=3/4.0;
        double results=Math.sqrt(x);

        double area = results * s * s;

        System.out.println("Area of the triangle is" +area);
    }
    public static void area_of_a_sphere(double r)
    {
        double area=3/4*r*r*r;
        System.out.println("Area of the sphere is " +area);
    }
    public static void age(String name,int year)
    {
        int result = 2018-year;
        System.out.println("Hi "+name+ " your age is "+ result);
    }
    public  static  void volume_cylinder( int r,double h)
    {
      double result=22/7*r*r*h;
        System.out.println("Volume is"+result);
    }
    public static void area(double r)
    {
        double result =22/7.0* r * r;
        System.out.println("Area is"+result);
    }


    public static void main(String[] args) {
        area(7);
        area(11.5);
        area(4.7);

        volume_cylinder(2,4.5);
        volume_cylinder(4,3.5);
        volume_cylinder(6,79.9);

        age("Dave",1999);
        age("moh",2000);
        age("Olivia",2001);
        age("collo",1995);
        age("Ola",2006);


        area_of_equilateral_triangle(4.6);
        area_of_a_sphere(3.6);

    }
}
