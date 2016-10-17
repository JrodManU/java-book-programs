package com.jrodmanu.ex4ex16;

import java.util.Scanner;

public class Exercise {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		final double FRAME_THICKNESS = 1;
		final double R_FRAME_COST = .15;
		final double F_FRAME_COST = .25;
		final double C_FRAME_COST = .1;
		final double CARDBOARD_COST = .02;
		final double GLASS_COST = .07;
		
		float length, width;
		String type, color;
		boolean crowns;
		double cost, inches, area;
		
		System.out.println("Enter length and width of frame (inches)");
		length = console.nextFloat();
		width = console.nextFloat();
		System.out.println("Is this a regular or fancy frame (r,f)");
		type = console.next();
		System.out.println("Enter in your prefered color (n for none, the default is white)");
		color = console.next();
		System.out.println("Do you want crowns on the corners? (true, false)");
		crowns = console.nextBoolean();
		
		inches = length * 2 + width * 2 - FRAME_THICKNESS * 4;
		//not multiplying frame_thickness by two because i'm assuming it is thinner on the back to allow space for the glass and cardboard
		area = (length - FRAME_THICKNESS) * (width - FRAME_THICKNESS);
		
		cost = inches * (type.equals("f") ? F_FRAME_COST : R_FRAME_COST);
		if(!color.equals("n")) {
			cost += inches * C_FRAME_COST;
		}
		cost += area * CARDBOARD_COST;
		cost += area * GLASS_COST;
		
		System.out.println("It will cost " + String.format("$%.2f", cost) + " to frame");
	}
	
}
