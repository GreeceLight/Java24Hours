package com.java24hours;
import java.util.Arrays;

public class NameSorter {
    public static void main(String[] args) {
        String names[] = {"Glimmer", "Marvel", "Rue", "Clove", "Thresh", "FoxFace", "Cato", "Peeta", "Katniss"};
        
        System.out.println("The original order: ");
        for(int i = 0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }

        System.out.println();
        System.out.println("The new order: ");
        
        Arrays.sort(names);
        for(int i = 0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
    }
}
