package com.jrodmanu.ch4ex4;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        final float costPerExtraMinute = .45f;
        float callLength;
        float callCost = 3.99f;

        System.out.println("Enter the length of your phonecall (in whole minutes)");
        callLength = console.nextFloat();

        if(callLength > 3) {
            callCost += (callLength - 3) * costPerExtraMinute;
        }

        System.out.println(String.format("$%.2f",callCost));
    }

}
