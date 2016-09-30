package com.jrodmanu.ch2ex11;

import java.util.Scanner;

public class Exercise {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double elapsed;
		int hours, minutes, seconds;
		
		System.out.println("How long did the event last in seconds");
		elapsed = console.nextDouble();
		
		seconds = (int) elapsed % 60;
		minutes = (int) ((elapsed - seconds) / 60 % 60);
		hours = (int) ((elapsed - minutes * 60) / 60 / 60);
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}
