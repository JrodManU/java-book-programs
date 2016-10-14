package com.jrodmanu.ch4ex5;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        float[] sides = new float[3];

        System.out.println("Enter 3 triangle side lengths");
        for(int i = 0; i < 3; i++) {
            sides[i] = console.nextFloat();
        }
        for(int i = 0; i < 3; i++) {
            if(Math.pow(sides[i], 2) + Math.pow(sides[(i + 1) % 3], 2) == Math.pow(sides[(i + 2) % 3], 2)) {
                System.out.println("This is a right triangle");
                return;
            }
        }
        System.out.println("This is not a right triangle");
    }

}
