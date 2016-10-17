package com.jrodmanu.ch4ex14;

import java.util.Scanner;

public class ch4ex14 {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float length, width, top, bottom, left, right, lineHeight, characterWidth ;
		boolean single;
		
		int charactersPerLine, lines;
		
		System.out.println("Enter (inches) paper length and then width");
		length = console.nextFloat();
		width = console.nextFloat();
		System.out.println("Enter (inches) margins top bottom left and right");
		top = console.nextFloat();
		bottom = console.nextFloat();
		left = console.nextFloat();
		right = console.nextFloat();
		System.out.println("Enter (points) line height and character width");
		lineHeight = console.nextFloat();
		characterWidth = console.nextFloat();
		System.out.println("Is the paper single spaced? (true, false)");
		single = console.nextBoolean();
		
		charactersPerLine = (int) Math.floor((width - right - left) * 72 / characterWidth);
		lines = (int) Math.floor((length - top - bottom) * 72 / lineHeight / (single ? 1 : 2));
		
		System.out.println("Characters per line: " + charactersPerLine);
		System.out.println("Lines per paper: " + lines);
	}
}
