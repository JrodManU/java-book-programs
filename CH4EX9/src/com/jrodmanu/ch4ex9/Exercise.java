package com.jrodmanu.ch4ex9;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2;
        String operation, equation;
        float result;

        System.out.println("Enter two numbers (Integers)");
        num1 = console.nextInt();
        num2 = console.nextInt();
        System.out.println("Enter a math operator (+ - * /)");
        operation = console.next();

        switch(operation) {
            case "+":
                equation = num1 + " " + operation + " " + " " + num2 + " " + " = " + (num1 + num2);
                break;
            case "-":
                equation = num1 + " " + operation + " " + " " + num2 + " " + " = " + (num1 - num2);
                break;
            case "*":
                equation = num1 + " " + operation + " " + " " + num2 + " " + " = " + (num1 * num2);
                break;
            case "/":
                equation = num1 + " " + operation + " " + " " + num2 + " " + " = " + (num1 / num2);
                break;
            default:
                equation = "That's not a math operator";
                break;
        }

        System.out.println(equation);

    }

}
