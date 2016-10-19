package com.jrodmanu.ch5ex9;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2;

        System.out.println("Enter two integers, the first must be less than the second");
        num1 = console.nextInt();
        num2 = console.nextInt();

        int i = num1;
        while(i <= num2) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        i = num1;
        int sum = 0;
        while(i <= num2) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);

        i = 1;
        while(i <= 10) {
            System.out.println(i + " " + i * i);
            i++;
        }
        i = num1;
        sum = 0;
        while(i <= num2) {
            if(i % 2 != 0) {
                sum += i * i;
            }
            i++;
        }
        System.out.println(sum);

        i = 65;
        while(i <= 90) {
            System.out.println((char) i);
            i++;
        }
    }
}
