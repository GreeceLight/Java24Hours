package com.java24hours;

import javax.swing.*;
import java.awt.*;

public class LottoMadness extends JFrame{
    LottoEvent lotto = new LottoEvent(this);

    //Set up Row 1
    JPanel row1 = new JPanel();
    ButtonGroup option = new ButtonGroup();
    JCheckBox quickPick = new JCheckBox("Quick Pick", false);
    JCheckBox personal = new JCheckBox("Personal", true);

    //Set up Row 2
    JPanel row2 = new JPanel();
    JLabel numbersLabel = new JLabel("Your Picks: ", JLabel.RIGHT);
    JTextField[] numbers = new JTextField[6];
    JLabel winnersLabel = new JLabel("Winners: ", JLabel.RIGHT);
    JTextField[] winners = new JTextField[6];

    //Set up Row 3
    JPanel row3 = new JPanel();
    JButton stop = new JButton("Stop");
    JButton play = new JButton("Play");
    JButton reset = new JButton("Reset");
    
    //Set up Row 4
    JPanel row4 = new JPanel();
    JLabel got3Label = new JLabel("3 of 6: ", JLabel.RIGHT);
    JTextField got3 = new JTextField("0");
    JLabel got4Label = new JLabel("4 of 6: ", JLabel.RIGHT);
    JTextField got4 = new JTextField("0");
    JLabel got5Label = new JLabel("5 of 6: ", JLabel.RIGHT);
    JTextField got5 = new JTextField("0");
    JLabel got6Label = new JLabel("6 of 6: ", JLabel.RIGHT);
    JTextField got6 = new JTextField("0", 10);
    JLabel drawingsLabel = new JLabel("Drawings: ", JLabel.RIGHT);
    JTextField drawings = new JTextField("0");
    JLabel yearsLabel = new JLabel("Years: ", JLabel.RIGHT);
    JTextField years = new JTextField();

    //Set up Row 5
    JPanel row5 = new JPanel();
    JLabel rateLabel = new JLabel("Rate: ", JLabel.RIGHT);
    JTextField rate = new JTextField("100");

    public LottoMadness(){
        super("Lotto Madness");

        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(6, 1, 10, 10);
        setLayout(layout);

        quickPick.addItemListener(lotto);
        personal.addItemListener(lotto);
        stop.addActionListener(lotto);
        play.addActionListener(lotto);
        reset.addActionListener(lotto);

        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        option.add(quickPick);
        option.add(personal);
        row1.setLayout(layout1);
        row1.add(quickPick);
        row1.add(personal);
        add(row1);

        GridLayout layout2 = new GridLayout(2, 7, 10, 10);
        row2.setLayout(layout2);
        row2.add(numbersLabel);
        for (int i = 0; i < 6; i++) {
            numbers[i] = new JTextField();
            row2.add(numbers[i]);
        }
        row2.add(winnersLabel);
        for (int i = 0; i < 6; i++) {
            winners[i] = new JTextField();
            winners[i].setEditable(false);
            row2.add(winners[i]);
        }
        add(row2);

        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        row3.setLayout(layout3);
        stop.setEnabled(false);
        row3.add(stop);
        row3.add(play);
        row3.add(reset);
        add(row3);

        GridLayout layout4 = new GridLayout(2, 3, 20, 10);
        row4.setLayout(layout4);
        row4.add(got3Label);
        got3.setEditable(false);
        row4.add(got3);
        row4.add(got4Label);
        got4.setEditable(false);
        row4.add(got4);
        row4.add(got5Label);
        got5.setEditable(false);
        row4.add(got5);
        row4.add(got6Label);
        got6.setEditable(false);
        row4.add(got6);
        row4.add(drawingsLabel);
        drawings.setEditable(false);
        row4.add(drawings);
        row4.add(yearsLabel);
        years.setEditable(false);
        row4.add(years);
        add(row4);

        FlowLayout layout5 = new FlowLayout(FlowLayout.CENTER,10,10);
        row5.setLayout(layout5);
        row5.add(rateLabel);
        rate.setEditable(true);
        row5.add(rate);
        add(row5);

        setVisible(true);


    }

    private static void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        LottoMadness.setLookAndFeel();
        LottoMadness frame = new LottoMadness();
    }
}
