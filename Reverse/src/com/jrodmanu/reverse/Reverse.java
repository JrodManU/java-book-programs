package com.jrodmanu.reverse;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int num, numReverse, newNum;
        System.out.println("Enter in an Integer");
        num = console.nextInt();
        System.out.println(num - Integer.parseInt(String.valueOf((new StringBuffer(String.valueOf(num))).reverse())));

    }

}
