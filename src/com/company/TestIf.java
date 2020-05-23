package com.company;

public class TestIf {
    public static void main(String[] args) {

        //create check of temperature if temp is higher than 80.1 print hot
        double temp1 = 90;
        if(temp1 >= 80.1){
            System.out.println("Hot!");
        }
        System.out.println("-----uzdevums-----");


        //create if else if() where temp more than 80.1 print (hot)
        //from 75 to 80 print "just right!"
        // less than 75 "cold!"
        double temp = 30;

        if(temp >= 80.1) {
            System.out.println("Hot!");

        }else if (temp >= 75) {
            System.out.println("Just right!");

        }else{
            System.out.println("Cold!");

        }

    }
}
