package com.jrodmanu.ch3ex3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exercise {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner inFile = new Scanner(new FileReader("ticketSales.txt"));
		
		double totalSales = 0;
		
		while(inFile.hasNext()) {
			totalSales += inFile.nextDouble() * inFile.nextDouble();
		}
		
		System.out.println("The total ticket sales is $" + String.format("%.2f", totalSales));
	}
	
}
