package com.jrodmanu.ch6ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise extends JFrame {

    private final int WIDTH = 300;
    private final int HEIGHT = 200;
    private final String TITLE = "Find Longer String";

    private JLabel string1L, string2L, longerStringL;
    private JTextField string1TF, string2TF, longerStringTF;
    private JButton calcB, exitB;

    public Exercise() {
        string1L = new JLabel("First String: ", SwingConstants.RIGHT);
        string2L = new JLabel("Second String: ", SwingConstants.RIGHT);
        longerStringL = new JLabel("Longer String: ", SwingConstants.RIGHT);
        string1TF = new JTextField(10);
        string2TF = new JTextField(10);
        longerStringTF = new JTextField(10);
        calcB = new JButton("Calculate");
        calcB.addActionListener(new CalcBHandler());
        exitB = new JButton("Exit");
        exitB.addActionListener(new ExitBHandler());

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4,2));
        pane.add(string1L);
        pane.add(string1TF);
        pane.add(string2L);
        pane.add(string2TF);
        pane.add(longerStringL);
        pane.add(longerStringTF);
        pane.add(calcB);
        pane.add(exitB);

        setSize(WIDTH, HEIGHT);
        setTitle(TITLE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
    }

    private class CalcBHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            longerStringTF.setText((string1TF.getText().length() > string2TF.getText().length()) ? string1TF.getText() : string2TF.getText());
        }
    }
    private class ExitBHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
