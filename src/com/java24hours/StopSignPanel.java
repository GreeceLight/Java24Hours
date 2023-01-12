package com.java24hours;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class StopSignPanel extends JPanel{
    private Color background = getBackground();

    public void paintComponent(Graphics comp){
        super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D) comp;
        int width = getSize().width - 15;
        int height = getSize().height - 20;
        int xInset = 5;
        int yInset = 5;
        if(width < 5){
            xInset = width;
        }
        if(height < 5){
            yInset = height;
        }
        comp2D.setColor(Color.lightGray);

        makeSign(width, height, comp2D);
        makeText(width, height, comp2D);


    }
    
    void makeSign(int width, int height, Graphics2D comp2D){
        //Make red circle
        Ellipse2D.Float cir = new Ellipse2D.Float(
            0, 10, width, height
        );
        comp2D.setColor(Color.red);
        comp2D.fill(cir);

        //Make outline
        comp2D.setColor(Color.WHITE);
        comp2D.setStroke(new BasicStroke(20));
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        comp2D.draw(cir);
    }

    void makeText(int width, int height, Graphics2D comp2D){
        Font font = new Font("Dialog", Font.BOLD, 150);
        comp2D.setFont(font);
        comp2D.setColor(Color.WHITE);
        comp2D.drawString("Stop", width / 2 - 150, height / 2 + 50);
    }
}
