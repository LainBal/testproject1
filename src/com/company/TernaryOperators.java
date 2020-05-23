package com.company;

public class TernaryOperators {
    public static void main(String[] args) {


        int time = 8;

        if(time < 18) {
            System.out.println("Good day!");
        }else{
            System.out.println("Good evening!");
        }
        System.out.println("-----------------");
        String result = (time < 18) ? "Good day!" : "Good evening!";

        System.out.println(result);


    }
}
