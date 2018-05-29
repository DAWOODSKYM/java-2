package com.company;

public class Continue {
    public static void main(String[] args) {
        for (int i = -10; i <10 ; i++) {
            if (i == 0){
                continue;//since any number divided by zero is infinite
                         //the continue statement is used to leave out the calculation of dividing by 100 thus(the if statement i== 0)
            }
            System.out.println(100/i);

        }
    }
}
