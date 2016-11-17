package com.jrodmanu.pascaltriangle;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int length;

        System.out.println("Enter length of pascal triangle");
        length = console.nextInt();

        for(int n = 0; n < length; n++) {
            int nCk = 1;
            for(int k = 0; k <= n; k++) {
                System.out.print(nCk + " ");
                nCk = nCk * (n - k) / (k + 1);
            }
            System.out.println();
        }
    }

}
