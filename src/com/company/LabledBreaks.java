package com.company;

public class LabledBreaks {
    public static void main(String[] args) {
        dave:for (int i = 0; i < 3 ; i++)
        {
            for (int j= 0;j < 3; j++){
                System.out.println(i);
                System.out.print(j);
                if (i == 1){
                    break dave;
                }
        }}
    }
}
