package com.jrodmanu.ch2ex6;

import java.util.Scanner;

public class Exercise {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double length, width, area, perimeter;
		
		System.out.println("Enter length and width of a rectangle");
		length = console.nextDouble();
		width = console.nextDouble();
		
		area = length * width;
		perimeter = length * 2 + width * 2;
		
		System.out.println("The area is " + area);
		System.out.println("The perimeter is " + perimeter);
		
	}
}
