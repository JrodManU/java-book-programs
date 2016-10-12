package com.jrodmanu.ch4ex1;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number");
        double number = console.nextDouble();

        System.out.println("Your number is " + (number >= 0 ? (number == 0 ? "zero" : "positive") : "negative"));
    }

}
