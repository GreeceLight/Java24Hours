package com.java24hours;

public class Modem {
    int speed;

    public void displaySpeed() {
        System.out.println("Speed: " + speed);
    }

    public void disconnect(String name) {
        System.out.println(name + " has disconnected");
    }
}
