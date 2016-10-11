package com.jrodmanu.josephusproblem;


import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int numOfPeople, numOfIterations;
        int currentPerson = 0;

        System.out.println("Enter number of people in the circle");
        numOfPeople = console.nextInt();
        System.out.println("Enter number of iterations to go through for each removal");
        numOfIterations = console.nextInt();

        ArrayList<Integer> people = new ArrayList<Integer>();
        int[] removedPeople = new int[numOfPeople];

        for(int i = 0; i < numOfPeople; i++) {
            people.add(i);
        }

        System.out.println(people.get(3));
        for(int i = 0; i < numOfPeople; i++) {
            currentPerson += numOfIterations;
            currentPerson = currentPerson % people.size();
            removedPeople[i] = people.get(currentPerson);
            people.remove(currentPerson);
            currentPerson -= 1;
        }

        System.out.println(removedPeople);
        for(int i = 0; i < numOfPeople; i++) {
            System.out.println(removedPeople[i]);
        }
    }

}
