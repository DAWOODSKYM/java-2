package com.company;

public class Doubleandfloatcomp {
    public static void main(String[] args) {
        float h=0.7F+0.1F;
        float a=0.9F-0.1F;
        System.out.println(h);
        System.out.println(a);
        int result=Float.compare(h,a);
        System.out.println(result);
        System.out.println(h == a);
    }
}
