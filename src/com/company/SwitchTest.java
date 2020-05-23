package com.company;

public class SwitchTest {
    public static void main(String[] args) {
        char operators = '+';
        double number1 = 80.0;
        double number2 = 30.0;
        double result;
        switch(operators){
            case '+':
                result = number1 + number2;
                System.out.println(result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(result);
                break;
            case '%':
                result = number1 % number2;
                System.out.println(result);
                break;
            default:
                System.out.println("No such operator present");


        }

    }
}
