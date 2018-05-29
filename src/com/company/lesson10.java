package com.company;

public class lesson10 {
    public static void main(String[] args) {
        Functions.vol_cube(7);
        Functions.vol_cylinder(22, 30);
        Functions.vol_cube(6);
        Functions.vol_cylinder(2, 8);


        double volume = Functions.vol_sphere(10);
        System.out.println(volume);
        System.out.println(Math.round(volume));
        System.out.println("volume is " + volume);


        String name = Functions.formatName("heLLen");
        System.out.println(name);

        int age = Functions.getAge(1992);
        System.out.println(age);

        try
        {
            Functions.formatName("");
        }
        catch (Exception e){
            System.out.println("Error occurred while formatting name");
        }
        System.out.println(10/0);


    }
}
