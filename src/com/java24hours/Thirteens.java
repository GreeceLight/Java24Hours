package com.java24hours;

public class Thirteens {
    public static void main(String[] args) {
        int[] thirteens = new int[400];
        for(int dex = 1; dex <= 400; dex++){
            int multiple = 13 * dex;
            thirteens[dex-1] = multiple;
            System.out.print(thirteens[dex-1] + " ");
        }
    }
}
