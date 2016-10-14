package com.jrodmanu.ch4ex7;


import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        double a, b, c, discriminant;
        String type, root1, root2;

        System.out.println("Enter a, b, and c from the equation ax^2+bx+c");
        a = console.nextDouble();
        b = console.nextDouble();
        c = console.nextDouble();

        discriminant = Math.pow(b, 2) - 4 * a * c;

        if(discriminant == 0) {
            type = "1 (repeated) real root";
            root1 = String.valueOf((-b + Math.sqrt(discriminant)) / (2 * a));
            root2 = root1;
        } else if(discriminant > 0) {
            type = "2 real roots";
            root1 = String.valueOf((-b + Math.sqrt(discriminant)) / (2 * a));
            root2 = String.valueOf((-b - Math.sqrt(discriminant)) / (2 * a));
        } else {
            type = "2 complex roots";
            root1 = "complex";
            root2 = "complex";
        }

        System.out.println(type);
        System.out.println(root1 + " and " + root2);
    }

}
