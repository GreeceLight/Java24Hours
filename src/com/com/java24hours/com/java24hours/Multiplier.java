package com.java24hours;

public class Multiplier {
    public static void main(String[] args) {
        int result = 0;
        try{
            result = Integer.parseInt(args[0])  * Integer.parseInt(args[1]) * Integer.parseInt(args[2]);
        }
        catch(NumberFormatException e){
            System.out.println("You cannot use a non-numeric value");
        }
        finally{
            System.out.println(result);
        }
    }
}
