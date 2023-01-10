package com.java24hours;

import java.awt.*;
import javax.swing.*;

public class SalutonFrame extends JFrame{
    public SalutonFrame(){
        super("Saluton Mondo!");
        setLookAndFeel();
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JLabel saluton = new JLabel("Saluton Mondo!");
        add(saluton);
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
        SalutonFrame frame = new SalutonFrame();
    }
}
