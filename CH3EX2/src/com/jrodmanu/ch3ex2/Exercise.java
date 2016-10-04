package com.jrodmanu.ch3ex2;

import java.util.Scanner;

public class Exercise {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double num, newNum;
		
		System.out.println("Enter a decimal, it will be rounded to two decimal places");
		num = console.nextDouble();
		
		newNum = Math.round(num * 100d) / 100d;
		
		System.out.println(newNum);
	}
	
}
