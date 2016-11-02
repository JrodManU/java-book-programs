package com.jrodmanu.calendar;

import java.util.Scanner;

public class Calendar {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		int cDay, dDay, cMonth, dMonth, cDayOfWeek, dDayOfWeek, cDayOfYear, dDayOfYear;
		String cRawDate, dRawDate;
		
		System.out.println("Enter current date (ddmmyy)");
		cRawDate = console.next();
		System.out.println("Current day of week 1-7(Sunday)");
		cDayOfWeek = console.nextInt();
		System.out.println("Enter delivery date (ddmm)");
		dRawDate = console.next();
		
		cDay = Integer.valueOf(cRawDate.substring(0,2));
		dDay = Integer.valueOf(dRawDate.substring(0,2));
		cMonth = Integer.valueOf(cRawDate.substring(2,4));
		dMonth = Integer.valueOf(dRawDate.substring(2,4));
		
		cDayOfYear = cDay;
		for(int i = 0; i < cMonth; i++) {
			cDayOfYear += monthDays[i];
		}
		dDayOfYear = dDay;
		for(int i = 0; i < dMonth; i++) {
			dDayOfYear += monthDays[i];
		}
		
		dDayOfWeek = (cDayOfWeek + (dDayOfYear - cDayOfYear) % 7) % 7;
		
		System.out.println(dDayOfWeek);
	}
	
}
