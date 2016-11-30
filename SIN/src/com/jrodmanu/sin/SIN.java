package com.jrodmanu.sin;

public class SIN {

    public static void main(String[] args) {
        System.out.println(isValidSIN("430837013"));
        System.out.println(isValidSIN("472182345"));
        System.out.println(isValidSIN("435752001"));
        System.out.println(isValidSIN("488507503"));
    }

    public static boolean isValidSIN(String SIN) {
        int[] digits = new int[SIN.length()];
        for(int i = 0; i < SIN.length(); i++) {
            digits[i] = Integer.parseInt(SIN.substring(i, i + 1));
        }
        String a = "";
        for(int i = 0; i <= 7; i++) {
            if(i % 2 == 0) {
                a += String.valueOf(digits[i]);
            } else {
                a += String.valueOf(2 * digits[i]);
            }
        }
        int sum = 0;
        for(int i = 0; i < a.length(); i++) {
            sum += Integer.parseInt(a.substring(i, i + 1));
        }
        return 10 - Integer.parseInt(String.valueOf(sum).substring(String.valueOf(sum).length() - 1)) == digits[digits.length - 1];

    }

}
