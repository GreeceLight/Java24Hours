package com.java24hours;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyViewer extends JFrame{
    JTextField keyText = new JTextField();
    JLabel keyLabel = new JLabel("Press any key in the text field");

    public KeyViewer() {
        super("KeyViewer");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent input){
                char key = input.getKeyChar();
                keyLabel.setText("You Pressed " + key);
            }
        });

        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyViewer();
    }
}