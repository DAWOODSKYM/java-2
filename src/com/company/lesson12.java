package com.company;

public class lesson12 {
    public static void main(String[] args) {


    person p1=new person("John","male",78,1.89);
    person p2=new person("mary","female",78,2.67);


    p1.getBMI();
    p1.printDetails();
    p1.getBMI();
    p1.printDetails();
        System.out.println(p1.getWeight());
        p1.setWeight(60);
        p1.printDetails();
        person[] people={p1,p2};
        for (person p:people)
        {
            p.printDetails();
        }
    }
}
