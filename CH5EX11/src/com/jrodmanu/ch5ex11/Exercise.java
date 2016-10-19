package com.jrodmanu.ch5ex11;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2;

        System.out.println("Enter two integers, the first must be less than the second");
        num1 = console.nextInt();
        num2 = console.nextInt();

        int i = num1;
        do {
            if(i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while(i <= num2);
        i = num1;
        int sum = 0;
        do {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        } while(i <= num2);
        System.out.println(sum);

        i = 1;
        do {
            System.out.println(i + " " + i * i);
            i++;
        } while(i <= 10);
        i = num1;
        sum = 0;
        do {
            if(i % 2 != 0) {
                sum += i * i;
            }
            i++;
        } while(i <= num2);
        System.out.println(sum);

        i = 65;
        do {
            System.out.println((char) i);
            i++;
        } while(i <= 90);
    }
}
