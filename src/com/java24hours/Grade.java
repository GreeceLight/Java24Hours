package com.java24hours;

public class Grade {
    public static void main(String[] args) {
        int grade = 55;
        if(grade < 60) System.out.println("E");
        else if(grade < 70) System.out.println("D");
        else if(grade < 80) System.out.println("C");
        else if(grade < 90) System.out.println("B");
        else if(grade < 100) System.out.println("A");
    }
}
