package com.jrodmanu.timestable;

public class TimesTable {

    public static void main(String[] args) {

        int size = 9;
        String currentLine;

        for(int i = 0; i <= size; i++) {
            currentLine = i + "*" + 0 + " = " + String.format("%02d", i * 0);
            for(int j = 1; j <= size; j++) {
                currentLine += " " + i + "*" + j + " = " + String.format("%02d", i * j);
            }
            System.out.println(currentLine);
        }

    }

}
