package com.jrodmanu.ch4ex10;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        float num1, num2;
        String operation, equation;
        float result;

        System.out.println("Enter two numbers (Floats)");
        num1 = console.nextFloat();
        num2 = console.nextFloat();
        System.out.println("Enter a math operator (+ - * /)");
        operation = console.next();

        switch (operation) {
            case "+":
                equation = String.format("%.2f", num1) + " " + operation + " " + " " + String.format("%.2f", num2) + " " + " = " + String.format("%.2f", num1 + num2);
                break;
            case "-":
                equation = String.format("%.2f", num1) + " " + operation + " " + " " + String.format("%.2f", num2) + " " + " = " + String.format("%.2f", num1 - num2);
                break;
            case "*":
                equation = String.format("%.2f", num1) + " " + operation + " " + " " + String.format("%.2f", num2) + " " + " = " + String.format("%.2f", num1 * num2);
                break;
            case "/":
                equation = String.format("%.2f", num1) + " " + operation + " " + " " + String.format("%.2f", num2) + " " + " = " + String.format("%.2f", num1 / num2);
                break;
            default:
                equation = "That's not a math operator";
                break;
        }

        System.out.println(equation);

    }
}
