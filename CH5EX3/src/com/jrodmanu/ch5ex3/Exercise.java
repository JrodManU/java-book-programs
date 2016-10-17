package com.jrodmanu.ch5ex3;

import javax.swing.*;

public class Exercise {

    public static void main(String[] args) {
        char letter;
        String inputMessage, inputString, outputMessage;

        inputMessage = "Program to convert uppercase letters to their corresponding telephone digits." + System.getProperty("line.separator")
                + "To stop the program enter #." + System.getProperty("line.separator")
                + "Enter a letter";
        inputString = JOptionPane.showInputDialog(inputMessage);
        letter = inputString.charAt(0);

        while(letter != '#') {
            outputMessage = "The letter you entered is: " + letter + System.getProperty("line.separator")
                    + "the corresponding telephone digit is: ";
            switch(letter) {
                case 'A':
                case 'B':
                case 'C':
                    outputMessage += "2";
                    break;
                case 'D':
                case 'E':
                case 'F':
                    outputMessage += "3";
                    break;
                case 'G':
                case 'H':
                case 'I':
                    outputMessage += "4";
                    break;
                case 'J':
                case 'K':
                case 'L':
                    outputMessage += "5";
                    break;
                case 'M':
                case 'N':
                case 'O':
                    outputMessage += "6";
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    outputMessage += "7";
                    break;
                case 'T':
                case 'U':
                case 'V':
                    outputMessage += "8";
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    outputMessage += "9";
                    break;
                default:
                    outputMessage += "Invalid Input";
                    break;
            }
            JOptionPane.showMessageDialog(null, outputMessage, "Telephone Digit", JOptionPane.PLAIN_MESSAGE);
            inputMessage = "Enter another uppercase letter to its corresponding telephone digit." + System.getProperty("line.separator")
                    + "To stop the program enter #." + System.getProperty("line.separator")
                    + "Enter a letter";
            inputString = JOptionPane.showInputDialog(inputMessage);
            letter = inputString.charAt(0);
        }
        System.exit(0);
    }

}
