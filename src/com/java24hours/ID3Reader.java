package com.java24hours;

import java.io.*;
public class ID3Reader {
    public static void main(String[] args) {
        String path = args[0];
        File song = new File(path);
        try (FileInputStream file = new FileInputStream(song)){
            int size = (int) song.length();
            file.skip(size - 128);
            byte[] last128 = new byte[128];
            file.read(last128);
            String id3 = new String(last128);
            String tag = id3.substring(0,3);
            if(tag.equals("TAG")){
                System.out.println("Title: " + id3.substring(3, 32));
                System.out.println("Artist: " + id3.substring(33, 62));
                System.out.println("Album" + id3.substring(63, 91));
                System.out.println("Year: " + id3.substring(93, 97));
            } else{
                System.out.println(args[0] + " does not contain ID3 info");
            }
        } catch (IOException ioe) {
            System.out.println("Error " + ioe.toString());
        }
    }
}
