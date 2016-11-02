package com.jrodmanu.binary;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Binary {

    public static void main(String[] args) throws FileNotFoundException {

        final int BASE_TO_CONVERT_TO = 2;
        Scanner inFile = new Scanner(new FileReader("normalNumbers.txt"));
        PrintStream outFile = new PrintStream("binaryNumbers.txt");

        while(inFile.hasNext()) {
            int num = inFile.nextInt();
            String newNum = "";
            while(num > 0) {
                newNum += num % 2;
                num /= 2;
            }
            outFile.append(("0000" + newNum).substring(newNum.length()) + System.getProperty("line.separator"));
        }
    }

}
