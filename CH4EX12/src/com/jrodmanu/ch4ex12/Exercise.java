package com.jrodmanu.ch4ex12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) throws FileNotFoundException {

        final double SAVINGS_MIN_BALANCE_CHARGE = 10;
        final double CHECKING_MIN_BALANCE_CHARGE = 25;
        final double SAVINGS_INTEREST = .04;
        final double CHECKING_FIRST_INTEREST = .03;
        final double CHECKING_SECOND_INTEREST = .05;
        final double CHECKING_SECOND_TIER_THRESHHOLD = 5000;

        Scanner inFile = new Scanner(new FileReader("input.txt"));
        
        while(inFile.hasNext()) {
        	
	        double previousBalance, currentBalance, minimumBalance;
	        String accountNumber, type;
	
	        accountNumber = inFile.next();
	        type = inFile.next();
	        minimumBalance =inFile.nextDouble();
	        previousBalance = inFile.nextDouble();
	        currentBalance = previousBalance;
	
	        if(currentBalance > minimumBalance) {
	            if(type.equals("S")) {
	                currentBalance *= 1 + SAVINGS_INTEREST;
	            } else {
	                if(currentBalance > minimumBalance + CHECKING_SECOND_TIER_THRESHHOLD) {
	                    currentBalance *= 1 + CHECKING_SECOND_INTEREST;
	                } else {
	                	currentBalance *= 1 + CHECKING_FIRST_INTEREST;
	                }
	            }
	        } else {
	        	if(type.equals("S")) {
	        		currentBalance -= SAVINGS_MIN_BALANCE_CHARGE;
	        	} else {
	        		currentBalance -= CHECKING_MIN_BALANCE_CHARGE;
	        	}
	        }
	        
	        System.out.println("Account: " + accountNumber + " | Type: " + (type.equals("S") ? " Savings" : "Checking") + " | Current Balance: " + String.format("$%.2f", currentBalance));
        }
    }

}
