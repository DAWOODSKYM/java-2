package com.company;

public class Breakstatements {

    public static void main(String[] args) {
        int count=0;
        for (int i = 0; i <100 ; i++) {
            if (i % 3 == 0)
            {
                System.out.println(i);
                count++;
            }
            if (count == 6){
           break;
            }
            }
        System.out.println(count);
    }
}
