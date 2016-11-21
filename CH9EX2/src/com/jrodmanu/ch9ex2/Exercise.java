package com.jrodmanu.ch9ex2;

public class Exercise {

    public static void main(String[] args) {
        System.out.println(indexOfSmallest(new int[] {5,2,423,22,4,2}));
    }

    public static int indexOfSmallest(int[] array) {
        int lowest = array[0];
        int lowestIndex = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] < lowest) {
                lowestIndex = i;
                lowest = array[i];
            }
        }
        return lowestIndex;
    }

}
