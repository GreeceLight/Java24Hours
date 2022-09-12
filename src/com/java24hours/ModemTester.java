package com.java24hours;

import java.time.chrono.HijrahChronology;

public class ModemTester {
    public static void main(String[] args) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        Commodore64Modem highway = new Commodore64Modem();
        surfBoard.speed = 50000;
        gateway.speed = 40000;
        highway.speed = 300;
        System.out.println("Trying the cable modem");
        surfBoard.displaySpeed();
        surfBoard.connect();
        surfBoard.disconnect(surfBoard.method);
        System.out.println("Trying DSL modem");
        gateway.displaySpeed();
        gateway.connect();
        gateway.disconnect(gateway.method);
        System.out.println("Trying Commodore64 Modem");
        highway.displaySpeed();
        highway.connect();
        highway.disconnect(highway.method);
    }
}
