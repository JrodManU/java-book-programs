package com.jrodmanu.ch6ex7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise extends JFrame {

    private final int WIDTH = 300;
    private final int HEIGHT = 200;
    private final String TITLE = "Compute Deposit on Maturity";

    private JLabel depositedL, yearsL, interestRateL, finalAmountL;
    private JTextField depositedTF, yearsTF, interestRateTF, finalAmountTF;
    private JButton calcB, exitB;

    public Exercise() {
        depositedL = new JLabel("Amount Deposited: ", SwingConstants.RIGHT);
        yearsL = new JLabel("Years: ", SwingConstants.RIGHT);
        interestRateL = new JLabel("Interest Rate: ", SwingConstants.RIGHT);
        finalAmountL = new JLabel("Final Amount: ", SwingConstants.RIGHT);
        depositedTF = new JTextField(10);
        yearsTF = new JTextField(10);
        interestRateTF = new JTextField(10);
        finalAmountTF = new JTextField(10);
        calcB = new JButton("Calculate");
        calcB.addActionListener(new CalcBHandler());
        exitB = new JButton("Exit");
        exitB.addActionListener(new ExitBHandler());

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(5,2));
        pane.add(depositedL);
        pane.add(depositedTF);
        pane.add(yearsL);
        pane.add(yearsTF);
        pane.add(interestRateL);
        pane.add(interestRateTF);
        pane.add(finalAmountL);
        pane.add(finalAmountTF);
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
            finalAmountTF.setText(String.valueOf(Double.valueOf(depositedTF.getText()) * (1 + Double.valueOf(interestRateTF.getText()) / 100)));
        }
    }
    private class ExitBHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}

