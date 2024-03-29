package com.java24hours;

import java.io.*;
public class Console {
    public static String readLine(){
        StringBuilder response = new StringBuilder();
        try{
            BufferedInputStream bin = new BufferedInputStream(System.in);
            int in = 0;
            char inChar;
            do{
                in = bin.read();
                inChar = (char) in;
                if(in != -1){
                    response.append(inChar);
                }
            }while((in != -1) && (inChar != '\n'));
            bin.close();
            return response.toString();
        }catch(IOException ioe){
            System.out.println("Exception" + ioe.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("You are standing at the end of the road");
        System.out.println("before a small brick building. Around you ");
        System.out.println("is a forest. A small stream flows out of ");
        System.out.println("the building and down a gully.");
        System.out.print("> ");
        String input = Console.readLine();
        System.out.println("That's not a verb I recognise");
    }
}
