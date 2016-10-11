package com.jrodmanu.ch2ex5;

import java.util.Scanner;

public class Exercise {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double decimal;
		
		System.out.println("Enter a decimal");
		decimal = console.nextDouble();
		
		System.out.println((int)Math.rint(decimal));
		
	}
}
