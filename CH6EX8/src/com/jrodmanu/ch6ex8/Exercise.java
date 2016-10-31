package com.jrodmanu.ch6ex8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Exercise extends JFrame {
    private final int WIDTH = 300;
    private final int HEIGHT = 200;
    private final String TITLE = "Equation Analyzer";
    private JLabel xL, yL, zL, equationStatusL;
    private JTextField xTF, yTF, zTF, equationStatusTF;
    private JButton calcB, exitB;
    public Exercise() {
        xL = new JLabel("x (Integer): ", SwingConstants.RIGHT);
        yL = new JLabel("y (Integer): ", SwingConstants.RIGHT);
        zL = new JLabel("z (Integer): ", SwingConstants.RIGHT);
        equationStatusL = new JLabel("x^2 + y^2 = z^2: ", SwingConstants.RIGHT);
        xTF = new JTextField(10);
        yTF = new JTextField(10);
        zTF = new JTextField(10);
        equationStatusTF = new JTextField(10);
        calcB = new JButton("Calculate");
        calcB.addActionListener(new CalcBHandler());
        exitB = new JButton("Exit");
        exitB.addActionListener(new ExitBHandler());
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(5,2));
        pane.add(xL);
        pane.add(xTF);
        pane.add(yL);
        pane.add(yTF);
        pane.add(zL);
        pane.add(zTF);
        pane.add(equationStatusL);
        pane.add(equationStatusTF);
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
            int x = Integer.valueOf(xTF.getText());
            int y = Integer.valueOf(yTF.getText());
            int z = Integer.valueOf(zTF.getText());
            equationStatusTF.setText((x * x + y * y == z * z) ? "true" : "false");
        }
    }
    private class ExitBHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}

