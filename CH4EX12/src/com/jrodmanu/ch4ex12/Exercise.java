package com.jrodmanu.ch4ex12;

import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        final double MINIMUM_BALANCE = 0;
        final double SAVINGS_MIN_BALANCE_CHARGE = 10;
        final double CHECKING_MIN_BALANCE_CHARGE = 25;
        final double SAVINGS_INTEREST = .04;
        final double CHECKINGS_FIRST_INTEREST = .03;
        final double CHECKINGS_SECOND_INTEREST = .05;
        final double CHECKING_SECOND_TIER_THRESHHOLD = MINIMUM_BALANCE + 5000;

        double balance;
        boolean savings;

        System.out.println("Enter balance");
        balance = console.nextDouble();
        System.out.println("Savings account? (true, false)");
        savings = console.nextBoolean();

        if(balance > MINIMUM_BALANCE) {
            if(savings) {
                balance *= 1 + SAVINGS_INTEREST;
            } else {
                if(balance > CHECKING_SECOND_TIER_THRESHHOLD) {
                    balance *= 1 + CHECKINGS_SECOND_INTEREST;
                } else {

                }
            }
        }
    }

}
