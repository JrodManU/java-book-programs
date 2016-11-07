package com.jrodmanu.ch7ex6;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        long birthRate, deathRate, population;
        int years;

        System.out.println("Enter birth rate");
        birthRate = console.nextLong();
        if(birthRate < 0) {
            System.out.println("invalid birth rate");
        }
        System.out.println("Enter death rate");
        deathRate = console.nextLong();
        if(deathRate < 0) {
            System.out.println("invalid death rate");
        }
        System.out.println("Enter population");
        population = console.nextLong();
        if(population < 2) {
            System.out.println("invalid population");
        }
        System.out.println("Enter years");
        years = console.nextInt();

        System.out.println(estimatedPopulation(population, growthRate(birthRate, deathRate), years));

    }

    public static long growthRate(long birthRate, long deathRate) {
        return birthRate - deathRate;
    }

    public static long estimatedPopulation(long population, long rate, int years) {
        return population + population * rate / 100;
    }

}
