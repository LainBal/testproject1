package com.company;

public class Calculator {
    public static void main(String[] args) {
        //need to code calculator with math operators using if else if statement
        // + / - * %

        /**
         * char operators = '-';
         * double number1 = 20;
         * double number2 = 30;
         * double result = 0;
         *
         * else if(operators == '-'){
         *      result = number1 - number2;
         *      System.out.println("result");
         * }
         *
         */
        double number1 = 80;
        double number2 = 30;
        double result = 0;
        char operators = '+';
        boolean trueOp = true;

        if (operators == '-') {
            result = number1 - number2;
        }
        else if(operators == '+'){
            result = number1 + number2;
        }
        else if(operators == '*'){
            result = number1 * number2;
        }
        else if(operators == '/') {
            result = number1 / number2;
        }
        else if(operators == '%'){
            result = number1 % number2;
        }
        else{
            trueOp = false;
            System.out.println("No such operator present");

        }
        if(trueOp){
            System.out.println(number1+""+operators+number2+"="+result);
        }







    }
}
