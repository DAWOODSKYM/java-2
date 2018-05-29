package com.company;

public class Lessson6 {
    public static void main(String[] args) {
        //string functions
        String text ="The quick brown fox jumped over thee lazy dog";
        System.out.println(text.toUpperCase());
        System.out.println(text);
        String upper = text.toUpperCase();

        int size = text. length();// password.length(6) to restrict no of characters
        System.out.println(size);

        String replaced= text.replace("lazy","hardworking");
        System.out.println(replaced);

        String chunk= text.substring(15);
        System.out.println(chunk);
    }
}
