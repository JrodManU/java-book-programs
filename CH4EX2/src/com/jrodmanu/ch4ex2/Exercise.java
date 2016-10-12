package com.jrodmanu.ch4ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        float[] nums = new float[3];

        System.out.println("Enter 3 numbers");
        for(int i = 0; i < nums.length; i++) {
            nums[i] = console.nextFloat();
        }

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[nums.length - 1 - i]);
        }
    }
}
