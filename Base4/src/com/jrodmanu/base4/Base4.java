package com.jrodmanu.base4;

import java.util.Scanner;

public class Base4 {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int base10, remainder;
		String base4 = "";
		
		System.out.println("Enter a base10 number");
		base10 = console.nextInt();
		
		remainder = 1;
		while(base10 % 4 - remainder != 0) {
			remainder = base10 % 4;
			base10 = (int)Math.floor(base10 / 4);
			base4 += String.valueOf(remainder);
		}
		
		base4 = new StringBuffer(base4).reverse().toString().substring(1, base4.length());
		
		System.out.println(base4);
	}
	
}
