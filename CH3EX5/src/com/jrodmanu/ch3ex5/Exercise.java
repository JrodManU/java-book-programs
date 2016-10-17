package com.jrodmanu.ch3ex5;

import java.util.Scanner;

public class Exercise {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double f, c;
		
		System.out.println("Enter a Fahrenheit temperature, this will convert it to Celsius");
		f = console.nextDouble();
		
		c = 5d / 9d * (f - 32d);
		
		System.out.println(String.format("%.2f", c));
		
	}
	
}
