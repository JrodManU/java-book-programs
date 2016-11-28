package com.jrodmanu.ch9ex6;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner inFile;
        try {
            inFile = new Scanner(new FileReader("input.txt"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        char[] key = inFile.nextLine().toCharArray();

        while(inFile.hasNext()) {
            String raw = inFile.nextLine();
            String id = raw.substring(0,9);
            char[] answers = raw.substring(9).toCharArray();
            String readableAnswers = "";
            int score = 0;
            float percent;
            String grade;
            for(int i = 0; i < answers.length; i++) {
                readableAnswers += answers[i];
                if(answers[i] == key[i]) {
                    score++;
                } else if(answers[i] != ' ') {
                    score--;
                }
            }
            percent = (float)score / key.length;
            if(percent > .90) {
                grade = "A";
            } else if(percent > .80) {
                grade = "B";
            } else if(percent > .70) {
                grade = "C";
            } else if(percent > .60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println(id + " " + String.format("%1$-" + key.length + "s", readableAnswers) + " " + score + " " + grade);
        }
    }
}
