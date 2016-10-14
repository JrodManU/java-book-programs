package com.jrodmanu.ch4ex6;


import java.util.Scanner;

public class Exercise {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        final int cookiesPerBox = 24;
        final int boxesPerContainer = 75;
        int cookies, boxes, containers, extraCookies, extraBoxes;

        System.out.println("Enter number of cookies");
        cookies = console.nextInt();

        boxes = (int)Math.floor(cookies / cookiesPerBox);
        containers = (int)Math.floor(boxes / boxesPerContainer);
        extraCookies = cookies % cookiesPerBox;
        extraBoxes = boxes % boxesPerContainer;

        System.out.println("Boxes: " + boxes);
        System.out.println("Containers: " + containers);
        System.out.println("Extra Cookies: " + extraCookies);
        System.out.println("Extra Boxes: " + extraBoxes);
    }

}
