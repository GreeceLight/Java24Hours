package com.java24hours;

import java.util.Random;

public class dice {
    public static void main(String[] args) {
        Random generator = new Random();

        int value = generator.nextInt();
        System.out.println(value);
    }
}
