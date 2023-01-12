package com.java24hours;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.StringTokenizer;

public class PieFrame2 extends JFrame{
    Color uneasyBeingGreen = new Color(0xCC, 0xCC, 0x99);
    Color zuzusPetals = new Color(0xCC, 0x66, 0xFF);
    Color zootSuit = new Color(0x66, 0x66, 0x99);
    Color sweetHomeAvocado = new Color(0x66, 0x99, 0x66);
    Color shrinkingViolet = new Color(0x66, 0x66, 0x99);
    Color miamiNice = new Color(0x33, 0xFF, 0xFF);
    Color inBetweenGreen = new Color(0x00, 0x99, 0x66);
    Color norwegianBlue = new Color(0x33, 0xCC, 0xCC);
    Color purpleRain = new Color(0x66, 0x33, 0x99);
    Color freckle = new Color(0x99, 0x66, 0x33);

    public PieFrame2(String[] args){
        super("Pie Graph");
        setLookAndFeel();
        setSize(320, 290);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        PiePanel pie = new PiePanel(3);
        int[] RGB = new int[3];
        int sliceSize = 0;
        for (String arg : args) {
            StringTokenizer token = new StringTokenizer(arg, "/");
            sliceSize = Integer.parseInt(token.nextToken());
            RGB[0] = Integer.parseInt(token.nextToken());
            RGB[1] = Integer.parseInt(token.nextToken());
            RGB[2] = Integer.parseInt(token.nextToken());
            Color sliceColor = new Color(RGB[0], RGB[1], RGB[2]);
            pie.addSlice(sliceColor, sliceSize);
        }
        add(pie);
    }

    public static int readLine(){
        try{
            BufferedInputStream bin = new BufferedInputStream(System.in);
            int in = 0;
            in = bin.read();
            bin.close();
            return in;
        }catch(IOException ioe){
            System.out.println("Exception" + ioe.getMessage());
            return 0;
        }
    }

    private static void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Args too short");
            System.exit(-1);
        }
        PieFrame2.setLookAndFeel();
        PieFrame2 pf = new PieFrame2(args);
    }
}
