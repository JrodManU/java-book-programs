package com.jrodmanu.ch2ex8;

import java.util.Scanner;

public class Exercise {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double sum = 0;
		
		System.out.println("Enter 5 decimals");
		for(int i = 0; i < 5; i++) {
			sum += console.nextDouble();
		}
		
		System.out.println("Rounded sum: " + (int)Math.rint(sum));
	}
}
