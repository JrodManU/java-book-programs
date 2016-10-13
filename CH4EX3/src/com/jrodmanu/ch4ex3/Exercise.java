package com.jrodmanu.ch4ex3;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int number;

        System.out.println("Enter a number between 0 and 35 (inclusive)");
        number = console.nextInt();

        if(number < 10) {
            System.out.println(number);
        } else {
            System.out.println((char)(number + 55));
        }

    }

}
