package com.java24hours;

public class Commodore64Modem extends Modem{
    String method = "Commodore64Modem";
    public void connect(){
        System.out.println("Connecting to the Internet");
        System.out.println("Using a " + method);
    }
}
