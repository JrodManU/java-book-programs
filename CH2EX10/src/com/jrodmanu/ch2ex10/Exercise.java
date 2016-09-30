package com.jrodmanu.ch2ex10;

import java.util.Scanner;

public class Exercise {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		char[] numChars;
		
		System.out.println("Enter a 4 digit number");
		num = console.nextInt();
		numChars = String.valueOf(num).toCharArray();
		
		for(int i = 0; i < 4; i++) {
			System.out.println(numChars[i]);
		}
	}
	
}
