package com.jrodmanu.ch3ex1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("inData.txt"));
		PrintWriter outFile = new PrintWriter("outData.dat");
		
		int num1 = inFile.nextInt();
		int num2 = inFile.nextInt();
		String letter1 = inFile.next();
		int num3 = inFile.nextInt();
		int num4 = inFile.nextInt();
		
		int newNum1 = num1 + num2;
		int newNum2 = num3 + num4;
		String nextLetter = String.valueOf((char) (letter1.charAt(0) + 1));
		
		outFile.write("The sum of " + num1 + " and " + num2 + " = " + newNum1 + "." + System.getProperty("line.separator"));
		outFile.write("The character that comes after" + letter1 + "in the Unicode set is " + nextLetter + "." + System.getProperty("line.separator"));
		outFile.write("The product of " + num3 + " and " + num4 + " = " + newNum2 + ".");
		
		outFile.close();
		inFile.close();
		
		inFile = new Scanner(new FileReader("outData.dat"));
		while(inFile.hasNext()) {
			System.out.println(inFile.nextLine());
		}
		inFile.close();
		
	}
}
