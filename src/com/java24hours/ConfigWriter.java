package com.java24hours;

import java.io.*;

public class ConfigWriter {
    String newLine = System.getProperty("line.separator");

    public ConfigWriter(){
        try {
            File file = new File("program.properties");
            FileOutputStream fileStream = new FileOutputStream(file);
            write(fileStream, "username = max");
            write(fileStream, "score = 12550");
            write(fileStream, "level = 5");
            fileStream.close();

        } catch (IOException e) {
            System.out.println("Could not write to file");
        }
    }

    void write(FileOutputStream stream, String output) throws IOException{
        output = output + newLine;
        byte[] data = output.getBytes();
        stream.write(data, 0, data.length);
    }

    public static void main(String[] args) {
        new ConfigWriter();
    }
}
