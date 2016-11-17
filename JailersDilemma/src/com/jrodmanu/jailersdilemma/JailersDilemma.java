package com.jrodmanu.jailersdilemma;

public class JailersDilemma {

    public static void main(String[] args) {

        int[] cells = new int[200];
        int lockedCount = 0;
        String locked = "These cells are locked:";
        String unlocked = "These cells are unlocked";

        for(int i = 2; i < 200; i++) {
            for(int j = i; j < 200; j += i) {
                cells[j] = (cells[j] == 0) ? 1 : 0;
            }
        }

        for(int i = 0; i < 200; i++) {
            if(cells[i] == 0) {
                lockedCount++;
                locked += " " + (i + 1);
            } else {
                unlocked += " " + (i + 1);
            }
        }

        System.out.println("There are " + lockedCount + " locked cells.");
        System.out.println(locked);
        System.out.println(unlocked);
    }

}
