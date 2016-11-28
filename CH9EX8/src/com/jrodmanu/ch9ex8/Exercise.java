package com.jrodmanu.ch9ex8;

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
        ArrayList<Student> students = new ArrayList<Student>();
        float classAverage = 0;
        int highestScore = 0;
        while(inFile.hasNext()) {
            String name = inFile.next();
            int score = inFile.nextInt();
            students.add(new Student(name, score));
            if(score > highestScore) {
                highestScore = score;
            }
            classAverage += score;
        }
        classAverage /= students.size();
        String studentsWithHighest = "";
        String studentsBelowAverage = "";
        for(Student student : students){
            if(student.score == highestScore) {
                studentsWithHighest += student.name + " ";
            }
            if(student.score < classAverage) {
                studentsBelowAverage += student.name + " ";
            }
        }
        System.out.println("class average " + classAverage);
        System.out.println("students below average " + studentsBelowAverage);
        System.out.println("high score " + highestScore);
        System.out.println("students with high score " + studentsWithHighest);
    }
    private static class Student {
        String name;
        int score;
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}
