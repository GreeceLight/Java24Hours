package com.java24hours;

public class Students {
    public static void main(String[] args) {
        int[][] studentNames = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {68, 98, 76, 90, 52, 54, 67, 76, 82, 91}};
        int total = 0;
        for(byte dex = 0; dex < studentNames[1].length; dex++){
            total = studentNames[1][dex] + total;
        }
        total = total / studentNames[1].length;
        System.out.println(total);
    }
}
