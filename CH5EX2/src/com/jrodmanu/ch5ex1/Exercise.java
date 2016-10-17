package com.jrodmanu.ch5ex1;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int number;
        char[] digits;
        String output = "";

        System.out.println("Enter an integer");
        number = console.nextInt();

        digits = String.valueOf(number).toCharArray();

        for(int i = digits.length - 1; i >= 0; i--) {
            output += digits[i] + " ";
        }

        System.out.println(output);

    }

}
