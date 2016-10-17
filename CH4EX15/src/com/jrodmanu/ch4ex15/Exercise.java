package com.jrodmanu.ch4ex15;

import java.util.Scanner;

public class Exercise {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		final double P_COST = 25;
		final double R_COST = 10;
		final double NIGHT_MINUTE_LIMIT = 100;
		final double P_MINUTE_LIMIT = 75;
		final double R_MINUTE_LIMIT = 50;
		final double NIGHT_MINUTE_EXTRA = .05;
		final double P_MINUTE_EXTRA = .1;
		final double R_MINUTE_EXTRA = .2;
		
		int minutes;
		int nightMinutes = 0;
		double cost;
		String account, serviceCode;
		
		System.out.println("Enter your account number and then your service code");
		account = console.next();
		serviceCode = console.next();
		
		if(serviceCode.equals("R") || serviceCode.equals("r")) {
			cost = R_COST;
			System.out.println("Enter minutes used");
			minutes = console.nextInt();
			if(minutes > R_MINUTE_LIMIT) {
				cost += (minutes - R_MINUTE_LIMIT) * R_MINUTE_EXTRA;
			}
		} else if(serviceCode.equals("P") || serviceCode.equals("p")) {
			cost = P_COST;
			System.out.println("Enter daytime minutes used (6am-6pm)");
			minutes = console.nextInt();
			System.out.println("Enter nighttime minutes used (6pm-6am)");
			nightMinutes = console.nextInt();
			if(minutes > P_MINUTE_LIMIT) {
				cost += (minutes - P_MINUTE_LIMIT) * .1;
			}
			if(nightMinutes > NIGHT_MINUTE_LIMIT) {
				cost += (nightMinutes - NIGHT_MINUTE_LIMIT) * NIGHT_MINUTE_EXTRA;
			}
		} else {
			throw new Exception("that is not a valid service code");
		}
		
		System.out.println("Account: " + account + " | Type of service: " + (serviceCode.equals("R") || serviceCode.equals("r") ? "Regular" : "Premium") 
				+ " | Minutes used: " + (minutes + nightMinutes) + " | Amount due: " + String.format("$%.2f", cost));
	}
	
}
