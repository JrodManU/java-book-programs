package com.jrodmanu.ch5ex7;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int number;

        System.out.println("Enter a positive integer");
        number = console.nextInt();

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                System.out.println(number + " is not prime");
                return;
            }
        }

        System.out.println(number + " is prime");
    }

}
