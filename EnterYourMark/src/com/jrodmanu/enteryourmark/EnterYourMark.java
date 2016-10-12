package com.jrodmanu.enteryourmark;


import java.util.Scanner;

public class EnterYourMark {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int marks = 4;
        float total = 0;

        System.out.println("Enter 4 marks");
        for(int i = 0; i < marks; i++) {
            total += console.nextFloat();
        }

        System.out.println("The average is: " + total / marks);
    }

}
