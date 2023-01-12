package com.java24hours;

import java.io.IOException;
import java.nio.file.*;
import javax.swing.*;

public class FreeSpacePanel extends JPanel{
    JLabel spaceLabel = new JLabel("Disk Space: ");
    JLabel space = new JLabel();
    StringBuilder largeNum = new StringBuilder("");

    public FreeSpacePanel(){
        super();
        add(spaceLabel);
        add(space);
        try {
            setValue();
        } catch (IOException exc) {
            space.setText("Error");
        }
    }

    private final void setValue() throws IOException{
        //Get current file storage pool
        Path current = Paths.get("");
        FileStore store = Files.getFileStore(current);
        //find the free storage space
        long totalSpace = store.getTotalSpace();
        long freeSpace = store.getUsableSpace();
        //get this as a percentage
        double percentage = (double)freeSpace / (double)totalSpace * 100;
        percentage = (int)(percentage * 100) / (double)100;
        //set label's text
        StringBuilder freeSpaceBuilder = new StringBuilder("");
        StringBuilder totalSpaceBuilder = new StringBuilder("");
        String freeSpaceStr = String.valueOf(freeSpace);
        String totalSpaceStr = String.valueOf(totalSpace);

        for (int num = 0; num < freeSpaceStr.length(); num++) {
            freeSpaceBuilder.append(freeSpaceStr.charAt(num));
            if((freeSpaceStr.length() - num-1) % 3 == 0 && num+1 != freeSpaceStr.length()){
                freeSpaceBuilder.append(",");
            }
        }
        for (int num = 0; num < totalSpaceStr.length(); num++) {
            totalSpaceBuilder.append(totalSpaceStr.charAt(num));
            if((totalSpaceStr.length() - num-1) % 3 == 0 && num+1 != totalSpaceStr.length()){
                totalSpaceBuilder.append(",");
            }
        }
        space.setText(freeSpaceBuilder + " free out of " + totalSpaceBuilder + " (" + percentage + "%)");

    }
}
