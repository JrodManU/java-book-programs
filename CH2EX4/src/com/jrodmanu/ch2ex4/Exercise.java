package com.jrodmanu.ch2ex4;

import java.util.Scanner;

public class Exercise {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		final int SECRET = 11;
		final double RATE = 12.50;
		
		int num1, num2, newNum;
		String name;
		double hoursWorked, wages;
		
		System.out.println("Enter two integers");
		num1 = console.nextInt();
		num2 = console.nextInt();
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		newNum = num1 * 2 + num2;
		System.out.println("newNum = " + newNum);
		newNum += SECRET;
		System.out.println("newNum + SECRET = " + newNum);
		
		System.out.println("Enter a name");
		name = console.next();
		
		System.out.println("Enter a decimal number 0-70");
		hoursWorked = console.nextDouble();
		wages = hoursWorked * RATE;
		
		System.out.println("Name: " + name);
		System.out.println("Pay Rate: $" + RATE);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Salary: $" + wages);
		
	}
}
