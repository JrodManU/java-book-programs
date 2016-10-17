package com.jrodmanu.ch3ex4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercise {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		final double assessedValue = 100000;
		final double taxablePercent = .92;
		final double taxRatePer100 = 1.05;
		double taxableAmount, propertyTax;
		
		PrintWriter outFile = new PrintWriter("outFile.dat");
		
		taxableAmount = assessedValue * taxablePercent;
		propertyTax = taxableAmount * (taxRatePer100 / 100);
		
		outFile.write("Assessed Value: $" + String.format("%.2f", assessedValue) + System.getProperty("line.separator"));
		outFile.write("Taxable Amount: $" + String.format("%.2f", taxableAmount) + System.getProperty("line.separator"));
		outFile.write("Tax Rate for each $100.00: $" + String.format("%.2f", taxRatePer100) + System.getProperty("line.separator"));
		outFile.write("Property Tax: $" + String.format("%.2f", propertyTax));
		
		outFile.close();
		
	}
	
}
