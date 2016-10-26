package com.jrodmanu.ch6ex5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise extends JFrame {

    private final int WIDTH = 300;
    private final int HEIGHT = 200;
    private final String TITLE = "Make All Uppercase";

    private JLabel stringL, upperStringL;
    private JTextField stringTF, upperStringTF;
    private JButton calcB, exitB;

    public Exercise() {
        stringL = new JLabel("String: ", SwingConstants.RIGHT);
        upperStringL = new JLabel("Uppercase String: ", SwingConstants.RIGHT);
        stringTF = new JTextField(10);
        upperStringTF = new JTextField(10);
        calcB = new JButton("Calculate");
        calcB.addActionListener(new CalcBHandler());
        exitB = new JButton("Exit");
        exitB.addActionListener(new ExitBHandler());

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(3,2));
        pane.add(stringL);
        pane.add(stringTF);
        pane.add(upperStringL);
        pane.add(upperStringTF);
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
            upperStringTF.setText(stringTF.getText().toUpperCase());
        }
    }
    private class ExitBHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
