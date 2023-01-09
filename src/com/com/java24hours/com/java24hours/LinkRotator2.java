package com.java24hours;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.net.*;

public class LinkRotator2 extends JFrame
    implements Runnable, ActionListener{

    String[] pageTitle = new String[6];
    URI[] pageLink = new URI[6];
    int current = 0;
    Thread runner;
    JLabel siteLabel = new JLabel();

    public LinkRotator2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(siteLabel);
        pageTitle = new String[]{
            "Minecraft Site",
            "Twitch Site",
            "GitHub",
            "Java in 24 Hours",
            "Essential",
            "CurseForge"
        };
        pageLink[0] = getURI("https://www.minecraft.net/en-us");
        pageLink[1] = getURI("https://www.twitch.tv");
        pageLink[2] = getURI("https://github.com");
        pageLink[3] = getURI("http://www.java24hours.com");
        pageLink[4] = getURI("https://essential.gg");
        pageLink[5] = getURI("https://www.curseforge.com/minecraft/mc-mods");

        Button visitButton = new Button("Visit Site");
        visitButton.addActionListener(this);
        add(visitButton);
        setVisible(true);
        start();
    }

    private URI getURI(String urlText){
        URI pageURI = null;
        try {
            pageURI = new URI(urlText);
        } catch (Exception e) {System.out.println("URI is Broken");}
        return pageURI;
    }

    public void start(){
        if(runner == null){
            runner = new Thread(this);
            runner.start();
        }
    }

    public void run(){
        Thread thisThread = Thread.currentThread();
        while (runner == thisThread){
            current++;
            if(current > 5){
                current = 0;
            }
            siteLabel.setText(pageTitle[current]);
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exc) {}
        }
    }

    public void actionPerformed(ActionEvent event){
        Desktop desktop = Desktop.getDesktop();
        if(pageLink[current] != null){
            try {
                desktop.browse(pageLink[current]);
                runner = null;
                System.exit(0);
            } catch (IOException e) {System.out.println("IO is broken");}
        }
    }

    public static void main(String[] args) {
        new LinkRotator2();
    }
}
