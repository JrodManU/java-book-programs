package com.jrodmanu.ch2prex4;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        final int SECRET = 11;
        final double RATE = 12.50;
        int num1;
        int num2;
        int newNum;
        String name;
        double hoursWorked;
        double wages;

        System.out.println("Please enter two Integers");
        num1 = console.nextInt();
        num2 = console.nextInt();
        System.out.println("The value of num1 = " + num1);
        System.out.println("The value of num2 = " + num2);
        newNum = num1 * 2 + num2;
        System.out.println("The value of newNum = " + newNum);
        newNum += SECRET;
        System.out.println("The value of newNum with the secret = " + newNum);
        System.out.println("Enter someones last name");
        name = console.next();
        System.out.println("Enter a decimal between 0 and 70");
        hoursWorked = console.nextDouble();
        

    }
}
