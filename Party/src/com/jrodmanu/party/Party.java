package com.jrodmanu.party;

public class Party {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        boolean even, prime;

        for(int i = 1; i <= 100; i++) {
            even = isEven(i);
            prime = isPrime(i);
            if(prime && !even) {
                y += 5;
            } else if(prime && even) {
                y -= 3;
            } else if(!even) {
                x++;
            } else if(even) {
                x--;
            }
            if(i % 7 == 0) {
                y -= i / 7;
            }
        }

        System.out.println("(" + x + ", " + y + ")");
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 2) {
                return false;
            }
        }
        return true;
    }

}
