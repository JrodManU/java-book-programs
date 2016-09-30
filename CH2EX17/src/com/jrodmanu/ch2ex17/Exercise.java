package com.jrodmanu.ch2ex17;

import java.util.Scanner;

public class Exercise {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double LITERS_PER_CARTON = 3.78;
		double costPerLiter, profitPerCarton, milkProduced, totalCost, totalProfit;
		int milkCartonsNeeded;
		
		System.out.println("Enter cost per liter of milk");
		costPerLiter = console.nextDouble();
		System.out.println("Enter profit per carton of milk");
		profitPerCarton = console.nextDouble();
		System.out.println("Enter liters of milk produced");
		milkProduced = console.nextDouble();
		
		milkCartonsNeeded = (int) Math.floor(milkProduced / LITERS_PER_CARTON);
		totalCost = costPerLiter * milkProduced;
		totalProfit = milkCartonsNeeded * profitPerCarton - totalCost;
		
		System.out.println("Milk cartons needed: " + milkCartonsNeeded);
		System.out.println("Cost of producing: " + totalCost);
		System.out.println("Profit for producing: " + totalProfit);
	}
}
