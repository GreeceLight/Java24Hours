package com.java24hours;

import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame{
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    public Crisis(){
        super("Crisis");
        setLookAndFeel();
        setSize(348, 128);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //FlowLayout flo = new FlowLayout();
        //GridLayout grid = new GridLayout(2, 3);
        // BorderLayout border = new BorderLayout();
        //setLayout(box);
        JPanel pane = new JPanel();
        BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
        pane.setLayout(box);
        panicButton = new JButton("Panic");
        dontPanicButton = new JButton("Don't Panic");
        blameButton = new JButton("Blame");
        mediaButton = new JButton("Media");
        saveButton = new JButton("Save");
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
        pane.add(panicButton);
        pane.add(dontPanicButton);
        pane.add(blameButton);
        pane.add(mediaButton);
        pane.add(saveButton);
        add(pane);
        setVisible(true);
    }

    private void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        Crisis fram = new Crisis();
    }
}
