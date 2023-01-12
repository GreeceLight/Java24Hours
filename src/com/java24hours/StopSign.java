package com.java24hours;

import javax.swing.*;
import java.awt.*;


public class StopSign extends JFrame{

    public StopSign(){
        super("Stop Sign");
        setLookAndFeel();
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        StopSignPanel stopSign = new StopSignPanel();
        add(stopSign);
    }

    private void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        StopSign ss = new StopSign();
    }
}
