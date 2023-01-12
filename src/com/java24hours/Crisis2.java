package com.java24hours;

import java.awt.*;
import javax.swing.*;

public class Crisis2 extends JFrame{
    

    public Crisis2(){
        super("Crisis");
        setSize(348, 128);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        // BorderLayout border = new BorderLayout();
        //setLayout(box);
        JPanel gridPanel = new JPanel();
        JPanel boxPanel = new JPanel();
        GridLayout grid = new GridLayout(1, 2);
        BoxLayout box = new BoxLayout(boxPanel, BoxLayout.Y_AXIS);
        gridPanel.setLayout(grid);
        boxPanel.setLayout(box);
        JButton panicButton = new JButton("Panic");
        JButton dontPanicButton = new JButton("Don't Panic");
        JButton blameButton = new JButton("Blame");
        JButton mediaButton = new JButton("Media");
        JButton saveButton = new JButton("Save");
        //Flow and Grid
        // add(panicButton);
        // add(dontPanicButton);
        // add(blameButton);
        // add(mediaButton);
        // add(saveButton);
        //BorderLayout
        // add(panicButton, BorderLayout.NORTH);
        // add(dontPanicButton, BorderLayout.SOUTH);
        // add(blameButton, BorderLayout.EAST);
        // add(mediaButton, BorderLayout.WEST);
        // add(saveButton, BorderLayout.CENTER);
        gridPanel.add(panicButton);
        gridPanel.add(dontPanicButton);
        boxPanel.add(blameButton);
        boxPanel.add(mediaButton);
        boxPanel.add(saveButton);
        add(gridPanel);
        add(boxPanel);
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
        Crisis2.setLookAndFeel();
        Crisis2 frame = new Crisis2();
    }
}
