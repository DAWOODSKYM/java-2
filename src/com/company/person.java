package com.company;

public class person {
    String name;
    String gender;
    double weight;
    double height;


    public person(String name, String gender, double weight, double height) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    public void getBMI()
    {
        double result = weight/(height*height);
        System.out.println(name= "has a bmi of "+result);
    }
    public void printDetails()
    {
        System.out.println(name+" " +gender+ " " +weight+ " "+height);
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
