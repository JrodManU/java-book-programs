package com.jrodmanu.ch9ex3;
import java.io.FileReader;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(new FileReader("input.txt"));
        } catch(Exception e) {

        }
        if(input == null) {
            return;
        }
        int tiers = 8;
        int maxScore = 200;
        int[] inTiers = new int[tiers];

        while(input.hasNext()) {
            float num = input.nextFloat();
            for(int i = 0; i < tiers; i++) {
                if(num <= (i + 1) * (maxScore / tiers)) {
                    inTiers[i]++;
                    break;
                }
            }
        }

        for(int i = 0; i < tiers; i++) {
            System.out.println(i * (maxScore / 8) + "-" + ((i + 1) * (maxScore / 8) + ": " + inTiers[i]));
        }
    }
}
