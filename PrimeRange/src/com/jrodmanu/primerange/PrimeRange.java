package com.jrodmanu.primerange;

public class PrimeRange {

    public static void main(String[] args) {
        final int primesPerLine = 20;
        printPrimes(33, 1037, primesPerLine);
    }

    public static void printPrimes(int start, int end, int primesPerLine) {
        int counter = 0;
        for(int i = start; i <= end; i++) {
            if(isPrime(i)) {
                System.out.print(" " + i);
                counter++;
                if(counter == primesPerLine) {
                    System.out.println();
                    counter = 0;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
