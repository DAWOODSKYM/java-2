package com.company;

public class lesson2 {
    public static void main(String[] args) {
        double h= 1.9;
        double w= 58;
        double bmi=w/(h*h);
        if (bmi<15) {



        System.out.println("very severely underweight");
        }
        else if(bmi>=15&& bmi<16){
            System.out.println("severely underweight");
        }
        else if(bmi>=16 && bmi<18.5){
            System.out.println("normal(healthy weight)");
        }
        else if(bmi>=18.5&& bmi<25){
            System.out.println("overweight");
        }
        else if(bmi>=25 && bmi<30){
            System.out.println("Obese class 1 (moderately obese");
        }
        else if(bmi>=30&& bmi<35){
            System.out.println("Obese class 2 (Severely obese )");
        }
        else if(bmi>=15&& bmi<16){
            System.out.println("Obese class 3( very severely obese)");
        }
    }
}
