package com.jrodmanu.perfectNumber;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int number;
        int accum = 0;

        System.out.println("Enter an integer");
        number = console.nextInt();

        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                accum += i;
            }
        }

        if(accum == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
}
