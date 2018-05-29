package com.company;

public class Teneryoperator {
    //Tenary operator to ese the use of if statements(easy due to one line statements)
    public static void main(String[] args) {
        int marks =89;
        char Grade= marks > 90 ? 'A':'B';
        System.out.println(Grade);

//case operator to use instead of if statements
        int day= 5;
        switch (day){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("This  is not a valid day");

                int  mark = 87;

                if (marks >= 90){
                    System.out.println("Grade is A "+marks);
                }
                    else if(marks < 90){
                        System.out.println("grade is B "+marks);
                    }
                    else if (marks < 80){
                    System.out.println("Grade is C "+marks);
                }
                else if (marks < 70){
                    System.out.println("Grade is D "+marks);
                }
                else{
                    System.out.println("Grade is E "+marks);
                }

        }
    }
}
