package com.jrodmanu.wraparoundcode;

import java.util.Scanner;

public class WrapAroundCode {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        char[] letters;
        String newCode = "";

        System.out.println("Enter 5 uppercase letters");
        letters = console.next().toCharArray();

        for(int i = 0; i < 5; i++) {
            char newChar = '#';
            int numValue = 0;
            int letterIndex = (int)letters[i] - 64;
            if(letterIndex >= 5) {
                numValue = letterIndex * 2;
            } else if(letterIndex >= 10) {
                numValue = letterIndex % 3 * 5;
            } else if(letterIndex >= 15) {
                numValue = (int)(letterIndex / 4) * 8;
            } else if(letterIndex >= 20) {
                numValue = Integer.valueOf(String.valueOf(letterIndex).substring(0,1));
                if(numValue > 10) {
                    numValue +=  Integer.valueOf(String.valueOf(letterIndex).substring(1,2));
                }
            } else {
                for(int j = letterIndex; j > 0; j--) {
                    if(letterIndex % j == 0) {
                        numValue = j * 12;
                        break;
                    }
                }
            }
            if(numValue != 0) {
                newChar = (char)((numValue % 26) + 64);
            }
            newCode += String.valueOf(newChar);
        }

        System.out.println(newCode);
    }

}
