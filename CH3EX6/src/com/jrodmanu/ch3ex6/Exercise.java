package com.jrodmanu.ch3ex6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) throws FileNotFoundException {
		
		final double INCOME_TAX_RATE = .15;
		final double STATE_TAX_RATE = .035;
		final double SS_TAX_RATE = .0575;
		final double MM_TAX_RATE = .0275;
		final double PENSION_RATE = .05;
		final double HEALTH_INSURANCE_COST = 75;
		double grossPay, income, incomeTax, stateTax, ssTax, mmTax, pension;
		String name;
		
		System.out.println("Enter your first and last name");
		name = console.nextLine();
		System.out.println("Enter your gross pay");
		grossPay = console.nextDouble();
		
		incomeTax = grossPay * INCOME_TAX_RATE;
		stateTax = grossPay * STATE_TAX_RATE;
		ssTax = grossPay * SS_TAX_RATE;
		mmTax = grossPay * MM_TAX_RATE;
		pension = grossPay * PENSION_RATE;
		
		income = grossPay - incomeTax - stateTax - ssTax - mmTax - pension - HEALTH_INSURANCE_COST;
		
		PrintWriter outFile = new PrintWriter("outFile.dat");
		outFile.write(name + System.getProperty("line.separator"));
		outFile.write("Gross Amount: " + String.format("$%.2f", grossPay) + System.getProperty("line.separator"));
		outFile.write("Federal Tax: " + String.format("$%.2f", incomeTax) + System.getProperty("line.separator"));
		outFile.write("State Tax: " + String.format("$%.2f", stateTax) + System.getProperty("line.separator"));
		outFile.write("Social Security Tax: " + String.format("$%.2f", ssTax) + System.getProperty("line.separator"));
		outFile.write("Medicare/Medicaid Tax: " + String.format("$%.2f", mmTax) + System.getProperty("line.separator"));
		outFile.write("Pension Plan: " + String.format("$%.2f", pension) + System.getProperty("line.separator"));
		outFile.write("Health Insurance: " + String.format("$%.2f", HEALTH_INSURANCE_COST) + System.getProperty("line.separator"));
		outFile.write("Net Pay: " + String.format("$%.2f", income) + System.getProperty("line.separator"));
		outFile.close();
	}
	
}
