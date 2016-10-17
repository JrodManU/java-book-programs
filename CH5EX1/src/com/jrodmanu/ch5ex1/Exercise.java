package com.jrodmanu.ch5ex1;


import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int number;
        int sum = 0;
        char[] digits;
        String output;

        System.out.println("Enter an integer");
        number = console.nextInt();
        digits = String.valueOf((int) Math.abs(number)).toCharArray();

        output = "Digits: ";
        for(int i = 0; i < digits.length; i++) {
            output += String.valueOf(digits[i]) + " ";
            sum += Integer.valueOf(String.valueOf(digits[i]));
        }
        output += "| Sum: " + sum;
        System.out.println(output);
    }

}
