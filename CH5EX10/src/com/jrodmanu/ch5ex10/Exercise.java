package com.jrodmanu.ch5ex10;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2;

        System.out.println("Enter two integers, the first must be less than the second");
        num1 = console.nextInt();
        num2 = console.nextInt();

        for(int i = num1; i <= num2; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        int sum = 0;
        for(int i = num1; i <= num2; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " " + i * i);
        }
        sum = 0;
        for(int i = num1; i <= num2; i++) {
            if(i % 2 != 0) {
                sum += i * i;
            }
        }
        System.out.println(sum);

        for(int i = 65; i <= 90; i++) {
            System.out.println((char) i);
        }
    }
}
