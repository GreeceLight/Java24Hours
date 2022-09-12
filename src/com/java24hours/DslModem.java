package com.java24hours;

public class DslModem extends Modem{
    String method = "DSL Phone Connection";
    public void connect(){
        System.out.println("Connecting to the Internet");
        System.out.println("Using a " + method);
    }
}
