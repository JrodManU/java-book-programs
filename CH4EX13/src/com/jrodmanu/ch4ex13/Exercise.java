package com.jrodmanu.ch4ex13;

import java.util.Scanner;

public class Exercise {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double TAX_RATE = .1;
		double wages;
		
		System.out.println("Enter wages for this month");
		wages = console.nextDouble();
		
		wages *= 1 - TAX_RATE;
		
		System.out.println("Wages after taxes: " + String.format("$%.2f", wages));
		
	}
	
}
