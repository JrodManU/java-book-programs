package com.jrodmanu.ch5ex6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileIn = new Scanner(new FileReader("input.txt"));
        String[] numbers = fileIn.nextLine().split(",");
        long oddSum = 0;
        long evenSum = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(Integer.parseInt(numbers[i]) % 2 == 0) {
                evenSum += Integer.parseInt(numbers[i]);
            } else {
                oddSum += Integer.parseInt(numbers[i]);
            }
        }

        System.out.println("odd sum: " + oddSum);
        System.out.println("even sum: " + evenSum);
    }

}
