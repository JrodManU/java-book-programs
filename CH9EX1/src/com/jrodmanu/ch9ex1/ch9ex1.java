package com.jrodmanu.ch9ex1;

public class ch9ex1 {

    public static void main(String[] args) {

        double[] numbers = new double[50];
        int k = 0;
        String output = "";
        for(int i = 0; i < 50; i++) {
            numbers[i] = (i < 25) ? i * i : 3 * i;
            output += numbers[i] + " | ";
            k++;
            if(k == 10) {
                System.out.println(output);
                output = "";
                k = 0;
            }
        }

    }

}
