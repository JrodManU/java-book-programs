package com.jrodmanu.ch4ex8;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        float x, y;
        String coord;

        System.out.println("Enter a x then y coordinate");
        x = console.nextFloat();
        y = console.nextFloat();
        coord = "(" + x + ", " + y + ")";

        if(x == 0 && y == 0) {
            System.out.println(coord + " is the origin");
            return;
        }
        if(x == 0) {
            System.out.println(coord + " is on the y-axis");
            return;
        }
        if(y == 0) {
            System.out.println(coord + " is on the x-xis");
            return;
        }

        String quadrant;
        if(x > 0 && y > 0) {
            quadrant = "first";
        } else if(x > 0 && y < 0) {
            quadrant = "fourth";
        } else if(x < 0 && y > 0) {
            quadrant = "second";
        } else {
            quadrant = "third";
        }
        System.out.println(coord + " is in the " + quadrant + " quadrant");
    }

}
