package com.jrodmanu.completesquare;

import java.util.Scanner;

public class CompleteSquare {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double a, b, c, k, centerX;
		
		System.out.println("Enter in a b c from ax^2+bx+c");
		a = console.nextDouble();
		b = console.nextDouble();
		c = console.nextDouble();
		
		centerX = -b / (2 * a);
		k = a * Math.pow(centerX, 2) + b * centerX + c;
		
		System.out.println("Alternate form: " + a + "(x-(" + -centerX + "))+(" + k + ")");
	}
	
}
