package com.java24hours;

import java.util.*;
import java.io.*;

public class Rewriter {
    public Rewriter(String[] args){
        try {
            File folderFiles = new File(args[0]);
            File[] files = folderFiles.listFiles();
            for (int i = 0; i < files.length; i++) {
                if(files[i].getName().charAt(files[i].getName().length() - 4) == 'j'){
                    File file = files[i];
                    FileInputStream inStream = new FileInputStream(file);
                    int size = (int) file.length();
                    byte[] script = new byte[size];
                    inStream.read(script);
        
                    File reWritten = new File(file.getPath().substring(0, file.getPath().length()-5) + "1" + ".java");
                    FileOutputStream outStream = new FileOutputStream(reWritten);
                    outStream.write(script, 0, size);
                    outStream.close();
                    inStream.close();
                }
            }
        } catch (Exception exc) {
            System.out.println("Error : "+ exc.getMessage());
        }
    }



    void write(FileOutputStream stream, String output) throws IOException{
        byte[] data = output.getBytes();
        stream.write(data, 0, data.length);
    }

    public static void main(String[] args) {
        new Rewriter(args);
    }
}
