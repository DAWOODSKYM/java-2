package com.company;

public class Ifstatements {
    public static void main(String[] args) {
        int  marks = 73;

        if (marks >= 90){
            System.out.println("Grade is A "+marks);
        }
        else if(marks >= 80){
            System.out.println("grade is B "+marks);
        }
        else if (marks >= 70){
            System.out.println("Grade is C "+marks);
        }
        else if (marks >= 50){
            System.out.println("Grade is D "+marks);
        }
        else{
            System.out.println("Grade is E "+marks);
        }
    }
}
