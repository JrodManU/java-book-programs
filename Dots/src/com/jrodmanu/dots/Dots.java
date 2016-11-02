package com.jrodmanu.dots;

import java.util.Scanner;

public class Dots {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int width;
		
		System.out.println("Enter max width");
		width = console.nextInt();
		
		String stars = "";
		for(int i = 0; i < width; i++) {
			stars += "*";
			System.out.println(stars);
		}
		System.out.println("..");
		System.out.println(stars.substring(0, stars.length() - 1) + "..*");
		System.out.println("..");
		for(int i = 0; i < width; i++) {
			System.out.println(stars.substring(0, stars.length() - i));
		}
		
	}
	
}
