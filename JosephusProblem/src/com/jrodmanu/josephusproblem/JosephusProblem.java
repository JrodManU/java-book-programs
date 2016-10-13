package com.jrodmanu.josephusproblem;


import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int numOfPeople, numOfIterations;
        //account for people starting there counting at 1, not 0
        int currentPerson = -1;

        System.out.println("Enter number of people in the circle");
        numOfPeople = console.nextInt();
        System.out.println("Enter number of iterations to go through for each removal");
        numOfIterations = console.nextInt();

        ArrayList<Integer> people = new ArrayList<Integer>();
        int[] removedPeople = new int[numOfPeople];

        for(int i = 1; i <= numOfPeople; i++) {
            people.add(i);
        }

        for(int i = 0; i < numOfPeople; i++) {
            currentPerson += numOfIterations;
            currentPerson %= people.size();
            removedPeople[i] = people.get(currentPerson);
            people.remove(currentPerson);
            //account for person removed.
            currentPerson--;
        }

        String readableArray = "[" + removedPeople[0];
        for(int i = 1; i < numOfPeople; i++) {
            readableArray += ", " + removedPeople[i];
        }
        readableArray += "]";
        
        //output stuff
        System.out.println("Number of people: " + numOfPeople);
        System.out.println("Number of people to go through: " + numOfIterations + System.getProperty("line.separator"));
        System.out.println("Sequence of people removed: " + readableArray);
        System.out.println("The " + removedPeople[removedPeople.length - 1] + "th person wins");
    }

}
